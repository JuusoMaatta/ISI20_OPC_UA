package com.prosysopc.ua.types.di.client;

import com.prosysopc.ua.MethodArgumentTransformer;
import com.prosysopc.ua.MethodCallStatusException;
import com.prosysopc.ua.ServiceException;
import com.prosysopc.ua.TypeDefinitionId;
import com.prosysopc.ua.client.AddressSpace;
import com.prosysopc.ua.nodes.Mandatory;
import com.prosysopc.ua.nodes.UaMethod;
import com.prosysopc.ua.stack.builtintypes.LocalizedText;
import com.prosysopc.ua.stack.builtintypes.NodeId;
import com.prosysopc.ua.stack.builtintypes.QualifiedName;
import com.prosysopc.ua.stack.builtintypes.Structure;
import com.prosysopc.ua.stack.builtintypes.Variant;
import com.prosysopc.ua.stack.transport.AsyncResult;
import com.prosysopc.ua.types.di.TransferServicesType;
import com.prosysopc.ua.types.opcua.client.BaseObjectTypeImpl;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;

/**
 * Generated on 2020-10-19 15:11:09
 */
@TypeDefinitionId("nsu=http://opcfoundation.org/UA/DI/;i=6526")
public abstract class TransferServicesTypeImplBase extends BaseObjectTypeImpl implements TransferServicesType {
  protected TransferServicesTypeImplBase(AddressSpace addressSpace, NodeId nodeId,
      QualifiedName browseName, LocalizedText displayName) {
    super(addressSpace, nodeId, browseName, displayName);
  }

  @Mandatory
  @Override
  public UaMethod getTransferToDeviceNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/DI/", "TransferToDevice");
    return (UaMethod) getComponent(browseName);
  }

  @Override
  public TransferServicesType.TransferToDeviceMethodOutputs transferToDevice() throws
      MethodCallStatusException, ServiceException {
    NodeId methodId = getComponentId(getQualifiedName("http://opcfoundation.org/UA/DI/", "TransferToDevice"));
    return call(methodId, new MethodArgumentTransformer<TransferServicesType.TransferToDeviceMethodOutputs>() {
      @Override
      public TransferServicesType.TransferToDeviceMethodOutputs fromVariantArray(Variant[] values) {
        return new TransferServicesType.TransferToDeviceMethodOutputs((Integer) values[0].getValue(), (Integer) values[1].getValue());
      }
    });
  }

  public AsyncResult<? extends TransferServicesType.TransferToDeviceMethodOutputs> transferToDeviceAsync() {
    NodeId methodId = getComponentId(getQualifiedName("http://opcfoundation.org/UA/DI/", "TransferToDevice"));
    return callAsync(methodId, new MethodArgumentTransformer<TransferServicesType.TransferToDeviceMethodOutputs>() {
      @Override
      public TransferServicesType.TransferToDeviceMethodOutputs fromVariantArray(Variant[] values) {
        return new TransferServicesType.TransferToDeviceMethodOutputs((Integer) values[0].getValue(), (Integer) values[1].getValue());
      }
    });
  }

  @Mandatory
  @Override
  public UaMethod getTransferFromDeviceNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/DI/", "TransferFromDevice");
    return (UaMethod) getComponent(browseName);
  }

  @Override
  public TransferServicesType.TransferFromDeviceMethodOutputs transferFromDevice() throws
      MethodCallStatusException, ServiceException {
    NodeId methodId = getComponentId(getQualifiedName("http://opcfoundation.org/UA/DI/", "TransferFromDevice"));
    return call(methodId, new MethodArgumentTransformer<TransferServicesType.TransferFromDeviceMethodOutputs>() {
      @Override
      public TransferServicesType.TransferFromDeviceMethodOutputs fromVariantArray(Variant[] values) {
        return new TransferServicesType.TransferFromDeviceMethodOutputs((Integer) values[0].getValue(), (Integer) values[1].getValue());
      }
    });
  }

  public AsyncResult<? extends TransferServicesType.TransferFromDeviceMethodOutputs> transferFromDeviceAsync() {
    NodeId methodId = getComponentId(getQualifiedName("http://opcfoundation.org/UA/DI/", "TransferFromDevice"));
    return callAsync(methodId, new MethodArgumentTransformer<TransferServicesType.TransferFromDeviceMethodOutputs>() {
      @Override
      public TransferServicesType.TransferFromDeviceMethodOutputs fromVariantArray(Variant[] values) {
        return new TransferServicesType.TransferFromDeviceMethodOutputs((Integer) values[0].getValue(), (Integer) values[1].getValue());
      }
    });
  }

  @Mandatory
  @Override
  public UaMethod getFetchTransferResultDataNode() {
    QualifiedName browseName = getQualifiedName("http://opcfoundation.org/UA/DI/", "FetchTransferResultData");
    return (UaMethod) getComponent(browseName);
  }

  @Override
  public Structure fetchTransferResultData(Integer transferID, Integer sequenceNumber,
      Integer maxParameterResultsToReturn, Boolean omitGoodResults) throws
      MethodCallStatusException, ServiceException {
    NodeId methodId = getComponentId(getQualifiedName("http://opcfoundation.org/UA/DI/", "FetchTransferResultData"));
    return call(methodId, new MethodArgumentTransformer<Structure>() {
      @Override
      public Structure fromVariantArray(Variant[] values) {
        return (Structure) values[0].getValue();
      }
    }, (Object)transferID, (Object)sequenceNumber, (Object)maxParameterResultsToReturn, (Object)omitGoodResults);
  }

  public AsyncResult<? extends Structure> fetchTransferResultDataAsync(Integer transferID,
      Integer sequenceNumber, Integer maxParameterResultsToReturn, Boolean omitGoodResults) {
    NodeId methodId = getComponentId(getQualifiedName("http://opcfoundation.org/UA/DI/", "FetchTransferResultData"));
    return callAsync(methodId, new MethodArgumentTransformer<Structure>() {
      @Override
      public Structure fromVariantArray(Variant[] values) {
        return (Structure) values[0].getValue();
      }
    }, (Object)transferID, (Object)sequenceNumber, (Object)maxParameterResultsToReturn, (Object)omitGoodResults);
  }
}
