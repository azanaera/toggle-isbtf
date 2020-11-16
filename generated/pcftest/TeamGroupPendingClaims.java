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
import pcftest.TeamGroupPendingClaims.TeamGroupPendingClaimsScreen;
import pcftest.TeamGroupPendingClaims.TeamGroupPendingClaimsScreen.TeamGroupPendingClaims_Assign;
import pcftest.TeamGroupPendingClaims.TeamGroupPendingClaimsScreen.TeamGroupPendingClaims_Print;
import pcftest.TeamGroupPendingClaims.TeamGroupPendingClaimsScreen.TeamGroupPendingClaims_RemoveFlag;
import pcftest.TeamGroupPendingClaims.TeamGroupPendingClaimsScreen._msgs;
import pcftest.TeamGroupPendingClaims.TeamGroupPendingClaims_UpLink;
import pcftest.TeamGroupPendingClaims._Paging;
import pcftest.TeamGroupPendingClaims.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/team/group/TeamGroupPendingClaims.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class TeamGroupPendingClaims extends PCFLocation {
  public final static String CHECKSUM = "ffc8688fe3616ef25406908a9f6a7e19";
  
  public TeamGroupPendingClaims(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("TeamGroupPendingClaims"));
  }
  
  public TeamGroupPendingClaimsScreen getTeamGroupPendingClaimsScreen() {
    return getOrCreateProperty("TeamGroupPendingClaimsScreen", "TeamGroupPendingClaimsScreen", null, pcftest.TeamGroupPendingClaims.TeamGroupPendingClaimsScreen.class);
  }
  
  public TeamGroupPendingClaims_UpLink getTeamGroupPendingClaims_UpLink() {
    return getOrCreateProperty("TeamGroupPendingClaims_UpLink", "TeamGroupPendingClaims_UpLink", null, pcftest.TeamGroupPendingClaims.TeamGroupPendingClaims_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.TeamGroupPendingClaims._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.TeamGroupPendingClaims.__crumb__.class);
  }
  
  public TeamGroupPendingGroup get_parent() {
    return getOrCreateProperty("_parent", pcftest.TeamGroupPendingGroup.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/group/TeamGroupPendingClaims.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TeamGroupPendingClaimsScreen extends PCFElement {
    public TeamGroupPendingClaimsScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public TeamClaimsLV getTeamClaimsLV() {
      return getOrCreateProperty("TeamClaimsLV", "TeamClaimsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.TeamClaimsLV.class);
    }
    
    public TeamGroupPendingClaims_Assign getTeamGroupPendingClaims_Assign() {
      return getOrCreateProperty("TeamGroupPendingClaims_Assign", "TeamGroupPendingClaims_Assign", null, pcftest.TeamGroupPendingClaims.TeamGroupPendingClaimsScreen.TeamGroupPendingClaims_Assign.class);
    }
    
    public TeamGroupPendingClaims_Print getTeamGroupPendingClaims_Print() {
      return getOrCreateProperty("TeamGroupPendingClaims_Print", "TeamGroupPendingClaims_Print", null, pcftest.TeamGroupPendingClaims.TeamGroupPendingClaimsScreen.TeamGroupPendingClaims_Print.class);
    }
    
    public TeamGroupPendingClaims_RemoveFlag getTeamGroupPendingClaims_RemoveFlag() {
      return getOrCreateProperty("TeamGroupPendingClaims_RemoveFlag", "TeamGroupPendingClaims_RemoveFlag", null, pcftest.TeamGroupPendingClaims.TeamGroupPendingClaimsScreen.TeamGroupPendingClaims_RemoveFlag.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.TeamGroupPendingClaims.TeamGroupPendingClaimsScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/team/group/TeamGroupPendingClaims.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class TeamGroupPendingClaims_Assign extends ClickableActionElement {
      public TeamGroupPendingClaims_Assign(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/team/group/TeamGroupPendingClaims.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class TeamGroupPendingClaims_Print extends ClickableActionElement {
      public TeamGroupPendingClaims_Print(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/team/group/TeamGroupPendingClaims.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class TeamGroupPendingClaims_RemoveFlag extends ClickableActionElement {
      public TeamGroupPendingClaims_RemoveFlag(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/team/group/TeamGroupPendingClaims.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/team/group/TeamGroupPendingClaims.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TeamGroupPendingClaims_UpLink extends ClickableActionElement {
    public TeamGroupPendingClaims_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/group/TeamGroupPendingClaims.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/group/TeamGroupPendingClaims.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}