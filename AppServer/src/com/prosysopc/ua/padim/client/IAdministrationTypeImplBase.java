package com.prosysopc.ua.padim.client;

import com.prosysopc.ua.MethodArgumentTransformer;
import com.prosysopc.ua.MethodCallStatusException;
import com.prosysopc.ua.ServiceException;
import com.prosysopc.ua.StatusException;
import com.prosysopc.ua.TypeDefinitionId;
import com.prosysopc.ua.client.AddressSpace;
import com.prosysopc.ua.nodes.Optional;
import com.prosysopc.ua.nodes.UaMethod;
import com.prosysopc.ua.nodes.UaVariable;
import com.prosysopc.ua.padim.IAdministrationType;
import com.prosysopc.ua.padim.ResetModeEnum;
import com.prosysopc.ua.stack.builtintypes.DateTime;
import com.prosysopc.ua.stack.builtintypes.LocalizedText;
import com.prosysopc.ua.stack.builtintypes.NodeId;
import com.prosysopc.ua.stack.builtintypes.QualifiedName;
import com.prosysopc.ua.stack.builtintypes.Variant;
import com.prosysopc.ua.stack.transport.AsyncResult;
import com.prosysopc.ua.types.opcua.BaseDataVariableType;
import com.prosysopc.ua.types.opcua.client.BaseInterfaceTypeImpl;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.lang.Void;

/**
 * Generated on 2020-10-19 15:11:10
 */
@TypeDefinitionId("nsu=http://opcfoundation.org/UA/PADIM/;i=1050")
public abstract class IAdministrationTypeImplBase extends BaseInterfaceTypeImpl implements IAdministrationType {
  protected IAdministrationTypeImplBase(AddressSpace addressSpace, NodeId nodeId,
      QualifiedName browseName, LocalizedText displayName) {
    super(addressSpace, nodeId, browseName, displayName);
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
