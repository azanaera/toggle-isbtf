package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/snapshot/600/shared/ClaimSnapshotExposureCodingInputSet.600.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotExposureCodingInputSet_600 extends ClaimSnapshotExposureCodingInputSet {
  public final static String CHECKSUM = "bb32619a3d917c5042c5c7ed84836990";
  
  public ClaimSnapshotExposureCodingInputSet_600(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getSegment() {
    return getOrCreateProperty("Segment", "Segment", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getStrategy() {
    return getOrCreateProperty("Strategy", "Strategy", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  
}