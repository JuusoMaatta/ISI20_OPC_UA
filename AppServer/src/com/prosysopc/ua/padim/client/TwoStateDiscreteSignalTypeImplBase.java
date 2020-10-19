package com.prosysopc.ua.padim.client;

import com.prosysopc.ua.StatusException;
import com.prosysopc.ua.TypeDefinitionId;
import com.prosysopc.ua.client.AddressSpace;
import com.prosysopc.ua.nodes.Mandatory;
import com.prosysopc.ua.nodes.UaVariable;
import com.prosysopc.ua.padim.TwoStateDiscreteSignalType;
import com.prosysopc.ua.padim.TwoStateDiscreteSignalVariableType;
import com.prosysopc.ua.stack.builtintypes.LocalizedText;
import com.prosysopc.ua.stack.builtintypes.NodeId;
import com.prosysopc.ua.stack.builtintypes.QualifiedName;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;

/**
 * Generated on 2020-10-19 15:11:10
 */
@TypeDefinitionId("nsu=http://opcfoundation.org/UA/PADIM/;i=1037")
public abstract class TwoStateDiscreteSignalTypeImplBase extends SignalTypeImpl implements TwoStateDiscreteSignalType {
  protected TwoStateDiscreteSignalTypeImplBase(AddressSpace addressSpace, NodeId nodeId,
      QualifiedName browseName, LocalizedText displayName) {
    super(addressSpace, nodeId, browseName, displayName);
  }

  @Mandatory
  @Override
  public TwoStateDiscreteSignalVariableType getTwoStateDiscreteSignalNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/DI/", "TwoStateDiscreteSignal");
    return (TwoStateDiscreteSignalVariableType) getComponent(browseName);
  }

  @Mandatory
  @Override
  public Boolean isTwoStateDiscreteSignal() {
    UaVariable node = getTwoStateDiscreteSignalNode();
    if (node == null) {
      return null;
    }
    Object value = node.getValue().getValue().getValue();
    return (Boolean) value;
  }

  @Mandatory
  @Override
  public void setTwoStateDiscreteSignal(Boolean value) throws StatusException {
    UaVariable node = getTwoStateDiscreteSignalNode();
    if (node == null) {
      throw new RuntimeException("Setting TwoStateDiscreteSignal failed, the Optional node does not exist)");
    }
    node.setValue(value);
  }
}
