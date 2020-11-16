package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/financials/shared/EditTransactionInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class EditTransactionInputSet extends PCFElement {
  public final static String CHECKSUM = "c9f026ff4a7fece6b9bed847ebd67e2c";
  
  public EditTransactionInputSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getComments() {
    return getOrCreateProperty("Comments", "Comments", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ReserveLineInputSet getReserveLineInputSet() {
    return getOrCreateProperty("ReserveLineInputSet", "ReserveLineInputSet", null, pcftest.ReserveLineInputSet.class);
  }
  
  
}