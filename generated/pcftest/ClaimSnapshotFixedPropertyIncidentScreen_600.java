package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ClaimSnapshotFixedPropertyIncidentScreen_600._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotFixedPropertyIncidentScreen.600.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotFixedPropertyIncidentScreen_600 extends ClaimSnapshotFixedPropertyIncidentScreen {
  public final static String CHECKSUM = "72f1c8ca7182bf6402e407335af4ad3e";
  
  public ClaimSnapshotFixedPropertyIncidentScreen_600(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ClaimSnapshotFixedPropertyIncident600DV getClaimSnapshotFixedPropertyIncident600DV() {
    return getOrCreateProperty("ClaimSnapshotFixedPropertyIncident600DV", "ClaimSnapshotFixedPropertyIncident600DV", null, pcftest.ClaimSnapshotFixedPropertyIncident600DV.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ClaimSnapshotFixedPropertyIncidentScreen_600._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotFixedPropertyIncidentScreen.600.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}