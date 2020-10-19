package com.prosysopc.ua.types.plc;

import com.prosysopc.ua.stack.builtintypes.ExpandedNodeId;
import com.prosysopc.ua.stack.builtintypes.UnsignedInteger;

class PlcReferenceTypeIdsInit {
  static ExpandedNodeId initHasInputVars() {
    return new ExpandedNodeId("http://PLCopen.org/OpcUa/IEC61131-3/", UnsignedInteger.valueOf(4001L));
  }

  static ExpandedNodeId initHasOutputVars() {
    return new ExpandedNodeId("http://PLCopen.org/OpcUa/IEC61131-3/", UnsignedInteger.valueOf(4002L));
  }

  static ExpandedNodeId initHasInOutVars() {
    return new ExpandedNodeId("http://PLCopen.org/OpcUa/IEC61131-3/", UnsignedInteger.valueOf(4003L));
  }

  static ExpandedNodeId initHasLocalVars() {
    return new ExpandedNodeId("http://PLCopen.org/OpcUa/IEC61131-3/", UnsignedInteger.valueOf(4004L));
  }

  static ExpandedNodeId initHasExternalVars() {
    return new ExpandedNodeId("http://PLCopen.org/OpcUa/IEC61131-3/", UnsignedInteger.valueOf(4005L));
  }

  static ExpandedNodeId initWith() {
    return new ExpandedNodeId("http://PLCopen.org/OpcUa/IEC61131-3/", UnsignedInteger.valueOf(4006L));
  }
}
