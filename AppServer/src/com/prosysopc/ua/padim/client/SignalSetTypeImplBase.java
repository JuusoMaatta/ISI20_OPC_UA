package com.prosysopc.ua.padim.client;

import com.prosysopc.ua.TypeDefinitionId;
import com.prosysopc.ua.client.AddressSpace;
import com.prosysopc.ua.padim.SignalSetType;
import com.prosysopc.ua.stack.builtintypes.LocalizedText;
import com.prosysopc.ua.stack.builtintypes.NodeId;
import com.prosysopc.ua.stack.builtintypes.QualifiedName;
import com.prosysopc.ua.types.opcua.client.BaseObjectTypeImpl;

/**
 * Generated on 2020-10-19 15:11:10
 */
@TypeDefinitionId("nsu=http://opcfoundation.org/UA/PADIM/;i=1021")
public abstract class SignalSetTypeImplBase extends BaseObjectTypeImpl implements SignalSetType {
  protected SignalSetTypeImplBase(AddressSpace addressSpace, NodeId nodeId,
      QualifiedName browseName, LocalizedText displayName) {
    super(addressSpace, nodeId, browseName, displayName);
  }
}
