package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.DeleteReserveSetDV.ReserveSetLV_tb;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/financials/DeleteReserveSetDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class DeleteReserveSetDV extends DetailViewElement {
  public final static String CHECKSUM = "f80c9d50207ad025f4c1b30adeb53f6d";
  
  public DeleteReserveSetDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ReserveSetLV getReserveSetLV() {
    return getOrCreateProperty("ReserveSetLV", "ReserveSetLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ReserveSetLV.class);
  }
  
  public ReserveSetLV_tb getReserveSetLV_tb() {
    return getOrCreateProperty("ReserveSetLV_tb", "ReserveSetLV_tb", null, pcftest.DeleteReserveSetDV.ReserveSetLV_tb.class);
  }
  
  public TransactionSetSummaryInputSet getTransactionSetSummaryInputSet() {
    return getOrCreateProperty("TransactionSetSummaryInputSet", "TransactionSetSummaryInputSet", null, pcftest.TransactionSetSummaryInputSet.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/DeleteReserveSetDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ReserveSetLV_tb extends PCFElement {
    public ReserveSetLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  
}