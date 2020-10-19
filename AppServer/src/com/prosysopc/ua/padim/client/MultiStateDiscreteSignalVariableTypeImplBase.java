package com.prosysopc.ua.padim.client;

import com.prosysopc.ua.StatusException;
import com.prosysopc.ua.TypeDefinitionId;
import com.prosysopc.ua.client.AddressSpace;
import com.prosysopc.ua.nodes.Optional;
import com.prosysopc.ua.nodes.UaVariable;
import com.prosysopc.ua.padim.MultiStateDiscreteSignalVariableType;
import com.prosysopc.ua.part19.client.MultiStateDictionaryEntryDiscreteBaseTypeImpl;
import com.prosysopc.ua.stack.builtintypes.LocalizedText;
import com.prosysopc.ua.stack.builtintypes.NodeId;
import com.prosysopc.ua.stack.builtintypes.QualifiedName;
import com.prosysopc.ua.stack.builtintypes.UnsignedInteger;
import com.prosysopc.ua.types.opcua.BaseDataVariableType;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;

/**
 * Generated on 2020-10-19 15:11:10
 */
@TypeDefinitionId("nsu=http://opcfoundation.org/UA/PADIM/;i=1142")
public abstract class MultiStateDiscreteSignalVariableTypeImplBase extends MultiStateDictionaryEntryDiscreteBaseTypeImpl implements MultiStateDiscreteSignalVariableType {
  protected MultiStateDiscreteSignalVariableTypeImplBase(AddressSpace addressSpace, NodeId nodeId,
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
  public UnsignedInteger getActualValue() {
    UaVariable node = getActualValueNode();
    if (node == null) {
      return null;
    }
    Object value = node.getValue().getValue().getValue();
    return (UnsignedInteger) value;
  }

  @Optional
  @Override
  public void setActualValue(UnsignedInteger value) throws StatusException {
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
  public UnsignedInteger getSimulationValue() {
    UaVariable node = getSimulationValueNode();
    if (node == null) {
      return null;
    }
    Object value = node.getValue().getValue().getValue();
    return (UnsignedInteger) value;
  }

  @Optional
  @Override
  public void setSimulationValue(UnsignedInteger value) throws StatusException {
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
