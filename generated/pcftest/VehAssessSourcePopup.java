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
import pcftest.VehAssessSourcePopup.EditAssessmentSourceScreen;
import pcftest.VehAssessSourcePopup.EditAssessmentSourceScreen.Cancel;
import pcftest.VehAssessSourcePopup.EditAssessmentSourceScreen.Edit;
import pcftest.VehAssessSourcePopup.EditAssessmentSourceScreen.Update;
import pcftest.VehAssessSourcePopup.EditAssessmentSourceScreen._msgs;
import pcftest.VehAssessSourcePopup.VehAssessSourcePopup_UpLink;
import pcftest.VehAssessSourcePopup._Paging;
import pcftest.VehAssessSourcePopup.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/assessment/AssessmentSource/VehAssessSourcePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class VehAssessSourcePopup extends PCFLocation {
  public final static String CHECKSUM = "43239026130a1b5881ecb2858e670681";
  
  public VehAssessSourcePopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("VehAssessSourcePopup"));
  }
  
  public EditAssessmentSourceScreen getEditAssessmentSourceScreen() {
    return getOrCreateProperty("EditAssessmentSourceScreen", "EditAssessmentSourceScreen", null, pcftest.VehAssessSourcePopup.EditAssessmentSourceScreen.class);
  }
  
  public VehAssessSourcePopup_UpLink getVehAssessSourcePopup_UpLink() {
    return getOrCreateProperty("VehAssessSourcePopup_UpLink", "VehAssessSourcePopup_UpLink", null, pcftest.VehAssessSourcePopup.VehAssessSourcePopup_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.VehAssessSourcePopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.VehAssessSourcePopup.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/assessment/AssessmentSource/VehAssessSourcePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditAssessmentSourceScreen extends PCFElement {
    public EditAssessmentSourceScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Cancel getCancel() {
      return getOrCreateProperty("Cancel", "Cancel", null, pcftest.VehAssessSourcePopup.EditAssessmentSourceScreen.Cancel.class);
    }
    
    public Edit getEdit() {
      return getOrCreateProperty("Edit", "Edit", null, pcftest.VehAssessSourcePopup.EditAssessmentSourceScreen.Edit.class);
    }
    
    public Update getUpdate() {
      return getOrCreateProperty("Update", "Update", null, pcftest.VehAssessSourcePopup.EditAssessmentSourceScreen.Update.class);
    }
    
    public VehAssessSourceDetailsDV getVehAssessSourceDetailsDV() {
      return getOrCreateProperty("VehAssessSourceDetailsDV", "VehAssessSourceDetailsDV", null, pcftest.VehAssessSourceDetailsDV.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.VehAssessSourcePopup.EditAssessmentSourceScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/assessment/AssessmentSource/VehAssessSourcePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Cancel extends ClickableActionElement {
      public Cancel(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/assessment/AssessmentSource/VehAssessSourcePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Edit extends ClickableActionElement {
      public Edit(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/assessment/AssessmentSource/VehAssessSourcePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Update extends ClickableActionElement {
      public Update(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/assessment/AssessmentSource/VehAssessSourcePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/assessment/AssessmentSource/VehAssessSourcePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class VehAssessSourcePopup_UpLink extends ClickableActionElement {
    public VehAssessSourcePopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/assessment/AssessmentSource/VehAssessSourcePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/assessment/AssessmentSource/VehAssessSourcePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}