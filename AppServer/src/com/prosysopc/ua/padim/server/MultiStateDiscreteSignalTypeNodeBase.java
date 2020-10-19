package com.prosysopc.ua.padim.server;

import com.prosysopc.ua.StatusException;
import com.prosysopc.ua.TypeDefinitionId;
import com.prosysopc.ua.nodes.Mandatory;
import com.prosysopc.ua.nodes.UaVariable;
import com.prosysopc.ua.padim.MultiStateDiscreteSignalType;
import com.prosysopc.ua.server.GeneratedNodeInitializer;
import com.prosysopc.ua.server.NodeManagerUaNode;
import com.prosysopc.ua.server.ServiceContext;
import com.prosysopc.ua.stack.builtintypes.DiagnosticInfo;
import com.prosysopc.ua.stack.builtintypes.LocalizedText;
import com.prosysopc.ua.stack.builtintypes.NodeId;
import com.prosysopc.ua.stack.builtintypes.QualifiedName;
import com.prosysopc.ua.stack.builtintypes.StatusCode;
import com.prosysopc.ua.stack.builtintypes.UnsignedInteger;
import com.prosysopc.ua.stack.builtintypes.Variant;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;

/**
 * Generated on 2020-10-19 15:11:10
 */
@TypeDefinitionId("nsu=http://opcfoundation.org/UA/PADIM/;i=1038")
public abstract class MultiStateDiscreteSignalTypeNodeBase extends SignalTypeNode implements MultiStateDiscreteSignalType {
  private static GeneratedNodeInitializer<MultiStateDiscreteSignalTypeNode> multiStateDiscreteSignalTypeNodeInitializer;

  protected MultiStateDiscreteSignalTypeNodeBase(NodeManagerUaNode nodeManager, NodeId nodeId,
      QualifiedName browseName, LocalizedText displayName) {
    super(nodeManager, nodeId, browseName, displayName);
  }

  @Override
  public void afterCreate() {
    super.afterCreate();

    // Call afterCreate for each sub-node (if the node has any)
    callAfterCreateIfExists(getMultiStateDiscreteSignalNode());
    GeneratedNodeInitializer<MultiStateDiscreteSignalTypeNode> impl = getMultiStateDiscreteSignalTypeNodeInitializer();
    if(impl != null) {
      impl.init((MultiStateDiscreteSignalTypeNode)this);
    }
  }

  public static GeneratedNodeInitializer<MultiStateDiscreteSignalTypeNode> getMultiStateDiscreteSignalTypeNodeInitializer() {
    return multiStateDiscreteSignalTypeNodeInitializer;
  }

  public static void setMultiStateDiscreteSignalTypeNodeInitializer(GeneratedNodeInitializer<MultiStateDiscreteSignalTypeNode> multiStateDiscreteSignalTypeNodeInitializerNewValue) {
    multiStateDiscreteSignalTypeNodeInitializer=multiStateDiscreteSignalTypeNodeInitializerNewValue;
  }

  @Mandatory
  @Override
  public MultiStateDiscreteSignalVariableTypeNode getMultiStateDiscreteSignalNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/DI/", "MultiStateDiscreteSignal");
    return (MultiStateDiscreteSignalVariableTypeNode) getComponent(browseName);
  }

  @Mandatory
  @Override
  public UnsignedInteger getMultiStateDiscreteSignal() {
    UaVariable node = getMultiStateDiscreteSignalNode();
    if (node == null) {
      throw new RuntimeException("Mandatory node MultiStateDiscreteSignal does not exist");
    }
    Object value = node.getValue().getValue().getValue();
    return (UnsignedInteger) value;
  }

  @Mandatory
  @Override
  public void setMultiStateDiscreteSignal(UnsignedInteger value) {
    UaVariable node = getMultiStateDiscreteSignalNode();
    if (node == null) {
      throw new RuntimeException("Setting MultiStateDiscreteSignal failed: does not exist (Optional Nodes must be configured in NodeBuilder)");
    }
    try {
      node.setValue(value);
    } catch(StatusException e) {
      throw new RuntimeException("Setting MultiStateDiscreteSignal failed unexpectedly", e);
    }
  }

  public void setMultiStateDiscreteSignal(long value) {
    setMultiStateDiscreteSignal(UnsignedInteger.valueOf(value));
  }

  @Override
  public Variant[] callMethod(ServiceContext serviceContext, NodeId methodId,
      Variant[] inputArguments, StatusCode[] inputArgumentResults,
      DiagnosticInfo[] inputArgumentDiagnosticInfos) throws StatusException {
    return super.callMethod(serviceContext, methodId, inputArguments, inputArgumentResults, inputArgumentDiagnosticInfos);
  }
}
