package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ContextObjectContactPickerMenuItemSet.AddressBookContactSearch;
import pcftest.ContextObjectContactPickerMenuItemSet.NewContactPickerMenuItemSet_NewCompany;
import pcftest.ContextObjectContactPickerMenuItemSet.NewContactPickerMenuItemSet_NewLegalVenue;
import pcftest.ContextObjectContactPickerMenuItemSet.NewContactPickerMenuItemSet_NewPerson;
import pcftest.ContextObjectContactPickerMenuItemSet.NewContactPickerMenuItemSet_NewPerson.NewContactPickerMenuItemSet_Adjudicator;
import pcftest.ContextObjectContactPickerMenuItemSet.NewContactPickerMenuItemSet_NewPerson.NewContactPickerMenuItemSet_OtherPerson;
import pcftest.ContextObjectContactPickerMenuItemSet.NewContactPickerMenuItemSet_NewVendor;
import pcftest.ContextObjectContactPickerMenuItemSet.NewContactPickerMenuItemSet_NewVendor.NewContactPickerMenuItemSet_Attorney;
import pcftest.ContextObjectContactPickerMenuItemSet.NewContactPickerMenuItemSet_NewVendor.NewContactPickerMenuItemSet_AutoRepairShop;
import pcftest.ContextObjectContactPickerMenuItemSet.NewContactPickerMenuItemSet_NewVendor.NewContactPickerMenuItemSet_AutoTowingAgcy;
import pcftest.ContextObjectContactPickerMenuItemSet.NewContactPickerMenuItemSet_NewVendor.NewContactPickerMenuItemSet_CompanyVendor;
import pcftest.ContextObjectContactPickerMenuItemSet.NewContactPickerMenuItemSet_NewVendor.NewContactPickerMenuItemSet_Doctor;
import pcftest.ContextObjectContactPickerMenuItemSet.NewContactPickerMenuItemSet_NewVendor.NewContactPickerMenuItemSet_LawFirm;
import pcftest.ContextObjectContactPickerMenuItemSet.NewContactPickerMenuItemSet_NewVendor.NewContactPickerMenuItemSet_MedicalCareOrg;
import pcftest.ContextObjectContactPickerMenuItemSet.UserContactSearch;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/shared/documents/ContextObjectContactPickerMenuItemSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ContextObjectContactPickerMenuItemSet extends PCFElement {
  public final static String CHECKSUM = "f364bc7fb6bfae6d2228faad65ce536f";
  
  public ContextObjectContactPickerMenuItemSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public AddressBookContactSearch getAddressBookContactSearch() {
    return getOrCreateProperty("AddressBookContactSearch", "AddressBookContactSearch", null, pcftest.ContextObjectContactPickerMenuItemSet.AddressBookContactSearch.class);
  }
  
  public NewContactPickerMenuItemSet_NewCompany getNewContactPickerMenuItemSet_NewCompany() {
    return getOrCreateProperty("NewContactPickerMenuItemSet_NewCompany", "NewContactPickerMenuItemSet_NewCompany", null, pcftest.ContextObjectContactPickerMenuItemSet.NewContactPickerMenuItemSet_NewCompany.class);
  }
  
  public NewContactPickerMenuItemSet_NewLegalVenue getNewContactPickerMenuItemSet_NewLegalVenue() {
    return getOrCreateProperty("NewContactPickerMenuItemSet_NewLegalVenue", "NewContactPickerMenuItemSet_NewLegalVenue", null, pcftest.ContextObjectContactPickerMenuItemSet.NewContactPickerMenuItemSet_NewLegalVenue.class);
  }
  
  public NewContactPickerMenuItemSet_NewPerson getNewContactPickerMenuItemSet_NewPerson() {
    return getOrCreateProperty("NewContactPickerMenuItemSet_NewPerson", "NewContactPickerMenuItemSet_NewPerson", null, pcftest.ContextObjectContactPickerMenuItemSet.NewContactPickerMenuItemSet_NewPerson.class);
  }
  
  public NewContactPickerMenuItemSet_NewVendor getNewContactPickerMenuItemSet_NewVendor() {
    return getOrCreateProperty("NewContactPickerMenuItemSet_NewVendor", "NewContactPickerMenuItemSet_NewVendor", null, pcftest.ContextObjectContactPickerMenuItemSet.NewContactPickerMenuItemSet_NewVendor.class);
  }
  
  public UserContactSearch getUserContactSearch() {
    return getOrCreateProperty("UserContactSearch", "UserContactSearch", null, pcftest.ContextObjectContactPickerMenuItemSet.UserContactSearch.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/documents/ContextObjectContactPickerMenuItemSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AddressBookContactSearch extends ClickableActionElement {
    public AddressBookContactSearch(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public AddressBookPickerPopup click() {
      return clickThis(pcftest.AddressBookPickerPopup.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/documents/ContextObjectContactPickerMenuItemSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewContactPickerMenuItemSet_NewCompany extends ClickableActionElement {
    public NewContactPickerMenuItemSet_NewCompany(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public NewContactPopup click() {
      return clickThis(pcftest.NewContactPopup.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/documents/ContextObjectContactPickerMenuItemSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewContactPickerMenuItemSet_NewLegalVenue extends ClickableActionElement {
    public NewContactPickerMenuItemSet_NewLegalVenue(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public NewContactPopup click() {
      return clickThis(pcftest.NewContactPopup.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/documents/ContextObjectContactPickerMenuItemSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewContactPickerMenuItemSet_NewPerson extends ClickableActionElement {
    public NewContactPickerMenuItemSet_NewPerson(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public NewContactPickerMenuItemSet_Adjudicator getNewContactPickerMenuItemSet_Adjudicator() {
      return getOrCreateProperty("NewContactPickerMenuItemSet_Adjudicator", "NewContactPickerMenuItemSet_Adjudicator", null, pcftest.ContextObjectContactPickerMenuItemSet.NewContactPickerMenuItemSet_NewPerson.NewContactPickerMenuItemSet_Adjudicator.class);
    }
    
    public NewContactPickerMenuItemSet_OtherPerson getNewContactPickerMenuItemSet_OtherPerson() {
      return getOrCreateProperty("NewContactPickerMenuItemSet_OtherPerson", "NewContactPickerMenuItemSet_OtherPerson", null, pcftest.ContextObjectContactPickerMenuItemSet.NewContactPickerMenuItemSet_NewPerson.NewContactPickerMenuItemSet_OtherPerson.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/documents/ContextObjectContactPickerMenuItemSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class NewContactPickerMenuItemSet_Adjudicator extends ClickableActionElement {
      public NewContactPickerMenuItemSet_Adjudicator(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public NewContactPopup click() {
        return clickThis(pcftest.NewContactPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/documents/ContextObjectContactPickerMenuItemSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class NewContactPickerMenuItemSet_OtherPerson extends ClickableActionElement {
      public NewContactPickerMenuItemSet_OtherPerson(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public NewContactPopup click() {
        return clickThis(pcftest.NewContactPopup.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/documents/ContextObjectContactPickerMenuItemSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewContactPickerMenuItemSet_NewVendor extends ClickableActionElement {
    public NewContactPickerMenuItemSet_NewVendor(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public NewContactPickerMenuItemSet_Attorney getNewContactPickerMenuItemSet_Attorney() {
      return getOrCreateProperty("NewContactPickerMenuItemSet_Attorney", "NewContactPickerMenuItemSet_Attorney", null, pcftest.ContextObjectContactPickerMenuItemSet.NewContactPickerMenuItemSet_NewVendor.NewContactPickerMenuItemSet_Attorney.class);
    }
    
    public NewContactPickerMenuItemSet_AutoRepairShop getNewContactPickerMenuItemSet_AutoRepairShop() {
      return getOrCreateProperty("NewContactPickerMenuItemSet_AutoRepairShop", "NewContactPickerMenuItemSet_AutoRepairShop", null, pcftest.ContextObjectContactPickerMenuItemSet.NewContactPickerMenuItemSet_NewVendor.NewContactPickerMenuItemSet_AutoRepairShop.class);
    }
    
    public NewContactPickerMenuItemSet_AutoTowingAgcy getNewContactPickerMenuItemSet_AutoTowingAgcy() {
      return getOrCreateProperty("NewContactPickerMenuItemSet_AutoTowingAgcy", "NewContactPickerMenuItemSet_AutoTowingAgcy", null, pcftest.ContextObjectContactPickerMenuItemSet.NewContactPickerMenuItemSet_NewVendor.NewContactPickerMenuItemSet_AutoTowingAgcy.class);
    }
    
    public NewContactPickerMenuItemSet_CompanyVendor getNewContactPickerMenuItemSet_CompanyVendor() {
      return getOrCreateProperty("NewContactPickerMenuItemSet_CompanyVendor", "NewContactPickerMenuItemSet_CompanyVendor", null, pcftest.ContextObjectContactPickerMenuItemSet.NewContactPickerMenuItemSet_NewVendor.NewContactPickerMenuItemSet_CompanyVendor.class);
    }
    
    public NewContactPickerMenuItemSet_Doctor getNewContactPickerMenuItemSet_Doctor() {
      return getOrCreateProperty("NewContactPickerMenuItemSet_Doctor", "NewContactPickerMenuItemSet_Doctor", null, pcftest.ContextObjectContactPickerMenuItemSet.NewContactPickerMenuItemSet_NewVendor.NewContactPickerMenuItemSet_Doctor.class);
    }
    
    public NewContactPickerMenuItemSet_LawFirm getNewContactPickerMenuItemSet_LawFirm() {
      return getOrCreateProperty("NewContactPickerMenuItemSet_LawFirm", "NewContactPickerMenuItemSet_LawFirm", null, pcftest.ContextObjectContactPickerMenuItemSet.NewContactPickerMenuItemSet_NewVendor.NewContactPickerMenuItemSet_LawFirm.class);
    }
    
    public NewContactPickerMenuItemSet_MedicalCareOrg getNewContactPickerMenuItemSet_MedicalCareOrg() {
      return getOrCreateProperty("NewContactPickerMenuItemSet_MedicalCareOrg", "NewContactPickerMenuItemSet_MedicalCareOrg", null, pcftest.ContextObjectContactPickerMenuItemSet.NewContactPickerMenuItemSet_NewVendor.NewContactPickerMenuItemSet_MedicalCareOrg.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/documents/ContextObjectContactPickerMenuItemSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class NewContactPickerMenuItemSet_Attorney extends ClickableActionElement {
      public NewContactPickerMenuItemSet_Attorney(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public NewContactPopup click() {
        return clickThis(pcftest.NewContactPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/documents/ContextObjectContactPickerMenuItemSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class NewContactPickerMenuItemSet_AutoRepairShop extends ClickableActionElement {
      public NewContactPickerMenuItemSet_AutoRepairShop(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public NewContactPopup click() {
        return clickThis(pcftest.NewContactPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/documents/ContextObjectContactPickerMenuItemSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class NewContactPickerMenuItemSet_AutoTowingAgcy extends ClickableActionElement {
      public NewContactPickerMenuItemSet_AutoTowingAgcy(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public NewContactPopup click() {
        return clickThis(pcftest.NewContactPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/documents/ContextObjectContactPickerMenuItemSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class NewContactPickerMenuItemSet_CompanyVendor extends ClickableActionElement {
      public NewContactPickerMenuItemSet_CompanyVendor(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public NewContactPopup click() {
        return clickThis(pcftest.NewContactPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/documents/ContextObjectContactPickerMenuItemSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class NewContactPickerMenuItemSet_Doctor extends ClickableActionElement {
      public NewContactPickerMenuItemSet_Doctor(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public NewContactPopup click() {
        return clickThis(pcftest.NewContactPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/documents/ContextObjectContactPickerMenuItemSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class NewContactPickerMenuItemSet_LawFirm extends ClickableActionElement {
      public NewContactPickerMenuItemSet_LawFirm(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public NewContactPopup click() {
        return clickThis(pcftest.NewContactPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/documents/ContextObjectContactPickerMenuItemSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class NewContactPickerMenuItemSet_MedicalCareOrg extends ClickableActionElement {
      public NewContactPickerMenuItemSet_MedicalCareOrg(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public NewContactPopup click() {
        return clickThis(pcftest.NewContactPopup.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/documents/ContextObjectContactPickerMenuItemSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class UserContactSearch extends ClickableActionElement {
    public UserContactSearch(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public UserSearchPopup click() {
      return clickThis(pcftest.UserSearchPopup.class);
    }
    
    
  }
  
  
}