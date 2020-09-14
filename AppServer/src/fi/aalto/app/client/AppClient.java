package fi.aalto.app.client;

import com.prosysopc.ua.stack.builtintypes.LocalizedText;
import com.prosysopc.ua.stack.cert.PkiDirectoryCertificateStore;
import com.prosysopc.ua.stack.core.ApplicationDescription;
import com.prosysopc.ua.stack.transport.security.AllowAllCertificatesValidator;
import com.prosysopc.ua.stack.transport.security.KeyPair;
import com.prosysopc.ua.stack.transport.security.SecurityMode;

import com.prosysopc.ua.client.UaClient;

import java.io.File;
import java.util.Locale;

import com.prosysopc.ua.ApplicationIdentity;
import com.prosysopc.ua.UaAddress;
import com.prosysopc.ua.UaApplication;
import com.prosysopc.ua.UserIdentity;
import com.prosysopc.ua.client.Subscription;

public class AppClient {

	private String serverUri= "opc.tcp://localhost:52500/DemoServer";			
	private UaClient client;
	protected static String APP_NAME = "SimpleClient";
	protected UaAddress serverAddress;
	
	public AppClient() {
        this.client = new UaClient();
        
		try {
	        ApplicationDescription appDescription = new ApplicationDescription();
	        appDescription.setApplicationName(new LocalizedText(APP_NAME, Locale.ENGLISH));
	        appDescription.setApplicationUri("urn:localhost:OPCUA" + APP_NAME);
	        appDescription.setProductUri("urn:prosysopc.com:OPCUA" + APP_NAME);

	        final PkiDirectoryCertificateStore certificateStore = new PkiDirectoryCertificateStore();
	        final AllowAllCertificatesValidator validator = new AllowAllCertificatesValidator();
	        client.setCertificateValidator(validator);
	        File privatePath = new File(certificateStore.getBaseDir(), "private");
	        KeyPair issuerCertificate = ApplicationIdentity.loadOrCreateIssuerCertificate(
				"ClientCA", privatePath, "client", 3650, false);
	        int[] keySizes = new int[] { 0, 4096 };
	        final ApplicationIdentity identity = ApplicationIdentity
				.loadOrCreateCertificate(appDescription, "Client Organisation",
				"client", privatePath, issuerCertificate, keySizes, true);
	        client.setApplicationIdentity(identity);
		} catch  (Exception e) {
			System.out.println(e.getMessage());
			return;
		}
	}

	public UaClient getClient() {
		return this.client;
	}
	
	public void connect() {
		
		try {
		    this.serverAddress = UaAddress.fromComponents(UaApplication.Protocol.OpcTcp, "localhost", 52500, "DemoServer");
			this.client.setAddress(serverAddress); 
	        this.client.setSecurityMode(SecurityMode.BASIC256SHA256_SIGN_ENCRYPT); //NONE);
		    //this.client.setSecurityMode(SecurityMode.NONE);
	        this.client.setUserIdentity(new UserIdentity("opcua", "opcua"));
		    this.client.connect();
	        this.client.addSubscription(new Subscription());
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return;
		}
		return;
	}
	
	public void disconnect() {
		
		try {
			// TODO remove subscription?
		    this.client.disconnect();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return;
		}
		return;
	}
}
