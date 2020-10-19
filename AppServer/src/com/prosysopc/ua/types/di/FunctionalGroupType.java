package com.prosysopc.ua.types.di;

import com.prosysopc.ua.StatusException;
import com.prosysopc.ua.TypeDefinitionId;
import com.prosysopc.ua.nodes.Optional;
import com.prosysopc.ua.types.opcua.FolderType;
import java.lang.Object;
import java.lang.String;

/**
 * FolderType is used to organize the Parameters and Methods from the complete set (ParameterSet, MethodSet) with regard to their application
 * <p>
 * Generated on 2020-10-19 15:11:09
 */
@TypeDefinitionId("nsu=http://opcfoundation.org/UA/DI/;i=1005")
public interface FunctionalGroupType extends FolderType {
  String GROUP_IDENTIFIER = "<GroupIdentifier>";

  String U_I_ELEMENT = "UIElement";

  @Optional
  UIElementType getUIElementNode();

  @Optional
  Object getUIElement();

  @Optional
  void setUIElement(Object value) throws StatusException;
}
