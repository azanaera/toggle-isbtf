package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/addressbook/AddressBookAdditionalInfoInputSet.UserContact.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class AddressBookAdditionalInfoInputSet_UserContact extends AddressBookAdditionalInfoInputSet {
  public final static String CHECKSUM = "4d01fab7d555addf7abc457f27a3ac40";
  
  public AddressBookAdditionalInfoInputSet_UserContact(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public pcftest.AddressBookAdditionalInfoInputSet_UserContact.Currency getCurrency() {
    return getOrCreateProperty("Currency", "Currency", null, pcftest.AddressBookAdditionalInfoInputSet_UserContact.Currency.class);
  }
  
  public ValueElement getEmployeeNumber() {
    return getOrCreateProperty("EmployeeNumber", "EmployeeNumber", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/addressbook/AddressBookAdditionalInfoInputSet.UserContact.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Currency extends SelectElement {
    public Currency(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(typekey.Currency arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public typekey.Currency getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.Currency.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(typekey.Currency arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  
}