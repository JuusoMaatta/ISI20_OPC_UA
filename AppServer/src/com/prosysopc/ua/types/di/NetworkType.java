package com.prosysopc.ua.types.di;

import com.prosysopc.ua.TypeDefinitionId;
import com.prosysopc.ua.nodes.Optional;
import com.prosysopc.ua.types.opcua.BaseObjectType;
import java.lang.String;

/**
 * Represents the communication means for Devices that are connected to it.
 * <p>
 * Generated on 2020-10-19 15:11:09
 */
@TypeDefinitionId("nsu=http://opcfoundation.org/UA/DI/;i=6247")
public interface NetworkType extends BaseObjectType {
  String PROFILE_IDENTIFIER = "<ProfileIdentifier>";

  String LOCK = "Lock";

  @Optional
  LockingServicesType getLockNode();
}
