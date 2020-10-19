package com.prosysopc.ua.types.plc;

import com.prosysopc.ua.stack.builtintypes.ExpandedNodeId;
import com.prosysopc.ua.stack.builtintypes.UnsignedInteger;

class PlcMethodIdsInit {
  static ExpandedNodeId initCtrlConfigurationType_MethodSet_Stop() {
    return new ExpandedNodeId("http://PLCopen.org/OpcUa/IEC61131-3/", UnsignedInteger.valueOf(7002L));
  }

  static ExpandedNodeId initCtrlConfigurationType_MethodSet_Start() {
    return new ExpandedNodeId("http://PLCopen.org/OpcUa/IEC61131-3/", UnsignedInteger.valueOf(7001L));
  }

  static ExpandedNodeId initCtrlResourceType_MethodSet_Stop() {
    return new ExpandedNodeId("http://PLCopen.org/OpcUa/IEC61131-3/", UnsignedInteger.valueOf(7004L));
  }

  static ExpandedNodeId initCtrlResourceType_MethodSet_Start() {
    return new ExpandedNodeId("http://PLCopen.org/OpcUa/IEC61131-3/", UnsignedInteger.valueOf(7003L));
  }
}
