package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.PCFElementId;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotGeneralPanelSet.Pr.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotGeneralPanelSet_Pr extends ClaimSnapshotGeneralPanelSet {
  public final static String CHECKSUM = "9f9fc163923cef04bac9a537b25a668f";
  
  public ClaimSnapshotGeneralPanelSet_Pr(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ClaimSnapshotGeneralPRPanelSet_Homeowners getClaimSnapshotGeneralPRPanelSet_Homeowners() {
    return getOrCreateProperty("ClaimSnapshotGeneralPRPanelSet_Homeowners", "ClaimSnapshotGeneralPRPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.ClaimSnapshotGeneralPRPanelSet_Homeowners.class);
  }
  
  public ClaimSnapshotGeneralPRPanelSet_default getClaimSnapshotGeneralPRPanelSet_default() {
    return getOrCreateProperty("ClaimSnapshotGeneralPRPanelSet_default", "ClaimSnapshotGeneralPRPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.ClaimSnapshotGeneralPRPanelSet_default.class);
  }
  
  
}