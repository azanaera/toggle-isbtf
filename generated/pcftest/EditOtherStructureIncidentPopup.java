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
import pcftest.EditOtherStructureIncidentPopup.EditOtherStructureIncidentPopup_UpLink;
import pcftest.EditOtherStructureIncidentPopup.EditOtherStructureIncidentScreen;
import pcftest.EditOtherStructureIncidentPopup.EditOtherStructureIncidentScreen.Cancel;
import pcftest.EditOtherStructureIncidentPopup.EditOtherStructureIncidentScreen.Edit;
import pcftest.EditOtherStructureIncidentPopup.EditOtherStructureIncidentScreen.OtherStructureIncident_PrintButton;
import pcftest.EditOtherStructureIncidentPopup.EditOtherStructureIncidentScreen.Update;
import pcftest.EditOtherStructureIncidentPopup.EditOtherStructureIncidentScreen._msgs;
import pcftest.EditOtherStructureIncidentPopup._Paging;
import pcftest.EditOtherStructureIncidentPopup.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/incidents/EditOtherStructureIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class EditOtherStructureIncidentPopup extends PCFLocation {
  public final static String CHECKSUM = "1317ebdc1ba5eed57fe76c7d0deab9c5";
  
  public EditOtherStructureIncidentPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("EditOtherStructureIncidentPopup"));
  }
  
  public EditOtherStructureIncidentPopup_UpLink getEditOtherStructureIncidentPopup_UpLink() {
    return getOrCreateProperty("EditOtherStructureIncidentPopup_UpLink", "EditOtherStructureIncidentPopup_UpLink", null, pcftest.EditOtherStructureIncidentPopup.EditOtherStructureIncidentPopup_UpLink.class);
  }
  
  public EditOtherStructureIncidentScreen getEditOtherStructureIncidentScreen() {
    return getOrCreateProperty("EditOtherStructureIncidentScreen", "EditOtherStructureIncidentScreen", null, pcftest.EditOtherStructureIncidentPopup.EditOtherStructureIncidentScreen.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.EditOtherStructureIncidentPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.EditOtherStructureIncidentPopup.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/incidents/EditOtherStructureIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditOtherStructureIncidentPopup_UpLink extends ClickableActionElement {
    public EditOtherStructureIncidentPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/incidents/EditOtherStructureIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditOtherStructureIncidentScreen extends PCFElement {
    public EditOtherStructureIncidentScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Cancel getCancel() {
      return getOrCreateProperty("Cancel", "Cancel", null, pcftest.EditOtherStructureIncidentPopup.EditOtherStructureIncidentScreen.Cancel.class);
    }
    
    public Edit getEdit() {
      return getOrCreateProperty("Edit", "Edit", null, pcftest.EditOtherStructureIncidentPopup.EditOtherStructureIncidentScreen.Edit.class);
    }
    
    public OtherStructureIncidentCV getOtherStructureIncidentCV() {
      return getOrCreateProperty("OtherStructureIncidentCV", "OtherStructureIncidentCV", null, pcftest.OtherStructureIncidentCV.class);
    }
    
    public OtherStructureIncident_PrintButton getOtherStructureIncident_PrintButton() {
      return getOrCreateProperty("OtherStructureIncident_PrintButton", "OtherStructureIncident_PrintButton", null, pcftest.EditOtherStructureIncidentPopup.EditOtherStructureIncidentScreen.OtherStructureIncident_PrintButton.class);
    }
    
    public Update getUpdate() {
      return getOrCreateProperty("Update", "Update", null, pcftest.EditOtherStructureIncidentPopup.EditOtherStructureIncidentScreen.Update.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.EditOtherStructureIncidentPopup.EditOtherStructureIncidentScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/incidents/EditOtherStructureIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Cancel extends ClickableActionElement {
      public Cancel(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/incidents/EditOtherStructureIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Edit extends ClickableActionElement {
      public Edit(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/incidents/EditOtherStructureIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class OtherStructureIncident_PrintButton extends ClickableActionElement {
      public OtherStructureIncident_PrintButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/incidents/EditOtherStructureIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Update extends ClickableActionElement {
      public Update(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/incidents/EditOtherStructureIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/incidents/EditOtherStructureIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/incidents/EditOtherStructureIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}