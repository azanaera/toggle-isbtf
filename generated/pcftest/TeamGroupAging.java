package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElement;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.TeamGroupAging.TeamGroupAgingScreen;
import pcftest.TeamGroupAging.TeamGroupAgingScreen.PrintButton;
import pcftest.TeamGroupAging.TeamGroupAgingScreen._msgs;
import pcftest.TeamGroupAging.TeamGroupAging_UpLink;
import pcftest.TeamGroupAging._Paging;
import pcftest.TeamGroupAging.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/team/aging/TeamGroupAging.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class TeamGroupAging extends PCFLocation {
  public final static String CHECKSUM = "cbe7f64f042805b6b3d9cf8189c60c71";
  
  public TeamGroupAging(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("TeamGroupAging"));
  }
  
  public TeamGroupAgingScreen getTeamGroupAgingScreen() {
    return getOrCreateProperty("TeamGroupAgingScreen", "TeamGroupAgingScreen", null, pcftest.TeamGroupAging.TeamGroupAgingScreen.class);
  }
  
  public TeamGroupAging_UpLink getTeamGroupAging_UpLink() {
    return getOrCreateProperty("TeamGroupAging_UpLink", "TeamGroupAging_UpLink", null, pcftest.TeamGroupAging.TeamGroupAging_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.TeamGroupAging._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.TeamGroupAging.__crumb__.class);
  }
  
  public TeamGroupGroup get_parent() {
    return getOrCreateProperty("_parent", pcftest.TeamGroupGroup.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/aging/TeamGroupAging.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TeamGroupAgingScreen extends PCFElement {
    public TeamGroupAgingScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getAsOf() {
      return getOrCreateProperty("AsOf", "AsOf", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public GroupAgingStatisticsLV getGroupAgingStatisticsLV() {
      return getOrCreateProperty("GroupAgingStatisticsLV", "GroupAgingStatisticsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.GroupAgingStatisticsLV.class);
    }
    
    public PrintButton getPrintButton() {
      return getOrCreateProperty("PrintButton", "PrintButton", null, pcftest.TeamGroupAging.TeamGroupAgingScreen.PrintButton.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.TeamGroupAging.TeamGroupAgingScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/team/aging/TeamGroupAging.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class PrintButton extends ClickableActionElement {
      public PrintButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/team/aging/TeamGroupAging.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/team/aging/TeamGroupAging.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TeamGroupAging_UpLink extends ClickableActionElement {
    public TeamGroupAging_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/aging/TeamGroupAging.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/aging/TeamGroupAging.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}