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
import pcftest.ClaimCalendarGroup.ClaimCalendarGroup_UpLink;
import pcftest.ClaimCalendarGroup.MenuLinks;
import pcftest.ClaimCalendarGroup.MenuLinks.ClaimCalendarGroup_ClaimCalendar;
import pcftest.ClaimCalendarGroup.MenuLinks.ClaimCalendarGroup_SupervisorClaimCalendar;
import pcftest.ClaimCalendarGroup._Paging;
import pcftest.ClaimCalendarGroup.__crumb__;
import pcftest.ClaimCalendarGroup._msgs;
import pcftest.ClaimCalendarGroup.actWizard;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/calendar/ClaimCalendarGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimCalendarGroup extends PCFLocation {
  public final static String CHECKSUM = "81fdb153a1a94af1f59342bcfedf572c";
  
  public ClaimCalendarGroup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ClaimCalendarGroup"));
  }
  
  public ClaimCalendar getClaimCalendar() {
    return getOrCreateProperty("ClaimCalendar", pcftest.ClaimCalendar.class);
  }
  
  public ClaimCalendarGroup_UpLink getClaimCalendarGroup_UpLink() {
    return getOrCreateProperty("ClaimCalendarGroup_UpLink", "ClaimCalendarGroup_UpLink", null, pcftest.ClaimCalendarGroup.ClaimCalendarGroup_UpLink.class);
  }
  
  public MenuLinks getMenuLinks() {
    return getOrCreateMenuLinksProperty("MenuLinks", "MenuLinks", null, pcftest.ClaimCalendarGroup.MenuLinks.class, "Claim-MenuLinks-Claim_ClaimCalendarGroup");
  }
  
  public SupervisorClaimCalendar getSupervisorClaimCalendar() {
    return getOrCreateProperty("SupervisorClaimCalendar", pcftest.SupervisorClaimCalendar.class);
  }
  
  public TabBar getTabBar() {
    return getOrCreateProperty("TabBar", pcftest.TabBar.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ClaimCalendarGroup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ClaimCalendarGroup.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ClaimCalendarGroup._msgs.class);
  }
  
  public Claim get_parent() {
    return getOrCreateProperty("_parent", pcftest.Claim.class);
  }
  
  public actWizard getactWizard() {
    return getOrCreateProperty("actWizard", "actWizard", null, pcftest.ClaimCalendarGroup.actWizard.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/calendar/ClaimCalendarGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimCalendarGroup_UpLink extends ClickableActionElement {
    public ClaimCalendarGroup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/calendar/ClaimCalendarGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MenuLinks extends PCFElement {
    public MenuLinks(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimCalendarGroup_ClaimCalendar getClaimCalendarGroup_ClaimCalendar() {
      return getOrCreateProperty("ClaimCalendarGroup_ClaimCalendar", "ClaimCalendarGroup_ClaimCalendar", null, pcftest.ClaimCalendarGroup.MenuLinks.ClaimCalendarGroup_ClaimCalendar.class);
    }
    
    public ClaimCalendarGroup_SupervisorClaimCalendar getClaimCalendarGroup_SupervisorClaimCalendar() {
      return getOrCreateProperty("ClaimCalendarGroup_SupervisorClaimCalendar", "ClaimCalendarGroup_SupervisorClaimCalendar", null, pcftest.ClaimCalendarGroup.MenuLinks.ClaimCalendarGroup_SupervisorClaimCalendar.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/calendar/ClaimCalendarGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimCalendarGroup_ClaimCalendar extends ClickableActionElement {
      public ClaimCalendarGroup_ClaimCalendar(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ClaimCalendar click() {
        return clickThis(pcftest.ClaimCalendar.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/calendar/ClaimCalendarGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimCalendarGroup_SupervisorClaimCalendar extends ClickableActionElement {
      public ClaimCalendarGroup_SupervisorClaimCalendar(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public SupervisorClaimCalendar click() {
        return clickThis(pcftest.SupervisorClaimCalendar.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/calendar/ClaimCalendarGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/calendar/ClaimCalendarGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/calendar/ClaimCalendarGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/calendar/ClaimCalendarGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class actWizard extends ClickableActionElement {
    public actWizard(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  
}