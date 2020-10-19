package com.prosysopc.ua.types.di.client;

import com.prosysopc.ua.StatusException;
import com.prosysopc.ua.TypeDefinitionId;
import com.prosysopc.ua.client.AddressSpace;
import com.prosysopc.ua.nodes.Optional;
import com.prosysopc.ua.nodes.UaVariable;
import com.prosysopc.ua.stack.builtintypes.LocalizedText;
import com.prosysopc.ua.stack.builtintypes.NodeId;
import com.prosysopc.ua.stack.builtintypes.QualifiedName;
import com.prosysopc.ua.stack.builtintypes.Variant;
import com.prosysopc.ua.types.di.DeviceHealthEnumeration;
import com.prosysopc.ua.types.di.IDeviceHealthType;
import com.prosysopc.ua.types.opcua.BaseDataVariableType;
import com.prosysopc.ua.types.opcua.FolderType;
import com.prosysopc.ua.types.opcua.client.BaseInterfaceTypeImpl;
import java.lang.Override;
import java.lang.RuntimeException;

/**
 * Generated on 2020-10-19 15:11:09
 */
@TypeDefinitionId("nsu=http://opcfoundation.org/UA/DI/;i=15051")
public abstract class IDeviceHealthTypeImplBase extends BaseInterfaceTypeImpl implements IDeviceHealthType {
  protected IDeviceHealthTypeImplBase(AddressSpace addressSpace, NodeId nodeId,
      QualifiedName browseName, LocalizedText displayName) {
    super(addressSpace, nodeId, browseName, displayName);
  }

  @Optional
  @Override
  public BaseDataVariableType getDeviceHealthNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/DI/", "DeviceHealth");
    return (BaseDataVariableType) getComponent(browseName);
  }

  @Optional
  @Override
  public DeviceHealthEnumeration getDeviceHealth() {
    UaVariable node = getDeviceHealthNode();
    if (node == null) {
      return null;
    }
    Variant value = node.getValue().getValue();
    return (DeviceHealthEnumeration) value.asEnum(DeviceHealthEnumeration.class);
  }

  @Optional
  @Override
  public void setDeviceHealth(DeviceHealthEnumeration value) throws StatusException {
    UaVariable node = getDeviceHealthNode();
    if (node == null) {
      throw new RuntimeException("Setting DeviceHealth failed, the Optional node does not exist)");
    }
    node.setValue(value);
  }

  @Optional
  @Override
  public FolderType getDeviceHealthAlarmsNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/DI/", "DeviceHealthAlarms");
    return (FolderType) getComponent(browseName);
  }
}
