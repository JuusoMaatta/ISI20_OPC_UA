package com.prosysopc.ua.types.plc;

import com.prosysopc.ua.StatusException;
import com.prosysopc.ua.TypeDefinitionId;
import com.prosysopc.ua.nodes.Optional;
import com.prosysopc.ua.types.opcua.BaseDataVariableType;
import java.lang.Object;
import java.lang.String;

/**
 * Generated on 2020-10-19 15:11:11
 */
@TypeDefinitionId("nsu=http://PLCopen.org/OpcUa/IEC61131-3/;i=1005")
public interface CtrlFunctionBlockType extends CtrlProgramOrganizationUnitType {
  String FUNCTION_BLOCK = "FunctionBlock";

  @Optional
  BaseDataVariableType getFunctionBlockNode();

  @Optional
  Object getFunctionBlock();

  @Optional
  void setFunctionBlock(Object value) throws StatusException;
}
