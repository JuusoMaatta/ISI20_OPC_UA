package com.prosysopc.ua.part19.server;

import com.prosysopc.ua.part19.Part19DataTypeDictionaryHelper;
import com.prosysopc.ua.part19.Part19Serializers;
import com.prosysopc.ua.server.ServerCodegenModel;
import com.prosysopc.ua.server.ServerCodegenModelProvider;
import java.lang.Override;
import java.lang.RuntimeException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

/**
 * Generated on 2020-10-19 15:11:11
 */
public class Part19ServerInformationModel implements ServerCodegenModelProvider {
  public static final ServerCodegenModel MODEL;

  static {
    ServerCodegenModel.Builder b = ServerCodegenModel.builder();
    b.addClass(MultiStateDictionaryEntryDiscreteBaseTypeNode.class);
    b.addClass(MultiStateDictionaryEntryDiscreteTypeNode.class);
    b.addSerializers(Part19Serializers.SERIALIZERS);
    b.setDataTypeDictionary(Part19DataTypeDictionaryHelper.createDataTypeDictionary());
    MODEL = b.build();
  }

  @Override
  public ServerCodegenModel get() {
    return MODEL;
  }

  /**
   * Returns URI for the NodeSet XML file 'Opc.Ua.Part19.NodeSet2.xml', assuming it is put into classpath next to classfile of this class. You can use the 'server_model' codegen target to do it automatically as part of the code generation. If the file is not found this method will throw RuntimeException.
   */
  public static URI getLocationURI() {
    URL nodeset = Part19ServerInformationModel.class.getResource("Opc.Ua.Part19.NodeSet2.xml");
    if (nodeset == null) {
      throw new RuntimeException("Cannot find nodeset 'Opc.Ua.Part19.NodeSet2.xml' in classpath next to "+Part19ServerInformationModel.class);
    }
    try {
      return nodeset.toURI();
    } catch (URISyntaxException e) {
      throw new RuntimeException(e);
    }
  }
}
