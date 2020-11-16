package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
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
import pcftest.MetroFlowDetailDV.CurrentAction;
import pcftest.MetroFlowDetailDV.MetroFlowActivitiesLV;
import pcftest.MetroFlowDetailDV.MetroFlowActivitiesLV.AssignedUserHeader;
import pcftest.MetroFlowDetailDV.MetroFlowActivitiesLV.EscalatedHeader;
import pcftest.MetroFlowDetailDV.MetroFlowActivitiesLV.NewActivityHeader;
import pcftest.MetroFlowDetailDV.MetroFlowActivitiesLV.PriorityHeader;
import pcftest.MetroFlowDetailDV.MetroFlowActivitiesLV.SubjectHeader;
import pcftest.MetroFlowDetailDV.MetroFlowActivitiesLV.TargetDateHeader;
import pcftest.MetroFlowDetailDV.MetroFlowActivitiesLV.entry.AssignedUser;
import pcftest.MetroFlowDetailDV.MetroFlowActivitiesLV.entry.AssignedUser.AssignedUserUserSearchMenuItem;
import pcftest.MetroFlowDetailDV.MetroFlowActivitiesLV.entry.AssignedUser.AssignedUserUserSelectMenuItem;
import pcftest.MetroFlowDetailDV.MetroFlowActivitiesLV_tb;
import pcftest.MetroFlowDetailDV.MetroFlowLogLV;
import pcftest.MetroFlowDetailDV.MetroFlowLogLV.LogDateHeader;
import pcftest.MetroFlowDetailDV.MetroFlowLogLV.SummaryHeader;
import pcftest.MetroFlowDetailDV.MetroFlowLogLV.entry.Summary;
import pcftest.MetroFlowDetailDV.MetroFlowLogLV_tb;
import pcftest.MetroFlowDetailDV.Status;
import typekey.WorkflowActionType;
import typekey.WorkflowState;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/workflow/MetroFlowDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class MetroFlowDetailDV extends DetailViewElement {
  public final static String CHECKSUM = "9f149307570f1e37c714d1461a6131ac";
  
  public MetroFlowDetailDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public CurrentAction getCurrentAction() {
    return getOrCreateProperty("CurrentAction", "CurrentAction", null, pcftest.MetroFlowDetailDV.CurrentAction.class);
  }
  
  public ValueElement getCurrentStep() {
    return getOrCreateProperty("CurrentStep", "CurrentStep", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public MetroFlowActivitiesLV getMetroFlowActivitiesLV() {
    return getOrCreateProperty("MetroFlowActivitiesLV", "MetroFlowActivitiesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.MetroFlowDetailDV.MetroFlowActivitiesLV.class);
  }
  
  public MetroFlowActivitiesLV_tb getMetroFlowActivitiesLV_tb() {
    return getOrCreateProperty("MetroFlowActivitiesLV_tb", "MetroFlowActivitiesLV_tb", null, pcftest.MetroFlowDetailDV.MetroFlowActivitiesLV_tb.class);
  }
  
  public MetroFlowLogLV getMetroFlowLogLV() {
    return getOrCreateProperty("MetroFlowLogLV", "MetroFlowLogLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.MetroFlowDetailDV.MetroFlowLogLV.class);
  }
  
  public MetroFlowLogLV_tb getMetroFlowLogLV_tb() {
    return getOrCreateProperty("MetroFlowLogLV_tb", "MetroFlowLogLV_tb", null, pcftest.MetroFlowDetailDV.MetroFlowLogLV_tb.class);
  }
  
  public ValueElement getPrevStep() {
    return getOrCreateProperty("PrevStep", "PrevStep", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getProcessVersion() {
    return getOrCreateProperty("ProcessVersion", "ProcessVersion", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Status getStatus() {
    return getOrCreateProperty("Status", "Status", null, pcftest.MetroFlowDetailDV.Status.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/workflow/MetroFlowDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/tools/workflow/MetroFlowDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MetroFlowActivitiesLV extends PCFElement {
    public MetroFlowActivitiesLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public AssignedUserHeader getAssignedUserHeader() {
      return getOrCreateProperty("AssignedUserHeader", "AssignedUserHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.MetroFlowDetailDV.MetroFlowActivitiesLV.AssignedUserHeader.class);
    }
    
    public EscalatedHeader getEscalatedHeader() {
      return getOrCreateProperty("EscalatedHeader", "EscalatedHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.MetroFlowDetailDV.MetroFlowActivitiesLV.EscalatedHeader.class);
    }
    
    public NewActivityHeader getNewActivityHeader() {
      return getOrCreateProperty("NewActivityHeader", "NewActivityHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.MetroFlowDetailDV.MetroFlowActivitiesLV.NewActivityHeader.class);
    }
    
    public PriorityHeader getPriorityHeader() {
      return getOrCreateProperty("PriorityHeader", "PriorityHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.MetroFlowDetailDV.MetroFlowActivitiesLV.PriorityHeader.class);
    }
    
    public SubjectHeader getSubjectHeader() {
      return getOrCreateProperty("SubjectHeader", "SubjectHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.MetroFlowDetailDV.MetroFlowActivitiesLV.SubjectHeader.class);
    }
    
    public TargetDateHeader getTargetDateHeader() {
      return getOrCreateProperty("TargetDateHeader", "TargetDateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.MetroFlowDetailDV.MetroFlowActivitiesLV.TargetDateHeader.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<pcftest.MetroFlowDetailDV.MetroFlowActivitiesLV.entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.MetroFlowDetailDV.MetroFlowActivitiesLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public pcftest.MetroFlowDetailDV.MetroFlowActivitiesLV._ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.MetroFlowDetailDV.MetroFlowActivitiesLV._ListPaging.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/workflow/MetroFlowDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class AssignedUserHeader extends ValueElement {
      public AssignedUserHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/workflow/MetroFlowDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class EscalatedHeader extends ValueElement {
      public EscalatedHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/workflow/MetroFlowDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class NewActivityHeader extends ValueElement {
      public NewActivityHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/workflow/MetroFlowDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class PriorityHeader extends ValueElement {
      public PriorityHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/workflow/MetroFlowDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class SubjectHeader extends ValueElement {
      public SubjectHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/workflow/MetroFlowDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class TargetDateHeader extends ValueElement {
      public TargetDateHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/workflow/MetroFlowDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/workflow/MetroFlowDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends RowElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public AssignedUser getAssignedUser() {
        return getOrCreateProperty("AssignedUser", "AssignedUser", null, pcftest.MetroFlowDetailDV.MetroFlowActivitiesLV.entry.AssignedUser.class);
      }
      
      public BooleanValueElement getEscalated() {
        return getOrCreateProperty("Escalated", "Escalated", null, gw.smoketest.platform.web.BooleanValueElement.class);
      }
      
      public BooleanValueElement getNewActivity() {
        return getOrCreateProperty("NewActivity", "NewActivity", null, gw.smoketest.platform.web.BooleanValueElement.class);
      }
      
      public pcftest.MetroFlowDetailDV.MetroFlowActivitiesLV.entry.Priority getPriority() {
        return getOrCreateProperty("Priority", "Priority", null, pcftest.MetroFlowDetailDV.MetroFlowActivitiesLV.entry.Priority.class);
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
      
      public pcftest.MetroFlowDetailDV.MetroFlowActivitiesLV.entry._Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.MetroFlowDetailDV.MetroFlowActivitiesLV.entry._Select.class);
      }
      
      public pcftest.MetroFlowDetailDV.MetroFlowActivitiesLV.entry._ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.MetroFlowDetailDV.MetroFlowActivitiesLV.entry._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/widgets/UserWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class AssignedUser extends SelectElement {
        public AssignedUser(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public AssignedUserUserSearchMenuItem getAssignedUserUserSearchMenuItem() {
          return getOrCreateProperty("AssignedUserUserSearchMenuItem", "AssignedUserUserSearchMenuItem", null, pcftest.MetroFlowDetailDV.MetroFlowActivitiesLV.entry.AssignedUser.AssignedUserUserSearchMenuItem.class);
        }
        
        public AssignedUserUserSelectMenuItem getAssignedUserUserSelectMenuItem() {
          return getOrCreateProperty("AssignedUserUserSelectMenuItem", "AssignedUserUserSelectMenuItem", null, pcftest.MetroFlowDetailDV.MetroFlowActivitiesLV.entry.AssignedUser.AssignedUserUserSelectMenuItem.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/widgets/UserWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class AssignedUserUserSearchMenuItem extends ClickableActionElement {
          public AssignedUserUserSearchMenuItem(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public UserSearchPopup click() {
            return clickThis(pcftest.UserSearchPopup.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/widgets/UserWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class AssignedUserUserSelectMenuItem extends ClickableActionElement {
          public AssignedUserUserSelectMenuItem(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public UserSelectPopup click() {
            return clickThis(pcftest.UserSelectPopup.class);
          }
          
          
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/workflow/MetroFlowDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
      @Generated(comments = "config/web/pcf/tools/workflow/MetroFlowDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/workflow/MetroFlowDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/tools/workflow/MetroFlowDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MetroFlowActivitiesLV_tb extends PCFElement {
    public MetroFlowActivitiesLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/workflow/MetroFlowDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MetroFlowLogLV extends PCFElement {
    public MetroFlowLogLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public LogDateHeader getLogDateHeader() {
      return getOrCreateProperty("LogDateHeader", "LogDateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.MetroFlowDetailDV.MetroFlowLogLV.LogDateHeader.class);
    }
    
    public SummaryHeader getSummaryHeader() {
      return getOrCreateProperty("SummaryHeader", "SummaryHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.MetroFlowDetailDV.MetroFlowLogLV.SummaryHeader.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<pcftest.MetroFlowDetailDV.MetroFlowLogLV.entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.MetroFlowDetailDV.MetroFlowLogLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public pcftest.MetroFlowDetailDV.MetroFlowLogLV._ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.MetroFlowDetailDV.MetroFlowLogLV._ListPaging.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/workflow/MetroFlowDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class LogDateHeader extends ValueElement {
      public LogDateHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/workflow/MetroFlowDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class SummaryHeader extends ValueElement {
      public SummaryHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/workflow/MetroFlowDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/workflow/MetroFlowDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends RowElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ValueElement getLogDate() {
        return getOrCreateProperty("LogDate", "LogDate", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public Summary getSummary() {
        return getOrCreateProperty("Summary", "Summary", null, pcftest.MetroFlowDetailDV.MetroFlowLogLV.entry.Summary.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      public pcftest.MetroFlowDetailDV.MetroFlowLogLV.entry._Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.MetroFlowDetailDV.MetroFlowLogLV.entry._Select.class);
      }
      
      public pcftest.MetroFlowDetailDV.MetroFlowLogLV.entry._ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.MetroFlowDetailDV.MetroFlowLogLV.entry._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/workflow/MetroFlowDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Summary extends ValueElement {
        public Summary(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public WorkflowLogEntryDetail click() {
          return clickThis(pcftest.WorkflowLogEntryDetail.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/workflow/MetroFlowDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/workflow/MetroFlowDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/tools/workflow/MetroFlowDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MetroFlowLogLV_tb extends PCFElement {
    public MetroFlowLogLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/workflow/MetroFlowDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  
  
}