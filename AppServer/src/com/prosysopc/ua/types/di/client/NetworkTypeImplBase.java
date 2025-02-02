package com.prosysopc.ua.types.di.client;

import com.prosysopc.ua.TypeDefinitionId;
import com.prosysopc.ua.client.AddressSpace;
import com.prosysopc.ua.nodes.Optional;
import com.prosysopc.ua.stack.builtintypes.LocalizedText;
import com.prosysopc.ua.stack.builtintypes.NodeId;
import com.prosysopc.ua.stack.builtintypes.QualifiedName;
import com.prosysopc.ua.types.di.LockingServicesType;
import com.prosysopc.ua.types.di.NetworkType;
import com.prosysopc.ua.types.opcua.client.BaseObjectTypeImpl;
import java.lang.Override;

/**
 * Represents the communication means for Devices that are connected to it.
 * <p>
 * Generated on 2020-10-19 15:11:09
 */
@TypeDefinitionId("nsu=http://opcfoundation.org/UA/DI/;i=6247")
public abstract class NetworkTypeImplBase extends BaseObjectTypeImpl implements NetworkType {
  protected NetworkTypeImplBase(AddressSpace addressSpace, NodeId nodeId, QualifiedName browseName,
      LocalizedText displayName) {
    super(addressSpace, nodeId, browseName, displayName);
  }

  @Optional
  @Override
  public LockingServicesType getLockNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/DI/", "Lock");
    return (LockingServicesType) getComponent(browseName);
  }
}
