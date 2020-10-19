package com.prosysopc.ua.padim.server;

import com.prosysopc.ua.TypeDefinitionId;
import com.prosysopc.ua.padim.AnalyticalMeasurementVariableType;
import com.prosysopc.ua.server.GeneratedNodeInitializer;
import com.prosysopc.ua.server.NodeManagerUaNode;
import com.prosysopc.ua.stack.builtintypes.LocalizedText;
import com.prosysopc.ua.stack.builtintypes.NodeId;
import com.prosysopc.ua.stack.builtintypes.QualifiedName;
import java.lang.Override;

/**
 * Generated on 2020-10-19 15:11:10
 */
@TypeDefinitionId("nsu=http://opcfoundation.org/UA/PADIM/;i=1127")
public abstract class AnalyticalMeasurementVariableTypeNodeBase extends AnalogSignalVariableTypeNode implements AnalyticalMeasurementVariableType {
  private static GeneratedNodeInitializer<AnalyticalMeasurementVariableTypeNode> analyticalMeasurementVariableTypeNodeInitializer;

  protected AnalyticalMeasurementVariableTypeNodeBase(NodeManagerUaNode nodeManager, NodeId nodeId,
      QualifiedName browseName, LocalizedText displayName) {
    super(nodeManager, nodeId, browseName, displayName);
  }

  @Override
  public void afterCreate() {
    super.afterCreate();

    // Call afterCreate for each sub-node (if the node has any)
    GeneratedNodeInitializer<AnalyticalMeasurementVariableTypeNode> impl = getAnalyticalMeasurementVariableTypeNodeInitializer();
    if(impl != null) {
      impl.init((AnalyticalMeasurementVariableTypeNode)this);
    }
  }

  public static GeneratedNodeInitializer<AnalyticalMeasurementVariableTypeNode> getAnalyticalMeasurementVariableTypeNodeInitializer() {
    return analyticalMeasurementVariableTypeNodeInitializer;
  }

  public static void setAnalyticalMeasurementVariableTypeNodeInitializer(GeneratedNodeInitializer<AnalyticalMeasurementVariableTypeNode> analyticalMeasurementVariableTypeNodeInitializerNewValue) {
    analyticalMeasurementVariableTypeNodeInitializer=analyticalMeasurementVariableTypeNodeInitializerNewValue;
  }
}
