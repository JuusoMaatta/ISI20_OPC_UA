package com.prosysopc.ua.types.di.client;

import com.prosysopc.ua.StatusException;
import com.prosysopc.ua.TypeDefinitionId;
import com.prosysopc.ua.client.AddressSpace;
import com.prosysopc.ua.nodes.Mandatory;
import com.prosysopc.ua.nodes.Optional;
import com.prosysopc.ua.nodes.UaProperty;
import com.prosysopc.ua.nodes.UaVariable;
import com.prosysopc.ua.stack.builtintypes.LocalizedText;
import com.prosysopc.ua.stack.builtintypes.NodeId;
import com.prosysopc.ua.stack.builtintypes.QualifiedName;
import com.prosysopc.ua.stack.builtintypes.Variant;
import com.prosysopc.ua.types.di.DeviceHealthEnumeration;
import com.prosysopc.ua.types.di.DeviceType;
import com.prosysopc.ua.types.opcua.BaseDataVariableType;
import com.prosysopc.ua.types.opcua.FolderType;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;

/**
 * Defines the basic information components for all configurable elements in a device topology
 * <p>
 * Generated on 2020-10-19 15:11:09
 */
@TypeDefinitionId("nsu=http://opcfoundation.org/UA/DI/;i=1002")
public abstract class DeviceTypeImplBase extends ComponentTypeImpl implements DeviceType {
  protected DeviceTypeImplBase(AddressSpace addressSpace, NodeId nodeId, QualifiedName browseName,
      LocalizedText displayName) {
    super(addressSpace, nodeId, browseName, displayName);
  }

  @Mandatory
  @Override
  public UaProperty getManufacturerNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/DI/", "Manufacturer");
    return getProperty(browseName);
  }

  @Mandatory
  @Override
  public LocalizedText getManufacturer() {
    UaVariable node = getManufacturerNode();
    if (node == null) {
      return null;
    }
    Object value = node.getValue().getValue().getValue();
    return (LocalizedText) value;
  }

  @Mandatory
  @Override
  public void setManufacturer(LocalizedText value) throws StatusException {
    UaVariable node = getManufacturerNode();
    if (node == null) {
      throw new RuntimeException("Setting Manufacturer failed, the Optional node does not exist)");
    }
    node.setValue(value);
  }

  @Optional
  @Override
  public UaProperty getManufacturerUriNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/DI/", "ManufacturerUri");
    return getProperty(browseName);
  }

  @Optional
  @Override
  public String getManufacturerUri() {
    UaVariable node = getManufacturerUriNode();
    if (node == null) {
      return null;
    }
    Object value = node.getValue().getValue().getValue();
    return (String) value;
  }

  @Optional
  @Override
  public void setManufacturerUri(String value) throws StatusException {
    UaVariable node = getManufacturerUriNode();
    if (node == null) {
      throw new RuntimeException("Setting ManufacturerUri failed, the Optional node does not exist)");
    }
    node.setValue(value);
  }

  @Mandatory
  @Override
  public UaProperty getModelNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/DI/", "Model");
    return getProperty(browseName);
  }

  @Mandatory
  @Override
  public LocalizedText getModel() {
    UaVariable node = getModelNode();
    if (node == null) {
      return null;
    }
    Object value = node.getValue().getValue().getValue();
    return (LocalizedText) value;
  }

  @Mandatory
  @Override
  public void setModel(LocalizedText value) throws StatusException {
    UaVariable node = getModelNode();
    if (node == null) {
      throw new RuntimeException("Setting Model failed, the Optional node does not exist)");
    }
    node.setValue(value);
  }

  @Mandatory
  @Override
  public UaProperty getHardwareRevisionNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/DI/", "HardwareRevision");
    return getProperty(browseName);
  }

  @Mandatory
  @Override
  public String getHardwareRevision() {
    UaVariable node = getHardwareRevisionNode();
    if (node == null) {
      return null;
    }
    Object value = node.getValue().getValue().getValue();
    return (String) value;
  }

  @Mandatory
  @Override
  public void setHardwareRevision(String value) throws StatusException {
    UaVariable node = getHardwareRevisionNode();
    if (node == null) {
      throw new RuntimeException("Setting HardwareRevision failed, the Optional node does not exist)");
    }
    node.setValue(value);
  }

  @Mandatory
  @Override
  public UaProperty getSoftwareRevisionNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/DI/", "SoftwareRevision");
    return getProperty(browseName);
  }

  @Mandatory
  @Override
  public String getSoftwareRevision() {
    UaVariable node = getSoftwareRevisionNode();
    if (node == null) {
      return null;
    }
    Object value = node.getValue().getValue().getValue();
    return (String) value;
  }

  @Mandatory
  @Override
  public void setSoftwareRevision(String value) throws StatusException {
    UaVariable node = getSoftwareRevisionNode();
    if (node == null) {
      throw new RuntimeException("Setting SoftwareRevision failed, the Optional node does not exist)");
    }
    node.setValue(value);
  }

  @Mandatory
  @Override
  public UaProperty getDeviceRevisionNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/DI/", "DeviceRevision");
    return getProperty(browseName);
  }

  @Mandatory
  @Override
  public String getDeviceRevision() {
    UaVariable node = getDeviceRevisionNode();
    if (node == null) {
      return null;
    }
    Object value = node.getValue().getValue().getValue();
    return (String) value;
  }

  @Mandatory
  @Override
  public void setDeviceRevision(String value) throws StatusException {
    UaVariable node = getDeviceRevisionNode();
    if (node == null) {
      throw new RuntimeException("Setting DeviceRevision failed, the Optional node does not exist)");
    }
    node.setValue(value);
  }

  @Optional
  @Override
  public UaProperty getProductCodeNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/DI/", "ProductCode");
    return getProperty(browseName);
  }

  @Optional
  @Override
  public String getProductCode() {
    UaVariable node = getProductCodeNode();
    if (node == null) {
      return null;
    }
    Object value = node.getValue().getValue().getValue();
    return (String) value;
  }

  @Optional
  @Override
  public void setProductCode(String value) throws StatusException {
    UaVariable node = getProductCodeNode();
    if (node == null) {
      throw new RuntimeException("Setting ProductCode failed, the Optional node does not exist)");
    }
    node.setValue(value);
  }

  @Mandatory
  @Override
  public UaProperty getDeviceManualNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/DI/", "DeviceManual");
    return getProperty(browseName);
  }

  @Mandatory
  @Override
  public String getDeviceManual() {
    UaVariable node = getDeviceManualNode();
    if (node == null) {
      return null;
    }
    Object value = node.getValue().getValue().getValue();
    return (String) value;
  }

  @Mandatory
  @Override
  public void setDeviceManual(String value) throws StatusException {
    UaVariable node = getDeviceManualNode();
    if (node == null) {
      throw new RuntimeException("Setting DeviceManual failed, the Optional node does not exist)");
    }
    node.setValue(value);
  }

  @Optional
  @Override
  public UaProperty getDeviceClassNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/DI/", "DeviceClass");
    return getProperty(browseName);
  }

  @Optional
  @Override
  public String getDeviceClass() {
    UaVariable node = getDeviceClassNode();
    if (node == null) {
      return null;
    }
    Object value = node.getValue().getValue().getValue();
    return (String) value;
  }

  @Optional
  @Override
  public void setDeviceClass(String value) throws StatusException {
    UaVariable node = getDeviceClassNode();
    if (node == null) {
      throw new RuntimeException("Setting DeviceClass failed, the Optional node does not exist)");
    }
    node.setValue(value);
  }

  @Mandatory
  @Override
  public UaProperty getSerialNumberNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/DI/", "SerialNumber");
    return getProperty(browseName);
  }

  @Mandatory
  @Override
  public String getSerialNumber() {
    UaVariable node = getSerialNumberNode();
    if (node == null) {
      return null;
    }
    Object value = node.getValue().getValue().getValue();
    return (String) value;
  }

  @Mandatory
  @Override
  public void setSerialNumber(String value) throws StatusException {
    UaVariable node = getSerialNumberNode();
    if (node == null) {
      throw new RuntimeException("Setting SerialNumber failed, the Optional node does not exist)");
    }
    node.setValue(value);
  }

  @Optional
  @Override
  public UaProperty getProductInstanceUriNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/DI/", "ProductInstanceUri");
    return getProperty(browseName);
  }

  @Optional
  @Override
  public String getProductInstanceUri() {
    UaVariable node = getProductInstanceUriNode();
    if (node == null) {
      return null;
    }
    Object value = node.getValue().getValue().getValue();
    return (String) value;
  }

  @Optional
  @Override
  public void setProductInstanceUri(String value) throws StatusException {
    UaVariable node = getProductInstanceUriNode();
    if (node == null) {
      throw new RuntimeException("Setting ProductInstanceUri failed, the Optional node does not exist)");
    }
    node.setValue(value);
  }

  @Mandatory
  @Override
  public UaProperty getRevisionCounterNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/DI/", "RevisionCounter");
    return getProperty(browseName);
  }

  @Mandatory
  @Override
  public Integer getRevisionCounter() {
    UaVariable node = getRevisionCounterNode();
    if (node == null) {
      return null;
    }
    Object value = node.getValue().getValue().getValue();
    return (Integer) value;
  }

  @Mandatory
  @Override
  public void setRevisionCounter(Integer value) throws StatusException {
    UaVariable node = getRevisionCounterNode();
    if (node == null) {
      throw new RuntimeException("Setting RevisionCounter failed, the Optional node does not exist)");
    }
    node.setValue(value);
  }

  @Optional
  @Override
  public BaseDataVariableType getDeviceHealthNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/DI/", "DeviceHealth");
    return (BaseDataVariableType) getComponent(browseName);
  }

  @Optional
  @Override
  public DeviceHealthEnumeration getDeviceHealth() {
    UaVariable node = getDeviceHealthNode();
    if (node == null) {
      return null;
    }
    Variant value = node.getValue().getValue();
    return (DeviceHealthEnumeration) value.asEnum(DeviceHealthEnumeration.class);
  }

  @Optional
  @Override
  public void setDeviceHealth(DeviceHealthEnumeration value) throws StatusException {
    UaVariable node = getDeviceHealthNode();
    if (node == null) {
      throw new RuntimeException("Setting DeviceHealth failed, the Optional node does not exist)");
    }
    node.setValue(value);
  }

  @Optional
  @Override
  public FolderType getDeviceHealthAlarmsNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/DI/", "DeviceHealthAlarms");
    return (FolderType) getComponent(browseName);
  }

  @Optional
  @Override
  public FolderType getDeviceTypeImageNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/DI/", "DeviceTypeImage");
    return (FolderType) getComponent(browseName);
  }

  @Optional
  @Override
  public FolderType getDocumentationNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/DI/", "Documentation");
    return (FolderType) getComponent(browseName);
  }

  @Optional
  @Override
  public FolderType getProtocolSupportNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/DI/", "ProtocolSupport");
    return (FolderType) getComponent(browseName);
  }

  @Optional
  @Override
  public FolderType getImageSetNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/DI/", "ImageSet");
    return (FolderType) getComponent(browseName);
  }
}
