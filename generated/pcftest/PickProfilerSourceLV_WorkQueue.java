package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.IteratorEntriesWithPaging;
import gw.smoketest.platform.web.IteratorEntryCheckboxElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.PagingElement;
import gw.smoketest.platform.web.RowElement;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.SelectorCellElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.PickProfilerSourceLV_WorkQueue.AppServerNameHeader;
import pcftest.PickProfilerSourceLV_WorkQueue.DurationHeader;
import pcftest.PickProfilerSourceLV_WorkQueue.EndTimeHeader;
import pcftest.PickProfilerSourceLV_WorkQueue.InstanceNumberHeader;
import pcftest.PickProfilerSourceLV_WorkQueue.StartTimeHeader;
import pcftest.PickProfilerSourceLV_WorkQueue.WorkQueueNameHeader;
import pcftest.PickProfilerSourceLV_WorkQueue._ListPaging;
import pcftest.PickProfilerSourceLV_WorkQueue.entry;
import pcftest.PickProfilerSourceLV_WorkQueue.entry.WorkQueueName;
import pcftest.PickProfilerSourceLV_WorkQueue.entry._Select;
import pcftest.PickProfilerSourceLV_WorkQueue.entry._ViewDetail;
import typekey.BatchProcessType;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/profiler/PickProfilerSourceLV.WorkQueue.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class PickProfilerSourceLV_WorkQueue extends PickProfilerSourceLV {
  public final static String CHECKSUM = "8cbb762fb7931d4df2b037a93a5d27a9";
  
  public PickProfilerSourceLV_WorkQueue(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public AppServerNameHeader getAppServerNameHeader() {
    return getOrCreateProperty("AppServerNameHeader", "AppServerNameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.PickProfilerSourceLV_WorkQueue.AppServerNameHeader.class);
  }
  
  public DurationHeader getDurationHeader() {
    return getOrCreateProperty("DurationHeader", "DurationHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.PickProfilerSourceLV_WorkQueue.DurationHeader.class);
  }
  
  public EndTimeHeader getEndTimeHeader() {
    return getOrCreateProperty("EndTimeHeader", "EndTimeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.PickProfilerSourceLV_WorkQueue.EndTimeHeader.class);
  }
  
  public InstanceNumberHeader getInstanceNumberHeader() {
    return getOrCreateProperty("InstanceNumberHeader", "InstanceNumberHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.PickProfilerSourceLV_WorkQueue.InstanceNumberHeader.class);
  }
  
  public StartTimeHeader getStartTimeHeader() {
    return getOrCreateProperty("StartTimeHeader", "StartTimeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.PickProfilerSourceLV_WorkQueue.StartTimeHeader.class);
  }
  
  public WorkQueueNameHeader getWorkQueueNameHeader() {
    return getOrCreateProperty("WorkQueueNameHeader", "WorkQueueNameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.PickProfilerSourceLV_WorkQueue.WorkQueueNameHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.PickProfilerSourceLV_WorkQueue.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.PickProfilerSourceLV_WorkQueue._ListPaging.class);
  }
  
  public SelectElement getworkQueueTypeChooser() {
    return getOrCreateProperty("workQueueTypeChooser", "workQueueTypeChooser", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewToolbarFilter, gw.smoketest.platform.web.SelectElement.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/PickProfilerSourceLV.WorkQueue.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AppServerNameHeader extends ValueElement {
    public AppServerNameHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/PickProfilerSourceLV.WorkQueue.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DurationHeader extends ValueElement {
    public DurationHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/PickProfilerSourceLV.WorkQueue.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EndTimeHeader extends ValueElement {
    public EndTimeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/PickProfilerSourceLV.WorkQueue.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class InstanceNumberHeader extends ValueElement {
    public InstanceNumberHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/PickProfilerSourceLV.WorkQueue.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class StartTimeHeader extends ValueElement {
    public StartTimeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/PickProfilerSourceLV.WorkQueue.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class WorkQueueNameHeader extends ValueElement {
    public WorkQueueNameHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/PickProfilerSourceLV.WorkQueue.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/PickProfilerSourceLV.WorkQueue.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getAppServerName() {
      return getOrCreateProperty("AppServerName", "AppServerName", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getDuration() {
      return getOrCreateProperty("Duration", "Duration", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public DateElement getEndTime() {
      return getOrCreateProperty("EndTime", "EndTime", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public ValueElement getInstanceNumber() {
      return getOrCreateProperty("InstanceNumber", "InstanceNumber", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public DateElement getStartTime() {
      return getOrCreateProperty("StartTime", "StartTime", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public WorkQueueName getWorkQueueName() {
      return getOrCreateProperty("WorkQueueName", "WorkQueueName", null, pcftest.PickProfilerSourceLV_WorkQueue.entry.WorkQueueName.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.PickProfilerSourceLV_WorkQueue.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.PickProfilerSourceLV_WorkQueue.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/PickProfilerSourceLV.WorkQueue.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class WorkQueueName extends SelectElement {
      public WorkQueueName(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(BatchProcessType arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public BatchProcessType getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.BatchProcessType.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(BatchProcessType arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/PickProfilerSourceLV.WorkQueue.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/PickProfilerSourceLV.WorkQueue.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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