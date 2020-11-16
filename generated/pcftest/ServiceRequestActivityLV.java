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
import pcftest.ServiceRequestActivityLV.AssignedUserHeader;
import pcftest.ServiceRequestActivityLV.AssignerHeader;
import pcftest.ServiceRequestActivityLV.DueDateHeader;
import pcftest.ServiceRequestActivityLV.EscalatedHeader;
import pcftest.ServiceRequestActivityLV.PriorityHeader;
import pcftest.ServiceRequestActivityLV.StatusHeader;
import pcftest.ServiceRequestActivityLV.SubjectHeader;
import pcftest.ServiceRequestActivityLV.UpdatedHeader;
import pcftest.ServiceRequestActivityLV._ListPaging;
import pcftest.ServiceRequestActivityLV.entry;
import pcftest.ServiceRequestActivityLV.entry.Subject;
import pcftest.ServiceRequestActivityLV.entry._Select;
import pcftest.ServiceRequestActivityLV.entry._ViewDetail;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/servicerequests/ServiceRequestActivityLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ServiceRequestActivityLV extends PCFElement {
  public final static String CHECKSUM = "5461164e9a7e5d776a107e6ad04ffc61";
  
  public ServiceRequestActivityLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public AssignedUserHeader getAssignedUserHeader() {
    return getOrCreateProperty("AssignedUserHeader", "AssignedUserHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ServiceRequestActivityLV.AssignedUserHeader.class);
  }
  
  public AssignerHeader getAssignerHeader() {
    return getOrCreateProperty("AssignerHeader", "AssignerHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ServiceRequestActivityLV.AssignerHeader.class);
  }
  
  public DueDateHeader getDueDateHeader() {
    return getOrCreateProperty("DueDateHeader", "DueDateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ServiceRequestActivityLV.DueDateHeader.class);
  }
  
  public EscalatedHeader getEscalatedHeader() {
    return getOrCreateProperty("EscalatedHeader", "EscalatedHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ServiceRequestActivityLV.EscalatedHeader.class);
  }
  
  public PriorityHeader getPriorityHeader() {
    return getOrCreateProperty("PriorityHeader", "PriorityHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ServiceRequestActivityLV.PriorityHeader.class);
  }
  
  public SelectElement getServiceRequestFilter() {
    return getOrCreateProperty("ServiceRequestFilter", "ServiceRequestFilter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewToolbarFilter, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public StatusHeader getStatusHeader() {
    return getOrCreateProperty("StatusHeader", "StatusHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ServiceRequestActivityLV.StatusHeader.class);
  }
  
  public SubjectHeader getSubjectHeader() {
    return getOrCreateProperty("SubjectHeader", "SubjectHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ServiceRequestActivityLV.SubjectHeader.class);
  }
  
  public UpdatedHeader getUpdatedHeader() {
    return getOrCreateProperty("UpdatedHeader", "UpdatedHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ServiceRequestActivityLV.UpdatedHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ServiceRequestActivityLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ServiceRequestActivityLV._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/servicerequests/ServiceRequestActivityLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AssignedUserHeader extends ValueElement {
    public AssignedUserHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/servicerequests/ServiceRequestActivityLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AssignerHeader extends ValueElement {
    public AssignerHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/servicerequests/ServiceRequestActivityLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DueDateHeader extends ValueElement {
    public DueDateHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/servicerequests/ServiceRequestActivityLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EscalatedHeader extends ValueElement {
    public EscalatedHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/servicerequests/ServiceRequestActivityLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PriorityHeader extends ValueElement {
    public PriorityHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/servicerequests/ServiceRequestActivityLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class StatusHeader extends ValueElement {
    public StatusHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/servicerequests/ServiceRequestActivityLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SubjectHeader extends ValueElement {
    public SubjectHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/servicerequests/ServiceRequestActivityLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class UpdatedHeader extends ValueElement {
    public UpdatedHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/servicerequests/ServiceRequestActivityLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/servicerequests/ServiceRequestActivityLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getAssignedUser() {
      return getOrCreateProperty("AssignedUser", "AssignedUser", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getAssigner() {
      return getOrCreateProperty("Assigner", "Assigner", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public DateElement getDueDate() {
      return getOrCreateProperty("DueDate", "DueDate", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public BooleanValueElement getEscalated() {
      return getOrCreateProperty("Escalated", "Escalated", null, gw.smoketest.platform.web.BooleanValueElement.class);
    }
    
    public pcftest.ServiceRequestActivityLV.entry.Priority getPriority() {
      return getOrCreateProperty("Priority", "Priority", null, pcftest.ServiceRequestActivityLV.entry.Priority.class);
    }
    
    public ValueElement getStatus() {
      return getOrCreateProperty("Status", "Status", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public Subject getSubject() {
      return getOrCreateProperty("Subject", "Subject", null, pcftest.ServiceRequestActivityLV.entry.Subject.class);
    }
    
    public BooleanValueElement getUpdated() {
      return getOrCreateProperty("Updated", "Updated", null, gw.smoketest.platform.web.BooleanValueElement.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.ServiceRequestActivityLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ServiceRequestActivityLV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/servicerequests/ServiceRequestActivityLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Priority extends SelectElement {
      public Priority(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(typekey.Priority arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public typekey.Priority getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.Priority.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(typekey.Priority arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/servicerequests/ServiceRequestActivityLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Subject extends ValueElement {
      public Subject(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/servicerequests/ServiceRequestActivityLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/servicerequests/ServiceRequestActivityLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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