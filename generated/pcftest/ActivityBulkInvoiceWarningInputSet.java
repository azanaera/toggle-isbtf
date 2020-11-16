package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ActivityBulkInvoiceWarningInputSet.InvoiceNumber;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/workspace/activity/ActivityBulkInvoiceWarningInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ActivityBulkInvoiceWarningInputSet extends PCFElement {
  public final static String CHECKSUM = "1a7454279d71c009dc13cdb58ee60b67";
  
  public ActivityBulkInvoiceWarningInputSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public InvoiceNumber getInvoiceNumber() {
    return getOrCreateProperty("InvoiceNumber", "InvoiceNumber", null, pcftest.ActivityBulkInvoiceWarningInputSet.InvoiceNumber.class);
  }
  
  public ValueElement getPayee() {
    return getOrCreateProperty("Payee", "Payee", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getTotalAmount() {
    return getOrCreateProperty("TotalAmount", "TotalAmount", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/workspace/activity/ActivityBulkInvoiceWarningInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class InvoiceNumber extends ValueElement {
    public InvoiceNumber(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public BulkPay click() {
      return clickThis(pcftest.BulkPay.class);
    }
    
    
  }
  
  
}