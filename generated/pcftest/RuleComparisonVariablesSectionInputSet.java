package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.IteratorEntries;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.RuleComparisonVariablesSectionInputSet.RuleVariablesSectionLabel;
import pcftest.RuleComparisonVariablesSectionInputSet.entry;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/bizrules/RuleComparisonVariablesSectionInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class RuleComparisonVariablesSectionInputSet extends PCFElement {
  public final static String CHECKSUM = "07e9971ba8fae0e63407a42247ebbffc";
  
  public RuleComparisonVariablesSectionInputSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public RuleVariablesSectionLabel getRuleVariablesSectionLabel() {
    return getOrCreateProperty("RuleVariablesSectionLabel", "RuleVariablesSectionLabel", null, pcftest.RuleComparisonVariablesSectionInputSet.RuleVariablesSectionLabel.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntries<entry> get_Entries() {
    return getOrCreateEntries(null, pcftest.RuleComparisonVariablesSectionInputSet.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/RuleComparisonVariablesSectionInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RuleVariablesSectionLabel extends PCFElement {
    public RuleVariablesSectionLabel(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public RuleComparisonSectionLabelInputSet getRuleComparisonSectionLabelInputSet() {
      return getOrCreateProperty("RuleComparisonSectionLabelInputSet", "RuleComparisonSectionLabelInputSet", null, pcftest.RuleComparisonSectionLabelInputSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/RuleComparisonVariablesSectionInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends PCFElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public RuleComparisonVariableInputSet getRuleComparisonVariableInputSet() {
      return getOrCreateProperty("RuleComparisonVariableInputSet", "RuleComparisonVariableInputSet", null, pcftest.RuleComparisonVariableInputSet.class);
    }
    
    
  }
  
  
}