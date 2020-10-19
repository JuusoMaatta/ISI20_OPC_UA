package com.prosysopc.ua.types.plc;

import com.prosysopc.ua.stack.builtintypes.ExpandedNodeId;
import com.prosysopc.ua.stack.builtintypes.UnsignedInteger;

class PlcObjectIdsInit {
  static ExpandedNodeId initCtrlConfigurationType_AccessVars() {
    return new ExpandedNodeId("http://PLCopen.org/OpcUa/IEC61131-3/", UnsignedInteger.valueOf(5007L));
  }

  static ExpandedNodeId initCtrlConfigurationType_Configuration() {
    return new ExpandedNodeId("http://PLCopen.org/OpcUa/IEC61131-3/", UnsignedInteger.valueOf(5009L));
  }

  static ExpandedNodeId initCtrlConfigurationType_GlobalVars() {
    return new ExpandedNodeId("http://PLCopen.org/OpcUa/IEC61131-3/", UnsignedInteger.valueOf(5006L));
  }

  static ExpandedNodeId initCtrlConfigurationType_Diagnostic() {
    return new ExpandedNodeId("http://PLCopen.org/OpcUa/IEC61131-3/", UnsignedInteger.valueOf(5010L));
  }

  static ExpandedNodeId initCtrlConfigurationType_Resources_SupportedTypes() {
    return new ExpandedNodeId("http://PLCopen.org/OpcUa/IEC61131-3/", UnsignedInteger.valueOf(5005L));
  }

  static ExpandedNodeId initCtrlConfigurationType_MethodSet() {
    return new ExpandedNodeId("http://PLCopen.org/OpcUa/IEC61131-3/", UnsignedInteger.valueOf(5002L));
  }

  static ExpandedNodeId initCtrlConfigurationType_Resources() {
    return new ExpandedNodeId("http://PLCopen.org/OpcUa/IEC61131-3/", UnsignedInteger.valueOf(5004L));
  }

  static ExpandedNodeId initCtrlConfigurationType_ConfigVars() {
    return new ExpandedNodeId("http://PLCopen.org/OpcUa/IEC61131-3/", UnsignedInteger.valueOf(5008L));
  }

  static ExpandedNodeId initCtrlResourceType_Programs_SupportedTypes() {
    return new ExpandedNodeId("http://PLCopen.org/OpcUa/IEC61131-3/", UnsignedInteger.valueOf(5017L));
  }

  static ExpandedNodeId initCtrlResourceType_Tasks_SupportedTypes() {
    return new ExpandedNodeId("http://PLCopen.org/OpcUa/IEC61131-3/", UnsignedInteger.valueOf(5015L));
  }

  static ExpandedNodeId initCtrlResourceType_MethodSet() {
    return new ExpandedNodeId("http://PLCopen.org/OpcUa/IEC61131-3/", UnsignedInteger.valueOf(5012L));
  }

  static ExpandedNodeId initCtrlResourceType_Programs() {
    return new ExpandedNodeId("http://PLCopen.org/OpcUa/IEC61131-3/", UnsignedInteger.valueOf(5016L));
  }

  static ExpandedNodeId initCtrlResourceType_Tasks() {
    return new ExpandedNodeId("http://PLCopen.org/OpcUa/IEC61131-3/", UnsignedInteger.valueOf(5014L));
  }

  static ExpandedNodeId initCtrlResourceType_Diagnostic() {
    return new ExpandedNodeId("http://PLCopen.org/OpcUa/IEC61131-3/", UnsignedInteger.valueOf(5020L));
  }

  static ExpandedNodeId initCtrlResourceType_Configuration() {
    return new ExpandedNodeId("http://PLCopen.org/OpcUa/IEC61131-3/", UnsignedInteger.valueOf(5019L));
  }

  static ExpandedNodeId initCtrlResourceType_GlobalVars() {
    return new ExpandedNodeId("http://PLCopen.org/OpcUa/IEC61131-3/", UnsignedInteger.valueOf(5018L));
  }
}
