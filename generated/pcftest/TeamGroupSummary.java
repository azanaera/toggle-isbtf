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
import pcftest.TeamGroupSummary.TeamGroupSummaryScreen;
import pcftest.TeamGroupSummary.TeamGroupSummaryScreen.PrintButton;
import pcftest.TeamGroupSummary.TeamGroupSummaryScreen._msgs;
import pcftest.TeamGroupSummary.TeamGroupSummary_UpLink;
import pcftest.TeamGroupSummary._Paging;
import pcftest.TeamGroupSummary.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/team/summary/TeamGroupSummary.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class TeamGroupSummary extends PCFLocation {
  public final static String CHECKSUM = "d12c4bdfab4b8e419c7a816148fb3ee1";
  
  public TeamGroupSummary(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("TeamGroupSummary"));
  }
  
  public TeamGroupSummaryScreen getTeamGroupSummaryScreen() {
    return getOrCreateProperty("TeamGroupSummaryScreen", "TeamGroupSummaryScreen", null, pcftest.TeamGroupSummary.TeamGroupSummaryScreen.class);
  }
  
  public TeamGroupSummary_UpLink getTeamGroupSummary_UpLink() {
    return getOrCreateProperty("TeamGroupSummary_UpLink", "TeamGroupSummary_UpLink", null, pcftest.TeamGroupSummary.TeamGroupSummary_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.TeamGroupSummary._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.TeamGroupSummary.__crumb__.class);
  }
  
  public TeamGroupGroup get_parent() {
    return getOrCreateProperty("_parent", pcftest.TeamGroupGroup.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/summary/TeamGroupSummary.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TeamGroupSummaryScreen extends PCFElement {
    public TeamGroupSummaryScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getAsOf() {
      return getOrCreateProperty("AsOf", "AsOf", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public GroupStatisticsBarChart getGroupStatisticsBarChart() {
      return getOrCreateProperty("GroupStatisticsBarChart", "GroupStatisticsBarChart", null, pcftest.GroupStatisticsBarChart.class);
    }
    
    public GroupStatisticsLV getGroupStatisticsLV() {
      return getOrCreateProperty("GroupStatisticsLV", "GroupStatisticsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.GroupStatisticsLV.class);
    }
    
    public PrintButton getPrintButton() {
      return getOrCreateProperty("PrintButton", "PrintButton", null, pcftest.TeamGroupSummary.TeamGroupSummaryScreen.PrintButton.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.TeamGroupSummary.TeamGroupSummaryScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/team/summary/TeamGroupSummary.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class PrintButton extends ClickableActionElement {
      public PrintButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/team/summary/TeamGroupSummary.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/team/summary/TeamGroupSummary.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TeamGroupSummary_UpLink extends ClickableActionElement {
    public TeamGroupSummary_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/summary/TeamGroupSummary.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/summary/TeamGroupSummary.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}