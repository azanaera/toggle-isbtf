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
import pcftest.SpecialHandlingAutomatedActivitiesLV.ActivityPatternHeader;
import pcftest.SpecialHandlingAutomatedActivitiesLV.EmailTemplateHeader;
import pcftest.SpecialHandlingAutomatedActivitiesLV.EventHeader;
import pcftest.SpecialHandlingAutomatedActivitiesLV.PolicyTypeHeader;
import pcftest.SpecialHandlingAutomatedActivitiesLV.TypeHeader;
import pcftest.SpecialHandlingAutomatedActivitiesLV._ListPaging;
import pcftest.SpecialHandlingAutomatedActivitiesLV.entry;
import pcftest.SpecialHandlingAutomatedActivitiesLV.entry.Event;
import pcftest.SpecialHandlingAutomatedActivitiesLV.entry._Select;
import pcftest.SpecialHandlingAutomatedActivitiesLV.entry._ViewDetail;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/specialhandling/SpecialHandlingAutomatedActivitiesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class SpecialHandlingAutomatedActivitiesLV extends PCFElement {
  public final static String CHECKSUM = "364fc7376356d93df681ff4cf09d3450";
  
  public SpecialHandlingAutomatedActivitiesLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ActivityPatternHeader getActivityPatternHeader() {
    return getOrCreateProperty("ActivityPatternHeader", "ActivityPatternHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.SpecialHandlingAutomatedActivitiesLV.ActivityPatternHeader.class);
  }
  
  public EmailTemplateHeader getEmailTemplateHeader() {
    return getOrCreateProperty("EmailTemplateHeader", "EmailTemplateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.SpecialHandlingAutomatedActivitiesLV.EmailTemplateHeader.class);
  }
  
  public EventHeader getEventHeader() {
    return getOrCreateProperty("EventHeader", "EventHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.SpecialHandlingAutomatedActivitiesLV.EventHeader.class);
  }
  
  public PolicyTypeHeader getPolicyTypeHeader() {
    return getOrCreateProperty("PolicyTypeHeader", "PolicyTypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.SpecialHandlingAutomatedActivitiesLV.PolicyTypeHeader.class);
  }
  
  public TypeHeader getTypeHeader() {
    return getOrCreateProperty("TypeHeader", "TypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.SpecialHandlingAutomatedActivitiesLV.TypeHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.SpecialHandlingAutomatedActivitiesLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.SpecialHandlingAutomatedActivitiesLV._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/specialhandling/SpecialHandlingAutomatedActivitiesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ActivityPatternHeader extends ValueElement {
    public ActivityPatternHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/specialhandling/SpecialHandlingAutomatedActivitiesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EmailTemplateHeader extends ValueElement {
    public EmailTemplateHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/specialhandling/SpecialHandlingAutomatedActivitiesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EventHeader extends ValueElement {
    public EventHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/specialhandling/SpecialHandlingAutomatedActivitiesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PolicyTypeHeader extends ValueElement {
    public PolicyTypeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/specialhandling/SpecialHandlingAutomatedActivitiesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TypeHeader extends ValueElement {
    public TypeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/specialhandling/SpecialHandlingAutomatedActivitiesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/specialhandling/SpecialHandlingAutomatedActivitiesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getActivityPattern() {
      return getOrCreateProperty("ActivityPattern", "ActivityPattern", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getEmailTemplate() {
      return getOrCreateProperty("EmailTemplate", "EmailTemplate", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public Event getEvent() {
      return getOrCreateProperty("Event", "Event", null, pcftest.SpecialHandlingAutomatedActivitiesLV.entry.Event.class);
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
      return getOrCreateProperty("_Select", "_Select", null, pcftest.SpecialHandlingAutomatedActivitiesLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.SpecialHandlingAutomatedActivitiesLV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/specialhandling/SpecialHandlingAutomatedActivitiesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Event extends ValueElement {
      public Event(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public AutomatedActivityHandlerDetailPopup click() {
        return clickThis(pcftest.AutomatedActivityHandlerDetailPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/specialhandling/SpecialHandlingAutomatedActivitiesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/specialhandling/SpecialHandlingAutomatedActivitiesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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