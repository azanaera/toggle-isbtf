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
import pcftest.TeamGroupGroup.MenuLinks;
import pcftest.TeamGroupGroup.MenuLinks.TeamGroupGroup_TeamGroupActivities;
import pcftest.TeamGroupGroup.MenuLinks.TeamGroupGroup_TeamGroupAging;
import pcftest.TeamGroupGroup.MenuLinks.TeamGroupGroup_TeamGroupClaims;
import pcftest.TeamGroupGroup.MenuLinks.TeamGroupGroup_TeamGroupExposures;
import pcftest.TeamGroupGroup.MenuLinks.TeamGroupGroup_TeamGroupMatters;
import pcftest.TeamGroupGroup.MenuLinks.TeamGroupGroup_TeamGroupSubrogations;
import pcftest.TeamGroupGroup.MenuLinks.TeamGroupGroup_TeamGroupSummary;
import pcftest.TeamGroupGroup.TeamGroupGroup_UpLink;
import pcftest.TeamGroupGroup._Paging;
import pcftest.TeamGroupGroup.__crumb__;
import pcftest.TeamGroupGroup._msgs;
import pcftest.TeamGroupGroup.actWizard;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/team/TeamGroupGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class TeamGroupGroup extends PCFLocation {
  public final static String CHECKSUM = "f57d3fc4fc7210b395613e86adc3bf6f";
  
  public TeamGroupGroup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("TeamGroupGroup"));
  }
  
  public MenuLinks getMenuLinks() {
    return getOrCreateMenuLinksProperty("MenuLinks", "MenuLinks", null, pcftest.TeamGroupGroup.MenuLinks.class, null);
  }
  
  public TabBar getTabBar() {
    return getOrCreateProperty("TabBar", pcftest.TabBar.class);
  }
  
  public TeamGroupActivities getTeamGroupActivities() {
    return getOrCreateProperty("TeamGroupActivities", pcftest.TeamGroupActivities.class);
  }
  
  public TeamGroupAging getTeamGroupAging() {
    return getOrCreateProperty("TeamGroupAging", pcftest.TeamGroupAging.class);
  }
  
  public TeamGroupClaims getTeamGroupClaims() {
    return getOrCreateProperty("TeamGroupClaims", pcftest.TeamGroupClaims.class);
  }
  
  public TeamGroupExposures getTeamGroupExposures() {
    return getOrCreateProperty("TeamGroupExposures", pcftest.TeamGroupExposures.class);
  }
  
  public TeamGroupGroup_UpLink getTeamGroupGroup_UpLink() {
    return getOrCreateProperty("TeamGroupGroup_UpLink", "TeamGroupGroup_UpLink", null, pcftest.TeamGroupGroup.TeamGroupGroup_UpLink.class);
  }
  
  public TeamGroupMatters getTeamGroupMatters() {
    return getOrCreateProperty("TeamGroupMatters", pcftest.TeamGroupMatters.class);
  }
  
  public TeamGroupSubrogations getTeamGroupSubrogations() {
    return getOrCreateProperty("TeamGroupSubrogations", pcftest.TeamGroupSubrogations.class);
  }
  
  public TeamGroupSummary getTeamGroupSummary() {
    return getOrCreateProperty("TeamGroupSummary", pcftest.TeamGroupSummary.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.TeamGroupGroup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.TeamGroupGroup.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.TeamGroupGroup._msgs.class);
  }
  
  public Team get_parent() {
    return getOrCreateProperty("_parent", pcftest.Team.class);
  }
  
  public actWizard getactWizard() {
    return getOrCreateProperty("actWizard", "actWizard", null, pcftest.TeamGroupGroup.actWizard.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/TeamGroupGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MenuLinks extends PCFElement {
    public MenuLinks(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public TeamGroupGroup_TeamGroupActivities getTeamGroupGroup_TeamGroupActivities() {
      return getOrCreateProperty("TeamGroupGroup_TeamGroupActivities", "TeamGroupGroup_TeamGroupActivities", null, pcftest.TeamGroupGroup.MenuLinks.TeamGroupGroup_TeamGroupActivities.class);
    }
    
    public TeamGroupGroup_TeamGroupAging getTeamGroupGroup_TeamGroupAging() {
      return getOrCreateProperty("TeamGroupGroup_TeamGroupAging", "TeamGroupGroup_TeamGroupAging", null, pcftest.TeamGroupGroup.MenuLinks.TeamGroupGroup_TeamGroupAging.class);
    }
    
    public TeamGroupGroup_TeamGroupClaims getTeamGroupGroup_TeamGroupClaims() {
      return getOrCreateProperty("TeamGroupGroup_TeamGroupClaims", "TeamGroupGroup_TeamGroupClaims", null, pcftest.TeamGroupGroup.MenuLinks.TeamGroupGroup_TeamGroupClaims.class);
    }
    
    public TeamGroupGroup_TeamGroupExposures getTeamGroupGroup_TeamGroupExposures() {
      return getOrCreateProperty("TeamGroupGroup_TeamGroupExposures", "TeamGroupGroup_TeamGroupExposures", null, pcftest.TeamGroupGroup.MenuLinks.TeamGroupGroup_TeamGroupExposures.class);
    }
    
    public TeamGroupGroup_TeamGroupMatters getTeamGroupGroup_TeamGroupMatters() {
      return getOrCreateProperty("TeamGroupGroup_TeamGroupMatters", "TeamGroupGroup_TeamGroupMatters", null, pcftest.TeamGroupGroup.MenuLinks.TeamGroupGroup_TeamGroupMatters.class);
    }
    
    public TeamGroupGroup_TeamGroupSubrogations getTeamGroupGroup_TeamGroupSubrogations() {
      return getOrCreateProperty("TeamGroupGroup_TeamGroupSubrogations", "TeamGroupGroup_TeamGroupSubrogations", null, pcftest.TeamGroupGroup.MenuLinks.TeamGroupGroup_TeamGroupSubrogations.class);
    }
    
    public TeamGroupGroup_TeamGroupSummary getTeamGroupGroup_TeamGroupSummary() {
      return getOrCreateProperty("TeamGroupGroup_TeamGroupSummary", "TeamGroupGroup_TeamGroupSummary", null, pcftest.TeamGroupGroup.MenuLinks.TeamGroupGroup_TeamGroupSummary.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/team/TeamGroupGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class TeamGroupGroup_TeamGroupActivities extends ClickableActionElement {
      public TeamGroupGroup_TeamGroupActivities(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public TeamGroupActivities click() {
        return clickThis(pcftest.TeamGroupActivities.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/team/TeamGroupGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class TeamGroupGroup_TeamGroupAging extends ClickableActionElement {
      public TeamGroupGroup_TeamGroupAging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public TeamGroupAging click() {
        return clickThis(pcftest.TeamGroupAging.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/team/TeamGroupGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class TeamGroupGroup_TeamGroupClaims extends ClickableActionElement {
      public TeamGroupGroup_TeamGroupClaims(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public TeamGroupClaims click() {
        return clickThis(pcftest.TeamGroupClaims.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/team/TeamGroupGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class TeamGroupGroup_TeamGroupExposures extends ClickableActionElement {
      public TeamGroupGroup_TeamGroupExposures(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public TeamGroupExposures click() {
        return clickThis(pcftest.TeamGroupExposures.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/team/TeamGroupGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class TeamGroupGroup_TeamGroupMatters extends ClickableActionElement {
      public TeamGroupGroup_TeamGroupMatters(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public TeamGroupMatters click() {
        return clickThis(pcftest.TeamGroupMatters.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/team/TeamGroupGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class TeamGroupGroup_TeamGroupSubrogations extends ClickableActionElement {
      public TeamGroupGroup_TeamGroupSubrogations(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public TeamGroupSubrogations click() {
        return clickThis(pcftest.TeamGroupSubrogations.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/team/TeamGroupGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class TeamGroupGroup_TeamGroupSummary extends ClickableActionElement {
      public TeamGroupGroup_TeamGroupSummary(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public TeamGroupSummary click() {
        return clickThis(pcftest.TeamGroupSummary.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/TeamGroupGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TeamGroupGroup_UpLink extends ClickableActionElement {
    public TeamGroupGroup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/TeamGroupGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/TeamGroupGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/TeamGroupGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/TeamGroupGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class actWizard extends ClickableActionElement {
    public actWizard(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  
}