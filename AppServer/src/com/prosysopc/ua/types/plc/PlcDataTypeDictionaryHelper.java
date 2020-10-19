package com.prosysopc.ua.types.plc;

import com.prosysopc.ua.stack.builtintypes.ExpandedNodeId;
import com.prosysopc.ua.typedictionary.GeneratedDataTypeDictionary;
import java.lang.String;

/**
 * Generated on 2020-10-19 15:11:11
 */
public class PlcDataTypeDictionaryHelper {
  public static GeneratedDataTypeDictionary createDataTypeDictionary() {
    GeneratedDataTypeDictionary r = new GeneratedDataTypeDictionary("http://PLCopen.org/OpcUa/IEC61131-3/");
    return r;
  }

  private static ExpandedNodeId eni(String id) {
    return ExpandedNodeId.parseExpandedNodeId(id);
  }
}
