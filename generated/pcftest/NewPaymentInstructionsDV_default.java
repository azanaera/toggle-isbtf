package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.SelectElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.NewPaymentInstructionsDV_default.CheckInstructions;
import typekey.CheckHandlingInstructions;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/newtransaction/check/NewPaymentInstructionsDV.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NewPaymentInstructionsDV_default extends NewPaymentInstructionsDV {
  public final static String CHECKSUM = "c91b8f187d49390fbd97a6165e5272c9";
  
  public NewPaymentInstructionsDV_default(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public pcftest.NewPaymentInstructionsDV_default.CheckBatching getCheckBatching() {
    return getOrCreateProperty("CheckBatching", "CheckBatching", null, pcftest.NewPaymentInstructionsDV_default.CheckBatching.class);
  }
  
  public CheckInstructions getCheckInstructions() {
    return getOrCreateProperty("CheckInstructions", "CheckInstructions", null, pcftest.NewPaymentInstructionsDV_default.CheckInstructions.class);
  }
  
  public CheckRecurrenceInputSet getCheckRecurrenceInputSet() {
    return getOrCreateProperty("CheckRecurrenceInputSet", "CheckRecurrenceInputSet", null, pcftest.CheckRecurrenceInputSet.class);
  }
  
  public CheckWizardCheckSummaryInputSet getCheckWizardCheckSummaryInputSet() {
    return getOrCreateProperty("CheckWizardCheckSummaryInputSet", "CheckWizardCheckSummaryInputSet", null, pcftest.CheckWizardCheckSummaryInputSet.class);
  }
  
  public pcftest.NewPaymentInstructionsDV_default.PaymentMethod getPaymentMethod() {
    return getOrCreateProperty("PaymentMethod", "PaymentMethod", null, pcftest.NewPaymentInstructionsDV_default.PaymentMethod.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/check/NewPaymentInstructionsDV.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/newtransaction/check/NewPaymentInstructionsDV.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/newtransaction/check/NewPaymentInstructionsDV.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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