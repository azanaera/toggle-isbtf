package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ClaimNewCheckForward.ClaimNewCheckForward_UpLink;
import pcftest.ClaimNewCheckForward._Paging;
import pcftest.ClaimNewCheckForward.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/quickjump/contextualforward/ClaimNewCheckForward.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimNewCheckForward extends PCFLocation {
  public final static String CHECKSUM = "ded75a84ed28ac3483b58c0f190e099e";
  
  public ClaimNewCheckForward(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ClaimNewCheckForward"));
  }
  
  public ClaimNewCheckForward_UpLink getClaimNewCheckForward_UpLink() {
    return getOrCreateProperty("ClaimNewCheckForward_UpLink", "ClaimNewCheckForward_UpLink", null, pcftest.ClaimNewCheckForward.ClaimNewCheckForward_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ClaimNewCheckForward._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ClaimNewCheckForward.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/quickjump/contextualforward/ClaimNewCheckForward.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimNewCheckForward_UpLink extends ClickableActionElement {
    public ClaimNewCheckForward_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/quickjump/contextualforward/ClaimNewCheckForward.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/quickjump/contextualforward/ClaimNewCheckForward.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}