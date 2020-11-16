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
import pcftest.MetroFlowsLV.CurrentStepHeader;
import pcftest.MetroFlowsLV.ProcessVersionHeader;
import pcftest.MetroFlowsLV.StartTimeHeader;
import pcftest.MetroFlowsLV.StatusHeader;
import pcftest.MetroFlowsLV.UpdateTimeHeader;
import pcftest.MetroFlowsLV._ListPaging;
import pcftest.MetroFlowsLV.entry;
import pcftest.MetroFlowsLV.entry.CurrentStep;
import pcftest.MetroFlowsLV.entry.Status;
import pcftest.MetroFlowsLV.entry._Select;
import pcftest.MetroFlowsLV.entry._ViewDetail;
import typekey.WorkflowState;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/workflow/MetroFlowsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class MetroFlowsLV extends PCFElement {
  public final static String CHECKSUM = "569cd8dd1d83cd2cdac86a663ca31989";
  
  public MetroFlowsLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public CurrentStepHeader getCurrentStepHeader() {
    return getOrCreateProperty("CurrentStepHeader", "CurrentStepHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.MetroFlowsLV.CurrentStepHeader.class);
  }
  
  public ProcessVersionHeader getProcessVersionHeader() {
    return getOrCreateProperty("ProcessVersionHeader", "ProcessVersionHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.MetroFlowsLV.ProcessVersionHeader.class);
  }
  
  public StartTimeHeader getStartTimeHeader() {
    return getOrCreateProperty("StartTimeHeader", "StartTimeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.MetroFlowsLV.StartTimeHeader.class);
  }
  
  public StatusHeader getStatusHeader() {
    return getOrCreateProperty("StatusHeader", "StatusHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.MetroFlowsLV.StatusHeader.class);
  }
  
  public UpdateTimeHeader getUpdateTimeHeader() {
    return getOrCreateProperty("UpdateTimeHeader", "UpdateTimeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.MetroFlowsLV.UpdateTimeHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.MetroFlowsLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.MetroFlowsLV._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/workflow/MetroFlowsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CurrentStepHeader extends ValueElement {
    public CurrentStepHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/workflow/MetroFlowsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ProcessVersionHeader extends ValueElement {
    public ProcessVersionHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/workflow/MetroFlowsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class StartTimeHeader extends ValueElement {
    public StartTimeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/workflow/MetroFlowsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class StatusHeader extends ValueElement {
    public StatusHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/workflow/MetroFlowsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class UpdateTimeHeader extends ValueElement {
    public UpdateTimeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/workflow/MetroFlowsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/workflow/MetroFlowsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public CurrentStep getCurrentStep() {
      return getOrCreateProperty("CurrentStep", "CurrentStep", null, pcftest.MetroFlowsLV.entry.CurrentStep.class);
    }
    
    public ValueElement getProcessVersion() {
      return getOrCreateProperty("ProcessVersion", "ProcessVersion", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public DateElement getStartTime() {
      return getOrCreateProperty("StartTime", "StartTime", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public Status getStatus() {
      return getOrCreateProperty("Status", "Status", null, pcftest.MetroFlowsLV.entry.Status.class);
    }
    
    public DateElement getUpdateTime() {
      return getOrCreateProperty("UpdateTime", "UpdateTime", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.MetroFlowsLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.MetroFlowsLV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/workflow/MetroFlowsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CurrentStep extends ValueElement {
      public CurrentStep(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public MetroFlowDetail click() {
        return clickThis(pcftest.MetroFlowDetail.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/workflow/MetroFlowsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/tools/workflow/MetroFlowsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/workflow/MetroFlowsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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