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
import pcftest.EditableReservesLV.AvailableReservesHeader;
import pcftest.EditableReservesLV.ChangeAmountHeader;
import pcftest.EditableReservesLV.CommentsHeader;
import pcftest.EditableReservesLV.CostCategoryHeader;
import pcftest.EditableReservesLV.CostTypeHeader;
import pcftest.EditableReservesLV.CoverageHeader;
import pcftest.EditableReservesLV.ExposureHeader;
import pcftest.EditableReservesLV.Exposure_ReadonlyHeader;
import pcftest.EditableReservesLV.NewAmountHeader;
import pcftest.EditableReservesLV.PendingReservesHeader;
import pcftest.EditableReservesLV.ReservingCurrencyHeader;
import pcftest.EditableReservesLV.TotalIncurredHeader;
import pcftest.EditableReservesLV._ListPaging;
import pcftest.EditableReservesLV.entry;
import pcftest.EditableReservesLV.entry.Coverage;
import pcftest.EditableReservesLV.entry.MultiCurrencyPopup_link;
import pcftest.EditableReservesLV.entry._Select;
import pcftest.EditableReservesLV.entry._ViewDetail;
import typekey.CoverageType;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/newtransaction/reserve/EditableReservesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class EditableReservesLV extends PCFElement {
  public final static String CHECKSUM = "197d808eb3f8817fa5f8710c3c272f5d";
  
  public EditableReservesLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getAvailableReservesFooter() {
    return getOrCreateProperty("AvailableReservesFooter", "AvailableReservesFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public AvailableReservesHeader getAvailableReservesHeader() {
    return getOrCreateProperty("AvailableReservesHeader", "AvailableReservesHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableReservesLV.AvailableReservesHeader.class);
  }
  
  public ValueElement getChangeAmountFooter() {
    return getOrCreateProperty("ChangeAmountFooter", "ChangeAmountFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ChangeAmountHeader getChangeAmountHeader() {
    return getOrCreateProperty("ChangeAmountHeader", "ChangeAmountHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableReservesLV.ChangeAmountHeader.class);
  }
  
  public CommentsHeader getCommentsHeader() {
    return getOrCreateProperty("CommentsHeader", "CommentsHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableReservesLV.CommentsHeader.class);
  }
  
  public CostCategoryHeader getCostCategoryHeader() {
    return getOrCreateProperty("CostCategoryHeader", "CostCategoryHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableReservesLV.CostCategoryHeader.class);
  }
  
  public CostTypeHeader getCostTypeHeader() {
    return getOrCreateProperty("CostTypeHeader", "CostTypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableReservesLV.CostTypeHeader.class);
  }
  
  public CoverageHeader getCoverageHeader() {
    return getOrCreateProperty("CoverageHeader", "CoverageHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableReservesLV.CoverageHeader.class);
  }
  
  public ValueElement getExposureFooter() {
    return getOrCreateProperty("ExposureFooter", "ExposureFooter", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ExposureHeader getExposureHeader() {
    return getOrCreateProperty("ExposureHeader", "ExposureHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableReservesLV.ExposureHeader.class);
  }
  
  public ValueElement getExposure_ReadonlyFooter() {
    return getOrCreateProperty("Exposure_ReadonlyFooter", "Exposure_ReadonlyFooter", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Exposure_ReadonlyHeader getExposure_ReadonlyHeader() {
    return getOrCreateProperty("Exposure_ReadonlyHeader", "Exposure_ReadonlyHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableReservesLV.Exposure_ReadonlyHeader.class);
  }
  
  public ValueElement getMultiCurrencyPopup_linkHeader() {
    return getOrCreateProperty("MultiCurrencyPopup_linkHeader", "MultiCurrencyPopup_linkHeader", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getNewAmountFooter() {
    return getOrCreateProperty("NewAmountFooter", "NewAmountFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public NewAmountHeader getNewAmountHeader() {
    return getOrCreateProperty("NewAmountHeader", "NewAmountHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableReservesLV.NewAmountHeader.class);
  }
  
  public ValueElement getPendingReservesFooter() {
    return getOrCreateProperty("PendingReservesFooter", "PendingReservesFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public PendingReservesHeader getPendingReservesHeader() {
    return getOrCreateProperty("PendingReservesHeader", "PendingReservesHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableReservesLV.PendingReservesHeader.class);
  }
  
  public ReservingCurrencyHeader getReservingCurrencyHeader() {
    return getOrCreateProperty("ReservingCurrencyHeader", "ReservingCurrencyHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableReservesLV.ReservingCurrencyHeader.class);
  }
  
  public ValueElement getTotalIncurredFooter() {
    return getOrCreateProperty("TotalIncurredFooter", "TotalIncurredFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public TotalIncurredHeader getTotalIncurredHeader() {
    return getOrCreateProperty("TotalIncurredHeader", "TotalIncurredHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableReservesLV.TotalIncurredHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.EditableReservesLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.EditableReservesLV._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/reserve/EditableReservesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AvailableReservesHeader extends ValueElement {
    public AvailableReservesHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/reserve/EditableReservesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ChangeAmountHeader extends ValueElement {
    public ChangeAmountHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/reserve/EditableReservesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CommentsHeader extends ValueElement {
    public CommentsHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/reserve/EditableReservesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CostCategoryHeader extends ValueElement {
    public CostCategoryHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/reserve/EditableReservesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CostTypeHeader extends ValueElement {
    public CostTypeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/reserve/EditableReservesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CoverageHeader extends ValueElement {
    public CoverageHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/reserve/EditableReservesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ExposureHeader extends ValueElement {
    public ExposureHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/reserve/EditableReservesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Exposure_ReadonlyHeader extends ValueElement {
    public Exposure_ReadonlyHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/reserve/EditableReservesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewAmountHeader extends ValueElement {
    public NewAmountHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/reserve/EditableReservesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PendingReservesHeader extends ValueElement {
    public PendingReservesHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/reserve/EditableReservesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ReservingCurrencyHeader extends ValueElement {
    public ReservingCurrencyHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/reserve/EditableReservesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TotalIncurredHeader extends ValueElement {
    public TotalIncurredHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/reserve/EditableReservesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/reserve/EditableReservesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    
    public SelectElement getCostCategory() {
      return getOrCreateProperty("CostCategory", "CostCategory", null, gw.smoketest.platform.web.SelectElement.class);
    }
    
    public SelectElement getCostType() {
      return getOrCreateProperty("CostType", "CostType", null, gw.smoketest.platform.web.SelectElement.class);
    }
    
    public Coverage getCoverage() {
      return getOrCreateProperty("Coverage", "Coverage", null, pcftest.EditableReservesLV.entry.Coverage.class);
    }
    
    public SelectElement getExposure() {
      return getOrCreateProperty("Exposure", "Exposure", null, gw.smoketest.platform.web.SelectElement.class);
    }
    
    public ValueElement getExposure_Readonly() {
      return getOrCreateProperty("Exposure_Readonly", "Exposure_Readonly", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public MultiCurrencyPopup_link getMultiCurrencyPopup_link() {
      return getOrCreateProperty("MultiCurrencyPopup_link", "MultiCurrencyPopup_link", null, pcftest.EditableReservesLV.entry.MultiCurrencyPopup_link.class);
    }
    
    public ValueElement getNewAmount() {
      return getOrCreateProperty("NewAmount", "NewAmount", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getPendingReserves() {
      return getOrCreateProperty("PendingReserves", "PendingReserves", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public SelectElement getReservingCurrency() {
      return getOrCreateProperty("ReservingCurrency", "ReservingCurrency", null, gw.smoketest.platform.web.SelectElement.class);
    }
    
    public ValueElement getTotalIncurred() {
      return getOrCreateProperty("TotalIncurred", "TotalIncurred", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.EditableReservesLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.EditableReservesLV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newtransaction/reserve/EditableReservesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/claim/newtransaction/reserve/EditableReservesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class MultiCurrencyPopup_link extends BooleanValueElement {
      public MultiCurrencyPopup_link(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public NewReserveMultiCurrencyPopup click() {
        return clickThis(pcftest.NewReserveMultiCurrencyPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newtransaction/reserve/EditableReservesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newtransaction/reserve/EditableReservesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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