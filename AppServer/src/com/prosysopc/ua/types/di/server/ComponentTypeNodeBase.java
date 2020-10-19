package com.prosysopc.ua.types.di.server;

import com.prosysopc.ua.StatusException;
import com.prosysopc.ua.TypeDefinitionId;
import com.prosysopc.ua.nodes.Optional;
import com.prosysopc.ua.nodes.UaProperty;
import com.prosysopc.ua.nodes.UaVariable;
import com.prosysopc.ua.server.GeneratedNodeInitializer;
import com.prosysopc.ua.server.NodeManagerUaNode;
import com.prosysopc.ua.server.ServiceContext;
import com.prosysopc.ua.stack.builtintypes.DiagnosticInfo;
import com.prosysopc.ua.stack.builtintypes.LocalizedText;
import com.prosysopc.ua.stack.builtintypes.NodeId;
import com.prosysopc.ua.stack.builtintypes.QualifiedName;
import com.prosysopc.ua.stack.builtintypes.StatusCode;
import com.prosysopc.ua.stack.builtintypes.Variant;
import com.prosysopc.ua.types.di.ComponentType;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;

/**
 * Generated on 2020-10-19 15:11:09
 */
@TypeDefinitionId("nsu=http://opcfoundation.org/UA/DI/;i=15063")
public abstract class ComponentTypeNodeBase extends TopologyElementTypeNode implements ComponentType {
  private static GeneratedNodeInitializer<ComponentTypeNode> componentTypeNodeInitializer;

  protected ComponentTypeNodeBase(NodeManagerUaNode nodeManager, NodeId nodeId,
      QualifiedName browseName, LocalizedText displayName) {
    super(nodeManager, nodeId, browseName, displayName);
  }

  @Override
  public void afterCreate() {
    super.afterCreate();

    // Call afterCreate for each sub-node (if the node has any)
    GeneratedNodeInitializer<ComponentTypeNode> impl = getComponentTypeNodeInitializer();
    if(impl != null) {
      impl.init((ComponentTypeNode)this);
    }
  }

  public static GeneratedNodeInitializer<ComponentTypeNode> getComponentTypeNodeInitializer() {
    return componentTypeNodeInitializer;
  }

  public static void setComponentTypeNodeInitializer(GeneratedNodeInitializer<ComponentTypeNode> componentTypeNodeInitializerNewValue) {
    componentTypeNodeInitializer=componentTypeNodeInitializerNewValue;
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
  public void setDeviceRevision(String value) {
    UaVariable node = getDeviceRevisionNode();
    if (node == null) {
      throw new RuntimeException("Setting DeviceRevision failed: does not exist (Optional Nodes must be configured in NodeBuilder)");
    }
    try {
      node.setValue(value);
    } catch(StatusException e) {
      throw new RuntimeException("Setting DeviceRevision failed unexpectedly", e);
    }
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
  public void setDeviceManual(String value) {
    UaVariable node = getDeviceManualNode();
    if (node == null) {
      throw new RuntimeException("Setting DeviceManual failed: does not exist (Optional Nodes must be configured in NodeBuilder)");
    }
    try {
      node.setValue(value);
    } catch(StatusException e) {
      throw new RuntimeException("Setting DeviceManual failed unexpectedly", e);
    }
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
  public void setDeviceClass(String value) {
    UaVariable node = getDeviceClassNode();
    if (node == null) {
      throw new RuntimeException("Setting DeviceClass failed: does not exist (Optional Nodes must be configured in NodeBuilder)");
    }
    try {
      node.setValue(value);
    } catch(StatusException e) {
      throw new RuntimeException("Setting DeviceClass failed unexpectedly", e);
    }
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

  @Optional
  @Override
  public UaProperty getAssetIdNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/DI/", "AssetId");
    return getProperty(browseName);
  }

  @Optional
  @Override
  public String getAssetId() {
    UaVariable node = getAssetIdNode();
    if (node == null) {
      return null;
    }
    Object value = node.getValue().getValue().getValue();
    return (String) value;
  }

  @Optional
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

  @Optional
  @Override
  public UaProperty getComponentNameNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/DI/", "ComponentName");
    return getProperty(browseName);
  }

  @Optional
  @Override
  public LocalizedText getComponentName() {
    UaVariable node = getComponentNameNode();
    if (node == null) {
      return null;
    }
    Object value = node.getValue().getValue().getValue();
    return (LocalizedText) value;
  }

  @Optional
  @Override
  public void setComponentName(LocalizedText value) {
    UaVariable node = getComponentNameNode();
    if (node == null) {
      throw new RuntimeException("Setting ComponentName failed: does not exist (Optional Nodes must be configured in NodeBuilder)");
    }
    try {
      node.setValue(value);
    } catch(StatusException e) {
      throw new RuntimeException("Setting ComponentName failed unexpectedly", e);
    }
  }

  @Override
  public Variant[] callMethod(ServiceContext serviceContext, NodeId methodId,
      Variant[] inputArguments, StatusCode[] inputArgumentResults,
      DiagnosticInfo[] inputArgumentDiagnosticInfos) throws StatusException {
    return super.callMethod(serviceContext, methodId, inputArguments, inputArgumentResults, inputArgumentDiagnosticInfos);
  }
}
