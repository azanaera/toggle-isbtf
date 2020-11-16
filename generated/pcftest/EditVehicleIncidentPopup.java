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
import pcftest.EditVehicleIncidentPopup.EditVehicleIncidentPopup_UpLink;
import pcftest.EditVehicleIncidentPopup.EditVehicleIncidentScreen;
import pcftest.EditVehicleIncidentPopup.EditVehicleIncidentScreen.Cancel;
import pcftest.EditVehicleIncidentPopup.EditVehicleIncidentScreen.Edit;
import pcftest.EditVehicleIncidentPopup.EditVehicleIncidentScreen.Update;
import pcftest.EditVehicleIncidentPopup.EditVehicleIncidentScreen.VehicleIncident_PrintButton;
import pcftest.EditVehicleIncidentPopup.EditVehicleIncidentScreen._msgs;
import pcftest.EditVehicleIncidentPopup._Paging;
import pcftest.EditVehicleIncidentPopup.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/lossdetails/EditVehicleIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class EditVehicleIncidentPopup extends PCFLocation {
  public final static String CHECKSUM = "a775cad23da67a017c311d6b8ce84e47";
  
  public EditVehicleIncidentPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("EditVehicleIncidentPopup"));
  }
  
  public ClaimInfoBar getClaimInfoBar() {
    return getOrCreateProperty("ClaimInfoBar", "ClaimInfoBar", null, pcftest.ClaimInfoBar.class);
  }
  
  public EditVehicleIncidentPopup_UpLink getEditVehicleIncidentPopup_UpLink() {
    return getOrCreateProperty("EditVehicleIncidentPopup_UpLink", "EditVehicleIncidentPopup_UpLink", null, pcftest.EditVehicleIncidentPopup.EditVehicleIncidentPopup_UpLink.class);
  }
  
  public EditVehicleIncidentScreen getEditVehicleIncidentScreen() {
    return getOrCreateProperty("EditVehicleIncidentScreen", "EditVehicleIncidentScreen", null, pcftest.EditVehicleIncidentPopup.EditVehicleIncidentScreen.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.EditVehicleIncidentPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.EditVehicleIncidentPopup.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/EditVehicleIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditVehicleIncidentPopup_UpLink extends ClickableActionElement {
    public EditVehicleIncidentPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/EditVehicleIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditVehicleIncidentScreen extends PCFElement {
    public EditVehicleIncidentScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Cancel getCancel() {
      return getOrCreateProperty("Cancel", "Cancel", null, pcftest.EditVehicleIncidentPopup.EditVehicleIncidentScreen.Cancel.class);
    }
    
    public Edit getEdit() {
      return getOrCreateProperty("Edit", "Edit", null, pcftest.EditVehicleIncidentPopup.EditVehicleIncidentScreen.Edit.class);
    }
    
    public Update getUpdate() {
      return getOrCreateProperty("Update", "Update", null, pcftest.EditVehicleIncidentPopup.EditVehicleIncidentScreen.Update.class);
    }
    
    public VehIncidentDetailDV getVehIncidentDetailDV() {
      return getOrCreateProperty("VehIncidentDetailDV", "VehIncidentDetailDV", null, pcftest.VehIncidentDetailDV.class);
    }
    
    public VehicleIncident_PrintButton getVehicleIncident_PrintButton() {
      return getOrCreateProperty("VehicleIncident_PrintButton", "VehicleIncident_PrintButton", null, pcftest.EditVehicleIncidentPopup.EditVehicleIncidentScreen.VehicleIncident_PrintButton.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.EditVehicleIncidentPopup.EditVehicleIncidentScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/EditVehicleIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Cancel extends ClickableActionElement {
      public Cancel(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/EditVehicleIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Edit extends ClickableActionElement {
      public Edit(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/EditVehicleIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Update extends ClickableActionElement {
      public Update(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/EditVehicleIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class VehicleIncident_PrintButton extends ClickableActionElement {
      public VehicleIncident_PrintButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/EditVehicleIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/lossdetails/EditVehicleIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/EditVehicleIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}