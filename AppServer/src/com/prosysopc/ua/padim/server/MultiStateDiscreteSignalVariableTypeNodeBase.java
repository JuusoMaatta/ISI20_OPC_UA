package com.prosysopc.ua.padim.server;

import com.prosysopc.ua.StatusException;
import com.prosysopc.ua.TypeDefinitionId;
import com.prosysopc.ua.nodes.Optional;
import com.prosysopc.ua.nodes.UaVariable;
import com.prosysopc.ua.padim.MultiStateDiscreteSignalVariableType;
import com.prosysopc.ua.part19.server.MultiStateDictionaryEntryDiscreteBaseTypeNode;
import com.prosysopc.ua.server.GeneratedNodeInitializer;
import com.prosysopc.ua.server.NodeManagerUaNode;
import com.prosysopc.ua.stack.builtintypes.LocalizedText;
import com.prosysopc.ua.stack.builtintypes.NodeId;
import com.prosysopc.ua.stack.builtintypes.QualifiedName;
import com.prosysopc.ua.stack.builtintypes.UnsignedInteger;
import com.prosysopc.ua.types.opcua.server.BaseDataVariableTypeNode;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;

/**
 * Generated on 2020-10-19 15:11:10
 */
@TypeDefinitionId("nsu=http://opcfoundation.org/UA/PADIM/;i=1142")
public abstract class MultiStateDiscreteSignalVariableTypeNodeBase extends MultiStateDictionaryEntryDiscreteBaseTypeNode implements MultiStateDiscreteSignalVariableType {
  private static GeneratedNodeInitializer<MultiStateDiscreteSignalVariableTypeNode> multiStateDiscreteSignalVariableTypeNodeInitializer;

  protected MultiStateDiscreteSignalVariableTypeNodeBase(NodeManagerUaNode nodeManager,
      NodeId nodeId, QualifiedName browseName, LocalizedText displayName) {
    super(nodeManager, nodeId, browseName, displayName);
  }

  @Override
  public void afterCreate() {
    super.afterCreate();

    // Call afterCreate for each sub-node (if the node has any)
    callAfterCreateIfExists(getActualValueNode());
    callAfterCreateIfExists(getSimulationValueNode());
    callAfterCreateIfExists(getSimulationStateNode());
    GeneratedNodeInitializer<MultiStateDiscreteSignalVariableTypeNode> impl = getMultiStateDiscreteSignalVariableTypeNodeInitializer();
    if(impl != null) {
      impl.init((MultiStateDiscreteSignalVariableTypeNode)this);
    }
  }

  public static GeneratedNodeInitializer<MultiStateDiscreteSignalVariableTypeNode> getMultiStateDiscreteSignalVariableTypeNodeInitializer() {
    return multiStateDiscreteSignalVariableTypeNodeInitializer;
  }

  public static void setMultiStateDiscreteSignalVariableTypeNodeInitializer(GeneratedNodeInitializer<MultiStateDiscreteSignalVariableTypeNode> multiStateDiscreteSignalVariableTypeNodeInitializerNewValue) {
    multiStateDiscreteSignalVariableTypeNodeInitializer=multiStateDiscreteSignalVariableTypeNodeInitializerNewValue;
  }

  @Optional
  @Override
  public BaseDataVariableTypeNode getActualValueNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/DI/", "ActualValue");
    return (BaseDataVariableTypeNode) getComponent(browseName);
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
  public void setActualValue(UnsignedInteger value) {
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

  public void setActualValue(long value) {
    setActualValue(UnsignedInteger.valueOf(value));
  }

  @Optional
  @Override
  public BaseDataVariableTypeNode getSimulationValueNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/DI/", "SimulationValue");
    return (BaseDataVariableTypeNode) getComponent(browseName);
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
  public void setSimulationValue(UnsignedInteger value) {
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

  public void setSimulationValue(long value) {
    setSimulationValue(UnsignedInteger.valueOf(value));
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
