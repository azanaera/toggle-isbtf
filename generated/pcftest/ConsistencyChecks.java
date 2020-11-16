package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
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
import pcftest.ConsistencyChecks.ConsistencyChecksScreen;
import pcftest.ConsistencyChecks.ConsistencyChecksScreen.CancelButton;
import pcftest.ConsistencyChecks.ConsistencyChecksScreen.ConsistencyChecksRunsLV_tb;
import pcftest.ConsistencyChecks.ConsistencyChecksScreen.ConsistencyChecksRunsLV_tb.DeleteChecked;
import pcftest.ConsistencyChecks.ConsistencyChecksScreen.ConsistencyChecksRunsLV_tb.Refresh;
import pcftest.ConsistencyChecks.ConsistencyChecksScreen.ConsistencyChecksRunsLV_tb.downloadAll;
import pcftest.ConsistencyChecks.ConsistencyChecksScreen.DownloadTextPanelSet;
import pcftest.ConsistencyChecks.ConsistencyChecksScreen.DownloadTextPanelSet.ConsistencyChecksLV_tb;
import pcftest.ConsistencyChecks.ConsistencyChecksScreen.DownloadTextPanelSet.DownloadAllConsistencyChecks;
import pcftest.ConsistencyChecks.ConsistencyChecksScreen.DownloadTextPanelSet.QueryToIdentifyRowsCardTab;
import pcftest.ConsistencyChecks.ConsistencyChecksScreen.DownloadTextPanelSet.cCheckCardTab;
import pcftest.ConsistencyChecks.ConsistencyChecksScreen.DownloadTextPanelSet.searchButton;
import pcftest.ConsistencyChecks.ConsistencyChecksScreen.NoServerAlert;
import pcftest.ConsistencyChecks.ConsistencyChecksScreen.NumThreads;
import pcftest.ConsistencyChecks.ConsistencyChecksScreen.OneServerAlert;
import pcftest.ConsistencyChecks.ConsistencyChecksScreen.PauseButton;
import pcftest.ConsistencyChecks.ConsistencyChecksScreen.QueueStoppedAlert;
import pcftest.ConsistencyChecks.ConsistencyChecksScreen.ResumeButton;
import pcftest.ConsistencyChecks.ConsistencyChecksScreen.RunConsistChecksCardTab;
import pcftest.ConsistencyChecks.ConsistencyChecksScreen.SubmitBatchJobButton;
import pcftest.ConsistencyChecks.ConsistencyChecksScreen.ViewConsistChecksCardTab;
import pcftest.ConsistencyChecks.ConsistencyChecksScreen._msgs;
import pcftest.ConsistencyChecks.ConsistencyChecksScreen.availTablesToolbar;
import pcftest.ConsistencyChecks.ConsistencyChecksScreen.availableTableGroupsToolbar;
import pcftest.ConsistencyChecks.ConsistencyChecksScreen.checkAllLV;
import pcftest.ConsistencyChecks.ConsistencyChecksScreen.checkAllLV.ccTypeCodeHeader;
import pcftest.ConsistencyChecks.ConsistencyChecksScreen.checkAllLV.conistCheckDescriptionHeader;
import pcftest.ConsistencyChecks.ConsistencyChecksScreen.checkAllToolbar;
import pcftest.ConsistencyChecks.ConsistencyChecksScreen.checkAllToolbar.Reset;
import pcftest.ConsistencyChecks.ConsistencyChecksScreen.checkSelectedToolbar;
import pcftest.ConsistencyChecks.ConsistencyChecksScreen.checkTypeSelectionLV;
import pcftest.ConsistencyChecks.ConsistencyChecksScreen.chosenTableGroupsToolbar;
import pcftest.ConsistencyChecks.ConsistencyChecksScreen.tableAllLV;
import pcftest.ConsistencyChecks.ConsistencyChecksScreen.tableAllLV_tb;
import pcftest.ConsistencyChecks.ConsistencyChecksScreen.tableGroupSelectionLV;
import pcftest.ConsistencyChecks.ConsistencyChecksScreen.tableGroupSelectionLV.chosentablegroupnameHeader;
import pcftest.ConsistencyChecks.ConsistencyChecksScreen.tableSelectionLV;
import pcftest.ConsistencyChecks.ConsistencyChecksScreen.tablegroupAllLV;
import pcftest.ConsistencyChecks.ConsistencyChecksScreen.tablegroupAllLV.tablegroupnameHeader;
import pcftest.ConsistencyChecks.ConsistencyChecks_UpLink;
import pcftest.ConsistencyChecks._Paging;
import pcftest.ConsistencyChecks.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/infopages/ConsistencyChecks.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ConsistencyChecks extends PCFLocation {
  public final static String CHECKSUM = "f0e878c21b35a46524bf5f3be78be2cf";
  
  public ConsistencyChecks(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ConsistencyChecks"));
  }
  
  public ConsistencyChecksScreen getConsistencyChecksScreen() {
    return getOrCreateProperty("ConsistencyChecksScreen", "ConsistencyChecksScreen", null, pcftest.ConsistencyChecks.ConsistencyChecksScreen.class);
  }
  
  public ConsistencyChecks_UpLink getConsistencyChecks_UpLink() {
    return getOrCreateProperty("ConsistencyChecks_UpLink", "ConsistencyChecks_UpLink", null, pcftest.ConsistencyChecks.ConsistencyChecks_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ConsistencyChecks._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ConsistencyChecks.__crumb__.class);
  }
  
  public InfoPages get_parent() {
    return getOrCreateProperty("_parent", pcftest.InfoPages.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/ConsistencyChecks.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ConsistencyChecksScreen extends PCFElement {
    public ConsistencyChecksScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public BooleanValueElement getAnalyzeAllTypes() {
      return getOrCreateProperty("AnalyzeAllTypes", "AnalyzeAllTypes", null, gw.smoketest.platform.web.BooleanValueElement.class);
    }
    
    public CancelButton getCancelButton() {
      return getOrCreateProperty("CancelButton", "CancelButton", null, pcftest.ConsistencyChecks.ConsistencyChecksScreen.CancelButton.class);
    }
    
    public ConsistencyChecksRunsLV getConsistencyChecksRunsLV() {
      return getOrCreateProperty("ConsistencyChecksRunsLV", "ConsistencyChecksRunsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ConsistencyChecksRunsLV.class);
    }
    
    public ConsistencyChecksRunsLV_tb getConsistencyChecksRunsLV_tb() {
      return getOrCreateProperty("ConsistencyChecksRunsLV_tb", "ConsistencyChecksRunsLV_tb", null, pcftest.ConsistencyChecks.ConsistencyChecksScreen.ConsistencyChecksRunsLV_tb.class);
    }
    
    public ValueElement getDescripton() {
      return getOrCreateProperty("Descripton", "Descripton", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public DownloadTextPanelSet getDownloadTextPanelSet() {
      return getOrCreateProperty("DownloadTextPanelSet", "DownloadTextPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.ConsistencyChecks.ConsistencyChecksScreen.DownloadTextPanelSet.class);
    }
    
    public NoServerAlert getNoServerAlert() {
      return getOrCreateProperty("NoServerAlert", "NoServerAlert", null, pcftest.ConsistencyChecks.ConsistencyChecksScreen.NoServerAlert.class);
    }
    
    public NumThreads getNumThreads() {
      return getOrCreateProperty("NumThreads", "NumThreads", null, pcftest.ConsistencyChecks.ConsistencyChecksScreen.NumThreads.class);
    }
    
    public OneServerAlert getOneServerAlert() {
      return getOrCreateProperty("OneServerAlert", "OneServerAlert", null, pcftest.ConsistencyChecks.ConsistencyChecksScreen.OneServerAlert.class);
    }
    
    public PauseButton getPauseButton() {
      return getOrCreateProperty("PauseButton", "PauseButton", null, pcftest.ConsistencyChecks.ConsistencyChecksScreen.PauseButton.class);
    }
    
    public QueueStoppedAlert getQueueStoppedAlert() {
      return getOrCreateProperty("QueueStoppedAlert", "QueueStoppedAlert", null, pcftest.ConsistencyChecks.ConsistencyChecksScreen.QueueStoppedAlert.class);
    }
    
    public ResumeButton getResumeButton() {
      return getOrCreateProperty("ResumeButton", "ResumeButton", null, pcftest.ConsistencyChecks.ConsistencyChecksScreen.ResumeButton.class);
    }
    
    public RunConsistChecksCardTab getRunConsistChecksCardTab() {
      return getOrCreateProperty("RunConsistChecksCardTab", "RunConsistChecksCardTab", null, pcftest.ConsistencyChecks.ConsistencyChecksScreen.RunConsistChecksCardTab.class);
    }
    
    public SubmitBatchJobButton getSubmitBatchJobButton() {
      return getOrCreateProperty("SubmitBatchJobButton", "SubmitBatchJobButton", null, pcftest.ConsistencyChecks.ConsistencyChecksScreen.SubmitBatchJobButton.class);
    }
    
    public ViewConsistChecksCardTab getViewConsistChecksCardTab() {
      return getOrCreateProperty("ViewConsistChecksCardTab", "ViewConsistChecksCardTab", null, pcftest.ConsistencyChecks.ConsistencyChecksScreen.ViewConsistChecksCardTab.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ConsistencyChecks.ConsistencyChecksScreen._msgs.class);
    }
    
    public availTablesToolbar getavailTablesToolbar() {
      return getOrCreateProperty("availTablesToolbar", "availTablesToolbar", null, pcftest.ConsistencyChecks.ConsistencyChecksScreen.availTablesToolbar.class);
    }
    
    public availableTableGroupsToolbar getavailableTableGroupsToolbar() {
      return getOrCreateProperty("availableTableGroupsToolbar", "availableTableGroupsToolbar", null, pcftest.ConsistencyChecks.ConsistencyChecksScreen.availableTableGroupsToolbar.class);
    }
    
    public ValueElement getbatchProgress() {
      return getOrCreateProperty("batchProgress", "batchProgress", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public checkAllLV getcheckAllLV() {
      return getOrCreateProperty("checkAllLV", "checkAllLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ConsistencyChecks.ConsistencyChecksScreen.checkAllLV.class);
    }
    
    public checkAllToolbar getcheckAllToolbar() {
      return getOrCreateProperty("checkAllToolbar", "checkAllToolbar", null, pcftest.ConsistencyChecks.ConsistencyChecksScreen.checkAllToolbar.class);
    }
    
    public checkSelectedToolbar getcheckSelectedToolbar() {
      return getOrCreateProperty("checkSelectedToolbar", "checkSelectedToolbar", null, pcftest.ConsistencyChecks.ConsistencyChecksScreen.checkSelectedToolbar.class);
    }
    
    public checkTypeSelectionLV getcheckTypeSelectionLV() {
      return getOrCreateProperty("checkTypeSelectionLV", "checkTypeSelectionLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ConsistencyChecks.ConsistencyChecksScreen.checkTypeSelectionLV.class);
    }
    
    public chosenTableGroupsToolbar getchosenTableGroupsToolbar() {
      return getOrCreateProperty("chosenTableGroupsToolbar", "chosenTableGroupsToolbar", null, pcftest.ConsistencyChecks.ConsistencyChecksScreen.chosenTableGroupsToolbar.class);
    }
    
    public tableAllLV gettableAllLV() {
      return getOrCreateProperty("tableAllLV", "tableAllLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ConsistencyChecks.ConsistencyChecksScreen.tableAllLV.class);
    }
    
    public tableAllLV_tb gettableAllLV_tb() {
      return getOrCreateProperty("tableAllLV_tb", "tableAllLV_tb", null, pcftest.ConsistencyChecks.ConsistencyChecksScreen.tableAllLV_tb.class);
    }
    
    public tableGroupSelectionLV gettableGroupSelectionLV() {
      return getOrCreateProperty("tableGroupSelectionLV", "tableGroupSelectionLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ConsistencyChecks.ConsistencyChecksScreen.tableGroupSelectionLV.class);
    }
    
    public tableSelectionLV gettableSelectionLV() {
      return getOrCreateProperty("tableSelectionLV", "tableSelectionLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ConsistencyChecks.ConsistencyChecksScreen.tableSelectionLV.class);
    }
    
    public SelectElement gettableSelectionType() {
      return getOrCreateProperty("tableSelectionType", "tableSelectionType", null, gw.smoketest.platform.web.SelectElement.class);
    }
    
    public tablegroupAllLV gettablegroupAllLV() {
      return getOrCreateProperty("tablegroupAllLV", "tablegroupAllLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ConsistencyChecks.ConsistencyChecksScreen.tablegroupAllLV.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/ConsistencyChecks.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CancelButton extends ValueElement {
      public CancelButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/ConsistencyChecks.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ConsistencyChecksRunsLV_tb extends PCFElement {
      public ConsistencyChecksRunsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public DeleteChecked getDeleteChecked() {
        return getOrCreateProperty("DeleteChecked", "DeleteChecked", null, pcftest.ConsistencyChecks.ConsistencyChecksScreen.ConsistencyChecksRunsLV_tb.DeleteChecked.class);
      }
      
      public Refresh getRefresh() {
        return getOrCreateProperty("Refresh", "Refresh", null, pcftest.ConsistencyChecks.ConsistencyChecksScreen.ConsistencyChecksRunsLV_tb.Refresh.class);
      }
      
      public downloadAll getdownloadAll() {
        return getOrCreateProperty("downloadAll", "downloadAll", null, pcftest.ConsistencyChecks.ConsistencyChecksScreen.ConsistencyChecksRunsLV_tb.downloadAll.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/ConsistencyChecks.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class DeleteChecked extends ClickableActionElement {
        public DeleteChecked(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/ConsistencyChecks.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Refresh extends ClickableActionElement {
        public Refresh(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/ConsistencyChecks.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class downloadAll extends ClickableActionElement {
        public downloadAll(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/ConsistencyChecks.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class DownloadTextPanelSet extends PCFElement {
      public DownloadTextPanelSet(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ConsistencyChecksLV getConsistencyChecksLV() {
        return getOrCreateProperty("ConsistencyChecksLV", "ConsistencyChecksLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ConsistencyChecksLV.class);
      }
      
      public ConsistencyChecksLV_tb getConsistencyChecksLV_tb() {
        return getOrCreateProperty("ConsistencyChecksLV_tb", "ConsistencyChecksLV_tb", null, pcftest.ConsistencyChecks.ConsistencyChecksScreen.DownloadTextPanelSet.ConsistencyChecksLV_tb.class);
      }
      
      public DownloadAllConsistencyChecks getDownloadAllConsistencyChecks() {
        return getOrCreateProperty("DownloadAllConsistencyChecks", "DownloadAllConsistencyChecks", null, pcftest.ConsistencyChecks.ConsistencyChecksScreen.DownloadTextPanelSet.DownloadAllConsistencyChecks.class);
      }
      
      public QueryToIdentifyRowsCardTab getQueryToIdentifyRowsCardTab() {
        return getOrCreateProperty("QueryToIdentifyRowsCardTab", "QueryToIdentifyRowsCardTab", null, pcftest.ConsistencyChecks.ConsistencyChecksScreen.DownloadTextPanelSet.QueryToIdentifyRowsCardTab.class);
      }
      
      public pcftest.ConsistencyChecks.ConsistencyChecksScreen.DownloadTextPanelSet.ResetButton getResetButton() {
        return getOrCreateProperty("ResetButton", "ResetButton", null, pcftest.ConsistencyChecks.ConsistencyChecksScreen.DownloadTextPanelSet.ResetButton.class);
      }
      
      public ValueElement getTableNameSearchTextInput() {
        return getOrCreateProperty("TableNameSearchTextInput", "TableNameSearchTextInput", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public cCheckCardTab getcCheckCardTab() {
        return getOrCreateProperty("cCheckCardTab", "cCheckCardTab", null, pcftest.ConsistencyChecks.ConsistencyChecksScreen.DownloadTextPanelSet.cCheckCardTab.class);
      }
      
      public searchButton getsearchButton() {
        return getOrCreateProperty("searchButton", "searchButton", null, pcftest.ConsistencyChecks.ConsistencyChecksScreen.DownloadTextPanelSet.searchButton.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/ConsistencyChecks.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ConsistencyChecksLV_tb extends PCFElement {
        public ConsistencyChecksLV_tb(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/ConsistencyChecks.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class DownloadAllConsistencyChecks extends ValueElement {
        public DownloadAllConsistencyChecks(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/ConsistencyChecks.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class QueryToIdentifyRowsCardTab extends ClickableActionElement {
        public QueryToIdentifyRowsCardTab(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/ConsistencyChecks.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ResetButton extends ValueElement {
        public ResetButton(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/ConsistencyChecks.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class cCheckCardTab extends ClickableActionElement {
        public cCheckCardTab(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/ConsistencyChecks.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class searchButton extends ValueElement {
        public searchButton(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/ConsistencyChecks.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class NoServerAlert extends ClickableActionElement {
      public NoServerAlert(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public pcftest.ConsistencyChecks.ConsistencyChecksScreen.NoServerAlert.CloseBtn getCloseBtn() {
        return getOrCreateProperty("CloseBtn", "CloseBtn", null, pcftest.ConsistencyChecks.ConsistencyChecksScreen.NoServerAlert.CloseBtn.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/ConsistencyChecks.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/tools/infopages/ConsistencyChecks.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class NumThreads extends ValueElement {
      public NumThreads(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ConsistencyChecksChangeNumOfWorkersPopup click() {
        return clickThis(pcftest.ConsistencyChecksChangeNumOfWorkersPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/ConsistencyChecks.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class OneServerAlert extends ClickableActionElement {
      public OneServerAlert(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public pcftest.ConsistencyChecks.ConsistencyChecksScreen.OneServerAlert.CloseBtn getCloseBtn() {
        return getOrCreateProperty("CloseBtn", "CloseBtn", null, pcftest.ConsistencyChecks.ConsistencyChecksScreen.OneServerAlert.CloseBtn.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/ConsistencyChecks.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/tools/infopages/ConsistencyChecks.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class PauseButton extends ValueElement {
      public PauseButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/ConsistencyChecks.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class QueueStoppedAlert extends ClickableActionElement {
      public QueueStoppedAlert(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public pcftest.ConsistencyChecks.ConsistencyChecksScreen.QueueStoppedAlert.CloseBtn getCloseBtn() {
        return getOrCreateProperty("CloseBtn", "CloseBtn", null, pcftest.ConsistencyChecks.ConsistencyChecksScreen.QueueStoppedAlert.CloseBtn.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/ConsistencyChecks.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/tools/infopages/ConsistencyChecks.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ResumeButton extends ValueElement {
      public ResumeButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/ConsistencyChecks.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class RunConsistChecksCardTab extends ClickableActionElement {
      public RunConsistChecksCardTab(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/ConsistencyChecks.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class SubmitBatchJobButton extends ValueElement {
      public SubmitBatchJobButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/ConsistencyChecks.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ViewConsistChecksCardTab extends ClickableActionElement {
      public ViewConsistChecksCardTab(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/ConsistencyChecks.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _msgs extends MessagesElement {
      public _msgs(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/ConsistencyChecks.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class availTablesToolbar extends PCFElement {
      public availTablesToolbar(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public pcftest.ConsistencyChecks.ConsistencyChecksScreen.availTablesToolbar.useButton getuseButton() {
        return getOrCreateProperty("useButton", "useButton", null, pcftest.ConsistencyChecks.ConsistencyChecksScreen.availTablesToolbar.useButton.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/ConsistencyChecks.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class useButton extends ClickableActionElement {
        public useButton(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/ConsistencyChecks.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class availableTableGroupsToolbar extends PCFElement {
      public availableTableGroupsToolbar(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public pcftest.ConsistencyChecks.ConsistencyChecksScreen.availableTableGroupsToolbar.useButton getuseButton() {
        return getOrCreateProperty("useButton", "useButton", null, pcftest.ConsistencyChecks.ConsistencyChecksScreen.availableTableGroupsToolbar.useButton.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/ConsistencyChecks.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class useButton extends ClickableActionElement {
        public useButton(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/ConsistencyChecks.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class checkAllLV extends PCFElement {
      public checkAllLV(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      @SuppressWarnings(value = "unchecked")
      public IteratorEntriesWithPaging<pcftest.ConsistencyChecks.ConsistencyChecksScreen.checkAllLV.entry> get_Entries() {
        return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ConsistencyChecks.ConsistencyChecksScreen.checkAllLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
      }
      
      public pcftest.ConsistencyChecks.ConsistencyChecksScreen.checkAllLV._ListPaging get_ListPaging() {
        return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ConsistencyChecks.ConsistencyChecksScreen.checkAllLV._ListPaging.class);
      }
      
      public ccTypeCodeHeader getccTypeCodeHeader() {
        return getOrCreateProperty("ccTypeCodeHeader", "ccTypeCodeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ConsistencyChecks.ConsistencyChecksScreen.checkAllLV.ccTypeCodeHeader.class);
      }
      
      public conistCheckDescriptionHeader getconistCheckDescriptionHeader() {
        return getOrCreateProperty("conistCheckDescriptionHeader", "conistCheckDescriptionHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ConsistencyChecks.ConsistencyChecksScreen.checkAllLV.conistCheckDescriptionHeader.class);
      }
      
      public pcftest.ConsistencyChecks.ConsistencyChecksScreen.checkAllLV.rowHeader getrowHeader() {
        return getOrCreateProperty("rowHeader", "rowHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ConsistencyChecks.ConsistencyChecksScreen.checkAllLV.rowHeader.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/ConsistencyChecks.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _ListPaging extends PagingElement {
        public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/ConsistencyChecks.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ccTypeCodeHeader extends ValueElement {
        public ccTypeCodeHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/ConsistencyChecks.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class conistCheckDescriptionHeader extends ValueElement {
        public conistCheckDescriptionHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/ConsistencyChecks.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class entry extends RowElement {
        public entry(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public IteratorEntryCheckboxElement get_Checkbox() {
          return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
        }
        
        public pcftest.ConsistencyChecks.ConsistencyChecksScreen.checkAllLV.entry._Select get_Select() {
          return getOrCreateProperty("_Select", "_Select", null, pcftest.ConsistencyChecks.ConsistencyChecksScreen.checkAllLV.entry._Select.class);
        }
        
        public pcftest.ConsistencyChecks.ConsistencyChecksScreen.checkAllLV.entry._ViewDetail get_ViewDetail() {
          return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ConsistencyChecks.ConsistencyChecksScreen.checkAllLV.entry._ViewDetail.class);
        }
        
        public ValueElement getccTypeCode() {
          return getOrCreateProperty("ccTypeCode", "ccTypeCode", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getconistCheckDescription() {
          return getOrCreateProperty("conistCheckDescription", "conistCheckDescription", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getrow() {
          return getOrCreateProperty("row", "row", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/infopages/ConsistencyChecks.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class _Select extends SelectorCellElement {
          public _Select(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/infopages/ConsistencyChecks.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
      @Generated(comments = "config/web/pcf/tools/infopages/ConsistencyChecks.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class rowHeader extends ValueElement {
        public rowHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/ConsistencyChecks.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class checkAllToolbar extends PCFElement {
      public checkAllToolbar(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public Reset getReset() {
        return getOrCreateProperty("Reset", "Reset", null, pcftest.ConsistencyChecks.ConsistencyChecksScreen.checkAllToolbar.Reset.class);
      }
      
      public pcftest.ConsistencyChecks.ConsistencyChecksScreen.checkAllToolbar.ToolbarButton getToolbarButton() {
        return getOrCreateProperty("ToolbarButton", "ToolbarButton", null, pcftest.ConsistencyChecks.ConsistencyChecksScreen.checkAllToolbar.ToolbarButton.class);
      }
      
      public ValueElement getsearchString() {
        return getOrCreateProperty("searchString", "searchString", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public pcftest.ConsistencyChecks.ConsistencyChecksScreen.checkAllToolbar.useButton getuseButton() {
        return getOrCreateProperty("useButton", "useButton", null, pcftest.ConsistencyChecks.ConsistencyChecksScreen.checkAllToolbar.useButton.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/ConsistencyChecks.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Reset extends ClickableActionElement {
        public Reset(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/ConsistencyChecks.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ToolbarButton extends ClickableActionElement {
        public ToolbarButton(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/ConsistencyChecks.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class useButton extends ClickableActionElement {
        public useButton(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/ConsistencyChecks.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class checkSelectedToolbar extends PCFElement {
      public checkSelectedToolbar(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public pcftest.ConsistencyChecks.ConsistencyChecksScreen.checkSelectedToolbar.useButton getuseButton() {
        return getOrCreateProperty("useButton", "useButton", null, pcftest.ConsistencyChecks.ConsistencyChecksScreen.checkSelectedToolbar.useButton.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/ConsistencyChecks.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class useButton extends ClickableActionElement {
        public useButton(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/ConsistencyChecks.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class checkTypeSelectionLV extends PCFElement {
      public checkTypeSelectionLV(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      @SuppressWarnings(value = "unchecked")
      public IteratorEntriesWithPaging<pcftest.ConsistencyChecks.ConsistencyChecksScreen.checkTypeSelectionLV.entry> get_Entries() {
        return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ConsistencyChecks.ConsistencyChecksScreen.checkTypeSelectionLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
      }
      
      public pcftest.ConsistencyChecks.ConsistencyChecksScreen.checkTypeSelectionLV._ListPaging get_ListPaging() {
        return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ConsistencyChecks.ConsistencyChecksScreen.checkTypeSelectionLV._ListPaging.class);
      }
      
      public pcftest.ConsistencyChecks.ConsistencyChecksScreen.checkTypeSelectionLV.rowHeader getrowHeader() {
        return getOrCreateProperty("rowHeader", "rowHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ConsistencyChecks.ConsistencyChecksScreen.checkTypeSelectionLV.rowHeader.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/ConsistencyChecks.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _ListPaging extends PagingElement {
        public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/ConsistencyChecks.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class entry extends RowElement {
        public entry(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public IteratorEntryCheckboxElement get_Checkbox() {
          return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
        }
        
        public pcftest.ConsistencyChecks.ConsistencyChecksScreen.checkTypeSelectionLV.entry._Select get_Select() {
          return getOrCreateProperty("_Select", "_Select", null, pcftest.ConsistencyChecks.ConsistencyChecksScreen.checkTypeSelectionLV.entry._Select.class);
        }
        
        public pcftest.ConsistencyChecks.ConsistencyChecksScreen.checkTypeSelectionLV.entry._ViewDetail get_ViewDetail() {
          return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ConsistencyChecks.ConsistencyChecksScreen.checkTypeSelectionLV.entry._ViewDetail.class);
        }
        
        public ValueElement getrow() {
          return getOrCreateProperty("row", "row", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/infopages/ConsistencyChecks.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class _Select extends SelectorCellElement {
          public _Select(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/infopages/ConsistencyChecks.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
      @Generated(comments = "config/web/pcf/tools/infopages/ConsistencyChecks.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class rowHeader extends ValueElement {
        public rowHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/ConsistencyChecks.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class chosenTableGroupsToolbar extends PCFElement {
      public chosenTableGroupsToolbar(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public pcftest.ConsistencyChecks.ConsistencyChecksScreen.chosenTableGroupsToolbar.useButton getuseButton() {
        return getOrCreateProperty("useButton", "useButton", null, pcftest.ConsistencyChecks.ConsistencyChecksScreen.chosenTableGroupsToolbar.useButton.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/ConsistencyChecks.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class useButton extends ClickableActionElement {
        public useButton(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/ConsistencyChecks.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class tableAllLV extends PCFElement {
      public tableAllLV(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      @SuppressWarnings(value = "unchecked")
      public IteratorEntriesWithPaging<pcftest.ConsistencyChecks.ConsistencyChecksScreen.tableAllLV.entry> get_Entries() {
        return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ConsistencyChecks.ConsistencyChecksScreen.tableAllLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
      }
      
      public pcftest.ConsistencyChecks.ConsistencyChecksScreen.tableAllLV._ListPaging get_ListPaging() {
        return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ConsistencyChecks.ConsistencyChecksScreen.tableAllLV._ListPaging.class);
      }
      
      public pcftest.ConsistencyChecks.ConsistencyChecksScreen.tableAllLV.rowHeader getrowHeader() {
        return getOrCreateProperty("rowHeader", "rowHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ConsistencyChecks.ConsistencyChecksScreen.tableAllLV.rowHeader.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/ConsistencyChecks.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _ListPaging extends PagingElement {
        public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/ConsistencyChecks.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class entry extends RowElement {
        public entry(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public IteratorEntryCheckboxElement get_Checkbox() {
          return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
        }
        
        public pcftest.ConsistencyChecks.ConsistencyChecksScreen.tableAllLV.entry._Select get_Select() {
          return getOrCreateProperty("_Select", "_Select", null, pcftest.ConsistencyChecks.ConsistencyChecksScreen.tableAllLV.entry._Select.class);
        }
        
        public pcftest.ConsistencyChecks.ConsistencyChecksScreen.tableAllLV.entry._ViewDetail get_ViewDetail() {
          return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ConsistencyChecks.ConsistencyChecksScreen.tableAllLV.entry._ViewDetail.class);
        }
        
        public ValueElement getrow() {
          return getOrCreateProperty("row", "row", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/infopages/ConsistencyChecks.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class _Select extends SelectorCellElement {
          public _Select(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/infopages/ConsistencyChecks.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
      @Generated(comments = "config/web/pcf/tools/infopages/ConsistencyChecks.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class rowHeader extends ValueElement {
        public rowHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/ConsistencyChecks.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class tableAllLV_tb extends PCFElement {
      public tableAllLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public pcftest.ConsistencyChecks.ConsistencyChecksScreen.tableAllLV_tb.ResetButton getResetButton() {
        return getOrCreateProperty("ResetButton", "ResetButton", null, pcftest.ConsistencyChecks.ConsistencyChecksScreen.tableAllLV_tb.ResetButton.class);
      }
      
      public pcftest.ConsistencyChecks.ConsistencyChecksScreen.tableAllLV_tb.ToolbarButton getToolbarButton() {
        return getOrCreateProperty("ToolbarButton", "ToolbarButton", null, pcftest.ConsistencyChecks.ConsistencyChecksScreen.tableAllLV_tb.ToolbarButton.class);
      }
      
      public ValueElement getsearchString() {
        return getOrCreateProperty("searchString", "searchString", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public pcftest.ConsistencyChecks.ConsistencyChecksScreen.tableAllLV_tb.useButton getuseButton() {
        return getOrCreateProperty("useButton", "useButton", null, pcftest.ConsistencyChecks.ConsistencyChecksScreen.tableAllLV_tb.useButton.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/ConsistencyChecks.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ResetButton extends ClickableActionElement {
        public ResetButton(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/ConsistencyChecks.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ToolbarButton extends ClickableActionElement {
        public ToolbarButton(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/ConsistencyChecks.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class useButton extends ClickableActionElement {
        public useButton(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/ConsistencyChecks.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class tableGroupSelectionLV extends PCFElement {
      public tableGroupSelectionLV(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      @SuppressWarnings(value = "unchecked")
      public IteratorEntriesWithPaging<pcftest.ConsistencyChecks.ConsistencyChecksScreen.tableGroupSelectionLV.entry> get_Entries() {
        return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ConsistencyChecks.ConsistencyChecksScreen.tableGroupSelectionLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
      }
      
      public pcftest.ConsistencyChecks.ConsistencyChecksScreen.tableGroupSelectionLV._ListPaging get_ListPaging() {
        return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ConsistencyChecks.ConsistencyChecksScreen.tableGroupSelectionLV._ListPaging.class);
      }
      
      public chosentablegroupnameHeader getchosentablegroupnameHeader() {
        return getOrCreateProperty("chosentablegroupnameHeader", "chosentablegroupnameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ConsistencyChecks.ConsistencyChecksScreen.tableGroupSelectionLV.chosentablegroupnameHeader.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/ConsistencyChecks.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _ListPaging extends PagingElement {
        public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/ConsistencyChecks.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class chosentablegroupnameHeader extends ValueElement {
        public chosentablegroupnameHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/ConsistencyChecks.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class entry extends RowElement {
        public entry(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public IteratorEntryCheckboxElement get_Checkbox() {
          return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
        }
        
        public pcftest.ConsistencyChecks.ConsistencyChecksScreen.tableGroupSelectionLV.entry._Select get_Select() {
          return getOrCreateProperty("_Select", "_Select", null, pcftest.ConsistencyChecks.ConsistencyChecksScreen.tableGroupSelectionLV.entry._Select.class);
        }
        
        public pcftest.ConsistencyChecks.ConsistencyChecksScreen.tableGroupSelectionLV.entry._ViewDetail get_ViewDetail() {
          return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ConsistencyChecks.ConsistencyChecksScreen.tableGroupSelectionLV.entry._ViewDetail.class);
        }
        
        public ValueElement getchosentablegroupname() {
          return getOrCreateProperty("chosentablegroupname", "chosentablegroupname", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/infopages/ConsistencyChecks.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class _Select extends SelectorCellElement {
          public _Select(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/infopages/ConsistencyChecks.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/tools/infopages/ConsistencyChecks.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class tableSelectionLV extends PCFElement {
      public tableSelectionLV(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      @SuppressWarnings(value = "unchecked")
      public IteratorEntriesWithPaging<pcftest.ConsistencyChecks.ConsistencyChecksScreen.tableSelectionLV.entry> get_Entries() {
        return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ConsistencyChecks.ConsistencyChecksScreen.tableSelectionLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
      }
      
      public pcftest.ConsistencyChecks.ConsistencyChecksScreen.tableSelectionLV._ListPaging get_ListPaging() {
        return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ConsistencyChecks.ConsistencyChecksScreen.tableSelectionLV._ListPaging.class);
      }
      
      public pcftest.ConsistencyChecks.ConsistencyChecksScreen.tableSelectionLV.rowHeader getrowHeader() {
        return getOrCreateProperty("rowHeader", "rowHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ConsistencyChecks.ConsistencyChecksScreen.tableSelectionLV.rowHeader.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/ConsistencyChecks.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _ListPaging extends PagingElement {
        public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/ConsistencyChecks.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class entry extends RowElement {
        public entry(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public IteratorEntryCheckboxElement get_Checkbox() {
          return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
        }
        
        public pcftest.ConsistencyChecks.ConsistencyChecksScreen.tableSelectionLV.entry._Select get_Select() {
          return getOrCreateProperty("_Select", "_Select", null, pcftest.ConsistencyChecks.ConsistencyChecksScreen.tableSelectionLV.entry._Select.class);
        }
        
        public pcftest.ConsistencyChecks.ConsistencyChecksScreen.tableSelectionLV.entry._ViewDetail get_ViewDetail() {
          return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ConsistencyChecks.ConsistencyChecksScreen.tableSelectionLV.entry._ViewDetail.class);
        }
        
        public ValueElement getrow() {
          return getOrCreateProperty("row", "row", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/infopages/ConsistencyChecks.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class _Select extends SelectorCellElement {
          public _Select(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/infopages/ConsistencyChecks.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
      @Generated(comments = "config/web/pcf/tools/infopages/ConsistencyChecks.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class rowHeader extends ValueElement {
        public rowHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/ConsistencyChecks.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class tablegroupAllLV extends PCFElement {
      public tablegroupAllLV(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      @SuppressWarnings(value = "unchecked")
      public IteratorEntriesWithPaging<pcftest.ConsistencyChecks.ConsistencyChecksScreen.tablegroupAllLV.entry> get_Entries() {
        return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ConsistencyChecks.ConsistencyChecksScreen.tablegroupAllLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
      }
      
      public pcftest.ConsistencyChecks.ConsistencyChecksScreen.tablegroupAllLV._ListPaging get_ListPaging() {
        return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ConsistencyChecks.ConsistencyChecksScreen.tablegroupAllLV._ListPaging.class);
      }
      
      public tablegroupnameHeader gettablegroupnameHeader() {
        return getOrCreateProperty("tablegroupnameHeader", "tablegroupnameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ConsistencyChecks.ConsistencyChecksScreen.tablegroupAllLV.tablegroupnameHeader.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/ConsistencyChecks.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _ListPaging extends PagingElement {
        public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/ConsistencyChecks.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class entry extends RowElement {
        public entry(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public IteratorEntryCheckboxElement get_Checkbox() {
          return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
        }
        
        public pcftest.ConsistencyChecks.ConsistencyChecksScreen.tablegroupAllLV.entry._Select get_Select() {
          return getOrCreateProperty("_Select", "_Select", null, pcftest.ConsistencyChecks.ConsistencyChecksScreen.tablegroupAllLV.entry._Select.class);
        }
        
        public pcftest.ConsistencyChecks.ConsistencyChecksScreen.tablegroupAllLV.entry._ViewDetail get_ViewDetail() {
          return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ConsistencyChecks.ConsistencyChecksScreen.tablegroupAllLV.entry._ViewDetail.class);
        }
        
        public ValueElement gettablegroupname() {
          return getOrCreateProperty("tablegroupname", "tablegroupname", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/infopages/ConsistencyChecks.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class _Select extends SelectorCellElement {
          public _Select(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/infopages/ConsistencyChecks.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
      @Generated(comments = "config/web/pcf/tools/infopages/ConsistencyChecks.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class tablegroupnameHeader extends ValueElement {
        public tablegroupnameHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/ConsistencyChecks.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ConsistencyChecks_UpLink extends ClickableActionElement {
    public ConsistencyChecks_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/ConsistencyChecks.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/ConsistencyChecks.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}