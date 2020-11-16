package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.FNOLWizardCheckDV_ready.EFTDataInputSet;
import pcftest.FNOLWizardCheckDV_ready.MailingAddressInputSet;
import pcftest.FNOLWizardCheckDV_ready.Payee_Picker;
import pcftest.FNOLWizardCheckDV_ready.Payee_Picker.MenuItem_Search;
import pcftest.FNOLWizardCheckDV_ready.Payee_Picker.MenuItem_ViewDetails;
import pcftest.FNOLWizardCheckDV_ready.Payment_Currency;
import typekey.Currency;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizardCheckDV.ready.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class FNOLWizardCheckDV_ready extends FNOLWizardCheckDV {
  public final static String CHECKSUM = "495ed19439ae2e770e9700af21d196c5";
  
  public FNOLWizardCheckDV_ready(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public BooleanValueElement getApplyDeductible() {
    return getOrCreateProperty("ApplyDeductible", "ApplyDeductible", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public ValueElement getCheckAmount() {
    return getOrCreateProperty("CheckAmount", "CheckAmount", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getCheckInvoiceNumber() {
    return getOrCreateProperty("CheckInvoiceNumber", "CheckInvoiceNumber", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getCheckMailTo() {
    return getOrCreateProperty("CheckMailTo", "CheckMailTo", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getCheckMailToAddr() {
    return getOrCreateProperty("CheckMailToAddr", "CheckMailToAddr", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getCheckTotalAmount() {
    return getOrCreateProperty("CheckTotalAmount", "CheckTotalAmount", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getDecuctibleAppliedAmount() {
    return getOrCreateProperty("DecuctibleAppliedAmount", "DecuctibleAppliedAmount", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public pcftest.FNOLWizardCheckDV_ready.DeliveryMethod getDeliveryMethod() {
    return getOrCreateProperty("DeliveryMethod", "DeliveryMethod", null, pcftest.FNOLWizardCheckDV_ready.DeliveryMethod.class);
  }
  
  public EFTDataInputSet getEFTDataInputSet() {
    return getOrCreateProperty("EFTDataInputSet", "EFTDataInputSet", null, pcftest.FNOLWizardCheckDV_ready.EFTDataInputSet.class);
  }
  
  public MailingAddressInputSet getMailingAddressInputSet() {
    return getOrCreateProperty("MailingAddressInputSet", "MailingAddressInputSet", null, pcftest.FNOLWizardCheckDV_ready.MailingAddressInputSet.class);
  }
  
  public SelectElement getPayeeRole() {
    return getOrCreateProperty("PayeeRole", "PayeeRole", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public Payee_Picker getPayee_Picker() {
    return getOrCreateProperty("Payee_Picker", "Payee_Picker", null, pcftest.FNOLWizardCheckDV_ready.Payee_Picker.class);
  }
  
  public pcftest.FNOLWizardCheckDV_ready.PaymentMethod getPaymentMethod() {
    return getOrCreateProperty("PaymentMethod", "PaymentMethod", null, pcftest.FNOLWizardCheckDV_ready.PaymentMethod.class);
  }
  
  public Payment_Currency getPayment_Currency() {
    return getOrCreateProperty("Payment_Currency", "Payment_Currency", null, pcftest.FNOLWizardCheckDV_ready.Payment_Currency.class);
  }
  
  public ValueElement getPayment_ExchangeRate() {
    return getOrCreateProperty("Payment_ExchangeRate", "Payment_ExchangeRate", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public BooleanValueElement getPayment_ExchangeRateOverride() {
    return getOrCreateProperty("Payment_ExchangeRateOverride", "Payment_ExchangeRateOverride", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public ValueElement getPayment_RateSet_Description() {
    return getOrCreateProperty("Payment_RateSet_Description", "Payment_RateSet_Description", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public DateElement getRateSet_Date() {
    return getOrCreateProperty("RateSet_Date", "RateSet_Date", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public DateElement getScheduledDeliveryDate() {
    return getOrCreateProperty("ScheduledDeliveryDate", "ScheduledDeliveryDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizardCheckDV.ready.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DeliveryMethod extends SelectElement {
    public DeliveryMethod(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(typekey.DeliveryMethod arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public typekey.DeliveryMethod getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.DeliveryMethod.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(typekey.DeliveryMethod arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizardCheckDV.ready.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EFTDataInputSet extends PCFElement {
    public EFTDataInputSet(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getBankAccountNumber() {
      return getOrCreateProperty("BankAccountNumber", "BankAccountNumber", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public SelectElement getBankAccountType() {
      return getOrCreateProperty("BankAccountType", "BankAccountType", null, gw.smoketest.platform.web.SelectElement.class);
    }
    
    public ValueElement getBankName() {
      return getOrCreateProperty("BankName", "BankName", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getBankRoutingNumber() {
      return getOrCreateProperty("BankRoutingNumber", "BankRoutingNumber", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public SelectElement getEFTRecords() {
      return getOrCreateProperty("EFTRecords", "EFTRecords", null, gw.smoketest.platform.web.SelectElement.class);
    }
    
    public ValueElement getPayTo() {
      return getOrCreateProperty("PayTo", "PayTo", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizardCheckDV.ready.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MailingAddressInputSet extends PCFElement {
    public MailingAddressInputSet(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public CCAddressInputSet getCCAddressInputSet() {
      return getOrCreateProperty("CCAddressInputSet", "CCAddressInputSet", null, pcftest.CCAddressInputSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/widgets/ClaimContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Payee_Picker extends SelectElement {
    public Payee_Picker(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimContactDetailPopup click() {
      return clickThis(pcftest.ClaimContactDetailPopup.class);
    }
    
    public ClaimNewContactPickerMenuItemSet getClaimNewContactPickerMenuItemSet() {
      return getOrCreateProperty("ClaimNewContactPickerMenuItemSet", "ClaimNewContactPickerMenuItemSet", null, pcftest.ClaimNewContactPickerMenuItemSet.class);
    }
    
    public MenuItem_Search getMenuItem_Search() {
      return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.FNOLWizardCheckDV_ready.Payee_Picker.MenuItem_Search.class);
    }
    
    public MenuItem_ViewDetails getMenuItem_ViewDetails() {
      return getOrCreateProperty("MenuItem_ViewDetails", "MenuItem_ViewDetails", null, pcftest.FNOLWizardCheckDV_ready.Payee_Picker.MenuItem_ViewDetails.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/widgets/ClaimContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class MenuItem_Search extends ClickableActionElement {
      public MenuItem_Search(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public AddressBookPickerPopup click() {
        return clickThis(pcftest.AddressBookPickerPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/widgets/ClaimContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class MenuItem_ViewDetails extends ClickableActionElement {
      public MenuItem_ViewDetails(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizardCheckDV.ready.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizardCheckDV.ready.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Payment_Currency extends SelectElement {
    public Payment_Currency(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(Currency arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public Currency getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.Currency.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(Currency arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  
}