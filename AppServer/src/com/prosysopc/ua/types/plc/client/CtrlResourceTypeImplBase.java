package com.prosysopc.ua.types.plc.client;

import com.prosysopc.ua.TypeDefinitionId;
import com.prosysopc.ua.client.AddressSpace;
import com.prosysopc.ua.nodes.Mandatory;
import com.prosysopc.ua.nodes.Optional;
import com.prosysopc.ua.stack.builtintypes.LocalizedText;
import com.prosysopc.ua.stack.builtintypes.NodeId;
import com.prosysopc.ua.stack.builtintypes.QualifiedName;
import com.prosysopc.ua.types.di.ConfigurableObjectType;
import com.prosysopc.ua.types.di.FunctionalGroupType;
import com.prosysopc.ua.types.di.client.DeviceTypeImpl;
import com.prosysopc.ua.types.opcua.BaseObjectType;
import com.prosysopc.ua.types.plc.CtrlResourceType;
import java.lang.Override;

/**
 * Generated on 2020-10-19 15:11:11
 */
@TypeDefinitionId("nsu=http://PLCopen.org/OpcUa/IEC61131-3/;i=1002")
public abstract class CtrlResourceTypeImplBase extends DeviceTypeImpl implements CtrlResourceType {
  protected CtrlResourceTypeImplBase(AddressSpace addressSpace, NodeId nodeId,
      QualifiedName browseName, LocalizedText displayName) {
    super(addressSpace, nodeId, browseName, displayName);
  }

  @Optional
  @Override
  public BaseObjectType getMethodSetNode() {
    QualifiedName browseName = getQualifiedName("http://PLCopen.org/OpcUa/IEC61131-3/", "MethodSet");
    return (BaseObjectType) getComponent(browseName);
  }

  @Mandatory
  @Override
  public ConfigurableObjectType getTasksNode() {
    QualifiedName browseName = getQualifiedName("http://PLCopen.org/OpcUa/IEC61131-3/", "Tasks");
    return (ConfigurableObjectType) getComponent(browseName);
  }

  @Mandatory
  @Override
  public ConfigurableObjectType getProgramsNode() {
    QualifiedName browseName = getQualifiedName("http://PLCopen.org/OpcUa/IEC61131-3/", "Programs");
    return (ConfigurableObjectType) getComponent(browseName);
  }

  @Optional
  @Override
  public FunctionalGroupType getGlobalVarsNode() {
    QualifiedName browseName = getQualifiedName("http://PLCopen.org/OpcUa/IEC61131-3/", "GlobalVars");
    return (FunctionalGroupType) getComponent(browseName);
  }

  @Optional
  @Override
  public FunctionalGroupType getConfigurationNode() {
    QualifiedName browseName = getQualifiedName("http://PLCopen.org/OpcUa/IEC61131-3/", "Configuration");
    return (FunctionalGroupType) getComponent(browseName);
  }

  @Optional
  @Override
  public FunctionalGroupType getDiagnosticNode() {
    QualifiedName browseName = getQualifiedName("http://PLCopen.org/OpcUa/IEC61131-3/", "Diagnostic");
    return (FunctionalGroupType) getComponent(browseName);
  }
}
