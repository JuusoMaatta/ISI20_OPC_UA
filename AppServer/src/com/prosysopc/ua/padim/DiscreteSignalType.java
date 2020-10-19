package com.prosysopc.ua.padim;

import com.prosysopc.ua.StatusException;
import com.prosysopc.ua.TypeDefinitionId;
import com.prosysopc.ua.nodes.Mandatory;
import java.lang.Object;
import java.lang.String;

/**
 * Generated on 2020-10-19 15:11:10
 */
@TypeDefinitionId("nsu=http://opcfoundation.org/UA/PADIM/;i=1036")
public interface DiscreteSignalType extends SignalType {
  String DISCRETE_SIGNAL = "DiscreteSignal";

  @Mandatory
  DiscreteSignalVariableType getDiscreteSignalNode();

  @Mandatory
  Object getDiscreteSignal();

  @Mandatory
  void setDiscreteSignal(Object value) throws StatusException;
}
