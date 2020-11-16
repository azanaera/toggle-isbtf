package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ClaimSnapshotLossDetailsScreen_500._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/snapshot/500/ClaimSnapshotLossDetailsScreen.500.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotLossDetailsScreen_500 extends ClaimSnapshotLossDetailsScreen {
  public final static String CHECKSUM = "c335e882c1027287beceb7d53b6e5f06";
  
  public ClaimSnapshotLossDetailsScreen_500(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ClaimSnapshotGeneral500DV_Trav getClaimSnapshotGeneral500DV_Trav() {
    return getOrCreateProperty("ClaimSnapshotGeneral500DV_Trav", "ClaimSnapshotGeneral500DV", null, pcftest.ClaimSnapshotGeneral500DV_Trav.class);
  }
  
  public ClaimSnapshotGeneral500DV_auto getClaimSnapshotGeneral500DV_auto() {
    return getOrCreateProperty("ClaimSnapshotGeneral500DV_auto", "ClaimSnapshotGeneral500DV", null, pcftest.ClaimSnapshotGeneral500DV_auto.class);
  }
  
  public ClaimSnapshotGeneral500DV_gl getClaimSnapshotGeneral500DV_gl() {
    return getOrCreateProperty("ClaimSnapshotGeneral500DV_gl", "ClaimSnapshotGeneral500DV", null, pcftest.ClaimSnapshotGeneral500DV_gl.class);
  }
  
  public ClaimSnapshotGeneral500DV_pr getClaimSnapshotGeneral500DV_pr() {
    return getOrCreateProperty("ClaimSnapshotGeneral500DV_pr", "ClaimSnapshotGeneral500DV", null, pcftest.ClaimSnapshotGeneral500DV_pr.class);
  }
  
  public ClaimSnapshotGeneral500DV_wc getClaimSnapshotGeneral500DV_wc() {
    return getOrCreateProperty("ClaimSnapshotGeneral500DV_wc", "ClaimSnapshotGeneral500DV", null, pcftest.ClaimSnapshotGeneral500DV_wc.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ClaimSnapshotLossDetailsScreen_500._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/500/ClaimSnapshotLossDetailsScreen.500.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}