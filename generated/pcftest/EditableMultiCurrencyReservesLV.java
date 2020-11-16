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
import pcftest.EditableMultiCurrencyReservesLV.AvailableReservesHeader;
import pcftest.EditableMultiCurrencyReservesLV.ChangeAmountHeader;
import pcftest.EditableMultiCurrencyReservesLV.CommentsHeader;
import pcftest.EditableMultiCurrencyReservesLV.CostCategoryHeader;
import pcftest.EditableMultiCurrencyReservesLV.CostTypeHeader;
import pcftest.EditableMultiCurrencyReservesLV.CoverageHeader;
import pcftest.EditableMultiCurrencyReservesLV.CurrencyHeader;
import pcftest.EditableMultiCurrencyReservesLV.ExposureHeader;
import pcftest.EditableMultiCurrencyReservesLV.NewAvailableReservesHeader;
import pcftest.EditableMultiCurrencyReservesLV.PendingReservesHeader;
import pcftest.EditableMultiCurrencyReservesLV.ReservingCurrencyHeader;
import pcftest.EditableMultiCurrencyReservesLV._ListPaging;
import pcftest.EditableMultiCurrencyReservesLV.entry;
import pcftest.EditableMultiCurrencyReservesLV.entry._Select;
import pcftest.EditableMultiCurrencyReservesLV.entry._ViewDetail;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/newtransaction/reserve/EditableMultiCurrencyReservesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class EditableMultiCurrencyReservesLV extends PCFElement {
  public final static String CHECKSUM = "8e7982ea3e7e99266eff81a07ad9b388";
  
  public EditableMultiCurrencyReservesLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public AvailableReservesHeader getAvailableReservesHeader() {
    return getOrCreateProperty("AvailableReservesHeader", "AvailableReservesHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableMultiCurrencyReservesLV.AvailableReservesHeader.class);
  }
  
  public ChangeAmountHeader getChangeAmountHeader() {
    return getOrCreateProperty("ChangeAmountHeader", "ChangeAmountHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableMultiCurrencyReservesLV.ChangeAmountHeader.class);
  }
  
  public CommentsHeader getCommentsHeader() {
    return getOrCreateProperty("CommentsHeader", "CommentsHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableMultiCurrencyReservesLV.CommentsHeader.class);
  }
  
  public CostCategoryHeader getCostCategoryHeader() {
    return getOrCreateProperty("CostCategoryHeader", "CostCategoryHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableMultiCurrencyReservesLV.CostCategoryHeader.class);
  }
  
  public CostTypeHeader getCostTypeHeader() {
    return getOrCreateProperty("CostTypeHeader", "CostTypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableMultiCurrencyReservesLV.CostTypeHeader.class);
  }
  
  public CoverageHeader getCoverageHeader() {
    return getOrCreateProperty("CoverageHeader", "CoverageHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableMultiCurrencyReservesLV.CoverageHeader.class);
  }
  
  public CurrencyHeader getCurrencyHeader() {
    return getOrCreateProperty("CurrencyHeader", "CurrencyHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableMultiCurrencyReservesLV.CurrencyHeader.class);
  }
  
  public ExposureHeader getExposureHeader() {
    return getOrCreateProperty("ExposureHeader", "ExposureHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableMultiCurrencyReservesLV.ExposureHeader.class);
  }
  
  public NewAvailableReservesHeader getNewAvailableReservesHeader() {
    return getOrCreateProperty("NewAvailableReservesHeader", "NewAvailableReservesHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableMultiCurrencyReservesLV.NewAvailableReservesHeader.class);
  }
  
  public PendingReservesHeader getPendingReservesHeader() {
    return getOrCreateProperty("PendingReservesHeader", "PendingReservesHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableMultiCurrencyReservesLV.PendingReservesHeader.class);
  }
  
  public ReservingCurrencyHeader getReservingCurrencyHeader() {
    return getOrCreateProperty("ReservingCurrencyHeader", "ReservingCurrencyHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableMultiCurrencyReservesLV.ReservingCurrencyHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.EditableMultiCurrencyReservesLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.EditableMultiCurrencyReservesLV._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/reserve/EditableMultiCurrencyReservesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AvailableReservesHeader extends ValueElement {
    public AvailableReservesHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/reserve/EditableMultiCurrencyReservesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ChangeAmountHeader extends ValueElement {
    public ChangeAmountHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/reserve/EditableMultiCurrencyReservesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CommentsHeader extends ValueElement {
    public CommentsHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/reserve/EditableMultiCurrencyReservesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CostCategoryHeader extends ValueElement {
    public CostCategoryHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/reserve/EditableMultiCurrencyReservesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CostTypeHeader extends ValueElement {
    public CostTypeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/reserve/EditableMultiCurrencyReservesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CoverageHeader extends ValueElement {
    public CoverageHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/reserve/EditableMultiCurrencyReservesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CurrencyHeader extends ValueElement {
    public CurrencyHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/reserve/EditableMultiCurrencyReservesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ExposureHeader extends ValueElement {
    public ExposureHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/reserve/EditableMultiCurrencyReservesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewAvailableReservesHeader extends ValueElement {
    public NewAvailableReservesHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/reserve/EditableMultiCurrencyReservesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PendingReservesHeader extends ValueElement {
    public PendingReservesHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/reserve/EditableMultiCurrencyReservesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ReservingCurrencyHeader extends ValueElement {
    public ReservingCurrencyHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/reserve/EditableMultiCurrencyReservesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/reserve/EditableMultiCurrencyReservesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getAvailableReserves() {
      return getOrCreateProperty("AvailableReserves", "AvailableReserves", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getChangeAmount() {
      return getOrCreateProperty("ChangeAmount", "ChangeAmount", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getComments() {
      return getOrCreateProperty("Comments", "Comments", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getCostCategory() {
      return getOrCreateProperty("CostCategory", "CostCategory", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getCostType() {
      return getOrCreateProperty("CostType", "CostType", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getCoverage() {
      return getOrCreateProperty("Coverage", "Coverage", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public pcftest.EditableMultiCurrencyReservesLV.entry.Currency getCurrency() {
      return getOrCreateProperty("Currency", "Currency", null, pcftest.EditableMultiCurrencyReservesLV.entry.Currency.class);
    }
    
    public ValueElement getExposure() {
      return getOrCreateProperty("Exposure", "Exposure", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getNewAvailableReserves() {
      return getOrCreateProperty("NewAvailableReserves", "NewAvailableReserves", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getPendingReserves() {
      return getOrCreateProperty("PendingReserves", "PendingReserves", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getReservingCurrency() {
      return getOrCreateProperty("ReservingCurrency", "ReservingCurrency", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.EditableMultiCurrencyReservesLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.EditableMultiCurrencyReservesLV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newtransaction/reserve/EditableMultiCurrencyReservesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/claim/newtransaction/reserve/EditableMultiCurrencyReservesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newtransaction/reserve/EditableMultiCurrencyReservesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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