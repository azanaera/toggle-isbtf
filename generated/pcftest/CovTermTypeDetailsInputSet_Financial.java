package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/policy/CovTerm/CovTermTypeDetailsInputSet.Financial.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class CovTermTypeDetailsInputSet_Financial extends CovTermTypeDetailsInputSet {
  public final static String CHECKSUM = "c0a0043549499da891c8a69f27e35a36";
  
  public CovTermTypeDetailsInputSet_Financial(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getFinancialAmount() {
    return getOrCreateProperty("FinancialAmount", "FinancialAmount", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  
}