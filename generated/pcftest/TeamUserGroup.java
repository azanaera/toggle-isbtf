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
import pcftest.TeamUserGroup.MenuLinks;
import pcftest.TeamUserGroup.MenuLinks.TeamUserGroup_TeamUserActivities;
import pcftest.TeamUserGroup.MenuLinks.TeamUserGroup_TeamUserClaims;
import pcftest.TeamUserGroup.MenuLinks.TeamUserGroup_TeamUserExposures;
import pcftest.TeamUserGroup.MenuLinks.TeamUserGroup_TeamUserMatters;
import pcftest.TeamUserGroup.MenuLinks.TeamUserGroup_TeamUserSubrogations;
import pcftest.TeamUserGroup.TeamUserGroup_UpLink;
import pcftest.TeamUserGroup._Paging;
import pcftest.TeamUserGroup.__crumb__;
import pcftest.TeamUserGroup._msgs;
import pcftest.TeamUserGroup.actWizard;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/team/TeamUserGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class TeamUserGroup extends PCFLocation {
  public final static String CHECKSUM = "351748fc9fb5dfde3ff240d3d836604c";
  
  public TeamUserGroup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("TeamUserGroup"));
  }
  
  public MenuLinks getMenuLinks() {
    return getOrCreateMenuLinksProperty("MenuLinks", "MenuLinks", null, pcftest.TeamUserGroup.MenuLinks.class, null);
  }
  
  public TabBar getTabBar() {
    return getOrCreateProperty("TabBar", pcftest.TabBar.class);
  }
  
  public TeamUserActivities getTeamUserActivities() {
    return getOrCreateProperty("TeamUserActivities", pcftest.TeamUserActivities.class);
  }
  
  public TeamUserClaims getTeamUserClaims() {
    return getOrCreateProperty("TeamUserClaims", pcftest.TeamUserClaims.class);
  }
  
  public TeamUserExposures getTeamUserExposures() {
    return getOrCreateProperty("TeamUserExposures", pcftest.TeamUserExposures.class);
  }
  
  public TeamUserGroup_UpLink getTeamUserGroup_UpLink() {
    return getOrCreateProperty("TeamUserGroup_UpLink", "TeamUserGroup_UpLink", null, pcftest.TeamUserGroup.TeamUserGroup_UpLink.class);
  }
  
  public TeamUserMatters getTeamUserMatters() {
    return getOrCreateProperty("TeamUserMatters", pcftest.TeamUserMatters.class);
  }
  
  public TeamUserSubrogations getTeamUserSubrogations() {
    return getOrCreateProperty("TeamUserSubrogations", pcftest.TeamUserSubrogations.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.TeamUserGroup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.TeamUserGroup.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.TeamUserGroup._msgs.class);
  }
  
  public Team get_parent() {
    return getOrCreateProperty("_parent", pcftest.Team.class);
  }
  
  public actWizard getactWizard() {
    return getOrCreateProperty("actWizard", "actWizard", null, pcftest.TeamUserGroup.actWizard.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/TeamUserGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MenuLinks extends PCFElement {
    public MenuLinks(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public TeamUserGroup_TeamUserActivities getTeamUserGroup_TeamUserActivities() {
      return getOrCreateProperty("TeamUserGroup_TeamUserActivities", "TeamUserGroup_TeamUserActivities", null, pcftest.TeamUserGroup.MenuLinks.TeamUserGroup_TeamUserActivities.class);
    }
    
    public TeamUserGroup_TeamUserClaims getTeamUserGroup_TeamUserClaims() {
      return getOrCreateProperty("TeamUserGroup_TeamUserClaims", "TeamUserGroup_TeamUserClaims", null, pcftest.TeamUserGroup.MenuLinks.TeamUserGroup_TeamUserClaims.class);
    }
    
    public TeamUserGroup_TeamUserExposures getTeamUserGroup_TeamUserExposures() {
      return getOrCreateProperty("TeamUserGroup_TeamUserExposures", "TeamUserGroup_TeamUserExposures", null, pcftest.TeamUserGroup.MenuLinks.TeamUserGroup_TeamUserExposures.class);
    }
    
    public TeamUserGroup_TeamUserMatters getTeamUserGroup_TeamUserMatters() {
      return getOrCreateProperty("TeamUserGroup_TeamUserMatters", "TeamUserGroup_TeamUserMatters", null, pcftest.TeamUserGroup.MenuLinks.TeamUserGroup_TeamUserMatters.class);
    }
    
    public TeamUserGroup_TeamUserSubrogations getTeamUserGroup_TeamUserSubrogations() {
      return getOrCreateProperty("TeamUserGroup_TeamUserSubrogations", "TeamUserGroup_TeamUserSubrogations", null, pcftest.TeamUserGroup.MenuLinks.TeamUserGroup_TeamUserSubrogations.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/team/TeamUserGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class TeamUserGroup_TeamUserActivities extends ClickableActionElement {
      public TeamUserGroup_TeamUserActivities(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public TeamUserActivities click() {
        return clickThis(pcftest.TeamUserActivities.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/team/TeamUserGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class TeamUserGroup_TeamUserClaims extends ClickableActionElement {
      public TeamUserGroup_TeamUserClaims(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public TeamUserClaims click() {
        return clickThis(pcftest.TeamUserClaims.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/team/TeamUserGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class TeamUserGroup_TeamUserExposures extends ClickableActionElement {
      public TeamUserGroup_TeamUserExposures(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public TeamUserExposures click() {
        return clickThis(pcftest.TeamUserExposures.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/team/TeamUserGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class TeamUserGroup_TeamUserMatters extends ClickableActionElement {
      public TeamUserGroup_TeamUserMatters(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public TeamUserMatters click() {
        return clickThis(pcftest.TeamUserMatters.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/team/TeamUserGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class TeamUserGroup_TeamUserSubrogations extends ClickableActionElement {
      public TeamUserGroup_TeamUserSubrogations(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public TeamUserSubrogations click() {
        return clickThis(pcftest.TeamUserSubrogations.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/TeamUserGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TeamUserGroup_UpLink extends ClickableActionElement {
    public TeamUserGroup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/TeamUserGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/TeamUserGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/TeamUserGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/TeamUserGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class actWizard extends ClickableActionElement {
    public actWizard(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  
}