package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.IteratorEntries;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.RuleComparisonActionsInputSet.RuleActionsSectionLabel;
import pcftest.RuleComparisonActionsInputSet.entry;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/bizrules/RuleComparisonActionsInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class RuleComparisonActionsInputSet extends PCFElement {
  public final static String CHECKSUM = "685a8eb494ed5e1e868f02108f6ae727";
  
  public RuleComparisonActionsInputSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public RuleActionsSectionLabel getRuleActionsSectionLabel() {
    return getOrCreateProperty("RuleActionsSectionLabel", "RuleActionsSectionLabel", null, pcftest.RuleComparisonActionsInputSet.RuleActionsSectionLabel.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntries<entry> get_Entries() {
    return getOrCreateEntries(null, pcftest.RuleComparisonActionsInputSet.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/RuleComparisonActionsInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RuleActionsSectionLabel extends PCFElement {
    public RuleActionsSectionLabel(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public RuleComparisonSectionLabelInputSet getRuleComparisonSectionLabelInputSet() {
      return getOrCreateProperty("RuleComparisonSectionLabelInputSet", "RuleComparisonSectionLabelInputSet", null, pcftest.RuleComparisonSectionLabelInputSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/RuleComparisonActionsInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends PCFElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public RuleComparisonCommandInputSet getRuleComparisonCommandInputSet() {
      return getOrCreateProperty("RuleComparisonCommandInputSet", "RuleComparisonCommandInputSet", null, pcftest.RuleComparisonCommandInputSet.class);
    }
    
    
  }
  
  
}