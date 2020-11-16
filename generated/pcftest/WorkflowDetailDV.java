package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.DetailViewElement;
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
import pcftest.WorkflowDetailDV.ActiveState;
import pcftest.WorkflowDetailDV.CurrentAction;
import pcftest.WorkflowDetailDV.Handler;
import pcftest.WorkflowDetailDV.Parent;
import pcftest.WorkflowDetailDV.Type;
import pcftest.WorkflowDetailDV.WorkflowActivitiesLV;
import pcftest.WorkflowDetailDV.WorkflowActivitiesLV.AssignedUserHeader;
import pcftest.WorkflowDetailDV.WorkflowActivitiesLV.EscalatedHeader;
import pcftest.WorkflowDetailDV.WorkflowActivitiesLV.NewActivityHeader;
import pcftest.WorkflowDetailDV.WorkflowActivitiesLV.PriorityHeader;
import pcftest.WorkflowDetailDV.WorkflowActivitiesLV.SubjectHeader;
import pcftest.WorkflowDetailDV.WorkflowActivitiesLV.TargetDateHeader;
import pcftest.WorkflowDetailDV.WorkflowActivitiesLV_tb;
import pcftest.WorkflowDetailDV.WorkflowLogLV;
import pcftest.WorkflowDetailDV.WorkflowLogLV.LogDateHeader;
import pcftest.WorkflowDetailDV.WorkflowLogLV.SummaryHeader;
import pcftest.WorkflowDetailDV.WorkflowLogLV.entry.Summary;
import pcftest.WorkflowDetailDV.WorkflowLogLV_tb;
import pcftest.WorkflowDetailDV.WorkflowWorkItemsLV;
import pcftest.WorkflowDetailDV.WorkflowWorkItemsLV.AvailableAtTimeHeader;
import pcftest.WorkflowDetailDV.WorkflowWorkItemsLV.CheckedOutByHeader;
import pcftest.WorkflowDetailDV.WorkflowWorkItemsLV.CreationTimeHeader;
import pcftest.WorkflowDetailDV.WorkflowWorkItemsLV.LastUndateTimeHeader;
import pcftest.WorkflowDetailDV.WorkflowWorkItemsLV.NumRetriesHeader;
import pcftest.WorkflowDetailDV.WorkflowWorkItemsLV_tb;
import typekey.ActivityStatus;
import typekey.WorkItemStatusType;
import typekey.Workflow;
import typekey.WorkflowActionType;
import typekey.WorkflowActiveState;
import typekey.WorkflowHandler;
import typekey.WorkflowState;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/workflow/WorkflowDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class WorkflowDetailDV extends DetailViewElement {
  public final static String CHECKSUM = "9e51f008f20301f31c7bf8a3411e51a9";
  
  public WorkflowDetailDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ActiveState getActiveState() {
    return getOrCreateProperty("ActiveState", "ActiveState", null, pcftest.WorkflowDetailDV.ActiveState.class);
  }
  
  public CurrentAction getCurrentAction() {
    return getOrCreateProperty("CurrentAction", "CurrentAction", null, pcftest.WorkflowDetailDV.CurrentAction.class);
  }
  
  public ValueElement getCurrentStep() {
    return getOrCreateProperty("CurrentStep", "CurrentStep", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Handler getHandler() {
    return getOrCreateProperty("Handler", "Handler", null, pcftest.WorkflowDetailDV.Handler.class);
  }
  
  public Parent getParent() {
    return getOrCreateProperty("Parent", "Parent", null, pcftest.WorkflowDetailDV.Parent.class);
  }
  
  public ValueElement getPrevStep() {
    return getOrCreateProperty("PrevStep", "PrevStep", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getProcessVersion() {
    return getOrCreateProperty("ProcessVersion", "ProcessVersion", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public pcftest.WorkflowDetailDV.Status getStatus() {
    return getOrCreateProperty("Status", "Status", null, pcftest.WorkflowDetailDV.Status.class);
  }
  
  public DateElement getTimeout() {
    return getOrCreateProperty("Timeout", "Timeout", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public ValueElement getTimeouts() {
    return getOrCreateProperty("Timeouts", "Timeouts", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getTriggers() {
    return getOrCreateProperty("Triggers", "Triggers", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Type getType() {
    return getOrCreateProperty("Type", "Type", null, pcftest.WorkflowDetailDV.Type.class);
  }
  
  public WorkflowActivitiesLV getWorkflowActivitiesLV() {
    return getOrCreateProperty("WorkflowActivitiesLV", "WorkflowActivitiesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.WorkflowDetailDV.WorkflowActivitiesLV.class);
  }
  
  public WorkflowActivitiesLV_tb getWorkflowActivitiesLV_tb() {
    return getOrCreateProperty("WorkflowActivitiesLV_tb", "WorkflowActivitiesLV_tb", null, pcftest.WorkflowDetailDV.WorkflowActivitiesLV_tb.class);
  }
  
  public WorkflowLogLV getWorkflowLogLV() {
    return getOrCreateProperty("WorkflowLogLV", "WorkflowLogLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.WorkflowDetailDV.WorkflowLogLV.class);
  }
  
  public WorkflowLogLV_tb getWorkflowLogLV_tb() {
    return getOrCreateProperty("WorkflowLogLV_tb", "WorkflowLogLV_tb", null, pcftest.WorkflowDetailDV.WorkflowLogLV_tb.class);
  }
  
  public WorkflowWorkItemsLV getWorkflowWorkItemsLV() {
    return getOrCreateProperty("WorkflowWorkItemsLV", "WorkflowWorkItemsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.WorkflowDetailDV.WorkflowWorkItemsLV.class);
  }
  
  public WorkflowWorkItemsLV_tb getWorkflowWorkItemsLV_tb() {
    return getOrCreateProperty("WorkflowWorkItemsLV_tb", "WorkflowWorkItemsLV_tb", null, pcftest.WorkflowDetailDV.WorkflowWorkItemsLV_tb.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/workflow/WorkflowDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ActiveState extends SelectElement {
    public ActiveState(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(WorkflowActiveState arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public WorkflowActiveState getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.WorkflowActiveState.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(WorkflowActiveState arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/workflow/WorkflowDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CurrentAction extends SelectElement {
    public CurrentAction(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(WorkflowActionType arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public WorkflowActionType getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.WorkflowActionType.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(WorkflowActionType arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/workflow/WorkflowDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Handler extends SelectElement {
    public Handler(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(WorkflowHandler arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public WorkflowHandler getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.WorkflowHandler.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(WorkflowHandler arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/workflow/WorkflowDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Parent extends ValueElement {
    public Parent(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public WorkflowDetail click() {
      return clickThis(pcftest.WorkflowDetail.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/workflow/WorkflowDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Status extends SelectElement {
    public Status(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(WorkflowState arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public WorkflowState getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.WorkflowState.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(WorkflowState arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/workflow/WorkflowDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Type extends SelectElement {
    public Type(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(Workflow arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public Workflow getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.Workflow.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(Workflow arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/workflow/WorkflowDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class WorkflowActivitiesLV extends PCFElement {
    public WorkflowActivitiesLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public AssignedUserHeader getAssignedUserHeader() {
      return getOrCreateProperty("AssignedUserHeader", "AssignedUserHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.WorkflowDetailDV.WorkflowActivitiesLV.AssignedUserHeader.class);
    }
    
    public EscalatedHeader getEscalatedHeader() {
      return getOrCreateProperty("EscalatedHeader", "EscalatedHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.WorkflowDetailDV.WorkflowActivitiesLV.EscalatedHeader.class);
    }
    
    public NewActivityHeader getNewActivityHeader() {
      return getOrCreateProperty("NewActivityHeader", "NewActivityHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.WorkflowDetailDV.WorkflowActivitiesLV.NewActivityHeader.class);
    }
    
    public PriorityHeader getPriorityHeader() {
      return getOrCreateProperty("PriorityHeader", "PriorityHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.WorkflowDetailDV.WorkflowActivitiesLV.PriorityHeader.class);
    }
    
    public pcftest.WorkflowDetailDV.WorkflowActivitiesLV.StatusHeader getStatusHeader() {
      return getOrCreateProperty("StatusHeader", "StatusHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.WorkflowDetailDV.WorkflowActivitiesLV.StatusHeader.class);
    }
    
    public SubjectHeader getSubjectHeader() {
      return getOrCreateProperty("SubjectHeader", "SubjectHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.WorkflowDetailDV.WorkflowActivitiesLV.SubjectHeader.class);
    }
    
    public TargetDateHeader getTargetDateHeader() {
      return getOrCreateProperty("TargetDateHeader", "TargetDateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.WorkflowDetailDV.WorkflowActivitiesLV.TargetDateHeader.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<pcftest.WorkflowDetailDV.WorkflowActivitiesLV.entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.WorkflowDetailDV.WorkflowActivitiesLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public pcftest.WorkflowDetailDV.WorkflowActivitiesLV._ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.WorkflowDetailDV.WorkflowActivitiesLV._ListPaging.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/workflow/WorkflowDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class AssignedUserHeader extends ValueElement {
      public AssignedUserHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/workflow/WorkflowDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class EscalatedHeader extends ValueElement {
      public EscalatedHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/workflow/WorkflowDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class NewActivityHeader extends ValueElement {
      public NewActivityHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/workflow/WorkflowDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class PriorityHeader extends ValueElement {
      public PriorityHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/workflow/WorkflowDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class StatusHeader extends ValueElement {
      public StatusHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/workflow/WorkflowDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class SubjectHeader extends ValueElement {
      public SubjectHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/workflow/WorkflowDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class TargetDateHeader extends ValueElement {
      public TargetDateHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/workflow/WorkflowDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/workflow/WorkflowDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends RowElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ValueElement getAssignedUser() {
        return getOrCreateProperty("AssignedUser", "AssignedUser", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public BooleanValueElement getEscalated() {
        return getOrCreateProperty("Escalated", "Escalated", null, gw.smoketest.platform.web.BooleanValueElement.class);
      }
      
      public BooleanValueElement getNewActivity() {
        return getOrCreateProperty("NewActivity", "NewActivity", null, gw.smoketest.platform.web.BooleanValueElement.class);
      }
      
      public pcftest.WorkflowDetailDV.WorkflowActivitiesLV.entry.Priority getPriority() {
        return getOrCreateProperty("Priority", "Priority", null, pcftest.WorkflowDetailDV.WorkflowActivitiesLV.entry.Priority.class);
      }
      
      public pcftest.WorkflowDetailDV.WorkflowActivitiesLV.entry.Status getStatus() {
        return getOrCreateProperty("Status", "Status", null, pcftest.WorkflowDetailDV.WorkflowActivitiesLV.entry.Status.class);
      }
      
      public ValueElement getSubject() {
        return getOrCreateProperty("Subject", "Subject", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public DateElement getTargetDate() {
        return getOrCreateProperty("TargetDate", "TargetDate", null, gw.smoketest.platform.web.DateElement.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      public pcftest.WorkflowDetailDV.WorkflowActivitiesLV.entry._Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.WorkflowDetailDV.WorkflowActivitiesLV.entry._Select.class);
      }
      
      public pcftest.WorkflowDetailDV.WorkflowActivitiesLV.entry._ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.WorkflowDetailDV.WorkflowActivitiesLV.entry._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/admin/workflow/WorkflowDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
      @Generated(comments = "config/web/pcf/admin/workflow/WorkflowDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Status extends SelectElement {
        public Status(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public OptionElement getOptionByTypeKey(ActivityStatus arg) {
          return getOptionByValue(arg == null ? null : arg.getCode());
        }
        
        public ActivityStatus getTypeKeyValue() {
          String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.ActivityStatus.getTypeKey(myValue);
        }
        
        public void setTypeKeyValue(ActivityStatus arg) {
          setValue(arg == null ? null : arg.getCode());
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/admin/workflow/WorkflowDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/admin/workflow/WorkflowDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/workflow/WorkflowDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class WorkflowActivitiesLV_tb extends PCFElement {
    public WorkflowActivitiesLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/workflow/WorkflowDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class WorkflowLogLV extends PCFElement {
    public WorkflowLogLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public LogDateHeader getLogDateHeader() {
      return getOrCreateProperty("LogDateHeader", "LogDateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.WorkflowDetailDV.WorkflowLogLV.LogDateHeader.class);
    }
    
    public SummaryHeader getSummaryHeader() {
      return getOrCreateProperty("SummaryHeader", "SummaryHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.WorkflowDetailDV.WorkflowLogLV.SummaryHeader.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<pcftest.WorkflowDetailDV.WorkflowLogLV.entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.WorkflowDetailDV.WorkflowLogLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public pcftest.WorkflowDetailDV.WorkflowLogLV._ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.WorkflowDetailDV.WorkflowLogLV._ListPaging.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/workflow/WorkflowDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class LogDateHeader extends ValueElement {
      public LogDateHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/workflow/WorkflowDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class SummaryHeader extends ValueElement {
      public SummaryHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/workflow/WorkflowDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/workflow/WorkflowDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends RowElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ValueElement getLogDate() {
        return getOrCreateProperty("LogDate", "LogDate", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public Summary getSummary() {
        return getOrCreateProperty("Summary", "Summary", null, pcftest.WorkflowDetailDV.WorkflowLogLV.entry.Summary.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      public pcftest.WorkflowDetailDV.WorkflowLogLV.entry._Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.WorkflowDetailDV.WorkflowLogLV.entry._Select.class);
      }
      
      public pcftest.WorkflowDetailDV.WorkflowLogLV.entry._ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.WorkflowDetailDV.WorkflowLogLV.entry._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/admin/workflow/WorkflowDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Summary extends ValueElement {
        public Summary(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public WorkflowLogEntryDetail click() {
          return clickThis(pcftest.WorkflowLogEntryDetail.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/admin/workflow/WorkflowDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/admin/workflow/WorkflowDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/workflow/WorkflowDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class WorkflowLogLV_tb extends PCFElement {
    public WorkflowLogLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/workflow/WorkflowDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class WorkflowWorkItemsLV extends PCFElement {
    public WorkflowWorkItemsLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public AvailableAtTimeHeader getAvailableAtTimeHeader() {
      return getOrCreateProperty("AvailableAtTimeHeader", "AvailableAtTimeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.WorkflowDetailDV.WorkflowWorkItemsLV.AvailableAtTimeHeader.class);
    }
    
    public CheckedOutByHeader getCheckedOutByHeader() {
      return getOrCreateProperty("CheckedOutByHeader", "CheckedOutByHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.WorkflowDetailDV.WorkflowWorkItemsLV.CheckedOutByHeader.class);
    }
    
    public CreationTimeHeader getCreationTimeHeader() {
      return getOrCreateProperty("CreationTimeHeader", "CreationTimeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.WorkflowDetailDV.WorkflowWorkItemsLV.CreationTimeHeader.class);
    }
    
    public LastUndateTimeHeader getLastUndateTimeHeader() {
      return getOrCreateProperty("LastUndateTimeHeader", "LastUndateTimeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.WorkflowDetailDV.WorkflowWorkItemsLV.LastUndateTimeHeader.class);
    }
    
    public NumRetriesHeader getNumRetriesHeader() {
      return getOrCreateProperty("NumRetriesHeader", "NumRetriesHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.WorkflowDetailDV.WorkflowWorkItemsLV.NumRetriesHeader.class);
    }
    
    public pcftest.WorkflowDetailDV.WorkflowWorkItemsLV.StatusHeader getStatusHeader() {
      return getOrCreateProperty("StatusHeader", "StatusHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.WorkflowDetailDV.WorkflowWorkItemsLV.StatusHeader.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<pcftest.WorkflowDetailDV.WorkflowWorkItemsLV.entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.WorkflowDetailDV.WorkflowWorkItemsLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public pcftest.WorkflowDetailDV.WorkflowWorkItemsLV._ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.WorkflowDetailDV.WorkflowWorkItemsLV._ListPaging.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/workflow/WorkflowDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class AvailableAtTimeHeader extends ValueElement {
      public AvailableAtTimeHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/workflow/WorkflowDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CheckedOutByHeader extends ValueElement {
      public CheckedOutByHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/workflow/WorkflowDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CreationTimeHeader extends ValueElement {
      public CreationTimeHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/workflow/WorkflowDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class LastUndateTimeHeader extends ValueElement {
      public LastUndateTimeHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/workflow/WorkflowDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class NumRetriesHeader extends ValueElement {
      public NumRetriesHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/workflow/WorkflowDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class StatusHeader extends ValueElement {
      public StatusHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/workflow/WorkflowDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/workflow/WorkflowDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends RowElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public DateElement getAvailableAtTime() {
        return getOrCreateProperty("AvailableAtTime", "AvailableAtTime", null, gw.smoketest.platform.web.DateElement.class);
      }
      
      public ValueElement getCheckedOutBy() {
        return getOrCreateProperty("CheckedOutBy", "CheckedOutBy", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public DateElement getCreationTime() {
        return getOrCreateProperty("CreationTime", "CreationTime", null, gw.smoketest.platform.web.DateElement.class);
      }
      
      public DateElement getLastUndateTime() {
        return getOrCreateProperty("LastUndateTime", "LastUndateTime", null, gw.smoketest.platform.web.DateElement.class);
      }
      
      public ValueElement getNumRetries() {
        return getOrCreateProperty("NumRetries", "NumRetries", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public pcftest.WorkflowDetailDV.WorkflowWorkItemsLV.entry.Status getStatus() {
        return getOrCreateProperty("Status", "Status", null, pcftest.WorkflowDetailDV.WorkflowWorkItemsLV.entry.Status.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      public pcftest.WorkflowDetailDV.WorkflowWorkItemsLV.entry._Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.WorkflowDetailDV.WorkflowWorkItemsLV.entry._Select.class);
      }
      
      public pcftest.WorkflowDetailDV.WorkflowWorkItemsLV.entry._ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.WorkflowDetailDV.WorkflowWorkItemsLV.entry._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/admin/workflow/WorkflowDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Status extends SelectElement {
        public Status(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public OptionElement getOptionByTypeKey(WorkItemStatusType arg) {
          return getOptionByValue(arg == null ? null : arg.getCode());
        }
        
        public WorkItemStatusType getTypeKeyValue() {
          String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.WorkItemStatusType.getTypeKey(myValue);
        }
        
        public void setTypeKeyValue(WorkItemStatusType arg) {
          setValue(arg == null ? null : arg.getCode());
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/admin/workflow/WorkflowDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/admin/workflow/WorkflowDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/workflow/WorkflowDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class WorkflowWorkItemsLV_tb extends PCFElement {
    public WorkflowWorkItemsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  
}