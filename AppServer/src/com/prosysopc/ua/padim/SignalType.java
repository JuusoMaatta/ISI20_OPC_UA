package com.prosysopc.ua.padim;

import com.prosysopc.ua.StatusException;
import com.prosysopc.ua.TypeDefinitionId;
import com.prosysopc.ua.nodes.Mandatory;
import com.prosysopc.ua.nodes.UaProperty;
import com.prosysopc.ua.types.opcua.BaseObjectType;
import java.lang.String;

/**
 * Generated on 2020-10-19 15:11:10
 */
@TypeDefinitionId("nsu=http://opcfoundation.org/UA/PADIM/;i=1008")
public interface SignalType extends BaseObjectType {
  String SIGNAL_TAG = "SignalTag";

  @Mandatory
  UaProperty getSignalTagNode();

  @Mandatory
  String getSignalTag();

  @Mandatory
  void setSignalTag(String value) throws StatusException;
}
