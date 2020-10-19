package com.prosysopc.ua.padim.server;

import com.prosysopc.ua.StatusException;
import com.prosysopc.ua.TypeDefinitionId;
import com.prosysopc.ua.nodes.Mandatory;
import com.prosysopc.ua.nodes.Optional;
import com.prosysopc.ua.nodes.UaMethod;
import com.prosysopc.ua.nodes.UaProperty;
import com.prosysopc.ua.nodes.UaVariable;
import com.prosysopc.ua.padim.PADIMType;
import com.prosysopc.ua.padim.ResetModeEnum;
import com.prosysopc.ua.server.GeneratedNodeInitializer;
import com.prosysopc.ua.server.NodeManagerUaNode;
import com.prosysopc.ua.server.ServiceContext;
import com.prosysopc.ua.stack.builtintypes.DateTime;
import com.prosysopc.ua.stack.builtintypes.DiagnosticInfo;
import com.prosysopc.ua.stack.builtintypes.LocalizedText;
import com.prosysopc.ua.stack.builtintypes.NodeId;
import com.prosysopc.ua.stack.builtintypes.QualifiedName;
import com.prosysopc.ua.stack.builtintypes.StatusCode;
import com.prosysopc.ua.stack.builtintypes.Variant;
import com.prosysopc.ua.types.di.DeviceHealthEnumeration;
import com.prosysopc.ua.types.di.server.ComponentTypeNode;
import com.prosysopc.ua.types.di.server.ConfigurableObjectTypeNode;
import com.prosysopc.ua.types.opcua.server.BaseDataVariableTypeNode;
import com.prosysopc.ua.types.opcua.server.FolderTypeNode;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;

/**
 * Generated on 2020-10-19 15:11:10
 */
@TypeDefinitionId("nsu=http://opcfoundation.org/UA/PADIM/;i=1009")
public abstract class PADIMTypeNodeBase extends ComponentTypeNode implements PADIMType {
  private static GeneratedNodeInitializer<PADIMTypeNode> pADIMTypeNodeInitializer;

  private static PADIMTypeFactoryResetMethod factoryResetMethodImplementation;

  protected PADIMTypeNodeBase(NodeManagerUaNode nodeManager, NodeId nodeId,
      QualifiedName browseName, LocalizedText displayName) {
    super(nodeManager, nodeId, browseName, displayName);
  }

  @Override
  public void afterCreate() {
    super.afterCreate();

    // Call afterCreate for each sub-node (if the node has any)
    callAfterCreateIfExists(getDeviceHealthNode());
    callAfterCreateIfExists(getDateOfLastChangeNode());
    callAfterCreateIfExists(getDisplayLanguageNode());
    callAfterCreateIfExists(getSignalSet_no_Node());
    callAfterCreateIfExists(getDeviceHealthAlarmsNode());
    callAfterCreateIfExists(getSubDevicesNode());
    GeneratedNodeInitializer<PADIMTypeNode> impl = getPADIMTypeNodeInitializer();
    if(impl != null) {
      impl.init((PADIMTypeNode)this);
    }
  }

  public static GeneratedNodeInitializer<PADIMTypeNode> getPADIMTypeNodeInitializer() {
    return pADIMTypeNodeInitializer;
  }

  public static void setPADIMTypeNodeInitializer(GeneratedNodeInitializer<PADIMTypeNode> pADIMTypeNodeInitializerNewValue) {
    pADIMTypeNodeInitializer=pADIMTypeNodeInitializerNewValue;
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
      throw new RuntimeException("Mandatory node Manufacturer does not exist");
    }
    Object value = node.getValue().getValue().getValue();
    return (LocalizedText) value;
  }

  @Mandatory
  @Override
  public void setManufacturer(LocalizedText value) {
    UaVariable node = getManufacturerNode();
    if (node == null) {
      throw new RuntimeException("Setting Manufacturer failed: does not exist (Optional Nodes must be configured in NodeBuilder)");
    }
    try {
      node.setValue(value);
    } catch(StatusException e) {
      throw new RuntimeException("Setting Manufacturer failed unexpectedly", e);
    }
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
      throw new RuntimeException("Mandatory node ManufacturerUri does not exist");
    }
    Object value = node.getValue().getValue().getValue();
    return (String) value;
  }

  @Mandatory
  @Override
  public void setManufacturerUri(String value) {
    UaVariable node = getManufacturerUriNode();
    if (node == null) {
      throw new RuntimeException("Setting ManufacturerUri failed: does not exist (Optional Nodes must be configured in NodeBuilder)");
    }
    try {
      node.setValue(value);
    } catch(StatusException e) {
      throw new RuntimeException("Setting ManufacturerUri failed unexpectedly", e);
    }
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
      throw new RuntimeException("Mandatory node Model does not exist");
    }
    Object value = node.getValue().getValue().getValue();
    return (LocalizedText) value;
  }

  @Mandatory
  @Override
  public void setModel(LocalizedText value) {
    UaVariable node = getModelNode();
    if (node == null) {
      throw new RuntimeException("Setting Model failed: does not exist (Optional Nodes must be configured in NodeBuilder)");
    }
    try {
      node.setValue(value);
    } catch(StatusException e) {
      throw new RuntimeException("Setting Model failed unexpectedly", e);
    }
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
      throw new RuntimeException("Mandatory node SerialNumber does not exist");
    }
    Object value = node.getValue().getValue().getValue();
    return (String) value;
  }

  @Mandatory
  @Override
  public void setSerialNumber(String value) {
    UaVariable node = getSerialNumberNode();
    if (node == null) {
      throw new RuntimeException("Setting SerialNumber failed: does not exist (Optional Nodes must be configured in NodeBuilder)");
    }
    try {
      node.setValue(value);
    } catch(StatusException e) {
      throw new RuntimeException("Setting SerialNumber failed unexpectedly", e);
    }
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
      throw new RuntimeException("Mandatory node SoftwareRevision does not exist");
    }
    Object value = node.getValue().getValue().getValue();
    return (String) value;
  }

  @Mandatory
  @Override
  public void setSoftwareRevision(String value) {
    UaVariable node = getSoftwareRevisionNode();
    if (node == null) {
      throw new RuntimeException("Setting SoftwareRevision failed: does not exist (Optional Nodes must be configured in NodeBuilder)");
    }
    try {
      node.setValue(value);
    } catch(StatusException e) {
      throw new RuntimeException("Setting SoftwareRevision failed unexpectedly", e);
    }
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
      throw new RuntimeException("Mandatory node HardwareRevision does not exist");
    }
    Object value = node.getValue().getValue().getValue();
    return (String) value;
  }

  @Mandatory
  @Override
  public void setHardwareRevision(String value) {
    UaVariable node = getHardwareRevisionNode();
    if (node == null) {
      throw new RuntimeException("Setting HardwareRevision failed: does not exist (Optional Nodes must be configured in NodeBuilder)");
    }
    try {
      node.setValue(value);
    } catch(StatusException e) {
      throw new RuntimeException("Setting HardwareRevision failed unexpectedly", e);
    }
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
      throw new RuntimeException("Mandatory node ProductCode does not exist");
    }
    Object value = node.getValue().getValue().getValue();
    return (String) value;
  }

  @Mandatory
  @Override
  public void setProductCode(String value) {
    UaVariable node = getProductCodeNode();
    if (node == null) {
      throw new RuntimeException("Setting ProductCode failed: does not exist (Optional Nodes must be configured in NodeBuilder)");
    }
    try {
      node.setValue(value);
    } catch(StatusException e) {
      throw new RuntimeException("Setting ProductCode failed unexpectedly", e);
    }
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
      throw new RuntimeException("Mandatory node ProductInstanceUri does not exist");
    }
    Object value = node.getValue().getValue().getValue();
    return (String) value;
  }

  @Mandatory
  @Override
  public void setProductInstanceUri(String value) {
    UaVariable node = getProductInstanceUriNode();
    if (node == null) {
      throw new RuntimeException("Setting ProductInstanceUri failed: does not exist (Optional Nodes must be configured in NodeBuilder)");
    }
    try {
      node.setValue(value);
    } catch(StatusException e) {
      throw new RuntimeException("Setting ProductInstanceUri failed unexpectedly", e);
    }
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
      throw new RuntimeException("Mandatory node AssetId does not exist");
    }
    Object value = node.getValue().getValue().getValue();
    return (String) value;
  }

  @Mandatory
  @Override
  public void setAssetId(String value) {
    UaVariable node = getAssetIdNode();
    if (node == null) {
      throw new RuntimeException("Setting AssetId failed: does not exist (Optional Nodes must be configured in NodeBuilder)");
    }
    try {
      node.setValue(value);
    } catch(StatusException e) {
      throw new RuntimeException("Setting AssetId failed unexpectedly", e);
    }
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
      throw new RuntimeException("Mandatory node RevisionCounter does not exist");
    }
    Object value = node.getValue().getValue().getValue();
    return (Integer) value;
  }

  @Mandatory
  @Override
  public void setRevisionCounter(Integer value) {
    UaVariable node = getRevisionCounterNode();
    if (node == null) {
      throw new RuntimeException("Setting RevisionCounter failed: does not exist (Optional Nodes must be configured in NodeBuilder)");
    }
    try {
      node.setValue(value);
    } catch(StatusException e) {
      throw new RuntimeException("Setting RevisionCounter failed unexpectedly", e);
    }
  }

  @Mandatory
  @Override
  public BaseDataVariableTypeNode getDeviceHealthNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/Dictionary/IRDI", "DeviceHealth");
    return (BaseDataVariableTypeNode) getComponent(browseName);
  }

  @Mandatory
  @Override
  public DeviceHealthEnumeration getDeviceHealth() {
    UaVariable node = getDeviceHealthNode();
    if (node == null) {
      throw new RuntimeException("Mandatory node DeviceHealth does not exist");
    }
    Variant value = node.getValue().getValue();
    return (DeviceHealthEnumeration) value.asEnum(DeviceHealthEnumeration.class);
  }

  @Mandatory
  @Override
  public void setDeviceHealth(DeviceHealthEnumeration value) {
    UaVariable node = getDeviceHealthNode();
    if (node == null) {
      throw new RuntimeException("Setting DeviceHealth failed: does not exist (Optional Nodes must be configured in NodeBuilder)");
    }
    try {
      node.setValue(value);
    } catch(StatusException e) {
      throw new RuntimeException("Setting DeviceHealth failed unexpectedly", e);
    }
  }

  @Optional
  @Override
  public BaseDataVariableTypeNode getDateOfLastChangeNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/DI/", "DateOfLastChange");
    return (BaseDataVariableTypeNode) getComponent(browseName);
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
  public void setDateOfLastChange(DateTime value) {
    UaVariable node = getDateOfLastChangeNode();
    if (node == null) {
      throw new RuntimeException("Setting DateOfLastChange failed: does not exist (Optional Nodes must be configured in NodeBuilder)");
    }
    try {
      node.setValue(value);
    } catch(StatusException e) {
      throw new RuntimeException("Setting DateOfLastChange failed unexpectedly", e);
    }
  }

  @Optional
  @Override
  public BaseDataVariableTypeNode getDisplayLanguageNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/DI/", "DisplayLanguage");
    return (BaseDataVariableTypeNode) getComponent(browseName);
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
  public void setDisplayLanguage(String value) {
    UaVariable node = getDisplayLanguageNode();
    if (node == null) {
      throw new RuntimeException("Setting DisplayLanguage failed: does not exist (Optional Nodes must be configured in NodeBuilder)");
    }
    try {
      node.setValue(value);
    } catch(StatusException e) {
      throw new RuntimeException("Setting DisplayLanguage failed unexpectedly", e);
    }
  }

  @Optional
  @Override
  public SignalSetTypeNode getSignalSet_no_Node() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/DI/", "SignalSet");
    return (SignalSetTypeNode) getComponent(browseName);
  }

  @Optional
  @Override
  public FolderTypeNode getDeviceHealthAlarmsNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/Dictionary/IRDI", "DeviceHealthAlarms");
    return (FolderTypeNode) getComponent(browseName);
  }

  @Optional
  @Override
  public ConfigurableObjectTypeNode getSubDevicesNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/DI/", "SubDevices");
    return (ConfigurableObjectTypeNode) getComponent(browseName);
  }

  @Override
  public Variant[] callMethod(ServiceContext serviceContext, NodeId methodId,
      Variant[] inputArguments, StatusCode[] inputArgumentResults,
      DiagnosticInfo[] inputArgumentDiagnosticInfos) throws StatusException {
    if (isComponentMatch(getQualifiedName("http://opcfoundation.org/UA/DI/", "FactoryReset"), methodId)) {
      doFactoryReset(serviceContext, (ResetModeEnum) inputArguments[0].asEnum(ResetModeEnum.class));
      return null;
    }
    return super.callMethod(serviceContext, methodId, inputArguments, inputArgumentResults, inputArgumentDiagnosticInfos);
  }

  @Optional
  @Override
  public UaMethod getFactoryResetNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/DI/", "FactoryReset");
    return (UaMethod) getComponent(browseName);
  }

  protected abstract void onFactoryReset(ServiceContext serviceContext, ResetModeEnum resetMode)
      throws StatusException;

  @Override
  public void factoryReset(ResetModeEnum resetMode) throws StatusException {
    doFactoryReset(ServiceContext.INTERNAL_OPERATION_CONTEXT, resetMode);
  }

  private void doFactoryReset(ServiceContext serviceContext, ResetModeEnum resetMode) throws
      StatusException {
    PADIMTypeFactoryResetMethod impl = getFactoryResetMethodImplementation();
    if(impl != null) {
      impl.factoryReset(serviceContext, (PADIMTypeNode)this, resetMode);
    } else {
      onFactoryReset(serviceContext, resetMode);
    }
  }

  public static PADIMTypeFactoryResetMethod getFactoryResetMethodImplementation() {
    return factoryResetMethodImplementation;
  }

  public static void setFactoryResetMethodImplementation(PADIMTypeFactoryResetMethod factoryResetMethodImplementationNewValue) {
    factoryResetMethodImplementation=factoryResetMethodImplementationNewValue;
  }
}
