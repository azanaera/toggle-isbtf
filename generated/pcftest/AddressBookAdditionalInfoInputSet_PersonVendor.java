package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.AddressBookAdditionalInfoInputSet_PersonVendor.IsVendorAvailable_Ext;
import typekey.VendorAvailabilityType_Ext;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/addressbook/AddressBookAdditionalInfoInputSet.PersonVendor.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class AddressBookAdditionalInfoInputSet_PersonVendor extends AddressBookAdditionalInfoInputSet {
  public final static String CHECKSUM = "9ed64e59e205ecf111ddafde846aba82";
  
  public AddressBookAdditionalInfoInputSet_PersonVendor(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public AddressBookAttorneyAdditionalInfoInputSet_Attorney getAddressBookAttorneyAdditionalInfoInputSet_Attorney() {
    return getOrCreateProperty("AddressBookAttorneyAdditionalInfoInputSet_Attorney", "AddressBookAttorneyAdditionalInfoInputSet", null, pcftest.AddressBookAttorneyAdditionalInfoInputSet_Attorney.class);
  }
  
  public AddressBookBusinessContactInfoInputSet getAddressBookBusinessContactInfoInputSet() {
    return getOrCreateProperty("AddressBookBusinessContactInfoInputSet", "AddressBookBusinessContactInfoInputSet", null, pcftest.AddressBookBusinessContactInfoInputSet.class);
  }
  
  public AddressBookDoctorAdditionalInfoInputSet_Doctor getAddressBookDoctorAdditionalInfoInputSet_Doctor() {
    return getOrCreateProperty("AddressBookDoctorAdditionalInfoInputSet_Doctor", "AddressBookDoctorAdditionalInfoInputSet", null, pcftest.AddressBookDoctorAdditionalInfoInputSet_Doctor.class);
  }
  
  public AddressBookVendorW9InfoInputSet getAddressBookVendorW9InfoInputSet() {
    return getOrCreateProperty("AddressBookVendorW9InfoInputSet", "AddressBookVendorW9InfoInputSet", null, pcftest.AddressBookVendorW9InfoInputSet.class);
  }
  
  public BooleanValueElement getBackupwithholding_Ext() {
    return getOrCreateProperty("Backupwithholding_Ext", "Backupwithholding_Ext", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public pcftest.AddressBookAdditionalInfoInputSet_PersonVendor.Currency getCurrency() {
    return getOrCreateProperty("Currency", "Currency", null, pcftest.AddressBookAdditionalInfoInputSet_PersonVendor.Currency.class);
  }
  
  public BooleanValueElement getIsPreferredVendor() {
    return getOrCreateProperty("IsPreferredVendor", "IsPreferredVendor", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public IsVendorAvailable_Ext getIsVendorAvailable_Ext() {
    return getOrCreateProperty("IsVendorAvailable_Ext", "IsVendorAvailable_Ext", null, pcftest.AddressBookAdditionalInfoInputSet_PersonVendor.IsVendorAvailable_Ext.class);
  }
  
  public ValueElement getSSN() {
    return getOrCreateProperty("SSN", "SSN", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getVendorID_Ext() {
    return getOrCreateProperty("VendorID_Ext", "VendorID_Ext", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/addressbook/AddressBookAdditionalInfoInputSet.PersonVendor.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/addressbook/AddressBookAdditionalInfoInputSet.PersonVendor.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IsVendorAvailable_Ext extends SelectElement {
    public IsVendorAvailable_Ext(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(VendorAvailabilityType_Ext arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public VendorAvailabilityType_Ext getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.VendorAvailabilityType_Ext.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(VendorAvailabilityType_Ext arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  
}