package com.prosysopc.ua.types.di;

import com.prosysopc.ua.stack.builtintypes.ExpandedNodeId;
import com.prosysopc.ua.typedictionary.GeneratedDataTypeDictionary;
import java.lang.String;

/**
 * Generated on 2020-10-19 15:11:09
 */
public class DiDataTypeDictionaryHelper {
  public static GeneratedDataTypeDictionary createDataTypeDictionary() {
    GeneratedDataTypeDictionary r = new GeneratedDataTypeDictionary("http://opcfoundation.org/UA/DI/");
    r.addTypeInformation(eni("nsu=http://opcfoundation.org/UA/DI/;i=6244"), "DeviceHealthEnumeration", DeviceHealthEnumeration.class);
    r.addTypeInformation(eni("nsu=http://opcfoundation.org/UA/DI/;i=6522"), "FetchResultDataType", FetchResultDataType.class);
    r.addTypeInformation(eni("nsu=http://opcfoundation.org/UA/DI/;i=15888"), "TransferResultErrorDataType", TransferResultErrorDataType.class);
    r.addTypeInformation(eni("nsu=http://opcfoundation.org/UA/DI/;i=15889"), "TransferResultDataDataType", TransferResultDataDataType.class);
    r.addTypeInformation(eni("nsu=http://opcfoundation.org/UA/DI/;i=6525"), "ParameterResultDataType", ParameterResultDataType.class);
    return r;
  }

  private static ExpandedNodeId eni(String id) {
    return ExpandedNodeId.parseExpandedNodeId(id);
  }
}
