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
import pcftest.NewVehicleIncidentPopup.NewVehicleIncidentPopup_UpLink;
import pcftest.NewVehicleIncidentPopup.NewVehicleIncidentScreen;
import pcftest.NewVehicleIncidentPopup.NewVehicleIncidentScreen.Cancel;
import pcftest.NewVehicleIncidentPopup.NewVehicleIncidentScreen.Edit;
import pcftest.NewVehicleIncidentPopup.NewVehicleIncidentScreen.Update;
import pcftest.NewVehicleIncidentPopup.NewVehicleIncidentScreen._msgs;
import pcftest.NewVehicleIncidentPopup._Paging;
import pcftest.NewVehicleIncidentPopup.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/shared/vehicle/NewVehicleIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NewVehicleIncidentPopup extends PCFLocation {
  public final static String CHECKSUM = "0f7c4cedca381b9203507383c8f46c1f";
  
  public NewVehicleIncidentPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("NewVehicleIncidentPopup"));
  }
  
  public NewVehicleIncidentPopup_UpLink getNewVehicleIncidentPopup_UpLink() {
    return getOrCreateProperty("NewVehicleIncidentPopup_UpLink", "NewVehicleIncidentPopup_UpLink", null, pcftest.NewVehicleIncidentPopup.NewVehicleIncidentPopup_UpLink.class);
  }
  
  public NewVehicleIncidentScreen getNewVehicleIncidentScreen() {
    return getOrCreateProperty("NewVehicleIncidentScreen", "NewVehicleIncidentScreen", null, pcftest.NewVehicleIncidentPopup.NewVehicleIncidentScreen.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.NewVehicleIncidentPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.NewVehicleIncidentPopup.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/vehicle/NewVehicleIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewVehicleIncidentPopup_UpLink extends ClickableActionElement {
    public NewVehicleIncidentPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/vehicle/NewVehicleIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewVehicleIncidentScreen extends PCFElement {
    public NewVehicleIncidentScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Cancel getCancel() {
      return getOrCreateProperty("Cancel", "Cancel", null, pcftest.NewVehicleIncidentPopup.NewVehicleIncidentScreen.Cancel.class);
    }
    
    public Edit getEdit() {
      return getOrCreateProperty("Edit", "Edit", null, pcftest.NewVehicleIncidentPopup.NewVehicleIncidentScreen.Edit.class);
    }
    
    public Update getUpdate() {
      return getOrCreateProperty("Update", "Update", null, pcftest.NewVehicleIncidentPopup.NewVehicleIncidentScreen.Update.class);
    }
    
    public VehIncidentDetailDV getVehIncidentDetailDV() {
      return getOrCreateProperty("VehIncidentDetailDV", "VehIncidentDetailDV", null, pcftest.VehIncidentDetailDV.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.NewVehicleIncidentPopup.NewVehicleIncidentScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/vehicle/NewVehicleIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Cancel extends ClickableActionElement {
      public Cancel(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/vehicle/NewVehicleIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Edit extends ClickableActionElement {
      public Edit(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/vehicle/NewVehicleIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Update extends ClickableActionElement {
      public Update(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/vehicle/NewVehicleIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/shared/vehicle/NewVehicleIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/vehicle/NewVehicleIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}