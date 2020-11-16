package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
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
import pcftest.ServiceRequestInvoiceInputSet_single.ActionsHeader;
import pcftest.ServiceRequestInvoiceInputSet_single.NameHeader;
import pcftest.ServiceRequestInvoiceInputSet_single._ListPaging;
import pcftest.ServiceRequestInvoiceInputSet_single.entry;
import pcftest.ServiceRequestInvoiceInputSet_single.entry.NameLink;
import pcftest.ServiceRequestInvoiceInputSet_single.entry.ViewPropertiesLink;
import pcftest.ServiceRequestInvoiceInputSet_single.entry._Select;
import pcftest.ServiceRequestInvoiceInputSet_single.entry._ViewDetail;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/newtransaction/check/ServiceRequestInvoiceInputSet.single.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ServiceRequestInvoiceInputSet_single extends ServiceRequestInvoiceInputSet {
  public final static String CHECKSUM = "7c6923513d5a82c1d6bb2b9c8bb1e114";
  
  public ServiceRequestInvoiceInputSet_single(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ActionsHeader getActionsHeader() {
    return getOrCreateProperty("ActionsHeader", "ActionsHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ServiceRequestInvoiceInputSet_single.ActionsHeader.class);
  }
  
  public ValueElement getIconHeader() {
    return getOrCreateProperty("IconHeader", "IconHeader", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public NameHeader getNameHeader() {
    return getOrCreateProperty("NameHeader", "NameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ServiceRequestInvoiceInputSet_single.NameHeader.class);
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
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ServiceRequestInvoiceInputSet_single.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ServiceRequestInvoiceInputSet_single._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/check/ServiceRequestInvoiceInputSet.single.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ActionsHeader extends ValueElement {
    public ActionsHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/check/ServiceRequestInvoiceInputSet.single.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NameHeader extends ValueElement {
    public NameHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/check/ServiceRequestInvoiceInputSet.single.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/check/ServiceRequestInvoiceInputSet.single.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public BooleanValueElement getIcon() {
      return getOrCreateProperty("Icon", "Icon", null, gw.smoketest.platform.web.BooleanValueElement.class);
    }
    
    public NameLink getNameLink() {
      return getOrCreateProperty("NameLink", "NameLink", null, pcftest.ServiceRequestInvoiceInputSet_single.entry.NameLink.class);
    }
    
    public ViewPropertiesLink getViewPropertiesLink() {
      return getOrCreateProperty("ViewPropertiesLink", "ViewPropertiesLink", null, pcftest.ServiceRequestInvoiceInputSet_single.entry.ViewPropertiesLink.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.ServiceRequestInvoiceInputSet_single.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ServiceRequestInvoiceInputSet_single.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newtransaction/check/ServiceRequestInvoiceInputSet.single.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class NameLink extends ClickableActionElement {
      public NameLink(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newtransaction/check/ServiceRequestInvoiceInputSet.single.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ViewPropertiesLink extends ClickableActionElement {
      public ViewPropertiesLink(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public DocumentDetailsPopup click() {
        return clickThis(pcftest.DocumentDetailsPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newtransaction/check/ServiceRequestInvoiceInputSet.single.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newtransaction/check/ServiceRequestInvoiceInputSet.single.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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