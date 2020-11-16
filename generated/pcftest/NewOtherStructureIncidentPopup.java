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
import pcftest.NewOtherStructureIncidentPopup.NewOtherStructureIncidentPopup_UpLink;
import pcftest.NewOtherStructureIncidentPopup.NewOtherStructureIncidentScreen;
import pcftest.NewOtherStructureIncidentPopup.NewOtherStructureIncidentScreen.Cancel;
import pcftest.NewOtherStructureIncidentPopup.NewOtherStructureIncidentScreen.Edit;
import pcftest.NewOtherStructureIncidentPopup.NewOtherStructureIncidentScreen.Update;
import pcftest.NewOtherStructureIncidentPopup.NewOtherStructureIncidentScreen._msgs;
import pcftest.NewOtherStructureIncidentPopup._Paging;
import pcftest.NewOtherStructureIncidentPopup.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/incidents/NewOtherStructureIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NewOtherStructureIncidentPopup extends PCFLocation {
  public final static String CHECKSUM = "f1627e16df1e7825b69275823e8c78db";
  
  public NewOtherStructureIncidentPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("NewOtherStructureIncidentPopup"));
  }
  
  public NewOtherStructureIncidentPopup_UpLink getNewOtherStructureIncidentPopup_UpLink() {
    return getOrCreateProperty("NewOtherStructureIncidentPopup_UpLink", "NewOtherStructureIncidentPopup_UpLink", null, pcftest.NewOtherStructureIncidentPopup.NewOtherStructureIncidentPopup_UpLink.class);
  }
  
  public NewOtherStructureIncidentScreen getNewOtherStructureIncidentScreen() {
    return getOrCreateProperty("NewOtherStructureIncidentScreen", "NewOtherStructureIncidentScreen", null, pcftest.NewOtherStructureIncidentPopup.NewOtherStructureIncidentScreen.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.NewOtherStructureIncidentPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.NewOtherStructureIncidentPopup.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/incidents/NewOtherStructureIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewOtherStructureIncidentPopup_UpLink extends ClickableActionElement {
    public NewOtherStructureIncidentPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/incidents/NewOtherStructureIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewOtherStructureIncidentScreen extends PCFElement {
    public NewOtherStructureIncidentScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Cancel getCancel() {
      return getOrCreateProperty("Cancel", "Cancel", null, pcftest.NewOtherStructureIncidentPopup.NewOtherStructureIncidentScreen.Cancel.class);
    }
    
    public Edit getEdit() {
      return getOrCreateProperty("Edit", "Edit", null, pcftest.NewOtherStructureIncidentPopup.NewOtherStructureIncidentScreen.Edit.class);
    }
    
    public OtherStructureIncidentCV getOtherStructureIncidentCV() {
      return getOrCreateProperty("OtherStructureIncidentCV", "OtherStructureIncidentCV", null, pcftest.OtherStructureIncidentCV.class);
    }
    
    public Update getUpdate() {
      return getOrCreateProperty("Update", "Update", null, pcftest.NewOtherStructureIncidentPopup.NewOtherStructureIncidentScreen.Update.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.NewOtherStructureIncidentPopup.NewOtherStructureIncidentScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/incidents/NewOtherStructureIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Cancel extends ClickableActionElement {
      public Cancel(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/incidents/NewOtherStructureIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Edit extends ClickableActionElement {
      public Edit(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/incidents/NewOtherStructureIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Update extends ClickableActionElement {
      public Update(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/incidents/NewOtherStructureIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/incidents/NewOtherStructureIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/incidents/NewOtherStructureIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}