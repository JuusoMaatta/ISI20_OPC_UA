package com.prosysopc.ua.types.di;

import com.prosysopc.ua.TypeDefinitionId;
import com.prosysopc.ua.nodes.Mandatory;
import java.lang.String;

/**
 * Represents the interface (interface card) of a Device to a Network.
 * <p>
 * Generated on 2020-10-19 15:11:09
 */
@TypeDefinitionId("nsu=http://opcfoundation.org/UA/DI/;i=6308")
public interface ConnectionPointType extends TopologyElementType {
  String NETWORK_ADDRESS = "NetworkAddress";

  String PROFILE_IDENTIFIER = "<ProfileIdentifier>";

  @Mandatory
  FunctionalGroupType getNetworkAddressNode();
}
