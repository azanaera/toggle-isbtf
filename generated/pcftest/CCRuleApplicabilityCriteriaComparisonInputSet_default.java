package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.CCRuleApplicabilityCriteriaComparisonInputSet_default.ApplicabilityCriteriaSectionLabel;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/bizrules/CCRuleApplicabilityCriteriaComparisonInputSet.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class CCRuleApplicabilityCriteriaComparisonInputSet_default extends CCRuleApplicabilityCriteriaComparisonInputSet {
  public final static String CHECKSUM = "7436acf58b3340d6263614418c3df74c";
  
  public CCRuleApplicabilityCriteriaComparisonInputSet_default(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ApplicabilityCriteriaSectionLabel getApplicabilityCriteriaSectionLabel() {
    return getOrCreateProperty("ApplicabilityCriteriaSectionLabel", "ApplicabilityCriteriaSectionLabel", null, pcftest.CCRuleApplicabilityCriteriaComparisonInputSet_default.ApplicabilityCriteriaSectionLabel.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/CCRuleApplicabilityCriteriaComparisonInputSet.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ApplicabilityCriteriaSectionLabel extends PCFElement {
    public ApplicabilityCriteriaSectionLabel(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public RuleComparisonSectionLabelInputSet getRuleComparisonSectionLabelInputSet() {
      return getOrCreateProperty("RuleComparisonSectionLabelInputSet", "RuleComparisonSectionLabelInputSet", null, pcftest.RuleComparisonSectionLabelInputSet.class);
    }
    
    
  }
  
  
}