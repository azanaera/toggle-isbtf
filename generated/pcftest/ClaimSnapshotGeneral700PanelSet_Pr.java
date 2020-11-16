package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.PCFElementId;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotGeneral700PanelSet.Pr.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotGeneral700PanelSet_Pr extends ClaimSnapshotGeneral700PanelSet {
  public final static String CHECKSUM = "00a474beb6db8a8b354971130baa787e";
  
  public ClaimSnapshotGeneral700PanelSet_Pr(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ClaimSnapshotGeneralPR700PanelSet_Homeowners getClaimSnapshotGeneralPR700PanelSet_Homeowners() {
    return getOrCreateProperty("ClaimSnapshotGeneralPR700PanelSet_Homeowners", "ClaimSnapshotGeneralPR700PanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.ClaimSnapshotGeneralPR700PanelSet_Homeowners.class);
  }
  
  public ClaimSnapshotGeneralPR700PanelSet_default getClaimSnapshotGeneralPR700PanelSet_default() {
    return getOrCreateProperty("ClaimSnapshotGeneralPR700PanelSet_default", "ClaimSnapshotGeneralPR700PanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.ClaimSnapshotGeneralPR700PanelSet_default.class);
  }
  
  
}