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
import pcftest.NewFixPropContentItemPopup.EditAssessmentContentItemScreen;
import pcftest.NewFixPropContentItemPopup.EditAssessmentContentItemScreen.Cancel;
import pcftest.NewFixPropContentItemPopup.EditAssessmentContentItemScreen.Edit;
import pcftest.NewFixPropContentItemPopup.EditAssessmentContentItemScreen.Update;
import pcftest.NewFixPropContentItemPopup.EditAssessmentContentItemScreen._msgs;
import pcftest.NewFixPropContentItemPopup.NewFixPropContentItemPopup_UpLink;
import pcftest.NewFixPropContentItemPopup._Paging;
import pcftest.NewFixPropContentItemPopup.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/assessment/AssessmentContentItem/NewFixPropContentItemPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NewFixPropContentItemPopup extends PCFLocation {
  public final static String CHECKSUM = "5dc0ec8b36e3312b0fe0dfb5c41c3e20";
  
  public NewFixPropContentItemPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("NewFixPropContentItemPopup"));
  }
  
  public EditAssessmentContentItemScreen getEditAssessmentContentItemScreen() {
    return getOrCreateProperty("EditAssessmentContentItemScreen", "EditAssessmentContentItemScreen", null, pcftest.NewFixPropContentItemPopup.EditAssessmentContentItemScreen.class);
  }
  
  public NewFixPropContentItemPopup_UpLink getNewFixPropContentItemPopup_UpLink() {
    return getOrCreateProperty("NewFixPropContentItemPopup_UpLink", "NewFixPropContentItemPopup_UpLink", null, pcftest.NewFixPropContentItemPopup.NewFixPropContentItemPopup_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.NewFixPropContentItemPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.NewFixPropContentItemPopup.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/assessment/AssessmentContentItem/NewFixPropContentItemPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditAssessmentContentItemScreen extends PCFElement {
    public EditAssessmentContentItemScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Cancel getCancel() {
      return getOrCreateProperty("Cancel", "Cancel", null, pcftest.NewFixPropContentItemPopup.EditAssessmentContentItemScreen.Cancel.class);
    }
    
    public Edit getEdit() {
      return getOrCreateProperty("Edit", "Edit", null, pcftest.NewFixPropContentItemPopup.EditAssessmentContentItemScreen.Edit.class);
    }
    
    public FixPropContentItemDetailsDV getFixPropContentItemDetailsDV() {
      return getOrCreateProperty("FixPropContentItemDetailsDV", "FixPropContentItemDetailsDV", null, pcftest.FixPropContentItemDetailsDV.class);
    }
    
    public Update getUpdate() {
      return getOrCreateProperty("Update", "Update", null, pcftest.NewFixPropContentItemPopup.EditAssessmentContentItemScreen.Update.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.NewFixPropContentItemPopup.EditAssessmentContentItemScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/assessment/AssessmentContentItem/NewFixPropContentItemPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Cancel extends ClickableActionElement {
      public Cancel(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/assessment/AssessmentContentItem/NewFixPropContentItemPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Edit extends ClickableActionElement {
      public Edit(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/assessment/AssessmentContentItem/NewFixPropContentItemPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Update extends ClickableActionElement {
      public Update(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/assessment/AssessmentContentItem/NewFixPropContentItemPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/assessment/AssessmentContentItem/NewFixPropContentItemPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewFixPropContentItemPopup_UpLink extends ClickableActionElement {
    public NewFixPropContentItemPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/assessment/AssessmentContentItem/NewFixPropContentItemPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/assessment/AssessmentContentItem/NewFixPropContentItemPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}