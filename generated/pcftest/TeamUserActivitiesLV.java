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
import pcftest.TeamUserActivitiesLV.CaseIDHeader;
import pcftest.TeamUserActivitiesLV.DueDateHeader;
import pcftest.TeamUserActivitiesLV.EscalatedHeader;
import pcftest.TeamUserActivitiesLV.ExternallyOwnedHeader;
import pcftest.TeamUserActivitiesLV.InsuredHeader;
import pcftest.TeamUserActivitiesLV.LOBHeader;
import pcftest.TeamUserActivitiesLV.PriorityHeader;
import pcftest.TeamUserActivitiesLV.StateHeader;
import pcftest.TeamUserActivitiesLV.SubjectHeader;
import pcftest.TeamUserActivitiesLV._ListPaging;
import pcftest.TeamUserActivitiesLV.entry;
import pcftest.TeamUserActivitiesLV.entry.CaseID;
import pcftest.TeamUserActivitiesLV.entry.Insured;
import pcftest.TeamUserActivitiesLV.entry.LOB;
import pcftest.TeamUserActivitiesLV.entry.State;
import pcftest.TeamUserActivitiesLV.entry.Subject;
import pcftest.TeamUserActivitiesLV.entry._Select;
import pcftest.TeamUserActivitiesLV.entry._ViewDetail;
import typekey.Jurisdiction;
import typekey.LOBCode;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/team/user/TeamUserActivitiesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class TeamUserActivitiesLV extends PCFElement {
  public final static String CHECKSUM = "45d6e77e174567edd0dd498145ed0855";
  
  public TeamUserActivitiesLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public CaseIDHeader getCaseIDHeader() {
    return getOrCreateProperty("CaseIDHeader", "CaseIDHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.TeamUserActivitiesLV.CaseIDHeader.class);
  }
  
  public DueDateHeader getDueDateHeader() {
    return getOrCreateProperty("DueDateHeader", "DueDateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.TeamUserActivitiesLV.DueDateHeader.class);
  }
  
  public EscalatedHeader getEscalatedHeader() {
    return getOrCreateProperty("EscalatedHeader", "EscalatedHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.TeamUserActivitiesLV.EscalatedHeader.class);
  }
  
  public ExternallyOwnedHeader getExternallyOwnedHeader() {
    return getOrCreateProperty("ExternallyOwnedHeader", "ExternallyOwnedHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.TeamUserActivitiesLV.ExternallyOwnedHeader.class);
  }
  
  public InsuredHeader getInsuredHeader() {
    return getOrCreateProperty("InsuredHeader", "InsuredHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.TeamUserActivitiesLV.InsuredHeader.class);
  }
  
  public LOBHeader getLOBHeader() {
    return getOrCreateProperty("LOBHeader", "LOBHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.TeamUserActivitiesLV.LOBHeader.class);
  }
  
  public PriorityHeader getPriorityHeader() {
    return getOrCreateProperty("PriorityHeader", "PriorityHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.TeamUserActivitiesLV.PriorityHeader.class);
  }
  
  public StateHeader getStateHeader() {
    return getOrCreateProperty("StateHeader", "StateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.TeamUserActivitiesLV.StateHeader.class);
  }
  
  public SubjectHeader getSubjectHeader() {
    return getOrCreateProperty("SubjectHeader", "SubjectHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.TeamUserActivitiesLV.SubjectHeader.class);
  }
  
  public SelectElement getTeamUserActivitiesFilter() {
    return getOrCreateProperty("TeamUserActivitiesFilter", "TeamUserActivitiesFilter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewToolbarFilter, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.TeamUserActivitiesLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.TeamUserActivitiesLV._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/user/TeamUserActivitiesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CaseIDHeader extends ValueElement {
    public CaseIDHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/user/TeamUserActivitiesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DueDateHeader extends ValueElement {
    public DueDateHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/user/TeamUserActivitiesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EscalatedHeader extends ValueElement {
    public EscalatedHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/user/TeamUserActivitiesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ExternallyOwnedHeader extends ValueElement {
    public ExternallyOwnedHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/user/TeamUserActivitiesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class InsuredHeader extends ValueElement {
    public InsuredHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/user/TeamUserActivitiesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LOBHeader extends ValueElement {
    public LOBHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/user/TeamUserActivitiesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PriorityHeader extends ValueElement {
    public PriorityHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/user/TeamUserActivitiesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class StateHeader extends ValueElement {
    public StateHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/user/TeamUserActivitiesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SubjectHeader extends ValueElement {
    public SubjectHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/user/TeamUserActivitiesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/team/user/TeamUserActivitiesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public CaseID getCaseID() {
      return getOrCreateProperty("CaseID", "CaseID", null, pcftest.TeamUserActivitiesLV.entry.CaseID.class);
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
      return getOrCreateProperty("Insured", "Insured", null, pcftest.TeamUserActivitiesLV.entry.Insured.class);
    }
    
    public LOB getLOB() {
      return getOrCreateProperty("LOB", "LOB", null, pcftest.TeamUserActivitiesLV.entry.LOB.class);
    }
    
    public pcftest.TeamUserActivitiesLV.entry.Priority getPriority() {
      return getOrCreateProperty("Priority", "Priority", null, pcftest.TeamUserActivitiesLV.entry.Priority.class);
    }
    
    public State getState() {
      return getOrCreateProperty("State", "State", null, pcftest.TeamUserActivitiesLV.entry.State.class);
    }
    
    public Subject getSubject() {
      return getOrCreateProperty("Subject", "Subject", null, pcftest.TeamUserActivitiesLV.entry.Subject.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.TeamUserActivitiesLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.TeamUserActivitiesLV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/team/user/TeamUserActivitiesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CaseID extends ValueElement {
      public CaseID(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/team/user/TeamUserActivitiesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Insured extends ValueElement {
      public Insured(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ClaimContactDetailPopup click() {
        return clickThis(pcftest.ClaimContactDetailPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/team/user/TeamUserActivitiesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/team/user/TeamUserActivitiesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/team/user/TeamUserActivitiesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/team/user/TeamUserActivitiesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Subject extends ValueElement {
      public Subject(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/team/user/TeamUserActivitiesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/team/user/TeamUserActivitiesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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