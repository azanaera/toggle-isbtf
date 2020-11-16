package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.IteratorEntriesWithPaging;
import gw.smoketest.platform.web.IteratorEntryCheckboxElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.PagingElement;
import gw.smoketest.platform.web.RowElement;
import gw.smoketest.platform.web.SelectorCellElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ServiceRequestInvoiceInputSet_multiple.ServiceRequestInvoiceAmountHeader;
import pcftest.ServiceRequestInvoiceInputSet_multiple.ServiceRequestInvoiceReferenceNumberHeader;
import pcftest.ServiceRequestInvoiceInputSet_multiple.ServiceRequestNumberHeader;
import pcftest.ServiceRequestInvoiceInputSet_multiple._ListPaging;
import pcftest.ServiceRequestInvoiceInputSet_multiple.entry;
import pcftest.ServiceRequestInvoiceInputSet_multiple.entry._Select;
import pcftest.ServiceRequestInvoiceInputSet_multiple.entry._ViewDetail;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/newtransaction/check/ServiceRequestInvoiceInputSet.multiple.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ServiceRequestInvoiceInputSet_multiple extends ServiceRequestInvoiceInputSet {
  public final static String CHECKSUM = "8c778394d56adc99199c457050b45fc6";
  
  public ServiceRequestInvoiceInputSet_multiple(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ServiceRequestInvoiceAmountHeader getServiceRequestInvoiceAmountHeader() {
    return getOrCreateProperty("ServiceRequestInvoiceAmountHeader", "ServiceRequestInvoiceAmountHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ServiceRequestInvoiceInputSet_multiple.ServiceRequestInvoiceAmountHeader.class);
  }
  
  public ServiceRequestInvoiceReferenceNumberHeader getServiceRequestInvoiceReferenceNumberHeader() {
    return getOrCreateProperty("ServiceRequestInvoiceReferenceNumberHeader", "ServiceRequestInvoiceReferenceNumberHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ServiceRequestInvoiceInputSet_multiple.ServiceRequestInvoiceReferenceNumberHeader.class);
  }
  
  public ServiceRequestNumberHeader getServiceRequestNumberHeader() {
    return getOrCreateProperty("ServiceRequestNumberHeader", "ServiceRequestNumberHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ServiceRequestInvoiceInputSet_multiple.ServiceRequestNumberHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ServiceRequestInvoiceInputSet_multiple.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ServiceRequestInvoiceInputSet_multiple._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/check/ServiceRequestInvoiceInputSet.multiple.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ServiceRequestInvoiceAmountHeader extends ValueElement {
    public ServiceRequestInvoiceAmountHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/check/ServiceRequestInvoiceInputSet.multiple.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ServiceRequestInvoiceReferenceNumberHeader extends ValueElement {
    public ServiceRequestInvoiceReferenceNumberHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/check/ServiceRequestInvoiceInputSet.multiple.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ServiceRequestNumberHeader extends ValueElement {
    public ServiceRequestNumberHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/check/ServiceRequestInvoiceInputSet.multiple.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/check/ServiceRequestInvoiceInputSet.multiple.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getServiceRequestInvoiceAmount() {
      return getOrCreateProperty("ServiceRequestInvoiceAmount", "ServiceRequestInvoiceAmount", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getServiceRequestInvoiceReferenceNumber() {
      return getOrCreateProperty("ServiceRequestInvoiceReferenceNumber", "ServiceRequestInvoiceReferenceNumber", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getServiceRequestNumber() {
      return getOrCreateProperty("ServiceRequestNumber", "ServiceRequestNumber", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.ServiceRequestInvoiceInputSet_multiple.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ServiceRequestInvoiceInputSet_multiple.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newtransaction/check/ServiceRequestInvoiceInputSet.multiple.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newtransaction/check/ServiceRequestInvoiceInputSet.multiple.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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