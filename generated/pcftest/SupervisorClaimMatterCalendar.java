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
import pcftest.SupervisorClaimMatterCalendar.SupervisorClaimMatterCalendarScreen;
import pcftest.SupervisorClaimMatterCalendar.SupervisorClaimMatterCalendarScreen._msgs;
import pcftest.SupervisorClaimMatterCalendar.SupervisorClaimMatterCalendar_UpLink;
import pcftest.SupervisorClaimMatterCalendar._Paging;
import pcftest.SupervisorClaimMatterCalendar.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/calendar/SupervisorClaimMatterCalendar.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class SupervisorClaimMatterCalendar extends PCFLocation {
  public final static String CHECKSUM = "18eff9bf8d9e7f3b16e363c24419a6d9";
  
  public SupervisorClaimMatterCalendar(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("SupervisorClaimMatterCalendar"));
  }
  
  public SupervisorClaimMatterCalendarScreen getSupervisorClaimMatterCalendarScreen() {
    return getOrCreateProperty("SupervisorClaimMatterCalendarScreen", "SupervisorClaimMatterCalendarScreen", null, pcftest.SupervisorClaimMatterCalendar.SupervisorClaimMatterCalendarScreen.class);
  }
  
  public SupervisorClaimMatterCalendar_UpLink getSupervisorClaimMatterCalendar_UpLink() {
    return getOrCreateProperty("SupervisorClaimMatterCalendar_UpLink", "SupervisorClaimMatterCalendar_UpLink", null, pcftest.SupervisorClaimMatterCalendar.SupervisorClaimMatterCalendar_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.SupervisorClaimMatterCalendar._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.SupervisorClaimMatterCalendar.__crumb__.class);
  }
  
  public MatterDetailPage get_parent() {
    return getOrCreateProperty("_parent", pcftest.MatterDetailPage.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/calendar/SupervisorClaimMatterCalendar.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SupervisorClaimMatterCalendarScreen extends PCFElement {
    public SupervisorClaimMatterCalendarScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.SupervisorClaimMatterCalendar.SupervisorClaimMatterCalendarScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/calendar/SupervisorClaimMatterCalendar.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/calendar/SupervisorClaimMatterCalendar.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SupervisorClaimMatterCalendar_UpLink extends ClickableActionElement {
    public SupervisorClaimMatterCalendar_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/calendar/SupervisorClaimMatterCalendar.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/calendar/SupervisorClaimMatterCalendar.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}