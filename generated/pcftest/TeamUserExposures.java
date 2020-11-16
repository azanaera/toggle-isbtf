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
import pcftest.TeamUserExposures.TeamUserExposuresScreen;
import pcftest.TeamUserExposures.TeamUserExposuresScreen.TeamUserExposures_Assign;
import pcftest.TeamUserExposures.TeamUserExposuresScreen.TeamUserExposures_Print;
import pcftest.TeamUserExposures.TeamUserExposuresScreen._msgs;
import pcftest.TeamUserExposures.TeamUserExposures_UpLink;
import pcftest.TeamUserExposures._Paging;
import pcftest.TeamUserExposures.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/team/user/TeamUserExposures.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class TeamUserExposures extends PCFLocation {
  public final static String CHECKSUM = "984563cda97aabff81e25c216e221bb4";
  
  public TeamUserExposures(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("TeamUserExposures"));
  }
  
  public TeamUserExposuresScreen getTeamUserExposuresScreen() {
    return getOrCreateProperty("TeamUserExposuresScreen", "TeamUserExposuresScreen", null, pcftest.TeamUserExposures.TeamUserExposuresScreen.class);
  }
  
  public TeamUserExposures_UpLink getTeamUserExposures_UpLink() {
    return getOrCreateProperty("TeamUserExposures_UpLink", "TeamUserExposures_UpLink", null, pcftest.TeamUserExposures.TeamUserExposures_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.TeamUserExposures._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.TeamUserExposures.__crumb__.class);
  }
  
  public TeamUserGroup get_parent() {
    return getOrCreateProperty("_parent", pcftest.TeamUserGroup.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/user/TeamUserExposures.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TeamUserExposuresScreen extends PCFElement {
    public TeamUserExposuresScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public TeamExposuresLV getTeamExposuresLV() {
      return getOrCreateProperty("TeamExposuresLV", "TeamExposuresLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.TeamExposuresLV.class);
    }
    
    public TeamUserExposures_Assign getTeamUserExposures_Assign() {
      return getOrCreateProperty("TeamUserExposures_Assign", "TeamUserExposures_Assign", null, pcftest.TeamUserExposures.TeamUserExposuresScreen.TeamUserExposures_Assign.class);
    }
    
    public TeamUserExposures_Print getTeamUserExposures_Print() {
      return getOrCreateProperty("TeamUserExposures_Print", "TeamUserExposures_Print", null, pcftest.TeamUserExposures.TeamUserExposuresScreen.TeamUserExposures_Print.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.TeamUserExposures.TeamUserExposuresScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/team/user/TeamUserExposures.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class TeamUserExposures_Assign extends ClickableActionElement {
      public TeamUserExposures_Assign(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/team/user/TeamUserExposures.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class TeamUserExposures_Print extends ClickableActionElement {
      public TeamUserExposures_Print(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/team/user/TeamUserExposures.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/team/user/TeamUserExposures.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TeamUserExposures_UpLink extends ClickableActionElement {
    public TeamUserExposures_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/user/TeamUserExposures.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/user/TeamUserExposures.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}