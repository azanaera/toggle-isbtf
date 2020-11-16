package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ClaimSnapshotLossDetailsScreen_310._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/snapshot/310/ClaimSnapshotLossDetailsScreen.310.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotLossDetailsScreen_310 extends ClaimSnapshotLossDetailsScreen {
  public final static String CHECKSUM = "7ee63eaa5d836965d8679a60dad82a4b";
  
  public ClaimSnapshotLossDetailsScreen_310(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ClaimSnapshotGeneral310DV_auto getClaimSnapshotGeneral310DV_auto() {
    return getOrCreateProperty("ClaimSnapshotGeneral310DV_auto", "ClaimSnapshotGeneral310DV", null, pcftest.ClaimSnapshotGeneral310DV_auto.class);
  }
  
  public ClaimSnapshotGeneral310DV_gl getClaimSnapshotGeneral310DV_gl() {
    return getOrCreateProperty("ClaimSnapshotGeneral310DV_gl", "ClaimSnapshotGeneral310DV", null, pcftest.ClaimSnapshotGeneral310DV_gl.class);
  }
  
  public ClaimSnapshotGeneral310DV_pr getClaimSnapshotGeneral310DV_pr() {
    return getOrCreateProperty("ClaimSnapshotGeneral310DV_pr", "ClaimSnapshotGeneral310DV", null, pcftest.ClaimSnapshotGeneral310DV_pr.class);
  }
  
  public ClaimSnapshotGeneral310DV_wc getClaimSnapshotGeneral310DV_wc() {
    return getOrCreateProperty("ClaimSnapshotGeneral310DV_wc", "ClaimSnapshotGeneral310DV", null, pcftest.ClaimSnapshotGeneral310DV_wc.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ClaimSnapshotLossDetailsScreen_310._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/310/ClaimSnapshotLossDetailsScreen.310.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}