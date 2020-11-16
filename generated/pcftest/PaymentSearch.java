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
import pcftest.PaymentSearch.PaymentSearchScreen;
import pcftest.PaymentSearch.PaymentSearchScreen.CheckSearchResultsLV_tb;
import pcftest.PaymentSearch.PaymentSearchScreen.CheckSearchResultsLV_tb.PaymentSearch_PrintButton;
import pcftest.PaymentSearch.PaymentSearchScreen._msgs;
import pcftest.PaymentSearch.PaymentSearch_UpLink;
import pcftest.PaymentSearch._Paging;
import pcftest.PaymentSearch.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/search/checks/PaymentSearch.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class PaymentSearch extends PCFLocation {
  public final static String CHECKSUM = "3349a7515c6a8a3cc776b9e1312ed5cb";
  
  public PaymentSearch(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("PaymentSearch"));
  }
  
  public PaymentSearchScreen getPaymentSearchScreen() {
    return getOrCreateProperty("PaymentSearchScreen", "PaymentSearchScreen", null, pcftest.PaymentSearch.PaymentSearchScreen.class);
  }
  
  public PaymentSearch_UpLink getPaymentSearch_UpLink() {
    return getOrCreateProperty("PaymentSearch_UpLink", "PaymentSearch_UpLink", null, pcftest.PaymentSearch.PaymentSearch_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.PaymentSearch._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.PaymentSearch.__crumb__.class);
  }
  
  public Search get_parent() {
    return getOrCreateProperty("_parent", pcftest.Search.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/search/checks/PaymentSearch.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PaymentSearchScreen extends PCFElement {
    public PaymentSearchScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public CheckSearchResultsLV getCheckSearchResultsLV() {
      return getOrCreateProperty("CheckSearchResultsLV", "CheckSearchResultsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.CheckSearchResultsLV.class);
    }
    
    public CheckSearchResultsLV_tb getCheckSearchResultsLV_tb() {
      return getOrCreateProperty("CheckSearchResultsLV_tb", "CheckSearchResultsLV_tb", null, pcftest.PaymentSearch.PaymentSearchScreen.CheckSearchResultsLV_tb.class);
    }
    
    public PaymentSearchDV getPaymentSearchDV() {
      return getOrCreateProperty("PaymentSearchDV", "PaymentSearchDV", null, pcftest.PaymentSearchDV.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.PaymentSearch.PaymentSearchScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/search/checks/PaymentSearch.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CheckSearchResultsLV_tb extends PCFElement {
      public CheckSearchResultsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PaymentSearch_PrintButton getPaymentSearch_PrintButton() {
        return getOrCreateProperty("PaymentSearch_PrintButton", "PaymentSearch_PrintButton", null, pcftest.PaymentSearch.PaymentSearchScreen.CheckSearchResultsLV_tb.PaymentSearch_PrintButton.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/search/checks/PaymentSearch.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class PaymentSearch_PrintButton extends ClickableActionElement {
        public PaymentSearch_PrintButton(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/search/checks/PaymentSearch.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/search/checks/PaymentSearch.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PaymentSearch_UpLink extends ClickableActionElement {
    public PaymentSearch_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/search/checks/PaymentSearch.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/search/checks/PaymentSearch.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}