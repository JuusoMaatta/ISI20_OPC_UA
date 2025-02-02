package com.prosysopc.ua.types.di.client;

import com.prosysopc.ua.TypeDefinitionId;
import com.prosysopc.ua.client.AddressSpace;
import com.prosysopc.ua.nodes.Optional;
import com.prosysopc.ua.stack.builtintypes.LocalizedText;
import com.prosysopc.ua.stack.builtintypes.NodeId;
import com.prosysopc.ua.stack.builtintypes.QualifiedName;
import com.prosysopc.ua.types.di.FunctionalGroupType;
import com.prosysopc.ua.types.di.LockingServicesType;
import com.prosysopc.ua.types.di.TopologyElementType;
import com.prosysopc.ua.types.opcua.BaseObjectType;
import com.prosysopc.ua.types.opcua.client.BaseObjectTypeImpl;
import java.lang.Override;

/**
 * Defines the basic information components for all configurable elements in a device topology
 * <p>
 * Generated on 2020-10-19 15:11:09
 */
@TypeDefinitionId("nsu=http://opcfoundation.org/UA/DI/;i=1001")
public abstract class TopologyElementTypeImplBase extends BaseObjectTypeImpl implements TopologyElementType {
  protected TopologyElementTypeImplBase(AddressSpace addressSpace, NodeId nodeId,
      QualifiedName browseName, LocalizedText displayName) {
    super(addressSpace, nodeId, browseName, displayName);
  }

  @Optional
  @Override
  public BaseObjectType getParameterSetNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/DI/", "ParameterSet");
    return (BaseObjectType) getComponent(browseName);
  }

  @Optional
  @Override
  public BaseObjectType getMethodSetNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/DI/", "MethodSet");
    return (BaseObjectType) getComponent(browseName);
  }

  @Optional
  @Override
  public FunctionalGroupType getIdentificationNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/DI/", "Identification");
    return (FunctionalGroupType) getComponent(browseName);
  }

  @Optional
  @Override
  public LockingServicesType getLockNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/DI/", "Lock");
    return (LockingServicesType) getComponent(browseName);
  }
}
