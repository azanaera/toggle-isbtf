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
import pcftest.FinancialsSummaryRecoveriesLV.OpenRecoveryReservesHeader;
import pcftest.FinancialsSummaryRecoveriesLV.TotalRecoveriesHeader;
import pcftest.FinancialsSummaryRecoveriesLV.TotalRecoveryReservesHeader;
import pcftest.FinancialsSummaryRecoveriesLV.entry;
import pcftest.FinancialsSummaryRecoveriesLV.entry.OpenRecoveryReserves;
import pcftest.FinancialsSummaryRecoveriesLV.entry.TotalRecoveries;
import pcftest.FinancialsSummaryRecoveriesLV.entry.TotalRecoveryReserves;
import pcftest.FinancialsSummaryRecoveriesLV.entry._Select;
import pcftest.FinancialsSummaryRecoveriesLV.entry._ViewDetail;
import pcftest.FinancialsSummaryRecoveriesLV.entry.expandCollapse;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/financials/summary/FinancialsSummaryRecoveriesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class FinancialsSummaryRecoveriesLV extends PCFElement {
  public final static String CHECKSUM = "5736cf6ab80e977bb7c928154fe6a222";
  
  public FinancialsSummaryRecoveriesLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getFinancialsSummaryLabelHeader() {
    return getOrCreateProperty("FinancialsSummaryLabelHeader", "FinancialsSummaryLabelHeader", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public OpenRecoveryReservesHeader getOpenRecoveryReservesHeader() {
    return getOrCreateProperty("OpenRecoveryReservesHeader", "OpenRecoveryReservesHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.FinancialsSummaryRecoveriesLV.OpenRecoveryReservesHeader.class);
  }
  
  public TotalRecoveriesHeader getTotalRecoveriesHeader() {
    return getOrCreateProperty("TotalRecoveriesHeader", "TotalRecoveriesHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.FinancialsSummaryRecoveriesLV.TotalRecoveriesHeader.class);
  }
  
  public TotalRecoveryReservesHeader getTotalRecoveryReservesHeader() {
    return getOrCreateProperty("TotalRecoveryReservesHeader", "TotalRecoveryReservesHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.FinancialsSummaryRecoveriesLV.TotalRecoveryReservesHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntries<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.RowTreeRow, pcftest.FinancialsSummaryRecoveriesLV.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/summary/FinancialsSummaryRecoveriesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class OpenRecoveryReservesHeader extends ValueElement {
    public OpenRecoveryReservesHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/summary/FinancialsSummaryRecoveriesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TotalRecoveriesHeader extends ValueElement {
    public TotalRecoveriesHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/summary/FinancialsSummaryRecoveriesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TotalRecoveryReservesHeader extends ValueElement {
    public TotalRecoveryReservesHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/summary/FinancialsSummaryRecoveriesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getFinancialsSummaryLabel() {
      return getOrCreateProperty("FinancialsSummaryLabel", "FinancialsSummaryLabel", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public OpenRecoveryReserves getOpenRecoveryReserves() {
      return getOrCreateProperty("OpenRecoveryReserves", "OpenRecoveryReserves", null, pcftest.FinancialsSummaryRecoveriesLV.entry.OpenRecoveryReserves.class);
    }
    
    public TotalRecoveries getTotalRecoveries() {
      return getOrCreateProperty("TotalRecoveries", "TotalRecoveries", null, pcftest.FinancialsSummaryRecoveriesLV.entry.TotalRecoveries.class);
    }
    
    public TotalRecoveryReserves getTotalRecoveryReserves() {
      return getOrCreateProperty("TotalRecoveryReserves", "TotalRecoveryReserves", null, pcftest.FinancialsSummaryRecoveriesLV.entry.TotalRecoveryReserves.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntries<entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.RowTreeRow, pcftest.FinancialsSummaryRecoveriesLV.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.FinancialsSummaryRecoveriesLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.FinancialsSummaryRecoveriesLV.entry._ViewDetail.class);
    }
    
    public ValueElement getcontainerLabel() {
      return getOrCreateProperty("containerLabel", "containerLabel", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public expandCollapse getexpandCollapse() {
      return getOrCreateProperty("expandCollapse", "expandCollapse", gw.smoketest.platform.web.PCFElementId.PCFElementScope.RowTreeToggle, pcftest.FinancialsSummaryRecoveriesLV.entry.expandCollapse.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/summary/FinancialsSummaryRecoveriesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class OpenRecoveryReserves extends ValueElement {
      public OpenRecoveryReserves(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/summary/FinancialsSummaryRecoveriesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class TotalRecoveries extends ValueElement {
      public TotalRecoveries(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/summary/FinancialsSummaryRecoveriesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class TotalRecoveryReserves extends ValueElement {
      public TotalRecoveryReserves(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/summary/FinancialsSummaryRecoveriesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/summary/FinancialsSummaryRecoveriesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ViewDetail extends BooleanValueElement {
      public _ViewDetail(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/summary/FinancialsSummaryRecoveriesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class expandCollapse extends ClickableActionElement {
      public expandCollapse(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  
}