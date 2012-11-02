/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package edu.berkeley.path.model_elements_base;  
@SuppressWarnings("all")
public class DensitySet extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"DensitySet\",\"namespace\":\"edu.berkeley.path.model_elements_base\",\"fields\":[{\"name\":\"id\",\"type\":\"string\"},{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"description\",\"type\":[\"null\",\"string\"]},{\"name\":\"density\",\"type\":{\"type\":\"record\",\"name\":\"DensityMap\",\"doc\":\"* Density on each link at a point in time\",\"fields\":[{\"name\":\"vehiclesPerMeter\",\"type\":{\"type\":\"map\",\"values\":\"double\"},\"doc\":\"map key is linkId\",\"default\":{}}]}}]}");
  @Deprecated public java.lang.CharSequence id;
  @Deprecated public java.lang.CharSequence name;
  @Deprecated public java.lang.CharSequence description;
  @Deprecated public edu.berkeley.path.model_elements_base.DensityMap density;

  /**
   * Default constructor.
   */
  public DensitySet() {}

  /**
   * All-args constructor.
   */
  public DensitySet(java.lang.CharSequence id, java.lang.CharSequence name, java.lang.CharSequence description, edu.berkeley.path.model_elements_base.DensityMap density) {
    this.id = id;
    this.name = name;
    this.description = description;
    this.density = density;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return id;
    case 1: return name;
    case 2: return description;
    case 3: return density;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: id = (java.lang.CharSequence)value$; break;
    case 1: name = (java.lang.CharSequence)value$; break;
    case 2: description = (java.lang.CharSequence)value$; break;
    case 3: density = (edu.berkeley.path.model_elements_base.DensityMap)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'id' field.
   */
  public java.lang.CharSequence getId() {
    return id;
  }

  /**
   * Sets the value of the 'id' field.
   * @param value the value to set.
   */
  public void setId(java.lang.CharSequence value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'name' field.
   */
  public java.lang.CharSequence getName() {
    return name;
  }

  /**
   * Sets the value of the 'name' field.
   * @param value the value to set.
   */
  public void setName(java.lang.CharSequence value) {
    this.name = value;
  }

  /**
   * Gets the value of the 'description' field.
   */
  public java.lang.CharSequence getDescription() {
    return description;
  }

  /**
   * Sets the value of the 'description' field.
   * @param value the value to set.
   */
  public void setDescription(java.lang.CharSequence value) {
    this.description = value;
  }

  /**
   * Gets the value of the 'density' field.
   */
  public edu.berkeley.path.model_elements_base.DensityMap getDensity() {
    return density;
  }

  /**
   * Sets the value of the 'density' field.
   * @param value the value to set.
   */
  public void setDensity(edu.berkeley.path.model_elements_base.DensityMap value) {
    this.density = value;
  }

  /** Creates a new DensitySet RecordBuilder */
  public static edu.berkeley.path.model_elements_base.DensitySet.Builder newBuilder() {
    return new edu.berkeley.path.model_elements_base.DensitySet.Builder();
  }
  
  /** Creates a new DensitySet RecordBuilder by copying an existing Builder */
  public static edu.berkeley.path.model_elements_base.DensitySet.Builder newBuilder(edu.berkeley.path.model_elements_base.DensitySet.Builder other) {
    return new edu.berkeley.path.model_elements_base.DensitySet.Builder(other);
  }
  
  /** Creates a new DensitySet RecordBuilder by copying an existing DensitySet instance */
  public static edu.berkeley.path.model_elements_base.DensitySet.Builder newBuilder(edu.berkeley.path.model_elements_base.DensitySet other) {
    return new edu.berkeley.path.model_elements_base.DensitySet.Builder(other);
  }
  
  /**
   * RecordBuilder for DensitySet instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<DensitySet>
    implements org.apache.avro.data.RecordBuilder<DensitySet> {

    private java.lang.CharSequence id;
    private java.lang.CharSequence name;
    private java.lang.CharSequence description;
    private edu.berkeley.path.model_elements_base.DensityMap density;

    /** Creates a new Builder */
    private Builder() {
      super(edu.berkeley.path.model_elements_base.DensitySet.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(edu.berkeley.path.model_elements_base.DensitySet.Builder other) {
      super(other);
    }
    
    /** Creates a Builder by copying an existing DensitySet instance */
    private Builder(edu.berkeley.path.model_elements_base.DensitySet other) {
            super(edu.berkeley.path.model_elements_base.DensitySet.SCHEMA$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = (java.lang.CharSequence) data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.name)) {
        this.name = (java.lang.CharSequence) data().deepCopy(fields()[1].schema(), other.name);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.description)) {
        this.description = (java.lang.CharSequence) data().deepCopy(fields()[2].schema(), other.description);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.density)) {
        this.density = (edu.berkeley.path.model_elements_base.DensityMap) data().deepCopy(fields()[3].schema(), other.density);
        fieldSetFlags()[3] = true;
      }
    }

    /** Gets the value of the 'id' field */
    public java.lang.CharSequence getId() {
      return id;
    }
    
    /** Sets the value of the 'id' field */
    public edu.berkeley.path.model_elements_base.DensitySet.Builder setId(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.id = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'id' field has been set */
    public boolean hasId() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'id' field */
    public edu.berkeley.path.model_elements_base.DensitySet.Builder clearId() {
      id = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'name' field */
    public java.lang.CharSequence getName() {
      return name;
    }
    
    /** Sets the value of the 'name' field */
    public edu.berkeley.path.model_elements_base.DensitySet.Builder setName(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.name = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'name' field has been set */
    public boolean hasName() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'name' field */
    public edu.berkeley.path.model_elements_base.DensitySet.Builder clearName() {
      name = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'description' field */
    public java.lang.CharSequence getDescription() {
      return description;
    }
    
    /** Sets the value of the 'description' field */
    public edu.berkeley.path.model_elements_base.DensitySet.Builder setDescription(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.description = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'description' field has been set */
    public boolean hasDescription() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'description' field */
    public edu.berkeley.path.model_elements_base.DensitySet.Builder clearDescription() {
      description = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'density' field */
    public edu.berkeley.path.model_elements_base.DensityMap getDensity() {
      return density;
    }
    
    /** Sets the value of the 'density' field */
    public edu.berkeley.path.model_elements_base.DensitySet.Builder setDensity(edu.berkeley.path.model_elements_base.DensityMap value) {
      validate(fields()[3], value);
      this.density = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'density' field has been set */
    public boolean hasDensity() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'density' field */
    public edu.berkeley.path.model_elements_base.DensitySet.Builder clearDensity() {
      density = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    public DensitySet build() {
      try {
        DensitySet record = new DensitySet();
        record.id = fieldSetFlags()[0] ? this.id : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.name = fieldSetFlags()[1] ? this.name : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.description = fieldSetFlags()[2] ? this.description : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.density = fieldSetFlags()[3] ? this.density : (edu.berkeley.path.model_elements_base.DensityMap) defaultValue(fields()[3]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
