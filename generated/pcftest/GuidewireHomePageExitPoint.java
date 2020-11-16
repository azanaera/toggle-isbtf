package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.GuidewireHomePageExitPoint.GuidewireHomePageExitPoint_UpLink;
import pcftest.GuidewireHomePageExitPoint._Paging;
import pcftest.GuidewireHomePageExitPoint.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/util/GuidewireHomePageExitPoint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class GuidewireHomePageExitPoint extends PCFLocation {
  public final static String CHECKSUM = "b12bdeacdc512166febbe724ed445803";
  
  public GuidewireHomePageExitPoint(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("GuidewireHomePageExitPoint"));
  }
  
  public GuidewireHomePageExitPoint_UpLink getGuidewireHomePageExitPoint_UpLink() {
    return getOrCreateProperty("GuidewireHomePageExitPoint_UpLink", "GuidewireHomePageExitPoint_UpLink", null, pcftest.GuidewireHomePageExitPoint.GuidewireHomePageExitPoint_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.GuidewireHomePageExitPoint._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.GuidewireHomePageExitPoint.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/util/GuidewireHomePageExitPoint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class GuidewireHomePageExitPoint_UpLink extends ClickableActionElement {
    public GuidewireHomePageExitPoint_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/util/GuidewireHomePageExitPoint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/util/GuidewireHomePageExitPoint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}