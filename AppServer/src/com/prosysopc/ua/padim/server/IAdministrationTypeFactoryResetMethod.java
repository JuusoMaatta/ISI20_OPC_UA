package com.prosysopc.ua.padim.server;

import com.prosysopc.ua.StatusException;
import com.prosysopc.ua.padim.ResetModeEnum;
import com.prosysopc.ua.server.ServiceContext;

public abstract interface IAdministrationTypeFactoryResetMethod {
  void factoryReset(ServiceContext serviceContext, IAdministrationTypeNode node,
      ResetModeEnum resetMode) throws StatusException;
}
