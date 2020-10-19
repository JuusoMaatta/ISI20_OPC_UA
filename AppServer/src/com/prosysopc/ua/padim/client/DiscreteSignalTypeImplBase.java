package com.prosysopc.ua.padim.client;

import com.prosysopc.ua.StatusException;
import com.prosysopc.ua.TypeDefinitionId;
import com.prosysopc.ua.client.AddressSpace;
import com.prosysopc.ua.nodes.Mandatory;
import com.prosysopc.ua.nodes.UaVariable;
import com.prosysopc.ua.padim.DiscreteSignalType;
import com.prosysopc.ua.padim.DiscreteSignalVariableType;
import com.prosysopc.ua.stack.builtintypes.LocalizedText;
import com.prosysopc.ua.stack.builtintypes.NodeId;
import com.prosysopc.ua.stack.builtintypes.QualifiedName;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;

/**
 * Generated on 2020-10-19 15:11:10
 */
@TypeDefinitionId("nsu=http://opcfoundation.org/UA/PADIM/;i=1036")
public abstract class DiscreteSignalTypeImplBase extends SignalTypeImpl implements DiscreteSignalType {
  protected DiscreteSignalTypeImplBase(AddressSpace addressSpace, NodeId nodeId,
      QualifiedName browseName, LocalizedText displayName) {
    super(addressSpace, nodeId, browseName, displayName);
  }

  @Mandatory
  @Override
  public DiscreteSignalVariableType getDiscreteSignalNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/DI/", "DiscreteSignal");
    return (DiscreteSignalVariableType) getComponent(browseName);
  }

  @Mandatory
  @Override
  public Object getDiscreteSignal() {
    UaVariable node = getDiscreteSignalNode();
    if (node == null) {
      return null;
    }
    Object value = node.getValue().getValue().getValue();
    return (Object) value;
  }

  @Mandatory
  @Override
  public void setDiscreteSignal(Object value) throws StatusException {
    UaVariable node = getDiscreteSignalNode();
    if (node == null) {
      throw new RuntimeException("Setting DiscreteSignal failed, the Optional node does not exist)");
    }
    node.setValue(value);
  }
}
