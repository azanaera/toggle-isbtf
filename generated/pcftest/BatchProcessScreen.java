package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.IteratorEntries;
import gw.smoketest.platform.web.IteratorEntriesWithPaging;
import gw.smoketest.platform.web.IteratorEntryCheckboxElement;
import gw.smoketest.platform.web.MessagesElement;
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
import pcftest.BatchProcessScreen.BatchProcessesLV;
import pcftest.BatchProcessScreen.BatchProcessesLV.BatchProcessHeader;
import pcftest.BatchProcessScreen.BatchProcessesLV.LastRunHeader;
import pcftest.BatchProcessScreen.BatchProcessesLV.LastRunStatusHeader;
import pcftest.BatchProcessScreen.BatchProcessesLV.NextRunHeader;
import pcftest.BatchProcessScreen.BatchProcessesLV.RunBatchWithoutNotifyContentHeader;
import pcftest.BatchProcessScreen.BatchProcessesLV.ScheduleActionsHeader;
import pcftest.BatchProcessScreen.BatchProcessesLV.ScheduleHeader;
import pcftest.BatchProcessScreen.BatchProcessesLV.entry.BatchProcess;
import pcftest.BatchProcessScreen.BatchProcessesLV.entry.DownloadHistory;
import pcftest.BatchProcessScreen.BatchProcessesLV.entry.RunBatchWithoutNotify;
import pcftest.BatchProcessScreen.BatchProcessesLV.entry.ScheduleStart;
import pcftest.BatchProcessScreen.BatchProcessesLV.entry.ScheduleStop;
import pcftest.BatchProcessScreen.BatchProcessesLV.entry.ScheduleSync;
import pcftest.BatchProcessScreen.BatchProcessesLV.entry.TerminateBatchWithoutNotify;
import pcftest.BatchProcessScreen.BatchProcessesLV_tb;
import pcftest.BatchProcessScreen.BatchProcessesLV_tb.download;
import pcftest.BatchProcessScreen.BatchProcessesLV_tb.refresh;
import pcftest.BatchProcessScreen.BatchProcessesLV_tb.resumeScheduler;
import pcftest.BatchProcessScreen.BatchProcessesLV_tb.suspendScheduler;
import pcftest.BatchProcessScreen.ProcuessHistoryCV;
import pcftest.BatchProcessScreen.ProcuessHistoryCV.BatchProcessInfo_ProcessHistoryLV;
import pcftest.BatchProcessScreen.ProcuessHistoryCV.BatchProcessInfo_ProcessHistoryLV.CompleteDateHeader;
import pcftest.BatchProcessScreen.ProcuessHistoryCV.BatchProcessInfo_ProcessHistoryLV.FailedOpsHeader;
import pcftest.BatchProcessScreen.ProcuessHistoryCV.BatchProcessInfo_ProcessHistoryLV.FailureReasonHeader;
import pcftest.BatchProcessScreen.ProcuessHistoryCV.BatchProcessInfo_ProcessHistoryLV.OpsPerformedHeader;
import pcftest.BatchProcessScreen.ProcuessHistoryCV.BatchProcessInfo_ProcessHistoryLV.ScheduledHeader;
import pcftest.BatchProcessScreen.ProcuessHistoryCV.BatchProcessInfo_ProcessHistoryLV.ServerIdHeader;
import pcftest.BatchProcessScreen.ProcuessHistoryCV.BatchProcessInfo_ProcessHistoryLV.StartDateHeader;
import pcftest.BatchProcessScreen.ProcuessHistoryCV.BatchProcessInfo_ProcessHistoryLV.StartRequestedDateHeader;
import pcftest.BatchProcessScreen.ProcuessHistoryCV.BatchProcessInfo_ProcessHistoryLV._ListPaging;
import pcftest.BatchProcessScreen.ProcuessHistoryCV.BatchProcessInfo_ProcessHistoryLV_tb;
import pcftest.BatchProcessScreen.ProcuessHistoryCV.ProcessHistoryChartTabTab;
import pcftest.BatchProcessScreen.ProcuessHistoryCV.ProcessHistoryTabTab;
import pcftest.BatchProcessScreen.SchedulerSuspendedAlert;
import pcftest.BatchProcessScreen.SchedulerSuspendedAlert.CloseBtn;
import pcftest.BatchProcessScreen._msgs;
import typekey.BatchProcessType;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/BatchProcessScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class BatchProcessScreen extends PCFElement {
  public final static String CHECKSUM = "3f1be13a27f5a1675988699e78e0bc8d";
  
  public BatchProcessScreen(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public BatchProcessesLV getBatchProcessesLV() {
    return getOrCreateProperty("BatchProcessesLV", "BatchProcessesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.BatchProcessScreen.BatchProcessesLV.class);
  }
  
  public BatchProcessesLV_tb getBatchProcessesLV_tb() {
    return getOrCreateProperty("BatchProcessesLV_tb", "BatchProcessesLV_tb", null, pcftest.BatchProcessScreen.BatchProcessesLV_tb.class);
  }
  
  public ProcuessHistoryCV getProcuessHistoryCV() {
    return getOrCreateProperty("ProcuessHistoryCV", "ProcuessHistoryCV", null, pcftest.BatchProcessScreen.ProcuessHistoryCV.class);
  }
  
  public SchedulerSuspendedAlert getSchedulerSuspendedAlert() {
    return getOrCreateProperty("SchedulerSuspendedAlert", "SchedulerSuspendedAlert", null, pcftest.BatchProcessScreen.SchedulerSuspendedAlert.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.BatchProcessScreen._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/BatchProcessScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class BatchProcessesLV extends PCFElement {
    public BatchProcessesLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public BatchProcessHeader getBatchProcessHeader() {
      return getOrCreateProperty("BatchProcessHeader", "BatchProcessHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.BatchProcessScreen.BatchProcessesLV.BatchProcessHeader.class);
    }
    
    public pcftest.BatchProcessScreen.BatchProcessesLV.DescriptionHeader getDescriptionHeader() {
      return getOrCreateProperty("DescriptionHeader", "DescriptionHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.BatchProcessScreen.BatchProcessesLV.DescriptionHeader.class);
    }
    
    public LastRunHeader getLastRunHeader() {
      return getOrCreateProperty("LastRunHeader", "LastRunHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.BatchProcessScreen.BatchProcessesLV.LastRunHeader.class);
    }
    
    public LastRunStatusHeader getLastRunStatusHeader() {
      return getOrCreateProperty("LastRunStatusHeader", "LastRunStatusHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.BatchProcessScreen.BatchProcessesLV.LastRunStatusHeader.class);
    }
    
    public NextRunHeader getNextRunHeader() {
      return getOrCreateProperty("NextRunHeader", "NextRunHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.BatchProcessScreen.BatchProcessesLV.NextRunHeader.class);
    }
    
    public SelectElement getProcessUsageFilter() {
      return getOrCreateProperty("ProcessUsageFilter", "ProcessUsageFilter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewToolbarFilter, gw.smoketest.platform.web.SelectElement.class);
    }
    
    public RunBatchWithoutNotifyContentHeader getRunBatchWithoutNotifyContentHeader() {
      return getOrCreateProperty("RunBatchWithoutNotifyContentHeader", "RunBatchWithoutNotifyContentHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.BatchProcessScreen.BatchProcessesLV.RunBatchWithoutNotifyContentHeader.class);
    }
    
    public ScheduleActionsHeader getScheduleActionsHeader() {
      return getOrCreateProperty("ScheduleActionsHeader", "ScheduleActionsHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.BatchProcessScreen.BatchProcessesLV.ScheduleActionsHeader.class);
    }
    
    public ScheduleHeader getScheduleHeader() {
      return getOrCreateProperty("ScheduleHeader", "ScheduleHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.BatchProcessScreen.BatchProcessesLV.ScheduleHeader.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntries<pcftest.BatchProcessScreen.BatchProcessesLV.entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.BatchProcessScreen.BatchProcessesLV.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/BatchProcessScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class BatchProcessHeader extends ValueElement {
      public BatchProcessHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/BatchProcessScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class DescriptionHeader extends ValueElement {
      public DescriptionHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/BatchProcessScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class LastRunHeader extends ValueElement {
      public LastRunHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/BatchProcessScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class LastRunStatusHeader extends ValueElement {
      public LastRunStatusHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/BatchProcessScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class NextRunHeader extends ValueElement {
      public NextRunHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/BatchProcessScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class RunBatchWithoutNotifyContentHeader extends ValueElement {
      public RunBatchWithoutNotifyContentHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/BatchProcessScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ScheduleActionsHeader extends ValueElement {
      public ScheduleActionsHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/BatchProcessScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ScheduleHeader extends ValueElement {
      public ScheduleHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/BatchProcessScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends RowElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public BatchProcess getBatchProcess() {
        return getOrCreateProperty("BatchProcess", "BatchProcess", null, pcftest.BatchProcessScreen.BatchProcessesLV.entry.BatchProcess.class);
      }
      
      public ValueElement getDescription() {
        return getOrCreateProperty("Description", "Description", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public DownloadHistory getDownloadHistory() {
        return getOrCreateProperty("DownloadHistory", "DownloadHistory", null, pcftest.BatchProcessScreen.BatchProcessesLV.entry.DownloadHistory.class);
      }
      
      public DateElement getLastRun() {
        return getOrCreateProperty("LastRun", "LastRun", null, gw.smoketest.platform.web.DateElement.class);
      }
      
      public ValueElement getLastRunStatus() {
        return getOrCreateProperty("LastRunStatus", "LastRunStatus", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public DateElement getNextRun() {
        return getOrCreateProperty("NextRun", "NextRun", null, gw.smoketest.platform.web.DateElement.class);
      }
      
      public RunBatchWithoutNotify getRunBatchWithoutNotify() {
        return getOrCreateProperty("RunBatchWithoutNotify", "RunBatchWithoutNotify", null, pcftest.BatchProcessScreen.BatchProcessesLV.entry.RunBatchWithoutNotify.class);
      }
      
      public ValueElement getSchedule() {
        return getOrCreateProperty("Schedule", "Schedule", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ScheduleStart getScheduleStart() {
        return getOrCreateProperty("ScheduleStart", "ScheduleStart", null, pcftest.BatchProcessScreen.BatchProcessesLV.entry.ScheduleStart.class);
      }
      
      public ScheduleStop getScheduleStop() {
        return getOrCreateProperty("ScheduleStop", "ScheduleStop", null, pcftest.BatchProcessScreen.BatchProcessesLV.entry.ScheduleStop.class);
      }
      
      public ScheduleSync getScheduleSync() {
        return getOrCreateProperty("ScheduleSync", "ScheduleSync", null, pcftest.BatchProcessScreen.BatchProcessesLV.entry.ScheduleSync.class);
      }
      
      public TerminateBatchWithoutNotify getTerminateBatchWithoutNotify() {
        return getOrCreateProperty("TerminateBatchWithoutNotify", "TerminateBatchWithoutNotify", null, pcftest.BatchProcessScreen.BatchProcessesLV.entry.TerminateBatchWithoutNotify.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      public pcftest.BatchProcessScreen.BatchProcessesLV.entry._Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.BatchProcessScreen.BatchProcessesLV.entry._Select.class);
      }
      
      public pcftest.BatchProcessScreen.BatchProcessesLV.entry._ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.BatchProcessScreen.BatchProcessesLV.entry._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/BatchProcessScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class BatchProcess extends SelectElement {
        public BatchProcess(ISmokeTest helper, PCFElementId componentId)  {
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
      @Generated(comments = "config/web/pcf/tools/BatchProcessScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class DownloadHistory extends ClickableActionElement {
        public DownloadHistory(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/BatchProcessScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class RunBatchWithoutNotify extends ClickableActionElement {
        public RunBatchWithoutNotify(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/BatchProcessScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ScheduleStart extends ClickableActionElement {
        public ScheduleStart(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/BatchProcessScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ScheduleStop extends ClickableActionElement {
        public ScheduleStop(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/BatchProcessScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ScheduleSync extends ClickableActionElement {
        public ScheduleSync(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/BatchProcessScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class TerminateBatchWithoutNotify extends ClickableActionElement {
        public TerminateBatchWithoutNotify(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/BatchProcessScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/BatchProcessScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/tools/BatchProcessScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class BatchProcessesLV_tb extends PCFElement {
    public BatchProcessesLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public download getdownload() {
      return getOrCreateProperty("download", "download", null, pcftest.BatchProcessScreen.BatchProcessesLV_tb.download.class);
    }
    
    public refresh getrefresh() {
      return getOrCreateProperty("refresh", "refresh", null, pcftest.BatchProcessScreen.BatchProcessesLV_tb.refresh.class);
    }
    
    public resumeScheduler getresumeScheduler() {
      return getOrCreateProperty("resumeScheduler", "resumeScheduler", null, pcftest.BatchProcessScreen.BatchProcessesLV_tb.resumeScheduler.class);
    }
    
    public suspendScheduler getsuspendScheduler() {
      return getOrCreateProperty("suspendScheduler", "suspendScheduler", null, pcftest.BatchProcessScreen.BatchProcessesLV_tb.suspendScheduler.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/BatchProcessScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class download extends ClickableActionElement {
      public download(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/BatchProcessScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class refresh extends ClickableActionElement {
      public refresh(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/BatchProcessScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class resumeScheduler extends ClickableActionElement {
      public resumeScheduler(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/BatchProcessScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class suspendScheduler extends ClickableActionElement {
      public suspendScheduler(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/BatchProcessScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ProcuessHistoryCV extends PCFElement {
    public ProcuessHistoryCV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public BatchProcessInfo_ProcessHistoryLV getBatchProcessInfo_ProcessHistoryLV() {
      return getOrCreateProperty("BatchProcessInfo_ProcessHistoryLV", "BatchProcessInfo_ProcessHistoryLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.BatchProcessScreen.ProcuessHistoryCV.BatchProcessInfo_ProcessHistoryLV.class);
    }
    
    public BatchProcessInfo_ProcessHistoryLV_tb getBatchProcessInfo_ProcessHistoryLV_tb() {
      return getOrCreateProperty("BatchProcessInfo_ProcessHistoryLV_tb", "BatchProcessInfo_ProcessHistoryLV_tb", null, pcftest.BatchProcessScreen.ProcuessHistoryCV.BatchProcessInfo_ProcessHistoryLV_tb.class);
    }
    
    public ProcessHistoryChartTabTab getProcessHistoryChartTabTab() {
      return getOrCreateProperty("ProcessHistoryChartTabTab", "ProcessHistoryChartTabTab", null, pcftest.BatchProcessScreen.ProcuessHistoryCV.ProcessHistoryChartTabTab.class);
    }
    
    public ProcessHistoryTabTab getProcessHistoryTabTab() {
      return getOrCreateProperty("ProcessHistoryTabTab", "ProcessHistoryTabTab", null, pcftest.BatchProcessScreen.ProcuessHistoryCV.ProcessHistoryTabTab.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/BatchProcessScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class BatchProcessInfo_ProcessHistoryLV extends PCFElement {
      public BatchProcessInfo_ProcessHistoryLV(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public CompleteDateHeader getCompleteDateHeader() {
        return getOrCreateProperty("CompleteDateHeader", "CompleteDateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.BatchProcessScreen.ProcuessHistoryCV.BatchProcessInfo_ProcessHistoryLV.CompleteDateHeader.class);
      }
      
      public pcftest.BatchProcessScreen.ProcuessHistoryCV.BatchProcessInfo_ProcessHistoryLV.DescriptionHeader getDescriptionHeader() {
        return getOrCreateProperty("DescriptionHeader", "DescriptionHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.BatchProcessScreen.ProcuessHistoryCV.BatchProcessInfo_ProcessHistoryLV.DescriptionHeader.class);
      }
      
      public FailedOpsHeader getFailedOpsHeader() {
        return getOrCreateProperty("FailedOpsHeader", "FailedOpsHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.BatchProcessScreen.ProcuessHistoryCV.BatchProcessInfo_ProcessHistoryLV.FailedOpsHeader.class);
      }
      
      public FailureReasonHeader getFailureReasonHeader() {
        return getOrCreateProperty("FailureReasonHeader", "FailureReasonHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.BatchProcessScreen.ProcuessHistoryCV.BatchProcessInfo_ProcessHistoryLV.FailureReasonHeader.class);
      }
      
      public OpsPerformedHeader getOpsPerformedHeader() {
        return getOrCreateProperty("OpsPerformedHeader", "OpsPerformedHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.BatchProcessScreen.ProcuessHistoryCV.BatchProcessInfo_ProcessHistoryLV.OpsPerformedHeader.class);
      }
      
      public SelectElement getProcessHistoryFilter() {
        return getOrCreateProperty("ProcessHistoryFilter", "ProcessHistoryFilter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewToolbarFilter, gw.smoketest.platform.web.SelectElement.class);
      }
      
      public ScheduledHeader getScheduledHeader() {
        return getOrCreateProperty("ScheduledHeader", "ScheduledHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.BatchProcessScreen.ProcuessHistoryCV.BatchProcessInfo_ProcessHistoryLV.ScheduledHeader.class);
      }
      
      public ServerIdHeader getServerIdHeader() {
        return getOrCreateProperty("ServerIdHeader", "ServerIdHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.BatchProcessScreen.ProcuessHistoryCV.BatchProcessInfo_ProcessHistoryLV.ServerIdHeader.class);
      }
      
      public StartDateHeader getStartDateHeader() {
        return getOrCreateProperty("StartDateHeader", "StartDateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.BatchProcessScreen.ProcuessHistoryCV.BatchProcessInfo_ProcessHistoryLV.StartDateHeader.class);
      }
      
      public StartRequestedDateHeader getStartRequestedDateHeader() {
        return getOrCreateProperty("StartRequestedDateHeader", "StartRequestedDateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.BatchProcessScreen.ProcuessHistoryCV.BatchProcessInfo_ProcessHistoryLV.StartRequestedDateHeader.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      @SuppressWarnings(value = "unchecked")
      public IteratorEntriesWithPaging<pcftest.BatchProcessScreen.ProcuessHistoryCV.BatchProcessInfo_ProcessHistoryLV.entry> get_Entries() {
        return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.BatchProcessScreen.ProcuessHistoryCV.BatchProcessInfo_ProcessHistoryLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
      }
      
      public _ListPaging get_ListPaging() {
        return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.BatchProcessScreen.ProcuessHistoryCV.BatchProcessInfo_ProcessHistoryLV._ListPaging.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/BatchProcessScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class CompleteDateHeader extends ValueElement {
        public CompleteDateHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/BatchProcessScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class DescriptionHeader extends ValueElement {
        public DescriptionHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/BatchProcessScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class FailedOpsHeader extends ValueElement {
        public FailedOpsHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/BatchProcessScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class FailureReasonHeader extends ValueElement {
        public FailureReasonHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/BatchProcessScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class OpsPerformedHeader extends ValueElement {
        public OpsPerformedHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/BatchProcessScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ScheduledHeader extends ValueElement {
        public ScheduledHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/BatchProcessScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ServerIdHeader extends ValueElement {
        public ServerIdHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/BatchProcessScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class StartDateHeader extends ValueElement {
        public StartDateHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/BatchProcessScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class StartRequestedDateHeader extends ValueElement {
        public StartRequestedDateHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/BatchProcessScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _ListPaging extends PagingElement {
        public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/BatchProcessScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class entry extends RowElement {
        public entry(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public DateElement getCompleteDate() {
          return getOrCreateProperty("CompleteDate", "CompleteDate", null, gw.smoketest.platform.web.DateElement.class);
        }
        
        public ValueElement getDescription() {
          return getOrCreateProperty("Description", "Description", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getFailedOps() {
          return getOrCreateProperty("FailedOps", "FailedOps", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getFailureReason() {
          return getOrCreateProperty("FailureReason", "FailureReason", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getOpsPerformed() {
          return getOrCreateProperty("OpsPerformed", "OpsPerformed", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public BooleanValueElement getScheduled() {
          return getOrCreateProperty("Scheduled", "Scheduled", null, gw.smoketest.platform.web.BooleanValueElement.class);
        }
        
        public ValueElement getServerId() {
          return getOrCreateProperty("ServerId", "ServerId", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public DateElement getStartDate() {
          return getOrCreateProperty("StartDate", "StartDate", null, gw.smoketest.platform.web.DateElement.class);
        }
        
        public DateElement getStartRequestedDate() {
          return getOrCreateProperty("StartRequestedDate", "StartRequestedDate", null, gw.smoketest.platform.web.DateElement.class);
        }
        
        public IteratorEntryCheckboxElement get_Checkbox() {
          return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
        }
        
        public pcftest.BatchProcessScreen.ProcuessHistoryCV.BatchProcessInfo_ProcessHistoryLV.entry._Select get_Select() {
          return getOrCreateProperty("_Select", "_Select", null, pcftest.BatchProcessScreen.ProcuessHistoryCV.BatchProcessInfo_ProcessHistoryLV.entry._Select.class);
        }
        
        public pcftest.BatchProcessScreen.ProcuessHistoryCV.BatchProcessInfo_ProcessHistoryLV.entry._ViewDetail get_ViewDetail() {
          return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.BatchProcessScreen.ProcuessHistoryCV.BatchProcessInfo_ProcessHistoryLV.entry._ViewDetail.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/BatchProcessScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class _Select extends SelectorCellElement {
          public _Select(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/BatchProcessScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/tools/BatchProcessScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class BatchProcessInfo_ProcessHistoryLV_tb extends PCFElement {
      public BatchProcessInfo_ProcessHistoryLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/BatchProcessScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ProcessHistoryChartTabTab extends ClickableActionElement {
      public ProcessHistoryChartTabTab(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/BatchProcessScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ProcessHistoryTabTab extends ClickableActionElement {
      public ProcessHistoryTabTab(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/BatchProcessScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SchedulerSuspendedAlert extends ClickableActionElement {
    public SchedulerSuspendedAlert(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public CloseBtn getCloseBtn() {
      return getOrCreateProperty("CloseBtn", "CloseBtn", null, pcftest.BatchProcessScreen.SchedulerSuspendedAlert.CloseBtn.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/BatchProcessScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CloseBtn extends ClickableActionElement {
      public CloseBtn(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/BatchProcessScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}