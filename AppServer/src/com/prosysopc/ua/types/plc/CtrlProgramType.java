package com.prosysopc.ua.types.plc;

import com.prosysopc.ua.StatusException;
import com.prosysopc.ua.TypeDefinitionId;
import com.prosysopc.ua.nodes.Optional;
import com.prosysopc.ua.stack.builtintypes.Structure;
import com.prosysopc.ua.types.opcua.BaseDataVariableType;
import java.lang.String;

/**
 * Generated on 2020-10-19 15:11:11
 */
@TypeDefinitionId("nsu=http://PLCopen.org/OpcUa/IEC61131-3/;i=1004")
public interface CtrlProgramType extends CtrlProgramOrganizationUnitType {
  String PROGRAM = "Program";

  @Optional
  BaseDataVariableType getProgramNode();

  @Optional
  Structure getProgram();

  @Optional
  void setProgram(Structure value) throws StatusException;
}
