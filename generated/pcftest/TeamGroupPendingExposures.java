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
import pcftest.TeamGroupPendingExposures.TeamGroupPendingExposuresScreen;
import pcftest.TeamGroupPendingExposures.TeamGroupPendingExposuresScreen.TeamGroupPendingExposures_Assign;
import pcftest.TeamGroupPendingExposures.TeamGroupPendingExposuresScreen.TeamGroupPendingExposures_Print;
import pcftest.TeamGroupPendingExposures.TeamGroupPendingExposuresScreen._msgs;
import pcftest.TeamGroupPendingExposures.TeamGroupPendingExposures_UpLink;
import pcftest.TeamGroupPendingExposures._Paging;
import pcftest.TeamGroupPendingExposures.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/team/group/TeamGroupPendingExposures.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class TeamGroupPendingExposures extends PCFLocation {
  public final static String CHECKSUM = "fd8750dd630f963edac04a80ac6f3623";
  
  public TeamGroupPendingExposures(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("TeamGroupPendingExposures"));
  }
  
  public TeamGroupPendingExposuresScreen getTeamGroupPendingExposuresScreen() {
    return getOrCreateProperty("TeamGroupPendingExposuresScreen", "TeamGroupPendingExposuresScreen", null, pcftest.TeamGroupPendingExposures.TeamGroupPendingExposuresScreen.class);
  }
  
  public TeamGroupPendingExposures_UpLink getTeamGroupPendingExposures_UpLink() {
    return getOrCreateProperty("TeamGroupPendingExposures_UpLink", "TeamGroupPendingExposures_UpLink", null, pcftest.TeamGroupPendingExposures.TeamGroupPendingExposures_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.TeamGroupPendingExposures._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.TeamGroupPendingExposures.__crumb__.class);
  }
  
  public TeamGroupPendingGroup get_parent() {
    return getOrCreateProperty("_parent", pcftest.TeamGroupPendingGroup.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/group/TeamGroupPendingExposures.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TeamGroupPendingExposuresScreen extends PCFElement {
    public TeamGroupPendingExposuresScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public TeamExposuresLV getTeamExposuresLV() {
      return getOrCreateProperty("TeamExposuresLV", "TeamExposuresLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.TeamExposuresLV.class);
    }
    
    public TeamGroupPendingExposures_Assign getTeamGroupPendingExposures_Assign() {
      return getOrCreateProperty("TeamGroupPendingExposures_Assign", "TeamGroupPendingExposures_Assign", null, pcftest.TeamGroupPendingExposures.TeamGroupPendingExposuresScreen.TeamGroupPendingExposures_Assign.class);
    }
    
    public TeamGroupPendingExposures_Print getTeamGroupPendingExposures_Print() {
      return getOrCreateProperty("TeamGroupPendingExposures_Print", "TeamGroupPendingExposures_Print", null, pcftest.TeamGroupPendingExposures.TeamGroupPendingExposuresScreen.TeamGroupPendingExposures_Print.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.TeamGroupPendingExposures.TeamGroupPendingExposuresScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/team/group/TeamGroupPendingExposures.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class TeamGroupPendingExposures_Assign extends ClickableActionElement {
      public TeamGroupPendingExposures_Assign(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/team/group/TeamGroupPendingExposures.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class TeamGroupPendingExposures_Print extends ClickableActionElement {
      public TeamGroupPendingExposures_Print(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/team/group/TeamGroupPendingExposures.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/team/group/TeamGroupPendingExposures.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TeamGroupPendingExposures_UpLink extends ClickableActionElement {
    public TeamGroupPendingExposures_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/group/TeamGroupPendingExposures.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/group/TeamGroupPendingExposures.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}