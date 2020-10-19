package com.prosysopc.ua.types.di.server;

import com.prosysopc.ua.StatusException;
import com.prosysopc.ua.server.ServiceContext;
import com.prosysopc.ua.types.di.TransferServicesType;

public abstract interface TransferServicesTypeTransferFromDeviceMethod {
  TransferServicesType.TransferFromDeviceMethodOutputs transferFromDevice(ServiceContext serviceContext,
      TransferServicesTypeNode node) throws StatusException;
}
