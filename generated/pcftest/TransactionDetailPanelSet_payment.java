package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.PCFElementId;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/financials/transactions/TransactionDetailPanelSet.payment.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class TransactionDetailPanelSet_payment extends TransactionDetailPanelSet {
  public final static String CHECKSUM = "d9c67bb7fbaa50cb133466c7b9892ccf";
  
  public TransactionDetailPanelSet_payment(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public TransactionPaymentDV getTransactionPaymentDV() {
    return getOrCreateProperty("TransactionPaymentDV", "TransactionPaymentDV", null, pcftest.TransactionPaymentDV.class);
  }
  
  
}