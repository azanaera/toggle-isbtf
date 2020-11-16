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
import pcftest.TeamUserMatters.TeamUserMattersScreen;
import pcftest.TeamUserMatters.TeamUserMattersScreen.TeamUserMatters_Assign;
import pcftest.TeamUserMatters.TeamUserMattersScreen.TeamUserMatters_Print;
import pcftest.TeamUserMatters.TeamUserMattersScreen._msgs;
import pcftest.TeamUserMatters.TeamUserMatters_UpLink;
import pcftest.TeamUserMatters._Paging;
import pcftest.TeamUserMatters.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/team/user/TeamUserMatters.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class TeamUserMatters extends PCFLocation {
  public final static String CHECKSUM = "690c453416018b866db2daa99520edc7";
  
  public TeamUserMatters(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("TeamUserMatters"));
  }
  
  public TeamUserMattersScreen getTeamUserMattersScreen() {
    return getOrCreateProperty("TeamUserMattersScreen", "TeamUserMattersScreen", null, pcftest.TeamUserMatters.TeamUserMattersScreen.class);
  }
  
  public TeamUserMatters_UpLink getTeamUserMatters_UpLink() {
    return getOrCreateProperty("TeamUserMatters_UpLink", "TeamUserMatters_UpLink", null, pcftest.TeamUserMatters.TeamUserMatters_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.TeamUserMatters._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.TeamUserMatters.__crumb__.class);
  }
  
  public TeamUserGroup get_parent() {
    return getOrCreateProperty("_parent", pcftest.TeamUserGroup.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/user/TeamUserMatters.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TeamUserMattersScreen extends PCFElement {
    public TeamUserMattersScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public TeamMattersLV getTeamMattersLV() {
      return getOrCreateProperty("TeamMattersLV", "TeamMattersLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.TeamMattersLV.class);
    }
    
    public TeamUserMatters_Assign getTeamUserMatters_Assign() {
      return getOrCreateProperty("TeamUserMatters_Assign", "TeamUserMatters_Assign", null, pcftest.TeamUserMatters.TeamUserMattersScreen.TeamUserMatters_Assign.class);
    }
    
    public TeamUserMatters_Print getTeamUserMatters_Print() {
      return getOrCreateProperty("TeamUserMatters_Print", "TeamUserMatters_Print", null, pcftest.TeamUserMatters.TeamUserMattersScreen.TeamUserMatters_Print.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.TeamUserMatters.TeamUserMattersScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/team/user/TeamUserMatters.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class TeamUserMatters_Assign extends ClickableActionElement {
      public TeamUserMatters_Assign(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/team/user/TeamUserMatters.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class TeamUserMatters_Print extends ClickableActionElement {
      public TeamUserMatters_Print(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/team/user/TeamUserMatters.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/team/user/TeamUserMatters.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TeamUserMatters_UpLink extends ClickableActionElement {
    public TeamUserMatters_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/user/TeamUserMatters.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/user/TeamUserMatters.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}