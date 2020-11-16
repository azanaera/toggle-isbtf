package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.IteratorEntries;
import gw.smoketest.platform.web.IteratorEntryCheckboxElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.RowElement;
import gw.smoketest.platform.web.SelectorCellElement;
import gw.smoketest.platform.web.ValueElement;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.WorkQueueInfo.WorkQueueInfoScreen;
import pcftest.WorkQueueInfo.WorkQueueInfoScreen.WorkQueueDV;
import pcftest.WorkQueueInfo.WorkQueueInfoScreen.WorkQueueDV.WorkItemsByWriterTab;
import pcftest.WorkQueueInfo.WorkQueueInfoScreen.WorkQueueDV.WorkQueueExecutorsTab;
import pcftest.WorkQueueInfo.WorkQueueInfoScreen.WorkQueueDV.WorkQueueWorkItemsTab;
import pcftest.WorkQueueInfo.WorkQueueInfoScreen.WorkQueueInfoLV;
import pcftest.WorkQueueInfo.WorkQueueInfoScreen.WorkQueueInfoLV.NotifyCellHeader;
import pcftest.WorkQueueInfo.WorkQueueInfoScreen.WorkQueueInfoLV.WorkQueueNameHeader;
import pcftest.WorkQueueInfo.WorkQueueInfoScreen.WorkQueueInfoLV.WriterStatusHeader;
import pcftest.WorkQueueInfo.WorkQueueInfoScreen.WorkQueueInfoLV.entry;
import pcftest.WorkQueueInfo.WorkQueueInfoScreen.WorkQueueInfoLV.entry.Notify;
import pcftest.WorkQueueInfo.WorkQueueInfoScreen.WorkQueueInfoLV.entry.PrintHistory;
import pcftest.WorkQueueInfo.WorkQueueInfoScreen.WorkQueueInfoLV.entry.RestartWorkers;
import pcftest.WorkQueueInfo.WorkQueueInfoScreen.WorkQueueInfoLV.entry.RunWriter;
import pcftest.WorkQueueInfo.WorkQueueInfoScreen.WorkQueueInfoLV.entry.StopWorkers;
import pcftest.WorkQueueInfo.WorkQueueInfoScreen.WorkQueueInfoLV.entry._Select;
import pcftest.WorkQueueInfo.WorkQueueInfoScreen.WorkQueueInfoLV.entry._ViewDetail;
import pcftest.WorkQueueInfo.WorkQueueInfoScreen.WorkQueueInfoLV.numActiveHeader;
import pcftest.WorkQueueInfo.WorkQueueInfoScreen.WorkQueueInfoLV.numCheckedOutHeader;
import pcftest.WorkQueueInfo.WorkQueueInfoScreen.WorkQueueInfoLV.numExecutorsActiveHeader;
import pcftest.WorkQueueInfo.WorkQueueInfoScreen.WorkQueueInfoLV.numFailedHeader;
import pcftest.WorkQueueInfo.WorkQueueInfoScreen.WorkQueueInfoLV.startedClusterWideHeader;
import pcftest.WorkQueueInfo.WorkQueueInfoScreen.WorkQueueInfoLV_tb;
import pcftest.WorkQueueInfo.WorkQueueInfoScreen.WorkQueueInfoLV_tb.download;
import pcftest.WorkQueueInfo.WorkQueueInfoScreen.WorkQueueInfoLV_tb.downloadRawData;
import pcftest.WorkQueueInfo.WorkQueueInfoScreen.WorkQueueInfoLV_tb.refresh;
import pcftest.WorkQueueInfo.WorkQueueInfoScreen._msgs;
import pcftest.WorkQueueInfo.WorkQueueInfo_UpLink;
import pcftest.WorkQueueInfo._Paging;
import pcftest.WorkQueueInfo.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/WorkQueueInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class WorkQueueInfo extends PCFLocation {
  public final static String CHECKSUM = "9ef904f3f7dc1ecf644dfb42f4d83cf5";
  
  public WorkQueueInfo(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("WorkQueueInfo"));
  }
  
  public WorkQueueInfoScreen getWorkQueueInfoScreen() {
    return getOrCreateProperty("WorkQueueInfoScreen", "WorkQueueInfoScreen", null, pcftest.WorkQueueInfo.WorkQueueInfoScreen.class);
  }
  
  public WorkQueueInfo_UpLink getWorkQueueInfo_UpLink() {
    return getOrCreateProperty("WorkQueueInfo_UpLink", "WorkQueueInfo_UpLink", null, pcftest.WorkQueueInfo.WorkQueueInfo_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.WorkQueueInfo._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.WorkQueueInfo.__crumb__.class);
  }
  
  public ServerTools get_parent() {
    return getOrCreateProperty("_parent", pcftest.ServerTools.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/WorkQueueInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class WorkQueueInfoScreen extends PCFElement {
    public WorkQueueInfoScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public WorkQueueDV getWorkQueueDV() {
      return getOrCreateProperty("WorkQueueDV", "WorkQueueDV", null, pcftest.WorkQueueInfo.WorkQueueInfoScreen.WorkQueueDV.class);
    }
    
    public WorkQueueInfoLV getWorkQueueInfoLV() {
      return getOrCreateProperty("WorkQueueInfoLV", "WorkQueueInfoLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.WorkQueueInfo.WorkQueueInfoScreen.WorkQueueInfoLV.class);
    }
    
    public WorkQueueInfoLV_tb getWorkQueueInfoLV_tb() {
      return getOrCreateProperty("WorkQueueInfoLV_tb", "WorkQueueInfoLV_tb", null, pcftest.WorkQueueInfo.WorkQueueInfoScreen.WorkQueueInfoLV_tb.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.WorkQueueInfo.WorkQueueInfoScreen._msgs.class);
    }
    
    public ValueElement getactiveThreads() {
      return getOrCreateProperty("activeThreads", "activeThreads", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getmaximumPoolSize() {
      return getOrCreateProperty("maximumPoolSize", "maximumPoolSize", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getpoolSize() {
      return getOrCreateProperty("poolSize", "poolSize", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/WorkQueueInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class WorkQueueDV extends PCFElement {
      public WorkQueueDV(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public WorkItemsByWriterTab getWorkItemsByWriterTab() {
        return getOrCreateProperty("WorkItemsByWriterTab", "WorkItemsByWriterTab", null, pcftest.WorkQueueInfo.WorkQueueInfoScreen.WorkQueueDV.WorkItemsByWriterTab.class);
      }
      
      public WorkQueueExecutorsPanelSet getWorkQueueExecutorsPanelSet() {
        return getOrCreateProperty("WorkQueueExecutorsPanelSet", "WorkQueueExecutorsPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.WorkQueueExecutorsPanelSet.class);
      }
      
      public WorkQueueExecutorsTab getWorkQueueExecutorsTab() {
        return getOrCreateProperty("WorkQueueExecutorsTab", "WorkQueueExecutorsTab", null, pcftest.WorkQueueInfo.WorkQueueInfoScreen.WorkQueueDV.WorkQueueExecutorsTab.class);
      }
      
      public WorkQueueWorkItemsLDV getWorkQueueWorkItemsLDV() {
        return getOrCreateProperty("WorkQueueWorkItemsLDV", "WorkQueueWorkItemsLDV", null, pcftest.WorkQueueWorkItemsLDV.class);
      }
      
      public WorkQueueWorkItemsTab getWorkQueueWorkItemsTab() {
        return getOrCreateProperty("WorkQueueWorkItemsTab", "WorkQueueWorkItemsTab", null, pcftest.WorkQueueInfo.WorkQueueInfoScreen.WorkQueueDV.WorkQueueWorkItemsTab.class);
      }
      
      public WorkQueueWritersPanelSet getWorkQueueWritersPanelSet() {
        return getOrCreateProperty("WorkQueueWritersPanelSet", "WorkQueueWritersPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.WorkQueueWritersPanelSet.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/WorkQueueInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class WorkItemsByWriterTab extends ClickableActionElement {
        public WorkItemsByWriterTab(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/WorkQueueInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class WorkQueueExecutorsTab extends ClickableActionElement {
        public WorkQueueExecutorsTab(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/WorkQueueInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class WorkQueueWorkItemsTab extends ClickableActionElement {
        public WorkQueueWorkItemsTab(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/WorkQueueInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class WorkQueueInfoLV extends PCFElement {
      public WorkQueueInfoLV(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public NotifyCellHeader getNotifyCellHeader() {
        return getOrCreateProperty("NotifyCellHeader", "NotifyCellHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.WorkQueueInfo.WorkQueueInfoScreen.WorkQueueInfoLV.NotifyCellHeader.class);
      }
      
      public WorkQueueNameHeader getWorkQueueNameHeader() {
        return getOrCreateProperty("WorkQueueNameHeader", "WorkQueueNameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.WorkQueueInfo.WorkQueueInfoScreen.WorkQueueInfoLV.WorkQueueNameHeader.class);
      }
      
      public WriterStatusHeader getWriterStatusHeader() {
        return getOrCreateProperty("WriterStatusHeader", "WriterStatusHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.WorkQueueInfo.WorkQueueInfoScreen.WorkQueueInfoLV.WriterStatusHeader.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      @SuppressWarnings(value = "unchecked")
      public IteratorEntries<entry> get_Entries() {
        return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.WorkQueueInfo.WorkQueueInfoScreen.WorkQueueInfoLV.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
      }
      
      public numActiveHeader getnumActiveHeader() {
        return getOrCreateProperty("numActiveHeader", "numActiveHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.WorkQueueInfo.WorkQueueInfoScreen.WorkQueueInfoLV.numActiveHeader.class);
      }
      
      public numCheckedOutHeader getnumCheckedOutHeader() {
        return getOrCreateProperty("numCheckedOutHeader", "numCheckedOutHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.WorkQueueInfo.WorkQueueInfoScreen.WorkQueueInfoLV.numCheckedOutHeader.class);
      }
      
      public numExecutorsActiveHeader getnumExecutorsActiveHeader() {
        return getOrCreateProperty("numExecutorsActiveHeader", "numExecutorsActiveHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.WorkQueueInfo.WorkQueueInfoScreen.WorkQueueInfoLV.numExecutorsActiveHeader.class);
      }
      
      public numFailedHeader getnumFailedHeader() {
        return getOrCreateProperty("numFailedHeader", "numFailedHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.WorkQueueInfo.WorkQueueInfoScreen.WorkQueueInfoLV.numFailedHeader.class);
      }
      
      public startedClusterWideHeader getstartedClusterWideHeader() {
        return getOrCreateProperty("startedClusterWideHeader", "startedClusterWideHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.WorkQueueInfo.WorkQueueInfoScreen.WorkQueueInfoLV.startedClusterWideHeader.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/WorkQueueInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class NotifyCellHeader extends ValueElement {
        public NotifyCellHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/WorkQueueInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class WorkQueueNameHeader extends ValueElement {
        public WorkQueueNameHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/WorkQueueInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class WriterStatusHeader extends ValueElement {
        public WriterStatusHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/WorkQueueInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class entry extends RowElement {
        public entry(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public Notify getNotify() {
          return getOrCreateProperty("Notify", "Notify", null, pcftest.WorkQueueInfo.WorkQueueInfoScreen.WorkQueueInfoLV.entry.Notify.class);
        }
        
        public PrintHistory getPrintHistory() {
          return getOrCreateProperty("PrintHistory", "PrintHistory", null, pcftest.WorkQueueInfo.WorkQueueInfoScreen.WorkQueueInfoLV.entry.PrintHistory.class);
        }
        
        public RestartWorkers getRestartWorkers() {
          return getOrCreateProperty("RestartWorkers", "RestartWorkers", null, pcftest.WorkQueueInfo.WorkQueueInfoScreen.WorkQueueInfoLV.entry.RestartWorkers.class);
        }
        
        public RunWriter getRunWriter() {
          return getOrCreateProperty("RunWriter", "RunWriter", null, pcftest.WorkQueueInfo.WorkQueueInfoScreen.WorkQueueInfoLV.entry.RunWriter.class);
        }
        
        public StopWorkers getStopWorkers() {
          return getOrCreateProperty("StopWorkers", "StopWorkers", null, pcftest.WorkQueueInfo.WorkQueueInfoScreen.WorkQueueInfoLV.entry.StopWorkers.class);
        }
        
        public ValueElement getWorkQueueName() {
          return getOrCreateProperty("WorkQueueName", "WorkQueueName", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getWriterStatus() {
          return getOrCreateProperty("WriterStatus", "WriterStatus", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public IteratorEntryCheckboxElement get_Checkbox() {
          return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
        }
        
        public _Select get_Select() {
          return getOrCreateProperty("_Select", "_Select", null, pcftest.WorkQueueInfo.WorkQueueInfoScreen.WorkQueueInfoLV.entry._Select.class);
        }
        
        public _ViewDetail get_ViewDetail() {
          return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.WorkQueueInfo.WorkQueueInfoScreen.WorkQueueInfoLV.entry._ViewDetail.class);
        }
        
        public ValueElement getnumActive() {
          return getOrCreateProperty("numActive", "numActive", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getnumCheckedOut() {
          return getOrCreateProperty("numCheckedOut", "numCheckedOut", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getnumExecutorsActive() {
          return getOrCreateProperty("numExecutorsActive", "numExecutorsActive", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getnumFailed() {
          return getOrCreateProperty("numFailed", "numFailed", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getstartedClusterWide() {
          return getOrCreateProperty("startedClusterWide", "startedClusterWide", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/WorkQueueInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class Notify extends ClickableActionElement {
          public Notify(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/WorkQueueInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class PrintHistory extends ClickableActionElement {
          public PrintHistory(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/WorkQueueInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class RestartWorkers extends ClickableActionElement {
          public RestartWorkers(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/WorkQueueInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class RunWriter extends ClickableActionElement {
          public RunWriter(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/WorkQueueInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class StopWorkers extends ClickableActionElement {
          public StopWorkers(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/WorkQueueInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class _Select extends SelectorCellElement {
          public _Select(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/WorkQueueInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class _ViewDetail extends BooleanValueElement {
          public _ViewDetail(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/WorkQueueInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class numActiveHeader extends ValueElement {
        public numActiveHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/WorkQueueInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class numCheckedOutHeader extends ValueElement {
        public numCheckedOutHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/WorkQueueInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class numExecutorsActiveHeader extends ValueElement {
        public numExecutorsActiveHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/WorkQueueInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class numFailedHeader extends ValueElement {
        public numFailedHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/WorkQueueInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class startedClusterWideHeader extends ValueElement {
        public startedClusterWideHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/WorkQueueInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class WorkQueueInfoLV_tb extends PCFElement {
      public WorkQueueInfoLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public download getdownload() {
        return getOrCreateProperty("download", "download", null, pcftest.WorkQueueInfo.WorkQueueInfoScreen.WorkQueueInfoLV_tb.download.class);
      }
      
      public downloadRawData getdownloadRawData() {
        return getOrCreateProperty("downloadRawData", "downloadRawData", null, pcftest.WorkQueueInfo.WorkQueueInfoScreen.WorkQueueInfoLV_tb.downloadRawData.class);
      }
      
      public refresh getrefresh() {
        return getOrCreateProperty("refresh", "refresh", null, pcftest.WorkQueueInfo.WorkQueueInfoScreen.WorkQueueInfoLV_tb.refresh.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/WorkQueueInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class download extends ClickableActionElement {
        public download(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public WorkQueueInfoDownloadConfigurePopup click() {
          return clickThis(pcftest.WorkQueueInfoDownloadConfigurePopup.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/WorkQueueInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class downloadRawData extends ClickableActionElement {
        public downloadRawData(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public WorkQueueRawDataDownloadConfigurePopup click() {
          return clickThis(pcftest.WorkQueueRawDataDownloadConfigurePopup.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/WorkQueueInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class refresh extends ClickableActionElement {
        public refresh(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/WorkQueueInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _msgs extends MessagesElement {
      public _msgs(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/WorkQueueInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class WorkQueueInfo_UpLink extends ClickableActionElement {
    public WorkQueueInfo_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/WorkQueueInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/WorkQueueInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}