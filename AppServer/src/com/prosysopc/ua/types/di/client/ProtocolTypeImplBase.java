package com.prosysopc.ua.types.di.client;

import com.prosysopc.ua.TypeDefinitionId;
import com.prosysopc.ua.client.AddressSpace;
import com.prosysopc.ua.stack.builtintypes.LocalizedText;
import com.prosysopc.ua.stack.builtintypes.NodeId;
import com.prosysopc.ua.stack.builtintypes.QualifiedName;
import com.prosysopc.ua.types.di.ProtocolType;
import com.prosysopc.ua.types.opcua.client.BaseObjectTypeImpl;

/**
 * General structure of a Protocol ObjectType
 * <p>
 * Generated on 2020-10-19 15:11:09
 */
@TypeDefinitionId("nsu=http://opcfoundation.org/UA/DI/;i=1006")
public abstract class ProtocolTypeImplBase extends BaseObjectTypeImpl implements ProtocolType {
  protected ProtocolTypeImplBase(AddressSpace addressSpace, NodeId nodeId, QualifiedName browseName,
      LocalizedText displayName) {
    super(addressSpace, nodeId, browseName, displayName);
  }
}
