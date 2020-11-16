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
import pcftest.EditableRecoveryReservesLV.ChangeAmountHeader;
import pcftest.EditableRecoveryReservesLV.CommentsHeader;
import pcftest.EditableRecoveryReservesLV.CostCategoryHeader;
import pcftest.EditableRecoveryReservesLV.CostTypeHeader;
import pcftest.EditableRecoveryReservesLV.CoverageHeader;
import pcftest.EditableRecoveryReservesLV.ExposureHeader;
import pcftest.EditableRecoveryReservesLV.Exposure_ReadonlyHeader;
import pcftest.EditableRecoveryReservesLV.NewOpenRecoveryReservesHeader;
import pcftest.EditableRecoveryReservesLV.OpenRecoveryReservesHeader;
import pcftest.EditableRecoveryReservesLV.RecoveryCategoryHeader;
import pcftest.EditableRecoveryReservesLV.ReservingCurrencyHeader;
import pcftest.EditableRecoveryReservesLV._ListPaging;
import pcftest.EditableRecoveryReservesLV.entry;
import pcftest.EditableRecoveryReservesLV.entry.Coverage;
import pcftest.EditableRecoveryReservesLV.entry.MultiCurrencyPopup_link;
import pcftest.EditableRecoveryReservesLV.entry._Select;
import pcftest.EditableRecoveryReservesLV.entry._ViewDetail;
import typekey.CoverageType;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/newtransaction/recoveryreserve/EditableRecoveryReservesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class EditableRecoveryReservesLV extends PCFElement {
  public final static String CHECKSUM = "19f1ab1cd37384a8c5be710d73304148";
  
  public EditableRecoveryReservesLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getChangeAmountFooter() {
    return getOrCreateProperty("ChangeAmountFooter", "ChangeAmountFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ChangeAmountHeader getChangeAmountHeader() {
    return getOrCreateProperty("ChangeAmountHeader", "ChangeAmountHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableRecoveryReservesLV.ChangeAmountHeader.class);
  }
  
  public CommentsHeader getCommentsHeader() {
    return getOrCreateProperty("CommentsHeader", "CommentsHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableRecoveryReservesLV.CommentsHeader.class);
  }
  
  public CostCategoryHeader getCostCategoryHeader() {
    return getOrCreateProperty("CostCategoryHeader", "CostCategoryHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableRecoveryReservesLV.CostCategoryHeader.class);
  }
  
  public CostTypeHeader getCostTypeHeader() {
    return getOrCreateProperty("CostTypeHeader", "CostTypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableRecoveryReservesLV.CostTypeHeader.class);
  }
  
  public CoverageHeader getCoverageHeader() {
    return getOrCreateProperty("CoverageHeader", "CoverageHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableRecoveryReservesLV.CoverageHeader.class);
  }
  
  public ValueElement getExposureFooter() {
    return getOrCreateProperty("ExposureFooter", "ExposureFooter", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ExposureHeader getExposureHeader() {
    return getOrCreateProperty("ExposureHeader", "ExposureHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableRecoveryReservesLV.ExposureHeader.class);
  }
  
  public ValueElement getExposure_ReadonlyFooter() {
    return getOrCreateProperty("Exposure_ReadonlyFooter", "Exposure_ReadonlyFooter", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Exposure_ReadonlyHeader getExposure_ReadonlyHeader() {
    return getOrCreateProperty("Exposure_ReadonlyHeader", "Exposure_ReadonlyHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableRecoveryReservesLV.Exposure_ReadonlyHeader.class);
  }
  
  public ValueElement getMultiCurrencyPopup_linkHeader() {
    return getOrCreateProperty("MultiCurrencyPopup_linkHeader", "MultiCurrencyPopup_linkHeader", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getNewOpenRecoveryReservesFooter() {
    return getOrCreateProperty("NewOpenRecoveryReservesFooter", "NewOpenRecoveryReservesFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public NewOpenRecoveryReservesHeader getNewOpenRecoveryReservesHeader() {
    return getOrCreateProperty("NewOpenRecoveryReservesHeader", "NewOpenRecoveryReservesHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableRecoveryReservesLV.NewOpenRecoveryReservesHeader.class);
  }
  
  public ValueElement getOpenRecoveryReservesFooter() {
    return getOrCreateProperty("OpenRecoveryReservesFooter", "OpenRecoveryReservesFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public OpenRecoveryReservesHeader getOpenRecoveryReservesHeader() {
    return getOrCreateProperty("OpenRecoveryReservesHeader", "OpenRecoveryReservesHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableRecoveryReservesLV.OpenRecoveryReservesHeader.class);
  }
  
  public RecoveryCategoryHeader getRecoveryCategoryHeader() {
    return getOrCreateProperty("RecoveryCategoryHeader", "RecoveryCategoryHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableRecoveryReservesLV.RecoveryCategoryHeader.class);
  }
  
  public ReservingCurrencyHeader getReservingCurrencyHeader() {
    return getOrCreateProperty("ReservingCurrencyHeader", "ReservingCurrencyHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableRecoveryReservesLV.ReservingCurrencyHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.EditableRecoveryReservesLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.EditableRecoveryReservesLV._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/recoveryreserve/EditableRecoveryReservesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ChangeAmountHeader extends ValueElement {
    public ChangeAmountHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/recoveryreserve/EditableRecoveryReservesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CommentsHeader extends ValueElement {
    public CommentsHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/recoveryreserve/EditableRecoveryReservesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CostCategoryHeader extends ValueElement {
    public CostCategoryHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/recoveryreserve/EditableRecoveryReservesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CostTypeHeader extends ValueElement {
    public CostTypeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/recoveryreserve/EditableRecoveryReservesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CoverageHeader extends ValueElement {
    public CoverageHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/recoveryreserve/EditableRecoveryReservesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ExposureHeader extends ValueElement {
    public ExposureHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/recoveryreserve/EditableRecoveryReservesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Exposure_ReadonlyHeader extends ValueElement {
    public Exposure_ReadonlyHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/recoveryreserve/EditableRecoveryReservesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewOpenRecoveryReservesHeader extends ValueElement {
    public NewOpenRecoveryReservesHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/recoveryreserve/EditableRecoveryReservesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class OpenRecoveryReservesHeader extends ValueElement {
    public OpenRecoveryReservesHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/recoveryreserve/EditableRecoveryReservesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RecoveryCategoryHeader extends ValueElement {
    public RecoveryCategoryHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/recoveryreserve/EditableRecoveryReservesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ReservingCurrencyHeader extends ValueElement {
    public ReservingCurrencyHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/recoveryreserve/EditableRecoveryReservesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/recoveryreserve/EditableRecoveryReservesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    
    public SelectElement getCostCategory() {
      return getOrCreateProperty("CostCategory", "CostCategory", null, gw.smoketest.platform.web.SelectElement.class);
    }
    
    public SelectElement getCostType() {
      return getOrCreateProperty("CostType", "CostType", null, gw.smoketest.platform.web.SelectElement.class);
    }
    
    public Coverage getCoverage() {
      return getOrCreateProperty("Coverage", "Coverage", null, pcftest.EditableRecoveryReservesLV.entry.Coverage.class);
    }
    
    public SelectElement getExposure() {
      return getOrCreateProperty("Exposure", "Exposure", null, gw.smoketest.platform.web.SelectElement.class);
    }
    
    public ValueElement getExposure_Readonly() {
      return getOrCreateProperty("Exposure_Readonly", "Exposure_Readonly", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public MultiCurrencyPopup_link getMultiCurrencyPopup_link() {
      return getOrCreateProperty("MultiCurrencyPopup_link", "MultiCurrencyPopup_link", null, pcftest.EditableRecoveryReservesLV.entry.MultiCurrencyPopup_link.class);
    }
    
    public ValueElement getNewOpenRecoveryReserves() {
      return getOrCreateProperty("NewOpenRecoveryReserves", "NewOpenRecoveryReserves", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getOpenRecoveryReserves() {
      return getOrCreateProperty("OpenRecoveryReserves", "OpenRecoveryReserves", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public SelectElement getRecoveryCategory() {
      return getOrCreateProperty("RecoveryCategory", "RecoveryCategory", null, gw.smoketest.platform.web.SelectElement.class);
    }
    
    public SelectElement getReservingCurrency() {
      return getOrCreateProperty("ReservingCurrency", "ReservingCurrency", null, gw.smoketest.platform.web.SelectElement.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.EditableRecoveryReservesLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.EditableRecoveryReservesLV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newtransaction/recoveryreserve/EditableRecoveryReservesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/claim/newtransaction/recoveryreserve/EditableRecoveryReservesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class MultiCurrencyPopup_link extends BooleanValueElement {
      public MultiCurrencyPopup_link(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public NewRecoveryReserveMultiCurrencyPopup click() {
        return clickThis(pcftest.NewRecoveryReserveMultiCurrencyPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newtransaction/recoveryreserve/EditableRecoveryReservesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newtransaction/recoveryreserve/EditableRecoveryReservesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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