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
import pcftest.EditPropertyContentsIncidentPopup.EditPropertyContentsIncidentPopup_UpLink;
import pcftest.EditPropertyContentsIncidentPopup.EditPropertyContentsIncidentScreen;
import pcftest.EditPropertyContentsIncidentPopup.EditPropertyContentsIncidentScreen.Cancel;
import pcftest.EditPropertyContentsIncidentPopup.EditPropertyContentsIncidentScreen.Edit;
import pcftest.EditPropertyContentsIncidentPopup.EditPropertyContentsIncidentScreen.PropertyContentsIncident_PrintButton;
import pcftest.EditPropertyContentsIncidentPopup.EditPropertyContentsIncidentScreen.Update;
import pcftest.EditPropertyContentsIncidentPopup.EditPropertyContentsIncidentScreen._msgs;
import pcftest.EditPropertyContentsIncidentPopup._Paging;
import pcftest.EditPropertyContentsIncidentPopup.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/incidents/EditPropertyContentsIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class EditPropertyContentsIncidentPopup extends PCFLocation {
  public final static String CHECKSUM = "d1d2f126b47af1171bc4ea1898e5f308";
  
  public EditPropertyContentsIncidentPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("EditPropertyContentsIncidentPopup"));
  }
  
  public EditPropertyContentsIncidentPopup_UpLink getEditPropertyContentsIncidentPopup_UpLink() {
    return getOrCreateProperty("EditPropertyContentsIncidentPopup_UpLink", "EditPropertyContentsIncidentPopup_UpLink", null, pcftest.EditPropertyContentsIncidentPopup.EditPropertyContentsIncidentPopup_UpLink.class);
  }
  
  public EditPropertyContentsIncidentScreen getEditPropertyContentsIncidentScreen() {
    return getOrCreateProperty("EditPropertyContentsIncidentScreen", "EditPropertyContentsIncidentScreen", null, pcftest.EditPropertyContentsIncidentPopup.EditPropertyContentsIncidentScreen.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.EditPropertyContentsIncidentPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.EditPropertyContentsIncidentPopup.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/incidents/EditPropertyContentsIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditPropertyContentsIncidentPopup_UpLink extends ClickableActionElement {
    public EditPropertyContentsIncidentPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/incidents/EditPropertyContentsIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditPropertyContentsIncidentScreen extends PCFElement {
    public EditPropertyContentsIncidentScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Cancel getCancel() {
      return getOrCreateProperty("Cancel", "Cancel", null, pcftest.EditPropertyContentsIncidentPopup.EditPropertyContentsIncidentScreen.Cancel.class);
    }
    
    public Edit getEdit() {
      return getOrCreateProperty("Edit", "Edit", null, pcftest.EditPropertyContentsIncidentPopup.EditPropertyContentsIncidentScreen.Edit.class);
    }
    
    public PropertyContentsIncidentPanelSet getPropertyContentsIncidentPanelSet() {
      return getOrCreateProperty("PropertyContentsIncidentPanelSet", "PropertyContentsIncidentPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.PropertyContentsIncidentPanelSet.class);
    }
    
    public PropertyContentsIncident_PrintButton getPropertyContentsIncident_PrintButton() {
      return getOrCreateProperty("PropertyContentsIncident_PrintButton", "PropertyContentsIncident_PrintButton", null, pcftest.EditPropertyContentsIncidentPopup.EditPropertyContentsIncidentScreen.PropertyContentsIncident_PrintButton.class);
    }
    
    public Update getUpdate() {
      return getOrCreateProperty("Update", "Update", null, pcftest.EditPropertyContentsIncidentPopup.EditPropertyContentsIncidentScreen.Update.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.EditPropertyContentsIncidentPopup.EditPropertyContentsIncidentScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/incidents/EditPropertyContentsIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Cancel extends ClickableActionElement {
      public Cancel(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/incidents/EditPropertyContentsIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Edit extends ClickableActionElement {
      public Edit(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/incidents/EditPropertyContentsIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class PropertyContentsIncident_PrintButton extends ClickableActionElement {
      public PropertyContentsIncident_PrintButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/incidents/EditPropertyContentsIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Update extends ClickableActionElement {
      public Update(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/incidents/EditPropertyContentsIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/incidents/EditPropertyContentsIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/incidents/EditPropertyContentsIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}