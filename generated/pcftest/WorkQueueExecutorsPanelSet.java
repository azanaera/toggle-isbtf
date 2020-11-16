package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.IteratorEntries;
import gw.smoketest.platform.web.IteratorEntriesWithPaging;
import gw.smoketest.platform.web.IteratorEntryCheckboxElement;
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
import pcftest.WorkQueueExecutorsPanelSet.WorkQueueExecutorLDV;
import pcftest.WorkQueueExecutorsPanelSet.WorkQueueExecutorLDV.ExecutorDetailLV;
import pcftest.WorkQueueExecutorsPanelSet.WorkQueueExecutorLDV.ExecutorDetailLV.ExceptionsCountHeader;
import pcftest.WorkQueueExecutorsPanelSet.WorkQueueExecutorLDV.ExecutorDetailLV.HostnameHeader;
import pcftest.WorkQueueExecutorsPanelSet.WorkQueueExecutorLDV.ExecutorDetailLV.MaxWorkersHeader;
import pcftest.WorkQueueExecutorsPanelSet.WorkQueueExecutorLDV.ExecutorDetailLV.StatusHeader;
import pcftest.WorkQueueExecutorsPanelSet.WorkQueueExecutorLDV.ExecutorDetailLV.UpTimeHeader;
import pcftest.WorkQueueExecutorsPanelSet.WorkQueueExecutorLDV.WorkersDV;
import pcftest.WorkQueueExecutorsPanelSet.WorkQueueExecutorLDV.WorkersDV.TasksTab;
import pcftest.WorkQueueExecutorsPanelSet.WorkQueueExecutorLDV.WorkersDV.WorkersLV;
import pcftest.WorkQueueExecutorsPanelSet.WorkQueueExecutorLDV.WorkersDV.WorkersLV.ActiveHeader;
import pcftest.WorkQueueExecutorsPanelSet.WorkQueueExecutorLDV.WorkersDV.WorkersLV.CheckedOutItemsCountHeader;
import pcftest.WorkQueueExecutorsPanelSet.WorkQueueExecutorLDV.WorkersDV.WorkersLV.ConsecutiveErrorsHeader;
import pcftest.WorkQueueExecutorsPanelSet.WorkQueueExecutorLDV.WorkersDV.WorkersLV.EndedTimeHeader;
import pcftest.WorkQueueExecutorsPanelSet.WorkQueueExecutorLDV.WorkersDV.WorkersLV.ExceptionCountHeader;
import pcftest.WorkQueueExecutorsPanelSet.WorkQueueExecutorLDV.WorkersDV.WorkersLV.InstanceIdHeader;
import pcftest.WorkQueueExecutorsPanelSet.WorkQueueExecutorLDV.WorkersDV.WorkersLV.OrphansCountHeader;
import pcftest.WorkQueueExecutorsPanelSet.WorkQueueExecutorLDV.WorkersDV.WorkersLV.SkippedCountHeader;
import pcftest.WorkQueueExecutorsPanelSet.WorkQueueExecutorLDV.WorkersDV.WorkersLV.SuccessHeader;
import pcftest.WorkQueueExecutorsPanelSet.WorkQueueExecutorLDV.WorkersDV.WorkersLV.WriterIdHeader;
import pcftest.WorkQueueExecutorsPanelSet.WorkQueueExecutorLDV.WorkersDV.WorkersLV._ListPaging;
import pcftest.WorkQueueExecutorsPanelSet.WorkQueueExecutorLDV.WorkersDV.WorkersLV_tb;
import pcftest.WorkQueueExecutorsPanelSet.WorkQueueExecutorLDV.WorkersDV.WorkersLV_tb.Add;
import pcftest.WorkQueueExecutorsPanelSet.WorkQueueExecutorLDV.WorkersDV.WorkersLV_tb.Remove;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/WorkQueueExecutorsPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class WorkQueueExecutorsPanelSet extends PCFElement {
  public final static String CHECKSUM = "ea0f99ff386531129745a5f9fa98b772";
  
  public WorkQueueExecutorsPanelSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public WorkQueueExecutorLDV getWorkQueueExecutorLDV() {
    return getOrCreateProperty("WorkQueueExecutorLDV", "WorkQueueExecutorLDV", null, pcftest.WorkQueueExecutorsPanelSet.WorkQueueExecutorLDV.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/WorkQueueExecutorsPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class WorkQueueExecutorLDV extends PCFElement {
    public WorkQueueExecutorLDV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ExecutorDetailLV getExecutorDetailLV() {
      return getOrCreateProperty("ExecutorDetailLV", "ExecutorDetailLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.WorkQueueExecutorsPanelSet.WorkQueueExecutorLDV.ExecutorDetailLV.class);
    }
    
    public WorkersDV getWorkersDV() {
      return getOrCreateProperty("WorkersDV", "WorkersDV", null, pcftest.WorkQueueExecutorsPanelSet.WorkQueueExecutorLDV.WorkersDV.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/WorkQueueExecutorsPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ExecutorDetailLV extends PCFElement {
      public ExecutorDetailLV(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ExceptionsCountHeader getExceptionsCountHeader() {
        return getOrCreateProperty("ExceptionsCountHeader", "ExceptionsCountHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.WorkQueueExecutorsPanelSet.WorkQueueExecutorLDV.ExecutorDetailLV.ExceptionsCountHeader.class);
      }
      
      public pcftest.WorkQueueExecutorsPanelSet.WorkQueueExecutorLDV.ExecutorDetailLV.FailedCountHeader getFailedCountHeader() {
        return getOrCreateProperty("FailedCountHeader", "FailedCountHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.WorkQueueExecutorsPanelSet.WorkQueueExecutorLDV.ExecutorDetailLV.FailedCountHeader.class);
      }
      
      public HostnameHeader getHostnameHeader() {
        return getOrCreateProperty("HostnameHeader", "HostnameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.WorkQueueExecutorsPanelSet.WorkQueueExecutorLDV.ExecutorDetailLV.HostnameHeader.class);
      }
      
      public MaxWorkersHeader getMaxWorkersHeader() {
        return getOrCreateProperty("MaxWorkersHeader", "MaxWorkersHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.WorkQueueExecutorsPanelSet.WorkQueueExecutorLDV.ExecutorDetailLV.MaxWorkersHeader.class);
      }
      
      public pcftest.WorkQueueExecutorsPanelSet.WorkQueueExecutorLDV.ExecutorDetailLV.ProcessedItemsCountHeader getProcessedItemsCountHeader() {
        return getOrCreateProperty("ProcessedItemsCountHeader", "ProcessedItemsCountHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.WorkQueueExecutorsPanelSet.WorkQueueExecutorLDV.ExecutorDetailLV.ProcessedItemsCountHeader.class);
      }
      
      public pcftest.WorkQueueExecutorsPanelSet.WorkQueueExecutorLDV.ExecutorDetailLV.StartedTimeHeader getStartedTimeHeader() {
        return getOrCreateProperty("StartedTimeHeader", "StartedTimeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.WorkQueueExecutorsPanelSet.WorkQueueExecutorLDV.ExecutorDetailLV.StartedTimeHeader.class);
      }
      
      public StatusHeader getStatusHeader() {
        return getOrCreateProperty("StatusHeader", "StatusHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.WorkQueueExecutorsPanelSet.WorkQueueExecutorLDV.ExecutorDetailLV.StatusHeader.class);
      }
      
      public UpTimeHeader getUpTimeHeader() {
        return getOrCreateProperty("UpTimeHeader", "UpTimeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.WorkQueueExecutorsPanelSet.WorkQueueExecutorLDV.ExecutorDetailLV.UpTimeHeader.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      @SuppressWarnings(value = "unchecked")
      public IteratorEntries<pcftest.WorkQueueExecutorsPanelSet.WorkQueueExecutorLDV.ExecutorDetailLV.entry> get_Entries() {
        return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.WorkQueueExecutorsPanelSet.WorkQueueExecutorLDV.ExecutorDetailLV.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/WorkQueueExecutorsPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ExceptionsCountHeader extends ValueElement {
        public ExceptionsCountHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/WorkQueueExecutorsPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class FailedCountHeader extends ValueElement {
        public FailedCountHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/WorkQueueExecutorsPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class HostnameHeader extends ValueElement {
        public HostnameHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/WorkQueueExecutorsPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class MaxWorkersHeader extends ValueElement {
        public MaxWorkersHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/WorkQueueExecutorsPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ProcessedItemsCountHeader extends ValueElement {
        public ProcessedItemsCountHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/WorkQueueExecutorsPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class StartedTimeHeader extends ValueElement {
        public StartedTimeHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/WorkQueueExecutorsPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class StatusHeader extends ValueElement {
        public StatusHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/WorkQueueExecutorsPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class UpTimeHeader extends ValueElement {
        public UpTimeHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/WorkQueueExecutorsPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class entry extends RowElement {
        public entry(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public ValueElement getExceptionsCount() {
          return getOrCreateProperty("ExceptionsCount", "ExceptionsCount", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getFailedCount() {
          return getOrCreateProperty("FailedCount", "FailedCount", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getHostname() {
          return getOrCreateProperty("Hostname", "Hostname", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getMaxWorkers() {
          return getOrCreateProperty("MaxWorkers", "MaxWorkers", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getProcessedItemsCount() {
          return getOrCreateProperty("ProcessedItemsCount", "ProcessedItemsCount", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public DateElement getStartedTime() {
          return getOrCreateProperty("StartedTime", "StartedTime", null, gw.smoketest.platform.web.DateElement.class);
        }
        
        public ValueElement getStatus() {
          return getOrCreateProperty("Status", "Status", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getUpTime() {
          return getOrCreateProperty("UpTime", "UpTime", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public IteratorEntryCheckboxElement get_Checkbox() {
          return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
        }
        
        public pcftest.WorkQueueExecutorsPanelSet.WorkQueueExecutorLDV.ExecutorDetailLV.entry._Select get_Select() {
          return getOrCreateProperty("_Select", "_Select", null, pcftest.WorkQueueExecutorsPanelSet.WorkQueueExecutorLDV.ExecutorDetailLV.entry._Select.class);
        }
        
        public pcftest.WorkQueueExecutorsPanelSet.WorkQueueExecutorLDV.ExecutorDetailLV.entry._ViewDetail get_ViewDetail() {
          return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.WorkQueueExecutorsPanelSet.WorkQueueExecutorLDV.ExecutorDetailLV.entry._ViewDetail.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/WorkQueueExecutorsPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class _Select extends SelectorCellElement {
          public _Select(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/WorkQueueExecutorsPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/tools/WorkQueueExecutorsPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class WorkersDV extends PCFElement {
      public WorkersDV(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public TasksTab getTasksTab() {
        return getOrCreateProperty("TasksTab", "TasksTab", null, pcftest.WorkQueueExecutorsPanelSet.WorkQueueExecutorLDV.WorkersDV.TasksTab.class);
      }
      
      public WorkersLV getWorkersLV() {
        return getOrCreateProperty("WorkersLV", "WorkersLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.WorkQueueExecutorsPanelSet.WorkQueueExecutorLDV.WorkersDV.WorkersLV.class);
      }
      
      public WorkersLV_tb getWorkersLV_tb() {
        return getOrCreateProperty("WorkersLV_tb", "WorkersLV_tb", null, pcftest.WorkQueueExecutorsPanelSet.WorkQueueExecutorLDV.WorkersDV.WorkersLV_tb.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/WorkQueueExecutorsPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class TasksTab extends ClickableActionElement {
        public TasksTab(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/WorkQueueExecutorsPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class WorkersLV extends PCFElement {
        public WorkersLV(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public ActiveHeader getActiveHeader() {
          return getOrCreateProperty("ActiveHeader", "ActiveHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.WorkQueueExecutorsPanelSet.WorkQueueExecutorLDV.WorkersDV.WorkersLV.ActiveHeader.class);
        }
        
        public CheckedOutItemsCountHeader getCheckedOutItemsCountHeader() {
          return getOrCreateProperty("CheckedOutItemsCountHeader", "CheckedOutItemsCountHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.WorkQueueExecutorsPanelSet.WorkQueueExecutorLDV.WorkersDV.WorkersLV.CheckedOutItemsCountHeader.class);
        }
        
        public ConsecutiveErrorsHeader getConsecutiveErrorsHeader() {
          return getOrCreateProperty("ConsecutiveErrorsHeader", "ConsecutiveErrorsHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.WorkQueueExecutorsPanelSet.WorkQueueExecutorLDV.WorkersDV.WorkersLV.ConsecutiveErrorsHeader.class);
        }
        
        public EndedTimeHeader getEndedTimeHeader() {
          return getOrCreateProperty("EndedTimeHeader", "EndedTimeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.WorkQueueExecutorsPanelSet.WorkQueueExecutorLDV.WorkersDV.WorkersLV.EndedTimeHeader.class);
        }
        
        public ExceptionCountHeader getExceptionCountHeader() {
          return getOrCreateProperty("ExceptionCountHeader", "ExceptionCountHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.WorkQueueExecutorsPanelSet.WorkQueueExecutorLDV.WorkersDV.WorkersLV.ExceptionCountHeader.class);
        }
        
        public pcftest.WorkQueueExecutorsPanelSet.WorkQueueExecutorLDV.WorkersDV.WorkersLV.FailedCountHeader getFailedCountHeader() {
          return getOrCreateProperty("FailedCountHeader", "FailedCountHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.WorkQueueExecutorsPanelSet.WorkQueueExecutorLDV.WorkersDV.WorkersLV.FailedCountHeader.class);
        }
        
        public InstanceIdHeader getInstanceIdHeader() {
          return getOrCreateProperty("InstanceIdHeader", "InstanceIdHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.WorkQueueExecutorsPanelSet.WorkQueueExecutorLDV.WorkersDV.WorkersLV.InstanceIdHeader.class);
        }
        
        public OrphansCountHeader getOrphansCountHeader() {
          return getOrCreateProperty("OrphansCountHeader", "OrphansCountHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.WorkQueueExecutorsPanelSet.WorkQueueExecutorLDV.WorkersDV.WorkersLV.OrphansCountHeader.class);
        }
        
        public pcftest.WorkQueueExecutorsPanelSet.WorkQueueExecutorLDV.WorkersDV.WorkersLV.ProcessedItemsCountHeader getProcessedItemsCountHeader() {
          return getOrCreateProperty("ProcessedItemsCountHeader", "ProcessedItemsCountHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.WorkQueueExecutorsPanelSet.WorkQueueExecutorLDV.WorkersDV.WorkersLV.ProcessedItemsCountHeader.class);
        }
        
        public SkippedCountHeader getSkippedCountHeader() {
          return getOrCreateProperty("SkippedCountHeader", "SkippedCountHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.WorkQueueExecutorsPanelSet.WorkQueueExecutorLDV.WorkersDV.WorkersLV.SkippedCountHeader.class);
        }
        
        public pcftest.WorkQueueExecutorsPanelSet.WorkQueueExecutorLDV.WorkersDV.WorkersLV.StartedTimeHeader getStartedTimeHeader() {
          return getOrCreateProperty("StartedTimeHeader", "StartedTimeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.WorkQueueExecutorsPanelSet.WorkQueueExecutorLDV.WorkersDV.WorkersLV.StartedTimeHeader.class);
        }
        
        public SuccessHeader getSuccessHeader() {
          return getOrCreateProperty("SuccessHeader", "SuccessHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.WorkQueueExecutorsPanelSet.WorkQueueExecutorLDV.WorkersDV.WorkersLV.SuccessHeader.class);
        }
        
        public SelectElement getTaskFilter() {
          return getOrCreateProperty("TaskFilter", "TaskFilter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewToolbarFilter, gw.smoketest.platform.web.SelectElement.class);
        }
        
        public WriterIdHeader getWriterIdHeader() {
          return getOrCreateProperty("WriterIdHeader", "WriterIdHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.WorkQueueExecutorsPanelSet.WorkQueueExecutorLDV.WorkersDV.WorkersLV.WriterIdHeader.class);
        }
        
        public IteratorEntryCheckboxElement get_Checkbox() {
          return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
        }
        
        @SuppressWarnings(value = "unchecked")
        public IteratorEntriesWithPaging<pcftest.WorkQueueExecutorsPanelSet.WorkQueueExecutorLDV.WorkersDV.WorkersLV.entry> get_Entries() {
          return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.WorkQueueExecutorsPanelSet.WorkQueueExecutorLDV.WorkersDV.WorkersLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
        }
        
        public _ListPaging get_ListPaging() {
          return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.WorkQueueExecutorsPanelSet.WorkQueueExecutorLDV.WorkersDV.WorkersLV._ListPaging.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/WorkQueueExecutorsPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class ActiveHeader extends ValueElement {
          public ActiveHeader(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/WorkQueueExecutorsPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class CheckedOutItemsCountHeader extends ValueElement {
          public CheckedOutItemsCountHeader(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/WorkQueueExecutorsPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class ConsecutiveErrorsHeader extends ValueElement {
          public ConsecutiveErrorsHeader(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/WorkQueueExecutorsPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class EndedTimeHeader extends ValueElement {
          public EndedTimeHeader(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/WorkQueueExecutorsPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class ExceptionCountHeader extends ValueElement {
          public ExceptionCountHeader(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/WorkQueueExecutorsPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class FailedCountHeader extends ValueElement {
          public FailedCountHeader(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/WorkQueueExecutorsPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class InstanceIdHeader extends ValueElement {
          public InstanceIdHeader(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/WorkQueueExecutorsPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class OrphansCountHeader extends ValueElement {
          public OrphansCountHeader(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/WorkQueueExecutorsPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class ProcessedItemsCountHeader extends ValueElement {
          public ProcessedItemsCountHeader(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/WorkQueueExecutorsPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class SkippedCountHeader extends ValueElement {
          public SkippedCountHeader(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/WorkQueueExecutorsPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class StartedTimeHeader extends ValueElement {
          public StartedTimeHeader(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/WorkQueueExecutorsPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class SuccessHeader extends ValueElement {
          public SuccessHeader(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/WorkQueueExecutorsPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class WriterIdHeader extends ValueElement {
          public WriterIdHeader(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/WorkQueueExecutorsPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class _ListPaging extends PagingElement {
          public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/WorkQueueExecutorsPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class entry extends RowElement {
          public entry(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public BooleanValueElement getActive() {
            return getOrCreateProperty("Active", "Active", null, gw.smoketest.platform.web.BooleanValueElement.class);
          }
          
          public ValueElement getCheckedOutItemsCount() {
            return getOrCreateProperty("CheckedOutItemsCount", "CheckedOutItemsCount", null, gw.smoketest.platform.web.ValueElement.class);
          }
          
          public ValueElement getConsecutiveErrors() {
            return getOrCreateProperty("ConsecutiveErrors", "ConsecutiveErrors", null, gw.smoketest.platform.web.ValueElement.class);
          }
          
          public DateElement getEndedTime() {
            return getOrCreateProperty("EndedTime", "EndedTime", null, gw.smoketest.platform.web.DateElement.class);
          }
          
          public ValueElement getExceptionCount() {
            return getOrCreateProperty("ExceptionCount", "ExceptionCount", null, gw.smoketest.platform.web.ValueElement.class);
          }
          
          public ValueElement getFailedCount() {
            return getOrCreateProperty("FailedCount", "FailedCount", null, gw.smoketest.platform.web.ValueElement.class);
          }
          
          public ValueElement getInstanceId() {
            return getOrCreateProperty("InstanceId", "InstanceId", null, gw.smoketest.platform.web.ValueElement.class);
          }
          
          public ValueElement getOrphansCount() {
            return getOrCreateProperty("OrphansCount", "OrphansCount", null, gw.smoketest.platform.web.ValueElement.class);
          }
          
          public ValueElement getProcessedItemsCount() {
            return getOrCreateProperty("ProcessedItemsCount", "ProcessedItemsCount", null, gw.smoketest.platform.web.ValueElement.class);
          }
          
          public ValueElement getSkippedCount() {
            return getOrCreateProperty("SkippedCount", "SkippedCount", null, gw.smoketest.platform.web.ValueElement.class);
          }
          
          public DateElement getStartedTime() {
            return getOrCreateProperty("StartedTime", "StartedTime", null, gw.smoketest.platform.web.DateElement.class);
          }
          
          public BooleanValueElement getSuccess() {
            return getOrCreateProperty("Success", "Success", null, gw.smoketest.platform.web.BooleanValueElement.class);
          }
          
          public ValueElement getWriterId() {
            return getOrCreateProperty("WriterId", "WriterId", null, gw.smoketest.platform.web.ValueElement.class);
          }
          
          public IteratorEntryCheckboxElement get_Checkbox() {
            return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
          }
          
          public pcftest.WorkQueueExecutorsPanelSet.WorkQueueExecutorLDV.WorkersDV.WorkersLV.entry._Select get_Select() {
            return getOrCreateProperty("_Select", "_Select", null, pcftest.WorkQueueExecutorsPanelSet.WorkQueueExecutorLDV.WorkersDV.WorkersLV.entry._Select.class);
          }
          
          public pcftest.WorkQueueExecutorsPanelSet.WorkQueueExecutorLDV.WorkersDV.WorkersLV.entry._ViewDetail get_ViewDetail() {
            return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.WorkQueueExecutorsPanelSet.WorkQueueExecutorLDV.WorkersDV.WorkersLV.entry._ViewDetail.class);
          }
          
          @SimplePropertyProcessing
          @Generated(comments = "config/web/pcf/tools/WorkQueueExecutorsPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
          public static class _Select extends SelectorCellElement {
            public _Select(ISmokeTest helper, PCFElementId componentId)  {
              super(helper, componentId);
            }
            
            public PCFLocation click() {
              return clickThis(gw.smoketest.platform.web.PCFLocation.class);
            }
            
            
          }
          
          @SimplePropertyProcessing
          @Generated(comments = "config/web/pcf/tools/WorkQueueExecutorsPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
      @Generated(comments = "config/web/pcf/tools/WorkQueueExecutorsPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class WorkersLV_tb extends PCFElement {
        public WorkersLV_tb(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public Add getAdd() {
          return getOrCreateProperty("Add", "Add", null, pcftest.WorkQueueExecutorsPanelSet.WorkQueueExecutorLDV.WorkersDV.WorkersLV_tb.Add.class);
        }
        
        public Remove getRemove() {
          return getOrCreateProperty("Remove", "Remove", null, pcftest.WorkQueueExecutorsPanelSet.WorkQueueExecutorLDV.WorkersDV.WorkersLV_tb.Remove.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/WorkQueueExecutorsPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class Add extends ClickableActionElement {
          public Add(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/WorkQueueExecutorsPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class Remove extends ClickableActionElement {
          public Remove(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        
      }
      
      
    }
    
    
  }
  
  
}