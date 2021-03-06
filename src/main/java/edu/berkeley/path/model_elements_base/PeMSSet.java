/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package edu.berkeley.path.model_elements_base;  
@SuppressWarnings("all")
/** * PeMS sensor data set, organized as a time-series
   * of maps. This makes sense because filtered pems data
   * is generated at multiples of 30 seconds: 00:00, 00:30, ... */
public class PeMSSet extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"PeMSSet\",\"namespace\":\"edu.berkeley.path.model_elements_base\",\"doc\":\"* PeMS sensor data set, organized as a time-series\\n   * of maps. This makes sense because filtered pems data\\n   * is generated at multiples of 30 seconds: 00:00, 00:30, ...\",\"fields\":[{\"name\":\"pemsMap\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"PeMSMap\",\"doc\":\"* PeMS sensor data map, organized by VDS.\",\"fields\":[{\"name\":\"pems\",\"type\":{\"type\":\"map\",\"values\":{\"type\":\"record\",\"name\":\"PeMS\",\"doc\":\"* PeMS sensor datum as output by PeMS filter, for a specific\\n   * station and time.\",\"fields\":[{\"name\":\"vdsId\",\"type\":\"long\"},{\"name\":\"timeMeasured\",\"type\":{\"type\":\"record\",\"name\":\"DateTime\",\"doc\":\"milliseconds, absolute, since epoch, utc\",\"fields\":[{\"name\":\"milliseconds\",\"type\":\"long\"}]}},{\"name\":\"flow\",\"type\":[\"double\",\"null\"]},{\"name\":\"density\",\"type\":[\"double\",\"null\"]},{\"name\":\"densityError\",\"type\":[\"double\",\"null\"]},{\"name\":\"speed\",\"type\":[\"double\",\"null\"]},{\"name\":\"speedError\",\"type\":[\"double\",\"null\"]},{\"name\":\"freeFlowSpeed\",\"type\":[\"double\",\"null\"]},{\"name\":\"funcLoopFact\",\"type\":[\"double\",\"null\"]},{\"name\":\"gFactorLane\",\"type\":{\"type\":\"array\",\"items\":[\"double\",\"null\"]}}]},\"avro.java.string\":\"String\"},\"doc\":\"* Key is VDS id. Represents the state of the sensors at\\n     * one point in time.\"}]}}}]}");
  @Deprecated public java.util.List<edu.berkeley.path.model_elements_base.PeMSMap> pemsMap;

  /**
   * Default constructor.
   */
  public PeMSSet() {}

  /**
   * All-args constructor.
   */
  public PeMSSet(java.util.List<edu.berkeley.path.model_elements_base.PeMSMap> pemsMap) {
    this.pemsMap = pemsMap;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return pemsMap;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: pemsMap = (java.util.List<edu.berkeley.path.model_elements_base.PeMSMap>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'pemsMap' field.
   */
  public java.util.List<edu.berkeley.path.model_elements_base.PeMSMap> getPemsMap() {
    return pemsMap;
  }

  /**
   * Sets the value of the 'pemsMap' field.
   * @param value the value to set.
   */
  public void setPemsMap(java.util.List<edu.berkeley.path.model_elements_base.PeMSMap> value) {
    this.pemsMap = value;
  }

  /** Creates a new PeMSSet RecordBuilder */
  public static edu.berkeley.path.model_elements_base.PeMSSet.Builder newBuilder() {
    return new edu.berkeley.path.model_elements_base.PeMSSet.Builder();
  }
  
  /** Creates a new PeMSSet RecordBuilder by copying an existing Builder */
  public static edu.berkeley.path.model_elements_base.PeMSSet.Builder newBuilder(edu.berkeley.path.model_elements_base.PeMSSet.Builder other) {
    return new edu.berkeley.path.model_elements_base.PeMSSet.Builder(other);
  }
  
  /** Creates a new PeMSSet RecordBuilder by copying an existing PeMSSet instance */
  public static edu.berkeley.path.model_elements_base.PeMSSet.Builder newBuilder(edu.berkeley.path.model_elements_base.PeMSSet other) {
    return new edu.berkeley.path.model_elements_base.PeMSSet.Builder(other);
  }
  
  /**
   * RecordBuilder for PeMSSet instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<PeMSSet>
    implements org.apache.avro.data.RecordBuilder<PeMSSet> {

    private java.util.List<edu.berkeley.path.model_elements_base.PeMSMap> pemsMap;

    /** Creates a new Builder */
    private Builder() {
      super(edu.berkeley.path.model_elements_base.PeMSSet.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(edu.berkeley.path.model_elements_base.PeMSSet.Builder other) {
      super(other);
    }
    
    /** Creates a Builder by copying an existing PeMSSet instance */
    private Builder(edu.berkeley.path.model_elements_base.PeMSSet other) {
            super(edu.berkeley.path.model_elements_base.PeMSSet.SCHEMA$);
      if (isValidValue(fields()[0], other.pemsMap)) {
        this.pemsMap = (java.util.List<edu.berkeley.path.model_elements_base.PeMSMap>) data().deepCopy(fields()[0].schema(), other.pemsMap);
        fieldSetFlags()[0] = true;
      }
    }

    /** Gets the value of the 'pemsMap' field */
    public java.util.List<edu.berkeley.path.model_elements_base.PeMSMap> getPemsMap() {
      return pemsMap;
    }
    
    /** Sets the value of the 'pemsMap' field */
    public edu.berkeley.path.model_elements_base.PeMSSet.Builder setPemsMap(java.util.List<edu.berkeley.path.model_elements_base.PeMSMap> value) {
      validate(fields()[0], value);
      this.pemsMap = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'pemsMap' field has been set */
    public boolean hasPemsMap() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'pemsMap' field */
    public edu.berkeley.path.model_elements_base.PeMSSet.Builder clearPemsMap() {
      pemsMap = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    @Override
    public PeMSSet build() {
      try {
        PeMSSet record = new PeMSSet();
        record.pemsMap = fieldSetFlags()[0] ? this.pemsMap : (java.util.List<edu.berkeley.path.model_elements_base.PeMSMap>) defaultValue(fields()[0]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
