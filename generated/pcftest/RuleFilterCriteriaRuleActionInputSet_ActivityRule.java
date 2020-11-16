package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.RuleFilterCriteriaRuleActionInputSet_ActivityRule.ActionTypeFilter;
import typekey.RuleActionKey;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/bizrules/ActivityRules/RuleFilterCriteriaRuleActionInputSet.ActivityRule.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class RuleFilterCriteriaRuleActionInputSet_ActivityRule extends RuleFilterCriteriaRuleActionInputSet {
  public final static String CHECKSUM = "354ad7205a17f89e430a8f713cd8ca69";
  
  public RuleFilterCriteriaRuleActionInputSet_ActivityRule(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ActionTypeFilter getActionTypeFilter() {
    return getOrCreateProperty("ActionTypeFilter", "ActionTypeFilter", null, pcftest.RuleFilterCriteriaRuleActionInputSet_ActivityRule.ActionTypeFilter.class);
  }
  
  public SelectElement getActivityPattern() {
    return getOrCreateProperty("ActivityPattern", "ActivityPattern", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public ValueElement getExpression() {
    return getOrCreateProperty("Expression", "Expression", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public SelectElement getHistoryEventType() {
    return getOrCreateProperty("HistoryEventType", "HistoryEventType", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/ActivityRules/RuleFilterCriteriaRuleActionInputSet.ActivityRule.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ActionTypeFilter extends SelectElement {
    public ActionTypeFilter(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(RuleActionKey arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public RuleActionKey getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.RuleActionKey.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(RuleActionKey arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  
}