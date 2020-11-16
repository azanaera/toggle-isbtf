package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/messaging/MessageDestinationStatisticsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class MessageDestinationStatisticsDV extends DetailViewElement {
  public final static String CHECKSUM = "9a3652427a346617cd9d0251908eb879";
  
  public MessageDestinationStatisticsDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getBatched() {
    return getOrCreateProperty("Batched", "Batched", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getError() {
    return getOrCreateProperty("Error", "Error", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getErrorCount() {
    return getOrCreateProperty("ErrorCount", "ErrorCount", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getInFlight() {
    return getOrCreateProperty("InFlight", "InFlight", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getRetry() {
    return getOrCreateProperty("Retry", "Retry", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getStatus() {
    return getOrCreateProperty("Status", "Status", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getUnsent() {
    return getOrCreateProperty("Unsent", "Unsent", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  
}