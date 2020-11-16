package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.IteratorEntries;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.RuleComparisonCommandParametersInputSet_default.entry;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/bizrules/RuleComparisonCommandParametersInputSet.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class RuleComparisonCommandParametersInputSet_default extends RuleComparisonCommandParametersInputSet {
  public final static String CHECKSUM = "674d1a1bd7213cb7fd78e47eb7476a11";
  
  public RuleComparisonCommandParametersInputSet_default(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntries<entry> get_Entries() {
    return getOrCreateEntries(null, pcftest.RuleComparisonCommandParametersInputSet_default.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/RuleComparisonCommandParametersInputSet.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends PCFElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public RuleComparisonRowStringInputSet getRuleComparisonRowStringInputSet() {
      return getOrCreateProperty("RuleComparisonRowStringInputSet", "RuleComparisonRowStringInputSet", null, pcftest.RuleComparisonRowStringInputSet.class);
    }
    
    
  }
  
  
}