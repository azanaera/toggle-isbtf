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
import pcftest.InfoPages.InfoPages_UpLink;
import pcftest.InfoPages.MenuLinks;
import pcftest.InfoPages.MenuLinks.InfoPages_ArchiveGraphInfo;
import pcftest.InfoPages.MenuLinks.InfoPages_ArchiveInfo;
import pcftest.InfoPages.MenuLinks.InfoPages_ConfigurationInfo;
import pcftest.InfoPages.MenuLinks.InfoPages_ConsistencyChecks;
import pcftest.InfoPages.MenuLinks.InfoPages_DataDistributionInfo;
import pcftest.InfoPages.MenuLinks.InfoPages_DatabaseParameters;
import pcftest.InfoPages.MenuLinks.InfoPages_DatabaseStatistics;
import pcftest.InfoPages.MenuLinks.InfoPages_DatabaseStorage;
import pcftest.InfoPages.MenuLinks.InfoPages_DatabaseTableInfo;
import pcftest.InfoPages.MenuLinks.InfoPages_LoadErrorsInfo;
import pcftest.InfoPages.MenuLinks.InfoPages_LoadHistoryInfo;
import pcftest.InfoPages.MenuLinks.InfoPages_LoadIntegrityChecks;
import pcftest.InfoPages.MenuLinks.InfoPages_LoadedGosuClasses;
import pcftest.InfoPages.MenuLinks.InfoPages_MicrosoftDMVInfo;
import pcftest.InfoPages.MenuLinks.InfoPages_MicrosoftDriverLogging;
import pcftest.InfoPages.MenuLinks.InfoPages_OracleAWRInfo;
import pcftest.InfoPages.MenuLinks.InfoPages_OracleAWRUnusedIndexesInfo;
import pcftest.InfoPages.MenuLinks.InfoPages_OracleOutlineInfo;
import pcftest.InfoPages.MenuLinks.InfoPages_OracleStatspackInfo;
import pcftest.InfoPages.MenuLinks.InfoPages_PostgreSQLPerfInfo;
import pcftest.InfoPages.MenuLinks.InfoPages_RuntimeEnvironmentInfo;
import pcftest.InfoPages.MenuLinks.InfoPages_SafePersistingOrderInfo;
import pcftest.InfoPages.MenuLinks.InfoPages_SerializationInfo;
import pcftest.InfoPages._Paging;
import pcftest.InfoPages.__crumb__;
import pcftest.InfoPages._msgs;
import pcftest.InfoPages.actWizard;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/infopages/InfoPages.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class InfoPages extends PCFLocation {
  public final static String CHECKSUM = "13e93fbf048ff7d6c71b17018cdf4601";
  
  public InfoPages(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("InfoPages"));
  }
  
  public ArchiveGraphInfo getArchiveGraphInfo() {
    return getOrCreateProperty("ArchiveGraphInfo", pcftest.ArchiveGraphInfo.class);
  }
  
  public ArchiveInfo getArchiveInfo() {
    return getOrCreateProperty("ArchiveInfo", pcftest.ArchiveInfo.class);
  }
  
  public ConfigurationInfo getConfigurationInfo() {
    return getOrCreateProperty("ConfigurationInfo", pcftest.ConfigurationInfo.class);
  }
  
  public ConsistencyChecks getConsistencyChecks() {
    return getOrCreateProperty("ConsistencyChecks", pcftest.ConsistencyChecks.class);
  }
  
  public DataDistributionInfo getDataDistributionInfo() {
    return getOrCreateProperty("DataDistributionInfo", pcftest.DataDistributionInfo.class);
  }
  
  public DatabaseParameters getDatabaseParameters() {
    return getOrCreateProperty("DatabaseParameters", pcftest.DatabaseParameters.class);
  }
  
  public DatabaseStatistics getDatabaseStatistics() {
    return getOrCreateProperty("DatabaseStatistics", pcftest.DatabaseStatistics.class);
  }
  
  public DatabaseStorage getDatabaseStorage() {
    return getOrCreateProperty("DatabaseStorage", pcftest.DatabaseStorage.class);
  }
  
  public DatabaseTableInfo getDatabaseTableInfo() {
    return getOrCreateProperty("DatabaseTableInfo", pcftest.DatabaseTableInfo.class);
  }
  
  public InfoPages_UpLink getInfoPages_UpLink() {
    return getOrCreateProperty("InfoPages_UpLink", "InfoPages_UpLink", null, pcftest.InfoPages.InfoPages_UpLink.class);
  }
  
  public InternalToolsTabBar getInternalToolsTabBar() {
    return getOrCreateProperty("InternalToolsTabBar", pcftest.InternalToolsTabBar.class);
  }
  
  public LoadErrorsInfo getLoadErrorsInfo() {
    return getOrCreateProperty("LoadErrorsInfo", pcftest.LoadErrorsInfo.class);
  }
  
  public LoadHistoryInfo getLoadHistoryInfo() {
    return getOrCreateProperty("LoadHistoryInfo", pcftest.LoadHistoryInfo.class);
  }
  
  public LoadIntegrityChecks getLoadIntegrityChecks() {
    return getOrCreateProperty("LoadIntegrityChecks", pcftest.LoadIntegrityChecks.class);
  }
  
  public LoadedGosuClasses getLoadedGosuClasses() {
    return getOrCreateProperty("LoadedGosuClasses", pcftest.LoadedGosuClasses.class);
  }
  
  public MenuLinks getMenuLinks() {
    return getOrCreateMenuLinksProperty("MenuLinks", "MenuLinks", null, pcftest.InfoPages.MenuLinks.class, "ServerTools-MenuLinks-ServerTools_InfoPages");
  }
  
  public MicrosoftDMVInfo getMicrosoftDMVInfo() {
    return getOrCreateProperty("MicrosoftDMVInfo", pcftest.MicrosoftDMVInfo.class);
  }
  
  public MicrosoftDriverLogging getMicrosoftDriverLogging() {
    return getOrCreateProperty("MicrosoftDriverLogging", pcftest.MicrosoftDriverLogging.class);
  }
  
  public OracleAWRInfo getOracleAWRInfo() {
    return getOrCreateProperty("OracleAWRInfo", pcftest.OracleAWRInfo.class);
  }
  
  public OracleAWRUnusedIndexesInfo getOracleAWRUnusedIndexesInfo() {
    return getOrCreateProperty("OracleAWRUnusedIndexesInfo", pcftest.OracleAWRUnusedIndexesInfo.class);
  }
  
  public OracleOutlineInfo getOracleOutlineInfo() {
    return getOrCreateProperty("OracleOutlineInfo", pcftest.OracleOutlineInfo.class);
  }
  
  public OracleStatspackInfo getOracleStatspackInfo() {
    return getOrCreateProperty("OracleStatspackInfo", pcftest.OracleStatspackInfo.class);
  }
  
  public PostgreSQLPerfInfo getPostgreSQLPerfInfo() {
    return getOrCreateProperty("PostgreSQLPerfInfo", pcftest.PostgreSQLPerfInfo.class);
  }
  
  public RuntimeEnvironmentInfo getRuntimeEnvironmentInfo() {
    return getOrCreateProperty("RuntimeEnvironmentInfo", pcftest.RuntimeEnvironmentInfo.class);
  }
  
  public SafePersistingOrderInfo getSafePersistingOrderInfo() {
    return getOrCreateProperty("SafePersistingOrderInfo", pcftest.SafePersistingOrderInfo.class);
  }
  
  public SerializationInfo getSerializationInfo() {
    return getOrCreateProperty("SerializationInfo", pcftest.SerializationInfo.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.InfoPages._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.InfoPages.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.InfoPages._msgs.class);
  }
  
  public ServerTools get_parent() {
    return getOrCreateProperty("_parent", pcftest.ServerTools.class);
  }
  
  public actWizard getactWizard() {
    return getOrCreateProperty("actWizard", "actWizard", null, pcftest.InfoPages.actWizard.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/InfoPages.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class InfoPages_UpLink extends ClickableActionElement {
    public InfoPages_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/InfoPages.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MenuLinks extends PCFElement {
    public MenuLinks(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public InfoPages_ArchiveGraphInfo getInfoPages_ArchiveGraphInfo() {
      return getOrCreateProperty("InfoPages_ArchiveGraphInfo", "InfoPages_ArchiveGraphInfo", null, pcftest.InfoPages.MenuLinks.InfoPages_ArchiveGraphInfo.class);
    }
    
    public InfoPages_ArchiveInfo getInfoPages_ArchiveInfo() {
      return getOrCreateProperty("InfoPages_ArchiveInfo", "InfoPages_ArchiveInfo", null, pcftest.InfoPages.MenuLinks.InfoPages_ArchiveInfo.class);
    }
    
    public InfoPages_ConfigurationInfo getInfoPages_ConfigurationInfo() {
      return getOrCreateProperty("InfoPages_ConfigurationInfo", "InfoPages_ConfigurationInfo", null, pcftest.InfoPages.MenuLinks.InfoPages_ConfigurationInfo.class);
    }
    
    public InfoPages_ConsistencyChecks getInfoPages_ConsistencyChecks() {
      return getOrCreateProperty("InfoPages_ConsistencyChecks", "InfoPages_ConsistencyChecks", null, pcftest.InfoPages.MenuLinks.InfoPages_ConsistencyChecks.class);
    }
    
    public InfoPages_DataDistributionInfo getInfoPages_DataDistributionInfo() {
      return getOrCreateProperty("InfoPages_DataDistributionInfo", "InfoPages_DataDistributionInfo", null, pcftest.InfoPages.MenuLinks.InfoPages_DataDistributionInfo.class);
    }
    
    public InfoPages_DatabaseParameters getInfoPages_DatabaseParameters() {
      return getOrCreateProperty("InfoPages_DatabaseParameters", "InfoPages_DatabaseParameters", null, pcftest.InfoPages.MenuLinks.InfoPages_DatabaseParameters.class);
    }
    
    public InfoPages_DatabaseStatistics getInfoPages_DatabaseStatistics() {
      return getOrCreateProperty("InfoPages_DatabaseStatistics", "InfoPages_DatabaseStatistics", null, pcftest.InfoPages.MenuLinks.InfoPages_DatabaseStatistics.class);
    }
    
    public InfoPages_DatabaseStorage getInfoPages_DatabaseStorage() {
      return getOrCreateProperty("InfoPages_DatabaseStorage", "InfoPages_DatabaseStorage", null, pcftest.InfoPages.MenuLinks.InfoPages_DatabaseStorage.class);
    }
    
    public InfoPages_DatabaseTableInfo getInfoPages_DatabaseTableInfo() {
      return getOrCreateProperty("InfoPages_DatabaseTableInfo", "InfoPages_DatabaseTableInfo", null, pcftest.InfoPages.MenuLinks.InfoPages_DatabaseTableInfo.class);
    }
    
    public InfoPages_LoadErrorsInfo getInfoPages_LoadErrorsInfo() {
      return getOrCreateProperty("InfoPages_LoadErrorsInfo", "InfoPages_LoadErrorsInfo", null, pcftest.InfoPages.MenuLinks.InfoPages_LoadErrorsInfo.class);
    }
    
    public InfoPages_LoadHistoryInfo getInfoPages_LoadHistoryInfo() {
      return getOrCreateProperty("InfoPages_LoadHistoryInfo", "InfoPages_LoadHistoryInfo", null, pcftest.InfoPages.MenuLinks.InfoPages_LoadHistoryInfo.class);
    }
    
    public InfoPages_LoadIntegrityChecks getInfoPages_LoadIntegrityChecks() {
      return getOrCreateProperty("InfoPages_LoadIntegrityChecks", "InfoPages_LoadIntegrityChecks", null, pcftest.InfoPages.MenuLinks.InfoPages_LoadIntegrityChecks.class);
    }
    
    public InfoPages_LoadedGosuClasses getInfoPages_LoadedGosuClasses() {
      return getOrCreateProperty("InfoPages_LoadedGosuClasses", "InfoPages_LoadedGosuClasses", null, pcftest.InfoPages.MenuLinks.InfoPages_LoadedGosuClasses.class);
    }
    
    public InfoPages_MicrosoftDMVInfo getInfoPages_MicrosoftDMVInfo() {
      return getOrCreateProperty("InfoPages_MicrosoftDMVInfo", "InfoPages_MicrosoftDMVInfo", null, pcftest.InfoPages.MenuLinks.InfoPages_MicrosoftDMVInfo.class);
    }
    
    public InfoPages_MicrosoftDriverLogging getInfoPages_MicrosoftDriverLogging() {
      return getOrCreateProperty("InfoPages_MicrosoftDriverLogging", "InfoPages_MicrosoftDriverLogging", null, pcftest.InfoPages.MenuLinks.InfoPages_MicrosoftDriverLogging.class);
    }
    
    public InfoPages_OracleAWRInfo getInfoPages_OracleAWRInfo() {
      return getOrCreateProperty("InfoPages_OracleAWRInfo", "InfoPages_OracleAWRInfo", null, pcftest.InfoPages.MenuLinks.InfoPages_OracleAWRInfo.class);
    }
    
    public InfoPages_OracleAWRUnusedIndexesInfo getInfoPages_OracleAWRUnusedIndexesInfo() {
      return getOrCreateProperty("InfoPages_OracleAWRUnusedIndexesInfo", "InfoPages_OracleAWRUnusedIndexesInfo", null, pcftest.InfoPages.MenuLinks.InfoPages_OracleAWRUnusedIndexesInfo.class);
    }
    
    public InfoPages_OracleOutlineInfo getInfoPages_OracleOutlineInfo() {
      return getOrCreateProperty("InfoPages_OracleOutlineInfo", "InfoPages_OracleOutlineInfo", null, pcftest.InfoPages.MenuLinks.InfoPages_OracleOutlineInfo.class);
    }
    
    public InfoPages_OracleStatspackInfo getInfoPages_OracleStatspackInfo() {
      return getOrCreateProperty("InfoPages_OracleStatspackInfo", "InfoPages_OracleStatspackInfo", null, pcftest.InfoPages.MenuLinks.InfoPages_OracleStatspackInfo.class);
    }
    
    public InfoPages_PostgreSQLPerfInfo getInfoPages_PostgreSQLPerfInfo() {
      return getOrCreateProperty("InfoPages_PostgreSQLPerfInfo", "InfoPages_PostgreSQLPerfInfo", null, pcftest.InfoPages.MenuLinks.InfoPages_PostgreSQLPerfInfo.class);
    }
    
    public InfoPages_RuntimeEnvironmentInfo getInfoPages_RuntimeEnvironmentInfo() {
      return getOrCreateProperty("InfoPages_RuntimeEnvironmentInfo", "InfoPages_RuntimeEnvironmentInfo", null, pcftest.InfoPages.MenuLinks.InfoPages_RuntimeEnvironmentInfo.class);
    }
    
    public InfoPages_SafePersistingOrderInfo getInfoPages_SafePersistingOrderInfo() {
      return getOrCreateProperty("InfoPages_SafePersistingOrderInfo", "InfoPages_SafePersistingOrderInfo", null, pcftest.InfoPages.MenuLinks.InfoPages_SafePersistingOrderInfo.class);
    }
    
    public InfoPages_SerializationInfo getInfoPages_SerializationInfo() {
      return getOrCreateProperty("InfoPages_SerializationInfo", "InfoPages_SerializationInfo", null, pcftest.InfoPages.MenuLinks.InfoPages_SerializationInfo.class);
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
  @Generated(comments = "config/web/pcf/tools/infopages/InfoPages.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/InfoPages.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/InfoPages.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/InfoPages.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class actWizard extends ClickableActionElement {
    public actWizard(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  
}