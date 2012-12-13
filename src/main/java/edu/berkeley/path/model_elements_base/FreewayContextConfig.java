/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package edu.berkeley.path.model_elements_base;  
@SuppressWarnings("all")
/** * Static configuration of a set of freeway runs.
   *
   * The parameters encapsulated here are separate from Scenario inputs
   * in that they express *how* the run is modeled and executed,
   * rather than *what* is modeled.
   *
   * These parameters are used by the Context subclasses.
   *
   * Note that a context does not include a scenario. Scenarios are read
   * dynamically using a ScenarioSource. */
public class FreewayContextConfig extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"FreewayContextConfig\",\"namespace\":\"edu.berkeley.path.model_elements_base\",\"doc\":\"* Static configuration of a set of freeway runs.\\n   *\\n   * The parameters encapsulated here are separate from Scenario inputs\\n   * in that they express *how* the run is modeled and executed,\\n   * rather than *what* is modeled.\\n   *\\n   * These parameters are used by the Context subclasses.\\n   *\\n   * Note that a context does not include a scenario. Scenarios are read\\n   * dynamically using a ScenarioSource.\",\"fields\":[{\"name\":\"id\",\"type\":\"string\"},{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"runMode\",\"type\":\"string\",\"doc\":\"* historical, live\\n     *\"},{\"name\":\"workflow\",\"type\":\"string\",\"doc\":\"* forecast, estimation\\n     *\"},{\"name\":\"feed\",\"type\":\"string\",\"doc\":\"* probea, probeb, pems\\n    *\"},{\"name\":\"ctmType\",\"type\":\"string\"},{\"name\":\"ensembleSize\",\"type\":\"int\"},{\"name\":\"fdType\",\"type\":\"string\"},{\"name\":\"additiveModelNoiseMean\",\"type\":\"double\"},{\"name\":\"additiveModelNoiseStdDev\",\"type\":\"double\"},{\"name\":\"initialDensityFraction\",\"type\":\"double\"},{\"name\":\"enkfType\",\"type\":\"string\"},{\"name\":\"enkfParams\",\"type\":{\"type\":\"record\",\"name\":\"EnKFParams\",\"doc\":\"* Context and Run Config section\\n   *\\n   * Configuration that applies to one run or a group of runs.\\n   *\\n   * These objects correspond to the TBD Run tables.\",\"fields\":[{\"name\":\"confidenceDefault\",\"type\":\"double\"},{\"name\":\"confidenceHasMeasurement\",\"type\":\"double\"},{\"name\":\"confidenceNoMeasurement\",\"type\":\"double\"},{\"name\":\"confidenceMeasurementLifetime\",\"type\":\"double\"},{\"name\":\"localizationDistance\",\"type\":\"double\"},{\"name\":\"useLocalization\",\"type\":\"boolean\"},{\"name\":\"modelNoiseMean\",\"type\":\"double\"},{\"name\":\"modelNoiseStdev\",\"type\":\"double\"},{\"name\":\"navteqNoiseMean\",\"type\":\"double\"},{\"name\":\"navteqNoiseStdev\",\"type\":\"double\"},{\"name\":\"navteqPercentage\",\"type\":\"double\"},{\"name\":\"PemsBlackList\",\"type\":{\"type\":\"array\",\"items\":\"int\"}},{\"name\":\"pemsNoiseMean\",\"type\":\"double\"},{\"name\":\"pemsNoiseStdev\",\"type\":\"double\"},{\"name\":\"telenavNoiseMean\",\"type\":\"double\"},{\"name\":\"telenavNoiseStdev\",\"type\":\"double\"},{\"name\":\"telenavPercentage\",\"type\":\"double\"}]}},{\"name\":\"dtOutput\",\"type\":{\"type\":\"record\",\"name\":\"Duration\",\"doc\":\"milliseconds\",\"fields\":[{\"name\":\"milliseconds\",\"type\":\"long\"}]}},{\"name\":\"dt\",\"type\":\"Duration\"},{\"name\":\"timeBegin\",\"type\":{\"type\":\"record\",\"name\":\"DateTime\",\"doc\":\"milliseconds, absolute, since epoch, utc\",\"fields\":[{\"name\":\"milliseconds\",\"type\":\"long\"}]}},{\"name\":\"timeEnd\",\"type\":\"DateTime\"},{\"name\":\"sensorSet\",\"type\":{\"type\":\"record\",\"name\":\"SensorSet\",\"doc\":\"* Set of sensors residing on links in potentially multiple networks.\",\"fields\":[{\"name\":\"id\",\"type\":\"string\"},{\"name\":\"name\",\"type\":[\"null\",\"string\"]},{\"name\":\"description\",\"type\":[\"null\",\"string\"]},{\"name\":\"sensors\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Sensor\",\"doc\":\"* Sensor that can describe loop detector, magnetic detector, TMC, camera, radar, etc.\",\"fields\":[{\"name\":\"id\",\"type\":\"string\"},{\"name\":\"type\",\"type\":\"string\"},{\"name\":\"entity_id\",\"type\":[\"null\",\"string\"]},{\"name\":\"measurement_feed_id\",\"type\":[\"null\",\"string\"]},{\"name\":\"link_id\",\"type\":\"string\"},{\"name\":\"link_offset\",\"type\":\"double\",\"default\":0},{\"name\":\"lane_num\",\"type\":\"double\",\"default\":1},{\"name\":\"health_status\",\"type\":\"double\",\"default\":1}]}}}]}}]}");
  @Deprecated public java.lang.CharSequence id;
  @Deprecated public java.lang.CharSequence name;
  /** * historical, live
     * */
  @Deprecated public java.lang.CharSequence runMode;
  /** * forecast, estimation
     * */
  @Deprecated public java.lang.CharSequence workflow;
  /** * probea, probeb, pems
    * */
  @Deprecated public java.lang.CharSequence feed;
  @Deprecated public java.lang.CharSequence ctmType;
  @Deprecated public int ensembleSize;
  @Deprecated public java.lang.CharSequence fdType;
  @Deprecated public double additiveModelNoiseMean;
  @Deprecated public double additiveModelNoiseStdDev;
  @Deprecated public double initialDensityFraction;
  @Deprecated public java.lang.CharSequence enkfType;
  @Deprecated public edu.berkeley.path.model_elements_base.EnKFParams enkfParams;
  @Deprecated public edu.berkeley.path.model_elements_base.Duration dtOutput;
  @Deprecated public edu.berkeley.path.model_elements_base.Duration dt;
  @Deprecated public edu.berkeley.path.model_elements_base.DateTime timeBegin;
  @Deprecated public edu.berkeley.path.model_elements_base.DateTime timeEnd;
  @Deprecated public edu.berkeley.path.model_elements_base.SensorSet sensorSet;

  /**
   * Default constructor.
   */
  public FreewayContextConfig() {}

  /**
   * All-args constructor.
   */
  public FreewayContextConfig(java.lang.CharSequence id, java.lang.CharSequence name, java.lang.CharSequence runMode, java.lang.CharSequence workflow, java.lang.CharSequence feed, java.lang.CharSequence ctmType, java.lang.Integer ensembleSize, java.lang.CharSequence fdType, java.lang.Double additiveModelNoiseMean, java.lang.Double additiveModelNoiseStdDev, java.lang.Double initialDensityFraction, java.lang.CharSequence enkfType, edu.berkeley.path.model_elements_base.EnKFParams enkfParams, edu.berkeley.path.model_elements_base.Duration dtOutput, edu.berkeley.path.model_elements_base.Duration dt, edu.berkeley.path.model_elements_base.DateTime timeBegin, edu.berkeley.path.model_elements_base.DateTime timeEnd, edu.berkeley.path.model_elements_base.SensorSet sensorSet) {
    this.id = id;
    this.name = name;
    this.runMode = runMode;
    this.workflow = workflow;
    this.feed = feed;
    this.ctmType = ctmType;
    this.ensembleSize = ensembleSize;
    this.fdType = fdType;
    this.additiveModelNoiseMean = additiveModelNoiseMean;
    this.additiveModelNoiseStdDev = additiveModelNoiseStdDev;
    this.initialDensityFraction = initialDensityFraction;
    this.enkfType = enkfType;
    this.enkfParams = enkfParams;
    this.dtOutput = dtOutput;
    this.dt = dt;
    this.timeBegin = timeBegin;
    this.timeEnd = timeEnd;
    this.sensorSet = sensorSet;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return id;
    case 1: return name;
    case 2: return runMode;
    case 3: return workflow;
    case 4: return feed;
    case 5: return ctmType;
    case 6: return ensembleSize;
    case 7: return fdType;
    case 8: return additiveModelNoiseMean;
    case 9: return additiveModelNoiseStdDev;
    case 10: return initialDensityFraction;
    case 11: return enkfType;
    case 12: return enkfParams;
    case 13: return dtOutput;
    case 14: return dt;
    case 15: return timeBegin;
    case 16: return timeEnd;
    case 17: return sensorSet;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: id = (java.lang.CharSequence)value$; break;
    case 1: name = (java.lang.CharSequence)value$; break;
    case 2: runMode = (java.lang.CharSequence)value$; break;
    case 3: workflow = (java.lang.CharSequence)value$; break;
    case 4: feed = (java.lang.CharSequence)value$; break;
    case 5: ctmType = (java.lang.CharSequence)value$; break;
    case 6: ensembleSize = (java.lang.Integer)value$; break;
    case 7: fdType = (java.lang.CharSequence)value$; break;
    case 8: additiveModelNoiseMean = (java.lang.Double)value$; break;
    case 9: additiveModelNoiseStdDev = (java.lang.Double)value$; break;
    case 10: initialDensityFraction = (java.lang.Double)value$; break;
    case 11: enkfType = (java.lang.CharSequence)value$; break;
    case 12: enkfParams = (edu.berkeley.path.model_elements_base.EnKFParams)value$; break;
    case 13: dtOutput = (edu.berkeley.path.model_elements_base.Duration)value$; break;
    case 14: dt = (edu.berkeley.path.model_elements_base.Duration)value$; break;
    case 15: timeBegin = (edu.berkeley.path.model_elements_base.DateTime)value$; break;
    case 16: timeEnd = (edu.berkeley.path.model_elements_base.DateTime)value$; break;
    case 17: sensorSet = (edu.berkeley.path.model_elements_base.SensorSet)value$; break;
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
   * Gets the value of the 'runMode' field.
   * * historical, live
     *   */
  public java.lang.CharSequence getRunMode() {
    return runMode;
  }

  /**
   * Sets the value of the 'runMode' field.
   * * historical, live
     *   * @param value the value to set.
   */
  public void setRunMode(java.lang.CharSequence value) {
    this.runMode = value;
  }

  /**
   * Gets the value of the 'workflow' field.
   * * forecast, estimation
     *   */
  public java.lang.CharSequence getWorkflow() {
    return workflow;
  }

  /**
   * Sets the value of the 'workflow' field.
   * * forecast, estimation
     *   * @param value the value to set.
   */
  public void setWorkflow(java.lang.CharSequence value) {
    this.workflow = value;
  }

  /**
   * Gets the value of the 'feed' field.
   * * probea, probeb, pems
    *   */
  public java.lang.CharSequence getFeed() {
    return feed;
  }

  /**
   * Sets the value of the 'feed' field.
   * * probea, probeb, pems
    *   * @param value the value to set.
   */
  public void setFeed(java.lang.CharSequence value) {
    this.feed = value;
  }

  /**
   * Gets the value of the 'ctmType' field.
   */
  public java.lang.CharSequence getCtmType() {
    return ctmType;
  }

  /**
   * Sets the value of the 'ctmType' field.
   * @param value the value to set.
   */
  public void setCtmType(java.lang.CharSequence value) {
    this.ctmType = value;
  }

  /**
   * Gets the value of the 'ensembleSize' field.
   */
  public java.lang.Integer getEnsembleSize() {
    return ensembleSize;
  }

  /**
   * Sets the value of the 'ensembleSize' field.
   * @param value the value to set.
   */
  public void setEnsembleSize(java.lang.Integer value) {
    this.ensembleSize = value;
  }

  /**
   * Gets the value of the 'fdType' field.
   */
  public java.lang.CharSequence getFdType() {
    return fdType;
  }

  /**
   * Sets the value of the 'fdType' field.
   * @param value the value to set.
   */
  public void setFdType(java.lang.CharSequence value) {
    this.fdType = value;
  }

  /**
   * Gets the value of the 'additiveModelNoiseMean' field.
   */
  public java.lang.Double getAdditiveModelNoiseMean() {
    return additiveModelNoiseMean;
  }

  /**
   * Sets the value of the 'additiveModelNoiseMean' field.
   * @param value the value to set.
   */
  public void setAdditiveModelNoiseMean(java.lang.Double value) {
    this.additiveModelNoiseMean = value;
  }

  /**
   * Gets the value of the 'additiveModelNoiseStdDev' field.
   */
  public java.lang.Double getAdditiveModelNoiseStdDev() {
    return additiveModelNoiseStdDev;
  }

  /**
   * Sets the value of the 'additiveModelNoiseStdDev' field.
   * @param value the value to set.
   */
  public void setAdditiveModelNoiseStdDev(java.lang.Double value) {
    this.additiveModelNoiseStdDev = value;
  }

  /**
   * Gets the value of the 'initialDensityFraction' field.
   */
  public java.lang.Double getInitialDensityFraction() {
    return initialDensityFraction;
  }

  /**
   * Sets the value of the 'initialDensityFraction' field.
   * @param value the value to set.
   */
  public void setInitialDensityFraction(java.lang.Double value) {
    this.initialDensityFraction = value;
  }

  /**
   * Gets the value of the 'enkfType' field.
   */
  public java.lang.CharSequence getEnkfType() {
    return enkfType;
  }

  /**
   * Sets the value of the 'enkfType' field.
   * @param value the value to set.
   */
  public void setEnkfType(java.lang.CharSequence value) {
    this.enkfType = value;
  }

  /**
   * Gets the value of the 'enkfParams' field.
   */
  public edu.berkeley.path.model_elements_base.EnKFParams getEnkfParams() {
    return enkfParams;
  }

  /**
   * Sets the value of the 'enkfParams' field.
   * @param value the value to set.
   */
  public void setEnkfParams(edu.berkeley.path.model_elements_base.EnKFParams value) {
    this.enkfParams = value;
  }

  /**
   * Gets the value of the 'dtOutput' field.
   */
  public edu.berkeley.path.model_elements_base.Duration getDtOutput() {
    return dtOutput;
  }

  /**
   * Sets the value of the 'dtOutput' field.
   * @param value the value to set.
   */
  public void setDtOutput(edu.berkeley.path.model_elements_base.Duration value) {
    this.dtOutput = value;
  }

  /**
   * Gets the value of the 'dt' field.
   */
  public edu.berkeley.path.model_elements_base.Duration getDt() {
    return dt;
  }

  /**
   * Sets the value of the 'dt' field.
   * @param value the value to set.
   */
  public void setDt(edu.berkeley.path.model_elements_base.Duration value) {
    this.dt = value;
  }

  /**
   * Gets the value of the 'timeBegin' field.
   */
  public edu.berkeley.path.model_elements_base.DateTime getTimeBegin() {
    return timeBegin;
  }

  /**
   * Sets the value of the 'timeBegin' field.
   * @param value the value to set.
   */
  public void setTimeBegin(edu.berkeley.path.model_elements_base.DateTime value) {
    this.timeBegin = value;
  }

  /**
   * Gets the value of the 'timeEnd' field.
   */
  public edu.berkeley.path.model_elements_base.DateTime getTimeEnd() {
    return timeEnd;
  }

  /**
   * Sets the value of the 'timeEnd' field.
   * @param value the value to set.
   */
  public void setTimeEnd(edu.berkeley.path.model_elements_base.DateTime value) {
    this.timeEnd = value;
  }

  /**
   * Gets the value of the 'sensorSet' field.
   */
  public edu.berkeley.path.model_elements_base.SensorSet getSensorSet() {
    return sensorSet;
  }

  /**
   * Sets the value of the 'sensorSet' field.
   * @param value the value to set.
   */
  public void setSensorSet(edu.berkeley.path.model_elements_base.SensorSet value) {
    this.sensorSet = value;
  }

  /** Creates a new FreewayContextConfig RecordBuilder */
  public static edu.berkeley.path.model_elements_base.FreewayContextConfig.Builder newBuilder() {
    return new edu.berkeley.path.model_elements_base.FreewayContextConfig.Builder();
  }
  
  /** Creates a new FreewayContextConfig RecordBuilder by copying an existing Builder */
  public static edu.berkeley.path.model_elements_base.FreewayContextConfig.Builder newBuilder(edu.berkeley.path.model_elements_base.FreewayContextConfig.Builder other) {
    return new edu.berkeley.path.model_elements_base.FreewayContextConfig.Builder(other);
  }
  
  /** Creates a new FreewayContextConfig RecordBuilder by copying an existing FreewayContextConfig instance */
  public static edu.berkeley.path.model_elements_base.FreewayContextConfig.Builder newBuilder(edu.berkeley.path.model_elements_base.FreewayContextConfig other) {
    return new edu.berkeley.path.model_elements_base.FreewayContextConfig.Builder(other);
  }
  
  /**
   * RecordBuilder for FreewayContextConfig instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<FreewayContextConfig>
    implements org.apache.avro.data.RecordBuilder<FreewayContextConfig> {

    private java.lang.CharSequence id;
    private java.lang.CharSequence name;
    private java.lang.CharSequence runMode;
    private java.lang.CharSequence workflow;
    private java.lang.CharSequence feed;
    private java.lang.CharSequence ctmType;
    private int ensembleSize;
    private java.lang.CharSequence fdType;
    private double additiveModelNoiseMean;
    private double additiveModelNoiseStdDev;
    private double initialDensityFraction;
    private java.lang.CharSequence enkfType;
    private edu.berkeley.path.model_elements_base.EnKFParams enkfParams;
    private edu.berkeley.path.model_elements_base.Duration dtOutput;
    private edu.berkeley.path.model_elements_base.Duration dt;
    private edu.berkeley.path.model_elements_base.DateTime timeBegin;
    private edu.berkeley.path.model_elements_base.DateTime timeEnd;
    private edu.berkeley.path.model_elements_base.SensorSet sensorSet;

    /** Creates a new Builder */
    private Builder() {
      super(edu.berkeley.path.model_elements_base.FreewayContextConfig.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(edu.berkeley.path.model_elements_base.FreewayContextConfig.Builder other) {
      super(other);
    }
    
    /** Creates a Builder by copying an existing FreewayContextConfig instance */
    private Builder(edu.berkeley.path.model_elements_base.FreewayContextConfig other) {
            super(edu.berkeley.path.model_elements_base.FreewayContextConfig.SCHEMA$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = (java.lang.CharSequence) data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.name)) {
        this.name = (java.lang.CharSequence) data().deepCopy(fields()[1].schema(), other.name);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.runMode)) {
        this.runMode = (java.lang.CharSequence) data().deepCopy(fields()[2].schema(), other.runMode);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.workflow)) {
        this.workflow = (java.lang.CharSequence) data().deepCopy(fields()[3].schema(), other.workflow);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.feed)) {
        this.feed = (java.lang.CharSequence) data().deepCopy(fields()[4].schema(), other.feed);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.ctmType)) {
        this.ctmType = (java.lang.CharSequence) data().deepCopy(fields()[5].schema(), other.ctmType);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.ensembleSize)) {
        this.ensembleSize = (java.lang.Integer) data().deepCopy(fields()[6].schema(), other.ensembleSize);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.fdType)) {
        this.fdType = (java.lang.CharSequence) data().deepCopy(fields()[7].schema(), other.fdType);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.additiveModelNoiseMean)) {
        this.additiveModelNoiseMean = (java.lang.Double) data().deepCopy(fields()[8].schema(), other.additiveModelNoiseMean);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.additiveModelNoiseStdDev)) {
        this.additiveModelNoiseStdDev = (java.lang.Double) data().deepCopy(fields()[9].schema(), other.additiveModelNoiseStdDev);
        fieldSetFlags()[9] = true;
      }
      if (isValidValue(fields()[10], other.initialDensityFraction)) {
        this.initialDensityFraction = (java.lang.Double) data().deepCopy(fields()[10].schema(), other.initialDensityFraction);
        fieldSetFlags()[10] = true;
      }
      if (isValidValue(fields()[11], other.enkfType)) {
        this.enkfType = (java.lang.CharSequence) data().deepCopy(fields()[11].schema(), other.enkfType);
        fieldSetFlags()[11] = true;
      }
      if (isValidValue(fields()[12], other.enkfParams)) {
        this.enkfParams = (edu.berkeley.path.model_elements_base.EnKFParams) data().deepCopy(fields()[12].schema(), other.enkfParams);
        fieldSetFlags()[12] = true;
      }
      if (isValidValue(fields()[13], other.dtOutput)) {
        this.dtOutput = (edu.berkeley.path.model_elements_base.Duration) data().deepCopy(fields()[13].schema(), other.dtOutput);
        fieldSetFlags()[13] = true;
      }
      if (isValidValue(fields()[14], other.dt)) {
        this.dt = (edu.berkeley.path.model_elements_base.Duration) data().deepCopy(fields()[14].schema(), other.dt);
        fieldSetFlags()[14] = true;
      }
      if (isValidValue(fields()[15], other.timeBegin)) {
        this.timeBegin = (edu.berkeley.path.model_elements_base.DateTime) data().deepCopy(fields()[15].schema(), other.timeBegin);
        fieldSetFlags()[15] = true;
      }
      if (isValidValue(fields()[16], other.timeEnd)) {
        this.timeEnd = (edu.berkeley.path.model_elements_base.DateTime) data().deepCopy(fields()[16].schema(), other.timeEnd);
        fieldSetFlags()[16] = true;
      }
      if (isValidValue(fields()[17], other.sensorSet)) {
        this.sensorSet = (edu.berkeley.path.model_elements_base.SensorSet) data().deepCopy(fields()[17].schema(), other.sensorSet);
        fieldSetFlags()[17] = true;
      }
    }

    /** Gets the value of the 'id' field */
    public java.lang.CharSequence getId() {
      return id;
    }
    
    /** Sets the value of the 'id' field */
    public edu.berkeley.path.model_elements_base.FreewayContextConfig.Builder setId(java.lang.CharSequence value) {
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
    public edu.berkeley.path.model_elements_base.FreewayContextConfig.Builder clearId() {
      id = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'name' field */
    public java.lang.CharSequence getName() {
      return name;
    }
    
    /** Sets the value of the 'name' field */
    public edu.berkeley.path.model_elements_base.FreewayContextConfig.Builder setName(java.lang.CharSequence value) {
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
    public edu.berkeley.path.model_elements_base.FreewayContextConfig.Builder clearName() {
      name = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'runMode' field */
    public java.lang.CharSequence getRunMode() {
      return runMode;
    }
    
    /** Sets the value of the 'runMode' field */
    public edu.berkeley.path.model_elements_base.FreewayContextConfig.Builder setRunMode(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.runMode = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'runMode' field has been set */
    public boolean hasRunMode() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'runMode' field */
    public edu.berkeley.path.model_elements_base.FreewayContextConfig.Builder clearRunMode() {
      runMode = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'workflow' field */
    public java.lang.CharSequence getWorkflow() {
      return workflow;
    }
    
    /** Sets the value of the 'workflow' field */
    public edu.berkeley.path.model_elements_base.FreewayContextConfig.Builder setWorkflow(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.workflow = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'workflow' field has been set */
    public boolean hasWorkflow() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'workflow' field */
    public edu.berkeley.path.model_elements_base.FreewayContextConfig.Builder clearWorkflow() {
      workflow = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'feed' field */
    public java.lang.CharSequence getFeed() {
      return feed;
    }
    
    /** Sets the value of the 'feed' field */
    public edu.berkeley.path.model_elements_base.FreewayContextConfig.Builder setFeed(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this.feed = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'feed' field has been set */
    public boolean hasFeed() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'feed' field */
    public edu.berkeley.path.model_elements_base.FreewayContextConfig.Builder clearFeed() {
      feed = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /** Gets the value of the 'ctmType' field */
    public java.lang.CharSequence getCtmType() {
      return ctmType;
    }
    
    /** Sets the value of the 'ctmType' field */
    public edu.berkeley.path.model_elements_base.FreewayContextConfig.Builder setCtmType(java.lang.CharSequence value) {
      validate(fields()[5], value);
      this.ctmType = value;
      fieldSetFlags()[5] = true;
      return this; 
    }
    
    /** Checks whether the 'ctmType' field has been set */
    public boolean hasCtmType() {
      return fieldSetFlags()[5];
    }
    
    /** Clears the value of the 'ctmType' field */
    public edu.berkeley.path.model_elements_base.FreewayContextConfig.Builder clearCtmType() {
      ctmType = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /** Gets the value of the 'ensembleSize' field */
    public java.lang.Integer getEnsembleSize() {
      return ensembleSize;
    }
    
    /** Sets the value of the 'ensembleSize' field */
    public edu.berkeley.path.model_elements_base.FreewayContextConfig.Builder setEnsembleSize(int value) {
      validate(fields()[6], value);
      this.ensembleSize = value;
      fieldSetFlags()[6] = true;
      return this; 
    }
    
    /** Checks whether the 'ensembleSize' field has been set */
    public boolean hasEnsembleSize() {
      return fieldSetFlags()[6];
    }
    
    /** Clears the value of the 'ensembleSize' field */
    public edu.berkeley.path.model_elements_base.FreewayContextConfig.Builder clearEnsembleSize() {
      fieldSetFlags()[6] = false;
      return this;
    }

    /** Gets the value of the 'fdType' field */
    public java.lang.CharSequence getFdType() {
      return fdType;
    }
    
    /** Sets the value of the 'fdType' field */
    public edu.berkeley.path.model_elements_base.FreewayContextConfig.Builder setFdType(java.lang.CharSequence value) {
      validate(fields()[7], value);
      this.fdType = value;
      fieldSetFlags()[7] = true;
      return this; 
    }
    
    /** Checks whether the 'fdType' field has been set */
    public boolean hasFdType() {
      return fieldSetFlags()[7];
    }
    
    /** Clears the value of the 'fdType' field */
    public edu.berkeley.path.model_elements_base.FreewayContextConfig.Builder clearFdType() {
      fdType = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    /** Gets the value of the 'additiveModelNoiseMean' field */
    public java.lang.Double getAdditiveModelNoiseMean() {
      return additiveModelNoiseMean;
    }
    
    /** Sets the value of the 'additiveModelNoiseMean' field */
    public edu.berkeley.path.model_elements_base.FreewayContextConfig.Builder setAdditiveModelNoiseMean(double value) {
      validate(fields()[8], value);
      this.additiveModelNoiseMean = value;
      fieldSetFlags()[8] = true;
      return this; 
    }
    
    /** Checks whether the 'additiveModelNoiseMean' field has been set */
    public boolean hasAdditiveModelNoiseMean() {
      return fieldSetFlags()[8];
    }
    
    /** Clears the value of the 'additiveModelNoiseMean' field */
    public edu.berkeley.path.model_elements_base.FreewayContextConfig.Builder clearAdditiveModelNoiseMean() {
      fieldSetFlags()[8] = false;
      return this;
    }

    /** Gets the value of the 'additiveModelNoiseStdDev' field */
    public java.lang.Double getAdditiveModelNoiseStdDev() {
      return additiveModelNoiseStdDev;
    }
    
    /** Sets the value of the 'additiveModelNoiseStdDev' field */
    public edu.berkeley.path.model_elements_base.FreewayContextConfig.Builder setAdditiveModelNoiseStdDev(double value) {
      validate(fields()[9], value);
      this.additiveModelNoiseStdDev = value;
      fieldSetFlags()[9] = true;
      return this; 
    }
    
    /** Checks whether the 'additiveModelNoiseStdDev' field has been set */
    public boolean hasAdditiveModelNoiseStdDev() {
      return fieldSetFlags()[9];
    }
    
    /** Clears the value of the 'additiveModelNoiseStdDev' field */
    public edu.berkeley.path.model_elements_base.FreewayContextConfig.Builder clearAdditiveModelNoiseStdDev() {
      fieldSetFlags()[9] = false;
      return this;
    }

    /** Gets the value of the 'initialDensityFraction' field */
    public java.lang.Double getInitialDensityFraction() {
      return initialDensityFraction;
    }
    
    /** Sets the value of the 'initialDensityFraction' field */
    public edu.berkeley.path.model_elements_base.FreewayContextConfig.Builder setInitialDensityFraction(double value) {
      validate(fields()[10], value);
      this.initialDensityFraction = value;
      fieldSetFlags()[10] = true;
      return this; 
    }
    
    /** Checks whether the 'initialDensityFraction' field has been set */
    public boolean hasInitialDensityFraction() {
      return fieldSetFlags()[10];
    }
    
    /** Clears the value of the 'initialDensityFraction' field */
    public edu.berkeley.path.model_elements_base.FreewayContextConfig.Builder clearInitialDensityFraction() {
      fieldSetFlags()[10] = false;
      return this;
    }

    /** Gets the value of the 'enkfType' field */
    public java.lang.CharSequence getEnkfType() {
      return enkfType;
    }
    
    /** Sets the value of the 'enkfType' field */
    public edu.berkeley.path.model_elements_base.FreewayContextConfig.Builder setEnkfType(java.lang.CharSequence value) {
      validate(fields()[11], value);
      this.enkfType = value;
      fieldSetFlags()[11] = true;
      return this; 
    }
    
    /** Checks whether the 'enkfType' field has been set */
    public boolean hasEnkfType() {
      return fieldSetFlags()[11];
    }
    
    /** Clears the value of the 'enkfType' field */
    public edu.berkeley.path.model_elements_base.FreewayContextConfig.Builder clearEnkfType() {
      enkfType = null;
      fieldSetFlags()[11] = false;
      return this;
    }

    /** Gets the value of the 'enkfParams' field */
    public edu.berkeley.path.model_elements_base.EnKFParams getEnkfParams() {
      return enkfParams;
    }
    
    /** Sets the value of the 'enkfParams' field */
    public edu.berkeley.path.model_elements_base.FreewayContextConfig.Builder setEnkfParams(edu.berkeley.path.model_elements_base.EnKFParams value) {
      validate(fields()[12], value);
      this.enkfParams = value;
      fieldSetFlags()[12] = true;
      return this; 
    }
    
    /** Checks whether the 'enkfParams' field has been set */
    public boolean hasEnkfParams() {
      return fieldSetFlags()[12];
    }
    
    /** Clears the value of the 'enkfParams' field */
    public edu.berkeley.path.model_elements_base.FreewayContextConfig.Builder clearEnkfParams() {
      enkfParams = null;
      fieldSetFlags()[12] = false;
      return this;
    }

    /** Gets the value of the 'dtOutput' field */
    public edu.berkeley.path.model_elements_base.Duration getDtOutput() {
      return dtOutput;
    }
    
    /** Sets the value of the 'dtOutput' field */
    public edu.berkeley.path.model_elements_base.FreewayContextConfig.Builder setDtOutput(edu.berkeley.path.model_elements_base.Duration value) {
      validate(fields()[13], value);
      this.dtOutput = value;
      fieldSetFlags()[13] = true;
      return this; 
    }
    
    /** Checks whether the 'dtOutput' field has been set */
    public boolean hasDtOutput() {
      return fieldSetFlags()[13];
    }
    
    /** Clears the value of the 'dtOutput' field */
    public edu.berkeley.path.model_elements_base.FreewayContextConfig.Builder clearDtOutput() {
      dtOutput = null;
      fieldSetFlags()[13] = false;
      return this;
    }

    /** Gets the value of the 'dt' field */
    public edu.berkeley.path.model_elements_base.Duration getDt() {
      return dt;
    }
    
    /** Sets the value of the 'dt' field */
    public edu.berkeley.path.model_elements_base.FreewayContextConfig.Builder setDt(edu.berkeley.path.model_elements_base.Duration value) {
      validate(fields()[14], value);
      this.dt = value;
      fieldSetFlags()[14] = true;
      return this; 
    }
    
    /** Checks whether the 'dt' field has been set */
    public boolean hasDt() {
      return fieldSetFlags()[14];
    }
    
    /** Clears the value of the 'dt' field */
    public edu.berkeley.path.model_elements_base.FreewayContextConfig.Builder clearDt() {
      dt = null;
      fieldSetFlags()[14] = false;
      return this;
    }

    /** Gets the value of the 'timeBegin' field */
    public edu.berkeley.path.model_elements_base.DateTime getTimeBegin() {
      return timeBegin;
    }
    
    /** Sets the value of the 'timeBegin' field */
    public edu.berkeley.path.model_elements_base.FreewayContextConfig.Builder setTimeBegin(edu.berkeley.path.model_elements_base.DateTime value) {
      validate(fields()[15], value);
      this.timeBegin = value;
      fieldSetFlags()[15] = true;
      return this; 
    }
    
    /** Checks whether the 'timeBegin' field has been set */
    public boolean hasTimeBegin() {
      return fieldSetFlags()[15];
    }
    
    /** Clears the value of the 'timeBegin' field */
    public edu.berkeley.path.model_elements_base.FreewayContextConfig.Builder clearTimeBegin() {
      timeBegin = null;
      fieldSetFlags()[15] = false;
      return this;
    }

    /** Gets the value of the 'timeEnd' field */
    public edu.berkeley.path.model_elements_base.DateTime getTimeEnd() {
      return timeEnd;
    }
    
    /** Sets the value of the 'timeEnd' field */
    public edu.berkeley.path.model_elements_base.FreewayContextConfig.Builder setTimeEnd(edu.berkeley.path.model_elements_base.DateTime value) {
      validate(fields()[16], value);
      this.timeEnd = value;
      fieldSetFlags()[16] = true;
      return this; 
    }
    
    /** Checks whether the 'timeEnd' field has been set */
    public boolean hasTimeEnd() {
      return fieldSetFlags()[16];
    }
    
    /** Clears the value of the 'timeEnd' field */
    public edu.berkeley.path.model_elements_base.FreewayContextConfig.Builder clearTimeEnd() {
      timeEnd = null;
      fieldSetFlags()[16] = false;
      return this;
    }

    /** Gets the value of the 'sensorSet' field */
    public edu.berkeley.path.model_elements_base.SensorSet getSensorSet() {
      return sensorSet;
    }
    
    /** Sets the value of the 'sensorSet' field */
    public edu.berkeley.path.model_elements_base.FreewayContextConfig.Builder setSensorSet(edu.berkeley.path.model_elements_base.SensorSet value) {
      validate(fields()[17], value);
      this.sensorSet = value;
      fieldSetFlags()[17] = true;
      return this; 
    }
    
    /** Checks whether the 'sensorSet' field has been set */
    public boolean hasSensorSet() {
      return fieldSetFlags()[17];
    }
    
    /** Clears the value of the 'sensorSet' field */
    public edu.berkeley.path.model_elements_base.FreewayContextConfig.Builder clearSensorSet() {
      sensorSet = null;
      fieldSetFlags()[17] = false;
      return this;
    }

    @Override
    public FreewayContextConfig build() {
      try {
        FreewayContextConfig record = new FreewayContextConfig();
        record.id = fieldSetFlags()[0] ? this.id : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.name = fieldSetFlags()[1] ? this.name : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.runMode = fieldSetFlags()[2] ? this.runMode : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.workflow = fieldSetFlags()[3] ? this.workflow : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.feed = fieldSetFlags()[4] ? this.feed : (java.lang.CharSequence) defaultValue(fields()[4]);
        record.ctmType = fieldSetFlags()[5] ? this.ctmType : (java.lang.CharSequence) defaultValue(fields()[5]);
        record.ensembleSize = fieldSetFlags()[6] ? this.ensembleSize : (java.lang.Integer) defaultValue(fields()[6]);
        record.fdType = fieldSetFlags()[7] ? this.fdType : (java.lang.CharSequence) defaultValue(fields()[7]);
        record.additiveModelNoiseMean = fieldSetFlags()[8] ? this.additiveModelNoiseMean : (java.lang.Double) defaultValue(fields()[8]);
        record.additiveModelNoiseStdDev = fieldSetFlags()[9] ? this.additiveModelNoiseStdDev : (java.lang.Double) defaultValue(fields()[9]);
        record.initialDensityFraction = fieldSetFlags()[10] ? this.initialDensityFraction : (java.lang.Double) defaultValue(fields()[10]);
        record.enkfType = fieldSetFlags()[11] ? this.enkfType : (java.lang.CharSequence) defaultValue(fields()[11]);
        record.enkfParams = fieldSetFlags()[12] ? this.enkfParams : (edu.berkeley.path.model_elements_base.EnKFParams) defaultValue(fields()[12]);
        record.dtOutput = fieldSetFlags()[13] ? this.dtOutput : (edu.berkeley.path.model_elements_base.Duration) defaultValue(fields()[13]);
        record.dt = fieldSetFlags()[14] ? this.dt : (edu.berkeley.path.model_elements_base.Duration) defaultValue(fields()[14]);
        record.timeBegin = fieldSetFlags()[15] ? this.timeBegin : (edu.berkeley.path.model_elements_base.DateTime) defaultValue(fields()[15]);
        record.timeEnd = fieldSetFlags()[16] ? this.timeEnd : (edu.berkeley.path.model_elements_base.DateTime) defaultValue(fields()[16]);
        record.sensorSet = fieldSetFlags()[17] ? this.sensorSet : (edu.berkeley.path.model_elements_base.SensorSet) defaultValue(fields()[17]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
