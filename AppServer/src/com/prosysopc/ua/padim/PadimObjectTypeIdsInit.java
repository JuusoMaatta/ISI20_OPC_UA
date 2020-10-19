package com.prosysopc.ua.padim;

import com.prosysopc.ua.stack.builtintypes.ExpandedNodeId;
import com.prosysopc.ua.stack.builtintypes.UnsignedInteger;

class PadimObjectTypeIdsInit {
  static ExpandedNodeId initPADIMType() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/PADIM/", UnsignedInteger.valueOf(1009L));
  }

  static ExpandedNodeId initSignalSetType() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/PADIM/", UnsignedInteger.valueOf(1021L));
  }

  static ExpandedNodeId initIAdministrationType() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/PADIM/", UnsignedInteger.valueOf(1050L));
  }

  static ExpandedNodeId initISignalSetType() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/PADIM/", UnsignedInteger.valueOf(1052L));
  }

  static ExpandedNodeId initSignalType() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/PADIM/", UnsignedInteger.valueOf(1008L));
  }

  static ExpandedNodeId initAnalogSignalType() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/PADIM/", UnsignedInteger.valueOf(1022L));
  }

  static ExpandedNodeId initControlSignalType() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/PADIM/", UnsignedInteger.valueOf(1023L));
  }

  static ExpandedNodeId initDiscreteSignalType() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/PADIM/", UnsignedInteger.valueOf(1036L));
  }

  static ExpandedNodeId initTwoStateDiscreteSignalType() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/PADIM/", UnsignedInteger.valueOf(1037L));
  }

  static ExpandedNodeId initMultiStateDiscreteSignalType() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/PADIM/", UnsignedInteger.valueOf(1038L));
  }
}
