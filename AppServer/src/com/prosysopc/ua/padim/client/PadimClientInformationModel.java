package com.prosysopc.ua.padim.client;

import com.prosysopc.ua.client.ClientCodegenModel;
import com.prosysopc.ua.client.ClientCodegenModelProvider;
import com.prosysopc.ua.padim.ExecutionModeEnum;
import com.prosysopc.ua.padim.PadimDataTypeDictionaryHelper;
import com.prosysopc.ua.padim.PadimSerializers;
import com.prosysopc.ua.padim.ResetModeEnum;
import java.lang.Override;

/**
 * Generated on 2020-10-19 15:11:10
 */
public class PadimClientInformationModel implements ClientCodegenModelProvider {
  public static final ClientCodegenModel MODEL;

  static {
    ClientCodegenModel.Builder b = ClientCodegenModel.builder();
    b.addClass(PADIMTypeImpl.class);
    b.addClass(SignalSetTypeImpl.class);
    b.addClass(IAdministrationTypeImpl.class);
    b.addClass(ISignalSetTypeImpl.class);
    b.addClass(AnalogSignalVariableTypeImpl.class);
    b.addClass(TemperatureMeasurementVariableTypeImpl.class);
    b.addClass(PressureMeasurementVariableTypeImpl.class);
    b.addClass(FlowMeasurementVariableTypeImpl.class);
    b.addClass(LevelMeasurementVariableTypeImpl.class);
    b.addClass(ActualDensityVariableTypeImpl.class);
    b.addClass(ControlVariableTypeImpl.class);
    b.addClass(TotalizerVariableTypeImpl.class);
    b.addClass(AnalyticalMeasurementVariableTypeImpl.class);
    b.addClass(MassFlowRateVariableTypeImpl.class);
    b.addClass(ActualVolumeFlowRateVariableTypeImpl.class);
    b.addClass(NormalizedVolumeFlowRateVariableTypeImpl.class);
    b.addClass(TwoStateDiscreteSignalVariableTypeImpl.class);
    b.addClass(MultiStateDiscreteSignalVariableTypeImpl.class);
    b.addClass(DiscreteSignalVariableTypeImpl.class);
    b.addClass(SignalTypeImpl.class);
    b.addClass(AnalogSignalTypeImpl.class);
    b.addClass(ControlSignalTypeImpl.class);
    b.addClass(DiscreteSignalTypeImpl.class);
    b.addClass(TwoStateDiscreteSignalTypeImpl.class);
    b.addClass(MultiStateDiscreteSignalTypeImpl.class);
    b.addSerializers(PadimSerializers.SERIALIZERS);
    b.setDataTypeDictionary(PadimDataTypeDictionaryHelper.createDataTypeDictionary());
    b.addEnumerationSpecification(ResetModeEnum.SPECIFICATION);
    b.addEnumerationSpecification(ExecutionModeEnum.SPECIFICATION);
    MODEL = b.build();
  }

  @Override
  public ClientCodegenModel get() {
    return MODEL;
  }
}
