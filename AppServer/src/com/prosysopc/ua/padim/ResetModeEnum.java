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
@TypeDefinitionId("nsu=http://opcfoundation.org/UA/PADIM/;i=1156")
public enum ResetModeEnum implements Enumeration {
  Application(1),

  Communication(2712),

  Factory(2713);

  public static final EnumerationSpecification SPECIFICATION;

  public static final EnumSet<ResetModeEnum> NONE = EnumSet.noneOf(ResetModeEnum.class);

  public static final EnumSet<ResetModeEnum> ALL = EnumSet.allOf(ResetModeEnum.class);

  private static final Map<Integer, ResetModeEnum> map;

  static {
    EnumerationSpecification.Builder b = EnumerationSpecification.builder();
    b.setName("ResetModeEnum");
    b.setTypeId(UaNodeId.fromLocal(ExpandedNodeId.parseExpandedNodeId("nsu=http://opcfoundation.org/UA/PADIM/;i=1156")));
    b.addMapping(1, "Application");
    b.addMapping(2712, "Communication");
    b.addMapping(2713, "Factory");
    b.setBuilderSupplier(new EnumerationSpecification.EnumerationBuilderSupplier() {
      @Override
      public Enumeration.Builder get() {
        return ResetModeEnum.builder();
      }
    });
    SPECIFICATION = b.build();
  }
  static {
    map = new HashMap<Integer,ResetModeEnum>();
    for (ResetModeEnum i : ResetModeEnum.values()) {
      map.put(i.value, i);
    }
  }

  private final int value;

  ResetModeEnum(int value) {
    this.value = value;
  }

  @Override
  public EnumerationSpecification specification() {
    return SPECIFICATION;
  }

  public static ResetModeEnum valueOf(int value) {
    return map.get(value);
  }

  public static ResetModeEnum valueOf(Integer value) {
    return value == null ? null : valueOf(value.intValue());
  }

  public static ResetModeEnum valueOf(UnsignedInteger value) {
    return value == null ? null : valueOf(value.intValue());
  }

  public static ResetModeEnum[] valueOf(int[] value) {
    ResetModeEnum[] result = new ResetModeEnum[value.length];
    for (int i = 0; i < value.length; i++) {
      result[i] = valueOf(value[i]);
    }
    return result;
  }

  public static ResetModeEnum[] valueOf(Integer[] value) {
    ResetModeEnum[] result = new ResetModeEnum[value.length];
    for (int i = 0; i < value.length; i++) {
      result[i] = valueOf(value[i]);
    }
    return result;
  }

  public static ResetModeEnum[] valueOf(UnsignedInteger[] value) {
    ResetModeEnum[] result = new ResetModeEnum[value.length];
    for (int i = 0; i < value.length; i++) {
      result[i] = valueOf(value[i]);
    }
    return result;
  }

  public static UnsignedInteger getMask(ResetModeEnum... list) {
    int result = 0;
    for (ResetModeEnum c : list) {
      result |= c.value;
    }
    return UnsignedInteger.getFromBits(result);
  }

  public static UnsignedInteger getMask(Collection<ResetModeEnum> list) {
    int result = 0;
    for (ResetModeEnum c : list) {
      result |= c.value;
    }
    return UnsignedInteger.getFromBits(result);
  }

  public static EnumSet<ResetModeEnum> getSet(UnsignedInteger mask) {
    return getSet(mask.intValue());
  }

  public static EnumSet<ResetModeEnum> getSet(int mask) {
    List<ResetModeEnum> res = new ArrayList<ResetModeEnum>();
    for (ResetModeEnum l : ResetModeEnum.values()) {
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
    private ResetModeEnum value;

    private Builder() {
    }

    @Override
    public ResetModeEnum build() {
      return value;
    }

    @Override
    public Builder setValue(int value) {
      this.value=ResetModeEnum.valueOf(value);
      if (this.value == null) {
        throw new IllegalArgumentException("Unknown enum ResetModeEnum int value: " + value);
      }
      return this;
    }
  }
}
