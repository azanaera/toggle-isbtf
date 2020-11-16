package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/snapshot/800/shared/ClaimSnapshotExposureCodingInputSet.800.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotExposureCodingInputSet_800 extends ClaimSnapshotExposureCodingInputSet {
  public final static String CHECKSUM = "bf33f1ad789e26366d4063b01877b845";
  
  public ClaimSnapshotExposureCodingInputSet_800(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getSegment() {
    return getOrCreateProperty("Segment", "Segment", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getStrategy() {
    return getOrCreateProperty("Strategy", "Strategy", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  
}