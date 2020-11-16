package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ClaimSnapshotPolicy.ClaimSnapshotPolicy_UpLink;
import pcftest.ClaimSnapshotPolicy._Paging;
import pcftest.ClaimSnapshotPolicy.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/snapshot/ClaimSnapshotPolicy.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotPolicy extends PCFLocation {
  public final static String CHECKSUM = "9fdeef4a90ac3c92c7a9ee49607a19ca";
  
  public ClaimSnapshotPolicy(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ClaimSnapshotPolicy"));
  }
  
  public ClaimSnapshotPolicyScreen_300 getClaimSnapshotPolicyScreen_300() {
    return getOrCreateProperty("ClaimSnapshotPolicyScreen_300", "ClaimSnapshotPolicyScreen", null, pcftest.ClaimSnapshotPolicyScreen_300.class);
  }
  
  public ClaimSnapshotPolicyScreen_310 getClaimSnapshotPolicyScreen_310() {
    return getOrCreateProperty("ClaimSnapshotPolicyScreen_310", "ClaimSnapshotPolicyScreen", null, pcftest.ClaimSnapshotPolicyScreen_310.class);
  }
  
  public ClaimSnapshotPolicyScreen_400 getClaimSnapshotPolicyScreen_400() {
    return getOrCreateProperty("ClaimSnapshotPolicyScreen_400", "ClaimSnapshotPolicyScreen", null, pcftest.ClaimSnapshotPolicyScreen_400.class);
  }
  
  public ClaimSnapshotPolicyScreen_500 getClaimSnapshotPolicyScreen_500() {
    return getOrCreateProperty("ClaimSnapshotPolicyScreen_500", "ClaimSnapshotPolicyScreen", null, pcftest.ClaimSnapshotPolicyScreen_500.class);
  }
  
  public ClaimSnapshotPolicyScreen_600 getClaimSnapshotPolicyScreen_600() {
    return getOrCreateProperty("ClaimSnapshotPolicyScreen_600", "ClaimSnapshotPolicyScreen", null, pcftest.ClaimSnapshotPolicyScreen_600.class);
  }
  
  public ClaimSnapshotPolicyScreen_700 getClaimSnapshotPolicyScreen_700() {
    return getOrCreateProperty("ClaimSnapshotPolicyScreen_700", "ClaimSnapshotPolicyScreen", null, pcftest.ClaimSnapshotPolicyScreen_700.class);
  }
  
  public ClaimSnapshotPolicyScreen_800 getClaimSnapshotPolicyScreen_800() {
    return getOrCreateProperty("ClaimSnapshotPolicyScreen_800", "ClaimSnapshotPolicyScreen", null, pcftest.ClaimSnapshotPolicyScreen_800.class);
  }
  
  public ClaimSnapshotPolicyScreen_default getClaimSnapshotPolicyScreen_default() {
    return getOrCreateProperty("ClaimSnapshotPolicyScreen_default", "ClaimSnapshotPolicyScreen", null, pcftest.ClaimSnapshotPolicyScreen_default.class);
  }
  
  public ClaimSnapshotPolicy_UpLink getClaimSnapshotPolicy_UpLink() {
    return getOrCreateProperty("ClaimSnapshotPolicy_UpLink", "ClaimSnapshotPolicy_UpLink", null, pcftest.ClaimSnapshotPolicy.ClaimSnapshotPolicy_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ClaimSnapshotPolicy._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ClaimSnapshotPolicy.__crumb__.class);
  }
  
  public ClaimSnapshotGroup get_parent() {
    return getOrCreateProperty("_parent", pcftest.ClaimSnapshotGroup.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/ClaimSnapshotPolicy.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotPolicy_UpLink extends ClickableActionElement {
    public ClaimSnapshotPolicy_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/ClaimSnapshotPolicy.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/ClaimSnapshotPolicy.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}