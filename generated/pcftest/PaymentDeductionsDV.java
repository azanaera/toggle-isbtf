package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.PaymentDeductionsDV.PaymentDeductionsLV_tb;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/newtransaction/check/PaymentDeductionsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class PaymentDeductionsDV extends DetailViewElement {
  public final static String CHECKSUM = "cd15a335997d5744a014cbaac685f8ee";
  
  public PaymentDeductionsDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getAmount_Gross() {
    return getOrCreateProperty("Amount_Gross", "Amount_Gross", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getAmount_Net() {
    return getOrCreateProperty("Amount_Net", "Amount_Net", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getAmount_Reportable() {
    return getOrCreateProperty("Amount_Reportable", "Amount_Reportable", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public PaymentDeductionsLV getPaymentDeductionsLV() {
    return getOrCreateProperty("PaymentDeductionsLV", "PaymentDeductionsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.PaymentDeductionsLV.class);
  }
  
  public PaymentDeductionsLV_tb getPaymentDeductionsLV_tb() {
    return getOrCreateProperty("PaymentDeductionsLV_tb", "PaymentDeductionsLV_tb", null, pcftest.PaymentDeductionsDV.PaymentDeductionsLV_tb.class);
  }
  
  public ValueElement getVendor() {
    return getOrCreateProperty("Vendor", "Vendor", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/check/PaymentDeductionsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PaymentDeductionsLV_tb extends PCFElement {
    public PaymentDeductionsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  
}