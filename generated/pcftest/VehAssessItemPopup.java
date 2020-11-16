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
import pcftest.VehAssessItemPopup.EditAssessmentItemScreen;
import pcftest.VehAssessItemPopup.EditAssessmentItemScreen.Cancel;
import pcftest.VehAssessItemPopup.EditAssessmentItemScreen.Edit;
import pcftest.VehAssessItemPopup.EditAssessmentItemScreen.Update;
import pcftest.VehAssessItemPopup.EditAssessmentItemScreen._msgs;
import pcftest.VehAssessItemPopup.VehAssessItemPopup_UpLink;
import pcftest.VehAssessItemPopup._Paging;
import pcftest.VehAssessItemPopup.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/assessment/AssessmentItem/VehAssessItemPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class VehAssessItemPopup extends PCFLocation {
  public final static String CHECKSUM = "9801815f5b95ee3b906e1377e485dbcd";
  
  public VehAssessItemPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("VehAssessItemPopup"));
  }
  
  public EditAssessmentItemScreen getEditAssessmentItemScreen() {
    return getOrCreateProperty("EditAssessmentItemScreen", "EditAssessmentItemScreen", null, pcftest.VehAssessItemPopup.EditAssessmentItemScreen.class);
  }
  
  public VehAssessItemPopup_UpLink getVehAssessItemPopup_UpLink() {
    return getOrCreateProperty("VehAssessItemPopup_UpLink", "VehAssessItemPopup_UpLink", null, pcftest.VehAssessItemPopup.VehAssessItemPopup_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.VehAssessItemPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.VehAssessItemPopup.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/assessment/AssessmentItem/VehAssessItemPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditAssessmentItemScreen extends PCFElement {
    public EditAssessmentItemScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Cancel getCancel() {
      return getOrCreateProperty("Cancel", "Cancel", null, pcftest.VehAssessItemPopup.EditAssessmentItemScreen.Cancel.class);
    }
    
    public Edit getEdit() {
      return getOrCreateProperty("Edit", "Edit", null, pcftest.VehAssessItemPopup.EditAssessmentItemScreen.Edit.class);
    }
    
    public Update getUpdate() {
      return getOrCreateProperty("Update", "Update", null, pcftest.VehAssessItemPopup.EditAssessmentItemScreen.Update.class);
    }
    
    public VehAssessItemDetailsDV getVehAssessItemDetailsDV() {
      return getOrCreateProperty("VehAssessItemDetailsDV", "VehAssessItemDetailsDV", null, pcftest.VehAssessItemDetailsDV.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.VehAssessItemPopup.EditAssessmentItemScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/assessment/AssessmentItem/VehAssessItemPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Cancel extends ClickableActionElement {
      public Cancel(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/assessment/AssessmentItem/VehAssessItemPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Edit extends ClickableActionElement {
      public Edit(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/assessment/AssessmentItem/VehAssessItemPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Update extends ClickableActionElement {
      public Update(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/assessment/AssessmentItem/VehAssessItemPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/assessment/AssessmentItem/VehAssessItemPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class VehAssessItemPopup_UpLink extends ClickableActionElement {
    public VehAssessItemPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/assessment/AssessmentItem/VehAssessItemPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/assessment/AssessmentItem/VehAssessItemPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}