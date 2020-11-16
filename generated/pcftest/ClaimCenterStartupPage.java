package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ClaimCenterStartupPage.ClaimCenterStartupPage_UpLink;
import pcftest.ClaimCenterStartupPage._Paging;
import pcftest.ClaimCenterStartupPage.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/util/ClaimCenterStartupPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimCenterStartupPage extends PCFLocation {
  public final static String CHECKSUM = "0dd0afcc5a0a0f6d0a112691b25e1990";
  
  public ClaimCenterStartupPage(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ClaimCenterStartupPage"));
  }
  
  public ClaimCenterStartupPage_UpLink getClaimCenterStartupPage_UpLink() {
    return getOrCreateProperty("ClaimCenterStartupPage_UpLink", "ClaimCenterStartupPage_UpLink", null, pcftest.ClaimCenterStartupPage.ClaimCenterStartupPage_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ClaimCenterStartupPage._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ClaimCenterStartupPage.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/util/ClaimCenterStartupPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimCenterStartupPage_UpLink extends ClickableActionElement {
    public ClaimCenterStartupPage_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/util/ClaimCenterStartupPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/util/ClaimCenterStartupPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}