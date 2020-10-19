package com.prosysopc.ua.padim.server;

import com.prosysopc.ua.padim.ExecutionModeEnum;
import com.prosysopc.ua.padim.PadimDataTypeDictionaryHelper;
import com.prosysopc.ua.padim.PadimSerializers;
import com.prosysopc.ua.padim.ResetModeEnum;
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
public class PadimServerInformationModel implements ServerCodegenModelProvider {
  public static final ServerCodegenModel MODEL;

  static {
    ServerCodegenModel.Builder b = ServerCodegenModel.builder();
    b.addClass(PADIMTypeNode.class);
    b.addClass(SignalSetTypeNode.class);
    b.addClass(IAdministrationTypeNode.class);
    b.addClass(ISignalSetTypeNode.class);
    b.addClass(AnalogSignalVariableTypeNode.class);
    b.addClass(TemperatureMeasurementVariableTypeNode.class);
    b.addClass(PressureMeasurementVariableTypeNode.class);
    b.addClass(FlowMeasurementVariableTypeNode.class);
    b.addClass(LevelMeasurementVariableTypeNode.class);
    b.addClass(ActualDensityVariableTypeNode.class);
    b.addClass(ControlVariableTypeNode.class);
    b.addClass(TotalizerVariableTypeNode.class);
    b.addClass(AnalyticalMeasurementVariableTypeNode.class);
    b.addClass(MassFlowRateVariableTypeNode.class);
    b.addClass(ActualVolumeFlowRateVariableTypeNode.class);
    b.addClass(NormalizedVolumeFlowRateVariableTypeNode.class);
    b.addClass(TwoStateDiscreteSignalVariableTypeNode.class);
    b.addClass(MultiStateDiscreteSignalVariableTypeNode.class);
    b.addClass(DiscreteSignalVariableTypeNode.class);
    b.addClass(SignalTypeNode.class);
    b.addClass(AnalogSignalTypeNode.class);
    b.addClass(ControlSignalTypeNode.class);
    b.addClass(DiscreteSignalTypeNode.class);
    b.addClass(TwoStateDiscreteSignalTypeNode.class);
    b.addClass(MultiStateDiscreteSignalTypeNode.class);
    b.addSerializers(PadimSerializers.SERIALIZERS);
    b.setDataTypeDictionary(PadimDataTypeDictionaryHelper.createDataTypeDictionary());
    b.addEnumerationSpecification(ResetModeEnum.SPECIFICATION);
    b.addEnumerationSpecification(ExecutionModeEnum.SPECIFICATION);
    MODEL = b.build();
  }

  @Override
  public ServerCodegenModel get() {
    return MODEL;
  }

  /**
   * Returns URI for the NodeSet XML file 'Opc.Ua.PADIM.NodeSet2.xml', assuming it is put into classpath next to classfile of this class. You can use the 'server_model' codegen target to do it automatically as part of the code generation. If the file is not found this method will throw RuntimeException.
   */
  public static URI getLocationURI() {
    URL nodeset = PadimServerInformationModel.class.getResource("Opc.Ua.PADIM.NodeSet2.xml");
    if (nodeset == null) {
      throw new RuntimeException("Cannot find nodeset 'Opc.Ua.PADIM.NodeSet2.xml' in classpath next to "+PadimServerInformationModel.class);
    }
    try {
      return nodeset.toURI();
    } catch (URISyntaxException e) {
      throw new RuntimeException(e);
    }
  }
}
