package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ClaimSnapshotExposure700DV_Dwelling.Dwelling_Incident;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotExposure700DV.Dwelling.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotExposure700DV_Dwelling extends ClaimSnapshotExposure700DV {
  public final static String CHECKSUM = "d7e6b1efa88155c75b1f5dfba187ea81";
  
  public ClaimSnapshotExposure700DV_Dwelling(ISmokeTest helper, PCFElementId componentId)  {
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
  
  public Dwelling_Incident getDwelling_Incident() {
    return getOrCreateProperty("Dwelling_Incident", "Dwelling_Incident", null, pcftest.ClaimSnapshotExposure700DV_Dwelling.Dwelling_Incident.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotExposure700DV.Dwelling.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Dwelling_Incident extends ValueElement {
    public Dwelling_Incident(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimSnapshotDwellingIncident700Popup click() {
      return clickThis(pcftest.ClaimSnapshotDwellingIncident700Popup.class);
    }
    
    
  }
  
  
}