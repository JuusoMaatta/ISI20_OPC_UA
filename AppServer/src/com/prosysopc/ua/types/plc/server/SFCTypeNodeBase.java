package com.prosysopc.ua.types.plc.server;

import com.prosysopc.ua.StatusException;
import com.prosysopc.ua.TypeDefinitionId;
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
import com.prosysopc.ua.types.plc.SFCType;
import java.lang.Override;

/**
 * Generated on 2020-10-19 15:11:11
 */
@TypeDefinitionId("nsu=http://PLCopen.org/OpcUa/IEC61131-3/;i=1007")
public abstract class SFCTypeNodeBase extends BaseObjectTypeNode implements SFCType {
  private static GeneratedNodeInitializer<SFCTypeNode> sFCTypeNodeInitializer;

  protected SFCTypeNodeBase(NodeManagerUaNode nodeManager, NodeId nodeId, QualifiedName browseName,
      LocalizedText displayName) {
    super(nodeManager, nodeId, browseName, displayName);
  }

  @Override
  public void afterCreate() {
    super.afterCreate();

    // Call afterCreate for each sub-node (if the node has any)
    GeneratedNodeInitializer<SFCTypeNode> impl = getSFCTypeNodeInitializer();
    if(impl != null) {
      impl.init((SFCTypeNode)this);
    }
  }

  public static GeneratedNodeInitializer<SFCTypeNode> getSFCTypeNodeInitializer() {
    return sFCTypeNodeInitializer;
  }

  public static void setSFCTypeNodeInitializer(GeneratedNodeInitializer<SFCTypeNode> sFCTypeNodeInitializerNewValue) {
    sFCTypeNodeInitializer=sFCTypeNodeInitializerNewValue;
  }

  @Override
  public Variant[] callMethod(ServiceContext serviceContext, NodeId methodId,
      Variant[] inputArguments, StatusCode[] inputArgumentResults,
      DiagnosticInfo[] inputArgumentDiagnosticInfos) throws StatusException {
    return super.callMethod(serviceContext, methodId, inputArguments, inputArgumentResults, inputArgumentDiagnosticInfos);
  }
}
