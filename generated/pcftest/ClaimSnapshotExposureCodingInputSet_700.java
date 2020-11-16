package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/snapshot/700/shared/ClaimSnapshotExposureCodingInputSet.700.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotExposureCodingInputSet_700 extends ClaimSnapshotExposureCodingInputSet {
  public final static String CHECKSUM = "22dbbbb727461a9a1a3b95094a4cbc6f";
  
  public ClaimSnapshotExposureCodingInputSet_700(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getSegment() {
    return getOrCreateProperty("Segment", "Segment", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getStrategy() {
    return getOrCreateProperty("Strategy", "Strategy", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  
}