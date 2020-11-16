package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/financials/transactions/TransactionRecoveryDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class TransactionRecoveryDV extends DetailViewElement {
  public final static String CHECKSUM = "68b4e70a80407bb1d2f2791782278e8f";
  
  public TransactionRecoveryDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public RecoveryBasicsInputSet getRecoveryBasicsInputSet() {
    return getOrCreateProperty("RecoveryBasicsInputSet", "RecoveryBasicsInputSet", null, pcftest.RecoveryBasicsInputSet.class);
  }
  
  public TransactionApprovalHistoryInputSet getTransactionApprovalHistoryInputSet() {
    return getOrCreateProperty("TransactionApprovalHistoryInputSet", "TransactionApprovalHistoryInputSet", null, pcftest.TransactionApprovalHistoryInputSet.class);
  }
  
  public TransactionTrackingInputSet getTransactionTrackingInputSet() {
    return getOrCreateProperty("TransactionTrackingInputSet", "TransactionTrackingInputSet", null, pcftest.TransactionTrackingInputSet.class);
  }
  
  
}