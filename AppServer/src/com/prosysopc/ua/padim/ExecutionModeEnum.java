package com.prosysopc.ua.padim;

import com.prosysopc.ua.TypeDefinitionId;
import com.prosysopc.ua.UaNodeId;
import com.prosysopc.ua.stack.builtintypes.Enumeration;
import com.prosysopc.ua.stack.builtintypes.ExpandedNodeId;
import com.prosysopc.ua.stack.builtintypes.UnsignedInteger;
import com.prosysopc.ua.typedictionary.EnumerationSpecification;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Override;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated on 2020-10-19 15:11:10
 */
@TypeDefinitionId("nsu=http://opcfoundation.org/UA/PADIM/;i=1158")
public enum ExecutionModeEnum implements Enumeration {
  Start(2),

  Abort(255);

  public static final EnumerationSpecification SPECIFICATION;

  public static final EnumSet<ExecutionModeEnum> NONE = EnumSet.noneOf(ExecutionModeEnum.class);

  public static final EnumSet<ExecutionModeEnum> ALL = EnumSet.allOf(ExecutionModeEnum.class);

  private static final Map<Integer, ExecutionModeEnum> map;

  static {
    EnumerationSpecification.Builder b = EnumerationSpecification.builder();
    b.setName("ExecutionModeEnum");
    b.setTypeId(UaNodeId.fromLocal(ExpandedNodeId.parseExpandedNodeId("nsu=http://opcfoundation.org/UA/PADIM/;i=1158")));
    b.addMapping(2, "Start");
    b.addMapping(255, "Abort");
    b.setBuilderSupplier(new EnumerationSpecification.EnumerationBuilderSupplier() {
      @Override
      public Enumeration.Builder get() {
        return ExecutionModeEnum.builder();
      }
    });
    SPECIFICATION = b.build();
  }
  static {
    map = new HashMap<Integer,ExecutionModeEnum>();
    for (ExecutionModeEnum i : ExecutionModeEnum.values()) {
      map.put(i.value, i);
    }
  }

  private final int value;

  ExecutionModeEnum(int value) {
    this.value = value;
  }

  @Override
  public EnumerationSpecification specification() {
    return SPECIFICATION;
  }

  public static ExecutionModeEnum valueOf(int value) {
    return map.get(value);
  }

  public static ExecutionModeEnum valueOf(Integer value) {
    return value == null ? null : valueOf(value.intValue());
  }

  public static ExecutionModeEnum valueOf(UnsignedInteger value) {
    return value == null ? null : valueOf(value.intValue());
  }

  public static ExecutionModeEnum[] valueOf(int[] value) {
    ExecutionModeEnum[] result = new ExecutionModeEnum[value.length];
    for (int i = 0; i < value.length; i++) {
      result[i] = valueOf(value[i]);
    }
    return result;
  }

  public static ExecutionModeEnum[] valueOf(Integer[] value) {
    ExecutionModeEnum[] result = new ExecutionModeEnum[value.length];
    for (int i = 0; i < value.length; i++) {
      result[i] = valueOf(value[i]);
    }
    return result;
  }

  public static ExecutionModeEnum[] valueOf(UnsignedInteger[] value) {
    ExecutionModeEnum[] result = new ExecutionModeEnum[value.length];
    for (int i = 0; i < value.length; i++) {
      result[i] = valueOf(value[i]);
    }
    return result;
  }

  public static UnsignedInteger getMask(ExecutionModeEnum... list) {
    int result = 0;
    for (ExecutionModeEnum c : list) {
      result |= c.value;
    }
    return UnsignedInteger.getFromBits(result);
  }

  public static UnsignedInteger getMask(Collection<ExecutionModeEnum> list) {
    int result = 0;
    for (ExecutionModeEnum c : list) {
      result |= c.value;
    }
    return UnsignedInteger.getFromBits(result);
  }

  public static EnumSet<ExecutionModeEnum> getSet(UnsignedInteger mask) {
    return getSet(mask.intValue());
  }

  public static EnumSet<ExecutionModeEnum> getSet(int mask) {
    List<ExecutionModeEnum> res = new ArrayList<ExecutionModeEnum>();
    for (ExecutionModeEnum l : ExecutionModeEnum.values()) {
      if ((mask & l.value) == l.value) {
        res.add(l);
      }
    }
    return EnumSet.copyOf(res);
  }

  @Override
  public int getValue() {
    return value;
  }

  public static Builder builder() {
    return new Builder();
  }

  @Override
  public Builder toBuilder() {
    Builder b = builder();
    b.setValue(this.getValue());
    return b;
  }

  public static class Builder implements Enumeration.Builder {
    private ExecutionModeEnum value;

    private Builder() {
    }

    @Override
    public ExecutionModeEnum build() {
      return value;
    }

    @Override
    public Builder setValue(int value) {
      this.value=ExecutionModeEnum.valueOf(value);
      if (this.value == null) {
        throw new IllegalArgumentException("Unknown enum ExecutionModeEnum int value: " + value);
      }
      return this;
    }
  }
}
