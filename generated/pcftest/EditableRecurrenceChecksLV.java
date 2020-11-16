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
import pcftest.EditableRecurrenceChecksLV.AmountHeader;
import pcftest.EditableRecurrenceChecksLV.ScheduledSendDateHeader;
import pcftest.EditableRecurrenceChecksLV.ServicePeriodEndHeader;
import pcftest.EditableRecurrenceChecksLV.ServicePeriodStartHeader;
import pcftest.EditableRecurrenceChecksLV._ListPaging;
import pcftest.EditableRecurrenceChecksLV.entry;
import pcftest.EditableRecurrenceChecksLV.entry._Select;
import pcftest.EditableRecurrenceChecksLV.entry._ViewDetail;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/financials/checks/EditableRecurrenceChecksLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class EditableRecurrenceChecksLV extends PCFElement {
  public final static String CHECKSUM = "4d8978f1328bfa995a181927df40938f";
  
  public EditableRecurrenceChecksLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public AmountHeader getAmountHeader() {
    return getOrCreateProperty("AmountHeader", "AmountHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableRecurrenceChecksLV.AmountHeader.class);
  }
  
  public ScheduledSendDateHeader getScheduledSendDateHeader() {
    return getOrCreateProperty("ScheduledSendDateHeader", "ScheduledSendDateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableRecurrenceChecksLV.ScheduledSendDateHeader.class);
  }
  
  public ServicePeriodEndHeader getServicePeriodEndHeader() {
    return getOrCreateProperty("ServicePeriodEndHeader", "ServicePeriodEndHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableRecurrenceChecksLV.ServicePeriodEndHeader.class);
  }
  
  public ServicePeriodStartHeader getServicePeriodStartHeader() {
    return getOrCreateProperty("ServicePeriodStartHeader", "ServicePeriodStartHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableRecurrenceChecksLV.ServicePeriodStartHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.EditableRecurrenceChecksLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.EditableRecurrenceChecksLV._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/checks/EditableRecurrenceChecksLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AmountHeader extends ValueElement {
    public AmountHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/checks/EditableRecurrenceChecksLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ScheduledSendDateHeader extends ValueElement {
    public ScheduledSendDateHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/checks/EditableRecurrenceChecksLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ServicePeriodEndHeader extends ValueElement {
    public ServicePeriodEndHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/checks/EditableRecurrenceChecksLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ServicePeriodStartHeader extends ValueElement {
    public ServicePeriodStartHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/checks/EditableRecurrenceChecksLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/checks/EditableRecurrenceChecksLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getAmount() {
      return getOrCreateProperty("Amount", "Amount", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public DateElement getScheduledSendDate() {
      return getOrCreateProperty("ScheduledSendDate", "ScheduledSendDate", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public DateElement getServicePeriodEnd() {
      return getOrCreateProperty("ServicePeriodEnd", "ServicePeriodEnd", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public DateElement getServicePeriodStart() {
      return getOrCreateProperty("ServicePeriodStart", "ServicePeriodStart", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.EditableRecurrenceChecksLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.EditableRecurrenceChecksLV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/checks/EditableRecurrenceChecksLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/checks/EditableRecurrenceChecksLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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