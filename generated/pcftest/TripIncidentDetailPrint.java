package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.TripIncidentDetailPrint.TripIncidentDetailPrint_UpLink;
import pcftest.TripIncidentDetailPrint._Paging;
import pcftest.TripIncidentDetailPrint.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/shared/printing/TripIncidentDetailPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class TripIncidentDetailPrint extends PCFLocation {
  public final static String CHECKSUM = "b57e93a248f96c352e8d23acdbfaa6f8";
  
  public TripIncidentDetailPrint(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("TripIncidentDetailPrint"));
  }
  
  public NewTripIncidentScreen getNewTripIncidentScreen() {
    return getOrCreateProperty("NewTripIncidentScreen", "NewTripIncidentScreen", null, pcftest.NewTripIncidentScreen.class);
  }
  
  public TripIncidentDetailPrint_UpLink getTripIncidentDetailPrint_UpLink() {
    return getOrCreateProperty("TripIncidentDetailPrint_UpLink", "TripIncidentDetailPrint_UpLink", null, pcftest.TripIncidentDetailPrint.TripIncidentDetailPrint_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.TripIncidentDetailPrint._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.TripIncidentDetailPrint.__crumb__.class);
  }
  
  public ClaimPrintout get_parent() {
    return getOrCreateProperty("_parent", pcftest.ClaimPrintout.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/printing/TripIncidentDetailPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TripIncidentDetailPrint_UpLink extends ClickableActionElement {
    public TripIncidentDetailPrint_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/printing/TripIncidentDetailPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/printing/TripIncidentDetailPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}