package com.prosysopc.ua.types.di;

import com.prosysopc.ua.TypeDefinitionId;
import com.prosysopc.ua.UaNodeId;
import com.prosysopc.ua.stack.builtintypes.ExpandedNodeId;
import com.prosysopc.ua.stack.utils.AbstractStructure;
import com.prosysopc.ua.typedictionary.FieldSpecification;
import com.prosysopc.ua.typedictionary.StructureSpecification;
import java.lang.Deprecated;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;

/**
 * Generated on 2020-10-19 15:11:09
 */
@TypeDefinitionId("nsu=http://opcfoundation.org/UA/DI/;i=6522")
public abstract class FetchResultDataType extends AbstractStructure {
  @Deprecated
  public static final ExpandedNodeId ID = DiIds.FetchResultDataType;

  public static final StructureSpecification SPECIFICATION;

  static {
    StructureSpecification.Builder b = StructureSpecification.builder();
    b.setTypeId(UaNodeId.fromLocal(ID));
    b.setName("FetchResultDataType");
    b.setStructureType(StructureSpecification.StructureType.NORMAL);
    SPECIFICATION = b.build();
  }

  public FetchResultDataType() {
  }

  @Override
  public FetchResultDataType clone() {
    FetchResultDataType result = (FetchResultDataType) super.clone();
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    FetchResultDataType other = (FetchResultDataType) obj;
    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  @Deprecated
  public ExpandedNodeId getTypeId() {
    return ID;
  }

  @Override
  public StructureSpecification specification() {
    return SPECIFICATION;
  }

  @Override
  public Object get(FieldSpecification field) {
    throw new IllegalArgumentException("Unknown field: " + field);
  }

  @Override
  public void set(FieldSpecification field, Object value) {
    throw new IllegalArgumentException("Unknown field: " + field);
  }

  public abstract static class Builder extends AbstractStructure.Builder {
    protected Builder() {
    }

    @Override
    public Builder set(FieldSpecification field, Object value) {
      throw new IllegalArgumentException("Unknown field: " + field);
    }

    @Override
    public abstract FetchResultDataType build();
  }
}
