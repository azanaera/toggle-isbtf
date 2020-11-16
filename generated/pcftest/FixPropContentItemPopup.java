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
import pcftest.FixPropContentItemPopup.EditAssessmentContentItemScreen;
import pcftest.FixPropContentItemPopup.EditAssessmentContentItemScreen.Cancel;
import pcftest.FixPropContentItemPopup.EditAssessmentContentItemScreen.Edit;
import pcftest.FixPropContentItemPopup.EditAssessmentContentItemScreen.Update;
import pcftest.FixPropContentItemPopup.EditAssessmentContentItemScreen._msgs;
import pcftest.FixPropContentItemPopup.FixPropContentItemPopup_UpLink;
import pcftest.FixPropContentItemPopup._Paging;
import pcftest.FixPropContentItemPopup.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/assessment/AssessmentContentItem/FixPropContentItemPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class FixPropContentItemPopup extends PCFLocation {
  public final static String CHECKSUM = "e0771d732cbe2da8a542c54f9d628727";
  
  public FixPropContentItemPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("FixPropContentItemPopup"));
  }
  
  public EditAssessmentContentItemScreen getEditAssessmentContentItemScreen() {
    return getOrCreateProperty("EditAssessmentContentItemScreen", "EditAssessmentContentItemScreen", null, pcftest.FixPropContentItemPopup.EditAssessmentContentItemScreen.class);
  }
  
  public FixPropContentItemPopup_UpLink getFixPropContentItemPopup_UpLink() {
    return getOrCreateProperty("FixPropContentItemPopup_UpLink", "FixPropContentItemPopup_UpLink", null, pcftest.FixPropContentItemPopup.FixPropContentItemPopup_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.FixPropContentItemPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.FixPropContentItemPopup.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/assessment/AssessmentContentItem/FixPropContentItemPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditAssessmentContentItemScreen extends PCFElement {
    public EditAssessmentContentItemScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Cancel getCancel() {
      return getOrCreateProperty("Cancel", "Cancel", null, pcftest.FixPropContentItemPopup.EditAssessmentContentItemScreen.Cancel.class);
    }
    
    public Edit getEdit() {
      return getOrCreateProperty("Edit", "Edit", null, pcftest.FixPropContentItemPopup.EditAssessmentContentItemScreen.Edit.class);
    }
    
    public FixPropContentItemDetailsDV getFixPropContentItemDetailsDV() {
      return getOrCreateProperty("FixPropContentItemDetailsDV", "FixPropContentItemDetailsDV", null, pcftest.FixPropContentItemDetailsDV.class);
    }
    
    public Update getUpdate() {
      return getOrCreateProperty("Update", "Update", null, pcftest.FixPropContentItemPopup.EditAssessmentContentItemScreen.Update.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.FixPropContentItemPopup.EditAssessmentContentItemScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/assessment/AssessmentContentItem/FixPropContentItemPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Cancel extends ClickableActionElement {
      public Cancel(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/assessment/AssessmentContentItem/FixPropContentItemPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Edit extends ClickableActionElement {
      public Edit(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/assessment/AssessmentContentItem/FixPropContentItemPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Update extends ClickableActionElement {
      public Update(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/assessment/AssessmentContentItem/FixPropContentItemPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/assessment/AssessmentContentItem/FixPropContentItemPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FixPropContentItemPopup_UpLink extends ClickableActionElement {
    public FixPropContentItemPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/assessment/AssessmentContentItem/FixPropContentItemPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/assessment/AssessmentContentItem/FixPropContentItemPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}