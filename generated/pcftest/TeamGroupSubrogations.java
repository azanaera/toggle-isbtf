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
import pcftest.TeamGroupSubrogations.TeamGroupSubrogationsScreen;
import pcftest.TeamGroupSubrogations.TeamGroupSubrogationsScreen.Assign;
import pcftest.TeamGroupSubrogations.TeamGroupSubrogationsScreen.Print;
import pcftest.TeamGroupSubrogations.TeamGroupSubrogationsScreen._msgs;
import pcftest.TeamGroupSubrogations.TeamGroupSubrogations_UpLink;
import pcftest.TeamGroupSubrogations._Paging;
import pcftest.TeamGroupSubrogations.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/team/subrogations/TeamGroupSubrogations.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class TeamGroupSubrogations extends PCFLocation {
  public final static String CHECKSUM = "519c1cb5c30f5a9ab3508e61ad265dd3";
  
  public TeamGroupSubrogations(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("TeamGroupSubrogations"));
  }
  
  public TeamGroupSubrogationsScreen getTeamGroupSubrogationsScreen() {
    return getOrCreateProperty("TeamGroupSubrogationsScreen", "TeamGroupSubrogationsScreen", null, pcftest.TeamGroupSubrogations.TeamGroupSubrogationsScreen.class);
  }
  
  public TeamGroupSubrogations_UpLink getTeamGroupSubrogations_UpLink() {
    return getOrCreateProperty("TeamGroupSubrogations_UpLink", "TeamGroupSubrogations_UpLink", null, pcftest.TeamGroupSubrogations.TeamGroupSubrogations_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.TeamGroupSubrogations._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.TeamGroupSubrogations.__crumb__.class);
  }
  
  public TeamGroupGroup get_parent() {
    return getOrCreateProperty("_parent", pcftest.TeamGroupGroup.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/subrogations/TeamGroupSubrogations.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TeamGroupSubrogationsScreen extends PCFElement {
    public TeamGroupSubrogationsScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Assign getAssign() {
      return getOrCreateProperty("Assign", "Assign", null, pcftest.TeamGroupSubrogations.TeamGroupSubrogationsScreen.Assign.class);
    }
    
    public Print getPrint() {
      return getOrCreateProperty("Print", "Print", null, pcftest.TeamGroupSubrogations.TeamGroupSubrogationsScreen.Print.class);
    }
    
    public SubrogationsLV getSubrogationsLV() {
      return getOrCreateProperty("SubrogationsLV", "SubrogationsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.SubrogationsLV.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.TeamGroupSubrogations.TeamGroupSubrogationsScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/team/subrogations/TeamGroupSubrogations.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Assign extends ClickableActionElement {
      public Assign(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/team/subrogations/TeamGroupSubrogations.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Print extends ClickableActionElement {
      public Print(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/team/subrogations/TeamGroupSubrogations.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/team/subrogations/TeamGroupSubrogations.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TeamGroupSubrogations_UpLink extends ClickableActionElement {
    public TeamGroupSubrogations_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/subrogations/TeamGroupSubrogations.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/subrogations/TeamGroupSubrogations.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}