package com.prosysopc.ua.padim.server;

import com.prosysopc.ua.StatusException;
import com.prosysopc.ua.TypeDefinitionId;
import com.prosysopc.ua.nodes.Mandatory;
import com.prosysopc.ua.nodes.Optional;
import com.prosysopc.ua.nodes.UaMethod;
import com.prosysopc.ua.nodes.UaVariable;
import com.prosysopc.ua.padim.AnalogSignalType;
import com.prosysopc.ua.server.GeneratedNodeInitializer;
import com.prosysopc.ua.server.NodeManagerUaNode;
import com.prosysopc.ua.server.ServiceContext;
import com.prosysopc.ua.stack.builtintypes.DiagnosticInfo;
import com.prosysopc.ua.stack.builtintypes.LocalizedText;
import com.prosysopc.ua.stack.builtintypes.NodeId;
import com.prosysopc.ua.stack.builtintypes.QualifiedName;
import com.prosysopc.ua.stack.builtintypes.StatusCode;
import com.prosysopc.ua.stack.builtintypes.Variant;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;

/**
 * Generated on 2020-10-19 15:11:10
 */
@TypeDefinitionId("nsu=http://opcfoundation.org/UA/PADIM/;i=1022")
public abstract class AnalogSignalTypeNodeBase extends SignalTypeNode implements AnalogSignalType {
  private static GeneratedNodeInitializer<AnalogSignalTypeNode> analogSignalTypeNodeInitializer;

  private static AnalogSignalTypeZeroPointAdjustmentMethod zeroPointAdjustmentMethodImplementation;

  protected AnalogSignalTypeNodeBase(NodeManagerUaNode nodeManager, NodeId nodeId,
      QualifiedName browseName, LocalizedText displayName) {
    super(nodeManager, nodeId, browseName, displayName);
  }

  @Override
  public void afterCreate() {
    super.afterCreate();

    // Call afterCreate for each sub-node (if the node has any)
    callAfterCreateIfExists(getAnalogSignalNode());
    GeneratedNodeInitializer<AnalogSignalTypeNode> impl = getAnalogSignalTypeNodeInitializer();
    if(impl != null) {
      impl.init((AnalogSignalTypeNode)this);
    }
  }

  public static GeneratedNodeInitializer<AnalogSignalTypeNode> getAnalogSignalTypeNodeInitializer() {
    return analogSignalTypeNodeInitializer;
  }

  public static void setAnalogSignalTypeNodeInitializer(GeneratedNodeInitializer<AnalogSignalTypeNode> analogSignalTypeNodeInitializerNewValue) {
    analogSignalTypeNodeInitializer=analogSignalTypeNodeInitializerNewValue;
  }

  @Mandatory
  @Override
  public AnalogSignalVariableTypeNode getAnalogSignalNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/DI/", "AnalogSignal");
    return (AnalogSignalVariableTypeNode) getComponent(browseName);
  }

  @Mandatory
  @Override
  public Object getAnalogSignal() {
    UaVariable node = getAnalogSignalNode();
    if (node == null) {
      throw new RuntimeException("Mandatory node AnalogSignal does not exist");
    }
    Object value = node.getValue().getValue().getValue();
    return (Object) value;
  }

  @Mandatory
  @Override
  public void setAnalogSignal(Object value) {
    UaVariable node = getAnalogSignalNode();
    if (node == null) {
      throw new RuntimeException("Setting AnalogSignal failed: does not exist (Optional Nodes must be configured in NodeBuilder)");
    }
    try {
      node.setValue(value);
    } catch(StatusException e) {
      throw new RuntimeException("Setting AnalogSignal failed unexpectedly", e);
    }
  }

  @Override
  public Variant[] callMethod(ServiceContext serviceContext, NodeId methodId,
      Variant[] inputArguments, StatusCode[] inputArgumentResults,
      DiagnosticInfo[] inputArgumentDiagnosticInfos) throws StatusException {
    if (isComponentMatch(getQualifiedName("http://opcfoundation.org/UA/DI/", "ZeroPointAdjustment"), methodId)) {
      doZeroPointAdjustment(serviceContext);
      return null;
    }
    return super.callMethod(serviceContext, methodId, inputArguments, inputArgumentResults, inputArgumentDiagnosticInfos);
  }

  @Optional
  @Override
  public UaMethod getZeroPointAdjustmentNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/DI/", "ZeroPointAdjustment");
    return (UaMethod) getComponent(browseName);
  }

  protected abstract void onZeroPointAdjustment(ServiceContext serviceContext) throws
      StatusException;

  @Override
  public void zeroPointAdjustment() throws StatusException {
    doZeroPointAdjustment(ServiceContext.INTERNAL_OPERATION_CONTEXT);
  }

  private void doZeroPointAdjustment(ServiceContext serviceContext) throws StatusException {
    AnalogSignalTypeZeroPointAdjustmentMethod impl = getZeroPointAdjustmentMethodImplementation();
    if(impl != null) {
      impl.zeroPointAdjustment(serviceContext, (AnalogSignalTypeNode)this);
    } else {
      onZeroPointAdjustment(serviceContext);
    }
  }

  public static AnalogSignalTypeZeroPointAdjustmentMethod getZeroPointAdjustmentMethodImplementation() {
    return zeroPointAdjustmentMethodImplementation;
  }

  public static void setZeroPointAdjustmentMethodImplementation(AnalogSignalTypeZeroPointAdjustmentMethod zeroPointAdjustmentMethodImplementationNewValue) {
    zeroPointAdjustmentMethodImplementation=zeroPointAdjustmentMethodImplementationNewValue;
  }
}
