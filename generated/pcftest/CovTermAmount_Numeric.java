package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/policy/CovTerm/CovTermAmount.Numeric.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class CovTermAmount_Numeric extends CovTermAmount {
  public final static String CHECKSUM = "ae6de687772a6a213dbc57426e5f2e8d";
  
  public CovTermAmount_Numeric(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getCovTermAmount() {
    return getOrCreateProperty("CovTermAmount", "CovTermAmount", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  
}