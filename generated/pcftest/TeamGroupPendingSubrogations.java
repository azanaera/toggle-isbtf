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
import pcftest.TeamGroupPendingSubrogations.TeamGroupPendingSubrogations_UpLink;
import pcftest.TeamGroupPendingSubrogations.TeamGroupSubrogationsScreen;
import pcftest.TeamGroupPendingSubrogations.TeamGroupSubrogationsScreen.Assign;
import pcftest.TeamGroupPendingSubrogations.TeamGroupSubrogationsScreen.Print;
import pcftest.TeamGroupPendingSubrogations.TeamGroupSubrogationsScreen._msgs;
import pcftest.TeamGroupPendingSubrogations._Paging;
import pcftest.TeamGroupPendingSubrogations.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/team/group/TeamGroupPendingSubrogations.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class TeamGroupPendingSubrogations extends PCFLocation {
  public final static String CHECKSUM = "f0a6c5de95d905b793189992081c3de1";
  
  public TeamGroupPendingSubrogations(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("TeamGroupPendingSubrogations"));
  }
  
  public TeamGroupPendingSubrogations_UpLink getTeamGroupPendingSubrogations_UpLink() {
    return getOrCreateProperty("TeamGroupPendingSubrogations_UpLink", "TeamGroupPendingSubrogations_UpLink", null, pcftest.TeamGroupPendingSubrogations.TeamGroupPendingSubrogations_UpLink.class);
  }
  
  public TeamGroupSubrogationsScreen getTeamGroupSubrogationsScreen() {
    return getOrCreateProperty("TeamGroupSubrogationsScreen", "TeamGroupSubrogationsScreen", null, pcftest.TeamGroupPendingSubrogations.TeamGroupSubrogationsScreen.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.TeamGroupPendingSubrogations._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.TeamGroupPendingSubrogations.__crumb__.class);
  }
  
  public TeamGroupPendingGroup get_parent() {
    return getOrCreateProperty("_parent", pcftest.TeamGroupPendingGroup.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/group/TeamGroupPendingSubrogations.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TeamGroupPendingSubrogations_UpLink extends ClickableActionElement {
    public TeamGroupPendingSubrogations_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/group/TeamGroupPendingSubrogations.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TeamGroupSubrogationsScreen extends PCFElement {
    public TeamGroupSubrogationsScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Assign getAssign() {
      return getOrCreateProperty("Assign", "Assign", null, pcftest.TeamGroupPendingSubrogations.TeamGroupSubrogationsScreen.Assign.class);
    }
    
    public Print getPrint() {
      return getOrCreateProperty("Print", "Print", null, pcftest.TeamGroupPendingSubrogations.TeamGroupSubrogationsScreen.Print.class);
    }
    
    public SubrogationsLV getSubrogationsLV() {
      return getOrCreateProperty("SubrogationsLV", "SubrogationsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.SubrogationsLV.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.TeamGroupPendingSubrogations.TeamGroupSubrogationsScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/team/group/TeamGroupPendingSubrogations.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Assign extends ClickableActionElement {
      public Assign(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/team/group/TeamGroupPendingSubrogations.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Print extends ClickableActionElement {
      public Print(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/team/group/TeamGroupPendingSubrogations.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/team/group/TeamGroupPendingSubrogations.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/group/TeamGroupPendingSubrogations.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}