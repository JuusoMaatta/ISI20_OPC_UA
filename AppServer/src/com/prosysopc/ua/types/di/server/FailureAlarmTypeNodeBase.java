package com.prosysopc.ua.types.di.server;

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
import com.prosysopc.ua.types.di.FailureAlarmType;
import java.lang.Override;

/**
 * Generated on 2020-10-19 15:11:09
 */
@TypeDefinitionId("nsu=http://opcfoundation.org/UA/DI/;i=15292")
public abstract class FailureAlarmTypeNodeBase extends DeviceHealthDiagnosticAlarmTypeNode implements FailureAlarmType {
  private static GeneratedNodeInitializer<FailureAlarmTypeNode> failureAlarmTypeNodeInitializer;

  protected FailureAlarmTypeNodeBase(NodeManagerUaNode nodeManager, NodeId nodeId,
      QualifiedName browseName, LocalizedText displayName) {
    super(nodeManager, nodeId, browseName, displayName);
  }

  @Override
  public void afterCreate() {
    super.afterCreate();

    // Call afterCreate for each sub-node (if the node has any)
    GeneratedNodeInitializer<FailureAlarmTypeNode> impl = getFailureAlarmTypeNodeInitializer();
    if(impl != null) {
      impl.init((FailureAlarmTypeNode)this);
    }
  }

  public static GeneratedNodeInitializer<FailureAlarmTypeNode> getFailureAlarmTypeNodeInitializer() {
    return failureAlarmTypeNodeInitializer;
  }

  public static void setFailureAlarmTypeNodeInitializer(GeneratedNodeInitializer<FailureAlarmTypeNode> failureAlarmTypeNodeInitializerNewValue) {
    failureAlarmTypeNodeInitializer=failureAlarmTypeNodeInitializerNewValue;
  }

  @Override
  public Variant[] callMethod(ServiceContext serviceContext, NodeId methodId,
      Variant[] inputArguments, StatusCode[] inputArgumentResults,
      DiagnosticInfo[] inputArgumentDiagnosticInfos) throws StatusException {
    return super.callMethod(serviceContext, methodId, inputArguments, inputArgumentResults, inputArgumentDiagnosticInfos);
  }
}
