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
import pcftest.TeamGroupPendingMatters.TeamGroupPendingMattersScreen;
import pcftest.TeamGroupPendingMatters.TeamGroupPendingMattersScreen.TeamGroupPendingMatters_Assign;
import pcftest.TeamGroupPendingMatters.TeamGroupPendingMattersScreen.TeamGroupPendingMatters_Print;
import pcftest.TeamGroupPendingMatters.TeamGroupPendingMattersScreen._msgs;
import pcftest.TeamGroupPendingMatters.TeamGroupPendingMatters_UpLink;
import pcftest.TeamGroupPendingMatters._Paging;
import pcftest.TeamGroupPendingMatters.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/team/group/TeamGroupPendingMatters.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class TeamGroupPendingMatters extends PCFLocation {
  public final static String CHECKSUM = "73ae0621b1efc306f9eb8f292b4814df";
  
  public TeamGroupPendingMatters(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("TeamGroupPendingMatters"));
  }
  
  public TeamGroupPendingMattersScreen getTeamGroupPendingMattersScreen() {
    return getOrCreateProperty("TeamGroupPendingMattersScreen", "TeamGroupPendingMattersScreen", null, pcftest.TeamGroupPendingMatters.TeamGroupPendingMattersScreen.class);
  }
  
  public TeamGroupPendingMatters_UpLink getTeamGroupPendingMatters_UpLink() {
    return getOrCreateProperty("TeamGroupPendingMatters_UpLink", "TeamGroupPendingMatters_UpLink", null, pcftest.TeamGroupPendingMatters.TeamGroupPendingMatters_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.TeamGroupPendingMatters._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.TeamGroupPendingMatters.__crumb__.class);
  }
  
  public TeamGroupPendingGroup get_parent() {
    return getOrCreateProperty("_parent", pcftest.TeamGroupPendingGroup.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/group/TeamGroupPendingMatters.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TeamGroupPendingMattersScreen extends PCFElement {
    public TeamGroupPendingMattersScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public TeamGroupPendingMatters_Assign getTeamGroupPendingMatters_Assign() {
      return getOrCreateProperty("TeamGroupPendingMatters_Assign", "TeamGroupPendingMatters_Assign", null, pcftest.TeamGroupPendingMatters.TeamGroupPendingMattersScreen.TeamGroupPendingMatters_Assign.class);
    }
    
    public TeamGroupPendingMatters_Print getTeamGroupPendingMatters_Print() {
      return getOrCreateProperty("TeamGroupPendingMatters_Print", "TeamGroupPendingMatters_Print", null, pcftest.TeamGroupPendingMatters.TeamGroupPendingMattersScreen.TeamGroupPendingMatters_Print.class);
    }
    
    public TeamMattersLV getTeamMattersLV() {
      return getOrCreateProperty("TeamMattersLV", "TeamMattersLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.TeamMattersLV.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.TeamGroupPendingMatters.TeamGroupPendingMattersScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/team/group/TeamGroupPendingMatters.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class TeamGroupPendingMatters_Assign extends ClickableActionElement {
      public TeamGroupPendingMatters_Assign(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/team/group/TeamGroupPendingMatters.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class TeamGroupPendingMatters_Print extends ClickableActionElement {
      public TeamGroupPendingMatters_Print(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/team/group/TeamGroupPendingMatters.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/team/group/TeamGroupPendingMatters.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TeamGroupPendingMatters_UpLink extends ClickableActionElement {
    public TeamGroupPendingMatters_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/group/TeamGroupPendingMatters.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/group/TeamGroupPendingMatters.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}