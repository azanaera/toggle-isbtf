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
import pcftest.TripIncidentsPrint.TripIncidentsPrintScreen;
import pcftest.TripIncidentsPrint.TripIncidentsPrintScreen._msgs;
import pcftest.TripIncidentsPrint.TripIncidentsPrint_UpLink;
import pcftest.TripIncidentsPrint._Paging;
import pcftest.TripIncidentsPrint.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/lossdetails/print/TripIncidentsPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class TripIncidentsPrint extends PCFLocation {
  public final static String CHECKSUM = "2e027bad42b570553eca839cc284471c";
  
  public TripIncidentsPrint(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("TripIncidentsPrint"));
  }
  
  public TripIncidentsPrintScreen getTripIncidentsPrintScreen() {
    return getOrCreateProperty("TripIncidentsPrintScreen", "TripIncidentsPrintScreen", null, pcftest.TripIncidentsPrint.TripIncidentsPrintScreen.class);
  }
  
  public TripIncidentsPrint_UpLink getTripIncidentsPrint_UpLink() {
    return getOrCreateProperty("TripIncidentsPrint_UpLink", "TripIncidentsPrint_UpLink", null, pcftest.TripIncidentsPrint.TripIncidentsPrint_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.TripIncidentsPrint._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.TripIncidentsPrint.__crumb__.class);
  }
  
  public ClaimLossDetails get_parent() {
    return getOrCreateProperty("_parent", pcftest.ClaimLossDetails.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/print/TripIncidentsPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TripIncidentsPrintScreen extends PCFElement {
    public TripIncidentsPrintScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public EditableTripIncidentsLV getEditableTripIncidentsLV() {
      return getOrCreateProperty("EditableTripIncidentsLV", "EditableTripIncidentsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.EditableTripIncidentsLV.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.TripIncidentsPrint.TripIncidentsPrintScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/print/TripIncidentsPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/lossdetails/print/TripIncidentsPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TripIncidentsPrint_UpLink extends ClickableActionElement {
    public TripIncidentsPrint_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/print/TripIncidentsPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/print/TripIncidentsPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}