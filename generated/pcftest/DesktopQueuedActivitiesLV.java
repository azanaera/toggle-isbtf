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
import pcftest.DesktopQueuedActivitiesLV.AssignmentDateHeader;
import pcftest.DesktopQueuedActivitiesLV.CaseIDHeader;
import pcftest.DesktopQueuedActivitiesLV.DueDateHeader;
import pcftest.DesktopQueuedActivitiesLV.EscalatedHeader;
import pcftest.DesktopQueuedActivitiesLV.ExposureHeader;
import pcftest.DesktopQueuedActivitiesLV.ExternallyOwnedHeader;
import pcftest.DesktopQueuedActivitiesLV.InsuredHeader;
import pcftest.DesktopQueuedActivitiesLV.NewActivityHeader;
import pcftest.DesktopQueuedActivitiesLV.PriorityHeader;
import pcftest.DesktopQueuedActivitiesLV.SubjectHeader;
import pcftest.DesktopQueuedActivitiesLV._ListPaging;
import pcftest.DesktopQueuedActivitiesLV.entry;
import pcftest.DesktopQueuedActivitiesLV.entry.CaseID;
import pcftest.DesktopQueuedActivitiesLV.entry.Insured;
import pcftest.DesktopQueuedActivitiesLV.entry.Subject;
import pcftest.DesktopQueuedActivitiesLV.entry._Select;
import pcftest.DesktopQueuedActivitiesLV.entry._ViewDetail;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/desktop/queues/DesktopQueuedActivitiesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class DesktopQueuedActivitiesLV extends PCFElement {
  public final static String CHECKSUM = "a4619c81df206c7a0fdec2b9292c9815";
  
  public DesktopQueuedActivitiesLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public AssignmentDateHeader getAssignmentDateHeader() {
    return getOrCreateProperty("AssignmentDateHeader", "AssignmentDateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.DesktopQueuedActivitiesLV.AssignmentDateHeader.class);
  }
  
  public CaseIDHeader getCaseIDHeader() {
    return getOrCreateProperty("CaseIDHeader", "CaseIDHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.DesktopQueuedActivitiesLV.CaseIDHeader.class);
  }
  
  public DueDateHeader getDueDateHeader() {
    return getOrCreateProperty("DueDateHeader", "DueDateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.DesktopQueuedActivitiesLV.DueDateHeader.class);
  }
  
  public EscalatedHeader getEscalatedHeader() {
    return getOrCreateProperty("EscalatedHeader", "EscalatedHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.DesktopQueuedActivitiesLV.EscalatedHeader.class);
  }
  
  public ExposureHeader getExposureHeader() {
    return getOrCreateProperty("ExposureHeader", "ExposureHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.DesktopQueuedActivitiesLV.ExposureHeader.class);
  }
  
  public ExternallyOwnedHeader getExternallyOwnedHeader() {
    return getOrCreateProperty("ExternallyOwnedHeader", "ExternallyOwnedHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.DesktopQueuedActivitiesLV.ExternallyOwnedHeader.class);
  }
  
  public InsuredHeader getInsuredHeader() {
    return getOrCreateProperty("InsuredHeader", "InsuredHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.DesktopQueuedActivitiesLV.InsuredHeader.class);
  }
  
  public NewActivityHeader getNewActivityHeader() {
    return getOrCreateProperty("NewActivityHeader", "NewActivityHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.DesktopQueuedActivitiesLV.NewActivityHeader.class);
  }
  
  public PriorityHeader getPriorityHeader() {
    return getOrCreateProperty("PriorityHeader", "PriorityHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.DesktopQueuedActivitiesLV.PriorityHeader.class);
  }
  
  public SubjectHeader getSubjectHeader() {
    return getOrCreateProperty("SubjectHeader", "SubjectHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.DesktopQueuedActivitiesLV.SubjectHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.DesktopQueuedActivitiesLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.DesktopQueuedActivitiesLV._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/desktop/queues/DesktopQueuedActivitiesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AssignmentDateHeader extends ValueElement {
    public AssignmentDateHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/desktop/queues/DesktopQueuedActivitiesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CaseIDHeader extends ValueElement {
    public CaseIDHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/desktop/queues/DesktopQueuedActivitiesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DueDateHeader extends ValueElement {
    public DueDateHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/desktop/queues/DesktopQueuedActivitiesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EscalatedHeader extends ValueElement {
    public EscalatedHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/desktop/queues/DesktopQueuedActivitiesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ExposureHeader extends ValueElement {
    public ExposureHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/desktop/queues/DesktopQueuedActivitiesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ExternallyOwnedHeader extends ValueElement {
    public ExternallyOwnedHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/desktop/queues/DesktopQueuedActivitiesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class InsuredHeader extends ValueElement {
    public InsuredHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/desktop/queues/DesktopQueuedActivitiesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewActivityHeader extends ValueElement {
    public NewActivityHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/desktop/queues/DesktopQueuedActivitiesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PriorityHeader extends ValueElement {
    public PriorityHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/desktop/queues/DesktopQueuedActivitiesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SubjectHeader extends ValueElement {
    public SubjectHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/desktop/queues/DesktopQueuedActivitiesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/desktop/queues/DesktopQueuedActivitiesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public DateElement getAssignmentDate() {
      return getOrCreateProperty("AssignmentDate", "AssignmentDate", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public CaseID getCaseID() {
      return getOrCreateProperty("CaseID", "CaseID", null, pcftest.DesktopQueuedActivitiesLV.entry.CaseID.class);
    }
    
    public DateElement getDueDate() {
      return getOrCreateProperty("DueDate", "DueDate", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public BooleanValueElement getEscalated() {
      return getOrCreateProperty("Escalated", "Escalated", null, gw.smoketest.platform.web.BooleanValueElement.class);
    }
    
    public ValueElement getExposure() {
      return getOrCreateProperty("Exposure", "Exposure", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public BooleanValueElement getExternallyOwned() {
      return getOrCreateProperty("ExternallyOwned", "ExternallyOwned", null, gw.smoketest.platform.web.BooleanValueElement.class);
    }
    
    public Insured getInsured() {
      return getOrCreateProperty("Insured", "Insured", null, pcftest.DesktopQueuedActivitiesLV.entry.Insured.class);
    }
    
    public BooleanValueElement getNewActivity() {
      return getOrCreateProperty("NewActivity", "NewActivity", null, gw.smoketest.platform.web.BooleanValueElement.class);
    }
    
    public pcftest.DesktopQueuedActivitiesLV.entry.Priority getPriority() {
      return getOrCreateProperty("Priority", "Priority", null, pcftest.DesktopQueuedActivitiesLV.entry.Priority.class);
    }
    
    public Subject getSubject() {
      return getOrCreateProperty("Subject", "Subject", null, pcftest.DesktopQueuedActivitiesLV.entry.Subject.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.DesktopQueuedActivitiesLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.DesktopQueuedActivitiesLV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/desktop/queues/DesktopQueuedActivitiesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CaseID extends ValueElement {
      public CaseID(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/desktop/queues/DesktopQueuedActivitiesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Insured extends ValueElement {
      public Insured(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ClaimContactDetailPopup click() {
        return clickThis(pcftest.ClaimContactDetailPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/desktop/queues/DesktopQueuedActivitiesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/desktop/queues/DesktopQueuedActivitiesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Subject extends ValueElement {
      public Subject(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/desktop/queues/DesktopQueuedActivitiesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/desktop/queues/DesktopQueuedActivitiesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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