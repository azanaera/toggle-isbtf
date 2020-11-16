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
import pcftest.TeamGroupActivities.TeamGroupActivitiesScreen;
import pcftest.TeamGroupActivities.TeamGroupActivitiesScreen.TeamGroupActivities_Assign;
import pcftest.TeamGroupActivities.TeamGroupActivitiesScreen.TeamGroupActivities_Print;
import pcftest.TeamGroupActivities.TeamGroupActivitiesScreen._msgs;
import pcftest.TeamGroupActivities.TeamGroupActivities_UpLink;
import pcftest.TeamGroupActivities._Paging;
import pcftest.TeamGroupActivities.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/team/activities/TeamGroupActivities.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class TeamGroupActivities extends PCFLocation {
  public final static String CHECKSUM = "8cd87e70e674ed0c6d4c186926d0fcad";
  
  public TeamGroupActivities(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("TeamGroupActivities"));
  }
  
  public TeamGroupActivitiesScreen getTeamGroupActivitiesScreen() {
    return getOrCreateProperty("TeamGroupActivitiesScreen", "TeamGroupActivitiesScreen", null, pcftest.TeamGroupActivities.TeamGroupActivitiesScreen.class);
  }
  
  public TeamGroupActivities_UpLink getTeamGroupActivities_UpLink() {
    return getOrCreateProperty("TeamGroupActivities_UpLink", "TeamGroupActivities_UpLink", null, pcftest.TeamGroupActivities.TeamGroupActivities_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.TeamGroupActivities._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.TeamGroupActivities.__crumb__.class);
  }
  
  public TeamGroupGroup get_parent() {
    return getOrCreateProperty("_parent", pcftest.TeamGroupGroup.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/activities/TeamGroupActivities.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TeamGroupActivitiesScreen extends PCFElement {
    public TeamGroupActivitiesScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public TeamGroupActivitiesLV getTeamGroupActivitiesLV() {
      return getOrCreateProperty("TeamGroupActivitiesLV", "TeamGroupActivitiesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.TeamGroupActivitiesLV.class);
    }
    
    public TeamGroupActivities_Assign getTeamGroupActivities_Assign() {
      return getOrCreateProperty("TeamGroupActivities_Assign", "TeamGroupActivities_Assign", null, pcftest.TeamGroupActivities.TeamGroupActivitiesScreen.TeamGroupActivities_Assign.class);
    }
    
    public TeamGroupActivities_Print getTeamGroupActivities_Print() {
      return getOrCreateProperty("TeamGroupActivities_Print", "TeamGroupActivities_Print", null, pcftest.TeamGroupActivities.TeamGroupActivitiesScreen.TeamGroupActivities_Print.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.TeamGroupActivities.TeamGroupActivitiesScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/team/activities/TeamGroupActivities.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class TeamGroupActivities_Assign extends ClickableActionElement {
      public TeamGroupActivities_Assign(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/team/activities/TeamGroupActivities.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class TeamGroupActivities_Print extends ClickableActionElement {
      public TeamGroupActivities_Print(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/team/activities/TeamGroupActivities.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/team/activities/TeamGroupActivities.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TeamGroupActivities_UpLink extends ClickableActionElement {
    public TeamGroupActivities_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/activities/TeamGroupActivities.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/activities/TeamGroupActivities.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}