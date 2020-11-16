package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.DetailViewElement;
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
import pcftest.ClusterMembers.ClusterMembersScreen;
import pcftest.ClusterMembers.ClusterMembersScreen.ClusterMembersDV;
import pcftest.ClusterMembers.ClusterMembersScreen.ClusterMembersLV;
import pcftest.ClusterMembers.ClusterMembersScreen.ClusterMembersLV.BuildHeader;
import pcftest.ClusterMembers.ClusterMembersScreen.ClusterMembersLV.ConnectionStartedHeader;
import pcftest.ClusterMembers.ClusterMembersScreen.ClusterMembersLV.PlannedShutdownHeader;
import pcftest.ClusterMembers.ClusterMembersScreen.ClusterMembersLV.ServerIdHeader;
import pcftest.ClusterMembers.ClusterMembersScreen.ClusterMembersLV.StatusHeader;
import pcftest.ClusterMembers.ClusterMembersScreen.ClusterMembersLV.UserSessionsHeader;
import pcftest.ClusterMembers.ClusterMembersScreen.ClusterMembersLV.entry.NodeFailed;
import pcftest.ClusterMembers.ClusterMembersScreen.ClusterMembersLV.entry.PlannedShutdown;
import pcftest.ClusterMembers.ClusterMembersScreen.ClusterMembersLV.entry.StartPlannedShutdown;
import pcftest.ClusterMembers.ClusterMembersScreen.ClusterMembersLV.entry.StopPlannedShutdown;
import pcftest.ClusterMembers.ClusterMembersScreen.ClusterMembersLV.entry.UserSessions;
import pcftest.ClusterMembers.ClusterMembersScreen.ClusterMembersLV_tb;
import pcftest.ClusterMembers.ClusterMembersScreen.ClusterReconnect;
import pcftest.ClusterMembers.ClusterMembersScreen.ComponentsLV;
import pcftest.ClusterMembers.ClusterMembersScreen.ComponentsLV.FailoverStateHeader;
import pcftest.ClusterMembers.ClusterMembersScreen.ComponentsLV.NameHeader;
import pcftest.ClusterMembers.ClusterMembersScreen.ComponentsLV.RetryFailoverHeader;
import pcftest.ClusterMembers.ClusterMembersScreen.ComponentsLV.StartTimeHeader;
import pcftest.ClusterMembers.ClusterMembersScreen.ComponentsLV.TypeHeader;
import pcftest.ClusterMembers.ClusterMembersScreen.ComponentsLV_tb;
import pcftest.ClusterMembers.ClusterMembersScreen.ComponentsTabTab;
import pcftest.ClusterMembers.ClusterMembersScreen.DownloadReport;
import pcftest.ClusterMembers.ClusterMembersScreen.HistoryLV;
import pcftest.ClusterMembers.ClusterMembersScreen.HistoryLV.EnvHeader;
import pcftest.ClusterMembers.ClusterMembersScreen.HistoryLV.UuidHeader;
import pcftest.ClusterMembers.ClusterMembersScreen.HistoryLV_tb;
import pcftest.ClusterMembers.ClusterMembersScreen.HistoryTabTab;
import pcftest.ClusterMembers.ClusterMembersScreen.ShowUnusedRoles;
import pcftest.ClusterMembers.ClusterMembersScreen._msgs;
import pcftest.ClusterMembers.ClusterMembers_UpLink;
import pcftest.ClusterMembers._Paging;
import pcftest.ClusterMembers.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/cluster/ClusterMembers.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClusterMembers extends PCFLocation {
  public final static String CHECKSUM = "939325d65bf53fe4bda2c2a5b7a952a3";
  
  public ClusterMembers(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ClusterMembers"));
  }
  
  public ClusterMembersScreen getClusterMembersScreen() {
    return getOrCreateProperty("ClusterMembersScreen", "ClusterMembersScreen", null, pcftest.ClusterMembers.ClusterMembersScreen.class);
  }
  
  public ClusterMembers_UpLink getClusterMembers_UpLink() {
    return getOrCreateProperty("ClusterMembers_UpLink", "ClusterMembers_UpLink", null, pcftest.ClusterMembers.ClusterMembers_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ClusterMembers._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ClusterMembers.__crumb__.class);
  }
  
  public ClusterPages get_parent() {
    return getOrCreateProperty("_parent", pcftest.ClusterPages.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/cluster/ClusterMembers.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClusterMembersScreen extends PCFElement {
    public ClusterMembersScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClusterMembersDV getClusterMembersDV() {
      return getOrCreateProperty("ClusterMembersDV", "ClusterMembersDV", null, pcftest.ClusterMembers.ClusterMembersScreen.ClusterMembersDV.class);
    }
    
    public ClusterMembersLV getClusterMembersLV() {
      return getOrCreateProperty("ClusterMembersLV", "ClusterMembersLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClusterMembers.ClusterMembersScreen.ClusterMembersLV.class);
    }
    
    public ClusterMembersLV_tb getClusterMembersLV_tb() {
      return getOrCreateProperty("ClusterMembersLV_tb", "ClusterMembersLV_tb", null, pcftest.ClusterMembers.ClusterMembersScreen.ClusterMembersLV_tb.class);
    }
    
    public ClusterReconnect getClusterReconnect() {
      return getOrCreateProperty("ClusterReconnect", "ClusterReconnect", null, pcftest.ClusterMembers.ClusterMembersScreen.ClusterReconnect.class);
    }
    
    public ComponentsLV getComponentsLV() {
      return getOrCreateProperty("ComponentsLV", "ComponentsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClusterMembers.ClusterMembersScreen.ComponentsLV.class);
    }
    
    public ComponentsLV_tb getComponentsLV_tb() {
      return getOrCreateProperty("ComponentsLV_tb", "ComponentsLV_tb", null, pcftest.ClusterMembers.ClusterMembersScreen.ComponentsLV_tb.class);
    }
    
    public ComponentsTabTab getComponentsTabTab() {
      return getOrCreateProperty("ComponentsTabTab", "ComponentsTabTab", null, pcftest.ClusterMembers.ClusterMembersScreen.ComponentsTabTab.class);
    }
    
    public DownloadReport getDownloadReport() {
      return getOrCreateProperty("DownloadReport", "DownloadReport", null, pcftest.ClusterMembers.ClusterMembersScreen.DownloadReport.class);
    }
    
    public HistoryLV getHistoryLV() {
      return getOrCreateProperty("HistoryLV", "HistoryLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClusterMembers.ClusterMembersScreen.HistoryLV.class);
    }
    
    public HistoryLV_tb getHistoryLV_tb() {
      return getOrCreateProperty("HistoryLV_tb", "HistoryLV_tb", null, pcftest.ClusterMembers.ClusterMembersScreen.HistoryLV_tb.class);
    }
    
    public HistoryTabTab getHistoryTabTab() {
      return getOrCreateProperty("HistoryTabTab", "HistoryTabTab", null, pcftest.ClusterMembers.ClusterMembersScreen.HistoryTabTab.class);
    }
    
    public ShowUnusedRoles getShowUnusedRoles() {
      return getOrCreateProperty("ShowUnusedRoles", "ShowUnusedRoles", null, pcftest.ClusterMembers.ClusterMembersScreen.ShowUnusedRoles.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ClusterMembers.ClusterMembersScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/cluster/ClusterMembers.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClusterMembersDV extends DetailViewElement {
      public ClusterMembersDV(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ValueElement getHost() {
        return getOrCreateProperty("Host", "Host", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getServerId() {
        return getOrCreateProperty("ServerId", "ServerId", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getServerRoles() {
        return getOrCreateProperty("ServerRoles", "ServerRoles", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getUuid() {
        return getOrCreateProperty("Uuid", "Uuid", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/cluster/ClusterMembers.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClusterMembersLV extends PCFElement {
      public ClusterMembersLV(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public BuildHeader getBuildHeader() {
        return getOrCreateProperty("BuildHeader", "BuildHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClusterMembers.ClusterMembersScreen.ClusterMembersLV.BuildHeader.class);
      }
      
      public ConnectionStartedHeader getConnectionStartedHeader() {
        return getOrCreateProperty("ConnectionStartedHeader", "ConnectionStartedHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClusterMembers.ClusterMembersScreen.ClusterMembersLV.ConnectionStartedHeader.class);
      }
      
      public pcftest.ClusterMembers.ClusterMembersScreen.ClusterMembersLV.HostHeader getHostHeader() {
        return getOrCreateProperty("HostHeader", "HostHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClusterMembers.ClusterMembersScreen.ClusterMembersLV.HostHeader.class);
      }
      
      public pcftest.ClusterMembers.ClusterMembersScreen.ClusterMembersLV.LastUpdateHeader getLastUpdateHeader() {
        return getOrCreateProperty("LastUpdateHeader", "LastUpdateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClusterMembers.ClusterMembersScreen.ClusterMembersLV.LastUpdateHeader.class);
      }
      
      public PlannedShutdownHeader getPlannedShutdownHeader() {
        return getOrCreateProperty("PlannedShutdownHeader", "PlannedShutdownHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClusterMembers.ClusterMembersScreen.ClusterMembersLV.PlannedShutdownHeader.class);
      }
      
      public pcftest.ClusterMembers.ClusterMembersScreen.ClusterMembersLV.RunLevelHeader getRunLevelHeader() {
        return getOrCreateProperty("RunLevelHeader", "RunLevelHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClusterMembers.ClusterMembersScreen.ClusterMembersLV.RunLevelHeader.class);
      }
      
      public ServerIdHeader getServerIdHeader() {
        return getOrCreateProperty("ServerIdHeader", "ServerIdHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClusterMembers.ClusterMembersScreen.ClusterMembersLV.ServerIdHeader.class);
      }
      
      public pcftest.ClusterMembers.ClusterMembersScreen.ClusterMembersLV.ServerRolesHeader getServerRolesHeader() {
        return getOrCreateProperty("ServerRolesHeader", "ServerRolesHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClusterMembers.ClusterMembersScreen.ClusterMembersLV.ServerRolesHeader.class);
      }
      
      public pcftest.ClusterMembers.ClusterMembersScreen.ClusterMembersLV.ServerStartedHeader getServerStartedHeader() {
        return getOrCreateProperty("ServerStartedHeader", "ServerStartedHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClusterMembers.ClusterMembersScreen.ClusterMembersLV.ServerStartedHeader.class);
      }
      
      public StatusHeader getStatusHeader() {
        return getOrCreateProperty("StatusHeader", "StatusHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClusterMembers.ClusterMembersScreen.ClusterMembersLV.StatusHeader.class);
      }
      
      public UserSessionsHeader getUserSessionsHeader() {
        return getOrCreateProperty("UserSessionsHeader", "UserSessionsHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClusterMembers.ClusterMembersScreen.ClusterMembersLV.UserSessionsHeader.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      @SuppressWarnings(value = "unchecked")
      public IteratorEntriesWithPaging<pcftest.ClusterMembers.ClusterMembersScreen.ClusterMembersLV.entry> get_Entries() {
        return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ClusterMembers.ClusterMembersScreen.ClusterMembersLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
      }
      
      public pcftest.ClusterMembers.ClusterMembersScreen.ClusterMembersLV._ListPaging get_ListPaging() {
        return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ClusterMembers.ClusterMembersScreen.ClusterMembersLV._ListPaging.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/cluster/ClusterMembers.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class BuildHeader extends ValueElement {
        public BuildHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/cluster/ClusterMembers.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ConnectionStartedHeader extends ValueElement {
        public ConnectionStartedHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/cluster/ClusterMembers.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class HostHeader extends ValueElement {
        public HostHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/cluster/ClusterMembers.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class LastUpdateHeader extends ValueElement {
        public LastUpdateHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/cluster/ClusterMembers.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class PlannedShutdownHeader extends ValueElement {
        public PlannedShutdownHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/cluster/ClusterMembers.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class RunLevelHeader extends ValueElement {
        public RunLevelHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/cluster/ClusterMembers.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ServerIdHeader extends ValueElement {
        public ServerIdHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/cluster/ClusterMembers.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ServerRolesHeader extends ValueElement {
        public ServerRolesHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/cluster/ClusterMembers.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ServerStartedHeader extends ValueElement {
        public ServerStartedHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/cluster/ClusterMembers.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class StatusHeader extends ValueElement {
        public StatusHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/cluster/ClusterMembers.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class UserSessionsHeader extends ValueElement {
        public UserSessionsHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/cluster/ClusterMembers.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _ListPaging extends PagingElement {
        public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/cluster/ClusterMembers.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class entry extends RowElement {
        public entry(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public ValueElement getBuild() {
          return getOrCreateProperty("Build", "Build", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public DateElement getConnectionStarted() {
          return getOrCreateProperty("ConnectionStarted", "ConnectionStarted", null, gw.smoketest.platform.web.DateElement.class);
        }
        
        public ValueElement getHost() {
          return getOrCreateProperty("Host", "Host", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public DateElement getLastUpdate() {
          return getOrCreateProperty("LastUpdate", "LastUpdate", null, gw.smoketest.platform.web.DateElement.class);
        }
        
        public NodeFailed getNodeFailed() {
          return getOrCreateProperty("NodeFailed", "NodeFailed", null, pcftest.ClusterMembers.ClusterMembersScreen.ClusterMembersLV.entry.NodeFailed.class);
        }
        
        public PlannedShutdown getPlannedShutdown() {
          return getOrCreateProperty("PlannedShutdown", "PlannedShutdown", null, pcftest.ClusterMembers.ClusterMembersScreen.ClusterMembersLV.entry.PlannedShutdown.class);
        }
        
        public ValueElement getRunLevel() {
          return getOrCreateProperty("RunLevel", "RunLevel", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getServerId() {
          return getOrCreateProperty("ServerId", "ServerId", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getServerRoles() {
          return getOrCreateProperty("ServerRoles", "ServerRoles", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public DateElement getServerStarted() {
          return getOrCreateProperty("ServerStarted", "ServerStarted", null, gw.smoketest.platform.web.DateElement.class);
        }
        
        public StartPlannedShutdown getStartPlannedShutdown() {
          return getOrCreateProperty("StartPlannedShutdown", "StartPlannedShutdown", null, pcftest.ClusterMembers.ClusterMembersScreen.ClusterMembersLV.entry.StartPlannedShutdown.class);
        }
        
        public ValueElement getStatus() {
          return getOrCreateProperty("Status", "Status", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public StopPlannedShutdown getStopPlannedShutdown() {
          return getOrCreateProperty("StopPlannedShutdown", "StopPlannedShutdown", null, pcftest.ClusterMembers.ClusterMembersScreen.ClusterMembersLV.entry.StopPlannedShutdown.class);
        }
        
        public UserSessions getUserSessions() {
          return getOrCreateProperty("UserSessions", "UserSessions", null, pcftest.ClusterMembers.ClusterMembersScreen.ClusterMembersLV.entry.UserSessions.class);
        }
        
        public IteratorEntryCheckboxElement get_Checkbox() {
          return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
        }
        
        public pcftest.ClusterMembers.ClusterMembersScreen.ClusterMembersLV.entry._Select get_Select() {
          return getOrCreateProperty("_Select", "_Select", null, pcftest.ClusterMembers.ClusterMembersScreen.ClusterMembersLV.entry._Select.class);
        }
        
        public pcftest.ClusterMembers.ClusterMembersScreen.ClusterMembersLV.entry._ViewDetail get_ViewDetail() {
          return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ClusterMembers.ClusterMembersScreen.ClusterMembersLV.entry._ViewDetail.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/cluster/ClusterMembers.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class NodeFailed extends ClickableActionElement {
          public NodeFailed(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/cluster/ClusterMembers.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class PlannedShutdown extends ValueElement {
          public PlannedShutdown(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PlannedShutdownStatusPopup click() {
            return clickThis(pcftest.PlannedShutdownStatusPopup.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/cluster/ClusterMembers.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class StartPlannedShutdown extends ClickableActionElement {
          public StartPlannedShutdown(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PlannedShutdownPopup click() {
            return clickThis(pcftest.PlannedShutdownPopup.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/cluster/ClusterMembers.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class StopPlannedShutdown extends ClickableActionElement {
          public StopPlannedShutdown(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/cluster/ClusterMembers.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class UserSessions extends ValueElement {
          public UserSessions(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public ClusterMemberUserSessionsPopup click() {
            return clickThis(pcftest.ClusterMemberUserSessionsPopup.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/cluster/ClusterMembers.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class _Select extends SelectorCellElement {
          public _Select(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/cluster/ClusterMembers.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/tools/cluster/ClusterMembers.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClusterMembersLV_tb extends PCFElement {
      public ClusterMembersLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/cluster/ClusterMembers.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClusterReconnect extends ValueElement {
      public ClusterReconnect(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/cluster/ClusterMembers.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ComponentsLV extends PCFElement {
      public ComponentsLV(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public SelectElement getComponentTypeFilter() {
        return getOrCreateProperty("ComponentTypeFilter", "ComponentTypeFilter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewToolbarFilter, gw.smoketest.platform.web.SelectElement.class);
      }
      
      public FailoverStateHeader getFailoverStateHeader() {
        return getOrCreateProperty("FailoverStateHeader", "FailoverStateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClusterMembers.ClusterMembersScreen.ComponentsLV.FailoverStateHeader.class);
      }
      
      public NameHeader getNameHeader() {
        return getOrCreateProperty("NameHeader", "NameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClusterMembers.ClusterMembersScreen.ComponentsLV.NameHeader.class);
      }
      
      public RetryFailoverHeader getRetryFailoverHeader() {
        return getOrCreateProperty("RetryFailoverHeader", "RetryFailoverHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClusterMembers.ClusterMembersScreen.ComponentsLV.RetryFailoverHeader.class);
      }
      
      public StartTimeHeader getStartTimeHeader() {
        return getOrCreateProperty("StartTimeHeader", "StartTimeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClusterMembers.ClusterMembersScreen.ComponentsLV.StartTimeHeader.class);
      }
      
      public TypeHeader getTypeHeader() {
        return getOrCreateProperty("TypeHeader", "TypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClusterMembers.ClusterMembersScreen.ComponentsLV.TypeHeader.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      @SuppressWarnings(value = "unchecked")
      public IteratorEntriesWithPaging<pcftest.ClusterMembers.ClusterMembersScreen.ComponentsLV.entry> get_Entries() {
        return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ClusterMembers.ClusterMembersScreen.ComponentsLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
      }
      
      public pcftest.ClusterMembers.ClusterMembersScreen.ComponentsLV._ListPaging get_ListPaging() {
        return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ClusterMembers.ClusterMembersScreen.ComponentsLV._ListPaging.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/cluster/ClusterMembers.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class FailoverStateHeader extends ValueElement {
        public FailoverStateHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/cluster/ClusterMembers.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class NameHeader extends ValueElement {
        public NameHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/cluster/ClusterMembers.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class RetryFailoverHeader extends ValueElement {
        public RetryFailoverHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/cluster/ClusterMembers.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class StartTimeHeader extends ValueElement {
        public StartTimeHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/cluster/ClusterMembers.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class TypeHeader extends ValueElement {
        public TypeHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/cluster/ClusterMembers.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _ListPaging extends PagingElement {
        public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/cluster/ClusterMembers.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class entry extends RowElement {
        public entry(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public ValueElement getFailoverState() {
          return getOrCreateProperty("FailoverState", "FailoverState", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getName() {
          return getOrCreateProperty("Name", "Name", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public DateElement getRetryFailover() {
          return getOrCreateProperty("RetryFailover", "RetryFailover", null, gw.smoketest.platform.web.DateElement.class);
        }
        
        public DateElement getStartTime() {
          return getOrCreateProperty("StartTime", "StartTime", null, gw.smoketest.platform.web.DateElement.class);
        }
        
        public ValueElement getType() {
          return getOrCreateProperty("Type", "Type", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public IteratorEntryCheckboxElement get_Checkbox() {
          return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
        }
        
        public pcftest.ClusterMembers.ClusterMembersScreen.ComponentsLV.entry._Select get_Select() {
          return getOrCreateProperty("_Select", "_Select", null, pcftest.ClusterMembers.ClusterMembersScreen.ComponentsLV.entry._Select.class);
        }
        
        public pcftest.ClusterMembers.ClusterMembersScreen.ComponentsLV.entry._ViewDetail get_ViewDetail() {
          return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ClusterMembers.ClusterMembersScreen.ComponentsLV.entry._ViewDetail.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/cluster/ClusterMembers.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class _Select extends SelectorCellElement {
          public _Select(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/cluster/ClusterMembers.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/tools/cluster/ClusterMembers.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ComponentsLV_tb extends PCFElement {
      public ComponentsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/cluster/ClusterMembers.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ComponentsTabTab extends ClickableActionElement {
      public ComponentsTabTab(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/cluster/ClusterMembers.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class DownloadReport extends ClickableActionElement {
      public DownloadReport(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ClusterMembersDownloadConfigurePopup click() {
        return clickThis(pcftest.ClusterMembersDownloadConfigurePopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/cluster/ClusterMembers.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class HistoryLV extends PCFElement {
      public HistoryLV(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public EnvHeader getEnvHeader() {
        return getOrCreateProperty("EnvHeader", "EnvHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClusterMembers.ClusterMembersScreen.HistoryLV.EnvHeader.class);
      }
      
      public pcftest.ClusterMembers.ClusterMembersScreen.HistoryLV.HostHeader getHostHeader() {
        return getOrCreateProperty("HostHeader", "HostHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClusterMembers.ClusterMembersScreen.HistoryLV.HostHeader.class);
      }
      
      public pcftest.ClusterMembers.ClusterMembersScreen.HistoryLV.LastUpdateHeader getLastUpdateHeader() {
        return getOrCreateProperty("LastUpdateHeader", "LastUpdateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClusterMembers.ClusterMembersScreen.HistoryLV.LastUpdateHeader.class);
      }
      
      public pcftest.ClusterMembers.ClusterMembersScreen.HistoryLV.RunLevelHeader getRunLevelHeader() {
        return getOrCreateProperty("RunLevelHeader", "RunLevelHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClusterMembers.ClusterMembersScreen.HistoryLV.RunLevelHeader.class);
      }
      
      public pcftest.ClusterMembers.ClusterMembersScreen.HistoryLV.ServerRolesHeader getServerRolesHeader() {
        return getOrCreateProperty("ServerRolesHeader", "ServerRolesHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClusterMembers.ClusterMembersScreen.HistoryLV.ServerRolesHeader.class);
      }
      
      public pcftest.ClusterMembers.ClusterMembersScreen.HistoryLV.ServerStartedHeader getServerStartedHeader() {
        return getOrCreateProperty("ServerStartedHeader", "ServerStartedHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClusterMembers.ClusterMembersScreen.HistoryLV.ServerStartedHeader.class);
      }
      
      public UuidHeader getUuidHeader() {
        return getOrCreateProperty("UuidHeader", "UuidHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClusterMembers.ClusterMembersScreen.HistoryLV.UuidHeader.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      @SuppressWarnings(value = "unchecked")
      public IteratorEntriesWithPaging<pcftest.ClusterMembers.ClusterMembersScreen.HistoryLV.entry> get_Entries() {
        return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ClusterMembers.ClusterMembersScreen.HistoryLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
      }
      
      public pcftest.ClusterMembers.ClusterMembersScreen.HistoryLV._ListPaging get_ListPaging() {
        return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ClusterMembers.ClusterMembersScreen.HistoryLV._ListPaging.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/cluster/ClusterMembers.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class EnvHeader extends ValueElement {
        public EnvHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/cluster/ClusterMembers.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class HostHeader extends ValueElement {
        public HostHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/cluster/ClusterMembers.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class LastUpdateHeader extends ValueElement {
        public LastUpdateHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/cluster/ClusterMembers.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class RunLevelHeader extends ValueElement {
        public RunLevelHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/cluster/ClusterMembers.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ServerRolesHeader extends ValueElement {
        public ServerRolesHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/cluster/ClusterMembers.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ServerStartedHeader extends ValueElement {
        public ServerStartedHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/cluster/ClusterMembers.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class UuidHeader extends ValueElement {
        public UuidHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/cluster/ClusterMembers.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _ListPaging extends PagingElement {
        public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/cluster/ClusterMembers.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class entry extends RowElement {
        public entry(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public ValueElement getEnv() {
          return getOrCreateProperty("Env", "Env", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getHost() {
          return getOrCreateProperty("Host", "Host", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public DateElement getLastUpdate() {
          return getOrCreateProperty("LastUpdate", "LastUpdate", null, gw.smoketest.platform.web.DateElement.class);
        }
        
        public ValueElement getRunLevel() {
          return getOrCreateProperty("RunLevel", "RunLevel", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getServerRoles() {
          return getOrCreateProperty("ServerRoles", "ServerRoles", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public DateElement getServerStarted() {
          return getOrCreateProperty("ServerStarted", "ServerStarted", null, gw.smoketest.platform.web.DateElement.class);
        }
        
        public ValueElement getUuid() {
          return getOrCreateProperty("Uuid", "Uuid", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public IteratorEntryCheckboxElement get_Checkbox() {
          return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
        }
        
        public pcftest.ClusterMembers.ClusterMembersScreen.HistoryLV.entry._Select get_Select() {
          return getOrCreateProperty("_Select", "_Select", null, pcftest.ClusterMembers.ClusterMembersScreen.HistoryLV.entry._Select.class);
        }
        
        public pcftest.ClusterMembers.ClusterMembersScreen.HistoryLV.entry._ViewDetail get_ViewDetail() {
          return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ClusterMembers.ClusterMembersScreen.HistoryLV.entry._ViewDetail.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/cluster/ClusterMembers.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class _Select extends SelectorCellElement {
          public _Select(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/cluster/ClusterMembers.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/tools/cluster/ClusterMembers.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class HistoryLV_tb extends PCFElement {
      public HistoryLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/cluster/ClusterMembers.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class HistoryTabTab extends ClickableActionElement {
      public HistoryTabTab(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/cluster/ClusterMembers.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ShowUnusedRoles extends ClickableActionElement {
      public ShowUnusedRoles(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public UnusedServerRolesPopup click() {
        return clickThis(pcftest.UnusedServerRolesPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/cluster/ClusterMembers.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/tools/cluster/ClusterMembers.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClusterMembers_UpLink extends ClickableActionElement {
    public ClusterMembers_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/cluster/ClusterMembers.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/cluster/ClusterMembers.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}