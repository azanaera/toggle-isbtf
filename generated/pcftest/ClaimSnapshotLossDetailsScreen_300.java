package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ClaimSnapshotLossDetailsScreen_300._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/snapshot/300/ClaimSnapshotLossDetailsScreen.300.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotLossDetailsScreen_300 extends ClaimSnapshotLossDetailsScreen {
  public final static String CHECKSUM = "b78060f68739fc9699c1fafb107970a6";
  
  public ClaimSnapshotLossDetailsScreen_300(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ClaimSnapshotGeneral300DV_auto getClaimSnapshotGeneral300DV_auto() {
    return getOrCreateProperty("ClaimSnapshotGeneral300DV_auto", "ClaimSnapshotGeneral300DV", null, pcftest.ClaimSnapshotGeneral300DV_auto.class);
  }
  
  public ClaimSnapshotGeneral300DV_gl getClaimSnapshotGeneral300DV_gl() {
    return getOrCreateProperty("ClaimSnapshotGeneral300DV_gl", "ClaimSnapshotGeneral300DV", null, pcftest.ClaimSnapshotGeneral300DV_gl.class);
  }
  
  public ClaimSnapshotGeneral300DV_pr getClaimSnapshotGeneral300DV_pr() {
    return getOrCreateProperty("ClaimSnapshotGeneral300DV_pr", "ClaimSnapshotGeneral300DV", null, pcftest.ClaimSnapshotGeneral300DV_pr.class);
  }
  
  public ClaimSnapshotGeneral300DV_wc getClaimSnapshotGeneral300DV_wc() {
    return getOrCreateProperty("ClaimSnapshotGeneral300DV_wc", "ClaimSnapshotGeneral300DV", null, pcftest.ClaimSnapshotGeneral300DV_wc.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ClaimSnapshotLossDetailsScreen_300._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/300/ClaimSnapshotLossDetailsScreen.300.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}