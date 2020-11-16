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
import pcftest.TeamGroupOtherExposures.TeamGroupOtherExposuresScreen;
import pcftest.TeamGroupOtherExposures.TeamGroupOtherExposuresScreen.TeamGroupOtherExposures_Assign;
import pcftest.TeamGroupOtherExposures.TeamGroupOtherExposuresScreen.TeamGroupOtherExposures_Print;
import pcftest.TeamGroupOtherExposures.TeamGroupOtherExposuresScreen._msgs;
import pcftest.TeamGroupOtherExposures.TeamGroupOtherExposures_UpLink;
import pcftest.TeamGroupOtherExposures._Paging;
import pcftest.TeamGroupOtherExposures.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/team/group/TeamGroupOtherExposures.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class TeamGroupOtherExposures extends PCFLocation {
  public final static String CHECKSUM = "97fd02052431c1f2c5db04b339f05eef";
  
  public TeamGroupOtherExposures(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("TeamGroupOtherExposures"));
  }
  
  public TeamGroupOtherExposuresScreen getTeamGroupOtherExposuresScreen() {
    return getOrCreateProperty("TeamGroupOtherExposuresScreen", "TeamGroupOtherExposuresScreen", null, pcftest.TeamGroupOtherExposures.TeamGroupOtherExposuresScreen.class);
  }
  
  public TeamGroupOtherExposures_UpLink getTeamGroupOtherExposures_UpLink() {
    return getOrCreateProperty("TeamGroupOtherExposures_UpLink", "TeamGroupOtherExposures_UpLink", null, pcftest.TeamGroupOtherExposures.TeamGroupOtherExposures_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.TeamGroupOtherExposures._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.TeamGroupOtherExposures.__crumb__.class);
  }
  
  public TeamGroupOtherGroup get_parent() {
    return getOrCreateProperty("_parent", pcftest.TeamGroupOtherGroup.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/group/TeamGroupOtherExposures.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TeamGroupOtherExposuresScreen extends PCFElement {
    public TeamGroupOtherExposuresScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public TeamExposuresLV getTeamExposuresLV() {
      return getOrCreateProperty("TeamExposuresLV", "TeamExposuresLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.TeamExposuresLV.class);
    }
    
    public TeamGroupOtherExposures_Assign getTeamGroupOtherExposures_Assign() {
      return getOrCreateProperty("TeamGroupOtherExposures_Assign", "TeamGroupOtherExposures_Assign", null, pcftest.TeamGroupOtherExposures.TeamGroupOtherExposuresScreen.TeamGroupOtherExposures_Assign.class);
    }
    
    public TeamGroupOtherExposures_Print getTeamGroupOtherExposures_Print() {
      return getOrCreateProperty("TeamGroupOtherExposures_Print", "TeamGroupOtherExposures_Print", null, pcftest.TeamGroupOtherExposures.TeamGroupOtherExposuresScreen.TeamGroupOtherExposures_Print.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.TeamGroupOtherExposures.TeamGroupOtherExposuresScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/team/group/TeamGroupOtherExposures.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class TeamGroupOtherExposures_Assign extends ClickableActionElement {
      public TeamGroupOtherExposures_Assign(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/team/group/TeamGroupOtherExposures.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class TeamGroupOtherExposures_Print extends ClickableActionElement {
      public TeamGroupOtherExposures_Print(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/team/group/TeamGroupOtherExposures.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/team/group/TeamGroupOtherExposures.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TeamGroupOtherExposures_UpLink extends ClickableActionElement {
    public TeamGroupOtherExposures_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/group/TeamGroupOtherExposures.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/group/TeamGroupOtherExposures.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}