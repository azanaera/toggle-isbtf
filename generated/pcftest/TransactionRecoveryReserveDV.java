package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.TransactionRecoveryReserveDV.RecoveryReserveSetLV_tb;
import pcftest.TransactionRecoveryReserveDV.UnmodifiableTransactionSetDocumentsLV_tb;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/financials/transactions/TransactionRecoveryReserveDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class TransactionRecoveryReserveDV extends DetailViewElement {
  public final static String CHECKSUM = "b2ce4dd34a4fc636b81a74bc7b441b90";
  
  public TransactionRecoveryReserveDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public RecoveryReserveBasicsInputSet getRecoveryReserveBasicsInputSet() {
    return getOrCreateProperty("RecoveryReserveBasicsInputSet", "RecoveryReserveBasicsInputSet", null, pcftest.RecoveryReserveBasicsInputSet.class);
  }
  
  public RecoveryReserveSetLV getRecoveryReserveSetLV() {
    return getOrCreateProperty("RecoveryReserveSetLV", "RecoveryReserveSetLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.RecoveryReserveSetLV.class);
  }
  
  public RecoveryReserveSetLV_tb getRecoveryReserveSetLV_tb() {
    return getOrCreateProperty("RecoveryReserveSetLV_tb", "RecoveryReserveSetLV_tb", null, pcftest.TransactionRecoveryReserveDV.RecoveryReserveSetLV_tb.class);
  }
  
  public TransactionApprovalHistoryInputSet getTransactionApprovalHistoryInputSet() {
    return getOrCreateProperty("TransactionApprovalHistoryInputSet", "TransactionApprovalHistoryInputSet", null, pcftest.TransactionApprovalHistoryInputSet.class);
  }
  
  public TransactionTrackingInputSet getTransactionTrackingInputSet() {
    return getOrCreateProperty("TransactionTrackingInputSet", "TransactionTrackingInputSet", null, pcftest.TransactionTrackingInputSet.class);
  }
  
  public UnmodifiableTransactionSetDocumentsLV getUnmodifiableTransactionSetDocumentsLV() {
    return getOrCreateProperty("UnmodifiableTransactionSetDocumentsLV", "UnmodifiableTransactionSetDocumentsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.UnmodifiableTransactionSetDocumentsLV.class);
  }
  
  public UnmodifiableTransactionSetDocumentsLV_tb getUnmodifiableTransactionSetDocumentsLV_tb() {
    return getOrCreateProperty("UnmodifiableTransactionSetDocumentsLV_tb", "UnmodifiableTransactionSetDocumentsLV_tb", null, pcftest.TransactionRecoveryReserveDV.UnmodifiableTransactionSetDocumentsLV_tb.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/transactions/TransactionRecoveryReserveDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RecoveryReserveSetLV_tb extends PCFElement {
    public RecoveryReserveSetLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/transactions/TransactionRecoveryReserveDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class UnmodifiableTransactionSetDocumentsLV_tb extends PCFElement {
    public UnmodifiableTransactionSetDocumentsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  
}