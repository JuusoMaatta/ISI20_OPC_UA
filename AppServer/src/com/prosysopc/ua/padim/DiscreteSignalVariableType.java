package com.prosysopc.ua.padim;

import com.prosysopc.ua.StatusException;
import com.prosysopc.ua.TypeDefinitionId;
import com.prosysopc.ua.nodes.Optional;
import com.prosysopc.ua.types.opcua.BaseDataVariableType;
import com.prosysopc.ua.types.opcua.DiscreteItemType;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;

/**
 * Generated on 2020-10-19 15:11:10
 */
@TypeDefinitionId("nsu=http://opcfoundation.org/UA/PADIM/;i=1143")
public interface DiscreteSignalVariableType extends DiscreteItemType {
  String ACTUAL_VALUE = "ActualValue";

  String SIMULATION_VALUE = "SimulationValue";

  String SIMULATION_STATE = "SimulationState";

  @Optional
  BaseDataVariableType getActualValueNode();

  @Optional
  Object getActualValue();

  @Optional
  void setActualValue(Object value) throws StatusException;

  @Optional
  BaseDataVariableType getSimulationValueNode();

  @Optional
  Object getSimulationValue();

  @Optional
  void setSimulationValue(Object value) throws StatusException;

  @Optional
  BaseDataVariableType getSimulationStateNode();

  @Optional
  Boolean isSimulationState();

  @Optional
  void setSimulationState(Boolean value) throws StatusException;
}
