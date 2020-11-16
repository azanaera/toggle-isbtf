package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ClaimSnapshotPartiesInvolved.ClaimSnapshotPartiesInvolved_UpLink;
import pcftest.ClaimSnapshotPartiesInvolved._Paging;
import pcftest.ClaimSnapshotPartiesInvolved.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/snapshot/ClaimSnapshotPartiesInvolved.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotPartiesInvolved extends PCFLocation {
  public final static String CHECKSUM = "d2fa55fa9acbd72d58d68e8e5dadcbbe";
  
  public ClaimSnapshotPartiesInvolved(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ClaimSnapshotPartiesInvolved"));
  }
  
  public ClaimSnapshotPartiesInvolvedScreen_300 getClaimSnapshotPartiesInvolvedScreen_300() {
    return getOrCreateProperty("ClaimSnapshotPartiesInvolvedScreen_300", "ClaimSnapshotPartiesInvolvedScreen", null, pcftest.ClaimSnapshotPartiesInvolvedScreen_300.class);
  }
  
  public ClaimSnapshotPartiesInvolvedScreen_310 getClaimSnapshotPartiesInvolvedScreen_310() {
    return getOrCreateProperty("ClaimSnapshotPartiesInvolvedScreen_310", "ClaimSnapshotPartiesInvolvedScreen", null, pcftest.ClaimSnapshotPartiesInvolvedScreen_310.class);
  }
  
  public ClaimSnapshotPartiesInvolvedScreen_400 getClaimSnapshotPartiesInvolvedScreen_400() {
    return getOrCreateProperty("ClaimSnapshotPartiesInvolvedScreen_400", "ClaimSnapshotPartiesInvolvedScreen", null, pcftest.ClaimSnapshotPartiesInvolvedScreen_400.class);
  }
  
  public ClaimSnapshotPartiesInvolvedScreen_500 getClaimSnapshotPartiesInvolvedScreen_500() {
    return getOrCreateProperty("ClaimSnapshotPartiesInvolvedScreen_500", "ClaimSnapshotPartiesInvolvedScreen", null, pcftest.ClaimSnapshotPartiesInvolvedScreen_500.class);
  }
  
  public ClaimSnapshotPartiesInvolvedScreen_600 getClaimSnapshotPartiesInvolvedScreen_600() {
    return getOrCreateProperty("ClaimSnapshotPartiesInvolvedScreen_600", "ClaimSnapshotPartiesInvolvedScreen", null, pcftest.ClaimSnapshotPartiesInvolvedScreen_600.class);
  }
  
  public ClaimSnapshotPartiesInvolvedScreen_700 getClaimSnapshotPartiesInvolvedScreen_700() {
    return getOrCreateProperty("ClaimSnapshotPartiesInvolvedScreen_700", "ClaimSnapshotPartiesInvolvedScreen", null, pcftest.ClaimSnapshotPartiesInvolvedScreen_700.class);
  }
  
  public ClaimSnapshotPartiesInvolvedScreen_800 getClaimSnapshotPartiesInvolvedScreen_800() {
    return getOrCreateProperty("ClaimSnapshotPartiesInvolvedScreen_800", "ClaimSnapshotPartiesInvolvedScreen", null, pcftest.ClaimSnapshotPartiesInvolvedScreen_800.class);
  }
  
  public ClaimSnapshotPartiesInvolvedScreen_default getClaimSnapshotPartiesInvolvedScreen_default() {
    return getOrCreateProperty("ClaimSnapshotPartiesInvolvedScreen_default", "ClaimSnapshotPartiesInvolvedScreen", null, pcftest.ClaimSnapshotPartiesInvolvedScreen_default.class);
  }
  
  public ClaimSnapshotPartiesInvolved_UpLink getClaimSnapshotPartiesInvolved_UpLink() {
    return getOrCreateProperty("ClaimSnapshotPartiesInvolved_UpLink", "ClaimSnapshotPartiesInvolved_UpLink", null, pcftest.ClaimSnapshotPartiesInvolved.ClaimSnapshotPartiesInvolved_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ClaimSnapshotPartiesInvolved._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ClaimSnapshotPartiesInvolved.__crumb__.class);
  }
  
  public ClaimSnapshotGroup get_parent() {
    return getOrCreateProperty("_parent", pcftest.ClaimSnapshotGroup.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/ClaimSnapshotPartiesInvolved.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotPartiesInvolved_UpLink extends ClickableActionElement {
    public ClaimSnapshotPartiesInvolved_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/ClaimSnapshotPartiesInvolved.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/ClaimSnapshotPartiesInvolved.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}