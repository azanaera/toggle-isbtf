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
import pcftest.TeamGroupOtherActivities.TeamGroupOtherActivitiesScreen;
import pcftest.TeamGroupOtherActivities.TeamGroupOtherActivitiesScreen.TeamGroupOtherActivities_Assign;
import pcftest.TeamGroupOtherActivities.TeamGroupOtherActivitiesScreen.TeamGroupOtherActivities_Print;
import pcftest.TeamGroupOtherActivities.TeamGroupOtherActivitiesScreen._msgs;
import pcftest.TeamGroupOtherActivities.TeamGroupOtherActivities_UpLink;
import pcftest.TeamGroupOtherActivities._Paging;
import pcftest.TeamGroupOtherActivities.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/team/group/TeamGroupOtherActivities.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class TeamGroupOtherActivities extends PCFLocation {
  public final static String CHECKSUM = "b7266c1771892fb5100353060e67f3db";
  
  public TeamGroupOtherActivities(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("TeamGroupOtherActivities"));
  }
  
  public TeamGroupOtherActivitiesScreen getTeamGroupOtherActivitiesScreen() {
    return getOrCreateProperty("TeamGroupOtherActivitiesScreen", "TeamGroupOtherActivitiesScreen", null, pcftest.TeamGroupOtherActivities.TeamGroupOtherActivitiesScreen.class);
  }
  
  public TeamGroupOtherActivities_UpLink getTeamGroupOtherActivities_UpLink() {
    return getOrCreateProperty("TeamGroupOtherActivities_UpLink", "TeamGroupOtherActivities_UpLink", null, pcftest.TeamGroupOtherActivities.TeamGroupOtherActivities_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.TeamGroupOtherActivities._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.TeamGroupOtherActivities.__crumb__.class);
  }
  
  public TeamGroupOtherGroup get_parent() {
    return getOrCreateProperty("_parent", pcftest.TeamGroupOtherGroup.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/group/TeamGroupOtherActivities.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TeamGroupOtherActivitiesScreen extends PCFElement {
    public TeamGroupOtherActivitiesScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public TeamGroupActivitiesLV getTeamGroupActivitiesLV() {
      return getOrCreateProperty("TeamGroupActivitiesLV", "TeamGroupActivitiesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.TeamGroupActivitiesLV.class);
    }
    
    public TeamGroupOtherActivities_Assign getTeamGroupOtherActivities_Assign() {
      return getOrCreateProperty("TeamGroupOtherActivities_Assign", "TeamGroupOtherActivities_Assign", null, pcftest.TeamGroupOtherActivities.TeamGroupOtherActivitiesScreen.TeamGroupOtherActivities_Assign.class);
    }
    
    public TeamGroupOtherActivities_Print getTeamGroupOtherActivities_Print() {
      return getOrCreateProperty("TeamGroupOtherActivities_Print", "TeamGroupOtherActivities_Print", null, pcftest.TeamGroupOtherActivities.TeamGroupOtherActivitiesScreen.TeamGroupOtherActivities_Print.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.TeamGroupOtherActivities.TeamGroupOtherActivitiesScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/team/group/TeamGroupOtherActivities.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class TeamGroupOtherActivities_Assign extends ClickableActionElement {
      public TeamGroupOtherActivities_Assign(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/team/group/TeamGroupOtherActivities.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class TeamGroupOtherActivities_Print extends ClickableActionElement {
      public TeamGroupOtherActivities_Print(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/team/group/TeamGroupOtherActivities.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/team/group/TeamGroupOtherActivities.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TeamGroupOtherActivities_UpLink extends ClickableActionElement {
    public TeamGroupOtherActivities_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/group/TeamGroupOtherActivities.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/group/TeamGroupOtherActivities.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}