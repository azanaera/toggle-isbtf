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
import pcftest.BulkInvoiceSearch.BulkInvoiceSearchScreen;
import pcftest.BulkInvoiceSearch.BulkInvoiceSearchScreen.BulkInvoiceSearchResultsLV_tb;
import pcftest.BulkInvoiceSearch.BulkInvoiceSearchScreen._msgs;
import pcftest.BulkInvoiceSearch.BulkInvoiceSearch_UpLink;
import pcftest.BulkInvoiceSearch._Paging;
import pcftest.BulkInvoiceSearch.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/search/bulkpay/BulkInvoiceSearch.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class BulkInvoiceSearch extends PCFLocation {
  public final static String CHECKSUM = "4d3405d65a7a1fa2a823abe0292de467";
  
  public BulkInvoiceSearch(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("BulkInvoiceSearch"));
  }
  
  public BulkInvoiceSearchScreen getBulkInvoiceSearchScreen() {
    return getOrCreateProperty("BulkInvoiceSearchScreen", "BulkInvoiceSearchScreen", null, pcftest.BulkInvoiceSearch.BulkInvoiceSearchScreen.class);
  }
  
  public BulkInvoiceSearch_UpLink getBulkInvoiceSearch_UpLink() {
    return getOrCreateProperty("BulkInvoiceSearch_UpLink", "BulkInvoiceSearch_UpLink", null, pcftest.BulkInvoiceSearch.BulkInvoiceSearch_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.BulkInvoiceSearch._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.BulkInvoiceSearch.__crumb__.class);
  }
  
  public Search get_parent() {
    return getOrCreateProperty("_parent", pcftest.Search.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/search/bulkpay/BulkInvoiceSearch.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class BulkInvoiceSearchScreen extends PCFElement {
    public BulkInvoiceSearchScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public BulkInvoiceSearchDV getBulkInvoiceSearchDV() {
      return getOrCreateProperty("BulkInvoiceSearchDV", "BulkInvoiceSearchDV", null, pcftest.BulkInvoiceSearchDV.class);
    }
    
    public BulkInvoiceSearchResultsLV getBulkInvoiceSearchResultsLV() {
      return getOrCreateProperty("BulkInvoiceSearchResultsLV", "BulkInvoiceSearchResultsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.BulkInvoiceSearchResultsLV.class);
    }
    
    public BulkInvoiceSearchResultsLV_tb getBulkInvoiceSearchResultsLV_tb() {
      return getOrCreateProperty("BulkInvoiceSearchResultsLV_tb", "BulkInvoiceSearchResultsLV_tb", null, pcftest.BulkInvoiceSearch.BulkInvoiceSearchScreen.BulkInvoiceSearchResultsLV_tb.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.BulkInvoiceSearch.BulkInvoiceSearchScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/search/bulkpay/BulkInvoiceSearch.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class BulkInvoiceSearchResultsLV_tb extends PCFElement {
      public BulkInvoiceSearchResultsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/search/bulkpay/BulkInvoiceSearch.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/search/bulkpay/BulkInvoiceSearch.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class BulkInvoiceSearch_UpLink extends ClickableActionElement {
    public BulkInvoiceSearch_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/search/bulkpay/BulkInvoiceSearch.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/search/bulkpay/BulkInvoiceSearch.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}