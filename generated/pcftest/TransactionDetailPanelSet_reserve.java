package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.PCFElementId;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/financials/transactions/TransactionDetailPanelSet.reserve.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class TransactionDetailPanelSet_reserve extends TransactionDetailPanelSet {
  public final static String CHECKSUM = "a35e4e73bc5871aceb3841b605058804";
  
  public TransactionDetailPanelSet_reserve(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public TransactionReserveDV getTransactionReserveDV() {
    return getOrCreateProperty("TransactionReserveDV", "TransactionReserveDV", null, pcftest.TransactionReserveDV.class);
  }
  
  
}