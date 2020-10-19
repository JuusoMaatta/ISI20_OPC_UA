package com.prosysopc.ua.types.di;

import com.prosysopc.ua.MethodOutputArguments;
import com.prosysopc.ua.ServiceException;
import com.prosysopc.ua.StatusException;
import com.prosysopc.ua.TypeDefinitionId;
import com.prosysopc.ua.nodes.Mandatory;
import com.prosysopc.ua.nodes.UaMethod;
import com.prosysopc.ua.stack.builtintypes.Structure;
import com.prosysopc.ua.stack.builtintypes.Variant;
import com.prosysopc.ua.types.opcua.BaseObjectType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;

/**
 * Generated on 2020-10-19 15:11:09
 */
@TypeDefinitionId("nsu=http://opcfoundation.org/UA/DI/;i=6526")
public interface TransferServicesType extends BaseObjectType {
  String TRANSFER_TO_DEVICE = "TransferToDevice";

  String TRANSFER_FROM_DEVICE = "TransferFromDevice";

  String FETCH_TRANSFER_RESULT_DATA = "FetchTransferResultData";

  @Mandatory
  UaMethod getTransferToDeviceNode();

  TransferToDeviceMethodOutputs transferToDevice() throws StatusException, ServiceException;

  @Mandatory
  UaMethod getTransferFromDeviceNode();

  TransferFromDeviceMethodOutputs transferFromDevice() throws StatusException, ServiceException;

  @Mandatory
  UaMethod getFetchTransferResultDataNode();

  Structure fetchTransferResultData(Integer transferID, Integer sequenceNumber,
      Integer maxParameterResultsToReturn, Boolean omitGoodResults) throws StatusException,
      ServiceException;

  class TransferToDeviceMethodOutputs implements MethodOutputArguments {
    protected Integer transferID;

    protected Integer initTransferStatus;

    public TransferToDeviceMethodOutputs(Integer transferID, Integer initTransferStatus) {
      this.transferID = transferID;
      this.initTransferStatus = initTransferStatus;
    }

    public Integer getTransferID() {
      return this.transferID;
    }

    public Integer getInitTransferStatus() {
      return this.initTransferStatus;
    }

    public final Variant[] asVariantArray() {
      return new Variant[]{new Variant(transferID), new Variant(initTransferStatus)};
    }
  }

  class TransferFromDeviceMethodOutputs implements MethodOutputArguments {
    protected Integer transferID;

    protected Integer initTransferStatus;

    public TransferFromDeviceMethodOutputs(Integer transferID, Integer initTransferStatus) {
      this.transferID = transferID;
      this.initTransferStatus = initTransferStatus;
    }

    public Integer getTransferID() {
      return this.transferID;
    }

    public Integer getInitTransferStatus() {
      return this.initTransferStatus;
    }

    public final Variant[] asVariantArray() {
      return new Variant[]{new Variant(transferID), new Variant(initTransferStatus)};
    }
  }
}
