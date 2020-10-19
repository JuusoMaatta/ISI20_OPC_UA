package com.prosysopc.ua.types.di.server;

import com.prosysopc.ua.StatusException;
import com.prosysopc.ua.server.ServiceContext;
import com.prosysopc.ua.types.di.TransferServicesType;

public abstract interface TransferServicesTypeTransferToDeviceMethod {
  TransferServicesType.TransferToDeviceMethodOutputs transferToDevice(ServiceContext serviceContext,
      TransferServicesTypeNode node) throws StatusException;
}
