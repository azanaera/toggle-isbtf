package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.MultiClusterForward.MultiClusterForward_UpLink;
import pcftest.MultiClusterForward._Paging;
import pcftest.MultiClusterForward.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/MultiClusterForward.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class MultiClusterForward extends PCFLocation {
  public final static String CHECKSUM = "0f59ba81946f46803f69c7acf707fad6";
  
  public MultiClusterForward(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("MultiClusterForward"));
  }
  
  public MultiClusterForward_UpLink getMultiClusterForward_UpLink() {
    return getOrCreateProperty("MultiClusterForward_UpLink", "MultiClusterForward_UpLink", null, pcftest.MultiClusterForward.MultiClusterForward_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.MultiClusterForward._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.MultiClusterForward.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/MultiClusterForward.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MultiClusterForward_UpLink extends ClickableActionElement {
    public MultiClusterForward_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/MultiClusterForward.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/MultiClusterForward.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}