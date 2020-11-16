package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.DetailViewElement;
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
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.UpgradeInfo.UpgradeInfoScreen;
import pcftest.UpgradeInfo.UpgradeInfoScreen.CancelFull;
import pcftest.UpgradeInfo.UpgradeInfoScreen.CurrentVersion;
import pcftest.UpgradeInfo.UpgradeInfoScreen.ForceBackout;
import pcftest.UpgradeInfo.UpgradeInfoScreen.InitiateBackout;
import pcftest.UpgradeInfo.UpgradeInfoScreen.RefreshButton;
import pcftest.UpgradeInfo.UpgradeInfoScreen.RollingComplete;
import pcftest.UpgradeInfo.UpgradeInfoScreen.StartFull;
import pcftest.UpgradeInfo.UpgradeInfoScreen.StartRolling;
import pcftest.UpgradeInfo.UpgradeInfoScreen.StatisticsPanelSet;
import pcftest.UpgradeInfo.UpgradeInfoScreen.StatisticsPanelSet.BatchProcessHeader;
import pcftest.UpgradeInfo.UpgradeInfoScreen.StatisticsPanelSet.CompleteDateHeader;
import pcftest.UpgradeInfo.UpgradeInfoScreen.StatisticsPanelSet.FailedOpsHeader;
import pcftest.UpgradeInfo.UpgradeInfoScreen.StatisticsPanelSet.FailureReasonHeader;
import pcftest.UpgradeInfo.UpgradeInfoScreen.StatisticsPanelSet.OpsPerformedHeader;
import pcftest.UpgradeInfo.UpgradeInfoScreen.StatisticsPanelSet.StartDateHeader;
import pcftest.UpgradeInfo.UpgradeInfoScreen.StatisticsPanelSet.entry.BatchProcess;
import pcftest.UpgradeInfo.UpgradeInfoScreen.UpgradeInstancesDV;
import pcftest.UpgradeInfo.UpgradeInfoScreen.UpgradeInstancesDV.BackOutProgress;
import pcftest.UpgradeInfo.UpgradeInfoScreen.UpgradeInstancesDV.UpgradeInfoLV;
import pcftest.UpgradeInfo.UpgradeInfoScreen.UpgradeInstancesDV.UpgradeInfoLV.DatabaseDurationHeader;
import pcftest.UpgradeInfo.UpgradeInfoScreen.UpgradeInstancesDV.UpgradeInfoLV.DeferredTasksStatusHeader;
import pcftest.UpgradeInfo.UpgradeInfoScreen.UpgradeInstancesDV.UpgradeInfoLV.DeleteCellHeader;
import pcftest.UpgradeInfo.UpgradeInfoScreen.UpgradeInstancesDV.UpgradeInfoLV.DownloadLinkCellHeader;
import pcftest.UpgradeInfo.UpgradeInfoScreen.UpgradeInstancesDV.UpgradeInfoLV.TotalDurationHeader;
import pcftest.UpgradeInfo.UpgradeInfoScreen.UpgradeInstancesDV.UpgradeInfoLV.TotalEndTimeHeader;
import pcftest.UpgradeInfo.UpgradeInfoScreen.UpgradeInstancesDV.UpgradeInfoLV.TotalStartTimeHeader;
import pcftest.UpgradeInfo.UpgradeInfoScreen.UpgradeInstancesDV.UpgradeInfoLV.TypeHeader;
import pcftest.UpgradeInfo.UpgradeInfoScreen.UpgradeInstancesDV.UpgradeInfoLV.VersionHeader;
import pcftest.UpgradeInfo.UpgradeInfoScreen.UpgradeInstancesDV.UpgradeInfoLV.ViewLinkCellHeader;
import pcftest.UpgradeInfo.UpgradeInfoScreen.UpgradeInstancesDV.UpgradeInfoLV.entry.Completed;
import pcftest.UpgradeInfo.UpgradeInfoScreen.UpgradeInstancesDV.UpgradeInfoLV.entry.DeferredTaskStatus;
import pcftest.UpgradeInfo.UpgradeInfoScreen.UpgradeInstancesDV.UpgradeInfoLV.entry.DeleteDetails;
import pcftest.UpgradeInfo.UpgradeInfoScreen.UpgradeInstancesDV.UpgradeInfoLV.entry.Download;
import pcftest.UpgradeInfo.UpgradeInfoScreen.UpgradeInstancesDV.UpgradeInfoLV.entry.NotRunning;
import pcftest.UpgradeInfo.UpgradeInfoScreen.UpgradeInstancesDV.UpgradeInfoLV.entry.Status;
import pcftest.UpgradeInfo.UpgradeInfoScreen.UpgradeInstancesDV.UpgradeInfoLV.entry.View;
import pcftest.UpgradeInfo.UpgradeInfoScreen.UpgradeInstancesDV.UpgradeInfoLV_tb;
import pcftest.UpgradeInfo.UpgradeInfoScreen._msgs;
import pcftest.UpgradeInfo.UpgradeInfo_UpLink;
import pcftest.UpgradeInfo._Paging;
import pcftest.UpgradeInfo.__crumb__;
import typekey.BatchProcessType;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/infopages/UpgradeInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class UpgradeInfo extends PCFLocation {
  public final static String CHECKSUM = "3c0e2d24f22dc9a707580b7bb9b99dbd";
  
  public UpgradeInfo(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("UpgradeInfo"));
  }
  
  public UpgradeInfoScreen getUpgradeInfoScreen() {
    return getOrCreateProperty("UpgradeInfoScreen", "UpgradeInfoScreen", null, pcftest.UpgradeInfo.UpgradeInfoScreen.class);
  }
  
  public UpgradeInfo_UpLink getUpgradeInfo_UpLink() {
    return getOrCreateProperty("UpgradeInfo_UpLink", "UpgradeInfo_UpLink", null, pcftest.UpgradeInfo.UpgradeInfo_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.UpgradeInfo._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.UpgradeInfo.__crumb__.class);
  }
  
  public ServerTools get_parent() {
    return getOrCreateProperty("_parent", pcftest.ServerTools.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/UpgradeInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class UpgradeInfoScreen extends PCFElement {
    public UpgradeInfoScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public CancelFull getCancelFull() {
      return getOrCreateProperty("CancelFull", "CancelFull", null, pcftest.UpgradeInfo.UpgradeInfoScreen.CancelFull.class);
    }
    
    public CurrentVersion getCurrentVersion() {
      return getOrCreateProperty("CurrentVersion", "CurrentVersion", null, pcftest.UpgradeInfo.UpgradeInfoScreen.CurrentVersion.class);
    }
    
    public ForceBackout getForceBackout() {
      return getOrCreateProperty("ForceBackout", "ForceBackout", null, pcftest.UpgradeInfo.UpgradeInfoScreen.ForceBackout.class);
    }
    
    public InitiateBackout getInitiateBackout() {
      return getOrCreateProperty("InitiateBackout", "InitiateBackout", null, pcftest.UpgradeInfo.UpgradeInfoScreen.InitiateBackout.class);
    }
    
    public RefreshButton getRefreshButton() {
      return getOrCreateProperty("RefreshButton", "RefreshButton", null, pcftest.UpgradeInfo.UpgradeInfoScreen.RefreshButton.class);
    }
    
    public RollingComplete getRollingComplete() {
      return getOrCreateProperty("RollingComplete", "RollingComplete", null, pcftest.UpgradeInfo.UpgradeInfoScreen.RollingComplete.class);
    }
    
    public StartFull getStartFull() {
      return getOrCreateProperty("StartFull", "StartFull", null, pcftest.UpgradeInfo.UpgradeInfoScreen.StartFull.class);
    }
    
    public StartRolling getStartRolling() {
      return getOrCreateProperty("StartRolling", "StartRolling", null, pcftest.UpgradeInfo.UpgradeInfoScreen.StartRolling.class);
    }
    
    public StatisticsPanelSet getStatisticsPanelSet() {
      return getOrCreateProperty("StatisticsPanelSet", "StatisticsPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.UpgradeInfo.UpgradeInfoScreen.StatisticsPanelSet.class);
    }
    
    public UpgradeInstancesDV getUpgradeInstancesDV() {
      return getOrCreateProperty("UpgradeInstancesDV", "UpgradeInstancesDV", null, pcftest.UpgradeInfo.UpgradeInfoScreen.UpgradeInstancesDV.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.UpgradeInfo.UpgradeInfoScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/UpgradeInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CancelFull extends ClickableActionElement {
      public CancelFull(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/UpgradeInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CurrentVersion extends ValueElement {
      public CurrentVersion(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/UpgradeInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ForceBackout extends ClickableActionElement {
      public ForceBackout(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ForceBackoutConfirmPopup click() {
        return clickThis(pcftest.ForceBackoutConfirmPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/UpgradeInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class InitiateBackout extends ClickableActionElement {
      public InitiateBackout(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/UpgradeInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class RefreshButton extends ClickableActionElement {
      public RefreshButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/UpgradeInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class RollingComplete extends ClickableActionElement {
      public RollingComplete(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/UpgradeInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class StartFull extends ClickableActionElement {
      public StartFull(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public StartFullUpgradePopup click() {
        return clickThis(pcftest.StartFullUpgradePopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/UpgradeInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class StartRolling extends ClickableActionElement {
      public StartRolling(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public StartRollingUpgradePopup click() {
        return clickThis(pcftest.StartRollingUpgradePopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/UpgradeInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class StatisticsPanelSet extends PCFElement {
      public StatisticsPanelSet(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public BatchProcessHeader getBatchProcessHeader() {
        return getOrCreateProperty("BatchProcessHeader", "BatchProcessHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.UpgradeInfo.UpgradeInfoScreen.StatisticsPanelSet.BatchProcessHeader.class);
      }
      
      public CompleteDateHeader getCompleteDateHeader() {
        return getOrCreateProperty("CompleteDateHeader", "CompleteDateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.UpgradeInfo.UpgradeInfoScreen.StatisticsPanelSet.CompleteDateHeader.class);
      }
      
      public FailedOpsHeader getFailedOpsHeader() {
        return getOrCreateProperty("FailedOpsHeader", "FailedOpsHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.UpgradeInfo.UpgradeInfoScreen.StatisticsPanelSet.FailedOpsHeader.class);
      }
      
      public FailureReasonHeader getFailureReasonHeader() {
        return getOrCreateProperty("FailureReasonHeader", "FailureReasonHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.UpgradeInfo.UpgradeInfoScreen.StatisticsPanelSet.FailureReasonHeader.class);
      }
      
      public OpsPerformedHeader getOpsPerformedHeader() {
        return getOrCreateProperty("OpsPerformedHeader", "OpsPerformedHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.UpgradeInfo.UpgradeInfoScreen.StatisticsPanelSet.OpsPerformedHeader.class);
      }
      
      public StartDateHeader getStartDateHeader() {
        return getOrCreateProperty("StartDateHeader", "StartDateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.UpgradeInfo.UpgradeInfoScreen.StatisticsPanelSet.StartDateHeader.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      @SuppressWarnings(value = "unchecked")
      public IteratorEntriesWithPaging<pcftest.UpgradeInfo.UpgradeInfoScreen.StatisticsPanelSet.entry> get_Entries() {
        return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.UpgradeInfo.UpgradeInfoScreen.StatisticsPanelSet.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
      }
      
      public pcftest.UpgradeInfo.UpgradeInfoScreen.StatisticsPanelSet._ListPaging get_ListPaging() {
        return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.UpgradeInfo.UpgradeInfoScreen.StatisticsPanelSet._ListPaging.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/UpgradeInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class BatchProcessHeader extends ValueElement {
        public BatchProcessHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/UpgradeInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class CompleteDateHeader extends ValueElement {
        public CompleteDateHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/UpgradeInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class FailedOpsHeader extends ValueElement {
        public FailedOpsHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/UpgradeInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class FailureReasonHeader extends ValueElement {
        public FailureReasonHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/UpgradeInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class OpsPerformedHeader extends ValueElement {
        public OpsPerformedHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/UpgradeInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class StartDateHeader extends ValueElement {
        public StartDateHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/UpgradeInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _ListPaging extends PagingElement {
        public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/UpgradeInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class entry extends RowElement {
        public entry(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public BatchProcess getBatchProcess() {
          return getOrCreateProperty("BatchProcess", "BatchProcess", null, pcftest.UpgradeInfo.UpgradeInfoScreen.StatisticsPanelSet.entry.BatchProcess.class);
        }
        
        public DateElement getCompleteDate() {
          return getOrCreateProperty("CompleteDate", "CompleteDate", null, gw.smoketest.platform.web.DateElement.class);
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
        
        public DateElement getStartDate() {
          return getOrCreateProperty("StartDate", "StartDate", null, gw.smoketest.platform.web.DateElement.class);
        }
        
        public IteratorEntryCheckboxElement get_Checkbox() {
          return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
        }
        
        public pcftest.UpgradeInfo.UpgradeInfoScreen.StatisticsPanelSet.entry._Select get_Select() {
          return getOrCreateProperty("_Select", "_Select", null, pcftest.UpgradeInfo.UpgradeInfoScreen.StatisticsPanelSet.entry._Select.class);
        }
        
        public pcftest.UpgradeInfo.UpgradeInfoScreen.StatisticsPanelSet.entry._ViewDetail get_ViewDetail() {
          return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.UpgradeInfo.UpgradeInfoScreen.StatisticsPanelSet.entry._ViewDetail.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/infopages/UpgradeInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
        @Generated(comments = "config/web/pcf/tools/infopages/UpgradeInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class _Select extends SelectorCellElement {
          public _Select(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/infopages/UpgradeInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/tools/infopages/UpgradeInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class UpgradeInstancesDV extends DetailViewElement {
      public UpgradeInstancesDV(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public BackOutProgress getBackOutProgress() {
        return getOrCreateProperty("BackOutProgress", "BackOutProgress", null, pcftest.UpgradeInfo.UpgradeInfoScreen.UpgradeInstancesDV.BackOutProgress.class);
      }
      
      public UpgradeInfoLV getUpgradeInfoLV() {
        return getOrCreateProperty("UpgradeInfoLV", "UpgradeInfoLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.UpgradeInfo.UpgradeInfoScreen.UpgradeInstancesDV.UpgradeInfoLV.class);
      }
      
      public UpgradeInfoLV_tb getUpgradeInfoLV_tb() {
        return getOrCreateProperty("UpgradeInfoLV_tb", "UpgradeInfoLV_tb", null, pcftest.UpgradeInfo.UpgradeInfoScreen.UpgradeInstancesDV.UpgradeInfoLV_tb.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/UpgradeInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class BackOutProgress extends ValueElement {
        public BackOutProgress(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public UpgradeInfo click() {
          return clickThis(pcftest.UpgradeInfo.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/UpgradeInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class UpgradeInfoLV extends PCFElement {
        public UpgradeInfoLV(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public DatabaseDurationHeader getDatabaseDurationHeader() {
          return getOrCreateProperty("DatabaseDurationHeader", "DatabaseDurationHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.UpgradeInfo.UpgradeInfoScreen.UpgradeInstancesDV.UpgradeInfoLV.DatabaseDurationHeader.class);
        }
        
        public DeferredTasksStatusHeader getDeferredTasksStatusHeader() {
          return getOrCreateProperty("DeferredTasksStatusHeader", "DeferredTasksStatusHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.UpgradeInfo.UpgradeInfoScreen.UpgradeInstancesDV.UpgradeInfoLV.DeferredTasksStatusHeader.class);
        }
        
        public DeleteCellHeader getDeleteCellHeader() {
          return getOrCreateProperty("DeleteCellHeader", "DeleteCellHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.UpgradeInfo.UpgradeInfoScreen.UpgradeInstancesDV.UpgradeInfoLV.DeleteCellHeader.class);
        }
        
        public DownloadLinkCellHeader getDownloadLinkCellHeader() {
          return getOrCreateProperty("DownloadLinkCellHeader", "DownloadLinkCellHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.UpgradeInfo.UpgradeInfoScreen.UpgradeInstancesDV.UpgradeInfoLV.DownloadLinkCellHeader.class);
        }
        
        public TotalDurationHeader getTotalDurationHeader() {
          return getOrCreateProperty("TotalDurationHeader", "TotalDurationHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.UpgradeInfo.UpgradeInfoScreen.UpgradeInstancesDV.UpgradeInfoLV.TotalDurationHeader.class);
        }
        
        public TotalEndTimeHeader getTotalEndTimeHeader() {
          return getOrCreateProperty("TotalEndTimeHeader", "TotalEndTimeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.UpgradeInfo.UpgradeInfoScreen.UpgradeInstancesDV.UpgradeInfoLV.TotalEndTimeHeader.class);
        }
        
        public TotalStartTimeHeader getTotalStartTimeHeader() {
          return getOrCreateProperty("TotalStartTimeHeader", "TotalStartTimeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.UpgradeInfo.UpgradeInfoScreen.UpgradeInstancesDV.UpgradeInfoLV.TotalStartTimeHeader.class);
        }
        
        public TypeHeader getTypeHeader() {
          return getOrCreateProperty("TypeHeader", "TypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.UpgradeInfo.UpgradeInfoScreen.UpgradeInstancesDV.UpgradeInfoLV.TypeHeader.class);
        }
        
        public VersionHeader getVersionHeader() {
          return getOrCreateProperty("VersionHeader", "VersionHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.UpgradeInfo.UpgradeInfoScreen.UpgradeInstancesDV.UpgradeInfoLV.VersionHeader.class);
        }
        
        public ViewLinkCellHeader getViewLinkCellHeader() {
          return getOrCreateProperty("ViewLinkCellHeader", "ViewLinkCellHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.UpgradeInfo.UpgradeInfoScreen.UpgradeInstancesDV.UpgradeInfoLV.ViewLinkCellHeader.class);
        }
        
        public IteratorEntryCheckboxElement get_Checkbox() {
          return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
        }
        
        @SuppressWarnings(value = "unchecked")
        public IteratorEntriesWithPaging<pcftest.UpgradeInfo.UpgradeInfoScreen.UpgradeInstancesDV.UpgradeInfoLV.entry> get_Entries() {
          return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.UpgradeInfo.UpgradeInfoScreen.UpgradeInstancesDV.UpgradeInfoLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
        }
        
        public pcftest.UpgradeInfo.UpgradeInfoScreen.UpgradeInstancesDV.UpgradeInfoLV._ListPaging get_ListPaging() {
          return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.UpgradeInfo.UpgradeInfoScreen.UpgradeInstancesDV.UpgradeInfoLV._ListPaging.class);
        }
        
        public pcftest.UpgradeInfo.UpgradeInfoScreen.UpgradeInstancesDV.UpgradeInfoLV._Select get_Select() {
          return getOrCreateProperty("_Select", "_Select", null, pcftest.UpgradeInfo.UpgradeInfoScreen.UpgradeInstancesDV.UpgradeInfoLV._Select.class);
        }
        
        public pcftest.UpgradeInfo.UpgradeInfoScreen.UpgradeInstancesDV.UpgradeInfoLV._ViewDetail get_ViewDetail() {
          return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.UpgradeInfo.UpgradeInfoScreen.UpgradeInstancesDV.UpgradeInfoLV._ViewDetail.class);
        }
        
        public ValueElement getduration() {
          return getOrCreateProperty("duration", "duration", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getempty1() {
          return getOrCreateProperty("empty1", "empty1", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getempty2() {
          return getOrCreateProperty("empty2", "empty2", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getempty3() {
          return getOrCreateProperty("empty3", "empty3", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getempty4() {
          return getOrCreateProperty("empty4", "empty4", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getempty5() {
          return getOrCreateProperty("empty5", "empty5", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getempty6() {
          return getOrCreateProperty("empty6", "empty6", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getempty7() {
          return getOrCreateProperty("empty7", "empty7", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getempty8() {
          return getOrCreateProperty("empty8", "empty8", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getempty9() {
          return getOrCreateProperty("empty9", "empty9", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/infopages/UpgradeInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class DatabaseDurationHeader extends ValueElement {
          public DatabaseDurationHeader(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/infopages/UpgradeInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class DeferredTasksStatusHeader extends ValueElement {
          public DeferredTasksStatusHeader(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/infopages/UpgradeInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class DeleteCellHeader extends ValueElement {
          public DeleteCellHeader(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/infopages/UpgradeInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class DownloadLinkCellHeader extends ValueElement {
          public DownloadLinkCellHeader(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/infopages/UpgradeInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class TotalDurationHeader extends ValueElement {
          public TotalDurationHeader(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/infopages/UpgradeInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class TotalEndTimeHeader extends ValueElement {
          public TotalEndTimeHeader(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/infopages/UpgradeInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class TotalStartTimeHeader extends ValueElement {
          public TotalStartTimeHeader(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/infopages/UpgradeInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class TypeHeader extends ValueElement {
          public TypeHeader(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/infopages/UpgradeInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class VersionHeader extends ValueElement {
          public VersionHeader(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/infopages/UpgradeInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class ViewLinkCellHeader extends ValueElement {
          public ViewLinkCellHeader(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/infopages/UpgradeInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class _ListPaging extends PagingElement {
          public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/infopages/UpgradeInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class _Select extends SelectorCellElement {
          public _Select(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/infopages/UpgradeInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class _ViewDetail extends BooleanValueElement {
          public _ViewDetail(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/infopages/UpgradeInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class entry extends RowElement {
          public entry(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public Completed getCompleted() {
            return getOrCreateProperty("Completed", "Completed", null, pcftest.UpgradeInfo.UpgradeInfoScreen.UpgradeInstancesDV.UpgradeInfoLV.entry.Completed.class);
          }
          
          public ValueElement getDatabaseDuration() {
            return getOrCreateProperty("DatabaseDuration", "DatabaseDuration", null, gw.smoketest.platform.web.ValueElement.class);
          }
          
          public DeferredTaskStatus getDeferredTaskStatus() {
            return getOrCreateProperty("DeferredTaskStatus", "DeferredTaskStatus", null, pcftest.UpgradeInfo.UpgradeInfoScreen.UpgradeInstancesDV.UpgradeInfoLV.entry.DeferredTaskStatus.class);
          }
          
          public DeleteDetails getDeleteDetails() {
            return getOrCreateProperty("DeleteDetails", "DeleteDetails", null, pcftest.UpgradeInfo.UpgradeInfoScreen.UpgradeInstancesDV.UpgradeInfoLV.entry.DeleteDetails.class);
          }
          
          public Download getDownload() {
            return getOrCreateProperty("Download", "Download", null, pcftest.UpgradeInfo.UpgradeInfoScreen.UpgradeInstancesDV.UpgradeInfoLV.entry.Download.class);
          }
          
          public NotRunning getNotRunning() {
            return getOrCreateProperty("NotRunning", "NotRunning", null, pcftest.UpgradeInfo.UpgradeInfoScreen.UpgradeInstancesDV.UpgradeInfoLV.entry.NotRunning.class);
          }
          
          public Status getStatus() {
            return getOrCreateProperty("Status", "Status", null, pcftest.UpgradeInfo.UpgradeInfoScreen.UpgradeInstancesDV.UpgradeInfoLV.entry.Status.class);
          }
          
          public ValueElement getTotalDuration() {
            return getOrCreateProperty("TotalDuration", "TotalDuration", null, gw.smoketest.platform.web.ValueElement.class);
          }
          
          public DateElement getTotalEndTime() {
            return getOrCreateProperty("TotalEndTime", "TotalEndTime", null, gw.smoketest.platform.web.DateElement.class);
          }
          
          public DateElement getTotalStartTime() {
            return getOrCreateProperty("TotalStartTime", "TotalStartTime", null, gw.smoketest.platform.web.DateElement.class);
          }
          
          public ValueElement getType() {
            return getOrCreateProperty("Type", "Type", null, gw.smoketest.platform.web.ValueElement.class);
          }
          
          public ValueElement getVersion() {
            return getOrCreateProperty("Version", "Version", null, gw.smoketest.platform.web.ValueElement.class);
          }
          
          public View getView() {
            return getOrCreateProperty("View", "View", null, pcftest.UpgradeInfo.UpgradeInfoScreen.UpgradeInstancesDV.UpgradeInfoLV.entry.View.class);
          }
          
          public IteratorEntryCheckboxElement get_Checkbox() {
            return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
          }
          
          public pcftest.UpgradeInfo.UpgradeInfoScreen.UpgradeInstancesDV.UpgradeInfoLV.entry._Select get_Select() {
            return getOrCreateProperty("_Select", "_Select", null, pcftest.UpgradeInfo.UpgradeInfoScreen.UpgradeInstancesDV.UpgradeInfoLV.entry._Select.class);
          }
          
          public pcftest.UpgradeInfo.UpgradeInfoScreen.UpgradeInstancesDV.UpgradeInfoLV.entry._ViewDetail get_ViewDetail() {
            return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.UpgradeInfo.UpgradeInfoScreen.UpgradeInstancesDV.UpgradeInfoLV.entry._ViewDetail.class);
          }
          
          @SimplePropertyProcessing
          @Generated(comments = "config/web/pcf/tools/infopages/UpgradeInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
          public static class Completed extends ClickableActionElement {
            public Completed(ISmokeTest helper, PCFElementId componentId)  {
              super(helper, componentId);
            }
            
            
          }
          
          @SimplePropertyProcessing
          @Generated(comments = "config/web/pcf/tools/infopages/UpgradeInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
          public static class DeferredTaskStatus extends ClickableActionElement {
            public DeferredTaskStatus(ISmokeTest helper, PCFElementId componentId)  {
              super(helper, componentId);
            }
            
            
          }
          
          @SimplePropertyProcessing
          @Generated(comments = "config/web/pcf/tools/infopages/UpgradeInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
          public static class DeleteDetails extends ClickableActionElement {
            public DeleteDetails(ISmokeTest helper, PCFElementId componentId)  {
              super(helper, componentId);
            }
            
            public PCFLocation click() {
              return clickThis(gw.smoketest.platform.web.PCFLocation.class);
            }
            
            
          }
          
          @SimplePropertyProcessing
          @Generated(comments = "config/web/pcf/tools/infopages/UpgradeInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
          public static class Download extends ClickableActionElement {
            public Download(ISmokeTest helper, PCFElementId componentId)  {
              super(helper, componentId);
            }
            
            public PCFLocation click() {
              return clickThis(gw.smoketest.platform.web.PCFLocation.class);
            }
            
            
          }
          
          @SimplePropertyProcessing
          @Generated(comments = "config/web/pcf/tools/infopages/UpgradeInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
          public static class NotRunning extends ClickableActionElement {
            public NotRunning(ISmokeTest helper, PCFElementId componentId)  {
              super(helper, componentId);
            }
            
            
          }
          
          @SimplePropertyProcessing
          @Generated(comments = "config/web/pcf/tools/infopages/UpgradeInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
          public static class Status extends ClickableActionElement {
            public Status(ISmokeTest helper, PCFElementId componentId)  {
              super(helper, componentId);
            }
            
            
          }
          
          @SimplePropertyProcessing
          @Generated(comments = "config/web/pcf/tools/infopages/UpgradeInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
          public static class View extends ClickableActionElement {
            public View(ISmokeTest helper, PCFElementId componentId)  {
              super(helper, componentId);
            }
            
            public ReportView click() {
              return clickThis(pcftest.ReportView.class);
            }
            
            
          }
          
          @SimplePropertyProcessing
          @Generated(comments = "config/web/pcf/tools/infopages/UpgradeInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
          public static class _Select extends SelectorCellElement {
            public _Select(ISmokeTest helper, PCFElementId componentId)  {
              super(helper, componentId);
            }
            
            public PCFLocation click() {
              return clickThis(gw.smoketest.platform.web.PCFLocation.class);
            }
            
            
          }
          
          @SimplePropertyProcessing
          @Generated(comments = "config/web/pcf/tools/infopages/UpgradeInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
      @Generated(comments = "config/web/pcf/tools/infopages/UpgradeInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class UpgradeInfoLV_tb extends PCFElement {
        public UpgradeInfoLV_tb(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/UpgradeInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/tools/infopages/UpgradeInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class UpgradeInfo_UpLink extends ClickableActionElement {
    public UpgradeInfo_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/UpgradeInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/UpgradeInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}