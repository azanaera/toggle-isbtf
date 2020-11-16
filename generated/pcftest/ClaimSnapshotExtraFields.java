package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ClaimSnapshotExtraFields.ClaimSnapshotExtraFields_UpLink;
import pcftest.ClaimSnapshotExtraFields._Paging;
import pcftest.ClaimSnapshotExtraFields.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/snapshot/ClaimSnapshotExtraFields.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotExtraFields extends PCFLocation {
  public final static String CHECKSUM = "3082237bf458d35c26c9fbdd7fe3a529";
  
  public ClaimSnapshotExtraFields(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ClaimSnapshotExtraFields"));
  }
  
  public ClaimSnapshotExtraFieldsScreen_300 getClaimSnapshotExtraFieldsScreen_300() {
    return getOrCreateProperty("ClaimSnapshotExtraFieldsScreen_300", "ClaimSnapshotExtraFieldsScreen", null, pcftest.ClaimSnapshotExtraFieldsScreen_300.class);
  }
  
  public ClaimSnapshotExtraFieldsScreen_310 getClaimSnapshotExtraFieldsScreen_310() {
    return getOrCreateProperty("ClaimSnapshotExtraFieldsScreen_310", "ClaimSnapshotExtraFieldsScreen", null, pcftest.ClaimSnapshotExtraFieldsScreen_310.class);
  }
  
  public ClaimSnapshotExtraFieldsScreen_400 getClaimSnapshotExtraFieldsScreen_400() {
    return getOrCreateProperty("ClaimSnapshotExtraFieldsScreen_400", "ClaimSnapshotExtraFieldsScreen", null, pcftest.ClaimSnapshotExtraFieldsScreen_400.class);
  }
  
  public ClaimSnapshotExtraFieldsScreen_500 getClaimSnapshotExtraFieldsScreen_500() {
    return getOrCreateProperty("ClaimSnapshotExtraFieldsScreen_500", "ClaimSnapshotExtraFieldsScreen", null, pcftest.ClaimSnapshotExtraFieldsScreen_500.class);
  }
  
  public ClaimSnapshotExtraFieldsScreen_600 getClaimSnapshotExtraFieldsScreen_600() {
    return getOrCreateProperty("ClaimSnapshotExtraFieldsScreen_600", "ClaimSnapshotExtraFieldsScreen", null, pcftest.ClaimSnapshotExtraFieldsScreen_600.class);
  }
  
  public ClaimSnapshotExtraFieldsScreen_700 getClaimSnapshotExtraFieldsScreen_700() {
    return getOrCreateProperty("ClaimSnapshotExtraFieldsScreen_700", "ClaimSnapshotExtraFieldsScreen", null, pcftest.ClaimSnapshotExtraFieldsScreen_700.class);
  }
  
  public ClaimSnapshotExtraFieldsScreen_800 getClaimSnapshotExtraFieldsScreen_800() {
    return getOrCreateProperty("ClaimSnapshotExtraFieldsScreen_800", "ClaimSnapshotExtraFieldsScreen", null, pcftest.ClaimSnapshotExtraFieldsScreen_800.class);
  }
  
  public ClaimSnapshotExtraFieldsScreen_default getClaimSnapshotExtraFieldsScreen_default() {
    return getOrCreateProperty("ClaimSnapshotExtraFieldsScreen_default", "ClaimSnapshotExtraFieldsScreen", null, pcftest.ClaimSnapshotExtraFieldsScreen_default.class);
  }
  
  public ClaimSnapshotExtraFields_UpLink getClaimSnapshotExtraFields_UpLink() {
    return getOrCreateProperty("ClaimSnapshotExtraFields_UpLink", "ClaimSnapshotExtraFields_UpLink", null, pcftest.ClaimSnapshotExtraFields.ClaimSnapshotExtraFields_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ClaimSnapshotExtraFields._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ClaimSnapshotExtraFields.__crumb__.class);
  }
  
  public ClaimSnapshotGroup get_parent() {
    return getOrCreateProperty("_parent", pcftest.ClaimSnapshotGroup.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/ClaimSnapshotExtraFields.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotExtraFields_UpLink extends ClickableActionElement {
    public ClaimSnapshotExtraFields_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/ClaimSnapshotExtraFields.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/ClaimSnapshotExtraFields.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}