package com.prosysopc.ua.padim.server;

import com.prosysopc.ua.TypeDefinitionId;
import com.prosysopc.ua.padim.LevelMeasurementVariableType;
import com.prosysopc.ua.server.GeneratedNodeInitializer;
import com.prosysopc.ua.server.NodeManagerUaNode;
import com.prosysopc.ua.stack.builtintypes.LocalizedText;
import com.prosysopc.ua.stack.builtintypes.NodeId;
import com.prosysopc.ua.stack.builtintypes.QualifiedName;
import java.lang.Override;

/**
 * Generated on 2020-10-19 15:11:10
 */
@TypeDefinitionId("nsu=http://opcfoundation.org/UA/PADIM/;i=1123")
public abstract class LevelMeasurementVariableTypeNodeBase extends AnalogSignalVariableTypeNode implements LevelMeasurementVariableType {
  private static GeneratedNodeInitializer<LevelMeasurementVariableTypeNode> levelMeasurementVariableTypeNodeInitializer;

  protected LevelMeasurementVariableTypeNodeBase(NodeManagerUaNode nodeManager, NodeId nodeId,
      QualifiedName browseName, LocalizedText displayName) {
    super(nodeManager, nodeId, browseName, displayName);
  }

  @Override
  public void afterCreate() {
    super.afterCreate();

    // Call afterCreate for each sub-node (if the node has any)
    GeneratedNodeInitializer<LevelMeasurementVariableTypeNode> impl = getLevelMeasurementVariableTypeNodeInitializer();
    if(impl != null) {
      impl.init((LevelMeasurementVariableTypeNode)this);
    }
  }

  public static GeneratedNodeInitializer<LevelMeasurementVariableTypeNode> getLevelMeasurementVariableTypeNodeInitializer() {
    return levelMeasurementVariableTypeNodeInitializer;
  }

  public static void setLevelMeasurementVariableTypeNodeInitializer(GeneratedNodeInitializer<LevelMeasurementVariableTypeNode> levelMeasurementVariableTypeNodeInitializerNewValue) {
    levelMeasurementVariableTypeNodeInitializer=levelMeasurementVariableTypeNodeInitializerNewValue;
  }
}
