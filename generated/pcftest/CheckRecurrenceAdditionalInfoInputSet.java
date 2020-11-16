package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/newtransaction/check/CheckRecurrenceAdditionalInfoInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class CheckRecurrenceAdditionalInfoInputSet extends PCFElement {
  public final static String CHECKSUM = "95572e5f490afac26a0a2aa3ba639418";
  
  public CheckRecurrenceAdditionalInfoInputSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getTotalNumOfChecks() {
    return getOrCreateProperty("TotalNumOfChecks", "TotalNumOfChecks", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getTotalRecurrenceAmount() {
    return getOrCreateProperty("TotalRecurrenceAmount", "TotalRecurrenceAmount", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  
}