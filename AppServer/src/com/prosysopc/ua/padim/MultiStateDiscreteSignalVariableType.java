package com.prosysopc.ua.padim;

import com.prosysopc.ua.StatusException;
import com.prosysopc.ua.TypeDefinitionId;
import com.prosysopc.ua.nodes.Optional;
import com.prosysopc.ua.part19.MultiStateDictionaryEntryDiscreteBaseType;
import com.prosysopc.ua.stack.builtintypes.UnsignedInteger;
import com.prosysopc.ua.types.opcua.BaseDataVariableType;
import java.lang.Boolean;
import java.lang.String;

/**
 * Generated on 2020-10-19 15:11:10
 */
@TypeDefinitionId("nsu=http://opcfoundation.org/UA/PADIM/;i=1142")
public interface MultiStateDiscreteSignalVariableType extends MultiStateDictionaryEntryDiscreteBaseType {
  String ACTUAL_VALUE = "ActualValue";

  String SIMULATION_VALUE = "SimulationValue";

  String SIMULATION_STATE = "SimulationState";

  @Optional
  BaseDataVariableType getActualValueNode();

  @Optional
  UnsignedInteger getActualValue();

  @Optional
  void setActualValue(UnsignedInteger value) throws StatusException;

  @Optional
  BaseDataVariableType getSimulationValueNode();

  @Optional
  UnsignedInteger getSimulationValue();

  @Optional
  void setSimulationValue(UnsignedInteger value) throws StatusException;

  @Optional
  BaseDataVariableType getSimulationStateNode();

  @Optional
  Boolean isSimulationState();

  @Optional
  void setSimulationState(Boolean value) throws StatusException;
}
