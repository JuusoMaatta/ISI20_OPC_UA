package com.prosysopc.ua.types.di.server;

import com.prosysopc.ua.server.ServerCodegenModel;
import com.prosysopc.ua.server.ServerCodegenModelProvider;
import com.prosysopc.ua.types.di.DeviceHealthEnumeration;
import com.prosysopc.ua.types.di.DiDataTypeDictionaryHelper;
import com.prosysopc.ua.types.di.DiSerializers;
import com.prosysopc.ua.types.di.FetchResultDataType;
import com.prosysopc.ua.types.di.ParameterResultDataType;
import com.prosysopc.ua.types.di.TransferResultDataDataType;
import com.prosysopc.ua.types.di.TransferResultErrorDataType;
import java.lang.Override;
import java.lang.RuntimeException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

/**
 * Generated on 2020-10-19 15:11:09
 */
public class DiServerInformationModel implements ServerCodegenModelProvider {
  public static final ServerCodegenModel MODEL;

  static {
    ServerCodegenModel.Builder b = ServerCodegenModel.builder();
    b.addClass(TopologyElementTypeNode.class);
    b.addClass(IVendorNameplateTypeNode.class);
    b.addClass(ITagNameplateTypeNode.class);
    b.addClass(IDeviceHealthTypeNode.class);
    b.addClass(ISupportInfoTypeNode.class);
    b.addClass(ComponentTypeNode.class);
    b.addClass(DeviceTypeNode.class);
    b.addClass(SoftwareTypeNode.class);
    b.addClass(BlockTypeNode.class);
    b.addClass(DeviceHealthDiagnosticAlarmTypeNode.class);
    b.addClass(FailureAlarmTypeNode.class);
    b.addClass(CheckFunctionAlarmTypeNode.class);
    b.addClass(OffSpecAlarmTypeNode.class);
    b.addClass(MaintenanceRequiredAlarmTypeNode.class);
    b.addClass(ConfigurableObjectTypeNode.class);
    b.addClass(FunctionalGroupTypeNode.class);
    b.addClass(ProtocolTypeNode.class);
    b.addClass(UIElementTypeNode.class);
    b.addClass(NetworkTypeNode.class);
    b.addClass(ConnectionPointTypeNode.class);
    b.addClass(TransferServicesTypeNode.class);
    b.addClass(LockingServicesTypeNode.class);
    b.addSerializers(DiSerializers.SERIALIZERS);
    b.setDataTypeDictionary(DiDataTypeDictionaryHelper.createDataTypeDictionary());
    b.addStructureSpecification(FetchResultDataType.SPECIFICATION);
    b.addStructureSpecification(TransferResultErrorDataType.SPECIFICATION);
    b.addStructureSpecification(TransferResultDataDataType.SPECIFICATION);
    b.addStructureSpecification(ParameterResultDataType.SPECIFICATION);
    b.addEnumerationSpecification(DeviceHealthEnumeration.SPECIFICATION);
    MODEL = b.build();
  }

  @Override
  public ServerCodegenModel get() {
    return MODEL;
  }

  /**
   * Returns URI for the NodeSet XML file 'Opc.Ua.Di.NodeSet2.xml', assuming it is put into classpath next to classfile of this class. You can use the 'server_model' codegen target to do it automatically as part of the code generation. If the file is not found this method will throw RuntimeException.
   */
  public static URI getLocationURI() {
    URL nodeset = DiServerInformationModel.class.getResource("Opc.Ua.Di.NodeSet2.xml");
    if (nodeset == null) {
      throw new RuntimeException("Cannot find nodeset 'Opc.Ua.Di.NodeSet2.xml' in classpath next to "+DiServerInformationModel.class);
    }
    try {
      return nodeset.toURI();
    } catch (URISyntaxException e) {
      throw new RuntimeException(e);
    }
  }
}
