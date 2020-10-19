package com.prosysopc.ua.padim;

import com.prosysopc.ua.StatusException;
import com.prosysopc.ua.TypeDefinitionId;
import com.prosysopc.ua.nodes.Mandatory;
import com.prosysopc.ua.nodes.Optional;
import com.prosysopc.ua.nodes.UaProperty;
import com.prosysopc.ua.part19.MultiStateDictionaryEntryDiscreteType;
import com.prosysopc.ua.stack.builtintypes.UnsignedInteger;
import java.lang.Float;
import java.lang.String;

/**
 * Generated on 2020-10-19 15:11:10
 */
@TypeDefinitionId("nsu=http://opcfoundation.org/UA/PADIM/;i=1122")
public interface FlowMeasurementVariableType extends AnalogSignalVariableType {
  String LOW_FLOW_CUT_OFF = "LowFlowCutOff";

  String FLOW_DIRECTION = "FlowDirection";

  @Mandatory
  UaProperty getLowFlowCutOffNode();

  @Mandatory
  Float getLowFlowCutOff();

  @Mandatory
  void setLowFlowCutOff(Float value) throws StatusException;

  @Optional
  MultiStateDictionaryEntryDiscreteType getFlowDirectionNode();

  @Optional
  UnsignedInteger getFlowDirection();

  @Optional
  void setFlowDirection(UnsignedInteger value) throws StatusException;
}
