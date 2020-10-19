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
@TypeDefinitionId("nsu=http://PLCopen.org/OpcUa/IEC61131-3/;i=1002")
public interface CtrlResourceType extends DeviceType {
  String METHOD_SET = "MethodSet";

  String TASKS = "Tasks";

  String PROGRAMS = "Programs";

  String GLOBAL_VARS = "GlobalVars";

  String CONFIGURATION = "Configuration";

  String DIAGNOSTIC = "Diagnostic";

  @Optional
  BaseObjectType getMethodSetNode();

  @Mandatory
  ConfigurableObjectType getTasksNode();

  @Mandatory
  ConfigurableObjectType getProgramsNode();

  @Optional
  FunctionalGroupType getGlobalVarsNode();

  @Optional
  FunctionalGroupType getConfigurationNode();

  @Optional
  FunctionalGroupType getDiagnosticNode();
}
