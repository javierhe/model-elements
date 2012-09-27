/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package edu.berkeley.path.model_elements_base;  
@SuppressWarnings("all")
/** seconds and milliseconds, can be absolute or relative
     (when absolute: since epoch, utc) */
public class Time extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Time\",\"namespace\":\"edu.berkeley.path.model_elements_base\",\"doc\":\"seconds and milliseconds, can be absolute or relative\\n     (when absolute: since epoch, utc)\",\"fields\":[{\"name\":\"seconds\",\"type\":\"long\"},{\"name\":\"milliseconds\",\"type\":\"long\"}]}");
  @Deprecated public long seconds;
  @Deprecated public long milliseconds;

  /**
   * Default constructor.
   */
  public Time() {}

  /**
   * All-args constructor.
   */
  public Time(java.lang.Long seconds, java.lang.Long milliseconds) {
    this.seconds = seconds;
    this.milliseconds = milliseconds;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return seconds;
    case 1: return milliseconds;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: seconds = (java.lang.Long)value$; break;
    case 1: milliseconds = (java.lang.Long)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'seconds' field.
   */
  public java.lang.Long getSeconds() {
    return seconds;
  }

  /**
   * Sets the value of the 'seconds' field.
   * @param value the value to set.
   */
  public void setSeconds(java.lang.Long value) {
    this.seconds = value;
  }

  /**
   * Gets the value of the 'milliseconds' field.
   */
  public java.lang.Long getMilliseconds() {
    return milliseconds;
  }

  /**
   * Sets the value of the 'milliseconds' field.
   * @param value the value to set.
   */
  public void setMilliseconds(java.lang.Long value) {
    this.milliseconds = value;
  }

  /** Creates a new Time RecordBuilder */
  public static edu.berkeley.path.model_elements_base.Time.Builder newBuilder() {
    return new edu.berkeley.path.model_elements_base.Time.Builder();
  }
  
  /** Creates a new Time RecordBuilder by copying an existing Builder */
  public static edu.berkeley.path.model_elements_base.Time.Builder newBuilder(edu.berkeley.path.model_elements_base.Time.Builder other) {
    return new edu.berkeley.path.model_elements_base.Time.Builder(other);
  }
  
  /** Creates a new Time RecordBuilder by copying an existing Time instance */
  public static edu.berkeley.path.model_elements_base.Time.Builder newBuilder(edu.berkeley.path.model_elements_base.Time other) {
    return new edu.berkeley.path.model_elements_base.Time.Builder(other);
  }
  
  /**
   * RecordBuilder for Time instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Time>
    implements org.apache.avro.data.RecordBuilder<Time> {

    private long seconds;
    private long milliseconds;

    /** Creates a new Builder */
    private Builder() {
      super(edu.berkeley.path.model_elements_base.Time.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(edu.berkeley.path.model_elements_base.Time.Builder other) {
      super(other);
    }
    
    /** Creates a Builder by copying an existing Time instance */
    private Builder(edu.berkeley.path.model_elements_base.Time other) {
            super(edu.berkeley.path.model_elements_base.Time.SCHEMA$);
      if (isValidValue(fields()[0], other.seconds)) {
        this.seconds = (java.lang.Long) data().deepCopy(fields()[0].schema(), other.seconds);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.milliseconds)) {
        this.milliseconds = (java.lang.Long) data().deepCopy(fields()[1].schema(), other.milliseconds);
        fieldSetFlags()[1] = true;
      }
    }

    /** Gets the value of the 'seconds' field */
    public java.lang.Long getSeconds() {
      return seconds;
    }
    
    /** Sets the value of the 'seconds' field */
    public edu.berkeley.path.model_elements_base.Time.Builder setSeconds(long value) {
      validate(fields()[0], value);
      this.seconds = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'seconds' field has been set */
    public boolean hasSeconds() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'seconds' field */
    public edu.berkeley.path.model_elements_base.Time.Builder clearSeconds() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'milliseconds' field */
    public java.lang.Long getMilliseconds() {
      return milliseconds;
    }
    
    /** Sets the value of the 'milliseconds' field */
    public edu.berkeley.path.model_elements_base.Time.Builder setMilliseconds(long value) {
      validate(fields()[1], value);
      this.milliseconds = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'milliseconds' field has been set */
    public boolean hasMilliseconds() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'milliseconds' field */
    public edu.berkeley.path.model_elements_base.Time.Builder clearMilliseconds() {
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public Time build() {
      try {
        Time record = new Time();
        record.seconds = fieldSetFlags()[0] ? this.seconds : (java.lang.Long) defaultValue(fields()[0]);
        record.milliseconds = fieldSetFlags()[1] ? this.milliseconds : (java.lang.Long) defaultValue(fields()[1]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
