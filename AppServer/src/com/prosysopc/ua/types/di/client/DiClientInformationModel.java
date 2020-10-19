package com.prosysopc.ua.types.di.client;

import com.prosysopc.ua.client.ClientCodegenModel;
import com.prosysopc.ua.client.ClientCodegenModelProvider;
import com.prosysopc.ua.types.di.DeviceHealthEnumeration;
import com.prosysopc.ua.types.di.DiDataTypeDictionaryHelper;
import com.prosysopc.ua.types.di.DiSerializers;
import com.prosysopc.ua.types.di.FetchResultDataType;
import com.prosysopc.ua.types.di.ParameterResultDataType;
import com.prosysopc.ua.types.di.TransferResultDataDataType;
import com.prosysopc.ua.types.di.TransferResultErrorDataType;
import java.lang.Override;

/**
 * Generated on 2020-10-19 15:11:09
 */
public class DiClientInformationModel implements ClientCodegenModelProvider {
  public static final ClientCodegenModel MODEL;

  static {
    ClientCodegenModel.Builder b = ClientCodegenModel.builder();
    b.addClass(TopologyElementTypeImpl.class);
    b.addClass(IVendorNameplateTypeImpl.class);
    b.addClass(ITagNameplateTypeImpl.class);
    b.addClass(IDeviceHealthTypeImpl.class);
    b.addClass(ISupportInfoTypeImpl.class);
    b.addClass(ComponentTypeImpl.class);
    b.addClass(DeviceTypeImpl.class);
    b.addClass(SoftwareTypeImpl.class);
    b.addClass(BlockTypeImpl.class);
    b.addClass(DeviceHealthDiagnosticAlarmTypeImpl.class);
    b.addClass(FailureAlarmTypeImpl.class);
    b.addClass(CheckFunctionAlarmTypeImpl.class);
    b.addClass(OffSpecAlarmTypeImpl.class);
    b.addClass(MaintenanceRequiredAlarmTypeImpl.class);
    b.addClass(ConfigurableObjectTypeImpl.class);
    b.addClass(FunctionalGroupTypeImpl.class);
    b.addClass(ProtocolTypeImpl.class);
    b.addClass(UIElementTypeImpl.class);
    b.addClass(NetworkTypeImpl.class);
    b.addClass(ConnectionPointTypeImpl.class);
    b.addClass(TransferServicesTypeImpl.class);
    b.addClass(LockingServicesTypeImpl.class);
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
  public ClientCodegenModel get() {
    return MODEL;
  }
}
