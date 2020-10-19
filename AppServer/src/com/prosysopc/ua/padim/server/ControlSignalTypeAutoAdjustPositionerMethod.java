package com.prosysopc.ua.padim.server;

import com.prosysopc.ua.StatusException;
import com.prosysopc.ua.padim.ExecutionModeEnum;
import com.prosysopc.ua.server.ServiceContext;

public abstract interface ControlSignalTypeAutoAdjustPositionerMethod {
  void autoAdjustPositioner(ServiceContext serviceContext, ControlSignalTypeNode node,
      ExecutionModeEnum executionMode) throws StatusException;
}
