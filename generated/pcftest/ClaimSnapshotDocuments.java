package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ClaimSnapshotDocuments.ClaimSnapshotDocuments_UpLink;
import pcftest.ClaimSnapshotDocuments._Paging;
import pcftest.ClaimSnapshotDocuments.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/snapshot/ClaimSnapshotDocuments.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotDocuments extends PCFLocation {
  public final static String CHECKSUM = "46f8ad3e3961b40b474cf1b95fd69d1e";
  
  public ClaimSnapshotDocuments(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ClaimSnapshotDocuments"));
  }
  
  public ClaimSnapshotDocumentsScreen_300 getClaimSnapshotDocumentsScreen_300() {
    return getOrCreateProperty("ClaimSnapshotDocumentsScreen_300", "ClaimSnapshotDocumentsScreen", null, pcftest.ClaimSnapshotDocumentsScreen_300.class);
  }
  
  public ClaimSnapshotDocumentsScreen_310 getClaimSnapshotDocumentsScreen_310() {
    return getOrCreateProperty("ClaimSnapshotDocumentsScreen_310", "ClaimSnapshotDocumentsScreen", null, pcftest.ClaimSnapshotDocumentsScreen_310.class);
  }
  
  public ClaimSnapshotDocumentsScreen_400 getClaimSnapshotDocumentsScreen_400() {
    return getOrCreateProperty("ClaimSnapshotDocumentsScreen_400", "ClaimSnapshotDocumentsScreen", null, pcftest.ClaimSnapshotDocumentsScreen_400.class);
  }
  
  public ClaimSnapshotDocumentsScreen_500 getClaimSnapshotDocumentsScreen_500() {
    return getOrCreateProperty("ClaimSnapshotDocumentsScreen_500", "ClaimSnapshotDocumentsScreen", null, pcftest.ClaimSnapshotDocumentsScreen_500.class);
  }
  
  public ClaimSnapshotDocumentsScreen_600 getClaimSnapshotDocumentsScreen_600() {
    return getOrCreateProperty("ClaimSnapshotDocumentsScreen_600", "ClaimSnapshotDocumentsScreen", null, pcftest.ClaimSnapshotDocumentsScreen_600.class);
  }
  
  public ClaimSnapshotDocumentsScreen_700 getClaimSnapshotDocumentsScreen_700() {
    return getOrCreateProperty("ClaimSnapshotDocumentsScreen_700", "ClaimSnapshotDocumentsScreen", null, pcftest.ClaimSnapshotDocumentsScreen_700.class);
  }
  
  public ClaimSnapshotDocumentsScreen_800 getClaimSnapshotDocumentsScreen_800() {
    return getOrCreateProperty("ClaimSnapshotDocumentsScreen_800", "ClaimSnapshotDocumentsScreen", null, pcftest.ClaimSnapshotDocumentsScreen_800.class);
  }
  
  public ClaimSnapshotDocumentsScreen_default getClaimSnapshotDocumentsScreen_default() {
    return getOrCreateProperty("ClaimSnapshotDocumentsScreen_default", "ClaimSnapshotDocumentsScreen", null, pcftest.ClaimSnapshotDocumentsScreen_default.class);
  }
  
  public ClaimSnapshotDocuments_UpLink getClaimSnapshotDocuments_UpLink() {
    return getOrCreateProperty("ClaimSnapshotDocuments_UpLink", "ClaimSnapshotDocuments_UpLink", null, pcftest.ClaimSnapshotDocuments.ClaimSnapshotDocuments_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ClaimSnapshotDocuments._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ClaimSnapshotDocuments.__crumb__.class);
  }
  
  public ClaimSnapshotGroup get_parent() {
    return getOrCreateProperty("_parent", pcftest.ClaimSnapshotGroup.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/ClaimSnapshotDocuments.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotDocuments_UpLink extends ClickableActionElement {
    public ClaimSnapshotDocuments_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/ClaimSnapshotDocuments.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/ClaimSnapshotDocuments.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}