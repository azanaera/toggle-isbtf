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
@Generated(comments = "config/web/pcf/claim/shared/TransactionExchangeRateInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class TransactionExchangeRateInputSet extends PCFElement {
  public final static String CHECKSUM = "49700d51976d01f24f70046e0ab79119";
  
  public TransactionExchangeRateInputSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getTransaction_ExchangeRate() {
    return getOrCreateProperty("Transaction_ExchangeRate", "Transaction_ExchangeRate", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public BooleanValueElement getTransaction_ExchangeRateOverride() {
    return getOrCreateProperty("Transaction_ExchangeRateOverride", "Transaction_ExchangeRateOverride", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public DateElement getTransaction_RateSet_Date() {
    return getOrCreateProperty("Transaction_RateSet_Date", "Transaction_RateSet_Date", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public ValueElement getTransaction_RateSet_Description() {
    return getOrCreateProperty("Transaction_RateSet_Description", "Transaction_RateSet_Description", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  
}