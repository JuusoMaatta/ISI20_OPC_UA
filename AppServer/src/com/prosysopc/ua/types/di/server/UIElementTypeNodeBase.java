package com.prosysopc.ua.types.di.server;

import com.prosysopc.ua.TypeDefinitionId;
import com.prosysopc.ua.server.GeneratedNodeInitializer;
import com.prosysopc.ua.server.NodeManagerUaNode;
import com.prosysopc.ua.stack.builtintypes.LocalizedText;
import com.prosysopc.ua.stack.builtintypes.NodeId;
import com.prosysopc.ua.stack.builtintypes.QualifiedName;
import com.prosysopc.ua.types.di.UIElementType;
import com.prosysopc.ua.types.opcua.server.BaseDataVariableTypeNode;
import java.lang.Override;

/**
 * The base type for all UI Element Types.
 * <p>
 * Generated on 2020-10-19 15:11:09
 */
@TypeDefinitionId("nsu=http://opcfoundation.org/UA/DI/;i=6246")
public abstract class UIElementTypeNodeBase extends BaseDataVariableTypeNode implements UIElementType {
  private static GeneratedNodeInitializer<UIElementTypeNode> uIElementTypeNodeInitializer;

  protected UIElementTypeNodeBase(NodeManagerUaNode nodeManager, NodeId nodeId,
      QualifiedName browseName, LocalizedText displayName) {
    super(nodeManager, nodeId, browseName, displayName);
  }

  @Override
  public void afterCreate() {
    super.afterCreate();

    // Call afterCreate for each sub-node (if the node has any)
    GeneratedNodeInitializer<UIElementTypeNode> impl = getUIElementTypeNodeInitializer();
    if(impl != null) {
      impl.init((UIElementTypeNode)this);
    }
  }

  public static GeneratedNodeInitializer<UIElementTypeNode> getUIElementTypeNodeInitializer() {
    return uIElementTypeNodeInitializer;
  }

  public static void setUIElementTypeNodeInitializer(GeneratedNodeInitializer<UIElementTypeNode> uIElementTypeNodeInitializerNewValue) {
    uIElementTypeNodeInitializer=uIElementTypeNodeInitializerNewValue;
  }
}
