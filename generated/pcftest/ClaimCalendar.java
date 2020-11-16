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
import pcftest.ClaimCalendar.ClaimCalendarScreen;
import pcftest.ClaimCalendar.ClaimCalendarScreen._msgs;
import pcftest.ClaimCalendar.ClaimCalendar_UpLink;
import pcftest.ClaimCalendar._Paging;
import pcftest.ClaimCalendar.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/calendar/ClaimCalendar.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimCalendar extends PCFLocation {
  public final static String CHECKSUM = "f777fb716391779707d39067b56b63d8";
  
  public ClaimCalendar(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ClaimCalendar"));
  }
  
  public ClaimCalendarScreen getClaimCalendarScreen() {
    return getOrCreateProperty("ClaimCalendarScreen", "ClaimCalendarScreen", null, pcftest.ClaimCalendar.ClaimCalendarScreen.class);
  }
  
  public ClaimCalendar_UpLink getClaimCalendar_UpLink() {
    return getOrCreateProperty("ClaimCalendar_UpLink", "ClaimCalendar_UpLink", null, pcftest.ClaimCalendar.ClaimCalendar_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ClaimCalendar._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ClaimCalendar.__crumb__.class);
  }
  
  public ClaimCalendarGroup get_parent() {
    return getOrCreateProperty("_parent", pcftest.ClaimCalendarGroup.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/calendar/ClaimCalendar.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimCalendarScreen extends PCFElement {
    public ClaimCalendarScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ClaimCalendar.ClaimCalendarScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/calendar/ClaimCalendar.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/calendar/ClaimCalendar.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimCalendar_UpLink extends ClickableActionElement {
    public ClaimCalendar_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/calendar/ClaimCalendar.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/calendar/ClaimCalendar.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}