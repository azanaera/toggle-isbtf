package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.TransactionReserveDV.ReserveSetLV_tb;
import pcftest.TransactionReserveDV.UnmodifiableTransactionSetDocumentsLV_tb;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/financials/transactions/TransactionReserveDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class TransactionReserveDV extends DetailViewElement {
  public final static String CHECKSUM = "b4e64c80cb2d48d1d17d1a8cdbed8e07";
  
  public TransactionReserveDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ReserveSetLV getReserveSetLV() {
    return getOrCreateProperty("ReserveSetLV", "ReserveSetLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ReserveSetLV.class);
  }
  
  public ReserveSetLV_tb getReserveSetLV_tb() {
    return getOrCreateProperty("ReserveSetLV_tb", "ReserveSetLV_tb", null, pcftest.TransactionReserveDV.ReserveSetLV_tb.class);
  }
  
  public TransactionApprovalHistoryInputSet getTransactionApprovalHistoryInputSet() {
    return getOrCreateProperty("TransactionApprovalHistoryInputSet", "TransactionApprovalHistoryInputSet", null, pcftest.TransactionApprovalHistoryInputSet.class);
  }
  
  public TransactionBasicsInputSet getTransactionBasicsInputSet() {
    return getOrCreateProperty("TransactionBasicsInputSet", "TransactionBasicsInputSet", null, pcftest.TransactionBasicsInputSet.class);
  }
  
  public TransactionTrackingInputSet getTransactionTrackingInputSet() {
    return getOrCreateProperty("TransactionTrackingInputSet", "TransactionTrackingInputSet", null, pcftest.TransactionTrackingInputSet.class);
  }
  
  public UnmodifiableTransactionSetDocumentsLV getUnmodifiableTransactionSetDocumentsLV() {
    return getOrCreateProperty("UnmodifiableTransactionSetDocumentsLV", "UnmodifiableTransactionSetDocumentsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.UnmodifiableTransactionSetDocumentsLV.class);
  }
  
  public UnmodifiableTransactionSetDocumentsLV_tb getUnmodifiableTransactionSetDocumentsLV_tb() {
    return getOrCreateProperty("UnmodifiableTransactionSetDocumentsLV_tb", "UnmodifiableTransactionSetDocumentsLV_tb", null, pcftest.TransactionReserveDV.UnmodifiableTransactionSetDocumentsLV_tb.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/transactions/TransactionReserveDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ReserveSetLV_tb extends PCFElement {
    public ReserveSetLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/transactions/TransactionReserveDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class UnmodifiableTransactionSetDocumentsLV_tb extends PCFElement {
    public UnmodifiableTransactionSetDocumentsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  
}