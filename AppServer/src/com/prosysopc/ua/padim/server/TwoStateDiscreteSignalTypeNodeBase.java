package com.prosysopc.ua.padim.server;

import com.prosysopc.ua.StatusException;
import com.prosysopc.ua.TypeDefinitionId;
import com.prosysopc.ua.nodes.Mandatory;
import com.prosysopc.ua.nodes.UaVariable;
import com.prosysopc.ua.padim.TwoStateDiscreteSignalType;
import com.prosysopc.ua.server.GeneratedNodeInitializer;
import com.prosysopc.ua.server.NodeManagerUaNode;
import com.prosysopc.ua.server.ServiceContext;
import com.prosysopc.ua.stack.builtintypes.DiagnosticInfo;
import com.prosysopc.ua.stack.builtintypes.LocalizedText;
import com.prosysopc.ua.stack.builtintypes.NodeId;
import com.prosysopc.ua.stack.builtintypes.QualifiedName;
import com.prosysopc.ua.stack.builtintypes.StatusCode;
import com.prosysopc.ua.stack.builtintypes.Variant;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;

/**
 * Generated on 2020-10-19 15:11:10
 */
@TypeDefinitionId("nsu=http://opcfoundation.org/UA/PADIM/;i=1037")
public abstract class TwoStateDiscreteSignalTypeNodeBase extends SignalTypeNode implements TwoStateDiscreteSignalType {
  private static GeneratedNodeInitializer<TwoStateDiscreteSignalTypeNode> twoStateDiscreteSignalTypeNodeInitializer;

  protected TwoStateDiscreteSignalTypeNodeBase(NodeManagerUaNode nodeManager, NodeId nodeId,
      QualifiedName browseName, LocalizedText displayName) {
    super(nodeManager, nodeId, browseName, displayName);
  }

  @Override
  public void afterCreate() {
    super.afterCreate();

    // Call afterCreate for each sub-node (if the node has any)
    callAfterCreateIfExists(getTwoStateDiscreteSignalNode());
    GeneratedNodeInitializer<TwoStateDiscreteSignalTypeNode> impl = getTwoStateDiscreteSignalTypeNodeInitializer();
    if(impl != null) {
      impl.init((TwoStateDiscreteSignalTypeNode)this);
    }
  }

  public static GeneratedNodeInitializer<TwoStateDiscreteSignalTypeNode> getTwoStateDiscreteSignalTypeNodeInitializer() {
    return twoStateDiscreteSignalTypeNodeInitializer;
  }

  public static void setTwoStateDiscreteSignalTypeNodeInitializer(GeneratedNodeInitializer<TwoStateDiscreteSignalTypeNode> twoStateDiscreteSignalTypeNodeInitializerNewValue) {
    twoStateDiscreteSignalTypeNodeInitializer=twoStateDiscreteSignalTypeNodeInitializerNewValue;
  }

  @Mandatory
  @Override
  public TwoStateDiscreteSignalVariableTypeNode getTwoStateDiscreteSignalNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/DI/", "TwoStateDiscreteSignal");
    return (TwoStateDiscreteSignalVariableTypeNode) getComponent(browseName);
  }

  @Mandatory
  @Override
  public Boolean isTwoStateDiscreteSignal() {
    UaVariable node = getTwoStateDiscreteSignalNode();
    if (node == null) {
      throw new RuntimeException("Mandatory node TwoStateDiscreteSignal does not exist");
    }
    Object value = node.getValue().getValue().getValue();
    return (Boolean) value;
  }

  @Mandatory
  @Override
  public void setTwoStateDiscreteSignal(Boolean value) {
    UaVariable node = getTwoStateDiscreteSignalNode();
    if (node == null) {
      throw new RuntimeException("Setting TwoStateDiscreteSignal failed: does not exist (Optional Nodes must be configured in NodeBuilder)");
    }
    try {
      node.setValue(value);
    } catch(StatusException e) {
      throw new RuntimeException("Setting TwoStateDiscreteSignal failed unexpectedly", e);
    }
  }

  @Override
  public Variant[] callMethod(ServiceContext serviceContext, NodeId methodId,
      Variant[] inputArguments, StatusCode[] inputArgumentResults,
      DiagnosticInfo[] inputArgumentDiagnosticInfos) throws StatusException {
    return super.callMethod(serviceContext, methodId, inputArguments, inputArgumentResults, inputArgumentDiagnosticInfos);
  }
}
