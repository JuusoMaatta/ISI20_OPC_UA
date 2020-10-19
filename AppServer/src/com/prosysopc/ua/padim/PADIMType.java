package com.prosysopc.ua.padim;

import com.prosysopc.ua.ServiceException;
import com.prosysopc.ua.StatusException;
import com.prosysopc.ua.TypeDefinitionId;
import com.prosysopc.ua.nodes.Mandatory;
import com.prosysopc.ua.nodes.Optional;
import com.prosysopc.ua.nodes.UaMethod;
import com.prosysopc.ua.nodes.UaProperty;
import com.prosysopc.ua.stack.builtintypes.DateTime;
import com.prosysopc.ua.stack.builtintypes.LocalizedText;
import com.prosysopc.ua.types.di.ComponentType;
import com.prosysopc.ua.types.di.ConfigurableObjectType;
import com.prosysopc.ua.types.di.DeviceHealthEnumeration;
import com.prosysopc.ua.types.opcua.BaseDataVariableType;
import com.prosysopc.ua.types.opcua.FolderType;
import java.lang.Integer;
import java.lang.String;

/**
 * Generated on 2020-10-19 15:11:10
 */
@TypeDefinitionId("nsu=http://opcfoundation.org/UA/PADIM/;i=1009")
public interface PADIMType extends ComponentType {
  String MANUFACTURER = "Manufacturer";

  String MANUFACTURER_URI = "ManufacturerUri";

  String MODEL = "Model";

  String SERIAL_NUMBER = "SerialNumber";

  String SOFTWARE_REVISION = "SoftwareRevision";

  String HARDWARE_REVISION = "HardwareRevision";

  String PRODUCT_CODE = "ProductCode";

  String PRODUCT_INSTANCE_URI = "ProductInstanceUri";

  String ASSET_ID = "AssetId";

  String REVISION_COUNTER = "RevisionCounter";

  String SIGNAL_SET_NO_ = "SignalSet";

  String DEVICE_HEALTH_ALARMS = "DeviceHealthAlarms";

  String SUB_DEVICES = "SubDevices";

  String DEVICE_HEALTH = "DeviceHealth";

  String DATE_OF_LAST_CHANGE = "DateOfLastChange";

  String DISPLAY_LANGUAGE = "DisplayLanguage";

  String FACTORY_RESET = "FactoryReset";

  @Mandatory
  UaProperty getManufacturerNode();

  @Mandatory
  LocalizedText getManufacturer();

  @Mandatory
  void setManufacturer(LocalizedText value) throws StatusException;

  @Mandatory
  UaProperty getManufacturerUriNode();

  @Mandatory
  String getManufacturerUri();

  @Mandatory
  void setManufacturerUri(String value) throws StatusException;

  @Mandatory
  UaProperty getModelNode();

  @Mandatory
  LocalizedText getModel();

  @Mandatory
  void setModel(LocalizedText value) throws StatusException;

  @Mandatory
  UaProperty getSerialNumberNode();

  @Mandatory
  String getSerialNumber();

  @Mandatory
  void setSerialNumber(String value) throws StatusException;

  @Mandatory
  UaProperty getSoftwareRevisionNode();

  @Mandatory
  String getSoftwareRevision();

  @Mandatory
  void setSoftwareRevision(String value) throws StatusException;

  @Mandatory
  UaProperty getHardwareRevisionNode();

  @Mandatory
  String getHardwareRevision();

  @Mandatory
  void setHardwareRevision(String value) throws StatusException;

  @Mandatory
  UaProperty getProductCodeNode();

  @Mandatory
  String getProductCode();

  @Mandatory
  void setProductCode(String value) throws StatusException;

  @Mandatory
  UaProperty getProductInstanceUriNode();

  @Mandatory
  String getProductInstanceUri();

  @Mandatory
  void setProductInstanceUri(String value) throws StatusException;

  @Mandatory
  UaProperty getAssetIdNode();

  @Mandatory
  String getAssetId();

  @Mandatory
  void setAssetId(String value) throws StatusException;

  @Mandatory
  UaProperty getRevisionCounterNode();

  @Mandatory
  Integer getRevisionCounter();

  @Mandatory
  void setRevisionCounter(Integer value) throws StatusException;

  @Mandatory
  BaseDataVariableType getDeviceHealthNode();

  @Mandatory
  DeviceHealthEnumeration getDeviceHealth();

  @Mandatory
  void setDeviceHealth(DeviceHealthEnumeration value) throws StatusException;

  @Optional
  BaseDataVariableType getDateOfLastChangeNode();

  @Optional
  DateTime getDateOfLastChange();

  @Optional
  void setDateOfLastChange(DateTime value) throws StatusException;

  @Optional
  BaseDataVariableType getDisplayLanguageNode();

  @Optional
  String getDisplayLanguage();

  @Optional
  void setDisplayLanguage(String value) throws StatusException;

  @Optional
  SignalSetType getSignalSet_no_Node();

  @Optional
  FolderType getDeviceHealthAlarmsNode();

  @Optional
  ConfigurableObjectType getSubDevicesNode();

  @Optional
  UaMethod getFactoryResetNode();

  void factoryReset(ResetModeEnum resetMode) throws StatusException, ServiceException;
}
