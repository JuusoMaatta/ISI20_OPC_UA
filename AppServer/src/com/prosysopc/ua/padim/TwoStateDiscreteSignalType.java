package com.prosysopc.ua.padim;

import com.prosysopc.ua.StatusException;
import com.prosysopc.ua.TypeDefinitionId;
import com.prosysopc.ua.nodes.Mandatory;
import java.lang.Boolean;
import java.lang.String;

/**
 * Generated on 2020-10-19 15:11:10
 */
@TypeDefinitionId("nsu=http://opcfoundation.org/UA/PADIM/;i=1037")
public interface TwoStateDiscreteSignalType extends SignalType {
  String TWO_STATE_DISCRETE_SIGNAL = "TwoStateDiscreteSignal";

  @Mandatory
  TwoStateDiscreteSignalVariableType getTwoStateDiscreteSignalNode();

  @Mandatory
  Boolean isTwoStateDiscreteSignal();

  @Mandatory
  void setTwoStateDiscreteSignal(Boolean value) throws StatusException;
}
