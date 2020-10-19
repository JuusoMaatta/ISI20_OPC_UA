package com.prosysopc.ua.types.plc.client;

import com.prosysopc.ua.StatusException;
import com.prosysopc.ua.TypeDefinitionId;
import com.prosysopc.ua.client.AddressSpace;
import com.prosysopc.ua.nodes.Optional;
import com.prosysopc.ua.nodes.UaVariable;
import com.prosysopc.ua.stack.builtintypes.LocalizedText;
import com.prosysopc.ua.stack.builtintypes.NodeId;
import com.prosysopc.ua.stack.builtintypes.QualifiedName;
import com.prosysopc.ua.stack.builtintypes.Structure;
import com.prosysopc.ua.types.opcua.BaseDataVariableType;
import com.prosysopc.ua.types.plc.CtrlProgramType;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;

/**
 * Generated on 2020-10-19 15:11:11
 */
@TypeDefinitionId("nsu=http://PLCopen.org/OpcUa/IEC61131-3/;i=1004")
public abstract class CtrlProgramTypeImplBase extends CtrlProgramOrganizationUnitTypeImpl implements CtrlProgramType {
  protected CtrlProgramTypeImplBase(AddressSpace addressSpace, NodeId nodeId,
      QualifiedName browseName, LocalizedText displayName) {
    super(addressSpace, nodeId, browseName, displayName);
  }

  @Optional
  @Override
  public BaseDataVariableType getProgramNode() {
    QualifiedName browseName = getQualifiedName("http://PLCopen.org/OpcUa/IEC61131-3/", "Program");
    return (BaseDataVariableType) getComponent(browseName);
  }

  @Optional
  @Override
  public Structure getProgram() {
    UaVariable node = getProgramNode();
    if (node == null) {
      return null;
    }
    Object value = node.getValue().getValue().getValue();
    return (Structure) value;
  }

  @Optional
  @Override
  public void setProgram(Structure value) throws StatusException {
    UaVariable node = getProgramNode();
    if (node == null) {
      throw new RuntimeException("Setting Program failed, the Optional node does not exist)");
    }
    node.setValue(value);
  }
}
