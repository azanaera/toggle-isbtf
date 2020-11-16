package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ActivityDetailForward.ActivityDetailForward_UpLink;
import pcftest.ActivityDetailForward._Paging;
import pcftest.ActivityDetailForward.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/workspace/activity/ActivityDetailForward.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ActivityDetailForward extends PCFLocation {
  public final static String CHECKSUM = "de7a1a776674025029ce3d471b0330d4";
  
  public ActivityDetailForward(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ActivityDetailForward"));
  }
  
  public ActivityDetailForward_UpLink getActivityDetailForward_UpLink() {
    return getOrCreateProperty("ActivityDetailForward_UpLink", "ActivityDetailForward_UpLink", null, pcftest.ActivityDetailForward.ActivityDetailForward_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ActivityDetailForward._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ActivityDetailForward.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/workspace/activity/ActivityDetailForward.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ActivityDetailForward_UpLink extends ClickableActionElement {
    public ActivityDetailForward_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/workspace/activity/ActivityDetailForward.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/workspace/activity/ActivityDetailForward.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}