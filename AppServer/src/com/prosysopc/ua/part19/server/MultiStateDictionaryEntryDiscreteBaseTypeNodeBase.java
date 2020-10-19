package com.prosysopc.ua.part19.server;

import com.prosysopc.ua.StatusException;
import com.prosysopc.ua.TypeDefinitionId;
import com.prosysopc.ua.nodes.Mandatory;
import com.prosysopc.ua.nodes.Optional;
import com.prosysopc.ua.nodes.UaProperty;
import com.prosysopc.ua.nodes.UaVariable;
import com.prosysopc.ua.part19.MultiStateDictionaryEntryDiscreteBaseType;
import com.prosysopc.ua.server.GeneratedNodeInitializer;
import com.prosysopc.ua.server.NodeManagerUaNode;
import com.prosysopc.ua.stack.builtintypes.LocalizedText;
import com.prosysopc.ua.stack.builtintypes.NodeId;
import com.prosysopc.ua.stack.builtintypes.QualifiedName;
import com.prosysopc.ua.types.opcua.server.MultiStateValueDiscreteTypeNode;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;

/**
 * Generated on 2020-10-19 15:11:11
 */
@TypeDefinitionId("nsu=http://opcfoundation.org/UA/Part19/;i=19077")
public abstract class MultiStateDictionaryEntryDiscreteBaseTypeNodeBase extends MultiStateValueDiscreteTypeNode implements MultiStateDictionaryEntryDiscreteBaseType {
  private static GeneratedNodeInitializer<MultiStateDictionaryEntryDiscreteBaseTypeNode> multiStateDictionaryEntryDiscreteBaseTypeNodeInitializer;

  protected MultiStateDictionaryEntryDiscreteBaseTypeNodeBase(NodeManagerUaNode nodeManager,
      NodeId nodeId, QualifiedName browseName, LocalizedText displayName) {
    super(nodeManager, nodeId, browseName, displayName);
  }

  @Override
  public void afterCreate() {
    super.afterCreate();

    // Call afterCreate for each sub-node (if the node has any)
    GeneratedNodeInitializer<MultiStateDictionaryEntryDiscreteBaseTypeNode> impl = getMultiStateDictionaryEntryDiscreteBaseTypeNodeInitializer();
    if(impl != null) {
      impl.init((MultiStateDictionaryEntryDiscreteBaseTypeNode)this);
    }
  }

  public static GeneratedNodeInitializer<MultiStateDictionaryEntryDiscreteBaseTypeNode> getMultiStateDictionaryEntryDiscreteBaseTypeNodeInitializer() {
    return multiStateDictionaryEntryDiscreteBaseTypeNodeInitializer;
  }

  public static void setMultiStateDictionaryEntryDiscreteBaseTypeNodeInitializer(GeneratedNodeInitializer<MultiStateDictionaryEntryDiscreteBaseTypeNode> multiStateDictionaryEntryDiscreteBaseTypeNodeInitializerNewValue) {
    multiStateDictionaryEntryDiscreteBaseTypeNodeInitializer=multiStateDictionaryEntryDiscreteBaseTypeNodeInitializerNewValue;
  }

  @Mandatory
  @Override
  public UaProperty getEnumDictionaryEntriesNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/", "EnumDictionaryEntries");
    return getProperty(browseName);
  }

  @Mandatory
  @Override
  public NodeId[][] getEnumDictionaryEntries() {
    UaVariable node = getEnumDictionaryEntriesNode();
    if (node == null) {
      throw new RuntimeException("Mandatory node EnumDictionaryEntries does not exist");
    }
    Object value = node.getValue().getValue().getValue();
    return (NodeId[][]) value;
  }

  @Mandatory
  @Override
  public void setEnumDictionaryEntries(NodeId[][] value) {
    UaVariable node = getEnumDictionaryEntriesNode();
    if (node == null) {
      throw new RuntimeException("Setting EnumDictionaryEntries failed: does not exist (Optional Nodes must be configured in NodeBuilder)");
    }
    try {
      node.setValue(value);
    } catch(StatusException e) {
      throw new RuntimeException("Setting EnumDictionaryEntries failed unexpectedly", e);
    }
  }

  @Optional
  @Override
  public UaProperty getValueAsDictionaryEntriesNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/", "ValueAsDictionaryEntries");
    return getProperty(browseName);
  }

  @Optional
  @Override
  public NodeId[] getValueAsDictionaryEntries() {
    UaVariable node = getValueAsDictionaryEntriesNode();
    if (node == null) {
      return null;
    }
    Object value = node.getValue().getValue().getValue();
    return (NodeId[]) value;
  }

  @Optional
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
