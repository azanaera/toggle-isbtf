package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ApplicabilityCriteriaDV_ReserveRule.ClaimSegments;
import pcftest.ApplicabilityCriteriaDV_ReserveRule.ExposureTypes;
import pcftest.ApplicabilityCriteriaDV_ReserveRule.Jurisdictions;
import pcftest.ApplicabilityCriteriaDV_ReserveRule.LossTypes;
import pcftest.ApplicabilityCriteriaDV_ReserveRule.PolicyTypes;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/bizrules/ReserveRules/ApplicabilityCriteriaDV.ReserveRule.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ApplicabilityCriteriaDV_ReserveRule extends ApplicabilityCriteriaDV {
  public final static String CHECKSUM = "c04ed6b1be708eda3855ac228650abd4";
  
  public ApplicabilityCriteriaDV_ReserveRule(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ClaimSegments getClaimSegments() {
    return getOrCreateProperty("ClaimSegments", "ClaimSegments", null, pcftest.ApplicabilityCriteriaDV_ReserveRule.ClaimSegments.class);
  }
  
  public ExposureTypes getExposureTypes() {
    return getOrCreateProperty("ExposureTypes", "ExposureTypes", null, pcftest.ApplicabilityCriteriaDV_ReserveRule.ExposureTypes.class);
  }
  
  public Jurisdictions getJurisdictions() {
    return getOrCreateProperty("Jurisdictions", "Jurisdictions", null, pcftest.ApplicabilityCriteriaDV_ReserveRule.Jurisdictions.class);
  }
  
  public LossTypes getLossTypes() {
    return getOrCreateProperty("LossTypes", "LossTypes", null, pcftest.ApplicabilityCriteriaDV_ReserveRule.LossTypes.class);
  }
  
  public PolicyTypes getPolicyTypes() {
    return getOrCreateProperty("PolicyTypes", "PolicyTypes", null, pcftest.ApplicabilityCriteriaDV_ReserveRule.PolicyTypes.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/ReserveRules/ApplicabilityCriteriaDV.ReserveRule.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSegments extends PCFElement {
    public ClaimSegments(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ApplicabilityCriteriaMultiSelectInputSet getApplicabilityCriteriaMultiSelectInputSet() {
      return getOrCreateProperty("ApplicabilityCriteriaMultiSelectInputSet", "ApplicabilityCriteriaMultiSelectInputSet", null, pcftest.ApplicabilityCriteriaMultiSelectInputSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/ReserveRules/ApplicabilityCriteriaDV.ReserveRule.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ExposureTypes extends PCFElement {
    public ExposureTypes(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ApplicabilityCriteriaMultiSelectInputSet getApplicabilityCriteriaMultiSelectInputSet() {
      return getOrCreateProperty("ApplicabilityCriteriaMultiSelectInputSet", "ApplicabilityCriteriaMultiSelectInputSet", null, pcftest.ApplicabilityCriteriaMultiSelectInputSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/ReserveRules/ApplicabilityCriteriaDV.ReserveRule.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Jurisdictions extends PCFElement {
    public Jurisdictions(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ApplicabilityCriteriaMultiSelectInputSet getApplicabilityCriteriaMultiSelectInputSet() {
      return getOrCreateProperty("ApplicabilityCriteriaMultiSelectInputSet", "ApplicabilityCriteriaMultiSelectInputSet", null, pcftest.ApplicabilityCriteriaMultiSelectInputSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/ReserveRules/ApplicabilityCriteriaDV.ReserveRule.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LossTypes extends PCFElement {
    public LossTypes(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ApplicabilityCriteriaSingleSelectInputSet getApplicabilityCriteriaSingleSelectInputSet() {
      return getOrCreateProperty("ApplicabilityCriteriaSingleSelectInputSet", "ApplicabilityCriteriaSingleSelectInputSet", null, pcftest.ApplicabilityCriteriaSingleSelectInputSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/ReserveRules/ApplicabilityCriteriaDV.ReserveRule.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PolicyTypes extends PCFElement {
    public PolicyTypes(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ApplicabilityCriteriaMultiSelectInputSet getApplicabilityCriteriaMultiSelectInputSet() {
      return getOrCreateProperty("ApplicabilityCriteriaMultiSelectInputSet", "ApplicabilityCriteriaMultiSelectInputSet", null, pcftest.ApplicabilityCriteriaMultiSelectInputSet.class);
    }
    
    
  }
  
  
}