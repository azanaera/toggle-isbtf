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
import pcftest.NewPropertyContentsIncidentPopup.NewPropertyContentsIncidentPopup_UpLink;
import pcftest.NewPropertyContentsIncidentPopup.NewPropertyContentsIncidentScreen;
import pcftest.NewPropertyContentsIncidentPopup.NewPropertyContentsIncidentScreen.Cancel;
import pcftest.NewPropertyContentsIncidentPopup.NewPropertyContentsIncidentScreen.Edit;
import pcftest.NewPropertyContentsIncidentPopup.NewPropertyContentsIncidentScreen.Update;
import pcftest.NewPropertyContentsIncidentPopup.NewPropertyContentsIncidentScreen._msgs;
import pcftest.NewPropertyContentsIncidentPopup._Paging;
import pcftest.NewPropertyContentsIncidentPopup.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/incidents/NewPropertyContentsIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NewPropertyContentsIncidentPopup extends PCFLocation {
  public final static String CHECKSUM = "4cdf10a53515824a9034d0c37fba09fc";
  
  public NewPropertyContentsIncidentPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("NewPropertyContentsIncidentPopup"));
  }
  
  public NewPropertyContentsIncidentPopup_UpLink getNewPropertyContentsIncidentPopup_UpLink() {
    return getOrCreateProperty("NewPropertyContentsIncidentPopup_UpLink", "NewPropertyContentsIncidentPopup_UpLink", null, pcftest.NewPropertyContentsIncidentPopup.NewPropertyContentsIncidentPopup_UpLink.class);
  }
  
  public NewPropertyContentsIncidentScreen getNewPropertyContentsIncidentScreen() {
    return getOrCreateProperty("NewPropertyContentsIncidentScreen", "NewPropertyContentsIncidentScreen", null, pcftest.NewPropertyContentsIncidentPopup.NewPropertyContentsIncidentScreen.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.NewPropertyContentsIncidentPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.NewPropertyContentsIncidentPopup.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/incidents/NewPropertyContentsIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewPropertyContentsIncidentPopup_UpLink extends ClickableActionElement {
    public NewPropertyContentsIncidentPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/incidents/NewPropertyContentsIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewPropertyContentsIncidentScreen extends PCFElement {
    public NewPropertyContentsIncidentScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Cancel getCancel() {
      return getOrCreateProperty("Cancel", "Cancel", null, pcftest.NewPropertyContentsIncidentPopup.NewPropertyContentsIncidentScreen.Cancel.class);
    }
    
    public Edit getEdit() {
      return getOrCreateProperty("Edit", "Edit", null, pcftest.NewPropertyContentsIncidentPopup.NewPropertyContentsIncidentScreen.Edit.class);
    }
    
    public PropertyContentsIncidentPanelSet getPropertyContentsIncidentPanelSet() {
      return getOrCreateProperty("PropertyContentsIncidentPanelSet", "PropertyContentsIncidentPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.PropertyContentsIncidentPanelSet.class);
    }
    
    public Update getUpdate() {
      return getOrCreateProperty("Update", "Update", null, pcftest.NewPropertyContentsIncidentPopup.NewPropertyContentsIncidentScreen.Update.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.NewPropertyContentsIncidentPopup.NewPropertyContentsIncidentScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/incidents/NewPropertyContentsIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Cancel extends ClickableActionElement {
      public Cancel(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/incidents/NewPropertyContentsIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Edit extends ClickableActionElement {
      public Edit(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/incidents/NewPropertyContentsIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Update extends ClickableActionElement {
      public Update(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/incidents/NewPropertyContentsIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/incidents/NewPropertyContentsIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/incidents/NewPropertyContentsIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}