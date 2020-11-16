package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.NewClaimWizard_PartyInvolvedPopup.NewClaimWizard_PartyInvolvedPopup_UpLink;
import pcftest.NewClaimWizard_PartyInvolvedPopup.NewClaimWizard_PartyInvolvedScreen;
import pcftest.NewClaimWizard_PartyInvolvedPopup.NewClaimWizard_PartyInvolvedScreen.AddressBookContactDocumentsLV_tb;
import pcftest.NewClaimWizard_PartyInvolvedPopup.NewClaimWizard_PartyInvolvedScreen.AddressesPanelSet_tb;
import pcftest.NewClaimWizard_PartyInvolvedPopup.NewClaimWizard_PartyInvolvedScreen.Cancel;
import pcftest.NewClaimWizard_PartyInvolvedPopup.NewClaimWizard_PartyInvolvedScreen.CheckDuplicatesButton;
import pcftest.NewClaimWizard_PartyInvolvedPopup.NewClaimWizard_PartyInvolvedScreen.ContactBasicsDV_tb;
import pcftest.NewClaimWizard_PartyInvolvedPopup.NewClaimWizard_PartyInvolvedScreen.ContactDocumentsCardTab;
import pcftest.NewClaimWizard_PartyInvolvedPopup.NewClaimWizard_PartyInvolvedScreen.ContactRelatedContactsDV_tb;
import pcftest.NewClaimWizard_PartyInvolvedPopup.NewClaimWizard_PartyInvolvedScreen.CustomUpdateButton;
import pcftest.NewClaimWizard_PartyInvolvedPopup.NewClaimWizard_PartyInvolvedScreen.Edit;
import pcftest.NewClaimWizard_PartyInvolvedPopup.NewClaimWizard_PartyInvolvedScreen.NewClaimWizard_PartyInvolvedAddressesCardTab;
import pcftest.NewClaimWizard_PartyInvolvedPopup.NewClaimWizard_PartyInvolvedScreen.NewClaimWizard_PartyInvolvedBasicsCardTab;
import pcftest.NewClaimWizard_PartyInvolvedPopup.NewClaimWizard_PartyInvolvedScreen.NewClaimWizard_PartyInvolvedRelatedContactsCardTab;
import pcftest.NewClaimWizard_PartyInvolvedPopup.NewClaimWizard_PartyInvolvedScreen.Update;
import pcftest.NewClaimWizard_PartyInvolvedPopup.NewClaimWizard_PartyInvolvedScreen._msgs;
import pcftest.NewClaimWizard_PartyInvolvedPopup._Paging;
import pcftest.NewClaimWizard_PartyInvolvedPopup.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_PartyInvolvedPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NewClaimWizard_PartyInvolvedPopup extends PCFLocation {
  public final static String CHECKSUM = "d43dd6e68096fc4a2ec3bb721bf1a30d";
  
  public NewClaimWizard_PartyInvolvedPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("NewClaimWizard_PartyInvolvedPopup"));
  }
  
  public NewClaimWizard_PartyInvolvedPopup_UpLink getNewClaimWizard_PartyInvolvedPopup_UpLink() {
    return getOrCreateProperty("NewClaimWizard_PartyInvolvedPopup_UpLink", "NewClaimWizard_PartyInvolvedPopup_UpLink", null, pcftest.NewClaimWizard_PartyInvolvedPopup.NewClaimWizard_PartyInvolvedPopup_UpLink.class);
  }
  
  public NewClaimWizard_PartyInvolvedScreen getNewClaimWizard_PartyInvolvedScreen() {
    return getOrCreateProperty("NewClaimWizard_PartyInvolvedScreen", "NewClaimWizard_PartyInvolvedScreen", null, pcftest.NewClaimWizard_PartyInvolvedPopup.NewClaimWizard_PartyInvolvedScreen.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.NewClaimWizard_PartyInvolvedPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.NewClaimWizard_PartyInvolvedPopup.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_PartyInvolvedPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewClaimWizard_PartyInvolvedPopup_UpLink extends ClickableActionElement {
    public NewClaimWizard_PartyInvolvedPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_PartyInvolvedPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewClaimWizard_PartyInvolvedScreen extends PCFElement {
    public NewClaimWizard_PartyInvolvedScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public AddressBookContactDocumentsLV getAddressBookContactDocumentsLV() {
      return getOrCreateProperty("AddressBookContactDocumentsLV", "AddressBookContactDocumentsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.AddressBookContactDocumentsLV.class);
    }
    
    public AddressBookContactDocumentsLV_tb getAddressBookContactDocumentsLV_tb() {
      return getOrCreateProperty("AddressBookContactDocumentsLV_tb", "AddressBookContactDocumentsLV_tb", null, pcftest.NewClaimWizard_PartyInvolvedPopup.NewClaimWizard_PartyInvolvedScreen.AddressBookContactDocumentsLV_tb.class);
    }
    
    public AddressesPanelSet getAddressesPanelSet() {
      return getOrCreateProperty("AddressesPanelSet", "AddressesPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.AddressesPanelSet.class);
    }
    
    public AddressesPanelSet_tb getAddressesPanelSet_tb() {
      return getOrCreateProperty("AddressesPanelSet_tb", "AddressesPanelSet_tb", null, pcftest.NewClaimWizard_PartyInvolvedPopup.NewClaimWizard_PartyInvolvedScreen.AddressesPanelSet_tb.class);
    }
    
    public Cancel getCancel() {
      return getOrCreateProperty("Cancel", "Cancel", null, pcftest.NewClaimWizard_PartyInvolvedPopup.NewClaimWizard_PartyInvolvedScreen.Cancel.class);
    }
    
    public CheckDuplicatesButton getCheckDuplicatesButton() {
      return getOrCreateProperty("CheckDuplicatesButton", "CheckDuplicatesButton", null, pcftest.NewClaimWizard_PartyInvolvedPopup.NewClaimWizard_PartyInvolvedScreen.CheckDuplicatesButton.class);
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
      return getOrCreateProperty("ContactBasicsDV_tb", "ContactBasicsDV_tb", null, pcftest.NewClaimWizard_PartyInvolvedPopup.NewClaimWizard_PartyInvolvedScreen.ContactBasicsDV_tb.class);
    }
    
    public ContactDocumentsCardTab getContactDocumentsCardTab() {
      return getOrCreateProperty("ContactDocumentsCardTab", "ContactDocumentsCardTab", null, pcftest.NewClaimWizard_PartyInvolvedPopup.NewClaimWizard_PartyInvolvedScreen.ContactDocumentsCardTab.class);
    }
    
    public ContactRelatedContactsDV getContactRelatedContactsDV() {
      return getOrCreateProperty("ContactRelatedContactsDV", "ContactRelatedContactsDV", null, pcftest.ContactRelatedContactsDV.class);
    }
    
    public ContactRelatedContactsDV_tb getContactRelatedContactsDV_tb() {
      return getOrCreateProperty("ContactRelatedContactsDV_tb", "ContactRelatedContactsDV_tb", null, pcftest.NewClaimWizard_PartyInvolvedPopup.NewClaimWizard_PartyInvolvedScreen.ContactRelatedContactsDV_tb.class);
    }
    
    public CustomUpdateButton getCustomUpdateButton() {
      return getOrCreateProperty("CustomUpdateButton", "CustomUpdateButton", null, pcftest.NewClaimWizard_PartyInvolvedPopup.NewClaimWizard_PartyInvolvedScreen.CustomUpdateButton.class);
    }
    
    public Edit getEdit() {
      return getOrCreateProperty("Edit", "Edit", null, pcftest.NewClaimWizard_PartyInvolvedPopup.NewClaimWizard_PartyInvolvedScreen.Edit.class);
    }
    
    public NewClaimWizard_PartyInvolvedAddressesCardTab getNewClaimWizard_PartyInvolvedAddressesCardTab() {
      return getOrCreateProperty("NewClaimWizard_PartyInvolvedAddressesCardTab", "NewClaimWizard_PartyInvolvedAddressesCardTab", null, pcftest.NewClaimWizard_PartyInvolvedPopup.NewClaimWizard_PartyInvolvedScreen.NewClaimWizard_PartyInvolvedAddressesCardTab.class);
    }
    
    public NewClaimWizard_PartyInvolvedBasicsCardTab getNewClaimWizard_PartyInvolvedBasicsCardTab() {
      return getOrCreateProperty("NewClaimWizard_PartyInvolvedBasicsCardTab", "NewClaimWizard_PartyInvolvedBasicsCardTab", null, pcftest.NewClaimWizard_PartyInvolvedPopup.NewClaimWizard_PartyInvolvedScreen.NewClaimWizard_PartyInvolvedBasicsCardTab.class);
    }
    
    public NewClaimWizard_PartyInvolvedRelatedContactsCardTab getNewClaimWizard_PartyInvolvedRelatedContactsCardTab() {
      return getOrCreateProperty("NewClaimWizard_PartyInvolvedRelatedContactsCardTab", "NewClaimWizard_PartyInvolvedRelatedContactsCardTab", null, pcftest.NewClaimWizard_PartyInvolvedPopup.NewClaimWizard_PartyInvolvedScreen.NewClaimWizard_PartyInvolvedRelatedContactsCardTab.class);
    }
    
    public Update getUpdate() {
      return getOrCreateProperty("Update", "Update", null, pcftest.NewClaimWizard_PartyInvolvedPopup.NewClaimWizard_PartyInvolvedScreen.Update.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.NewClaimWizard_PartyInvolvedPopup.NewClaimWizard_PartyInvolvedScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_PartyInvolvedPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class AddressBookContactDocumentsLV_tb extends PCFElement {
      public AddressBookContactDocumentsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_PartyInvolvedPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class AddressesPanelSet_tb extends PCFElement {
      public AddressesPanelSet_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_PartyInvolvedPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Cancel extends ClickableActionElement {
      public Cancel(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_PartyInvolvedPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CheckDuplicatesButton extends ClickableActionElement {
      public CheckDuplicatesButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_PartyInvolvedPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ContactBasicsDV_tb extends PCFElement {
      public ContactBasicsDV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_PartyInvolvedPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ContactDocumentsCardTab extends ClickableActionElement {
      public ContactDocumentsCardTab(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_PartyInvolvedPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ContactRelatedContactsDV_tb extends PCFElement {
      public ContactRelatedContactsDV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_PartyInvolvedPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CustomUpdateButton extends ClickableActionElement {
      public CustomUpdateButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_PartyInvolvedPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Edit extends ClickableActionElement {
      public Edit(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_PartyInvolvedPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class NewClaimWizard_PartyInvolvedAddressesCardTab extends ClickableActionElement {
      public NewClaimWizard_PartyInvolvedAddressesCardTab(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_PartyInvolvedPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class NewClaimWizard_PartyInvolvedBasicsCardTab extends ClickableActionElement {
      public NewClaimWizard_PartyInvolvedBasicsCardTab(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_PartyInvolvedPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class NewClaimWizard_PartyInvolvedRelatedContactsCardTab extends ClickableActionElement {
      public NewClaimWizard_PartyInvolvedRelatedContactsCardTab(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_PartyInvolvedPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Update extends ClickableActionElement {
      public Update(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_PartyInvolvedPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _msgs extends MessagesElement {
      public _msgs(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_PartyInvolvedPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_PartyInvolvedPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}