package com.prosysopc.ua.types.plc.server;

import com.prosysopc.ua.server.ServerCodegenModel;
import com.prosysopc.ua.server.ServerCodegenModelProvider;
import com.prosysopc.ua.types.plc.PlcDataTypeDictionaryHelper;
import com.prosysopc.ua.types.plc.PlcSerializers;
import java.lang.Override;
import java.lang.RuntimeException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

/**
 * Generated on 2020-10-19 15:11:11
 */
public class PlcServerInformationModel implements ServerCodegenModelProvider {
  public static final ServerCodegenModel MODEL;

  static {
    ServerCodegenModel.Builder b = ServerCodegenModel.builder();
    b.addClass(CtrlConfigurationTypeNode.class);
    b.addClass(CtrlResourceTypeNode.class);
    b.addClass(CtrlProgramOrganizationUnitTypeNode.class);
    b.addClass(CtrlProgramTypeNode.class);
    b.addClass(CtrlFunctionBlockTypeNode.class);
    b.addClass(CtrlTaskTypeNode.class);
    b.addClass(SFCTypeNode.class);
    b.addSerializers(PlcSerializers.SERIALIZERS);
    b.setDataTypeDictionary(PlcDataTypeDictionaryHelper.createDataTypeDictionary());
    MODEL = b.build();
  }

  @Override
  public ServerCodegenModel get() {
    return MODEL;
  }

  /**
   * Returns URI for the NodeSet XML file 'Opc.Ua.Plc.NodeSet2.xml', assuming it is put into classpath next to classfile of this class. You can use the 'server_model' codegen target to do it automatically as part of the code generation. If the file is not found this method will throw RuntimeException.
   */
  public static URI getLocationURI() {
    URL nodeset = PlcServerInformationModel.class.getResource("Opc.Ua.Plc.NodeSet2.xml");
    if (nodeset == null) {
      throw new RuntimeException("Cannot find nodeset 'Opc.Ua.Plc.NodeSet2.xml' in classpath next to "+PlcServerInformationModel.class);
    }
    try {
      return nodeset.toURI();
    } catch (URISyntaxException e) {
      throw new RuntimeException(e);
    }
  }
}
