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
import pcftest.TeamGroupExposures.TeamGroupExposuresScreen;
import pcftest.TeamGroupExposures.TeamGroupExposuresScreen.TeamGroupExposures_Assign;
import pcftest.TeamGroupExposures.TeamGroupExposuresScreen.TeamGroupExposures_Print;
import pcftest.TeamGroupExposures.TeamGroupExposuresScreen._msgs;
import pcftest.TeamGroupExposures.TeamGroupExposures_UpLink;
import pcftest.TeamGroupExposures._Paging;
import pcftest.TeamGroupExposures.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/team/exposures/TeamGroupExposures.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class TeamGroupExposures extends PCFLocation {
  public final static String CHECKSUM = "5c0031e00c40d2693c446a04315405bb";
  
  public TeamGroupExposures(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("TeamGroupExposures"));
  }
  
  public TeamGroupExposuresScreen getTeamGroupExposuresScreen() {
    return getOrCreateProperty("TeamGroupExposuresScreen", "TeamGroupExposuresScreen", null, pcftest.TeamGroupExposures.TeamGroupExposuresScreen.class);
  }
  
  public TeamGroupExposures_UpLink getTeamGroupExposures_UpLink() {
    return getOrCreateProperty("TeamGroupExposures_UpLink", "TeamGroupExposures_UpLink", null, pcftest.TeamGroupExposures.TeamGroupExposures_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.TeamGroupExposures._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.TeamGroupExposures.__crumb__.class);
  }
  
  public TeamGroupGroup get_parent() {
    return getOrCreateProperty("_parent", pcftest.TeamGroupGroup.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/exposures/TeamGroupExposures.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TeamGroupExposuresScreen extends PCFElement {
    public TeamGroupExposuresScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public TeamExposuresLV getTeamExposuresLV() {
      return getOrCreateProperty("TeamExposuresLV", "TeamExposuresLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.TeamExposuresLV.class);
    }
    
    public TeamGroupExposures_Assign getTeamGroupExposures_Assign() {
      return getOrCreateProperty("TeamGroupExposures_Assign", "TeamGroupExposures_Assign", null, pcftest.TeamGroupExposures.TeamGroupExposuresScreen.TeamGroupExposures_Assign.class);
    }
    
    public TeamGroupExposures_Print getTeamGroupExposures_Print() {
      return getOrCreateProperty("TeamGroupExposures_Print", "TeamGroupExposures_Print", null, pcftest.TeamGroupExposures.TeamGroupExposuresScreen.TeamGroupExposures_Print.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.TeamGroupExposures.TeamGroupExposuresScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/team/exposures/TeamGroupExposures.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class TeamGroupExposures_Assign extends ClickableActionElement {
      public TeamGroupExposures_Assign(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/team/exposures/TeamGroupExposures.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class TeamGroupExposures_Print extends ClickableActionElement {
      public TeamGroupExposures_Print(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/team/exposures/TeamGroupExposures.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/team/exposures/TeamGroupExposures.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TeamGroupExposures_UpLink extends ClickableActionElement {
    public TeamGroupExposures_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/exposures/TeamGroupExposures.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/exposures/TeamGroupExposures.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}