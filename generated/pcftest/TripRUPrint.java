package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.TripRUPrint.TripRUPrint_UpLink;
import pcftest.TripRUPrint._Paging;
import pcftest.TripRUPrint.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/lossdetails/print/TripRUPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class TripRUPrint extends PCFLocation {
  public final static String CHECKSUM = "9671f8c9471e308171ffb5a892a1e8f4";
  
  public TripRUPrint(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("TripRUPrint"));
  }
  
  public TripRUPrint_UpLink getTripRUPrint_UpLink() {
    return getOrCreateProperty("TripRUPrint_UpLink", "TripRUPrint_UpLink", null, pcftest.TripRUPrint.TripRUPrint_UpLink.class);
  }
  
  public TripRUScreen getTripRUScreen() {
    return getOrCreateProperty("TripRUScreen", "TripRUScreen", null, pcftest.TripRUScreen.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.TripRUPrint._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.TripRUPrint.__crumb__.class);
  }
  
  public ClaimPrintout get_parent() {
    return getOrCreateProperty("_parent", pcftest.ClaimPrintout.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/print/TripRUPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TripRUPrint_UpLink extends ClickableActionElement {
    public TripRUPrint_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/print/TripRUPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/print/TripRUPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}