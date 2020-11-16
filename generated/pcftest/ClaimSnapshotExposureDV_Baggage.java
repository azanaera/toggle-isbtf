package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotExposureDV.Baggage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotExposureDV_Baggage extends ClaimSnapshotExposureDV {
  public final static String CHECKSUM = "b88d562093df37c90b919693f54799db";
  
  public ClaimSnapshotExposureDV_Baggage(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getBaggage_Incident() {
    return getOrCreateProperty("Baggage_Incident", "Baggage_Incident", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getBaggage_Type() {
    return getOrCreateProperty("Baggage_Type", "Baggage_Type", null, gw.smoketest.platform.web.ValueElement.class);
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
  
  public ValueElement getDelayOnly() {
    return getOrCreateProperty("DelayOnly", "DelayOnly", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  
}