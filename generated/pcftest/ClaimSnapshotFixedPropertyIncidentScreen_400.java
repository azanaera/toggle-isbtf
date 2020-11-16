package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ClaimSnapshotFixedPropertyIncidentScreen_400._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/snapshot/400/ClaimSnapshotFixedPropertyIncidentScreen.400.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotFixedPropertyIncidentScreen_400 extends ClaimSnapshotFixedPropertyIncidentScreen {
  public final static String CHECKSUM = "dcf22ecaa1300347bb4fa3e8c42200f6";
  
  public ClaimSnapshotFixedPropertyIncidentScreen_400(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ClaimSnapshotFixedPropertyIncident400DV getClaimSnapshotFixedPropertyIncident400DV() {
    return getOrCreateProperty("ClaimSnapshotFixedPropertyIncident400DV", "ClaimSnapshotFixedPropertyIncident400DV", null, pcftest.ClaimSnapshotFixedPropertyIncident400DV.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ClaimSnapshotFixedPropertyIncidentScreen_400._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/400/ClaimSnapshotFixedPropertyIncidentScreen.400.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}