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
import pcftest.SupervisorClaimAllMattersCalendar.SupervisorClaimAllMattersCalendarScreen;
import pcftest.SupervisorClaimAllMattersCalendar.SupervisorClaimAllMattersCalendarScreen._msgs;
import pcftest.SupervisorClaimAllMattersCalendar.SupervisorClaimAllMattersCalendar_UpLink;
import pcftest.SupervisorClaimAllMattersCalendar._Paging;
import pcftest.SupervisorClaimAllMattersCalendar.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/desktop/calendar/SupervisorClaimAllMattersCalendar.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class SupervisorClaimAllMattersCalendar extends PCFLocation {
  public final static String CHECKSUM = "e4804bd67e57e7f63719c667d503d440";
  
  public SupervisorClaimAllMattersCalendar(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("SupervisorClaimAllMattersCalendar"));
  }
  
  public SupervisorClaimAllMattersCalendarScreen getSupervisorClaimAllMattersCalendarScreen() {
    return getOrCreateProperty("SupervisorClaimAllMattersCalendarScreen", "SupervisorClaimAllMattersCalendarScreen", null, pcftest.SupervisorClaimAllMattersCalendar.SupervisorClaimAllMattersCalendarScreen.class);
  }
  
  public SupervisorClaimAllMattersCalendar_UpLink getSupervisorClaimAllMattersCalendar_UpLink() {
    return getOrCreateProperty("SupervisorClaimAllMattersCalendar_UpLink", "SupervisorClaimAllMattersCalendar_UpLink", null, pcftest.SupervisorClaimAllMattersCalendar.SupervisorClaimAllMattersCalendar_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.SupervisorClaimAllMattersCalendar._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.SupervisorClaimAllMattersCalendar.__crumb__.class);
  }
  
  public ClaimMatters get_parent() {
    return getOrCreateProperty("_parent", pcftest.ClaimMatters.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/desktop/calendar/SupervisorClaimAllMattersCalendar.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SupervisorClaimAllMattersCalendarScreen extends PCFElement {
    public SupervisorClaimAllMattersCalendarScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.SupervisorClaimAllMattersCalendar.SupervisorClaimAllMattersCalendarScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/desktop/calendar/SupervisorClaimAllMattersCalendar.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/desktop/calendar/SupervisorClaimAllMattersCalendar.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SupervisorClaimAllMattersCalendar_UpLink extends ClickableActionElement {
    public SupervisorClaimAllMattersCalendar_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/desktop/calendar/SupervisorClaimAllMattersCalendar.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/desktop/calendar/SupervisorClaimAllMattersCalendar.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}