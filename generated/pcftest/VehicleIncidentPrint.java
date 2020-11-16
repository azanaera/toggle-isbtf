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
import pcftest.VehicleIncidentPrint.VehicleIncidentPrintScreen;
import pcftest.VehicleIncidentPrint.VehicleIncidentPrintScreen._msgs;
import pcftest.VehicleIncidentPrint.VehicleIncidentPrint_UpLink;
import pcftest.VehicleIncidentPrint._Paging;
import pcftest.VehicleIncidentPrint.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/lossdetails/print/VehicleIncidentPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class VehicleIncidentPrint extends PCFLocation {
  public final static String CHECKSUM = "2d885dca3ea4d77dd33673c12367faea";
  
  public VehicleIncidentPrint(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("VehicleIncidentPrint"));
  }
  
  public VehicleIncidentPrintScreen getVehicleIncidentPrintScreen() {
    return getOrCreateProperty("VehicleIncidentPrintScreen", "VehicleIncidentPrintScreen", null, pcftest.VehicleIncidentPrint.VehicleIncidentPrintScreen.class);
  }
  
  public VehicleIncidentPrint_UpLink getVehicleIncidentPrint_UpLink() {
    return getOrCreateProperty("VehicleIncidentPrint_UpLink", "VehicleIncidentPrint_UpLink", null, pcftest.VehicleIncidentPrint.VehicleIncidentPrint_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.VehicleIncidentPrint._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.VehicleIncidentPrint.__crumb__.class);
  }
  
  public ClaimLossDetails get_parent() {
    return getOrCreateProperty("_parent", pcftest.ClaimLossDetails.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/print/VehicleIncidentPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class VehicleIncidentPrintScreen extends PCFElement {
    public VehicleIncidentPrintScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public EditableVehicleIncidentsLV getEditableVehicleIncidentsLV() {
      return getOrCreateProperty("EditableVehicleIncidentsLV", "EditableVehicleIncidentsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.EditableVehicleIncidentsLV.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.VehicleIncidentPrint.VehicleIncidentPrintScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/print/VehicleIncidentPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/lossdetails/print/VehicleIncidentPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class VehicleIncidentPrint_UpLink extends ClickableActionElement {
    public VehicleIncidentPrint_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/print/VehicleIncidentPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/print/VehicleIncidentPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}