package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.CheckboxValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElement;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.OracleAWRInfo.OracleAWRInfoScreen;
import pcftest.OracleAWRInfo.OracleAWRInfoScreen.OraAWRMessageBar;
import pcftest.OracleAWRInfo.OracleAWRInfoScreen.PerfDownloadLV.PerfDownloadLV_tb;
import pcftest.OracleAWRInfo.OracleAWRInfoScreen.PerfDownloadLV.PerfDownloadLV_tb.ToolbarButton;
import pcftest.OracleAWRInfo.OracleAWRInfoScreen.snapshotsPanel;
import pcftest.OracleAWRInfo.OracleAWRInfoScreen.snapshotsPanel.orasptb;
import pcftest.OracleAWRInfo.OracleAWRInfoScreen.snapshotsPanel.orasptb.RefreshAWRs;
import pcftest.OracleAWRInfo.OracleAWRInfoScreen.snapshotsPanel.orasptb.TogglePaging;
import pcftest.OracleAWRInfo.OracleAWRInfoScreen.submitBatch;
import pcftest.OracleAWRInfo.OracleAWRInfo_UpLink;
import pcftest.OracleAWRInfo._Paging;
import pcftest.OracleAWRInfo.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/infopages/OracleAWRInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class OracleAWRInfo extends PCFLocation {
  public final static String CHECKSUM = "041a8d72d2a96e77834cd2f769d2ce7a";
  
  public OracleAWRInfo(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("OracleAWRInfo"));
  }
  
  public OracleAWRInfoScreen getOracleAWRInfoScreen() {
    return getOrCreateProperty("OracleAWRInfoScreen", "OracleAWRInfoScreen", null, pcftest.OracleAWRInfo.OracleAWRInfoScreen.class);
  }
  
  public OracleAWRInfo_UpLink getOracleAWRInfo_UpLink() {
    return getOrCreateProperty("OracleAWRInfo_UpLink", "OracleAWRInfo_UpLink", null, pcftest.OracleAWRInfo.OracleAWRInfo_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.OracleAWRInfo._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.OracleAWRInfo.__crumb__.class);
  }
  
  public InfoPages get_parent() {
    return getOrCreateProperty("_parent", pcftest.InfoPages.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/OracleAWRInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class OracleAWRInfoScreen extends PCFElement {
    public OracleAWRInfoScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public CheckboxValueElement getCapturePeakedBindVariables() {
      return getOrCreateProperty("CapturePeakedBindVariables", "CapturePeakedBindVariables", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
    }
    
    public CheckboxValueElement getCapturePeakedBindVariablesFromAWR() {
      return getOrCreateProperty("CapturePeakedBindVariablesFromAWR", "CapturePeakedBindVariablesFromAWR", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
    }
    
    public CheckboxValueElement getConcurrentBatchProcessAndWorkerAnalysis() {
      return getOrCreateProperty("ConcurrentBatchProcessAndWorkerAnalysis", "ConcurrentBatchProcessAndWorkerAnalysis", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
    }
    
    public CheckboxValueElement getConcurrentHistoryAnalysis() {
      return getOrCreateProperty("ConcurrentHistoryAnalysis", "ConcurrentHistoryAnalysis", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
    }
    
    public CheckboxValueElement getConcurrentMessagingAnalysis() {
      return getOrCreateProperty("ConcurrentMessagingAnalysis", "ConcurrentMessagingAnalysis", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
    }
    
    public CheckboxValueElement getGenerateCallsToASHScripts() {
      return getOrCreateProperty("GenerateCallsToASHScripts", "GenerateCallsToASHScripts", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
    }
    
    public CheckboxValueElement getInMemorySQLMonitorIncludeAllExecutions() {
      return getOrCreateProperty("InMemorySQLMonitorIncludeAllExecutions", "InMemorySQLMonitorIncludeAllExecutions", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
    }
    
    public CheckboxValueElement getIncludeDatabaseStatistics() {
      return getOrCreateProperty("IncludeDatabaseStatistics", "IncludeDatabaseStatistics", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
    }
    
    public CheckboxValueElement getIncludeMetadataForInstrumentationTables() {
      return getOrCreateProperty("IncludeMetadataForInstrumentationTables", "IncludeMetadataForInstrumentationTables", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
    }
    
    public CheckboxValueElement getIncludeNativeOracleAWRReport() {
      return getOrCreateProperty("IncludeNativeOracleAWRReport", "IncludeNativeOracleAWRReport", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
    }
    
    public CheckboxValueElement getOnDiskSQLMonitorIncludeAllExecutions() {
      return getOrCreateProperty("OnDiskSQLMonitorIncludeAllExecutions", "OnDiskSQLMonitorIncludeAllExecutions", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
    }
    
    public OraAWRMessageBar getOraAWRMessageBar() {
      return getOrCreateProperty("OraAWRMessageBar", "OraAWRMessageBar", null, pcftest.OracleAWRInfo.OracleAWRInfoScreen.OraAWRMessageBar.class);
    }
    
    public pcftest.OracleAWRInfo.OracleAWRInfoScreen.PerfDownloadLV getPerfDownloadLV() {
      return getOrCreateProperty("PerfDownloadLV", "PerfDownloadLV", null, pcftest.OracleAWRInfo.OracleAWRInfoScreen.PerfDownloadLV.class);
    }
    
    public CheckboxValueElement getProbeInMemorySQLMonitor() {
      return getOrCreateProperty("ProbeInMemorySQLMonitor", "ProbeInMemorySQLMonitor", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
    }
    
    public CheckboxValueElement getProbeOnDiskSQLMonitor() {
      return getOrCreateProperty("ProbeOnDiskSQLMonitor", "ProbeOnDiskSQLMonitor", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
    }
    
    public CheckboxValueElement getProbeVDollarTablesFlag() {
      return getOrCreateProperty("ProbeVDollarTablesFlag", "ProbeVDollarTablesFlag", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
    }
    
    public CheckboxValueElement getSearchForQueriesOnlyInFirstSnapshotFlag() {
      return getOrCreateProperty("SearchForQueriesOnlyInFirstSnapshotFlag", "SearchForQueriesOnlyInFirstSnapshotFlag", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
    }
    
    public CheckboxValueElement getSearchForQueriesOnlyInLastSnapshotFlag() {
      return getOrCreateProperty("SearchForQueriesOnlyInLastSnapshotFlag", "SearchForQueriesOnlyInLastSnapshotFlag", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
    }
    
    public CheckboxValueElement getSearchForQueriesWithMultiplePlansFlag() {
      return getOrCreateProperty("SearchForQueriesWithMultiplePlansFlag", "SearchForQueriesWithMultiplePlansFlag", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
    }
    
    public ValueElement getbatchProgress() {
      return getOrCreateProperty("batchProgress", "batchProgress", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public snapshotsPanel getsnapshotsPanel() {
      return getOrCreateProperty("snapshotsPanel", "snapshotsPanel", null, pcftest.OracleAWRInfo.OracleAWRInfoScreen.snapshotsPanel.class);
    }
    
    public submitBatch getsubmitBatch() {
      return getOrCreateProperty("submitBatch", "submitBatch", null, pcftest.OracleAWRInfo.OracleAWRInfoScreen.submitBatch.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/OracleAWRInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class OraAWRMessageBar extends MessagesElement {
      public OraAWRMessageBar(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/OracleAWRInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class PerfDownloadLV extends PCFElement {
      public PerfDownloadLV(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public pcftest.PerfDownloadLV getPerfDownloadLV() {
        return getOrCreateProperty("PerfDownloadLV", "PerfDownloadLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.PerfDownloadLV.class);
      }
      
      public PerfDownloadLV_tb getPerfDownloadLV_tb() {
        return getOrCreateProperty("PerfDownloadLV_tb", "PerfDownloadLV_tb", null, pcftest.OracleAWRInfo.OracleAWRInfoScreen.PerfDownloadLV.PerfDownloadLV_tb.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/OracleAWRInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class PerfDownloadLV_tb extends PCFElement {
        public PerfDownloadLV_tb(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public ToolbarButton getToolbarButton() {
          return getOrCreateProperty("ToolbarButton", "ToolbarButton", null, pcftest.OracleAWRInfo.OracleAWRInfoScreen.PerfDownloadLV.PerfDownloadLV_tb.ToolbarButton.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/infopages/OracleAWRInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class ToolbarButton extends ClickableActionElement {
          public ToolbarButton(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/OracleAWRInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class snapshotsPanel extends PCFElement {
      public snapshotsPanel(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OracleAWRLV_nopaging getOracleAWRLV_nopaging() {
        return getOrCreateProperty("OracleAWRLV_nopaging", "OracleAWRLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.OracleAWRLV_nopaging.class);
      }
      
      public OracleAWRLV_paging getOracleAWRLV_paging() {
        return getOrCreateProperty("OracleAWRLV_paging", "OracleAWRLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.OracleAWRLV_paging.class);
      }
      
      public orasptb getorasptb() {
        return getOrCreateProperty("orasptb", "orasptb", null, pcftest.OracleAWRInfo.OracleAWRInfoScreen.snapshotsPanel.orasptb.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/OracleAWRInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class orasptb extends PCFElement {
        public orasptb(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public RefreshAWRs getRefreshAWRs() {
          return getOrCreateProperty("RefreshAWRs", "RefreshAWRs", null, pcftest.OracleAWRInfo.OracleAWRInfoScreen.snapshotsPanel.orasptb.RefreshAWRs.class);
        }
        
        public TogglePaging getTogglePaging() {
          return getOrCreateProperty("TogglePaging", "TogglePaging", null, pcftest.OracleAWRInfo.OracleAWRInfoScreen.snapshotsPanel.orasptb.TogglePaging.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/infopages/OracleAWRInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class RefreshAWRs extends ClickableActionElement {
          public RefreshAWRs(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/infopages/OracleAWRInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class TogglePaging extends ClickableActionElement {
          public TogglePaging(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/OracleAWRInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class submitBatch extends ValueElement {
      public submitBatch(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/OracleAWRInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class OracleAWRInfo_UpLink extends ClickableActionElement {
    public OracleAWRInfo_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/OracleAWRInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/OracleAWRInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}