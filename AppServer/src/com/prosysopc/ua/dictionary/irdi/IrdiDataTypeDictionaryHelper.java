package com.prosysopc.ua.dictionary.irdi;

import com.prosysopc.ua.stack.builtintypes.ExpandedNodeId;
import com.prosysopc.ua.typedictionary.GeneratedDataTypeDictionary;
import java.lang.String;

/**
 * Generated on 2020-10-19 15:11:10
 */
public class IrdiDataTypeDictionaryHelper {
  public static GeneratedDataTypeDictionary createDataTypeDictionary() {
    GeneratedDataTypeDictionary r = new GeneratedDataTypeDictionary("http://opcfoundation.org/UA/Dictionary/IRDI");
    return r;
  }

  private static ExpandedNodeId eni(String id) {
    return ExpandedNodeId.parseExpandedNodeId(id);
  }
}
