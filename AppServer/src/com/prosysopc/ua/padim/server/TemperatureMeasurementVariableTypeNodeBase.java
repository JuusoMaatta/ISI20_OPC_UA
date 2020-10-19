package com.prosysopc.ua.padim.server;

import com.prosysopc.ua.StatusException;
import com.prosysopc.ua.TypeDefinitionId;
import com.prosysopc.ua.nodes.Mandatory;
import com.prosysopc.ua.nodes.Optional;
import com.prosysopc.ua.nodes.UaVariable;
import com.prosysopc.ua.padim.TemperatureMeasurementVariableType;
import com.prosysopc.ua.part19.server.MultiStateDictionaryEntryDiscreteTypeNode;
import com.prosysopc.ua.server.GeneratedNodeInitializer;
import com.prosysopc.ua.server.NodeManagerUaNode;
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
public abstract class TemperatureMeasurementVariableTypeNodeBase extends AnalogSignalVariableTypeNode implements TemperatureMeasurementVariableType {
  private static GeneratedNodeInitializer<TemperatureMeasurementVariableTypeNode> temperatureMeasurementVariableTypeNodeInitializer;

  protected TemperatureMeasurementVariableTypeNodeBase(NodeManagerUaNode nodeManager, NodeId nodeId,
      QualifiedName browseName, LocalizedText displayName) {
    super(nodeManager, nodeId, browseName, displayName);
  }

  @Override
  public void afterCreate() {
    super.afterCreate();

    // Call afterCreate for each sub-node (if the node has any)
    callAfterCreateIfExists(getSensorTypeNode());
    callAfterCreateIfExists(getSensorConnectionNode());
    callAfterCreateIfExists(getSensorReferenceNode());
    GeneratedNodeInitializer<TemperatureMeasurementVariableTypeNode> impl = getTemperatureMeasurementVariableTypeNodeInitializer();
    if(impl != null) {
      impl.init((TemperatureMeasurementVariableTypeNode)this);
    }
  }

  public static GeneratedNodeInitializer<TemperatureMeasurementVariableTypeNode> getTemperatureMeasurementVariableTypeNodeInitializer() {
    return temperatureMeasurementVariableTypeNodeInitializer;
  }

  public static void setTemperatureMeasurementVariableTypeNodeInitializer(GeneratedNodeInitializer<TemperatureMeasurementVariableTypeNode> temperatureMeasurementVariableTypeNodeInitializerNewValue) {
    temperatureMeasurementVariableTypeNodeInitializer=temperatureMeasurementVariableTypeNodeInitializerNewValue;
  }

  @Mandatory
  @Override
  public MultiStateDictionaryEntryDiscreteTypeNode getSensorTypeNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/DI/", "SensorType");
    return (MultiStateDictionaryEntryDiscreteTypeNode) getComponent(browseName);
  }

  @Mandatory
  @Override
  public UnsignedInteger getSensorType() {
    UaVariable node = getSensorTypeNode();
    if (node == null) {
      throw new RuntimeException("Mandatory node SensorType does not exist");
    }
    Object value = node.getValue().getValue().getValue();
    return (UnsignedInteger) value;
  }

  @Mandatory
  @Override
  public void setSensorType(UnsignedInteger value) {
    UaVariable node = getSensorTypeNode();
    if (node == null) {
      throw new RuntimeException("Setting SensorType failed: does not exist (Optional Nodes must be configured in NodeBuilder)");
    }
    try {
      node.setValue(value);
    } catch(StatusException e) {
      throw new RuntimeException("Setting SensorType failed unexpectedly", e);
    }
  }

  public void setSensorType(long value) {
    setSensorType(UnsignedInteger.valueOf(value));
  }

  @Optional
  @Override
  public MultiStateDictionaryEntryDiscreteTypeNode getSensorConnectionNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/DI/", "SensorConnection");
    return (MultiStateDictionaryEntryDiscreteTypeNode) getComponent(browseName);
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
  public void setSensorConnection(UnsignedInteger value) {
    UaVariable node = getSensorConnectionNode();
    if (node == null) {
      throw new RuntimeException("Setting SensorConnection failed: does not exist (Optional Nodes must be configured in NodeBuilder)");
    }
    try {
      node.setValue(value);
    } catch(StatusException e) {
      throw new RuntimeException("Setting SensorConnection failed unexpectedly", e);
    }
  }

  public void setSensorConnection(long value) {
    setSensorConnection(UnsignedInteger.valueOf(value));
  }

  @Optional
  @Override
  public MultiStateDictionaryEntryDiscreteTypeNode getSensorReferenceNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/DI/", "SensorReference");
    return (MultiStateDictionaryEntryDiscreteTypeNode) getComponent(browseName);
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
  public void setSensorReference(UnsignedInteger value) {
    UaVariable node = getSensorReferenceNode();
    if (node == null) {
      throw new RuntimeException("Setting SensorReference failed: does not exist (Optional Nodes must be configured in NodeBuilder)");
    }
    try {
      node.setValue(value);
    } catch(StatusException e) {
      throw new RuntimeException("Setting SensorReference failed unexpectedly", e);
    }
  }

  public void setSensorReference(long value) {
    setSensorReference(UnsignedInteger.valueOf(value));
  }
}
