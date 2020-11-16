package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.RuleFilterCriteriaDV_ActivityRule.JurisdictionFilter;
import pcftest.RuleFilterCriteriaDV_ActivityRule.LossTypeFilter;
import pcftest.RuleFilterCriteriaDV_ActivityRule.PolicyTypeFilter;
import typekey.Jurisdiction;
import typekey.LossType;
import typekey.PolicyType;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/bizrules/ActivityRules/RuleFilterCriteriaDV.ActivityRule.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class RuleFilterCriteriaDV_ActivityRule extends RuleFilterCriteriaDV {
  public final static String CHECKSUM = "facc8308c531ed138b7647029e974827";
  
  public RuleFilterCriteriaDV_ActivityRule(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public SelectElement getAvailability() {
    return getOrCreateProperty("Availability", "Availability", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public JurisdictionFilter getJurisdictionFilter() {
    return getOrCreateProperty("JurisdictionFilter", "JurisdictionFilter", null, pcftest.RuleFilterCriteriaDV_ActivityRule.JurisdictionFilter.class);
  }
  
  public LossTypeFilter getLossTypeFilter() {
    return getOrCreateProperty("LossTypeFilter", "LossTypeFilter", null, pcftest.RuleFilterCriteriaDV_ActivityRule.LossTypeFilter.class);
  }
  
  public PolicyTypeFilter getPolicyTypeFilter() {
    return getOrCreateProperty("PolicyTypeFilter", "PolicyTypeFilter", null, pcftest.RuleFilterCriteriaDV_ActivityRule.PolicyTypeFilter.class);
  }
  
  public RuleFilterCriteriaRuleActionInputSet_ActivityRule getRuleFilterCriteriaRuleActionInputSet_ActivityRule() {
    return getOrCreateProperty("RuleFilterCriteriaRuleActionInputSet_ActivityRule", "RuleFilterCriteriaRuleActionInputSet", null, pcftest.RuleFilterCriteriaRuleActionInputSet_ActivityRule.class);
  }
  
  public RuleFilterCriteriaRuleActionInputSet_ExposureRule getRuleFilterCriteriaRuleActionInputSet_ExposureRule() {
    return getOrCreateProperty("RuleFilterCriteriaRuleActionInputSet_ExposureRule", "RuleFilterCriteriaRuleActionInputSet", null, pcftest.RuleFilterCriteriaRuleActionInputSet_ExposureRule.class);
  }
  
  public RuleFilterCriteriaRuleActionInputSet_ReserveRule getRuleFilterCriteriaRuleActionInputSet_ReserveRule() {
    return getOrCreateProperty("RuleFilterCriteriaRuleActionInputSet_ReserveRule", "RuleFilterCriteriaRuleActionInputSet", null, pcftest.RuleFilterCriteriaRuleActionInputSet_ReserveRule.class);
  }
  
  public SelectElement getStatus() {
    return getOrCreateProperty("Status", "Status", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public ValueElement getTextFilter() {
    return getOrCreateProperty("TextFilter", "TextFilter", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/ActivityRules/RuleFilterCriteriaDV.ActivityRule.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class JurisdictionFilter extends SelectElement {
    public JurisdictionFilter(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(Jurisdiction arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public Jurisdiction getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.Jurisdiction.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(Jurisdiction arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/ActivityRules/RuleFilterCriteriaDV.ActivityRule.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LossTypeFilter extends SelectElement {
    public LossTypeFilter(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(LossType arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public LossType getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.LossType.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(LossType arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/ActivityRules/RuleFilterCriteriaDV.ActivityRule.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PolicyTypeFilter extends SelectElement {
    public PolicyTypeFilter(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(PolicyType arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public PolicyType getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.PolicyType.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(PolicyType arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  
}