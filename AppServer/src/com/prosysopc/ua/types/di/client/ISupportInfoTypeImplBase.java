package com.prosysopc.ua.types.di.client;

import com.prosysopc.ua.TypeDefinitionId;
import com.prosysopc.ua.client.AddressSpace;
import com.prosysopc.ua.nodes.Optional;
import com.prosysopc.ua.stack.builtintypes.LocalizedText;
import com.prosysopc.ua.stack.builtintypes.NodeId;
import com.prosysopc.ua.stack.builtintypes.QualifiedName;
import com.prosysopc.ua.types.di.ISupportInfoType;
import com.prosysopc.ua.types.opcua.FolderType;
import com.prosysopc.ua.types.opcua.client.BaseInterfaceTypeImpl;
import java.lang.Override;

/**
 * Generated on 2020-10-19 15:11:09
 */
@TypeDefinitionId("nsu=http://opcfoundation.org/UA/DI/;i=15054")
public abstract class ISupportInfoTypeImplBase extends BaseInterfaceTypeImpl implements ISupportInfoType {
  protected ISupportInfoTypeImplBase(AddressSpace addressSpace, NodeId nodeId,
      QualifiedName browseName, LocalizedText displayName) {
    super(addressSpace, nodeId, browseName, displayName);
  }

  @Optional
  @Override
  public FolderType getDeviceTypeImageNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/DI/", "DeviceTypeImage");
    return (FolderType) getComponent(browseName);
  }

  @Optional
  @Override
  public FolderType getDocumentationNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/DI/", "Documentation");
    return (FolderType) getComponent(browseName);
  }

  @Optional
  @Override
  public FolderType getProtocolSupportNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/DI/", "ProtocolSupport");
    return (FolderType) getComponent(browseName);
  }

  @Optional
  @Override
  public FolderType getImageSetNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/DI/", "ImageSet");
    return (FolderType) getComponent(browseName);
  }
}
