package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ClaimSnapshotFixedPropertyIncidentScreen_800._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotFixedPropertyIncidentScreen.800.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotFixedPropertyIncidentScreen_800 extends ClaimSnapshotFixedPropertyIncidentScreen {
  public final static String CHECKSUM = "b378242b2f8372e3e27bd240ee30bcf0";
  
  public ClaimSnapshotFixedPropertyIncidentScreen_800(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ClaimSnapshotFixedPropertyIncident800DV getClaimSnapshotFixedPropertyIncident800DV() {
    return getOrCreateProperty("ClaimSnapshotFixedPropertyIncident800DV", "ClaimSnapshotFixedPropertyIncident800DV", null, pcftest.ClaimSnapshotFixedPropertyIncident800DV.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ClaimSnapshotFixedPropertyIncidentScreen_800._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotFixedPropertyIncidentScreen.800.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}