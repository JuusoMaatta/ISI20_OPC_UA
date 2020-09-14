package fi.aalto.demo.server;

import java.util.Locale;
import java.util.HashSet;
import java.util.Set;
import java.io.File;
import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.prosysopc.ua.stack.builtintypes.LocalizedText;
import com.prosysopc.ua.stack.core.ApplicationDescription;
import com.prosysopc.ua.stack.transport.security.AllowAllCertificatesValidator;
import com.prosysopc.ua.stack.transport.security.KeyPair;
import com.prosysopc.ua.stack.transport.security.SecurityMode;
import com.prosysopc.ua.stack.utils.EndpointUtil;
import com.prosysopc.ua.stack.cert.PkiDirectoryCertificateStore;
import com.prosysopc.ua.stack.cert.DefaultCertificateValidator;
import com.prosysopc.ua.stack.transport.security.SecurityPolicy;
import com.prosysopc.ua.stack.core.MessageSecurityMode;
import com.prosysopc.ua.UserTokenPolicies;
import com.prosysopc.ua.ApplicationIdentity;
import com.prosysopc.ua.UaApplication.Protocol;
import com.prosysopc.ua.server.UaServer;
import com.prosysopc.ua.server.UserValidator;

import fi.aalto.demo.server.DemoNodeManager;

public class DemoServer {

	protected static String APP_NAME = "DemoServer";
	protected static int TCP_PORT = 52500;
	protected static boolean enableSessionDiagnostics = false;
	protected DemoNodeManager demoNodeManager;
	protected UaServer server;

	public static void main(String[] args) {

		DemoServer demoServer = new DemoServer();
		demoServer.initialize(TCP_PORT, APP_NAME);
		demoServer.createAddressSpace();
		demoServer.run(enableSessionDiagnostics);
	}
	
	protected void initialize(int port, String applicationName) {

		try {
		    server = new UaServer();
		    
		    ApplicationDescription appDescription = new ApplicationDescription();
		    appDescription.setApplicationName(new LocalizedText(applicationName, Locale.ENGLISH));
		    appDescription.setApplicationUri("urn:localhost:OPCUA" + applicationName);
			appDescription.setProductUri("urn:prosysopc.com:OPCUA" + applicationName);
		    server.setPort(Protocol.OpcTcp, port);
		    server.setServerName(applicationName);
		    server.setBindAddresses(EndpointUtil.getInetAddresses());

		    final PkiDirectoryCertificateStore certificateStore = new PkiDirectoryCertificateStore();
		    //final DefaultCertificateValidator validator = new DefaultCertificateValidator(certificateStore);
		    final AllowAllCertificatesValidator validator = new AllowAllCertificatesValidator();
			server.setCertificateValidator(validator);
		    File privatePath = new File(certificateStore.getBaseDir(), "private");
			KeyPair issuerCertificate = ApplicationIdentity.loadOrCreateIssuerCertificate(
					"DemoCA", privatePath, "demo", 3650, false);
			int[] keySizes = null;
		    final ApplicationIdentity identity = ApplicationIdentity
					.loadOrCreateCertificate(appDescription, "Demo Organisation",
					"demo", privatePath, null, keySizes, true);
			String hostName = ApplicationIdentity.getActualHostName();
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
		    //server.addUserTokenPolicy(UserTokenPolicies.SECURE_CERTIFICATE);
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
			demoNodeManager = new DemoNodeManager(server, DemoNodeManager.NAMESPACE);
			demoNodeManager.getIoManager().addListeners(new DemoIoManagerListener());
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

			Thread t = new Thread(new DemoSimulation(server));
			t.start();
			
			waitForEnter();
			t.stop();

			System.out.println("Closing down...");
			server.shutdown(5, new LocalizedText("Closed by user", Locale.ENGLISH));

		} catch (Exception e) {
			System.out.println(e.getMessage());
			return;
		}
	}

	protected void waitForEnter() {
		try {
		    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("DemoServer running. Press enter to exit");
            br.readLine();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return;
		}
   }
}

