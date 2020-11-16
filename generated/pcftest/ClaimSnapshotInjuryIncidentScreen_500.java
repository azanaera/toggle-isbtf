package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ClaimSnapshotInjuryIncidentScreen_500._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/snapshot/500/ClaimSnapshotInjuryIncidentScreen.500.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotInjuryIncidentScreen_500 extends ClaimSnapshotInjuryIncidentScreen {
  public final static String CHECKSUM = "c0355b2395b26c850f7641f8f7c9529e";
  
  public ClaimSnapshotInjuryIncidentScreen_500(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ClaimSnapshotInjuryIncident500DV getClaimSnapshotInjuryIncident500DV() {
    return getOrCreateProperty("ClaimSnapshotInjuryIncident500DV", "ClaimSnapshotInjuryIncident500DV", null, pcftest.ClaimSnapshotInjuryIncident500DV.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ClaimSnapshotInjuryIncidentScreen_500._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/500/ClaimSnapshotInjuryIncidentScreen.500.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}