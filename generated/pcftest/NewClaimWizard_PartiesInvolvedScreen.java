package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.NewClaimWizard_PartiesInvolvedScreen.NewClaimPeopleInvolvedDetailedLV_tb;
import pcftest.NewClaimWizard_PartiesInvolvedScreen.NewClaimPeopleInvolvedDetailedLV_tb.NewClaimWizard_PartiesInvolvedScreen_AddExistingButton;
import pcftest.NewClaimWizard_PartiesInvolvedScreen.NewClaimPeopleInvolvedDetailedLV_tb.NewClaimWizard_PartiesInvolvedScreen_CreateNewContactButton;
import pcftest.NewClaimWizard_PartiesInvolvedScreen.NewClaimPeopleInvolvedDetailedLV_tb.NewClaimWizard_PartiesInvolvedScreen_CreateNewContactButton.NewClaimPartiesInvoled_Company;
import pcftest.NewClaimWizard_PartiesInvolvedScreen.NewClaimPeopleInvolvedDetailedLV_tb.NewClaimWizard_PartiesInvolvedScreen_CreateNewContactButton.NewClaimPartiesInvoled_LegalVenue;
import pcftest.NewClaimWizard_PartiesInvolvedScreen.NewClaimPeopleInvolvedDetailedLV_tb.NewClaimWizard_PartiesInvolvedScreen_CreateNewContactButton.NewClaimPartiesInvoled_Person;
import pcftest.NewClaimWizard_PartiesInvolvedScreen.NewClaimPeopleInvolvedDetailedLV_tb.NewClaimWizard_PartiesInvolvedScreen_CreateNewContactButton.NewClaimPartiesInvoled_Person.NewClaimPartiesInvoled_Adjudicator;
import pcftest.NewClaimWizard_PartiesInvolvedScreen.NewClaimPeopleInvolvedDetailedLV_tb.NewClaimWizard_PartiesInvolvedScreen_CreateNewContactButton.NewClaimPartiesInvoled_Person.NewClaimPartiesInvoled_OtherPerson;
import pcftest.NewClaimWizard_PartiesInvolvedScreen.NewClaimPeopleInvolvedDetailedLV_tb.NewClaimWizard_PartiesInvolvedScreen_CreateNewContactButton.NewClaimPartiesInvoled_Vendor;
import pcftest.NewClaimWizard_PartiesInvolvedScreen.NewClaimPeopleInvolvedDetailedLV_tb.NewClaimWizard_PartiesInvolvedScreen_CreateNewContactButton.NewClaimPartiesInvoled_Vendor.NewClaimPartiesInvoled_Attorney;
import pcftest.NewClaimWizard_PartiesInvolvedScreen.NewClaimPeopleInvolvedDetailedLV_tb.NewClaimWizard_PartiesInvolvedScreen_CreateNewContactButton.NewClaimPartiesInvoled_Vendor.NewClaimPartiesInvoled_AutoRepairShop;
import pcftest.NewClaimWizard_PartiesInvolvedScreen.NewClaimPeopleInvolvedDetailedLV_tb.NewClaimWizard_PartiesInvolvedScreen_CreateNewContactButton.NewClaimPartiesInvoled_Vendor.NewClaimPartiesInvoled_AutoTowingAgcy;
import pcftest.NewClaimWizard_PartiesInvolvedScreen.NewClaimPeopleInvolvedDetailedLV_tb.NewClaimWizard_PartiesInvolvedScreen_CreateNewContactButton.NewClaimPartiesInvoled_Vendor.NewClaimPartiesInvoled_CompanyVendor;
import pcftest.NewClaimWizard_PartiesInvolvedScreen.NewClaimPeopleInvolvedDetailedLV_tb.NewClaimWizard_PartiesInvolvedScreen_CreateNewContactButton.NewClaimPartiesInvoled_Vendor.NewClaimPartiesInvoled_Doctor;
import pcftest.NewClaimWizard_PartiesInvolvedScreen.NewClaimPeopleInvolvedDetailedLV_tb.NewClaimWizard_PartiesInvolvedScreen_CreateNewContactButton.NewClaimPartiesInvoled_Vendor.NewClaimPartiesInvoled_LawFirm;
import pcftest.NewClaimWizard_PartiesInvolvedScreen.NewClaimPeopleInvolvedDetailedLV_tb.NewClaimWizard_PartiesInvolvedScreen_CreateNewContactButton.NewClaimPartiesInvoled_Vendor.NewClaimPartiesInvoled_MedicalCareOrg;
import pcftest.NewClaimWizard_PartiesInvolvedScreen.NewClaimPeopleInvolvedDetailedLV_tb.NewClaimWizard_PartiesInvolvedScreen_DeleteButton;
import pcftest.NewClaimWizard_PartiesInvolvedScreen._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_PartiesInvolvedScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NewClaimWizard_PartiesInvolvedScreen extends PCFElement {
  public final static String CHECKSUM = "1d92434cbed2646fe90f6994ffeebc06";
  
  public NewClaimWizard_PartiesInvolvedScreen(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public NewClaimPeopleInvolvedDetailedLV getNewClaimPeopleInvolvedDetailedLV() {
    return getOrCreateProperty("NewClaimPeopleInvolvedDetailedLV", "NewClaimPeopleInvolvedDetailedLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.NewClaimPeopleInvolvedDetailedLV.class);
  }
  
  public NewClaimPeopleInvolvedDetailedLV_tb getNewClaimPeopleInvolvedDetailedLV_tb() {
    return getOrCreateProperty("NewClaimPeopleInvolvedDetailedLV_tb", "NewClaimPeopleInvolvedDetailedLV_tb", null, pcftest.NewClaimWizard_PartiesInvolvedScreen.NewClaimPeopleInvolvedDetailedLV_tb.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.NewClaimWizard_PartiesInvolvedScreen._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_PartiesInvolvedScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewClaimPeopleInvolvedDetailedLV_tb extends PCFElement {
    public NewClaimPeopleInvolvedDetailedLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public NewClaimWizard_PartiesInvolvedScreen_AddExistingButton getNewClaimWizard_PartiesInvolvedScreen_AddExistingButton() {
      return getOrCreateProperty("NewClaimWizard_PartiesInvolvedScreen_AddExistingButton", "NewClaimWizard_PartiesInvolvedScreen_AddExistingButton", null, pcftest.NewClaimWizard_PartiesInvolvedScreen.NewClaimPeopleInvolvedDetailedLV_tb.NewClaimWizard_PartiesInvolvedScreen_AddExistingButton.class);
    }
    
    public NewClaimWizard_PartiesInvolvedScreen_CreateNewContactButton getNewClaimWizard_PartiesInvolvedScreen_CreateNewContactButton() {
      return getOrCreateProperty("NewClaimWizard_PartiesInvolvedScreen_CreateNewContactButton", "NewClaimWizard_PartiesInvolvedScreen_CreateNewContactButton", null, pcftest.NewClaimWizard_PartiesInvolvedScreen.NewClaimPeopleInvolvedDetailedLV_tb.NewClaimWizard_PartiesInvolvedScreen_CreateNewContactButton.class);
    }
    
    public NewClaimWizard_PartiesInvolvedScreen_DeleteButton getNewClaimWizard_PartiesInvolvedScreen_DeleteButton() {
      return getOrCreateProperty("NewClaimWizard_PartiesInvolvedScreen_DeleteButton", "NewClaimWizard_PartiesInvolvedScreen_DeleteButton", null, pcftest.NewClaimWizard_PartiesInvolvedScreen.NewClaimPeopleInvolvedDetailedLV_tb.NewClaimWizard_PartiesInvolvedScreen_DeleteButton.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_PartiesInvolvedScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class NewClaimWizard_PartiesInvolvedScreen_AddExistingButton extends ClickableActionElement {
      public NewClaimWizard_PartiesInvolvedScreen_AddExistingButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public AddressBookPickerPopup click() {
        return clickThis(pcftest.AddressBookPickerPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_PartiesInvolvedScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class NewClaimWizard_PartiesInvolvedScreen_CreateNewContactButton extends ClickableActionElement {
      public NewClaimWizard_PartiesInvolvedScreen_CreateNewContactButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public NewClaimPartiesInvoled_Company getNewClaimPartiesInvoled_Company() {
        return getOrCreateProperty("NewClaimPartiesInvoled_Company", "NewClaimPartiesInvoled_Company", null, pcftest.NewClaimWizard_PartiesInvolvedScreen.NewClaimPeopleInvolvedDetailedLV_tb.NewClaimWizard_PartiesInvolvedScreen_CreateNewContactButton.NewClaimPartiesInvoled_Company.class);
      }
      
      public NewClaimPartiesInvoled_LegalVenue getNewClaimPartiesInvoled_LegalVenue() {
        return getOrCreateProperty("NewClaimPartiesInvoled_LegalVenue", "NewClaimPartiesInvoled_LegalVenue", null, pcftest.NewClaimWizard_PartiesInvolvedScreen.NewClaimPeopleInvolvedDetailedLV_tb.NewClaimWizard_PartiesInvolvedScreen_CreateNewContactButton.NewClaimPartiesInvoled_LegalVenue.class);
      }
      
      public NewClaimPartiesInvoled_Person getNewClaimPartiesInvoled_Person() {
        return getOrCreateProperty("NewClaimPartiesInvoled_Person", "NewClaimPartiesInvoled_Person", null, pcftest.NewClaimWizard_PartiesInvolvedScreen.NewClaimPeopleInvolvedDetailedLV_tb.NewClaimWizard_PartiesInvolvedScreen_CreateNewContactButton.NewClaimPartiesInvoled_Person.class);
      }
      
      public NewClaimPartiesInvoled_Vendor getNewClaimPartiesInvoled_Vendor() {
        return getOrCreateProperty("NewClaimPartiesInvoled_Vendor", "NewClaimPartiesInvoled_Vendor", null, pcftest.NewClaimWizard_PartiesInvolvedScreen.NewClaimPeopleInvolvedDetailedLV_tb.NewClaimWizard_PartiesInvolvedScreen_CreateNewContactButton.NewClaimPartiesInvoled_Vendor.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_PartiesInvolvedScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class NewClaimPartiesInvoled_Company extends ClickableActionElement {
        public NewClaimPartiesInvoled_Company(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_PartiesInvolvedScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class NewClaimPartiesInvoled_LegalVenue extends ClickableActionElement {
        public NewClaimPartiesInvoled_LegalVenue(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_PartiesInvolvedScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class NewClaimPartiesInvoled_Person extends ClickableActionElement {
        public NewClaimPartiesInvoled_Person(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public NewClaimPartiesInvoled_Adjudicator getNewClaimPartiesInvoled_Adjudicator() {
          return getOrCreateProperty("NewClaimPartiesInvoled_Adjudicator", "NewClaimPartiesInvoled_Adjudicator", null, pcftest.NewClaimWizard_PartiesInvolvedScreen.NewClaimPeopleInvolvedDetailedLV_tb.NewClaimWizard_PartiesInvolvedScreen_CreateNewContactButton.NewClaimPartiesInvoled_Person.NewClaimPartiesInvoled_Adjudicator.class);
        }
        
        public NewClaimPartiesInvoled_OtherPerson getNewClaimPartiesInvoled_OtherPerson() {
          return getOrCreateProperty("NewClaimPartiesInvoled_OtherPerson", "NewClaimPartiesInvoled_OtherPerson", null, pcftest.NewClaimWizard_PartiesInvolvedScreen.NewClaimPeopleInvolvedDetailedLV_tb.NewClaimWizard_PartiesInvolvedScreen_CreateNewContactButton.NewClaimPartiesInvoled_Person.NewClaimPartiesInvoled_OtherPerson.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_PartiesInvolvedScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class NewClaimPartiesInvoled_Adjudicator extends ClickableActionElement {
          public NewClaimPartiesInvoled_Adjudicator(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_PartiesInvolvedScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class NewClaimPartiesInvoled_OtherPerson extends ClickableActionElement {
          public NewClaimPartiesInvoled_OtherPerson(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_PartiesInvolvedScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class NewClaimPartiesInvoled_Vendor extends ClickableActionElement {
        public NewClaimPartiesInvoled_Vendor(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public NewClaimPartiesInvoled_Attorney getNewClaimPartiesInvoled_Attorney() {
          return getOrCreateProperty("NewClaimPartiesInvoled_Attorney", "NewClaimPartiesInvoled_Attorney", null, pcftest.NewClaimWizard_PartiesInvolvedScreen.NewClaimPeopleInvolvedDetailedLV_tb.NewClaimWizard_PartiesInvolvedScreen_CreateNewContactButton.NewClaimPartiesInvoled_Vendor.NewClaimPartiesInvoled_Attorney.class);
        }
        
        public NewClaimPartiesInvoled_AutoRepairShop getNewClaimPartiesInvoled_AutoRepairShop() {
          return getOrCreateProperty("NewClaimPartiesInvoled_AutoRepairShop", "NewClaimPartiesInvoled_AutoRepairShop", null, pcftest.NewClaimWizard_PartiesInvolvedScreen.NewClaimPeopleInvolvedDetailedLV_tb.NewClaimWizard_PartiesInvolvedScreen_CreateNewContactButton.NewClaimPartiesInvoled_Vendor.NewClaimPartiesInvoled_AutoRepairShop.class);
        }
        
        public NewClaimPartiesInvoled_AutoTowingAgcy getNewClaimPartiesInvoled_AutoTowingAgcy() {
          return getOrCreateProperty("NewClaimPartiesInvoled_AutoTowingAgcy", "NewClaimPartiesInvoled_AutoTowingAgcy", null, pcftest.NewClaimWizard_PartiesInvolvedScreen.NewClaimPeopleInvolvedDetailedLV_tb.NewClaimWizard_PartiesInvolvedScreen_CreateNewContactButton.NewClaimPartiesInvoled_Vendor.NewClaimPartiesInvoled_AutoTowingAgcy.class);
        }
        
        public NewClaimPartiesInvoled_CompanyVendor getNewClaimPartiesInvoled_CompanyVendor() {
          return getOrCreateProperty("NewClaimPartiesInvoled_CompanyVendor", "NewClaimPartiesInvoled_CompanyVendor", null, pcftest.NewClaimWizard_PartiesInvolvedScreen.NewClaimPeopleInvolvedDetailedLV_tb.NewClaimWizard_PartiesInvolvedScreen_CreateNewContactButton.NewClaimPartiesInvoled_Vendor.NewClaimPartiesInvoled_CompanyVendor.class);
        }
        
        public NewClaimPartiesInvoled_Doctor getNewClaimPartiesInvoled_Doctor() {
          return getOrCreateProperty("NewClaimPartiesInvoled_Doctor", "NewClaimPartiesInvoled_Doctor", null, pcftest.NewClaimWizard_PartiesInvolvedScreen.NewClaimPeopleInvolvedDetailedLV_tb.NewClaimWizard_PartiesInvolvedScreen_CreateNewContactButton.NewClaimPartiesInvoled_Vendor.NewClaimPartiesInvoled_Doctor.class);
        }
        
        public NewClaimPartiesInvoled_LawFirm getNewClaimPartiesInvoled_LawFirm() {
          return getOrCreateProperty("NewClaimPartiesInvoled_LawFirm", "NewClaimPartiesInvoled_LawFirm", null, pcftest.NewClaimWizard_PartiesInvolvedScreen.NewClaimPeopleInvolvedDetailedLV_tb.NewClaimWizard_PartiesInvolvedScreen_CreateNewContactButton.NewClaimPartiesInvoled_Vendor.NewClaimPartiesInvoled_LawFirm.class);
        }
        
        public NewClaimPartiesInvoled_MedicalCareOrg getNewClaimPartiesInvoled_MedicalCareOrg() {
          return getOrCreateProperty("NewClaimPartiesInvoled_MedicalCareOrg", "NewClaimPartiesInvoled_MedicalCareOrg", null, pcftest.NewClaimWizard_PartiesInvolvedScreen.NewClaimPeopleInvolvedDetailedLV_tb.NewClaimWizard_PartiesInvolvedScreen_CreateNewContactButton.NewClaimPartiesInvoled_Vendor.NewClaimPartiesInvoled_MedicalCareOrg.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_PartiesInvolvedScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class NewClaimPartiesInvoled_Attorney extends ClickableActionElement {
          public NewClaimPartiesInvoled_Attorney(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_PartiesInvolvedScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class NewClaimPartiesInvoled_AutoRepairShop extends ClickableActionElement {
          public NewClaimPartiesInvoled_AutoRepairShop(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_PartiesInvolvedScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class NewClaimPartiesInvoled_AutoTowingAgcy extends ClickableActionElement {
          public NewClaimPartiesInvoled_AutoTowingAgcy(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_PartiesInvolvedScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class NewClaimPartiesInvoled_CompanyVendor extends ClickableActionElement {
          public NewClaimPartiesInvoled_CompanyVendor(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_PartiesInvolvedScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class NewClaimPartiesInvoled_Doctor extends ClickableActionElement {
          public NewClaimPartiesInvoled_Doctor(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_PartiesInvolvedScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class NewClaimPartiesInvoled_LawFirm extends ClickableActionElement {
          public NewClaimPartiesInvoled_LawFirm(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_PartiesInvolvedScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class NewClaimPartiesInvoled_MedicalCareOrg extends ClickableActionElement {
          public NewClaimPartiesInvoled_MedicalCareOrg(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_PartiesInvolvedScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class NewClaimWizard_PartiesInvolvedScreen_DeleteButton extends ClickableActionElement {
      public NewClaimWizard_PartiesInvolvedScreen_DeleteButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_PartiesInvolvedScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}