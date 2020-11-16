package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ClaimLossDetailsQuickJumpForward.ClaimLossDetailsQuickJumpForward_UpLink;
import pcftest.ClaimLossDetailsQuickJumpForward._Paging;
import pcftest.ClaimLossDetailsQuickJumpForward.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/quickjump/contextualforward/ClaimLossDetailsQuickJumpForward.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimLossDetailsQuickJumpForward extends PCFLocation {
  public final static String CHECKSUM = "12d31e645bc821de09eca5e7a17b3f29";
  
  public ClaimLossDetailsQuickJumpForward(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ClaimLossDetailsQuickJumpForward"));
  }
  
  public ClaimLossDetailsQuickJumpForward_UpLink getClaimLossDetailsQuickJumpForward_UpLink() {
    return getOrCreateProperty("ClaimLossDetailsQuickJumpForward_UpLink", "ClaimLossDetailsQuickJumpForward_UpLink", null, pcftest.ClaimLossDetailsQuickJumpForward.ClaimLossDetailsQuickJumpForward_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ClaimLossDetailsQuickJumpForward._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ClaimLossDetailsQuickJumpForward.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/quickjump/contextualforward/ClaimLossDetailsQuickJumpForward.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimLossDetailsQuickJumpForward_UpLink extends ClickableActionElement {
    public ClaimLossDetailsQuickJumpForward_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/quickjump/contextualforward/ClaimLossDetailsQuickJumpForward.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/quickjump/contextualforward/ClaimLossDetailsQuickJumpForward.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}