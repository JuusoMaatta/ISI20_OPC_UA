package com.prosysopc.ua.dictionary.irdi.client;

import com.prosysopc.ua.client.ClientCodegenModel;
import com.prosysopc.ua.client.ClientCodegenModelProvider;
import com.prosysopc.ua.dictionary.irdi.IrdiDataTypeDictionaryHelper;
import com.prosysopc.ua.dictionary.irdi.IrdiSerializers;
import java.lang.Override;

/**
 * Generated on 2020-10-19 15:11:10
 */
public class IrdiClientInformationModel implements ClientCodegenModelProvider {
  public static final ClientCodegenModel MODEL;

  static {
    ClientCodegenModel.Builder b = ClientCodegenModel.builder();
    b.addSerializers(IrdiSerializers.SERIALIZERS);
    b.setDataTypeDictionary(IrdiDataTypeDictionaryHelper.createDataTypeDictionary());
    MODEL = b.build();
  }

  @Override
  public ClientCodegenModel get() {
    return MODEL;
  }
}
