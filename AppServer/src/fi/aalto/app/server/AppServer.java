package fi.aalto.app.server;

import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.io.File;
import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.prosysopc.ua.dictionary.irdi.server.IrdiServerInformationModel;
import com.prosysopc.ua.padim.PADIMType;
import com.prosysopc.ua.padim.server.PadimServerInformationModel;
import com.prosysopc.ua.part19.server.Part19ServerInformationModel;
import com.prosysopc.ua.stack.builtintypes.LocalizedText;
import com.prosysopc.ua.stack.cert.PkiDirectoryCertificateStore;
import com.prosysopc.ua.stack.cert.DefaultCertificateValidator;
import com.prosysopc.ua.stack.core.ApplicationDescription;
import com.prosysopc.ua.stack.core.MessageSecurityMode;
import com.prosysopc.ua.stack.transport.security.AllowAllCertificatesValidator;
import com.prosysopc.ua.stack.transport.security.KeyPair;
import com.prosysopc.ua.stack.transport.security.SecurityMode;
import com.prosysopc.ua.stack.transport.security.SecurityPolicy;
import com.prosysopc.ua.stack.utils.EndpointUtil;

import com.prosysopc.ua.ApplicationIdentity;
import com.prosysopc.ua.UserTokenPolicies;
import com.prosysopc.ua.UaApplication.Protocol;
import com.prosysopc.ua.server.UaServer;
import com.prosysopc.ua.server.UserValidator;

import com.prosysopc.ua.types.di.server.DiServerInformationModel;
import com.prosysopc.ua.types.plc.server.PlcServerInformationModel;
import fi.aalto.app.server.AppNodeManager;
import fi.aalto.app.server.DemoUserValidator;
import fi.aalto.app.client.AppClient;

public class AppServer {

	protected static String APP_NAME = "AppServer";
	protected static int TCP_PORT = 52520;
	protected static boolean enableSessionDiagnostics = false;
	protected AppNodeManager appNodeManager;
	protected UaServer server;
	private AppClient appClient; 

	public static void main(String[] args) {

		AppServer appServer = new AppServer();
		appServer.initialize(TCP_PORT, APP_NAME);
		appServer.createAddressSpace();
		appServer.run(enableSessionDiagnostics);
	}
	
	public AppServer() {
        this.appClient = new AppClient();
	}
	
	public AppClient getAppClient() {
        return this.appClient;
	}

	protected void initialize(int port, String applicationName) {

		try {
		    server = new UaServer();
		    
		    ApplicationDescription appDescription = new ApplicationDescription();
		    appDescription.setApplicationName(new LocalizedText(applicationName, Locale.ENGLISH));
		    appDescription.setApplicationUri("urn:localhost:" + applicationName);
			appDescription.setProductUri("urn:prosysopc.com:" + applicationName);
		    server.setPort(Protocol.OpcTcp, port);
		    server.setServerName(applicationName);
		    server.setBindAddresses(EndpointUtil.getInetAddresses());

		    final PkiDirectoryCertificateStore certificateStore = new PkiDirectoryCertificateStore();
		    final AllowAllCertificatesValidator validator = new AllowAllCertificatesValidator();
		    //final DefaultCertificateValidator validator = new DefaultCertificateValidator(certificateStore);
			server.setCertificateValidator(validator);
		    File privatePath = new File(certificateStore.getBaseDir(), "private");
			KeyPair issuerCertificate = ApplicationIdentity.loadOrCreateIssuerCertificate(
					"ApplicationCA", privatePath, "application", 3650, false);
			int[] keySizes = null;
			final ApplicationIdentity identity = ApplicationIdentity
					.loadOrCreateCertificate(appDescription, "App Organisation",
					"application", privatePath, null, keySizes, true);
			//String hostName = ApplicationIdentity.getActualHostName();
		    server.setApplicationIdentity(identity);

		    Set<SecurityPolicy> supportedSecurityPolicies = new HashSet<SecurityPolicy>();
		    supportedSecurityPolicies.add(SecurityPolicy.NONE);
		    supportedSecurityPolicies.addAll(SecurityPolicy.ALL_SECURE_104);
		    Set<MessageSecurityMode> supportedMessageSecurityModes = new HashSet<MessageSecurityMode>();
		    supportedMessageSecurityModes.add(MessageSecurityMode.None);
		    supportedMessageSecurityModes.add(MessageSecurityMode.SignAndEncrypt);
		    server.getSecurityModes()
	        .addAll(SecurityMode.combinations(supportedMessageSecurityModes, supportedSecurityPolicies));

		    server.addUserTokenPolicy(UserTokenPolicies.ANONYMOUS);
		    server.addUserTokenPolicy(UserTokenPolicies.SECURE_USERNAME_PASSWORD);
		    UserValidator userValidator = new DemoUserValidator();
		    server.setUserValidator(userValidator);
			server.init();
			server.getSessionManager().setMaxSessionCount(500);
			server.getSessionManager().setMaxSessionTimeout(3600000);
			server.getSubscriptionManager().setMaxSubscriptionCount(500);

		} catch (Exception e) {
			System.out.println(e.getMessage());
			return;
		}

	}

	protected void createAddressSpace() {
		try {
			server.registerModel(DiServerInformationModel.MODEL);
			server.registerModel(IrdiServerInformationModel.MODEL);
			server.registerModel(Part19ServerInformationModel.MODEL);
			server.registerModel(PadimServerInformationModel.MODEL);
			server.registerModel(PlcServerInformationModel.MODEL);

			server.getAddressSpace().loadModel(new File("Opc.Ua.Di.NodeSet2.xml").toURI());
			server.getAddressSpace().loadModel(new File("Opc.Ua.IRDI.NodeSet2.xml").toURI());
			server.getAddressSpace().loadModel(new File("Opc.Ua.Part19.NodeSet2.xml").toURI());
			server.getAddressSpace().loadModel(new File("Opc.Ua.PADIM.NodeSet2.xml").toURI());
			server.getAddressSpace().loadModel(new File("Opc.Ua.Plc.NodeSet2.xml").toURI());

			this.appClient.connect();
			appNodeManager = new AppNodeManager(server, AppNodeManager.NAMESPACE);
			appNodeManager.createAddressSpace();
			appNodeManager.getIoManager().addListeners(new AppIoManagerListener(appClient.getClient()));
			appNodeManager.addListener(new AppNodeManagerListener(appClient.getClient(), this.server));
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return;
		}
	}

	protected void run(boolean enableSessionDiagnostics) {
		try {
			server.start();
			if (enableSessionDiagnostics)
				server.getNodeManagerRoot().getServerData().getServerDiagnosticsNode().setEnabled(true);

			waitForEnter();

			System.out.println("Closing down...");
			this.appClient.disconnect();
			server.shutdown(5, new LocalizedText("Closed by user", Locale.ENGLISH));

		} catch (Exception e) {
			System.out.println(e.getMessage());
			return;
		}
	}

	protected void waitForEnter() {
		try {
		    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("AppServer: Press enter to exit");
            String s = br.readLine();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return;
		}
   }

}
