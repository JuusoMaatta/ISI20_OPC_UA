package com.prosysopc.ua.padim;

import com.prosysopc.ua.TypeDefinitionId;
import com.prosysopc.ua.nodes.Optional;
import com.prosysopc.ua.types.opcua.BaseInterfaceType;
import java.lang.String;

/**
 * Generated on 2020-10-19 15:11:10
 */
@TypeDefinitionId("nsu=http://opcfoundation.org/UA/PADIM/;i=1052")
public interface ISignalSetType extends BaseInterfaceType {
  String SIGNAL_SET = "SignalSet";

  @Optional
  SignalSetType getSignalSetNode();
}
