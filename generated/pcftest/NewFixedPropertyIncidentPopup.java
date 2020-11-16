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
import pcftest.NewFixedPropertyIncidentPopup.NewFixedPropertyIncidentPopup_UpLink;
import pcftest.NewFixedPropertyIncidentPopup.NewFixedPropertyIncidentScreen;
import pcftest.NewFixedPropertyIncidentPopup.NewFixedPropertyIncidentScreen.Cancel;
import pcftest.NewFixedPropertyIncidentPopup.NewFixedPropertyIncidentScreen.Edit;
import pcftest.NewFixedPropertyIncidentPopup.NewFixedPropertyIncidentScreen.FixedPropertyIncident_PrintButton;
import pcftest.NewFixedPropertyIncidentPopup.NewFixedPropertyIncidentScreen.Update;
import pcftest.NewFixedPropertyIncidentPopup.NewFixedPropertyIncidentScreen._msgs;
import pcftest.NewFixedPropertyIncidentPopup._Paging;
import pcftest.NewFixedPropertyIncidentPopup.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/newexposure/NewFixedPropertyIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NewFixedPropertyIncidentPopup extends PCFLocation {
  public final static String CHECKSUM = "7c1cdf4e3e3a94e009885a7d29a23427";
  
  public NewFixedPropertyIncidentPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("NewFixedPropertyIncidentPopup"));
  }
  
  public NewFixedPropertyIncidentPopup_UpLink getNewFixedPropertyIncidentPopup_UpLink() {
    return getOrCreateProperty("NewFixedPropertyIncidentPopup_UpLink", "NewFixedPropertyIncidentPopup_UpLink", null, pcftest.NewFixedPropertyIncidentPopup.NewFixedPropertyIncidentPopup_UpLink.class);
  }
  
  public NewFixedPropertyIncidentScreen getNewFixedPropertyIncidentScreen() {
    return getOrCreateProperty("NewFixedPropertyIncidentScreen", "NewFixedPropertyIncidentScreen", null, pcftest.NewFixedPropertyIncidentPopup.NewFixedPropertyIncidentScreen.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.NewFixedPropertyIncidentPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.NewFixedPropertyIncidentPopup.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newexposure/NewFixedPropertyIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewFixedPropertyIncidentPopup_UpLink extends ClickableActionElement {
    public NewFixedPropertyIncidentPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newexposure/NewFixedPropertyIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewFixedPropertyIncidentScreen extends PCFElement {
    public NewFixedPropertyIncidentScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Cancel getCancel() {
      return getOrCreateProperty("Cancel", "Cancel", null, pcftest.NewFixedPropertyIncidentPopup.NewFixedPropertyIncidentScreen.Cancel.class);
    }
    
    public Edit getEdit() {
      return getOrCreateProperty("Edit", "Edit", null, pcftest.NewFixedPropertyIncidentPopup.NewFixedPropertyIncidentScreen.Edit.class);
    }
    
    public FixPropIncidentDetailDV getFixPropIncidentDetailDV() {
      return getOrCreateProperty("FixPropIncidentDetailDV", "FixPropIncidentDetailDV", null, pcftest.FixPropIncidentDetailDV.class);
    }
    
    public FixedPropertyIncident_PrintButton getFixedPropertyIncident_PrintButton() {
      return getOrCreateProperty("FixedPropertyIncident_PrintButton", "FixedPropertyIncident_PrintButton", null, pcftest.NewFixedPropertyIncidentPopup.NewFixedPropertyIncidentScreen.FixedPropertyIncident_PrintButton.class);
    }
    
    public Update getUpdate() {
      return getOrCreateProperty("Update", "Update", null, pcftest.NewFixedPropertyIncidentPopup.NewFixedPropertyIncidentScreen.Update.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.NewFixedPropertyIncidentPopup.NewFixedPropertyIncidentScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newexposure/NewFixedPropertyIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Cancel extends ClickableActionElement {
      public Cancel(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newexposure/NewFixedPropertyIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Edit extends ClickableActionElement {
      public Edit(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newexposure/NewFixedPropertyIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class FixedPropertyIncident_PrintButton extends ClickableActionElement {
      public FixedPropertyIncident_PrintButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newexposure/NewFixedPropertyIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Update extends ClickableActionElement {
      public Update(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newexposure/NewFixedPropertyIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/newexposure/NewFixedPropertyIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newexposure/NewFixedPropertyIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}