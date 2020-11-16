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
import gw.smoketest.platform.web.SelectorCellElement;
import gw.smoketest.platform.web.ValueElement;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.LoadHistoryDetail.LoadHistoryDetailScreen;
import pcftest.LoadHistoryDetail.LoadHistoryDetailScreen._msgs;
import pcftest.LoadHistoryDetail.LoadHistoryDetailScreen.loadhistoryCV;
import pcftest.LoadHistoryDetail.LoadHistoryDetailScreen.loadhistoryCV.CallbacksCardTab;
import pcftest.LoadHistoryDetail.LoadHistoryDetailScreen.loadhistoryCV.InsertsCardTab;
import pcftest.LoadHistoryDetail.LoadHistoryDetailScreen.loadhistoryCV.IntegrityChecksCardTab;
import pcftest.LoadHistoryDetail.LoadHistoryDetailScreen.loadhistoryCV.LoadCallbacksLV_tb;
import pcftest.LoadHistoryDetail.LoadHistoryDetailScreen.loadhistoryCV.LoadEncryptTablePanelRef;
import pcftest.LoadHistoryDetail.LoadHistoryDetailScreen.loadhistoryCV.LoadHistoryParmPairsLV;
import pcftest.LoadHistoryDetail.LoadHistoryDetailScreen.loadhistoryCV.LoadHistoryParmPairsLV.parmnameHeader;
import pcftest.LoadHistoryDetail.LoadHistoryDetailScreen.loadhistoryCV.LoadHistoryParmPairsLV.parmvalueHeader;
import pcftest.LoadHistoryDetail.LoadHistoryDetailScreen.loadhistoryCV.LoadHistoryParmPairsLV_tb;
import pcftest.LoadHistoryDetail.LoadHistoryDetailScreen.loadhistoryCV.LoadHistoryRowCountLV;
import pcftest.LoadHistoryDetail.LoadHistoryDetailScreen.loadhistoryCV.LoadHistoryRowCountLV.sourcetableblockcountHeader;
import pcftest.LoadHistoryDetail.LoadHistoryDetailScreen.loadhistoryCV.LoadHistoryRowCountLV.sourcetablenameHeader;
import pcftest.LoadHistoryDetail.LoadHistoryDetailScreen.loadhistoryCV.LoadHistoryRowCountLV.sourcetablerowcountHeader;
import pcftest.LoadHistoryDetail.LoadHistoryDetailScreen.loadhistoryCV.LoadHistoryRowCountLV.stagingtableblockcountHeader;
import pcftest.LoadHistoryDetail.LoadHistoryDetailScreen.loadhistoryCV.LoadHistoryRowCountLV.stagingtablenameHeader;
import pcftest.LoadHistoryDetail.LoadHistoryDetailScreen.loadhistoryCV.LoadHistoryRowCountLV.stagingtablerowcountHeader;
import pcftest.LoadHistoryDetail.LoadHistoryDetailScreen.loadhistoryCV.LoadHistoryRowCountLV_tb;
import pcftest.LoadHistoryDetail.LoadHistoryDetailScreen.loadhistoryCV.LoadHistoryRowCountLV_tb.Add;
import pcftest.LoadHistoryDetail.LoadHistoryDetailScreen.loadhistoryCV.LoadHistoryRowCountLV_tb.Remove;
import pcftest.LoadHistoryDetail.LoadHistoryDetailScreen.loadhistoryCV.LoadInsertSelectsLV_tb;
import pcftest.LoadHistoryDetail.LoadHistoryDetailScreen.loadhistoryCV.LoadIntegrityChecksLV_tb;
import pcftest.LoadHistoryDetail.LoadHistoryDetailScreen.loadhistoryCV.LoadStepsLV_tb;
import pcftest.LoadHistoryDetail.LoadHistoryDetailScreen.loadhistoryCV.ParametersCardTab;
import pcftest.LoadHistoryDetail.LoadHistoryDetailScreen.loadhistoryCV.RowCountsCardTab;
import pcftest.LoadHistoryDetail.LoadHistoryDetailScreen.loadhistoryCV.StatisticsCmdsCardTab;
import pcftest.LoadHistoryDetail.LoadHistoryDetailScreen.loadhistoryCV.StepsCardTab;
import pcftest.LoadHistoryDetail.LoadHistoryDetailScreen.loadhistoryCV.TableEncryptsCardTab;
import pcftest.LoadHistoryDetail.LoadHistoryDetailScreen.loadhistoryCV.loadhistorydbstatisticscmdsLV;
import pcftest.LoadHistoryDetail.LoadHistoryDetailScreen.loadhistoryCV.loadhistorydbstatisticscmdsLV.cmdcommandHeader;
import pcftest.LoadHistoryDetail.LoadHistoryDetailScreen.loadhistoryCV.loadhistorydbstatisticscmdsLV.cmdtablenameHeader;
import pcftest.LoadHistoryDetail.LoadHistoryDetailScreen.loadhistoryCV.loadhistorydbstatisticscmdsLV_tb;
import pcftest.LoadHistoryDetail.LoadHistoryDetailScreen.refresh;
import pcftest.LoadHistoryDetail.LoadHistoryDetail_UpLink;
import pcftest.LoadHistoryDetail._Paging;
import pcftest.LoadHistoryDetail.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/infopages/LoadHistoryDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class LoadHistoryDetail extends PCFLocation {
  public final static String CHECKSUM = "21e6cabda6b01869178a1fc191823039";
  
  public LoadHistoryDetail(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("LoadHistoryDetail"));
  }
  
  public LoadHistoryDetailScreen getLoadHistoryDetailScreen() {
    return getOrCreateProperty("LoadHistoryDetailScreen", "LoadHistoryDetailScreen", null, pcftest.LoadHistoryDetail.LoadHistoryDetailScreen.class);
  }
  
  public LoadHistoryDetail_UpLink getLoadHistoryDetail_UpLink() {
    return getOrCreateProperty("LoadHistoryDetail_UpLink", "LoadHistoryDetail_UpLink", null, pcftest.LoadHistoryDetail.LoadHistoryDetail_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.LoadHistoryDetail._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.LoadHistoryDetail.__crumb__.class);
  }
  
  public LoadHistoryInfo get_parent() {
    return getOrCreateProperty("_parent", pcftest.LoadHistoryInfo.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/LoadHistoryDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LoadHistoryDetailScreen extends PCFElement {
    public LoadHistoryDetailScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public LoadHistoryLV getLoadHistoryLV() {
      return getOrCreateProperty("LoadHistoryLV", "LoadHistoryLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.LoadHistoryLV.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.LoadHistoryDetail.LoadHistoryDetailScreen._msgs.class);
    }
    
    public loadhistoryCV getloadhistoryCV() {
      return getOrCreateProperty("loadhistoryCV", "loadhistoryCV", null, pcftest.LoadHistoryDetail.LoadHistoryDetailScreen.loadhistoryCV.class);
    }
    
    public refresh getrefresh() {
      return getOrCreateProperty("refresh", "refresh", null, pcftest.LoadHistoryDetail.LoadHistoryDetailScreen.refresh.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/LoadHistoryDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _msgs extends MessagesElement {
      public _msgs(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/LoadHistoryDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class loadhistoryCV extends PCFElement {
      public loadhistoryCV(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public CallbacksCardTab getCallbacksCardTab() {
        return getOrCreateProperty("CallbacksCardTab", "CallbacksCardTab", null, pcftest.LoadHistoryDetail.LoadHistoryDetailScreen.loadhistoryCV.CallbacksCardTab.class);
      }
      
      public InsertsCardTab getInsertsCardTab() {
        return getOrCreateProperty("InsertsCardTab", "InsertsCardTab", null, pcftest.LoadHistoryDetail.LoadHistoryDetailScreen.loadhistoryCV.InsertsCardTab.class);
      }
      
      public IntegrityChecksCardTab getIntegrityChecksCardTab() {
        return getOrCreateProperty("IntegrityChecksCardTab", "IntegrityChecksCardTab", null, pcftest.LoadHistoryDetail.LoadHistoryDetailScreen.loadhistoryCV.IntegrityChecksCardTab.class);
      }
      
      public LoadCallbacksLV getLoadCallbacksLV() {
        return getOrCreateProperty("LoadCallbacksLV", "LoadCallbacksLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.LoadCallbacksLV.class);
      }
      
      public LoadCallbacksLV_tb getLoadCallbacksLV_tb() {
        return getOrCreateProperty("LoadCallbacksLV_tb", "LoadCallbacksLV_tb", null, pcftest.LoadHistoryDetail.LoadHistoryDetailScreen.loadhistoryCV.LoadCallbacksLV_tb.class);
      }
      
      public LoadEncryptTablePanelRef getLoadEncryptTablePanelRef() {
        return getOrCreateProperty("LoadEncryptTablePanelRef", "LoadEncryptTablePanelRef", null, pcftest.LoadHistoryDetail.LoadHistoryDetailScreen.loadhistoryCV.LoadEncryptTablePanelRef.class);
      }
      
      public LoadHistoryParmPairsLV getLoadHistoryParmPairsLV() {
        return getOrCreateProperty("LoadHistoryParmPairsLV", "LoadHistoryParmPairsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.LoadHistoryDetail.LoadHistoryDetailScreen.loadhistoryCV.LoadHistoryParmPairsLV.class);
      }
      
      public LoadHistoryParmPairsLV_tb getLoadHistoryParmPairsLV_tb() {
        return getOrCreateProperty("LoadHistoryParmPairsLV_tb", "LoadHistoryParmPairsLV_tb", null, pcftest.LoadHistoryDetail.LoadHistoryDetailScreen.loadhistoryCV.LoadHistoryParmPairsLV_tb.class);
      }
      
      public LoadHistoryRowCountLV getLoadHistoryRowCountLV() {
        return getOrCreateProperty("LoadHistoryRowCountLV", "LoadHistoryRowCountLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.LoadHistoryDetail.LoadHistoryDetailScreen.loadhistoryCV.LoadHistoryRowCountLV.class);
      }
      
      public LoadHistoryRowCountLV_tb getLoadHistoryRowCountLV_tb() {
        return getOrCreateProperty("LoadHistoryRowCountLV_tb", "LoadHistoryRowCountLV_tb", null, pcftest.LoadHistoryDetail.LoadHistoryDetailScreen.loadhistoryCV.LoadHistoryRowCountLV_tb.class);
      }
      
      public LoadInsertSelectsLV getLoadInsertSelectsLV() {
        return getOrCreateProperty("LoadInsertSelectsLV", "LoadInsertSelectsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.LoadInsertSelectsLV.class);
      }
      
      public LoadInsertSelectsLV_tb getLoadInsertSelectsLV_tb() {
        return getOrCreateProperty("LoadInsertSelectsLV_tb", "LoadInsertSelectsLV_tb", null, pcftest.LoadHistoryDetail.LoadHistoryDetailScreen.loadhistoryCV.LoadInsertSelectsLV_tb.class);
      }
      
      public LoadIntegrityChecksLV getLoadIntegrityChecksLV() {
        return getOrCreateProperty("LoadIntegrityChecksLV", "LoadIntegrityChecksLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.LoadIntegrityChecksLV.class);
      }
      
      public LoadIntegrityChecksLV_tb getLoadIntegrityChecksLV_tb() {
        return getOrCreateProperty("LoadIntegrityChecksLV_tb", "LoadIntegrityChecksLV_tb", null, pcftest.LoadHistoryDetail.LoadHistoryDetailScreen.loadhistoryCV.LoadIntegrityChecksLV_tb.class);
      }
      
      public LoadStepsLV getLoadStepsLV() {
        return getOrCreateProperty("LoadStepsLV", "LoadStepsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.LoadStepsLV.class);
      }
      
      public LoadStepsLV_tb getLoadStepsLV_tb() {
        return getOrCreateProperty("LoadStepsLV_tb", "LoadStepsLV_tb", null, pcftest.LoadHistoryDetail.LoadHistoryDetailScreen.loadhistoryCV.LoadStepsLV_tb.class);
      }
      
      public ParametersCardTab getParametersCardTab() {
        return getOrCreateProperty("ParametersCardTab", "ParametersCardTab", null, pcftest.LoadHistoryDetail.LoadHistoryDetailScreen.loadhistoryCV.ParametersCardTab.class);
      }
      
      public RowCountsCardTab getRowCountsCardTab() {
        return getOrCreateProperty("RowCountsCardTab", "RowCountsCardTab", null, pcftest.LoadHistoryDetail.LoadHistoryDetailScreen.loadhistoryCV.RowCountsCardTab.class);
      }
      
      public StatisticsCmdsCardTab getStatisticsCmdsCardTab() {
        return getOrCreateProperty("StatisticsCmdsCardTab", "StatisticsCmdsCardTab", null, pcftest.LoadHistoryDetail.LoadHistoryDetailScreen.loadhistoryCV.StatisticsCmdsCardTab.class);
      }
      
      public StepsCardTab getStepsCardTab() {
        return getOrCreateProperty("StepsCardTab", "StepsCardTab", null, pcftest.LoadHistoryDetail.LoadHistoryDetailScreen.loadhistoryCV.StepsCardTab.class);
      }
      
      public TableEncryptsCardTab getTableEncryptsCardTab() {
        return getOrCreateProperty("TableEncryptsCardTab", "TableEncryptsCardTab", null, pcftest.LoadHistoryDetail.LoadHistoryDetailScreen.loadhistoryCV.TableEncryptsCardTab.class);
      }
      
      public loadhistorydbstatisticscmdsLV getloadhistorydbstatisticscmdsLV() {
        return getOrCreateProperty("loadhistorydbstatisticscmdsLV", "loadhistorydbstatisticscmdsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.LoadHistoryDetail.LoadHistoryDetailScreen.loadhistoryCV.loadhistorydbstatisticscmdsLV.class);
      }
      
      public loadhistorydbstatisticscmdsLV_tb getloadhistorydbstatisticscmdsLV_tb() {
        return getOrCreateProperty("loadhistorydbstatisticscmdsLV_tb", "loadhistorydbstatisticscmdsLV_tb", null, pcftest.LoadHistoryDetail.LoadHistoryDetailScreen.loadhistoryCV.loadhistorydbstatisticscmdsLV_tb.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/LoadHistoryDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class CallbacksCardTab extends ClickableActionElement {
        public CallbacksCardTab(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/LoadHistoryDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class InsertsCardTab extends ClickableActionElement {
        public InsertsCardTab(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/LoadHistoryDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class IntegrityChecksCardTab extends ClickableActionElement {
        public IntegrityChecksCardTab(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/LoadHistoryDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class LoadCallbacksLV_tb extends PCFElement {
        public LoadCallbacksLV_tb(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/LoadHistoryDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class LoadEncryptTablePanelRef extends PCFElement {
        public LoadEncryptTablePanelRef(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public LoadEncryptTable getLoadEncryptTable() {
          return getOrCreateProperty("LoadEncryptTable", "LoadEncryptTable", null, pcftest.LoadEncryptTable.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/LoadHistoryDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class LoadHistoryParmPairsLV extends PCFElement {
        public LoadHistoryParmPairsLV(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public IteratorEntryCheckboxElement get_Checkbox() {
          return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
        }
        
        @SuppressWarnings(value = "unchecked")
        public IteratorEntriesWithPaging<pcftest.LoadHistoryDetail.LoadHistoryDetailScreen.loadhistoryCV.LoadHistoryParmPairsLV.entry> get_Entries() {
          return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.LoadHistoryDetail.LoadHistoryDetailScreen.loadhistoryCV.LoadHistoryParmPairsLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
        }
        
        public pcftest.LoadHistoryDetail.LoadHistoryDetailScreen.loadhistoryCV.LoadHistoryParmPairsLV._ListPaging get_ListPaging() {
          return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.LoadHistoryDetail.LoadHistoryDetailScreen.loadhistoryCV.LoadHistoryParmPairsLV._ListPaging.class);
        }
        
        public parmnameHeader getparmnameHeader() {
          return getOrCreateProperty("parmnameHeader", "parmnameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.LoadHistoryDetail.LoadHistoryDetailScreen.loadhistoryCV.LoadHistoryParmPairsLV.parmnameHeader.class);
        }
        
        public parmvalueHeader getparmvalueHeader() {
          return getOrCreateProperty("parmvalueHeader", "parmvalueHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.LoadHistoryDetail.LoadHistoryDetailScreen.loadhistoryCV.LoadHistoryParmPairsLV.parmvalueHeader.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/infopages/LoadHistoryDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class _ListPaging extends PagingElement {
          public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/infopages/LoadHistoryDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class entry extends RowElement {
          public entry(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public IteratorEntryCheckboxElement get_Checkbox() {
            return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
          }
          
          public pcftest.LoadHistoryDetail.LoadHistoryDetailScreen.loadhistoryCV.LoadHistoryParmPairsLV.entry._Select get_Select() {
            return getOrCreateProperty("_Select", "_Select", null, pcftest.LoadHistoryDetail.LoadHistoryDetailScreen.loadhistoryCV.LoadHistoryParmPairsLV.entry._Select.class);
          }
          
          public pcftest.LoadHistoryDetail.LoadHistoryDetailScreen.loadhistoryCV.LoadHistoryParmPairsLV.entry._ViewDetail get_ViewDetail() {
            return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.LoadHistoryDetail.LoadHistoryDetailScreen.loadhistoryCV.LoadHistoryParmPairsLV.entry._ViewDetail.class);
          }
          
          public ValueElement getparmname() {
            return getOrCreateProperty("parmname", "parmname", null, gw.smoketest.platform.web.ValueElement.class);
          }
          
          public ValueElement getparmvalue() {
            return getOrCreateProperty("parmvalue", "parmvalue", null, gw.smoketest.platform.web.ValueElement.class);
          }
          
          @SimplePropertyProcessing
          @Generated(comments = "config/web/pcf/tools/infopages/LoadHistoryDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
          public static class _Select extends SelectorCellElement {
            public _Select(ISmokeTest helper, PCFElementId componentId)  {
              super(helper, componentId);
            }
            
            public PCFLocation click() {
              return clickThis(gw.smoketest.platform.web.PCFLocation.class);
            }
            
            
          }
          
          @SimplePropertyProcessing
          @Generated(comments = "config/web/pcf/tools/infopages/LoadHistoryDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
        @Generated(comments = "config/web/pcf/tools/infopages/LoadHistoryDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class parmnameHeader extends ValueElement {
          public parmnameHeader(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/infopages/LoadHistoryDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class parmvalueHeader extends ValueElement {
          public parmvalueHeader(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/LoadHistoryDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class LoadHistoryParmPairsLV_tb extends PCFElement {
        public LoadHistoryParmPairsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/LoadHistoryDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class LoadHistoryRowCountLV extends PCFElement {
        public LoadHistoryRowCountLV(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public IteratorEntryCheckboxElement get_Checkbox() {
          return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
        }
        
        @SuppressWarnings(value = "unchecked")
        public IteratorEntriesWithPaging<pcftest.LoadHistoryDetail.LoadHistoryDetailScreen.loadhistoryCV.LoadHistoryRowCountLV.entry> get_Entries() {
          return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.LoadHistoryDetail.LoadHistoryDetailScreen.loadhistoryCV.LoadHistoryRowCountLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
        }
        
        public pcftest.LoadHistoryDetail.LoadHistoryDetailScreen.loadhistoryCV.LoadHistoryRowCountLV._ListPaging get_ListPaging() {
          return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.LoadHistoryDetail.LoadHistoryDetailScreen.loadhistoryCV.LoadHistoryRowCountLV._ListPaging.class);
        }
        
        public sourcetableblockcountHeader getsourcetableblockcountHeader() {
          return getOrCreateProperty("sourcetableblockcountHeader", "sourcetableblockcountHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.LoadHistoryDetail.LoadHistoryDetailScreen.loadhistoryCV.LoadHistoryRowCountLV.sourcetableblockcountHeader.class);
        }
        
        public sourcetablenameHeader getsourcetablenameHeader() {
          return getOrCreateProperty("sourcetablenameHeader", "sourcetablenameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.LoadHistoryDetail.LoadHistoryDetailScreen.loadhistoryCV.LoadHistoryRowCountLV.sourcetablenameHeader.class);
        }
        
        public sourcetablerowcountHeader getsourcetablerowcountHeader() {
          return getOrCreateProperty("sourcetablerowcountHeader", "sourcetablerowcountHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.LoadHistoryDetail.LoadHistoryDetailScreen.loadhistoryCV.LoadHistoryRowCountLV.sourcetablerowcountHeader.class);
        }
        
        public stagingtableblockcountHeader getstagingtableblockcountHeader() {
          return getOrCreateProperty("stagingtableblockcountHeader", "stagingtableblockcountHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.LoadHistoryDetail.LoadHistoryDetailScreen.loadhistoryCV.LoadHistoryRowCountLV.stagingtableblockcountHeader.class);
        }
        
        public stagingtablenameHeader getstagingtablenameHeader() {
          return getOrCreateProperty("stagingtablenameHeader", "stagingtablenameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.LoadHistoryDetail.LoadHistoryDetailScreen.loadhistoryCV.LoadHistoryRowCountLV.stagingtablenameHeader.class);
        }
        
        public stagingtablerowcountHeader getstagingtablerowcountHeader() {
          return getOrCreateProperty("stagingtablerowcountHeader", "stagingtablerowcountHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.LoadHistoryDetail.LoadHistoryDetailScreen.loadhistoryCV.LoadHistoryRowCountLV.stagingtablerowcountHeader.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/infopages/LoadHistoryDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class _ListPaging extends PagingElement {
          public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/infopages/LoadHistoryDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class entry extends RowElement {
          public entry(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public IteratorEntryCheckboxElement get_Checkbox() {
            return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
          }
          
          public pcftest.LoadHistoryDetail.LoadHistoryDetailScreen.loadhistoryCV.LoadHistoryRowCountLV.entry._Select get_Select() {
            return getOrCreateProperty("_Select", "_Select", null, pcftest.LoadHistoryDetail.LoadHistoryDetailScreen.loadhistoryCV.LoadHistoryRowCountLV.entry._Select.class);
          }
          
          public pcftest.LoadHistoryDetail.LoadHistoryDetailScreen.loadhistoryCV.LoadHistoryRowCountLV.entry._ViewDetail get_ViewDetail() {
            return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.LoadHistoryDetail.LoadHistoryDetailScreen.loadhistoryCV.LoadHistoryRowCountLV.entry._ViewDetail.class);
          }
          
          public ValueElement getsourcetableblockcount() {
            return getOrCreateProperty("sourcetableblockcount", "sourcetableblockcount", null, gw.smoketest.platform.web.ValueElement.class);
          }
          
          public ValueElement getsourcetablename() {
            return getOrCreateProperty("sourcetablename", "sourcetablename", null, gw.smoketest.platform.web.ValueElement.class);
          }
          
          public ValueElement getsourcetablerowcount() {
            return getOrCreateProperty("sourcetablerowcount", "sourcetablerowcount", null, gw.smoketest.platform.web.ValueElement.class);
          }
          
          public ValueElement getstagingtableblockcount() {
            return getOrCreateProperty("stagingtableblockcount", "stagingtableblockcount", null, gw.smoketest.platform.web.ValueElement.class);
          }
          
          public ValueElement getstagingtablename() {
            return getOrCreateProperty("stagingtablename", "stagingtablename", null, gw.smoketest.platform.web.ValueElement.class);
          }
          
          public ValueElement getstagingtablerowcount() {
            return getOrCreateProperty("stagingtablerowcount", "stagingtablerowcount", null, gw.smoketest.platform.web.ValueElement.class);
          }
          
          @SimplePropertyProcessing
          @Generated(comments = "config/web/pcf/tools/infopages/LoadHistoryDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
          public static class _Select extends SelectorCellElement {
            public _Select(ISmokeTest helper, PCFElementId componentId)  {
              super(helper, componentId);
            }
            
            public PCFLocation click() {
              return clickThis(gw.smoketest.platform.web.PCFLocation.class);
            }
            
            
          }
          
          @SimplePropertyProcessing
          @Generated(comments = "config/web/pcf/tools/infopages/LoadHistoryDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
        @Generated(comments = "config/web/pcf/tools/infopages/LoadHistoryDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class sourcetableblockcountHeader extends ValueElement {
          public sourcetableblockcountHeader(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/infopages/LoadHistoryDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class sourcetablenameHeader extends ValueElement {
          public sourcetablenameHeader(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/infopages/LoadHistoryDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class sourcetablerowcountHeader extends ValueElement {
          public sourcetablerowcountHeader(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/infopages/LoadHistoryDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class stagingtableblockcountHeader extends ValueElement {
          public stagingtableblockcountHeader(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/infopages/LoadHistoryDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class stagingtablenameHeader extends ValueElement {
          public stagingtablenameHeader(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/infopages/LoadHistoryDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class stagingtablerowcountHeader extends ValueElement {
          public stagingtablerowcountHeader(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/LoadHistoryDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class LoadHistoryRowCountLV_tb extends PCFElement {
        public LoadHistoryRowCountLV_tb(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public Add getAdd() {
          return getOrCreateProperty("Add", "Add", null, pcftest.LoadHistoryDetail.LoadHistoryDetailScreen.loadhistoryCV.LoadHistoryRowCountLV_tb.Add.class);
        }
        
        public Remove getRemove() {
          return getOrCreateProperty("Remove", "Remove", null, pcftest.LoadHistoryDetail.LoadHistoryDetailScreen.loadhistoryCV.LoadHistoryRowCountLV_tb.Remove.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/infopages/LoadHistoryDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class Add extends ClickableActionElement {
          public Add(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/infopages/LoadHistoryDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class Remove extends ClickableActionElement {
          public Remove(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/LoadHistoryDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class LoadInsertSelectsLV_tb extends PCFElement {
        public LoadInsertSelectsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/LoadHistoryDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class LoadIntegrityChecksLV_tb extends PCFElement {
        public LoadIntegrityChecksLV_tb(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/LoadHistoryDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class LoadStepsLV_tb extends PCFElement {
        public LoadStepsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/LoadHistoryDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ParametersCardTab extends ClickableActionElement {
        public ParametersCardTab(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/LoadHistoryDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class RowCountsCardTab extends ClickableActionElement {
        public RowCountsCardTab(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/LoadHistoryDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class StatisticsCmdsCardTab extends ClickableActionElement {
        public StatisticsCmdsCardTab(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/LoadHistoryDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class StepsCardTab extends ClickableActionElement {
        public StepsCardTab(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/LoadHistoryDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class TableEncryptsCardTab extends ClickableActionElement {
        public TableEncryptsCardTab(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/LoadHistoryDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class loadhistorydbstatisticscmdsLV extends PCFElement {
        public loadhistorydbstatisticscmdsLV(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public IteratorEntryCheckboxElement get_Checkbox() {
          return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
        }
        
        @SuppressWarnings(value = "unchecked")
        public IteratorEntriesWithPaging<pcftest.LoadHistoryDetail.LoadHistoryDetailScreen.loadhistoryCV.loadhistorydbstatisticscmdsLV.entry> get_Entries() {
          return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.LoadHistoryDetail.LoadHistoryDetailScreen.loadhistoryCV.loadhistorydbstatisticscmdsLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
        }
        
        public pcftest.LoadHistoryDetail.LoadHistoryDetailScreen.loadhistoryCV.loadhistorydbstatisticscmdsLV._ListPaging get_ListPaging() {
          return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.LoadHistoryDetail.LoadHistoryDetailScreen.loadhistoryCV.loadhistorydbstatisticscmdsLV._ListPaging.class);
        }
        
        public cmdcommandHeader getcmdcommandHeader() {
          return getOrCreateProperty("cmdcommandHeader", "cmdcommandHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.LoadHistoryDetail.LoadHistoryDetailScreen.loadhistoryCV.loadhistorydbstatisticscmdsLV.cmdcommandHeader.class);
        }
        
        public cmdtablenameHeader getcmdtablenameHeader() {
          return getOrCreateProperty("cmdtablenameHeader", "cmdtablenameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.LoadHistoryDetail.LoadHistoryDetailScreen.loadhistoryCV.loadhistorydbstatisticscmdsLV.cmdtablenameHeader.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/infopages/LoadHistoryDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class _ListPaging extends PagingElement {
          public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/infopages/LoadHistoryDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class cmdcommandHeader extends ValueElement {
          public cmdcommandHeader(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/infopages/LoadHistoryDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class cmdtablenameHeader extends ValueElement {
          public cmdtablenameHeader(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/infopages/LoadHistoryDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class entry extends RowElement {
          public entry(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public IteratorEntryCheckboxElement get_Checkbox() {
            return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
          }
          
          public pcftest.LoadHistoryDetail.LoadHistoryDetailScreen.loadhistoryCV.loadhistorydbstatisticscmdsLV.entry._Select get_Select() {
            return getOrCreateProperty("_Select", "_Select", null, pcftest.LoadHistoryDetail.LoadHistoryDetailScreen.loadhistoryCV.loadhistorydbstatisticscmdsLV.entry._Select.class);
          }
          
          public pcftest.LoadHistoryDetail.LoadHistoryDetailScreen.loadhistoryCV.loadhistorydbstatisticscmdsLV.entry._ViewDetail get_ViewDetail() {
            return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.LoadHistoryDetail.LoadHistoryDetailScreen.loadhistoryCV.loadhistorydbstatisticscmdsLV.entry._ViewDetail.class);
          }
          
          public ValueElement getcmdcommand() {
            return getOrCreateProperty("cmdcommand", "cmdcommand", null, gw.smoketest.platform.web.ValueElement.class);
          }
          
          public ValueElement getcmdtablename() {
            return getOrCreateProperty("cmdtablename", "cmdtablename", null, gw.smoketest.platform.web.ValueElement.class);
          }
          
          @SimplePropertyProcessing
          @Generated(comments = "config/web/pcf/tools/infopages/LoadHistoryDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
          public static class _Select extends SelectorCellElement {
            public _Select(ISmokeTest helper, PCFElementId componentId)  {
              super(helper, componentId);
            }
            
            public PCFLocation click() {
              return clickThis(gw.smoketest.platform.web.PCFLocation.class);
            }
            
            
          }
          
          @SimplePropertyProcessing
          @Generated(comments = "config/web/pcf/tools/infopages/LoadHistoryDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
      @Generated(comments = "config/web/pcf/tools/infopages/LoadHistoryDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class loadhistorydbstatisticscmdsLV_tb extends PCFElement {
        public loadhistorydbstatisticscmdsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/LoadHistoryDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/tools/infopages/LoadHistoryDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LoadHistoryDetail_UpLink extends ClickableActionElement {
    public LoadHistoryDetail_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/LoadHistoryDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/LoadHistoryDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}