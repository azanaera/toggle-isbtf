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
import pcftest.TeamGroupClaims.TeamGroupClaimsScreen;
import pcftest.TeamGroupClaims.TeamGroupClaimsScreen.TeamGroupClaims_Assign;
import pcftest.TeamGroupClaims.TeamGroupClaimsScreen.TeamGroupClaims_Print;
import pcftest.TeamGroupClaims.TeamGroupClaimsScreen.TeamGroupClaims_RemoveFlag;
import pcftest.TeamGroupClaims.TeamGroupClaimsScreen._msgs;
import pcftest.TeamGroupClaims.TeamGroupClaims_UpLink;
import pcftest.TeamGroupClaims._Paging;
import pcftest.TeamGroupClaims.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/team/claims/TeamGroupClaims.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class TeamGroupClaims extends PCFLocation {
  public final static String CHECKSUM = "c944648f26f98d35a20517ecac9f27da";
  
  public TeamGroupClaims(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("TeamGroupClaims"));
  }
  
  public TeamGroupClaimsScreen getTeamGroupClaimsScreen() {
    return getOrCreateProperty("TeamGroupClaimsScreen", "TeamGroupClaimsScreen", null, pcftest.TeamGroupClaims.TeamGroupClaimsScreen.class);
  }
  
  public TeamGroupClaims_UpLink getTeamGroupClaims_UpLink() {
    return getOrCreateProperty("TeamGroupClaims_UpLink", "TeamGroupClaims_UpLink", null, pcftest.TeamGroupClaims.TeamGroupClaims_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.TeamGroupClaims._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.TeamGroupClaims.__crumb__.class);
  }
  
  public TeamGroupGroup get_parent() {
    return getOrCreateProperty("_parent", pcftest.TeamGroupGroup.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/claims/TeamGroupClaims.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TeamGroupClaimsScreen extends PCFElement {
    public TeamGroupClaimsScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public TeamClaimsLV getTeamClaimsLV() {
      return getOrCreateProperty("TeamClaimsLV", "TeamClaimsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.TeamClaimsLV.class);
    }
    
    public TeamGroupClaims_Assign getTeamGroupClaims_Assign() {
      return getOrCreateProperty("TeamGroupClaims_Assign", "TeamGroupClaims_Assign", null, pcftest.TeamGroupClaims.TeamGroupClaimsScreen.TeamGroupClaims_Assign.class);
    }
    
    public TeamGroupClaims_Print getTeamGroupClaims_Print() {
      return getOrCreateProperty("TeamGroupClaims_Print", "TeamGroupClaims_Print", null, pcftest.TeamGroupClaims.TeamGroupClaimsScreen.TeamGroupClaims_Print.class);
    }
    
    public TeamGroupClaims_RemoveFlag getTeamGroupClaims_RemoveFlag() {
      return getOrCreateProperty("TeamGroupClaims_RemoveFlag", "TeamGroupClaims_RemoveFlag", null, pcftest.TeamGroupClaims.TeamGroupClaimsScreen.TeamGroupClaims_RemoveFlag.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.TeamGroupClaims.TeamGroupClaimsScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/team/claims/TeamGroupClaims.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class TeamGroupClaims_Assign extends ClickableActionElement {
      public TeamGroupClaims_Assign(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/team/claims/TeamGroupClaims.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class TeamGroupClaims_Print extends ClickableActionElement {
      public TeamGroupClaims_Print(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/team/claims/TeamGroupClaims.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class TeamGroupClaims_RemoveFlag extends ClickableActionElement {
      public TeamGroupClaims_RemoveFlag(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/team/claims/TeamGroupClaims.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/team/claims/TeamGroupClaims.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TeamGroupClaims_UpLink extends ClickableActionElement {
    public TeamGroupClaims_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/claims/TeamGroupClaims.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/claims/TeamGroupClaims.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}