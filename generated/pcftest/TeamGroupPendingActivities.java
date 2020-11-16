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
import pcftest.TeamGroupPendingActivities.TeamGroupPendingActivitiesScreen;
import pcftest.TeamGroupPendingActivities.TeamGroupPendingActivitiesScreen.TeamGroupPendingActivities_Assign;
import pcftest.TeamGroupPendingActivities.TeamGroupPendingActivitiesScreen.TeamGroupPendingActivities_Print;
import pcftest.TeamGroupPendingActivities.TeamGroupPendingActivitiesScreen._msgs;
import pcftest.TeamGroupPendingActivities.TeamGroupPendingActivities_UpLink;
import pcftest.TeamGroupPendingActivities._Paging;
import pcftest.TeamGroupPendingActivities.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/team/group/TeamGroupPendingActivities.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class TeamGroupPendingActivities extends PCFLocation {
  public final static String CHECKSUM = "879d7dd99663d212a3730e1c98131bf3";
  
  public TeamGroupPendingActivities(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("TeamGroupPendingActivities"));
  }
  
  public TeamGroupPendingActivitiesScreen getTeamGroupPendingActivitiesScreen() {
    return getOrCreateProperty("TeamGroupPendingActivitiesScreen", "TeamGroupPendingActivitiesScreen", null, pcftest.TeamGroupPendingActivities.TeamGroupPendingActivitiesScreen.class);
  }
  
  public TeamGroupPendingActivities_UpLink getTeamGroupPendingActivities_UpLink() {
    return getOrCreateProperty("TeamGroupPendingActivities_UpLink", "TeamGroupPendingActivities_UpLink", null, pcftest.TeamGroupPendingActivities.TeamGroupPendingActivities_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.TeamGroupPendingActivities._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.TeamGroupPendingActivities.__crumb__.class);
  }
  
  public TeamGroupPendingGroup get_parent() {
    return getOrCreateProperty("_parent", pcftest.TeamGroupPendingGroup.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/group/TeamGroupPendingActivities.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TeamGroupPendingActivitiesScreen extends PCFElement {
    public TeamGroupPendingActivitiesScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public TeamGroupActivitiesLV getTeamGroupActivitiesLV() {
      return getOrCreateProperty("TeamGroupActivitiesLV", "TeamGroupActivitiesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.TeamGroupActivitiesLV.class);
    }
    
    public TeamGroupPendingActivities_Assign getTeamGroupPendingActivities_Assign() {
      return getOrCreateProperty("TeamGroupPendingActivities_Assign", "TeamGroupPendingActivities_Assign", null, pcftest.TeamGroupPendingActivities.TeamGroupPendingActivitiesScreen.TeamGroupPendingActivities_Assign.class);
    }
    
    public TeamGroupPendingActivities_Print getTeamGroupPendingActivities_Print() {
      return getOrCreateProperty("TeamGroupPendingActivities_Print", "TeamGroupPendingActivities_Print", null, pcftest.TeamGroupPendingActivities.TeamGroupPendingActivitiesScreen.TeamGroupPendingActivities_Print.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.TeamGroupPendingActivities.TeamGroupPendingActivitiesScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/team/group/TeamGroupPendingActivities.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class TeamGroupPendingActivities_Assign extends ClickableActionElement {
      public TeamGroupPendingActivities_Assign(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/team/group/TeamGroupPendingActivities.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class TeamGroupPendingActivities_Print extends ClickableActionElement {
      public TeamGroupPendingActivities_Print(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/team/group/TeamGroupPendingActivities.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/team/group/TeamGroupPendingActivities.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TeamGroupPendingActivities_UpLink extends ClickableActionElement {
    public TeamGroupPendingActivities_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/group/TeamGroupPendingActivities.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/group/TeamGroupPendingActivities.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}