package com.prosysopc.ua.padim;

import com.prosysopc.ua.ServiceException;
import com.prosysopc.ua.StatusException;
import com.prosysopc.ua.TypeDefinitionId;
import com.prosysopc.ua.nodes.Mandatory;
import com.prosysopc.ua.nodes.Optional;
import com.prosysopc.ua.nodes.UaMethod;
import java.lang.Float;
import java.lang.String;

/**
 * Generated on 2020-10-19 15:11:10
 */
@TypeDefinitionId("nsu=http://opcfoundation.org/UA/PADIM/;i=1023")
public interface ControlSignalType extends SignalType {
  String CONTROL_SIGNAL = "ControlSignal";

  String AUTO_ADJUST_POSITIONER = "AutoAdjustPositioner";

  @Mandatory
  ControlVariableType getControlSignalNode();

  @Mandatory
  Float getControlSignal();

  @Mandatory
  void setControlSignal(Float value) throws StatusException;

  @Optional
  UaMethod getAutoAdjustPositionerNode();

  void autoAdjustPositioner(ExecutionModeEnum executionMode) throws StatusException,
      ServiceException;
}
