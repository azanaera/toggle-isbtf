package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.FreeTextClaimForward.FreeTextClaimForward_UpLink;
import pcftest.FreeTextClaimForward._Paging;
import pcftest.FreeTextClaimForward.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/search/claims/FreeTextClaimForward.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class FreeTextClaimForward extends PCFLocation {
  public final static String CHECKSUM = "7edcc2d6f2066dacc4456ecdc93b049b";
  
  public FreeTextClaimForward(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("FreeTextClaimForward"));
  }
  
  public FreeTextClaimForward_UpLink getFreeTextClaimForward_UpLink() {
    return getOrCreateProperty("FreeTextClaimForward_UpLink", "FreeTextClaimForward_UpLink", null, pcftest.FreeTextClaimForward.FreeTextClaimForward_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.FreeTextClaimForward._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.FreeTextClaimForward.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/search/claims/FreeTextClaimForward.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FreeTextClaimForward_UpLink extends ClickableActionElement {
    public FreeTextClaimForward_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/search/claims/FreeTextClaimForward.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/search/claims/FreeTextClaimForward.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}