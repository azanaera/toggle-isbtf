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
import pcftest.EditDwellingIncidentPopup.EditDwellingIncidentPopup_UpLink;
import pcftest.EditDwellingIncidentPopup.EditDwellingIncidentScreen;
import pcftest.EditDwellingIncidentPopup.EditDwellingIncidentScreen.Cancel;
import pcftest.EditDwellingIncidentPopup.EditDwellingIncidentScreen.DwellingIncident_PrintButton;
import pcftest.EditDwellingIncidentPopup.EditDwellingIncidentScreen.Edit;
import pcftest.EditDwellingIncidentPopup.EditDwellingIncidentScreen.Update;
import pcftest.EditDwellingIncidentPopup.EditDwellingIncidentScreen._msgs;
import pcftest.EditDwellingIncidentPopup._Paging;
import pcftest.EditDwellingIncidentPopup.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/incidents/EditDwellingIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class EditDwellingIncidentPopup extends PCFLocation {
  public final static String CHECKSUM = "af695173d34c1d38fc8aa9cfe19ec799";
  
  public EditDwellingIncidentPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("EditDwellingIncidentPopup"));
  }
  
  public EditDwellingIncidentPopup_UpLink getEditDwellingIncidentPopup_UpLink() {
    return getOrCreateProperty("EditDwellingIncidentPopup_UpLink", "EditDwellingIncidentPopup_UpLink", null, pcftest.EditDwellingIncidentPopup.EditDwellingIncidentPopup_UpLink.class);
  }
  
  public EditDwellingIncidentScreen getEditDwellingIncidentScreen() {
    return getOrCreateProperty("EditDwellingIncidentScreen", "EditDwellingIncidentScreen", null, pcftest.EditDwellingIncidentPopup.EditDwellingIncidentScreen.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.EditDwellingIncidentPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.EditDwellingIncidentPopup.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/incidents/EditDwellingIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditDwellingIncidentPopup_UpLink extends ClickableActionElement {
    public EditDwellingIncidentPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/incidents/EditDwellingIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditDwellingIncidentScreen extends PCFElement {
    public EditDwellingIncidentScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Cancel getCancel() {
      return getOrCreateProperty("Cancel", "Cancel", null, pcftest.EditDwellingIncidentPopup.EditDwellingIncidentScreen.Cancel.class);
    }
    
    public DwellingIncidentCV getDwellingIncidentCV() {
      return getOrCreateProperty("DwellingIncidentCV", "DwellingIncidentCV", null, pcftest.DwellingIncidentCV.class);
    }
    
    public DwellingIncident_PrintButton getDwellingIncident_PrintButton() {
      return getOrCreateProperty("DwellingIncident_PrintButton", "DwellingIncident_PrintButton", null, pcftest.EditDwellingIncidentPopup.EditDwellingIncidentScreen.DwellingIncident_PrintButton.class);
    }
    
    public Edit getEdit() {
      return getOrCreateProperty("Edit", "Edit", null, pcftest.EditDwellingIncidentPopup.EditDwellingIncidentScreen.Edit.class);
    }
    
    public Update getUpdate() {
      return getOrCreateProperty("Update", "Update", null, pcftest.EditDwellingIncidentPopup.EditDwellingIncidentScreen.Update.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.EditDwellingIncidentPopup.EditDwellingIncidentScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/incidents/EditDwellingIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Cancel extends ClickableActionElement {
      public Cancel(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/incidents/EditDwellingIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class DwellingIncident_PrintButton extends ClickableActionElement {
      public DwellingIncident_PrintButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/incidents/EditDwellingIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Edit extends ClickableActionElement {
      public Edit(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/incidents/EditDwellingIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Update extends ClickableActionElement {
      public Update(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/incidents/EditDwellingIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/incidents/EditDwellingIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/incidents/EditDwellingIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}