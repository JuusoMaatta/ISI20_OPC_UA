package com.prosysopc.ua.padim.client;

import com.prosysopc.ua.StatusException;
import com.prosysopc.ua.TypeDefinitionId;
import com.prosysopc.ua.client.AddressSpace;
import com.prosysopc.ua.nodes.Optional;
import com.prosysopc.ua.nodes.UaVariable;
import com.prosysopc.ua.padim.DiscreteSignalVariableType;
import com.prosysopc.ua.stack.builtintypes.LocalizedText;
import com.prosysopc.ua.stack.builtintypes.NodeId;
import com.prosysopc.ua.stack.builtintypes.QualifiedName;
import com.prosysopc.ua.types.opcua.BaseDataVariableType;
import com.prosysopc.ua.types.opcua.client.DiscreteItemTypeImpl;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;

/**
 * Generated on 2020-10-19 15:11:10
 */
@TypeDefinitionId("nsu=http://opcfoundation.org/UA/PADIM/;i=1143")
public abstract class DiscreteSignalVariableTypeImplBase extends DiscreteItemTypeImpl implements DiscreteSignalVariableType {
  protected DiscreteSignalVariableTypeImplBase(AddressSpace addressSpace, NodeId nodeId,
      QualifiedName browseName, LocalizedText displayName) {
    super(addressSpace, nodeId, browseName, displayName);
  }

  @Optional
  @Override
  public BaseDataVariableType getActualValueNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/DI/", "ActualValue");
    return (BaseDataVariableType) getComponent(browseName);
  }

  @Optional
  @Override
  public Object getActualValue() {
    UaVariable node = getActualValueNode();
    if (node == null) {
      return null;
    }
    Object value = node.getValue().getValue().getValue();
    return (Object) value;
  }

  @Optional
  @Override
  public void setActualValue(Object value) throws StatusException {
    UaVariable node = getActualValueNode();
    if (node == null) {
      throw new RuntimeException("Setting ActualValue failed, the Optional node does not exist)");
    }
    node.setValue(value);
  }

  @Optional
  @Override
  public BaseDataVariableType getSimulationValueNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/DI/", "SimulationValue");
    return (BaseDataVariableType) getComponent(browseName);
  }

  @Optional
  @Override
  public Object getSimulationValue() {
    UaVariable node = getSimulationValueNode();
    if (node == null) {
      return null;
    }
    Object value = node.getValue().getValue().getValue();
    return (Object) value;
  }

  @Optional
  @Override
  public void setSimulationValue(Object value) throws StatusException {
    UaVariable node = getSimulationValueNode();
    if (node == null) {
      throw new RuntimeException("Setting SimulationValue failed, the Optional node does not exist)");
    }
    node.setValue(value);
  }

  @Optional
  @Override
  public BaseDataVariableType getSimulationStateNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/DI/", "SimulationState");
    return (BaseDataVariableType) getComponent(browseName);
  }

  @Optional
  @Override
  public Boolean isSimulationState() {
    UaVariable node = getSimulationStateNode();
    if (node == null) {
      return null;
    }
    Object value = node.getValue().getValue().getValue();
    return (Boolean) value;
  }

  @Optional
  @Override
  public void setSimulationState(Boolean value) throws StatusException {
    UaVariable node = getSimulationStateNode();
    if (node == null) {
      throw new RuntimeException("Setting SimulationState failed, the Optional node does not exist)");
    }
    node.setValue(value);
  }
}
