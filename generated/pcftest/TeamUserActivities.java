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
import pcftest.TeamUserActivities.TeamUserActivitiesScreen;
import pcftest.TeamUserActivities.TeamUserActivitiesScreen.TeamUserActivities_Assign;
import pcftest.TeamUserActivities.TeamUserActivitiesScreen.TeamUserActivities_Print;
import pcftest.TeamUserActivities.TeamUserActivitiesScreen._msgs;
import pcftest.TeamUserActivities.TeamUserActivities_UpLink;
import pcftest.TeamUserActivities._Paging;
import pcftest.TeamUserActivities.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/team/user/TeamUserActivities.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class TeamUserActivities extends PCFLocation {
  public final static String CHECKSUM = "1984fa014f89847629f575e0a0f7ae95";
  
  public TeamUserActivities(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("TeamUserActivities"));
  }
  
  public TeamUserActivitiesScreen getTeamUserActivitiesScreen() {
    return getOrCreateProperty("TeamUserActivitiesScreen", "TeamUserActivitiesScreen", null, pcftest.TeamUserActivities.TeamUserActivitiesScreen.class);
  }
  
  public TeamUserActivities_UpLink getTeamUserActivities_UpLink() {
    return getOrCreateProperty("TeamUserActivities_UpLink", "TeamUserActivities_UpLink", null, pcftest.TeamUserActivities.TeamUserActivities_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.TeamUserActivities._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.TeamUserActivities.__crumb__.class);
  }
  
  public TeamUserGroup get_parent() {
    return getOrCreateProperty("_parent", pcftest.TeamUserGroup.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/user/TeamUserActivities.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TeamUserActivitiesScreen extends PCFElement {
    public TeamUserActivitiesScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public TeamUserActivitiesLV getTeamUserActivitiesLV() {
      return getOrCreateProperty("TeamUserActivitiesLV", "TeamUserActivitiesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.TeamUserActivitiesLV.class);
    }
    
    public TeamUserActivities_Assign getTeamUserActivities_Assign() {
      return getOrCreateProperty("TeamUserActivities_Assign", "TeamUserActivities_Assign", null, pcftest.TeamUserActivities.TeamUserActivitiesScreen.TeamUserActivities_Assign.class);
    }
    
    public TeamUserActivities_Print getTeamUserActivities_Print() {
      return getOrCreateProperty("TeamUserActivities_Print", "TeamUserActivities_Print", null, pcftest.TeamUserActivities.TeamUserActivitiesScreen.TeamUserActivities_Print.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.TeamUserActivities.TeamUserActivitiesScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/team/user/TeamUserActivities.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class TeamUserActivities_Assign extends ClickableActionElement {
      public TeamUserActivities_Assign(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/team/user/TeamUserActivities.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class TeamUserActivities_Print extends ClickableActionElement {
      public TeamUserActivities_Print(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/team/user/TeamUserActivities.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/team/user/TeamUserActivities.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TeamUserActivities_UpLink extends ClickableActionElement {
    public TeamUserActivities_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/user/TeamUserActivities.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/user/TeamUserActivities.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}