package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/search/checks/PaymentSearchDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class PaymentSearchDV extends DetailViewElement {
  public final static String CHECKSUM = "340aec9070bf2d88ba0756b577de1654";
  
  public PaymentSearchDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public PaymentSearchOptionalInputSet getPaymentSearchOptionalInputSet() {
    return getOrCreateProperty("PaymentSearchOptionalInputSet", "PaymentSearchOptionalInputSet", null, pcftest.PaymentSearchOptionalInputSet.class);
  }
  
  public PaymentSearchRequiredInputSet getPaymentSearchRequiredInputSet() {
    return getOrCreateProperty("PaymentSearchRequiredInputSet", "PaymentSearchRequiredInputSet", null, pcftest.PaymentSearchRequiredInputSet.class);
  }
  
  public SearchAndResetInputSet getSearchAndResetInputSet() {
    return getOrCreateProperty("SearchAndResetInputSet", "SearchAndResetInputSet", null, pcftest.SearchAndResetInputSet.class);
  }
  
  
}