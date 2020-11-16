package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/messaging/PayLoadDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class PayLoadDV extends DetailViewElement {
  public final static String CHECKSUM = "8d7bd3ebf508241a01cb69d1fe721a3b";
  
  public PayLoadDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getPayload() {
    return getOrCreateProperty("Payload", "Payload", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getResponse() {
    return getOrCreateProperty("Response", "Response", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  
}