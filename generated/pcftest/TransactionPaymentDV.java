package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/financials/transactions/TransactionPaymentDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class TransactionPaymentDV extends DetailViewElement {
  public final static String CHECKSUM = "31f39591c3265679b684ca5e9e738dd6";
  
  public TransactionPaymentDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public PaymentBasicsInputSet getPaymentBasicsInputSet() {
    return getOrCreateProperty("PaymentBasicsInputSet", "PaymentBasicsInputSet", null, pcftest.PaymentBasicsInputSet.class);
  }
  
  public TransactionApprovalHistoryInputSet getTransactionApprovalHistoryInputSet() {
    return getOrCreateProperty("TransactionApprovalHistoryInputSet", "TransactionApprovalHistoryInputSet", null, pcftest.TransactionApprovalHistoryInputSet.class);
  }
  
  public TransactionPaymentDetailsInputSet getTransactionPaymentDetailsInputSet() {
    return getOrCreateProperty("TransactionPaymentDetailsInputSet", "TransactionPaymentDetailsInputSet", null, pcftest.TransactionPaymentDetailsInputSet.class);
  }
  
  public TransactionTrackingInputSet getTransactionTrackingInputSet() {
    return getOrCreateProperty("TransactionTrackingInputSet", "TransactionTrackingInputSet", null, pcftest.TransactionTrackingInputSet.class);
  }
  
  
}