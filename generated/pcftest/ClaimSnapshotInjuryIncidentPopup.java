package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ClaimSnapshotInjuryIncidentPopup.ClaimSnapshotInjuryIncidentPopup_UpLink;
import pcftest.ClaimSnapshotInjuryIncidentPopup._Paging;
import pcftest.ClaimSnapshotInjuryIncidentPopup.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/snapshot/ClaimSnapshotInjuryIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotInjuryIncidentPopup extends PCFLocation {
  public final static String CHECKSUM = "722597a85794bed3393c99b7ce23c3f3";
  
  public ClaimSnapshotInjuryIncidentPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ClaimSnapshotInjuryIncidentPopup"));
  }
  
  public ClaimSnapshotInjuryIncidentPopup_UpLink getClaimSnapshotInjuryIncidentPopup_UpLink() {
    return getOrCreateProperty("ClaimSnapshotInjuryIncidentPopup_UpLink", "ClaimSnapshotInjuryIncidentPopup_UpLink", null, pcftest.ClaimSnapshotInjuryIncidentPopup.ClaimSnapshotInjuryIncidentPopup_UpLink.class);
  }
  
  public ClaimSnapshotInjuryIncidentScreen_500 getClaimSnapshotInjuryIncidentScreen_500() {
    return getOrCreateProperty("ClaimSnapshotInjuryIncidentScreen_500", "ClaimSnapshotInjuryIncidentScreen", null, pcftest.ClaimSnapshotInjuryIncidentScreen_500.class);
  }
  
  public ClaimSnapshotInjuryIncidentScreen_600 getClaimSnapshotInjuryIncidentScreen_600() {
    return getOrCreateProperty("ClaimSnapshotInjuryIncidentScreen_600", "ClaimSnapshotInjuryIncidentScreen", null, pcftest.ClaimSnapshotInjuryIncidentScreen_600.class);
  }
  
  public ClaimSnapshotInjuryIncidentScreen_700 getClaimSnapshotInjuryIncidentScreen_700() {
    return getOrCreateProperty("ClaimSnapshotInjuryIncidentScreen_700", "ClaimSnapshotInjuryIncidentScreen", null, pcftest.ClaimSnapshotInjuryIncidentScreen_700.class);
  }
  
  public ClaimSnapshotInjuryIncidentScreen_800 getClaimSnapshotInjuryIncidentScreen_800() {
    return getOrCreateProperty("ClaimSnapshotInjuryIncidentScreen_800", "ClaimSnapshotInjuryIncidentScreen", null, pcftest.ClaimSnapshotInjuryIncidentScreen_800.class);
  }
  
  public ClaimSnapshotInjuryIncidentScreen_default getClaimSnapshotInjuryIncidentScreen_default() {
    return getOrCreateProperty("ClaimSnapshotInjuryIncidentScreen_default", "ClaimSnapshotInjuryIncidentScreen", null, pcftest.ClaimSnapshotInjuryIncidentScreen_default.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ClaimSnapshotInjuryIncidentPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ClaimSnapshotInjuryIncidentPopup.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/ClaimSnapshotInjuryIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotInjuryIncidentPopup_UpLink extends ClickableActionElement {
    public ClaimSnapshotInjuryIncidentPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/ClaimSnapshotInjuryIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/ClaimSnapshotInjuryIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}