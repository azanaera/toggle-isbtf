package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_PolicySearchInputSet.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class FNOLWizard_PolicySearchInputSet_default extends FNOLWizard_PolicySearchInputSet {
  public final static String CHECKSUM = "d8cc0af54ef8f854dbdfe171875a346a";
  
  public FNOLWizard_PolicySearchInputSet_default(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public CCAddressInputSet getCCAddressInputSet() {
    return getOrCreateProperty("CCAddressInputSet", "CCAddressInputSet", null, pcftest.CCAddressInputSet.class);
  }
  
  public ValueElement getvin() {
    return getOrCreateProperty("vin", "vin", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  
}