package com.prosysopc.ua.padim;

import com.prosysopc.ua.StatusException;
import com.prosysopc.ua.TypeDefinitionId;
import com.prosysopc.ua.nodes.Mandatory;
import com.prosysopc.ua.part19.MultiStateDictionaryEntryDiscreteType;
import com.prosysopc.ua.stack.builtintypes.UnsignedInteger;
import com.prosysopc.ua.types.opcua.BaseAnalogType;
import java.lang.Float;
import java.lang.String;

/**
 * Generated on 2020-10-19 15:11:10
 */
@TypeDefinitionId("nsu=http://opcfoundation.org/UA/PADIM/;i=1125")
public interface ControlVariableType extends AnalogSignalVariableType {
  String SETPOINT = "Setpoint";

  String OPERATING_DIRECTION = "OperatingDirection";

  String ACTUATOR_TYPE = "ActuatorType";

  @Mandatory
  BaseAnalogType getSetpointNode();

  @Mandatory
  Float getSetpoint();

  @Mandatory
  void setSetpoint(Float value) throws StatusException;

  @Mandatory
  MultiStateDictionaryEntryDiscreteType getOperatingDirectionNode();

  @Mandatory
  UnsignedInteger getOperatingDirection();

  @Mandatory
  void setOperatingDirection(UnsignedInteger value) throws StatusException;

  @Mandatory
  MultiStateDictionaryEntryDiscreteType getActuatorTypeNode();

  @Mandatory
  UnsignedInteger getActuatorType();

  @Mandatory
  void setActuatorType(UnsignedInteger value) throws StatusException;
}
