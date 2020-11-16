package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.IteratorEntries;
import gw.smoketest.platform.web.IteratorEntriesWithPaging;
import gw.smoketest.platform.web.IteratorEntryCheckboxElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.PagingElement;
import gw.smoketest.platform.web.RowElement;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.SelectorCellElement;
import gw.smoketest.platform.web.ValueElement;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.DatabaseStatistics.DBStatisticsInfoScreen;
import pcftest.DatabaseStatistics.DBStatisticsInfoScreen.DevModeOnlyButton;
import pcftest.DatabaseStatistics.DBStatisticsInfoScreen.DevModeOnlyButton.DeleteMenu;
import pcftest.DatabaseStatistics.DBStatisticsInfoScreen.DevModeOnlyButton.GatherFullMenu;
import pcftest.DatabaseStatistics.DBStatisticsInfoScreen.DevModeOnlyButton.GatherIncrementalMenu;
import pcftest.DatabaseStatistics.DBStatisticsInfoScreen.DevModeOnlyButton.ViewMenu;
import pcftest.DatabaseStatistics.DBStatisticsInfoScreen.DownloadButton;
import pcftest.DatabaseStatistics.DBStatisticsInfoScreen.DownloadStats;
import pcftest.DatabaseStatistics.DBStatisticsInfoScreen.ExecutionHistoryTab;
import pcftest.DatabaseStatistics.DBStatisticsInfoScreen.OracleStatsPreferencesTab;
import pcftest.DatabaseStatistics.DBStatisticsInfoScreen.ReapplyButton;
import pcftest.DatabaseStatistics.DBStatisticsInfoScreen.StatisticsInfoTab;
import pcftest.DatabaseStatistics.DBStatisticsInfoScreen.ToolbarButton;
import pcftest.DatabaseStatistics.DBStatisticsInfoScreen.UpdateStatsLV_tb;
import pcftest.DatabaseStatistics.DBStatisticsInfoScreen.UpdateStatsLV_tb.LVUpdateStatsDelete;
import pcftest.DatabaseStatistics.DBStatisticsInfoScreen.UpdateStatsLV_tb.RunFullButton;
import pcftest.DatabaseStatistics.DBStatisticsInfoScreen.UpdateStatsLV_tb.RunIncrementalButton;
import pcftest.DatabaseStatistics.DBStatisticsInfoScreen._msgs;
import pcftest.DatabaseStatistics.DBStatisticsInfoScreen.tableOverviewRows;
import pcftest.DatabaseStatistics.DBStatisticsInfoScreen.tableOverviewRows._ListPaging;
import pcftest.DatabaseStatistics.DBStatisticsInfoScreen.tableOverviewRows.entry.entry2;
import pcftest.DatabaseStatistics.DBStatisticsInfoScreen.tableOverviewRows.entry.entry2.ParameterActualDivider;
import pcftest.DatabaseStatistics.DBStatisticsInfoScreen.tableOverviewRows.entry.entry2.ParameterActualLabel;
import pcftest.DatabaseStatistics.DBStatisticsInfoScreen.tableOverviewRows.entry.entry2.ParameterActualValue;
import pcftest.DatabaseStatistics.DBStatisticsInfoScreen.tableOverviewRows.entry.entry2.ParameterConfiguredDivider;
import pcftest.DatabaseStatistics.DBStatisticsInfoScreen.tableOverviewRows.entry.entry2.ParameterConfiguredLabel;
import pcftest.DatabaseStatistics.DBStatisticsInfoScreen.tableOverviewRows.entry.entry2.ParameterConfiguredValue;
import pcftest.DatabaseStatistics.DBStatisticsInfoScreen.tableOverviewRows.entry.entry2.ParameterDatamodelDivider;
import pcftest.DatabaseStatistics.DBStatisticsInfoScreen.tableOverviewRows.entry.entry2.ParameterDatamodelLabel;
import pcftest.DatabaseStatistics.DBStatisticsInfoScreen.tableOverviewRows.entry.entry2.ParameterDatamodelValue;
import pcftest.DatabaseStatistics.DatabaseStatistics_UpLink;
import pcftest.DatabaseStatistics._Paging;
import pcftest.DatabaseStatistics.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/infopages/DatabaseStatistics.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class DatabaseStatistics extends PCFLocation {
  public final static String CHECKSUM = "747c7029ae4cfaae7cf01f1da9fe7791";
  
  public DatabaseStatistics(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("DatabaseStatistics"));
  }
  
  public DBStatisticsInfoScreen getDBStatisticsInfoScreen() {
    return getOrCreateProperty("DBStatisticsInfoScreen", "DBStatisticsInfoScreen", null, pcftest.DatabaseStatistics.DBStatisticsInfoScreen.class);
  }
  
  public DatabaseStatistics_UpLink getDatabaseStatistics_UpLink() {
    return getOrCreateProperty("DatabaseStatistics_UpLink", "DatabaseStatistics_UpLink", null, pcftest.DatabaseStatistics.DatabaseStatistics_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.DatabaseStatistics._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.DatabaseStatistics.__crumb__.class);
  }
  
  public InfoPages get_parent() {
    return getOrCreateProperty("_parent", pcftest.InfoPages.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/DatabaseStatistics.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DBStatisticsInfoScreen extends PCFElement {
    public DBStatisticsInfoScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public BooleanValueElement getAnalyzeAllTables() {
      return getOrCreateProperty("AnalyzeAllTables", "AnalyzeAllTables", null, gw.smoketest.platform.web.BooleanValueElement.class);
    }
    
    public DBStatisticsRequestCV getDBStatisticsRequestCV() {
      return getOrCreateProperty("DBStatisticsRequestCV", "DBStatisticsRequestCV", null, pcftest.DBStatisticsRequestCV.class);
    }
    
    public DevModeOnlyButton getDevModeOnlyButton() {
      return getOrCreateProperty("DevModeOnlyButton", "DevModeOnlyButton", null, pcftest.DatabaseStatistics.DBStatisticsInfoScreen.DevModeOnlyButton.class);
    }
    
    public DownloadButton getDownloadButton() {
      return getOrCreateProperty("DownloadButton", "DownloadButton", null, pcftest.DatabaseStatistics.DBStatisticsInfoScreen.DownloadButton.class);
    }
    
    public DownloadStats getDownloadStats() {
      return getOrCreateProperty("DownloadStats", "DownloadStats", null, pcftest.DatabaseStatistics.DBStatisticsInfoScreen.DownloadStats.class);
    }
    
    public ExecutionHistoryTab getExecutionHistoryTab() {
      return getOrCreateProperty("ExecutionHistoryTab", "ExecutionHistoryTab", null, pcftest.DatabaseStatistics.DBStatisticsInfoScreen.ExecutionHistoryTab.class);
    }
    
    public OracleStatsPreferencesTab getOracleStatsPreferencesTab() {
      return getOrCreateProperty("OracleStatsPreferencesTab", "OracleStatsPreferencesTab", null, pcftest.DatabaseStatistics.DBStatisticsInfoScreen.OracleStatsPreferencesTab.class);
    }
    
    public ValueElement getOtherParametersHeader() {
      return getOrCreateProperty("OtherParametersHeader", "OtherParametersHeader", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ReapplyButton getReapplyButton() {
      return getOrCreateProperty("ReapplyButton", "ReapplyButton", null, pcftest.DatabaseStatistics.DBStatisticsInfoScreen.ReapplyButton.class);
    }
    
    public pcftest.DatabaseStatistics.DBStatisticsInfoScreen.RefreshButton getRefreshButton() {
      return getOrCreateProperty("RefreshButton", "RefreshButton", null, pcftest.DatabaseStatistics.DBStatisticsInfoScreen.RefreshButton.class);
    }
    
    public BooleanValueElement getShowPreviousStats() {
      return getOrCreateProperty("ShowPreviousStats", "ShowPreviousStats", null, gw.smoketest.platform.web.BooleanValueElement.class);
    }
    
    public DateElement getShowPreviousStatsTime() {
      return getOrCreateProperty("ShowPreviousStatsTime", "ShowPreviousStatsTime", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public StatisticsInfoTab getStatisticsInfoTab() {
      return getOrCreateProperty("StatisticsInfoTab", "StatisticsInfoTab", null, pcftest.DatabaseStatistics.DBStatisticsInfoScreen.StatisticsInfoTab.class);
    }
    
    public ValueElement getTableNameHeader() {
      return getOrCreateProperty("TableNameHeader", "TableNameHeader", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ToolbarButton getToolbarButton() {
      return getOrCreateProperty("ToolbarButton", "ToolbarButton", null, pcftest.DatabaseStatistics.DBStatisticsInfoScreen.ToolbarButton.class);
    }
    
    public UpdateStatsLV getUpdateStatsLV() {
      return getOrCreateProperty("UpdateStatsLV", "UpdateStatsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.UpdateStatsLV.class);
    }
    
    public UpdateStatsLV_tb getUpdateStatsLV_tb() {
      return getOrCreateProperty("UpdateStatsLV_tb", "UpdateStatsLV_tb", null, pcftest.DatabaseStatistics.DBStatisticsInfoScreen.UpdateStatsLV_tb.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntries<pcftest.DatabaseStatistics.DBStatisticsInfoScreen.entry> get_Entries() {
      return getOrCreateEntries(null, pcftest.DatabaseStatistics.DBStatisticsInfoScreen.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
    }
    
    public pcftest.DatabaseStatistics.DBStatisticsInfoScreen._Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.DatabaseStatistics.DBStatisticsInfoScreen._Select.class);
    }
    
    public pcftest.DatabaseStatistics.DBStatisticsInfoScreen._ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.DatabaseStatistics.DBStatisticsInfoScreen._ViewDetail.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.DatabaseStatistics.DBStatisticsInfoScreen._msgs.class);
    }
    
    public tableOverviewRows gettableOverviewRows() {
      return getOrCreateProperty("tableOverviewRows", "tableOverviewRows", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIterator, pcftest.DatabaseStatistics.DBStatisticsInfoScreen.tableOverviewRows.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/DatabaseStatistics.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class DevModeOnlyButton extends ClickableActionElement {
      public DevModeOnlyButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public DeleteMenu getDeleteMenu() {
        return getOrCreateProperty("DeleteMenu", "DeleteMenu", null, pcftest.DatabaseStatistics.DBStatisticsInfoScreen.DevModeOnlyButton.DeleteMenu.class);
      }
      
      public GatherFullMenu getGatherFullMenu() {
        return getOrCreateProperty("GatherFullMenu", "GatherFullMenu", null, pcftest.DatabaseStatistics.DBStatisticsInfoScreen.DevModeOnlyButton.GatherFullMenu.class);
      }
      
      public GatherIncrementalMenu getGatherIncrementalMenu() {
        return getOrCreateProperty("GatherIncrementalMenu", "GatherIncrementalMenu", null, pcftest.DatabaseStatistics.DBStatisticsInfoScreen.DevModeOnlyButton.GatherIncrementalMenu.class);
      }
      
      public ViewMenu getViewMenu() {
        return getOrCreateProperty("ViewMenu", "ViewMenu", null, pcftest.DatabaseStatistics.DBStatisticsInfoScreen.DevModeOnlyButton.ViewMenu.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/DatabaseStatistics.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class DeleteMenu extends ClickableActionElement {
        public DeleteMenu(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/DatabaseStatistics.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class GatherFullMenu extends ClickableActionElement {
        public GatherFullMenu(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/DatabaseStatistics.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class GatherIncrementalMenu extends ClickableActionElement {
        public GatherIncrementalMenu(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/DatabaseStatistics.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ViewMenu extends ClickableActionElement {
        public ViewMenu(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public ReportView click() {
          return clickThis(pcftest.ReportView.class);
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/DatabaseStatistics.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class DownloadButton extends ClickableActionElement {
      public DownloadButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/DatabaseStatistics.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class DownloadStats extends ValueElement {
      public DownloadStats(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/DatabaseStatistics.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ExecutionHistoryTab extends ClickableActionElement {
      public ExecutionHistoryTab(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/DatabaseStatistics.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class OracleStatsPreferencesTab extends ClickableActionElement {
      public OracleStatsPreferencesTab(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/DatabaseStatistics.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ReapplyButton extends ClickableActionElement {
      public ReapplyButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/DatabaseStatistics.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class RefreshButton extends ClickableActionElement {
      public RefreshButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/DatabaseStatistics.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class StatisticsInfoTab extends ClickableActionElement {
      public StatisticsInfoTab(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/DatabaseStatistics.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ToolbarButton extends ClickableActionElement {
      public ToolbarButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OracleStatisticsPreferencesConfigPopup click() {
        return clickThis(pcftest.OracleStatisticsPreferencesConfigPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/DatabaseStatistics.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class UpdateStatsLV_tb extends PCFElement {
      public UpdateStatsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public LVUpdateStatsDelete getLVUpdateStatsDelete() {
        return getOrCreateProperty("LVUpdateStatsDelete", "LVUpdateStatsDelete", null, pcftest.DatabaseStatistics.DBStatisticsInfoScreen.UpdateStatsLV_tb.LVUpdateStatsDelete.class);
      }
      
      public pcftest.DatabaseStatistics.DBStatisticsInfoScreen.UpdateStatsLV_tb.RefreshButton getRefreshButton() {
        return getOrCreateProperty("RefreshButton", "RefreshButton", null, pcftest.DatabaseStatistics.DBStatisticsInfoScreen.UpdateStatsLV_tb.RefreshButton.class);
      }
      
      public RunFullButton getRunFullButton() {
        return getOrCreateProperty("RunFullButton", "RunFullButton", null, pcftest.DatabaseStatistics.DBStatisticsInfoScreen.UpdateStatsLV_tb.RunFullButton.class);
      }
      
      public RunIncrementalButton getRunIncrementalButton() {
        return getOrCreateProperty("RunIncrementalButton", "RunIncrementalButton", null, pcftest.DatabaseStatistics.DBStatisticsInfoScreen.UpdateStatsLV_tb.RunIncrementalButton.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/DatabaseStatistics.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class LVUpdateStatsDelete extends ClickableActionElement {
        public LVUpdateStatsDelete(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/DatabaseStatistics.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class RefreshButton extends ClickableActionElement {
        public RefreshButton(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/DatabaseStatistics.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class RunFullButton extends ClickableActionElement {
        public RunFullButton(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/DatabaseStatistics.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class RunIncrementalButton extends ClickableActionElement {
        public RunIncrementalButton(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/DatabaseStatistics.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/DatabaseStatistics.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ViewDetail extends BooleanValueElement {
      public _ViewDetail(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/DatabaseStatistics.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _msgs extends MessagesElement {
      public _msgs(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/DatabaseStatistics.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends PCFElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ValueElement getparameterNameLabel() {
        return getOrCreateProperty("parameterNameLabel", "parameterNameLabel", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/DatabaseStatistics.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class tableOverviewRows extends PCFElement {
      public tableOverviewRows(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public SelectElement getTableFilter() {
        return getOrCreateProperty("TableFilter", "TableFilter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewToolbarFilter, gw.smoketest.platform.web.SelectElement.class);
      }
      
      @SuppressWarnings(value = "unchecked")
      public IteratorEntriesWithPaging<pcftest.DatabaseStatistics.DBStatisticsInfoScreen.tableOverviewRows.entry> get_Entries() {
        return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.DatabaseStatistics.DBStatisticsInfoScreen.tableOverviewRows.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
      }
      
      public _ListPaging get_ListPaging() {
        return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.DatabaseStatistics.DBStatisticsInfoScreen.tableOverviewRows._ListPaging.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/DatabaseStatistics.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _ListPaging extends PagingElement {
        public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/DatabaseStatistics.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class entry extends RowElement {
        public entry(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public ValueElement getNameColumn() {
          return getOrCreateProperty("NameColumn", "NameColumn", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getOtherParameters() {
          return getOrCreateProperty("OtherParameters", "OtherParameters", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public IteratorEntryCheckboxElement get_Checkbox() {
          return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
        }
        
        @SuppressWarnings(value = "unchecked")
        public IteratorEntries<entry2> get_Entries() {
          return getOrCreateEntries(null, pcftest.DatabaseStatistics.DBStatisticsInfoScreen.tableOverviewRows.entry.entry2.class, gw.smoketest.platform.web.IteratorEntries.class);
        }
        
        public pcftest.DatabaseStatistics.DBStatisticsInfoScreen.tableOverviewRows.entry._Select get_Select() {
          return getOrCreateProperty("_Select", "_Select", null, pcftest.DatabaseStatistics.DBStatisticsInfoScreen.tableOverviewRows.entry._Select.class);
        }
        
        public pcftest.DatabaseStatistics.DBStatisticsInfoScreen.tableOverviewRows.entry._ViewDetail get_ViewDetail() {
          return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.DatabaseStatistics.DBStatisticsInfoScreen.tableOverviewRows.entry._ViewDetail.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/infopages/DatabaseStatistics.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class _Select extends SelectorCellElement {
          public _Select(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/infopages/DatabaseStatistics.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class _ViewDetail extends BooleanValueElement {
          public _ViewDetail(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/infopages/DatabaseStatistics.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class entry2 extends PCFElement {
          public entry2(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public ParameterActualDivider getParameterActualDivider() {
            return getOrCreateProperty("ParameterActualDivider", "ParameterActualDivider", null, pcftest.DatabaseStatistics.DBStatisticsInfoScreen.tableOverviewRows.entry.entry2.ParameterActualDivider.class);
          }
          
          public ParameterActualLabel getParameterActualLabel() {
            return getOrCreateProperty("ParameterActualLabel", "ParameterActualLabel", null, pcftest.DatabaseStatistics.DBStatisticsInfoScreen.tableOverviewRows.entry.entry2.ParameterActualLabel.class);
          }
          
          public ParameterActualValue getParameterActualValue() {
            return getOrCreateProperty("ParameterActualValue", "ParameterActualValue", null, pcftest.DatabaseStatistics.DBStatisticsInfoScreen.tableOverviewRows.entry.entry2.ParameterActualValue.class);
          }
          
          public ParameterConfiguredDivider getParameterConfiguredDivider() {
            return getOrCreateProperty("ParameterConfiguredDivider", "ParameterConfiguredDivider", null, pcftest.DatabaseStatistics.DBStatisticsInfoScreen.tableOverviewRows.entry.entry2.ParameterConfiguredDivider.class);
          }
          
          public ParameterConfiguredLabel getParameterConfiguredLabel() {
            return getOrCreateProperty("ParameterConfiguredLabel", "ParameterConfiguredLabel", null, pcftest.DatabaseStatistics.DBStatisticsInfoScreen.tableOverviewRows.entry.entry2.ParameterConfiguredLabel.class);
          }
          
          public ParameterConfiguredValue getParameterConfiguredValue() {
            return getOrCreateProperty("ParameterConfiguredValue", "ParameterConfiguredValue", null, pcftest.DatabaseStatistics.DBStatisticsInfoScreen.tableOverviewRows.entry.entry2.ParameterConfiguredValue.class);
          }
          
          public ParameterDatamodelDivider getParameterDatamodelDivider() {
            return getOrCreateProperty("ParameterDatamodelDivider", "ParameterDatamodelDivider", null, pcftest.DatabaseStatistics.DBStatisticsInfoScreen.tableOverviewRows.entry.entry2.ParameterDatamodelDivider.class);
          }
          
          public ParameterDatamodelLabel getParameterDatamodelLabel() {
            return getOrCreateProperty("ParameterDatamodelLabel", "ParameterDatamodelLabel", null, pcftest.DatabaseStatistics.DBStatisticsInfoScreen.tableOverviewRows.entry.entry2.ParameterDatamodelLabel.class);
          }
          
          public ParameterDatamodelValue getParameterDatamodelValue() {
            return getOrCreateProperty("ParameterDatamodelValue", "ParameterDatamodelValue", null, pcftest.DatabaseStatistics.DBStatisticsInfoScreen.tableOverviewRows.entry.entry2.ParameterDatamodelValue.class);
          }
          
          @SimplePropertyProcessing
          @Generated(comments = "config/web/pcf/tools/infopages/DatabaseStatistics.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
          public static class ParameterActualDivider extends ClickableActionElement {
            public ParameterActualDivider(ISmokeTest helper, PCFElementId componentId)  {
              super(helper, componentId);
            }
            
            
          }
          
          @SimplePropertyProcessing
          @Generated(comments = "config/web/pcf/tools/infopages/DatabaseStatistics.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
          public static class ParameterActualLabel extends ClickableActionElement {
            public ParameterActualLabel(ISmokeTest helper, PCFElementId componentId)  {
              super(helper, componentId);
            }
            
            
          }
          
          @SimplePropertyProcessing
          @Generated(comments = "config/web/pcf/tools/infopages/DatabaseStatistics.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
          public static class ParameterActualValue extends ClickableActionElement {
            public ParameterActualValue(ISmokeTest helper, PCFElementId componentId)  {
              super(helper, componentId);
            }
            
            
          }
          
          @SimplePropertyProcessing
          @Generated(comments = "config/web/pcf/tools/infopages/DatabaseStatistics.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
          public static class ParameterConfiguredDivider extends ClickableActionElement {
            public ParameterConfiguredDivider(ISmokeTest helper, PCFElementId componentId)  {
              super(helper, componentId);
            }
            
            
          }
          
          @SimplePropertyProcessing
          @Generated(comments = "config/web/pcf/tools/infopages/DatabaseStatistics.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
          public static class ParameterConfiguredLabel extends ClickableActionElement {
            public ParameterConfiguredLabel(ISmokeTest helper, PCFElementId componentId)  {
              super(helper, componentId);
            }
            
            
          }
          
          @SimplePropertyProcessing
          @Generated(comments = "config/web/pcf/tools/infopages/DatabaseStatistics.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
          public static class ParameterConfiguredValue extends ClickableActionElement {
            public ParameterConfiguredValue(ISmokeTest helper, PCFElementId componentId)  {
              super(helper, componentId);
            }
            
            
          }
          
          @SimplePropertyProcessing
          @Generated(comments = "config/web/pcf/tools/infopages/DatabaseStatistics.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
          public static class ParameterDatamodelDivider extends ClickableActionElement {
            public ParameterDatamodelDivider(ISmokeTest helper, PCFElementId componentId)  {
              super(helper, componentId);
            }
            
            
          }
          
          @SimplePropertyProcessing
          @Generated(comments = "config/web/pcf/tools/infopages/DatabaseStatistics.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
          public static class ParameterDatamodelLabel extends ClickableActionElement {
            public ParameterDatamodelLabel(ISmokeTest helper, PCFElementId componentId)  {
              super(helper, componentId);
            }
            
            
          }
          
          @SimplePropertyProcessing
          @Generated(comments = "config/web/pcf/tools/infopages/DatabaseStatistics.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
          public static class ParameterDatamodelValue extends ClickableActionElement {
            public ParameterDatamodelValue(ISmokeTest helper, PCFElementId componentId)  {
              super(helper, componentId);
            }
            
            
          }
          
          
        }
        
        
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/DatabaseStatistics.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DatabaseStatistics_UpLink extends ClickableActionElement {
    public DatabaseStatistics_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/DatabaseStatistics.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/DatabaseStatistics.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}