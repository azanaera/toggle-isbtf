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
import pcftest.WorkflowsLV.ActiveStateHeader;
import pcftest.WorkflowsLV.ChildrenHeader;
import pcftest.WorkflowsLV.CurrentStepHeader;
import pcftest.WorkflowsLV.ParentHeader;
import pcftest.WorkflowsLV.ProcessVersionHeader;
import pcftest.WorkflowsLV.StartTimeHeader;
import pcftest.WorkflowsLV.StatusHeader;
import pcftest.WorkflowsLV.TypeHeader;
import pcftest.WorkflowsLV.UpdateTimeHeader;
import pcftest.WorkflowsLV.WorkItemStateHeader;
import pcftest.WorkflowsLV.WorkTimeoutHeader;
import pcftest.WorkflowsLV._ListPaging;
import pcftest.WorkflowsLV.entry;
import pcftest.WorkflowsLV.entry.ActiveState;
import pcftest.WorkflowsLV.entry.Parent;
import pcftest.WorkflowsLV.entry.Status;
import pcftest.WorkflowsLV.entry.Type;
import pcftest.WorkflowsLV.entry._Select;
import pcftest.WorkflowsLV.entry._ViewDetail;
import typekey.Workflow;
import typekey.WorkflowActiveState;
import typekey.WorkflowState;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/workflow/WorkflowsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class WorkflowsLV extends PCFElement {
  public final static String CHECKSUM = "dc0c5ab25af705a67cd5f0b6f9d09b2d";
  
  public WorkflowsLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ActiveStateHeader getActiveStateHeader() {
    return getOrCreateProperty("ActiveStateHeader", "ActiveStateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.WorkflowsLV.ActiveStateHeader.class);
  }
  
  public ChildrenHeader getChildrenHeader() {
    return getOrCreateProperty("ChildrenHeader", "ChildrenHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.WorkflowsLV.ChildrenHeader.class);
  }
  
  public CurrentStepHeader getCurrentStepHeader() {
    return getOrCreateProperty("CurrentStepHeader", "CurrentStepHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.WorkflowsLV.CurrentStepHeader.class);
  }
  
  public ParentHeader getParentHeader() {
    return getOrCreateProperty("ParentHeader", "ParentHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.WorkflowsLV.ParentHeader.class);
  }
  
  public ProcessVersionHeader getProcessVersionHeader() {
    return getOrCreateProperty("ProcessVersionHeader", "ProcessVersionHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.WorkflowsLV.ProcessVersionHeader.class);
  }
  
  public StartTimeHeader getStartTimeHeader() {
    return getOrCreateProperty("StartTimeHeader", "StartTimeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.WorkflowsLV.StartTimeHeader.class);
  }
  
  public StatusHeader getStatusHeader() {
    return getOrCreateProperty("StatusHeader", "StatusHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.WorkflowsLV.StatusHeader.class);
  }
  
  public TypeHeader getTypeHeader() {
    return getOrCreateProperty("TypeHeader", "TypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.WorkflowsLV.TypeHeader.class);
  }
  
  public UpdateTimeHeader getUpdateTimeHeader() {
    return getOrCreateProperty("UpdateTimeHeader", "UpdateTimeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.WorkflowsLV.UpdateTimeHeader.class);
  }
  
  public WorkItemStateHeader getWorkItemStateHeader() {
    return getOrCreateProperty("WorkItemStateHeader", "WorkItemStateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.WorkflowsLV.WorkItemStateHeader.class);
  }
  
  public WorkTimeoutHeader getWorkTimeoutHeader() {
    return getOrCreateProperty("WorkTimeoutHeader", "WorkTimeoutHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.WorkflowsLV.WorkTimeoutHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.WorkflowsLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.WorkflowsLV._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/workflow/WorkflowsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ActiveStateHeader extends ValueElement {
    public ActiveStateHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/workflow/WorkflowsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ChildrenHeader extends ValueElement {
    public ChildrenHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/workflow/WorkflowsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CurrentStepHeader extends ValueElement {
    public CurrentStepHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/workflow/WorkflowsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ParentHeader extends ValueElement {
    public ParentHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/workflow/WorkflowsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ProcessVersionHeader extends ValueElement {
    public ProcessVersionHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/workflow/WorkflowsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class StartTimeHeader extends ValueElement {
    public StartTimeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/workflow/WorkflowsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class StatusHeader extends ValueElement {
    public StatusHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/workflow/WorkflowsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TypeHeader extends ValueElement {
    public TypeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/workflow/WorkflowsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class UpdateTimeHeader extends ValueElement {
    public UpdateTimeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/workflow/WorkflowsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class WorkItemStateHeader extends ValueElement {
    public WorkItemStateHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/workflow/WorkflowsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class WorkTimeoutHeader extends ValueElement {
    public WorkTimeoutHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/workflow/WorkflowsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/workflow/WorkflowsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ActiveState getActiveState() {
      return getOrCreateProperty("ActiveState", "ActiveState", null, pcftest.WorkflowsLV.entry.ActiveState.class);
    }
    
    public ValueElement getChildren() {
      return getOrCreateProperty("Children", "Children", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getCurrentStep() {
      return getOrCreateProperty("CurrentStep", "CurrentStep", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public Parent getParent() {
      return getOrCreateProperty("Parent", "Parent", null, pcftest.WorkflowsLV.entry.Parent.class);
    }
    
    public ValueElement getProcessVersion() {
      return getOrCreateProperty("ProcessVersion", "ProcessVersion", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public DateElement getStartTime() {
      return getOrCreateProperty("StartTime", "StartTime", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public Status getStatus() {
      return getOrCreateProperty("Status", "Status", null, pcftest.WorkflowsLV.entry.Status.class);
    }
    
    public Type getType() {
      return getOrCreateProperty("Type", "Type", null, pcftest.WorkflowsLV.entry.Type.class);
    }
    
    public DateElement getUpdateTime() {
      return getOrCreateProperty("UpdateTime", "UpdateTime", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public ValueElement getWorkItemState() {
      return getOrCreateProperty("WorkItemState", "WorkItemState", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public DateElement getWorkTimeout() {
      return getOrCreateProperty("WorkTimeout", "WorkTimeout", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.WorkflowsLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.WorkflowsLV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/workflow/WorkflowsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/admin/workflow/WorkflowsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Parent extends ValueElement {
      public Parent(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public WorkflowDetail click() {
        return clickThis(pcftest.WorkflowDetail.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/workflow/WorkflowsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/admin/workflow/WorkflowsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Type extends SelectElement {
      public Type(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public WorkflowDetail click() {
        return clickThis(pcftest.WorkflowDetail.class);
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
    @Generated(comments = "config/web/pcf/admin/workflow/WorkflowsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/workflow/WorkflowsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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