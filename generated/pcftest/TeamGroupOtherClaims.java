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
import pcftest.TeamGroupOtherClaims.TeamGroupOtherClaimsScreen;
import pcftest.TeamGroupOtherClaims.TeamGroupOtherClaimsScreen.TeamGroupOtherClaims_Assign;
import pcftest.TeamGroupOtherClaims.TeamGroupOtherClaimsScreen.TeamGroupOtherClaims_Print;
import pcftest.TeamGroupOtherClaims.TeamGroupOtherClaimsScreen.TeamGroupOtherClaims_RemoveFlag;
import pcftest.TeamGroupOtherClaims.TeamGroupOtherClaimsScreen._msgs;
import pcftest.TeamGroupOtherClaims.TeamGroupOtherClaims_UpLink;
import pcftest.TeamGroupOtherClaims._Paging;
import pcftest.TeamGroupOtherClaims.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/team/group/TeamGroupOtherClaims.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class TeamGroupOtherClaims extends PCFLocation {
  public final static String CHECKSUM = "52607f29d4b28b59fdea9822f0fe6c21";
  
  public TeamGroupOtherClaims(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("TeamGroupOtherClaims"));
  }
  
  public TeamGroupOtherClaimsScreen getTeamGroupOtherClaimsScreen() {
    return getOrCreateProperty("TeamGroupOtherClaimsScreen", "TeamGroupOtherClaimsScreen", null, pcftest.TeamGroupOtherClaims.TeamGroupOtherClaimsScreen.class);
  }
  
  public TeamGroupOtherClaims_UpLink getTeamGroupOtherClaims_UpLink() {
    return getOrCreateProperty("TeamGroupOtherClaims_UpLink", "TeamGroupOtherClaims_UpLink", null, pcftest.TeamGroupOtherClaims.TeamGroupOtherClaims_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.TeamGroupOtherClaims._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.TeamGroupOtherClaims.__crumb__.class);
  }
  
  public TeamGroupOtherGroup get_parent() {
    return getOrCreateProperty("_parent", pcftest.TeamGroupOtherGroup.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/group/TeamGroupOtherClaims.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TeamGroupOtherClaimsScreen extends PCFElement {
    public TeamGroupOtherClaimsScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public TeamClaimsLV getTeamClaimsLV() {
      return getOrCreateProperty("TeamClaimsLV", "TeamClaimsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.TeamClaimsLV.class);
    }
    
    public TeamGroupOtherClaims_Assign getTeamGroupOtherClaims_Assign() {
      return getOrCreateProperty("TeamGroupOtherClaims_Assign", "TeamGroupOtherClaims_Assign", null, pcftest.TeamGroupOtherClaims.TeamGroupOtherClaimsScreen.TeamGroupOtherClaims_Assign.class);
    }
    
    public TeamGroupOtherClaims_Print getTeamGroupOtherClaims_Print() {
      return getOrCreateProperty("TeamGroupOtherClaims_Print", "TeamGroupOtherClaims_Print", null, pcftest.TeamGroupOtherClaims.TeamGroupOtherClaimsScreen.TeamGroupOtherClaims_Print.class);
    }
    
    public TeamGroupOtherClaims_RemoveFlag getTeamGroupOtherClaims_RemoveFlag() {
      return getOrCreateProperty("TeamGroupOtherClaims_RemoveFlag", "TeamGroupOtherClaims_RemoveFlag", null, pcftest.TeamGroupOtherClaims.TeamGroupOtherClaimsScreen.TeamGroupOtherClaims_RemoveFlag.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.TeamGroupOtherClaims.TeamGroupOtherClaimsScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/team/group/TeamGroupOtherClaims.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class TeamGroupOtherClaims_Assign extends ClickableActionElement {
      public TeamGroupOtherClaims_Assign(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/team/group/TeamGroupOtherClaims.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class TeamGroupOtherClaims_Print extends ClickableActionElement {
      public TeamGroupOtherClaims_Print(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/team/group/TeamGroupOtherClaims.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class TeamGroupOtherClaims_RemoveFlag extends ClickableActionElement {
      public TeamGroupOtherClaims_RemoveFlag(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/team/group/TeamGroupOtherClaims.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/team/group/TeamGroupOtherClaims.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TeamGroupOtherClaims_UpLink extends ClickableActionElement {
    public TeamGroupOtherClaims_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/group/TeamGroupOtherClaims.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/group/TeamGroupOtherClaims.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}