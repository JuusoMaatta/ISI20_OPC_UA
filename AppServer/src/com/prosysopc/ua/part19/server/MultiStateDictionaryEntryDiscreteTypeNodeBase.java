package com.prosysopc.ua.part19.server;

import com.prosysopc.ua.StatusException;
import com.prosysopc.ua.TypeDefinitionId;
import com.prosysopc.ua.nodes.Mandatory;
import com.prosysopc.ua.nodes.UaProperty;
import com.prosysopc.ua.nodes.UaVariable;
import com.prosysopc.ua.part19.MultiStateDictionaryEntryDiscreteType;
import com.prosysopc.ua.server.GeneratedNodeInitializer;
import com.prosysopc.ua.server.NodeManagerUaNode;
import com.prosysopc.ua.stack.builtintypes.LocalizedText;
import com.prosysopc.ua.stack.builtintypes.NodeId;
import com.prosysopc.ua.stack.builtintypes.QualifiedName;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;

/**
 * Generated on 2020-10-19 15:11:11
 */
@TypeDefinitionId("nsu=http://opcfoundation.org/UA/Part19/;i=19084")
public abstract class MultiStateDictionaryEntryDiscreteTypeNodeBase extends MultiStateDictionaryEntryDiscreteBaseTypeNode implements MultiStateDictionaryEntryDiscreteType {
  private static GeneratedNodeInitializer<MultiStateDictionaryEntryDiscreteTypeNode> multiStateDictionaryEntryDiscreteTypeNodeInitializer;

  protected MultiStateDictionaryEntryDiscreteTypeNodeBase(NodeManagerUaNode nodeManager,
      NodeId nodeId, QualifiedName browseName, LocalizedText displayName) {
    super(nodeManager, nodeId, browseName, displayName);
  }

  @Override
  public void afterCreate() {
    super.afterCreate();

    // Call afterCreate for each sub-node (if the node has any)
    GeneratedNodeInitializer<MultiStateDictionaryEntryDiscreteTypeNode> impl = getMultiStateDictionaryEntryDiscreteTypeNodeInitializer();
    if(impl != null) {
      impl.init((MultiStateDictionaryEntryDiscreteTypeNode)this);
    }
  }

  public static GeneratedNodeInitializer<MultiStateDictionaryEntryDiscreteTypeNode> getMultiStateDictionaryEntryDiscreteTypeNodeInitializer() {
    return multiStateDictionaryEntryDiscreteTypeNodeInitializer;
  }

  public static void setMultiStateDictionaryEntryDiscreteTypeNodeInitializer(GeneratedNodeInitializer<MultiStateDictionaryEntryDiscreteTypeNode> multiStateDictionaryEntryDiscreteTypeNodeInitializerNewValue) {
    multiStateDictionaryEntryDiscreteTypeNodeInitializer=multiStateDictionaryEntryDiscreteTypeNodeInitializerNewValue;
  }

  @Mandatory
  @Override
  public UaProperty getValueAsDictionaryEntriesNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/", "ValueAsDictionaryEntries");
    return getProperty(browseName);
  }

  @Mandatory
  @Override
  public NodeId[] getValueAsDictionaryEntries() {
    UaVariable node = getValueAsDictionaryEntriesNode();
    if (node == null) {
      throw new RuntimeException("Mandatory node ValueAsDictionaryEntries does not exist");
    }
    Object value = node.getValue().getValue().getValue();
    return (NodeId[]) value;
  }

  @Mandatory
  @Override
  public void setValueAsDictionaryEntries(NodeId[] value) {
    UaVariable node = getValueAsDictionaryEntriesNode();
    if (node == null) {
      throw new RuntimeException("Setting ValueAsDictionaryEntries failed: does not exist (Optional Nodes must be configured in NodeBuilder)");
    }
    try {
      node.setValue(value);
    } catch(StatusException e) {
      throw new RuntimeException("Setting ValueAsDictionaryEntries failed unexpectedly", e);
    }
  }
}
