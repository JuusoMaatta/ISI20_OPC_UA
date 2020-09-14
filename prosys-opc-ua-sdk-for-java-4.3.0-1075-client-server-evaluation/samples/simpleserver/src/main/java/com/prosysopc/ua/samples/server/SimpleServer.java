/**
 * Prosys OPC UA Java SDK
 * Copyright (c) Prosys OPC Ltd.
 * <http://www.prosysopc.com>
 * All rights reserved.
 */
package com.prosysopc.ua.samples.server;

import java.io.File;
import java.io.IOException;
import java.net.UnknownHostException;
import java.util.EnumSet;
import java.util.Locale;
import java.util.Scanner;

import com.prosysopc.ua.ApplicationIdentity;
import com.prosysopc.ua.SecureIdentityException;
import com.prosysopc.ua.UaApplication.Protocol;
import com.prosysopc.ua.UserTokenPolicies;
import com.prosysopc.ua.server.UaServer;
import com.prosysopc.ua.stack.builtintypes.LocalizedText;
import com.prosysopc.ua.stack.cert.DefaultCertificateValidator;
import com.prosysopc.ua.stack.cert.PkiDirectoryCertificateStore;
import com.prosysopc.ua.stack.core.ApplicationDescription;
import com.prosysopc.ua.stack.core.ApplicationType;
import com.prosysopc.ua.stack.core.MessageSecurityMode;
import com.prosysopc.ua.stack.transport.security.SecurityMode;
import com.prosysopc.ua.stack.transport.security.SecurityPolicy;
import com.prosysopc.ua.stack.utils.EndpointUtil;

/**
 * A very minimal server application.
 */
public class SimpleServer {

  /**
   * Entry point to the application.
   */
  public static void main(String[] args) throws Exception {
    UaServer server = new UaServer();

    /*
     * Enable or disable IPv6 networking (enabled by default). Java 6 does not support IPv6 and
     * would throw an exception, therefore the below code checks for java version first.
     */
    if (System.getProperty("java.version").startsWith("1.6")) {
      server.setEnableIPv6(false);
    }

    // Set port to listen for incoming connections
    // This sample only supports opc.tcp
    server.setPort(Protocol.OpcTcp, 52530);

    // Optional server name part of the URI
    server.setServerName("OPCUA/SimpleServer");

    // Bind to all network interfaces
    server.setBindAddresses(EndpointUtil.getInetAddresses(server.isEnableIPv6()));

    // Please see the SampleConsoleServer for more details on how to setup supported security modes
    // IMPORTANT! You should build some way to configure these for your application
    // This sample supports MessageSecurityModes None, Sign, SignAndEncrypt
    // This sample supports SecurityPolicies that are not deprecated as of OPC UA 1.04
    server.getSecurityModes().add(SecurityMode.NONE);
    server.getSecurityModes().addAll(SecurityMode.combinations(
        EnumSet.of(MessageSecurityMode.Sign, MessageSecurityMode.SignAndEncrypt), SecurityPolicy.ALL_SECURE_104));

    // This sample does not define user authentication methods
    server.addUserTokenPolicy(UserTokenPolicies.ANONYMOUS);

    // We need a certificate store and validator to handle secure connections
    // See SampleConsoleServer for more details
    server.setCertificateValidator(new DefaultCertificateValidator(new PkiDirectoryCertificateStore()));

    initializeApplicationIdentity(server);

    // Starts the server
    server.start();

    // Prints connection address that clients can use.
    System.out.println("Server started, connection address:");
    System.out.println(server.getEndpoints()[0].getEndpointUrl());

    // Wait for shutdown
    System.out.println("Enter 'x' to shutdown");
    Scanner sc = new Scanner(System.in);
    sc.nextLine(); // blocks until input given
    System.out.println("Shutting down..");
    server.shutdown(2, new LocalizedText("Shutdown by user"));
    System.out.println("Server stopped.");
  }

  /**
   * Define a minimal ApplicationIdentity.
   */
  private static void initializeApplicationIdentity(UaServer server)
      throws SecureIdentityException, IOException, UnknownHostException {
    // Application Description is sent to clients
    ApplicationDescription appDescription = new ApplicationDescription();
    appDescription.setApplicationName(new LocalizedText("SimpleServer", Locale.ENGLISH));

    // The 'localhost' (all lower case) part in the URI is converted to the actual
    // host name of the computer in which the application is run
    appDescription.setApplicationUri("urn:localhost:UA:SimpleServer");
    appDescription.setProductUri("urn:prosysopc.com:UA:SimpleServer");
    appDescription.setApplicationType(ApplicationType.Server);

    // Please see SampleConsoleServer for more details on Certificate generation.
    File privateKeyPath = new File("PKI/CA/private");
    String organization = "Sample Organization";
    String privateKeyPassword = "opcua";
    ApplicationIdentity identity = ApplicationIdentity.loadOrCreateCertificate(appDescription, organization,
        privateKeyPassword, privateKeyPath, true);
    server.setApplicationIdentity(identity);
  }

}
