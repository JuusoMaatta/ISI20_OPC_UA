package com.prosysopc.ua.types.di;

import com.prosysopc.ua.stack.builtintypes.ExpandedNodeId;
import com.prosysopc.ua.stack.builtintypes.UnsignedInteger;

class DiDataTypeIdsInit {
  static ExpandedNodeId initDeviceHealthEnumeration() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/DI/", UnsignedInteger.valueOf(6244L));
  }

  static ExpandedNodeId initFetchResultDataType() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/DI/", UnsignedInteger.valueOf(6522L));
  }

  static ExpandedNodeId initTransferResultErrorDataType() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/DI/", UnsignedInteger.valueOf(15888L));
  }

  static ExpandedNodeId initTransferResultDataDataType() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/DI/", UnsignedInteger.valueOf(15889L));
  }

  static ExpandedNodeId initParameterResultDataType() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/DI/", UnsignedInteger.valueOf(6525L));
  }
}
