package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.IteratorEntries;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.DeductibleInputSet.DeductibleLabel;
import pcftest.DeductibleInputSet.entry;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/financials/deductible/DeductibleInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class DeductibleInputSet extends PCFElement {
  public final static String CHECKSUM = "f46a08955be86890e2b8058012447c0e";
  
  public DeductibleInputSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public DeductibleLabel getDeductibleLabel() {
    return getOrCreateProperty("DeductibleLabel", "DeductibleLabel", null, pcftest.DeductibleInputSet.DeductibleLabel.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntries<entry> get_Entries() {
    return getOrCreateEntries(null, pcftest.DeductibleInputSet.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/deductible/DeductibleInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DeductibleLabel extends ValueElement {
    public DeductibleLabel(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/deductible/DeductibleInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends PCFElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getDeductible() {
      return getOrCreateProperty("Deductible", "Deductible", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    
  }
  
  
}