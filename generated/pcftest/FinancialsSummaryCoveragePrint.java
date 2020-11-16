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
import pcftest.FinancialsSummaryCoveragePrint.FinancialsSummaryCoveragePrintScreen;
import pcftest.FinancialsSummaryCoveragePrint.FinancialsSummaryCoveragePrintScreen.FinancialsSummaryLV_tb;
import pcftest.FinancialsSummaryCoveragePrint.FinancialsSummaryCoveragePrintScreen._msgs;
import pcftest.FinancialsSummaryCoveragePrint.FinancialsSummaryCoveragePrint_UpLink;
import pcftest.FinancialsSummaryCoveragePrint._Paging;
import pcftest.FinancialsSummaryCoveragePrint.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/financials/summary/print/FinancialsSummaryCoveragePrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class FinancialsSummaryCoveragePrint extends PCFLocation {
  public final static String CHECKSUM = "d96368b03a87a46cc39b9642f50ea162";
  
  public FinancialsSummaryCoveragePrint(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("FinancialsSummaryCoveragePrint"));
  }
  
  public FinancialsSummaryCoveragePrintScreen getFinancialsSummaryCoveragePrintScreen() {
    return getOrCreateProperty("FinancialsSummaryCoveragePrintScreen", "FinancialsSummaryCoveragePrintScreen", null, pcftest.FinancialsSummaryCoveragePrint.FinancialsSummaryCoveragePrintScreen.class);
  }
  
  public FinancialsSummaryCoveragePrint_UpLink getFinancialsSummaryCoveragePrint_UpLink() {
    return getOrCreateProperty("FinancialsSummaryCoveragePrint_UpLink", "FinancialsSummaryCoveragePrint_UpLink", null, pcftest.FinancialsSummaryCoveragePrint.FinancialsSummaryCoveragePrint_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.FinancialsSummaryCoveragePrint._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.FinancialsSummaryCoveragePrint.__crumb__.class);
  }
  
  public ClaimFinancialsGroup get_parent() {
    return getOrCreateProperty("_parent", pcftest.ClaimFinancialsGroup.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/summary/print/FinancialsSummaryCoveragePrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FinancialsSummaryCoveragePrintScreen extends PCFElement {
    public FinancialsSummaryCoveragePrintScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public FinancialsSummaryLV getFinancialsSummaryLV() {
      return getOrCreateProperty("FinancialsSummaryLV", "FinancialsSummaryLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.FinancialsSummaryLV.class);
    }
    
    public FinancialsSummaryLV_tb getFinancialsSummaryLV_tb() {
      return getOrCreateProperty("FinancialsSummaryLV_tb", "FinancialsSummaryLV_tb", null, pcftest.FinancialsSummaryCoveragePrint.FinancialsSummaryCoveragePrintScreen.FinancialsSummaryLV_tb.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.FinancialsSummaryCoveragePrint.FinancialsSummaryCoveragePrintScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/summary/print/FinancialsSummaryCoveragePrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class FinancialsSummaryLV_tb extends PCFElement {
      public FinancialsSummaryLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/summary/print/FinancialsSummaryCoveragePrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/financials/summary/print/FinancialsSummaryCoveragePrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FinancialsSummaryCoveragePrint_UpLink extends ClickableActionElement {
    public FinancialsSummaryCoveragePrint_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/summary/print/FinancialsSummaryCoveragePrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/summary/print/FinancialsSummaryCoveragePrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}