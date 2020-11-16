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
import pcftest.NewFixPropAssessSourcePopup.EditAssessmentSourceScreen;
import pcftest.NewFixPropAssessSourcePopup.EditAssessmentSourceScreen.Cancel;
import pcftest.NewFixPropAssessSourcePopup.EditAssessmentSourceScreen.Edit;
import pcftest.NewFixPropAssessSourcePopup.EditAssessmentSourceScreen.Update;
import pcftest.NewFixPropAssessSourcePopup.EditAssessmentSourceScreen._msgs;
import pcftest.NewFixPropAssessSourcePopup.NewFixPropAssessSourcePopup_UpLink;
import pcftest.NewFixPropAssessSourcePopup._Paging;
import pcftest.NewFixPropAssessSourcePopup.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/assessment/AssessmentSource/NewFixPropAssessSourcePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NewFixPropAssessSourcePopup extends PCFLocation {
  public final static String CHECKSUM = "c1812a3f10379f1f05e63717b17411af";
  
  public NewFixPropAssessSourcePopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("NewFixPropAssessSourcePopup"));
  }
  
  public EditAssessmentSourceScreen getEditAssessmentSourceScreen() {
    return getOrCreateProperty("EditAssessmentSourceScreen", "EditAssessmentSourceScreen", null, pcftest.NewFixPropAssessSourcePopup.EditAssessmentSourceScreen.class);
  }
  
  public NewFixPropAssessSourcePopup_UpLink getNewFixPropAssessSourcePopup_UpLink() {
    return getOrCreateProperty("NewFixPropAssessSourcePopup_UpLink", "NewFixPropAssessSourcePopup_UpLink", null, pcftest.NewFixPropAssessSourcePopup.NewFixPropAssessSourcePopup_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.NewFixPropAssessSourcePopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.NewFixPropAssessSourcePopup.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/assessment/AssessmentSource/NewFixPropAssessSourcePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditAssessmentSourceScreen extends PCFElement {
    public EditAssessmentSourceScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Cancel getCancel() {
      return getOrCreateProperty("Cancel", "Cancel", null, pcftest.NewFixPropAssessSourcePopup.EditAssessmentSourceScreen.Cancel.class);
    }
    
    public Edit getEdit() {
      return getOrCreateProperty("Edit", "Edit", null, pcftest.NewFixPropAssessSourcePopup.EditAssessmentSourceScreen.Edit.class);
    }
    
    public FixPropAssessSourceDetailsDV getFixPropAssessSourceDetailsDV() {
      return getOrCreateProperty("FixPropAssessSourceDetailsDV", "FixPropAssessSourceDetailsDV", null, pcftest.FixPropAssessSourceDetailsDV.class);
    }
    
    public Update getUpdate() {
      return getOrCreateProperty("Update", "Update", null, pcftest.NewFixPropAssessSourcePopup.EditAssessmentSourceScreen.Update.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.NewFixPropAssessSourcePopup.EditAssessmentSourceScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/assessment/AssessmentSource/NewFixPropAssessSourcePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Cancel extends ClickableActionElement {
      public Cancel(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/assessment/AssessmentSource/NewFixPropAssessSourcePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Edit extends ClickableActionElement {
      public Edit(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/assessment/AssessmentSource/NewFixPropAssessSourcePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Update extends ClickableActionElement {
      public Update(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/assessment/AssessmentSource/NewFixPropAssessSourcePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/assessment/AssessmentSource/NewFixPropAssessSourcePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewFixPropAssessSourcePopup_UpLink extends ClickableActionElement {
    public NewFixPropAssessSourcePopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/assessment/AssessmentSource/NewFixPropAssessSourcePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/assessment/AssessmentSource/NewFixPropAssessSourcePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}