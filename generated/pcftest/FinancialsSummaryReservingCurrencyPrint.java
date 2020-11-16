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
import pcftest.FinancialsSummaryReservingCurrencyPrint.FinancialsSummaryReservingCurrencyPrintScreen;
import pcftest.FinancialsSummaryReservingCurrencyPrint.FinancialsSummaryReservingCurrencyPrintScreen.FinancialsSummaryLV_tb;
import pcftest.FinancialsSummaryReservingCurrencyPrint.FinancialsSummaryReservingCurrencyPrintScreen._msgs;
import pcftest.FinancialsSummaryReservingCurrencyPrint.FinancialsSummaryReservingCurrencyPrint_UpLink;
import pcftest.FinancialsSummaryReservingCurrencyPrint._Paging;
import pcftest.FinancialsSummaryReservingCurrencyPrint.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/financials/summary/print/FinancialsSummaryReservingCurrencyPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class FinancialsSummaryReservingCurrencyPrint extends PCFLocation {
  public final static String CHECKSUM = "27de8f1a33b74481b698f0997c16672d";
  
  public FinancialsSummaryReservingCurrencyPrint(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("FinancialsSummaryReservingCurrencyPrint"));
  }
  
  public FinancialsSummaryReservingCurrencyPrintScreen getFinancialsSummaryReservingCurrencyPrintScreen() {
    return getOrCreateProperty("FinancialsSummaryReservingCurrencyPrintScreen", "FinancialsSummaryReservingCurrencyPrintScreen", null, pcftest.FinancialsSummaryReservingCurrencyPrint.FinancialsSummaryReservingCurrencyPrintScreen.class);
  }
  
  public FinancialsSummaryReservingCurrencyPrint_UpLink getFinancialsSummaryReservingCurrencyPrint_UpLink() {
    return getOrCreateProperty("FinancialsSummaryReservingCurrencyPrint_UpLink", "FinancialsSummaryReservingCurrencyPrint_UpLink", null, pcftest.FinancialsSummaryReservingCurrencyPrint.FinancialsSummaryReservingCurrencyPrint_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.FinancialsSummaryReservingCurrencyPrint._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.FinancialsSummaryReservingCurrencyPrint.__crumb__.class);
  }
  
  public ClaimFinancialsGroup get_parent() {
    return getOrCreateProperty("_parent", pcftest.ClaimFinancialsGroup.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/summary/print/FinancialsSummaryReservingCurrencyPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FinancialsSummaryReservingCurrencyPrintScreen extends PCFElement {
    public FinancialsSummaryReservingCurrencyPrintScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public FinancialsSummaryLV getFinancialsSummaryLV() {
      return getOrCreateProperty("FinancialsSummaryLV", "FinancialsSummaryLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.FinancialsSummaryLV.class);
    }
    
    public FinancialsSummaryLV_tb getFinancialsSummaryLV_tb() {
      return getOrCreateProperty("FinancialsSummaryLV_tb", "FinancialsSummaryLV_tb", null, pcftest.FinancialsSummaryReservingCurrencyPrint.FinancialsSummaryReservingCurrencyPrintScreen.FinancialsSummaryLV_tb.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.FinancialsSummaryReservingCurrencyPrint.FinancialsSummaryReservingCurrencyPrintScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/summary/print/FinancialsSummaryReservingCurrencyPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class FinancialsSummaryLV_tb extends PCFElement {
      public FinancialsSummaryLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/summary/print/FinancialsSummaryReservingCurrencyPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/financials/summary/print/FinancialsSummaryReservingCurrencyPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FinancialsSummaryReservingCurrencyPrint_UpLink extends ClickableActionElement {
    public FinancialsSummaryReservingCurrencyPrint_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/summary/print/FinancialsSummaryReservingCurrencyPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/summary/print/FinancialsSummaryReservingCurrencyPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}