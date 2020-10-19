package com.prosysopc.ua.padim.server;

import com.prosysopc.ua.TypeDefinitionId;
import com.prosysopc.ua.padim.MassFlowRateVariableType;
import com.prosysopc.ua.server.GeneratedNodeInitializer;
import com.prosysopc.ua.server.NodeManagerUaNode;
import com.prosysopc.ua.stack.builtintypes.LocalizedText;
import com.prosysopc.ua.stack.builtintypes.NodeId;
import com.prosysopc.ua.stack.builtintypes.QualifiedName;
import java.lang.Override;

/**
 * Generated on 2020-10-19 15:11:10
 */
@TypeDefinitionId("nsu=http://opcfoundation.org/UA/PADIM/;i=1133")
public abstract class MassFlowRateVariableTypeNodeBase extends FlowMeasurementVariableTypeNode implements MassFlowRateVariableType {
  private static GeneratedNodeInitializer<MassFlowRateVariableTypeNode> massFlowRateVariableTypeNodeInitializer;

  protected MassFlowRateVariableTypeNodeBase(NodeManagerUaNode nodeManager, NodeId nodeId,
      QualifiedName browseName, LocalizedText displayName) {
    super(nodeManager, nodeId, browseName, displayName);
  }

  @Override
  public void afterCreate() {
    super.afterCreate();

    // Call afterCreate for each sub-node (if the node has any)
    GeneratedNodeInitializer<MassFlowRateVariableTypeNode> impl = getMassFlowRateVariableTypeNodeInitializer();
    if(impl != null) {
      impl.init((MassFlowRateVariableTypeNode)this);
    }
  }

  public static GeneratedNodeInitializer<MassFlowRateVariableTypeNode> getMassFlowRateVariableTypeNodeInitializer() {
    return massFlowRateVariableTypeNodeInitializer;
  }

  public static void setMassFlowRateVariableTypeNodeInitializer(GeneratedNodeInitializer<MassFlowRateVariableTypeNode> massFlowRateVariableTypeNodeInitializerNewValue) {
    massFlowRateVariableTypeNodeInitializer=massFlowRateVariableTypeNodeInitializerNewValue;
  }
}
