package com.prosysopc.ua.padim.client;

import com.prosysopc.ua.StatusException;
import com.prosysopc.ua.TypeDefinitionId;
import com.prosysopc.ua.client.AddressSpace;
import com.prosysopc.ua.nodes.Mandatory;
import com.prosysopc.ua.nodes.UaVariable;
import com.prosysopc.ua.padim.MultiStateDiscreteSignalType;
import com.prosysopc.ua.padim.MultiStateDiscreteSignalVariableType;
import com.prosysopc.ua.stack.builtintypes.LocalizedText;
import com.prosysopc.ua.stack.builtintypes.NodeId;
import com.prosysopc.ua.stack.builtintypes.QualifiedName;
import com.prosysopc.ua.stack.builtintypes.UnsignedInteger;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;

/**
 * Generated on 2020-10-19 15:11:10
 */
@TypeDefinitionId("nsu=http://opcfoundation.org/UA/PADIM/;i=1038")
public abstract class MultiStateDiscreteSignalTypeImplBase extends SignalTypeImpl implements MultiStateDiscreteSignalType {
  protected MultiStateDiscreteSignalTypeImplBase(AddressSpace addressSpace, NodeId nodeId,
      QualifiedName browseName, LocalizedText displayName) {
    super(addressSpace, nodeId, browseName, displayName);
  }

  @Mandatory
  @Override
  public MultiStateDiscreteSignalVariableType getMultiStateDiscreteSignalNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/DI/", "MultiStateDiscreteSignal");
    return (MultiStateDiscreteSignalVariableType) getComponent(browseName);
  }

  @Mandatory
  @Override
  public UnsignedInteger getMultiStateDiscreteSignal() {
    UaVariable node = getMultiStateDiscreteSignalNode();
    if (node == null) {
      return null;
    }
    Object value = node.getValue().getValue().getValue();
    return (UnsignedInteger) value;
  }

  @Mandatory
  @Override
  public void setMultiStateDiscreteSignal(UnsignedInteger value) throws StatusException {
    UaVariable node = getMultiStateDiscreteSignalNode();
    if (node == null) {
      throw new RuntimeException("Setting MultiStateDiscreteSignal failed, the Optional node does not exist)");
    }
    node.setValue(value);
  }
}
