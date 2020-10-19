package com.prosysopc.ua.padim;

import com.prosysopc.ua.StatusException;
import com.prosysopc.ua.TypeDefinitionId;
import com.prosysopc.ua.nodes.Mandatory;
import com.prosysopc.ua.stack.builtintypes.UnsignedInteger;
import java.lang.String;

/**
 * Generated on 2020-10-19 15:11:10
 */
@TypeDefinitionId("nsu=http://opcfoundation.org/UA/PADIM/;i=1038")
public interface MultiStateDiscreteSignalType extends SignalType {
  String MULTI_STATE_DISCRETE_SIGNAL = "MultiStateDiscreteSignal";

  @Mandatory
  MultiStateDiscreteSignalVariableType getMultiStateDiscreteSignalNode();

  @Mandatory
  UnsignedInteger getMultiStateDiscreteSignal();

  @Mandatory
  void setMultiStateDiscreteSignal(UnsignedInteger value) throws StatusException;
}
