package com.prosysopc.ua.padim.server;

import com.prosysopc.ua.StatusException;
import com.prosysopc.ua.TypeDefinitionId;
import com.prosysopc.ua.nodes.Optional;
import com.prosysopc.ua.nodes.UaProperty;
import com.prosysopc.ua.nodes.UaVariable;
import com.prosysopc.ua.padim.AnalogSignalVariableType;
import com.prosysopc.ua.server.GeneratedNodeInitializer;
import com.prosysopc.ua.server.NodeManagerUaNode;
import com.prosysopc.ua.stack.builtintypes.LocalizedText;
import com.prosysopc.ua.stack.builtintypes.NodeId;
import com.prosysopc.ua.stack.builtintypes.QualifiedName;
import com.prosysopc.ua.types.opcua.server.AnalogUnitRangeTypeNode;
import com.prosysopc.ua.types.opcua.server.BaseDataVariableTypeNode;
import java.lang.Boolean;
import java.lang.Float;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;

/**
 * Generated on 2020-10-19 15:11:10
 */
@TypeDefinitionId("nsu=http://opcfoundation.org/UA/PADIM/;i=1111")
public abstract class AnalogSignalVariableTypeNodeBase extends AnalogUnitRangeTypeNode implements AnalogSignalVariableType {
  private static GeneratedNodeInitializer<AnalogSignalVariableTypeNode> analogSignalVariableTypeNodeInitializer;

  protected AnalogSignalVariableTypeNodeBase(NodeManagerUaNode nodeManager, NodeId nodeId,
      QualifiedName browseName, LocalizedText displayName) {
    super(nodeManager, nodeId, browseName, displayName);
  }

  @Override
  public void afterCreate() {
    super.afterCreate();

    // Call afterCreate for each sub-node (if the node has any)
    callAfterCreateIfExists(getSimulationStateNode());
    callAfterCreateIfExists(getActualValueNode());
    callAfterCreateIfExists(getSimulationValueNode());
    GeneratedNodeInitializer<AnalogSignalVariableTypeNode> impl = getAnalogSignalVariableTypeNodeInitializer();
    if(impl != null) {
      impl.init((AnalogSignalVariableTypeNode)this);
    }
  }

  public static GeneratedNodeInitializer<AnalogSignalVariableTypeNode> getAnalogSignalVariableTypeNodeInitializer() {
    return analogSignalVariableTypeNodeInitializer;
  }

  public static void setAnalogSignalVariableTypeNodeInitializer(GeneratedNodeInitializer<AnalogSignalVariableTypeNode> analogSignalVariableTypeNodeInitializerNewValue) {
    analogSignalVariableTypeNodeInitializer=analogSignalVariableTypeNodeInitializerNewValue;
  }

  @Optional
  @Override
  public UaProperty getDampingNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/DI/", "Damping");
    return getProperty(browseName);
  }

  @Optional
  @Override
  public Float getDamping() {
    UaVariable node = getDampingNode();
    if (node == null) {
      return null;
    }
    Object value = node.getValue().getValue().getValue();
    return (Float) value;
  }

  @Optional
  @Override
  public void setDamping(Float value) {
    UaVariable node = getDampingNode();
    if (node == null) {
      throw new RuntimeException("Setting Damping failed: does not exist (Optional Nodes must be configured in NodeBuilder)");
    }
    try {
      node.setValue(value);
    } catch(StatusException e) {
      throw new RuntimeException("Setting Damping failed unexpectedly", e);
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
}
