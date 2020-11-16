package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ClaimNewServiceRequestSpecialistPickerMenuItemSet.NewLegal;
import pcftest.ClaimNewServiceRequestSpecialistPickerMenuItemSet.NewLegal.NewAdjudicator;
import pcftest.ClaimNewServiceRequestSpecialistPickerMenuItemSet.NewLegal.NewAttorney;
import pcftest.ClaimNewServiceRequestSpecialistPickerMenuItemSet.NewLegal.NewLawFirm;
import pcftest.ClaimNewServiceRequestSpecialistPickerMenuItemSet.NewVendor;
import pcftest.ClaimNewServiceRequestSpecialistPickerMenuItemSet.NewVendor.NewAutoRepairShop;
import pcftest.ClaimNewServiceRequestSpecialistPickerMenuItemSet.NewVendor.NewAutoTowingAgency;
import pcftest.ClaimNewServiceRequestSpecialistPickerMenuItemSet.NewVendor.NewCompanyVendor;
import pcftest.ClaimNewServiceRequestSpecialistPickerMenuItemSet.NewVendor.NewDoctor;
import pcftest.ClaimNewServiceRequestSpecialistPickerMenuItemSet.NewVendor.NewMedicalCareOrg;
import pcftest.ClaimNewServiceRequestSpecialistPickerMenuItemSet.NewVendor.NewPersonVendor;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/shared/contacts/ClaimNewServiceRequestSpecialistPickerMenuItemSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimNewServiceRequestSpecialistPickerMenuItemSet extends PCFElement {
  public final static String CHECKSUM = "e46ec05e1754b0652752bf62249f4729";
  
  public ClaimNewServiceRequestSpecialistPickerMenuItemSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public NewLegal getNewLegal() {
    return getOrCreateProperty("NewLegal", "NewLegal", null, pcftest.ClaimNewServiceRequestSpecialistPickerMenuItemSet.NewLegal.class);
  }
  
  public NewVendor getNewVendor() {
    return getOrCreateProperty("NewVendor", "NewVendor", null, pcftest.ClaimNewServiceRequestSpecialistPickerMenuItemSet.NewVendor.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/contacts/ClaimNewServiceRequestSpecialistPickerMenuItemSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewLegal extends ClickableActionElement {
    public NewLegal(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public NewAdjudicator getNewAdjudicator() {
      return getOrCreateProperty("NewAdjudicator", "NewAdjudicator", null, pcftest.ClaimNewServiceRequestSpecialistPickerMenuItemSet.NewLegal.NewAdjudicator.class);
    }
    
    public NewAttorney getNewAttorney() {
      return getOrCreateProperty("NewAttorney", "NewAttorney", null, pcftest.ClaimNewServiceRequestSpecialistPickerMenuItemSet.NewLegal.NewAttorney.class);
    }
    
    public NewLawFirm getNewLawFirm() {
      return getOrCreateProperty("NewLawFirm", "NewLawFirm", null, pcftest.ClaimNewServiceRequestSpecialistPickerMenuItemSet.NewLegal.NewLawFirm.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/contacts/ClaimNewServiceRequestSpecialistPickerMenuItemSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class NewAdjudicator extends ClickableActionElement {
      public NewAdjudicator(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public NewContactPopup click() {
        return clickThis(pcftest.NewContactPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/contacts/ClaimNewServiceRequestSpecialistPickerMenuItemSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class NewAttorney extends ClickableActionElement {
      public NewAttorney(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public NewContactPopup click() {
        return clickThis(pcftest.NewContactPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/contacts/ClaimNewServiceRequestSpecialistPickerMenuItemSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class NewLawFirm extends ClickableActionElement {
      public NewLawFirm(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public NewContactPopup click() {
        return clickThis(pcftest.NewContactPopup.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/contacts/ClaimNewServiceRequestSpecialistPickerMenuItemSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewVendor extends ClickableActionElement {
    public NewVendor(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public NewAutoRepairShop getNewAutoRepairShop() {
      return getOrCreateProperty("NewAutoRepairShop", "NewAutoRepairShop", null, pcftest.ClaimNewServiceRequestSpecialistPickerMenuItemSet.NewVendor.NewAutoRepairShop.class);
    }
    
    public NewAutoTowingAgency getNewAutoTowingAgency() {
      return getOrCreateProperty("NewAutoTowingAgency", "NewAutoTowingAgency", null, pcftest.ClaimNewServiceRequestSpecialistPickerMenuItemSet.NewVendor.NewAutoTowingAgency.class);
    }
    
    public NewCompanyVendor getNewCompanyVendor() {
      return getOrCreateProperty("NewCompanyVendor", "NewCompanyVendor", null, pcftest.ClaimNewServiceRequestSpecialistPickerMenuItemSet.NewVendor.NewCompanyVendor.class);
    }
    
    public NewDoctor getNewDoctor() {
      return getOrCreateProperty("NewDoctor", "NewDoctor", null, pcftest.ClaimNewServiceRequestSpecialistPickerMenuItemSet.NewVendor.NewDoctor.class);
    }
    
    public NewMedicalCareOrg getNewMedicalCareOrg() {
      return getOrCreateProperty("NewMedicalCareOrg", "NewMedicalCareOrg", null, pcftest.ClaimNewServiceRequestSpecialistPickerMenuItemSet.NewVendor.NewMedicalCareOrg.class);
    }
    
    public NewPersonVendor getNewPersonVendor() {
      return getOrCreateProperty("NewPersonVendor", "NewPersonVendor", null, pcftest.ClaimNewServiceRequestSpecialistPickerMenuItemSet.NewVendor.NewPersonVendor.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/contacts/ClaimNewServiceRequestSpecialistPickerMenuItemSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class NewAutoRepairShop extends ClickableActionElement {
      public NewAutoRepairShop(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public NewContactPopup click() {
        return clickThis(pcftest.NewContactPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/contacts/ClaimNewServiceRequestSpecialistPickerMenuItemSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class NewAutoTowingAgency extends ClickableActionElement {
      public NewAutoTowingAgency(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public NewContactPopup click() {
        return clickThis(pcftest.NewContactPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/contacts/ClaimNewServiceRequestSpecialistPickerMenuItemSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class NewCompanyVendor extends ClickableActionElement {
      public NewCompanyVendor(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public NewContactPopup click() {
        return clickThis(pcftest.NewContactPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/contacts/ClaimNewServiceRequestSpecialistPickerMenuItemSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class NewDoctor extends ClickableActionElement {
      public NewDoctor(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public NewContactPopup click() {
        return clickThis(pcftest.NewContactPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/contacts/ClaimNewServiceRequestSpecialistPickerMenuItemSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class NewMedicalCareOrg extends ClickableActionElement {
      public NewMedicalCareOrg(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public NewContactPopup click() {
        return clickThis(pcftest.NewContactPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/contacts/ClaimNewServiceRequestSpecialistPickerMenuItemSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class NewPersonVendor extends ClickableActionElement {
      public NewPersonVendor(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public NewContactPopup click() {
        return clickThis(pcftest.NewContactPopup.class);
      }
      
      
    }
    
    
  }
  
  
}