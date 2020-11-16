package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ServerTools.MenuLinks;
import pcftest.ServerTools.MenuLinks.ServerTools_BatchProcessInfo;
import pcftest.ServerTools.MenuLinks.ServerTools_CentipedeCacheInfoLG;
import pcftest.ServerTools.MenuLinks.ServerTools_CentipedeCacheInfoLG.CentipedeCacheInfoLG_CentipedeCacheInfo;
import pcftest.ServerTools.MenuLinks.ServerTools_CentipedeCacheInfoLG.CentipedeCacheInfoLG_CentipedeCacheInfoDetails;
import pcftest.ServerTools.MenuLinks.ServerTools_CentipedeCacheInfoLG.CentipedeCacheInfoLG_CentipedeCacheInfoHistory;
import pcftest.ServerTools.MenuLinks.ServerTools_ClusterPages;
import pcftest.ServerTools.MenuLinks.ServerTools_ClusterPages.ClusterPages_ClusterComponents;
import pcftest.ServerTools.MenuLinks.ServerTools_ClusterPages.ClusterPages_ClusterMembers;
import pcftest.ServerTools.MenuLinks.ServerTools_InfoPages;
import pcftest.ServerTools.MenuLinks.ServerTools_InfoPages.InfoPages_ArchiveGraphInfo;
import pcftest.ServerTools.MenuLinks.ServerTools_InfoPages.InfoPages_ArchiveInfo;
import pcftest.ServerTools.MenuLinks.ServerTools_InfoPages.InfoPages_ConfigurationInfo;
import pcftest.ServerTools.MenuLinks.ServerTools_InfoPages.InfoPages_ConsistencyChecks;
import pcftest.ServerTools.MenuLinks.ServerTools_InfoPages.InfoPages_DataDistributionInfo;
import pcftest.ServerTools.MenuLinks.ServerTools_InfoPages.InfoPages_DatabaseParameters;
import pcftest.ServerTools.MenuLinks.ServerTools_InfoPages.InfoPages_DatabaseStatistics;
import pcftest.ServerTools.MenuLinks.ServerTools_InfoPages.InfoPages_DatabaseStorage;
import pcftest.ServerTools.MenuLinks.ServerTools_InfoPages.InfoPages_DatabaseTableInfo;
import pcftest.ServerTools.MenuLinks.ServerTools_InfoPages.InfoPages_LoadErrorsInfo;
import pcftest.ServerTools.MenuLinks.ServerTools_InfoPages.InfoPages_LoadHistoryInfo;
import pcftest.ServerTools.MenuLinks.ServerTools_InfoPages.InfoPages_LoadIntegrityChecks;
import pcftest.ServerTools.MenuLinks.ServerTools_InfoPages.InfoPages_LoadedGosuClasses;
import pcftest.ServerTools.MenuLinks.ServerTools_InfoPages.InfoPages_MicrosoftDMVInfo;
import pcftest.ServerTools.MenuLinks.ServerTools_InfoPages.InfoPages_MicrosoftDriverLogging;
import pcftest.ServerTools.MenuLinks.ServerTools_InfoPages.InfoPages_OracleAWRInfo;
import pcftest.ServerTools.MenuLinks.ServerTools_InfoPages.InfoPages_OracleAWRUnusedIndexesInfo;
import pcftest.ServerTools.MenuLinks.ServerTools_InfoPages.InfoPages_OracleOutlineInfo;
import pcftest.ServerTools.MenuLinks.ServerTools_InfoPages.InfoPages_OracleStatspackInfo;
import pcftest.ServerTools.MenuLinks.ServerTools_InfoPages.InfoPages_PostgreSQLPerfInfo;
import pcftest.ServerTools.MenuLinks.ServerTools_InfoPages.InfoPages_RuntimeEnvironmentInfo;
import pcftest.ServerTools.MenuLinks.ServerTools_InfoPages.InfoPages_SafePersistingOrderInfo;
import pcftest.ServerTools.MenuLinks.ServerTools_InfoPages.InfoPages_SerializationInfo;
import pcftest.ServerTools.MenuLinks.ServerTools_IntentionalLogging;
import pcftest.ServerTools.MenuLinks.ServerTools_JProfiler;
import pcftest.ServerTools.MenuLinks.ServerTools_MBeans;
import pcftest.ServerTools.MenuLinks.ServerTools_MetroFlows;
import pcftest.ServerTools.MenuLinks.ServerTools_Profiler;
import pcftest.ServerTools.MenuLinks.ServerTools_Profiler.Profiler_ProfilerAnalysisLG;
import pcftest.ServerTools.MenuLinks.ServerTools_Profiler.Profiler_ProfilerAnalysisLG.ProfilerAnalysisLG_ProfilerAnalysisPage;
import pcftest.ServerTools.MenuLinks.ServerTools_Profiler.Profiler_ProfilerAnalysisLG.ProfilerAnalysisLG_ProfilerAnalysisPage10;
import pcftest.ServerTools.MenuLinks.ServerTools_Profiler.Profiler_ProfilerAnalysisLG.ProfilerAnalysisLG_ProfilerAnalysisPage11;
import pcftest.ServerTools.MenuLinks.ServerTools_Profiler.Profiler_ProfilerAnalysisLG.ProfilerAnalysisLG_ProfilerAnalysisPage2;
import pcftest.ServerTools.MenuLinks.ServerTools_Profiler.Profiler_ProfilerAnalysisLG.ProfilerAnalysisLG_ProfilerAnalysisPage3;
import pcftest.ServerTools.MenuLinks.ServerTools_Profiler.Profiler_ProfilerAnalysisLG.ProfilerAnalysisLG_ProfilerAnalysisPage4;
import pcftest.ServerTools.MenuLinks.ServerTools_Profiler.Profiler_ProfilerAnalysisLG.ProfilerAnalysisLG_ProfilerAnalysisPage5;
import pcftest.ServerTools.MenuLinks.ServerTools_Profiler.Profiler_ProfilerAnalysisLG.ProfilerAnalysisLG_ProfilerAnalysisPage6;
import pcftest.ServerTools.MenuLinks.ServerTools_Profiler.Profiler_ProfilerAnalysisLG.ProfilerAnalysisLG_ProfilerAnalysisPage7;
import pcftest.ServerTools.MenuLinks.ServerTools_Profiler.Profiler_ProfilerAnalysisLG.ProfilerAnalysisLG_ProfilerAnalysisPage8;
import pcftest.ServerTools.MenuLinks.ServerTools_Profiler.Profiler_ProfilerAnalysisLG.ProfilerAnalysisLG_ProfilerAnalysisPage9;
import pcftest.ServerTools.MenuLinks.ServerTools_Profiler.Profiler_ProfilerConfigurationPage;
import pcftest.ServerTools.MenuLinks.ServerTools_SetLogLevel;
import pcftest.ServerTools.MenuLinks.ServerTools_StartablePlugin;
import pcftest.ServerTools.MenuLinks.ServerTools_UpgradeInfo;
import pcftest.ServerTools.MenuLinks.ServerTools_ViewLogs;
import pcftest.ServerTools.MenuLinks.ServerTools_WorkQueueInfo;
import pcftest.ServerTools.ServerTools_UpLink;
import pcftest.ServerTools._Paging;
import pcftest.ServerTools.__crumb__;
import pcftest.ServerTools._msgs;
import pcftest.ServerTools.actWizard;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/ServerTools.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ServerTools extends PCFLocation {
  public final static String CHECKSUM = "c012c2e23d3a0101f253f2d52f5c2be5";
  
  public ServerTools(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ServerTools"));
  }
  
  public BatchProcessInfo getBatchProcessInfo() {
    return getOrCreateProperty("BatchProcessInfo", pcftest.BatchProcessInfo.class);
  }
  
  public CentipedeCacheInfoLG getCentipedeCacheInfoLG() {
    return getOrCreateProperty("CentipedeCacheInfoLG", pcftest.CentipedeCacheInfoLG.class);
  }
  
  public ClusterPages getClusterPages() {
    return getOrCreateProperty("ClusterPages", pcftest.ClusterPages.class);
  }
  
  public InfoPages getInfoPages() {
    return getOrCreateProperty("InfoPages", pcftest.InfoPages.class);
  }
  
  public IntentionalLogging getIntentionalLogging() {
    return getOrCreateProperty("IntentionalLogging", pcftest.IntentionalLogging.class);
  }
  
  public InternalToolsMenuActions getInternalToolsMenuActions() {
    return getOrCreateProperty("InternalToolsMenuActions", "InternalToolsMenuActions", null, pcftest.InternalToolsMenuActions.class);
  }
  
  public InternalToolsTabBar getInternalToolsTabBar() {
    return getOrCreateProperty("InternalToolsTabBar", pcftest.InternalToolsTabBar.class);
  }
  
  public JProfiler getJProfiler() {
    return getOrCreateProperty("JProfiler", pcftest.JProfiler.class);
  }
  
  public MBeans getMBeans() {
    return getOrCreateProperty("MBeans", pcftest.MBeans.class);
  }
  
  public MenuLinks getMenuLinks() {
    return getOrCreateMenuLinksProperty("MenuLinks", "MenuLinks", null, pcftest.ServerTools.MenuLinks.class, null);
  }
  
  public MetroFlows getMetroFlows() {
    return getOrCreateProperty("MetroFlows", pcftest.MetroFlows.class);
  }
  
  public Profiler getProfiler() {
    return getOrCreateProperty("Profiler", pcftest.Profiler.class);
  }
  
  public ServerTools_UpLink getServerTools_UpLink() {
    return getOrCreateProperty("ServerTools_UpLink", "ServerTools_UpLink", null, pcftest.ServerTools.ServerTools_UpLink.class);
  }
  
  public SetLogLevel getSetLogLevel() {
    return getOrCreateProperty("SetLogLevel", pcftest.SetLogLevel.class);
  }
  
  public StartablePlugin getStartablePlugin() {
    return getOrCreateProperty("StartablePlugin", pcftest.StartablePlugin.class);
  }
  
  public UpgradeInfo getUpgradeInfo() {
    return getOrCreateProperty("UpgradeInfo", pcftest.UpgradeInfo.class);
  }
  
  public ViewLogs getViewLogs() {
    return getOrCreateProperty("ViewLogs", pcftest.ViewLogs.class);
  }
  
  public WorkQueueInfo getWorkQueueInfo() {
    return getOrCreateProperty("WorkQueueInfo", pcftest.WorkQueueInfo.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ServerTools._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ServerTools.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ServerTools._msgs.class);
  }
  
  public actWizard getactWizard() {
    return getOrCreateProperty("actWizard", "actWizard", null, pcftest.ServerTools.actWizard.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/ServerTools.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MenuLinks extends PCFElement {
    public MenuLinks(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ServerTools_BatchProcessInfo getServerTools_BatchProcessInfo() {
      return getOrCreateProperty("ServerTools_BatchProcessInfo", "ServerTools_BatchProcessInfo", null, pcftest.ServerTools.MenuLinks.ServerTools_BatchProcessInfo.class);
    }
    
    public ServerTools_CentipedeCacheInfoLG getServerTools_CentipedeCacheInfoLG() {
      return getOrCreateProperty("ServerTools_CentipedeCacheInfoLG", "ServerTools_CentipedeCacheInfoLG", null, pcftest.ServerTools.MenuLinks.ServerTools_CentipedeCacheInfoLG.class);
    }
    
    public ServerTools_ClusterPages getServerTools_ClusterPages() {
      return getOrCreateProperty("ServerTools_ClusterPages", "ServerTools_ClusterPages", null, pcftest.ServerTools.MenuLinks.ServerTools_ClusterPages.class);
    }
    
    public ServerTools_InfoPages getServerTools_InfoPages() {
      return getOrCreateProperty("ServerTools_InfoPages", "ServerTools_InfoPages", null, pcftest.ServerTools.MenuLinks.ServerTools_InfoPages.class);
    }
    
    public ServerTools_IntentionalLogging getServerTools_IntentionalLogging() {
      return getOrCreateProperty("ServerTools_IntentionalLogging", "ServerTools_IntentionalLogging", null, pcftest.ServerTools.MenuLinks.ServerTools_IntentionalLogging.class);
    }
    
    public ServerTools_JProfiler getServerTools_JProfiler() {
      return getOrCreateProperty("ServerTools_JProfiler", "ServerTools_JProfiler", null, pcftest.ServerTools.MenuLinks.ServerTools_JProfiler.class);
    }
    
    public ServerTools_MBeans getServerTools_MBeans() {
      return getOrCreateProperty("ServerTools_MBeans", "ServerTools_MBeans", null, pcftest.ServerTools.MenuLinks.ServerTools_MBeans.class);
    }
    
    public ServerTools_MetroFlows getServerTools_MetroFlows() {
      return getOrCreateProperty("ServerTools_MetroFlows", "ServerTools_MetroFlows", null, pcftest.ServerTools.MenuLinks.ServerTools_MetroFlows.class);
    }
    
    public ServerTools_Profiler getServerTools_Profiler() {
      return getOrCreateProperty("ServerTools_Profiler", "ServerTools_Profiler", null, pcftest.ServerTools.MenuLinks.ServerTools_Profiler.class);
    }
    
    public ServerTools_SetLogLevel getServerTools_SetLogLevel() {
      return getOrCreateProperty("ServerTools_SetLogLevel", "ServerTools_SetLogLevel", null, pcftest.ServerTools.MenuLinks.ServerTools_SetLogLevel.class);
    }
    
    public ServerTools_StartablePlugin getServerTools_StartablePlugin() {
      return getOrCreateProperty("ServerTools_StartablePlugin", "ServerTools_StartablePlugin", null, pcftest.ServerTools.MenuLinks.ServerTools_StartablePlugin.class);
    }
    
    public ServerTools_UpgradeInfo getServerTools_UpgradeInfo() {
      return getOrCreateProperty("ServerTools_UpgradeInfo", "ServerTools_UpgradeInfo", null, pcftest.ServerTools.MenuLinks.ServerTools_UpgradeInfo.class);
    }
    
    public ServerTools_ViewLogs getServerTools_ViewLogs() {
      return getOrCreateProperty("ServerTools_ViewLogs", "ServerTools_ViewLogs", null, pcftest.ServerTools.MenuLinks.ServerTools_ViewLogs.class);
    }
    
    public ServerTools_WorkQueueInfo getServerTools_WorkQueueInfo() {
      return getOrCreateProperty("ServerTools_WorkQueueInfo", "ServerTools_WorkQueueInfo", null, pcftest.ServerTools.MenuLinks.ServerTools_WorkQueueInfo.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/ServerTools.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ServerTools_BatchProcessInfo extends ClickableActionElement {
      public ServerTools_BatchProcessInfo(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public BatchProcessInfo click() {
        return clickThis(pcftest.BatchProcessInfo.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/ServerTools.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ServerTools_CentipedeCacheInfoLG extends ClickableActionElement {
      public ServerTools_CentipedeCacheInfoLG(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      public CentipedeCacheInfoLG_CentipedeCacheInfo getCentipedeCacheInfoLG_CentipedeCacheInfo() {
        return getOrCreateProperty("CentipedeCacheInfoLG_CentipedeCacheInfo", "CentipedeCacheInfoLG_CentipedeCacheInfo", null, pcftest.ServerTools.MenuLinks.ServerTools_CentipedeCacheInfoLG.CentipedeCacheInfoLG_CentipedeCacheInfo.class);
      }
      
      public CentipedeCacheInfoLG_CentipedeCacheInfoDetails getCentipedeCacheInfoLG_CentipedeCacheInfoDetails() {
        return getOrCreateProperty("CentipedeCacheInfoLG_CentipedeCacheInfoDetails", "CentipedeCacheInfoLG_CentipedeCacheInfoDetails", null, pcftest.ServerTools.MenuLinks.ServerTools_CentipedeCacheInfoLG.CentipedeCacheInfoLG_CentipedeCacheInfoDetails.class);
      }
      
      public CentipedeCacheInfoLG_CentipedeCacheInfoHistory getCentipedeCacheInfoLG_CentipedeCacheInfoHistory() {
        return getOrCreateProperty("CentipedeCacheInfoLG_CentipedeCacheInfoHistory", "CentipedeCacheInfoLG_CentipedeCacheInfoHistory", null, pcftest.ServerTools.MenuLinks.ServerTools_CentipedeCacheInfoLG.CentipedeCacheInfoLG_CentipedeCacheInfoHistory.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/CentipedeCacheInfoLG.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class CentipedeCacheInfoLG_CentipedeCacheInfo extends ClickableActionElement {
        public CentipedeCacheInfoLG_CentipedeCacheInfo(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public CentipedeCacheInfo click() {
          return clickThis(pcftest.CentipedeCacheInfo.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/CentipedeCacheInfoLG.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class CentipedeCacheInfoLG_CentipedeCacheInfoDetails extends ClickableActionElement {
        public CentipedeCacheInfoLG_CentipedeCacheInfoDetails(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public CentipedeCacheInfoDetails click() {
          return clickThis(pcftest.CentipedeCacheInfoDetails.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/CentipedeCacheInfoLG.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class CentipedeCacheInfoLG_CentipedeCacheInfoHistory extends ClickableActionElement {
        public CentipedeCacheInfoLG_CentipedeCacheInfoHistory(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public CentipedeCacheInfoHistory click() {
          return clickThis(pcftest.CentipedeCacheInfoHistory.class);
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/ServerTools.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ServerTools_ClusterPages extends ClickableActionElement {
      public ServerTools_ClusterPages(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      public ClusterPages_ClusterComponents getClusterPages_ClusterComponents() {
        return getOrCreateProperty("ClusterPages_ClusterComponents", "ClusterPages_ClusterComponents", null, pcftest.ServerTools.MenuLinks.ServerTools_ClusterPages.ClusterPages_ClusterComponents.class);
      }
      
      public ClusterPages_ClusterMembers getClusterPages_ClusterMembers() {
        return getOrCreateProperty("ClusterPages_ClusterMembers", "ClusterPages_ClusterMembers", null, pcftest.ServerTools.MenuLinks.ServerTools_ClusterPages.ClusterPages_ClusterMembers.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/cluster/ClusterPages.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ClusterPages_ClusterComponents extends ClickableActionElement {
        public ClusterPages_ClusterComponents(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public ClusterComponents click() {
          return clickThis(pcftest.ClusterComponents.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/cluster/ClusterPages.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ClusterPages_ClusterMembers extends ClickableActionElement {
        public ClusterPages_ClusterMembers(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public ClusterMembers click() {
          return clickThis(pcftest.ClusterMembers.class);
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/ServerTools.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ServerTools_InfoPages extends ClickableActionElement {
      public ServerTools_InfoPages(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      public InfoPages_ArchiveGraphInfo getInfoPages_ArchiveGraphInfo() {
        return getOrCreateProperty("InfoPages_ArchiveGraphInfo", "InfoPages_ArchiveGraphInfo", null, pcftest.ServerTools.MenuLinks.ServerTools_InfoPages.InfoPages_ArchiveGraphInfo.class);
      }
      
      public InfoPages_ArchiveInfo getInfoPages_ArchiveInfo() {
        return getOrCreateProperty("InfoPages_ArchiveInfo", "InfoPages_ArchiveInfo", null, pcftest.ServerTools.MenuLinks.ServerTools_InfoPages.InfoPages_ArchiveInfo.class);
      }
      
      public InfoPages_ConfigurationInfo getInfoPages_ConfigurationInfo() {
        return getOrCreateProperty("InfoPages_ConfigurationInfo", "InfoPages_ConfigurationInfo", null, pcftest.ServerTools.MenuLinks.ServerTools_InfoPages.InfoPages_ConfigurationInfo.class);
      }
      
      public InfoPages_ConsistencyChecks getInfoPages_ConsistencyChecks() {
        return getOrCreateProperty("InfoPages_ConsistencyChecks", "InfoPages_ConsistencyChecks", null, pcftest.ServerTools.MenuLinks.ServerTools_InfoPages.InfoPages_ConsistencyChecks.class);
      }
      
      public InfoPages_DataDistributionInfo getInfoPages_DataDistributionInfo() {
        return getOrCreateProperty("InfoPages_DataDistributionInfo", "InfoPages_DataDistributionInfo", null, pcftest.ServerTools.MenuLinks.ServerTools_InfoPages.InfoPages_DataDistributionInfo.class);
      }
      
      public InfoPages_DatabaseParameters getInfoPages_DatabaseParameters() {
        return getOrCreateProperty("InfoPages_DatabaseParameters", "InfoPages_DatabaseParameters", null, pcftest.ServerTools.MenuLinks.ServerTools_InfoPages.InfoPages_DatabaseParameters.class);
      }
      
      public InfoPages_DatabaseStatistics getInfoPages_DatabaseStatistics() {
        return getOrCreateProperty("InfoPages_DatabaseStatistics", "InfoPages_DatabaseStatistics", null, pcftest.ServerTools.MenuLinks.ServerTools_InfoPages.InfoPages_DatabaseStatistics.class);
      }
      
      public InfoPages_DatabaseStorage getInfoPages_DatabaseStorage() {
        return getOrCreateProperty("InfoPages_DatabaseStorage", "InfoPages_DatabaseStorage", null, pcftest.ServerTools.MenuLinks.ServerTools_InfoPages.InfoPages_DatabaseStorage.class);
      }
      
      public InfoPages_DatabaseTableInfo getInfoPages_DatabaseTableInfo() {
        return getOrCreateProperty("InfoPages_DatabaseTableInfo", "InfoPages_DatabaseTableInfo", null, pcftest.ServerTools.MenuLinks.ServerTools_InfoPages.InfoPages_DatabaseTableInfo.class);
      }
      
      public InfoPages_LoadErrorsInfo getInfoPages_LoadErrorsInfo() {
        return getOrCreateProperty("InfoPages_LoadErrorsInfo", "InfoPages_LoadErrorsInfo", null, pcftest.ServerTools.MenuLinks.ServerTools_InfoPages.InfoPages_LoadErrorsInfo.class);
      }
      
      public InfoPages_LoadHistoryInfo getInfoPages_LoadHistoryInfo() {
        return getOrCreateProperty("InfoPages_LoadHistoryInfo", "InfoPages_LoadHistoryInfo", null, pcftest.ServerTools.MenuLinks.ServerTools_InfoPages.InfoPages_LoadHistoryInfo.class);
      }
      
      public InfoPages_LoadIntegrityChecks getInfoPages_LoadIntegrityChecks() {
        return getOrCreateProperty("InfoPages_LoadIntegrityChecks", "InfoPages_LoadIntegrityChecks", null, pcftest.ServerTools.MenuLinks.ServerTools_InfoPages.InfoPages_LoadIntegrityChecks.class);
      }
      
      public InfoPages_LoadedGosuClasses getInfoPages_LoadedGosuClasses() {
        return getOrCreateProperty("InfoPages_LoadedGosuClasses", "InfoPages_LoadedGosuClasses", null, pcftest.ServerTools.MenuLinks.ServerTools_InfoPages.InfoPages_LoadedGosuClasses.class);
      }
      
      public InfoPages_MicrosoftDMVInfo getInfoPages_MicrosoftDMVInfo() {
        return getOrCreateProperty("InfoPages_MicrosoftDMVInfo", "InfoPages_MicrosoftDMVInfo", null, pcftest.ServerTools.MenuLinks.ServerTools_InfoPages.InfoPages_MicrosoftDMVInfo.class);
      }
      
      public InfoPages_MicrosoftDriverLogging getInfoPages_MicrosoftDriverLogging() {
        return getOrCreateProperty("InfoPages_MicrosoftDriverLogging", "InfoPages_MicrosoftDriverLogging", null, pcftest.ServerTools.MenuLinks.ServerTools_InfoPages.InfoPages_MicrosoftDriverLogging.class);
      }
      
      public InfoPages_OracleAWRInfo getInfoPages_OracleAWRInfo() {
        return getOrCreateProperty("InfoPages_OracleAWRInfo", "InfoPages_OracleAWRInfo", null, pcftest.ServerTools.MenuLinks.ServerTools_InfoPages.InfoPages_OracleAWRInfo.class);
      }
      
      public InfoPages_OracleAWRUnusedIndexesInfo getInfoPages_OracleAWRUnusedIndexesInfo() {
        return getOrCreateProperty("InfoPages_OracleAWRUnusedIndexesInfo", "InfoPages_OracleAWRUnusedIndexesInfo", null, pcftest.ServerTools.MenuLinks.ServerTools_InfoPages.InfoPages_OracleAWRUnusedIndexesInfo.class);
      }
      
      public InfoPages_OracleOutlineInfo getInfoPages_OracleOutlineInfo() {
        return getOrCreateProperty("InfoPages_OracleOutlineInfo", "InfoPages_OracleOutlineInfo", null, pcftest.ServerTools.MenuLinks.ServerTools_InfoPages.InfoPages_OracleOutlineInfo.class);
      }
      
      public InfoPages_OracleStatspackInfo getInfoPages_OracleStatspackInfo() {
        return getOrCreateProperty("InfoPages_OracleStatspackInfo", "InfoPages_OracleStatspackInfo", null, pcftest.ServerTools.MenuLinks.ServerTools_InfoPages.InfoPages_OracleStatspackInfo.class);
      }
      
      public InfoPages_PostgreSQLPerfInfo getInfoPages_PostgreSQLPerfInfo() {
        return getOrCreateProperty("InfoPages_PostgreSQLPerfInfo", "InfoPages_PostgreSQLPerfInfo", null, pcftest.ServerTools.MenuLinks.ServerTools_InfoPages.InfoPages_PostgreSQLPerfInfo.class);
      }
      
      public InfoPages_RuntimeEnvironmentInfo getInfoPages_RuntimeEnvironmentInfo() {
        return getOrCreateProperty("InfoPages_RuntimeEnvironmentInfo", "InfoPages_RuntimeEnvironmentInfo", null, pcftest.ServerTools.MenuLinks.ServerTools_InfoPages.InfoPages_RuntimeEnvironmentInfo.class);
      }
      
      public InfoPages_SafePersistingOrderInfo getInfoPages_SafePersistingOrderInfo() {
        return getOrCreateProperty("InfoPages_SafePersistingOrderInfo", "InfoPages_SafePersistingOrderInfo", null, pcftest.ServerTools.MenuLinks.ServerTools_InfoPages.InfoPages_SafePersistingOrderInfo.class);
      }
      
      public InfoPages_SerializationInfo getInfoPages_SerializationInfo() {
        return getOrCreateProperty("InfoPages_SerializationInfo", "InfoPages_SerializationInfo", null, pcftest.ServerTools.MenuLinks.ServerTools_InfoPages.InfoPages_SerializationInfo.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/InfoPages.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class InfoPages_ArchiveGraphInfo extends ClickableActionElement {
        public InfoPages_ArchiveGraphInfo(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public ArchiveGraphInfo click() {
          return clickThis(pcftest.ArchiveGraphInfo.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/InfoPages.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class InfoPages_ArchiveInfo extends ClickableActionElement {
        public InfoPages_ArchiveInfo(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public ArchiveInfo click() {
          return clickThis(pcftest.ArchiveInfo.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/InfoPages.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class InfoPages_ConfigurationInfo extends ClickableActionElement {
        public InfoPages_ConfigurationInfo(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public ConfigurationInfo click() {
          return clickThis(pcftest.ConfigurationInfo.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/InfoPages.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class InfoPages_ConsistencyChecks extends ClickableActionElement {
        public InfoPages_ConsistencyChecks(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public ConsistencyChecks click() {
          return clickThis(pcftest.ConsistencyChecks.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/InfoPages.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class InfoPages_DataDistributionInfo extends ClickableActionElement {
        public InfoPages_DataDistributionInfo(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public DataDistributionInfo click() {
          return clickThis(pcftest.DataDistributionInfo.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/InfoPages.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class InfoPages_DatabaseParameters extends ClickableActionElement {
        public InfoPages_DatabaseParameters(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public DatabaseParameters click() {
          return clickThis(pcftest.DatabaseParameters.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/InfoPages.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class InfoPages_DatabaseStatistics extends ClickableActionElement {
        public InfoPages_DatabaseStatistics(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public DatabaseStatistics click() {
          return clickThis(pcftest.DatabaseStatistics.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/InfoPages.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class InfoPages_DatabaseStorage extends ClickableActionElement {
        public InfoPages_DatabaseStorage(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public DatabaseStorage click() {
          return clickThis(pcftest.DatabaseStorage.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/InfoPages.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class InfoPages_DatabaseTableInfo extends ClickableActionElement {
        public InfoPages_DatabaseTableInfo(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public DatabaseTableInfo click() {
          return clickThis(pcftest.DatabaseTableInfo.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/InfoPages.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class InfoPages_LoadErrorsInfo extends ClickableActionElement {
        public InfoPages_LoadErrorsInfo(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public LoadErrorsInfo click() {
          return clickThis(pcftest.LoadErrorsInfo.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/InfoPages.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class InfoPages_LoadHistoryInfo extends ClickableActionElement {
        public InfoPages_LoadHistoryInfo(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public LoadHistoryInfo click() {
          return clickThis(pcftest.LoadHistoryInfo.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/InfoPages.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class InfoPages_LoadIntegrityChecks extends ClickableActionElement {
        public InfoPages_LoadIntegrityChecks(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public LoadIntegrityChecks click() {
          return clickThis(pcftest.LoadIntegrityChecks.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/InfoPages.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class InfoPages_LoadedGosuClasses extends ClickableActionElement {
        public InfoPages_LoadedGosuClasses(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public LoadedGosuClasses click() {
          return clickThis(pcftest.LoadedGosuClasses.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/InfoPages.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class InfoPages_MicrosoftDMVInfo extends ClickableActionElement {
        public InfoPages_MicrosoftDMVInfo(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public MicrosoftDMVInfo click() {
          return clickThis(pcftest.MicrosoftDMVInfo.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/InfoPages.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class InfoPages_MicrosoftDriverLogging extends ClickableActionElement {
        public InfoPages_MicrosoftDriverLogging(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public MicrosoftDriverLogging click() {
          return clickThis(pcftest.MicrosoftDriverLogging.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/InfoPages.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class InfoPages_OracleAWRInfo extends ClickableActionElement {
        public InfoPages_OracleAWRInfo(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public OracleAWRInfo click() {
          return clickThis(pcftest.OracleAWRInfo.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/InfoPages.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class InfoPages_OracleAWRUnusedIndexesInfo extends ClickableActionElement {
        public InfoPages_OracleAWRUnusedIndexesInfo(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public OracleAWRUnusedIndexesInfo click() {
          return clickThis(pcftest.OracleAWRUnusedIndexesInfo.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/InfoPages.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class InfoPages_OracleOutlineInfo extends ClickableActionElement {
        public InfoPages_OracleOutlineInfo(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public OracleOutlineInfo click() {
          return clickThis(pcftest.OracleOutlineInfo.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/InfoPages.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class InfoPages_OracleStatspackInfo extends ClickableActionElement {
        public InfoPages_OracleStatspackInfo(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public OracleStatspackInfo click() {
          return clickThis(pcftest.OracleStatspackInfo.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/InfoPages.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class InfoPages_PostgreSQLPerfInfo extends ClickableActionElement {
        public InfoPages_PostgreSQLPerfInfo(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PostgreSQLPerfInfo click() {
          return clickThis(pcftest.PostgreSQLPerfInfo.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/InfoPages.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class InfoPages_RuntimeEnvironmentInfo extends ClickableActionElement {
        public InfoPages_RuntimeEnvironmentInfo(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public RuntimeEnvironmentInfo click() {
          return clickThis(pcftest.RuntimeEnvironmentInfo.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/InfoPages.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class InfoPages_SafePersistingOrderInfo extends ClickableActionElement {
        public InfoPages_SafePersistingOrderInfo(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public SafePersistingOrderInfo click() {
          return clickThis(pcftest.SafePersistingOrderInfo.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/InfoPages.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class InfoPages_SerializationInfo extends ClickableActionElement {
        public InfoPages_SerializationInfo(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public SerializationInfo click() {
          return clickThis(pcftest.SerializationInfo.class);
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/ServerTools.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ServerTools_IntentionalLogging extends ClickableActionElement {
      public ServerTools_IntentionalLogging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public IntentionalLogging click() {
        return clickThis(pcftest.IntentionalLogging.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/ServerTools.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ServerTools_JProfiler extends ClickableActionElement {
      public ServerTools_JProfiler(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public JProfiler click() {
        return clickThis(pcftest.JProfiler.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/ServerTools.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ServerTools_MBeans extends ClickableActionElement {
      public ServerTools_MBeans(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public MBeans click() {
        return clickThis(pcftest.MBeans.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/ServerTools.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ServerTools_MetroFlows extends ClickableActionElement {
      public ServerTools_MetroFlows(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public MetroFlows click() {
        return clickThis(pcftest.MetroFlows.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/ServerTools.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ServerTools_Profiler extends ClickableActionElement {
      public ServerTools_Profiler(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      public Profiler_ProfilerAnalysisLG getProfiler_ProfilerAnalysisLG() {
        return getOrCreateProperty("Profiler_ProfilerAnalysisLG", "Profiler_ProfilerAnalysisLG", null, pcftest.ServerTools.MenuLinks.ServerTools_Profiler.Profiler_ProfilerAnalysisLG.class);
      }
      
      public Profiler_ProfilerConfigurationPage getProfiler_ProfilerConfigurationPage() {
        return getOrCreateProperty("Profiler_ProfilerConfigurationPage", "Profiler_ProfilerConfigurationPage", null, pcftest.ServerTools.MenuLinks.ServerTools_Profiler.Profiler_ProfilerConfigurationPage.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/profiler/Profiler.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Profiler_ProfilerAnalysisLG extends ClickableActionElement {
        public Profiler_ProfilerAnalysisLG(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        public ProfilerAnalysisLG_ProfilerAnalysisPage getProfilerAnalysisLG_ProfilerAnalysisPage() {
          return getOrCreateProperty("ProfilerAnalysisLG_ProfilerAnalysisPage", "ProfilerAnalysisLG_ProfilerAnalysisPage", null, pcftest.ServerTools.MenuLinks.ServerTools_Profiler.Profiler_ProfilerAnalysisLG.ProfilerAnalysisLG_ProfilerAnalysisPage.class);
        }
        
        public ProfilerAnalysisLG_ProfilerAnalysisPage10 getProfilerAnalysisLG_ProfilerAnalysisPage10() {
          return getOrCreateProperty("ProfilerAnalysisLG_ProfilerAnalysisPage10", "ProfilerAnalysisLG_ProfilerAnalysisPage10", null, pcftest.ServerTools.MenuLinks.ServerTools_Profiler.Profiler_ProfilerAnalysisLG.ProfilerAnalysisLG_ProfilerAnalysisPage10.class);
        }
        
        public ProfilerAnalysisLG_ProfilerAnalysisPage11 getProfilerAnalysisLG_ProfilerAnalysisPage11() {
          return getOrCreateProperty("ProfilerAnalysisLG_ProfilerAnalysisPage11", "ProfilerAnalysisLG_ProfilerAnalysisPage11", null, pcftest.ServerTools.MenuLinks.ServerTools_Profiler.Profiler_ProfilerAnalysisLG.ProfilerAnalysisLG_ProfilerAnalysisPage11.class);
        }
        
        public ProfilerAnalysisLG_ProfilerAnalysisPage2 getProfilerAnalysisLG_ProfilerAnalysisPage2() {
          return getOrCreateProperty("ProfilerAnalysisLG_ProfilerAnalysisPage2", "ProfilerAnalysisLG_ProfilerAnalysisPage2", null, pcftest.ServerTools.MenuLinks.ServerTools_Profiler.Profiler_ProfilerAnalysisLG.ProfilerAnalysisLG_ProfilerAnalysisPage2.class);
        }
        
        public ProfilerAnalysisLG_ProfilerAnalysisPage3 getProfilerAnalysisLG_ProfilerAnalysisPage3() {
          return getOrCreateProperty("ProfilerAnalysisLG_ProfilerAnalysisPage3", "ProfilerAnalysisLG_ProfilerAnalysisPage3", null, pcftest.ServerTools.MenuLinks.ServerTools_Profiler.Profiler_ProfilerAnalysisLG.ProfilerAnalysisLG_ProfilerAnalysisPage3.class);
        }
        
        public ProfilerAnalysisLG_ProfilerAnalysisPage4 getProfilerAnalysisLG_ProfilerAnalysisPage4() {
          return getOrCreateProperty("ProfilerAnalysisLG_ProfilerAnalysisPage4", "ProfilerAnalysisLG_ProfilerAnalysisPage4", null, pcftest.ServerTools.MenuLinks.ServerTools_Profiler.Profiler_ProfilerAnalysisLG.ProfilerAnalysisLG_ProfilerAnalysisPage4.class);
        }
        
        public ProfilerAnalysisLG_ProfilerAnalysisPage5 getProfilerAnalysisLG_ProfilerAnalysisPage5() {
          return getOrCreateProperty("ProfilerAnalysisLG_ProfilerAnalysisPage5", "ProfilerAnalysisLG_ProfilerAnalysisPage5", null, pcftest.ServerTools.MenuLinks.ServerTools_Profiler.Profiler_ProfilerAnalysisLG.ProfilerAnalysisLG_ProfilerAnalysisPage5.class);
        }
        
        public ProfilerAnalysisLG_ProfilerAnalysisPage6 getProfilerAnalysisLG_ProfilerAnalysisPage6() {
          return getOrCreateProperty("ProfilerAnalysisLG_ProfilerAnalysisPage6", "ProfilerAnalysisLG_ProfilerAnalysisPage6", null, pcftest.ServerTools.MenuLinks.ServerTools_Profiler.Profiler_ProfilerAnalysisLG.ProfilerAnalysisLG_ProfilerAnalysisPage6.class);
        }
        
        public ProfilerAnalysisLG_ProfilerAnalysisPage7 getProfilerAnalysisLG_ProfilerAnalysisPage7() {
          return getOrCreateProperty("ProfilerAnalysisLG_ProfilerAnalysisPage7", "ProfilerAnalysisLG_ProfilerAnalysisPage7", null, pcftest.ServerTools.MenuLinks.ServerTools_Profiler.Profiler_ProfilerAnalysisLG.ProfilerAnalysisLG_ProfilerAnalysisPage7.class);
        }
        
        public ProfilerAnalysisLG_ProfilerAnalysisPage8 getProfilerAnalysisLG_ProfilerAnalysisPage8() {
          return getOrCreateProperty("ProfilerAnalysisLG_ProfilerAnalysisPage8", "ProfilerAnalysisLG_ProfilerAnalysisPage8", null, pcftest.ServerTools.MenuLinks.ServerTools_Profiler.Profiler_ProfilerAnalysisLG.ProfilerAnalysisLG_ProfilerAnalysisPage8.class);
        }
        
        public ProfilerAnalysisLG_ProfilerAnalysisPage9 getProfilerAnalysisLG_ProfilerAnalysisPage9() {
          return getOrCreateProperty("ProfilerAnalysisLG_ProfilerAnalysisPage9", "ProfilerAnalysisLG_ProfilerAnalysisPage9", null, pcftest.ServerTools.MenuLinks.ServerTools_Profiler.Profiler_ProfilerAnalysisLG.ProfilerAnalysisLG_ProfilerAnalysisPage9.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/profiler/ProfilerAnalysisLG.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class ProfilerAnalysisLG_ProfilerAnalysisPage extends ClickableActionElement {
          public ProfilerAnalysisLG_ProfilerAnalysisPage(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public ProfilerAnalysisPage click() {
            return clickThis(pcftest.ProfilerAnalysisPage.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/profiler/ProfilerAnalysisLG.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class ProfilerAnalysisLG_ProfilerAnalysisPage10 extends ClickableActionElement {
          public ProfilerAnalysisLG_ProfilerAnalysisPage10(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public ProfilerAnalysisPage click() {
            return clickThis(pcftest.ProfilerAnalysisPage.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/profiler/ProfilerAnalysisLG.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class ProfilerAnalysisLG_ProfilerAnalysisPage11 extends ClickableActionElement {
          public ProfilerAnalysisLG_ProfilerAnalysisPage11(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public ProfilerAnalysisPage click() {
            return clickThis(pcftest.ProfilerAnalysisPage.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/profiler/ProfilerAnalysisLG.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class ProfilerAnalysisLG_ProfilerAnalysisPage2 extends ClickableActionElement {
          public ProfilerAnalysisLG_ProfilerAnalysisPage2(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public ProfilerAnalysisPage click() {
            return clickThis(pcftest.ProfilerAnalysisPage.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/profiler/ProfilerAnalysisLG.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class ProfilerAnalysisLG_ProfilerAnalysisPage3 extends ClickableActionElement {
          public ProfilerAnalysisLG_ProfilerAnalysisPage3(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public ProfilerAnalysisPage click() {
            return clickThis(pcftest.ProfilerAnalysisPage.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/profiler/ProfilerAnalysisLG.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class ProfilerAnalysisLG_ProfilerAnalysisPage4 extends ClickableActionElement {
          public ProfilerAnalysisLG_ProfilerAnalysisPage4(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public ProfilerAnalysisPage click() {
            return clickThis(pcftest.ProfilerAnalysisPage.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/profiler/ProfilerAnalysisLG.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class ProfilerAnalysisLG_ProfilerAnalysisPage5 extends ClickableActionElement {
          public ProfilerAnalysisLG_ProfilerAnalysisPage5(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public ProfilerAnalysisPage click() {
            return clickThis(pcftest.ProfilerAnalysisPage.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/profiler/ProfilerAnalysisLG.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class ProfilerAnalysisLG_ProfilerAnalysisPage6 extends ClickableActionElement {
          public ProfilerAnalysisLG_ProfilerAnalysisPage6(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public ProfilerAnalysisPage click() {
            return clickThis(pcftest.ProfilerAnalysisPage.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/profiler/ProfilerAnalysisLG.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class ProfilerAnalysisLG_ProfilerAnalysisPage7 extends ClickableActionElement {
          public ProfilerAnalysisLG_ProfilerAnalysisPage7(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public ProfilerAnalysisPage click() {
            return clickThis(pcftest.ProfilerAnalysisPage.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/profiler/ProfilerAnalysisLG.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class ProfilerAnalysisLG_ProfilerAnalysisPage8 extends ClickableActionElement {
          public ProfilerAnalysisLG_ProfilerAnalysisPage8(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public ProfilerAnalysisPage click() {
            return clickThis(pcftest.ProfilerAnalysisPage.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/profiler/ProfilerAnalysisLG.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class ProfilerAnalysisLG_ProfilerAnalysisPage9 extends ClickableActionElement {
          public ProfilerAnalysisLG_ProfilerAnalysisPage9(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public ProfilerAnalysisPage click() {
            return clickThis(pcftest.ProfilerAnalysisPage.class);
          }
          
          
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/profiler/Profiler.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Profiler_ProfilerConfigurationPage extends ClickableActionElement {
        public Profiler_ProfilerConfigurationPage(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public ProfilerConfigurationPage click() {
          return clickThis(pcftest.ProfilerConfigurationPage.class);
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/ServerTools.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ServerTools_SetLogLevel extends ClickableActionElement {
      public ServerTools_SetLogLevel(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public SetLogLevel click() {
        return clickThis(pcftest.SetLogLevel.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/ServerTools.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ServerTools_StartablePlugin extends ClickableActionElement {
      public ServerTools_StartablePlugin(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public StartablePlugin click() {
        return clickThis(pcftest.StartablePlugin.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/ServerTools.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ServerTools_UpgradeInfo extends ClickableActionElement {
      public ServerTools_UpgradeInfo(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public UpgradeInfo click() {
        return clickThis(pcftest.UpgradeInfo.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/ServerTools.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ServerTools_ViewLogs extends ClickableActionElement {
      public ServerTools_ViewLogs(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ViewLogs click() {
        return clickThis(pcftest.ViewLogs.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/ServerTools.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ServerTools_WorkQueueInfo extends ClickableActionElement {
      public ServerTools_WorkQueueInfo(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public WorkQueueInfo click() {
        return clickThis(pcftest.WorkQueueInfo.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/ServerTools.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ServerTools_UpLink extends ClickableActionElement {
    public ServerTools_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/ServerTools.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/ServerTools.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/ServerTools.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/ServerTools.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class actWizard extends ClickableActionElement {
    public actWizard(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  
}