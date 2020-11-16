package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ClaimSnapshotLossDetails.ClaimSnapshotLossDetails_UpLink;
import pcftest.ClaimSnapshotLossDetails._Paging;
import pcftest.ClaimSnapshotLossDetails.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/snapshot/ClaimSnapshotLossDetails.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotLossDetails extends PCFLocation {
  public final static String CHECKSUM = "4dcf2e0a2852a2294661a31b3921dcaa";
  
  public ClaimSnapshotLossDetails(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ClaimSnapshotLossDetails"));
  }
  
  public ClaimSnapshotLossDetailsScreen_300 getClaimSnapshotLossDetailsScreen_300() {
    return getOrCreateProperty("ClaimSnapshotLossDetailsScreen_300", "ClaimSnapshotLossDetailsScreen", null, pcftest.ClaimSnapshotLossDetailsScreen_300.class);
  }
  
  public ClaimSnapshotLossDetailsScreen_310 getClaimSnapshotLossDetailsScreen_310() {
    return getOrCreateProperty("ClaimSnapshotLossDetailsScreen_310", "ClaimSnapshotLossDetailsScreen", null, pcftest.ClaimSnapshotLossDetailsScreen_310.class);
  }
  
  public ClaimSnapshotLossDetailsScreen_400 getClaimSnapshotLossDetailsScreen_400() {
    return getOrCreateProperty("ClaimSnapshotLossDetailsScreen_400", "ClaimSnapshotLossDetailsScreen", null, pcftest.ClaimSnapshotLossDetailsScreen_400.class);
  }
  
  public ClaimSnapshotLossDetailsScreen_500 getClaimSnapshotLossDetailsScreen_500() {
    return getOrCreateProperty("ClaimSnapshotLossDetailsScreen_500", "ClaimSnapshotLossDetailsScreen", null, pcftest.ClaimSnapshotLossDetailsScreen_500.class);
  }
  
  public ClaimSnapshotLossDetailsScreen_600 getClaimSnapshotLossDetailsScreen_600() {
    return getOrCreateProperty("ClaimSnapshotLossDetailsScreen_600", "ClaimSnapshotLossDetailsScreen", null, pcftest.ClaimSnapshotLossDetailsScreen_600.class);
  }
  
  public ClaimSnapshotLossDetailsScreen_700 getClaimSnapshotLossDetailsScreen_700() {
    return getOrCreateProperty("ClaimSnapshotLossDetailsScreen_700", "ClaimSnapshotLossDetailsScreen", null, pcftest.ClaimSnapshotLossDetailsScreen_700.class);
  }
  
  public ClaimSnapshotLossDetailsScreen_800 getClaimSnapshotLossDetailsScreen_800() {
    return getOrCreateProperty("ClaimSnapshotLossDetailsScreen_800", "ClaimSnapshotLossDetailsScreen", null, pcftest.ClaimSnapshotLossDetailsScreen_800.class);
  }
  
  public ClaimSnapshotLossDetailsScreen_default getClaimSnapshotLossDetailsScreen_default() {
    return getOrCreateProperty("ClaimSnapshotLossDetailsScreen_default", "ClaimSnapshotLossDetailsScreen", null, pcftest.ClaimSnapshotLossDetailsScreen_default.class);
  }
  
  public ClaimSnapshotLossDetails_UpLink getClaimSnapshotLossDetails_UpLink() {
    return getOrCreateProperty("ClaimSnapshotLossDetails_UpLink", "ClaimSnapshotLossDetails_UpLink", null, pcftest.ClaimSnapshotLossDetails.ClaimSnapshotLossDetails_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ClaimSnapshotLossDetails._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ClaimSnapshotLossDetails.__crumb__.class);
  }
  
  public ClaimSnapshotGroup get_parent() {
    return getOrCreateProperty("_parent", pcftest.ClaimSnapshotGroup.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/ClaimSnapshotLossDetails.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotLossDetails_UpLink extends ClickableActionElement {
    public ClaimSnapshotLossDetails_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/ClaimSnapshotLossDetails.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/ClaimSnapshotLossDetails.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}