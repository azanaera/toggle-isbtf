package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ClaimSnapshotVehicleIncidentScreen_500._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/snapshot/500/ClaimSnapshotVehicleIncidentScreen.500.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotVehicleIncidentScreen_500 extends ClaimSnapshotVehicleIncidentScreen {
  public final static String CHECKSUM = "2929722b57af6d2939a0581fba6c3b67";
  
  public ClaimSnapshotVehicleIncidentScreen_500(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ClaimSnapshotVehicleIncident500DV getClaimSnapshotVehicleIncident500DV() {
    return getOrCreateProperty("ClaimSnapshotVehicleIncident500DV", "ClaimSnapshotVehicleIncident500DV", null, pcftest.ClaimSnapshotVehicleIncident500DV.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ClaimSnapshotVehicleIncidentScreen_500._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/500/ClaimSnapshotVehicleIncidentScreen.500.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}