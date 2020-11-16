package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ClaimFinancialsSummary.ClaimFinancialsSummaryScreen;
import pcftest.ClaimFinancialsSummary.ClaimFinancialsSummaryScreen._msgs;
import pcftest.ClaimFinancialsSummary.ClaimFinancialsSummaryScreen.financialsPanel;
import pcftest.ClaimFinancialsSummary.ClaimFinancialsSummaryScreen.financialsPanel.FinancialsSummaryPanelSet_tb;
import pcftest.ClaimFinancialsSummary.ClaimFinancialsSummary_UpLink;
import pcftest.ClaimFinancialsSummary._Paging;
import pcftest.ClaimFinancialsSummary.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/financials/summary/ClaimFinancialsSummary.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimFinancialsSummary extends PCFLocation {
  public final static String CHECKSUM = "2beff004d52167d628bf4b3259aac115";
  
  public ClaimFinancialsSummary(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ClaimFinancialsSummary"));
  }
  
  public ClaimFinancialsSummaryScreen getClaimFinancialsSummaryScreen() {
    return getOrCreateProperty("ClaimFinancialsSummaryScreen", "ClaimFinancialsSummaryScreen", null, pcftest.ClaimFinancialsSummary.ClaimFinancialsSummaryScreen.class);
  }
  
  public ClaimFinancialsSummary_UpLink getClaimFinancialsSummary_UpLink() {
    return getOrCreateProperty("ClaimFinancialsSummary_UpLink", "ClaimFinancialsSummary_UpLink", null, pcftest.ClaimFinancialsSummary.ClaimFinancialsSummary_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ClaimFinancialsSummary._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ClaimFinancialsSummary.__crumb__.class);
  }
  
  public ClaimFinancialsGroup get_parent() {
    return getOrCreateProperty("_parent", pcftest.ClaimFinancialsGroup.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/summary/ClaimFinancialsSummary.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimFinancialsSummaryScreen extends PCFElement {
    public ClaimFinancialsSummaryScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ClaimFinancialsSummary.ClaimFinancialsSummaryScreen._msgs.class);
    }
    
    public financialsPanel getfinancialsPanel() {
      return getOrCreateProperty("financialsPanel", "financialsPanel", null, pcftest.ClaimFinancialsSummary.ClaimFinancialsSummaryScreen.financialsPanel.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/summary/ClaimFinancialsSummary.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _msgs extends MessagesElement {
      public _msgs(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/summary/ClaimFinancialsSummary.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class financialsPanel extends PCFElement {
      public financialsPanel(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public FinancialsSummaryPanelSet_ClaimCostOnly getFinancialsSummaryPanelSet_ClaimCostOnly() {
        return getOrCreateProperty("FinancialsSummaryPanelSet_ClaimCostOnly", "FinancialsSummaryPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.FinancialsSummaryPanelSet_ClaimCostOnly.class);
      }
      
      public FinancialsSummaryPanelSet_Claimant getFinancialsSummaryPanelSet_Claimant() {
        return getOrCreateProperty("FinancialsSummaryPanelSet_Claimant", "FinancialsSummaryPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.FinancialsSummaryPanelSet_Claimant.class);
      }
      
      public FinancialsSummaryPanelSet_Coverage getFinancialsSummaryPanelSet_Coverage() {
        return getOrCreateProperty("FinancialsSummaryPanelSet_Coverage", "FinancialsSummaryPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.FinancialsSummaryPanelSet_Coverage.class);
      }
      
      public FinancialsSummaryPanelSet_Exposure getFinancialsSummaryPanelSet_Exposure() {
        return getOrCreateProperty("FinancialsSummaryPanelSet_Exposure", "FinancialsSummaryPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.FinancialsSummaryPanelSet_Exposure.class);
      }
      
      public FinancialsSummaryPanelSet_ExposureOnly getFinancialsSummaryPanelSet_ExposureOnly() {
        return getOrCreateProperty("FinancialsSummaryPanelSet_ExposureOnly", "FinancialsSummaryPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.FinancialsSummaryPanelSet_ExposureOnly.class);
      }
      
      public FinancialsSummaryPanelSet_RecoveryCategory getFinancialsSummaryPanelSet_RecoveryCategory() {
        return getOrCreateProperty("FinancialsSummaryPanelSet_RecoveryCategory", "FinancialsSummaryPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.FinancialsSummaryPanelSet_RecoveryCategory.class);
      }
      
      public FinancialsSummaryPanelSet_ReservingCurrency getFinancialsSummaryPanelSet_ReservingCurrency() {
        return getOrCreateProperty("FinancialsSummaryPanelSet_ReservingCurrency", "FinancialsSummaryPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.FinancialsSummaryPanelSet_ReservingCurrency.class);
      }
      
      public FinancialsSummaryPanelSet_tb getFinancialsSummaryPanelSet_tb() {
        return getOrCreateProperty("FinancialsSummaryPanelSet_tb", "FinancialsSummaryPanelSet_tb", null, pcftest.ClaimFinancialsSummary.ClaimFinancialsSummaryScreen.financialsPanel.FinancialsSummaryPanelSet_tb.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/financials/summary/ClaimFinancialsSummary.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class FinancialsSummaryPanelSet_tb extends PCFElement {
        public FinancialsSummaryPanelSet_tb(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public SelectElement getFinancialsSummaryRangeInput() {
          return getOrCreateProperty("FinancialsSummaryRangeInput", "FinancialsSummaryRangeInput", null, gw.smoketest.platform.web.SelectElement.class);
        }
        
        public SelectElement getfloatingFinancialsInputWidget() {
          return getOrCreateProperty("floatingFinancialsInputWidget", "floatingFinancialsInputWidget", null, gw.smoketest.platform.web.SelectElement.class);
        }
        
        
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/summary/ClaimFinancialsSummary.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimFinancialsSummary_UpLink extends ClickableActionElement {
    public ClaimFinancialsSummary_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/summary/ClaimFinancialsSummary.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/summary/ClaimFinancialsSummary.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}