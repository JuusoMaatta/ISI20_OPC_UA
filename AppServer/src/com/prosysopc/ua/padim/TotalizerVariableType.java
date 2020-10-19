package com.prosysopc.ua.padim;

import com.prosysopc.ua.StatusException;
import com.prosysopc.ua.TypeDefinitionId;
import com.prosysopc.ua.nodes.Mandatory;
import com.prosysopc.ua.nodes.UaProperty;
import java.lang.Float;
import java.lang.Object;
import java.lang.String;

/**
 * Generated on 2020-10-19 15:11:10
 */
@TypeDefinitionId("nsu=http://opcfoundation.org/UA/PADIM/;i=1126")
public interface TotalizerVariableType extends AnalogSignalVariableType {
  String PULSE_VALUE = "PulseValue";

  String PULSE_WIDTH = "PulseWidth";

  @Mandatory
  UaProperty getPulseValueNode();

  @Mandatory
  Object getPulseValue();

  @Mandatory
  void setPulseValue(Object value) throws StatusException;

  @Mandatory
  UaProperty getPulseWidthNode();

  @Mandatory
  Float getPulseWidth();

  @Mandatory
  void setPulseWidth(Float value) throws StatusException;
}
