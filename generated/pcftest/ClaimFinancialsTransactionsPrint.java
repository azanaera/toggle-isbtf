package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ClaimFinancialsTransactionsPrint.ClaimFinancialsTransactionsPrintScreen;
import pcftest.ClaimFinancialsTransactionsPrint.ClaimFinancialsTransactionsPrintScreen._msgs;
import pcftest.ClaimFinancialsTransactionsPrint.ClaimFinancialsTransactionsPrint_UpLink;
import pcftest.ClaimFinancialsTransactionsPrint._Paging;
import pcftest.ClaimFinancialsTransactionsPrint.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/financials/transactions/ClaimFinancialsTransactionsPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimFinancialsTransactionsPrint extends PCFLocation {
  public final static String CHECKSUM = "84383828906d1e23b08d4494f9722404";
  
  public ClaimFinancialsTransactionsPrint(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ClaimFinancialsTransactionsPrint"));
  }
  
  public ClaimFinancialsTransactionsPrintScreen getClaimFinancialsTransactionsPrintScreen() {
    return getOrCreateProperty("ClaimFinancialsTransactionsPrintScreen", "ClaimFinancialsTransactionsPrintScreen", null, pcftest.ClaimFinancialsTransactionsPrint.ClaimFinancialsTransactionsPrintScreen.class);
  }
  
  public ClaimFinancialsTransactionsPrint_UpLink getClaimFinancialsTransactionsPrint_UpLink() {
    return getOrCreateProperty("ClaimFinancialsTransactionsPrint_UpLink", "ClaimFinancialsTransactionsPrint_UpLink", null, pcftest.ClaimFinancialsTransactionsPrint.ClaimFinancialsTransactionsPrint_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ClaimFinancialsTransactionsPrint._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ClaimFinancialsTransactionsPrint.__crumb__.class);
  }
  
  public ClaimPrintout get_parent() {
    return getOrCreateProperty("_parent", pcftest.ClaimPrintout.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/transactions/ClaimFinancialsTransactionsPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimFinancialsTransactionsPrintScreen extends PCFElement {
    public ClaimFinancialsTransactionsPrintScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public TransactionsLV_default getTransactionsLV_custom() {
      return getOrCreateProperty("TransactionsLV_custom", "TransactionsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.TransactionsLV_default.class);
    }
    
    public TransactionsLV_default getTransactionsLV_default() {
      return getOrCreateProperty("TransactionsLV_default", "TransactionsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.TransactionsLV_default.class);
    }
    
    public TransactionsLV_payment getTransactionsLV_payment() {
      return getOrCreateProperty("TransactionsLV_payment", "TransactionsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.TransactionsLV_payment.class);
    }
    
    public TransactionsLV_recovery getTransactionsLV_recovery() {
      return getOrCreateProperty("TransactionsLV_recovery", "TransactionsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.TransactionsLV_recovery.class);
    }
    
    public TransactionsLV_recoveryreserve getTransactionsLV_recoveryreserve() {
      return getOrCreateProperty("TransactionsLV_recoveryreserve", "TransactionsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.TransactionsLV_recoveryreserve.class);
    }
    
    public TransactionsLV_reserve getTransactionsLV_reserve() {
      return getOrCreateProperty("TransactionsLV_reserve", "TransactionsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.TransactionsLV_reserve.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ClaimFinancialsTransactionsPrint.ClaimFinancialsTransactionsPrintScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/transactions/ClaimFinancialsTransactionsPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _msgs extends MessagesElement {
      public _msgs(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/transactions/ClaimFinancialsTransactionsPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimFinancialsTransactionsPrint_UpLink extends ClickableActionElement {
    public ClaimFinancialsTransactionsPrint_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/transactions/ClaimFinancialsTransactionsPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/transactions/ClaimFinancialsTransactionsPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}