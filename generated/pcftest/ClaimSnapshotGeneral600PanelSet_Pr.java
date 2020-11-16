package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.PCFElementId;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotGeneral600PanelSet.Pr.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotGeneral600PanelSet_Pr extends ClaimSnapshotGeneral600PanelSet {
  public final static String CHECKSUM = "f2187d93a6c4a88e154a9c0e1c2667f4";
  
  public ClaimSnapshotGeneral600PanelSet_Pr(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ClaimSnapshotGeneralPR600PanelSet_Homeowners getClaimSnapshotGeneralPR600PanelSet_Homeowners() {
    return getOrCreateProperty("ClaimSnapshotGeneralPR600PanelSet_Homeowners", "ClaimSnapshotGeneralPR600PanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.ClaimSnapshotGeneralPR600PanelSet_Homeowners.class);
  }
  
  public ClaimSnapshotGeneralPR600PanelSet_default getClaimSnapshotGeneralPR600PanelSet_default() {
    return getOrCreateProperty("ClaimSnapshotGeneralPR600PanelSet_default", "ClaimSnapshotGeneralPR600PanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.ClaimSnapshotGeneralPR600PanelSet_default.class);
  }
  
  
}