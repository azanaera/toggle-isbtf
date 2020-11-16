package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.IteratorEntries;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.RuleComparisonRowIntegerInputSet.entry;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/bizrules/RuleComparisonRowIntegerInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class RuleComparisonRowIntegerInputSet extends PCFElement {
  public final static String CHECKSUM = "a675cab5c59ab53f3ac48a97b1bb23fa";
  
  public RuleComparisonRowIntegerInputSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getLabel() {
    return getOrCreateProperty("Label", "Label", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntries<entry> get_Entries() {
    return getOrCreateEntries(null, pcftest.RuleComparisonRowIntegerInputSet.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/RuleComparisonRowIntegerInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends PCFElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getValue() {
      return getOrCreateProperty("Value", "Value", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    
  }
  
  
}