package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.TripRUPopup.TripRUPopup_UpLink;
import pcftest.TripRUPopup._Paging;
import pcftest.TripRUPopup.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/lossdetails/TripRUPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class TripRUPopup extends PCFLocation {
  public final static String CHECKSUM = "f57329c48ac2efc491e6fa501c25a129";
  
  public TripRUPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("TripRUPopup"));
  }
  
  public TripRUPopup_UpLink getTripRUPopup_UpLink() {
    return getOrCreateProperty("TripRUPopup_UpLink", "TripRUPopup_UpLink", null, pcftest.TripRUPopup.TripRUPopup_UpLink.class);
  }
  
  public TripRUScreen getTripRUScreen() {
    return getOrCreateProperty("TripRUScreen", "TripRUScreen", null, pcftest.TripRUScreen.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.TripRUPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.TripRUPopup.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/TripRUPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TripRUPopup_UpLink extends ClickableActionElement {
    public TripRUPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/TripRUPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/TripRUPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}