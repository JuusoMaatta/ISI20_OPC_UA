package com.prosysopc.ua.padim.client;

import com.prosysopc.ua.StatusException;
import com.prosysopc.ua.TypeDefinitionId;
import com.prosysopc.ua.client.AddressSpace;
import com.prosysopc.ua.nodes.Mandatory;
import com.prosysopc.ua.nodes.UaProperty;
import com.prosysopc.ua.nodes.UaVariable;
import com.prosysopc.ua.padim.SignalType;
import com.prosysopc.ua.stack.builtintypes.LocalizedText;
import com.prosysopc.ua.stack.builtintypes.NodeId;
import com.prosysopc.ua.stack.builtintypes.QualifiedName;
import com.prosysopc.ua.types.opcua.client.BaseObjectTypeImpl;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;

/**
 * Generated on 2020-10-19 15:11:10
 */
@TypeDefinitionId("nsu=http://opcfoundation.org/UA/PADIM/;i=1008")
public abstract class SignalTypeImplBase extends BaseObjectTypeImpl implements SignalType {
  protected SignalTypeImplBase(AddressSpace addressSpace, NodeId nodeId, QualifiedName browseName,
      LocalizedText displayName) {
    super(addressSpace, nodeId, browseName, displayName);
  }

  @Mandatory
  @Override
  public UaProperty getSignalTagNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/DI/", "SignalTag");
    return getProperty(browseName);
  }

  @Mandatory
  @Override
  public String getSignalTag() {
    UaVariable node = getSignalTagNode();
    if (node == null) {
      return null;
    }
    Object value = node.getValue().getValue().getValue();
    return (String) value;
  }

  @Mandatory
  @Override
  public void setSignalTag(String value) throws StatusException {
    UaVariable node = getSignalTagNode();
    if (node == null) {
      throw new RuntimeException("Setting SignalTag failed, the Optional node does not exist)");
    }
    node.setValue(value);
  }
}
