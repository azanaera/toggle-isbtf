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
import pcftest.ClaimAllMattersCalendar.ClaimAllMattersCalendarScreen;
import pcftest.ClaimAllMattersCalendar.ClaimAllMattersCalendarScreen._msgs;
import pcftest.ClaimAllMattersCalendar.ClaimAllMattersCalendar_UpLink;
import pcftest.ClaimAllMattersCalendar._Paging;
import pcftest.ClaimAllMattersCalendar.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/calendar/ClaimAllMattersCalendar.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimAllMattersCalendar extends PCFLocation {
  public final static String CHECKSUM = "6cf451817466eceed5f90f04152aeb70";
  
  public ClaimAllMattersCalendar(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ClaimAllMattersCalendar"));
  }
  
  public ClaimAllMattersCalendarScreen getClaimAllMattersCalendarScreen() {
    return getOrCreateProperty("ClaimAllMattersCalendarScreen", "ClaimAllMattersCalendarScreen", null, pcftest.ClaimAllMattersCalendar.ClaimAllMattersCalendarScreen.class);
  }
  
  public ClaimAllMattersCalendar_UpLink getClaimAllMattersCalendar_UpLink() {
    return getOrCreateProperty("ClaimAllMattersCalendar_UpLink", "ClaimAllMattersCalendar_UpLink", null, pcftest.ClaimAllMattersCalendar.ClaimAllMattersCalendar_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ClaimAllMattersCalendar._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ClaimAllMattersCalendar.__crumb__.class);
  }
  
  public ClaimMatters get_parent() {
    return getOrCreateProperty("_parent", pcftest.ClaimMatters.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/calendar/ClaimAllMattersCalendar.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimAllMattersCalendarScreen extends PCFElement {
    public ClaimAllMattersCalendarScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ClaimAllMattersCalendar.ClaimAllMattersCalendarScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/calendar/ClaimAllMattersCalendar.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/calendar/ClaimAllMattersCalendar.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimAllMattersCalendar_UpLink extends ClickableActionElement {
    public ClaimAllMattersCalendar_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/calendar/ClaimAllMattersCalendar.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/calendar/ClaimAllMattersCalendar.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}