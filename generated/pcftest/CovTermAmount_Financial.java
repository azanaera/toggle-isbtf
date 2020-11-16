package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/policy/CovTerm/CovTermAmount.Financial.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class CovTermAmount_Financial extends CovTermAmount {
  public final static String CHECKSUM = "bc20894c8936906893ef2c07b3a3a756";
  
  public CovTermAmount_Financial(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getCovTermAmount() {
    return getOrCreateProperty("CovTermAmount", "CovTermAmount", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  
}