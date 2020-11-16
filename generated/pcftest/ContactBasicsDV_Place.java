package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ContactBasicsDV_Place.OrganizationName;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/shared/contacts/ContactBasicsDV.Place.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ContactBasicsDV_Place extends ContactBasicsDV {
  public final static String CHECKSUM = "be7f38d9682da4cd7e1ea44b704f68df";
  
  public ContactBasicsDV_Place(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public BusinessContactInfoInputSet getBusinessContactInfoInputSet() {
    return getOrCreateProperty("BusinessContactInfoInputSet", "BusinessContactInfoInputSet", null, pcftest.BusinessContactInfoInputSet.class);
  }
  
  public ContactBasicsHeaderInputSet getContactBasicsHeaderInputSet() {
    return getOrCreateProperty("ContactBasicsHeaderInputSet", "ContactBasicsHeaderInputSet", null, pcftest.ContactBasicsHeaderInputSet.class);
  }
  
  public pcftest.ContactBasicsDV_Place.Currency getCurrency() {
    return getOrCreateProperty("Currency", "Currency", null, pcftest.ContactBasicsDV_Place.Currency.class);
  }
  
  public ValueElement getNotes() {
    return getOrCreateProperty("Notes", "Notes", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public OrganizationName getOrganizationName() {
    return getOrCreateProperty("OrganizationName", "OrganizationName", null, pcftest.ContactBasicsDV_Place.OrganizationName.class);
  }
  
  public PrimaryAddressInputSet getPrimaryAddressInputSet() {
    return getOrCreateProperty("PrimaryAddressInputSet", "PrimaryAddressInputSet", null, pcftest.PrimaryAddressInputSet.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/contacts/ContactBasicsDV.Place.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/shared/contacts/ContactBasicsDV.Place.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class OrganizationName extends PCFElement {
    public OrganizationName(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public GlobalContactNameInputSet_Japan getGlobalContactNameInputSet_Japan() {
      return getOrCreateProperty("GlobalContactNameInputSet_Japan", "GlobalContactNameInputSet", null, pcftest.GlobalContactNameInputSet_Japan.class);
    }
    
    public GlobalContactNameInputSet_default getGlobalContactNameInputSet_default() {
      return getOrCreateProperty("GlobalContactNameInputSet_default", "GlobalContactNameInputSet", null, pcftest.GlobalContactNameInputSet_default.class);
    }
    
    
  }
  
  
}