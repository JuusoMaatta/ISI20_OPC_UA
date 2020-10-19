package com.prosysopc.ua.part19;

import com.prosysopc.ua.StatusException;
import com.prosysopc.ua.TypeDefinitionId;
import com.prosysopc.ua.nodes.Mandatory;
import com.prosysopc.ua.nodes.Optional;
import com.prosysopc.ua.nodes.UaProperty;
import com.prosysopc.ua.stack.builtintypes.NodeId;
import com.prosysopc.ua.types.opcua.MultiStateValueDiscreteType;
import java.lang.String;

/**
 * Generated on 2020-10-19 15:11:11
 */
@TypeDefinitionId("nsu=http://opcfoundation.org/UA/Part19/;i=19077")
public interface MultiStateDictionaryEntryDiscreteBaseType extends MultiStateValueDiscreteType {
  String ENUM_DICTIONARY_ENTRIES = "EnumDictionaryEntries";

  String VALUE_AS_DICTIONARY_ENTRIES = "ValueAsDictionaryEntries";

  @Mandatory
  UaProperty getEnumDictionaryEntriesNode();

  @Mandatory
  NodeId[][] getEnumDictionaryEntries();

  @Mandatory
  void setEnumDictionaryEntries(NodeId[][] value) throws StatusException;

  @Optional
  UaProperty getValueAsDictionaryEntriesNode();

  @Optional
  NodeId[] getValueAsDictionaryEntries();

  @Optional
  void setValueAsDictionaryEntries(NodeId[] value) throws StatusException;
}
