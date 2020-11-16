package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.TransactionViewDetailForward.TransactionViewDetailForward_UpLink;
import pcftest.TransactionViewDetailForward._Paging;
import pcftest.TransactionViewDetailForward.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/financials/TransactionViewDetailForward.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class TransactionViewDetailForward extends PCFLocation {
  public final static String CHECKSUM = "3be801cde070297ade4196aa60790906";
  
  public TransactionViewDetailForward(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("TransactionViewDetailForward"));
  }
  
  public TransactionViewDetailForward_UpLink getTransactionViewDetailForward_UpLink() {
    return getOrCreateProperty("TransactionViewDetailForward_UpLink", "TransactionViewDetailForward_UpLink", null, pcftest.TransactionViewDetailForward.TransactionViewDetailForward_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.TransactionViewDetailForward._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.TransactionViewDetailForward.__crumb__.class);
  }
  
  public ClaimFinancialsTransactions get_parent() {
    return getOrCreateProperty("_parent", pcftest.ClaimFinancialsTransactions.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/TransactionViewDetailForward.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TransactionViewDetailForward_UpLink extends ClickableActionElement {
    public TransactionViewDetailForward_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/TransactionViewDetailForward.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/TransactionViewDetailForward.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}