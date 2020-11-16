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
import pcftest.DesktopCalendarGroup.DesktopCalendarGroup_UpLink;
import pcftest.DesktopCalendarGroup.MenuLinks;
import pcftest.DesktopCalendarGroup.MenuLinks.DesktopCalendarGroup_Calendar;
import pcftest.DesktopCalendarGroup.MenuLinks.DesktopCalendarGroup_SupervisorCalendar;
import pcftest.DesktopCalendarGroup._Paging;
import pcftest.DesktopCalendarGroup.__crumb__;
import pcftest.DesktopCalendarGroup._msgs;
import pcftest.DesktopCalendarGroup.actWizard;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/desktop/calendar/DesktopCalendarGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class DesktopCalendarGroup extends PCFLocation {
  public final static String CHECKSUM = "be20978a146d20e65532fb3448e877c5";
  
  public DesktopCalendarGroup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("DesktopCalendarGroup"));
  }
  
  public Calendar getCalendar() {
    return getOrCreateProperty("Calendar", pcftest.Calendar.class);
  }
  
  public DesktopCalendarGroup_UpLink getDesktopCalendarGroup_UpLink() {
    return getOrCreateProperty("DesktopCalendarGroup_UpLink", "DesktopCalendarGroup_UpLink", null, pcftest.DesktopCalendarGroup.DesktopCalendarGroup_UpLink.class);
  }
  
  public MenuLinks getMenuLinks() {
    return getOrCreateMenuLinksProperty("MenuLinks", "MenuLinks", null, pcftest.DesktopCalendarGroup.MenuLinks.class, "Desktop-MenuLinks-Desktop_DesktopCalendarGroup");
  }
  
  public SupervisorCalendar getSupervisorCalendar() {
    return getOrCreateProperty("SupervisorCalendar", pcftest.SupervisorCalendar.class);
  }
  
  public TabBar getTabBar() {
    return getOrCreateProperty("TabBar", pcftest.TabBar.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.DesktopCalendarGroup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.DesktopCalendarGroup.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.DesktopCalendarGroup._msgs.class);
  }
  
  public Desktop get_parent() {
    return getOrCreateProperty("_parent", pcftest.Desktop.class);
  }
  
  public actWizard getactWizard() {
    return getOrCreateProperty("actWizard", "actWizard", null, pcftest.DesktopCalendarGroup.actWizard.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/desktop/calendar/DesktopCalendarGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DesktopCalendarGroup_UpLink extends ClickableActionElement {
    public DesktopCalendarGroup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/desktop/calendar/DesktopCalendarGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MenuLinks extends PCFElement {
    public MenuLinks(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public DesktopCalendarGroup_Calendar getDesktopCalendarGroup_Calendar() {
      return getOrCreateProperty("DesktopCalendarGroup_Calendar", "DesktopCalendarGroup_Calendar", null, pcftest.DesktopCalendarGroup.MenuLinks.DesktopCalendarGroup_Calendar.class);
    }
    
    public DesktopCalendarGroup_SupervisorCalendar getDesktopCalendarGroup_SupervisorCalendar() {
      return getOrCreateProperty("DesktopCalendarGroup_SupervisorCalendar", "DesktopCalendarGroup_SupervisorCalendar", null, pcftest.DesktopCalendarGroup.MenuLinks.DesktopCalendarGroup_SupervisorCalendar.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/desktop/calendar/DesktopCalendarGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class DesktopCalendarGroup_Calendar extends ClickableActionElement {
      public DesktopCalendarGroup_Calendar(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public Calendar click() {
        return clickThis(pcftest.Calendar.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/desktop/calendar/DesktopCalendarGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class DesktopCalendarGroup_SupervisorCalendar extends ClickableActionElement {
      public DesktopCalendarGroup_SupervisorCalendar(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public SupervisorCalendar click() {
        return clickThis(pcftest.SupervisorCalendar.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/desktop/calendar/DesktopCalendarGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/desktop/calendar/DesktopCalendarGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/desktop/calendar/DesktopCalendarGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/desktop/calendar/DesktopCalendarGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class actWizard extends ClickableActionElement {
    public actWizard(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  
}