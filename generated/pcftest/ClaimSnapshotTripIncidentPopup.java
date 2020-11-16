package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ClaimSnapshotTripIncidentPopup.ClaimSnapshotTripIncidentPopup_UpLink;
import pcftest.ClaimSnapshotTripIncidentPopup._Paging;
import pcftest.ClaimSnapshotTripIncidentPopup.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/snapshot/ClaimSnapshotTripIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotTripIncidentPopup extends PCFLocation {
  public final static String CHECKSUM = "04179907a2e6406be86a1a38ff5618e2";
  
  public ClaimSnapshotTripIncidentPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ClaimSnapshotTripIncidentPopup"));
  }
  
  public ClaimSnapshotTripIncidentPopup_UpLink getClaimSnapshotTripIncidentPopup_UpLink() {
    return getOrCreateProperty("ClaimSnapshotTripIncidentPopup_UpLink", "ClaimSnapshotTripIncidentPopup_UpLink", null, pcftest.ClaimSnapshotTripIncidentPopup.ClaimSnapshotTripIncidentPopup_UpLink.class);
  }
  
  public ClaimSnapshotTripIncidentScreen_600 getClaimSnapshotTripIncidentScreen_600() {
    return getOrCreateProperty("ClaimSnapshotTripIncidentScreen_600", "ClaimSnapshotTripIncidentScreen", null, pcftest.ClaimSnapshotTripIncidentScreen_600.class);
  }
  
  public ClaimSnapshotTripIncidentScreen_700 getClaimSnapshotTripIncidentScreen_700() {
    return getOrCreateProperty("ClaimSnapshotTripIncidentScreen_700", "ClaimSnapshotTripIncidentScreen", null, pcftest.ClaimSnapshotTripIncidentScreen_700.class);
  }
  
  public ClaimSnapshotTripIncidentScreen_800 getClaimSnapshotTripIncidentScreen_800() {
    return getOrCreateProperty("ClaimSnapshotTripIncidentScreen_800", "ClaimSnapshotTripIncidentScreen", null, pcftest.ClaimSnapshotTripIncidentScreen_800.class);
  }
  
  public ClaimSnapshotTripIncidentScreen_default getClaimSnapshotTripIncidentScreen_default() {
    return getOrCreateProperty("ClaimSnapshotTripIncidentScreen_default", "ClaimSnapshotTripIncidentScreen", null, pcftest.ClaimSnapshotTripIncidentScreen_default.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ClaimSnapshotTripIncidentPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ClaimSnapshotTripIncidentPopup.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/ClaimSnapshotTripIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotTripIncidentPopup_UpLink extends ClickableActionElement {
    public ClaimSnapshotTripIncidentPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/ClaimSnapshotTripIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/ClaimSnapshotTripIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}