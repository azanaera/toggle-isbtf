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
import pcftest.SupervisorCalendar.SupervisorCalendarScreen;
import pcftest.SupervisorCalendar.SupervisorCalendarScreen._msgs;
import pcftest.SupervisorCalendar.SupervisorCalendar_UpLink;
import pcftest.SupervisorCalendar._Paging;
import pcftest.SupervisorCalendar.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/desktop/calendar/SupervisorCalendar.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class SupervisorCalendar extends PCFLocation {
  public final static String CHECKSUM = "b4dd4a9ddf6625d2aba0c571b3595b25";
  
  public SupervisorCalendar(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("SupervisorCalendar"));
  }
  
  public SupervisorCalendarScreen getSupervisorCalendarScreen() {
    return getOrCreateProperty("SupervisorCalendarScreen", "SupervisorCalendarScreen", null, pcftest.SupervisorCalendar.SupervisorCalendarScreen.class);
  }
  
  public SupervisorCalendar_UpLink getSupervisorCalendar_UpLink() {
    return getOrCreateProperty("SupervisorCalendar_UpLink", "SupervisorCalendar_UpLink", null, pcftest.SupervisorCalendar.SupervisorCalendar_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.SupervisorCalendar._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.SupervisorCalendar.__crumb__.class);
  }
  
  public DesktopCalendarGroup get_parent() {
    return getOrCreateProperty("_parent", pcftest.DesktopCalendarGroup.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/desktop/calendar/SupervisorCalendar.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SupervisorCalendarScreen extends PCFElement {
    public SupervisorCalendarScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.SupervisorCalendar.SupervisorCalendarScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/desktop/calendar/SupervisorCalendar.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/desktop/calendar/SupervisorCalendar.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SupervisorCalendar_UpLink extends ClickableActionElement {
    public SupervisorCalendar_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/desktop/calendar/SupervisorCalendar.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/desktop/calendar/SupervisorCalendar.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}