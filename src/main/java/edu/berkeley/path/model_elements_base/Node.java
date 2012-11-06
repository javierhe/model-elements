/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package edu.berkeley.path.model_elements_base;  
@SuppressWarnings("all")
public class Node extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Node\",\"namespace\":\"edu.berkeley.path.model_elements_base\",\"fields\":[{\"name\":\"id\",\"type\":\"string\"},{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"type\",\"type\":{\"type\":\"enum\",\"name\":\"NodeType\",\"doc\":\"* Type of node. Names are same as in DB, but with\\n   * spaces replaced by underscores.\",\"symbols\":[\"Freeway\",\"Highway\",\"Signalized_Intersection\",\"Stop_Intersection\",\"Simple\",\"Terminal\",\"Other\"]}}]}");
  @Deprecated public java.lang.CharSequence id;
  @Deprecated public java.lang.CharSequence name;
  @Deprecated public edu.berkeley.path.model_elements_base.NodeType type;

  /**
   * Default constructor.
   */
  public Node() {}

  /**
   * All-args constructor.
   */
  public Node(java.lang.CharSequence id, java.lang.CharSequence name, edu.berkeley.path.model_elements_base.NodeType type) {
    this.id = id;
    this.name = name;
    this.type = type;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return id;
    case 1: return name;
    case 2: return type;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: id = (java.lang.CharSequence)value$; break;
    case 1: name = (java.lang.CharSequence)value$; break;
    case 2: type = (edu.berkeley.path.model_elements_base.NodeType)value$; break;
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
   * Gets the value of the 'type' field.
   */
  public edu.berkeley.path.model_elements_base.NodeType getType() {
    return type;
  }

  /**
   * Sets the value of the 'type' field.
   * @param value the value to set.
   */
  public void setType(edu.berkeley.path.model_elements_base.NodeType value) {
    this.type = value;
  }

  /** Creates a new Node RecordBuilder */
  public static edu.berkeley.path.model_elements_base.Node.Builder newBuilder() {
    return new edu.berkeley.path.model_elements_base.Node.Builder();
  }
  
  /** Creates a new Node RecordBuilder by copying an existing Builder */
  public static edu.berkeley.path.model_elements_base.Node.Builder newBuilder(edu.berkeley.path.model_elements_base.Node.Builder other) {
    return new edu.berkeley.path.model_elements_base.Node.Builder(other);
  }
  
  /** Creates a new Node RecordBuilder by copying an existing Node instance */
  public static edu.berkeley.path.model_elements_base.Node.Builder newBuilder(edu.berkeley.path.model_elements_base.Node other) {
    return new edu.berkeley.path.model_elements_base.Node.Builder(other);
  }
  
  /**
   * RecordBuilder for Node instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Node>
    implements org.apache.avro.data.RecordBuilder<Node> {

    private java.lang.CharSequence id;
    private java.lang.CharSequence name;
    private edu.berkeley.path.model_elements_base.NodeType type;

    /** Creates a new Builder */
    private Builder() {
      super(edu.berkeley.path.model_elements_base.Node.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(edu.berkeley.path.model_elements_base.Node.Builder other) {
      super(other);
    }
    
    /** Creates a Builder by copying an existing Node instance */
    private Builder(edu.berkeley.path.model_elements_base.Node other) {
            super(edu.berkeley.path.model_elements_base.Node.SCHEMA$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = (java.lang.CharSequence) data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.name)) {
        this.name = (java.lang.CharSequence) data().deepCopy(fields()[1].schema(), other.name);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.type)) {
        this.type = (edu.berkeley.path.model_elements_base.NodeType) data().deepCopy(fields()[2].schema(), other.type);
        fieldSetFlags()[2] = true;
      }
    }

    /** Gets the value of the 'id' field */
    public java.lang.CharSequence getId() {
      return id;
    }
    
    /** Sets the value of the 'id' field */
    public edu.berkeley.path.model_elements_base.Node.Builder setId(java.lang.CharSequence value) {
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
    public edu.berkeley.path.model_elements_base.Node.Builder clearId() {
      id = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'name' field */
    public java.lang.CharSequence getName() {
      return name;
    }
    
    /** Sets the value of the 'name' field */
    public edu.berkeley.path.model_elements_base.Node.Builder setName(java.lang.CharSequence value) {
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
    public edu.berkeley.path.model_elements_base.Node.Builder clearName() {
      name = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'type' field */
    public edu.berkeley.path.model_elements_base.NodeType getType() {
      return type;
    }
    
    /** Sets the value of the 'type' field */
    public edu.berkeley.path.model_elements_base.Node.Builder setType(edu.berkeley.path.model_elements_base.NodeType value) {
      validate(fields()[2], value);
      this.type = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'type' field has been set */
    public boolean hasType() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'type' field */
    public edu.berkeley.path.model_elements_base.Node.Builder clearType() {
      type = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    public Node build() {
      try {
        Node record = new Node();
        record.id = fieldSetFlags()[0] ? this.id : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.name = fieldSetFlags()[1] ? this.name : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.type = fieldSetFlags()[2] ? this.type : (edu.berkeley.path.model_elements_base.NodeType) defaultValue(fields()[2]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
