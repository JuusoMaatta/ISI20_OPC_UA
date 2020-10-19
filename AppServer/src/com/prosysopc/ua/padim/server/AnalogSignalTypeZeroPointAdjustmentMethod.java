package com.prosysopc.ua.padim.server;

import com.prosysopc.ua.StatusException;
import com.prosysopc.ua.server.ServiceContext;

public abstract interface AnalogSignalTypeZeroPointAdjustmentMethod {
  void zeroPointAdjustment(ServiceContext serviceContext, AnalogSignalTypeNode node) throws
      StatusException;
}
