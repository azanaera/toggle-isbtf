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
import pcftest.NewClaimWizard_NewExposurePopup.NewClaimWizard_ExposurePageScreen;
import pcftest.NewClaimWizard_NewExposurePopup.NewClaimWizard_ExposurePageScreen.Cancel;
import pcftest.NewClaimWizard_NewExposurePopup.NewClaimWizard_ExposurePageScreen.CoverageAndFaultConflictAlert;
import pcftest.NewClaimWizard_NewExposurePopup.NewClaimWizard_ExposurePageScreen.Edit;
import pcftest.NewClaimWizard_NewExposurePopup.NewClaimWizard_ExposurePageScreen.Update;
import pcftest.NewClaimWizard_NewExposurePopup.NewClaimWizard_ExposurePageScreen._msgs;
import pcftest.NewClaimWizard_NewExposurePopup.NewClaimWizard_ExposurePageScreen.incompatibleNewExposureAlert;
import pcftest.NewClaimWizard_NewExposurePopup.NewClaimWizard_ExposurePageScreen.invalidCoverageForCauseAlert;
import pcftest.NewClaimWizard_NewExposurePopup.NewClaimWizard_NewExposurePopup_UpLink;
import pcftest.NewClaimWizard_NewExposurePopup._Paging;
import pcftest.NewClaimWizard_NewExposurePopup.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_NewExposurePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NewClaimWizard_NewExposurePopup extends PCFLocation {
  public final static String CHECKSUM = "306bad878c5dee234867d3c5dfc73392";
  
  public NewClaimWizard_NewExposurePopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("NewClaimWizard_NewExposurePopup"));
  }
  
  public NewClaimWizard_ExposurePageScreen getNewClaimWizard_ExposurePageScreen() {
    return getOrCreateProperty("NewClaimWizard_ExposurePageScreen", "NewClaimWizard_ExposurePageScreen", null, pcftest.NewClaimWizard_NewExposurePopup.NewClaimWizard_ExposurePageScreen.class);
  }
  
  public NewClaimWizard_NewExposurePopup_UpLink getNewClaimWizard_NewExposurePopup_UpLink() {
    return getOrCreateProperty("NewClaimWizard_NewExposurePopup_UpLink", "NewClaimWizard_NewExposurePopup_UpLink", null, pcftest.NewClaimWizard_NewExposurePopup.NewClaimWizard_NewExposurePopup_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.NewClaimWizard_NewExposurePopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.NewClaimWizard_NewExposurePopup.__crumb__.class);
  }
  
  public FNOLWizard get_parent() {
    return getOrCreateProperty("_parent", pcftest.FNOLWizard.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_NewExposurePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewClaimWizard_ExposurePageScreen extends PCFElement {
    public NewClaimWizard_ExposurePageScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Cancel getCancel() {
      return getOrCreateProperty("Cancel", "Cancel", null, pcftest.NewClaimWizard_NewExposurePopup.NewClaimWizard_ExposurePageScreen.Cancel.class);
    }
    
    public CoverageAndFaultConflictAlert getCoverageAndFaultConflictAlert() {
      return getOrCreateProperty("CoverageAndFaultConflictAlert", "CoverageAndFaultConflictAlert", null, pcftest.NewClaimWizard_NewExposurePopup.NewClaimWizard_ExposurePageScreen.CoverageAndFaultConflictAlert.class);
    }
    
    public Edit getEdit() {
      return getOrCreateProperty("Edit", "Edit", null, pcftest.NewClaimWizard_NewExposurePopup.NewClaimWizard_ExposurePageScreen.Edit.class);
    }
    
    public NewClaimExposureDV_Baggage getNewClaimExposureDV_Baggage() {
      return getOrCreateProperty("NewClaimExposureDV_Baggage", "NewClaimExposureDV", null, pcftest.NewClaimExposureDV_Baggage.class);
    }
    
    public NewClaimExposureDV_Bodilyinjurydamage getNewClaimExposureDV_Bodilyinjurydamage() {
      return getOrCreateProperty("NewClaimExposureDV_Bodilyinjurydamage", "NewClaimExposureDV", null, pcftest.NewClaimExposureDV_Bodilyinjurydamage.class);
    }
    
    public NewClaimExposureDV_Content getNewClaimExposureDV_Content() {
      return getOrCreateProperty("NewClaimExposureDV_Content", "NewClaimExposureDV", null, pcftest.NewClaimExposureDV_Content.class);
    }
    
    public NewClaimExposureDV_Propertydamage getNewClaimExposureDV_Dwelling() {
      return getOrCreateProperty("NewClaimExposureDV_Dwelling", "NewClaimExposureDV", null, pcftest.NewClaimExposureDV_Propertydamage.class);
    }
    
    public NewClaimExposureDV_Employerliability getNewClaimExposureDV_Employerliability() {
      return getOrCreateProperty("NewClaimExposureDV_Employerliability", "NewClaimExposureDV", null, pcftest.NewClaimExposureDV_Employerliability.class);
    }
    
    public NewClaimExposureDV_Generaldamage getNewClaimExposureDV_Generaldamage() {
      return getOrCreateProperty("NewClaimExposureDV_Generaldamage", "NewClaimExposureDV", null, pcftest.NewClaimExposureDV_Generaldamage.class);
    }
    
    public NewClaimExposureDV_LivingExpenses getNewClaimExposureDV_LivingExpenses() {
      return getOrCreateProperty("NewClaimExposureDV_LivingExpenses", "NewClaimExposureDV", null, pcftest.NewClaimExposureDV_LivingExpenses.class);
    }
    
    public NewClaimExposureDV_Lossofusedamage getNewClaimExposureDV_Lossofusedamage() {
      return getOrCreateProperty("NewClaimExposureDV_Lossofusedamage", "NewClaimExposureDV", null, pcftest.NewClaimExposureDV_Lossofusedamage.class);
    }
    
    public NewClaimExposureDV_Lostwages getNewClaimExposureDV_Lostwages() {
      return getOrCreateProperty("NewClaimExposureDV_Lostwages", "NewClaimExposureDV", null, pcftest.NewClaimExposureDV_Lostwages.class);
    }
    
    public NewClaimExposureDV_Medpay getNewClaimExposureDV_Medpay() {
      return getOrCreateProperty("NewClaimExposureDV_Medpay", "NewClaimExposureDV", null, pcftest.NewClaimExposureDV_Medpay.class);
    }
    
    public NewClaimExposureDV_OtherStructure getNewClaimExposureDV_OtherStructure() {
      return getOrCreateProperty("NewClaimExposureDV_OtherStructure", "NewClaimExposureDV", null, pcftest.NewClaimExposureDV_OtherStructure.class);
    }
    
    public NewClaimExposureDV_Personalpropertydamage getNewClaimExposureDV_Personalpropertydamage() {
      return getOrCreateProperty("NewClaimExposureDV_Personalpropertydamage", "NewClaimExposureDV", null, pcftest.NewClaimExposureDV_Personalpropertydamage.class);
    }
    
    public NewClaimExposureDV_Pipdamages getNewClaimExposureDV_Pipdamages() {
      return getOrCreateProperty("NewClaimExposureDV_Pipdamages", "NewClaimExposureDV", null, pcftest.NewClaimExposureDV_Pipdamages.class);
    }
    
    public NewClaimExposureDV_Propertydamage getNewClaimExposureDV_Propertydamage() {
      return getOrCreateProperty("NewClaimExposureDV_Propertydamage", "NewClaimExposureDV", null, pcftest.NewClaimExposureDV_Propertydamage.class);
    }
    
    public NewClaimExposureDV_Towonly getNewClaimExposureDV_Towonly() {
      return getOrCreateProperty("NewClaimExposureDV_Towonly", "NewClaimExposureDV", null, pcftest.NewClaimExposureDV_Towonly.class);
    }
    
    public NewClaimExposureDV_TripCancellationDelay getNewClaimExposureDV_TripCancellationDelay() {
      return getOrCreateProperty("NewClaimExposureDV_TripCancellationDelay", "NewClaimExposureDV", null, pcftest.NewClaimExposureDV_TripCancellationDelay.class);
    }
    
    public NewClaimExposureDV_Vehicledamage getNewClaimExposureDV_Vehicledamage() {
      return getOrCreateProperty("NewClaimExposureDV_Vehicledamage", "NewClaimExposureDV", null, pcftest.NewClaimExposureDV_Vehicledamage.class);
    }
    
    public NewClaimExposureDV_Wcinjurydamage getNewClaimExposureDV_Wcinjurydamage() {
      return getOrCreateProperty("NewClaimExposureDV_Wcinjurydamage", "NewClaimExposureDV", null, pcftest.NewClaimExposureDV_Wcinjurydamage.class);
    }
    
    public Update getUpdate() {
      return getOrCreateProperty("Update", "Update", null, pcftest.NewClaimWizard_NewExposurePopup.NewClaimWizard_ExposurePageScreen.Update.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.NewClaimWizard_NewExposurePopup.NewClaimWizard_ExposurePageScreen._msgs.class);
    }
    
    public incompatibleNewExposureAlert getincompatibleNewExposureAlert() {
      return getOrCreateProperty("incompatibleNewExposureAlert", "incompatibleNewExposureAlert", null, pcftest.NewClaimWizard_NewExposurePopup.NewClaimWizard_ExposurePageScreen.incompatibleNewExposureAlert.class);
    }
    
    public invalidCoverageForCauseAlert getinvalidCoverageForCauseAlert() {
      return getOrCreateProperty("invalidCoverageForCauseAlert", "invalidCoverageForCauseAlert", null, pcftest.NewClaimWizard_NewExposurePopup.NewClaimWizard_ExposurePageScreen.invalidCoverageForCauseAlert.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_NewExposurePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Cancel extends ClickableActionElement {
      public Cancel(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_NewExposurePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CoverageAndFaultConflictAlert extends ClickableActionElement {
      public CoverageAndFaultConflictAlert(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public pcftest.NewClaimWizard_NewExposurePopup.NewClaimWizard_ExposurePageScreen.CoverageAndFaultConflictAlert.CloseBtn getCloseBtn() {
        return getOrCreateProperty("CloseBtn", "CloseBtn", null, pcftest.NewClaimWizard_NewExposurePopup.NewClaimWizard_ExposurePageScreen.CoverageAndFaultConflictAlert.CloseBtn.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_NewExposurePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class CloseBtn extends ClickableActionElement {
        public CloseBtn(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_NewExposurePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Edit extends ClickableActionElement {
      public Edit(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_NewExposurePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Update extends ClickableActionElement {
      public Update(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_NewExposurePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _msgs extends MessagesElement {
      public _msgs(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_NewExposurePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class incompatibleNewExposureAlert extends ClickableActionElement {
      public incompatibleNewExposureAlert(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public pcftest.NewClaimWizard_NewExposurePopup.NewClaimWizard_ExposurePageScreen.incompatibleNewExposureAlert.CloseBtn getCloseBtn() {
        return getOrCreateProperty("CloseBtn", "CloseBtn", null, pcftest.NewClaimWizard_NewExposurePopup.NewClaimWizard_ExposurePageScreen.incompatibleNewExposureAlert.CloseBtn.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_NewExposurePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class CloseBtn extends ClickableActionElement {
        public CloseBtn(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_NewExposurePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class invalidCoverageForCauseAlert extends ClickableActionElement {
      public invalidCoverageForCauseAlert(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public pcftest.NewClaimWizard_NewExposurePopup.NewClaimWizard_ExposurePageScreen.invalidCoverageForCauseAlert.CloseBtn getCloseBtn() {
        return getOrCreateProperty("CloseBtn", "CloseBtn", null, pcftest.NewClaimWizard_NewExposurePopup.NewClaimWizard_ExposurePageScreen.invalidCoverageForCauseAlert.CloseBtn.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_NewExposurePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class CloseBtn extends ClickableActionElement {
        public CloseBtn(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_NewExposurePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewClaimWizard_NewExposurePopup_UpLink extends ClickableActionElement {
    public NewClaimWizard_NewExposurePopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_NewExposurePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_NewExposurePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}