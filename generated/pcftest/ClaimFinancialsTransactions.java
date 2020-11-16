package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ClaimFinancialsTransactions.ClaimFinancialsTransactionsScreen;
import pcftest.ClaimFinancialsTransactions.ClaimFinancialsTransactionsScreen._msgs;
import pcftest.ClaimFinancialsTransactions.ClaimFinancialsTransactions_UpLink;
import pcftest.ClaimFinancialsTransactions._Paging;
import pcftest.ClaimFinancialsTransactions.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/financials/transactions/ClaimFinancialsTransactions.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimFinancialsTransactions extends PCFLocation {
  public final static String CHECKSUM = "6a41040975aebfe1571c2fcf41140916";
  
  public ClaimFinancialsTransactions(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ClaimFinancialsTransactions"));
  }
  
  public ClaimFinancialsTransactionsScreen getClaimFinancialsTransactionsScreen() {
    return getOrCreateProperty("ClaimFinancialsTransactionsScreen", "ClaimFinancialsTransactionsScreen", null, pcftest.ClaimFinancialsTransactions.ClaimFinancialsTransactionsScreen.class);
  }
  
  public ClaimFinancialsTransactions_UpLink getClaimFinancialsTransactions_UpLink() {
    return getOrCreateProperty("ClaimFinancialsTransactions_UpLink", "ClaimFinancialsTransactions_UpLink", null, pcftest.ClaimFinancialsTransactions.ClaimFinancialsTransactions_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ClaimFinancialsTransactions._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ClaimFinancialsTransactions.__crumb__.class);
  }
  
  public ClaimFinancialsGroup get_parent() {
    return getOrCreateProperty("_parent", pcftest.ClaimFinancialsGroup.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/transactions/ClaimFinancialsTransactions.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimFinancialsTransactionsScreen extends PCFElement {
    public ClaimFinancialsTransactionsScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public SelectElement getTransactionsLVRangeInput() {
      return getOrCreateProperty("TransactionsLVRangeInput", "TransactionsLVRangeInput", null, gw.smoketest.platform.web.SelectElement.class);
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
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ClaimFinancialsTransactions.ClaimFinancialsTransactionsScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/transactions/ClaimFinancialsTransactions.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/financials/transactions/ClaimFinancialsTransactions.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimFinancialsTransactions_UpLink extends ClickableActionElement {
    public ClaimFinancialsTransactions_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/transactions/ClaimFinancialsTransactions.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/transactions/ClaimFinancialsTransactions.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}