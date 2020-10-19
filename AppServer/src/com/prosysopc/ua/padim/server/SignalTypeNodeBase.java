package com.prosysopc.ua.padim.server;

import com.prosysopc.ua.StatusException;
import com.prosysopc.ua.TypeDefinitionId;
import com.prosysopc.ua.nodes.Mandatory;
import com.prosysopc.ua.nodes.UaProperty;
import com.prosysopc.ua.nodes.UaVariable;
import com.prosysopc.ua.padim.SignalType;
import com.prosysopc.ua.server.GeneratedNodeInitializer;
import com.prosysopc.ua.server.NodeManagerUaNode;
import com.prosysopc.ua.server.ServiceContext;
import com.prosysopc.ua.stack.builtintypes.DiagnosticInfo;
import com.prosysopc.ua.stack.builtintypes.LocalizedText;
import com.prosysopc.ua.stack.builtintypes.NodeId;
import com.prosysopc.ua.stack.builtintypes.QualifiedName;
import com.prosysopc.ua.stack.builtintypes.StatusCode;
import com.prosysopc.ua.stack.builtintypes.Variant;
import com.prosysopc.ua.types.opcua.server.BaseObjectTypeNode;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;

/**
 * Generated on 2020-10-19 15:11:10
 */
@TypeDefinitionId("nsu=http://opcfoundation.org/UA/PADIM/;i=1008")
public abstract class SignalTypeNodeBase extends BaseObjectTypeNode implements SignalType {
  private static GeneratedNodeInitializer<SignalTypeNode> signalTypeNodeInitializer;

  protected SignalTypeNodeBase(NodeManagerUaNode nodeManager, NodeId nodeId,
      QualifiedName browseName, LocalizedText displayName) {
    super(nodeManager, nodeId, browseName, displayName);
  }

  @Override
  public void afterCreate() {
    super.afterCreate();

    // Call afterCreate for each sub-node (if the node has any)
    GeneratedNodeInitializer<SignalTypeNode> impl = getSignalTypeNodeInitializer();
    if(impl != null) {
      impl.init((SignalTypeNode)this);
    }
  }

  public static GeneratedNodeInitializer<SignalTypeNode> getSignalTypeNodeInitializer() {
    return signalTypeNodeInitializer;
  }

  public static void setSignalTypeNodeInitializer(GeneratedNodeInitializer<SignalTypeNode> signalTypeNodeInitializerNewValue) {
    signalTypeNodeInitializer=signalTypeNodeInitializerNewValue;
  }

  @Mandatory
  @Override
  public UaProperty getSignalTagNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/DI/", "SignalTag");
    return getProperty(browseName);
  }

  @Mandatory
  @Override
  public String getSignalTag() {
    UaVariable node = getSignalTagNode();
    if (node == null) {
      throw new RuntimeException("Mandatory node SignalTag does not exist");
    }
    Object value = node.getValue().getValue().getValue();
    return (String) value;
  }

  @Mandatory
  @Override
  public void setSignalTag(String value) {
    UaVariable node = getSignalTagNode();
    if (node == null) {
      throw new RuntimeException("Setting SignalTag failed: does not exist (Optional Nodes must be configured in NodeBuilder)");
    }
    try {
      node.setValue(value);
    } catch(StatusException e) {
      throw new RuntimeException("Setting SignalTag failed unexpectedly", e);
    }
  }

  @Override
  public Variant[] callMethod(ServiceContext serviceContext, NodeId methodId,
      Variant[] inputArguments, StatusCode[] inputArgumentResults,
      DiagnosticInfo[] inputArgumentDiagnosticInfos) throws StatusException {
    return super.callMethod(serviceContext, methodId, inputArguments, inputArgumentResults, inputArgumentDiagnosticInfos);
  }
}
