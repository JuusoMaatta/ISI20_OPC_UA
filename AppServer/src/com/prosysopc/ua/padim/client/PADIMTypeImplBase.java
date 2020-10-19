package com.prosysopc.ua.padim.client;

import com.prosysopc.ua.MethodArgumentTransformer;
import com.prosysopc.ua.MethodCallStatusException;
import com.prosysopc.ua.ServiceException;
import com.prosysopc.ua.StatusException;
import com.prosysopc.ua.TypeDefinitionId;
import com.prosysopc.ua.client.AddressSpace;
import com.prosysopc.ua.nodes.Mandatory;
import com.prosysopc.ua.nodes.Optional;
import com.prosysopc.ua.nodes.UaMethod;
import com.prosysopc.ua.nodes.UaProperty;
import com.prosysopc.ua.nodes.UaVariable;
import com.prosysopc.ua.padim.PADIMType;
import com.prosysopc.ua.padim.ResetModeEnum;
import com.prosysopc.ua.padim.SignalSetType;
import com.prosysopc.ua.stack.builtintypes.DateTime;
import com.prosysopc.ua.stack.builtintypes.LocalizedText;
import com.prosysopc.ua.stack.builtintypes.NodeId;
import com.prosysopc.ua.stack.builtintypes.QualifiedName;
import com.prosysopc.ua.stack.builtintypes.Variant;
import com.prosysopc.ua.stack.transport.AsyncResult;
import com.prosysopc.ua.types.di.ConfigurableObjectType;
import com.prosysopc.ua.types.di.DeviceHealthEnumeration;
import com.prosysopc.ua.types.di.client.ComponentTypeImpl;
import com.prosysopc.ua.types.opcua.BaseDataVariableType;
import com.prosysopc.ua.types.opcua.FolderType;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.lang.Void;

/**
 * Generated on 2020-10-19 15:11:10
 */
@TypeDefinitionId("nsu=http://opcfoundation.org/UA/PADIM/;i=1009")
public abstract class PADIMTypeImplBase extends ComponentTypeImpl implements PADIMType {
  protected PADIMTypeImplBase(AddressSpace addressSpace, NodeId nodeId, QualifiedName browseName,
      LocalizedText displayName) {
    super(addressSpace, nodeId, browseName, displayName);
  }

  @Mandatory
  @Override
  public UaProperty getManufacturerNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/Dictionary/IRDI", "Manufacturer");
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

  @Mandatory
  @Override
  public UaProperty getManufacturerUriNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/Dictionary/IRDI", "ManufacturerUri");
    return getProperty(browseName);
  }

  @Mandatory
  @Override
  public String getManufacturerUri() {
    UaVariable node = getManufacturerUriNode();
    if (node == null) {
      return null;
    }
    Object value = node.getValue().getValue().getValue();
    return (String) value;
  }

  @Mandatory
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
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/Dictionary/IRDI", "Model");
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
  public UaProperty getSerialNumberNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/Dictionary/IRDI", "SerialNumber");
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

  @Mandatory
  @Override
  public UaProperty getSoftwareRevisionNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/Dictionary/IRDI", "SoftwareRevision");
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
  public UaProperty getHardwareRevisionNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/Dictionary/IRDI", "HardwareRevision");
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
  public UaProperty getProductCodeNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/Dictionary/IRDI", "ProductCode");
    return getProperty(browseName);
  }

  @Mandatory
  @Override
  public String getProductCode() {
    UaVariable node = getProductCodeNode();
    if (node == null) {
      return null;
    }
    Object value = node.getValue().getValue().getValue();
    return (String) value;
  }

  @Mandatory
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
  public UaProperty getProductInstanceUriNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/Dictionary/IRDI", "ProductInstanceUri");
    return getProperty(browseName);
  }

  @Mandatory
  @Override
  public String getProductInstanceUri() {
    UaVariable node = getProductInstanceUriNode();
    if (node == null) {
      return null;
    }
    Object value = node.getValue().getValue().getValue();
    return (String) value;
  }

  @Mandatory
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
  public UaProperty getAssetIdNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/Dictionary/IRDI", "AssetId");
    return getProperty(browseName);
  }

  @Mandatory
  @Override
  public String getAssetId() {
    UaVariable node = getAssetIdNode();
    if (node == null) {
      return null;
    }
    Object value = node.getValue().getValue().getValue();
    return (String) value;
  }

  @Mandatory
  @Override
  public void setAssetId(String value) throws StatusException {
    UaVariable node = getAssetIdNode();
    if (node == null) {
      throw new RuntimeException("Setting AssetId failed, the Optional node does not exist)");
    }
    node.setValue(value);
  }

  @Mandatory
  @Override
  public UaProperty getRevisionCounterNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/Dictionary/IRDI", "RevisionCounter");
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

  @Mandatory
  @Override
  public BaseDataVariableType getDeviceHealthNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/Dictionary/IRDI", "DeviceHealth");
    return (BaseDataVariableType) getComponent(browseName);
  }

  @Mandatory
  @Override
  public DeviceHealthEnumeration getDeviceHealth() {
    UaVariable node = getDeviceHealthNode();
    if (node == null) {
      return null;
    }
    Variant value = node.getValue().getValue();
    return (DeviceHealthEnumeration) value.asEnum(DeviceHealthEnumeration.class);
  }

  @Mandatory
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
  public BaseDataVariableType getDateOfLastChangeNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/DI/", "DateOfLastChange");
    return (BaseDataVariableType) getComponent(browseName);
  }

  @Optional
  @Override
  public DateTime getDateOfLastChange() {
    UaVariable node = getDateOfLastChangeNode();
    if (node == null) {
      return null;
    }
    Object value = node.getValue().getValue().getValue();
    return (DateTime) value;
  }

  @Optional
  @Override
  public void setDateOfLastChange(DateTime value) throws StatusException {
    UaVariable node = getDateOfLastChangeNode();
    if (node == null) {
      throw new RuntimeException("Setting DateOfLastChange failed, the Optional node does not exist)");
    }
    node.setValue(value);
  }

  @Optional
  @Override
  public BaseDataVariableType getDisplayLanguageNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/DI/", "DisplayLanguage");
    return (BaseDataVariableType) getComponent(browseName);
  }

  @Optional
  @Override
  public String getDisplayLanguage() {
    UaVariable node = getDisplayLanguageNode();
    if (node == null) {
      return null;
    }
    Object value = node.getValue().getValue().getValue();
    return (String) value;
  }

  @Optional
  @Override
  public void setDisplayLanguage(String value) throws StatusException {
    UaVariable node = getDisplayLanguageNode();
    if (node == null) {
      throw new RuntimeException("Setting DisplayLanguage failed, the Optional node does not exist)");
    }
    node.setValue(value);
  }

  @Optional
  @Override
  public SignalSetType getSignalSet_no_Node() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/DI/", "SignalSet");
    return (SignalSetType) getComponent(browseName);
  }

  @Optional
  @Override
  public FolderType getDeviceHealthAlarmsNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/Dictionary/IRDI", "DeviceHealthAlarms");
    return (FolderType) getComponent(browseName);
  }

  @Optional
  @Override
  public ConfigurableObjectType getSubDevicesNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/DI/", "SubDevices");
    return (ConfigurableObjectType) getComponent(browseName);
  }

  @Optional
  @Override
  public UaMethod getFactoryResetNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/DI/", "FactoryReset");
    return (UaMethod) getComponent(browseName);
  }

  @Override
  public void factoryReset(ResetModeEnum resetMode) throws MethodCallStatusException,
      ServiceException {
    NodeId methodId = getComponentId(getQualifiedName("http://opcfoundation.org/UA/DI/", "FactoryReset"));
    call(methodId, (Object)resetMode);
  }

  public AsyncResult<Void> factoryResetAsync(ResetModeEnum resetMode) {
    NodeId methodId = getComponentId(getQualifiedName("http://opcfoundation.org/UA/DI/", "FactoryReset"));
    return callAsync(methodId, new MethodArgumentTransformer<Void>() {
      @Override
      public Void fromVariantArray(Variant[] values) {
        return null;
      }
    }, (Object)resetMode);
  }
}
