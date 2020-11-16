package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.PCFElementId;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/newtransaction/manualcheck/NewCheckPaymentPanelSet.Single.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NewCheckPaymentPanelSet_Single extends NewCheckPaymentPanelSet {
  public final static String CHECKSUM = "16c9eb2aca4bb76c2cc7e5cea6d02ef9";
  
  public NewCheckPaymentPanelSet_Single(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public NewPaymentDetailDV_default getNewPaymentDetailDV_default() {
    return getOrCreateProperty("NewPaymentDetailDV_default", "NewPaymentDetailDV", null, pcftest.NewPaymentDetailDV_default.class);
  }
  
  
}