package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.PCFElementId;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/financials/transactions/TransactionDetailPanelSet.recovery.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class TransactionDetailPanelSet_recovery extends TransactionDetailPanelSet {
  public final static String CHECKSUM = "5fcb9127cfe31d967ee77bf17e76d1c6";
  
  public TransactionDetailPanelSet_recovery(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public TransactionRecoveryDV getTransactionRecoveryDV() {
    return getOrCreateProperty("TransactionRecoveryDV", "TransactionRecoveryDV", null, pcftest.TransactionRecoveryDV.class);
  }
  
  
}