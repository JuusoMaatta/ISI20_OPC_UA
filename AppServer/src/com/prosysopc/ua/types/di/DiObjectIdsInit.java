package com.prosysopc.ua.types.di;

import com.prosysopc.ua.stack.builtintypes.ExpandedNodeId;
import com.prosysopc.ua.stack.builtintypes.UnsignedInteger;

class DiObjectIdsInit {
  static ExpandedNodeId initTopologyElementType_MethodSet() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/DI/", UnsignedInteger.valueOf(5003L));
  }

  static ExpandedNodeId initTopologyElementType_GroupIdentifier() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/DI/", UnsignedInteger.valueOf(6567L));
  }

  static ExpandedNodeId initTopologyElementType_ParameterSet() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/DI/", UnsignedInteger.valueOf(5002L));
  }

  static ExpandedNodeId initTopologyElementType_Lock() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/DI/", UnsignedInteger.valueOf(6161L));
  }

  static ExpandedNodeId initTopologyElementType_Identification() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/DI/", UnsignedInteger.valueOf(6014L));
  }

  static ExpandedNodeId initIDeviceHealthType_DeviceHealthAlarms() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/DI/", UnsignedInteger.valueOf(15053L));
  }

  static ExpandedNodeId initISupportInfoType_ProtocolSupport() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/DI/", UnsignedInteger.valueOf(15059L));
  }

  static ExpandedNodeId initISupportInfoType_DeviceTypeImage() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/DI/", UnsignedInteger.valueOf(15055L));
  }

  static ExpandedNodeId initISupportInfoType_ImageSet() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/DI/", UnsignedInteger.valueOf(15061L));
  }

  static ExpandedNodeId initISupportInfoType_Documentation() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/DI/", UnsignedInteger.valueOf(15057L));
  }

  static ExpandedNodeId initDeviceType_Documentation() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/DI/", UnsignedInteger.valueOf(6211L));
  }

  static ExpandedNodeId initDeviceType_CPIdentifier() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/DI/", UnsignedInteger.valueOf(6571L));
  }

  static ExpandedNodeId initDeviceType_DeviceTypeImage() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/DI/", UnsignedInteger.valueOf(6209L));
  }

  static ExpandedNodeId initDeviceType_ImageSet() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/DI/", UnsignedInteger.valueOf(6215L));
  }

  static ExpandedNodeId initDeviceType_DeviceHealthAlarms() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/DI/", UnsignedInteger.valueOf(15105L));
  }

  static ExpandedNodeId initDeviceType_CPIdentifier_NetworkAddress() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/DI/", UnsignedInteger.valueOf(6592L));
  }

  static ExpandedNodeId initDeviceType_ProtocolSupport() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/DI/", UnsignedInteger.valueOf(6213L));
  }

  static ExpandedNodeId initConfigurableObjectType_SupportedTypes() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/DI/", UnsignedInteger.valueOf(5004L));
  }

  static ExpandedNodeId initConfigurableObjectType_ObjectIdentifier() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/DI/", UnsignedInteger.valueOf(6026L));
  }

  static ExpandedNodeId initFunctionalGroupType_GroupIdentifier() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/DI/", UnsignedInteger.valueOf(6027L));
  }

  static ExpandedNodeId initNetworkType_ProfileIdentifier() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/DI/", UnsignedInteger.valueOf(6596L));
  }

  static ExpandedNodeId initNetworkType_CPIdentifier_NetworkAddress() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/DI/", UnsignedInteger.valueOf(6292L));
  }

  static ExpandedNodeId initNetworkType_CPIdentifier() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/DI/", UnsignedInteger.valueOf(6248L));
  }

  static ExpandedNodeId initNetworkType_Lock() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/DI/", UnsignedInteger.valueOf(6294L));
  }

  static ExpandedNodeId initConnectionPointType_NetworkIdentifier() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/DI/", UnsignedInteger.valueOf(6599L));
  }

  static ExpandedNodeId initConnectionPointType_NetworkAddress() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/DI/", UnsignedInteger.valueOf(6354L));
  }

  static ExpandedNodeId initConnectionPointType_ProfileIdentifier() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/DI/", UnsignedInteger.valueOf(6499L));
  }

  static ExpandedNodeId initFetchResultDataType_DefaultXml() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/DI/", UnsignedInteger.valueOf(6535L));
  }

  static ExpandedNodeId initFetchResultDataType_DefaultJson() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/DI/", UnsignedInteger.valueOf(15909L));
  }

  static ExpandedNodeId initFetchResultDataType_DefaultBinary() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/DI/", UnsignedInteger.valueOf(6551L));
  }

  static ExpandedNodeId initTransferResultErrorDataType_DefaultBinary() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/DI/", UnsignedInteger.valueOf(15891L));
  }

  static ExpandedNodeId initTransferResultErrorDataType_DefaultXml() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/DI/", UnsignedInteger.valueOf(15900L));
  }

  static ExpandedNodeId initTransferResultErrorDataType_DefaultJson() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/DI/", UnsignedInteger.valueOf(15910L));
  }

  static ExpandedNodeId initTransferResultDataDataType_DefaultXml() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/DI/", UnsignedInteger.valueOf(15901L));
  }

  static ExpandedNodeId initTransferResultDataDataType_DefaultBinary() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/DI/", UnsignedInteger.valueOf(15892L));
  }

  static ExpandedNodeId initTransferResultDataDataType_DefaultJson() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/DI/", UnsignedInteger.valueOf(15911L));
  }

  static ExpandedNodeId initParameterResultDataType_DefaultXml() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/DI/", UnsignedInteger.valueOf(6538L));
  }

  static ExpandedNodeId initParameterResultDataType_DefaultJson() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/DI/", UnsignedInteger.valueOf(15912L));
  }

  static ExpandedNodeId initParameterResultDataType_DefaultBinary() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/DI/", UnsignedInteger.valueOf(6554L));
  }
}
