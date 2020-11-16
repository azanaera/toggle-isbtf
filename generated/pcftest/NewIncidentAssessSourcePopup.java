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
import pcftest.NewIncidentAssessSourcePopup.EditAssessmentSourceScreen;
import pcftest.NewIncidentAssessSourcePopup.EditAssessmentSourceScreen.Cancel;
import pcftest.NewIncidentAssessSourcePopup.EditAssessmentSourceScreen.Edit;
import pcftest.NewIncidentAssessSourcePopup.EditAssessmentSourceScreen.Update;
import pcftest.NewIncidentAssessSourcePopup.EditAssessmentSourceScreen._msgs;
import pcftest.NewIncidentAssessSourcePopup.NewIncidentAssessSourcePopup_UpLink;
import pcftest.NewIncidentAssessSourcePopup._Paging;
import pcftest.NewIncidentAssessSourcePopup.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/assessment/AssessmentSource/NewIncidentAssessSourcePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NewIncidentAssessSourcePopup extends PCFLocation {
  public final static String CHECKSUM = "5d75718005c5b5191a6612d63cce78c3";
  
  public NewIncidentAssessSourcePopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("NewIncidentAssessSourcePopup"));
  }
  
  public EditAssessmentSourceScreen getEditAssessmentSourceScreen() {
    return getOrCreateProperty("EditAssessmentSourceScreen", "EditAssessmentSourceScreen", null, pcftest.NewIncidentAssessSourcePopup.EditAssessmentSourceScreen.class);
  }
  
  public NewIncidentAssessSourcePopup_UpLink getNewIncidentAssessSourcePopup_UpLink() {
    return getOrCreateProperty("NewIncidentAssessSourcePopup_UpLink", "NewIncidentAssessSourcePopup_UpLink", null, pcftest.NewIncidentAssessSourcePopup.NewIncidentAssessSourcePopup_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.NewIncidentAssessSourcePopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.NewIncidentAssessSourcePopup.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/assessment/AssessmentSource/NewIncidentAssessSourcePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditAssessmentSourceScreen extends PCFElement {
    public EditAssessmentSourceScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Cancel getCancel() {
      return getOrCreateProperty("Cancel", "Cancel", null, pcftest.NewIncidentAssessSourcePopup.EditAssessmentSourceScreen.Cancel.class);
    }
    
    public Edit getEdit() {
      return getOrCreateProperty("Edit", "Edit", null, pcftest.NewIncidentAssessSourcePopup.EditAssessmentSourceScreen.Edit.class);
    }
    
    public IncidentAssessSourceDetailsDV getIncidentAssessSourceDetailsDV() {
      return getOrCreateProperty("IncidentAssessSourceDetailsDV", "IncidentAssessSourceDetailsDV", null, pcftest.IncidentAssessSourceDetailsDV.class);
    }
    
    public Update getUpdate() {
      return getOrCreateProperty("Update", "Update", null, pcftest.NewIncidentAssessSourcePopup.EditAssessmentSourceScreen.Update.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.NewIncidentAssessSourcePopup.EditAssessmentSourceScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/assessment/AssessmentSource/NewIncidentAssessSourcePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Cancel extends ClickableActionElement {
      public Cancel(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/assessment/AssessmentSource/NewIncidentAssessSourcePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Edit extends ClickableActionElement {
      public Edit(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/assessment/AssessmentSource/NewIncidentAssessSourcePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Update extends ClickableActionElement {
      public Update(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/assessment/AssessmentSource/NewIncidentAssessSourcePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/assessment/AssessmentSource/NewIncidentAssessSourcePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewIncidentAssessSourcePopup_UpLink extends ClickableActionElement {
    public NewIncidentAssessSourcePopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/assessment/AssessmentSource/NewIncidentAssessSourcePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/assessment/AssessmentSource/NewIncidentAssessSourcePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}