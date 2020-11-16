package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.IteratorEntries;
import gw.smoketest.platform.web.IteratorEntryCheckboxElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.RowElement;
import gw.smoketest.platform.web.SelectorCellElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.WorkQueueWritersPanelSet.WorkQueueItemByWriterLV;
import pcftest.WorkQueueWritersPanelSet.WorkQueueItemByWriterLV.AvailableCountHeader;
import pcftest.WorkQueueWritersPanelSet.WorkQueueItemByWriterLV.CheckedOutCountHeader;
import pcftest.WorkQueueWritersPanelSet.WorkQueueItemByWriterLV.CreationTimeHeader;
import pcftest.WorkQueueWritersPanelSet.WorkQueueItemByWriterLV.ExecutionTimeHeader;
import pcftest.WorkQueueWritersPanelSet.WorkQueueItemByWriterLV.FailedCountHeader;
import pcftest.WorkQueueWritersPanelSet.WorkQueueItemByWriterLV.LastWorkerEndTimeHeader;
import pcftest.WorkQueueWritersPanelSet.WorkQueueItemByWriterLV.NumberOfItemsHeader;
import pcftest.WorkQueueWritersPanelSet.WorkQueueItemByWriterLV.ProcessIdHeader;
import pcftest.WorkQueueWritersPanelSet.WorkQueueItemByWriterLV.ServerIdHeader;
import pcftest.WorkQueueWritersPanelSet.WorkQueueItemByWriterLV.SucceededItemCountHeader;
import pcftest.WorkQueueWritersPanelSet.WorkQueueItemByWriterLV.WasScheduledHeader;
import pcftest.WorkQueueWritersPanelSet.WorkQueueItemByWriterLV.entry;
import pcftest.WorkQueueWritersPanelSet.WorkQueueItemByWriterLV.entry._Select;
import pcftest.WorkQueueWritersPanelSet.WorkQueueItemByWriterLV.entry._ViewDetail;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/WorkQueueWritersPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class WorkQueueWritersPanelSet extends PCFElement {
  public final static String CHECKSUM = "bdbe03ea2bad87cd8b376a3966e00107";
  
  public WorkQueueWritersPanelSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public WorkQueueItemByWriterLV getWorkQueueItemByWriterLV() {
    return getOrCreateProperty("WorkQueueItemByWriterLV", "WorkQueueItemByWriterLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.WorkQueueWritersPanelSet.WorkQueueItemByWriterLV.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/WorkQueueWritersPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class WorkQueueItemByWriterLV extends PCFElement {
    public WorkQueueItemByWriterLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public AvailableCountHeader getAvailableCountHeader() {
      return getOrCreateProperty("AvailableCountHeader", "AvailableCountHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.WorkQueueWritersPanelSet.WorkQueueItemByWriterLV.AvailableCountHeader.class);
    }
    
    public CheckedOutCountHeader getCheckedOutCountHeader() {
      return getOrCreateProperty("CheckedOutCountHeader", "CheckedOutCountHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.WorkQueueWritersPanelSet.WorkQueueItemByWriterLV.CheckedOutCountHeader.class);
    }
    
    public CreationTimeHeader getCreationTimeHeader() {
      return getOrCreateProperty("CreationTimeHeader", "CreationTimeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.WorkQueueWritersPanelSet.WorkQueueItemByWriterLV.CreationTimeHeader.class);
    }
    
    public ExecutionTimeHeader getExecutionTimeHeader() {
      return getOrCreateProperty("ExecutionTimeHeader", "ExecutionTimeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.WorkQueueWritersPanelSet.WorkQueueItemByWriterLV.ExecutionTimeHeader.class);
    }
    
    public FailedCountHeader getFailedCountHeader() {
      return getOrCreateProperty("FailedCountHeader", "FailedCountHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.WorkQueueWritersPanelSet.WorkQueueItemByWriterLV.FailedCountHeader.class);
    }
    
    public LastWorkerEndTimeHeader getLastWorkerEndTimeHeader() {
      return getOrCreateProperty("LastWorkerEndTimeHeader", "LastWorkerEndTimeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.WorkQueueWritersPanelSet.WorkQueueItemByWriterLV.LastWorkerEndTimeHeader.class);
    }
    
    public NumberOfItemsHeader getNumberOfItemsHeader() {
      return getOrCreateProperty("NumberOfItemsHeader", "NumberOfItemsHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.WorkQueueWritersPanelSet.WorkQueueItemByWriterLV.NumberOfItemsHeader.class);
    }
    
    public ProcessIdHeader getProcessIdHeader() {
      return getOrCreateProperty("ProcessIdHeader", "ProcessIdHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.WorkQueueWritersPanelSet.WorkQueueItemByWriterLV.ProcessIdHeader.class);
    }
    
    public ServerIdHeader getServerIdHeader() {
      return getOrCreateProperty("ServerIdHeader", "ServerIdHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.WorkQueueWritersPanelSet.WorkQueueItemByWriterLV.ServerIdHeader.class);
    }
    
    public SucceededItemCountHeader getSucceededItemCountHeader() {
      return getOrCreateProperty("SucceededItemCountHeader", "SucceededItemCountHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.WorkQueueWritersPanelSet.WorkQueueItemByWriterLV.SucceededItemCountHeader.class);
    }
    
    public WasScheduledHeader getWasScheduledHeader() {
      return getOrCreateProperty("WasScheduledHeader", "WasScheduledHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.WorkQueueWritersPanelSet.WorkQueueItemByWriterLV.WasScheduledHeader.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntries<entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.WorkQueueWritersPanelSet.WorkQueueItemByWriterLV.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/WorkQueueWritersPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class AvailableCountHeader extends ValueElement {
      public AvailableCountHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/WorkQueueWritersPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CheckedOutCountHeader extends ValueElement {
      public CheckedOutCountHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/WorkQueueWritersPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CreationTimeHeader extends ValueElement {
      public CreationTimeHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/WorkQueueWritersPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ExecutionTimeHeader extends ValueElement {
      public ExecutionTimeHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/WorkQueueWritersPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class FailedCountHeader extends ValueElement {
      public FailedCountHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/WorkQueueWritersPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class LastWorkerEndTimeHeader extends ValueElement {
      public LastWorkerEndTimeHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/WorkQueueWritersPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class NumberOfItemsHeader extends ValueElement {
      public NumberOfItemsHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/WorkQueueWritersPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ProcessIdHeader extends ValueElement {
      public ProcessIdHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/WorkQueueWritersPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ServerIdHeader extends ValueElement {
      public ServerIdHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/WorkQueueWritersPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class SucceededItemCountHeader extends ValueElement {
      public SucceededItemCountHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/WorkQueueWritersPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class WasScheduledHeader extends ValueElement {
      public WasScheduledHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/WorkQueueWritersPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends RowElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ValueElement getAvailableCount() {
        return getOrCreateProperty("AvailableCount", "AvailableCount", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getCheckedOutCount() {
        return getOrCreateProperty("CheckedOutCount", "CheckedOutCount", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public DateElement getCreationTime() {
        return getOrCreateProperty("CreationTime", "CreationTime", null, gw.smoketest.platform.web.DateElement.class);
      }
      
      public ValueElement getExecutionTime() {
        return getOrCreateProperty("ExecutionTime", "ExecutionTime", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getFailedCount() {
        return getOrCreateProperty("FailedCount", "FailedCount", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public DateElement getLastWorkerEndTime() {
        return getOrCreateProperty("LastWorkerEndTime", "LastWorkerEndTime", null, gw.smoketest.platform.web.DateElement.class);
      }
      
      public ValueElement getNumberOfItems() {
        return getOrCreateProperty("NumberOfItems", "NumberOfItems", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getProcessId() {
        return getOrCreateProperty("ProcessId", "ProcessId", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getServerId() {
        return getOrCreateProperty("ServerId", "ServerId", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getSucceededItemCount() {
        return getOrCreateProperty("SucceededItemCount", "SucceededItemCount", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public BooleanValueElement getWasScheduled() {
        return getOrCreateProperty("WasScheduled", "WasScheduled", null, gw.smoketest.platform.web.BooleanValueElement.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      public _Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.WorkQueueWritersPanelSet.WorkQueueItemByWriterLV.entry._Select.class);
      }
      
      public _ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.WorkQueueWritersPanelSet.WorkQueueItemByWriterLV.entry._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/WorkQueueWritersPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/WorkQueueWritersPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  
  
}