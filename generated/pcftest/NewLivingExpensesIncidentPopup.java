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
import pcftest.NewLivingExpensesIncidentPopup.NewLivingExpensesIncidentPopup_UpLink;
import pcftest.NewLivingExpensesIncidentPopup.NewLivingExpensesIncidentScreen;
import pcftest.NewLivingExpensesIncidentPopup.NewLivingExpensesIncidentScreen.Cancel;
import pcftest.NewLivingExpensesIncidentPopup.NewLivingExpensesIncidentScreen.Edit;
import pcftest.NewLivingExpensesIncidentPopup.NewLivingExpensesIncidentScreen.Update;
import pcftest.NewLivingExpensesIncidentPopup.NewLivingExpensesIncidentScreen._msgs;
import pcftest.NewLivingExpensesIncidentPopup._Paging;
import pcftest.NewLivingExpensesIncidentPopup.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/incidents/NewLivingExpensesIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NewLivingExpensesIncidentPopup extends PCFLocation {
  public final static String CHECKSUM = "d5fb4fc73678286889c7faa06bd530e7";
  
  public NewLivingExpensesIncidentPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("NewLivingExpensesIncidentPopup"));
  }
  
  public NewLivingExpensesIncidentPopup_UpLink getNewLivingExpensesIncidentPopup_UpLink() {
    return getOrCreateProperty("NewLivingExpensesIncidentPopup_UpLink", "NewLivingExpensesIncidentPopup_UpLink", null, pcftest.NewLivingExpensesIncidentPopup.NewLivingExpensesIncidentPopup_UpLink.class);
  }
  
  public NewLivingExpensesIncidentScreen getNewLivingExpensesIncidentScreen() {
    return getOrCreateProperty("NewLivingExpensesIncidentScreen", "NewLivingExpensesIncidentScreen", null, pcftest.NewLivingExpensesIncidentPopup.NewLivingExpensesIncidentScreen.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.NewLivingExpensesIncidentPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.NewLivingExpensesIncidentPopup.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/incidents/NewLivingExpensesIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewLivingExpensesIncidentPopup_UpLink extends ClickableActionElement {
    public NewLivingExpensesIncidentPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/incidents/NewLivingExpensesIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewLivingExpensesIncidentScreen extends PCFElement {
    public NewLivingExpensesIncidentScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Cancel getCancel() {
      return getOrCreateProperty("Cancel", "Cancel", null, pcftest.NewLivingExpensesIncidentPopup.NewLivingExpensesIncidentScreen.Cancel.class);
    }
    
    public Edit getEdit() {
      return getOrCreateProperty("Edit", "Edit", null, pcftest.NewLivingExpensesIncidentPopup.NewLivingExpensesIncidentScreen.Edit.class);
    }
    
    public LivingExpensesIncidentPanelSet getLivingExpensesIncidentPanelSet() {
      return getOrCreateProperty("LivingExpensesIncidentPanelSet", "LivingExpensesIncidentPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.LivingExpensesIncidentPanelSet.class);
    }
    
    public Update getUpdate() {
      return getOrCreateProperty("Update", "Update", null, pcftest.NewLivingExpensesIncidentPopup.NewLivingExpensesIncidentScreen.Update.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.NewLivingExpensesIncidentPopup.NewLivingExpensesIncidentScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/incidents/NewLivingExpensesIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Cancel extends ClickableActionElement {
      public Cancel(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/incidents/NewLivingExpensesIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Edit extends ClickableActionElement {
      public Edit(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/incidents/NewLivingExpensesIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Update extends ClickableActionElement {
      public Update(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/incidents/NewLivingExpensesIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/incidents/NewLivingExpensesIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/incidents/NewLivingExpensesIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}