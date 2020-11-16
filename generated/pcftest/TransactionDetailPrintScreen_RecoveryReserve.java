package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.TransactionDetailPrintScreen_RecoveryReserve._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/financials/transactions/print/TransactionDetailPrintScreen.RecoveryReserve.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class TransactionDetailPrintScreen_RecoveryReserve extends TransactionDetailPrintScreen {
  public final static String CHECKSUM = "bd3cdd465d51e0dcfeffc01109f6f9e3";
  
  public TransactionDetailPrintScreen_RecoveryReserve(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public TransactionRecoveryReserveDV getTransactionRecoveryReserveDV() {
    return getOrCreateProperty("TransactionRecoveryReserveDV", "TransactionRecoveryReserveDV", null, pcftest.TransactionRecoveryReserveDV.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.TransactionDetailPrintScreen_RecoveryReserve._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/transactions/print/TransactionDetailPrintScreen.RecoveryReserve.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}