package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/snapshot/800/shared/ClaimSnapshotExposureDetailInputSet.800.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotExposureDetailInputSet_800 extends ClaimSnapshotExposureDetailInputSet {
  public final static String CHECKSUM = "6e0a1c2fc89c2f0f62b6920338d133b8";
  
  public ClaimSnapshotExposureDetailInputSet_800(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getClaimant() {
    return getOrCreateProperty("Claimant", "Claimant", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getClaimantType() {
    return getOrCreateProperty("ClaimantType", "ClaimantType", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public BooleanValueElement getContactProhibited() {
    return getOrCreateProperty("ContactProhibited", "ContactProhibited", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public ValueElement getCoverage() {
    return getOrCreateProperty("Coverage", "Coverage", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getCoverageSubType() {
    return getOrCreateProperty("CoverageSubType", "CoverageSubType", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getCreateTime() {
    return getOrCreateProperty("CreateTime", "CreateTime", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getLossParty() {
    return getOrCreateProperty("LossParty", "LossParty", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getPrimaryAddress() {
    return getOrCreateProperty("PrimaryAddress", "PrimaryAddress", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getPrimaryCoverage() {
    return getOrCreateProperty("PrimaryCoverage", "PrimaryCoverage", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getPrimaryPhone() {
    return getOrCreateProperty("PrimaryPhone", "PrimaryPhone", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getSeverity() {
    return getOrCreateProperty("Severity", "Severity", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  
}