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
import pcftest.TeamGroupOtherGroup.MenuLinks;
import pcftest.TeamGroupOtherGroup.MenuLinks.TeamGroupOtherGroup_TeamGroupOtherActivities;
import pcftest.TeamGroupOtherGroup.MenuLinks.TeamGroupOtherGroup_TeamGroupOtherClaims;
import pcftest.TeamGroupOtherGroup.MenuLinks.TeamGroupOtherGroup_TeamGroupOtherExposures;
import pcftest.TeamGroupOtherGroup.MenuLinks.TeamGroupOtherGroup_TeamGroupOtherMatters;
import pcftest.TeamGroupOtherGroup.MenuLinks.TeamGroupOtherGroup_TeamGroupOtherSubrogations;
import pcftest.TeamGroupOtherGroup.TeamGroupOtherGroup_UpLink;
import pcftest.TeamGroupOtherGroup._Paging;
import pcftest.TeamGroupOtherGroup.__crumb__;
import pcftest.TeamGroupOtherGroup._msgs;
import pcftest.TeamGroupOtherGroup.actWizard;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/team/TeamGroupOtherGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class TeamGroupOtherGroup extends PCFLocation {
  public final static String CHECKSUM = "8728d3f1ef6b1afdd1dfa9febb177524";
  
  public TeamGroupOtherGroup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("TeamGroupOtherGroup"));
  }
  
  public MenuLinks getMenuLinks() {
    return getOrCreateMenuLinksProperty("MenuLinks", "MenuLinks", null, pcftest.TeamGroupOtherGroup.MenuLinks.class, null);
  }
  
  public TabBar getTabBar() {
    return getOrCreateProperty("TabBar", pcftest.TabBar.class);
  }
  
  public TeamGroupOtherActivities getTeamGroupOtherActivities() {
    return getOrCreateProperty("TeamGroupOtherActivities", pcftest.TeamGroupOtherActivities.class);
  }
  
  public TeamGroupOtherClaims getTeamGroupOtherClaims() {
    return getOrCreateProperty("TeamGroupOtherClaims", pcftest.TeamGroupOtherClaims.class);
  }
  
  public TeamGroupOtherExposures getTeamGroupOtherExposures() {
    return getOrCreateProperty("TeamGroupOtherExposures", pcftest.TeamGroupOtherExposures.class);
  }
  
  public TeamGroupOtherGroup_UpLink getTeamGroupOtherGroup_UpLink() {
    return getOrCreateProperty("TeamGroupOtherGroup_UpLink", "TeamGroupOtherGroup_UpLink", null, pcftest.TeamGroupOtherGroup.TeamGroupOtherGroup_UpLink.class);
  }
  
  public TeamGroupOtherMatters getTeamGroupOtherMatters() {
    return getOrCreateProperty("TeamGroupOtherMatters", pcftest.TeamGroupOtherMatters.class);
  }
  
  public TeamGroupOtherSubrogations getTeamGroupOtherSubrogations() {
    return getOrCreateProperty("TeamGroupOtherSubrogations", pcftest.TeamGroupOtherSubrogations.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.TeamGroupOtherGroup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.TeamGroupOtherGroup.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.TeamGroupOtherGroup._msgs.class);
  }
  
  public Team get_parent() {
    return getOrCreateProperty("_parent", pcftest.Team.class);
  }
  
  public actWizard getactWizard() {
    return getOrCreateProperty("actWizard", "actWizard", null, pcftest.TeamGroupOtherGroup.actWizard.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/TeamGroupOtherGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MenuLinks extends PCFElement {
    public MenuLinks(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public TeamGroupOtherGroup_TeamGroupOtherActivities getTeamGroupOtherGroup_TeamGroupOtherActivities() {
      return getOrCreateProperty("TeamGroupOtherGroup_TeamGroupOtherActivities", "TeamGroupOtherGroup_TeamGroupOtherActivities", null, pcftest.TeamGroupOtherGroup.MenuLinks.TeamGroupOtherGroup_TeamGroupOtherActivities.class);
    }
    
    public TeamGroupOtherGroup_TeamGroupOtherClaims getTeamGroupOtherGroup_TeamGroupOtherClaims() {
      return getOrCreateProperty("TeamGroupOtherGroup_TeamGroupOtherClaims", "TeamGroupOtherGroup_TeamGroupOtherClaims", null, pcftest.TeamGroupOtherGroup.MenuLinks.TeamGroupOtherGroup_TeamGroupOtherClaims.class);
    }
    
    public TeamGroupOtherGroup_TeamGroupOtherExposures getTeamGroupOtherGroup_TeamGroupOtherExposures() {
      return getOrCreateProperty("TeamGroupOtherGroup_TeamGroupOtherExposures", "TeamGroupOtherGroup_TeamGroupOtherExposures", null, pcftest.TeamGroupOtherGroup.MenuLinks.TeamGroupOtherGroup_TeamGroupOtherExposures.class);
    }
    
    public TeamGroupOtherGroup_TeamGroupOtherMatters getTeamGroupOtherGroup_TeamGroupOtherMatters() {
      return getOrCreateProperty("TeamGroupOtherGroup_TeamGroupOtherMatters", "TeamGroupOtherGroup_TeamGroupOtherMatters", null, pcftest.TeamGroupOtherGroup.MenuLinks.TeamGroupOtherGroup_TeamGroupOtherMatters.class);
    }
    
    public TeamGroupOtherGroup_TeamGroupOtherSubrogations getTeamGroupOtherGroup_TeamGroupOtherSubrogations() {
      return getOrCreateProperty("TeamGroupOtherGroup_TeamGroupOtherSubrogations", "TeamGroupOtherGroup_TeamGroupOtherSubrogations", null, pcftest.TeamGroupOtherGroup.MenuLinks.TeamGroupOtherGroup_TeamGroupOtherSubrogations.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/team/TeamGroupOtherGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class TeamGroupOtherGroup_TeamGroupOtherActivities extends ClickableActionElement {
      public TeamGroupOtherGroup_TeamGroupOtherActivities(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public TeamGroupOtherActivities click() {
        return clickThis(pcftest.TeamGroupOtherActivities.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/team/TeamGroupOtherGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class TeamGroupOtherGroup_TeamGroupOtherClaims extends ClickableActionElement {
      public TeamGroupOtherGroup_TeamGroupOtherClaims(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public TeamGroupOtherClaims click() {
        return clickThis(pcftest.TeamGroupOtherClaims.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/team/TeamGroupOtherGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class TeamGroupOtherGroup_TeamGroupOtherExposures extends ClickableActionElement {
      public TeamGroupOtherGroup_TeamGroupOtherExposures(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public TeamGroupOtherExposures click() {
        return clickThis(pcftest.TeamGroupOtherExposures.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/team/TeamGroupOtherGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class TeamGroupOtherGroup_TeamGroupOtherMatters extends ClickableActionElement {
      public TeamGroupOtherGroup_TeamGroupOtherMatters(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public TeamGroupOtherMatters click() {
        return clickThis(pcftest.TeamGroupOtherMatters.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/team/TeamGroupOtherGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class TeamGroupOtherGroup_TeamGroupOtherSubrogations extends ClickableActionElement {
      public TeamGroupOtherGroup_TeamGroupOtherSubrogations(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public TeamGroupOtherSubrogations click() {
        return clickThis(pcftest.TeamGroupOtherSubrogations.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/TeamGroupOtherGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TeamGroupOtherGroup_UpLink extends ClickableActionElement {
    public TeamGroupOtherGroup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/TeamGroupOtherGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/TeamGroupOtherGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/TeamGroupOtherGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/TeamGroupOtherGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class actWizard extends ClickableActionElement {
    public actWizard(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  
}