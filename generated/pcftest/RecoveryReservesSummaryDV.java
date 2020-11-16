package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.RecoveryReservesSummaryDV.EditableRecoveryReservesLV_tb;
import pcftest.RecoveryReservesSummaryDV.TransactionSetDocumentsLV_tb;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/newtransaction/recoveryreserve/RecoveryReservesSummaryDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class RecoveryReservesSummaryDV extends DetailViewElement {
  public final static String CHECKSUM = "535d2b272781fea80add745231edb03f";
  
  public RecoveryReservesSummaryDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public EditableRecoveryReservesLV getEditableRecoveryReservesLV() {
    return getOrCreateProperty("EditableRecoveryReservesLV", "EditableRecoveryReservesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.EditableRecoveryReservesLV.class);
  }
  
  public EditableRecoveryReservesLV_tb getEditableRecoveryReservesLV_tb() {
    return getOrCreateProperty("EditableRecoveryReservesLV_tb", "EditableRecoveryReservesLV_tb", null, pcftest.RecoveryReservesSummaryDV.EditableRecoveryReservesLV_tb.class);
  }
  
  public TransactionSetDocumentsLV getTransactionSetDocumentsLV() {
    return getOrCreateProperty("TransactionSetDocumentsLV", "TransactionSetDocumentsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.TransactionSetDocumentsLV.class);
  }
  
  public TransactionSetDocumentsLV_tb getTransactionSetDocumentsLV_tb() {
    return getOrCreateProperty("TransactionSetDocumentsLV_tb", "TransactionSetDocumentsLV_tb", null, pcftest.RecoveryReservesSummaryDV.TransactionSetDocumentsLV_tb.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/recoveryreserve/RecoveryReservesSummaryDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditableRecoveryReservesLV_tb extends PCFElement {
    public EditableRecoveryReservesLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/recoveryreserve/RecoveryReservesSummaryDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TransactionSetDocumentsLV_tb extends PCFElement {
    public TransactionSetDocumentsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  
}