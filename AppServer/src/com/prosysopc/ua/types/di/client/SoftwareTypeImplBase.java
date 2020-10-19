package com.prosysopc.ua.types.di.client;

import com.prosysopc.ua.StatusException;
import com.prosysopc.ua.TypeDefinitionId;
import com.prosysopc.ua.client.AddressSpace;
import com.prosysopc.ua.nodes.Mandatory;
import com.prosysopc.ua.nodes.UaProperty;
import com.prosysopc.ua.nodes.UaVariable;
import com.prosysopc.ua.stack.builtintypes.LocalizedText;
import com.prosysopc.ua.stack.builtintypes.NodeId;
import com.prosysopc.ua.stack.builtintypes.QualifiedName;
import com.prosysopc.ua.types.di.SoftwareType;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;

/**
 * Generated on 2020-10-19 15:11:09
 */
@TypeDefinitionId("nsu=http://opcfoundation.org/UA/DI/;i=15106")
public abstract class SoftwareTypeImplBase extends ComponentTypeImpl implements SoftwareType {
  protected SoftwareTypeImplBase(AddressSpace addressSpace, NodeId nodeId, QualifiedName browseName,
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
}
