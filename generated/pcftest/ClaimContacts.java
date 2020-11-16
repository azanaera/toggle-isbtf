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
import pcftest.ClaimContacts.ClaimContactsScreen;
import pcftest.ClaimContacts.ClaimContactsScreen.PeopleInvolvedDetailedListDetail;
import pcftest.ClaimContacts.ClaimContactsScreen.PeopleInvolvedDetailedListDetail.AddressBookContactDocumentsLV_tb;
import pcftest.ClaimContacts.ClaimContactsScreen.PeopleInvolvedDetailedListDetail.AddressesCardTab;
import pcftest.ClaimContacts.ClaimContactsScreen.PeopleInvolvedDetailedListDetail.AddressesPanelSet_tb;
import pcftest.ClaimContacts.ClaimContactsScreen.PeopleInvolvedDetailedListDetail.BasicsCardTab;
import pcftest.ClaimContacts.ClaimContactsScreen.PeopleInvolvedDetailedListDetail.ClaimContactRelatedContactsLV_tb;
import pcftest.ClaimContacts.ClaimContactsScreen.PeopleInvolvedDetailedListDetail.ClaimContactRelatedContactsLV_tb.Add;
import pcftest.ClaimContacts.ClaimContactsScreen.PeopleInvolvedDetailedListDetail.ClaimContactRelatedContactsLV_tb.Remove;
import pcftest.ClaimContacts.ClaimContactsScreen.PeopleInvolvedDetailedListDetail.ContactBasicsDV_tb;
import pcftest.ClaimContacts.ClaimContactsScreen.PeopleInvolvedDetailedListDetail.ContactBasicsDV_tb.ContactBasicsHeaderInputSet_TransferRolesButton;
import pcftest.ClaimContacts.ClaimContactsScreen.PeopleInvolvedDetailedListDetail.ContactDocumentsCardTab;
import pcftest.ClaimContacts.ClaimContactsScreen.PeopleInvolvedDetailedListDetail.PeopleInvolvedDetailedLV_tb;
import pcftest.ClaimContacts.ClaimContactsScreen.PeopleInvolvedDetailedListDetail.PeopleInvolvedDetailedLV_tb.ClaimContacts_AddExistingButton;
import pcftest.ClaimContacts.ClaimContactsScreen.PeopleInvolvedDetailedListDetail.PeopleInvolvedDetailedLV_tb.ClaimContacts_CreateNewContactButton;
import pcftest.ClaimContacts.ClaimContactsScreen.PeopleInvolvedDetailedListDetail.PeopleInvolvedDetailedLV_tb.ClaimContacts_CreateNewContactButton.ClaimContacts_Company;
import pcftest.ClaimContacts.ClaimContactsScreen.PeopleInvolvedDetailedListDetail.PeopleInvolvedDetailedLV_tb.ClaimContacts_CreateNewContactButton.ClaimContacts_NewLegal;
import pcftest.ClaimContacts.ClaimContactsScreen.PeopleInvolvedDetailedListDetail.PeopleInvolvedDetailedLV_tb.ClaimContacts_CreateNewContactButton.ClaimContacts_NewLegal.ClaimContacts_Adjudicator;
import pcftest.ClaimContacts.ClaimContactsScreen.PeopleInvolvedDetailedListDetail.PeopleInvolvedDetailedLV_tb.ClaimContacts_CreateNewContactButton.ClaimContacts_NewLegal.ClaimContacts_Attorney;
import pcftest.ClaimContacts.ClaimContactsScreen.PeopleInvolvedDetailedListDetail.PeopleInvolvedDetailedLV_tb.ClaimContacts_CreateNewContactButton.ClaimContacts_NewLegal.ClaimContacts_LawFirm;
import pcftest.ClaimContacts.ClaimContactsScreen.PeopleInvolvedDetailedListDetail.PeopleInvolvedDetailedLV_tb.ClaimContacts_CreateNewContactButton.ClaimContacts_NewLegal.ClaimContacts_LegalVenue;
import pcftest.ClaimContacts.ClaimContactsScreen.PeopleInvolvedDetailedListDetail.PeopleInvolvedDetailedLV_tb.ClaimContacts_CreateNewContactButton.ClaimContacts_NewPerson;
import pcftest.ClaimContacts.ClaimContactsScreen.PeopleInvolvedDetailedListDetail.PeopleInvolvedDetailedLV_tb.ClaimContacts_CreateNewContactButton.ClaimContacts_NewPersonVendor_Ext;
import pcftest.ClaimContacts.ClaimContactsScreen.PeopleInvolvedDetailedListDetail.PeopleInvolvedDetailedLV_tb.ClaimContacts_CreateNewContactButton.ClaimContacts_NewVendor;
import pcftest.ClaimContacts.ClaimContactsScreen.PeopleInvolvedDetailedListDetail.PeopleInvolvedDetailedLV_tb.ClaimContacts_CreateNewContactButton.ClaimContacts_NewVendor.ClaimContacts_AutoRepairShop;
import pcftest.ClaimContacts.ClaimContactsScreen.PeopleInvolvedDetailedListDetail.PeopleInvolvedDetailedLV_tb.ClaimContacts_CreateNewContactButton.ClaimContacts_NewVendor.ClaimContacts_AutoTowingAgcy;
import pcftest.ClaimContacts.ClaimContactsScreen.PeopleInvolvedDetailedListDetail.PeopleInvolvedDetailedLV_tb.ClaimContacts_CreateNewContactButton.ClaimContacts_NewVendor.ClaimContacts_CompanyVendor;
import pcftest.ClaimContacts.ClaimContactsScreen.PeopleInvolvedDetailedListDetail.PeopleInvolvedDetailedLV_tb.ClaimContacts_CreateNewContactButton.ClaimContacts_NewVendor.ClaimContacts_Doctor;
import pcftest.ClaimContacts.ClaimContactsScreen.PeopleInvolvedDetailedListDetail.PeopleInvolvedDetailedLV_tb.ClaimContacts_CreateNewContactButton.ClaimContacts_NewVendor.ClaimContacts_MedicalCareOrg;
import pcftest.ClaimContacts.ClaimContactsScreen.PeopleInvolvedDetailedListDetail.PeopleInvolvedDetailedLV_tb.ClaimContacts_DeleteButton;
import pcftest.ClaimContacts.ClaimContactsScreen.PeopleInvolvedDetailedListDetail.RelatedContactsCardTab;
import pcftest.ClaimContacts.ClaimContactsScreen.PeopleInvolvedDetailedListDetail.ReviewsCardTab;
import pcftest.ClaimContacts.ClaimContactsScreen.PeopleInvolvedDetailedListDetail.ReviewsPanelSet_tb;
import pcftest.ClaimContacts.ClaimContactsScreen._msgs;
import pcftest.ClaimContacts.ClaimContacts_UpLink;
import pcftest.ClaimContacts._Paging;
import pcftest.ClaimContacts.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/partiesinvolved/ClaimContacts.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimContacts extends PCFLocation {
  public final static String CHECKSUM = "0b2460ca40d5ac42b7aacdfdd3747439";
  
  public ClaimContacts(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ClaimContacts"));
  }
  
  public ClaimContactsScreen getClaimContactsScreen() {
    return getOrCreateProperty("ClaimContactsScreen", "ClaimContactsScreen", null, pcftest.ClaimContacts.ClaimContactsScreen.class);
  }
  
  public ClaimContacts_UpLink getClaimContacts_UpLink() {
    return getOrCreateProperty("ClaimContacts_UpLink", "ClaimContacts_UpLink", null, pcftest.ClaimContacts.ClaimContacts_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ClaimContacts._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ClaimContacts.__crumb__.class);
  }
  
  public ClaimPartiesGroup get_parent() {
    return getOrCreateProperty("_parent", pcftest.ClaimPartiesGroup.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/partiesinvolved/ClaimContacts.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimContactsScreen extends PCFElement {
    public ClaimContactsScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PeopleInvolvedDetailedListDetail getPeopleInvolvedDetailedListDetail() {
      return getOrCreateProperty("PeopleInvolvedDetailedListDetail", "PeopleInvolvedDetailedListDetail", null, pcftest.ClaimContacts.ClaimContactsScreen.PeopleInvolvedDetailedListDetail.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ClaimContacts.ClaimContactsScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/partiesinvolved/ClaimContacts.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class PeopleInvolvedDetailedListDetail extends PCFElement {
      public PeopleInvolvedDetailedListDetail(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public AddressBookContactDocumentsLV getAddressBookContactDocumentsLV() {
        return getOrCreateProperty("AddressBookContactDocumentsLV", "AddressBookContactDocumentsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.AddressBookContactDocumentsLV.class);
      }
      
      public AddressBookContactDocumentsLV_tb getAddressBookContactDocumentsLV_tb() {
        return getOrCreateProperty("AddressBookContactDocumentsLV_tb", "AddressBookContactDocumentsLV_tb", null, pcftest.ClaimContacts.ClaimContactsScreen.PeopleInvolvedDetailedListDetail.AddressBookContactDocumentsLV_tb.class);
      }
      
      public AddressesCardTab getAddressesCardTab() {
        return getOrCreateProperty("AddressesCardTab", "AddressesCardTab", null, pcftest.ClaimContacts.ClaimContactsScreen.PeopleInvolvedDetailedListDetail.AddressesCardTab.class);
      }
      
      public AddressesPanelSet getAddressesPanelSet() {
        return getOrCreateProperty("AddressesPanelSet", "AddressesPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.AddressesPanelSet.class);
      }
      
      public AddressesPanelSet_tb getAddressesPanelSet_tb() {
        return getOrCreateProperty("AddressesPanelSet_tb", "AddressesPanelSet_tb", null, pcftest.ClaimContacts.ClaimContactsScreen.PeopleInvolvedDetailedListDetail.AddressesPanelSet_tb.class);
      }
      
      public BasicsCardTab getBasicsCardTab() {
        return getOrCreateProperty("BasicsCardTab", "BasicsCardTab", null, pcftest.ClaimContacts.ClaimContactsScreen.PeopleInvolvedDetailedListDetail.BasicsCardTab.class);
      }
      
      public ClaimContactRelatedContactsLV getClaimContactRelatedContactsLV() {
        return getOrCreateProperty("ClaimContactRelatedContactsLV", "ClaimContactRelatedContactsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimContactRelatedContactsLV.class);
      }
      
      public ClaimContactRelatedContactsLV_tb getClaimContactRelatedContactsLV_tb() {
        return getOrCreateProperty("ClaimContactRelatedContactsLV_tb", "ClaimContactRelatedContactsLV_tb", null, pcftest.ClaimContacts.ClaimContactsScreen.PeopleInvolvedDetailedListDetail.ClaimContactRelatedContactsLV_tb.class);
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
        return getOrCreateProperty("ContactBasicsDV_tb", "ContactBasicsDV_tb", null, pcftest.ClaimContacts.ClaimContactsScreen.PeopleInvolvedDetailedListDetail.ContactBasicsDV_tb.class);
      }
      
      public ContactDetailToolbarButtonSet getContactDetailToolbarButtonSet() {
        return getOrCreateProperty("ContactDetailToolbarButtonSet", "ContactDetailToolbarButtonSet", null, pcftest.ContactDetailToolbarButtonSet.class);
      }
      
      public ContactDocumentsCardTab getContactDocumentsCardTab() {
        return getOrCreateProperty("ContactDocumentsCardTab", "ContactDocumentsCardTab", null, pcftest.ClaimContacts.ClaimContactsScreen.PeopleInvolvedDetailedListDetail.ContactDocumentsCardTab.class);
      }
      
      public PeopleInvolvedDetailedLV getPeopleInvolvedDetailedLV() {
        return getOrCreateProperty("PeopleInvolvedDetailedLV", "PeopleInvolvedDetailedLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.PeopleInvolvedDetailedLV.class);
      }
      
      public PeopleInvolvedDetailedLV_tb getPeopleInvolvedDetailedLV_tb() {
        return getOrCreateProperty("PeopleInvolvedDetailedLV_tb", "PeopleInvolvedDetailedLV_tb", null, pcftest.ClaimContacts.ClaimContactsScreen.PeopleInvolvedDetailedListDetail.PeopleInvolvedDetailedLV_tb.class);
      }
      
      public RelatedContactsCardTab getRelatedContactsCardTab() {
        return getOrCreateProperty("RelatedContactsCardTab", "RelatedContactsCardTab", null, pcftest.ClaimContacts.ClaimContactsScreen.PeopleInvolvedDetailedListDetail.RelatedContactsCardTab.class);
      }
      
      public ReviewsCardTab getReviewsCardTab() {
        return getOrCreateProperty("ReviewsCardTab", "ReviewsCardTab", null, pcftest.ClaimContacts.ClaimContactsScreen.PeopleInvolvedDetailedListDetail.ReviewsCardTab.class);
      }
      
      public ReviewsPanelSet getReviewsPanelSet() {
        return getOrCreateProperty("ReviewsPanelSet", "ReviewsPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.ReviewsPanelSet.class);
      }
      
      public ReviewsPanelSet_tb getReviewsPanelSet_tb() {
        return getOrCreateProperty("ReviewsPanelSet_tb", "ReviewsPanelSet_tb", null, pcftest.ClaimContacts.ClaimContactsScreen.PeopleInvolvedDetailedListDetail.ReviewsPanelSet_tb.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/partiesinvolved/ClaimContacts.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class AddressBookContactDocumentsLV_tb extends PCFElement {
        public AddressBookContactDocumentsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/partiesinvolved/ClaimContacts.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class AddressesCardTab extends ClickableActionElement {
        public AddressesCardTab(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/partiesinvolved/ClaimContacts.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class AddressesPanelSet_tb extends PCFElement {
        public AddressesPanelSet_tb(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public ContactDetailToolbarButtonSet getContactDetailToolbarButtonSet() {
          return getOrCreateProperty("ContactDetailToolbarButtonSet", "ContactDetailToolbarButtonSet", null, pcftest.ContactDetailToolbarButtonSet.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/partiesinvolved/ClaimContacts.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class BasicsCardTab extends ClickableActionElement {
        public BasicsCardTab(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/partiesinvolved/ClaimContacts.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ClaimContactRelatedContactsLV_tb extends PCFElement {
        public ClaimContactRelatedContactsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public Add getAdd() {
          return getOrCreateProperty("Add", "Add", null, pcftest.ClaimContacts.ClaimContactsScreen.PeopleInvolvedDetailedListDetail.ClaimContactRelatedContactsLV_tb.Add.class);
        }
        
        public Remove getRemove() {
          return getOrCreateProperty("Remove", "Remove", null, pcftest.ClaimContacts.ClaimContactsScreen.PeopleInvolvedDetailedListDetail.ClaimContactRelatedContactsLV_tb.Remove.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/partiesinvolved/ClaimContacts.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class Add extends ClickableActionElement {
          public Add(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/partiesinvolved/ClaimContacts.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class Remove extends ClickableActionElement {
          public Remove(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/partiesinvolved/ClaimContacts.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ContactBasicsDV_tb extends PCFElement {
        public ContactBasicsDV_tb(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public ContactBasicsHeaderInputSet_TransferRolesButton getContactBasicsHeaderInputSet_TransferRolesButton() {
          return getOrCreateProperty("ContactBasicsHeaderInputSet_TransferRolesButton", "ContactBasicsHeaderInputSet_TransferRolesButton", null, pcftest.ClaimContacts.ClaimContactsScreen.PeopleInvolvedDetailedListDetail.ContactBasicsDV_tb.ContactBasicsHeaderInputSet_TransferRolesButton.class);
        }
        
        public ContactDetailToolbarButtonSet getContactDetailToolbarButtonSet() {
          return getOrCreateProperty("ContactDetailToolbarButtonSet", "ContactDetailToolbarButtonSet", null, pcftest.ContactDetailToolbarButtonSet.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/partiesinvolved/ClaimContacts.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class ContactBasicsHeaderInputSet_TransferRolesButton extends ClickableActionElement {
          public ContactBasicsHeaderInputSet_TransferRolesButton(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public ClaimContactTransferRolesPopup click() {
            return clickThis(pcftest.ClaimContactTransferRolesPopup.class);
          }
          
          
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/partiesinvolved/ClaimContacts.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ContactDocumentsCardTab extends ClickableActionElement {
        public ContactDocumentsCardTab(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/partiesinvolved/ClaimContacts.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class PeopleInvolvedDetailedLV_tb extends PCFElement {
        public PeopleInvolvedDetailedLV_tb(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public ClaimContacts_AddExistingButton getClaimContacts_AddExistingButton() {
          return getOrCreateProperty("ClaimContacts_AddExistingButton", "ClaimContacts_AddExistingButton", null, pcftest.ClaimContacts.ClaimContactsScreen.PeopleInvolvedDetailedListDetail.PeopleInvolvedDetailedLV_tb.ClaimContacts_AddExistingButton.class);
        }
        
        public ClaimContacts_CreateNewContactButton getClaimContacts_CreateNewContactButton() {
          return getOrCreateProperty("ClaimContacts_CreateNewContactButton", "ClaimContacts_CreateNewContactButton", null, pcftest.ClaimContacts.ClaimContactsScreen.PeopleInvolvedDetailedListDetail.PeopleInvolvedDetailedLV_tb.ClaimContacts_CreateNewContactButton.class);
        }
        
        public ClaimContacts_DeleteButton getClaimContacts_DeleteButton() {
          return getOrCreateProperty("ClaimContacts_DeleteButton", "ClaimContacts_DeleteButton", null, pcftest.ClaimContacts.ClaimContactsScreen.PeopleInvolvedDetailedListDetail.PeopleInvolvedDetailedLV_tb.ClaimContacts_DeleteButton.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/partiesinvolved/ClaimContacts.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class ClaimContacts_AddExistingButton extends ClickableActionElement {
          public ClaimContacts_AddExistingButton(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public AddressBookPickerPopup click() {
            return clickThis(pcftest.AddressBookPickerPopup.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/partiesinvolved/ClaimContacts.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class ClaimContacts_CreateNewContactButton extends ClickableActionElement {
          public ClaimContacts_CreateNewContactButton(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public ClaimContacts_Company getClaimContacts_Company() {
            return getOrCreateProperty("ClaimContacts_Company", "ClaimContacts_Company", null, pcftest.ClaimContacts.ClaimContactsScreen.PeopleInvolvedDetailedListDetail.PeopleInvolvedDetailedLV_tb.ClaimContacts_CreateNewContactButton.ClaimContacts_Company.class);
          }
          
          public ClaimContacts_NewLegal getClaimContacts_NewLegal() {
            return getOrCreateProperty("ClaimContacts_NewLegal", "ClaimContacts_NewLegal", null, pcftest.ClaimContacts.ClaimContactsScreen.PeopleInvolvedDetailedListDetail.PeopleInvolvedDetailedLV_tb.ClaimContacts_CreateNewContactButton.ClaimContacts_NewLegal.class);
          }
          
          public ClaimContacts_NewPerson getClaimContacts_NewPerson() {
            return getOrCreateProperty("ClaimContacts_NewPerson", "ClaimContacts_NewPerson", null, pcftest.ClaimContacts.ClaimContactsScreen.PeopleInvolvedDetailedListDetail.PeopleInvolvedDetailedLV_tb.ClaimContacts_CreateNewContactButton.ClaimContacts_NewPerson.class);
          }
          
          public ClaimContacts_NewPersonVendor_Ext getClaimContacts_NewPersonVendor_Ext() {
            return getOrCreateProperty("ClaimContacts_NewPersonVendor_Ext", "ClaimContacts_NewPersonVendor_Ext", null, pcftest.ClaimContacts.ClaimContactsScreen.PeopleInvolvedDetailedListDetail.PeopleInvolvedDetailedLV_tb.ClaimContacts_CreateNewContactButton.ClaimContacts_NewPersonVendor_Ext.class);
          }
          
          public ClaimContacts_NewVendor getClaimContacts_NewVendor() {
            return getOrCreateProperty("ClaimContacts_NewVendor", "ClaimContacts_NewVendor", null, pcftest.ClaimContacts.ClaimContactsScreen.PeopleInvolvedDetailedListDetail.PeopleInvolvedDetailedLV_tb.ClaimContacts_CreateNewContactButton.ClaimContacts_NewVendor.class);
          }
          
          @SimplePropertyProcessing
          @Generated(comments = "config/web/pcf/claim/partiesinvolved/ClaimContacts.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
          public static class ClaimContacts_Company extends ClickableActionElement {
            public ClaimContacts_Company(ISmokeTest helper, PCFElementId componentId)  {
              super(helper, componentId);
            }
            
            public NewPartyInvolvedPopup click() {
              return clickThis(pcftest.NewPartyInvolvedPopup.class);
            }
            
            
          }
          
          @SimplePropertyProcessing
          @Generated(comments = "config/web/pcf/claim/partiesinvolved/ClaimContacts.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
          public static class ClaimContacts_NewLegal extends ClickableActionElement {
            public ClaimContacts_NewLegal(ISmokeTest helper, PCFElementId componentId)  {
              super(helper, componentId);
            }
            
            public ClaimContacts_Adjudicator getClaimContacts_Adjudicator() {
              return getOrCreateProperty("ClaimContacts_Adjudicator", "ClaimContacts_Adjudicator", null, pcftest.ClaimContacts.ClaimContactsScreen.PeopleInvolvedDetailedListDetail.PeopleInvolvedDetailedLV_tb.ClaimContacts_CreateNewContactButton.ClaimContacts_NewLegal.ClaimContacts_Adjudicator.class);
            }
            
            public ClaimContacts_Attorney getClaimContacts_Attorney() {
              return getOrCreateProperty("ClaimContacts_Attorney", "ClaimContacts_Attorney", null, pcftest.ClaimContacts.ClaimContactsScreen.PeopleInvolvedDetailedListDetail.PeopleInvolvedDetailedLV_tb.ClaimContacts_CreateNewContactButton.ClaimContacts_NewLegal.ClaimContacts_Attorney.class);
            }
            
            public ClaimContacts_LawFirm getClaimContacts_LawFirm() {
              return getOrCreateProperty("ClaimContacts_LawFirm", "ClaimContacts_LawFirm", null, pcftest.ClaimContacts.ClaimContactsScreen.PeopleInvolvedDetailedListDetail.PeopleInvolvedDetailedLV_tb.ClaimContacts_CreateNewContactButton.ClaimContacts_NewLegal.ClaimContacts_LawFirm.class);
            }
            
            public ClaimContacts_LegalVenue getClaimContacts_LegalVenue() {
              return getOrCreateProperty("ClaimContacts_LegalVenue", "ClaimContacts_LegalVenue", null, pcftest.ClaimContacts.ClaimContactsScreen.PeopleInvolvedDetailedListDetail.PeopleInvolvedDetailedLV_tb.ClaimContacts_CreateNewContactButton.ClaimContacts_NewLegal.ClaimContacts_LegalVenue.class);
            }
            
            @SimplePropertyProcessing
            @Generated(comments = "config/web/pcf/claim/partiesinvolved/ClaimContacts.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
            public static class ClaimContacts_Adjudicator extends ClickableActionElement {
              public ClaimContacts_Adjudicator(ISmokeTest helper, PCFElementId componentId)  {
                super(helper, componentId);
              }
              
              public NewPartyInvolvedPopup click() {
                return clickThis(pcftest.NewPartyInvolvedPopup.class);
              }
              
              
            }
            
            @SimplePropertyProcessing
            @Generated(comments = "config/web/pcf/claim/partiesinvolved/ClaimContacts.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
            public static class ClaimContacts_Attorney extends ClickableActionElement {
              public ClaimContacts_Attorney(ISmokeTest helper, PCFElementId componentId)  {
                super(helper, componentId);
              }
              
              public NewPartyInvolvedPopup click() {
                return clickThis(pcftest.NewPartyInvolvedPopup.class);
              }
              
              
            }
            
            @SimplePropertyProcessing
            @Generated(comments = "config/web/pcf/claim/partiesinvolved/ClaimContacts.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
            public static class ClaimContacts_LawFirm extends ClickableActionElement {
              public ClaimContacts_LawFirm(ISmokeTest helper, PCFElementId componentId)  {
                super(helper, componentId);
              }
              
              public NewPartyInvolvedPopup click() {
                return clickThis(pcftest.NewPartyInvolvedPopup.class);
              }
              
              
            }
            
            @SimplePropertyProcessing
            @Generated(comments = "config/web/pcf/claim/partiesinvolved/ClaimContacts.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
            public static class ClaimContacts_LegalVenue extends ClickableActionElement {
              public ClaimContacts_LegalVenue(ISmokeTest helper, PCFElementId componentId)  {
                super(helper, componentId);
              }
              
              public NewPartyInvolvedPopup click() {
                return clickThis(pcftest.NewPartyInvolvedPopup.class);
              }
              
              
            }
            
            
          }
          
          @SimplePropertyProcessing
          @Generated(comments = "config/web/pcf/claim/partiesinvolved/ClaimContacts.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
          public static class ClaimContacts_NewPerson extends ClickableActionElement {
            public ClaimContacts_NewPerson(ISmokeTest helper, PCFElementId componentId)  {
              super(helper, componentId);
            }
            
            public NewPartyInvolvedPopup click() {
              return clickThis(pcftest.NewPartyInvolvedPopup.class);
            }
            
            
          }
          
          @SimplePropertyProcessing
          @Generated(comments = "config/web/pcf/claim/partiesinvolved/ClaimContacts.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
          public static class ClaimContacts_NewPersonVendor_Ext extends ClickableActionElement {
            public ClaimContacts_NewPersonVendor_Ext(ISmokeTest helper, PCFElementId componentId)  {
              super(helper, componentId);
            }
            
            public NewPartyInvolvedPopup click() {
              return clickThis(pcftest.NewPartyInvolvedPopup.class);
            }
            
            
          }
          
          @SimplePropertyProcessing
          @Generated(comments = "config/web/pcf/claim/partiesinvolved/ClaimContacts.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
          public static class ClaimContacts_NewVendor extends ClickableActionElement {
            public ClaimContacts_NewVendor(ISmokeTest helper, PCFElementId componentId)  {
              super(helper, componentId);
            }
            
            public ClaimContacts_AutoRepairShop getClaimContacts_AutoRepairShop() {
              return getOrCreateProperty("ClaimContacts_AutoRepairShop", "ClaimContacts_AutoRepairShop", null, pcftest.ClaimContacts.ClaimContactsScreen.PeopleInvolvedDetailedListDetail.PeopleInvolvedDetailedLV_tb.ClaimContacts_CreateNewContactButton.ClaimContacts_NewVendor.ClaimContacts_AutoRepairShop.class);
            }
            
            public ClaimContacts_AutoTowingAgcy getClaimContacts_AutoTowingAgcy() {
              return getOrCreateProperty("ClaimContacts_AutoTowingAgcy", "ClaimContacts_AutoTowingAgcy", null, pcftest.ClaimContacts.ClaimContactsScreen.PeopleInvolvedDetailedListDetail.PeopleInvolvedDetailedLV_tb.ClaimContacts_CreateNewContactButton.ClaimContacts_NewVendor.ClaimContacts_AutoTowingAgcy.class);
            }
            
            public ClaimContacts_CompanyVendor getClaimContacts_CompanyVendor() {
              return getOrCreateProperty("ClaimContacts_CompanyVendor", "ClaimContacts_CompanyVendor", null, pcftest.ClaimContacts.ClaimContactsScreen.PeopleInvolvedDetailedListDetail.PeopleInvolvedDetailedLV_tb.ClaimContacts_CreateNewContactButton.ClaimContacts_NewVendor.ClaimContacts_CompanyVendor.class);
            }
            
            public ClaimContacts_Doctor getClaimContacts_Doctor() {
              return getOrCreateProperty("ClaimContacts_Doctor", "ClaimContacts_Doctor", null, pcftest.ClaimContacts.ClaimContactsScreen.PeopleInvolvedDetailedListDetail.PeopleInvolvedDetailedLV_tb.ClaimContacts_CreateNewContactButton.ClaimContacts_NewVendor.ClaimContacts_Doctor.class);
            }
            
            public ClaimContacts_MedicalCareOrg getClaimContacts_MedicalCareOrg() {
              return getOrCreateProperty("ClaimContacts_MedicalCareOrg", "ClaimContacts_MedicalCareOrg", null, pcftest.ClaimContacts.ClaimContactsScreen.PeopleInvolvedDetailedListDetail.PeopleInvolvedDetailedLV_tb.ClaimContacts_CreateNewContactButton.ClaimContacts_NewVendor.ClaimContacts_MedicalCareOrg.class);
            }
            
            @SimplePropertyProcessing
            @Generated(comments = "config/web/pcf/claim/partiesinvolved/ClaimContacts.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
            public static class ClaimContacts_AutoRepairShop extends ClickableActionElement {
              public ClaimContacts_AutoRepairShop(ISmokeTest helper, PCFElementId componentId)  {
                super(helper, componentId);
              }
              
              public NewPartyInvolvedPopup click() {
                return clickThis(pcftest.NewPartyInvolvedPopup.class);
              }
              
              
            }
            
            @SimplePropertyProcessing
            @Generated(comments = "config/web/pcf/claim/partiesinvolved/ClaimContacts.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
            public static class ClaimContacts_AutoTowingAgcy extends ClickableActionElement {
              public ClaimContacts_AutoTowingAgcy(ISmokeTest helper, PCFElementId componentId)  {
                super(helper, componentId);
              }
              
              public NewPartyInvolvedPopup click() {
                return clickThis(pcftest.NewPartyInvolvedPopup.class);
              }
              
              
            }
            
            @SimplePropertyProcessing
            @Generated(comments = "config/web/pcf/claim/partiesinvolved/ClaimContacts.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
            public static class ClaimContacts_CompanyVendor extends ClickableActionElement {
              public ClaimContacts_CompanyVendor(ISmokeTest helper, PCFElementId componentId)  {
                super(helper, componentId);
              }
              
              public NewPartyInvolvedPopup click() {
                return clickThis(pcftest.NewPartyInvolvedPopup.class);
              }
              
              
            }
            
            @SimplePropertyProcessing
            @Generated(comments = "config/web/pcf/claim/partiesinvolved/ClaimContacts.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
            public static class ClaimContacts_Doctor extends ClickableActionElement {
              public ClaimContacts_Doctor(ISmokeTest helper, PCFElementId componentId)  {
                super(helper, componentId);
              }
              
              public NewPartyInvolvedPopup click() {
                return clickThis(pcftest.NewPartyInvolvedPopup.class);
              }
              
              
            }
            
            @SimplePropertyProcessing
            @Generated(comments = "config/web/pcf/claim/partiesinvolved/ClaimContacts.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
            public static class ClaimContacts_MedicalCareOrg extends ClickableActionElement {
              public ClaimContacts_MedicalCareOrg(ISmokeTest helper, PCFElementId componentId)  {
                super(helper, componentId);
              }
              
              public NewPartyInvolvedPopup click() {
                return clickThis(pcftest.NewPartyInvolvedPopup.class);
              }
              
              
            }
            
            
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/partiesinvolved/ClaimContacts.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class ClaimContacts_DeleteButton extends ClickableActionElement {
          public ClaimContacts_DeleteButton(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/partiesinvolved/ClaimContacts.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class RelatedContactsCardTab extends ClickableActionElement {
        public RelatedContactsCardTab(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/partiesinvolved/ClaimContacts.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ReviewsCardTab extends ClickableActionElement {
        public ReviewsCardTab(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/partiesinvolved/ClaimContacts.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ReviewsPanelSet_tb extends PCFElement {
        public ReviewsPanelSet_tb(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public ContactDetailToolbarButtonSet getContactDetailToolbarButtonSet() {
          return getOrCreateProperty("ContactDetailToolbarButtonSet", "ContactDetailToolbarButtonSet", null, pcftest.ContactDetailToolbarButtonSet.class);
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/partiesinvolved/ClaimContacts.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/partiesinvolved/ClaimContacts.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimContacts_UpLink extends ClickableActionElement {
    public ClaimContacts_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/partiesinvolved/ClaimContacts.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/partiesinvolved/ClaimContacts.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}