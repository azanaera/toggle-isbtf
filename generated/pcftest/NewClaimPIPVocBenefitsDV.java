package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.NewClaimPIPVocBenefitsDV.LostWagesBenefits_CaseManagementCompany;
import pcftest.NewClaimPIPVocBenefitsDV.LostWagesBenefits_CaseManager;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/FNOL/NewClaimPIPVocBenefitsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NewClaimPIPVocBenefitsDV extends DetailViewElement {
  public final static String CHECKSUM = "76722bcb4dc3f36d062dca0512bf2728";
  
  public NewClaimPIPVocBenefitsDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getCaseManagementCompany_PrimaryAddress() {
    return getOrCreateProperty("CaseManagementCompany_PrimaryAddress", "CaseManagementCompany_PrimaryAddress", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getCaseManagementCompany_PrimaryPhone() {
    return getOrCreateProperty("CaseManagementCompany_PrimaryPhone", "CaseManagementCompany_PrimaryPhone", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getCaseMgr_PrimaryPhone() {
    return getOrCreateProperty("CaseMgr_PrimaryPhone", "CaseMgr_PrimaryPhone", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public DateElement getLostWagesBenefits_BenefitsBeginDate() {
    return getOrCreateProperty("LostWagesBenefits_BenefitsBeginDate", "LostWagesBenefits_BenefitsBeginDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public DateElement getLostWagesBenefits_BenefitsEndDate() {
    return getOrCreateProperty("LostWagesBenefits_BenefitsEndDate", "LostWagesBenefits_BenefitsEndDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public LostWagesBenefits_CaseManagementCompany getLostWagesBenefits_CaseManagementCompany() {
    return getOrCreateProperty("LostWagesBenefits_CaseManagementCompany", "LostWagesBenefits_CaseManagementCompany", null, pcftest.NewClaimPIPVocBenefitsDV.LostWagesBenefits_CaseManagementCompany.class);
  }
  
  public LostWagesBenefits_CaseManager getLostWagesBenefits_CaseManager() {
    return getOrCreateProperty("LostWagesBenefits_CaseManager", "LostWagesBenefits_CaseManager", null, pcftest.NewClaimPIPVocBenefitsDV.LostWagesBenefits_CaseManager.class);
  }
  
  public ValueElement getLostWagesBenefits_Description() {
    return getOrCreateProperty("LostWagesBenefits_Description", "LostWagesBenefits_Description", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/widgets/ClaimContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LostWagesBenefits_CaseManagementCompany extends SelectElement {
    public LostWagesBenefits_CaseManagementCompany(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimContactDetailPopup click() {
      return clickThis(pcftest.ClaimContactDetailPopup.class);
    }
    
    public ClaimNewContactPickerMenuItemSet getClaimNewContactPickerMenuItemSet() {
      return getOrCreateProperty("ClaimNewContactPickerMenuItemSet", "ClaimNewContactPickerMenuItemSet", null, pcftest.ClaimNewContactPickerMenuItemSet.class);
    }
    
    public pcftest.NewClaimPIPVocBenefitsDV.LostWagesBenefits_CaseManagementCompany.MenuItem_Search getMenuItem_Search() {
      return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.NewClaimPIPVocBenefitsDV.LostWagesBenefits_CaseManagementCompany.MenuItem_Search.class);
    }
    
    public pcftest.NewClaimPIPVocBenefitsDV.LostWagesBenefits_CaseManagementCompany.MenuItem_ViewDetails getMenuItem_ViewDetails() {
      return getOrCreateProperty("MenuItem_ViewDetails", "MenuItem_ViewDetails", null, pcftest.NewClaimPIPVocBenefitsDV.LostWagesBenefits_CaseManagementCompany.MenuItem_ViewDetails.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/widgets/ClaimContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class MenuItem_Search extends ClickableActionElement {
      public MenuItem_Search(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public AddressBookPickerPopup click() {
        return clickThis(pcftest.AddressBookPickerPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/widgets/ClaimContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class MenuItem_ViewDetails extends ClickableActionElement {
      public MenuItem_ViewDetails(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/widgets/ClaimContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LostWagesBenefits_CaseManager extends SelectElement {
    public LostWagesBenefits_CaseManager(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimContactDetailPopup click() {
      return clickThis(pcftest.ClaimContactDetailPopup.class);
    }
    
    public ClaimNewContactPickerMenuItemSet getClaimNewContactPickerMenuItemSet() {
      return getOrCreateProperty("ClaimNewContactPickerMenuItemSet", "ClaimNewContactPickerMenuItemSet", null, pcftest.ClaimNewContactPickerMenuItemSet.class);
    }
    
    public pcftest.NewClaimPIPVocBenefitsDV.LostWagesBenefits_CaseManager.MenuItem_Search getMenuItem_Search() {
      return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.NewClaimPIPVocBenefitsDV.LostWagesBenefits_CaseManager.MenuItem_Search.class);
    }
    
    public pcftest.NewClaimPIPVocBenefitsDV.LostWagesBenefits_CaseManager.MenuItem_ViewDetails getMenuItem_ViewDetails() {
      return getOrCreateProperty("MenuItem_ViewDetails", "MenuItem_ViewDetails", null, pcftest.NewClaimPIPVocBenefitsDV.LostWagesBenefits_CaseManager.MenuItem_ViewDetails.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/widgets/ClaimContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class MenuItem_Search extends ClickableActionElement {
      public MenuItem_Search(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public AddressBookPickerPopup click() {
        return clickThis(pcftest.AddressBookPickerPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/widgets/ClaimContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class MenuItem_ViewDetails extends ClickableActionElement {
      public MenuItem_ViewDetails(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  
}