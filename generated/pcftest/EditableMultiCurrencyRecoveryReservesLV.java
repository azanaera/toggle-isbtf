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
import pcftest.EditableMultiCurrencyRecoveryReservesLV.ChangeAmountHeader;
import pcftest.EditableMultiCurrencyRecoveryReservesLV.CommentsHeader;
import pcftest.EditableMultiCurrencyRecoveryReservesLV.CostCategoriesHeader;
import pcftest.EditableMultiCurrencyRecoveryReservesLV.CoverageHeader;
import pcftest.EditableMultiCurrencyRecoveryReservesLV.CurrencyHeader;
import pcftest.EditableMultiCurrencyRecoveryReservesLV.ExposureHeader;
import pcftest.EditableMultiCurrencyRecoveryReservesLV.LV_Financials_RecoveryReserveSet_RecoveryReserves_CostTypeHeader;
import pcftest.EditableMultiCurrencyRecoveryReservesLV.NewOpenRecoveryReservesHeader;
import pcftest.EditableMultiCurrencyRecoveryReservesLV.OpenRecoveryReservesHeader;
import pcftest.EditableMultiCurrencyRecoveryReservesLV.ReservingCurrencyHeader;
import pcftest.EditableMultiCurrencyRecoveryReservesLV._ListPaging;
import pcftest.EditableMultiCurrencyRecoveryReservesLV.entry;
import pcftest.EditableMultiCurrencyRecoveryReservesLV.entry._Select;
import pcftest.EditableMultiCurrencyRecoveryReservesLV.entry._ViewDetail;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/newtransaction/recoveryreserve/EditableMultiCurrencyRecoveryReservesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class EditableMultiCurrencyRecoveryReservesLV extends PCFElement {
  public final static String CHECKSUM = "8b4e3440bef9332ec145319c862c9929";
  
  public EditableMultiCurrencyRecoveryReservesLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ChangeAmountHeader getChangeAmountHeader() {
    return getOrCreateProperty("ChangeAmountHeader", "ChangeAmountHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableMultiCurrencyRecoveryReservesLV.ChangeAmountHeader.class);
  }
  
  public CommentsHeader getCommentsHeader() {
    return getOrCreateProperty("CommentsHeader", "CommentsHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableMultiCurrencyRecoveryReservesLV.CommentsHeader.class);
  }
  
  public CostCategoriesHeader getCostCategoriesHeader() {
    return getOrCreateProperty("CostCategoriesHeader", "CostCategoriesHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableMultiCurrencyRecoveryReservesLV.CostCategoriesHeader.class);
  }
  
  public CoverageHeader getCoverageHeader() {
    return getOrCreateProperty("CoverageHeader", "CoverageHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableMultiCurrencyRecoveryReservesLV.CoverageHeader.class);
  }
  
  public CurrencyHeader getCurrencyHeader() {
    return getOrCreateProperty("CurrencyHeader", "CurrencyHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableMultiCurrencyRecoveryReservesLV.CurrencyHeader.class);
  }
  
  public ExposureHeader getExposureHeader() {
    return getOrCreateProperty("ExposureHeader", "ExposureHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableMultiCurrencyRecoveryReservesLV.ExposureHeader.class);
  }
  
  public LV_Financials_RecoveryReserveSet_RecoveryReserves_CostTypeHeader getLV_Financials_RecoveryReserveSet_RecoveryReserves_CostTypeHeader() {
    return getOrCreateProperty("LV_Financials_RecoveryReserveSet_RecoveryReserves_CostTypeHeader", "LV_Financials_RecoveryReserveSet_RecoveryReserves_CostTypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableMultiCurrencyRecoveryReservesLV.LV_Financials_RecoveryReserveSet_RecoveryReserves_CostTypeHeader.class);
  }
  
  public NewOpenRecoveryReservesHeader getNewOpenRecoveryReservesHeader() {
    return getOrCreateProperty("NewOpenRecoveryReservesHeader", "NewOpenRecoveryReservesHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableMultiCurrencyRecoveryReservesLV.NewOpenRecoveryReservesHeader.class);
  }
  
  public OpenRecoveryReservesHeader getOpenRecoveryReservesHeader() {
    return getOrCreateProperty("OpenRecoveryReservesHeader", "OpenRecoveryReservesHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableMultiCurrencyRecoveryReservesLV.OpenRecoveryReservesHeader.class);
  }
  
  public ReservingCurrencyHeader getReservingCurrencyHeader() {
    return getOrCreateProperty("ReservingCurrencyHeader", "ReservingCurrencyHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableMultiCurrencyRecoveryReservesLV.ReservingCurrencyHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.EditableMultiCurrencyRecoveryReservesLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.EditableMultiCurrencyRecoveryReservesLV._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/recoveryreserve/EditableMultiCurrencyRecoveryReservesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ChangeAmountHeader extends ValueElement {
    public ChangeAmountHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/recoveryreserve/EditableMultiCurrencyRecoveryReservesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CommentsHeader extends ValueElement {
    public CommentsHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/recoveryreserve/EditableMultiCurrencyRecoveryReservesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CostCategoriesHeader extends ValueElement {
    public CostCategoriesHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/recoveryreserve/EditableMultiCurrencyRecoveryReservesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CoverageHeader extends ValueElement {
    public CoverageHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/recoveryreserve/EditableMultiCurrencyRecoveryReservesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CurrencyHeader extends ValueElement {
    public CurrencyHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/recoveryreserve/EditableMultiCurrencyRecoveryReservesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ExposureHeader extends ValueElement {
    public ExposureHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/recoveryreserve/EditableMultiCurrencyRecoveryReservesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LV_Financials_RecoveryReserveSet_RecoveryReserves_CostTypeHeader extends ValueElement {
    public LV_Financials_RecoveryReserveSet_RecoveryReserves_CostTypeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/recoveryreserve/EditableMultiCurrencyRecoveryReservesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewOpenRecoveryReservesHeader extends ValueElement {
    public NewOpenRecoveryReservesHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/recoveryreserve/EditableMultiCurrencyRecoveryReservesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class OpenRecoveryReservesHeader extends ValueElement {
    public OpenRecoveryReservesHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/recoveryreserve/EditableMultiCurrencyRecoveryReservesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ReservingCurrencyHeader extends ValueElement {
    public ReservingCurrencyHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/recoveryreserve/EditableMultiCurrencyRecoveryReservesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/recoveryreserve/EditableMultiCurrencyRecoveryReservesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getChangeAmount() {
      return getOrCreateProperty("ChangeAmount", "ChangeAmount", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getComments() {
      return getOrCreateProperty("Comments", "Comments", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getCostCategories() {
      return getOrCreateProperty("CostCategories", "CostCategories", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getCoverage() {
      return getOrCreateProperty("Coverage", "Coverage", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public pcftest.EditableMultiCurrencyRecoveryReservesLV.entry.Currency getCurrency() {
      return getOrCreateProperty("Currency", "Currency", null, pcftest.EditableMultiCurrencyRecoveryReservesLV.entry.Currency.class);
    }
    
    public ValueElement getExposure() {
      return getOrCreateProperty("Exposure", "Exposure", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getLV_Financials_RecoveryReserveSet_RecoveryReserves_CostType() {
      return getOrCreateProperty("LV_Financials_RecoveryReserveSet_RecoveryReserves_CostType", "LV_Financials_RecoveryReserveSet_RecoveryReserves_CostType", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getNewOpenRecoveryReserves() {
      return getOrCreateProperty("NewOpenRecoveryReserves", "NewOpenRecoveryReserves", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getOpenRecoveryReserves() {
      return getOrCreateProperty("OpenRecoveryReserves", "OpenRecoveryReserves", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getReservingCurrency() {
      return getOrCreateProperty("ReservingCurrency", "ReservingCurrency", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.EditableMultiCurrencyRecoveryReservesLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.EditableMultiCurrencyRecoveryReservesLV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newtransaction/recoveryreserve/EditableMultiCurrencyRecoveryReservesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Currency extends SelectElement {
      public Currency(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(typekey.Currency arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public typekey.Currency getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.Currency.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(typekey.Currency arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newtransaction/recoveryreserve/EditableMultiCurrencyRecoveryReservesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newtransaction/recoveryreserve/EditableMultiCurrencyRecoveryReservesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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