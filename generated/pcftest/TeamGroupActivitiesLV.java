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
import pcftest.TeamGroupActivitiesLV.AssignedUserHeader;
import pcftest.TeamGroupActivitiesLV.CaseIDHeader;
import pcftest.TeamGroupActivitiesLV.DueDateHeader;
import pcftest.TeamGroupActivitiesLV.EscalatedHeader;
import pcftest.TeamGroupActivitiesLV.ExternallyOwnedHeader;
import pcftest.TeamGroupActivitiesLV.InsuredHeader;
import pcftest.TeamGroupActivitiesLV.LOBHeader;
import pcftest.TeamGroupActivitiesLV.PriorityHeader;
import pcftest.TeamGroupActivitiesLV.StateHeader;
import pcftest.TeamGroupActivitiesLV.SubjectHeader;
import pcftest.TeamGroupActivitiesLV._ListPaging;
import pcftest.TeamGroupActivitiesLV.entry;
import pcftest.TeamGroupActivitiesLV.entry.CaseID;
import pcftest.TeamGroupActivitiesLV.entry.Insured;
import pcftest.TeamGroupActivitiesLV.entry.LOB;
import pcftest.TeamGroupActivitiesLV.entry.State;
import pcftest.TeamGroupActivitiesLV.entry.Subject;
import pcftest.TeamGroupActivitiesLV.entry._Select;
import pcftest.TeamGroupActivitiesLV.entry._ViewDetail;
import typekey.Jurisdiction;
import typekey.LOBCode;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/team/activities/TeamGroupActivitiesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class TeamGroupActivitiesLV extends PCFElement {
  public final static String CHECKSUM = "daf747447a7287fd90d68e45794c273d";
  
  public TeamGroupActivitiesLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public AssignedUserHeader getAssignedUserHeader() {
    return getOrCreateProperty("AssignedUserHeader", "AssignedUserHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.TeamGroupActivitiesLV.AssignedUserHeader.class);
  }
  
  public CaseIDHeader getCaseIDHeader() {
    return getOrCreateProperty("CaseIDHeader", "CaseIDHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.TeamGroupActivitiesLV.CaseIDHeader.class);
  }
  
  public DueDateHeader getDueDateHeader() {
    return getOrCreateProperty("DueDateHeader", "DueDateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.TeamGroupActivitiesLV.DueDateHeader.class);
  }
  
  public EscalatedHeader getEscalatedHeader() {
    return getOrCreateProperty("EscalatedHeader", "EscalatedHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.TeamGroupActivitiesLV.EscalatedHeader.class);
  }
  
  public ExternallyOwnedHeader getExternallyOwnedHeader() {
    return getOrCreateProperty("ExternallyOwnedHeader", "ExternallyOwnedHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.TeamGroupActivitiesLV.ExternallyOwnedHeader.class);
  }
  
  public InsuredHeader getInsuredHeader() {
    return getOrCreateProperty("InsuredHeader", "InsuredHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.TeamGroupActivitiesLV.InsuredHeader.class);
  }
  
  public LOBHeader getLOBHeader() {
    return getOrCreateProperty("LOBHeader", "LOBHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.TeamGroupActivitiesLV.LOBHeader.class);
  }
  
  public PriorityHeader getPriorityHeader() {
    return getOrCreateProperty("PriorityHeader", "PriorityHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.TeamGroupActivitiesLV.PriorityHeader.class);
  }
  
  public StateHeader getStateHeader() {
    return getOrCreateProperty("StateHeader", "StateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.TeamGroupActivitiesLV.StateHeader.class);
  }
  
  public SubjectHeader getSubjectHeader() {
    return getOrCreateProperty("SubjectHeader", "SubjectHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.TeamGroupActivitiesLV.SubjectHeader.class);
  }
  
  public SelectElement getTeamGroupActivitiesFilter() {
    return getOrCreateProperty("TeamGroupActivitiesFilter", "TeamGroupActivitiesFilter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewToolbarFilter, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.TeamGroupActivitiesLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.TeamGroupActivitiesLV._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/activities/TeamGroupActivitiesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AssignedUserHeader extends ValueElement {
    public AssignedUserHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/activities/TeamGroupActivitiesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CaseIDHeader extends ValueElement {
    public CaseIDHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/activities/TeamGroupActivitiesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DueDateHeader extends ValueElement {
    public DueDateHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/activities/TeamGroupActivitiesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EscalatedHeader extends ValueElement {
    public EscalatedHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/activities/TeamGroupActivitiesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ExternallyOwnedHeader extends ValueElement {
    public ExternallyOwnedHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/activities/TeamGroupActivitiesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class InsuredHeader extends ValueElement {
    public InsuredHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/activities/TeamGroupActivitiesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LOBHeader extends ValueElement {
    public LOBHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/activities/TeamGroupActivitiesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PriorityHeader extends ValueElement {
    public PriorityHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/activities/TeamGroupActivitiesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class StateHeader extends ValueElement {
    public StateHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/activities/TeamGroupActivitiesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SubjectHeader extends ValueElement {
    public SubjectHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/activities/TeamGroupActivitiesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/activities/TeamGroupActivitiesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getAssignedUser() {
      return getOrCreateProperty("AssignedUser", "AssignedUser", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public CaseID getCaseID() {
      return getOrCreateProperty("CaseID", "CaseID", null, pcftest.TeamGroupActivitiesLV.entry.CaseID.class);
    }
    
    public DateElement getDueDate() {
      return getOrCreateProperty("DueDate", "DueDate", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public BooleanValueElement getEscalated() {
      return getOrCreateProperty("Escalated", "Escalated", null, gw.smoketest.platform.web.BooleanValueElement.class);
    }
    
    public BooleanValueElement getExternallyOwned() {
      return getOrCreateProperty("ExternallyOwned", "ExternallyOwned", null, gw.smoketest.platform.web.BooleanValueElement.class);
    }
    
    public Insured getInsured() {
      return getOrCreateProperty("Insured", "Insured", null, pcftest.TeamGroupActivitiesLV.entry.Insured.class);
    }
    
    public LOB getLOB() {
      return getOrCreateProperty("LOB", "LOB", null, pcftest.TeamGroupActivitiesLV.entry.LOB.class);
    }
    
    public pcftest.TeamGroupActivitiesLV.entry.Priority getPriority() {
      return getOrCreateProperty("Priority", "Priority", null, pcftest.TeamGroupActivitiesLV.entry.Priority.class);
    }
    
    public State getState() {
      return getOrCreateProperty("State", "State", null, pcftest.TeamGroupActivitiesLV.entry.State.class);
    }
    
    public Subject getSubject() {
      return getOrCreateProperty("Subject", "Subject", null, pcftest.TeamGroupActivitiesLV.entry.Subject.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.TeamGroupActivitiesLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.TeamGroupActivitiesLV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/team/activities/TeamGroupActivitiesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CaseID extends ValueElement {
      public CaseID(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/team/activities/TeamGroupActivitiesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Insured extends ValueElement {
      public Insured(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ClaimContactDetailPopup click() {
        return clickThis(pcftest.ClaimContactDetailPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/team/activities/TeamGroupActivitiesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class LOB extends SelectElement {
      public LOB(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(LOBCode arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public LOBCode getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.LOBCode.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(LOBCode arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/team/activities/TeamGroupActivitiesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/team/activities/TeamGroupActivitiesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class State extends SelectElement {
      public State(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(Jurisdiction arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public Jurisdiction getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.Jurisdiction.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(Jurisdiction arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/team/activities/TeamGroupActivitiesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Subject extends ValueElement {
      public Subject(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/team/activities/TeamGroupActivitiesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/team/activities/TeamGroupActivitiesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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