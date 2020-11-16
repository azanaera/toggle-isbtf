package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ClaimSnapshotExposure800DV_OtherStructure.Other_Structure_Incident;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotExposure800DV.OtherStructure.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotExposure800DV_OtherStructure extends ClaimSnapshotExposure800DV {
  public final static String CHECKSUM = "52621f4b1c8207cbf216af789e556e88";
  
  public ClaimSnapshotExposure800DV_OtherStructure(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ClaimSnapshotExposureCodingInputSet_600 getClaimSnapshotExposureCodingInputSet_600() {
    return getOrCreateProperty("ClaimSnapshotExposureCodingInputSet_600", "ClaimSnapshotExposureCodingInputSet", null, pcftest.ClaimSnapshotExposureCodingInputSet_600.class);
  }
  
  public ClaimSnapshotExposureCodingInputSet_700 getClaimSnapshotExposureCodingInputSet_700() {
    return getOrCreateProperty("ClaimSnapshotExposureCodingInputSet_700", "ClaimSnapshotExposureCodingInputSet", null, pcftest.ClaimSnapshotExposureCodingInputSet_700.class);
  }
  
  public ClaimSnapshotExposureCodingInputSet_800 getClaimSnapshotExposureCodingInputSet_800() {
    return getOrCreateProperty("ClaimSnapshotExposureCodingInputSet_800", "ClaimSnapshotExposureCodingInputSet", null, pcftest.ClaimSnapshotExposureCodingInputSet_800.class);
  }
  
  public ClaimSnapshotExposureCodingInputSet_default getClaimSnapshotExposureCodingInputSet_default() {
    return getOrCreateProperty("ClaimSnapshotExposureCodingInputSet_default", "ClaimSnapshotExposureCodingInputSet", null, pcftest.ClaimSnapshotExposureCodingInputSet_default.class);
  }
  
  public ClaimSnapshotExposureDetailInputSet_600 getClaimSnapshotExposureDetailInputSet_600() {
    return getOrCreateProperty("ClaimSnapshotExposureDetailInputSet_600", "ClaimSnapshotExposureDetailInputSet", null, pcftest.ClaimSnapshotExposureDetailInputSet_600.class);
  }
  
  public ClaimSnapshotExposureDetailInputSet_700 getClaimSnapshotExposureDetailInputSet_700() {
    return getOrCreateProperty("ClaimSnapshotExposureDetailInputSet_700", "ClaimSnapshotExposureDetailInputSet", null, pcftest.ClaimSnapshotExposureDetailInputSet_700.class);
  }
  
  public ClaimSnapshotExposureDetailInputSet_800 getClaimSnapshotExposureDetailInputSet_800() {
    return getOrCreateProperty("ClaimSnapshotExposureDetailInputSet_800", "ClaimSnapshotExposureDetailInputSet", null, pcftest.ClaimSnapshotExposureDetailInputSet_800.class);
  }
  
  public ClaimSnapshotExposureDetailInputSet_default getClaimSnapshotExposureDetailInputSet_default() {
    return getOrCreateProperty("ClaimSnapshotExposureDetailInputSet_default", "ClaimSnapshotExposureDetailInputSet", null, pcftest.ClaimSnapshotExposureDetailInputSet_default.class);
  }
  
  public ClaimSnapshotOtherCarrierInvolvementInputSet_600 getClaimSnapshotOtherCarrierInvolvementInputSet_600() {
    return getOrCreateProperty("ClaimSnapshotOtherCarrierInvolvementInputSet_600", "ClaimSnapshotOtherCarrierInvolvementInputSet", null, pcftest.ClaimSnapshotOtherCarrierInvolvementInputSet_600.class);
  }
  
  public ClaimSnapshotOtherCarrierInvolvementInputSet_700 getClaimSnapshotOtherCarrierInvolvementInputSet_700() {
    return getOrCreateProperty("ClaimSnapshotOtherCarrierInvolvementInputSet_700", "ClaimSnapshotOtherCarrierInvolvementInputSet", null, pcftest.ClaimSnapshotOtherCarrierInvolvementInputSet_700.class);
  }
  
  public ClaimSnapshotOtherCarrierInvolvementInputSet_800 getClaimSnapshotOtherCarrierInvolvementInputSet_800() {
    return getOrCreateProperty("ClaimSnapshotOtherCarrierInvolvementInputSet_800", "ClaimSnapshotOtherCarrierInvolvementInputSet", null, pcftest.ClaimSnapshotOtherCarrierInvolvementInputSet_800.class);
  }
  
  public ClaimSnapshotOtherCarrierInvolvementInputSet_default getClaimSnapshotOtherCarrierInvolvementInputSet_default() {
    return getOrCreateProperty("ClaimSnapshotOtherCarrierInvolvementInputSet_default", "ClaimSnapshotOtherCarrierInvolvementInputSet", null, pcftest.ClaimSnapshotOtherCarrierInvolvementInputSet_default.class);
  }
  
  public Other_Structure_Incident getOther_Structure_Incident() {
    return getOrCreateProperty("Other_Structure_Incident", "Other_Structure_Incident", null, pcftest.ClaimSnapshotExposure800DV_OtherStructure.Other_Structure_Incident.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotExposure800DV.OtherStructure.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Other_Structure_Incident extends ValueElement {
    public Other_Structure_Incident(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimSnapshotOtherStructureIncident800Popup click() {
      return clickThis(pcftest.ClaimSnapshotOtherStructureIncident800Popup.class);
    }
    
    
  }
  
  
}