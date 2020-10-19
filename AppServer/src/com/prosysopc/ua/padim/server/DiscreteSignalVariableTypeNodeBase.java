package com.prosysopc.ua.padim.server;

import com.prosysopc.ua.StatusException;
import com.prosysopc.ua.TypeDefinitionId;
import com.prosysopc.ua.nodes.Optional;
import com.prosysopc.ua.nodes.UaVariable;
import com.prosysopc.ua.padim.DiscreteSignalVariableType;
import com.prosysopc.ua.server.GeneratedNodeInitializer;
import com.prosysopc.ua.server.NodeManagerUaNode;
import com.prosysopc.ua.stack.builtintypes.LocalizedText;
import com.prosysopc.ua.stack.builtintypes.NodeId;
import com.prosysopc.ua.stack.builtintypes.QualifiedName;
import com.prosysopc.ua.types.opcua.server.BaseDataVariableTypeNode;
import com.prosysopc.ua.types.opcua.server.DiscreteItemTypeNode;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;

/**
 * Generated on 2020-10-19 15:11:10
 */
@TypeDefinitionId("nsu=http://opcfoundation.org/UA/PADIM/;i=1143")
public abstract class DiscreteSignalVariableTypeNodeBase extends DiscreteItemTypeNode implements DiscreteSignalVariableType {
  private static GeneratedNodeInitializer<DiscreteSignalVariableTypeNode> discreteSignalVariableTypeNodeInitializer;

  protected DiscreteSignalVariableTypeNodeBase(NodeManagerUaNode nodeManager, NodeId nodeId,
      QualifiedName browseName, LocalizedText displayName) {
    super(nodeManager, nodeId, browseName, displayName);
  }

  @Override
  public void afterCreate() {
    super.afterCreate();

    // Call afterCreate for each sub-node (if the node has any)
    callAfterCreateIfExists(getActualValueNode());
    callAfterCreateIfExists(getSimulationValueNode());
    callAfterCreateIfExists(getSimulationStateNode());
    GeneratedNodeInitializer<DiscreteSignalVariableTypeNode> impl = getDiscreteSignalVariableTypeNodeInitializer();
    if(impl != null) {
      impl.init((DiscreteSignalVariableTypeNode)this);
    }
  }

  public static GeneratedNodeInitializer<DiscreteSignalVariableTypeNode> getDiscreteSignalVariableTypeNodeInitializer() {
    return discreteSignalVariableTypeNodeInitializer;
  }

  public static void setDiscreteSignalVariableTypeNodeInitializer(GeneratedNodeInitializer<DiscreteSignalVariableTypeNode> discreteSignalVariableTypeNodeInitializerNewValue) {
    discreteSignalVariableTypeNodeInitializer=discreteSignalVariableTypeNodeInitializerNewValue;
  }

  @Optional
  @Override
  public BaseDataVariableTypeNode getActualValueNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/DI/", "ActualValue");
    return (BaseDataVariableTypeNode) getComponent(browseName);
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
  public void setActualValue(Object value) {
    UaVariable node = getActualValueNode();
    if (node == null) {
      throw new RuntimeException("Setting ActualValue failed: does not exist (Optional Nodes must be configured in NodeBuilder)");
    }
    try {
      node.setValue(value);
    } catch(StatusException e) {
      throw new RuntimeException("Setting ActualValue failed unexpectedly", e);
    }
  }

  @Optional
  @Override
  public BaseDataVariableTypeNode getSimulationValueNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/DI/", "SimulationValue");
    return (BaseDataVariableTypeNode) getComponent(browseName);
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
  public void setSimulationValue(Object value) {
    UaVariable node = getSimulationValueNode();
    if (node == null) {
      throw new RuntimeException("Setting SimulationValue failed: does not exist (Optional Nodes must be configured in NodeBuilder)");
    }
    try {
      node.setValue(value);
    } catch(StatusException e) {
      throw new RuntimeException("Setting SimulationValue failed unexpectedly", e);
    }
  }

  @Optional
  @Override
  public BaseDataVariableTypeNode getSimulationStateNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/DI/", "SimulationState");
    return (BaseDataVariableTypeNode) getComponent(browseName);
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
  public void setSimulationState(Boolean value) {
    UaVariable node = getSimulationStateNode();
    if (node == null) {
      throw new RuntimeException("Setting SimulationState failed: does not exist (Optional Nodes must be configured in NodeBuilder)");
    }
    try {
      node.setValue(value);
    } catch(StatusException e) {
      throw new RuntimeException("Setting SimulationState failed unexpectedly", e);
    }
  }
}
