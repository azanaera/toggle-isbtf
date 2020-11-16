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
import pcftest.NewOnsetPaymentsLV.AmountHeader;
import pcftest.NewOnsetPaymentsLV.CommentsHeader;
import pcftest.NewOnsetPaymentsLV.CostCategoryHeader;
import pcftest.NewOnsetPaymentsLV.CostTypeHeader;
import pcftest.NewOnsetPaymentsLV.CoverageHeader;
import pcftest.NewOnsetPaymentsLV.ExposureHeader;
import pcftest.NewOnsetPaymentsLV.PaymentTypeHeader;
import pcftest.NewOnsetPaymentsLV.ReservingCurrencyHeader;
import pcftest.NewOnsetPaymentsLV._ListPaging;
import pcftest.NewOnsetPaymentsLV.entry;
import pcftest.NewOnsetPaymentsLV.entry.Coverage;
import pcftest.NewOnsetPaymentsLV.entry.ReservingCurrency;
import pcftest.NewOnsetPaymentsLV.entry._Select;
import pcftest.NewOnsetPaymentsLV.entry._ViewDetail;
import typekey.CoverageType;
import typekey.Currency;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/financials/checks/NewOnsetPaymentsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NewOnsetPaymentsLV extends PCFElement {
  public final static String CHECKSUM = "7675010ff375d74f4273a1bac02cb16e";
  
  public NewOnsetPaymentsLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getAmountFooter() {
    return getOrCreateProperty("AmountFooter", "AmountFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public AmountHeader getAmountHeader() {
    return getOrCreateProperty("AmountHeader", "AmountHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.NewOnsetPaymentsLV.AmountHeader.class);
  }
  
  public CommentsHeader getCommentsHeader() {
    return getOrCreateProperty("CommentsHeader", "CommentsHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.NewOnsetPaymentsLV.CommentsHeader.class);
  }
  
  public CostCategoryHeader getCostCategoryHeader() {
    return getOrCreateProperty("CostCategoryHeader", "CostCategoryHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.NewOnsetPaymentsLV.CostCategoryHeader.class);
  }
  
  public CostTypeHeader getCostTypeHeader() {
    return getOrCreateProperty("CostTypeHeader", "CostTypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.NewOnsetPaymentsLV.CostTypeHeader.class);
  }
  
  public CoverageHeader getCoverageHeader() {
    return getOrCreateProperty("CoverageHeader", "CoverageHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.NewOnsetPaymentsLV.CoverageHeader.class);
  }
  
  public ExposureHeader getExposureHeader() {
    return getOrCreateProperty("ExposureHeader", "ExposureHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.NewOnsetPaymentsLV.ExposureHeader.class);
  }
  
  public PaymentTypeHeader getPaymentTypeHeader() {
    return getOrCreateProperty("PaymentTypeHeader", "PaymentTypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.NewOnsetPaymentsLV.PaymentTypeHeader.class);
  }
  
  public ReservingCurrencyHeader getReservingCurrencyHeader() {
    return getOrCreateProperty("ReservingCurrencyHeader", "ReservingCurrencyHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.NewOnsetPaymentsLV.ReservingCurrencyHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.NewOnsetPaymentsLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.NewOnsetPaymentsLV._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/checks/NewOnsetPaymentsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AmountHeader extends ValueElement {
    public AmountHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/checks/NewOnsetPaymentsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CommentsHeader extends ValueElement {
    public CommentsHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/checks/NewOnsetPaymentsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CostCategoryHeader extends ValueElement {
    public CostCategoryHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/checks/NewOnsetPaymentsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CostTypeHeader extends ValueElement {
    public CostTypeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/checks/NewOnsetPaymentsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CoverageHeader extends ValueElement {
    public CoverageHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/checks/NewOnsetPaymentsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ExposureHeader extends ValueElement {
    public ExposureHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/checks/NewOnsetPaymentsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PaymentTypeHeader extends ValueElement {
    public PaymentTypeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/checks/NewOnsetPaymentsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ReservingCurrencyHeader extends ValueElement {
    public ReservingCurrencyHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/checks/NewOnsetPaymentsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/checks/NewOnsetPaymentsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getAmount() {
      return getOrCreateProperty("Amount", "Amount", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getComments() {
      return getOrCreateProperty("Comments", "Comments", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public pcftest.NewOnsetPaymentsLV.entry.CostCategory getCostCategory() {
      return getOrCreateProperty("CostCategory", "CostCategory", null, pcftest.NewOnsetPaymentsLV.entry.CostCategory.class);
    }
    
    public pcftest.NewOnsetPaymentsLV.entry.CostType getCostType() {
      return getOrCreateProperty("CostType", "CostType", null, pcftest.NewOnsetPaymentsLV.entry.CostType.class);
    }
    
    public Coverage getCoverage() {
      return getOrCreateProperty("Coverage", "Coverage", null, pcftest.NewOnsetPaymentsLV.entry.Coverage.class);
    }
    
    public ValueElement getExposure() {
      return getOrCreateProperty("Exposure", "Exposure", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public pcftest.NewOnsetPaymentsLV.entry.PaymentType getPaymentType() {
      return getOrCreateProperty("PaymentType", "PaymentType", null, pcftest.NewOnsetPaymentsLV.entry.PaymentType.class);
    }
    
    public ReservingCurrency getReservingCurrency() {
      return getOrCreateProperty("ReservingCurrency", "ReservingCurrency", null, pcftest.NewOnsetPaymentsLV.entry.ReservingCurrency.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.NewOnsetPaymentsLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.NewOnsetPaymentsLV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/checks/NewOnsetPaymentsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/claim/financials/checks/NewOnsetPaymentsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/claim/financials/checks/NewOnsetPaymentsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/claim/financials/checks/NewOnsetPaymentsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class PaymentType extends SelectElement {
      public PaymentType(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(typekey.PaymentType arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public typekey.PaymentType getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.PaymentType.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(typekey.PaymentType arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/checks/NewOnsetPaymentsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/claim/financials/checks/NewOnsetPaymentsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/checks/NewOnsetPaymentsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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