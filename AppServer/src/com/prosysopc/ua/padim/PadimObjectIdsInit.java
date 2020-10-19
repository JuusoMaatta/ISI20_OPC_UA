package com.prosysopc.ua.padim;

import com.prosysopc.ua.stack.builtintypes.ExpandedNodeId;
import com.prosysopc.ua.stack.builtintypes.UnsignedInteger;

class PadimObjectIdsInit {
  static ExpandedNodeId initPADIMType_SignalSet_no_() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/PADIM/", UnsignedInteger.valueOf(1034L));
  }

  static ExpandedNodeId initPADIMType_DeviceHealthAlarms() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/PADIM/", UnsignedInteger.valueOf(1018L));
  }

  static ExpandedNodeId initPADIMType_SubDevices_SupportedTypes() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/PADIM/", UnsignedInteger.valueOf(1026L));
  }

  static ExpandedNodeId initPADIMType_SubDevices() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/PADIM/", UnsignedInteger.valueOf(1025L));
  }

  static ExpandedNodeId initSignalSetType_S_SignalIdentifier_() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/PADIM/", UnsignedInteger.valueOf(1024L));
  }

  static ExpandedNodeId initISignalSetType_SignalSet() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/PADIM/", UnsignedInteger.valueOf(1074L));
  }
}
