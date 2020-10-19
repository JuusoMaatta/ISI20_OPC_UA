package com.prosysopc.ua.types.di.client;

import com.prosysopc.ua.TypeDefinitionId;
import com.prosysopc.ua.client.AddressSpace;
import com.prosysopc.ua.nodes.Mandatory;
import com.prosysopc.ua.stack.builtintypes.LocalizedText;
import com.prosysopc.ua.stack.builtintypes.NodeId;
import com.prosysopc.ua.stack.builtintypes.QualifiedName;
import com.prosysopc.ua.types.di.ConnectionPointType;
import com.prosysopc.ua.types.di.FunctionalGroupType;
import java.lang.Override;

/**
 * Represents the interface (interface card) of a Device to a Network.
 * <p>
 * Generated on 2020-10-19 15:11:09
 */
@TypeDefinitionId("nsu=http://opcfoundation.org/UA/DI/;i=6308")
public abstract class ConnectionPointTypeImplBase extends TopologyElementTypeImpl implements ConnectionPointType {
  protected ConnectionPointTypeImplBase(AddressSpace addressSpace, NodeId nodeId,
      QualifiedName browseName, LocalizedText displayName) {
    super(addressSpace, nodeId, browseName, displayName);
  }

  @Mandatory
  @Override
  public FunctionalGroupType getNetworkAddressNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/DI/", "NetworkAddress");
    return (FunctionalGroupType) getComponent(browseName);
  }
}
