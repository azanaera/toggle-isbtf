package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.TransactionDetailPrintScreen_Reserve._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/financials/transactions/print/TransactionDetailPrintScreen.Reserve.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class TransactionDetailPrintScreen_Reserve extends TransactionDetailPrintScreen {
  public final static String CHECKSUM = "1aba4542ea956a9a36664299293d0ac0";
  
  public TransactionDetailPrintScreen_Reserve(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public TransactionReserveDV getTransactionReserveDV() {
    return getOrCreateProperty("TransactionReserveDV", "TransactionReserveDV", null, pcftest.TransactionReserveDV.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.TransactionDetailPrintScreen_Reserve._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/transactions/print/TransactionDetailPrintScreen.Reserve.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}