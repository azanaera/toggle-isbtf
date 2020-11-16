package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.WorkloadClassificationDV_ClaimWorkloadClassification.CustomerServiceTierConditions;
import pcftest.WorkloadClassificationDV_ClaimWorkloadClassification.CustomerServiceTierConditions.CustomerServiceTierConditionsLV_tb;
import pcftest.WorkloadClassificationDV_ClaimWorkloadClassification.ExposureConditions;
import pcftest.WorkloadClassificationDV_ClaimWorkloadClassification.ExposureConditions.ExposureConditionsLV_tb;
import pcftest.WorkloadClassificationDV_ClaimWorkloadClassification.LossCauseConditions;
import pcftest.WorkloadClassificationDV_ClaimWorkloadClassification.LossCauseConditions.LossCauseConditionsLV_tb;
import pcftest.WorkloadClassificationDV_ClaimWorkloadClassification.SegmentConditions;
import pcftest.WorkloadClassificationDV_ClaimWorkloadClassification.SegmentConditions.SegmentConditionsLV_tb;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/workload/WorkloadClassificationDV.ClaimWorkloadClassification.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class WorkloadClassificationDV_ClaimWorkloadClassification extends WorkloadClassificationDV {
  public final static String CHECKSUM = "d431db5820dd3071ff10a085f132a23e";
  
  public WorkloadClassificationDV_ClaimWorkloadClassification(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public BooleanValueElement getAllCustomerServiceTiers() {
    return getOrCreateProperty("AllCustomerServiceTiers", "AllCustomerServiceTiers", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public BooleanValueElement getAllExposures() {
    return getOrCreateProperty("AllExposures", "AllExposures", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public BooleanValueElement getAllLossCauses() {
    return getOrCreateProperty("AllLossCauses", "AllLossCauses", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public BooleanValueElement getAllSegments() {
    return getOrCreateProperty("AllSegments", "AllSegments", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public CustomerServiceTierConditions getCustomerServiceTierConditions() {
    return getOrCreateProperty("CustomerServiceTierConditions", "CustomerServiceTierConditions", null, pcftest.WorkloadClassificationDV_ClaimWorkloadClassification.CustomerServiceTierConditions.class);
  }
  
  public ExposureConditions getExposureConditions() {
    return getOrCreateProperty("ExposureConditions", "ExposureConditions", null, pcftest.WorkloadClassificationDV_ClaimWorkloadClassification.ExposureConditions.class);
  }
  
  public LossCauseConditions getLossCauseConditions() {
    return getOrCreateProperty("LossCauseConditions", "LossCauseConditions", null, pcftest.WorkloadClassificationDV_ClaimWorkloadClassification.LossCauseConditions.class);
  }
  
  public SegmentConditions getSegmentConditions() {
    return getOrCreateProperty("SegmentConditions", "SegmentConditions", null, pcftest.WorkloadClassificationDV_ClaimWorkloadClassification.SegmentConditions.class);
  }
  
  public WorkloadClassificationCommonInputSet getWorkloadClassificationCommonInputSet() {
    return getOrCreateProperty("WorkloadClassificationCommonInputSet", "WorkloadClassificationCommonInputSet", null, pcftest.WorkloadClassificationCommonInputSet.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/workload/WorkloadClassificationDV.ClaimWorkloadClassification.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CustomerServiceTierConditions extends PCFElement {
    public CustomerServiceTierConditions(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public CustomerServiceTierConditionsLV getCustomerServiceTierConditionsLV() {
      return getOrCreateProperty("CustomerServiceTierConditionsLV", "CustomerServiceTierConditionsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.CustomerServiceTierConditionsLV.class);
    }
    
    public CustomerServiceTierConditionsLV_tb getCustomerServiceTierConditionsLV_tb() {
      return getOrCreateProperty("CustomerServiceTierConditionsLV_tb", "CustomerServiceTierConditionsLV_tb", null, pcftest.WorkloadClassificationDV_ClaimWorkloadClassification.CustomerServiceTierConditions.CustomerServiceTierConditionsLV_tb.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/workload/WorkloadClassificationDV.ClaimWorkloadClassification.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CustomerServiceTierConditionsLV_tb extends PCFElement {
      public CustomerServiceTierConditionsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public pcftest.WorkloadClassificationDV_ClaimWorkloadClassification.CustomerServiceTierConditions.CustomerServiceTierConditionsLV_tb.Add getAdd() {
        return getOrCreateProperty("Add", "Add", null, pcftest.WorkloadClassificationDV_ClaimWorkloadClassification.CustomerServiceTierConditions.CustomerServiceTierConditionsLV_tb.Add.class);
      }
      
      public pcftest.WorkloadClassificationDV_ClaimWorkloadClassification.CustomerServiceTierConditions.CustomerServiceTierConditionsLV_tb.Remove getRemove() {
        return getOrCreateProperty("Remove", "Remove", null, pcftest.WorkloadClassificationDV_ClaimWorkloadClassification.CustomerServiceTierConditions.CustomerServiceTierConditionsLV_tb.Remove.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/admin/workload/WorkloadClassificationDV.ClaimWorkloadClassification.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Add extends ClickableActionElement {
        public Add(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/admin/workload/WorkloadClassificationDV.ClaimWorkloadClassification.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/admin/workload/WorkloadClassificationDV.ClaimWorkloadClassification.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ExposureConditions extends PCFElement {
    public ExposureConditions(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ExposureConditionsLV getExposureConditionsLV() {
      return getOrCreateProperty("ExposureConditionsLV", "ExposureConditionsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ExposureConditionsLV.class);
    }
    
    public ExposureConditionsLV_tb getExposureConditionsLV_tb() {
      return getOrCreateProperty("ExposureConditionsLV_tb", "ExposureConditionsLV_tb", null, pcftest.WorkloadClassificationDV_ClaimWorkloadClassification.ExposureConditions.ExposureConditionsLV_tb.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/workload/WorkloadClassificationDV.ClaimWorkloadClassification.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ExposureConditionsLV_tb extends PCFElement {
      public ExposureConditionsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public pcftest.WorkloadClassificationDV_ClaimWorkloadClassification.ExposureConditions.ExposureConditionsLV_tb.Add getAdd() {
        return getOrCreateProperty("Add", "Add", null, pcftest.WorkloadClassificationDV_ClaimWorkloadClassification.ExposureConditions.ExposureConditionsLV_tb.Add.class);
      }
      
      public pcftest.WorkloadClassificationDV_ClaimWorkloadClassification.ExposureConditions.ExposureConditionsLV_tb.Remove getRemove() {
        return getOrCreateProperty("Remove", "Remove", null, pcftest.WorkloadClassificationDV_ClaimWorkloadClassification.ExposureConditions.ExposureConditionsLV_tb.Remove.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/admin/workload/WorkloadClassificationDV.ClaimWorkloadClassification.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Add extends ClickableActionElement {
        public Add(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/admin/workload/WorkloadClassificationDV.ClaimWorkloadClassification.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/admin/workload/WorkloadClassificationDV.ClaimWorkloadClassification.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LossCauseConditions extends PCFElement {
    public LossCauseConditions(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public LossCauseConditionsLV getLossCauseConditionsLV() {
      return getOrCreateProperty("LossCauseConditionsLV", "LossCauseConditionsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.LossCauseConditionsLV.class);
    }
    
    public LossCauseConditionsLV_tb getLossCauseConditionsLV_tb() {
      return getOrCreateProperty("LossCauseConditionsLV_tb", "LossCauseConditionsLV_tb", null, pcftest.WorkloadClassificationDV_ClaimWorkloadClassification.LossCauseConditions.LossCauseConditionsLV_tb.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/workload/WorkloadClassificationDV.ClaimWorkloadClassification.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class LossCauseConditionsLV_tb extends PCFElement {
      public LossCauseConditionsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public pcftest.WorkloadClassificationDV_ClaimWorkloadClassification.LossCauseConditions.LossCauseConditionsLV_tb.Add getAdd() {
        return getOrCreateProperty("Add", "Add", null, pcftest.WorkloadClassificationDV_ClaimWorkloadClassification.LossCauseConditions.LossCauseConditionsLV_tb.Add.class);
      }
      
      public pcftest.WorkloadClassificationDV_ClaimWorkloadClassification.LossCauseConditions.LossCauseConditionsLV_tb.Remove getRemove() {
        return getOrCreateProperty("Remove", "Remove", null, pcftest.WorkloadClassificationDV_ClaimWorkloadClassification.LossCauseConditions.LossCauseConditionsLV_tb.Remove.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/admin/workload/WorkloadClassificationDV.ClaimWorkloadClassification.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Add extends ClickableActionElement {
        public Add(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/admin/workload/WorkloadClassificationDV.ClaimWorkloadClassification.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/admin/workload/WorkloadClassificationDV.ClaimWorkloadClassification.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SegmentConditions extends PCFElement {
    public SegmentConditions(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public SegmentConditionsLV getSegmentConditionsLV() {
      return getOrCreateProperty("SegmentConditionsLV", "SegmentConditionsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.SegmentConditionsLV.class);
    }
    
    public SegmentConditionsLV_tb getSegmentConditionsLV_tb() {
      return getOrCreateProperty("SegmentConditionsLV_tb", "SegmentConditionsLV_tb", null, pcftest.WorkloadClassificationDV_ClaimWorkloadClassification.SegmentConditions.SegmentConditionsLV_tb.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/workload/WorkloadClassificationDV.ClaimWorkloadClassification.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class SegmentConditionsLV_tb extends PCFElement {
      public SegmentConditionsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public pcftest.WorkloadClassificationDV_ClaimWorkloadClassification.SegmentConditions.SegmentConditionsLV_tb.Add getAdd() {
        return getOrCreateProperty("Add", "Add", null, pcftest.WorkloadClassificationDV_ClaimWorkloadClassification.SegmentConditions.SegmentConditionsLV_tb.Add.class);
      }
      
      public pcftest.WorkloadClassificationDV_ClaimWorkloadClassification.SegmentConditions.SegmentConditionsLV_tb.Remove getRemove() {
        return getOrCreateProperty("Remove", "Remove", null, pcftest.WorkloadClassificationDV_ClaimWorkloadClassification.SegmentConditions.SegmentConditionsLV_tb.Remove.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/admin/workload/WorkloadClassificationDV.ClaimWorkloadClassification.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Add extends ClickableActionElement {
        public Add(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/admin/workload/WorkloadClassificationDV.ClaimWorkloadClassification.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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