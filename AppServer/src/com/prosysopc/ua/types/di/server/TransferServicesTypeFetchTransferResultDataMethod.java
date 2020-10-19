package com.prosysopc.ua.types.di.server;

import com.prosysopc.ua.StatusException;
import com.prosysopc.ua.server.ServiceContext;
import com.prosysopc.ua.stack.builtintypes.Structure;
import java.lang.Boolean;
import java.lang.Integer;

public abstract interface TransferServicesTypeFetchTransferResultDataMethod {
  Structure fetchTransferResultData(ServiceContext serviceContext, TransferServicesTypeNode node,
      Integer transferID, Integer sequenceNumber, Integer maxParameterResultsToReturn,
      Boolean omitGoodResults) throws StatusException;
}
