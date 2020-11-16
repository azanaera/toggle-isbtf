package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.TransactionDetailPrint.TransactionDetailPrint_UpLink;
import pcftest.TransactionDetailPrint._Paging;
import pcftest.TransactionDetailPrint.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/financials/transactions/print/TransactionDetailPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class TransactionDetailPrint extends PCFLocation {
  public final static String CHECKSUM = "d1f37103f69f8325b60d3076381ca8ae";
  
  public TransactionDetailPrint(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("TransactionDetailPrint"));
  }
  
  public TransactionDetailPrintScreen_Payment getTransactionDetailPrintScreen_Payment() {
    return getOrCreateProperty("TransactionDetailPrintScreen_Payment", "TransactionDetailPrintScreen", null, pcftest.TransactionDetailPrintScreen_Payment.class);
  }
  
  public TransactionDetailPrintScreen_Recovery getTransactionDetailPrintScreen_Recovery() {
    return getOrCreateProperty("TransactionDetailPrintScreen_Recovery", "TransactionDetailPrintScreen", null, pcftest.TransactionDetailPrintScreen_Recovery.class);
  }
  
  public TransactionDetailPrintScreen_RecoveryReserve getTransactionDetailPrintScreen_RecoveryReserve() {
    return getOrCreateProperty("TransactionDetailPrintScreen_RecoveryReserve", "TransactionDetailPrintScreen", null, pcftest.TransactionDetailPrintScreen_RecoveryReserve.class);
  }
  
  public TransactionDetailPrintScreen_Reserve getTransactionDetailPrintScreen_Reserve() {
    return getOrCreateProperty("TransactionDetailPrintScreen_Reserve", "TransactionDetailPrintScreen", null, pcftest.TransactionDetailPrintScreen_Reserve.class);
  }
  
  public TransactionDetailPrint_UpLink getTransactionDetailPrint_UpLink() {
    return getOrCreateProperty("TransactionDetailPrint_UpLink", "TransactionDetailPrint_UpLink", null, pcftest.TransactionDetailPrint.TransactionDetailPrint_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.TransactionDetailPrint._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.TransactionDetailPrint.__crumb__.class);
  }
  
  public ClaimPrintout get_parent() {
    return getOrCreateProperty("_parent", pcftest.ClaimPrintout.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/transactions/print/TransactionDetailPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TransactionDetailPrint_UpLink extends ClickableActionElement {
    public TransactionDetailPrint_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/transactions/print/TransactionDetailPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/transactions/print/TransactionDetailPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}