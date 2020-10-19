package com.prosysopc.ua.padim.server;

import com.prosysopc.ua.StatusException;
import com.prosysopc.ua.TypeDefinitionId;
import com.prosysopc.ua.nodes.Mandatory;
import com.prosysopc.ua.nodes.Optional;
import com.prosysopc.ua.nodes.UaMethod;
import com.prosysopc.ua.nodes.UaVariable;
import com.prosysopc.ua.padim.ControlSignalType;
import com.prosysopc.ua.padim.ExecutionModeEnum;
import com.prosysopc.ua.server.GeneratedNodeInitializer;
import com.prosysopc.ua.server.NodeManagerUaNode;
import com.prosysopc.ua.server.ServiceContext;
import com.prosysopc.ua.stack.builtintypes.DiagnosticInfo;
import com.prosysopc.ua.stack.builtintypes.LocalizedText;
import com.prosysopc.ua.stack.builtintypes.NodeId;
import com.prosysopc.ua.stack.builtintypes.QualifiedName;
import com.prosysopc.ua.stack.builtintypes.StatusCode;
import com.prosysopc.ua.stack.builtintypes.Variant;
import java.lang.Float;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;

/**
 * Generated on 2020-10-19 15:11:10
 */
@TypeDefinitionId("nsu=http://opcfoundation.org/UA/PADIM/;i=1023")
public abstract class ControlSignalTypeNodeBase extends SignalTypeNode implements ControlSignalType {
  private static GeneratedNodeInitializer<ControlSignalTypeNode> controlSignalTypeNodeInitializer;

  private static ControlSignalTypeAutoAdjustPositionerMethod autoAdjustPositionerMethodImplementation;

  protected ControlSignalTypeNodeBase(NodeManagerUaNode nodeManager, NodeId nodeId,
      QualifiedName browseName, LocalizedText displayName) {
    super(nodeManager, nodeId, browseName, displayName);
  }

  @Override
  public void afterCreate() {
    super.afterCreate();

    // Call afterCreate for each sub-node (if the node has any)
    callAfterCreateIfExists(getControlSignalNode());
    GeneratedNodeInitializer<ControlSignalTypeNode> impl = getControlSignalTypeNodeInitializer();
    if(impl != null) {
      impl.init((ControlSignalTypeNode)this);
    }
  }

  public static GeneratedNodeInitializer<ControlSignalTypeNode> getControlSignalTypeNodeInitializer() {
    return controlSignalTypeNodeInitializer;
  }

  public static void setControlSignalTypeNodeInitializer(GeneratedNodeInitializer<ControlSignalTypeNode> controlSignalTypeNodeInitializerNewValue) {
    controlSignalTypeNodeInitializer=controlSignalTypeNodeInitializerNewValue;
  }

  @Mandatory
  @Override
  public ControlVariableTypeNode getControlSignalNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/DI/", "ControlSignal");
    return (ControlVariableTypeNode) getComponent(browseName);
  }

  @Mandatory
  @Override
  public Float getControlSignal() {
    UaVariable node = getControlSignalNode();
    if (node == null) {
      throw new RuntimeException("Mandatory node ControlSignal does not exist");
    }
    Object value = node.getValue().getValue().getValue();
    return (Float) value;
  }

  @Mandatory
  @Override
  public void setControlSignal(Float value) {
    UaVariable node = getControlSignalNode();
    if (node == null) {
      throw new RuntimeException("Setting ControlSignal failed: does not exist (Optional Nodes must be configured in NodeBuilder)");
    }
    try {
      node.setValue(value);
    } catch(StatusException e) {
      throw new RuntimeException("Setting ControlSignal failed unexpectedly", e);
    }
  }

  @Override
  public Variant[] callMethod(ServiceContext serviceContext, NodeId methodId,
      Variant[] inputArguments, StatusCode[] inputArgumentResults,
      DiagnosticInfo[] inputArgumentDiagnosticInfos) throws StatusException {
    if (isComponentMatch(getQualifiedName("http://opcfoundation.org/UA/DI/", "AutoAdjustPositioner"), methodId)) {
      doAutoAdjustPositioner(serviceContext, (ExecutionModeEnum) inputArguments[0].asEnum(ExecutionModeEnum.class));
      return null;
    }
    return super.callMethod(serviceContext, methodId, inputArguments, inputArgumentResults, inputArgumentDiagnosticInfos);
  }

  @Optional
  @Override
  public UaMethod getAutoAdjustPositionerNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/DI/", "AutoAdjustPositioner");
    return (UaMethod) getComponent(browseName);
  }

  protected abstract void onAutoAdjustPositioner(ServiceContext serviceContext,
      ExecutionModeEnum executionMode) throws StatusException;

  @Override
  public void autoAdjustPositioner(ExecutionModeEnum executionMode) throws StatusException {
    doAutoAdjustPositioner(ServiceContext.INTERNAL_OPERATION_CONTEXT, executionMode);
  }

  private void doAutoAdjustPositioner(ServiceContext serviceContext,
      ExecutionModeEnum executionMode) throws StatusException {
    ControlSignalTypeAutoAdjustPositionerMethod impl = getAutoAdjustPositionerMethodImplementation();
    if(impl != null) {
      impl.autoAdjustPositioner(serviceContext, (ControlSignalTypeNode)this, executionMode);
    } else {
      onAutoAdjustPositioner(serviceContext, executionMode);
    }
  }

  public static ControlSignalTypeAutoAdjustPositionerMethod getAutoAdjustPositionerMethodImplementation() {
    return autoAdjustPositionerMethodImplementation;
  }

  public static void setAutoAdjustPositionerMethodImplementation(ControlSignalTypeAutoAdjustPositionerMethod autoAdjustPositionerMethodImplementationNewValue) {
    autoAdjustPositionerMethodImplementation=autoAdjustPositionerMethodImplementationNewValue;
  }
}
