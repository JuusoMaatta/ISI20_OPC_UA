package com.prosysopc.ua.padim.server;

import com.prosysopc.ua.StatusException;
import com.prosysopc.ua.TypeDefinitionId;
import com.prosysopc.ua.padim.ResetModeEnum;
import com.prosysopc.ua.server.NodeManagerUaNode;
import com.prosysopc.ua.server.ServiceContext;
import com.prosysopc.ua.stack.builtintypes.LocalizedText;
import com.prosysopc.ua.stack.builtintypes.NodeId;
import com.prosysopc.ua.stack.builtintypes.QualifiedName;
import com.prosysopc.ua.stack.core.StatusCodes;
import java.lang.Override;

/**
 * Generated on 2020-10-19 15:11:10
 */
@TypeDefinitionId("nsu=http://opcfoundation.org/UA/PADIM/;i=1009")
public class PADIMTypeNode extends PADIMTypeNodeBase {
  protected PADIMTypeNode(NodeManagerUaNode nodeManager, NodeId nodeId, QualifiedName browseName,
      LocalizedText displayName) {
    super(nodeManager, nodeId, browseName, displayName);
  }

  @Override
  public void afterCreate() {
    // Use this method to initialize the nodes, when they are all created.
    // Note that 'super.afterCreate()' performs default initializations, so consider
    // whether your own initializations should be done before or after it.
    super.afterCreate();
  }

  @Override
  protected void onFactoryReset(ServiceContext serviceContext, ResetModeEnum resetMode) throws
      StatusException {
    //Implement the generated method here (and remove the code below) OR set implementation via static method setFactoryResetMethodImplementation 
    throw new StatusException(StatusCodes.Bad_NotImplemented);
  }
}
