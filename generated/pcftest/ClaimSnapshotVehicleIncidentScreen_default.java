package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ClaimSnapshotVehicleIncidentScreen_default._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotVehicleIncidentScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotVehicleIncidentScreen_default extends ClaimSnapshotVehicleIncidentScreen {
  public final static String CHECKSUM = "0d14dc5b5f73fe91df67d9c853af6c09";
  
  public ClaimSnapshotVehicleIncidentScreen_default(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ClaimSnapshotVehicleIncidentDV getClaimSnapshotVehicleIncidentDV() {
    return getOrCreateProperty("ClaimSnapshotVehicleIncidentDV", "ClaimSnapshotVehicleIncidentDV", null, pcftest.ClaimSnapshotVehicleIncidentDV.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ClaimSnapshotVehicleIncidentScreen_default._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotVehicleIncidentScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}