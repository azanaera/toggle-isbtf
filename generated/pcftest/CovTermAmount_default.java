package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/policy/CovTerm/CovTermAmount.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class CovTermAmount_default extends CovTermAmount {
  public final static String CHECKSUM = "d25df9afe867b46990e8004315d30c05";
  
  public CovTermAmount_default(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getCovTermDisplay() {
    return getOrCreateProperty("CovTermDisplay", "CovTermDisplay", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  
}