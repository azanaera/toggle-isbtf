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
import pcftest.TeamGroupPendingGroup.MenuLinks;
import pcftest.TeamGroupPendingGroup.MenuLinks.TeamGroupPendingGroup_TeamGroupPendingActivities;
import pcftest.TeamGroupPendingGroup.MenuLinks.TeamGroupPendingGroup_TeamGroupPendingClaims;
import pcftest.TeamGroupPendingGroup.MenuLinks.TeamGroupPendingGroup_TeamGroupPendingExposures;
import pcftest.TeamGroupPendingGroup.MenuLinks.TeamGroupPendingGroup_TeamGroupPendingMatters;
import pcftest.TeamGroupPendingGroup.MenuLinks.TeamGroupPendingGroup_TeamGroupPendingSubrogations;
import pcftest.TeamGroupPendingGroup.TeamGroupPendingGroup_UpLink;
import pcftest.TeamGroupPendingGroup._Paging;
import pcftest.TeamGroupPendingGroup.__crumb__;
import pcftest.TeamGroupPendingGroup._msgs;
import pcftest.TeamGroupPendingGroup.actWizard;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/team/TeamGroupPendingGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class TeamGroupPendingGroup extends PCFLocation {
  public final static String CHECKSUM = "2bb45bea1879e8b75f3ac153e3285c83";
  
  public TeamGroupPendingGroup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("TeamGroupPendingGroup"));
  }
  
  public MenuLinks getMenuLinks() {
    return getOrCreateMenuLinksProperty("MenuLinks", "MenuLinks", null, pcftest.TeamGroupPendingGroup.MenuLinks.class, null);
  }
  
  public TabBar getTabBar() {
    return getOrCreateProperty("TabBar", pcftest.TabBar.class);
  }
  
  public TeamGroupPendingActivities getTeamGroupPendingActivities() {
    return getOrCreateProperty("TeamGroupPendingActivities", pcftest.TeamGroupPendingActivities.class);
  }
  
  public TeamGroupPendingClaims getTeamGroupPendingClaims() {
    return getOrCreateProperty("TeamGroupPendingClaims", pcftest.TeamGroupPendingClaims.class);
  }
  
  public TeamGroupPendingExposures getTeamGroupPendingExposures() {
    return getOrCreateProperty("TeamGroupPendingExposures", pcftest.TeamGroupPendingExposures.class);
  }
  
  public TeamGroupPendingGroup_UpLink getTeamGroupPendingGroup_UpLink() {
    return getOrCreateProperty("TeamGroupPendingGroup_UpLink", "TeamGroupPendingGroup_UpLink", null, pcftest.TeamGroupPendingGroup.TeamGroupPendingGroup_UpLink.class);
  }
  
  public TeamGroupPendingMatters getTeamGroupPendingMatters() {
    return getOrCreateProperty("TeamGroupPendingMatters", pcftest.TeamGroupPendingMatters.class);
  }
  
  public TeamGroupPendingSubrogations getTeamGroupPendingSubrogations() {
    return getOrCreateProperty("TeamGroupPendingSubrogations", pcftest.TeamGroupPendingSubrogations.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.TeamGroupPendingGroup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.TeamGroupPendingGroup.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.TeamGroupPendingGroup._msgs.class);
  }
  
  public Team get_parent() {
    return getOrCreateProperty("_parent", pcftest.Team.class);
  }
  
  public actWizard getactWizard() {
    return getOrCreateProperty("actWizard", "actWizard", null, pcftest.TeamGroupPendingGroup.actWizard.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/TeamGroupPendingGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MenuLinks extends PCFElement {
    public MenuLinks(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public TeamGroupPendingGroup_TeamGroupPendingActivities getTeamGroupPendingGroup_TeamGroupPendingActivities() {
      return getOrCreateProperty("TeamGroupPendingGroup_TeamGroupPendingActivities", "TeamGroupPendingGroup_TeamGroupPendingActivities", null, pcftest.TeamGroupPendingGroup.MenuLinks.TeamGroupPendingGroup_TeamGroupPendingActivities.class);
    }
    
    public TeamGroupPendingGroup_TeamGroupPendingClaims getTeamGroupPendingGroup_TeamGroupPendingClaims() {
      return getOrCreateProperty("TeamGroupPendingGroup_TeamGroupPendingClaims", "TeamGroupPendingGroup_TeamGroupPendingClaims", null, pcftest.TeamGroupPendingGroup.MenuLinks.TeamGroupPendingGroup_TeamGroupPendingClaims.class);
    }
    
    public TeamGroupPendingGroup_TeamGroupPendingExposures getTeamGroupPendingGroup_TeamGroupPendingExposures() {
      return getOrCreateProperty("TeamGroupPendingGroup_TeamGroupPendingExposures", "TeamGroupPendingGroup_TeamGroupPendingExposures", null, pcftest.TeamGroupPendingGroup.MenuLinks.TeamGroupPendingGroup_TeamGroupPendingExposures.class);
    }
    
    public TeamGroupPendingGroup_TeamGroupPendingMatters getTeamGroupPendingGroup_TeamGroupPendingMatters() {
      return getOrCreateProperty("TeamGroupPendingGroup_TeamGroupPendingMatters", "TeamGroupPendingGroup_TeamGroupPendingMatters", null, pcftest.TeamGroupPendingGroup.MenuLinks.TeamGroupPendingGroup_TeamGroupPendingMatters.class);
    }
    
    public TeamGroupPendingGroup_TeamGroupPendingSubrogations getTeamGroupPendingGroup_TeamGroupPendingSubrogations() {
      return getOrCreateProperty("TeamGroupPendingGroup_TeamGroupPendingSubrogations", "TeamGroupPendingGroup_TeamGroupPendingSubrogations", null, pcftest.TeamGroupPendingGroup.MenuLinks.TeamGroupPendingGroup_TeamGroupPendingSubrogations.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/team/TeamGroupPendingGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class TeamGroupPendingGroup_TeamGroupPendingActivities extends ClickableActionElement {
      public TeamGroupPendingGroup_TeamGroupPendingActivities(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public TeamGroupPendingActivities click() {
        return clickThis(pcftest.TeamGroupPendingActivities.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/team/TeamGroupPendingGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class TeamGroupPendingGroup_TeamGroupPendingClaims extends ClickableActionElement {
      public TeamGroupPendingGroup_TeamGroupPendingClaims(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public TeamGroupPendingClaims click() {
        return clickThis(pcftest.TeamGroupPendingClaims.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/team/TeamGroupPendingGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class TeamGroupPendingGroup_TeamGroupPendingExposures extends ClickableActionElement {
      public TeamGroupPendingGroup_TeamGroupPendingExposures(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public TeamGroupPendingExposures click() {
        return clickThis(pcftest.TeamGroupPendingExposures.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/team/TeamGroupPendingGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class TeamGroupPendingGroup_TeamGroupPendingMatters extends ClickableActionElement {
      public TeamGroupPendingGroup_TeamGroupPendingMatters(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public TeamGroupPendingMatters click() {
        return clickThis(pcftest.TeamGroupPendingMatters.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/team/TeamGroupPendingGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class TeamGroupPendingGroup_TeamGroupPendingSubrogations extends ClickableActionElement {
      public TeamGroupPendingGroup_TeamGroupPendingSubrogations(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public TeamGroupPendingSubrogations click() {
        return clickThis(pcftest.TeamGroupPendingSubrogations.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/TeamGroupPendingGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TeamGroupPendingGroup_UpLink extends ClickableActionElement {
    public TeamGroupPendingGroup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/TeamGroupPendingGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/TeamGroupPendingGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/TeamGroupPendingGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/TeamGroupPendingGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class actWizard extends ClickableActionElement {
    public actWizard(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  
}