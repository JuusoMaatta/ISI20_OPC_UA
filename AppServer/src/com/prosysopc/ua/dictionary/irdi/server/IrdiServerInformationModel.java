package com.prosysopc.ua.dictionary.irdi.server;

import com.prosysopc.ua.dictionary.irdi.IrdiDataTypeDictionaryHelper;
import com.prosysopc.ua.dictionary.irdi.IrdiSerializers;
import com.prosysopc.ua.server.ServerCodegenModel;
import com.prosysopc.ua.server.ServerCodegenModelProvider;
import java.lang.Override;
import java.lang.RuntimeException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

/**
 * Generated on 2020-10-19 15:11:10
 */
public class IrdiServerInformationModel implements ServerCodegenModelProvider {
  public static final ServerCodegenModel MODEL;

  static {
    ServerCodegenModel.Builder b = ServerCodegenModel.builder();
    b.addSerializers(IrdiSerializers.SERIALIZERS);
    b.setDataTypeDictionary(IrdiDataTypeDictionaryHelper.createDataTypeDictionary());
    MODEL = b.build();
  }

  @Override
  public ServerCodegenModel get() {
    return MODEL;
  }

  /**
   * Returns URI for the NodeSet XML file 'Opc.Ua.IRDI.NodeSet2.xml', assuming it is put into classpath next to classfile of this class. You can use the 'server_model' codegen target to do it automatically as part of the code generation. If the file is not found this method will throw RuntimeException.
   */
  public static URI getLocationURI() {
    URL nodeset = IrdiServerInformationModel.class.getResource("Opc.Ua.IRDI.NodeSet2.xml");
    if (nodeset == null) {
      throw new RuntimeException("Cannot find nodeset 'Opc.Ua.IRDI.NodeSet2.xml' in classpath next to "+IrdiServerInformationModel.class);
    }
    try {
      return nodeset.toURI();
    } catch (URISyntaxException e) {
      throw new RuntimeException(e);
    }
  }
}
