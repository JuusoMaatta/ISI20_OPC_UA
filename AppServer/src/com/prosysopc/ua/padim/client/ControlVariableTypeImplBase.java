package com.prosysopc.ua.padim.client;

import com.prosysopc.ua.StatusException;
import com.prosysopc.ua.TypeDefinitionId;
import com.prosysopc.ua.client.AddressSpace;
import com.prosysopc.ua.nodes.Mandatory;
import com.prosysopc.ua.nodes.UaVariable;
import com.prosysopc.ua.padim.ControlVariableType;
import com.prosysopc.ua.part19.MultiStateDictionaryEntryDiscreteType;
import com.prosysopc.ua.stack.builtintypes.LocalizedText;
import com.prosysopc.ua.stack.builtintypes.NodeId;
import com.prosysopc.ua.stack.builtintypes.QualifiedName;
import com.prosysopc.ua.stack.builtintypes.UnsignedInteger;
import com.prosysopc.ua.types.opcua.BaseAnalogType;
import java.lang.Float;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;

/**
 * Generated on 2020-10-19 15:11:10
 */
@TypeDefinitionId("nsu=http://opcfoundation.org/UA/PADIM/;i=1125")
public abstract class ControlVariableTypeImplBase extends AnalogSignalVariableTypeImpl implements ControlVariableType {
  protected ControlVariableTypeImplBase(AddressSpace addressSpace, NodeId nodeId,
      QualifiedName browseName, LocalizedText displayName) {
    super(addressSpace, nodeId, browseName, displayName);
  }

  @Mandatory
  @Override
  public BaseAnalogType getSetpointNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/DI/", "Setpoint");
    return (BaseAnalogType) getComponent(browseName);
  }

  @Mandatory
  @Override
  public Float getSetpoint() {
    UaVariable node = getSetpointNode();
    if (node == null) {
      return null;
    }
    Object value = node.getValue().getValue().getValue();
    return (Float) value;
  }

  @Mandatory
  @Override
  public void setSetpoint(Float value) throws StatusException {
    UaVariable node = getSetpointNode();
    if (node == null) {
      throw new RuntimeException("Setting Setpoint failed, the Optional node does not exist)");
    }
    node.setValue(value);
  }

  @Mandatory
  @Override
  public MultiStateDictionaryEntryDiscreteType getOperatingDirectionNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/DI/", "OperatingDirection");
    return (MultiStateDictionaryEntryDiscreteType) getComponent(browseName);
  }

  @Mandatory
  @Override
  public UnsignedInteger getOperatingDirection() {
    UaVariable node = getOperatingDirectionNode();
    if (node == null) {
      return null;
    }
    Object value = node.getValue().getValue().getValue();
    return (UnsignedInteger) value;
  }

  @Mandatory
  @Override
  public void setOperatingDirection(UnsignedInteger value) throws StatusException {
    UaVariable node = getOperatingDirectionNode();
    if (node == null) {
      throw new RuntimeException("Setting OperatingDirection failed, the Optional node does not exist)");
    }
    node.setValue(value);
  }

  @Mandatory
  @Override
  public MultiStateDictionaryEntryDiscreteType getActuatorTypeNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/DI/", "ActuatorType");
    return (MultiStateDictionaryEntryDiscreteType) getComponent(browseName);
  }

  @Mandatory
  @Override
  public UnsignedInteger getActuatorType() {
    UaVariable node = getActuatorTypeNode();
    if (node == null) {
      return null;
    }
    Object value = node.getValue().getValue().getValue();
    return (UnsignedInteger) value;
  }

  @Mandatory
  @Override
  public void setActuatorType(UnsignedInteger value) throws StatusException {
    UaVariable node = getActuatorTypeNode();
    if (node == null) {
      throw new RuntimeException("Setting ActuatorType failed, the Optional node does not exist)");
    }
    node.setValue(value);
  }
}
