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
import pcftest.FinancialsSummaryExposurePrint.FinancialsSummaryExposurePrintScreen;
import pcftest.FinancialsSummaryExposurePrint.FinancialsSummaryExposurePrintScreen.FinancialsSummaryLV_tb;
import pcftest.FinancialsSummaryExposurePrint.FinancialsSummaryExposurePrintScreen._msgs;
import pcftest.FinancialsSummaryExposurePrint.FinancialsSummaryExposurePrint_UpLink;
import pcftest.FinancialsSummaryExposurePrint._Paging;
import pcftest.FinancialsSummaryExposurePrint.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/financials/summary/print/FinancialsSummaryExposurePrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class FinancialsSummaryExposurePrint extends PCFLocation {
  public final static String CHECKSUM = "cf4371f6b3d66c9c3eb7513ef972b0bd";
  
  public FinancialsSummaryExposurePrint(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("FinancialsSummaryExposurePrint"));
  }
  
  public FinancialsSummaryExposurePrintScreen getFinancialsSummaryExposurePrintScreen() {
    return getOrCreateProperty("FinancialsSummaryExposurePrintScreen", "FinancialsSummaryExposurePrintScreen", null, pcftest.FinancialsSummaryExposurePrint.FinancialsSummaryExposurePrintScreen.class);
  }
  
  public FinancialsSummaryExposurePrint_UpLink getFinancialsSummaryExposurePrint_UpLink() {
    return getOrCreateProperty("FinancialsSummaryExposurePrint_UpLink", "FinancialsSummaryExposurePrint_UpLink", null, pcftest.FinancialsSummaryExposurePrint.FinancialsSummaryExposurePrint_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.FinancialsSummaryExposurePrint._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.FinancialsSummaryExposurePrint.__crumb__.class);
  }
  
  public ClaimFinancialsGroup get_parent() {
    return getOrCreateProperty("_parent", pcftest.ClaimFinancialsGroup.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/summary/print/FinancialsSummaryExposurePrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FinancialsSummaryExposurePrintScreen extends PCFElement {
    public FinancialsSummaryExposurePrintScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public FinancialsSummaryLV getFinancialsSummaryLV() {
      return getOrCreateProperty("FinancialsSummaryLV", "FinancialsSummaryLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.FinancialsSummaryLV.class);
    }
    
    public FinancialsSummaryLV_tb getFinancialsSummaryLV_tb() {
      return getOrCreateProperty("FinancialsSummaryLV_tb", "FinancialsSummaryLV_tb", null, pcftest.FinancialsSummaryExposurePrint.FinancialsSummaryExposurePrintScreen.FinancialsSummaryLV_tb.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.FinancialsSummaryExposurePrint.FinancialsSummaryExposurePrintScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/summary/print/FinancialsSummaryExposurePrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class FinancialsSummaryLV_tb extends PCFElement {
      public FinancialsSummaryLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/summary/print/FinancialsSummaryExposurePrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/financials/summary/print/FinancialsSummaryExposurePrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FinancialsSummaryExposurePrint_UpLink extends ClickableActionElement {
    public FinancialsSummaryExposurePrint_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/summary/print/FinancialsSummaryExposurePrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/summary/print/FinancialsSummaryExposurePrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}