package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.MultiClusterNavigation.MultiClusterNavigation_UpLink;
import pcftest.MultiClusterNavigation._Paging;
import pcftest.MultiClusterNavigation.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/exitpoints/MultiClusterNavigation.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class MultiClusterNavigation extends PCFLocation {
  public final static String CHECKSUM = "8de0566ea6a25b7d0f86fa85627f97f5";
  
  public MultiClusterNavigation(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("MultiClusterNavigation"));
  }
  
  public MultiClusterNavigation_UpLink getMultiClusterNavigation_UpLink() {
    return getOrCreateProperty("MultiClusterNavigation_UpLink", "MultiClusterNavigation_UpLink", null, pcftest.MultiClusterNavigation.MultiClusterNavigation_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.MultiClusterNavigation._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.MultiClusterNavigation.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/exitpoints/MultiClusterNavigation.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MultiClusterNavigation_UpLink extends ClickableActionElement {
    public MultiClusterNavigation_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/exitpoints/MultiClusterNavigation.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/exitpoints/MultiClusterNavigation.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}