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
import pcftest.NewExposure.NewExposureScreen;
import pcftest.NewExposure.NewExposureScreen.Cancel;
import pcftest.NewExposure.NewExposureScreen.CoverageAndFaultConflictAlert;
import pcftest.NewExposure.NewExposureScreen.Edit;
import pcftest.NewExposure.NewExposureScreen.Update;
import pcftest.NewExposure.NewExposureScreen._msgs;
import pcftest.NewExposure.NewExposureScreen.incompatibleNewExposureAlert;
import pcftest.NewExposure.NewExposureScreen.invalidCoverageForCauseAlert;
import pcftest.NewExposure.NewExposure_UpLink;
import pcftest.NewExposure._Paging;
import pcftest.NewExposure.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/newexposure/NewExposure.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NewExposure extends PCFLocation {
  public final static String CHECKSUM = "34dec1380ec5d4c626c7e16291440960";
  
  public NewExposure(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("NewExposure"));
  }
  
  public NewExposureScreen getNewExposureScreen() {
    return getOrCreateProperty("NewExposureScreen", "NewExposureScreen", null, pcftest.NewExposure.NewExposureScreen.class);
  }
  
  public NewExposure_UpLink getNewExposure_UpLink() {
    return getOrCreateProperty("NewExposure_UpLink", "NewExposure_UpLink", null, pcftest.NewExposure.NewExposure_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.NewExposure._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.NewExposure.__crumb__.class);
  }
  
  public Claim get_parent() {
    return getOrCreateProperty("_parent", pcftest.Claim.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newexposure/NewExposure.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewExposureScreen extends PCFElement {
    public NewExposureScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Cancel getCancel() {
      return getOrCreateProperty("Cancel", "Cancel", null, pcftest.NewExposure.NewExposureScreen.Cancel.class);
    }
    
    public CoverageAndFaultConflictAlert getCoverageAndFaultConflictAlert() {
      return getOrCreateProperty("CoverageAndFaultConflictAlert", "CoverageAndFaultConflictAlert", null, pcftest.NewExposure.NewExposureScreen.CoverageAndFaultConflictAlert.class);
    }
    
    public Edit getEdit() {
      return getOrCreateProperty("Edit", "Edit", null, pcftest.NewExposure.NewExposureScreen.Edit.class);
    }
    
    public NewExposureDV_Baggage getNewExposureDV_Baggage() {
      return getOrCreateProperty("NewExposureDV_Baggage", "NewExposureDV", null, pcftest.NewExposureDV_Baggage.class);
    }
    
    public NewExposureDV_Bodilyinjurydamage getNewExposureDV_Bodilyinjurydamage() {
      return getOrCreateProperty("NewExposureDV_Bodilyinjurydamage", "NewExposureDV", null, pcftest.NewExposureDV_Bodilyinjurydamage.class);
    }
    
    public NewExposureDV_Content getNewExposureDV_Content() {
      return getOrCreateProperty("NewExposureDV_Content", "NewExposureDV", null, pcftest.NewExposureDV_Content.class);
    }
    
    public NewExposureDV_Propertydamage getNewExposureDV_Dwelling() {
      return getOrCreateProperty("NewExposureDV_Dwelling", "NewExposureDV", null, pcftest.NewExposureDV_Propertydamage.class);
    }
    
    public NewExposureDV_Employerliability getNewExposureDV_Employerliability() {
      return getOrCreateProperty("NewExposureDV_Employerliability", "NewExposureDV", null, pcftest.NewExposureDV_Employerliability.class);
    }
    
    public NewExposureDV_Generaldamage getNewExposureDV_Generaldamage() {
      return getOrCreateProperty("NewExposureDV_Generaldamage", "NewExposureDV", null, pcftest.NewExposureDV_Generaldamage.class);
    }
    
    public NewExposureDV_LivingExpenses getNewExposureDV_LivingExpenses() {
      return getOrCreateProperty("NewExposureDV_LivingExpenses", "NewExposureDV", null, pcftest.NewExposureDV_LivingExpenses.class);
    }
    
    public NewExposureDV_Lossofusedamage getNewExposureDV_Lossofusedamage() {
      return getOrCreateProperty("NewExposureDV_Lossofusedamage", "NewExposureDV", null, pcftest.NewExposureDV_Lossofusedamage.class);
    }
    
    public NewExposureDV_Lostwages getNewExposureDV_Lostwages() {
      return getOrCreateProperty("NewExposureDV_Lostwages", "NewExposureDV", null, pcftest.NewExposureDV_Lostwages.class);
    }
    
    public NewExposureDV_Medpay getNewExposureDV_Medpay() {
      return getOrCreateProperty("NewExposureDV_Medpay", "NewExposureDV", null, pcftest.NewExposureDV_Medpay.class);
    }
    
    public NewExposureDV_OtherStructure getNewExposureDV_OtherStructure() {
      return getOrCreateProperty("NewExposureDV_OtherStructure", "NewExposureDV", null, pcftest.NewExposureDV_OtherStructure.class);
    }
    
    public NewExposureDV_Personalpropertydamage getNewExposureDV_Personalpropertydamage() {
      return getOrCreateProperty("NewExposureDV_Personalpropertydamage", "NewExposureDV", null, pcftest.NewExposureDV_Personalpropertydamage.class);
    }
    
    public NewExposureDV_Pipdamages getNewExposureDV_Pipdamages() {
      return getOrCreateProperty("NewExposureDV_Pipdamages", "NewExposureDV", null, pcftest.NewExposureDV_Pipdamages.class);
    }
    
    public NewExposureDV_Propertydamage getNewExposureDV_Propertydamage() {
      return getOrCreateProperty("NewExposureDV_Propertydamage", "NewExposureDV", null, pcftest.NewExposureDV_Propertydamage.class);
    }
    
    public NewExposureDV_Towonly getNewExposureDV_Towonly() {
      return getOrCreateProperty("NewExposureDV_Towonly", "NewExposureDV", null, pcftest.NewExposureDV_Towonly.class);
    }
    
    public NewExposureDV_TripCancellationDelay getNewExposureDV_TripCancellationDelay() {
      return getOrCreateProperty("NewExposureDV_TripCancellationDelay", "NewExposureDV", null, pcftest.NewExposureDV_TripCancellationDelay.class);
    }
    
    public NewExposureDV_Vehicledamage getNewExposureDV_Vehicledamage() {
      return getOrCreateProperty("NewExposureDV_Vehicledamage", "NewExposureDV", null, pcftest.NewExposureDV_Vehicledamage.class);
    }
    
    public NewExposureDV_Wcinjurydamage getNewExposureDV_Wcinjurydamage() {
      return getOrCreateProperty("NewExposureDV_Wcinjurydamage", "NewExposureDV", null, pcftest.NewExposureDV_Wcinjurydamage.class);
    }
    
    public Update getUpdate() {
      return getOrCreateProperty("Update", "Update", null, pcftest.NewExposure.NewExposureScreen.Update.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.NewExposure.NewExposureScreen._msgs.class);
    }
    
    public incompatibleNewExposureAlert getincompatibleNewExposureAlert() {
      return getOrCreateProperty("incompatibleNewExposureAlert", "incompatibleNewExposureAlert", null, pcftest.NewExposure.NewExposureScreen.incompatibleNewExposureAlert.class);
    }
    
    public invalidCoverageForCauseAlert getinvalidCoverageForCauseAlert() {
      return getOrCreateProperty("invalidCoverageForCauseAlert", "invalidCoverageForCauseAlert", null, pcftest.NewExposure.NewExposureScreen.invalidCoverageForCauseAlert.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newexposure/NewExposure.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Cancel extends ClickableActionElement {
      public Cancel(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newexposure/NewExposure.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CoverageAndFaultConflictAlert extends ClickableActionElement {
      public CoverageAndFaultConflictAlert(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public pcftest.NewExposure.NewExposureScreen.CoverageAndFaultConflictAlert.CloseBtn getCloseBtn() {
        return getOrCreateProperty("CloseBtn", "CloseBtn", null, pcftest.NewExposure.NewExposureScreen.CoverageAndFaultConflictAlert.CloseBtn.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/newexposure/NewExposure.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/claim/newexposure/NewExposure.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Edit extends ClickableActionElement {
      public Edit(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newexposure/NewExposure.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Update extends ClickableActionElement {
      public Update(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newexposure/NewExposure.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _msgs extends MessagesElement {
      public _msgs(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newexposure/NewExposure.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class incompatibleNewExposureAlert extends ClickableActionElement {
      public incompatibleNewExposureAlert(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public pcftest.NewExposure.NewExposureScreen.incompatibleNewExposureAlert.CloseBtn getCloseBtn() {
        return getOrCreateProperty("CloseBtn", "CloseBtn", null, pcftest.NewExposure.NewExposureScreen.incompatibleNewExposureAlert.CloseBtn.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/newexposure/NewExposure.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/claim/newexposure/NewExposure.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class invalidCoverageForCauseAlert extends ClickableActionElement {
      public invalidCoverageForCauseAlert(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public pcftest.NewExposure.NewExposureScreen.invalidCoverageForCauseAlert.CloseBtn getCloseBtn() {
        return getOrCreateProperty("CloseBtn", "CloseBtn", null, pcftest.NewExposure.NewExposureScreen.invalidCoverageForCauseAlert.CloseBtn.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/newexposure/NewExposure.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/newexposure/NewExposure.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewExposure_UpLink extends ClickableActionElement {
    public NewExposure_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newexposure/NewExposure.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newexposure/NewExposure.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}