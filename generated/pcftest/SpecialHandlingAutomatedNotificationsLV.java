package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
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
import pcftest.SpecialHandlingAutomatedNotificationsLV.EmailAddressHeader;
import pcftest.SpecialHandlingAutomatedNotificationsLV.EmailTemplateHeader;
import pcftest.SpecialHandlingAutomatedNotificationsLV.EventHeader;
import pcftest.SpecialHandlingAutomatedNotificationsLV.PolicyTypeHeader;
import pcftest.SpecialHandlingAutomatedNotificationsLV.TypeHeader;
import pcftest.SpecialHandlingAutomatedNotificationsLV._ListPaging;
import pcftest.SpecialHandlingAutomatedNotificationsLV.entry;
import pcftest.SpecialHandlingAutomatedNotificationsLV.entry.Event;
import pcftest.SpecialHandlingAutomatedNotificationsLV.entry._Select;
import pcftest.SpecialHandlingAutomatedNotificationsLV.entry._ViewDetail;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/specialhandling/SpecialHandlingAutomatedNotificationsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class SpecialHandlingAutomatedNotificationsLV extends PCFElement {
  public final static String CHECKSUM = "5c7cef36413e0cb47154658b96a9d417";
  
  public SpecialHandlingAutomatedNotificationsLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public EmailAddressHeader getEmailAddressHeader() {
    return getOrCreateProperty("EmailAddressHeader", "EmailAddressHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.SpecialHandlingAutomatedNotificationsLV.EmailAddressHeader.class);
  }
  
  public EmailTemplateHeader getEmailTemplateHeader() {
    return getOrCreateProperty("EmailTemplateHeader", "EmailTemplateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.SpecialHandlingAutomatedNotificationsLV.EmailTemplateHeader.class);
  }
  
  public EventHeader getEventHeader() {
    return getOrCreateProperty("EventHeader", "EventHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.SpecialHandlingAutomatedNotificationsLV.EventHeader.class);
  }
  
  public PolicyTypeHeader getPolicyTypeHeader() {
    return getOrCreateProperty("PolicyTypeHeader", "PolicyTypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.SpecialHandlingAutomatedNotificationsLV.PolicyTypeHeader.class);
  }
  
  public TypeHeader getTypeHeader() {
    return getOrCreateProperty("TypeHeader", "TypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.SpecialHandlingAutomatedNotificationsLV.TypeHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.SpecialHandlingAutomatedNotificationsLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.SpecialHandlingAutomatedNotificationsLV._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/specialhandling/SpecialHandlingAutomatedNotificationsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EmailAddressHeader extends ValueElement {
    public EmailAddressHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/specialhandling/SpecialHandlingAutomatedNotificationsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EmailTemplateHeader extends ValueElement {
    public EmailTemplateHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/specialhandling/SpecialHandlingAutomatedNotificationsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EventHeader extends ValueElement {
    public EventHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/specialhandling/SpecialHandlingAutomatedNotificationsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PolicyTypeHeader extends ValueElement {
    public PolicyTypeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/specialhandling/SpecialHandlingAutomatedNotificationsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TypeHeader extends ValueElement {
    public TypeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/specialhandling/SpecialHandlingAutomatedNotificationsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/specialhandling/SpecialHandlingAutomatedNotificationsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getEmailAddress() {
      return getOrCreateProperty("EmailAddress", "EmailAddress", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getEmailTemplate() {
      return getOrCreateProperty("EmailTemplate", "EmailTemplate", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public Event getEvent() {
      return getOrCreateProperty("Event", "Event", null, pcftest.SpecialHandlingAutomatedNotificationsLV.entry.Event.class);
    }
    
    public ValueElement getPolicyType() {
      return getOrCreateProperty("PolicyType", "PolicyType", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getType() {
      return getOrCreateProperty("Type", "Type", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.SpecialHandlingAutomatedNotificationsLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.SpecialHandlingAutomatedNotificationsLV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/specialhandling/SpecialHandlingAutomatedNotificationsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Event extends ValueElement {
      public Event(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public AutomatedNotificationHandlerDetailPopup click() {
        return clickThis(pcftest.AutomatedNotificationHandlerDetailPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/specialhandling/SpecialHandlingAutomatedNotificationsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/specialhandling/SpecialHandlingAutomatedNotificationsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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