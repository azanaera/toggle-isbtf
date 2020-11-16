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
import pcftest.FinancialsSummaryRecoveryCategoryPrint.FinancialsSummaryRecoveryCategoryPrintScreen;
import pcftest.FinancialsSummaryRecoveryCategoryPrint.FinancialsSummaryRecoveryCategoryPrintScreen.FinancialsSummaryRecoveriesLV_tb;
import pcftest.FinancialsSummaryRecoveryCategoryPrint.FinancialsSummaryRecoveryCategoryPrintScreen._msgs;
import pcftest.FinancialsSummaryRecoveryCategoryPrint.FinancialsSummaryRecoveryCategoryPrint_UpLink;
import pcftest.FinancialsSummaryRecoveryCategoryPrint._Paging;
import pcftest.FinancialsSummaryRecoveryCategoryPrint.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/financials/summary/print/FinancialsSummaryRecoveryCategoryPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class FinancialsSummaryRecoveryCategoryPrint extends PCFLocation {
  public final static String CHECKSUM = "f8266d0e55c640fefd073ccd0afbf383";
  
  public FinancialsSummaryRecoveryCategoryPrint(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("FinancialsSummaryRecoveryCategoryPrint"));
  }
  
  public FinancialsSummaryRecoveryCategoryPrintScreen getFinancialsSummaryRecoveryCategoryPrintScreen() {
    return getOrCreateProperty("FinancialsSummaryRecoveryCategoryPrintScreen", "FinancialsSummaryRecoveryCategoryPrintScreen", null, pcftest.FinancialsSummaryRecoveryCategoryPrint.FinancialsSummaryRecoveryCategoryPrintScreen.class);
  }
  
  public FinancialsSummaryRecoveryCategoryPrint_UpLink getFinancialsSummaryRecoveryCategoryPrint_UpLink() {
    return getOrCreateProperty("FinancialsSummaryRecoveryCategoryPrint_UpLink", "FinancialsSummaryRecoveryCategoryPrint_UpLink", null, pcftest.FinancialsSummaryRecoveryCategoryPrint.FinancialsSummaryRecoveryCategoryPrint_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.FinancialsSummaryRecoveryCategoryPrint._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.FinancialsSummaryRecoveryCategoryPrint.__crumb__.class);
  }
  
  public ClaimFinancialsGroup get_parent() {
    return getOrCreateProperty("_parent", pcftest.ClaimFinancialsGroup.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/summary/print/FinancialsSummaryRecoveryCategoryPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FinancialsSummaryRecoveryCategoryPrintScreen extends PCFElement {
    public FinancialsSummaryRecoveryCategoryPrintScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public FinancialsSummaryRecoveriesLV getFinancialsSummaryRecoveriesLV() {
      return getOrCreateProperty("FinancialsSummaryRecoveriesLV", "FinancialsSummaryRecoveriesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.FinancialsSummaryRecoveriesLV.class);
    }
    
    public FinancialsSummaryRecoveriesLV_tb getFinancialsSummaryRecoveriesLV_tb() {
      return getOrCreateProperty("FinancialsSummaryRecoveriesLV_tb", "FinancialsSummaryRecoveriesLV_tb", null, pcftest.FinancialsSummaryRecoveryCategoryPrint.FinancialsSummaryRecoveryCategoryPrintScreen.FinancialsSummaryRecoveriesLV_tb.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.FinancialsSummaryRecoveryCategoryPrint.FinancialsSummaryRecoveryCategoryPrintScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/summary/print/FinancialsSummaryRecoveryCategoryPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class FinancialsSummaryRecoveriesLV_tb extends PCFElement {
      public FinancialsSummaryRecoveriesLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/summary/print/FinancialsSummaryRecoveryCategoryPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/financials/summary/print/FinancialsSummaryRecoveryCategoryPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FinancialsSummaryRecoveryCategoryPrint_UpLink extends ClickableActionElement {
    public FinancialsSummaryRecoveryCategoryPrint_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/summary/print/FinancialsSummaryRecoveryCategoryPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/summary/print/FinancialsSummaryRecoveryCategoryPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}