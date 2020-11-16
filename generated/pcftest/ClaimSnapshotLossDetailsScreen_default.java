package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ClaimSnapshotLossDetailsScreen_default._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotLossDetailsScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotLossDetailsScreen_default extends ClaimSnapshotLossDetailsScreen {
  public final static String CHECKSUM = "b71fbaaca3d6649c7e214fa3683aa6f3";
  
  public ClaimSnapshotLossDetailsScreen_default(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ClaimSnapshotGeneralPanelSet_Pr getClaimSnapshotGeneralPanelSet_Pr() {
    return getOrCreateProperty("ClaimSnapshotGeneralPanelSet_Pr", "ClaimSnapshotGeneralPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.ClaimSnapshotGeneralPanelSet_Pr.class);
  }
  
  public ClaimSnapshotGeneralPanelSet_Trav getClaimSnapshotGeneralPanelSet_Trav() {
    return getOrCreateProperty("ClaimSnapshotGeneralPanelSet_Trav", "ClaimSnapshotGeneralPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.ClaimSnapshotGeneralPanelSet_Trav.class);
  }
  
  public ClaimSnapshotGeneralPanelSet_auto getClaimSnapshotGeneralPanelSet_auto() {
    return getOrCreateProperty("ClaimSnapshotGeneralPanelSet_auto", "ClaimSnapshotGeneralPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.ClaimSnapshotGeneralPanelSet_auto.class);
  }
  
  public ClaimSnapshotGeneralPanelSet_gl getClaimSnapshotGeneralPanelSet_gl() {
    return getOrCreateProperty("ClaimSnapshotGeneralPanelSet_gl", "ClaimSnapshotGeneralPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.ClaimSnapshotGeneralPanelSet_gl.class);
  }
  
  public ClaimSnapshotGeneralPanelSet_wc getClaimSnapshotGeneralPanelSet_wc() {
    return getOrCreateProperty("ClaimSnapshotGeneralPanelSet_wc", "ClaimSnapshotGeneralPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.ClaimSnapshotGeneralPanelSet_wc.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ClaimSnapshotLossDetailsScreen_default._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotLossDetailsScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}