package com.prosysopc.ua.padim.server;

import com.prosysopc.ua.TypeDefinitionId;
import com.prosysopc.ua.padim.PressureMeasurementVariableType;
import com.prosysopc.ua.server.GeneratedNodeInitializer;
import com.prosysopc.ua.server.NodeManagerUaNode;
import com.prosysopc.ua.stack.builtintypes.LocalizedText;
import com.prosysopc.ua.stack.builtintypes.NodeId;
import com.prosysopc.ua.stack.builtintypes.QualifiedName;
import java.lang.Override;

/**
 * Generated on 2020-10-19 15:11:10
 */
@TypeDefinitionId("nsu=http://opcfoundation.org/UA/PADIM/;i=1121")
public abstract class PressureMeasurementVariableTypeNodeBase extends AnalogSignalVariableTypeNode implements PressureMeasurementVariableType {
  private static GeneratedNodeInitializer<PressureMeasurementVariableTypeNode> pressureMeasurementVariableTypeNodeInitializer;

  protected PressureMeasurementVariableTypeNodeBase(NodeManagerUaNode nodeManager, NodeId nodeId,
      QualifiedName browseName, LocalizedText displayName) {
    super(nodeManager, nodeId, browseName, displayName);
  }

  @Override
  public void afterCreate() {
    super.afterCreate();

    // Call afterCreate for each sub-node (if the node has any)
    GeneratedNodeInitializer<PressureMeasurementVariableTypeNode> impl = getPressureMeasurementVariableTypeNodeInitializer();
    if(impl != null) {
      impl.init((PressureMeasurementVariableTypeNode)this);
    }
  }

  public static GeneratedNodeInitializer<PressureMeasurementVariableTypeNode> getPressureMeasurementVariableTypeNodeInitializer() {
    return pressureMeasurementVariableTypeNodeInitializer;
  }

  public static void setPressureMeasurementVariableTypeNodeInitializer(GeneratedNodeInitializer<PressureMeasurementVariableTypeNode> pressureMeasurementVariableTypeNodeInitializerNewValue) {
    pressureMeasurementVariableTypeNodeInitializer=pressureMeasurementVariableTypeNodeInitializerNewValue;
  }
}
