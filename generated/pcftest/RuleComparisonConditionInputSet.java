package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.RuleComparisonConditionInputSet.RuleConditionSectionLabel;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/bizrules/RuleComparisonConditionInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class RuleComparisonConditionInputSet extends PCFElement {
  public final static String CHECKSUM = "22f861062b30c45e1c45af9e0b09b0f0";
  
  public RuleComparisonConditionInputSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public RuleComparisonRowConditionInputSet getRuleComparisonRowConditionInputSet() {
    return getOrCreateProperty("RuleComparisonRowConditionInputSet", "RuleComparisonRowConditionInputSet", null, pcftest.RuleComparisonRowConditionInputSet.class);
  }
  
  public RuleConditionSectionLabel getRuleConditionSectionLabel() {
    return getOrCreateProperty("RuleConditionSectionLabel", "RuleConditionSectionLabel", null, pcftest.RuleComparisonConditionInputSet.RuleConditionSectionLabel.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/RuleComparisonConditionInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RuleConditionSectionLabel extends PCFElement {
    public RuleConditionSectionLabel(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public RuleComparisonSectionLabelInputSet getRuleComparisonSectionLabelInputSet() {
      return getOrCreateProperty("RuleComparisonSectionLabelInputSet", "RuleComparisonSectionLabelInputSet", null, pcftest.RuleComparisonSectionLabelInputSet.class);
    }
    
    
  }
  
  
}