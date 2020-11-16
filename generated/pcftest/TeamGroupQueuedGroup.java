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
import pcftest.TeamGroupQueuedGroup.MenuLinks;
import pcftest.TeamGroupQueuedGroup.MenuLinks.TeamGroupQueuedGroup_TeamGroupQueuedActivities;
import pcftest.TeamGroupQueuedGroup.TeamGroupQueuedGroup_UpLink;
import pcftest.TeamGroupQueuedGroup._Paging;
import pcftest.TeamGroupQueuedGroup.__crumb__;
import pcftest.TeamGroupQueuedGroup._msgs;
import pcftest.TeamGroupQueuedGroup.actWizard;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/team/TeamGroupQueuedGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class TeamGroupQueuedGroup extends PCFLocation {
  public final static String CHECKSUM = "766ff0c5a63fc3505bc507b8434de6c4";
  
  public TeamGroupQueuedGroup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("TeamGroupQueuedGroup"));
  }
  
  public MenuLinks getMenuLinks() {
    return getOrCreateMenuLinksProperty("MenuLinks", "MenuLinks", null, pcftest.TeamGroupQueuedGroup.MenuLinks.class, null);
  }
  
  public TabBar getTabBar() {
    return getOrCreateProperty("TabBar", pcftest.TabBar.class);
  }
  
  public TeamGroupQueuedActivities getTeamGroupQueuedActivities() {
    return getOrCreateProperty("TeamGroupQueuedActivities", pcftest.TeamGroupQueuedActivities.class);
  }
  
  public TeamGroupQueuedGroup_UpLink getTeamGroupQueuedGroup_UpLink() {
    return getOrCreateProperty("TeamGroupQueuedGroup_UpLink", "TeamGroupQueuedGroup_UpLink", null, pcftest.TeamGroupQueuedGroup.TeamGroupQueuedGroup_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.TeamGroupQueuedGroup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.TeamGroupQueuedGroup.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.TeamGroupQueuedGroup._msgs.class);
  }
  
  public Team get_parent() {
    return getOrCreateProperty("_parent", pcftest.Team.class);
  }
  
  public actWizard getactWizard() {
    return getOrCreateProperty("actWizard", "actWizard", null, pcftest.TeamGroupQueuedGroup.actWizard.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/TeamGroupQueuedGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MenuLinks extends PCFElement {
    public MenuLinks(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public TeamGroupQueuedGroup_TeamGroupQueuedActivities getTeamGroupQueuedGroup_TeamGroupQueuedActivities() {
      return getOrCreateProperty("TeamGroupQueuedGroup_TeamGroupQueuedActivities", "TeamGroupQueuedGroup_TeamGroupQueuedActivities", null, pcftest.TeamGroupQueuedGroup.MenuLinks.TeamGroupQueuedGroup_TeamGroupQueuedActivities.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/team/TeamGroupQueuedGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class TeamGroupQueuedGroup_TeamGroupQueuedActivities extends ClickableActionElement {
      public TeamGroupQueuedGroup_TeamGroupQueuedActivities(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public TeamGroupQueuedActivities click() {
        return clickThis(pcftest.TeamGroupQueuedActivities.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/TeamGroupQueuedGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TeamGroupQueuedGroup_UpLink extends ClickableActionElement {
    public TeamGroupQueuedGroup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/TeamGroupQueuedGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/TeamGroupQueuedGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/TeamGroupQueuedGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/TeamGroupQueuedGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class actWizard extends ClickableActionElement {
    public actWizard(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  
}