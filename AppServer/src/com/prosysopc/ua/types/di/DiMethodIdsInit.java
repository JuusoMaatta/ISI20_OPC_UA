package com.prosysopc.ua.types.di;

import com.prosysopc.ua.stack.builtintypes.ExpandedNodeId;
import com.prosysopc.ua.stack.builtintypes.UnsignedInteger;

class DiMethodIdsInit {
  static ExpandedNodeId initTopologyElementType_Lock_RenewLock() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/DI/", UnsignedInteger.valueOf(6169L));
  }

  static ExpandedNodeId initTopologyElementType_Lock_ExitLock() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/DI/", UnsignedInteger.valueOf(6171L));
  }

  static ExpandedNodeId initTopologyElementType_MethodSet_MethodIdentifier() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/DI/", UnsignedInteger.valueOf(6018L));
  }

  static ExpandedNodeId initTopologyElementType_Lock_InitLock() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/DI/", UnsignedInteger.valueOf(6166L));
  }

  static ExpandedNodeId initTopologyElementType_Lock_BreakLock() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/DI/", UnsignedInteger.valueOf(6173L));
  }

  static ExpandedNodeId initNetworkType_Lock_InitLock() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/DI/", UnsignedInteger.valueOf(6299L));
  }

  static ExpandedNodeId initNetworkType_Lock_RenewLock() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/DI/", UnsignedInteger.valueOf(6302L));
  }

  static ExpandedNodeId initNetworkType_Lock_ExitLock() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/DI/", UnsignedInteger.valueOf(6304L));
  }

  static ExpandedNodeId initNetworkType_Lock_BreakLock() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/DI/", UnsignedInteger.valueOf(6306L));
  }

  static ExpandedNodeId initTransferServicesType_FetchTransferResultData() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/DI/", UnsignedInteger.valueOf(6531L));
  }

  static ExpandedNodeId initTransferServicesType_TransferToDevice() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/DI/", UnsignedInteger.valueOf(6527L));
  }

  static ExpandedNodeId initTransferServicesType_TransferFromDevice() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/DI/", UnsignedInteger.valueOf(6529L));
  }

  static ExpandedNodeId initLockingServicesType_BreakLock() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/DI/", UnsignedInteger.valueOf(6400L));
  }

  static ExpandedNodeId initLockingServicesType_ExitLock() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/DI/", UnsignedInteger.valueOf(6398L));
  }

  static ExpandedNodeId initLockingServicesType_RenewLock() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/DI/", UnsignedInteger.valueOf(6396L));
  }

  static ExpandedNodeId initLockingServicesType_InitLock() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/DI/", UnsignedInteger.valueOf(6393L));
  }
}
