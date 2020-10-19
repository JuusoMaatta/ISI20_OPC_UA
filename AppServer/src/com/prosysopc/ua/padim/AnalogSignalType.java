package com.prosysopc.ua.padim;

import com.prosysopc.ua.ServiceException;
import com.prosysopc.ua.StatusException;
import com.prosysopc.ua.TypeDefinitionId;
import com.prosysopc.ua.nodes.Mandatory;
import com.prosysopc.ua.nodes.Optional;
import com.prosysopc.ua.nodes.UaMethod;
import java.lang.Object;
import java.lang.String;

/**
 * Generated on 2020-10-19 15:11:10
 */
@TypeDefinitionId("nsu=http://opcfoundation.org/UA/PADIM/;i=1022")
public interface AnalogSignalType extends SignalType {
  String ANALOG_SIGNAL = "AnalogSignal";

  String ZERO_POINT_ADJUSTMENT = "ZeroPointAdjustment";

  @Mandatory
  AnalogSignalVariableType getAnalogSignalNode();

  @Mandatory
  Object getAnalogSignal();

  @Mandatory
  void setAnalogSignal(Object value) throws StatusException;

  @Optional
  UaMethod getZeroPointAdjustmentNode();

  void zeroPointAdjustment() throws StatusException, ServiceException;
}
