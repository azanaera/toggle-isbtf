package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.smoketest.platform.web.WorksheetTabBarElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.UserStatisticsWorksheet.UserStatisticsWorksheet_UpLink;
import pcftest.UserStatisticsWorksheet._Paging;
import pcftest.UserStatisticsWorksheet.__crumb__;
import pcftest.UserStatisticsWorksheet.wsTabBar;
import pcftest.UserStatisticsWorksheet.wsTabBar.wsTab;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/workspace/statistics/UserStatisticsWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class UserStatisticsWorksheet extends PCFLocation {
  public final static String CHECKSUM = "64e740f43161f42bd8f7dfd9f9ec4bca";
  
  public UserStatisticsWorksheet(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("UserStatisticsWorksheet"));
  }
  
  public UserStatisticsScreen getUserStatisticsScreen() {
    return getOrCreateProperty("UserStatisticsScreen", "UserStatisticsScreen", null, pcftest.UserStatisticsScreen.class);
  }
  
  public UserStatisticsWorksheet_UpLink getUserStatisticsWorksheet_UpLink() {
    return getOrCreateProperty("UserStatisticsWorksheet_UpLink", "UserStatisticsWorksheet_UpLink", null, pcftest.UserStatisticsWorksheet.UserStatisticsWorksheet_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.UserStatisticsWorksheet._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.UserStatisticsWorksheet.__crumb__.class);
  }
  
  public wsTabBar getwsTabBar() {
    return getOrCreateProperty("wsTabBar", pcftest.UserStatisticsWorksheet.wsTabBar.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/workspace/statistics/UserStatisticsWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class UserStatisticsWorksheet_UpLink extends ClickableActionElement {
    public UserStatisticsWorksheet_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/workspace/statistics/UserStatisticsWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/workspace/statistics/UserStatisticsWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/workspace/statistics/UserStatisticsWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class wsTabBar extends WorksheetTabBarElement {
    public wsTabBar(ISmokeTest helper)  {
      super(helper, new gw.smoketest.platform.web.PCFElementId("wsTabBar"));
    }
    
    public wsTab getwsTab() {
      return getOrCreateProperty("wsTab", "wsTab", null, pcftest.UserStatisticsWorksheet.wsTabBar.wsTab.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/workspace/statistics/UserStatisticsWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class wsTab extends ClickableActionElement {
      public wsTab(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  
}