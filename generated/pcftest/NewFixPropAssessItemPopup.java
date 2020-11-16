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
import pcftest.NewFixPropAssessItemPopup.EditAssessmentItemScreen;
import pcftest.NewFixPropAssessItemPopup.EditAssessmentItemScreen.Cancel;
import pcftest.NewFixPropAssessItemPopup.EditAssessmentItemScreen.Edit;
import pcftest.NewFixPropAssessItemPopup.EditAssessmentItemScreen.Update;
import pcftest.NewFixPropAssessItemPopup.EditAssessmentItemScreen._msgs;
import pcftest.NewFixPropAssessItemPopup.NewFixPropAssessItemPopup_UpLink;
import pcftest.NewFixPropAssessItemPopup._Paging;
import pcftest.NewFixPropAssessItemPopup.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/assessment/AssessmentItem/NewFixPropAssessItemPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NewFixPropAssessItemPopup extends PCFLocation {
  public final static String CHECKSUM = "89bb722d3e1d20da3aa5043132acf87e";
  
  public NewFixPropAssessItemPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("NewFixPropAssessItemPopup"));
  }
  
  public EditAssessmentItemScreen getEditAssessmentItemScreen() {
    return getOrCreateProperty("EditAssessmentItemScreen", "EditAssessmentItemScreen", null, pcftest.NewFixPropAssessItemPopup.EditAssessmentItemScreen.class);
  }
  
  public NewFixPropAssessItemPopup_UpLink getNewFixPropAssessItemPopup_UpLink() {
    return getOrCreateProperty("NewFixPropAssessItemPopup_UpLink", "NewFixPropAssessItemPopup_UpLink", null, pcftest.NewFixPropAssessItemPopup.NewFixPropAssessItemPopup_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.NewFixPropAssessItemPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.NewFixPropAssessItemPopup.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/assessment/AssessmentItem/NewFixPropAssessItemPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditAssessmentItemScreen extends PCFElement {
    public EditAssessmentItemScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Cancel getCancel() {
      return getOrCreateProperty("Cancel", "Cancel", null, pcftest.NewFixPropAssessItemPopup.EditAssessmentItemScreen.Cancel.class);
    }
    
    public Edit getEdit() {
      return getOrCreateProperty("Edit", "Edit", null, pcftest.NewFixPropAssessItemPopup.EditAssessmentItemScreen.Edit.class);
    }
    
    public FixPropAssessItemDetailsDV getFixPropAssessItemDetailsDV() {
      return getOrCreateProperty("FixPropAssessItemDetailsDV", "FixPropAssessItemDetailsDV", null, pcftest.FixPropAssessItemDetailsDV.class);
    }
    
    public Update getUpdate() {
      return getOrCreateProperty("Update", "Update", null, pcftest.NewFixPropAssessItemPopup.EditAssessmentItemScreen.Update.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.NewFixPropAssessItemPopup.EditAssessmentItemScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/assessment/AssessmentItem/NewFixPropAssessItemPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Cancel extends ClickableActionElement {
      public Cancel(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/assessment/AssessmentItem/NewFixPropAssessItemPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Edit extends ClickableActionElement {
      public Edit(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/assessment/AssessmentItem/NewFixPropAssessItemPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Update extends ClickableActionElement {
      public Update(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/assessment/AssessmentItem/NewFixPropAssessItemPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/assessment/AssessmentItem/NewFixPropAssessItemPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewFixPropAssessItemPopup_UpLink extends ClickableActionElement {
    public NewFixPropAssessItemPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/assessment/AssessmentItem/NewFixPropAssessItemPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/assessment/AssessmentItem/NewFixPropAssessItemPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}