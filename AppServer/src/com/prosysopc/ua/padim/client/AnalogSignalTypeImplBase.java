package com.prosysopc.ua.padim.client;

import com.prosysopc.ua.MethodArgumentTransformer;
import com.prosysopc.ua.MethodCallStatusException;
import com.prosysopc.ua.ServiceException;
import com.prosysopc.ua.StatusException;
import com.prosysopc.ua.TypeDefinitionId;
import com.prosysopc.ua.client.AddressSpace;
import com.prosysopc.ua.nodes.Mandatory;
import com.prosysopc.ua.nodes.Optional;
import com.prosysopc.ua.nodes.UaMethod;
import com.prosysopc.ua.nodes.UaVariable;
import com.prosysopc.ua.padim.AnalogSignalType;
import com.prosysopc.ua.padim.AnalogSignalVariableType;
import com.prosysopc.ua.stack.builtintypes.LocalizedText;
import com.prosysopc.ua.stack.builtintypes.NodeId;
import com.prosysopc.ua.stack.builtintypes.QualifiedName;
import com.prosysopc.ua.stack.builtintypes.Variant;
import com.prosysopc.ua.stack.transport.AsyncResult;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.Void;

/**
 * Generated on 2020-10-19 15:11:10
 */
@TypeDefinitionId("nsu=http://opcfoundation.org/UA/PADIM/;i=1022")
public abstract class AnalogSignalTypeImplBase extends SignalTypeImpl implements AnalogSignalType {
  protected AnalogSignalTypeImplBase(AddressSpace addressSpace, NodeId nodeId,
      QualifiedName browseName, LocalizedText displayName) {
    super(addressSpace, nodeId, browseName, displayName);
  }

  @Mandatory
  @Override
  public AnalogSignalVariableType getAnalogSignalNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/DI/", "AnalogSignal");
    return (AnalogSignalVariableType) getComponent(browseName);
  }

  @Mandatory
  @Override
  public Object getAnalogSignal() {
    UaVariable node = getAnalogSignalNode();
    if (node == null) {
      return null;
    }
    Object value = node.getValue().getValue().getValue();
    return (Object) value;
  }

  @Mandatory
  @Override
  public void setAnalogSignal(Object value) throws StatusException {
    UaVariable node = getAnalogSignalNode();
    if (node == null) {
      throw new RuntimeException("Setting AnalogSignal failed, the Optional node does not exist)");
    }
    node.setValue(value);
  }

  @Optional
  @Override
  public UaMethod getZeroPointAdjustmentNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/DI/", "ZeroPointAdjustment");
    return (UaMethod) getComponent(browseName);
  }

  @Override
  public void zeroPointAdjustment() throws MethodCallStatusException, ServiceException {
    NodeId methodId = getComponentId(getQualifiedName("http://opcfoundation.org/UA/DI/", "ZeroPointAdjustment"));
    call(methodId);
  }

  public AsyncResult<Void> zeroPointAdjustmentAsync() {
    NodeId methodId = getComponentId(getQualifiedName("http://opcfoundation.org/UA/DI/", "ZeroPointAdjustment"));
    return callAsync(methodId, new MethodArgumentTransformer<Void>() {
      @Override
      public Void fromVariantArray(Variant[] values) {
        return null;
      }
    });
  }
}
