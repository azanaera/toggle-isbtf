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
import pcftest.SupervisorClaimCalendar.SupervisorClaimCalendarScreen;
import pcftest.SupervisorClaimCalendar.SupervisorClaimCalendarScreen._msgs;
import pcftest.SupervisorClaimCalendar.SupervisorClaimCalendar_UpLink;
import pcftest.SupervisorClaimCalendar._Paging;
import pcftest.SupervisorClaimCalendar.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/desktop/calendar/SupervisorClaimCalendar.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class SupervisorClaimCalendar extends PCFLocation {
  public final static String CHECKSUM = "e85cbb868161f5a59480dfe8cec94b10";
  
  public SupervisorClaimCalendar(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("SupervisorClaimCalendar"));
  }
  
  public SupervisorClaimCalendarScreen getSupervisorClaimCalendarScreen() {
    return getOrCreateProperty("SupervisorClaimCalendarScreen", "SupervisorClaimCalendarScreen", null, pcftest.SupervisorClaimCalendar.SupervisorClaimCalendarScreen.class);
  }
  
  public SupervisorClaimCalendar_UpLink getSupervisorClaimCalendar_UpLink() {
    return getOrCreateProperty("SupervisorClaimCalendar_UpLink", "SupervisorClaimCalendar_UpLink", null, pcftest.SupervisorClaimCalendar.SupervisorClaimCalendar_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.SupervisorClaimCalendar._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.SupervisorClaimCalendar.__crumb__.class);
  }
  
  public ClaimCalendarGroup get_parent() {
    return getOrCreateProperty("_parent", pcftest.ClaimCalendarGroup.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/desktop/calendar/SupervisorClaimCalendar.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SupervisorClaimCalendarScreen extends PCFElement {
    public SupervisorClaimCalendarScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.SupervisorClaimCalendar.SupervisorClaimCalendarScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/desktop/calendar/SupervisorClaimCalendar.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/desktop/calendar/SupervisorClaimCalendar.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SupervisorClaimCalendar_UpLink extends ClickableActionElement {
    public SupervisorClaimCalendar_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/desktop/calendar/SupervisorClaimCalendar.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/desktop/calendar/SupervisorClaimCalendar.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}