package com.prosysopc.ua.padim.client;

import com.prosysopc.ua.StatusException;
import com.prosysopc.ua.TypeDefinitionId;
import com.prosysopc.ua.client.AddressSpace;
import com.prosysopc.ua.nodes.Mandatory;
import com.prosysopc.ua.nodes.Optional;
import com.prosysopc.ua.nodes.UaProperty;
import com.prosysopc.ua.nodes.UaVariable;
import com.prosysopc.ua.padim.FlowMeasurementVariableType;
import com.prosysopc.ua.part19.MultiStateDictionaryEntryDiscreteType;
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
public abstract class FlowMeasurementVariableTypeImplBase extends AnalogSignalVariableTypeImpl implements FlowMeasurementVariableType {
  protected FlowMeasurementVariableTypeImplBase(AddressSpace addressSpace, NodeId nodeId,
      QualifiedName browseName, LocalizedText displayName) {
    super(addressSpace, nodeId, browseName, displayName);
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
      return null;
    }
    Object value = node.getValue().getValue().getValue();
    return (Float) value;
  }

  @Mandatory
  @Override
  public void setLowFlowCutOff(Float value) throws StatusException {
    UaVariable node = getLowFlowCutOffNode();
    if (node == null) {
      throw new RuntimeException("Setting LowFlowCutOff failed, the Optional node does not exist)");
    }
    node.setValue(value);
  }

  @Optional
  @Override
  public MultiStateDictionaryEntryDiscreteType getFlowDirectionNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/DI/", "FlowDirection");
    return (MultiStateDictionaryEntryDiscreteType) getComponent(browseName);
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
  public void setFlowDirection(UnsignedInteger value) throws StatusException {
    UaVariable node = getFlowDirectionNode();
    if (node == null) {
      throw new RuntimeException("Setting FlowDirection failed, the Optional node does not exist)");
    }
    node.setValue(value);
  }
}
