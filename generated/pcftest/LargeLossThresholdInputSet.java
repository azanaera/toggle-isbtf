package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/keymetrics/LargeLossThresholdInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class LargeLossThresholdInputSet extends PCFElement {
  public final static String CHECKSUM = "414f0bedcddb0573ab1b54372095124f";
  
  public LargeLossThresholdInputSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getClaimCenterThreshold() {
    return getOrCreateProperty("ClaimCenterThreshold", "ClaimCenterThreshold", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getPolicySystemThreshold() {
    return getOrCreateProperty("PolicySystemThreshold", "PolicySystemThreshold", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  
}