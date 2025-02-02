package com.prosysopc.ua.types.di.server;

import com.prosysopc.ua.StatusException;
import com.prosysopc.ua.TypeDefinitionId;
import com.prosysopc.ua.nodes.Optional;
import com.prosysopc.ua.nodes.UaVariable;
import com.prosysopc.ua.server.GeneratedNodeInitializer;
import com.prosysopc.ua.server.NodeManagerUaNode;
import com.prosysopc.ua.server.ServiceContext;
import com.prosysopc.ua.stack.builtintypes.DiagnosticInfo;
import com.prosysopc.ua.stack.builtintypes.LocalizedText;
import com.prosysopc.ua.stack.builtintypes.NodeId;
import com.prosysopc.ua.stack.builtintypes.QualifiedName;
import com.prosysopc.ua.stack.builtintypes.StatusCode;
import com.prosysopc.ua.stack.builtintypes.Variant;
import com.prosysopc.ua.types.di.FunctionalGroupType;
import com.prosysopc.ua.types.opcua.server.FolderTypeNode;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;

/**
 * FolderType is used to organize the Parameters and Methods from the complete set (ParameterSet, MethodSet) with regard to their application
 * <p>
 * Generated on 2020-10-19 15:11:09
 */
@TypeDefinitionId("nsu=http://opcfoundation.org/UA/DI/;i=1005")
public abstract class FunctionalGroupTypeNodeBase extends FolderTypeNode implements FunctionalGroupType {
  private static GeneratedNodeInitializer<FunctionalGroupTypeNode> functionalGroupTypeNodeInitializer;

  protected FunctionalGroupTypeNodeBase(NodeManagerUaNode nodeManager, NodeId nodeId,
      QualifiedName browseName, LocalizedText displayName) {
    super(nodeManager, nodeId, browseName, displayName);
  }

  @Override
  public void afterCreate() {
    super.afterCreate();

    // Call afterCreate for each sub-node (if the node has any)
    callAfterCreateIfExists(getUIElementNode());
    GeneratedNodeInitializer<FunctionalGroupTypeNode> impl = getFunctionalGroupTypeNodeInitializer();
    if(impl != null) {
      impl.init((FunctionalGroupTypeNode)this);
    }
  }

  public static GeneratedNodeInitializer<FunctionalGroupTypeNode> getFunctionalGroupTypeNodeInitializer() {
    return functionalGroupTypeNodeInitializer;
  }

  public static void setFunctionalGroupTypeNodeInitializer(GeneratedNodeInitializer<FunctionalGroupTypeNode> functionalGroupTypeNodeInitializerNewValue) {
    functionalGroupTypeNodeInitializer=functionalGroupTypeNodeInitializerNewValue;
  }

  @Optional
  @Override
  public UIElementTypeNode getUIElementNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/DI/", "UIElement");
    return (UIElementTypeNode) getComponent(browseName);
  }

  @Optional
  @Override
  public Object getUIElement() {
    UaVariable node = getUIElementNode();
    if (node == null) {
      return null;
    }
    Object value = node.getValue().getValue().getValue();
    return (Object) value;
  }

  @Optional
  @Override
  public void setUIElement(Object value) {
    UaVariable node = getUIElementNode();
    if (node == null) {
      throw new RuntimeException("Setting UIElement failed: does not exist (Optional Nodes must be configured in NodeBuilder)");
    }
    try {
      node.setValue(value);
    } catch(StatusException e) {
      throw new RuntimeException("Setting UIElement failed unexpectedly", e);
    }
  }

  @Override
  public Variant[] callMethod(ServiceContext serviceContext, NodeId methodId,
      Variant[] inputArguments, StatusCode[] inputArgumentResults,
      DiagnosticInfo[] inputArgumentDiagnosticInfos) throws StatusException {
    return super.callMethod(serviceContext, methodId, inputArguments, inputArgumentResults, inputArgumentDiagnosticInfos);
  }
}
