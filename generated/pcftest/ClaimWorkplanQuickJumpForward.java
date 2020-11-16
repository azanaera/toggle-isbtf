package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ClaimWorkplanQuickJumpForward.ClaimWorkplanQuickJumpForward_UpLink;
import pcftest.ClaimWorkplanQuickJumpForward._Paging;
import pcftest.ClaimWorkplanQuickJumpForward.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/quickjump/contextualforward/ClaimWorkplanQuickJumpForward.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimWorkplanQuickJumpForward extends PCFLocation {
  public final static String CHECKSUM = "721dfde4d6abb909f39be0ae2d92d225";
  
  public ClaimWorkplanQuickJumpForward(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ClaimWorkplanQuickJumpForward"));
  }
  
  public ClaimWorkplanQuickJumpForward_UpLink getClaimWorkplanQuickJumpForward_UpLink() {
    return getOrCreateProperty("ClaimWorkplanQuickJumpForward_UpLink", "ClaimWorkplanQuickJumpForward_UpLink", null, pcftest.ClaimWorkplanQuickJumpForward.ClaimWorkplanQuickJumpForward_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ClaimWorkplanQuickJumpForward._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ClaimWorkplanQuickJumpForward.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/quickjump/contextualforward/ClaimWorkplanQuickJumpForward.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimWorkplanQuickJumpForward_UpLink extends ClickableActionElement {
    public ClaimWorkplanQuickJumpForward_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/quickjump/contextualforward/ClaimWorkplanQuickJumpForward.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/quickjump/contextualforward/ClaimWorkplanQuickJumpForward.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}