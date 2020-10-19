package com.prosysopc.ua.padim.client;

import com.prosysopc.ua.StatusException;
import com.prosysopc.ua.TypeDefinitionId;
import com.prosysopc.ua.client.AddressSpace;
import com.prosysopc.ua.nodes.Mandatory;
import com.prosysopc.ua.nodes.UaProperty;
import com.prosysopc.ua.nodes.UaVariable;
import com.prosysopc.ua.padim.TotalizerVariableType;
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
public abstract class TotalizerVariableTypeImplBase extends AnalogSignalVariableTypeImpl implements TotalizerVariableType {
  protected TotalizerVariableTypeImplBase(AddressSpace addressSpace, NodeId nodeId,
      QualifiedName browseName, LocalizedText displayName) {
    super(addressSpace, nodeId, browseName, displayName);
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
      return null;
    }
    Object value = node.getValue().getValue().getValue();
    return (Object) value;
  }

  @Mandatory
  @Override
  public void setPulseValue(Object value) throws StatusException {
    UaVariable node = getPulseValueNode();
    if (node == null) {
      throw new RuntimeException("Setting PulseValue failed, the Optional node does not exist)");
    }
    node.setValue(value);
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
      return null;
    }
    Object value = node.getValue().getValue().getValue();
    return (Float) value;
  }

  @Mandatory
  @Override
  public void setPulseWidth(Float value) throws StatusException {
    UaVariable node = getPulseWidthNode();
    if (node == null) {
      throw new RuntimeException("Setting PulseWidth failed, the Optional node does not exist)");
    }
    node.setValue(value);
  }
}
