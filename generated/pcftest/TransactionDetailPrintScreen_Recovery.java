package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.TransactionDetailPrintScreen_Recovery._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/financials/transactions/print/TransactionDetailPrintScreen.Recovery.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class TransactionDetailPrintScreen_Recovery extends TransactionDetailPrintScreen {
  public final static String CHECKSUM = "899e5f6a30211888d46a9b03971dccda";
  
  public TransactionDetailPrintScreen_Recovery(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public TransactionRecoveryDV getTransactionRecoveryDV() {
    return getOrCreateProperty("TransactionRecoveryDV", "TransactionRecoveryDV", null, pcftest.TransactionRecoveryDV.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.TransactionDetailPrintScreen_Recovery._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/transactions/print/TransactionDetailPrintScreen.Recovery.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}