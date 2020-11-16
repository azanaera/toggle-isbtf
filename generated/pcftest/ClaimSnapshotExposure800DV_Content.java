package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ClaimSnapshotExposure800DV_Content.Contents_Incident;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotExposure800DV.Content.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotExposure800DV_Content extends ClaimSnapshotExposure800DV {
  public final static String CHECKSUM = "e84839b06d454327140729da9c2ca18b";
  
  public ClaimSnapshotExposure800DV_Content(ISmokeTest helper, PCFElementId componentId)  {
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
  
  public Contents_Incident getContents_Incident() {
    return getOrCreateProperty("Contents_Incident", "Contents_Incident", null, pcftest.ClaimSnapshotExposure800DV_Content.Contents_Incident.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotExposure800DV.Content.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Contents_Incident extends ValueElement {
    public Contents_Incident(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimSnapshotPropertyContentsIncident800Popup click() {
      return clickThis(pcftest.ClaimSnapshotPropertyContentsIncident800Popup.class);
    }
    
    
  }
  
  
}