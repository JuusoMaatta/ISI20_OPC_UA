package com.prosysopc.ua.types.di;

import com.prosysopc.ua.TypeDefinitionId;
import com.prosysopc.ua.nodes.Optional;
import com.prosysopc.ua.types.opcua.BaseObjectType;
import java.lang.String;

/**
 * Defines the basic information components for all configurable elements in a device topology
 * <p>
 * Generated on 2020-10-19 15:11:09
 */
@TypeDefinitionId("nsu=http://opcfoundation.org/UA/DI/;i=1001")
public interface TopologyElementType extends BaseObjectType {
  String PARAMETER_SET = "ParameterSet";

  String METHOD_SET = "MethodSet";

  String GROUP_IDENTIFIER = "<GroupIdentifier>";

  String IDENTIFICATION = "Identification";

  String LOCK = "Lock";

  @Optional
  BaseObjectType getParameterSetNode();

  @Optional
  BaseObjectType getMethodSetNode();

  @Optional
  FunctionalGroupType getIdentificationNode();

  @Optional
  LockingServicesType getLockNode();
}
