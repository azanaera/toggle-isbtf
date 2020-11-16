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
import pcftest.VehicleIncidentDetailPrint.VehicleIncidentDetailPrint_UpLink;
import pcftest.VehicleIncidentDetailPrint.VehicleIncidentScreen;
import pcftest.VehicleIncidentDetailPrint.VehicleIncidentScreen._msgs;
import pcftest.VehicleIncidentDetailPrint._Paging;
import pcftest.VehicleIncidentDetailPrint.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/lossdetails/print/VehicleIncidentDetailPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class VehicleIncidentDetailPrint extends PCFLocation {
  public final static String CHECKSUM = "826627be48afafce3acbb018490a713f";
  
  public VehicleIncidentDetailPrint(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("VehicleIncidentDetailPrint"));
  }
  
  public ClaimInfoBar getClaimInfoBar() {
    return getOrCreateProperty("ClaimInfoBar", "ClaimInfoBar", null, pcftest.ClaimInfoBar.class);
  }
  
  public VehicleIncidentDetailPrint_UpLink getVehicleIncidentDetailPrint_UpLink() {
    return getOrCreateProperty("VehicleIncidentDetailPrint_UpLink", "VehicleIncidentDetailPrint_UpLink", null, pcftest.VehicleIncidentDetailPrint.VehicleIncidentDetailPrint_UpLink.class);
  }
  
  public VehicleIncidentScreen getVehicleIncidentScreen() {
    return getOrCreateProperty("VehicleIncidentScreen", "VehicleIncidentScreen", null, pcftest.VehicleIncidentDetailPrint.VehicleIncidentScreen.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.VehicleIncidentDetailPrint._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.VehicleIncidentDetailPrint.__crumb__.class);
  }
  
  public ClaimLossDetails get_parent() {
    return getOrCreateProperty("_parent", pcftest.ClaimLossDetails.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/print/VehicleIncidentDetailPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class VehicleIncidentDetailPrint_UpLink extends ClickableActionElement {
    public VehicleIncidentDetailPrint_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/print/VehicleIncidentDetailPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class VehicleIncidentScreen extends PCFElement {
    public VehicleIncidentScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public VehIncidentDetailDV getVehIncidentDetailDV() {
      return getOrCreateProperty("VehIncidentDetailDV", "VehIncidentDetailDV", null, pcftest.VehIncidentDetailDV.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.VehicleIncidentDetailPrint.VehicleIncidentScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/print/VehicleIncidentDetailPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/lossdetails/print/VehicleIncidentDetailPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/print/VehicleIncidentDetailPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}