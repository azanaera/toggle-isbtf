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
import pcftest.FinancialsSummaryClaimantPrint.FinancialsSummaryClaimantPrintScreen;
import pcftest.FinancialsSummaryClaimantPrint.FinancialsSummaryClaimantPrintScreen.FinancialsSummaryLV_tb;
import pcftest.FinancialsSummaryClaimantPrint.FinancialsSummaryClaimantPrintScreen._msgs;
import pcftest.FinancialsSummaryClaimantPrint.FinancialsSummaryClaimantPrint_UpLink;
import pcftest.FinancialsSummaryClaimantPrint._Paging;
import pcftest.FinancialsSummaryClaimantPrint.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/financials/summary/print/FinancialsSummaryClaimantPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class FinancialsSummaryClaimantPrint extends PCFLocation {
  public final static String CHECKSUM = "040695fc20716a9caea86aa373e425b0";
  
  public FinancialsSummaryClaimantPrint(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("FinancialsSummaryClaimantPrint"));
  }
  
  public FinancialsSummaryClaimantPrintScreen getFinancialsSummaryClaimantPrintScreen() {
    return getOrCreateProperty("FinancialsSummaryClaimantPrintScreen", "FinancialsSummaryClaimantPrintScreen", null, pcftest.FinancialsSummaryClaimantPrint.FinancialsSummaryClaimantPrintScreen.class);
  }
  
  public FinancialsSummaryClaimantPrint_UpLink getFinancialsSummaryClaimantPrint_UpLink() {
    return getOrCreateProperty("FinancialsSummaryClaimantPrint_UpLink", "FinancialsSummaryClaimantPrint_UpLink", null, pcftest.FinancialsSummaryClaimantPrint.FinancialsSummaryClaimantPrint_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.FinancialsSummaryClaimantPrint._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.FinancialsSummaryClaimantPrint.__crumb__.class);
  }
  
  public ClaimFinancialsGroup get_parent() {
    return getOrCreateProperty("_parent", pcftest.ClaimFinancialsGroup.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/summary/print/FinancialsSummaryClaimantPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FinancialsSummaryClaimantPrintScreen extends PCFElement {
    public FinancialsSummaryClaimantPrintScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public FinancialsSummaryLV getFinancialsSummaryLV() {
      return getOrCreateProperty("FinancialsSummaryLV", "FinancialsSummaryLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.FinancialsSummaryLV.class);
    }
    
    public FinancialsSummaryLV_tb getFinancialsSummaryLV_tb() {
      return getOrCreateProperty("FinancialsSummaryLV_tb", "FinancialsSummaryLV_tb", null, pcftest.FinancialsSummaryClaimantPrint.FinancialsSummaryClaimantPrintScreen.FinancialsSummaryLV_tb.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.FinancialsSummaryClaimantPrint.FinancialsSummaryClaimantPrintScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/summary/print/FinancialsSummaryClaimantPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class FinancialsSummaryLV_tb extends PCFElement {
      public FinancialsSummaryLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/summary/print/FinancialsSummaryClaimantPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/financials/summary/print/FinancialsSummaryClaimantPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FinancialsSummaryClaimantPrint_UpLink extends ClickableActionElement {
    public FinancialsSummaryClaimantPrint_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/summary/print/FinancialsSummaryClaimantPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/summary/print/FinancialsSummaryClaimantPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}