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
import pcftest.EditLivingExpensesIncidentPopup.EditLivingExpensesIncidentPopup_UpLink;
import pcftest.EditLivingExpensesIncidentPopup.EditLivingExpensesIncidentScreen;
import pcftest.EditLivingExpensesIncidentPopup.EditLivingExpensesIncidentScreen.Cancel;
import pcftest.EditLivingExpensesIncidentPopup.EditLivingExpensesIncidentScreen.Edit;
import pcftest.EditLivingExpensesIncidentPopup.EditLivingExpensesIncidentScreen.LivingExpensesIncident_PrintButton;
import pcftest.EditLivingExpensesIncidentPopup.EditLivingExpensesIncidentScreen.Update;
import pcftest.EditLivingExpensesIncidentPopup.EditLivingExpensesIncidentScreen._msgs;
import pcftest.EditLivingExpensesIncidentPopup._Paging;
import pcftest.EditLivingExpensesIncidentPopup.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/incidents/EditLivingExpensesIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class EditLivingExpensesIncidentPopup extends PCFLocation {
  public final static String CHECKSUM = "a5e4a40e07318d272bf43184fe1fcf07";
  
  public EditLivingExpensesIncidentPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("EditLivingExpensesIncidentPopup"));
  }
  
  public EditLivingExpensesIncidentPopup_UpLink getEditLivingExpensesIncidentPopup_UpLink() {
    return getOrCreateProperty("EditLivingExpensesIncidentPopup_UpLink", "EditLivingExpensesIncidentPopup_UpLink", null, pcftest.EditLivingExpensesIncidentPopup.EditLivingExpensesIncidentPopup_UpLink.class);
  }
  
  public EditLivingExpensesIncidentScreen getEditLivingExpensesIncidentScreen() {
    return getOrCreateProperty("EditLivingExpensesIncidentScreen", "EditLivingExpensesIncidentScreen", null, pcftest.EditLivingExpensesIncidentPopup.EditLivingExpensesIncidentScreen.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.EditLivingExpensesIncidentPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.EditLivingExpensesIncidentPopup.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/incidents/EditLivingExpensesIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditLivingExpensesIncidentPopup_UpLink extends ClickableActionElement {
    public EditLivingExpensesIncidentPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/incidents/EditLivingExpensesIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditLivingExpensesIncidentScreen extends PCFElement {
    public EditLivingExpensesIncidentScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Cancel getCancel() {
      return getOrCreateProperty("Cancel", "Cancel", null, pcftest.EditLivingExpensesIncidentPopup.EditLivingExpensesIncidentScreen.Cancel.class);
    }
    
    public Edit getEdit() {
      return getOrCreateProperty("Edit", "Edit", null, pcftest.EditLivingExpensesIncidentPopup.EditLivingExpensesIncidentScreen.Edit.class);
    }
    
    public LivingExpensesIncidentPanelSet getLivingExpensesIncidentPanelSet() {
      return getOrCreateProperty("LivingExpensesIncidentPanelSet", "LivingExpensesIncidentPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.LivingExpensesIncidentPanelSet.class);
    }
    
    public LivingExpensesIncident_PrintButton getLivingExpensesIncident_PrintButton() {
      return getOrCreateProperty("LivingExpensesIncident_PrintButton", "LivingExpensesIncident_PrintButton", null, pcftest.EditLivingExpensesIncidentPopup.EditLivingExpensesIncidentScreen.LivingExpensesIncident_PrintButton.class);
    }
    
    public Update getUpdate() {
      return getOrCreateProperty("Update", "Update", null, pcftest.EditLivingExpensesIncidentPopup.EditLivingExpensesIncidentScreen.Update.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.EditLivingExpensesIncidentPopup.EditLivingExpensesIncidentScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/incidents/EditLivingExpensesIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Cancel extends ClickableActionElement {
      public Cancel(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/incidents/EditLivingExpensesIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Edit extends ClickableActionElement {
      public Edit(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/incidents/EditLivingExpensesIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class LivingExpensesIncident_PrintButton extends ClickableActionElement {
      public LivingExpensesIncident_PrintButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/incidents/EditLivingExpensesIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Update extends ClickableActionElement {
      public Update(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/incidents/EditLivingExpensesIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/incidents/EditLivingExpensesIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/incidents/EditLivingExpensesIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}