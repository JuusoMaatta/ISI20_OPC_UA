package com.prosysopc.ua.types.di.client;

import com.prosysopc.ua.TypeDefinitionId;
import com.prosysopc.ua.client.AddressSpace;
import com.prosysopc.ua.nodes.Mandatory;
import com.prosysopc.ua.stack.builtintypes.LocalizedText;
import com.prosysopc.ua.stack.builtintypes.NodeId;
import com.prosysopc.ua.stack.builtintypes.QualifiedName;
import com.prosysopc.ua.types.di.ConfigurableObjectType;
import com.prosysopc.ua.types.opcua.FolderType;
import com.prosysopc.ua.types.opcua.client.BaseObjectTypeImpl;
import java.lang.Override;

/**
 * Defines a general pattern to expose and configure modular components
 * <p>
 * Generated on 2020-10-19 15:11:09
 */
@TypeDefinitionId("nsu=http://opcfoundation.org/UA/DI/;i=1004")
public abstract class ConfigurableObjectTypeImplBase extends BaseObjectTypeImpl implements ConfigurableObjectType {
  protected ConfigurableObjectTypeImplBase(AddressSpace addressSpace, NodeId nodeId,
      QualifiedName browseName, LocalizedText displayName) {
    super(addressSpace, nodeId, browseName, displayName);
  }

  @Mandatory
  @Override
  public FolderType getSupportedTypesNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/DI/", "SupportedTypes");
    return (FolderType) getComponent(browseName);
  }
}
