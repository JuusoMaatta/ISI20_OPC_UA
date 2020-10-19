package com.prosysopc.ua.part19.client;

import com.prosysopc.ua.client.ClientCodegenModel;
import com.prosysopc.ua.client.ClientCodegenModelProvider;
import com.prosysopc.ua.part19.Part19DataTypeDictionaryHelper;
import com.prosysopc.ua.part19.Part19Serializers;
import java.lang.Override;

/**
 * Generated on 2020-10-19 15:11:11
 */
public class Part19ClientInformationModel implements ClientCodegenModelProvider {
  public static final ClientCodegenModel MODEL;

  static {
    ClientCodegenModel.Builder b = ClientCodegenModel.builder();
    b.addClass(MultiStateDictionaryEntryDiscreteBaseTypeImpl.class);
    b.addClass(MultiStateDictionaryEntryDiscreteTypeImpl.class);
    b.addSerializers(Part19Serializers.SERIALIZERS);
    b.setDataTypeDictionary(Part19DataTypeDictionaryHelper.createDataTypeDictionary());
    MODEL = b.build();
  }

  @Override
  public ClientCodegenModel get() {
    return MODEL;
  }
}
