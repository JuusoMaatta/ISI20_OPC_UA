package com.prosysopc.ua.types.plc;

import com.prosysopc.ua.TypeDefinitionId;
import com.prosysopc.ua.nodes.Mandatory;
import com.prosysopc.ua.nodes.Optional;
import com.prosysopc.ua.types.di.ConfigurableObjectType;
import com.prosysopc.ua.types.di.DeviceType;
import com.prosysopc.ua.types.di.FunctionalGroupType;
import com.prosysopc.ua.types.opcua.BaseObjectType;
import java.lang.String;

/**
 * Generated on 2020-10-19 15:11:11
 */
@TypeDefinitionId("nsu=http://PLCopen.org/OpcUa/IEC61131-3/;i=1001")
public interface CtrlConfigurationType extends DeviceType {
  String METHOD_SET = "MethodSet";

  String RESOURCES = "Resources";

  String GLOBAL_VARS = "GlobalVars";

  String ACCESS_VARS = "AccessVars";

  String CONFIG_VARS = "ConfigVars";

  String CONFIGURATION = "Configuration";

  String DIAGNOSTIC = "Diagnostic";

  @Optional
  BaseObjectType getMethodSetNode();

  @Mandatory
  ConfigurableObjectType getResourcesNode();

  @Mandatory
  FunctionalGroupType getGlobalVarsNode();

  @Mandatory
  FunctionalGroupType getAccessVarsNode();

  @Mandatory
  FunctionalGroupType getConfigVarsNode();

  @Mandatory
  FunctionalGroupType getConfigurationNode();

  @Mandatory
  FunctionalGroupType getDiagnosticNode();
}
