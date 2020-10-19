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
import com.prosysopc.ua.padim.ControlSignalType;
import com.prosysopc.ua.padim.ControlVariableType;
import com.prosysopc.ua.padim.ExecutionModeEnum;
import com.prosysopc.ua.stack.builtintypes.LocalizedText;
import com.prosysopc.ua.stack.builtintypes.NodeId;
import com.prosysopc.ua.stack.builtintypes.QualifiedName;
import com.prosysopc.ua.stack.builtintypes.Variant;
import com.prosysopc.ua.stack.transport.AsyncResult;
import java.lang.Float;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.Void;

/**
 * Generated on 2020-10-19 15:11:10
 */
@TypeDefinitionId("nsu=http://opcfoundation.org/UA/PADIM/;i=1023")
public abstract class ControlSignalTypeImplBase extends SignalTypeImpl implements ControlSignalType {
  protected ControlSignalTypeImplBase(AddressSpace addressSpace, NodeId nodeId,
      QualifiedName browseName, LocalizedText displayName) {
    super(addressSpace, nodeId, browseName, displayName);
  }

  @Mandatory
  @Override
  public ControlVariableType getControlSignalNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/DI/", "ControlSignal");
    return (ControlVariableType) getComponent(browseName);
  }

  @Mandatory
  @Override
  public Float getControlSignal() {
    UaVariable node = getControlSignalNode();
    if (node == null) {
      return null;
    }
    Object value = node.getValue().getValue().getValue();
    return (Float) value;
  }

  @Mandatory
  @Override
  public void setControlSignal(Float value) throws StatusException {
    UaVariable node = getControlSignalNode();
    if (node == null) {
      throw new RuntimeException("Setting ControlSignal failed, the Optional node does not exist)");
    }
    node.setValue(value);
  }

  @Optional
  @Override
  public UaMethod getAutoAdjustPositionerNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/DI/", "AutoAdjustPositioner");
    return (UaMethod) getComponent(browseName);
  }

  @Override
  public void autoAdjustPositioner(ExecutionModeEnum executionMode) throws
      MethodCallStatusException, ServiceException {
    NodeId methodId = getComponentId(getQualifiedName("http://opcfoundation.org/UA/DI/", "AutoAdjustPositioner"));
    call(methodId, (Object)executionMode);
  }

  public AsyncResult<Void> autoAdjustPositionerAsync(ExecutionModeEnum executionMode) {
    NodeId methodId = getComponentId(getQualifiedName("http://opcfoundation.org/UA/DI/", "AutoAdjustPositioner"));
    return callAsync(methodId, new MethodArgumentTransformer<Void>() {
      @Override
      public Void fromVariantArray(Variant[] values) {
        return null;
      }
    }, (Object)executionMode);
  }
}
