package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.NewRegion.NewRegion_UpLink;
import pcftest.NewRegion._Paging;
import pcftest.NewRegion.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/regions/NewRegion.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NewRegion extends PCFLocation {
  public final static String CHECKSUM = "dac114cac8da62004bb0d7f655c629c5";
  
  public NewRegion(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("NewRegion"));
  }
  
  public NewRegion_UpLink getNewRegion_UpLink() {
    return getOrCreateProperty("NewRegion_UpLink", "NewRegion_UpLink", null, pcftest.NewRegion.NewRegion_UpLink.class);
  }
  
  public RegionDetailScreen getRegionDetailScreen() {
    return getOrCreateProperty("RegionDetailScreen", "RegionDetailScreen", null, pcftest.RegionDetailScreen.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.NewRegion._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.NewRegion.__crumb__.class);
  }
  
  public RegionsPage get_parent() {
    return getOrCreateProperty("_parent", pcftest.RegionsPage.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/regions/NewRegion.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewRegion_UpLink extends ClickableActionElement {
    public NewRegion_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/regions/NewRegion.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/regions/NewRegion.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}