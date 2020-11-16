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
import pcftest.LoadHistoryOps.LoadHistoryOpsScreen;
import pcftest.LoadHistoryOps.LoadHistoryOpsScreen.CallbacksCardTab;
import pcftest.LoadHistoryOps.LoadHistoryOpsScreen.InsertSelectsCardTab;
import pcftest.LoadHistoryOps.LoadHistoryOpsScreen.IntegrityChecksCardTab;
import pcftest.LoadHistoryOps.LoadHistoryOpsScreen.LoadCallbacksLV_tb;
import pcftest.LoadHistoryOps.LoadHistoryOpsScreen.LoadHistoryLV_tb;
import pcftest.LoadHistoryOps.LoadHistoryOpsScreen.LoadHistoryOpsLV;
import pcftest.LoadHistoryOps.LoadHistoryOpsScreen.LoadHistoryOpsLV._ListPaging;
import pcftest.LoadHistoryOps.LoadHistoryOpsScreen.LoadHistoryOpsLV.affectedrowcountHeader;
import pcftest.LoadHistoryOps.LoadHistoryOpsScreen.LoadHistoryOpsLV.entry;
import pcftest.LoadHistoryOps.LoadHistoryOpsScreen.LoadHistoryOpsLV.entry._Select;
import pcftest.LoadHistoryOps.LoadHistoryOpsScreen.LoadHistoryOpsLV.entry._ViewDetail;
import pcftest.LoadHistoryOps.LoadHistoryOpsScreen.LoadHistoryOpsLV.errorcountHeader;
import pcftest.LoadHistoryOps.LoadHistoryOpsScreen.LoadHistoryOpsLV.highestidHeader;
import pcftest.LoadHistoryOps.LoadHistoryOpsScreen.LoadHistoryOpsLV.lowestidHeader;
import pcftest.LoadHistoryOps.LoadHistoryOpsScreen.LoadHistoryOpsLV.numCBHeader;
import pcftest.LoadHistoryOps.LoadHistoryOpsScreen.LoadHistoryOpsLV.numICHeader;
import pcftest.LoadHistoryOps.LoadHistoryOpsScreen.LoadHistoryOpsLV.numISHeader;
import pcftest.LoadHistoryOps.LoadHistoryOpsScreen.LoadHistoryOpsLV.opdurationHeader;
import pcftest.LoadHistoryOps.LoadHistoryOpsScreen.LoadHistoryOpsLV.opendtimeHeader;
import pcftest.LoadHistoryOps.LoadHistoryOpsScreen.LoadHistoryOpsLV.opexecuteorderHeader;
import pcftest.LoadHistoryOps.LoadHistoryOpsScreen.LoadHistoryOpsLV.opstarttimeHeader;
import pcftest.LoadHistoryOps.LoadHistoryOpsScreen.LoadHistoryOpsLV.tablenameHeader;
import pcftest.LoadHistoryOps.LoadHistoryOpsScreen.LoadHistoryOpsLV_tb;
import pcftest.LoadHistoryOps.LoadHistoryOpsScreen.LoadInsertSelectsLV_tb;
import pcftest.LoadHistoryOps.LoadHistoryOpsScreen.LoadIntegrityChecksLV_tb;
import pcftest.LoadHistoryOps.LoadHistoryOpsScreen.LoadStepsLV_tb;
import pcftest.LoadHistoryOps.LoadHistoryOpsScreen._msgs;
import pcftest.LoadHistoryOps.LoadHistoryOpsScreen.refresh;
import pcftest.LoadHistoryOps.LoadHistoryOps_UpLink;
import pcftest.LoadHistoryOps._Paging;
import pcftest.LoadHistoryOps.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/infopages/LoadHistoryOps.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class LoadHistoryOps extends PCFLocation {
  public final static String CHECKSUM = "bc6d1275e2ad523faef626b819a02e08";
  
  public LoadHistoryOps(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("LoadHistoryOps"));
  }
  
  public LoadHistoryOpsScreen getLoadHistoryOpsScreen() {
    return getOrCreateProperty("LoadHistoryOpsScreen", "LoadHistoryOpsScreen", null, pcftest.LoadHistoryOps.LoadHistoryOpsScreen.class);
  }
  
  public LoadHistoryOps_UpLink getLoadHistoryOps_UpLink() {
    return getOrCreateProperty("LoadHistoryOps_UpLink", "LoadHistoryOps_UpLink", null, pcftest.LoadHistoryOps.LoadHistoryOps_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.LoadHistoryOps._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.LoadHistoryOps.__crumb__.class);
  }
  
  public LoadHistoryDetail get_parent() {
    return getOrCreateProperty("_parent", pcftest.LoadHistoryDetail.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/LoadHistoryOps.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LoadHistoryOpsScreen extends PCFElement {
    public LoadHistoryOpsScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public CallbacksCardTab getCallbacksCardTab() {
      return getOrCreateProperty("CallbacksCardTab", "CallbacksCardTab", null, pcftest.LoadHistoryOps.LoadHistoryOpsScreen.CallbacksCardTab.class);
    }
    
    public InsertSelectsCardTab getInsertSelectsCardTab() {
      return getOrCreateProperty("InsertSelectsCardTab", "InsertSelectsCardTab", null, pcftest.LoadHistoryOps.LoadHistoryOpsScreen.InsertSelectsCardTab.class);
    }
    
    public IntegrityChecksCardTab getIntegrityChecksCardTab() {
      return getOrCreateProperty("IntegrityChecksCardTab", "IntegrityChecksCardTab", null, pcftest.LoadHistoryOps.LoadHistoryOpsScreen.IntegrityChecksCardTab.class);
    }
    
    public LoadCallbacksLV getLoadCallbacksLV() {
      return getOrCreateProperty("LoadCallbacksLV", "LoadCallbacksLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.LoadCallbacksLV.class);
    }
    
    public LoadCallbacksLV_tb getLoadCallbacksLV_tb() {
      return getOrCreateProperty("LoadCallbacksLV_tb", "LoadCallbacksLV_tb", null, pcftest.LoadHistoryOps.LoadHistoryOpsScreen.LoadCallbacksLV_tb.class);
    }
    
    public LoadHistoryLV getLoadHistoryLV() {
      return getOrCreateProperty("LoadHistoryLV", "LoadHistoryLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.LoadHistoryLV.class);
    }
    
    public LoadHistoryLV_tb getLoadHistoryLV_tb() {
      return getOrCreateProperty("LoadHistoryLV_tb", "LoadHistoryLV_tb", null, pcftest.LoadHistoryOps.LoadHistoryOpsScreen.LoadHistoryLV_tb.class);
    }
    
    public LoadHistoryOpsLV getLoadHistoryOpsLV() {
      return getOrCreateProperty("LoadHistoryOpsLV", "LoadHistoryOpsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.LoadHistoryOps.LoadHistoryOpsScreen.LoadHistoryOpsLV.class);
    }
    
    public LoadHistoryOpsLV_tb getLoadHistoryOpsLV_tb() {
      return getOrCreateProperty("LoadHistoryOpsLV_tb", "LoadHistoryOpsLV_tb", null, pcftest.LoadHistoryOps.LoadHistoryOpsScreen.LoadHistoryOpsLV_tb.class);
    }
    
    public LoadInsertSelectsLV getLoadInsertSelectsLV() {
      return getOrCreateProperty("LoadInsertSelectsLV", "LoadInsertSelectsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.LoadInsertSelectsLV.class);
    }
    
    public LoadInsertSelectsLV_tb getLoadInsertSelectsLV_tb() {
      return getOrCreateProperty("LoadInsertSelectsLV_tb", "LoadInsertSelectsLV_tb", null, pcftest.LoadHistoryOps.LoadHistoryOpsScreen.LoadInsertSelectsLV_tb.class);
    }
    
    public LoadIntegrityChecksLV getLoadIntegrityChecksLV() {
      return getOrCreateProperty("LoadIntegrityChecksLV", "LoadIntegrityChecksLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.LoadIntegrityChecksLV.class);
    }
    
    public LoadIntegrityChecksLV_tb getLoadIntegrityChecksLV_tb() {
      return getOrCreateProperty("LoadIntegrityChecksLV_tb", "LoadIntegrityChecksLV_tb", null, pcftest.LoadHistoryOps.LoadHistoryOpsScreen.LoadIntegrityChecksLV_tb.class);
    }
    
    public LoadStepsLV getLoadStepsLV() {
      return getOrCreateProperty("LoadStepsLV", "LoadStepsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.LoadStepsLV.class);
    }
    
    public LoadStepsLV_tb getLoadStepsLV_tb() {
      return getOrCreateProperty("LoadStepsLV_tb", "LoadStepsLV_tb", null, pcftest.LoadHistoryOps.LoadHistoryOpsScreen.LoadStepsLV_tb.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.LoadHistoryOps.LoadHistoryOpsScreen._msgs.class);
    }
    
    public refresh getrefresh() {
      return getOrCreateProperty("refresh", "refresh", null, pcftest.LoadHistoryOps.LoadHistoryOpsScreen.refresh.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/LoadHistoryOps.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CallbacksCardTab extends ClickableActionElement {
      public CallbacksCardTab(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/LoadHistoryOps.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class InsertSelectsCardTab extends ClickableActionElement {
      public InsertSelectsCardTab(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/LoadHistoryOps.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class IntegrityChecksCardTab extends ClickableActionElement {
      public IntegrityChecksCardTab(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/LoadHistoryOps.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class LoadCallbacksLV_tb extends PCFElement {
      public LoadCallbacksLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/LoadHistoryOps.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class LoadHistoryLV_tb extends PCFElement {
      public LoadHistoryLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/LoadHistoryOps.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class LoadHistoryOpsLV extends PCFElement {
      public LoadHistoryOpsLV(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      @SuppressWarnings(value = "unchecked")
      public IteratorEntriesWithPaging<entry> get_Entries() {
        return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.LoadHistoryOps.LoadHistoryOpsScreen.LoadHistoryOpsLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
      }
      
      public _ListPaging get_ListPaging() {
        return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.LoadHistoryOps.LoadHistoryOpsScreen.LoadHistoryOpsLV._ListPaging.class);
      }
      
      public affectedrowcountHeader getaffectedrowcountHeader() {
        return getOrCreateProperty("affectedrowcountHeader", "affectedrowcountHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.LoadHistoryOps.LoadHistoryOpsScreen.LoadHistoryOpsLV.affectedrowcountHeader.class);
      }
      
      public errorcountHeader geterrorcountHeader() {
        return getOrCreateProperty("errorcountHeader", "errorcountHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.LoadHistoryOps.LoadHistoryOpsScreen.LoadHistoryOpsLV.errorcountHeader.class);
      }
      
      public highestidHeader gethighestidHeader() {
        return getOrCreateProperty("highestidHeader", "highestidHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.LoadHistoryOps.LoadHistoryOpsScreen.LoadHistoryOpsLV.highestidHeader.class);
      }
      
      public lowestidHeader getlowestidHeader() {
        return getOrCreateProperty("lowestidHeader", "lowestidHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.LoadHistoryOps.LoadHistoryOpsScreen.LoadHistoryOpsLV.lowestidHeader.class);
      }
      
      public numCBHeader getnumCBHeader() {
        return getOrCreateProperty("numCBHeader", "numCBHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.LoadHistoryOps.LoadHistoryOpsScreen.LoadHistoryOpsLV.numCBHeader.class);
      }
      
      public numICHeader getnumICHeader() {
        return getOrCreateProperty("numICHeader", "numICHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.LoadHistoryOps.LoadHistoryOpsScreen.LoadHistoryOpsLV.numICHeader.class);
      }
      
      public numISHeader getnumISHeader() {
        return getOrCreateProperty("numISHeader", "numISHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.LoadHistoryOps.LoadHistoryOpsScreen.LoadHistoryOpsLV.numISHeader.class);
      }
      
      public opdurationHeader getopdurationHeader() {
        return getOrCreateProperty("opdurationHeader", "opdurationHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.LoadHistoryOps.LoadHistoryOpsScreen.LoadHistoryOpsLV.opdurationHeader.class);
      }
      
      public opendtimeHeader getopendtimeHeader() {
        return getOrCreateProperty("opendtimeHeader", "opendtimeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.LoadHistoryOps.LoadHistoryOpsScreen.LoadHistoryOpsLV.opendtimeHeader.class);
      }
      
      public opexecuteorderHeader getopexecuteorderHeader() {
        return getOrCreateProperty("opexecuteorderHeader", "opexecuteorderHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.LoadHistoryOps.LoadHistoryOpsScreen.LoadHistoryOpsLV.opexecuteorderHeader.class);
      }
      
      public opstarttimeHeader getopstarttimeHeader() {
        return getOrCreateProperty("opstarttimeHeader", "opstarttimeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.LoadHistoryOps.LoadHistoryOpsScreen.LoadHistoryOpsLV.opstarttimeHeader.class);
      }
      
      public tablenameHeader gettablenameHeader() {
        return getOrCreateProperty("tablenameHeader", "tablenameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.LoadHistoryOps.LoadHistoryOpsScreen.LoadHistoryOpsLV.tablenameHeader.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/LoadHistoryOps.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _ListPaging extends PagingElement {
        public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/LoadHistoryOps.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class affectedrowcountHeader extends ValueElement {
        public affectedrowcountHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/LoadHistoryOps.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class entry extends RowElement {
        public entry(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public IteratorEntryCheckboxElement get_Checkbox() {
          return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
        }
        
        public _Select get_Select() {
          return getOrCreateProperty("_Select", "_Select", null, pcftest.LoadHistoryOps.LoadHistoryOpsScreen.LoadHistoryOpsLV.entry._Select.class);
        }
        
        public _ViewDetail get_ViewDetail() {
          return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.LoadHistoryOps.LoadHistoryOpsScreen.LoadHistoryOpsLV.entry._ViewDetail.class);
        }
        
        public ValueElement getaffectedrowcount() {
          return getOrCreateProperty("affectedrowcount", "affectedrowcount", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement geterrorcount() {
          return getOrCreateProperty("errorcount", "errorcount", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement gethighestid() {
          return getOrCreateProperty("highestid", "highestid", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getlowestid() {
          return getOrCreateProperty("lowestid", "lowestid", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getnumCB() {
          return getOrCreateProperty("numCB", "numCB", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getnumIC() {
          return getOrCreateProperty("numIC", "numIC", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getnumIS() {
          return getOrCreateProperty("numIS", "numIS", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getopduration() {
          return getOrCreateProperty("opduration", "opduration", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getopendtime() {
          return getOrCreateProperty("opendtime", "opendtime", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getopexecuteorder() {
          return getOrCreateProperty("opexecuteorder", "opexecuteorder", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getopstarttime() {
          return getOrCreateProperty("opstarttime", "opstarttime", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement gettablename() {
          return getOrCreateProperty("tablename", "tablename", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/infopages/LoadHistoryOps.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class _Select extends SelectorCellElement {
          public _Select(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/infopages/LoadHistoryOps.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
      @Generated(comments = "config/web/pcf/tools/infopages/LoadHistoryOps.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class errorcountHeader extends ValueElement {
        public errorcountHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/LoadHistoryOps.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class highestidHeader extends ValueElement {
        public highestidHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/LoadHistoryOps.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class lowestidHeader extends ValueElement {
        public lowestidHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/LoadHistoryOps.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class numCBHeader extends ValueElement {
        public numCBHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/LoadHistoryOps.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class numICHeader extends ValueElement {
        public numICHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/LoadHistoryOps.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class numISHeader extends ValueElement {
        public numISHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/LoadHistoryOps.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class opdurationHeader extends ValueElement {
        public opdurationHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/LoadHistoryOps.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class opendtimeHeader extends ValueElement {
        public opendtimeHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/LoadHistoryOps.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class opexecuteorderHeader extends ValueElement {
        public opexecuteorderHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/LoadHistoryOps.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class opstarttimeHeader extends ValueElement {
        public opstarttimeHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/LoadHistoryOps.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class tablenameHeader extends ValueElement {
        public tablenameHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/LoadHistoryOps.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class LoadHistoryOpsLV_tb extends PCFElement {
      public LoadHistoryOpsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/LoadHistoryOps.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class LoadInsertSelectsLV_tb extends PCFElement {
      public LoadInsertSelectsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/LoadHistoryOps.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class LoadIntegrityChecksLV_tb extends PCFElement {
      public LoadIntegrityChecksLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/LoadHistoryOps.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class LoadStepsLV_tb extends PCFElement {
      public LoadStepsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/LoadHistoryOps.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _msgs extends MessagesElement {
      public _msgs(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/LoadHistoryOps.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/tools/infopages/LoadHistoryOps.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LoadHistoryOps_UpLink extends ClickableActionElement {
    public LoadHistoryOps_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/LoadHistoryOps.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/LoadHistoryOps.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}