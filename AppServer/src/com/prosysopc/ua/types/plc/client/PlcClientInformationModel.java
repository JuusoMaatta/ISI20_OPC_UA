package com.prosysopc.ua.types.plc.client;

import com.prosysopc.ua.client.ClientCodegenModel;
import com.prosysopc.ua.client.ClientCodegenModelProvider;
import com.prosysopc.ua.types.plc.PlcDataTypeDictionaryHelper;
import com.prosysopc.ua.types.plc.PlcSerializers;
import java.lang.Override;

/**
 * Generated on 2020-10-19 15:11:11
 */
public class PlcClientInformationModel implements ClientCodegenModelProvider {
  public static final ClientCodegenModel MODEL;

  static {
    ClientCodegenModel.Builder b = ClientCodegenModel.builder();
    b.addClass(CtrlConfigurationTypeImpl.class);
    b.addClass(CtrlResourceTypeImpl.class);
    b.addClass(CtrlProgramOrganizationUnitTypeImpl.class);
    b.addClass(CtrlProgramTypeImpl.class);
    b.addClass(CtrlFunctionBlockTypeImpl.class);
    b.addClass(CtrlTaskTypeImpl.class);
    b.addClass(SFCTypeImpl.class);
    b.addSerializers(PlcSerializers.SERIALIZERS);
    b.setDataTypeDictionary(PlcDataTypeDictionaryHelper.createDataTypeDictionary());
    MODEL = b.build();
  }

  @Override
  public ClientCodegenModel get() {
    return MODEL;
  }
}
