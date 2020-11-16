package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.SelectElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.NewPaymentInstructionsDV_single.CheckInstructions;
import typekey.CheckHandlingInstructions;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/newtransaction/check/NewPaymentInstructionsDV.single.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NewPaymentInstructionsDV_single extends NewPaymentInstructionsDV {
  public final static String CHECKSUM = "cb03aa3798099cd487dc7423ea8ae93a";
  
  public NewPaymentInstructionsDV_single(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public pcftest.NewPaymentInstructionsDV_single.CheckBatching getCheckBatching() {
    return getOrCreateProperty("CheckBatching", "CheckBatching", null, pcftest.NewPaymentInstructionsDV_single.CheckBatching.class);
  }
  
  public CheckInstructions getCheckInstructions() {
    return getOrCreateProperty("CheckInstructions", "CheckInstructions", null, pcftest.NewPaymentInstructionsDV_single.CheckInstructions.class);
  }
  
  public CheckWizardCheckSummaryInputSet getCheckWizardCheckSummaryInputSet() {
    return getOrCreateProperty("CheckWizardCheckSummaryInputSet", "CheckWizardCheckSummaryInputSet", null, pcftest.CheckWizardCheckSummaryInputSet.class);
  }
  
  public pcftest.NewPaymentInstructionsDV_single.PaymentMethod getPaymentMethod() {
    return getOrCreateProperty("PaymentMethod", "PaymentMethod", null, pcftest.NewPaymentInstructionsDV_single.PaymentMethod.class);
  }
  
  public DateElement getScheduledSendDate() {
    return getOrCreateProperty("ScheduledSendDate", "ScheduledSendDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public ServiceRequestInvoiceInputSet_multiple getServiceRequestInvoiceInputSet_multiple() {
    return getOrCreateProperty("ServiceRequestInvoiceInputSet_multiple", "ServiceRequestInvoiceInputSet", null, pcftest.ServiceRequestInvoiceInputSet_multiple.class);
  }
  
  public ServiceRequestInvoiceInputSet_single getServiceRequestInvoiceInputSet_single() {
    return getOrCreateProperty("ServiceRequestInvoiceInputSet_single", "ServiceRequestInvoiceInputSet", null, pcftest.ServiceRequestInvoiceInputSet_single.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/check/NewPaymentInstructionsDV.single.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CheckBatching extends SelectElement {
    public CheckBatching(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(typekey.CheckBatching arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public typekey.CheckBatching getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.CheckBatching.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(typekey.CheckBatching arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/check/NewPaymentInstructionsDV.single.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CheckInstructions extends SelectElement {
    public CheckInstructions(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(CheckHandlingInstructions arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public CheckHandlingInstructions getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.CheckHandlingInstructions.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(CheckHandlingInstructions arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/check/NewPaymentInstructionsDV.single.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PaymentMethod extends SelectElement {
    public PaymentMethod(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(typekey.PaymentMethod arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public typekey.PaymentMethod getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.PaymentMethod.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(typekey.PaymentMethod arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  
}