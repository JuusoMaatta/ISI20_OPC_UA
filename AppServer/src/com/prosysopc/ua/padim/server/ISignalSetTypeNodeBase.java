package com.prosysopc.ua.padim.server;

import com.prosysopc.ua.StatusException;
import com.prosysopc.ua.TypeDefinitionId;
import com.prosysopc.ua.nodes.Optional;
import com.prosysopc.ua.padim.ISignalSetType;
import com.prosysopc.ua.server.GeneratedNodeInitializer;
import com.prosysopc.ua.server.NodeManagerUaNode;
import com.prosysopc.ua.server.ServiceContext;
import com.prosysopc.ua.stack.builtintypes.DiagnosticInfo;
import com.prosysopc.ua.stack.builtintypes.LocalizedText;
import com.prosysopc.ua.stack.builtintypes.NodeId;
import com.prosysopc.ua.stack.builtintypes.QualifiedName;
import com.prosysopc.ua.stack.builtintypes.StatusCode;
import com.prosysopc.ua.stack.builtintypes.Variant;
import com.prosysopc.ua.types.opcua.server.BaseInterfaceTypeNode;
import java.lang.Override;

/**
 * Generated on 2020-10-19 15:11:10
 */
@TypeDefinitionId("nsu=http://opcfoundation.org/UA/PADIM/;i=1052")
public abstract class ISignalSetTypeNodeBase extends BaseInterfaceTypeNode implements ISignalSetType {
  private static GeneratedNodeInitializer<ISignalSetTypeNode> iSignalSetTypeNodeInitializer;

  protected ISignalSetTypeNodeBase(NodeManagerUaNode nodeManager, NodeId nodeId,
      QualifiedName browseName, LocalizedText displayName) {
    super(nodeManager, nodeId, browseName, displayName);
  }

  @Override
  public void afterCreate() {
    super.afterCreate();

    // Call afterCreate for each sub-node (if the node has any)
    callAfterCreateIfExists(getSignalSetNode());
    GeneratedNodeInitializer<ISignalSetTypeNode> impl = getISignalSetTypeNodeInitializer();
    if(impl != null) {
      impl.init((ISignalSetTypeNode)this);
    }
  }

  public static GeneratedNodeInitializer<ISignalSetTypeNode> getISignalSetTypeNodeInitializer() {
    return iSignalSetTypeNodeInitializer;
  }

  public static void setISignalSetTypeNodeInitializer(GeneratedNodeInitializer<ISignalSetTypeNode> iSignalSetTypeNodeInitializerNewValue) {
    iSignalSetTypeNodeInitializer=iSignalSetTypeNodeInitializerNewValue;
  }

  @Optional
  @Override
  public SignalSetTypeNode getSignalSetNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/DI/", "SignalSet");
    return (SignalSetTypeNode) getComponent(browseName);
  }

  @Override
  public Variant[] callMethod(ServiceContext serviceContext, NodeId methodId,
      Variant[] inputArguments, StatusCode[] inputArgumentResults,
      DiagnosticInfo[] inputArgumentDiagnosticInfos) throws StatusException {
    return super.callMethod(serviceContext, methodId, inputArguments, inputArgumentResults, inputArgumentDiagnosticInfos);
  }
}
