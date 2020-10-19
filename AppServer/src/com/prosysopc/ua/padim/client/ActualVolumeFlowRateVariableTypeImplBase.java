package com.prosysopc.ua.padim.client;

import com.prosysopc.ua.TypeDefinitionId;
import com.prosysopc.ua.client.AddressSpace;
import com.prosysopc.ua.padim.ActualVolumeFlowRateVariableType;
import com.prosysopc.ua.stack.builtintypes.LocalizedText;
import com.prosysopc.ua.stack.builtintypes.NodeId;
import com.prosysopc.ua.stack.builtintypes.QualifiedName;

/**
 * Generated on 2020-10-19 15:11:10
 */
@TypeDefinitionId("nsu=http://opcfoundation.org/UA/PADIM/;i=1134")
public abstract class ActualVolumeFlowRateVariableTypeImplBase extends FlowMeasurementVariableTypeImpl implements ActualVolumeFlowRateVariableType {
  protected ActualVolumeFlowRateVariableTypeImplBase(AddressSpace addressSpace, NodeId nodeId,
      QualifiedName browseName, LocalizedText displayName) {
    super(addressSpace, nodeId, browseName, displayName);
  }
}
