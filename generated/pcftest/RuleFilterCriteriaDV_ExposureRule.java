package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.RuleFilterCriteriaDV_ExposureRule.IncidentTypeFilter;
import pcftest.RuleFilterCriteriaDV_ExposureRule.JurisdictionFilter;
import pcftest.RuleFilterCriteriaDV_ExposureRule.LossPartyTypeFilter;
import pcftest.RuleFilterCriteriaDV_ExposureRule.PolicyTypeFilter;
import typekey.Incident;
import typekey.Jurisdiction;
import typekey.LossPartyType;
import typekey.PolicyType;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/bizrules/ExposureRules/RuleFilterCriteriaDV.ExposureRule.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class RuleFilterCriteriaDV_ExposureRule extends RuleFilterCriteriaDV {
  public final static String CHECKSUM = "145c6933d6392b5da4d50bcc54f71e97";
  
  public RuleFilterCriteriaDV_ExposureRule(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public SelectElement getAvailability() {
    return getOrCreateProperty("Availability", "Availability", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public IncidentTypeFilter getIncidentTypeFilter() {
    return getOrCreateProperty("IncidentTypeFilter", "IncidentTypeFilter", null, pcftest.RuleFilterCriteriaDV_ExposureRule.IncidentTypeFilter.class);
  }
  
  public JurisdictionFilter getJurisdictionFilter() {
    return getOrCreateProperty("JurisdictionFilter", "JurisdictionFilter", null, pcftest.RuleFilterCriteriaDV_ExposureRule.JurisdictionFilter.class);
  }
  
  public LossPartyTypeFilter getLossPartyTypeFilter() {
    return getOrCreateProperty("LossPartyTypeFilter", "LossPartyTypeFilter", null, pcftest.RuleFilterCriteriaDV_ExposureRule.LossPartyTypeFilter.class);
  }
  
  public PolicyTypeFilter getPolicyTypeFilter() {
    return getOrCreateProperty("PolicyTypeFilter", "PolicyTypeFilter", null, pcftest.RuleFilterCriteriaDV_ExposureRule.PolicyTypeFilter.class);
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
  @Generated(comments = "config/web/pcf/bizrules/ExposureRules/RuleFilterCriteriaDV.ExposureRule.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IncidentTypeFilter extends SelectElement {
    public IncidentTypeFilter(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(Incident arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public Incident getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.Incident.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(Incident arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/ExposureRules/RuleFilterCriteriaDV.ExposureRule.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/bizrules/ExposureRules/RuleFilterCriteriaDV.ExposureRule.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LossPartyTypeFilter extends SelectElement {
    public LossPartyTypeFilter(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(LossPartyType arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public LossPartyType getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.LossPartyType.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(LossPartyType arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/ExposureRules/RuleFilterCriteriaDV.ExposureRule.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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