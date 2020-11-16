package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.PCFElementId;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/financials/checks/RecodePaymentPanelSet.single.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class RecodePaymentPanelSet_single extends RecodePaymentPanelSet {
  public final static String CHECKSUM = "28a6726f743ac3ac386c1e00b0cbd2fa";
  
  public RecodePaymentPanelSet_single(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public RecodePaymentDV getRecodePaymentDV() {
    return getOrCreateProperty("RecodePaymentDV", "RecodePaymentDV", null, pcftest.RecodePaymentDV.class);
  }
  
  
}