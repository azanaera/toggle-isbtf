package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ClaimSnapshotLossDetailsScreen_700._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotLossDetailsScreen.700.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotLossDetailsScreen_700 extends ClaimSnapshotLossDetailsScreen {
  public final static String CHECKSUM = "c194a0651c948f0d1079812ded2d1e3e";
  
  public ClaimSnapshotLossDetailsScreen_700(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ClaimSnapshotGeneral700PanelSet_Pr getClaimSnapshotGeneral700PanelSet_Pr() {
    return getOrCreateProperty("ClaimSnapshotGeneral700PanelSet_Pr", "ClaimSnapshotGeneral700PanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.ClaimSnapshotGeneral700PanelSet_Pr.class);
  }
  
  public ClaimSnapshotGeneral700PanelSet_Trav getClaimSnapshotGeneral700PanelSet_Trav() {
    return getOrCreateProperty("ClaimSnapshotGeneral700PanelSet_Trav", "ClaimSnapshotGeneral700PanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.ClaimSnapshotGeneral700PanelSet_Trav.class);
  }
  
  public ClaimSnapshotGeneral700PanelSet_auto getClaimSnapshotGeneral700PanelSet_auto() {
    return getOrCreateProperty("ClaimSnapshotGeneral700PanelSet_auto", "ClaimSnapshotGeneral700PanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.ClaimSnapshotGeneral700PanelSet_auto.class);
  }
  
  public ClaimSnapshotGeneral700PanelSet_gl getClaimSnapshotGeneral700PanelSet_gl() {
    return getOrCreateProperty("ClaimSnapshotGeneral700PanelSet_gl", "ClaimSnapshotGeneral700PanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.ClaimSnapshotGeneral700PanelSet_gl.class);
  }
  
  public ClaimSnapshotGeneral700PanelSet_wc getClaimSnapshotGeneral700PanelSet_wc() {
    return getOrCreateProperty("ClaimSnapshotGeneral700PanelSet_wc", "ClaimSnapshotGeneral700PanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.ClaimSnapshotGeneral700PanelSet_wc.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ClaimSnapshotLossDetailsScreen_700._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotLossDetailsScreen.700.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}