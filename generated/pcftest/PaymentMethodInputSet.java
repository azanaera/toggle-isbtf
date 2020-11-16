package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.CheckboxValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.PaymentMethodInputSet.MailingAddressInput;
import pcftest.PaymentMethodInputSet.Payee;
import pcftest.PaymentMethodInputSet.Payee.MenuItem_NoneSelected;
import pcftest.PaymentMethodInputSet.Payee.MenuItem_Search;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/financials/checks/PaymentMethodInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class PaymentMethodInputSet extends PCFElement {
  public final static String CHECKSUM = "36d63270e168ff3710b520816120c27f";
  
  public PaymentMethodInputSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getAccountName() {
    return getOrCreateProperty("AccountName", "AccountName", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getBankAccountNumber() {
    return getOrCreateProperty("BankAccountNumber", "BankAccountNumber", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public pcftest.PaymentMethodInputSet.BankAccountType getBankAccountType() {
    return getOrCreateProperty("BankAccountType", "BankAccountType", null, pcftest.PaymentMethodInputSet.BankAccountType.class);
  }
  
  public ValueElement getBankName() {
    return getOrCreateProperty("BankName", "BankName", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getBankRoutingNumber() {
    return getOrCreateProperty("BankRoutingNumber", "BankRoutingNumber", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getCheckNumber() {
    return getOrCreateProperty("CheckNumber", "CheckNumber", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public SelectElement getContactEFTData() {
    return getOrCreateProperty("ContactEFTData", "ContactEFTData", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public pcftest.PaymentMethodInputSet.DeliveryMethod getDeliveryMethod() {
    return getOrCreateProperty("DeliveryMethod", "DeliveryMethod", null, pcftest.PaymentMethodInputSet.DeliveryMethod.class);
  }
  
  public ValueElement getMailTo() {
    return getOrCreateProperty("MailTo", "MailTo", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getMailingAddress() {
    return getOrCreateProperty("MailingAddress", "MailingAddress", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public MailingAddressInput getMailingAddressInput() {
    return getOrCreateProperty("MailingAddressInput", "MailingAddressInput", null, pcftest.PaymentMethodInputSet.MailingAddressInput.class);
  }
  
  public ValueElement getOldMailingAddress() {
    return getOrCreateProperty("OldMailingAddress", "OldMailingAddress", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getPayTo() {
    return getOrCreateProperty("PayTo", "PayTo", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Payee getPayee() {
    return getOrCreateProperty("Payee", "Payee", null, pcftest.PaymentMethodInputSet.Payee.class);
  }
  
  public pcftest.PaymentMethodInputSet.PaymentMethod getPaymentMethod() {
    return getOrCreateProperty("PaymentMethod", "PaymentMethod", null, pcftest.PaymentMethodInputSet.PaymentMethod.class);
  }
  
  public CheckboxValueElement getToggleAddressEdit() {
    return getOrCreateProperty("ToggleAddressEdit", "ToggleAddressEdit", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/checks/PaymentMethodInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class BankAccountType extends SelectElement {
    public BankAccountType(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(typekey.BankAccountType arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public typekey.BankAccountType getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.BankAccountType.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(typekey.BankAccountType arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/checks/PaymentMethodInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/financials/checks/PaymentMethodInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MailingAddressInput extends PCFElement {
    public MailingAddressInput(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public CCAddressInputSet getCCAddressInputSet() {
      return getOrCreateProperty("CCAddressInputSet", "CCAddressInputSet", null, pcftest.CCAddressInputSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/widgets/AddressBookContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Payee extends ValueElement {
    public Payee(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public AddressBookContactDetailPopup click() {
      return clickThis(pcftest.AddressBookContactDetailPopup.class);
    }
    
    public MenuItem_NoneSelected getMenuItem_NoneSelected() {
      return getOrCreateProperty("MenuItem_NoneSelected", "MenuItem_NoneSelected", null, pcftest.PaymentMethodInputSet.Payee.MenuItem_NoneSelected.class);
    }
    
    public MenuItem_Search getMenuItem_Search() {
      return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.PaymentMethodInputSet.Payee.MenuItem_Search.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/widgets/AddressBookContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class MenuItem_NoneSelected extends ClickableActionElement {
      public MenuItem_NoneSelected(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/widgets/AddressBookContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class MenuItem_Search extends ClickableActionElement {
      public MenuItem_Search(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public AddressBookPickerPopup click() {
        return clickThis(pcftest.AddressBookPickerPopup.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/checks/PaymentMethodInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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