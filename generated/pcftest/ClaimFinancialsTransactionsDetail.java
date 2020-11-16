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
import pcftest.ClaimFinancialsTransactionsDetail.ClaimFinancialsTransactionsDetailScreen;
import pcftest.ClaimFinancialsTransactionsDetail.ClaimFinancialsTransactionsDetailScreen._msgs;
import pcftest.ClaimFinancialsTransactionsDetail.ClaimFinancialsTransactionsDetail_UpLink;
import pcftest.ClaimFinancialsTransactionsDetail._Paging;
import pcftest.ClaimFinancialsTransactionsDetail.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/financials/transactions/ClaimFinancialsTransactionsDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimFinancialsTransactionsDetail extends PCFLocation {
  public final static String CHECKSUM = "8197061d385e47c91bcb12c609f86483";
  
  public ClaimFinancialsTransactionsDetail(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ClaimFinancialsTransactionsDetail"));
  }
  
  public ClaimFinancialsTransactionsDetailScreen getClaimFinancialsTransactionsDetailScreen() {
    return getOrCreateProperty("ClaimFinancialsTransactionsDetailScreen", "ClaimFinancialsTransactionsDetailScreen", null, pcftest.ClaimFinancialsTransactionsDetail.ClaimFinancialsTransactionsDetailScreen.class);
  }
  
  public ClaimFinancialsTransactionsDetail_UpLink getClaimFinancialsTransactionsDetail_UpLink() {
    return getOrCreateProperty("ClaimFinancialsTransactionsDetail_UpLink", "ClaimFinancialsTransactionsDetail_UpLink", null, pcftest.ClaimFinancialsTransactionsDetail.ClaimFinancialsTransactionsDetail_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ClaimFinancialsTransactionsDetail._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ClaimFinancialsTransactionsDetail.__crumb__.class);
  }
  
  public ClaimFinancialsTransactions get_parent() {
    return getOrCreateProperty("_parent", pcftest.ClaimFinancialsTransactions.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/transactions/ClaimFinancialsTransactionsDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimFinancialsTransactionsDetailScreen extends PCFElement {
    public ClaimFinancialsTransactionsDetailScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public TransactionDetailPanelSet_payment getTransactionDetailPanelSet_payment() {
      return getOrCreateProperty("TransactionDetailPanelSet_payment", "TransactionDetailPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.TransactionDetailPanelSet_payment.class);
    }
    
    public TransactionDetailPanelSet_recovery getTransactionDetailPanelSet_recovery() {
      return getOrCreateProperty("TransactionDetailPanelSet_recovery", "TransactionDetailPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.TransactionDetailPanelSet_recovery.class);
    }
    
    public TransactionDetailPanelSet_recoveryreserve getTransactionDetailPanelSet_recoveryreserve() {
      return getOrCreateProperty("TransactionDetailPanelSet_recoveryreserve", "TransactionDetailPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.TransactionDetailPanelSet_recoveryreserve.class);
    }
    
    public TransactionDetailPanelSet_reserve getTransactionDetailPanelSet_reserve() {
      return getOrCreateProperty("TransactionDetailPanelSet_reserve", "TransactionDetailPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.TransactionDetailPanelSet_reserve.class);
    }
    
    public TransactionDetailToolbarButtonSet_payment getTransactionDetailToolbarButtonSet_payment() {
      return getOrCreateProperty("TransactionDetailToolbarButtonSet_payment", "TransactionDetailToolbarButtonSet", null, pcftest.TransactionDetailToolbarButtonSet_payment.class);
    }
    
    public TransactionDetailToolbarButtonSet_recovery getTransactionDetailToolbarButtonSet_recovery() {
      return getOrCreateProperty("TransactionDetailToolbarButtonSet_recovery", "TransactionDetailToolbarButtonSet", null, pcftest.TransactionDetailToolbarButtonSet_recovery.class);
    }
    
    public TransactionDetailToolbarButtonSet_recoveryreserve getTransactionDetailToolbarButtonSet_recoveryreserve() {
      return getOrCreateProperty("TransactionDetailToolbarButtonSet_recoveryreserve", "TransactionDetailToolbarButtonSet", null, pcftest.TransactionDetailToolbarButtonSet_recoveryreserve.class);
    }
    
    public TransactionDetailToolbarButtonSet_reserve getTransactionDetailToolbarButtonSet_reserve() {
      return getOrCreateProperty("TransactionDetailToolbarButtonSet_reserve", "TransactionDetailToolbarButtonSet", null, pcftest.TransactionDetailToolbarButtonSet_reserve.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ClaimFinancialsTransactionsDetail.ClaimFinancialsTransactionsDetailScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/transactions/ClaimFinancialsTransactionsDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/financials/transactions/ClaimFinancialsTransactionsDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimFinancialsTransactionsDetail_UpLink extends ClickableActionElement {
    public ClaimFinancialsTransactionsDetail_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/transactions/ClaimFinancialsTransactionsDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/transactions/ClaimFinancialsTransactionsDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}