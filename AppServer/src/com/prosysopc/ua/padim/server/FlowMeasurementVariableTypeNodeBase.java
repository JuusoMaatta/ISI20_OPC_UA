package com.prosysopc.ua.padim.server;

import com.prosysopc.ua.StatusException;
import com.prosysopc.ua.TypeDefinitionId;
import com.prosysopc.ua.nodes.Mandatory;
import com.prosysopc.ua.nodes.Optional;
import com.prosysopc.ua.nodes.UaProperty;
import com.prosysopc.ua.nodes.UaVariable;
import com.prosysopc.ua.padim.FlowMeasurementVariableType;
import com.prosysopc.ua.part19.server.MultiStateDictionaryEntryDiscreteTypeNode;
import com.prosysopc.ua.server.GeneratedNodeInitializer;
import com.prosysopc.ua.server.NodeManagerUaNode;
import com.prosysopc.ua.stack.builtintypes.LocalizedText;
import com.prosysopc.ua.stack.builtintypes.NodeId;
import com.prosysopc.ua.stack.builtintypes.QualifiedName;
import com.prosysopc.ua.stack.builtintypes.UnsignedInteger;
import java.lang.Float;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;

/**
 * Generated on 2020-10-19 15:11:10
 */
@TypeDefinitionId("nsu=http://opcfoundation.org/UA/PADIM/;i=1122")
public abstract class FlowMeasurementVariableTypeNodeBase extends AnalogSignalVariableTypeNode implements FlowMeasurementVariableType {
  private static GeneratedNodeInitializer<FlowMeasurementVariableTypeNode> flowMeasurementVariableTypeNodeInitializer;

  protected FlowMeasurementVariableTypeNodeBase(NodeManagerUaNode nodeManager, NodeId nodeId,
      QualifiedName browseName, LocalizedText displayName) {
    super(nodeManager, nodeId, browseName, displayName);
  }

  @Override
  public void afterCreate() {
    super.afterCreate();

    // Call afterCreate for each sub-node (if the node has any)
    callAfterCreateIfExists(getFlowDirectionNode());
    GeneratedNodeInitializer<FlowMeasurementVariableTypeNode> impl = getFlowMeasurementVariableTypeNodeInitializer();
    if(impl != null) {
      impl.init((FlowMeasurementVariableTypeNode)this);
    }
  }

  public static GeneratedNodeInitializer<FlowMeasurementVariableTypeNode> getFlowMeasurementVariableTypeNodeInitializer() {
    return flowMeasurementVariableTypeNodeInitializer;
  }

  public static void setFlowMeasurementVariableTypeNodeInitializer(GeneratedNodeInitializer<FlowMeasurementVariableTypeNode> flowMeasurementVariableTypeNodeInitializerNewValue) {
    flowMeasurementVariableTypeNodeInitializer=flowMeasurementVariableTypeNodeInitializerNewValue;
  }

  @Mandatory
  @Override
  public UaProperty getLowFlowCutOffNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/DI/", "LowFlowCutOff");
    return getProperty(browseName);
  }

  @Mandatory
  @Override
  public Float getLowFlowCutOff() {
    UaVariable node = getLowFlowCutOffNode();
    if (node == null) {
      throw new RuntimeException("Mandatory node LowFlowCutOff does not exist");
    }
    Object value = node.getValue().getValue().getValue();
    return (Float) value;
  }

  @Mandatory
  @Override
  public void setLowFlowCutOff(Float value) {
    UaVariable node = getLowFlowCutOffNode();
    if (node == null) {
      throw new RuntimeException("Setting LowFlowCutOff failed: does not exist (Optional Nodes must be configured in NodeBuilder)");
    }
    try {
      node.setValue(value);
    } catch(StatusException e) {
      throw new RuntimeException("Setting LowFlowCutOff failed unexpectedly", e);
    }
  }

  @Optional
  @Override
  public MultiStateDictionaryEntryDiscreteTypeNode getFlowDirectionNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/DI/", "FlowDirection");
    return (MultiStateDictionaryEntryDiscreteTypeNode) getComponent(browseName);
  }

  @Optional
  @Override
  public UnsignedInteger getFlowDirection() {
    UaVariable node = getFlowDirectionNode();
    if (node == null) {
      return null;
    }
    Object value = node.getValue().getValue().getValue();
    return (UnsignedInteger) value;
  }

  @Optional
  @Override
  public void setFlowDirection(UnsignedInteger value) {
    UaVariable node = getFlowDirectionNode();
    if (node == null) {
      throw new RuntimeException("Setting FlowDirection failed: does not exist (Optional Nodes must be configured in NodeBuilder)");
    }
    try {
      node.setValue(value);
    } catch(StatusException e) {
      throw new RuntimeException("Setting FlowDirection failed unexpectedly", e);
    }
  }

  public void setFlowDirection(long value) {
    setFlowDirection(UnsignedInteger.valueOf(value));
  }
}
