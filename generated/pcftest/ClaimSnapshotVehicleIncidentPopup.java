package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ClaimSnapshotVehicleIncidentPopup.ClaimSnapshotVehicleIncidentPopup_UpLink;
import pcftest.ClaimSnapshotVehicleIncidentPopup._Paging;
import pcftest.ClaimSnapshotVehicleIncidentPopup.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/snapshot/ClaimSnapshotVehicleIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotVehicleIncidentPopup extends PCFLocation {
  public final static String CHECKSUM = "3396aec8792912b92b21f26deb8b3a43";
  
  public ClaimSnapshotVehicleIncidentPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ClaimSnapshotVehicleIncidentPopup"));
  }
  
  public ClaimSnapshotVehicleIncidentPopup_UpLink getClaimSnapshotVehicleIncidentPopup_UpLink() {
    return getOrCreateProperty("ClaimSnapshotVehicleIncidentPopup_UpLink", "ClaimSnapshotVehicleIncidentPopup_UpLink", null, pcftest.ClaimSnapshotVehicleIncidentPopup.ClaimSnapshotVehicleIncidentPopup_UpLink.class);
  }
  
  public ClaimSnapshotVehicleIncidentScreen_400 getClaimSnapshotVehicleIncidentScreen_400() {
    return getOrCreateProperty("ClaimSnapshotVehicleIncidentScreen_400", "ClaimSnapshotVehicleIncidentScreen", null, pcftest.ClaimSnapshotVehicleIncidentScreen_400.class);
  }
  
  public ClaimSnapshotVehicleIncidentScreen_500 getClaimSnapshotVehicleIncidentScreen_500() {
    return getOrCreateProperty("ClaimSnapshotVehicleIncidentScreen_500", "ClaimSnapshotVehicleIncidentScreen", null, pcftest.ClaimSnapshotVehicleIncidentScreen_500.class);
  }
  
  public ClaimSnapshotVehicleIncidentScreen_600 getClaimSnapshotVehicleIncidentScreen_600() {
    return getOrCreateProperty("ClaimSnapshotVehicleIncidentScreen_600", "ClaimSnapshotVehicleIncidentScreen", null, pcftest.ClaimSnapshotVehicleIncidentScreen_600.class);
  }
  
  public ClaimSnapshotVehicleIncidentScreen_700 getClaimSnapshotVehicleIncidentScreen_700() {
    return getOrCreateProperty("ClaimSnapshotVehicleIncidentScreen_700", "ClaimSnapshotVehicleIncidentScreen", null, pcftest.ClaimSnapshotVehicleIncidentScreen_700.class);
  }
  
  public ClaimSnapshotVehicleIncidentScreen_800 getClaimSnapshotVehicleIncidentScreen_800() {
    return getOrCreateProperty("ClaimSnapshotVehicleIncidentScreen_800", "ClaimSnapshotVehicleIncidentScreen", null, pcftest.ClaimSnapshotVehicleIncidentScreen_800.class);
  }
  
  public ClaimSnapshotVehicleIncidentScreen_default getClaimSnapshotVehicleIncidentScreen_default() {
    return getOrCreateProperty("ClaimSnapshotVehicleIncidentScreen_default", "ClaimSnapshotVehicleIncidentScreen", null, pcftest.ClaimSnapshotVehicleIncidentScreen_default.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ClaimSnapshotVehicleIncidentPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ClaimSnapshotVehicleIncidentPopup.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/ClaimSnapshotVehicleIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotVehicleIncidentPopup_UpLink extends ClickableActionElement {
    public ClaimSnapshotVehicleIncidentPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/ClaimSnapshotVehicleIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/ClaimSnapshotVehicleIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}