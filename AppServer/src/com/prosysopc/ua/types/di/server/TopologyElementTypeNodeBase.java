package com.prosysopc.ua.types.di.server;

import com.prosysopc.ua.StatusException;
import com.prosysopc.ua.TypeDefinitionId;
import com.prosysopc.ua.nodes.Optional;
import com.prosysopc.ua.server.GeneratedNodeInitializer;
import com.prosysopc.ua.server.NodeManagerUaNode;
import com.prosysopc.ua.server.ServiceContext;
import com.prosysopc.ua.stack.builtintypes.DiagnosticInfo;
import com.prosysopc.ua.stack.builtintypes.LocalizedText;
import com.prosysopc.ua.stack.builtintypes.NodeId;
import com.prosysopc.ua.stack.builtintypes.QualifiedName;
import com.prosysopc.ua.stack.builtintypes.StatusCode;
import com.prosysopc.ua.stack.builtintypes.Variant;
import com.prosysopc.ua.types.di.TopologyElementType;
import com.prosysopc.ua.types.opcua.server.BaseObjectTypeNode;
import java.lang.Override;

/**
 * Defines the basic information components for all configurable elements in a device topology
 * <p>
 * Generated on 2020-10-19 15:11:09
 */
@TypeDefinitionId("nsu=http://opcfoundation.org/UA/DI/;i=1001")
public abstract class TopologyElementTypeNodeBase extends BaseObjectTypeNode implements TopologyElementType {
  private static GeneratedNodeInitializer<TopologyElementTypeNode> topologyElementTypeNodeInitializer;

  protected TopologyElementTypeNodeBase(NodeManagerUaNode nodeManager, NodeId nodeId,
      QualifiedName browseName, LocalizedText displayName) {
    super(nodeManager, nodeId, browseName, displayName);
  }

  @Override
  public void afterCreate() {
    super.afterCreate();

    // Call afterCreate for each sub-node (if the node has any)
    callAfterCreateIfExists(getParameterSetNode());
    callAfterCreateIfExists(getMethodSetNode());
    callAfterCreateIfExists(getIdentificationNode());
    callAfterCreateIfExists(getLockNode());
    GeneratedNodeInitializer<TopologyElementTypeNode> impl = getTopologyElementTypeNodeInitializer();
    if(impl != null) {
      impl.init((TopologyElementTypeNode)this);
    }
  }

  public static GeneratedNodeInitializer<TopologyElementTypeNode> getTopologyElementTypeNodeInitializer() {
    return topologyElementTypeNodeInitializer;
  }

  public static void setTopologyElementTypeNodeInitializer(GeneratedNodeInitializer<TopologyElementTypeNode> topologyElementTypeNodeInitializerNewValue) {
    topologyElementTypeNodeInitializer=topologyElementTypeNodeInitializerNewValue;
  }

  @Optional
  @Override
  public BaseObjectTypeNode getParameterSetNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/DI/", "ParameterSet");
    return (BaseObjectTypeNode) getComponent(browseName);
  }

  @Optional
  @Override
  public BaseObjectTypeNode getMethodSetNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/DI/", "MethodSet");
    return (BaseObjectTypeNode) getComponent(browseName);
  }

  @Optional
  @Override
  public FunctionalGroupTypeNode getIdentificationNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/DI/", "Identification");
    return (FunctionalGroupTypeNode) getComponent(browseName);
  }

  @Optional
  @Override
  public LockingServicesTypeNode getLockNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/DI/", "Lock");
    return (LockingServicesTypeNode) getComponent(browseName);
  }

  @Override
  public Variant[] callMethod(ServiceContext serviceContext, NodeId methodId,
      Variant[] inputArguments, StatusCode[] inputArgumentResults,
      DiagnosticInfo[] inputArgumentDiagnosticInfos) throws StatusException {
    return super.callMethod(serviceContext, methodId, inputArguments, inputArgumentResults, inputArgumentDiagnosticInfos);
  }
}
