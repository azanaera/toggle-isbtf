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
import pcftest.WorkflowStatsLV.ElapsedMaxHeader;
import pcftest.WorkflowStatsLV.ElapsedMeanHeader;
import pcftest.WorkflowStatsLV.ElapsedMinHeader;
import pcftest.WorkflowStatsLV.ElapsedStdDevHeader;
import pcftest.WorkflowStatsLV.EndTimeHeader;
import pcftest.WorkflowStatsLV.ExecMaxHeader;
import pcftest.WorkflowStatsLV.ExecMeanHeader;
import pcftest.WorkflowStatsLV.ExecMinHeader;
import pcftest.WorkflowStatsLV.ExecStdDevHeader;
import pcftest.WorkflowStatsLV.ExecutionsHeader;
import pcftest.WorkflowStatsLV.StartTimeHeader;
import pcftest.WorkflowStatsLV.StepNameHeader;
import pcftest.WorkflowStatsLV.WorkflowTypeHeader;
import pcftest.WorkflowStatsLV._ListPaging;
import pcftest.WorkflowStatsLV.entry;
import pcftest.WorkflowStatsLV.entry.WorkflowType;
import pcftest.WorkflowStatsLV.entry._Select;
import pcftest.WorkflowStatsLV.entry._ViewDetail;
import typekey.Workflow;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/workflow/WorkflowStatsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class WorkflowStatsLV extends PCFElement {
  public final static String CHECKSUM = "6d25a03ee1ac5b75537506ccbb2aaf72";
  
  public WorkflowStatsLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ElapsedMaxHeader getElapsedMaxHeader() {
    return getOrCreateProperty("ElapsedMaxHeader", "ElapsedMaxHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.WorkflowStatsLV.ElapsedMaxHeader.class);
  }
  
  public ElapsedMeanHeader getElapsedMeanHeader() {
    return getOrCreateProperty("ElapsedMeanHeader", "ElapsedMeanHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.WorkflowStatsLV.ElapsedMeanHeader.class);
  }
  
  public ElapsedMinHeader getElapsedMinHeader() {
    return getOrCreateProperty("ElapsedMinHeader", "ElapsedMinHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.WorkflowStatsLV.ElapsedMinHeader.class);
  }
  
  public ElapsedStdDevHeader getElapsedStdDevHeader() {
    return getOrCreateProperty("ElapsedStdDevHeader", "ElapsedStdDevHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.WorkflowStatsLV.ElapsedStdDevHeader.class);
  }
  
  public EndTimeHeader getEndTimeHeader() {
    return getOrCreateProperty("EndTimeHeader", "EndTimeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.WorkflowStatsLV.EndTimeHeader.class);
  }
  
  public ExecMaxHeader getExecMaxHeader() {
    return getOrCreateProperty("ExecMaxHeader", "ExecMaxHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.WorkflowStatsLV.ExecMaxHeader.class);
  }
  
  public ExecMeanHeader getExecMeanHeader() {
    return getOrCreateProperty("ExecMeanHeader", "ExecMeanHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.WorkflowStatsLV.ExecMeanHeader.class);
  }
  
  public ExecMinHeader getExecMinHeader() {
    return getOrCreateProperty("ExecMinHeader", "ExecMinHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.WorkflowStatsLV.ExecMinHeader.class);
  }
  
  public ExecStdDevHeader getExecStdDevHeader() {
    return getOrCreateProperty("ExecStdDevHeader", "ExecStdDevHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.WorkflowStatsLV.ExecStdDevHeader.class);
  }
  
  public ExecutionsHeader getExecutionsHeader() {
    return getOrCreateProperty("ExecutionsHeader", "ExecutionsHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.WorkflowStatsLV.ExecutionsHeader.class);
  }
  
  public StartTimeHeader getStartTimeHeader() {
    return getOrCreateProperty("StartTimeHeader", "StartTimeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.WorkflowStatsLV.StartTimeHeader.class);
  }
  
  public StepNameHeader getStepNameHeader() {
    return getOrCreateProperty("StepNameHeader", "StepNameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.WorkflowStatsLV.StepNameHeader.class);
  }
  
  public WorkflowTypeHeader getWorkflowTypeHeader() {
    return getOrCreateProperty("WorkflowTypeHeader", "WorkflowTypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.WorkflowStatsLV.WorkflowTypeHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.WorkflowStatsLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.WorkflowStatsLV._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/workflow/WorkflowStatsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ElapsedMaxHeader extends ValueElement {
    public ElapsedMaxHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/workflow/WorkflowStatsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ElapsedMeanHeader extends ValueElement {
    public ElapsedMeanHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/workflow/WorkflowStatsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ElapsedMinHeader extends ValueElement {
    public ElapsedMinHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/workflow/WorkflowStatsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ElapsedStdDevHeader extends ValueElement {
    public ElapsedStdDevHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/workflow/WorkflowStatsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EndTimeHeader extends ValueElement {
    public EndTimeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/workflow/WorkflowStatsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ExecMaxHeader extends ValueElement {
    public ExecMaxHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/workflow/WorkflowStatsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ExecMeanHeader extends ValueElement {
    public ExecMeanHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/workflow/WorkflowStatsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ExecMinHeader extends ValueElement {
    public ExecMinHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/workflow/WorkflowStatsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ExecStdDevHeader extends ValueElement {
    public ExecStdDevHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/workflow/WorkflowStatsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ExecutionsHeader extends ValueElement {
    public ExecutionsHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/workflow/WorkflowStatsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class StartTimeHeader extends ValueElement {
    public StartTimeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/workflow/WorkflowStatsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class StepNameHeader extends ValueElement {
    public StepNameHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/workflow/WorkflowStatsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class WorkflowTypeHeader extends ValueElement {
    public WorkflowTypeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/workflow/WorkflowStatsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/workflow/WorkflowStatsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getElapsedMax() {
      return getOrCreateProperty("ElapsedMax", "ElapsedMax", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getElapsedMean() {
      return getOrCreateProperty("ElapsedMean", "ElapsedMean", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getElapsedMin() {
      return getOrCreateProperty("ElapsedMin", "ElapsedMin", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getElapsedStdDev() {
      return getOrCreateProperty("ElapsedStdDev", "ElapsedStdDev", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public DateElement getEndTime() {
      return getOrCreateProperty("EndTime", "EndTime", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public ValueElement getExecMax() {
      return getOrCreateProperty("ExecMax", "ExecMax", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getExecMean() {
      return getOrCreateProperty("ExecMean", "ExecMean", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getExecMin() {
      return getOrCreateProperty("ExecMin", "ExecMin", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getExecStdDev() {
      return getOrCreateProperty("ExecStdDev", "ExecStdDev", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getExecutions() {
      return getOrCreateProperty("Executions", "Executions", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public DateElement getStartTime() {
      return getOrCreateProperty("StartTime", "StartTime", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public ValueElement getStepName() {
      return getOrCreateProperty("StepName", "StepName", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public WorkflowType getWorkflowType() {
      return getOrCreateProperty("WorkflowType", "WorkflowType", null, pcftest.WorkflowStatsLV.entry.WorkflowType.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.WorkflowStatsLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.WorkflowStatsLV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/workflow/WorkflowStatsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class WorkflowType extends SelectElement {
      public WorkflowType(ISmokeTest helper, PCFElementId componentId)  {
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
    @Generated(comments = "config/web/pcf/admin/workflow/WorkflowStatsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/workflow/WorkflowStatsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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