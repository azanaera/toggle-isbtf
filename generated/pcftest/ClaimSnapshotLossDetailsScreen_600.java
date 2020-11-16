package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ClaimSnapshotLossDetailsScreen_600._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotLossDetailsScreen.600.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotLossDetailsScreen_600 extends ClaimSnapshotLossDetailsScreen {
  public final static String CHECKSUM = "f652b1e28d3871577165865fe06a1678";
  
  public ClaimSnapshotLossDetailsScreen_600(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ClaimSnapshotGeneral600PanelSet_Pr getClaimSnapshotGeneral600PanelSet_Pr() {
    return getOrCreateProperty("ClaimSnapshotGeneral600PanelSet_Pr", "ClaimSnapshotGeneral600PanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.ClaimSnapshotGeneral600PanelSet_Pr.class);
  }
  
  public ClaimSnapshotGeneral600PanelSet_Trav getClaimSnapshotGeneral600PanelSet_Trav() {
    return getOrCreateProperty("ClaimSnapshotGeneral600PanelSet_Trav", "ClaimSnapshotGeneral600PanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.ClaimSnapshotGeneral600PanelSet_Trav.class);
  }
  
  public ClaimSnapshotGeneral600PanelSet_auto getClaimSnapshotGeneral600PanelSet_auto() {
    return getOrCreateProperty("ClaimSnapshotGeneral600PanelSet_auto", "ClaimSnapshotGeneral600PanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.ClaimSnapshotGeneral600PanelSet_auto.class);
  }
  
  public ClaimSnapshotGeneral600PanelSet_gl getClaimSnapshotGeneral600PanelSet_gl() {
    return getOrCreateProperty("ClaimSnapshotGeneral600PanelSet_gl", "ClaimSnapshotGeneral600PanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.ClaimSnapshotGeneral600PanelSet_gl.class);
  }
  
  public ClaimSnapshotGeneral600PanelSet_wc getClaimSnapshotGeneral600PanelSet_wc() {
    return getOrCreateProperty("ClaimSnapshotGeneral600PanelSet_wc", "ClaimSnapshotGeneral600PanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.ClaimSnapshotGeneral600PanelSet_wc.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ClaimSnapshotLossDetailsScreen_600._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotLossDetailsScreen.600.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}