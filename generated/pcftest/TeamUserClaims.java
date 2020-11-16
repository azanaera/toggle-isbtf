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
import pcftest.TeamUserClaims.TeamUserClaimsScreen;
import pcftest.TeamUserClaims.TeamUserClaimsScreen.TeamUserClaims_Assign;
import pcftest.TeamUserClaims.TeamUserClaimsScreen.TeamUserClaims_Print;
import pcftest.TeamUserClaims.TeamUserClaimsScreen.TeamUserClaims_RemoveFlag;
import pcftest.TeamUserClaims.TeamUserClaimsScreen._msgs;
import pcftest.TeamUserClaims.TeamUserClaims_UpLink;
import pcftest.TeamUserClaims._Paging;
import pcftest.TeamUserClaims.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/team/user/TeamUserClaims.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class TeamUserClaims extends PCFLocation {
  public final static String CHECKSUM = "ab2ddb7530215823a3b41cc0de639c8a";
  
  public TeamUserClaims(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("TeamUserClaims"));
  }
  
  public TeamUserClaimsScreen getTeamUserClaimsScreen() {
    return getOrCreateProperty("TeamUserClaimsScreen", "TeamUserClaimsScreen", null, pcftest.TeamUserClaims.TeamUserClaimsScreen.class);
  }
  
  public TeamUserClaims_UpLink getTeamUserClaims_UpLink() {
    return getOrCreateProperty("TeamUserClaims_UpLink", "TeamUserClaims_UpLink", null, pcftest.TeamUserClaims.TeamUserClaims_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.TeamUserClaims._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.TeamUserClaims.__crumb__.class);
  }
  
  public TeamUserGroup get_parent() {
    return getOrCreateProperty("_parent", pcftest.TeamUserGroup.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/user/TeamUserClaims.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TeamUserClaimsScreen extends PCFElement {
    public TeamUserClaimsScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public TeamClaimsLV getTeamClaimsLV() {
      return getOrCreateProperty("TeamClaimsLV", "TeamClaimsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.TeamClaimsLV.class);
    }
    
    public TeamUserClaims_Assign getTeamUserClaims_Assign() {
      return getOrCreateProperty("TeamUserClaims_Assign", "TeamUserClaims_Assign", null, pcftest.TeamUserClaims.TeamUserClaimsScreen.TeamUserClaims_Assign.class);
    }
    
    public TeamUserClaims_Print getTeamUserClaims_Print() {
      return getOrCreateProperty("TeamUserClaims_Print", "TeamUserClaims_Print", null, pcftest.TeamUserClaims.TeamUserClaimsScreen.TeamUserClaims_Print.class);
    }
    
    public TeamUserClaims_RemoveFlag getTeamUserClaims_RemoveFlag() {
      return getOrCreateProperty("TeamUserClaims_RemoveFlag", "TeamUserClaims_RemoveFlag", null, pcftest.TeamUserClaims.TeamUserClaimsScreen.TeamUserClaims_RemoveFlag.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.TeamUserClaims.TeamUserClaimsScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/team/user/TeamUserClaims.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class TeamUserClaims_Assign extends ClickableActionElement {
      public TeamUserClaims_Assign(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/team/user/TeamUserClaims.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class TeamUserClaims_Print extends ClickableActionElement {
      public TeamUserClaims_Print(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/team/user/TeamUserClaims.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class TeamUserClaims_RemoveFlag extends ClickableActionElement {
      public TeamUserClaims_RemoveFlag(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/team/user/TeamUserClaims.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/team/user/TeamUserClaims.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TeamUserClaims_UpLink extends ClickableActionElement {
    public TeamUserClaims_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/user/TeamUserClaims.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/user/TeamUserClaims.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}