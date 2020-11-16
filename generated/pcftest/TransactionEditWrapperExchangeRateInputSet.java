package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/shared/TransactionEditWrapperExchangeRateInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class TransactionEditWrapperExchangeRateInputSet extends PCFElement {
  public final static String CHECKSUM = "8bc2743cc33d656b6ed5cf7c90d1582f";
  
  public TransactionEditWrapperExchangeRateInputSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public DateElement getDate() {
    return getOrCreateProperty("Date", "Date", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public ValueElement getDescription() {
    return getOrCreateProperty("Description", "Description", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getExchangeRate() {
    return getOrCreateProperty("ExchangeRate", "ExchangeRate", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public BooleanValueElement getManualOrAutomatic() {
    return getOrCreateProperty("ManualOrAutomatic", "ManualOrAutomatic", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  
}