package com.prosysopc.ua.part19;

import com.prosysopc.ua.stack.builtintypes.ExpandedNodeId;
import com.prosysopc.ua.stack.builtintypes.UnsignedInteger;

class Part19VariableIdsInit {
  static ExpandedNodeId initMultiStateDictionaryEntryDiscreteBaseType_ValueAsDictionaryEntries() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/Part19/", UnsignedInteger.valueOf(19083L));
  }

  static ExpandedNodeId initMultiStateDictionaryEntryDiscreteBaseType_EnumDictionaryEntries() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/Part19/", UnsignedInteger.valueOf(19082L));
  }

  static ExpandedNodeId initMultiStateDictionaryEntryDiscreteType_ValueAsDictionaryEntries() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/Part19/", UnsignedInteger.valueOf(19090L));
  }
}
