package com.prosysopc.ua.padim;

import com.prosysopc.ua.stack.builtintypes.ExpandedNodeId;
import com.prosysopc.ua.typedictionary.GeneratedDataTypeDictionary;
import java.lang.String;

/**
 * Generated on 2020-10-19 15:11:10
 */
public class PadimDataTypeDictionaryHelper {
  public static GeneratedDataTypeDictionary createDataTypeDictionary() {
    GeneratedDataTypeDictionary r = new GeneratedDataTypeDictionary("http://opcfoundation.org/UA/PADIM/");
    r.addTypeInformation(eni("nsu=http://opcfoundation.org/UA/PADIM/;i=1156"), "ResetModeEnum", ResetModeEnum.class);
    r.addTypeInformation(eni("nsu=http://opcfoundation.org/UA/PADIM/;i=1158"), "ExecutionModeEnum", ExecutionModeEnum.class);
    return r;
  }

  private static ExpandedNodeId eni(String id) {
    return ExpandedNodeId.parseExpandedNodeId(id);
  }
}
