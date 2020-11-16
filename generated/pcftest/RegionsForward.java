package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.RegionsForward.RegionsForward_UpLink;
import pcftest.RegionsForward._Paging;
import pcftest.RegionsForward.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/regions/RegionsForward.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class RegionsForward extends PCFLocation {
  public final static String CHECKSUM = "432b024052e375ce36db18fbaeaf2055";
  
  public RegionsForward(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("RegionsForward"));
  }
  
  public RegionsForward_UpLink getRegionsForward_UpLink() {
    return getOrCreateProperty("RegionsForward_UpLink", "RegionsForward_UpLink", null, pcftest.RegionsForward.RegionsForward_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.RegionsForward._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.RegionsForward.__crumb__.class);
  }
  
  public Regions get_parent() {
    return getOrCreateProperty("_parent", pcftest.Regions.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/regions/RegionsForward.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RegionsForward_UpLink extends ClickableActionElement {
    public RegionsForward_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/regions/RegionsForward.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/regions/RegionsForward.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}