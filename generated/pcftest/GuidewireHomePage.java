package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.GuidewireHomePage.GuidewireHomePage_UpLink;
import pcftest.GuidewireHomePage._Paging;
import pcftest.GuidewireHomePage.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/util/GuidewireHomePage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class GuidewireHomePage extends PCFLocation {
  public final static String CHECKSUM = "33909c4fdcb97b55725b397e073eb8b7";
  
  public GuidewireHomePage(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("GuidewireHomePage"));
  }
  
  public GuidewireHomePage_UpLink getGuidewireHomePage_UpLink() {
    return getOrCreateProperty("GuidewireHomePage_UpLink", "GuidewireHomePage_UpLink", null, pcftest.GuidewireHomePage.GuidewireHomePage_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.GuidewireHomePage._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.GuidewireHomePage.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/util/GuidewireHomePage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class GuidewireHomePage_UpLink extends ClickableActionElement {
    public GuidewireHomePage_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/util/GuidewireHomePage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/util/GuidewireHomePage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}