package com.prosysopc.ua.padim.server;

import com.prosysopc.ua.TypeDefinitionId;
import com.prosysopc.ua.padim.ActualVolumeFlowRateVariableType;
import com.prosysopc.ua.server.GeneratedNodeInitializer;
import com.prosysopc.ua.server.NodeManagerUaNode;
import com.prosysopc.ua.stack.builtintypes.LocalizedText;
import com.prosysopc.ua.stack.builtintypes.NodeId;
import com.prosysopc.ua.stack.builtintypes.QualifiedName;
import java.lang.Override;

/**
 * Generated on 2020-10-19 15:11:10
 */
@TypeDefinitionId("nsu=http://opcfoundation.org/UA/PADIM/;i=1134")
public abstract class ActualVolumeFlowRateVariableTypeNodeBase extends FlowMeasurementVariableTypeNode implements ActualVolumeFlowRateVariableType {
  private static GeneratedNodeInitializer<ActualVolumeFlowRateVariableTypeNode> actualVolumeFlowRateVariableTypeNodeInitializer;

  protected ActualVolumeFlowRateVariableTypeNodeBase(NodeManagerUaNode nodeManager, NodeId nodeId,
      QualifiedName browseName, LocalizedText displayName) {
    super(nodeManager, nodeId, browseName, displayName);
  }

  @Override
  public void afterCreate() {
    super.afterCreate();

    // Call afterCreate for each sub-node (if the node has any)
    GeneratedNodeInitializer<ActualVolumeFlowRateVariableTypeNode> impl = getActualVolumeFlowRateVariableTypeNodeInitializer();
    if(impl != null) {
      impl.init((ActualVolumeFlowRateVariableTypeNode)this);
    }
  }

  public static GeneratedNodeInitializer<ActualVolumeFlowRateVariableTypeNode> getActualVolumeFlowRateVariableTypeNodeInitializer() {
    return actualVolumeFlowRateVariableTypeNodeInitializer;
  }

  public static void setActualVolumeFlowRateVariableTypeNodeInitializer(GeneratedNodeInitializer<ActualVolumeFlowRateVariableTypeNode> actualVolumeFlowRateVariableTypeNodeInitializerNewValue) {
    actualVolumeFlowRateVariableTypeNodeInitializer=actualVolumeFlowRateVariableTypeNodeInitializerNewValue;
  }
}
