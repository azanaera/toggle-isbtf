package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ActivityDetailPrint.ActivityDetailPrint_UpLink;
import pcftest.ActivityDetailPrint._Paging;
import pcftest.ActivityDetailPrint.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/shared/printing/ActivityDetailPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ActivityDetailPrint extends PCFLocation {
  public final static String CHECKSUM = "4a23f8b76dae29d221914ae309e587ce";
  
  public ActivityDetailPrint(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ActivityDetailPrint"));
  }
  
  public ActivityDetailPrint_UpLink getActivityDetailPrint_UpLink() {
    return getOrCreateProperty("ActivityDetailPrint_UpLink", "ActivityDetailPrint_UpLink", null, pcftest.ActivityDetailPrint.ActivityDetailPrint_UpLink.class);
  }
  
  public ActivityDetailScreen_editable getActivityDetailScreen_editable() {
    return getOrCreateProperty("ActivityDetailScreen_editable", "ActivityDetailScreen", null, pcftest.ActivityDetailScreen_editable.class);
  }
  
  public ActivityDetailScreen_readonly getActivityDetailScreen_readonly() {
    return getOrCreateProperty("ActivityDetailScreen_readonly", "ActivityDetailScreen", null, pcftest.ActivityDetailScreen_readonly.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ActivityDetailPrint._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ActivityDetailPrint.__crumb__.class);
  }
  
  public ClaimPrintout get_parent() {
    return getOrCreateProperty("_parent", pcftest.ClaimPrintout.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/printing/ActivityDetailPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ActivityDetailPrint_UpLink extends ClickableActionElement {
    public ActivityDetailPrint_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/printing/ActivityDetailPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/printing/ActivityDetailPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}