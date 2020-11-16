package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ClaimSnapshotBaggageIncidentPopup.ClaimSnapshotBaggageIncidentPopup_UpLink;
import pcftest.ClaimSnapshotBaggageIncidentPopup._Paging;
import pcftest.ClaimSnapshotBaggageIncidentPopup.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/snapshot/ClaimSnapshotBaggageIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotBaggageIncidentPopup extends PCFLocation {
  public final static String CHECKSUM = "49761dc5cff73218781184340c049daa";
  
  public ClaimSnapshotBaggageIncidentPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ClaimSnapshotBaggageIncidentPopup"));
  }
  
  public ClaimSnapshotBaggageIncidentPopup_UpLink getClaimSnapshotBaggageIncidentPopup_UpLink() {
    return getOrCreateProperty("ClaimSnapshotBaggageIncidentPopup_UpLink", "ClaimSnapshotBaggageIncidentPopup_UpLink", null, pcftest.ClaimSnapshotBaggageIncidentPopup.ClaimSnapshotBaggageIncidentPopup_UpLink.class);
  }
  
  public ClaimSnapshotBaggageIncidentScreen_500 getClaimSnapshotBaggageIncidentScreen_500() {
    return getOrCreateProperty("ClaimSnapshotBaggageIncidentScreen_500", "ClaimSnapshotBaggageIncidentScreen", null, pcftest.ClaimSnapshotBaggageIncidentScreen_500.class);
  }
  
  public ClaimSnapshotBaggageIncidentScreen_600 getClaimSnapshotBaggageIncidentScreen_600() {
    return getOrCreateProperty("ClaimSnapshotBaggageIncidentScreen_600", "ClaimSnapshotBaggageIncidentScreen", null, pcftest.ClaimSnapshotBaggageIncidentScreen_600.class);
  }
  
  public ClaimSnapshotBaggageIncidentScreen_700 getClaimSnapshotBaggageIncidentScreen_700() {
    return getOrCreateProperty("ClaimSnapshotBaggageIncidentScreen_700", "ClaimSnapshotBaggageIncidentScreen", null, pcftest.ClaimSnapshotBaggageIncidentScreen_700.class);
  }
  
  public ClaimSnapshotBaggageIncidentScreen_800 getClaimSnapshotBaggageIncidentScreen_800() {
    return getOrCreateProperty("ClaimSnapshotBaggageIncidentScreen_800", "ClaimSnapshotBaggageIncidentScreen", null, pcftest.ClaimSnapshotBaggageIncidentScreen_800.class);
  }
  
  public ClaimSnapshotBaggageIncidentScreen_default getClaimSnapshotBaggageIncidentScreen_default() {
    return getOrCreateProperty("ClaimSnapshotBaggageIncidentScreen_default", "ClaimSnapshotBaggageIncidentScreen", null, pcftest.ClaimSnapshotBaggageIncidentScreen_default.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ClaimSnapshotBaggageIncidentPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ClaimSnapshotBaggageIncidentPopup.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/ClaimSnapshotBaggageIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotBaggageIncidentPopup_UpLink extends ClickableActionElement {
    public ClaimSnapshotBaggageIncidentPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/ClaimSnapshotBaggageIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/ClaimSnapshotBaggageIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}