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
import pcftest.Calendar.CalendarScreen;
import pcftest.Calendar.CalendarScreen._msgs;
import pcftest.Calendar.Calendar_UpLink;
import pcftest.Calendar._Paging;
import pcftest.Calendar.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/desktop/calendar/Calendar.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class Calendar extends PCFLocation {
  public final static String CHECKSUM = "cad898122b2e2d7d62c1e5a93d0f0643";
  
  public Calendar(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("Calendar"));
  }
  
  public CalendarScreen getCalendarScreen() {
    return getOrCreateProperty("CalendarScreen", "CalendarScreen", null, pcftest.Calendar.CalendarScreen.class);
  }
  
  public Calendar_UpLink getCalendar_UpLink() {
    return getOrCreateProperty("Calendar_UpLink", "Calendar_UpLink", null, pcftest.Calendar.Calendar_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.Calendar._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.Calendar.__crumb__.class);
  }
  
  public DesktopCalendarGroup get_parent() {
    return getOrCreateProperty("_parent", pcftest.DesktopCalendarGroup.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/desktop/calendar/Calendar.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CalendarScreen extends PCFElement {
    public CalendarScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.Calendar.CalendarScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/desktop/calendar/Calendar.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/desktop/calendar/Calendar.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Calendar_UpLink extends ClickableActionElement {
    public Calendar_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/desktop/calendar/Calendar.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/desktop/calendar/Calendar.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}