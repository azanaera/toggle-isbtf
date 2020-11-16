package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.smoketest.platform.web.WorksheetTabBarElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ActivityDetailViaClaimWorksheet.ActivityDetailViaClaimWorksheet_UpLink;
import pcftest.ActivityDetailViaClaimWorksheet._Paging;
import pcftest.ActivityDetailViaClaimWorksheet.__crumb__;
import pcftest.ActivityDetailViaClaimWorksheet.wsTabBar;
import pcftest.ActivityDetailViaClaimWorksheet.wsTabBar.wsTab;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/workspace/activity/ActivityDetailViaClaimWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ActivityDetailViaClaimWorksheet extends PCFLocation {
  public final static String CHECKSUM = "5da58e382847354390ca849ea4076bfc";
  
  public ActivityDetailViaClaimWorksheet(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ActivityDetailViaClaimWorksheet"));
  }
  
  public ActivityDetailScreen_editable getActivityDetailScreen_editable() {
    return getOrCreateProperty("ActivityDetailScreen_editable", "ActivityDetailScreen", null, pcftest.ActivityDetailScreen_editable.class);
  }
  
  public ActivityDetailScreen_readonly getActivityDetailScreen_readonly() {
    return getOrCreateProperty("ActivityDetailScreen_readonly", "ActivityDetailScreen", null, pcftest.ActivityDetailScreen_readonly.class);
  }
  
  public ActivityDetailViaClaimWorksheet_UpLink getActivityDetailViaClaimWorksheet_UpLink() {
    return getOrCreateProperty("ActivityDetailViaClaimWorksheet_UpLink", "ActivityDetailViaClaimWorksheet_UpLink", null, pcftest.ActivityDetailViaClaimWorksheet.ActivityDetailViaClaimWorksheet_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ActivityDetailViaClaimWorksheet._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ActivityDetailViaClaimWorksheet.__crumb__.class);
  }
  
  public wsTabBar getwsTabBar() {
    return getOrCreateProperty("wsTabBar", pcftest.ActivityDetailViaClaimWorksheet.wsTabBar.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/workspace/activity/ActivityDetailViaClaimWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ActivityDetailViaClaimWorksheet_UpLink extends ClickableActionElement {
    public ActivityDetailViaClaimWorksheet_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/workspace/activity/ActivityDetailViaClaimWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/workspace/activity/ActivityDetailViaClaimWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/workspace/activity/ActivityDetailViaClaimWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class wsTabBar extends WorksheetTabBarElement {
    public wsTabBar(ISmokeTest helper)  {
      super(helper, new gw.smoketest.platform.web.PCFElementId("wsTabBar"));
    }
    
    public wsTab getwsTab() {
      return getOrCreateProperty("wsTab", "wsTab", null, pcftest.ActivityDetailViaClaimWorksheet.wsTabBar.wsTab.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/workspace/activity/ActivityDetailViaClaimWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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