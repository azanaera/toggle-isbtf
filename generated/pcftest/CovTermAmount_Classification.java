package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/policy/CovTerm/CovTermAmount.Classification.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class CovTermAmount_Classification extends CovTermAmount {
  public final static String CHECKSUM = "91dfd1a984e383a217716152a4c75176";
  
  public CovTermAmount_Classification(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getCovTermDescription() {
    return getOrCreateProperty("CovTermDescription", "CovTermDescription", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  
}