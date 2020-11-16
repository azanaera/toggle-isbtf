package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ClaimSnapshotExposures.ClaimSnapshotExposures_UpLink;
import pcftest.ClaimSnapshotExposures._Paging;
import pcftest.ClaimSnapshotExposures.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/snapshot/ClaimSnapshotExposures.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotExposures extends PCFLocation {
  public final static String CHECKSUM = "3507b728ebeed110eb4528659b2213c5";
  
  public ClaimSnapshotExposures(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ClaimSnapshotExposures"));
  }
  
  public ClaimSnapshotExposuresScreen_300 getClaimSnapshotExposuresScreen_300() {
    return getOrCreateProperty("ClaimSnapshotExposuresScreen_300", "ClaimSnapshotExposuresScreen", null, pcftest.ClaimSnapshotExposuresScreen_300.class);
  }
  
  public ClaimSnapshotExposuresScreen_310 getClaimSnapshotExposuresScreen_310() {
    return getOrCreateProperty("ClaimSnapshotExposuresScreen_310", "ClaimSnapshotExposuresScreen", null, pcftest.ClaimSnapshotExposuresScreen_310.class);
  }
  
  public ClaimSnapshotExposuresScreen_400 getClaimSnapshotExposuresScreen_400() {
    return getOrCreateProperty("ClaimSnapshotExposuresScreen_400", "ClaimSnapshotExposuresScreen", null, pcftest.ClaimSnapshotExposuresScreen_400.class);
  }
  
  public ClaimSnapshotExposuresScreen_500 getClaimSnapshotExposuresScreen_500() {
    return getOrCreateProperty("ClaimSnapshotExposuresScreen_500", "ClaimSnapshotExposuresScreen", null, pcftest.ClaimSnapshotExposuresScreen_500.class);
  }
  
  public ClaimSnapshotExposuresScreen_600 getClaimSnapshotExposuresScreen_600() {
    return getOrCreateProperty("ClaimSnapshotExposuresScreen_600", "ClaimSnapshotExposuresScreen", null, pcftest.ClaimSnapshotExposuresScreen_600.class);
  }
  
  public ClaimSnapshotExposuresScreen_700 getClaimSnapshotExposuresScreen_700() {
    return getOrCreateProperty("ClaimSnapshotExposuresScreen_700", "ClaimSnapshotExposuresScreen", null, pcftest.ClaimSnapshotExposuresScreen_700.class);
  }
  
  public ClaimSnapshotExposuresScreen_800 getClaimSnapshotExposuresScreen_800() {
    return getOrCreateProperty("ClaimSnapshotExposuresScreen_800", "ClaimSnapshotExposuresScreen", null, pcftest.ClaimSnapshotExposuresScreen_800.class);
  }
  
  public ClaimSnapshotExposuresScreen_default getClaimSnapshotExposuresScreen_default() {
    return getOrCreateProperty("ClaimSnapshotExposuresScreen_default", "ClaimSnapshotExposuresScreen", null, pcftest.ClaimSnapshotExposuresScreen_default.class);
  }
  
  public ClaimSnapshotExposures_UpLink getClaimSnapshotExposures_UpLink() {
    return getOrCreateProperty("ClaimSnapshotExposures_UpLink", "ClaimSnapshotExposures_UpLink", null, pcftest.ClaimSnapshotExposures.ClaimSnapshotExposures_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ClaimSnapshotExposures._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ClaimSnapshotExposures.__crumb__.class);
  }
  
  public ClaimSnapshotGroup get_parent() {
    return getOrCreateProperty("_parent", pcftest.ClaimSnapshotGroup.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/ClaimSnapshotExposures.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotExposures_UpLink extends ClickableActionElement {
    public ClaimSnapshotExposures_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/ClaimSnapshotExposures.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/ClaimSnapshotExposures.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}