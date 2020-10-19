package com.prosysopc.ua.types.di.client;

import com.prosysopc.ua.StatusException;
import com.prosysopc.ua.TypeDefinitionId;
import com.prosysopc.ua.client.AddressSpace;
import com.prosysopc.ua.nodes.Optional;
import com.prosysopc.ua.nodes.UaProperty;
import com.prosysopc.ua.nodes.UaVariable;
import com.prosysopc.ua.stack.builtintypes.LocalizedText;
import com.prosysopc.ua.stack.builtintypes.NodeId;
import com.prosysopc.ua.stack.builtintypes.QualifiedName;
import com.prosysopc.ua.types.di.ITagNameplateType;
import com.prosysopc.ua.types.opcua.client.BaseInterfaceTypeImpl;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;

/**
 * Generated on 2020-10-19 15:11:09
 */
@TypeDefinitionId("nsu=http://opcfoundation.org/UA/DI/;i=15048")
public abstract class ITagNameplateTypeImplBase extends BaseInterfaceTypeImpl implements ITagNameplateType {
  protected ITagNameplateTypeImplBase(AddressSpace addressSpace, NodeId nodeId,
      QualifiedName browseName, LocalizedText displayName) {
    super(addressSpace, nodeId, browseName, displayName);
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
  public void setAssetId(String value) throws StatusException {
    UaVariable node = getAssetIdNode();
    if (node == null) {
      throw new RuntimeException("Setting AssetId failed, the Optional node does not exist)");
    }
    node.setValue(value);
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
  public void setComponentName(LocalizedText value) throws StatusException {
    UaVariable node = getComponentNameNode();
    if (node == null) {
      throw new RuntimeException("Setting ComponentName failed, the Optional node does not exist)");
    }
    node.setValue(value);
  }
}
