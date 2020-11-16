package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.DetailViewElement;
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
import pcftest.BulkInvoiceDetailDV.BulkInvoiceApprovalHistoryLV;
import pcftest.BulkInvoiceDetailDV.BulkInvoiceApprovalHistoryLV.ApprovalHistory_DateHeader;
import pcftest.BulkInvoiceDetailDV.BulkInvoiceApprovalHistoryLV.ApprovalIssueHeader;
import pcftest.BulkInvoiceDetailDV.BulkInvoiceApprovalHistoryLV.ApprovalRationaleHeader;
import pcftest.BulkInvoiceDetailDV.BulkInvoiceApprovalHistoryLV.ApprovedHeader;
import pcftest.BulkInvoiceDetailDV.BulkInvoiceApprovalHistoryLV.UserHeader;
import pcftest.BulkInvoiceDetailDV.BulkInvoiceApprovalHistoryLV_tb;
import pcftest.BulkInvoiceDetailDV.BulkInvoiceValidationAlertsLV;
import pcftest.BulkInvoiceDetailDV.BulkInvoiceValidationAlertsLV.AlertMsgHeader;
import pcftest.BulkInvoiceDetailDV.BulkInvoiceValidationAlertsLV.AlertTypeHeader;
import pcftest.BulkInvoiceDetailDV.BulkInvoiceValidationAlertsLV.entry.AlertType;
import pcftest.BulkInvoiceDetailDV.BulkInvoiceValidationAlertsLV_tb;
import pcftest.BulkInvoiceDetailDV.CheckInstructions;
import pcftest.BulkInvoiceDetailDV.DefaultCostCategory;
import pcftest.BulkInvoiceDetailDV.DefaultCostType;
import pcftest.BulkInvoiceDetailDV.DefaultPaymentType;
import pcftest.BulkInvoiceDetailDV.Reportability;
import pcftest.BulkInvoiceDetailDV.Status;
import typekey.BIValidationAlertType;
import typekey.BulkInvoiceStatus;
import typekey.CheckHandlingInstructions;
import typekey.CostCategory;
import typekey.CostType;
import typekey.PaymentType;
import typekey.ReportabilityType;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/desktop/bulkpay/BulkInvoiceDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class BulkInvoiceDetailDV extends DetailViewElement {
  public final static String CHECKSUM = "111261698a66d4863344042d9ac16a15";
  
  public BulkInvoiceDetailDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public DateElement getApprovalDate() {
    return getOrCreateProperty("ApprovalDate", "ApprovalDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public ValueElement getArchivedClaimsWarning() {
    return getOrCreateProperty("ArchivedClaimsWarning", "ArchivedClaimsWarning", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public BulkInvoiceApprovalHistoryLV getBulkInvoiceApprovalHistoryLV() {
    return getOrCreateProperty("BulkInvoiceApprovalHistoryLV", "BulkInvoiceApprovalHistoryLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.BulkInvoiceDetailDV.BulkInvoiceApprovalHistoryLV.class);
  }
  
  public BulkInvoiceApprovalHistoryLV_tb getBulkInvoiceApprovalHistoryLV_tb() {
    return getOrCreateProperty("BulkInvoiceApprovalHistoryLV_tb", "BulkInvoiceApprovalHistoryLV_tb", null, pcftest.BulkInvoiceDetailDV.BulkInvoiceApprovalHistoryLV_tb.class);
  }
  
  public ValueElement getBulkInvoiceInvalidLabel() {
    return getOrCreateProperty("BulkInvoiceInvalidLabel", "BulkInvoiceInvalidLabel", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getBulkInvoiceNeedsValidationLabel() {
    return getOrCreateProperty("BulkInvoiceNeedsValidationLabel", "BulkInvoiceNeedsValidationLabel", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getBulkInvoiceValidLabel() {
    return getOrCreateProperty("BulkInvoiceValidLabel", "BulkInvoiceValidLabel", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public BulkInvoiceValidationAlertsLV getBulkInvoiceValidationAlertsLV() {
    return getOrCreateProperty("BulkInvoiceValidationAlertsLV", "BulkInvoiceValidationAlertsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.BulkInvoiceDetailDV.BulkInvoiceValidationAlertsLV.class);
  }
  
  public BulkInvoiceValidationAlertsLV_tb getBulkInvoiceValidationAlertsLV_tb() {
    return getOrCreateProperty("BulkInvoiceValidationAlertsLV_tb", "BulkInvoiceValidationAlertsLV_tb", null, pcftest.BulkInvoiceDetailDV.BulkInvoiceValidationAlertsLV_tb.class);
  }
  
  public CheckInstructions getCheckInstructions() {
    return getOrCreateProperty("CheckInstructions", "CheckInstructions", null, pcftest.BulkInvoiceDetailDV.CheckInstructions.class);
  }
  
  public ValueElement getComments() {
    return getOrCreateProperty("Comments", "Comments", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public pcftest.BulkInvoiceDetailDV.Currency getCurrency() {
    return getOrCreateProperty("Currency", "Currency", null, pcftest.BulkInvoiceDetailDV.Currency.class);
  }
  
  public DefaultCostCategory getDefaultCostCategory() {
    return getOrCreateProperty("DefaultCostCategory", "DefaultCostCategory", null, pcftest.BulkInvoiceDetailDV.DefaultCostCategory.class);
  }
  
  public DefaultCostType getDefaultCostType() {
    return getOrCreateProperty("DefaultCostType", "DefaultCostType", null, pcftest.BulkInvoiceDetailDV.DefaultCostType.class);
  }
  
  public DefaultPaymentType getDefaultPaymentType() {
    return getOrCreateProperty("DefaultPaymentType", "DefaultPaymentType", null, pcftest.BulkInvoiceDetailDV.DefaultPaymentType.class);
  }
  
  public ValueElement getExchangeRate() {
    return getOrCreateProperty("ExchangeRate", "ExchangeRate", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public BooleanValueElement getExchangeRateOverride() {
    return getOrCreateProperty("ExchangeRateOverride", "ExchangeRateOverride", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public ValueElement getInvoiceNumber() {
    return getOrCreateProperty("InvoiceNumber", "InvoiceNumber", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public DateElement getIssueDate() {
    return getOrCreateProperty("IssueDate", "IssueDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public ValueElement getMemo() {
    return getOrCreateProperty("Memo", "Memo", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getNoApprovalHistory() {
    return getOrCreateProperty("NoApprovalHistory", "NoApprovalHistory", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public PaymentMethodInputSet getPaymentMethodInputSet() {
    return getOrCreateProperty("PaymentMethodInputSet", "PaymentMethodInputSet", null, pcftest.PaymentMethodInputSet.class);
  }
  
  public DateElement getRateSet_Date() {
    return getOrCreateProperty("RateSet_Date", "RateSet_Date", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public ValueElement getRateSet_Description() {
    return getOrCreateProperty("RateSet_Description", "RateSet_Description", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public DateElement getReceivedDate() {
    return getOrCreateProperty("ReceivedDate", "ReceivedDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public Reportability getReportability() {
    return getOrCreateProperty("Reportability", "Reportability", null, pcftest.BulkInvoiceDetailDV.Reportability.class);
  }
  
  public DateElement getScheduledSendDate() {
    return getOrCreateProperty("ScheduledSendDate", "ScheduledSendDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public BooleanValueElement getSplitEqually() {
    return getOrCreateProperty("SplitEqually", "SplitEqually", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public Status getStatus() {
    return getOrCreateProperty("Status", "Status", null, pcftest.BulkInvoiceDetailDV.Status.class);
  }
  
  public ValueElement getTotalAmount() {
    return getOrCreateProperty("TotalAmount", "TotalAmount", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getTotalApprovedAmount() {
    return getOrCreateProperty("TotalApprovedAmount", "TotalApprovedAmount", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/desktop/bulkpay/BulkInvoiceDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class BulkInvoiceApprovalHistoryLV extends PCFElement {
    public BulkInvoiceApprovalHistoryLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ApprovalHistory_DateHeader getApprovalHistory_DateHeader() {
      return getOrCreateProperty("ApprovalHistory_DateHeader", "ApprovalHistory_DateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.BulkInvoiceDetailDV.BulkInvoiceApprovalHistoryLV.ApprovalHistory_DateHeader.class);
    }
    
    public ApprovalIssueHeader getApprovalIssueHeader() {
      return getOrCreateProperty("ApprovalIssueHeader", "ApprovalIssueHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.BulkInvoiceDetailDV.BulkInvoiceApprovalHistoryLV.ApprovalIssueHeader.class);
    }
    
    public ApprovalRationaleHeader getApprovalRationaleHeader() {
      return getOrCreateProperty("ApprovalRationaleHeader", "ApprovalRationaleHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.BulkInvoiceDetailDV.BulkInvoiceApprovalHistoryLV.ApprovalRationaleHeader.class);
    }
    
    public ApprovedHeader getApprovedHeader() {
      return getOrCreateProperty("ApprovedHeader", "ApprovedHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.BulkInvoiceDetailDV.BulkInvoiceApprovalHistoryLV.ApprovedHeader.class);
    }
    
    public UserHeader getUserHeader() {
      return getOrCreateProperty("UserHeader", "UserHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.BulkInvoiceDetailDV.BulkInvoiceApprovalHistoryLV.UserHeader.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<pcftest.BulkInvoiceDetailDV.BulkInvoiceApprovalHistoryLV.entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.BulkInvoiceDetailDV.BulkInvoiceApprovalHistoryLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public pcftest.BulkInvoiceDetailDV.BulkInvoiceApprovalHistoryLV._ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.BulkInvoiceDetailDV.BulkInvoiceApprovalHistoryLV._ListPaging.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/desktop/bulkpay/BulkInvoiceDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ApprovalHistory_DateHeader extends ValueElement {
      public ApprovalHistory_DateHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/desktop/bulkpay/BulkInvoiceDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ApprovalIssueHeader extends ValueElement {
      public ApprovalIssueHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/desktop/bulkpay/BulkInvoiceDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ApprovalRationaleHeader extends ValueElement {
      public ApprovalRationaleHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/desktop/bulkpay/BulkInvoiceDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ApprovedHeader extends ValueElement {
      public ApprovedHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/desktop/bulkpay/BulkInvoiceDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class UserHeader extends ValueElement {
      public UserHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/desktop/bulkpay/BulkInvoiceDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/desktop/bulkpay/BulkInvoiceDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends RowElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public DateElement getApprovalHistory_Date() {
        return getOrCreateProperty("ApprovalHistory_Date", "ApprovalHistory_Date", null, gw.smoketest.platform.web.DateElement.class);
      }
      
      public ValueElement getApprovalIssue() {
        return getOrCreateProperty("ApprovalIssue", "ApprovalIssue", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getApprovalRationale() {
        return getOrCreateProperty("ApprovalRationale", "ApprovalRationale", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getApproved() {
        return getOrCreateProperty("Approved", "Approved", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getUser() {
        return getOrCreateProperty("User", "User", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      public pcftest.BulkInvoiceDetailDV.BulkInvoiceApprovalHistoryLV.entry._Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.BulkInvoiceDetailDV.BulkInvoiceApprovalHistoryLV.entry._Select.class);
      }
      
      public pcftest.BulkInvoiceDetailDV.BulkInvoiceApprovalHistoryLV.entry._ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.BulkInvoiceDetailDV.BulkInvoiceApprovalHistoryLV.entry._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/desktop/bulkpay/BulkInvoiceDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/desktop/bulkpay/BulkInvoiceDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/desktop/bulkpay/BulkInvoiceDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class BulkInvoiceApprovalHistoryLV_tb extends PCFElement {
    public BulkInvoiceApprovalHistoryLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/desktop/bulkpay/BulkInvoiceDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class BulkInvoiceValidationAlertsLV extends PCFElement {
    public BulkInvoiceValidationAlertsLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public AlertMsgHeader getAlertMsgHeader() {
      return getOrCreateProperty("AlertMsgHeader", "AlertMsgHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.BulkInvoiceDetailDV.BulkInvoiceValidationAlertsLV.AlertMsgHeader.class);
    }
    
    public AlertTypeHeader getAlertTypeHeader() {
      return getOrCreateProperty("AlertTypeHeader", "AlertTypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.BulkInvoiceDetailDV.BulkInvoiceValidationAlertsLV.AlertTypeHeader.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<pcftest.BulkInvoiceDetailDV.BulkInvoiceValidationAlertsLV.entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.BulkInvoiceDetailDV.BulkInvoiceValidationAlertsLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public pcftest.BulkInvoiceDetailDV.BulkInvoiceValidationAlertsLV._ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.BulkInvoiceDetailDV.BulkInvoiceValidationAlertsLV._ListPaging.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/desktop/bulkpay/BulkInvoiceDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class AlertMsgHeader extends ValueElement {
      public AlertMsgHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/desktop/bulkpay/BulkInvoiceDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class AlertTypeHeader extends ValueElement {
      public AlertTypeHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/desktop/bulkpay/BulkInvoiceDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/desktop/bulkpay/BulkInvoiceDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends RowElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ValueElement getAlertMsg() {
        return getOrCreateProperty("AlertMsg", "AlertMsg", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public AlertType getAlertType() {
        return getOrCreateProperty("AlertType", "AlertType", null, pcftest.BulkInvoiceDetailDV.BulkInvoiceValidationAlertsLV.entry.AlertType.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      public pcftest.BulkInvoiceDetailDV.BulkInvoiceValidationAlertsLV.entry._Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.BulkInvoiceDetailDV.BulkInvoiceValidationAlertsLV.entry._Select.class);
      }
      
      public pcftest.BulkInvoiceDetailDV.BulkInvoiceValidationAlertsLV.entry._ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.BulkInvoiceDetailDV.BulkInvoiceValidationAlertsLV.entry._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/desktop/bulkpay/BulkInvoiceDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class AlertType extends SelectElement {
        public AlertType(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public OptionElement getOptionByTypeKey(BIValidationAlertType arg) {
          return getOptionByValue(arg == null ? null : arg.getCode());
        }
        
        public BIValidationAlertType getTypeKeyValue() {
          String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.BIValidationAlertType.getTypeKey(myValue);
        }
        
        public void setTypeKeyValue(BIValidationAlertType arg) {
          setValue(arg == null ? null : arg.getCode());
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/desktop/bulkpay/BulkInvoiceDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/desktop/bulkpay/BulkInvoiceDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/desktop/bulkpay/BulkInvoiceDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class BulkInvoiceValidationAlertsLV_tb extends PCFElement {
    public BulkInvoiceValidationAlertsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/desktop/bulkpay/BulkInvoiceDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CheckInstructions extends SelectElement {
    public CheckInstructions(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(CheckHandlingInstructions arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public CheckHandlingInstructions getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.CheckHandlingInstructions.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(CheckHandlingInstructions arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/desktop/bulkpay/BulkInvoiceDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/desktop/bulkpay/BulkInvoiceDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DefaultCostCategory extends SelectElement {
    public DefaultCostCategory(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(CostCategory arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public CostCategory getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.CostCategory.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(CostCategory arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/desktop/bulkpay/BulkInvoiceDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DefaultCostType extends SelectElement {
    public DefaultCostType(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(CostType arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public CostType getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.CostType.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(CostType arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/desktop/bulkpay/BulkInvoiceDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DefaultPaymentType extends SelectElement {
    public DefaultPaymentType(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(PaymentType arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public PaymentType getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.PaymentType.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(PaymentType arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/desktop/bulkpay/BulkInvoiceDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Reportability extends SelectElement {
    public Reportability(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(ReportabilityType arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public ReportabilityType getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.ReportabilityType.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(ReportabilityType arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/desktop/bulkpay/BulkInvoiceDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Status extends SelectElement {
    public Status(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(BulkInvoiceStatus arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public BulkInvoiceStatus getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.BulkInvoiceStatus.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(BulkInvoiceStatus arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  
}