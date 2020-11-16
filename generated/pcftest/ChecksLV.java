package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.DateElement;
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
import pcftest.ChecksLV.BulkInvoiceHeader;
import pcftest.ChecksLV.CheckNumberHeader;
import pcftest.ChecksLV.GrossAmountHeader;
import pcftest.ChecksLV.IssueDateHeader;
import pcftest.ChecksLV.PayToHeader;
import pcftest.ChecksLV.ScheduledSendDateHeader;
import pcftest.ChecksLV.StatusHeader;
import pcftest.ChecksLV._ListPaging;
import pcftest.ChecksLV.entry;
import pcftest.ChecksLV.entry.BulkInvoice;
import pcftest.ChecksLV.entry.CheckNumber;
import pcftest.ChecksLV.entry.GrossAmount;
import pcftest.ChecksLV.entry.Status;
import pcftest.ChecksLV.entry._Select;
import pcftest.ChecksLV.entry._ViewDetail;
import typekey.TransactionStatus;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/financials/checks/ChecksLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ChecksLV extends PCFElement {
  public final static String CHECKSUM = "003393d8c7338190d8d4cbbffd466e1e";
  
  public ChecksLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public BulkInvoiceHeader getBulkInvoiceHeader() {
    return getOrCreateProperty("BulkInvoiceHeader", "BulkInvoiceHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ChecksLV.BulkInvoiceHeader.class);
  }
  
  public CheckNumberHeader getCheckNumberHeader() {
    return getOrCreateProperty("CheckNumberHeader", "CheckNumberHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ChecksLV.CheckNumberHeader.class);
  }
  
  public GrossAmountHeader getGrossAmountHeader() {
    return getOrCreateProperty("GrossAmountHeader", "GrossAmountHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ChecksLV.GrossAmountHeader.class);
  }
  
  public IssueDateHeader getIssueDateHeader() {
    return getOrCreateProperty("IssueDateHeader", "IssueDateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ChecksLV.IssueDateHeader.class);
  }
  
  public PayToHeader getPayToHeader() {
    return getOrCreateProperty("PayToHeader", "PayToHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ChecksLV.PayToHeader.class);
  }
  
  public ScheduledSendDateHeader getScheduledSendDateHeader() {
    return getOrCreateProperty("ScheduledSendDateHeader", "ScheduledSendDateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ChecksLV.ScheduledSendDateHeader.class);
  }
  
  public StatusHeader getStatusHeader() {
    return getOrCreateProperty("StatusHeader", "StatusHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ChecksLV.StatusHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ChecksLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ChecksLV._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/checks/ChecksLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class BulkInvoiceHeader extends ValueElement {
    public BulkInvoiceHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/checks/ChecksLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CheckNumberHeader extends ValueElement {
    public CheckNumberHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/checks/ChecksLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class GrossAmountHeader extends ValueElement {
    public GrossAmountHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/checks/ChecksLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IssueDateHeader extends ValueElement {
    public IssueDateHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/checks/ChecksLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PayToHeader extends ValueElement {
    public PayToHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/checks/ChecksLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ScheduledSendDateHeader extends ValueElement {
    public ScheduledSendDateHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/checks/ChecksLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class StatusHeader extends ValueElement {
    public StatusHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/checks/ChecksLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/checks/ChecksLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public BulkInvoice getBulkInvoice() {
      return getOrCreateProperty("BulkInvoice", "BulkInvoice", null, pcftest.ChecksLV.entry.BulkInvoice.class);
    }
    
    public CheckNumber getCheckNumber() {
      return getOrCreateProperty("CheckNumber", "CheckNumber", null, pcftest.ChecksLV.entry.CheckNumber.class);
    }
    
    public GrossAmount getGrossAmount() {
      return getOrCreateProperty("GrossAmount", "GrossAmount", null, pcftest.ChecksLV.entry.GrossAmount.class);
    }
    
    public DateElement getIssueDate() {
      return getOrCreateProperty("IssueDate", "IssueDate", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public ValueElement getPayTo() {
      return getOrCreateProperty("PayTo", "PayTo", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public DateElement getScheduledSendDate() {
      return getOrCreateProperty("ScheduledSendDate", "ScheduledSendDate", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public Status getStatus() {
      return getOrCreateProperty("Status", "Status", null, pcftest.ChecksLV.entry.Status.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.ChecksLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ChecksLV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/checks/ChecksLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class BulkInvoice extends ValueElement {
      public BulkInvoice(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public EditBulkInvoiceDetail click() {
        return clickThis(pcftest.EditBulkInvoiceDetail.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/checks/ChecksLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CheckNumber extends ValueElement {
      public CheckNumber(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ClaimFinancialsChecksDetail click() {
        return clickThis(pcftest.ClaimFinancialsChecksDetail.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/checks/ChecksLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class GrossAmount extends ValueElement {
      public GrossAmount(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ClaimFinancialsChecksDetail click() {
        return clickThis(pcftest.ClaimFinancialsChecksDetail.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/checks/ChecksLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/claim/financials/checks/ChecksLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/checks/ChecksLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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