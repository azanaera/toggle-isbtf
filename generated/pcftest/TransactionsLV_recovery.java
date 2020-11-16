package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.IteratorEntriesWithPaging;
import gw.smoketest.platform.web.IteratorEntryCheckboxElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.PagingElement;
import gw.smoketest.platform.web.RowElement;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.SelectorCellElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.TransactionsLV_recovery.AmountHeader;
import pcftest.TransactionsLV_recovery.CostCategoryHeader;
import pcftest.TransactionsLV_recovery.CostTypeHeader;
import pcftest.TransactionsLV_recovery.CoverageTypeHeader;
import pcftest.TransactionsLV_recovery.CreateDateHeader;
import pcftest.TransactionsLV_recovery.ExposureHeader;
import pcftest.TransactionsLV_recovery.RecoveryCategoryHeader;
import pcftest.TransactionsLV_recovery.ReservingCurrencyHeader;
import pcftest.TransactionsLV_recovery.StatusHeader;
import pcftest.TransactionsLV_recovery.UserHeader;
import pcftest.TransactionsLV_recovery._ListPaging;
import pcftest.TransactionsLV_recovery.entry;
import pcftest.TransactionsLV_recovery.entry.Exposure;
import pcftest.TransactionsLV_recovery.entry.ReservingCurrency;
import pcftest.TransactionsLV_recovery.entry.Status;
import pcftest.TransactionsLV_recovery.entry.TransactionAmountViewDetail;
import pcftest.TransactionsLV_recovery.entry._Select;
import pcftest.TransactionsLV_recovery.entry._ViewDetail;
import typekey.Currency;
import typekey.TransactionStatus;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/financials/transactions/TransactionsLV.recovery.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class TransactionsLV_recovery extends TransactionsLV {
  public final static String CHECKSUM = "d11e589d029ce44e9413027eaba2ab43";
  
  public TransactionsLV_recovery(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public AmountHeader getAmountHeader() {
    return getOrCreateProperty("AmountHeader", "AmountHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.TransactionsLV_recovery.AmountHeader.class);
  }
  
  public CostCategoryHeader getCostCategoryHeader() {
    return getOrCreateProperty("CostCategoryHeader", "CostCategoryHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.TransactionsLV_recovery.CostCategoryHeader.class);
  }
  
  public CostTypeHeader getCostTypeHeader() {
    return getOrCreateProperty("CostTypeHeader", "CostTypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.TransactionsLV_recovery.CostTypeHeader.class);
  }
  
  public CoverageTypeHeader getCoverageTypeHeader() {
    return getOrCreateProperty("CoverageTypeHeader", "CoverageTypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.TransactionsLV_recovery.CoverageTypeHeader.class);
  }
  
  public CreateDateHeader getCreateDateHeader() {
    return getOrCreateProperty("CreateDateHeader", "CreateDateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.TransactionsLV_recovery.CreateDateHeader.class);
  }
  
  public ExposureHeader getExposureHeader() {
    return getOrCreateProperty("ExposureHeader", "ExposureHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.TransactionsLV_recovery.ExposureHeader.class);
  }
  
  public RecoveryCategoryHeader getRecoveryCategoryHeader() {
    return getOrCreateProperty("RecoveryCategoryHeader", "RecoveryCategoryHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.TransactionsLV_recovery.RecoveryCategoryHeader.class);
  }
  
  public ReservingCurrencyHeader getReservingCurrencyHeader() {
    return getOrCreateProperty("ReservingCurrencyHeader", "ReservingCurrencyHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.TransactionsLV_recovery.ReservingCurrencyHeader.class);
  }
  
  public StatusHeader getStatusHeader() {
    return getOrCreateProperty("StatusHeader", "StatusHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.TransactionsLV_recovery.StatusHeader.class);
  }
  
  public UserHeader getUserHeader() {
    return getOrCreateProperty("UserHeader", "UserHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.TransactionsLV_recovery.UserHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.TransactionsLV_recovery.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.TransactionsLV_recovery._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/transactions/TransactionsLV.recovery.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AmountHeader extends ValueElement {
    public AmountHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/transactions/TransactionsLV.recovery.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CostCategoryHeader extends ValueElement {
    public CostCategoryHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/transactions/TransactionsLV.recovery.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CostTypeHeader extends ValueElement {
    public CostTypeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/transactions/TransactionsLV.recovery.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CoverageTypeHeader extends ValueElement {
    public CoverageTypeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/transactions/TransactionsLV.recovery.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CreateDateHeader extends ValueElement {
    public CreateDateHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/transactions/TransactionsLV.recovery.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ExposureHeader extends ValueElement {
    public ExposureHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/transactions/TransactionsLV.recovery.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RecoveryCategoryHeader extends ValueElement {
    public RecoveryCategoryHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/transactions/TransactionsLV.recovery.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ReservingCurrencyHeader extends ValueElement {
    public ReservingCurrencyHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/transactions/TransactionsLV.recovery.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class StatusHeader extends ValueElement {
    public StatusHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/transactions/TransactionsLV.recovery.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class UserHeader extends ValueElement {
    public UserHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/transactions/TransactionsLV.recovery.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/transactions/TransactionsLV.recovery.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getAmount() {
      return getOrCreateProperty("Amount", "Amount", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public pcftest.TransactionsLV_recovery.entry.CostCategory getCostCategory() {
      return getOrCreateProperty("CostCategory", "CostCategory", null, pcftest.TransactionsLV_recovery.entry.CostCategory.class);
    }
    
    public pcftest.TransactionsLV_recovery.entry.CostType getCostType() {
      return getOrCreateProperty("CostType", "CostType", null, pcftest.TransactionsLV_recovery.entry.CostType.class);
    }
    
    public pcftest.TransactionsLV_recovery.entry.CoverageType getCoverageType() {
      return getOrCreateProperty("CoverageType", "CoverageType", null, pcftest.TransactionsLV_recovery.entry.CoverageType.class);
    }
    
    public DateElement getCreateDate() {
      return getOrCreateProperty("CreateDate", "CreateDate", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public Exposure getExposure() {
      return getOrCreateProperty("Exposure", "Exposure", null, pcftest.TransactionsLV_recovery.entry.Exposure.class);
    }
    
    public pcftest.TransactionsLV_recovery.entry.RecoveryCategory getRecoveryCategory() {
      return getOrCreateProperty("RecoveryCategory", "RecoveryCategory", null, pcftest.TransactionsLV_recovery.entry.RecoveryCategory.class);
    }
    
    public ReservingCurrency getReservingCurrency() {
      return getOrCreateProperty("ReservingCurrency", "ReservingCurrency", null, pcftest.TransactionsLV_recovery.entry.ReservingCurrency.class);
    }
    
    public Status getStatus() {
      return getOrCreateProperty("Status", "Status", null, pcftest.TransactionsLV_recovery.entry.Status.class);
    }
    
    public TransactionAmountViewDetail getTransactionAmountViewDetail() {
      return getOrCreateProperty("TransactionAmountViewDetail", "TransactionAmountViewDetail", null, pcftest.TransactionsLV_recovery.entry.TransactionAmountViewDetail.class);
    }
    
    public ValueElement getUser() {
      return getOrCreateProperty("User", "User", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.TransactionsLV_recovery.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.TransactionsLV_recovery.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/transactions/TransactionsLV.recovery.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/claim/financials/transactions/TransactionsLV.recovery.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/claim/financials/transactions/TransactionsLV.recovery.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CoverageType extends SelectElement {
      public CoverageType(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(typekey.CoverageType arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public typekey.CoverageType getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.CoverageType.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(typekey.CoverageType arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/transactions/TransactionsLV.recovery.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Exposure extends ValueElement {
      public Exposure(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/transactions/TransactionsLV.recovery.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/claim/financials/transactions/TransactionsLV.recovery.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/claim/financials/transactions/TransactionsLV.recovery.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Status extends SelectElement {
      public Status(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(TransactionStatus arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public TransactionStatus getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.TransactionStatus.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(TransactionStatus arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/transactions/TransactionsLV.recovery.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class TransactionAmountViewDetail extends ClickableActionElement {
      public TransactionAmountViewDetail(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/transactions/TransactionsLV.recovery.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/transactions/TransactionsLV.recovery.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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