package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.smoketest.platform.web.WorksheetTabBarElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.CalendarActivityDetailWorksheet.CalendarActivityDetailWorksheet_UpLink;
import pcftest.CalendarActivityDetailWorksheet._Paging;
import pcftest.CalendarActivityDetailWorksheet.__crumb__;
import pcftest.CalendarActivityDetailWorksheet.wsTabBar;
import pcftest.CalendarActivityDetailWorksheet.wsTabBar.wsTab;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/workspace/activity/CalendarActivityDetailWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class CalendarActivityDetailWorksheet extends PCFLocation {
  public final static String CHECKSUM = "7a06167a5c5dead8cc4c3b735ae65d8b";
  
  public CalendarActivityDetailWorksheet(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("CalendarActivityDetailWorksheet"));
  }
  
  public ActivityDetailScreen_editable getActivityDetailScreen_editable() {
    return getOrCreateProperty("ActivityDetailScreen_editable", "ActivityDetailScreen", null, pcftest.ActivityDetailScreen_editable.class);
  }
  
  public ActivityDetailScreen_readonly getActivityDetailScreen_readonly() {
    return getOrCreateProperty("ActivityDetailScreen_readonly", "ActivityDetailScreen", null, pcftest.ActivityDetailScreen_readonly.class);
  }
  
  public CalendarActivityDetailWorksheet_UpLink getCalendarActivityDetailWorksheet_UpLink() {
    return getOrCreateProperty("CalendarActivityDetailWorksheet_UpLink", "CalendarActivityDetailWorksheet_UpLink", null, pcftest.CalendarActivityDetailWorksheet.CalendarActivityDetailWorksheet_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.CalendarActivityDetailWorksheet._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.CalendarActivityDetailWorksheet.__crumb__.class);
  }
  
  public wsTabBar getwsTabBar() {
    return getOrCreateProperty("wsTabBar", pcftest.CalendarActivityDetailWorksheet.wsTabBar.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/workspace/activity/CalendarActivityDetailWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CalendarActivityDetailWorksheet_UpLink extends ClickableActionElement {
    public CalendarActivityDetailWorksheet_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/workspace/activity/CalendarActivityDetailWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/workspace/activity/CalendarActivityDetailWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/workspace/activity/CalendarActivityDetailWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class wsTabBar extends WorksheetTabBarElement {
    public wsTabBar(ISmokeTest helper)  {
      super(helper, new gw.smoketest.platform.web.PCFElementId("wsTabBar"));
    }
    
    public wsTab getwsTab() {
      return getOrCreateProperty("wsTab", "wsTab", null, pcftest.CalendarActivityDetailWorksheet.wsTabBar.wsTab.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/workspace/activity/CalendarActivityDetailWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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