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
import pcftest.TeamGroupQueuedActivities.TeamGroupQueuedActivitiesScreen;
import pcftest.TeamGroupQueuedActivities.TeamGroupQueuedActivitiesScreen.TeamGroupQueuedActivities_Assign;
import pcftest.TeamGroupQueuedActivities.TeamGroupQueuedActivitiesScreen.TeamGroupQueuedActivities_Print;
import pcftest.TeamGroupQueuedActivities.TeamGroupQueuedActivitiesScreen._msgs;
import pcftest.TeamGroupQueuedActivities.TeamGroupQueuedActivities_UpLink;
import pcftest.TeamGroupQueuedActivities._Paging;
import pcftest.TeamGroupQueuedActivities.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/team/group/TeamGroupQueuedActivities.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class TeamGroupQueuedActivities extends PCFLocation {
  public final static String CHECKSUM = "78da4bb9199151a71041d28e92d6926a";
  
  public TeamGroupQueuedActivities(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("TeamGroupQueuedActivities"));
  }
  
  public TeamGroupQueuedActivitiesScreen getTeamGroupQueuedActivitiesScreen() {
    return getOrCreateProperty("TeamGroupQueuedActivitiesScreen", "TeamGroupQueuedActivitiesScreen", null, pcftest.TeamGroupQueuedActivities.TeamGroupQueuedActivitiesScreen.class);
  }
  
  public TeamGroupQueuedActivities_UpLink getTeamGroupQueuedActivities_UpLink() {
    return getOrCreateProperty("TeamGroupQueuedActivities_UpLink", "TeamGroupQueuedActivities_UpLink", null, pcftest.TeamGroupQueuedActivities.TeamGroupQueuedActivities_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.TeamGroupQueuedActivities._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.TeamGroupQueuedActivities.__crumb__.class);
  }
  
  public TeamGroupQueuedGroup get_parent() {
    return getOrCreateProperty("_parent", pcftest.TeamGroupQueuedGroup.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/group/TeamGroupQueuedActivities.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TeamGroupQueuedActivitiesScreen extends PCFElement {
    public TeamGroupQueuedActivitiesScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public TeamGroupActivitiesLV getTeamGroupActivitiesLV() {
      return getOrCreateProperty("TeamGroupActivitiesLV", "TeamGroupActivitiesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.TeamGroupActivitiesLV.class);
    }
    
    public TeamGroupQueuedActivities_Assign getTeamGroupQueuedActivities_Assign() {
      return getOrCreateProperty("TeamGroupQueuedActivities_Assign", "TeamGroupQueuedActivities_Assign", null, pcftest.TeamGroupQueuedActivities.TeamGroupQueuedActivitiesScreen.TeamGroupQueuedActivities_Assign.class);
    }
    
    public TeamGroupQueuedActivities_Print getTeamGroupQueuedActivities_Print() {
      return getOrCreateProperty("TeamGroupQueuedActivities_Print", "TeamGroupQueuedActivities_Print", null, pcftest.TeamGroupQueuedActivities.TeamGroupQueuedActivitiesScreen.TeamGroupQueuedActivities_Print.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.TeamGroupQueuedActivities.TeamGroupQueuedActivitiesScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/team/group/TeamGroupQueuedActivities.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class TeamGroupQueuedActivities_Assign extends ClickableActionElement {
      public TeamGroupQueuedActivities_Assign(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/team/group/TeamGroupQueuedActivities.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class TeamGroupQueuedActivities_Print extends ClickableActionElement {
      public TeamGroupQueuedActivities_Print(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/team/group/TeamGroupQueuedActivities.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/team/group/TeamGroupQueuedActivities.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TeamGroupQueuedActivities_UpLink extends ClickableActionElement {
    public TeamGroupQueuedActivities_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/group/TeamGroupQueuedActivities.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/group/TeamGroupQueuedActivities.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}