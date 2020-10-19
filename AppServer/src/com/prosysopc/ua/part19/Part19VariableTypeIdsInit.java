package com.prosysopc.ua.part19;

import com.prosysopc.ua.stack.builtintypes.ExpandedNodeId;
import com.prosysopc.ua.stack.builtintypes.UnsignedInteger;

class Part19VariableTypeIdsInit {
  static ExpandedNodeId initMultiStateDictionaryEntryDiscreteBaseType() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/Part19/", UnsignedInteger.valueOf(19077L));
  }

  static ExpandedNodeId initMultiStateDictionaryEntryDiscreteType() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/Part19/", UnsignedInteger.valueOf(19084L));
  }
}
