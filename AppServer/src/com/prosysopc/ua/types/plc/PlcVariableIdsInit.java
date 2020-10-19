package com.prosysopc.ua.types.plc;

import com.prosysopc.ua.stack.builtintypes.ExpandedNodeId;
import com.prosysopc.ua.stack.builtintypes.UnsignedInteger;

class PlcVariableIdsInit {
  static ExpandedNodeId initCtrlProgramOrganizationUnitType_Body() {
    return new ExpandedNodeId("http://PLCopen.org/OpcUa/IEC61131-3/", UnsignedInteger.valueOf(6001L));
  }

  static ExpandedNodeId initCtrlProgramType_Program() {
    return new ExpandedNodeId("http://PLCopen.org/OpcUa/IEC61131-3/", UnsignedInteger.valueOf(6002L));
  }

  static ExpandedNodeId initCtrlFunctionBlockType_FunctionBlock() {
    return new ExpandedNodeId("http://PLCopen.org/OpcUa/IEC61131-3/", UnsignedInteger.valueOf(6003L));
  }

  static ExpandedNodeId initCtrlTaskType_Priority() {
    return new ExpandedNodeId("http://PLCopen.org/OpcUa/IEC61131-3/", UnsignedInteger.valueOf(6004L));
  }

  static ExpandedNodeId initCtrlTaskType_Interval() {
    return new ExpandedNodeId("http://PLCopen.org/OpcUa/IEC61131-3/", UnsignedInteger.valueOf(6005L));
  }

  static ExpandedNodeId initCtrlTaskType_Single() {
    return new ExpandedNodeId("http://PLCopen.org/OpcUa/IEC61131-3/", UnsignedInteger.valueOf(6006L));
  }
}
