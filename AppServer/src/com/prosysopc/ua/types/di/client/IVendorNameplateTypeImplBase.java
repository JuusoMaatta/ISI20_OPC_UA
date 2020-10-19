package com.prosysopc.ua.types.di.client;

import com.prosysopc.ua.StatusException;
import com.prosysopc.ua.TypeDefinitionId;
import com.prosysopc.ua.client.AddressSpace;
import com.prosysopc.ua.nodes.Optional;
import com.prosysopc.ua.nodes.UaProperty;
import com.prosysopc.ua.nodes.UaVariable;
import com.prosysopc.ua.stack.builtintypes.LocalizedText;
import com.prosysopc.ua.stack.builtintypes.NodeId;
import com.prosysopc.ua.stack.builtintypes.QualifiedName;
import com.prosysopc.ua.types.di.IVendorNameplateType;
import com.prosysopc.ua.types.opcua.client.BaseInterfaceTypeImpl;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;

/**
 * Generated on 2020-10-19 15:11:09
 */
@TypeDefinitionId("nsu=http://opcfoundation.org/UA/DI/;i=15035")
public abstract class IVendorNameplateTypeImplBase extends BaseInterfaceTypeImpl implements IVendorNameplateType {
  protected IVendorNameplateTypeImplBase(AddressSpace addressSpace, NodeId nodeId,
      QualifiedName browseName, LocalizedText displayName) {
    super(addressSpace, nodeId, browseName, displayName);
  }

  @Optional
  @Override
  public UaProperty getManufacturerNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/DI/", "Manufacturer");
    return getProperty(browseName);
  }

  @Optional
  @Override
  public LocalizedText getManufacturer() {
    UaVariable node = getManufacturerNode();
    if (node == null) {
      return null;
    }
    Object value = node.getValue().getValue().getValue();
    return (LocalizedText) value;
  }

  @Optional
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

  @Optional
  @Override
  public UaProperty getModelNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/DI/", "Model");
    return getProperty(browseName);
  }

  @Optional
  @Override
  public LocalizedText getModel() {
    UaVariable node = getModelNode();
    if (node == null) {
      return null;
    }
    Object value = node.getValue().getValue().getValue();
    return (LocalizedText) value;
  }

  @Optional
  @Override
  public void setModel(LocalizedText value) throws StatusException {
    UaVariable node = getModelNode();
    if (node == null) {
      throw new RuntimeException("Setting Model failed, the Optional node does not exist)");
    }
    node.setValue(value);
  }

  @Optional
  @Override
  public UaProperty getHardwareRevisionNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/DI/", "HardwareRevision");
    return getProperty(browseName);
  }

  @Optional
  @Override
  public String getHardwareRevision() {
    UaVariable node = getHardwareRevisionNode();
    if (node == null) {
      return null;
    }
    Object value = node.getValue().getValue().getValue();
    return (String) value;
  }

  @Optional
  @Override
  public void setHardwareRevision(String value) throws StatusException {
    UaVariable node = getHardwareRevisionNode();
    if (node == null) {
      throw new RuntimeException("Setting HardwareRevision failed, the Optional node does not exist)");
    }
    node.setValue(value);
  }

  @Optional
  @Override
  public UaProperty getSoftwareRevisionNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/DI/", "SoftwareRevision");
    return getProperty(browseName);
  }

  @Optional
  @Override
  public String getSoftwareRevision() {
    UaVariable node = getSoftwareRevisionNode();
    if (node == null) {
      return null;
    }
    Object value = node.getValue().getValue().getValue();
    return (String) value;
  }

  @Optional
  @Override
  public void setSoftwareRevision(String value) throws StatusException {
    UaVariable node = getSoftwareRevisionNode();
    if (node == null) {
      throw new RuntimeException("Setting SoftwareRevision failed, the Optional node does not exist)");
    }
    node.setValue(value);
  }

  @Optional
  @Override
  public UaProperty getDeviceRevisionNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/DI/", "DeviceRevision");
    return getProperty(browseName);
  }

  @Optional
  @Override
  public String getDeviceRevision() {
    UaVariable node = getDeviceRevisionNode();
    if (node == null) {
      return null;
    }
    Object value = node.getValue().getValue().getValue();
    return (String) value;
  }

  @Optional
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

  @Optional
  @Override
  public UaProperty getDeviceManualNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/DI/", "DeviceManual");
    return getProperty(browseName);
  }

  @Optional
  @Override
  public String getDeviceManual() {
    UaVariable node = getDeviceManualNode();
    if (node == null) {
      return null;
    }
    Object value = node.getValue().getValue().getValue();
    return (String) value;
  }

  @Optional
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

  @Optional
  @Override
  public UaProperty getSerialNumberNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/DI/", "SerialNumber");
    return getProperty(browseName);
  }

  @Optional
  @Override
  public String getSerialNumber() {
    UaVariable node = getSerialNumberNode();
    if (node == null) {
      return null;
    }
    Object value = node.getValue().getValue().getValue();
    return (String) value;
  }

  @Optional
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

  @Optional
  @Override
  public UaProperty getRevisionCounterNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/DI/", "RevisionCounter");
    return getProperty(browseName);
  }

  @Optional
  @Override
  public Integer getRevisionCounter() {
    UaVariable node = getRevisionCounterNode();
    if (node == null) {
      return null;
    }
    Object value = node.getValue().getValue().getValue();
    return (Integer) value;
  }

  @Optional
  @Override
  public void setRevisionCounter(Integer value) throws StatusException {
    UaVariable node = getRevisionCounterNode();
    if (node == null) {
      throw new RuntimeException("Setting RevisionCounter failed, the Optional node does not exist)");
    }
    node.setValue(value);
  }
}
