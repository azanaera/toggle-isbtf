package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.IteratorEntries;
import gw.smoketest.platform.web.MultiSelectElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.RuleComparisonRowListInputSet.entry;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/bizrules/RuleComparisonRowListInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class RuleComparisonRowListInputSet extends PCFElement {
  public final static String CHECKSUM = "b91d11f005ebfd50cff16321f17bc4e6";
  
  public RuleComparisonRowListInputSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getLabel() {
    return getOrCreateProperty("Label", "Label", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntries<entry> get_Entries() {
    return getOrCreateEntries(null, pcftest.RuleComparisonRowListInputSet.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/RuleComparisonRowListInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends PCFElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public MultiSelectElement getValue() {
      return getOrCreateProperty("Value", "Value", null, gw.smoketest.platform.web.MultiSelectElement.class);
    }
    
    
  }
  
  
}