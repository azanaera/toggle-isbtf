package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ApplicabilityCriteriaDV_ActivityRule.Jurisdictions;
import pcftest.ApplicabilityCriteriaDV_ActivityRule.LossTypes;
import pcftest.ApplicabilityCriteriaDV_ActivityRule.PolicyTypes;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/bizrules/ActivityRules/ApplicabilityCriteriaDV.ActivityRule.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ApplicabilityCriteriaDV_ActivityRule extends ApplicabilityCriteriaDV {
  public final static String CHECKSUM = "f2f5bd8de2f520b905bb38f832cf80a7";
  
  public ApplicabilityCriteriaDV_ActivityRule(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public Jurisdictions getJurisdictions() {
    return getOrCreateProperty("Jurisdictions", "Jurisdictions", null, pcftest.ApplicabilityCriteriaDV_ActivityRule.Jurisdictions.class);
  }
  
  public LossTypes getLossTypes() {
    return getOrCreateProperty("LossTypes", "LossTypes", null, pcftest.ApplicabilityCriteriaDV_ActivityRule.LossTypes.class);
  }
  
  public PolicyTypes getPolicyTypes() {
    return getOrCreateProperty("PolicyTypes", "PolicyTypes", null, pcftest.ApplicabilityCriteriaDV_ActivityRule.PolicyTypes.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/ActivityRules/ApplicabilityCriteriaDV.ActivityRule.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Jurisdictions extends PCFElement {
    public Jurisdictions(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ApplicabilityCriteriaMultiSelectInputSet getApplicabilityCriteriaMultiSelectInputSet() {
      return getOrCreateProperty("ApplicabilityCriteriaMultiSelectInputSet", "ApplicabilityCriteriaMultiSelectInputSet", null, pcftest.ApplicabilityCriteriaMultiSelectInputSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/ActivityRules/ApplicabilityCriteriaDV.ActivityRule.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LossTypes extends PCFElement {
    public LossTypes(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ApplicabilityCriteriaMultiSelectInputSet getApplicabilityCriteriaMultiSelectInputSet() {
      return getOrCreateProperty("ApplicabilityCriteriaMultiSelectInputSet", "ApplicabilityCriteriaMultiSelectInputSet", null, pcftest.ApplicabilityCriteriaMultiSelectInputSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/ActivityRules/ApplicabilityCriteriaDV.ActivityRule.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PolicyTypes extends PCFElement {
    public PolicyTypes(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ApplicabilityCriteriaMultiSelectInputSet getApplicabilityCriteriaMultiSelectInputSet() {
      return getOrCreateProperty("ApplicabilityCriteriaMultiSelectInputSet", "ApplicabilityCriteriaMultiSelectInputSet", null, pcftest.ApplicabilityCriteriaMultiSelectInputSet.class);
    }
    
    
  }
  
  
}