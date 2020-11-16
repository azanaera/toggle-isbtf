package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.PCFElementId;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/financials/transactions/TransactionDetailPanelSet.recoveryreserve.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class TransactionDetailPanelSet_recoveryreserve extends TransactionDetailPanelSet {
  public final static String CHECKSUM = "21202de0900fbbbcb24a6f285916d416";
  
  public TransactionDetailPanelSet_recoveryreserve(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public TransactionRecoveryReserveDV getTransactionRecoveryReserveDV() {
    return getOrCreateProperty("TransactionRecoveryReserveDV", "TransactionRecoveryReserveDV", null, pcftest.TransactionRecoveryReserveDV.class);
  }
  
  
}