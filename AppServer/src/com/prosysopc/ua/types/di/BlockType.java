package com.prosysopc.ua.types.di;

import com.prosysopc.ua.StatusException;
import com.prosysopc.ua.TypeDefinitionId;
import com.prosysopc.ua.nodes.Optional;
import com.prosysopc.ua.nodes.UaProperty;
import com.prosysopc.ua.stack.builtintypes.LocalizedText;
import java.lang.Integer;
import java.lang.String;

/**
 * Adds the concept of Blocks needed for block-oriented FieldDevices
 * <p>
 * Generated on 2020-10-19 15:11:09
 */
@TypeDefinitionId("nsu=http://opcfoundation.org/UA/DI/;i=1003")
public interface BlockType extends TopologyElementType {
  String REVISION_COUNTER = "RevisionCounter";

  String ACTUAL_MODE = "ActualMode";

  String PERMITTED_MODE = "PermittedMode";

  String NORMAL_MODE = "NormalMode";

  String TARGET_MODE = "TargetMode";

  @Optional
  UaProperty getRevisionCounterNode();

  @Optional
  Integer getRevisionCounter();

  @Optional
  void setRevisionCounter(Integer value) throws StatusException;

  @Optional
  UaProperty getActualModeNode();

  @Optional
  LocalizedText getActualMode();

  @Optional
  void setActualMode(LocalizedText value) throws StatusException;

  @Optional
  UaProperty getPermittedModeNode();

  @Optional
  LocalizedText[] getPermittedMode();

  @Optional
  void setPermittedMode(LocalizedText[] value) throws StatusException;

  @Optional
  UaProperty getNormalModeNode();

  @Optional
  LocalizedText[] getNormalMode();

  @Optional
  void setNormalMode(LocalizedText[] value) throws StatusException;

  @Optional
  UaProperty getTargetModeNode();

  @Optional
  LocalizedText[] getTargetMode();

  @Optional
  void setTargetMode(LocalizedText[] value) throws StatusException;
}
