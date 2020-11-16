package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ClaimSnapshotVehicleIncidentScreen_400._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/snapshot/400/ClaimSnapshotVehicleIncidentScreen.400.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotVehicleIncidentScreen_400 extends ClaimSnapshotVehicleIncidentScreen {
  public final static String CHECKSUM = "ab79a11ea03ce021a47bd5a791961165";
  
  public ClaimSnapshotVehicleIncidentScreen_400(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ClaimSnapshotVehicleIncident400DV getClaimSnapshotVehicleIncident400DV() {
    return getOrCreateProperty("ClaimSnapshotVehicleIncident400DV", "ClaimSnapshotVehicleIncident400DV", null, pcftest.ClaimSnapshotVehicleIncident400DV.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ClaimSnapshotVehicleIncidentScreen_400._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/400/ClaimSnapshotVehicleIncidentScreen.400.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}