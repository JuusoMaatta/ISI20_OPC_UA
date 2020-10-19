package com.prosysopc.ua.padim.server;

import com.prosysopc.ua.StatusException;
import com.prosysopc.ua.TypeDefinitionId;
import com.prosysopc.ua.nodes.Optional;
import com.prosysopc.ua.nodes.UaMethod;
import com.prosysopc.ua.nodes.UaVariable;
import com.prosysopc.ua.padim.IAdministrationType;
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
import com.prosysopc.ua.types.opcua.server.BaseDataVariableTypeNode;
import com.prosysopc.ua.types.opcua.server.BaseInterfaceTypeNode;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;

/**
 * Generated on 2020-10-19 15:11:10
 */
@TypeDefinitionId("nsu=http://opcfoundation.org/UA/PADIM/;i=1050")
public abstract class IAdministrationTypeNodeBase extends BaseInterfaceTypeNode implements IAdministrationType {
  private static GeneratedNodeInitializer<IAdministrationTypeNode> iAdministrationTypeNodeInitializer;

  private static IAdministrationTypeFactoryResetMethod factoryResetMethodImplementation;

  protected IAdministrationTypeNodeBase(NodeManagerUaNode nodeManager, NodeId nodeId,
      QualifiedName browseName, LocalizedText displayName) {
    super(nodeManager, nodeId, browseName, displayName);
  }

  @Override
  public void afterCreate() {
    super.afterCreate();

    // Call afterCreate for each sub-node (if the node has any)
    callAfterCreateIfExists(getDisplayLanguageNode());
    callAfterCreateIfExists(getDateOfLastChangeNode());
    GeneratedNodeInitializer<IAdministrationTypeNode> impl = getIAdministrationTypeNodeInitializer();
    if(impl != null) {
      impl.init((IAdministrationTypeNode)this);
    }
  }

  public static GeneratedNodeInitializer<IAdministrationTypeNode> getIAdministrationTypeNodeInitializer() {
    return iAdministrationTypeNodeInitializer;
  }

  public static void setIAdministrationTypeNodeInitializer(GeneratedNodeInitializer<IAdministrationTypeNode> iAdministrationTypeNodeInitializerNewValue) {
    iAdministrationTypeNodeInitializer=iAdministrationTypeNodeInitializerNewValue;
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
    IAdministrationTypeFactoryResetMethod impl = getFactoryResetMethodImplementation();
    if(impl != null) {
      impl.factoryReset(serviceContext, (IAdministrationTypeNode)this, resetMode);
    } else {
      onFactoryReset(serviceContext, resetMode);
    }
  }

  public static IAdministrationTypeFactoryResetMethod getFactoryResetMethodImplementation() {
    return factoryResetMethodImplementation;
  }

  public static void setFactoryResetMethodImplementation(IAdministrationTypeFactoryResetMethod factoryResetMethodImplementationNewValue) {
    factoryResetMethodImplementation=factoryResetMethodImplementationNewValue;
  }
}
