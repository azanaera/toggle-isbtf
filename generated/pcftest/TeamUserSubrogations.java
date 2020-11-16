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
import pcftest.TeamUserSubrogations.TeamUserSubrogationsScreen;
import pcftest.TeamUserSubrogations.TeamUserSubrogationsScreen.Assign;
import pcftest.TeamUserSubrogations.TeamUserSubrogationsScreen.Print;
import pcftest.TeamUserSubrogations.TeamUserSubrogationsScreen._msgs;
import pcftest.TeamUserSubrogations.TeamUserSubrogations_UpLink;
import pcftest.TeamUserSubrogations._Paging;
import pcftest.TeamUserSubrogations.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/team/user/TeamUserSubrogations.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class TeamUserSubrogations extends PCFLocation {
  public final static String CHECKSUM = "1215b3d9baead8548980562d437be535";
  
  public TeamUserSubrogations(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("TeamUserSubrogations"));
  }
  
  public TeamUserSubrogationsScreen getTeamUserSubrogationsScreen() {
    return getOrCreateProperty("TeamUserSubrogationsScreen", "TeamUserSubrogationsScreen", null, pcftest.TeamUserSubrogations.TeamUserSubrogationsScreen.class);
  }
  
  public TeamUserSubrogations_UpLink getTeamUserSubrogations_UpLink() {
    return getOrCreateProperty("TeamUserSubrogations_UpLink", "TeamUserSubrogations_UpLink", null, pcftest.TeamUserSubrogations.TeamUserSubrogations_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.TeamUserSubrogations._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.TeamUserSubrogations.__crumb__.class);
  }
  
  public TeamUserGroup get_parent() {
    return getOrCreateProperty("_parent", pcftest.TeamUserGroup.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/user/TeamUserSubrogations.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TeamUserSubrogationsScreen extends PCFElement {
    public TeamUserSubrogationsScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Assign getAssign() {
      return getOrCreateProperty("Assign", "Assign", null, pcftest.TeamUserSubrogations.TeamUserSubrogationsScreen.Assign.class);
    }
    
    public Print getPrint() {
      return getOrCreateProperty("Print", "Print", null, pcftest.TeamUserSubrogations.TeamUserSubrogationsScreen.Print.class);
    }
    
    public SubrogationsLV getSubrogationsLV() {
      return getOrCreateProperty("SubrogationsLV", "SubrogationsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.SubrogationsLV.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.TeamUserSubrogations.TeamUserSubrogationsScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/team/user/TeamUserSubrogations.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Assign extends ClickableActionElement {
      public Assign(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/team/user/TeamUserSubrogations.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Print extends ClickableActionElement {
      public Print(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/team/user/TeamUserSubrogations.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/team/user/TeamUserSubrogations.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TeamUserSubrogations_UpLink extends ClickableActionElement {
    public TeamUserSubrogations_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/user/TeamUserSubrogations.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/user/TeamUserSubrogations.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}