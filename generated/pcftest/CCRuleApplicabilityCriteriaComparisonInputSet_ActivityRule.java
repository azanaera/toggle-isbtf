package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.CCRuleApplicabilityCriteriaComparisonInputSet_ActivityRule.ApplicabilityCriteriaSectionLabel;
import pcftest.CCRuleApplicabilityCriteriaComparisonInputSet_ActivityRule.Jurisdiction;
import pcftest.CCRuleApplicabilityCriteriaComparisonInputSet_ActivityRule.LossType;
import pcftest.CCRuleApplicabilityCriteriaComparisonInputSet_ActivityRule.PolicyType;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/bizrules/CCRuleApplicabilityCriteriaComparisonInputSet.ActivityRule.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class CCRuleApplicabilityCriteriaComparisonInputSet_ActivityRule extends CCRuleApplicabilityCriteriaComparisonInputSet {
  public final static String CHECKSUM = "227e33e0f41c6c31e7a1a7454c65a4e2";
  
  public CCRuleApplicabilityCriteriaComparisonInputSet_ActivityRule(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ApplicabilityCriteriaSectionLabel getApplicabilityCriteriaSectionLabel() {
    return getOrCreateProperty("ApplicabilityCriteriaSectionLabel", "ApplicabilityCriteriaSectionLabel", null, pcftest.CCRuleApplicabilityCriteriaComparisonInputSet_ActivityRule.ApplicabilityCriteriaSectionLabel.class);
  }
  
  public Jurisdiction getJurisdiction() {
    return getOrCreateProperty("Jurisdiction", "Jurisdiction", null, pcftest.CCRuleApplicabilityCriteriaComparisonInputSet_ActivityRule.Jurisdiction.class);
  }
  
  public LossType getLossType() {
    return getOrCreateProperty("LossType", "LossType", null, pcftest.CCRuleApplicabilityCriteriaComparisonInputSet_ActivityRule.LossType.class);
  }
  
  public PolicyType getPolicyType() {
    return getOrCreateProperty("PolicyType", "PolicyType", null, pcftest.CCRuleApplicabilityCriteriaComparisonInputSet_ActivityRule.PolicyType.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/CCRuleApplicabilityCriteriaComparisonInputSet.ActivityRule.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ApplicabilityCriteriaSectionLabel extends PCFElement {
    public ApplicabilityCriteriaSectionLabel(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public RuleComparisonSectionLabelInputSet getRuleComparisonSectionLabelInputSet() {
      return getOrCreateProperty("RuleComparisonSectionLabelInputSet", "RuleComparisonSectionLabelInputSet", null, pcftest.RuleComparisonSectionLabelInputSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/CCRuleApplicabilityCriteriaComparisonInputSet.ActivityRule.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Jurisdiction extends PCFElement {
    public Jurisdiction(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public RuleComparisonRowStringInputSet getRuleComparisonRowStringInputSet() {
      return getOrCreateProperty("RuleComparisonRowStringInputSet", "RuleComparisonRowStringInputSet", null, pcftest.RuleComparisonRowStringInputSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/CCRuleApplicabilityCriteriaComparisonInputSet.ActivityRule.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LossType extends PCFElement {
    public LossType(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public RuleComparisonRowStringInputSet getRuleComparisonRowStringInputSet() {
      return getOrCreateProperty("RuleComparisonRowStringInputSet", "RuleComparisonRowStringInputSet", null, pcftest.RuleComparisonRowStringInputSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/CCRuleApplicabilityCriteriaComparisonInputSet.ActivityRule.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PolicyType extends PCFElement {
    public PolicyType(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public RuleComparisonRowStringInputSet getRuleComparisonRowStringInputSet() {
      return getOrCreateProperty("RuleComparisonRowStringInputSet", "RuleComparisonRowStringInputSet", null, pcftest.RuleComparisonRowStringInputSet.class);
    }
    
    
  }
  
  
}