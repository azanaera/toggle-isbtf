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
import pcftest.NewVehAssessSourcePopup.EditAssessmentSourceScreen;
import pcftest.NewVehAssessSourcePopup.EditAssessmentSourceScreen.Cancel;
import pcftest.NewVehAssessSourcePopup.EditAssessmentSourceScreen.Edit;
import pcftest.NewVehAssessSourcePopup.EditAssessmentSourceScreen.Update;
import pcftest.NewVehAssessSourcePopup.EditAssessmentSourceScreen._msgs;
import pcftest.NewVehAssessSourcePopup.NewVehAssessSourcePopup_UpLink;
import pcftest.NewVehAssessSourcePopup._Paging;
import pcftest.NewVehAssessSourcePopup.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/assessment/AssessmentSource/NewVehAssessSourcePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NewVehAssessSourcePopup extends PCFLocation {
  public final static String CHECKSUM = "9ecbb0679af20aa33c0c7fe282d73959";
  
  public NewVehAssessSourcePopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("NewVehAssessSourcePopup"));
  }
  
  public EditAssessmentSourceScreen getEditAssessmentSourceScreen() {
    return getOrCreateProperty("EditAssessmentSourceScreen", "EditAssessmentSourceScreen", null, pcftest.NewVehAssessSourcePopup.EditAssessmentSourceScreen.class);
  }
  
  public NewVehAssessSourcePopup_UpLink getNewVehAssessSourcePopup_UpLink() {
    return getOrCreateProperty("NewVehAssessSourcePopup_UpLink", "NewVehAssessSourcePopup_UpLink", null, pcftest.NewVehAssessSourcePopup.NewVehAssessSourcePopup_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.NewVehAssessSourcePopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.NewVehAssessSourcePopup.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/assessment/AssessmentSource/NewVehAssessSourcePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditAssessmentSourceScreen extends PCFElement {
    public EditAssessmentSourceScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Cancel getCancel() {
      return getOrCreateProperty("Cancel", "Cancel", null, pcftest.NewVehAssessSourcePopup.EditAssessmentSourceScreen.Cancel.class);
    }
    
    public Edit getEdit() {
      return getOrCreateProperty("Edit", "Edit", null, pcftest.NewVehAssessSourcePopup.EditAssessmentSourceScreen.Edit.class);
    }
    
    public Update getUpdate() {
      return getOrCreateProperty("Update", "Update", null, pcftest.NewVehAssessSourcePopup.EditAssessmentSourceScreen.Update.class);
    }
    
    public VehAssessSourceDetailsDV getVehAssessSourceDetailsDV() {
      return getOrCreateProperty("VehAssessSourceDetailsDV", "VehAssessSourceDetailsDV", null, pcftest.VehAssessSourceDetailsDV.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.NewVehAssessSourcePopup.EditAssessmentSourceScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/assessment/AssessmentSource/NewVehAssessSourcePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Cancel extends ClickableActionElement {
      public Cancel(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/assessment/AssessmentSource/NewVehAssessSourcePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Edit extends ClickableActionElement {
      public Edit(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/assessment/AssessmentSource/NewVehAssessSourcePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Update extends ClickableActionElement {
      public Update(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/assessment/AssessmentSource/NewVehAssessSourcePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/assessment/AssessmentSource/NewVehAssessSourcePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewVehAssessSourcePopup_UpLink extends ClickableActionElement {
    public NewVehAssessSourcePopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/assessment/AssessmentSource/NewVehAssessSourcePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/assessment/AssessmentSource/NewVehAssessSourcePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}