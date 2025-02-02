package com.prosysopc.ua.types.di;

import com.prosysopc.ua.stack.builtintypes.ExpandedNodeId;
import com.prosysopc.ua.stack.builtintypes.UnsignedInteger;

class DiReferenceTypeIdsInit {
  static ExpandedNodeId initConnectsTo() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/DI/", UnsignedInteger.valueOf(6030L));
  }

  static ExpandedNodeId initConnectsToParent() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/DI/", UnsignedInteger.valueOf(6467L));
  }

  static ExpandedNodeId initIsOnline() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/DI/", UnsignedInteger.valueOf(6031L));
  }
}
