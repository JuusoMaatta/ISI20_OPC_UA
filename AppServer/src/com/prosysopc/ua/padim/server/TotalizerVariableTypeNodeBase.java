package com.prosysopc.ua.padim.server;

import com.prosysopc.ua.StatusException;
import com.prosysopc.ua.TypeDefinitionId;
import com.prosysopc.ua.nodes.Mandatory;
import com.prosysopc.ua.nodes.UaProperty;
import com.prosysopc.ua.nodes.UaVariable;
import com.prosysopc.ua.padim.TotalizerVariableType;
import com.prosysopc.ua.server.GeneratedNodeInitializer;
import com.prosysopc.ua.server.NodeManagerUaNode;
import com.prosysopc.ua.stack.builtintypes.LocalizedText;
import com.prosysopc.ua.stack.builtintypes.NodeId;
import com.prosysopc.ua.stack.builtintypes.QualifiedName;
import java.lang.Float;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;

/**
 * Generated on 2020-10-19 15:11:10
 */
@TypeDefinitionId("nsu=http://opcfoundation.org/UA/PADIM/;i=1126")
public abstract class TotalizerVariableTypeNodeBase extends AnalogSignalVariableTypeNode implements TotalizerVariableType {
  private static GeneratedNodeInitializer<TotalizerVariableTypeNode> totalizerVariableTypeNodeInitializer;

  protected TotalizerVariableTypeNodeBase(NodeManagerUaNode nodeManager, NodeId nodeId,
      QualifiedName browseName, LocalizedText displayName) {
    super(nodeManager, nodeId, browseName, displayName);
  }

  @Override
  public void afterCreate() {
    super.afterCreate();

    // Call afterCreate for each sub-node (if the node has any)
    GeneratedNodeInitializer<TotalizerVariableTypeNode> impl = getTotalizerVariableTypeNodeInitializer();
    if(impl != null) {
      impl.init((TotalizerVariableTypeNode)this);
    }
  }

  public static GeneratedNodeInitializer<TotalizerVariableTypeNode> getTotalizerVariableTypeNodeInitializer() {
    return totalizerVariableTypeNodeInitializer;
  }

  public static void setTotalizerVariableTypeNodeInitializer(GeneratedNodeInitializer<TotalizerVariableTypeNode> totalizerVariableTypeNodeInitializerNewValue) {
    totalizerVariableTypeNodeInitializer=totalizerVariableTypeNodeInitializerNewValue;
  }

  @Mandatory
  @Override
  public UaProperty getPulseValueNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/DI/", "PulseValue");
    return getProperty(browseName);
  }

  @Mandatory
  @Override
  public Object getPulseValue() {
    UaVariable node = getPulseValueNode();
    if (node == null) {
      throw new RuntimeException("Mandatory node PulseValue does not exist");
    }
    Object value = node.getValue().getValue().getValue();
    return (Object) value;
  }

  @Mandatory
  @Override
  public void setPulseValue(Object value) {
    UaVariable node = getPulseValueNode();
    if (node == null) {
      throw new RuntimeException("Setting PulseValue failed: does not exist (Optional Nodes must be configured in NodeBuilder)");
    }
    try {
      node.setValue(value);
    } catch(StatusException e) {
      throw new RuntimeException("Setting PulseValue failed unexpectedly", e);
    }
  }

  @Mandatory
  @Override
  public UaProperty getPulseWidthNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/DI/", "PulseWidth");
    return getProperty(browseName);
  }

  @Mandatory
  @Override
  public Float getPulseWidth() {
    UaVariable node = getPulseWidthNode();
    if (node == null) {
      throw new RuntimeException("Mandatory node PulseWidth does not exist");
    }
    Object value = node.getValue().getValue().getValue();
    return (Float) value;
  }

  @Mandatory
  @Override
  public void setPulseWidth(Float value) {
    UaVariable node = getPulseWidthNode();
    if (node == null) {
      throw new RuntimeException("Setting PulseWidth failed: does not exist (Optional Nodes must be configured in NodeBuilder)");
    }
    try {
      node.setValue(value);
    } catch(StatusException e) {
      throw new RuntimeException("Setting PulseWidth failed unexpectedly", e);
    }
  }
}
