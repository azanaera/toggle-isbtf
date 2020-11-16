package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/shared/contacts/AdditionalInfoInputSet.UserContact.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class AdditionalInfoInputSet_UserContact extends AdditionalInfoInputSet {
  public final static String CHECKSUM = "f1f53a4d6c490d0a69acc34d2c6377cd";
  
  public AdditionalInfoInputSet_UserContact(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public pcftest.AdditionalInfoInputSet_UserContact.Currency getCurrency() {
    return getOrCreateProperty("Currency", "Currency", null, pcftest.AdditionalInfoInputSet_UserContact.Currency.class);
  }
  
  public ValueElement getEmployeeNumber() {
    return getOrCreateProperty("EmployeeNumber", "EmployeeNumber", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/contacts/AdditionalInfoInputSet.UserContact.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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