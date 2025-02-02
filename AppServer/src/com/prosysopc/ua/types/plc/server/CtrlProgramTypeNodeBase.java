package com.prosysopc.ua.types.plc.server;

import com.prosysopc.ua.StatusException;
import com.prosysopc.ua.TypeDefinitionId;
import com.prosysopc.ua.nodes.Optional;
import com.prosysopc.ua.nodes.UaVariable;
import com.prosysopc.ua.server.GeneratedNodeInitializer;
import com.prosysopc.ua.server.NodeManagerUaNode;
import com.prosysopc.ua.server.ServiceContext;
import com.prosysopc.ua.stack.builtintypes.DiagnosticInfo;
import com.prosysopc.ua.stack.builtintypes.LocalizedText;
import com.prosysopc.ua.stack.builtintypes.NodeId;
import com.prosysopc.ua.stack.builtintypes.QualifiedName;
import com.prosysopc.ua.stack.builtintypes.StatusCode;
import com.prosysopc.ua.stack.builtintypes.Structure;
import com.prosysopc.ua.stack.builtintypes.Variant;
import com.prosysopc.ua.types.opcua.server.BaseDataVariableTypeNode;
import com.prosysopc.ua.types.plc.CtrlProgramType;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;

/**
 * Generated on 2020-10-19 15:11:11
 */
@TypeDefinitionId("nsu=http://PLCopen.org/OpcUa/IEC61131-3/;i=1004")
public abstract class CtrlProgramTypeNodeBase extends CtrlProgramOrganizationUnitTypeNode implements CtrlProgramType {
  private static GeneratedNodeInitializer<CtrlProgramTypeNode> ctrlProgramTypeNodeInitializer;

  protected CtrlProgramTypeNodeBase(NodeManagerUaNode nodeManager, NodeId nodeId,
      QualifiedName browseName, LocalizedText displayName) {
    super(nodeManager, nodeId, browseName, displayName);
  }

  @Override
  public void afterCreate() {
    super.afterCreate();

    // Call afterCreate for each sub-node (if the node has any)
    callAfterCreateIfExists(getProgramNode());
    GeneratedNodeInitializer<CtrlProgramTypeNode> impl = getCtrlProgramTypeNodeInitializer();
    if(impl != null) {
      impl.init((CtrlProgramTypeNode)this);
    }
  }

  public static GeneratedNodeInitializer<CtrlProgramTypeNode> getCtrlProgramTypeNodeInitializer() {
    return ctrlProgramTypeNodeInitializer;
  }

  public static void setCtrlProgramTypeNodeInitializer(GeneratedNodeInitializer<CtrlProgramTypeNode> ctrlProgramTypeNodeInitializerNewValue) {
    ctrlProgramTypeNodeInitializer=ctrlProgramTypeNodeInitializerNewValue;
  }

  @Optional
  @Override
  public BaseDataVariableTypeNode getProgramNode() {
    QualifiedName browseName = getQualifiedName("http://PLCopen.org/OpcUa/IEC61131-3/", "Program");
    return (BaseDataVariableTypeNode) getComponent(browseName);
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
  public void setProgram(Structure value) {
    UaVariable node = getProgramNode();
    if (node == null) {
      throw new RuntimeException("Setting Program failed: does not exist (Optional Nodes must be configured in NodeBuilder)");
    }
    try {
      node.setValue(value);
    } catch(StatusException e) {
      throw new RuntimeException("Setting Program failed unexpectedly", e);
    }
  }

  @Override
  public Variant[] callMethod(ServiceContext serviceContext, NodeId methodId,
      Variant[] inputArguments, StatusCode[] inputArgumentResults,
      DiagnosticInfo[] inputArgumentDiagnosticInfos) throws StatusException {
    return super.callMethod(serviceContext, methodId, inputArguments, inputArgumentResults, inputArgumentDiagnosticInfos);
  }
}
