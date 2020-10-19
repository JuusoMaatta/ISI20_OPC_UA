package com.prosysopc.ua.padim;

import com.prosysopc.ua.stack.builtintypes.ExpandedNodeId;
import com.prosysopc.ua.stack.builtintypes.UnsignedInteger;

class PadimMethodIdsInit {
  static ExpandedNodeId initPADIMType_FactoryReset() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/PADIM/", UnsignedInteger.valueOf(1028L));
  }

  static ExpandedNodeId initIAdministrationType_FactoryReset() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/PADIM/", UnsignedInteger.valueOf(1072L));
  }

  static ExpandedNodeId initAnalogSignalType_ZeroPointAdjustment() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/PADIM/", UnsignedInteger.valueOf(1109L));
  }

  static ExpandedNodeId initControlSignalType_AutoAdjustPositioner() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/PADIM/", UnsignedInteger.valueOf(1116L));
  }
}
