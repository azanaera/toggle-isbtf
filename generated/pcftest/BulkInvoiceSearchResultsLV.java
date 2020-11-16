package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.IteratorEntriesWithPaging;
import gw.smoketest.platform.web.IteratorEntryCheckboxElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.PagingElement;
import gw.smoketest.platform.web.RowElement;
import gw.smoketest.platform.web.SelectorCellElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.BulkInvoiceSearchResultsLV.ApprovedAmountHeader;
import pcftest.BulkInvoiceSearchResultsLV.CheckNumberHeader;
import pcftest.BulkInvoiceSearchResultsLV.InvoiceNumberHeader;
import pcftest.BulkInvoiceSearchResultsLV.PayToHeader;
import pcftest.BulkInvoiceSearchResultsLV.ReceivedDateHeader;
import pcftest.BulkInvoiceSearchResultsLV.ScheduledSendDateHeader;
import pcftest.BulkInvoiceSearchResultsLV.TotalAmountHeader;
import pcftest.BulkInvoiceSearchResultsLV._ListPaging;
import pcftest.BulkInvoiceSearchResultsLV.entry;
import pcftest.BulkInvoiceSearchResultsLV.entry.CheckNumber;
import pcftest.BulkInvoiceSearchResultsLV.entry.InvoiceNumber;
import pcftest.BulkInvoiceSearchResultsLV.entry._Select;
import pcftest.BulkInvoiceSearchResultsLV.entry._ViewDetail;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/search/bulkpay/BulkInvoiceSearchResultsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class BulkInvoiceSearchResultsLV extends PCFElement {
  public final static String CHECKSUM = "9a9395d4bf426428bdee8b38caad7e9e";
  
  public BulkInvoiceSearchResultsLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getApprovedAmountFooter() {
    return getOrCreateProperty("ApprovedAmountFooter", "ApprovedAmountFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ApprovedAmountHeader getApprovedAmountHeader() {
    return getOrCreateProperty("ApprovedAmountHeader", "ApprovedAmountHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.BulkInvoiceSearchResultsLV.ApprovedAmountHeader.class);
  }
  
  public CheckNumberHeader getCheckNumberHeader() {
    return getOrCreateProperty("CheckNumberHeader", "CheckNumberHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.BulkInvoiceSearchResultsLV.CheckNumberHeader.class);
  }
  
  public ValueElement getInvoiceNumberFooter() {
    return getOrCreateProperty("InvoiceNumberFooter", "InvoiceNumberFooter", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public InvoiceNumberHeader getInvoiceNumberHeader() {
    return getOrCreateProperty("InvoiceNumberHeader", "InvoiceNumberHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.BulkInvoiceSearchResultsLV.InvoiceNumberHeader.class);
  }
  
  public PayToHeader getPayToHeader() {
    return getOrCreateProperty("PayToHeader", "PayToHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.BulkInvoiceSearchResultsLV.PayToHeader.class);
  }
  
  public ReceivedDateHeader getReceivedDateHeader() {
    return getOrCreateProperty("ReceivedDateHeader", "ReceivedDateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.BulkInvoiceSearchResultsLV.ReceivedDateHeader.class);
  }
  
  public ScheduledSendDateHeader getScheduledSendDateHeader() {
    return getOrCreateProperty("ScheduledSendDateHeader", "ScheduledSendDateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.BulkInvoiceSearchResultsLV.ScheduledSendDateHeader.class);
  }
  
  public ValueElement getTotalAmountFooter() {
    return getOrCreateProperty("TotalAmountFooter", "TotalAmountFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public TotalAmountHeader getTotalAmountHeader() {
    return getOrCreateProperty("TotalAmountHeader", "TotalAmountHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.BulkInvoiceSearchResultsLV.TotalAmountHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.BulkInvoiceSearchResultsLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.BulkInvoiceSearchResultsLV._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/search/bulkpay/BulkInvoiceSearchResultsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ApprovedAmountHeader extends ValueElement {
    public ApprovedAmountHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/search/bulkpay/BulkInvoiceSearchResultsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CheckNumberHeader extends ValueElement {
    public CheckNumberHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/search/bulkpay/BulkInvoiceSearchResultsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class InvoiceNumberHeader extends ValueElement {
    public InvoiceNumberHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/search/bulkpay/BulkInvoiceSearchResultsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PayToHeader extends ValueElement {
    public PayToHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/search/bulkpay/BulkInvoiceSearchResultsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ReceivedDateHeader extends ValueElement {
    public ReceivedDateHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/search/bulkpay/BulkInvoiceSearchResultsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ScheduledSendDateHeader extends ValueElement {
    public ScheduledSendDateHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/search/bulkpay/BulkInvoiceSearchResultsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TotalAmountHeader extends ValueElement {
    public TotalAmountHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/search/bulkpay/BulkInvoiceSearchResultsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/search/bulkpay/BulkInvoiceSearchResultsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getApprovedAmount() {
      return getOrCreateProperty("ApprovedAmount", "ApprovedAmount", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public CheckNumber getCheckNumber() {
      return getOrCreateProperty("CheckNumber", "CheckNumber", null, pcftest.BulkInvoiceSearchResultsLV.entry.CheckNumber.class);
    }
    
    public InvoiceNumber getInvoiceNumber() {
      return getOrCreateProperty("InvoiceNumber", "InvoiceNumber", null, pcftest.BulkInvoiceSearchResultsLV.entry.InvoiceNumber.class);
    }
    
    public ValueElement getPayTo() {
      return getOrCreateProperty("PayTo", "PayTo", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public DateElement getReceivedDate() {
      return getOrCreateProperty("ReceivedDate", "ReceivedDate", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public DateElement getScheduledSendDate() {
      return getOrCreateProperty("ScheduledSendDate", "ScheduledSendDate", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public ValueElement getTotalAmount() {
      return getOrCreateProperty("TotalAmount", "TotalAmount", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.BulkInvoiceSearchResultsLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.BulkInvoiceSearchResultsLV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/search/bulkpay/BulkInvoiceSearchResultsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CheckNumber extends ValueElement {
      public CheckNumber(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public EditBulkInvoiceDetail click() {
        return clickThis(pcftest.EditBulkInvoiceDetail.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/search/bulkpay/BulkInvoiceSearchResultsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class InvoiceNumber extends ValueElement {
      public InvoiceNumber(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public EditBulkInvoiceDetail click() {
        return clickThis(pcftest.EditBulkInvoiceDetail.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/search/bulkpay/BulkInvoiceSearchResultsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/search/bulkpay/BulkInvoiceSearchResultsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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