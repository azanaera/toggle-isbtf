package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.smoketest.platform.web.WorksheetTabBarElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ActivityDetailWorksheet.ActivityDetailWorksheet_UpLink;
import pcftest.ActivityDetailWorksheet._Paging;
import pcftest.ActivityDetailWorksheet.__crumb__;
import pcftest.ActivityDetailWorksheet.wsTabBar;
import pcftest.ActivityDetailWorksheet.wsTabBar.wsTab;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/workspace/activity/ActivityDetailWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ActivityDetailWorksheet extends PCFLocation {
  public final static String CHECKSUM = "ee2ce1ad1c9d51c2cdd94b3ab92a027f";
  
  public ActivityDetailWorksheet(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ActivityDetailWorksheet"));
  }
  
  public ActivityDetailScreen_editable getActivityDetailScreen_editable() {
    return getOrCreateProperty("ActivityDetailScreen_editable", "ActivityDetailScreen", null, pcftest.ActivityDetailScreen_editable.class);
  }
  
  public ActivityDetailScreen_readonly getActivityDetailScreen_readonly() {
    return getOrCreateProperty("ActivityDetailScreen_readonly", "ActivityDetailScreen", null, pcftest.ActivityDetailScreen_readonly.class);
  }
  
  public ActivityDetailWorksheet_UpLink getActivityDetailWorksheet_UpLink() {
    return getOrCreateProperty("ActivityDetailWorksheet_UpLink", "ActivityDetailWorksheet_UpLink", null, pcftest.ActivityDetailWorksheet.ActivityDetailWorksheet_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ActivityDetailWorksheet._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ActivityDetailWorksheet.__crumb__.class);
  }
  
  public ClaimWorkplan get_parent() {
    return getOrCreateProperty("_parent", pcftest.ClaimWorkplan.class);
  }
  
  public wsTabBar getwsTabBar() {
    return getOrCreateProperty("wsTabBar", pcftest.ActivityDetailWorksheet.wsTabBar.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/workspace/activity/ActivityDetailWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ActivityDetailWorksheet_UpLink extends ClickableActionElement {
    public ActivityDetailWorksheet_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/workspace/activity/ActivityDetailWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/workspace/activity/ActivityDetailWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/workspace/activity/ActivityDetailWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class wsTabBar extends WorksheetTabBarElement {
    public wsTabBar(ISmokeTest helper)  {
      super(helper, new gw.smoketest.platform.web.PCFElementId("wsTabBar"));
    }
    
    public wsTab getwsTab() {
      return getOrCreateProperty("wsTab", "wsTab", null, pcftest.ActivityDetailWorksheet.wsTabBar.wsTab.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/workspace/activity/ActivityDetailWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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