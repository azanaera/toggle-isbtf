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
import pcftest.EditFixedPropertyIncidentPopup.EditFixedPropertyIncidentPopup_UpLink;
import pcftest.EditFixedPropertyIncidentPopup.EditFixedPropertyIncidentScreen;
import pcftest.EditFixedPropertyIncidentPopup.EditFixedPropertyIncidentScreen.Cancel;
import pcftest.EditFixedPropertyIncidentPopup.EditFixedPropertyIncidentScreen.Edit;
import pcftest.EditFixedPropertyIncidentPopup.EditFixedPropertyIncidentScreen.FixedPropertyIncident_PrintButton;
import pcftest.EditFixedPropertyIncidentPopup.EditFixedPropertyIncidentScreen.Update;
import pcftest.EditFixedPropertyIncidentPopup.EditFixedPropertyIncidentScreen._msgs;
import pcftest.EditFixedPropertyIncidentPopup._Paging;
import pcftest.EditFixedPropertyIncidentPopup.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/lossdetails/EditFixedPropertyIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class EditFixedPropertyIncidentPopup extends PCFLocation {
  public final static String CHECKSUM = "5d9ca3483d49c21d504684efec8c6f80";
  
  public EditFixedPropertyIncidentPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("EditFixedPropertyIncidentPopup"));
  }
  
  public EditFixedPropertyIncidentPopup_UpLink getEditFixedPropertyIncidentPopup_UpLink() {
    return getOrCreateProperty("EditFixedPropertyIncidentPopup_UpLink", "EditFixedPropertyIncidentPopup_UpLink", null, pcftest.EditFixedPropertyIncidentPopup.EditFixedPropertyIncidentPopup_UpLink.class);
  }
  
  public EditFixedPropertyIncidentScreen getEditFixedPropertyIncidentScreen() {
    return getOrCreateProperty("EditFixedPropertyIncidentScreen", "EditFixedPropertyIncidentScreen", null, pcftest.EditFixedPropertyIncidentPopup.EditFixedPropertyIncidentScreen.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.EditFixedPropertyIncidentPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.EditFixedPropertyIncidentPopup.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/EditFixedPropertyIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditFixedPropertyIncidentPopup_UpLink extends ClickableActionElement {
    public EditFixedPropertyIncidentPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/EditFixedPropertyIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditFixedPropertyIncidentScreen extends PCFElement {
    public EditFixedPropertyIncidentScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Cancel getCancel() {
      return getOrCreateProperty("Cancel", "Cancel", null, pcftest.EditFixedPropertyIncidentPopup.EditFixedPropertyIncidentScreen.Cancel.class);
    }
    
    public Edit getEdit() {
      return getOrCreateProperty("Edit", "Edit", null, pcftest.EditFixedPropertyIncidentPopup.EditFixedPropertyIncidentScreen.Edit.class);
    }
    
    public FixPropIncidentDetailDV getFixPropIncidentDetailDV() {
      return getOrCreateProperty("FixPropIncidentDetailDV", "FixPropIncidentDetailDV", null, pcftest.FixPropIncidentDetailDV.class);
    }
    
    public FixedPropertyIncident_PrintButton getFixedPropertyIncident_PrintButton() {
      return getOrCreateProperty("FixedPropertyIncident_PrintButton", "FixedPropertyIncident_PrintButton", null, pcftest.EditFixedPropertyIncidentPopup.EditFixedPropertyIncidentScreen.FixedPropertyIncident_PrintButton.class);
    }
    
    public Update getUpdate() {
      return getOrCreateProperty("Update", "Update", null, pcftest.EditFixedPropertyIncidentPopup.EditFixedPropertyIncidentScreen.Update.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.EditFixedPropertyIncidentPopup.EditFixedPropertyIncidentScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/EditFixedPropertyIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Cancel extends ClickableActionElement {
      public Cancel(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/EditFixedPropertyIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Edit extends ClickableActionElement {
      public Edit(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/EditFixedPropertyIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class FixedPropertyIncident_PrintButton extends ClickableActionElement {
      public FixedPropertyIncident_PrintButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/EditFixedPropertyIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Update extends ClickableActionElement {
      public Update(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/EditFixedPropertyIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/lossdetails/EditFixedPropertyIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/EditFixedPropertyIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}