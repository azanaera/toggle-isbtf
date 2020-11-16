package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ClaimMatterForward.ClaimMatterForward_UpLink;
import pcftest.ClaimMatterForward._Paging;
import pcftest.ClaimMatterForward.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/litigation/ClaimMatterForward.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimMatterForward extends PCFLocation {
  public final static String CHECKSUM = "82036de9f3c2e3f65e568b006e4aa63a";
  
  public ClaimMatterForward(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ClaimMatterForward"));
  }
  
  public ClaimMatterForward_UpLink getClaimMatterForward_UpLink() {
    return getOrCreateProperty("ClaimMatterForward_UpLink", "ClaimMatterForward_UpLink", null, pcftest.ClaimMatterForward.ClaimMatterForward_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ClaimMatterForward._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ClaimMatterForward.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/litigation/ClaimMatterForward.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimMatterForward_UpLink extends ClickableActionElement {
    public ClaimMatterForward_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/litigation/ClaimMatterForward.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/litigation/ClaimMatterForward.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}