package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.CCRuleApplicabilityCriteriaComparisonInputSet_ReserveRule.ApplicabilityCriteriaSectionLabel;
import pcftest.CCRuleApplicabilityCriteriaComparisonInputSet_ReserveRule.ClaimSegment;
import pcftest.CCRuleApplicabilityCriteriaComparisonInputSet_ReserveRule.ExposureType;
import pcftest.CCRuleApplicabilityCriteriaComparisonInputSet_ReserveRule.Jurisdiction;
import pcftest.CCRuleApplicabilityCriteriaComparisonInputSet_ReserveRule.LossType;
import pcftest.CCRuleApplicabilityCriteriaComparisonInputSet_ReserveRule.PolicyType;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/bizrules/CCRuleApplicabilityCriteriaComparisonInputSet.ReserveRule.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class CCRuleApplicabilityCriteriaComparisonInputSet_ReserveRule extends CCRuleApplicabilityCriteriaComparisonInputSet {
  public final static String CHECKSUM = "a23ebcc3378af79e4b46c7e1cb9ced06";
  
  public CCRuleApplicabilityCriteriaComparisonInputSet_ReserveRule(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ApplicabilityCriteriaSectionLabel getApplicabilityCriteriaSectionLabel() {
    return getOrCreateProperty("ApplicabilityCriteriaSectionLabel", "ApplicabilityCriteriaSectionLabel", null, pcftest.CCRuleApplicabilityCriteriaComparisonInputSet_ReserveRule.ApplicabilityCriteriaSectionLabel.class);
  }
  
  public ClaimSegment getClaimSegment() {
    return getOrCreateProperty("ClaimSegment", "ClaimSegment", null, pcftest.CCRuleApplicabilityCriteriaComparisonInputSet_ReserveRule.ClaimSegment.class);
  }
  
  public ExposureType getExposureType() {
    return getOrCreateProperty("ExposureType", "ExposureType", null, pcftest.CCRuleApplicabilityCriteriaComparisonInputSet_ReserveRule.ExposureType.class);
  }
  
  public Jurisdiction getJurisdiction() {
    return getOrCreateProperty("Jurisdiction", "Jurisdiction", null, pcftest.CCRuleApplicabilityCriteriaComparisonInputSet_ReserveRule.Jurisdiction.class);
  }
  
  public LossType getLossType() {
    return getOrCreateProperty("LossType", "LossType", null, pcftest.CCRuleApplicabilityCriteriaComparisonInputSet_ReserveRule.LossType.class);
  }
  
  public PolicyType getPolicyType() {
    return getOrCreateProperty("PolicyType", "PolicyType", null, pcftest.CCRuleApplicabilityCriteriaComparisonInputSet_ReserveRule.PolicyType.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/CCRuleApplicabilityCriteriaComparisonInputSet.ReserveRule.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ApplicabilityCriteriaSectionLabel extends PCFElement {
    public ApplicabilityCriteriaSectionLabel(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public RuleComparisonSectionLabelInputSet getRuleComparisonSectionLabelInputSet() {
      return getOrCreateProperty("RuleComparisonSectionLabelInputSet", "RuleComparisonSectionLabelInputSet", null, pcftest.RuleComparisonSectionLabelInputSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/CCRuleApplicabilityCriteriaComparisonInputSet.ReserveRule.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSegment extends PCFElement {
    public ClaimSegment(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public RuleComparisonRowStringInputSet getRuleComparisonRowStringInputSet() {
      return getOrCreateProperty("RuleComparisonRowStringInputSet", "RuleComparisonRowStringInputSet", null, pcftest.RuleComparisonRowStringInputSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/CCRuleApplicabilityCriteriaComparisonInputSet.ReserveRule.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ExposureType extends PCFElement {
    public ExposureType(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public RuleComparisonRowStringInputSet getRuleComparisonRowStringInputSet() {
      return getOrCreateProperty("RuleComparisonRowStringInputSet", "RuleComparisonRowStringInputSet", null, pcftest.RuleComparisonRowStringInputSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/CCRuleApplicabilityCriteriaComparisonInputSet.ReserveRule.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Jurisdiction extends PCFElement {
    public Jurisdiction(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public RuleComparisonRowStringInputSet getRuleComparisonRowStringInputSet() {
      return getOrCreateProperty("RuleComparisonRowStringInputSet", "RuleComparisonRowStringInputSet", null, pcftest.RuleComparisonRowStringInputSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/CCRuleApplicabilityCriteriaComparisonInputSet.ReserveRule.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LossType extends PCFElement {
    public LossType(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public RuleComparisonRowStringInputSet getRuleComparisonRowStringInputSet() {
      return getOrCreateProperty("RuleComparisonRowStringInputSet", "RuleComparisonRowStringInputSet", null, pcftest.RuleComparisonRowStringInputSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/CCRuleApplicabilityCriteriaComparisonInputSet.ReserveRule.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PolicyType extends PCFElement {
    public PolicyType(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public RuleComparisonRowStringInputSet getRuleComparisonRowStringInputSet() {
      return getOrCreateProperty("RuleComparisonRowStringInputSet", "RuleComparisonRowStringInputSet", null, pcftest.RuleComparisonRowStringInputSet.class);
    }
    
    
  }
  
  
}