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
import pcftest.TeamGroupMatters.TeamGroupMattersScreen;
import pcftest.TeamGroupMatters.TeamGroupMattersScreen.TeamGroupMatters_Assign;
import pcftest.TeamGroupMatters.TeamGroupMattersScreen.TeamGroupMatters_Print;
import pcftest.TeamGroupMatters.TeamGroupMattersScreen._msgs;
import pcftest.TeamGroupMatters.TeamGroupMatters_UpLink;
import pcftest.TeamGroupMatters._Paging;
import pcftest.TeamGroupMatters.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/team/matters/TeamGroupMatters.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class TeamGroupMatters extends PCFLocation {
  public final static String CHECKSUM = "71d0ec0c133aafcba23fea853f0cf7d2";
  
  public TeamGroupMatters(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("TeamGroupMatters"));
  }
  
  public TeamGroupMattersScreen getTeamGroupMattersScreen() {
    return getOrCreateProperty("TeamGroupMattersScreen", "TeamGroupMattersScreen", null, pcftest.TeamGroupMatters.TeamGroupMattersScreen.class);
  }
  
  public TeamGroupMatters_UpLink getTeamGroupMatters_UpLink() {
    return getOrCreateProperty("TeamGroupMatters_UpLink", "TeamGroupMatters_UpLink", null, pcftest.TeamGroupMatters.TeamGroupMatters_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.TeamGroupMatters._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.TeamGroupMatters.__crumb__.class);
  }
  
  public TeamGroupGroup get_parent() {
    return getOrCreateProperty("_parent", pcftest.TeamGroupGroup.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/matters/TeamGroupMatters.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TeamGroupMattersScreen extends PCFElement {
    public TeamGroupMattersScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public TeamGroupMatters_Assign getTeamGroupMatters_Assign() {
      return getOrCreateProperty("TeamGroupMatters_Assign", "TeamGroupMatters_Assign", null, pcftest.TeamGroupMatters.TeamGroupMattersScreen.TeamGroupMatters_Assign.class);
    }
    
    public TeamGroupMatters_Print getTeamGroupMatters_Print() {
      return getOrCreateProperty("TeamGroupMatters_Print", "TeamGroupMatters_Print", null, pcftest.TeamGroupMatters.TeamGroupMattersScreen.TeamGroupMatters_Print.class);
    }
    
    public TeamMattersLV getTeamMattersLV() {
      return getOrCreateProperty("TeamMattersLV", "TeamMattersLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.TeamMattersLV.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.TeamGroupMatters.TeamGroupMattersScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/team/matters/TeamGroupMatters.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class TeamGroupMatters_Assign extends ClickableActionElement {
      public TeamGroupMatters_Assign(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/team/matters/TeamGroupMatters.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class TeamGroupMatters_Print extends ClickableActionElement {
      public TeamGroupMatters_Print(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/team/matters/TeamGroupMatters.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/team/matters/TeamGroupMatters.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TeamGroupMatters_UpLink extends ClickableActionElement {
    public TeamGroupMatters_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/matters/TeamGroupMatters.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/matters/TeamGroupMatters.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}