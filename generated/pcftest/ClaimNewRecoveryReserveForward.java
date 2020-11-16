package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ClaimNewRecoveryReserveForward.ClaimNewRecoveryReserveForward_UpLink;
import pcftest.ClaimNewRecoveryReserveForward._Paging;
import pcftest.ClaimNewRecoveryReserveForward.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/quickjump/contextualforward/ClaimNewRecoveryReserveForward.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimNewRecoveryReserveForward extends PCFLocation {
  public final static String CHECKSUM = "a6ff7fa9ff0b28427dd0a5ec82d15ce4";
  
  public ClaimNewRecoveryReserveForward(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ClaimNewRecoveryReserveForward"));
  }
  
  public ClaimNewRecoveryReserveForward_UpLink getClaimNewRecoveryReserveForward_UpLink() {
    return getOrCreateProperty("ClaimNewRecoveryReserveForward_UpLink", "ClaimNewRecoveryReserveForward_UpLink", null, pcftest.ClaimNewRecoveryReserveForward.ClaimNewRecoveryReserveForward_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ClaimNewRecoveryReserveForward._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ClaimNewRecoveryReserveForward.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/quickjump/contextualforward/ClaimNewRecoveryReserveForward.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimNewRecoveryReserveForward_UpLink extends ClickableActionElement {
    public ClaimNewRecoveryReserveForward_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/quickjump/contextualforward/ClaimNewRecoveryReserveForward.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/quickjump/contextualforward/ClaimNewRecoveryReserveForward.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}