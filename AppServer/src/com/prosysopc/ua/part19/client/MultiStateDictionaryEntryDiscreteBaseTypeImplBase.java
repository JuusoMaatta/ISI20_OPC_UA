package com.prosysopc.ua.part19.client;

import com.prosysopc.ua.StatusException;
import com.prosysopc.ua.TypeDefinitionId;
import com.prosysopc.ua.client.AddressSpace;
import com.prosysopc.ua.nodes.Mandatory;
import com.prosysopc.ua.nodes.Optional;
import com.prosysopc.ua.nodes.UaProperty;
import com.prosysopc.ua.nodes.UaVariable;
import com.prosysopc.ua.part19.MultiStateDictionaryEntryDiscreteBaseType;
import com.prosysopc.ua.stack.builtintypes.LocalizedText;
import com.prosysopc.ua.stack.builtintypes.NodeId;
import com.prosysopc.ua.stack.builtintypes.QualifiedName;
import com.prosysopc.ua.types.opcua.client.MultiStateValueDiscreteTypeImpl;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;

/**
 * Generated on 2020-10-19 15:11:11
 */
@TypeDefinitionId("nsu=http://opcfoundation.org/UA/Part19/;i=19077")
public abstract class MultiStateDictionaryEntryDiscreteBaseTypeImplBase extends MultiStateValueDiscreteTypeImpl implements MultiStateDictionaryEntryDiscreteBaseType {
  protected MultiStateDictionaryEntryDiscreteBaseTypeImplBase(AddressSpace addressSpace,
      NodeId nodeId, QualifiedName browseName, LocalizedText displayName) {
    super(addressSpace, nodeId, browseName, displayName);
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
      return null;
    }
    Object value = node.getValue().getValue().getValue();
    return (NodeId[][]) value;
  }

  @Mandatory
  @Override
  public void setEnumDictionaryEntries(NodeId[][] value) throws StatusException {
    UaVariable node = getEnumDictionaryEntriesNode();
    if (node == null) {
      throw new RuntimeException("Setting EnumDictionaryEntries failed, the Optional node does not exist)");
    }
    node.setValue(value);
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
  public void setValueAsDictionaryEntries(NodeId[] value) throws StatusException {
    UaVariable node = getValueAsDictionaryEntriesNode();
    if (node == null) {
      throw new RuntimeException("Setting ValueAsDictionaryEntries failed, the Optional node does not exist)");
    }
    node.setValue(value);
  }
}
