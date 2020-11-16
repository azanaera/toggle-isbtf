package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ClaimSnapshotFixedPropertyIncidentPopup.ClaimSnapshotFixedPropertyIncidentPopup_UpLink;
import pcftest.ClaimSnapshotFixedPropertyIncidentPopup._Paging;
import pcftest.ClaimSnapshotFixedPropertyIncidentPopup.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/snapshot/ClaimSnapshotFixedPropertyIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotFixedPropertyIncidentPopup extends PCFLocation {
  public final static String CHECKSUM = "d9d7e4169d595f3a92ad0190a8084a47";
  
  public ClaimSnapshotFixedPropertyIncidentPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ClaimSnapshotFixedPropertyIncidentPopup"));
  }
  
  public ClaimSnapshotFixedPropertyIncidentPopup_UpLink getClaimSnapshotFixedPropertyIncidentPopup_UpLink() {
    return getOrCreateProperty("ClaimSnapshotFixedPropertyIncidentPopup_UpLink", "ClaimSnapshotFixedPropertyIncidentPopup_UpLink", null, pcftest.ClaimSnapshotFixedPropertyIncidentPopup.ClaimSnapshotFixedPropertyIncidentPopup_UpLink.class);
  }
  
  public ClaimSnapshotFixedPropertyIncidentScreen_400 getClaimSnapshotFixedPropertyIncidentScreen_400() {
    return getOrCreateProperty("ClaimSnapshotFixedPropertyIncidentScreen_400", "ClaimSnapshotFixedPropertyIncidentScreen", null, pcftest.ClaimSnapshotFixedPropertyIncidentScreen_400.class);
  }
  
  public ClaimSnapshotFixedPropertyIncidentScreen_500 getClaimSnapshotFixedPropertyIncidentScreen_500() {
    return getOrCreateProperty("ClaimSnapshotFixedPropertyIncidentScreen_500", "ClaimSnapshotFixedPropertyIncidentScreen", null, pcftest.ClaimSnapshotFixedPropertyIncidentScreen_500.class);
  }
  
  public ClaimSnapshotFixedPropertyIncidentScreen_600 getClaimSnapshotFixedPropertyIncidentScreen_600() {
    return getOrCreateProperty("ClaimSnapshotFixedPropertyIncidentScreen_600", "ClaimSnapshotFixedPropertyIncidentScreen", null, pcftest.ClaimSnapshotFixedPropertyIncidentScreen_600.class);
  }
  
  public ClaimSnapshotFixedPropertyIncidentScreen_700 getClaimSnapshotFixedPropertyIncidentScreen_700() {
    return getOrCreateProperty("ClaimSnapshotFixedPropertyIncidentScreen_700", "ClaimSnapshotFixedPropertyIncidentScreen", null, pcftest.ClaimSnapshotFixedPropertyIncidentScreen_700.class);
  }
  
  public ClaimSnapshotFixedPropertyIncidentScreen_800 getClaimSnapshotFixedPropertyIncidentScreen_800() {
    return getOrCreateProperty("ClaimSnapshotFixedPropertyIncidentScreen_800", "ClaimSnapshotFixedPropertyIncidentScreen", null, pcftest.ClaimSnapshotFixedPropertyIncidentScreen_800.class);
  }
  
  public ClaimSnapshotFixedPropertyIncidentScreen_default getClaimSnapshotFixedPropertyIncidentScreen_default() {
    return getOrCreateProperty("ClaimSnapshotFixedPropertyIncidentScreen_default", "ClaimSnapshotFixedPropertyIncidentScreen", null, pcftest.ClaimSnapshotFixedPropertyIncidentScreen_default.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ClaimSnapshotFixedPropertyIncidentPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ClaimSnapshotFixedPropertyIncidentPopup.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/ClaimSnapshotFixedPropertyIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotFixedPropertyIncidentPopup_UpLink extends ClickableActionElement {
    public ClaimSnapshotFixedPropertyIncidentPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/ClaimSnapshotFixedPropertyIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/ClaimSnapshotFixedPropertyIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}