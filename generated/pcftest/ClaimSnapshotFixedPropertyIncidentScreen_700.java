package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ClaimSnapshotFixedPropertyIncidentScreen_700._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotFixedPropertyIncidentScreen.700.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotFixedPropertyIncidentScreen_700 extends ClaimSnapshotFixedPropertyIncidentScreen {
  public final static String CHECKSUM = "f0c6087cdd3d5f4a6f1650167849fded";
  
  public ClaimSnapshotFixedPropertyIncidentScreen_700(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ClaimSnapshotFixedPropertyIncident700DV getClaimSnapshotFixedPropertyIncident700DV() {
    return getOrCreateProperty("ClaimSnapshotFixedPropertyIncident700DV", "ClaimSnapshotFixedPropertyIncident700DV", null, pcftest.ClaimSnapshotFixedPropertyIncident700DV.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ClaimSnapshotFixedPropertyIncidentScreen_700._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotFixedPropertyIncidentScreen.700.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}