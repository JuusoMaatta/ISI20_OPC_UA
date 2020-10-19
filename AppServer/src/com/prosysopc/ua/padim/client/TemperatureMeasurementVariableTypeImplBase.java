package com.prosysopc.ua.padim.client;

import com.prosysopc.ua.StatusException;
import com.prosysopc.ua.TypeDefinitionId;
import com.prosysopc.ua.client.AddressSpace;
import com.prosysopc.ua.nodes.Mandatory;
import com.prosysopc.ua.nodes.Optional;
import com.prosysopc.ua.nodes.UaVariable;
import com.prosysopc.ua.padim.TemperatureMeasurementVariableType;
import com.prosysopc.ua.part19.MultiStateDictionaryEntryDiscreteType;
import com.prosysopc.ua.stack.builtintypes.LocalizedText;
import com.prosysopc.ua.stack.builtintypes.NodeId;
import com.prosysopc.ua.stack.builtintypes.QualifiedName;
import com.prosysopc.ua.stack.builtintypes.UnsignedInteger;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;

/**
 * Generated on 2020-10-19 15:11:10
 */
@TypeDefinitionId("nsu=http://opcfoundation.org/UA/PADIM/;i=1120")
public abstract class TemperatureMeasurementVariableTypeImplBase extends AnalogSignalVariableTypeImpl implements TemperatureMeasurementVariableType {
  protected TemperatureMeasurementVariableTypeImplBase(AddressSpace addressSpace, NodeId nodeId,
      QualifiedName browseName, LocalizedText displayName) {
    super(addressSpace, nodeId, browseName, displayName);
  }

  @Mandatory
  @Override
  public MultiStateDictionaryEntryDiscreteType getSensorTypeNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/DI/", "SensorType");
    return (MultiStateDictionaryEntryDiscreteType) getComponent(browseName);
  }

  @Mandatory
  @Override
  public UnsignedInteger getSensorType() {
    UaVariable node = getSensorTypeNode();
    if (node == null) {
      return null;
    }
    Object value = node.getValue().getValue().getValue();
    return (UnsignedInteger) value;
  }

  @Mandatory
  @Override
  public void setSensorType(UnsignedInteger value) throws StatusException {
    UaVariable node = getSensorTypeNode();
    if (node == null) {
      throw new RuntimeException("Setting SensorType failed, the Optional node does not exist)");
    }
    node.setValue(value);
  }

  @Optional
  @Override
  public MultiStateDictionaryEntryDiscreteType getSensorConnectionNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/DI/", "SensorConnection");
    return (MultiStateDictionaryEntryDiscreteType) getComponent(browseName);
  }

  @Optional
  @Override
  public UnsignedInteger getSensorConnection() {
    UaVariable node = getSensorConnectionNode();
    if (node == null) {
      return null;
    }
    Object value = node.getValue().getValue().getValue();
    return (UnsignedInteger) value;
  }

  @Optional
  @Override
  public void setSensorConnection(UnsignedInteger value) throws StatusException {
    UaVariable node = getSensorConnectionNode();
    if (node == null) {
      throw new RuntimeException("Setting SensorConnection failed, the Optional node does not exist)");
    }
    node.setValue(value);
  }

  @Optional
  @Override
  public MultiStateDictionaryEntryDiscreteType getSensorReferenceNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/DI/", "SensorReference");
    return (MultiStateDictionaryEntryDiscreteType) getComponent(browseName);
  }

  @Optional
  @Override
  public UnsignedInteger getSensorReference() {
    UaVariable node = getSensorReferenceNode();
    if (node == null) {
      return null;
    }
    Object value = node.getValue().getValue().getValue();
    return (UnsignedInteger) value;
  }

  @Optional
  @Override
  public void setSensorReference(UnsignedInteger value) throws StatusException {
    UaVariable node = getSensorReferenceNode();
    if (node == null) {
      throw new RuntimeException("Setting SensorReference failed, the Optional node does not exist)");
    }
    node.setValue(value);
  }
}
