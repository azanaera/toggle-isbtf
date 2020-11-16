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
import pcftest.FinancialsSummaryExposureOnlyPrint.FinancialsSummaryExposureOnlyPrintScreen;
import pcftest.FinancialsSummaryExposureOnlyPrint.FinancialsSummaryExposureOnlyPrintScreen.FinancialsSummaryLV_tb;
import pcftest.FinancialsSummaryExposureOnlyPrint.FinancialsSummaryExposureOnlyPrintScreen._msgs;
import pcftest.FinancialsSummaryExposureOnlyPrint.FinancialsSummaryExposureOnlyPrint_UpLink;
import pcftest.FinancialsSummaryExposureOnlyPrint._Paging;
import pcftest.FinancialsSummaryExposureOnlyPrint.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/financials/summary/print/FinancialsSummaryExposureOnlyPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class FinancialsSummaryExposureOnlyPrint extends PCFLocation {
  public final static String CHECKSUM = "60d457f0808514f9684d3b1fb76517d3";
  
  public FinancialsSummaryExposureOnlyPrint(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("FinancialsSummaryExposureOnlyPrint"));
  }
  
  public FinancialsSummaryExposureOnlyPrintScreen getFinancialsSummaryExposureOnlyPrintScreen() {
    return getOrCreateProperty("FinancialsSummaryExposureOnlyPrintScreen", "FinancialsSummaryExposureOnlyPrintScreen", null, pcftest.FinancialsSummaryExposureOnlyPrint.FinancialsSummaryExposureOnlyPrintScreen.class);
  }
  
  public FinancialsSummaryExposureOnlyPrint_UpLink getFinancialsSummaryExposureOnlyPrint_UpLink() {
    return getOrCreateProperty("FinancialsSummaryExposureOnlyPrint_UpLink", "FinancialsSummaryExposureOnlyPrint_UpLink", null, pcftest.FinancialsSummaryExposureOnlyPrint.FinancialsSummaryExposureOnlyPrint_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.FinancialsSummaryExposureOnlyPrint._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.FinancialsSummaryExposureOnlyPrint.__crumb__.class);
  }
  
  public ClaimFinancialsGroup get_parent() {
    return getOrCreateProperty("_parent", pcftest.ClaimFinancialsGroup.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/summary/print/FinancialsSummaryExposureOnlyPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FinancialsSummaryExposureOnlyPrintScreen extends PCFElement {
    public FinancialsSummaryExposureOnlyPrintScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public FinancialsSummaryLV getFinancialsSummaryLV() {
      return getOrCreateProperty("FinancialsSummaryLV", "FinancialsSummaryLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.FinancialsSummaryLV.class);
    }
    
    public FinancialsSummaryLV_tb getFinancialsSummaryLV_tb() {
      return getOrCreateProperty("FinancialsSummaryLV_tb", "FinancialsSummaryLV_tb", null, pcftest.FinancialsSummaryExposureOnlyPrint.FinancialsSummaryExposureOnlyPrintScreen.FinancialsSummaryLV_tb.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.FinancialsSummaryExposureOnlyPrint.FinancialsSummaryExposureOnlyPrintScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/summary/print/FinancialsSummaryExposureOnlyPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class FinancialsSummaryLV_tb extends PCFElement {
      public FinancialsSummaryLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/summary/print/FinancialsSummaryExposureOnlyPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/financials/summary/print/FinancialsSummaryExposureOnlyPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FinancialsSummaryExposureOnlyPrint_UpLink extends ClickableActionElement {
    public FinancialsSummaryExposureOnlyPrint_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/summary/print/FinancialsSummaryExposureOnlyPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/summary/print/FinancialsSummaryExposureOnlyPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}