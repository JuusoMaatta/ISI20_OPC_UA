package com.prosysopc.ua.types.di;

import com.prosysopc.ua.StatusException;
import com.prosysopc.ua.TypeDefinitionId;
import com.prosysopc.ua.nodes.Mandatory;
import com.prosysopc.ua.nodes.UaProperty;
import com.prosysopc.ua.stack.builtintypes.LocalizedText;
import java.lang.String;

/**
 * Generated on 2020-10-19 15:11:09
 */
@TypeDefinitionId("nsu=http://opcfoundation.org/UA/DI/;i=15106")
public interface SoftwareType extends ComponentType {
  String MANUFACTURER = "Manufacturer";

  String MODEL = "Model";

  String SOFTWARE_REVISION = "SoftwareRevision";

  @Mandatory
  UaProperty getManufacturerNode();

  @Mandatory
  LocalizedText getManufacturer();

  @Mandatory
  void setManufacturer(LocalizedText value) throws StatusException;

  @Mandatory
  UaProperty getModelNode();

  @Mandatory
  LocalizedText getModel();

  @Mandatory
  void setModel(LocalizedText value) throws StatusException;

  @Mandatory
  UaProperty getSoftwareRevisionNode();

  @Mandatory
  String getSoftwareRevision();

  @Mandatory
  void setSoftwareRevision(String value) throws StatusException;
}
