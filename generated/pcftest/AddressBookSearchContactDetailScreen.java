package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.AddressBookSearchContactDetailScreen.AddressBookContactActivitiesCardTab;
import pcftest.AddressBookSearchContactDetailScreen.AddressBookContactActivitiesLV_tb;
import pcftest.AddressBookSearchContactDetailScreen.AddressBookContactClaimsCardTab;
import pcftest.AddressBookSearchContactDetailScreen.AddressBookContactClaimsLV_tb;
import pcftest.AddressBookSearchContactDetailScreen.AddressBookContactExposuresCardTab;
import pcftest.AddressBookSearchContactDetailScreen.AddressBookContactExposuresLV_tb;
import pcftest.AddressBookSearchContactDetailScreen.AddressBookContactMattersCardTab;
import pcftest.AddressBookSearchContactDetailScreen.AddressBookContactMattersLV_tb;
import pcftest.AddressBookSearchContactDetailScreen.AddressesPanelSet_tb;
import pcftest.AddressBookSearchContactDetailScreen.ContactAddressesCardTab;
import pcftest.AddressBookSearchContactDetailScreen.ContactBasicsCardTab;
import pcftest.AddressBookSearchContactDetailScreen.ContactBasicsDV_tb;
import pcftest.AddressBookSearchContactDetailScreen.ContactRelatedContactsCardTab;
import pcftest.AddressBookSearchContactDetailScreen.ContactRelatedContactsDV_tb;
import pcftest.AddressBookSearchContactDetailScreen._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/newcheckwizard/AddressBookSearchContactDetailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class AddressBookSearchContactDetailScreen extends PCFElement {
  public final static String CHECKSUM = "32a74dc2c0573ec67c4f187669f93a40";
  
  public AddressBookSearchContactDetailScreen(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public AddressBookContactActivitiesCardTab getAddressBookContactActivitiesCardTab() {
    return getOrCreateProperty("AddressBookContactActivitiesCardTab", "AddressBookContactActivitiesCardTab", null, pcftest.AddressBookSearchContactDetailScreen.AddressBookContactActivitiesCardTab.class);
  }
  
  public AddressBookContactActivitiesLV getAddressBookContactActivitiesLV() {
    return getOrCreateProperty("AddressBookContactActivitiesLV", "AddressBookContactActivitiesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.AddressBookContactActivitiesLV.class);
  }
  
  public AddressBookContactActivitiesLV_tb getAddressBookContactActivitiesLV_tb() {
    return getOrCreateProperty("AddressBookContactActivitiesLV_tb", "AddressBookContactActivitiesLV_tb", null, pcftest.AddressBookSearchContactDetailScreen.AddressBookContactActivitiesLV_tb.class);
  }
  
  public AddressBookContactClaimsCardTab getAddressBookContactClaimsCardTab() {
    return getOrCreateProperty("AddressBookContactClaimsCardTab", "AddressBookContactClaimsCardTab", null, pcftest.AddressBookSearchContactDetailScreen.AddressBookContactClaimsCardTab.class);
  }
  
  public AddressBookContactClaimsLV getAddressBookContactClaimsLV() {
    return getOrCreateProperty("AddressBookContactClaimsLV", "AddressBookContactClaimsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.AddressBookContactClaimsLV.class);
  }
  
  public AddressBookContactClaimsLV_tb getAddressBookContactClaimsLV_tb() {
    return getOrCreateProperty("AddressBookContactClaimsLV_tb", "AddressBookContactClaimsLV_tb", null, pcftest.AddressBookSearchContactDetailScreen.AddressBookContactClaimsLV_tb.class);
  }
  
  public AddressBookContactExposuresCardTab getAddressBookContactExposuresCardTab() {
    return getOrCreateProperty("AddressBookContactExposuresCardTab", "AddressBookContactExposuresCardTab", null, pcftest.AddressBookSearchContactDetailScreen.AddressBookContactExposuresCardTab.class);
  }
  
  public AddressBookContactExposuresLV getAddressBookContactExposuresLV() {
    return getOrCreateProperty("AddressBookContactExposuresLV", "AddressBookContactExposuresLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.AddressBookContactExposuresLV.class);
  }
  
  public AddressBookContactExposuresLV_tb getAddressBookContactExposuresLV_tb() {
    return getOrCreateProperty("AddressBookContactExposuresLV_tb", "AddressBookContactExposuresLV_tb", null, pcftest.AddressBookSearchContactDetailScreen.AddressBookContactExposuresLV_tb.class);
  }
  
  public AddressBookContactMattersCardTab getAddressBookContactMattersCardTab() {
    return getOrCreateProperty("AddressBookContactMattersCardTab", "AddressBookContactMattersCardTab", null, pcftest.AddressBookSearchContactDetailScreen.AddressBookContactMattersCardTab.class);
  }
  
  public AddressBookContactMattersLV getAddressBookContactMattersLV() {
    return getOrCreateProperty("AddressBookContactMattersLV", "AddressBookContactMattersLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.AddressBookContactMattersLV.class);
  }
  
  public AddressBookContactMattersLV_tb getAddressBookContactMattersLV_tb() {
    return getOrCreateProperty("AddressBookContactMattersLV_tb", "AddressBookContactMattersLV_tb", null, pcftest.AddressBookSearchContactDetailScreen.AddressBookContactMattersLV_tb.class);
  }
  
  public AddressesPanelSet getAddressesPanelSet() {
    return getOrCreateProperty("AddressesPanelSet", "AddressesPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.AddressesPanelSet.class);
  }
  
  public AddressesPanelSet_tb getAddressesPanelSet_tb() {
    return getOrCreateProperty("AddressesPanelSet_tb", "AddressesPanelSet_tb", null, pcftest.AddressBookSearchContactDetailScreen.AddressesPanelSet_tb.class);
  }
  
  public ContactAddressesCardTab getContactAddressesCardTab() {
    return getOrCreateProperty("ContactAddressesCardTab", "ContactAddressesCardTab", null, pcftest.AddressBookSearchContactDetailScreen.ContactAddressesCardTab.class);
  }
  
  public ContactBasicsCardTab getContactBasicsCardTab() {
    return getOrCreateProperty("ContactBasicsCardTab", "ContactBasicsCardTab", null, pcftest.AddressBookSearchContactDetailScreen.ContactBasicsCardTab.class);
  }
  
  public ContactBasicsDV_Person getContactBasicsDV_Adjudicator() {
    return getOrCreateProperty("ContactBasicsDV_Adjudicator", "ContactBasicsDV", null, pcftest.ContactBasicsDV_Person.class);
  }
  
  public ContactBasicsDV_Person getContactBasicsDV_Attorney() {
    return getOrCreateProperty("ContactBasicsDV_Attorney", "ContactBasicsDV", null, pcftest.ContactBasicsDV_Person.class);
  }
  
  public ContactBasicsDV_Company getContactBasicsDV_AutoRepairShop() {
    return getOrCreateProperty("ContactBasicsDV_AutoRepairShop", "ContactBasicsDV", null, pcftest.ContactBasicsDV_Company.class);
  }
  
  public ContactBasicsDV_Company getContactBasicsDV_AutoTowingAgcy() {
    return getOrCreateProperty("ContactBasicsDV_AutoTowingAgcy", "ContactBasicsDV", null, pcftest.ContactBasicsDV_Company.class);
  }
  
  public ContactBasicsDV_Company getContactBasicsDV_Company() {
    return getOrCreateProperty("ContactBasicsDV_Company", "ContactBasicsDV", null, pcftest.ContactBasicsDV_Company.class);
  }
  
  public ContactBasicsDV_Company getContactBasicsDV_CompanyVendor() {
    return getOrCreateProperty("ContactBasicsDV_CompanyVendor", "ContactBasicsDV", null, pcftest.ContactBasicsDV_Company.class);
  }
  
  public ContactBasicsDV_Person getContactBasicsDV_Doctor() {
    return getOrCreateProperty("ContactBasicsDV_Doctor", "ContactBasicsDV", null, pcftest.ContactBasicsDV_Person.class);
  }
  
  public ContactBasicsDV_Company getContactBasicsDV_LawFirm() {
    return getOrCreateProperty("ContactBasicsDV_LawFirm", "ContactBasicsDV", null, pcftest.ContactBasicsDV_Company.class);
  }
  
  public ContactBasicsDV_Place getContactBasicsDV_LegalVenue() {
    return getOrCreateProperty("ContactBasicsDV_LegalVenue", "ContactBasicsDV", null, pcftest.ContactBasicsDV_Place.class);
  }
  
  public ContactBasicsDV_Company getContactBasicsDV_MedicalCareOrg() {
    return getOrCreateProperty("ContactBasicsDV_MedicalCareOrg", "ContactBasicsDV", null, pcftest.ContactBasicsDV_Company.class);
  }
  
  public ContactBasicsDV_Person getContactBasicsDV_Person() {
    return getOrCreateProperty("ContactBasicsDV_Person", "ContactBasicsDV", null, pcftest.ContactBasicsDV_Person.class);
  }
  
  public ContactBasicsDV_Person getContactBasicsDV_PersonVendor() {
    return getOrCreateProperty("ContactBasicsDV_PersonVendor", "ContactBasicsDV", null, pcftest.ContactBasicsDV_Person.class);
  }
  
  public ContactBasicsDV_Place getContactBasicsDV_Place() {
    return getOrCreateProperty("ContactBasicsDV_Place", "ContactBasicsDV", null, pcftest.ContactBasicsDV_Place.class);
  }
  
  public ContactBasicsDV_Person getContactBasicsDV_UserContact() {
    return getOrCreateProperty("ContactBasicsDV_UserContact", "ContactBasicsDV", null, pcftest.ContactBasicsDV_Person.class);
  }
  
  public ContactBasicsDV_default getContactBasicsDV_default() {
    return getOrCreateProperty("ContactBasicsDV_default", "ContactBasicsDV", null, pcftest.ContactBasicsDV_default.class);
  }
  
  public ContactBasicsDV_tb getContactBasicsDV_tb() {
    return getOrCreateProperty("ContactBasicsDV_tb", "ContactBasicsDV_tb", null, pcftest.AddressBookSearchContactDetailScreen.ContactBasicsDV_tb.class);
  }
  
  public ContactRelatedContactsCardTab getContactRelatedContactsCardTab() {
    return getOrCreateProperty("ContactRelatedContactsCardTab", "ContactRelatedContactsCardTab", null, pcftest.AddressBookSearchContactDetailScreen.ContactRelatedContactsCardTab.class);
  }
  
  public ContactRelatedContactsDV getContactRelatedContactsDV() {
    return getOrCreateProperty("ContactRelatedContactsDV", "ContactRelatedContactsDV", null, pcftest.ContactRelatedContactsDV.class);
  }
  
  public ContactRelatedContactsDV_tb getContactRelatedContactsDV_tb() {
    return getOrCreateProperty("ContactRelatedContactsDV_tb", "ContactRelatedContactsDV_tb", null, pcftest.AddressBookSearchContactDetailScreen.ContactRelatedContactsDV_tb.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.AddressBookSearchContactDetailScreen._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/newcheckwizard/AddressBookSearchContactDetailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AddressBookContactActivitiesCardTab extends ClickableActionElement {
    public AddressBookContactActivitiesCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/newcheckwizard/AddressBookSearchContactDetailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AddressBookContactActivitiesLV_tb extends PCFElement {
    public AddressBookContactActivitiesLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/newcheckwizard/AddressBookSearchContactDetailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AddressBookContactClaimsCardTab extends ClickableActionElement {
    public AddressBookContactClaimsCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/newcheckwizard/AddressBookSearchContactDetailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AddressBookContactClaimsLV_tb extends PCFElement {
    public AddressBookContactClaimsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/newcheckwizard/AddressBookSearchContactDetailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AddressBookContactExposuresCardTab extends ClickableActionElement {
    public AddressBookContactExposuresCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/newcheckwizard/AddressBookSearchContactDetailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AddressBookContactExposuresLV_tb extends PCFElement {
    public AddressBookContactExposuresLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/newcheckwizard/AddressBookSearchContactDetailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AddressBookContactMattersCardTab extends ClickableActionElement {
    public AddressBookContactMattersCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/newcheckwizard/AddressBookSearchContactDetailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AddressBookContactMattersLV_tb extends PCFElement {
    public AddressBookContactMattersLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/newcheckwizard/AddressBookSearchContactDetailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AddressesPanelSet_tb extends PCFElement {
    public AddressesPanelSet_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public AddressBookSearchContactDetailToolbarButtonSet getAddressBookSearchContactDetailToolbarButtonSet() {
      return getOrCreateProperty("AddressBookSearchContactDetailToolbarButtonSet", "AddressBookSearchContactDetailToolbarButtonSet", null, pcftest.AddressBookSearchContactDetailToolbarButtonSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/newcheckwizard/AddressBookSearchContactDetailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ContactAddressesCardTab extends ClickableActionElement {
    public ContactAddressesCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/newcheckwizard/AddressBookSearchContactDetailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ContactBasicsCardTab extends ClickableActionElement {
    public ContactBasicsCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/newcheckwizard/AddressBookSearchContactDetailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ContactBasicsDV_tb extends PCFElement {
    public ContactBasicsDV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public AddressBookSearchContactDetailToolbarButtonSet getAddressBookSearchContactDetailToolbarButtonSet() {
      return getOrCreateProperty("AddressBookSearchContactDetailToolbarButtonSet", "AddressBookSearchContactDetailToolbarButtonSet", null, pcftest.AddressBookSearchContactDetailToolbarButtonSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/newcheckwizard/AddressBookSearchContactDetailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ContactRelatedContactsCardTab extends ClickableActionElement {
    public ContactRelatedContactsCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/newcheckwizard/AddressBookSearchContactDetailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ContactRelatedContactsDV_tb extends PCFElement {
    public ContactRelatedContactsDV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public AddressBookSearchContactDetailToolbarButtonSet getAddressBookSearchContactDetailToolbarButtonSet() {
      return getOrCreateProperty("AddressBookSearchContactDetailToolbarButtonSet", "AddressBookSearchContactDetailToolbarButtonSet", null, pcftest.AddressBookSearchContactDetailToolbarButtonSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/newcheckwizard/AddressBookSearchContactDetailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}