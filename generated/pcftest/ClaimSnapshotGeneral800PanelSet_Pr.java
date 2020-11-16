package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.PCFElementId;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotGeneral800PanelSet.Pr.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotGeneral800PanelSet_Pr extends ClaimSnapshotGeneral800PanelSet {
  public final static String CHECKSUM = "5d1df5cd3c00274ad49ae3744efac62e";
  
  public ClaimSnapshotGeneral800PanelSet_Pr(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ClaimSnapshotGeneralPR800PanelSet_Homeowners getClaimSnapshotGeneralPR800PanelSet_Homeowners() {
    return getOrCreateProperty("ClaimSnapshotGeneralPR800PanelSet_Homeowners", "ClaimSnapshotGeneralPR800PanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.ClaimSnapshotGeneralPR800PanelSet_Homeowners.class);
  }
  
  public ClaimSnapshotGeneralPR800PanelSet_default getClaimSnapshotGeneralPR800PanelSet_default() {
    return getOrCreateProperty("ClaimSnapshotGeneralPR800PanelSet_default", "ClaimSnapshotGeneralPR800PanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.ClaimSnapshotGeneralPR800PanelSet_default.class);
  }
  
  
}