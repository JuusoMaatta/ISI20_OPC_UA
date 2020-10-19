package com.prosysopc.ua.types.plc;

import com.prosysopc.ua.StatusException;
import com.prosysopc.ua.TypeDefinitionId;
import com.prosysopc.ua.nodes.Optional;
import com.prosysopc.ua.stack.builtintypes.XmlElement;
import com.prosysopc.ua.types.di.BlockType;
import com.prosysopc.ua.types.opcua.BaseDataVariableType;
import java.lang.String;

/**
 * Generated on 2020-10-19 15:11:11
 */
@TypeDefinitionId("nsu=http://PLCopen.org/OpcUa/IEC61131-3/;i=1003")
public interface CtrlProgramOrganizationUnitType extends BlockType {
  String BODY = "Body";

  @Optional
  BaseDataVariableType getBodyNode();

  @Optional
  XmlElement getBody();

  @Optional
  void setBody(XmlElement value) throws StatusException;
}
