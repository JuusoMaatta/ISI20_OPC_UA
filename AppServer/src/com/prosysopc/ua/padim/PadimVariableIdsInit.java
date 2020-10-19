package com.prosysopc.ua.padim;

import com.prosysopc.ua.stack.builtintypes.ExpandedNodeId;
import com.prosysopc.ua.stack.builtintypes.UnsignedInteger;

class PadimVariableIdsInit {
  static ExpandedNodeId initPADIMType_FactoryReset_InputArguments() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/PADIM/", UnsignedInteger.valueOf(1030L));
  }

  static ExpandedNodeId initPADIMType_DeviceHealth() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/PADIM/", UnsignedInteger.valueOf(1029L));
  }

  static ExpandedNodeId initPADIMType_Model() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/PADIM/", UnsignedInteger.valueOf(1012L));
  }

  static ExpandedNodeId initPADIMType_ProductCode() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/PADIM/", UnsignedInteger.valueOf(1016L));
  }

  static ExpandedNodeId initPADIMType_SerialNumber() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/PADIM/", UnsignedInteger.valueOf(1013L));
  }

  static ExpandedNodeId initPADIMType_RevisionCounter() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/PADIM/", UnsignedInteger.valueOf(1017L));
  }

  static ExpandedNodeId initPADIMType_Manufacturer() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/PADIM/", UnsignedInteger.valueOf(1010L));
  }

  static ExpandedNodeId initPADIMType_SoftwareRevision() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/PADIM/", UnsignedInteger.valueOf(1014L));
  }

  static ExpandedNodeId initPADIMType_HardwareRevision() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/PADIM/", UnsignedInteger.valueOf(1015L));
  }

  static ExpandedNodeId initPADIMType_DisplayLanguage() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/PADIM/", UnsignedInteger.valueOf(1033L));
  }

  static ExpandedNodeId initPADIMType_ProductInstanceUri() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/PADIM/", UnsignedInteger.valueOf(1020L));
  }

  static ExpandedNodeId initPADIMType_DateOfLastChange() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/PADIM/", UnsignedInteger.valueOf(1032L));
  }

  static ExpandedNodeId initPADIMType_ManufacturerUri() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/PADIM/", UnsignedInteger.valueOf(1011L));
  }

  static ExpandedNodeId initPADIMType_AssetId() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/PADIM/", UnsignedInteger.valueOf(1019L));
  }

  static ExpandedNodeId initIAdministrationType_DateOfLastChange() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/PADIM/", UnsignedInteger.valueOf(1070L));
  }

  static ExpandedNodeId initIAdministrationType_FactoryReset_InputArguments() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/PADIM/", UnsignedInteger.valueOf(1080L));
  }

  static ExpandedNodeId initIAdministrationType_DisplayLanguage() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/PADIM/", UnsignedInteger.valueOf(1068L));
  }

  static ExpandedNodeId initAnalogSignalVariableType_SimulationState() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/PADIM/", UnsignedInteger.valueOf(1113L));
  }

  static ExpandedNodeId initAnalogSignalVariableType_ActualValue() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/PADIM/", UnsignedInteger.valueOf(1115L));
  }

  static ExpandedNodeId initAnalogSignalVariableType_SimulationValue() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/PADIM/", UnsignedInteger.valueOf(1117L));
  }

  static ExpandedNodeId initAnalogSignalVariableType_Damping() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/PADIM/", UnsignedInteger.valueOf(1118L));
  }

  static ExpandedNodeId initTemperatureMeasurementVariableType_SensorType() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/PADIM/", UnsignedInteger.valueOf(1128L));
  }

  static ExpandedNodeId initTemperatureMeasurementVariableType_SensorReference() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/PADIM/", UnsignedInteger.valueOf(1130L));
  }

  static ExpandedNodeId initTemperatureMeasurementVariableType_SensorConnection() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/PADIM/", UnsignedInteger.valueOf(1129L));
  }

  static ExpandedNodeId initFlowMeasurementVariableType_FlowDirection() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/PADIM/", UnsignedInteger.valueOf(1132L));
  }

  static ExpandedNodeId initFlowMeasurementVariableType_LowFlowCutOff() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/PADIM/", UnsignedInteger.valueOf(1131L));
  }

  static ExpandedNodeId initControlVariableType_ActuatorType() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/PADIM/", UnsignedInteger.valueOf(1138L));
  }

  static ExpandedNodeId initControlVariableType_OperatingDirection() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/PADIM/", UnsignedInteger.valueOf(1137L));
  }

  static ExpandedNodeId initControlVariableType_Setpoint() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/PADIM/", UnsignedInteger.valueOf(1136L));
  }

  static ExpandedNodeId initTotalizerVariableType_PulseValue() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/PADIM/", UnsignedInteger.valueOf(1139L));
  }

  static ExpandedNodeId initTotalizerVariableType_PulseWidth() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/PADIM/", UnsignedInteger.valueOf(1140L));
  }

  static ExpandedNodeId initTwoStateDiscreteSignalVariableType_SimulationState() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/PADIM/", UnsignedInteger.valueOf(1147L));
  }

  static ExpandedNodeId initTwoStateDiscreteSignalVariableType_SimulationValue() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/PADIM/", UnsignedInteger.valueOf(1145L));
  }

  static ExpandedNodeId initTwoStateDiscreteSignalVariableType_ActualValue() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/PADIM/", UnsignedInteger.valueOf(1144L));
  }

  static ExpandedNodeId initMultiStateDiscreteSignalVariableType_SimulationValue() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/PADIM/", UnsignedInteger.valueOf(1149L));
  }

  static ExpandedNodeId initMultiStateDiscreteSignalVariableType_ActualValue() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/PADIM/", UnsignedInteger.valueOf(1148L));
  }

  static ExpandedNodeId initMultiStateDiscreteSignalVariableType_SimulationState() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/PADIM/", UnsignedInteger.valueOf(1151L));
  }

  static ExpandedNodeId initDiscreteSignalVariableType_SimulationValue() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/PADIM/", UnsignedInteger.valueOf(1153L));
  }

  static ExpandedNodeId initDiscreteSignalVariableType_ActualValue() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/PADIM/", UnsignedInteger.valueOf(1152L));
  }

  static ExpandedNodeId initDiscreteSignalVariableType_SimulationState() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/PADIM/", UnsignedInteger.valueOf(1155L));
  }

  static ExpandedNodeId initResetModeEnum_EnumValues() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/PADIM/", UnsignedInteger.valueOf(1157L));
  }

  static ExpandedNodeId initExecutionModeEnum_EnumValues() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/PADIM/", UnsignedInteger.valueOf(1159L));
  }

  static ExpandedNodeId initSignalType_SignalTag() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/PADIM/", UnsignedInteger.valueOf(1035L));
  }

  static ExpandedNodeId initAnalogSignalType_AnalogSignal() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/PADIM/", UnsignedInteger.valueOf(1027L));
  }

  static ExpandedNodeId initControlSignalType_AutoAdjustPositioner_InputArguments() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/PADIM/", UnsignedInteger.valueOf(1119L));
  }

  static ExpandedNodeId initControlSignalType_ControlSignal() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/PADIM/", UnsignedInteger.valueOf(1031L));
  }

  static ExpandedNodeId initDiscreteSignalType_DiscreteSignal() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/PADIM/", UnsignedInteger.valueOf(1039L));
  }

  static ExpandedNodeId initTwoStateDiscreteSignalType_TwoStateDiscreteSignal() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/PADIM/", UnsignedInteger.valueOf(1040L));
  }

  static ExpandedNodeId initMultiStateDiscreteSignalType_MultiStateDiscreteSignal() {
    return new ExpandedNodeId("http://opcfoundation.org/UA/PADIM/", UnsignedInteger.valueOf(1041L));
  }
}
