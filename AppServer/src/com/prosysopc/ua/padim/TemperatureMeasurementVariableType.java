package com.prosysopc.ua.padim;

import com.prosysopc.ua.StatusException;
import com.prosysopc.ua.TypeDefinitionId;
import com.prosysopc.ua.nodes.Mandatory;
import com.prosysopc.ua.nodes.Optional;
import com.prosysopc.ua.part19.MultiStateDictionaryEntryDiscreteType;
import com.prosysopc.ua.stack.builtintypes.UnsignedInteger;
import java.lang.String;

/**
 * Generated on 2020-10-19 15:11:10
 */
@TypeDefinitionId("nsu=http://opcfoundation.org/UA/PADIM/;i=1120")
public interface TemperatureMeasurementVariableType extends AnalogSignalVariableType {
  String SENSOR_TYPE = "SensorType";

  String SENSOR_CONNECTION = "SensorConnection";

  String SENSOR_REFERENCE = "SensorReference";

  @Mandatory
  MultiStateDictionaryEntryDiscreteType getSensorTypeNode();

  @Mandatory
  UnsignedInteger getSensorType();

  @Mandatory
  void setSensorType(UnsignedInteger value) throws StatusException;

  @Optional
  MultiStateDictionaryEntryDiscreteType getSensorConnectionNode();

  @Optional
  UnsignedInteger getSensorConnection();

  @Optional
  void setSensorConnection(UnsignedInteger value) throws StatusException;

  @Optional
  MultiStateDictionaryEntryDiscreteType getSensorReferenceNode();

  @Optional
  UnsignedInteger getSensorReference();

  @Optional
  void setSensorReference(UnsignedInteger value) throws StatusException;
}
