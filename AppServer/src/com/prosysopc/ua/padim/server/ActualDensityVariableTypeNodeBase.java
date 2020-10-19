package com.prosysopc.ua.padim.server;

import com.prosysopc.ua.TypeDefinitionId;
import com.prosysopc.ua.padim.ActualDensityVariableType;
import com.prosysopc.ua.server.GeneratedNodeInitializer;
import com.prosysopc.ua.server.NodeManagerUaNode;
import com.prosysopc.ua.stack.builtintypes.LocalizedText;
import com.prosysopc.ua.stack.builtintypes.NodeId;
import com.prosysopc.ua.stack.builtintypes.QualifiedName;
import java.lang.Override;

/**
 * Generated on 2020-10-19 15:11:10
 */
@TypeDefinitionId("nsu=http://opcfoundation.org/UA/PADIM/;i=1124")
public abstract class ActualDensityVariableTypeNodeBase extends AnalogSignalVariableTypeNode implements ActualDensityVariableType {
  private static GeneratedNodeInitializer<ActualDensityVariableTypeNode> actualDensityVariableTypeNodeInitializer;

  protected ActualDensityVariableTypeNodeBase(NodeManagerUaNode nodeManager, NodeId nodeId,
      QualifiedName browseName, LocalizedText displayName) {
    super(nodeManager, nodeId, browseName, displayName);
  }

  @Override
  public void afterCreate() {
    super.afterCreate();

    // Call afterCreate for each sub-node (if the node has any)
    GeneratedNodeInitializer<ActualDensityVariableTypeNode> impl = getActualDensityVariableTypeNodeInitializer();
    if(impl != null) {
      impl.init((ActualDensityVariableTypeNode)this);
    }
  }

  public static GeneratedNodeInitializer<ActualDensityVariableTypeNode> getActualDensityVariableTypeNodeInitializer() {
    return actualDensityVariableTypeNodeInitializer;
  }

  public static void setActualDensityVariableTypeNodeInitializer(GeneratedNodeInitializer<ActualDensityVariableTypeNode> actualDensityVariableTypeNodeInitializerNewValue) {
    actualDensityVariableTypeNodeInitializer=actualDensityVariableTypeNodeInitializerNewValue;
  }
}
