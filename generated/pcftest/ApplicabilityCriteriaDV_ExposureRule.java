package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ApplicabilityCriteriaDV_ExposureRule.IncidentTypes;
import pcftest.ApplicabilityCriteriaDV_ExposureRule.Jurisdictions;
import pcftest.ApplicabilityCriteriaDV_ExposureRule.LossCauses;
import pcftest.ApplicabilityCriteriaDV_ExposureRule.LossPartyTypes;
import pcftest.ApplicabilityCriteriaDV_ExposureRule.LossTypes;
import pcftest.ApplicabilityCriteriaDV_ExposureRule.PolicyTypes;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/bizrules/ExposureRules/ApplicabilityCriteriaDV.ExposureRule.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ApplicabilityCriteriaDV_ExposureRule extends ApplicabilityCriteriaDV {
  public final static String CHECKSUM = "c6970c6ff94f538980396b0c6641a8ec";
  
  public ApplicabilityCriteriaDV_ExposureRule(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public IncidentTypes getIncidentTypes() {
    return getOrCreateProperty("IncidentTypes", "IncidentTypes", null, pcftest.ApplicabilityCriteriaDV_ExposureRule.IncidentTypes.class);
  }
  
  public Jurisdictions getJurisdictions() {
    return getOrCreateProperty("Jurisdictions", "Jurisdictions", null, pcftest.ApplicabilityCriteriaDV_ExposureRule.Jurisdictions.class);
  }
  
  public LossCauses getLossCauses() {
    return getOrCreateProperty("LossCauses", "LossCauses", null, pcftest.ApplicabilityCriteriaDV_ExposureRule.LossCauses.class);
  }
  
  public LossPartyTypes getLossPartyTypes() {
    return getOrCreateProperty("LossPartyTypes", "LossPartyTypes", null, pcftest.ApplicabilityCriteriaDV_ExposureRule.LossPartyTypes.class);
  }
  
  public LossTypes getLossTypes() {
    return getOrCreateProperty("LossTypes", "LossTypes", null, pcftest.ApplicabilityCriteriaDV_ExposureRule.LossTypes.class);
  }
  
  public PolicyTypes getPolicyTypes() {
    return getOrCreateProperty("PolicyTypes", "PolicyTypes", null, pcftest.ApplicabilityCriteriaDV_ExposureRule.PolicyTypes.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/ExposureRules/ApplicabilityCriteriaDV.ExposureRule.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IncidentTypes extends PCFElement {
    public IncidentTypes(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ApplicabilityCriteriaSingleSelectInputSet getApplicabilityCriteriaSingleSelectInputSet() {
      return getOrCreateProperty("ApplicabilityCriteriaSingleSelectInputSet", "ApplicabilityCriteriaSingleSelectInputSet", null, pcftest.ApplicabilityCriteriaSingleSelectInputSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/ExposureRules/ApplicabilityCriteriaDV.ExposureRule.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Jurisdictions extends PCFElement {
    public Jurisdictions(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ApplicabilityCriteriaMultiSelectInputSet getApplicabilityCriteriaMultiSelectInputSet() {
      return getOrCreateProperty("ApplicabilityCriteriaMultiSelectInputSet", "ApplicabilityCriteriaMultiSelectInputSet", null, pcftest.ApplicabilityCriteriaMultiSelectInputSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/ExposureRules/ApplicabilityCriteriaDV.ExposureRule.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LossCauses extends PCFElement {
    public LossCauses(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ApplicabilityCriteriaMultiSelectInputSet getApplicabilityCriteriaMultiSelectInputSet() {
      return getOrCreateProperty("ApplicabilityCriteriaMultiSelectInputSet", "ApplicabilityCriteriaMultiSelectInputSet", null, pcftest.ApplicabilityCriteriaMultiSelectInputSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/ExposureRules/ApplicabilityCriteriaDV.ExposureRule.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LossPartyTypes extends PCFElement {
    public LossPartyTypes(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ApplicabilityCriteriaSingleSelectInputSet getApplicabilityCriteriaSingleSelectInputSet() {
      return getOrCreateProperty("ApplicabilityCriteriaSingleSelectInputSet", "ApplicabilityCriteriaSingleSelectInputSet", null, pcftest.ApplicabilityCriteriaSingleSelectInputSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/ExposureRules/ApplicabilityCriteriaDV.ExposureRule.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LossTypes extends PCFElement {
    public LossTypes(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ApplicabilityCriteriaSingleSelectInputSet getApplicabilityCriteriaSingleSelectInputSet() {
      return getOrCreateProperty("ApplicabilityCriteriaSingleSelectInputSet", "ApplicabilityCriteriaSingleSelectInputSet", null, pcftest.ApplicabilityCriteriaSingleSelectInputSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/ExposureRules/ApplicabilityCriteriaDV.ExposureRule.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PolicyTypes extends PCFElement {
    public PolicyTypes(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ApplicabilityCriteriaSingleSelectInputSet getApplicabilityCriteriaSingleSelectInputSet() {
      return getOrCreateProperty("ApplicabilityCriteriaSingleSelectInputSet", "ApplicabilityCriteriaSingleSelectInputSet", null, pcftest.ApplicabilityCriteriaSingleSelectInputSet.class);
    }
    
    
  }
  
  
}