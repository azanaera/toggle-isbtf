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
import pcftest.CheckSearchResultsLV.AmountHeader;
import pcftest.CheckSearchResultsLV.BulkInvoiceHeader;
import pcftest.CheckSearchResultsLV.ClaimHeader;
import pcftest.CheckSearchResultsLV.ClaimantHeader;
import pcftest.CheckSearchResultsLV.DateHeader;
import pcftest.CheckSearchResultsLV.DateOfServiceHeader;
import pcftest.CheckSearchResultsLV.PayToHeader;
import pcftest.CheckSearchResultsLV.ScheduledSendDateHeader;
import pcftest.CheckSearchResultsLV.ServicePdEndHeader;
import pcftest.CheckSearchResultsLV.ServicePdStartHeader;
import pcftest.CheckSearchResultsLV.StatusHeader;
import pcftest.CheckSearchResultsLV._ListPaging;
import pcftest.CheckSearchResultsLV.entry;
import pcftest.CheckSearchResultsLV.entry.Amount;
import pcftest.CheckSearchResultsLV.entry.BulkInvoice;
import pcftest.CheckSearchResultsLV.entry.Claim;
import pcftest.CheckSearchResultsLV.entry.PayTo;
import pcftest.CheckSearchResultsLV.entry.Status;
import pcftest.CheckSearchResultsLV.entry._Select;
import pcftest.CheckSearchResultsLV.entry._ViewDetail;
import typekey.TransactionStatus;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/search/checks/CheckSearchResultsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class CheckSearchResultsLV extends PCFElement {
  public final static String CHECKSUM = "f0cd689fee7e2235bfe1f51fe847caba";
  
  public CheckSearchResultsLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getAmountFooter() {
    return getOrCreateProperty("AmountFooter", "AmountFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public AmountHeader getAmountHeader() {
    return getOrCreateProperty("AmountHeader", "AmountHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.CheckSearchResultsLV.AmountHeader.class);
  }
  
  public BulkInvoiceHeader getBulkInvoiceHeader() {
    return getOrCreateProperty("BulkInvoiceHeader", "BulkInvoiceHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.CheckSearchResultsLV.BulkInvoiceHeader.class);
  }
  
  public ClaimHeader getClaimHeader() {
    return getOrCreateProperty("ClaimHeader", "ClaimHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.CheckSearchResultsLV.ClaimHeader.class);
  }
  
  public ClaimantHeader getClaimantHeader() {
    return getOrCreateProperty("ClaimantHeader", "ClaimantHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.CheckSearchResultsLV.ClaimantHeader.class);
  }
  
  public ValueElement getDateFooter() {
    return getOrCreateProperty("DateFooter", "DateFooter", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public DateHeader getDateHeader() {
    return getOrCreateProperty("DateHeader", "DateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.CheckSearchResultsLV.DateHeader.class);
  }
  
  public DateOfServiceHeader getDateOfServiceHeader() {
    return getOrCreateProperty("DateOfServiceHeader", "DateOfServiceHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.CheckSearchResultsLV.DateOfServiceHeader.class);
  }
  
  public PayToHeader getPayToHeader() {
    return getOrCreateProperty("PayToHeader", "PayToHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.CheckSearchResultsLV.PayToHeader.class);
  }
  
  public ScheduledSendDateHeader getScheduledSendDateHeader() {
    return getOrCreateProperty("ScheduledSendDateHeader", "ScheduledSendDateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.CheckSearchResultsLV.ScheduledSendDateHeader.class);
  }
  
  public ServicePdEndHeader getServicePdEndHeader() {
    return getOrCreateProperty("ServicePdEndHeader", "ServicePdEndHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.CheckSearchResultsLV.ServicePdEndHeader.class);
  }
  
  public ServicePdStartHeader getServicePdStartHeader() {
    return getOrCreateProperty("ServicePdStartHeader", "ServicePdStartHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.CheckSearchResultsLV.ServicePdStartHeader.class);
  }
  
  public StatusHeader getStatusHeader() {
    return getOrCreateProperty("StatusHeader", "StatusHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.CheckSearchResultsLV.StatusHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.CheckSearchResultsLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.CheckSearchResultsLV._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/search/checks/CheckSearchResultsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AmountHeader extends ValueElement {
    public AmountHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/search/checks/CheckSearchResultsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class BulkInvoiceHeader extends ValueElement {
    public BulkInvoiceHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/search/checks/CheckSearchResultsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimHeader extends ValueElement {
    public ClaimHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/search/checks/CheckSearchResultsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimantHeader extends ValueElement {
    public ClaimantHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/search/checks/CheckSearchResultsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DateHeader extends ValueElement {
    public DateHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/search/checks/CheckSearchResultsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DateOfServiceHeader extends ValueElement {
    public DateOfServiceHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/search/checks/CheckSearchResultsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PayToHeader extends ValueElement {
    public PayToHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/search/checks/CheckSearchResultsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ScheduledSendDateHeader extends ValueElement {
    public ScheduledSendDateHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/search/checks/CheckSearchResultsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ServicePdEndHeader extends ValueElement {
    public ServicePdEndHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/search/checks/CheckSearchResultsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ServicePdStartHeader extends ValueElement {
    public ServicePdStartHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/search/checks/CheckSearchResultsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class StatusHeader extends ValueElement {
    public StatusHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/search/checks/CheckSearchResultsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/search/checks/CheckSearchResultsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Amount getAmount() {
      return getOrCreateProperty("Amount", "Amount", null, pcftest.CheckSearchResultsLV.entry.Amount.class);
    }
    
    public BulkInvoice getBulkInvoice() {
      return getOrCreateProperty("BulkInvoice", "BulkInvoice", null, pcftest.CheckSearchResultsLV.entry.BulkInvoice.class);
    }
    
    public Claim getClaim() {
      return getOrCreateProperty("Claim", "Claim", null, pcftest.CheckSearchResultsLV.entry.Claim.class);
    }
    
    public ValueElement getClaimant() {
      return getOrCreateProperty("Claimant", "Claimant", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public DateElement getDate() {
      return getOrCreateProperty("Date", "Date", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public DateElement getDateOfService() {
      return getOrCreateProperty("DateOfService", "DateOfService", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public PayTo getPayTo() {
      return getOrCreateProperty("PayTo", "PayTo", null, pcftest.CheckSearchResultsLV.entry.PayTo.class);
    }
    
    public DateElement getScheduledSendDate() {
      return getOrCreateProperty("ScheduledSendDate", "ScheduledSendDate", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public DateElement getServicePdEnd() {
      return getOrCreateProperty("ServicePdEnd", "ServicePdEnd", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public DateElement getServicePdStart() {
      return getOrCreateProperty("ServicePdStart", "ServicePdStart", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public Status getStatus() {
      return getOrCreateProperty("Status", "Status", null, pcftest.CheckSearchResultsLV.entry.Status.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.CheckSearchResultsLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.CheckSearchResultsLV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/search/checks/CheckSearchResultsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Amount extends ValueElement {
      public Amount(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ClaimFinancialsChecksDetail click() {
        return clickThis(pcftest.ClaimFinancialsChecksDetail.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/search/checks/CheckSearchResultsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class BulkInvoice extends ValueElement {
      public BulkInvoice(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public EditBulkInvoiceDetail click() {
        return clickThis(pcftest.EditBulkInvoiceDetail.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/search/checks/CheckSearchResultsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Claim extends ValueElement {
      public Claim(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/search/checks/CheckSearchResultsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class PayTo extends ValueElement {
      public PayTo(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ClaimFinancialsChecksDetail click() {
        return clickThis(pcftest.ClaimFinancialsChecksDetail.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/search/checks/CheckSearchResultsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/search/checks/CheckSearchResultsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/search/checks/CheckSearchResultsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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