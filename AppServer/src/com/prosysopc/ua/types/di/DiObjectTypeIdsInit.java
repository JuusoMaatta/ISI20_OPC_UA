package com.prosysopc.ua.types.di;

import com.prosysopc.ua.stack.builtintypes.ExpandedNodeId;
import com.prosysopc.ua.stack.builtintypes.UnsignedInteger;

class DiObjectTypeIdsInit {
  static ExpandedNodeId initTopologyElementType() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/DI/", UnsignedInteger.valueOf(1001L));
  }

  static ExpandedNodeId initIVendorNameplateType() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/DI/", UnsignedInteger.valueOf(15035L));
  }

  static ExpandedNodeId initITagNameplateType() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/DI/", UnsignedInteger.valueOf(15048L));
  }

  static ExpandedNodeId initIDeviceHealthType() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/DI/", UnsignedInteger.valueOf(15051L));
  }

  static ExpandedNodeId initISupportInfoType() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/DI/", UnsignedInteger.valueOf(15054L));
  }

  static ExpandedNodeId initComponentType() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/DI/", UnsignedInteger.valueOf(15063L));
  }

  static ExpandedNodeId initDeviceType() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/DI/", UnsignedInteger.valueOf(1002L));
  }

  static ExpandedNodeId initSoftwareType() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/DI/", UnsignedInteger.valueOf(15106L));
  }

  static ExpandedNodeId initBlockType() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/DI/", UnsignedInteger.valueOf(1003L));
  }

  static ExpandedNodeId initDeviceHealthDiagnosticAlarmType() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/DI/", UnsignedInteger.valueOf(15143L));
  }

  static ExpandedNodeId initFailureAlarmType() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/DI/", UnsignedInteger.valueOf(15292L));
  }

  static ExpandedNodeId initCheckFunctionAlarmType() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/DI/", UnsignedInteger.valueOf(15441L));
  }

  static ExpandedNodeId initOffSpecAlarmType() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/DI/", UnsignedInteger.valueOf(15590L));
  }

  static ExpandedNodeId initMaintenanceRequiredAlarmType() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/DI/", UnsignedInteger.valueOf(15739L));
  }

  static ExpandedNodeId initConfigurableObjectType() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/DI/", UnsignedInteger.valueOf(1004L));
  }

  static ExpandedNodeId initFunctionalGroupType() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/DI/", UnsignedInteger.valueOf(1005L));
  }

  static ExpandedNodeId initProtocolType() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/DI/", UnsignedInteger.valueOf(1006L));
  }

  static ExpandedNodeId initNetworkType() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/DI/", UnsignedInteger.valueOf(6247L));
  }

  static ExpandedNodeId initConnectionPointType() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/DI/", UnsignedInteger.valueOf(6308L));
  }

  static ExpandedNodeId initTransferServicesType() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/DI/", UnsignedInteger.valueOf(6526L));
  }

  static ExpandedNodeId initLockingServicesType() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/DI/", UnsignedInteger.valueOf(6388L));
  }
}
