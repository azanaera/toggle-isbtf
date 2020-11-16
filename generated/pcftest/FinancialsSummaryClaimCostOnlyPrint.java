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
import pcftest.FinancialsSummaryClaimCostOnlyPrint.FinancialsSummaryClaimCostOnlyPrintScreen;
import pcftest.FinancialsSummaryClaimCostOnlyPrint.FinancialsSummaryClaimCostOnlyPrintScreen.FinancialsSummaryLV_tb;
import pcftest.FinancialsSummaryClaimCostOnlyPrint.FinancialsSummaryClaimCostOnlyPrintScreen._msgs;
import pcftest.FinancialsSummaryClaimCostOnlyPrint.FinancialsSummaryClaimCostOnlyPrint_UpLink;
import pcftest.FinancialsSummaryClaimCostOnlyPrint._Paging;
import pcftest.FinancialsSummaryClaimCostOnlyPrint.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/financials/summary/print/FinancialsSummaryClaimCostOnlyPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class FinancialsSummaryClaimCostOnlyPrint extends PCFLocation {
  public final static String CHECKSUM = "e5463e5cffde253a78feef0bcbc1114b";
  
  public FinancialsSummaryClaimCostOnlyPrint(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("FinancialsSummaryClaimCostOnlyPrint"));
  }
  
  public FinancialsSummaryClaimCostOnlyPrintScreen getFinancialsSummaryClaimCostOnlyPrintScreen() {
    return getOrCreateProperty("FinancialsSummaryClaimCostOnlyPrintScreen", "FinancialsSummaryClaimCostOnlyPrintScreen", null, pcftest.FinancialsSummaryClaimCostOnlyPrint.FinancialsSummaryClaimCostOnlyPrintScreen.class);
  }
  
  public FinancialsSummaryClaimCostOnlyPrint_UpLink getFinancialsSummaryClaimCostOnlyPrint_UpLink() {
    return getOrCreateProperty("FinancialsSummaryClaimCostOnlyPrint_UpLink", "FinancialsSummaryClaimCostOnlyPrint_UpLink", null, pcftest.FinancialsSummaryClaimCostOnlyPrint.FinancialsSummaryClaimCostOnlyPrint_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.FinancialsSummaryClaimCostOnlyPrint._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.FinancialsSummaryClaimCostOnlyPrint.__crumb__.class);
  }
  
  public ClaimFinancialsGroup get_parent() {
    return getOrCreateProperty("_parent", pcftest.ClaimFinancialsGroup.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/summary/print/FinancialsSummaryClaimCostOnlyPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FinancialsSummaryClaimCostOnlyPrintScreen extends PCFElement {
    public FinancialsSummaryClaimCostOnlyPrintScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public FinancialsSummaryLV getFinancialsSummaryLV() {
      return getOrCreateProperty("FinancialsSummaryLV", "FinancialsSummaryLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.FinancialsSummaryLV.class);
    }
    
    public FinancialsSummaryLV_tb getFinancialsSummaryLV_tb() {
      return getOrCreateProperty("FinancialsSummaryLV_tb", "FinancialsSummaryLV_tb", null, pcftest.FinancialsSummaryClaimCostOnlyPrint.FinancialsSummaryClaimCostOnlyPrintScreen.FinancialsSummaryLV_tb.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.FinancialsSummaryClaimCostOnlyPrint.FinancialsSummaryClaimCostOnlyPrintScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/summary/print/FinancialsSummaryClaimCostOnlyPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class FinancialsSummaryLV_tb extends PCFElement {
      public FinancialsSummaryLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/summary/print/FinancialsSummaryClaimCostOnlyPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/financials/summary/print/FinancialsSummaryClaimCostOnlyPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FinancialsSummaryClaimCostOnlyPrint_UpLink extends ClickableActionElement {
    public FinancialsSummaryClaimCostOnlyPrint_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/summary/print/FinancialsSummaryClaimCostOnlyPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/summary/print/FinancialsSummaryClaimCostOnlyPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}