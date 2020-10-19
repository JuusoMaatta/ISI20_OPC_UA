package com.prosysopc.ua.padim.server;

import com.prosysopc.ua.StatusException;
import com.prosysopc.ua.TypeDefinitionId;
import com.prosysopc.ua.nodes.Mandatory;
import com.prosysopc.ua.nodes.UaVariable;
import com.prosysopc.ua.padim.DiscreteSignalType;
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
@TypeDefinitionId("nsu=http://opcfoundation.org/UA/PADIM/;i=1036")
public abstract class DiscreteSignalTypeNodeBase extends SignalTypeNode implements DiscreteSignalType {
  private static GeneratedNodeInitializer<DiscreteSignalTypeNode> discreteSignalTypeNodeInitializer;

  protected DiscreteSignalTypeNodeBase(NodeManagerUaNode nodeManager, NodeId nodeId,
      QualifiedName browseName, LocalizedText displayName) {
    super(nodeManager, nodeId, browseName, displayName);
  }

  @Override
  public void afterCreate() {
    super.afterCreate();

    // Call afterCreate for each sub-node (if the node has any)
    callAfterCreateIfExists(getDiscreteSignalNode());
    GeneratedNodeInitializer<DiscreteSignalTypeNode> impl = getDiscreteSignalTypeNodeInitializer();
    if(impl != null) {
      impl.init((DiscreteSignalTypeNode)this);
    }
  }

  public static GeneratedNodeInitializer<DiscreteSignalTypeNode> getDiscreteSignalTypeNodeInitializer() {
    return discreteSignalTypeNodeInitializer;
  }

  public static void setDiscreteSignalTypeNodeInitializer(GeneratedNodeInitializer<DiscreteSignalTypeNode> discreteSignalTypeNodeInitializerNewValue) {
    discreteSignalTypeNodeInitializer=discreteSignalTypeNodeInitializerNewValue;
  }

  @Mandatory
  @Override
  public DiscreteSignalVariableTypeNode getDiscreteSignalNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/DI/", "DiscreteSignal");
    return (DiscreteSignalVariableTypeNode) getComponent(browseName);
  }

  @Mandatory
  @Override
  public Object getDiscreteSignal() {
    UaVariable node = getDiscreteSignalNode();
    if (node == null) {
      throw new RuntimeException("Mandatory node DiscreteSignal does not exist");
    }
    Object value = node.getValue().getValue().getValue();
    return (Object) value;
  }

  @Mandatory
  @Override
  public void setDiscreteSignal(Object value) {
    UaVariable node = getDiscreteSignalNode();
    if (node == null) {
      throw new RuntimeException("Setting DiscreteSignal failed: does not exist (Optional Nodes must be configured in NodeBuilder)");
    }
    try {
      node.setValue(value);
    } catch(StatusException e) {
      throw new RuntimeException("Setting DiscreteSignal failed unexpectedly", e);
    }
  }

  @Override
  public Variant[] callMethod(ServiceContext serviceContext, NodeId methodId,
      Variant[] inputArguments, StatusCode[] inputArgumentResults,
      DiagnosticInfo[] inputArgumentDiagnosticInfos) throws StatusException {
    return super.callMethod(serviceContext, methodId, inputArguments, inputArgumentResults, inputArgumentDiagnosticInfos);
  }
}
