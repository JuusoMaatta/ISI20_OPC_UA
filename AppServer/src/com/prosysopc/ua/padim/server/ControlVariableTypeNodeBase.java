package com.prosysopc.ua.padim.server;

import com.prosysopc.ua.StatusException;
import com.prosysopc.ua.TypeDefinitionId;
import com.prosysopc.ua.nodes.Mandatory;
import com.prosysopc.ua.nodes.UaVariable;
import com.prosysopc.ua.padim.ControlVariableType;
import com.prosysopc.ua.part19.server.MultiStateDictionaryEntryDiscreteTypeNode;
import com.prosysopc.ua.server.GeneratedNodeInitializer;
import com.prosysopc.ua.server.NodeManagerUaNode;
import com.prosysopc.ua.stack.builtintypes.LocalizedText;
import com.prosysopc.ua.stack.builtintypes.NodeId;
import com.prosysopc.ua.stack.builtintypes.QualifiedName;
import com.prosysopc.ua.stack.builtintypes.UnsignedInteger;
import com.prosysopc.ua.types.opcua.server.BaseAnalogTypeNode;
import java.lang.Float;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;

/**
 * Generated on 2020-10-19 15:11:10
 */
@TypeDefinitionId("nsu=http://opcfoundation.org/UA/PADIM/;i=1125")
public abstract class ControlVariableTypeNodeBase extends AnalogSignalVariableTypeNode implements ControlVariableType {
  private static GeneratedNodeInitializer<ControlVariableTypeNode> controlVariableTypeNodeInitializer;

  protected ControlVariableTypeNodeBase(NodeManagerUaNode nodeManager, NodeId nodeId,
      QualifiedName browseName, LocalizedText displayName) {
    super(nodeManager, nodeId, browseName, displayName);
  }

  @Override
  public void afterCreate() {
    super.afterCreate();

    // Call afterCreate for each sub-node (if the node has any)
    callAfterCreateIfExists(getSetpointNode());
    callAfterCreateIfExists(getOperatingDirectionNode());
    callAfterCreateIfExists(getActuatorTypeNode());
    GeneratedNodeInitializer<ControlVariableTypeNode> impl = getControlVariableTypeNodeInitializer();
    if(impl != null) {
      impl.init((ControlVariableTypeNode)this);
    }
  }

  public static GeneratedNodeInitializer<ControlVariableTypeNode> getControlVariableTypeNodeInitializer() {
    return controlVariableTypeNodeInitializer;
  }

  public static void setControlVariableTypeNodeInitializer(GeneratedNodeInitializer<ControlVariableTypeNode> controlVariableTypeNodeInitializerNewValue) {
    controlVariableTypeNodeInitializer=controlVariableTypeNodeInitializerNewValue;
  }

  @Mandatory
  @Override
  public BaseAnalogTypeNode getSetpointNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/DI/", "Setpoint");
    return (BaseAnalogTypeNode) getComponent(browseName);
  }

  @Mandatory
  @Override
  public Float getSetpoint() {
    UaVariable node = getSetpointNode();
    if (node == null) {
      throw new RuntimeException("Mandatory node Setpoint does not exist");
    }
    Object value = node.getValue().getValue().getValue();
    return (Float) value;
  }

  @Mandatory
  @Override
  public void setSetpoint(Float value) {
    UaVariable node = getSetpointNode();
    if (node == null) {
      throw new RuntimeException("Setting Setpoint failed: does not exist (Optional Nodes must be configured in NodeBuilder)");
    }
    try {
      node.setValue(value);
    } catch(StatusException e) {
      throw new RuntimeException("Setting Setpoint failed unexpectedly", e);
    }
  }

  @Mandatory
  @Override
  public MultiStateDictionaryEntryDiscreteTypeNode getOperatingDirectionNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/DI/", "OperatingDirection");
    return (MultiStateDictionaryEntryDiscreteTypeNode) getComponent(browseName);
  }

  @Mandatory
  @Override
  public UnsignedInteger getOperatingDirection() {
    UaVariable node = getOperatingDirectionNode();
    if (node == null) {
      throw new RuntimeException("Mandatory node OperatingDirection does not exist");
    }
    Object value = node.getValue().getValue().getValue();
    return (UnsignedInteger) value;
  }

  @Mandatory
  @Override
  public void setOperatingDirection(UnsignedInteger value) {
    UaVariable node = getOperatingDirectionNode();
    if (node == null) {
      throw new RuntimeException("Setting OperatingDirection failed: does not exist (Optional Nodes must be configured in NodeBuilder)");
    }
    try {
      node.setValue(value);
    } catch(StatusException e) {
      throw new RuntimeException("Setting OperatingDirection failed unexpectedly", e);
    }
  }

  public void setOperatingDirection(long value) {
    setOperatingDirection(UnsignedInteger.valueOf(value));
  }

  @Mandatory
  @Override
  public MultiStateDictionaryEntryDiscreteTypeNode getActuatorTypeNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/DI/", "ActuatorType");
    return (MultiStateDictionaryEntryDiscreteTypeNode) getComponent(browseName);
  }

  @Mandatory
  @Override
  public UnsignedInteger getActuatorType() {
    UaVariable node = getActuatorTypeNode();
    if (node == null) {
      throw new RuntimeException("Mandatory node ActuatorType does not exist");
    }
    Object value = node.getValue().getValue().getValue();
    return (UnsignedInteger) value;
  }

  @Mandatory
  @Override
  public void setActuatorType(UnsignedInteger value) {
    UaVariable node = getActuatorTypeNode();
    if (node == null) {
      throw new RuntimeException("Setting ActuatorType failed: does not exist (Optional Nodes must be configured in NodeBuilder)");
    }
    try {
      node.setValue(value);
    } catch(StatusException e) {
      throw new RuntimeException("Setting ActuatorType failed unexpectedly", e);
    }
  }

  public void setActuatorType(long value) {
    setActuatorType(UnsignedInteger.valueOf(value));
  }
}
