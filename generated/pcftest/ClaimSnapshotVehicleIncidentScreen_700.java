package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ClaimSnapshotVehicleIncidentScreen_700._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotVehicleIncidentScreen.700.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotVehicleIncidentScreen_700 extends ClaimSnapshotVehicleIncidentScreen {
  public final static String CHECKSUM = "a63be8d6c15fa675639822e14beec994";
  
  public ClaimSnapshotVehicleIncidentScreen_700(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ClaimSnapshotVehicleIncident700DV getClaimSnapshotVehicleIncident700DV() {
    return getOrCreateProperty("ClaimSnapshotVehicleIncident700DV", "ClaimSnapshotVehicleIncident700DV", null, pcftest.ClaimSnapshotVehicleIncident700DV.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ClaimSnapshotVehicleIncidentScreen_700._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotVehicleIncidentScreen.700.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}