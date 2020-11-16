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
import pcftest.NewCheckWizardAddressBookPickerPopup.NewCheckWizardAddressBookPickerPopup_UpLink;
import pcftest.NewCheckWizardAddressBookPickerPopup.NewCheckWizardAddressBookSearchScreen;
import pcftest.NewCheckWizardAddressBookPickerPopup.NewCheckWizardAddressBookSearchScreen.AddressBookSearchLV_tb;
import pcftest.NewCheckWizardAddressBookPickerPopup.NewCheckWizardAddressBookSearchScreen.AddressBookSearchLV_tb.ClaimContacts_CreateNewContactButton;
import pcftest.NewCheckWizardAddressBookPickerPopup.NewCheckWizardAddressBookSearchScreen.AddressBookSearchLV_tb.ClaimContacts_CreateNewContactButton.ClaimContacts_Company;
import pcftest.NewCheckWizardAddressBookPickerPopup.NewCheckWizardAddressBookSearchScreen.AddressBookSearchLV_tb.ClaimContacts_CreateNewContactButton.ClaimContacts_NewLegal;
import pcftest.NewCheckWizardAddressBookPickerPopup.NewCheckWizardAddressBookSearchScreen.AddressBookSearchLV_tb.ClaimContacts_CreateNewContactButton.ClaimContacts_NewLegal.ClaimContacts_Adjudicator;
import pcftest.NewCheckWizardAddressBookPickerPopup.NewCheckWizardAddressBookSearchScreen.AddressBookSearchLV_tb.ClaimContacts_CreateNewContactButton.ClaimContacts_NewLegal.ClaimContacts_Attorney;
import pcftest.NewCheckWizardAddressBookPickerPopup.NewCheckWizardAddressBookSearchScreen.AddressBookSearchLV_tb.ClaimContacts_CreateNewContactButton.ClaimContacts_NewLegal.ClaimContacts_LawFirm;
import pcftest.NewCheckWizardAddressBookPickerPopup.NewCheckWizardAddressBookSearchScreen.AddressBookSearchLV_tb.ClaimContacts_CreateNewContactButton.ClaimContacts_NewLegal.ClaimContacts_LegalVenue;
import pcftest.NewCheckWizardAddressBookPickerPopup.NewCheckWizardAddressBookSearchScreen.AddressBookSearchLV_tb.ClaimContacts_CreateNewContactButton.ClaimContacts_NewPerson;
import pcftest.NewCheckWizardAddressBookPickerPopup.NewCheckWizardAddressBookSearchScreen.AddressBookSearchLV_tb.ClaimContacts_CreateNewContactButton.ClaimContacts_NewVendor;
import pcftest.NewCheckWizardAddressBookPickerPopup.NewCheckWizardAddressBookSearchScreen.AddressBookSearchLV_tb.ClaimContacts_CreateNewContactButton.ClaimContacts_NewVendor.ClaimContacts_AutoRepairShop;
import pcftest.NewCheckWizardAddressBookPickerPopup.NewCheckWizardAddressBookSearchScreen.AddressBookSearchLV_tb.ClaimContacts_CreateNewContactButton.ClaimContacts_NewVendor.ClaimContacts_AutoTowingAgcy;
import pcftest.NewCheckWizardAddressBookPickerPopup.NewCheckWizardAddressBookSearchScreen.AddressBookSearchLV_tb.ClaimContacts_CreateNewContactButton.ClaimContacts_NewVendor.ClaimContacts_CompanyVendor;
import pcftest.NewCheckWizardAddressBookPickerPopup.NewCheckWizardAddressBookSearchScreen.AddressBookSearchLV_tb.ClaimContacts_CreateNewContactButton.ClaimContacts_NewVendor.ClaimContacts_Doctor;
import pcftest.NewCheckWizardAddressBookPickerPopup.NewCheckWizardAddressBookSearchScreen.AddressBookSearchLV_tb.ClaimContacts_CreateNewContactButton.ClaimContacts_NewVendor.ClaimContacts_MedicalCareOrg;
import pcftest.NewCheckWizardAddressBookPickerPopup.NewCheckWizardAddressBookSearchScreen.AddressBookSearchLV_tb.ClaimSearchScreen_CreateNewContactButton;
import pcftest.NewCheckWizardAddressBookPickerPopup.NewCheckWizardAddressBookSearchScreen.AddressBookSearchLV_tb.ClaimSearchScreen_PrintButton;
import pcftest.NewCheckWizardAddressBookPickerPopup.NewCheckWizardAddressBookSearchScreen.AddressBookSearchLV_tb.RetrieveRequested;
import pcftest.NewCheckWizardAddressBookPickerPopup.NewCheckWizardAddressBookSearchScreen._msgs;
import pcftest.NewCheckWizardAddressBookPickerPopup.NewCheckWizardAddressBookSearchScreen.cancel;
import pcftest.NewCheckWizardAddressBookPickerPopup._Paging;
import pcftest.NewCheckWizardAddressBookPickerPopup.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/newcheckwizard/NewCheckWizardAddressBookPickerPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NewCheckWizardAddressBookPickerPopup extends PCFLocation {
  public final static String CHECKSUM = "96ed50df653733a92d0ba2bfce401afa";
  
  public NewCheckWizardAddressBookPickerPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("NewCheckWizardAddressBookPickerPopup"));
  }
  
  public NewCheckWizardAddressBookPickerPopup_UpLink getNewCheckWizardAddressBookPickerPopup_UpLink() {
    return getOrCreateProperty("NewCheckWizardAddressBookPickerPopup_UpLink", "NewCheckWizardAddressBookPickerPopup_UpLink", null, pcftest.NewCheckWizardAddressBookPickerPopup.NewCheckWizardAddressBookPickerPopup_UpLink.class);
  }
  
  public NewCheckWizardAddressBookSearchScreen getNewCheckWizardAddressBookSearchScreen() {
    return getOrCreateProperty("NewCheckWizardAddressBookSearchScreen", "NewCheckWizardAddressBookSearchScreen", null, pcftest.NewCheckWizardAddressBookPickerPopup.NewCheckWizardAddressBookSearchScreen.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.NewCheckWizardAddressBookPickerPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.NewCheckWizardAddressBookPickerPopup.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/newcheckwizard/NewCheckWizardAddressBookPickerPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewCheckWizardAddressBookPickerPopup_UpLink extends ClickableActionElement {
    public NewCheckWizardAddressBookPickerPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/newcheckwizard/NewCheckWizardAddressBookPickerPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewCheckWizardAddressBookSearchScreen extends PCFElement {
    public NewCheckWizardAddressBookSearchScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public AddressBookSearchDV getAddressBookSearchDV() {
      return getOrCreateProperty("AddressBookSearchDV", "AddressBookSearchDV", null, pcftest.AddressBookSearchDV.class);
    }
    
    public AddressBookSearchLV getAddressBookSearchLV() {
      return getOrCreateProperty("AddressBookSearchLV", "AddressBookSearchLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.AddressBookSearchLV.class);
    }
    
    public AddressBookSearchLV_tb getAddressBookSearchLV_tb() {
      return getOrCreateProperty("AddressBookSearchLV_tb", "AddressBookSearchLV_tb", null, pcftest.NewCheckWizardAddressBookPickerPopup.NewCheckWizardAddressBookSearchScreen.AddressBookSearchLV_tb.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.NewCheckWizardAddressBookPickerPopup.NewCheckWizardAddressBookSearchScreen._msgs.class);
    }
    
    public cancel getcancel() {
      return getOrCreateProperty("cancel", "cancel", null, pcftest.NewCheckWizardAddressBookPickerPopup.NewCheckWizardAddressBookSearchScreen.cancel.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/newcheckwizard/NewCheckWizardAddressBookPickerPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class AddressBookSearchLV_tb extends PCFElement {
      public AddressBookSearchLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ClaimContacts_CreateNewContactButton getClaimContacts_CreateNewContactButton() {
        return getOrCreateProperty("ClaimContacts_CreateNewContactButton", "ClaimContacts_CreateNewContactButton", null, pcftest.NewCheckWizardAddressBookPickerPopup.NewCheckWizardAddressBookSearchScreen.AddressBookSearchLV_tb.ClaimContacts_CreateNewContactButton.class);
      }
      
      public ClaimSearchScreen_CreateNewContactButton getClaimSearchScreen_CreateNewContactButton() {
        return getOrCreateProperty("ClaimSearchScreen_CreateNewContactButton", "ClaimSearchScreen_CreateNewContactButton", null, pcftest.NewCheckWizardAddressBookPickerPopup.NewCheckWizardAddressBookSearchScreen.AddressBookSearchLV_tb.ClaimSearchScreen_CreateNewContactButton.class);
      }
      
      public ClaimSearchScreen_PrintButton getClaimSearchScreen_PrintButton() {
        return getOrCreateProperty("ClaimSearchScreen_PrintButton", "ClaimSearchScreen_PrintButton", null, pcftest.NewCheckWizardAddressBookPickerPopup.NewCheckWizardAddressBookSearchScreen.AddressBookSearchLV_tb.ClaimSearchScreen_PrintButton.class);
      }
      
      public RetrieveRequested getRetrieveRequested() {
        return getOrCreateProperty("RetrieveRequested", "RetrieveRequested", null, pcftest.NewCheckWizardAddressBookPickerPopup.NewCheckWizardAddressBookSearchScreen.AddressBookSearchLV_tb.RetrieveRequested.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/newcheckwizard/NewCheckWizardAddressBookPickerPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ClaimContacts_CreateNewContactButton extends ClickableActionElement {
        public ClaimContacts_CreateNewContactButton(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public ClaimContacts_Company getClaimContacts_Company() {
          return getOrCreateProperty("ClaimContacts_Company", "ClaimContacts_Company", null, pcftest.NewCheckWizardAddressBookPickerPopup.NewCheckWizardAddressBookSearchScreen.AddressBookSearchLV_tb.ClaimContacts_CreateNewContactButton.ClaimContacts_Company.class);
        }
        
        public ClaimContacts_NewLegal getClaimContacts_NewLegal() {
          return getOrCreateProperty("ClaimContacts_NewLegal", "ClaimContacts_NewLegal", null, pcftest.NewCheckWizardAddressBookPickerPopup.NewCheckWizardAddressBookSearchScreen.AddressBookSearchLV_tb.ClaimContacts_CreateNewContactButton.ClaimContacts_NewLegal.class);
        }
        
        public ClaimContacts_NewPerson getClaimContacts_NewPerson() {
          return getOrCreateProperty("ClaimContacts_NewPerson", "ClaimContacts_NewPerson", null, pcftest.NewCheckWizardAddressBookPickerPopup.NewCheckWizardAddressBookSearchScreen.AddressBookSearchLV_tb.ClaimContacts_CreateNewContactButton.ClaimContacts_NewPerson.class);
        }
        
        public ClaimContacts_NewVendor getClaimContacts_NewVendor() {
          return getOrCreateProperty("ClaimContacts_NewVendor", "ClaimContacts_NewVendor", null, pcftest.NewCheckWizardAddressBookPickerPopup.NewCheckWizardAddressBookSearchScreen.AddressBookSearchLV_tb.ClaimContacts_CreateNewContactButton.ClaimContacts_NewVendor.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/newcheckwizard/NewCheckWizardAddressBookPickerPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class ClaimContacts_Company extends ClickableActionElement {
          public ClaimContacts_Company(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public AddressBookSearchNewContactPopup click() {
            return clickThis(pcftest.AddressBookSearchNewContactPopup.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/newcheckwizard/NewCheckWizardAddressBookPickerPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class ClaimContacts_NewLegal extends ClickableActionElement {
          public ClaimContacts_NewLegal(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public ClaimContacts_Adjudicator getClaimContacts_Adjudicator() {
            return getOrCreateProperty("ClaimContacts_Adjudicator", "ClaimContacts_Adjudicator", null, pcftest.NewCheckWizardAddressBookPickerPopup.NewCheckWizardAddressBookSearchScreen.AddressBookSearchLV_tb.ClaimContacts_CreateNewContactButton.ClaimContacts_NewLegal.ClaimContacts_Adjudicator.class);
          }
          
          public ClaimContacts_Attorney getClaimContacts_Attorney() {
            return getOrCreateProperty("ClaimContacts_Attorney", "ClaimContacts_Attorney", null, pcftest.NewCheckWizardAddressBookPickerPopup.NewCheckWizardAddressBookSearchScreen.AddressBookSearchLV_tb.ClaimContacts_CreateNewContactButton.ClaimContacts_NewLegal.ClaimContacts_Attorney.class);
          }
          
          public ClaimContacts_LawFirm getClaimContacts_LawFirm() {
            return getOrCreateProperty("ClaimContacts_LawFirm", "ClaimContacts_LawFirm", null, pcftest.NewCheckWizardAddressBookPickerPopup.NewCheckWizardAddressBookSearchScreen.AddressBookSearchLV_tb.ClaimContacts_CreateNewContactButton.ClaimContacts_NewLegal.ClaimContacts_LawFirm.class);
          }
          
          public ClaimContacts_LegalVenue getClaimContacts_LegalVenue() {
            return getOrCreateProperty("ClaimContacts_LegalVenue", "ClaimContacts_LegalVenue", null, pcftest.NewCheckWizardAddressBookPickerPopup.NewCheckWizardAddressBookSearchScreen.AddressBookSearchLV_tb.ClaimContacts_CreateNewContactButton.ClaimContacts_NewLegal.ClaimContacts_LegalVenue.class);
          }
          
          @SimplePropertyProcessing
          @Generated(comments = "config/web/pcf/newcheckwizard/NewCheckWizardAddressBookPickerPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
          public static class ClaimContacts_Adjudicator extends ClickableActionElement {
            public ClaimContacts_Adjudicator(ISmokeTest helper, PCFElementId componentId)  {
              super(helper, componentId);
            }
            
            public AddressBookSearchNewContactPopup click() {
              return clickThis(pcftest.AddressBookSearchNewContactPopup.class);
            }
            
            
          }
          
          @SimplePropertyProcessing
          @Generated(comments = "config/web/pcf/newcheckwizard/NewCheckWizardAddressBookPickerPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
          public static class ClaimContacts_Attorney extends ClickableActionElement {
            public ClaimContacts_Attorney(ISmokeTest helper, PCFElementId componentId)  {
              super(helper, componentId);
            }
            
            public AddressBookSearchNewContactPopup click() {
              return clickThis(pcftest.AddressBookSearchNewContactPopup.class);
            }
            
            
          }
          
          @SimplePropertyProcessing
          @Generated(comments = "config/web/pcf/newcheckwizard/NewCheckWizardAddressBookPickerPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
          public static class ClaimContacts_LawFirm extends ClickableActionElement {
            public ClaimContacts_LawFirm(ISmokeTest helper, PCFElementId componentId)  {
              super(helper, componentId);
            }
            
            public AddressBookSearchNewContactPopup click() {
              return clickThis(pcftest.AddressBookSearchNewContactPopup.class);
            }
            
            
          }
          
          @SimplePropertyProcessing
          @Generated(comments = "config/web/pcf/newcheckwizard/NewCheckWizardAddressBookPickerPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
          public static class ClaimContacts_LegalVenue extends ClickableActionElement {
            public ClaimContacts_LegalVenue(ISmokeTest helper, PCFElementId componentId)  {
              super(helper, componentId);
            }
            
            public AddressBookSearchNewContactPopup click() {
              return clickThis(pcftest.AddressBookSearchNewContactPopup.class);
            }
            
            
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/newcheckwizard/NewCheckWizardAddressBookPickerPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class ClaimContacts_NewPerson extends ClickableActionElement {
          public ClaimContacts_NewPerson(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public AddressBookSearchNewContactPopup click() {
            return clickThis(pcftest.AddressBookSearchNewContactPopup.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/newcheckwizard/NewCheckWizardAddressBookPickerPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class ClaimContacts_NewVendor extends ClickableActionElement {
          public ClaimContacts_NewVendor(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public ClaimContacts_AutoRepairShop getClaimContacts_AutoRepairShop() {
            return getOrCreateProperty("ClaimContacts_AutoRepairShop", "ClaimContacts_AutoRepairShop", null, pcftest.NewCheckWizardAddressBookPickerPopup.NewCheckWizardAddressBookSearchScreen.AddressBookSearchLV_tb.ClaimContacts_CreateNewContactButton.ClaimContacts_NewVendor.ClaimContacts_AutoRepairShop.class);
          }
          
          public ClaimContacts_AutoTowingAgcy getClaimContacts_AutoTowingAgcy() {
            return getOrCreateProperty("ClaimContacts_AutoTowingAgcy", "ClaimContacts_AutoTowingAgcy", null, pcftest.NewCheckWizardAddressBookPickerPopup.NewCheckWizardAddressBookSearchScreen.AddressBookSearchLV_tb.ClaimContacts_CreateNewContactButton.ClaimContacts_NewVendor.ClaimContacts_AutoTowingAgcy.class);
          }
          
          public ClaimContacts_CompanyVendor getClaimContacts_CompanyVendor() {
            return getOrCreateProperty("ClaimContacts_CompanyVendor", "ClaimContacts_CompanyVendor", null, pcftest.NewCheckWizardAddressBookPickerPopup.NewCheckWizardAddressBookSearchScreen.AddressBookSearchLV_tb.ClaimContacts_CreateNewContactButton.ClaimContacts_NewVendor.ClaimContacts_CompanyVendor.class);
          }
          
          public ClaimContacts_Doctor getClaimContacts_Doctor() {
            return getOrCreateProperty("ClaimContacts_Doctor", "ClaimContacts_Doctor", null, pcftest.NewCheckWizardAddressBookPickerPopup.NewCheckWizardAddressBookSearchScreen.AddressBookSearchLV_tb.ClaimContacts_CreateNewContactButton.ClaimContacts_NewVendor.ClaimContacts_Doctor.class);
          }
          
          public ClaimContacts_MedicalCareOrg getClaimContacts_MedicalCareOrg() {
            return getOrCreateProperty("ClaimContacts_MedicalCareOrg", "ClaimContacts_MedicalCareOrg", null, pcftest.NewCheckWizardAddressBookPickerPopup.NewCheckWizardAddressBookSearchScreen.AddressBookSearchLV_tb.ClaimContacts_CreateNewContactButton.ClaimContacts_NewVendor.ClaimContacts_MedicalCareOrg.class);
          }
          
          @SimplePropertyProcessing
          @Generated(comments = "config/web/pcf/newcheckwizard/NewCheckWizardAddressBookPickerPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
          public static class ClaimContacts_AutoRepairShop extends ClickableActionElement {
            public ClaimContacts_AutoRepairShop(ISmokeTest helper, PCFElementId componentId)  {
              super(helper, componentId);
            }
            
            public AddressBookSearchNewContactPopup click() {
              return clickThis(pcftest.AddressBookSearchNewContactPopup.class);
            }
            
            
          }
          
          @SimplePropertyProcessing
          @Generated(comments = "config/web/pcf/newcheckwizard/NewCheckWizardAddressBookPickerPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
          public static class ClaimContacts_AutoTowingAgcy extends ClickableActionElement {
            public ClaimContacts_AutoTowingAgcy(ISmokeTest helper, PCFElementId componentId)  {
              super(helper, componentId);
            }
            
            public AddressBookSearchNewContactPopup click() {
              return clickThis(pcftest.AddressBookSearchNewContactPopup.class);
            }
            
            
          }
          
          @SimplePropertyProcessing
          @Generated(comments = "config/web/pcf/newcheckwizard/NewCheckWizardAddressBookPickerPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
          public static class ClaimContacts_CompanyVendor extends ClickableActionElement {
            public ClaimContacts_CompanyVendor(ISmokeTest helper, PCFElementId componentId)  {
              super(helper, componentId);
            }
            
            public AddressBookSearchNewContactPopup click() {
              return clickThis(pcftest.AddressBookSearchNewContactPopup.class);
            }
            
            
          }
          
          @SimplePropertyProcessing
          @Generated(comments = "config/web/pcf/newcheckwizard/NewCheckWizardAddressBookPickerPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
          public static class ClaimContacts_Doctor extends ClickableActionElement {
            public ClaimContacts_Doctor(ISmokeTest helper, PCFElementId componentId)  {
              super(helper, componentId);
            }
            
            public AddressBookSearchNewContactPopup click() {
              return clickThis(pcftest.AddressBookSearchNewContactPopup.class);
            }
            
            
          }
          
          @SimplePropertyProcessing
          @Generated(comments = "config/web/pcf/newcheckwizard/NewCheckWizardAddressBookPickerPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
          public static class ClaimContacts_MedicalCareOrg extends ClickableActionElement {
            public ClaimContacts_MedicalCareOrg(ISmokeTest helper, PCFElementId componentId)  {
              super(helper, componentId);
            }
            
            public AddressBookSearchNewContactPopup click() {
              return clickThis(pcftest.AddressBookSearchNewContactPopup.class);
            }
            
            
          }
          
          
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/newcheckwizard/NewCheckWizardAddressBookPickerPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ClaimSearchScreen_CreateNewContactButton extends ClickableActionElement {
        public ClaimSearchScreen_CreateNewContactButton(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public AddressBookSearchNewContactPopup click() {
          return clickThis(pcftest.AddressBookSearchNewContactPopup.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/newcheckwizard/NewCheckWizardAddressBookPickerPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ClaimSearchScreen_PrintButton extends ClickableActionElement {
        public ClaimSearchScreen_PrintButton(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/newcheckwizard/NewCheckWizardAddressBookPickerPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class RetrieveRequested extends ClickableActionElement {
        public RetrieveRequested(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/newcheckwizard/NewCheckWizardAddressBookPickerPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _msgs extends MessagesElement {
      public _msgs(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/newcheckwizard/NewCheckWizardAddressBookPickerPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class cancel extends ClickableActionElement {
      public cancel(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/newcheckwizard/NewCheckWizardAddressBookPickerPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/newcheckwizard/NewCheckWizardAddressBookPickerPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}