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
import pcftest.IncidentAssessSourcePopup.EditAssessmentSourceScreen;
import pcftest.IncidentAssessSourcePopup.EditAssessmentSourceScreen.Cancel;
import pcftest.IncidentAssessSourcePopup.EditAssessmentSourceScreen.Edit;
import pcftest.IncidentAssessSourcePopup.EditAssessmentSourceScreen.Update;
import pcftest.IncidentAssessSourcePopup.EditAssessmentSourceScreen._msgs;
import pcftest.IncidentAssessSourcePopup.IncidentAssessSourcePopup_UpLink;
import pcftest.IncidentAssessSourcePopup._Paging;
import pcftest.IncidentAssessSourcePopup.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/assessment/AssessmentSource/IncidentAssessSourcePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class IncidentAssessSourcePopup extends PCFLocation {
  public final static String CHECKSUM = "c3099683565eb3b8fbb57b709085bd7b";
  
  public IncidentAssessSourcePopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("IncidentAssessSourcePopup"));
  }
  
  public EditAssessmentSourceScreen getEditAssessmentSourceScreen() {
    return getOrCreateProperty("EditAssessmentSourceScreen", "EditAssessmentSourceScreen", null, pcftest.IncidentAssessSourcePopup.EditAssessmentSourceScreen.class);
  }
  
  public IncidentAssessSourcePopup_UpLink getIncidentAssessSourcePopup_UpLink() {
    return getOrCreateProperty("IncidentAssessSourcePopup_UpLink", "IncidentAssessSourcePopup_UpLink", null, pcftest.IncidentAssessSourcePopup.IncidentAssessSourcePopup_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.IncidentAssessSourcePopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.IncidentAssessSourcePopup.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/assessment/AssessmentSource/IncidentAssessSourcePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditAssessmentSourceScreen extends PCFElement {
    public EditAssessmentSourceScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Cancel getCancel() {
      return getOrCreateProperty("Cancel", "Cancel", null, pcftest.IncidentAssessSourcePopup.EditAssessmentSourceScreen.Cancel.class);
    }
    
    public Edit getEdit() {
      return getOrCreateProperty("Edit", "Edit", null, pcftest.IncidentAssessSourcePopup.EditAssessmentSourceScreen.Edit.class);
    }
    
    public IncidentAssessSourceDetailsDV getIncidentAssessSourceDetailsDV() {
      return getOrCreateProperty("IncidentAssessSourceDetailsDV", "IncidentAssessSourceDetailsDV", null, pcftest.IncidentAssessSourceDetailsDV.class);
    }
    
    public Update getUpdate() {
      return getOrCreateProperty("Update", "Update", null, pcftest.IncidentAssessSourcePopup.EditAssessmentSourceScreen.Update.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.IncidentAssessSourcePopup.EditAssessmentSourceScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/assessment/AssessmentSource/IncidentAssessSourcePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Cancel extends ClickableActionElement {
      public Cancel(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/assessment/AssessmentSource/IncidentAssessSourcePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Edit extends ClickableActionElement {
      public Edit(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/assessment/AssessmentSource/IncidentAssessSourcePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Update extends ClickableActionElement {
      public Update(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/assessment/AssessmentSource/IncidentAssessSourcePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/assessment/AssessmentSource/IncidentAssessSourcePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IncidentAssessSourcePopup_UpLink extends ClickableActionElement {
    public IncidentAssessSourcePopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/assessment/AssessmentSource/IncidentAssessSourcePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/assessment/AssessmentSource/IncidentAssessSourcePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}