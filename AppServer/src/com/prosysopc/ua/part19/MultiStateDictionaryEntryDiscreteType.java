package com.prosysopc.ua.part19;

import com.prosysopc.ua.StatusException;
import com.prosysopc.ua.TypeDefinitionId;
import com.prosysopc.ua.nodes.Mandatory;
import com.prosysopc.ua.nodes.UaProperty;
import com.prosysopc.ua.stack.builtintypes.NodeId;
import java.lang.String;

/**
 * Generated on 2020-10-19 15:11:11
 */
@TypeDefinitionId("nsu=http://opcfoundation.org/UA/Part19/;i=19084")
public interface MultiStateDictionaryEntryDiscreteType extends MultiStateDictionaryEntryDiscreteBaseType {
  String VALUE_AS_DICTIONARY_ENTRIES = "ValueAsDictionaryEntries";

  @Mandatory
  UaProperty getValueAsDictionaryEntriesNode();

  @Mandatory
  NodeId[] getValueAsDictionaryEntries();

  @Mandatory
  void setValueAsDictionaryEntries(NodeId[] value) throws StatusException;
}
