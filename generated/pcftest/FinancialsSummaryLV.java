package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.IteratorEntries;
import gw.smoketest.platform.web.IteratorEntryCheckboxElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.RowElement;
import gw.smoketest.platform.web.SelectorCellElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.FinancialsSummaryLV.FuturePaymentsHeader;
import pcftest.FinancialsSummaryLV.OpenRecoveryReservesHeader;
import pcftest.FinancialsSummaryLV.RemainingReservesHeader;
import pcftest.FinancialsSummaryLV.TotalIncurredNetHeader;
import pcftest.FinancialsSummaryLV.TotalPaymentsHeader;
import pcftest.FinancialsSummaryLV.TotalRecoveriesHeader;
import pcftest.FinancialsSummaryLV.entry;
import pcftest.FinancialsSummaryLV.entry.FuturePayments;
import pcftest.FinancialsSummaryLV.entry.OpenRecoveryReserves;
import pcftest.FinancialsSummaryLV.entry.RemainingReserves;
import pcftest.FinancialsSummaryLV.entry.TotalIncurredNet;
import pcftest.FinancialsSummaryLV.entry.TotalPayments;
import pcftest.FinancialsSummaryLV.entry.TotalRecoveries;
import pcftest.FinancialsSummaryLV.entry._Select;
import pcftest.FinancialsSummaryLV.entry._ViewDetail;
import pcftest.FinancialsSummaryLV.entry.expandCollapse;
import pcftest.FinancialsSummaryLV.entry.ts;
import pcftest.FinancialsSummaryLV.entry.ts.QuickMenu_CreateCheck;
import pcftest.FinancialsSummaryLV.entry.ts.QuickMenu_EditReserve;
import pcftest.FinancialsSummaryLV.entry.ts.QuickMenu_QuickCheck;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/financials/summary/FinancialsSummaryLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class FinancialsSummaryLV extends PCFElement {
  public final static String CHECKSUM = "437fc932d62e7d45051076cc35778d73";
  
  public FinancialsSummaryLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getFinancialsSummaryLabelHeader() {
    return getOrCreateProperty("FinancialsSummaryLabelHeader", "FinancialsSummaryLabelHeader", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public FuturePaymentsHeader getFuturePaymentsHeader() {
    return getOrCreateProperty("FuturePaymentsHeader", "FuturePaymentsHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.FinancialsSummaryLV.FuturePaymentsHeader.class);
  }
  
  public OpenRecoveryReservesHeader getOpenRecoveryReservesHeader() {
    return getOrCreateProperty("OpenRecoveryReservesHeader", "OpenRecoveryReservesHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.FinancialsSummaryLV.OpenRecoveryReservesHeader.class);
  }
  
  public RemainingReservesHeader getRemainingReservesHeader() {
    return getOrCreateProperty("RemainingReservesHeader", "RemainingReservesHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.FinancialsSummaryLV.RemainingReservesHeader.class);
  }
  
  public TotalIncurredNetHeader getTotalIncurredNetHeader() {
    return getOrCreateProperty("TotalIncurredNetHeader", "TotalIncurredNetHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.FinancialsSummaryLV.TotalIncurredNetHeader.class);
  }
  
  public TotalPaymentsHeader getTotalPaymentsHeader() {
    return getOrCreateProperty("TotalPaymentsHeader", "TotalPaymentsHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.FinancialsSummaryLV.TotalPaymentsHeader.class);
  }
  
  public TotalRecoveriesHeader getTotalRecoveriesHeader() {
    return getOrCreateProperty("TotalRecoveriesHeader", "TotalRecoveriesHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.FinancialsSummaryLV.TotalRecoveriesHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntries<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.RowTreeRow, pcftest.FinancialsSummaryLV.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
  }
  
  public ValueElement gettsHeader() {
    return getOrCreateProperty("tsHeader", "tsHeader", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/summary/FinancialsSummaryLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FuturePaymentsHeader extends ValueElement {
    public FuturePaymentsHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/summary/FinancialsSummaryLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class OpenRecoveryReservesHeader extends ValueElement {
    public OpenRecoveryReservesHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/summary/FinancialsSummaryLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RemainingReservesHeader extends ValueElement {
    public RemainingReservesHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/summary/FinancialsSummaryLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TotalIncurredNetHeader extends ValueElement {
    public TotalIncurredNetHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/summary/FinancialsSummaryLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TotalPaymentsHeader extends ValueElement {
    public TotalPaymentsHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/summary/FinancialsSummaryLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TotalRecoveriesHeader extends ValueElement {
    public TotalRecoveriesHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/summary/FinancialsSummaryLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getFinancialsSummaryLabel() {
      return getOrCreateProperty("FinancialsSummaryLabel", "FinancialsSummaryLabel", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public FuturePayments getFuturePayments() {
      return getOrCreateProperty("FuturePayments", "FuturePayments", null, pcftest.FinancialsSummaryLV.entry.FuturePayments.class);
    }
    
    public OpenRecoveryReserves getOpenRecoveryReserves() {
      return getOrCreateProperty("OpenRecoveryReserves", "OpenRecoveryReserves", null, pcftest.FinancialsSummaryLV.entry.OpenRecoveryReserves.class);
    }
    
    public RemainingReserves getRemainingReserves() {
      return getOrCreateProperty("RemainingReserves", "RemainingReserves", null, pcftest.FinancialsSummaryLV.entry.RemainingReserves.class);
    }
    
    public TotalIncurredNet getTotalIncurredNet() {
      return getOrCreateProperty("TotalIncurredNet", "TotalIncurredNet", null, pcftest.FinancialsSummaryLV.entry.TotalIncurredNet.class);
    }
    
    public TotalPayments getTotalPayments() {
      return getOrCreateProperty("TotalPayments", "TotalPayments", null, pcftest.FinancialsSummaryLV.entry.TotalPayments.class);
    }
    
    public TotalRecoveries getTotalRecoveries() {
      return getOrCreateProperty("TotalRecoveries", "TotalRecoveries", null, pcftest.FinancialsSummaryLV.entry.TotalRecoveries.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntries<entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.RowTreeRow, pcftest.FinancialsSummaryLV.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.FinancialsSummaryLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.FinancialsSummaryLV.entry._ViewDetail.class);
    }
    
    public ValueElement getcontainerLabel() {
      return getOrCreateProperty("containerLabel", "containerLabel", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public expandCollapse getexpandCollapse() {
      return getOrCreateProperty("expandCollapse", "expandCollapse", gw.smoketest.platform.web.PCFElementId.PCFElementScope.RowTreeToggle, pcftest.FinancialsSummaryLV.entry.expandCollapse.class);
    }
    
    public ts getts() {
      return getOrCreateProperty("ts", "ts", null, pcftest.FinancialsSummaryLV.entry.ts.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/summary/FinancialsSummaryLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class FuturePayments extends ValueElement {
      public FuturePayments(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/summary/FinancialsSummaryLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class OpenRecoveryReserves extends ValueElement {
      public OpenRecoveryReserves(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/summary/FinancialsSummaryLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class RemainingReserves extends ValueElement {
      public RemainingReserves(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/summary/FinancialsSummaryLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class TotalIncurredNet extends ValueElement {
      public TotalIncurredNet(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/summary/FinancialsSummaryLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class TotalPayments extends ValueElement {
      public TotalPayments(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/summary/FinancialsSummaryLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class TotalRecoveries extends ValueElement {
      public TotalRecoveries(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/summary/FinancialsSummaryLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/summary/FinancialsSummaryLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ViewDetail extends BooleanValueElement {
      public _ViewDetail(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/summary/FinancialsSummaryLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class expandCollapse extends ClickableActionElement {
      public expandCollapse(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/summary/FinancialsSummaryLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ts extends ValueElement {
      public ts(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public QuickMenu_CreateCheck getQuickMenu_CreateCheck() {
        return getOrCreateProperty("QuickMenu_CreateCheck", "QuickMenu_CreateCheck", null, pcftest.FinancialsSummaryLV.entry.ts.QuickMenu_CreateCheck.class);
      }
      
      public QuickMenu_EditReserve getQuickMenu_EditReserve() {
        return getOrCreateProperty("QuickMenu_EditReserve", "QuickMenu_EditReserve", null, pcftest.FinancialsSummaryLV.entry.ts.QuickMenu_EditReserve.class);
      }
      
      public QuickMenu_QuickCheck getQuickMenu_QuickCheck() {
        return getOrCreateProperty("QuickMenu_QuickCheck", "QuickMenu_QuickCheck", null, pcftest.FinancialsSummaryLV.entry.ts.QuickMenu_QuickCheck.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/financials/summary/FinancialsSummaryLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class QuickMenu_CreateCheck extends ClickableActionElement {
        public QuickMenu_CreateCheck(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/financials/summary/FinancialsSummaryLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class QuickMenu_EditReserve extends ClickableActionElement {
        public QuickMenu_EditReserve(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public NewReserveSet click() {
          return clickThis(pcftest.NewReserveSet.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/financials/summary/FinancialsSummaryLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class QuickMenu_QuickCheck extends ClickableActionElement {
        public QuickMenu_QuickCheck(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      
    }
    
    
  }
  
  
}