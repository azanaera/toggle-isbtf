package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.IteratorEntriesWithPaging;
import gw.smoketest.platform.web.IteratorEntryCheckboxElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.PagingElement;
import gw.smoketest.platform.web.RowElement;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.SelectorCellElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.RecoveryReserveSetLV.AmountHeader;
import pcftest.RecoveryReserveSetLV.CostCategoryHeader;
import pcftest.RecoveryReserveSetLV.CostTypeHeader;
import pcftest.RecoveryReserveSetLV.CoverageHeader;
import pcftest.RecoveryReserveSetLV.ExposureHeader;
import pcftest.RecoveryReserveSetLV.OpenRecoveryReservesHeader;
import pcftest.RecoveryReserveSetLV.RecoveryCategoryHeader;
import pcftest.RecoveryReserveSetLV.ReservingCurrencyHeader;
import pcftest.RecoveryReserveSetLV._ListPaging;
import pcftest.RecoveryReserveSetLV.entry;
import pcftest.RecoveryReserveSetLV.entry.Amount;
import pcftest.RecoveryReserveSetLV.entry.Coverage;
import pcftest.RecoveryReserveSetLV.entry.ReservingCurrency;
import pcftest.RecoveryReserveSetLV.entry._Select;
import pcftest.RecoveryReserveSetLV.entry._ViewDetail;
import typekey.CoverageType;
import typekey.Currency;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/financials/transactions/RecoveryReserveSetLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class RecoveryReserveSetLV extends PCFElement {
  public final static String CHECKSUM = "614bccddf4fcfb7ee6cfa77e4c9fe33b";
  
  public RecoveryReserveSetLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getAmountFooter() {
    return getOrCreateProperty("AmountFooter", "AmountFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public AmountHeader getAmountHeader() {
    return getOrCreateProperty("AmountHeader", "AmountHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.RecoveryReserveSetLV.AmountHeader.class);
  }
  
  public CostCategoryHeader getCostCategoryHeader() {
    return getOrCreateProperty("CostCategoryHeader", "CostCategoryHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.RecoveryReserveSetLV.CostCategoryHeader.class);
  }
  
  public CostTypeHeader getCostTypeHeader() {
    return getOrCreateProperty("CostTypeHeader", "CostTypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.RecoveryReserveSetLV.CostTypeHeader.class);
  }
  
  public CoverageHeader getCoverageHeader() {
    return getOrCreateProperty("CoverageHeader", "CoverageHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.RecoveryReserveSetLV.CoverageHeader.class);
  }
  
  public ValueElement getExposureFooter() {
    return getOrCreateProperty("ExposureFooter", "ExposureFooter", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ExposureHeader getExposureHeader() {
    return getOrCreateProperty("ExposureHeader", "ExposureHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.RecoveryReserveSetLV.ExposureHeader.class);
  }
  
  public OpenRecoveryReservesHeader getOpenRecoveryReservesHeader() {
    return getOrCreateProperty("OpenRecoveryReservesHeader", "OpenRecoveryReservesHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.RecoveryReserveSetLV.OpenRecoveryReservesHeader.class);
  }
  
  public RecoveryCategoryHeader getRecoveryCategoryHeader() {
    return getOrCreateProperty("RecoveryCategoryHeader", "RecoveryCategoryHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.RecoveryReserveSetLV.RecoveryCategoryHeader.class);
  }
  
  public ReservingCurrencyHeader getReservingCurrencyHeader() {
    return getOrCreateProperty("ReservingCurrencyHeader", "ReservingCurrencyHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.RecoveryReserveSetLV.ReservingCurrencyHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.RecoveryReserveSetLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.RecoveryReserveSetLV._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/transactions/RecoveryReserveSetLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AmountHeader extends ValueElement {
    public AmountHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/transactions/RecoveryReserveSetLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CostCategoryHeader extends ValueElement {
    public CostCategoryHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/transactions/RecoveryReserveSetLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CostTypeHeader extends ValueElement {
    public CostTypeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/transactions/RecoveryReserveSetLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CoverageHeader extends ValueElement {
    public CoverageHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/transactions/RecoveryReserveSetLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ExposureHeader extends ValueElement {
    public ExposureHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/transactions/RecoveryReserveSetLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class OpenRecoveryReservesHeader extends ValueElement {
    public OpenRecoveryReservesHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/transactions/RecoveryReserveSetLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RecoveryCategoryHeader extends ValueElement {
    public RecoveryCategoryHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/transactions/RecoveryReserveSetLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ReservingCurrencyHeader extends ValueElement {
    public ReservingCurrencyHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/transactions/RecoveryReserveSetLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/transactions/RecoveryReserveSetLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Amount getAmount() {
      return getOrCreateProperty("Amount", "Amount", null, pcftest.RecoveryReserveSetLV.entry.Amount.class);
    }
    
    public pcftest.RecoveryReserveSetLV.entry.CostCategory getCostCategory() {
      return getOrCreateProperty("CostCategory", "CostCategory", null, pcftest.RecoveryReserveSetLV.entry.CostCategory.class);
    }
    
    public pcftest.RecoveryReserveSetLV.entry.CostType getCostType() {
      return getOrCreateProperty("CostType", "CostType", null, pcftest.RecoveryReserveSetLV.entry.CostType.class);
    }
    
    public Coverage getCoverage() {
      return getOrCreateProperty("Coverage", "Coverage", null, pcftest.RecoveryReserveSetLV.entry.Coverage.class);
    }
    
    public ValueElement getExposure() {
      return getOrCreateProperty("Exposure", "Exposure", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getOpenRecoveryReserves() {
      return getOrCreateProperty("OpenRecoveryReserves", "OpenRecoveryReserves", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public pcftest.RecoveryReserveSetLV.entry.RecoveryCategory getRecoveryCategory() {
      return getOrCreateProperty("RecoveryCategory", "RecoveryCategory", null, pcftest.RecoveryReserveSetLV.entry.RecoveryCategory.class);
    }
    
    public ReservingCurrency getReservingCurrency() {
      return getOrCreateProperty("ReservingCurrency", "ReservingCurrency", null, pcftest.RecoveryReserveSetLV.entry.ReservingCurrency.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.RecoveryReserveSetLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.RecoveryReserveSetLV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/transactions/RecoveryReserveSetLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Amount extends ValueElement {
      public Amount(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ClaimFinancialsTransactionsDetail click() {
        return clickThis(pcftest.ClaimFinancialsTransactionsDetail.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/transactions/RecoveryReserveSetLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CostCategory extends SelectElement {
      public CostCategory(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(typekey.CostCategory arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public typekey.CostCategory getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.CostCategory.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(typekey.CostCategory arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/transactions/RecoveryReserveSetLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CostType extends SelectElement {
      public CostType(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(typekey.CostType arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public typekey.CostType getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.CostType.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(typekey.CostType arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/transactions/RecoveryReserveSetLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Coverage extends SelectElement {
      public Coverage(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(CoverageType arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public CoverageType getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.CoverageType.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(CoverageType arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/transactions/RecoveryReserveSetLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class RecoveryCategory extends SelectElement {
      public RecoveryCategory(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(typekey.RecoveryCategory arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public typekey.RecoveryCategory getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.RecoveryCategory.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(typekey.RecoveryCategory arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/transactions/RecoveryReserveSetLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ReservingCurrency extends SelectElement {
      public ReservingCurrency(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(Currency arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public Currency getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.Currency.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(Currency arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/transactions/RecoveryReserveSetLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/transactions/RecoveryReserveSetLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ViewDetail extends BooleanValueElement {
      public _ViewDetail(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  
}