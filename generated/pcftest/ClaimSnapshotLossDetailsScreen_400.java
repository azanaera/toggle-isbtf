package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ClaimSnapshotLossDetailsScreen_400._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/snapshot/400/ClaimSnapshotLossDetailsScreen.400.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotLossDetailsScreen_400 extends ClaimSnapshotLossDetailsScreen {
  public final static String CHECKSUM = "53fb6a4f78491f6d65e3ce274215e1bd";
  
  public ClaimSnapshotLossDetailsScreen_400(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ClaimSnapshotGeneral400DV_auto getClaimSnapshotGeneral400DV_auto() {
    return getOrCreateProperty("ClaimSnapshotGeneral400DV_auto", "ClaimSnapshotGeneral400DV", null, pcftest.ClaimSnapshotGeneral400DV_auto.class);
  }
  
  public ClaimSnapshotGeneral400DV_gl getClaimSnapshotGeneral400DV_gl() {
    return getOrCreateProperty("ClaimSnapshotGeneral400DV_gl", "ClaimSnapshotGeneral400DV", null, pcftest.ClaimSnapshotGeneral400DV_gl.class);
  }
  
  public ClaimSnapshotGeneral400DV_pr getClaimSnapshotGeneral400DV_pr() {
    return getOrCreateProperty("ClaimSnapshotGeneral400DV_pr", "ClaimSnapshotGeneral400DV", null, pcftest.ClaimSnapshotGeneral400DV_pr.class);
  }
  
  public ClaimSnapshotGeneral400DV_wc getClaimSnapshotGeneral400DV_wc() {
    return getOrCreateProperty("ClaimSnapshotGeneral400DV_wc", "ClaimSnapshotGeneral400DV", null, pcftest.ClaimSnapshotGeneral400DV_wc.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ClaimSnapshotLossDetailsScreen_400._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/400/ClaimSnapshotLossDetailsScreen.400.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}