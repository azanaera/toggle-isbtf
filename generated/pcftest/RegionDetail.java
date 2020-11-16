package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.RegionDetail.RegionDetail_UpLink;
import pcftest.RegionDetail._Paging;
import pcftest.RegionDetail.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/regions/RegionDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class RegionDetail extends PCFLocation {
  public final static String CHECKSUM = "e5a1c6941d968966a44d673c402e4f00";
  
  public RegionDetail(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("RegionDetail"));
  }
  
  public RegionDetailScreen getRegionDetailScreen() {
    return getOrCreateProperty("RegionDetailScreen", "RegionDetailScreen", null, pcftest.RegionDetailScreen.class);
  }
  
  public RegionDetail_UpLink getRegionDetail_UpLink() {
    return getOrCreateProperty("RegionDetail_UpLink", "RegionDetail_UpLink", null, pcftest.RegionDetail.RegionDetail_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.RegionDetail._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.RegionDetail.__crumb__.class);
  }
  
  public RegionsPage get_parent() {
    return getOrCreateProperty("_parent", pcftest.RegionsPage.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/regions/RegionDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RegionDetail_UpLink extends ClickableActionElement {
    public RegionDetail_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/regions/RegionDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/regions/RegionDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}