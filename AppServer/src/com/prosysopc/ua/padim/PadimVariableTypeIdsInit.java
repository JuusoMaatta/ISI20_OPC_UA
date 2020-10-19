package com.prosysopc.ua.padim;

import com.prosysopc.ua.stack.builtintypes.ExpandedNodeId;
import com.prosysopc.ua.stack.builtintypes.UnsignedInteger;

class PadimVariableTypeIdsInit {
  static ExpandedNodeId initAnalogSignalVariableType() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/PADIM/", UnsignedInteger.valueOf(1111L));
  }

  static ExpandedNodeId initTemperatureMeasurementVariableType() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/PADIM/", UnsignedInteger.valueOf(1120L));
  }

  static ExpandedNodeId initPressureMeasurementVariableType() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/PADIM/", UnsignedInteger.valueOf(1121L));
  }

  static ExpandedNodeId initFlowMeasurementVariableType() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/PADIM/", UnsignedInteger.valueOf(1122L));
  }

  static ExpandedNodeId initLevelMeasurementVariableType() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/PADIM/", UnsignedInteger.valueOf(1123L));
  }

  static ExpandedNodeId initActualDensityVariableType() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/PADIM/", UnsignedInteger.valueOf(1124L));
  }

  static ExpandedNodeId initControlVariableType() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/PADIM/", UnsignedInteger.valueOf(1125L));
  }

  static ExpandedNodeId initTotalizerVariableType() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/PADIM/", UnsignedInteger.valueOf(1126L));
  }

  static ExpandedNodeId initAnalyticalMeasurementVariableType() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/PADIM/", UnsignedInteger.valueOf(1127L));
  }

  static ExpandedNodeId initMassFlowRateVariableType() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/PADIM/", UnsignedInteger.valueOf(1133L));
  }

  static ExpandedNodeId initActualVolumeFlowRateVariableType() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/PADIM/", UnsignedInteger.valueOf(1134L));
  }

  static ExpandedNodeId initNormalizedVolumeFlowRateVariableType() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/PADIM/", UnsignedInteger.valueOf(1135L));
  }

  static ExpandedNodeId initTwoStateDiscreteSignalVariableType() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/PADIM/", UnsignedInteger.valueOf(1141L));
  }

  static ExpandedNodeId initMultiStateDiscreteSignalVariableType() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/PADIM/", UnsignedInteger.valueOf(1142L));
  }

  static ExpandedNodeId initDiscreteSignalVariableType() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/PADIM/", UnsignedInteger.valueOf(1143L));
  }
}
