package com.prosysopc.ua.types.di;

import com.prosysopc.ua.TypeDefinitionId;
import com.prosysopc.ua.nodes.Optional;
import com.prosysopc.ua.types.opcua.BaseInterfaceType;
import com.prosysopc.ua.types.opcua.FolderType;
import java.lang.String;

/**
 * Generated on 2020-10-19 15:11:09
 */
@TypeDefinitionId("nsu=http://opcfoundation.org/UA/DI/;i=15054")
public interface ISupportInfoType extends BaseInterfaceType {
  String DEVICE_TYPE_IMAGE = "DeviceTypeImage";

  String DOCUMENTATION = "Documentation";

  String PROTOCOL_SUPPORT = "ProtocolSupport";

  String IMAGE_SET = "ImageSet";

  @Optional
  FolderType getDeviceTypeImageNode();

  @Optional
  FolderType getDocumentationNode();

  @Optional
  FolderType getProtocolSupportNode();

  @Optional
  FolderType getImageSetNode();
}
