package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.TransactionApprovalHistoryInputSet.ApprovalHistoryLV_tb;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/financials/transactions/TransactionApprovalHistoryInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class TransactionApprovalHistoryInputSet extends PCFElement {
  public final static String CHECKSUM = "2ee31fcc56948434cde78ff69f25c802";
  
  public TransactionApprovalHistoryInputSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ApprovalHistoryLV getApprovalHistoryLV() {
    return getOrCreateProperty("ApprovalHistoryLV", "ApprovalHistoryLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ApprovalHistoryLV.class);
  }
  
  public ApprovalHistoryLV_tb getApprovalHistoryLV_tb() {
    return getOrCreateProperty("ApprovalHistoryLV_tb", "ApprovalHistoryLV_tb", null, pcftest.TransactionApprovalHistoryInputSet.ApprovalHistoryLV_tb.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/transactions/TransactionApprovalHistoryInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ApprovalHistoryLV_tb extends PCFElement {
    public ApprovalHistoryLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  
}