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
import pcftest.BulkInvoicesLV.ApprovalDateHeader;
import pcftest.BulkInvoicesLV.InvoiceNumberHeader;
import pcftest.BulkInvoicesLV.ReceivedDateHeader;
import pcftest.BulkInvoicesLV.StatusHeader;
import pcftest.BulkInvoicesLV.TotalAmountHeader;
import pcftest.BulkInvoicesLV._ListPaging;
import pcftest.BulkInvoicesLV.entry;
import pcftest.BulkInvoicesLV.entry.InvoiceNumber;
import pcftest.BulkInvoicesLV.entry.Status;
import pcftest.BulkInvoicesLV.entry.TotalAmount;
import pcftest.BulkInvoicesLV.entry._Select;
import pcftest.BulkInvoicesLV.entry._ViewDetail;
import typekey.BulkInvoiceStatus;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/desktop/bulkpay/BulkInvoicesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class BulkInvoicesLV extends PCFElement {
  public final static String CHECKSUM = "94b21efcd618ea3d9f623b526d4356b0";
  
  public BulkInvoicesLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ApprovalDateHeader getApprovalDateHeader() {
    return getOrCreateProperty("ApprovalDateHeader", "ApprovalDateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.BulkInvoicesLV.ApprovalDateHeader.class);
  }
  
  public InvoiceNumberHeader getInvoiceNumberHeader() {
    return getOrCreateProperty("InvoiceNumberHeader", "InvoiceNumberHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.BulkInvoicesLV.InvoiceNumberHeader.class);
  }
  
  public ReceivedDateHeader getReceivedDateHeader() {
    return getOrCreateProperty("ReceivedDateHeader", "ReceivedDateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.BulkInvoicesLV.ReceivedDateHeader.class);
  }
  
  public StatusHeader getStatusHeader() {
    return getOrCreateProperty("StatusHeader", "StatusHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.BulkInvoicesLV.StatusHeader.class);
  }
  
  public TotalAmountHeader getTotalAmountHeader() {
    return getOrCreateProperty("TotalAmountHeader", "TotalAmountHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.BulkInvoicesLV.TotalAmountHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.BulkInvoicesLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.BulkInvoicesLV._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/desktop/bulkpay/BulkInvoicesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ApprovalDateHeader extends ValueElement {
    public ApprovalDateHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/desktop/bulkpay/BulkInvoicesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class InvoiceNumberHeader extends ValueElement {
    public InvoiceNumberHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/desktop/bulkpay/BulkInvoicesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ReceivedDateHeader extends ValueElement {
    public ReceivedDateHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/desktop/bulkpay/BulkInvoicesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class StatusHeader extends ValueElement {
    public StatusHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/desktop/bulkpay/BulkInvoicesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TotalAmountHeader extends ValueElement {
    public TotalAmountHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/desktop/bulkpay/BulkInvoicesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/desktop/bulkpay/BulkInvoicesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public DateElement getApprovalDate() {
      return getOrCreateProperty("ApprovalDate", "ApprovalDate", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public InvoiceNumber getInvoiceNumber() {
      return getOrCreateProperty("InvoiceNumber", "InvoiceNumber", null, pcftest.BulkInvoicesLV.entry.InvoiceNumber.class);
    }
    
    public DateElement getReceivedDate() {
      return getOrCreateProperty("ReceivedDate", "ReceivedDate", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public Status getStatus() {
      return getOrCreateProperty("Status", "Status", null, pcftest.BulkInvoicesLV.entry.Status.class);
    }
    
    public TotalAmount getTotalAmount() {
      return getOrCreateProperty("TotalAmount", "TotalAmount", null, pcftest.BulkInvoicesLV.entry.TotalAmount.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.BulkInvoicesLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.BulkInvoicesLV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/desktop/bulkpay/BulkInvoicesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class InvoiceNumber extends ValueElement {
      public InvoiceNumber(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public EditBulkInvoiceDetail click() {
        return clickThis(pcftest.EditBulkInvoiceDetail.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/desktop/bulkpay/BulkInvoicesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Status extends SelectElement {
      public Status(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public EditBulkInvoiceDetail click() {
        return clickThis(pcftest.EditBulkInvoiceDetail.class);
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
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/desktop/bulkpay/BulkInvoicesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class TotalAmount extends ValueElement {
      public TotalAmount(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public EditBulkInvoiceDetail click() {
        return clickThis(pcftest.EditBulkInvoiceDetail.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/desktop/bulkpay/BulkInvoicesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/desktop/bulkpay/BulkInvoicesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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