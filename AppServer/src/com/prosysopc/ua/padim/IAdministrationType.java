package com.prosysopc.ua.padim;

import com.prosysopc.ua.ServiceException;
import com.prosysopc.ua.StatusException;
import com.prosysopc.ua.TypeDefinitionId;
import com.prosysopc.ua.nodes.Optional;
import com.prosysopc.ua.nodes.UaMethod;
import com.prosysopc.ua.stack.builtintypes.DateTime;
import com.prosysopc.ua.types.opcua.BaseDataVariableType;
import com.prosysopc.ua.types.opcua.BaseInterfaceType;
import java.lang.String;

/**
 * Generated on 2020-10-19 15:11:10
 */
@TypeDefinitionId("nsu=http://opcfoundation.org/UA/PADIM/;i=1050")
public interface IAdministrationType extends BaseInterfaceType {
  String DISPLAY_LANGUAGE = "DisplayLanguage";

  String DATE_OF_LAST_CHANGE = "DateOfLastChange";

  String FACTORY_RESET = "FactoryReset";

  @Optional
  BaseDataVariableType getDisplayLanguageNode();

  @Optional
  String getDisplayLanguage();

  @Optional
  void setDisplayLanguage(String value) throws StatusException;

  @Optional
  BaseDataVariableType getDateOfLastChangeNode();

  @Optional
  DateTime getDateOfLastChange();

  @Optional
  void setDateOfLastChange(DateTime value) throws StatusException;

  @Optional
  UaMethod getFactoryResetNode();

  void factoryReset(ResetModeEnum resetMode) throws StatusException, ServiceException;
}
