package com.prosysopc.ua.types.di.server;

import com.prosysopc.ua.StatusException;
import com.prosysopc.ua.server.ServiceContext;
import java.lang.Integer;
import java.lang.String;

public abstract interface LockingServicesTypeInitLockMethod {
  Integer initLock(ServiceContext serviceContext, LockingServicesTypeNode node, String context)
      throws StatusException;
}
