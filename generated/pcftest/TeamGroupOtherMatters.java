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
import pcftest.TeamGroupOtherMatters.TeamGroupOtherMattersScreen;
import pcftest.TeamGroupOtherMatters.TeamGroupOtherMattersScreen.TeamGroupOtherMatters_Assign;
import pcftest.TeamGroupOtherMatters.TeamGroupOtherMattersScreen.TeamGroupOtherMatters_Print;
import pcftest.TeamGroupOtherMatters.TeamGroupOtherMattersScreen._msgs;
import pcftest.TeamGroupOtherMatters.TeamGroupOtherMatters_UpLink;
import pcftest.TeamGroupOtherMatters._Paging;
import pcftest.TeamGroupOtherMatters.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/team/group/TeamGroupOtherMatters.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class TeamGroupOtherMatters extends PCFLocation {
  public final static String CHECKSUM = "fe630cc207a83073dfaa23c99e3acba4";
  
  public TeamGroupOtherMatters(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("TeamGroupOtherMatters"));
  }
  
  public TeamGroupOtherMattersScreen getTeamGroupOtherMattersScreen() {
    return getOrCreateProperty("TeamGroupOtherMattersScreen", "TeamGroupOtherMattersScreen", null, pcftest.TeamGroupOtherMatters.TeamGroupOtherMattersScreen.class);
  }
  
  public TeamGroupOtherMatters_UpLink getTeamGroupOtherMatters_UpLink() {
    return getOrCreateProperty("TeamGroupOtherMatters_UpLink", "TeamGroupOtherMatters_UpLink", null, pcftest.TeamGroupOtherMatters.TeamGroupOtherMatters_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.TeamGroupOtherMatters._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.TeamGroupOtherMatters.__crumb__.class);
  }
  
  public TeamGroupOtherGroup get_parent() {
    return getOrCreateProperty("_parent", pcftest.TeamGroupOtherGroup.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/group/TeamGroupOtherMatters.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TeamGroupOtherMattersScreen extends PCFElement {
    public TeamGroupOtherMattersScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public TeamGroupOtherMatters_Assign getTeamGroupOtherMatters_Assign() {
      return getOrCreateProperty("TeamGroupOtherMatters_Assign", "TeamGroupOtherMatters_Assign", null, pcftest.TeamGroupOtherMatters.TeamGroupOtherMattersScreen.TeamGroupOtherMatters_Assign.class);
    }
    
    public TeamGroupOtherMatters_Print getTeamGroupOtherMatters_Print() {
      return getOrCreateProperty("TeamGroupOtherMatters_Print", "TeamGroupOtherMatters_Print", null, pcftest.TeamGroupOtherMatters.TeamGroupOtherMattersScreen.TeamGroupOtherMatters_Print.class);
    }
    
    public TeamMattersLV getTeamMattersLV() {
      return getOrCreateProperty("TeamMattersLV", "TeamMattersLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.TeamMattersLV.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.TeamGroupOtherMatters.TeamGroupOtherMattersScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/team/group/TeamGroupOtherMatters.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class TeamGroupOtherMatters_Assign extends ClickableActionElement {
      public TeamGroupOtherMatters_Assign(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/team/group/TeamGroupOtherMatters.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class TeamGroupOtherMatters_Print extends ClickableActionElement {
      public TeamGroupOtherMatters_Print(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/team/group/TeamGroupOtherMatters.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/team/group/TeamGroupOtherMatters.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TeamGroupOtherMatters_UpLink extends ClickableActionElement {
    public TeamGroupOtherMatters_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/group/TeamGroupOtherMatters.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/group/TeamGroupOtherMatters.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}