package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ActivityPatternDetail.ActivityPatternDetail_UpLink;
import pcftest.ActivityPatternDetail._Paging;
import pcftest.ActivityPatternDetail.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/activitypatterns/ActivityPatternDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ActivityPatternDetail extends PCFLocation {
  public final static String CHECKSUM = "5ce17e3a86ec01e9888c3208923460e6";
  
  public ActivityPatternDetail(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ActivityPatternDetail"));
  }
  
  public ActivityPatternDetailScreen getActivityPatternDetailScreen() {
    return getOrCreateProperty("ActivityPatternDetailScreen", "ActivityPatternDetailScreen", null, pcftest.ActivityPatternDetailScreen.class);
  }
  
  public ActivityPatternDetail_UpLink getActivityPatternDetail_UpLink() {
    return getOrCreateProperty("ActivityPatternDetail_UpLink", "ActivityPatternDetail_UpLink", null, pcftest.ActivityPatternDetail.ActivityPatternDetail_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ActivityPatternDetail._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ActivityPatternDetail.__crumb__.class);
  }
  
  public ActivityPatterns get_parent() {
    return getOrCreateProperty("_parent", pcftest.ActivityPatterns.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/activitypatterns/ActivityPatternDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ActivityPatternDetail_UpLink extends ClickableActionElement {
    public ActivityPatternDetail_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/activitypatterns/ActivityPatternDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/activitypatterns/ActivityPatternDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}