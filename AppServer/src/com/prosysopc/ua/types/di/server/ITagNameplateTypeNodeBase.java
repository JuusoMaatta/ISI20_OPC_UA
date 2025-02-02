package com.prosysopc.ua.types.di.server;

import com.prosysopc.ua.StatusException;
import com.prosysopc.ua.TypeDefinitionId;
import com.prosysopc.ua.nodes.Optional;
import com.prosysopc.ua.nodes.UaProperty;
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
import com.prosysopc.ua.types.di.ITagNameplateType;
import com.prosysopc.ua.types.opcua.server.BaseInterfaceTypeNode;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;

/**
 * Generated on 2020-10-19 15:11:09
 */
@TypeDefinitionId("nsu=http://opcfoundation.org/UA/DI/;i=15048")
public abstract class ITagNameplateTypeNodeBase extends BaseInterfaceTypeNode implements ITagNameplateType {
  private static GeneratedNodeInitializer<ITagNameplateTypeNode> iTagNameplateTypeNodeInitializer;

  protected ITagNameplateTypeNodeBase(NodeManagerUaNode nodeManager, NodeId nodeId,
      QualifiedName browseName, LocalizedText displayName) {
    super(nodeManager, nodeId, browseName, displayName);
  }

  @Override
  public void afterCreate() {
    super.afterCreate();

    // Call afterCreate for each sub-node (if the node has any)
    GeneratedNodeInitializer<ITagNameplateTypeNode> impl = getITagNameplateTypeNodeInitializer();
    if(impl != null) {
      impl.init((ITagNameplateTypeNode)this);
    }
  }

  public static GeneratedNodeInitializer<ITagNameplateTypeNode> getITagNameplateTypeNodeInitializer() {
    return iTagNameplateTypeNodeInitializer;
  }

  public static void setITagNameplateTypeNodeInitializer(GeneratedNodeInitializer<ITagNameplateTypeNode> iTagNameplateTypeNodeInitializerNewValue) {
    iTagNameplateTypeNodeInitializer=iTagNameplateTypeNodeInitializerNewValue;
  }

  @Optional
  @Override
  public UaProperty getAssetIdNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/DI/", "AssetId");
    return getProperty(browseName);
  }

  @Optional
  @Override
  public String getAssetId() {
    UaVariable node = getAssetIdNode();
    if (node == null) {
      return null;
    }
    Object value = node.getValue().getValue().getValue();
    return (String) value;
  }

  @Optional
  @Override
  public void setAssetId(String value) {
    UaVariable node = getAssetIdNode();
    if (node == null) {
      throw new RuntimeException("Setting AssetId failed: does not exist (Optional Nodes must be configured in NodeBuilder)");
    }
    try {
      node.setValue(value);
    } catch(StatusException e) {
      throw new RuntimeException("Setting AssetId failed unexpectedly", e);
    }
  }

  @Optional
  @Override
  public UaProperty getComponentNameNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/DI/", "ComponentName");
    return getProperty(browseName);
  }

  @Optional
  @Override
  public LocalizedText getComponentName() {
    UaVariable node = getComponentNameNode();
    if (node == null) {
      return null;
    }
    Object value = node.getValue().getValue().getValue();
    return (LocalizedText) value;
  }

  @Optional
  @Override
  public void setComponentName(LocalizedText value) {
    UaVariable node = getComponentNameNode();
    if (node == null) {
      throw new RuntimeException("Setting ComponentName failed: does not exist (Optional Nodes must be configured in NodeBuilder)");
    }
    try {
      node.setValue(value);
    } catch(StatusException e) {
      throw new RuntimeException("Setting ComponentName failed unexpectedly", e);
    }
  }

  @Override
  public Variant[] callMethod(ServiceContext serviceContext, NodeId methodId,
      Variant[] inputArguments, StatusCode[] inputArgumentResults,
      DiagnosticInfo[] inputArgumentDiagnosticInfos) throws StatusException {
    return super.callMethod(serviceContext, methodId, inputArguments, inputArgumentResults, inputArgumentDiagnosticInfos);
  }
}
