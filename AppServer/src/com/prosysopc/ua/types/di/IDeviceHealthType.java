package com.prosysopc.ua.types.di;

import com.prosysopc.ua.StatusException;
import com.prosysopc.ua.TypeDefinitionId;
import com.prosysopc.ua.nodes.Optional;
import com.prosysopc.ua.types.opcua.BaseDataVariableType;
import com.prosysopc.ua.types.opcua.BaseInterfaceType;
import com.prosysopc.ua.types.opcua.FolderType;
import java.lang.String;

/**
 * Generated on 2020-10-19 15:11:09
 */
@TypeDefinitionId("nsu=http://opcfoundation.org/UA/DI/;i=15051")
public interface IDeviceHealthType extends BaseInterfaceType {
  String DEVICE_HEALTH_ALARMS = "DeviceHealthAlarms";

  String DEVICE_HEALTH = "DeviceHealth";

  @Optional
  BaseDataVariableType getDeviceHealthNode();

  @Optional
  DeviceHealthEnumeration getDeviceHealth();

  @Optional
  void setDeviceHealth(DeviceHealthEnumeration value) throws StatusException;

  @Optional
  FolderType getDeviceHealthAlarmsNode();
}
