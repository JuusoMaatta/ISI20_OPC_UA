package com.prosysopc.ua.padim;

import com.prosysopc.ua.StatusException;
import com.prosysopc.ua.TypeDefinitionId;
import com.prosysopc.ua.nodes.Optional;
import com.prosysopc.ua.types.opcua.BaseDataVariableType;
import com.prosysopc.ua.types.opcua.TwoStateDiscreteType;
import java.lang.Boolean;
import java.lang.String;

/**
 * Generated on 2020-10-19 15:11:10
 */
@TypeDefinitionId("nsu=http://opcfoundation.org/UA/PADIM/;i=1141")
public interface TwoStateDiscreteSignalVariableType extends TwoStateDiscreteType {
  String ACTUAL_VALUE = "ActualValue";

  String SIMULATION_VALUE = "SimulationValue";

  String SIMULATION_STATE = "SimulationState";

  @Optional
  BaseDataVariableType getActualValueNode();

  @Optional
  Boolean isActualValue();

  @Optional
  void setActualValue(Boolean value) throws StatusException;

  @Optional
  BaseDataVariableType getSimulationValueNode();

  @Optional
  Boolean isSimulationValue();

  @Optional
  void setSimulationValue(Boolean value) throws StatusException;

  @Optional
  BaseDataVariableType getSimulationStateNode();

  @Optional
  Boolean isSimulationState();

  @Optional
  void setSimulationState(Boolean value) throws StatusException;
}
