package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.WorkloadClassificationDV_ExposureWorkloadClassification.ExposureConditions;
import pcftest.WorkloadClassificationDV_ExposureWorkloadClassification.ExposureConditions.ExposureConditionsLV_tb;
import pcftest.WorkloadClassificationDV_ExposureWorkloadClassification.IncidentSeverityConditions;
import pcftest.WorkloadClassificationDV_ExposureWorkloadClassification.IncidentSeverityConditions.IncidentSeverityConditionsLV_tb;
import pcftest.WorkloadClassificationDV_ExposureWorkloadClassification.JurisdictionConditions;
import pcftest.WorkloadClassificationDV_ExposureWorkloadClassification.JurisdictionConditions.JurisdictionConditionsLV_tb;
import pcftest.WorkloadClassificationDV_ExposureWorkloadClassification.SegmentConditions;
import pcftest.WorkloadClassificationDV_ExposureWorkloadClassification.SegmentConditions.SegmentConditionsLV_tb;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/workload/WorkloadClassificationDV.ExposureWorkloadClassification.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class WorkloadClassificationDV_ExposureWorkloadClassification extends WorkloadClassificationDV {
  public final static String CHECKSUM = "08da976feb01c444650dad1b8cd1d9b8";
  
  public WorkloadClassificationDV_ExposureWorkloadClassification(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public BooleanValueElement getAllExposures() {
    return getOrCreateProperty("AllExposures", "AllExposures", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public BooleanValueElement getAllIncidentSeverities() {
    return getOrCreateProperty("AllIncidentSeverities", "AllIncidentSeverities", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public BooleanValueElement getAllJurisdictions() {
    return getOrCreateProperty("AllJurisdictions", "AllJurisdictions", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public BooleanValueElement getAllSegments() {
    return getOrCreateProperty("AllSegments", "AllSegments", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public ExposureConditions getExposureConditions() {
    return getOrCreateProperty("ExposureConditions", "ExposureConditions", null, pcftest.WorkloadClassificationDV_ExposureWorkloadClassification.ExposureConditions.class);
  }
  
  public IncidentSeverityConditions getIncidentSeverityConditions() {
    return getOrCreateProperty("IncidentSeverityConditions", "IncidentSeverityConditions", null, pcftest.WorkloadClassificationDV_ExposureWorkloadClassification.IncidentSeverityConditions.class);
  }
  
  public JurisdictionConditions getJurisdictionConditions() {
    return getOrCreateProperty("JurisdictionConditions", "JurisdictionConditions", null, pcftest.WorkloadClassificationDV_ExposureWorkloadClassification.JurisdictionConditions.class);
  }
  
  public SegmentConditions getSegmentConditions() {
    return getOrCreateProperty("SegmentConditions", "SegmentConditions", null, pcftest.WorkloadClassificationDV_ExposureWorkloadClassification.SegmentConditions.class);
  }
  
  public WorkloadClassificationCommonInputSet getWorkloadClassificationCommonInputSet() {
    return getOrCreateProperty("WorkloadClassificationCommonInputSet", "WorkloadClassificationCommonInputSet", null, pcftest.WorkloadClassificationCommonInputSet.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/workload/WorkloadClassificationDV.ExposureWorkloadClassification.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ExposureConditions extends PCFElement {
    public ExposureConditions(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ExposureConditionsLV getExposureConditionsLV() {
      return getOrCreateProperty("ExposureConditionsLV", "ExposureConditionsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ExposureConditionsLV.class);
    }
    
    public ExposureConditionsLV_tb getExposureConditionsLV_tb() {
      return getOrCreateProperty("ExposureConditionsLV_tb", "ExposureConditionsLV_tb", null, pcftest.WorkloadClassificationDV_ExposureWorkloadClassification.ExposureConditions.ExposureConditionsLV_tb.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/workload/WorkloadClassificationDV.ExposureWorkloadClassification.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ExposureConditionsLV_tb extends PCFElement {
      public ExposureConditionsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public pcftest.WorkloadClassificationDV_ExposureWorkloadClassification.ExposureConditions.ExposureConditionsLV_tb.Add getAdd() {
        return getOrCreateProperty("Add", "Add", null, pcftest.WorkloadClassificationDV_ExposureWorkloadClassification.ExposureConditions.ExposureConditionsLV_tb.Add.class);
      }
      
      public pcftest.WorkloadClassificationDV_ExposureWorkloadClassification.ExposureConditions.ExposureConditionsLV_tb.Remove getRemove() {
        return getOrCreateProperty("Remove", "Remove", null, pcftest.WorkloadClassificationDV_ExposureWorkloadClassification.ExposureConditions.ExposureConditionsLV_tb.Remove.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/admin/workload/WorkloadClassificationDV.ExposureWorkloadClassification.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Add extends ClickableActionElement {
        public Add(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/admin/workload/WorkloadClassificationDV.ExposureWorkloadClassification.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Remove extends ClickableActionElement {
        public Remove(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/workload/WorkloadClassificationDV.ExposureWorkloadClassification.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IncidentSeverityConditions extends PCFElement {
    public IncidentSeverityConditions(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public IncidentSeverityConditionsLV getIncidentSeverityConditionsLV() {
      return getOrCreateProperty("IncidentSeverityConditionsLV", "IncidentSeverityConditionsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.IncidentSeverityConditionsLV.class);
    }
    
    public IncidentSeverityConditionsLV_tb getIncidentSeverityConditionsLV_tb() {
      return getOrCreateProperty("IncidentSeverityConditionsLV_tb", "IncidentSeverityConditionsLV_tb", null, pcftest.WorkloadClassificationDV_ExposureWorkloadClassification.IncidentSeverityConditions.IncidentSeverityConditionsLV_tb.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/workload/WorkloadClassificationDV.ExposureWorkloadClassification.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class IncidentSeverityConditionsLV_tb extends PCFElement {
      public IncidentSeverityConditionsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public pcftest.WorkloadClassificationDV_ExposureWorkloadClassification.IncidentSeverityConditions.IncidentSeverityConditionsLV_tb.Add getAdd() {
        return getOrCreateProperty("Add", "Add", null, pcftest.WorkloadClassificationDV_ExposureWorkloadClassification.IncidentSeverityConditions.IncidentSeverityConditionsLV_tb.Add.class);
      }
      
      public pcftest.WorkloadClassificationDV_ExposureWorkloadClassification.IncidentSeverityConditions.IncidentSeverityConditionsLV_tb.Remove getRemove() {
        return getOrCreateProperty("Remove", "Remove", null, pcftest.WorkloadClassificationDV_ExposureWorkloadClassification.IncidentSeverityConditions.IncidentSeverityConditionsLV_tb.Remove.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/admin/workload/WorkloadClassificationDV.ExposureWorkloadClassification.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Add extends ClickableActionElement {
        public Add(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/admin/workload/WorkloadClassificationDV.ExposureWorkloadClassification.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Remove extends ClickableActionElement {
        public Remove(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/workload/WorkloadClassificationDV.ExposureWorkloadClassification.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class JurisdictionConditions extends PCFElement {
    public JurisdictionConditions(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public JurisdictionConditionsLV getJurisdictionConditionsLV() {
      return getOrCreateProperty("JurisdictionConditionsLV", "JurisdictionConditionsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.JurisdictionConditionsLV.class);
    }
    
    public JurisdictionConditionsLV_tb getJurisdictionConditionsLV_tb() {
      return getOrCreateProperty("JurisdictionConditionsLV_tb", "JurisdictionConditionsLV_tb", null, pcftest.WorkloadClassificationDV_ExposureWorkloadClassification.JurisdictionConditions.JurisdictionConditionsLV_tb.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/workload/WorkloadClassificationDV.ExposureWorkloadClassification.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class JurisdictionConditionsLV_tb extends PCFElement {
      public JurisdictionConditionsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public pcftest.WorkloadClassificationDV_ExposureWorkloadClassification.JurisdictionConditions.JurisdictionConditionsLV_tb.Add getAdd() {
        return getOrCreateProperty("Add", "Add", null, pcftest.WorkloadClassificationDV_ExposureWorkloadClassification.JurisdictionConditions.JurisdictionConditionsLV_tb.Add.class);
      }
      
      public pcftest.WorkloadClassificationDV_ExposureWorkloadClassification.JurisdictionConditions.JurisdictionConditionsLV_tb.Remove getRemove() {
        return getOrCreateProperty("Remove", "Remove", null, pcftest.WorkloadClassificationDV_ExposureWorkloadClassification.JurisdictionConditions.JurisdictionConditionsLV_tb.Remove.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/admin/workload/WorkloadClassificationDV.ExposureWorkloadClassification.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Add extends ClickableActionElement {
        public Add(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/admin/workload/WorkloadClassificationDV.ExposureWorkloadClassification.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Remove extends ClickableActionElement {
        public Remove(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/workload/WorkloadClassificationDV.ExposureWorkloadClassification.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SegmentConditions extends PCFElement {
    public SegmentConditions(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public SegmentConditionsLV getSegmentConditionsLV() {
      return getOrCreateProperty("SegmentConditionsLV", "SegmentConditionsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.SegmentConditionsLV.class);
    }
    
    public SegmentConditionsLV_tb getSegmentConditionsLV_tb() {
      return getOrCreateProperty("SegmentConditionsLV_tb", "SegmentConditionsLV_tb", null, pcftest.WorkloadClassificationDV_ExposureWorkloadClassification.SegmentConditions.SegmentConditionsLV_tb.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/workload/WorkloadClassificationDV.ExposureWorkloadClassification.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class SegmentConditionsLV_tb extends PCFElement {
      public SegmentConditionsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public pcftest.WorkloadClassificationDV_ExposureWorkloadClassification.SegmentConditions.SegmentConditionsLV_tb.Add getAdd() {
        return getOrCreateProperty("Add", "Add", null, pcftest.WorkloadClassificationDV_ExposureWorkloadClassification.SegmentConditions.SegmentConditionsLV_tb.Add.class);
      }
      
      public pcftest.WorkloadClassificationDV_ExposureWorkloadClassification.SegmentConditions.SegmentConditionsLV_tb.Remove getRemove() {
        return getOrCreateProperty("Remove", "Remove", null, pcftest.WorkloadClassificationDV_ExposureWorkloadClassification.SegmentConditions.SegmentConditionsLV_tb.Remove.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/admin/workload/WorkloadClassificationDV.ExposureWorkloadClassification.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Add extends ClickableActionElement {
        public Add(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/admin/workload/WorkloadClassificationDV.ExposureWorkloadClassification.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Remove extends ClickableActionElement {
        public Remove(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      
    }
    
    
  }
  
  
}