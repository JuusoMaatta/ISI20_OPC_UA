package com.prosysopc.ua.padim.server;

import com.prosysopc.ua.TypeDefinitionId;
import com.prosysopc.ua.padim.NormalizedVolumeFlowRateVariableType;
import com.prosysopc.ua.server.GeneratedNodeInitializer;
import com.prosysopc.ua.server.NodeManagerUaNode;
import com.prosysopc.ua.stack.builtintypes.LocalizedText;
import com.prosysopc.ua.stack.builtintypes.NodeId;
import com.prosysopc.ua.stack.builtintypes.QualifiedName;
import java.lang.Override;

/**
 * Generated on 2020-10-19 15:11:10
 */
@TypeDefinitionId("nsu=http://opcfoundation.org/UA/PADIM/;i=1135")
public abstract class NormalizedVolumeFlowRateVariableTypeNodeBase extends FlowMeasurementVariableTypeNode implements NormalizedVolumeFlowRateVariableType {
  private static GeneratedNodeInitializer<NormalizedVolumeFlowRateVariableTypeNode> normalizedVolumeFlowRateVariableTypeNodeInitializer;

  protected NormalizedVolumeFlowRateVariableTypeNodeBase(NodeManagerUaNode nodeManager,
      NodeId nodeId, QualifiedName browseName, LocalizedText displayName) {
    super(nodeManager, nodeId, browseName, displayName);
  }

  @Override
  public void afterCreate() {
    super.afterCreate();

    // Call afterCreate for each sub-node (if the node has any)
    GeneratedNodeInitializer<NormalizedVolumeFlowRateVariableTypeNode> impl = getNormalizedVolumeFlowRateVariableTypeNodeInitializer();
    if(impl != null) {
      impl.init((NormalizedVolumeFlowRateVariableTypeNode)this);
    }
  }

  public static GeneratedNodeInitializer<NormalizedVolumeFlowRateVariableTypeNode> getNormalizedVolumeFlowRateVariableTypeNodeInitializer() {
    return normalizedVolumeFlowRateVariableTypeNodeInitializer;
  }

  public static void setNormalizedVolumeFlowRateVariableTypeNodeInitializer(GeneratedNodeInitializer<NormalizedVolumeFlowRateVariableTypeNode> normalizedVolumeFlowRateVariableTypeNodeInitializerNewValue) {
    normalizedVolumeFlowRateVariableTypeNodeInitializer=normalizedVolumeFlowRateVariableTypeNodeInitializerNewValue;
  }
}
