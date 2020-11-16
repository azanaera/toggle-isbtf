package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/snapshot/default/shared/ClaimSnapshotExposureCodingInputSet.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotExposureCodingInputSet_default extends ClaimSnapshotExposureCodingInputSet {
  public final static String CHECKSUM = "97ad0be62bdd6b76d1d65122e9492ad4";
  
  public ClaimSnapshotExposureCodingInputSet_default(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getSegment() {
    return getOrCreateProperty("Segment", "Segment", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getStrategy() {
    return getOrCreateProperty("Strategy", "Strategy", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  
}