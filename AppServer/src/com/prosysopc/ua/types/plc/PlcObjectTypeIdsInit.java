package com.prosysopc.ua.types.plc;

import com.prosysopc.ua.stack.builtintypes.ExpandedNodeId;
import com.prosysopc.ua.stack.builtintypes.UnsignedInteger;

class PlcObjectTypeIdsInit {
  static ExpandedNodeId initCtrlConfigurationType() {
    return new ExpandedNodeId("http://PLCopen.org/OpcUa/IEC61131-3/", UnsignedInteger.valueOf(1001L));
  }

  static ExpandedNodeId initCtrlResourceType() {
    return new ExpandedNodeId("http://PLCopen.org/OpcUa/IEC61131-3/", UnsignedInteger.valueOf(1002L));
  }

  static ExpandedNodeId initCtrlProgramOrganizationUnitType() {
    return new ExpandedNodeId("http://PLCopen.org/OpcUa/IEC61131-3/", UnsignedInteger.valueOf(1003L));
  }

  static ExpandedNodeId initCtrlProgramType() {
    return new ExpandedNodeId("http://PLCopen.org/OpcUa/IEC61131-3/", UnsignedInteger.valueOf(1004L));
  }

  static ExpandedNodeId initCtrlFunctionBlockType() {
    return new ExpandedNodeId("http://PLCopen.org/OpcUa/IEC61131-3/", UnsignedInteger.valueOf(1005L));
  }

  static ExpandedNodeId initCtrlTaskType() {
    return new ExpandedNodeId("http://PLCopen.org/OpcUa/IEC61131-3/", UnsignedInteger.valueOf(1006L));
  }

  static ExpandedNodeId initSFCType() {
    return new ExpandedNodeId("http://PLCopen.org/OpcUa/IEC61131-3/", UnsignedInteger.valueOf(1007L));
  }
}
