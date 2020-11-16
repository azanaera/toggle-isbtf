package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.IteratorEntries;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.RuleComparisonRowStringInputSet.entry;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/bizrules/RuleComparisonRowStringInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class RuleComparisonRowStringInputSet extends PCFElement {
  public final static String CHECKSUM = "9f6ff9c4eea650e3d45b8f4a6ac6c6a0";
  
  public RuleComparisonRowStringInputSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getLabel() {
    return getOrCreateProperty("Label", "Label", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntries<entry> get_Entries() {
    return getOrCreateEntries(null, pcftest.RuleComparisonRowStringInputSet.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/RuleComparisonRowStringInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends PCFElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getValue() {
      return getOrCreateProperty("Value", "Value", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    
  }
  
  
}