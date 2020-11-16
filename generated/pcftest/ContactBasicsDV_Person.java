package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ContactBasicsDV_Person.ContactEFTLV_tb;
import pcftest.ContactBasicsDV_Person.ContactEFTLV_tb.Add;
import pcftest.ContactBasicsDV_Person.ContactEFTLV_tb.Remove;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/shared/contacts/ContactBasicsDV.Person.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ContactBasicsDV_Person extends ContactBasicsDV {
  public final static String CHECKSUM = "4e6a2d794889124ddb18cd98cbc829d2";
  
  public ContactBasicsDV_Person(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public AdditionalInfoInputSet_Adjudicator getAdditionalInfoInputSet_Adjudicator() {
    return getOrCreateProperty("AdditionalInfoInputSet_Adjudicator", "AdditionalInfoInputSet", null, pcftest.AdditionalInfoInputSet_Adjudicator.class);
  }
  
  public AdditionalInfoInputSet_PersonVendor getAdditionalInfoInputSet_Attorney() {
    return getOrCreateProperty("AdditionalInfoInputSet_Attorney", "AdditionalInfoInputSet", null, pcftest.AdditionalInfoInputSet_PersonVendor.class);
  }
  
  public AdditionalInfoInputSet_PersonVendor getAdditionalInfoInputSet_Doctor() {
    return getOrCreateProperty("AdditionalInfoInputSet_Doctor", "AdditionalInfoInputSet", null, pcftest.AdditionalInfoInputSet_PersonVendor.class);
  }
  
  public AdditionalInfoInputSet_Person getAdditionalInfoInputSet_Person() {
    return getOrCreateProperty("AdditionalInfoInputSet_Person", "AdditionalInfoInputSet", null, pcftest.AdditionalInfoInputSet_Person.class);
  }
  
  public AdditionalInfoInputSet_PersonVendor getAdditionalInfoInputSet_PersonVendor() {
    return getOrCreateProperty("AdditionalInfoInputSet_PersonVendor", "AdditionalInfoInputSet", null, pcftest.AdditionalInfoInputSet_PersonVendor.class);
  }
  
  public AdditionalInfoInputSet_UserContact getAdditionalInfoInputSet_UserContact() {
    return getOrCreateProperty("AdditionalInfoInputSet_UserContact", "AdditionalInfoInputSet", null, pcftest.AdditionalInfoInputSet_UserContact.class);
  }
  
  public ContactBasicsHeaderInputSet getContactBasicsHeaderInputSet() {
    return getOrCreateProperty("ContactBasicsHeaderInputSet", "ContactBasicsHeaderInputSet", null, pcftest.ContactBasicsHeaderInputSet.class);
  }
  
  public ContactEFTLV getContactEFTLV() {
    return getOrCreateProperty("ContactEFTLV", "ContactEFTLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ContactEFTLV.class);
  }
  
  public ContactEFTLV_tb getContactEFTLV_tb() {
    return getOrCreateProperty("ContactEFTLV_tb", "ContactEFTLV_tb", null, pcftest.ContactBasicsDV_Person.ContactEFTLV_tb.class);
  }
  
  public DriversLicenseInfoInputSet getDriversLicenseInfoInputSet() {
    return getOrCreateProperty("DriversLicenseInfoInputSet", "DriversLicenseInfoInputSet", null, pcftest.DriversLicenseInfoInputSet.class);
  }
  
  public ValueElement getNotes() {
    return getOrCreateProperty("Notes", "Notes", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public PersonContactInfoInputSet getPersonContactInfoInputSet() {
    return getOrCreateProperty("PersonContactInfoInputSet", "PersonContactInfoInputSet", null, pcftest.PersonContactInfoInputSet.class);
  }
  
  public PersonNameInputSet getPersonNameInputSet() {
    return getOrCreateProperty("PersonNameInputSet", "PersonNameInputSet", null, pcftest.PersonNameInputSet.class);
  }
  
  public PrimaryAddressInputSet getPrimaryAddressInputSet() {
    return getOrCreateProperty("PrimaryAddressInputSet", "PrimaryAddressInputSet", null, pcftest.PrimaryAddressInputSet.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/contacts/ContactBasicsDV.Person.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ContactEFTLV_tb extends PCFElement {
    public ContactEFTLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.ContactBasicsDV_Person.ContactEFTLV_tb.Add.class);
    }
    
    public Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.ContactBasicsDV_Person.ContactEFTLV_tb.Remove.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/contacts/ContactBasicsDV.Person.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/contacts/ContactBasicsDV.Person.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Remove extends ClickableActionElement {
      public Remove(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  
}