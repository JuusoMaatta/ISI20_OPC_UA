package com.prosysopc.ua.types.di.server;

import com.prosysopc.ua.StatusException;
import com.prosysopc.ua.server.ServiceContext;
import java.lang.Integer;

public abstract interface LockingServicesTypeExitLockMethod {
  Integer exitLock(ServiceContext serviceContext, LockingServicesTypeNode node) throws
      StatusException;
}
