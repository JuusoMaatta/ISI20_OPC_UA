package com.prosysopc.ua.types.di;

import com.prosysopc.ua.StatusException;
import com.prosysopc.ua.TypeDefinitionId;
import com.prosysopc.ua.nodes.Optional;
import com.prosysopc.ua.nodes.UaProperty;
import com.prosysopc.ua.stack.builtintypes.LocalizedText;
import com.prosysopc.ua.types.opcua.BaseInterfaceType;
import java.lang.String;

/**
 * Generated on 2020-10-19 15:11:09
 */
@TypeDefinitionId("nsu=http://opcfoundation.org/UA/DI/;i=15048")
public interface ITagNameplateType extends BaseInterfaceType {
  String ASSET_ID = "AssetId";

  String COMPONENT_NAME = "ComponentName";

  @Optional
  UaProperty getAssetIdNode();

  @Optional
  String getAssetId();

  @Optional
  void setAssetId(String value) throws StatusException;

  @Optional
  UaProperty getComponentNameNode();

  @Optional
  LocalizedText getComponentName();

  @Optional
  void setComponentName(LocalizedText value) throws StatusException;
}
