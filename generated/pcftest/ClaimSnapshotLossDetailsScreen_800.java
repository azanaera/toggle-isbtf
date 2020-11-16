package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ClaimSnapshotLossDetailsScreen_800._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotLossDetailsScreen.800.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotLossDetailsScreen_800 extends ClaimSnapshotLossDetailsScreen {
  public final static String CHECKSUM = "5dc2f02aec2316bc42000236fe8ddd6b";
  
  public ClaimSnapshotLossDetailsScreen_800(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ClaimSnapshotGeneral800PanelSet_Pr getClaimSnapshotGeneral800PanelSet_Pr() {
    return getOrCreateProperty("ClaimSnapshotGeneral800PanelSet_Pr", "ClaimSnapshotGeneral800PanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.ClaimSnapshotGeneral800PanelSet_Pr.class);
  }
  
  public ClaimSnapshotGeneral800PanelSet_Trav getClaimSnapshotGeneral800PanelSet_Trav() {
    return getOrCreateProperty("ClaimSnapshotGeneral800PanelSet_Trav", "ClaimSnapshotGeneral800PanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.ClaimSnapshotGeneral800PanelSet_Trav.class);
  }
  
  public ClaimSnapshotGeneral800PanelSet_auto getClaimSnapshotGeneral800PanelSet_auto() {
    return getOrCreateProperty("ClaimSnapshotGeneral800PanelSet_auto", "ClaimSnapshotGeneral800PanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.ClaimSnapshotGeneral800PanelSet_auto.class);
  }
  
  public ClaimSnapshotGeneral800PanelSet_gl getClaimSnapshotGeneral800PanelSet_gl() {
    return getOrCreateProperty("ClaimSnapshotGeneral800PanelSet_gl", "ClaimSnapshotGeneral800PanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.ClaimSnapshotGeneral800PanelSet_gl.class);
  }
  
  public ClaimSnapshotGeneral800PanelSet_wc getClaimSnapshotGeneral800PanelSet_wc() {
    return getOrCreateProperty("ClaimSnapshotGeneral800PanelSet_wc", "ClaimSnapshotGeneral800PanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.ClaimSnapshotGeneral800PanelSet_wc.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ClaimSnapshotLossDetailsScreen_800._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotLossDetailsScreen.800.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}