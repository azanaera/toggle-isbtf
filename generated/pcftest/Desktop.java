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
import pcftest.Desktop.Desktop_UpLink;
import pcftest.Desktop.MenuLinks;
import pcftest.Desktop.MenuLinks.Desktop_BulkPay;
import pcftest.Desktop.MenuLinks.Desktop_DesktopActivities;
import pcftest.Desktop.MenuLinks.Desktop_DesktopAwaitingAssignment;
import pcftest.Desktop.MenuLinks.Desktop_DesktopCalendarGroup;
import pcftest.Desktop.MenuLinks.Desktop_DesktopCalendarGroup.DesktopCalendarGroup_Calendar;
import pcftest.Desktop.MenuLinks.Desktop_DesktopCalendarGroup.DesktopCalendarGroup_SupervisorCalendar;
import pcftest.Desktop.MenuLinks.Desktop_DesktopClaims;
import pcftest.Desktop.MenuLinks.Desktop_DesktopExposures;
import pcftest.Desktop.MenuLinks.Desktop_DesktopQueuedActivities;
import pcftest.Desktop.MenuLinks.Desktop_DesktopSubrogations;
import pcftest.Desktop._Paging;
import pcftest.Desktop.__crumb__;
import pcftest.Desktop._msgs;
import pcftest.Desktop.actWizard;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/desktop/Desktop.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class Desktop extends PCFLocation {
  public final static String CHECKSUM = "9ed86292bc2fb209d3d71b2ce7f10651";
  
  public Desktop(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("Desktop"));
  }
  
  public BulkPay getBulkPay() {
    return getOrCreateProperty("BulkPay", pcftest.BulkPay.class);
  }
  
  public DesktopActivities getDesktopActivities() {
    return getOrCreateProperty("DesktopActivities", pcftest.DesktopActivities.class);
  }
  
  public DesktopAwaitingAssignment getDesktopAwaitingAssignment() {
    return getOrCreateProperty("DesktopAwaitingAssignment", pcftest.DesktopAwaitingAssignment.class);
  }
  
  public DesktopCalendarGroup getDesktopCalendarGroup() {
    return getOrCreateProperty("DesktopCalendarGroup", pcftest.DesktopCalendarGroup.class);
  }
  
  public DesktopClaims getDesktopClaims() {
    return getOrCreateProperty("DesktopClaims", pcftest.DesktopClaims.class);
  }
  
  public DesktopExposures getDesktopExposures() {
    return getOrCreateProperty("DesktopExposures", pcftest.DesktopExposures.class);
  }
  
  public DesktopMenuActions getDesktopMenuActions() {
    return getOrCreateProperty("DesktopMenuActions", "DesktopMenuActions", null, pcftest.DesktopMenuActions.class);
  }
  
  public DesktopQueuedActivities getDesktopQueuedActivities() {
    return getOrCreateProperty("DesktopQueuedActivities", pcftest.DesktopQueuedActivities.class);
  }
  
  public DesktopSubrogations getDesktopSubrogations() {
    return getOrCreateProperty("DesktopSubrogations", pcftest.DesktopSubrogations.class);
  }
  
  public Desktop_UpLink getDesktop_UpLink() {
    return getOrCreateProperty("Desktop_UpLink", "Desktop_UpLink", null, pcftest.Desktop.Desktop_UpLink.class);
  }
  
  public MenuLinks getMenuLinks() {
    return getOrCreateMenuLinksProperty("MenuLinks", "MenuLinks", null, pcftest.Desktop.MenuLinks.class, null);
  }
  
  public TabBar getTabBar() {
    return getOrCreateProperty("TabBar", pcftest.TabBar.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.Desktop._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.Desktop.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.Desktop._msgs.class);
  }
  
  public actWizard getactWizard() {
    return getOrCreateProperty("actWizard", "actWizard", null, pcftest.Desktop.actWizard.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/desktop/Desktop.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Desktop_UpLink extends ClickableActionElement {
    public Desktop_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/desktop/Desktop.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MenuLinks extends PCFElement {
    public MenuLinks(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Desktop_BulkPay getDesktop_BulkPay() {
      return getOrCreateProperty("Desktop_BulkPay", "Desktop_BulkPay", null, pcftest.Desktop.MenuLinks.Desktop_BulkPay.class);
    }
    
    public Desktop_DesktopActivities getDesktop_DesktopActivities() {
      return getOrCreateProperty("Desktop_DesktopActivities", "Desktop_DesktopActivities", null, pcftest.Desktop.MenuLinks.Desktop_DesktopActivities.class);
    }
    
    public Desktop_DesktopAwaitingAssignment getDesktop_DesktopAwaitingAssignment() {
      return getOrCreateProperty("Desktop_DesktopAwaitingAssignment", "Desktop_DesktopAwaitingAssignment", null, pcftest.Desktop.MenuLinks.Desktop_DesktopAwaitingAssignment.class);
    }
    
    public Desktop_DesktopCalendarGroup getDesktop_DesktopCalendarGroup() {
      return getOrCreateProperty("Desktop_DesktopCalendarGroup", "Desktop_DesktopCalendarGroup", null, pcftest.Desktop.MenuLinks.Desktop_DesktopCalendarGroup.class);
    }
    
    public Desktop_DesktopClaims getDesktop_DesktopClaims() {
      return getOrCreateProperty("Desktop_DesktopClaims", "Desktop_DesktopClaims", null, pcftest.Desktop.MenuLinks.Desktop_DesktopClaims.class);
    }
    
    public Desktop_DesktopExposures getDesktop_DesktopExposures() {
      return getOrCreateProperty("Desktop_DesktopExposures", "Desktop_DesktopExposures", null, pcftest.Desktop.MenuLinks.Desktop_DesktopExposures.class);
    }
    
    public Desktop_DesktopQueuedActivities getDesktop_DesktopQueuedActivities() {
      return getOrCreateProperty("Desktop_DesktopQueuedActivities", "Desktop_DesktopQueuedActivities", null, pcftest.Desktop.MenuLinks.Desktop_DesktopQueuedActivities.class);
    }
    
    public Desktop_DesktopSubrogations getDesktop_DesktopSubrogations() {
      return getOrCreateProperty("Desktop_DesktopSubrogations", "Desktop_DesktopSubrogations", null, pcftest.Desktop.MenuLinks.Desktop_DesktopSubrogations.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/desktop/Desktop.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Desktop_BulkPay extends ClickableActionElement {
      public Desktop_BulkPay(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public BulkPay click() {
        return clickThis(pcftest.BulkPay.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/desktop/Desktop.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Desktop_DesktopActivities extends ClickableActionElement {
      public Desktop_DesktopActivities(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public DesktopActivities click() {
        return clickThis(pcftest.DesktopActivities.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/desktop/Desktop.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Desktop_DesktopAwaitingAssignment extends ClickableActionElement {
      public Desktop_DesktopAwaitingAssignment(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public DesktopAwaitingAssignment click() {
        return clickThis(pcftest.DesktopAwaitingAssignment.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/desktop/Desktop.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Desktop_DesktopCalendarGroup extends ClickableActionElement {
      public Desktop_DesktopCalendarGroup(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      public DesktopCalendarGroup_Calendar getDesktopCalendarGroup_Calendar() {
        return getOrCreateProperty("DesktopCalendarGroup_Calendar", "DesktopCalendarGroup_Calendar", null, pcftest.Desktop.MenuLinks.Desktop_DesktopCalendarGroup.DesktopCalendarGroup_Calendar.class);
      }
      
      public DesktopCalendarGroup_SupervisorCalendar getDesktopCalendarGroup_SupervisorCalendar() {
        return getOrCreateProperty("DesktopCalendarGroup_SupervisorCalendar", "DesktopCalendarGroup_SupervisorCalendar", null, pcftest.Desktop.MenuLinks.Desktop_DesktopCalendarGroup.DesktopCalendarGroup_SupervisorCalendar.class);
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
    @Generated(comments = "config/web/pcf/desktop/Desktop.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Desktop_DesktopClaims extends ClickableActionElement {
      public Desktop_DesktopClaims(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public DesktopClaims click() {
        return clickThis(pcftest.DesktopClaims.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/desktop/Desktop.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Desktop_DesktopExposures extends ClickableActionElement {
      public Desktop_DesktopExposures(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public DesktopExposures click() {
        return clickThis(pcftest.DesktopExposures.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/desktop/Desktop.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Desktop_DesktopQueuedActivities extends ClickableActionElement {
      public Desktop_DesktopQueuedActivities(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public DesktopQueuedActivities click() {
        return clickThis(pcftest.DesktopQueuedActivities.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/desktop/Desktop.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Desktop_DesktopSubrogations extends ClickableActionElement {
      public Desktop_DesktopSubrogations(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public DesktopSubrogations click() {
        return clickThis(pcftest.DesktopSubrogations.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/desktop/Desktop.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/desktop/Desktop.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/desktop/Desktop.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/desktop/Desktop.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class actWizard extends ClickableActionElement {
    public actWizard(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  
}