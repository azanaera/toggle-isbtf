package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ClaimSnapshotInjuryIncidentScreen_800._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotInjuryIncidentScreen.800.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotInjuryIncidentScreen_800 extends ClaimSnapshotInjuryIncidentScreen {
  public final static String CHECKSUM = "ce4209b2da2d9aa77d6dd276700bb13c";
  
  public ClaimSnapshotInjuryIncidentScreen_800(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ClaimSnapshotInjuryIncident800DV getClaimSnapshotInjuryIncident800DV() {
    return getOrCreateProperty("ClaimSnapshotInjuryIncident800DV", "ClaimSnapshotInjuryIncident800DV", null, pcftest.ClaimSnapshotInjuryIncident800DV.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ClaimSnapshotInjuryIncidentScreen_800._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotInjuryIncidentScreen.800.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}