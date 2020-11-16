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
import pcftest.LoadCallbackResultsDetail.LoadCallbackResultsDetail_UpLink;
import pcftest.LoadCallbackResultsDetail.LoadCallbackReultsScreen;
import pcftest.LoadCallbackResultsDetail.LoadCallbackReultsScreen.LoadCallbackResultsLV;
import pcftest.LoadCallbackResultsDetail.LoadCallbackReultsScreen.LoadCallbackResultsLV._ListPaging;
import pcftest.LoadCallbackResultsDetail.LoadCallbackReultsScreen.LoadCallbackResultsLV.affectedrowcountHeader;
import pcftest.LoadCallbackResultsDetail.LoadCallbackReultsScreen.LoadCallbackResultsLV.entry;
import pcftest.LoadCallbackResultsDetail.LoadCallbackReultsScreen.LoadCallbackResultsLV.entry._Select;
import pcftest.LoadCallbackResultsDetail.LoadCallbackReultsScreen.LoadCallbackResultsLV.entry._ViewDetail;
import pcftest.LoadCallbackResultsDetail.LoadCallbackReultsScreen.LoadCallbackResultsLV.executionorderHeader;
import pcftest.LoadCallbackResultsDetail.LoadCallbackReultsScreen.LoadCallbackResultsLV.lcrqueryHeader;
import pcftest.LoadCallbackResultsDetail.LoadCallbackReultsScreen.LoadCallbackResultsLV.nameHeader;
import pcftest.LoadCallbackResultsDetail.LoadCallbackReultsScreen.LoadCallbackResultsLV.opdurationHeader;
import pcftest.LoadCallbackResultsDetail.LoadCallbackReultsScreen.LoadCallbackResultsLV.opendtimeHeader;
import pcftest.LoadCallbackResultsDetail.LoadCallbackReultsScreen.LoadCallbackResultsLV.opstarttimeHeader;
import pcftest.LoadCallbackResultsDetail.LoadCallbackReultsScreen.LoadCallbackResultsLV_tb;
import pcftest.LoadCallbackResultsDetail.LoadCallbackReultsScreen.LoadCallbacksLV_tb;
import pcftest.LoadCallbackResultsDetail.LoadCallbackReultsScreen.LoadHistoryLV_tb;
import pcftest.LoadCallbackResultsDetail.LoadCallbackReultsScreen._msgs;
import pcftest.LoadCallbackResultsDetail.LoadCallbackReultsScreen.refresh;
import pcftest.LoadCallbackResultsDetail._Paging;
import pcftest.LoadCallbackResultsDetail.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/infopages/LoadCallbackResultsDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class LoadCallbackResultsDetail extends PCFLocation {
  public final static String CHECKSUM = "0a709a6752dcd3d768beba55c3142e7b";
  
  public LoadCallbackResultsDetail(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("LoadCallbackResultsDetail"));
  }
  
  public LoadCallbackResultsDetail_UpLink getLoadCallbackResultsDetail_UpLink() {
    return getOrCreateProperty("LoadCallbackResultsDetail_UpLink", "LoadCallbackResultsDetail_UpLink", null, pcftest.LoadCallbackResultsDetail.LoadCallbackResultsDetail_UpLink.class);
  }
  
  public LoadCallbackReultsScreen getLoadCallbackReultsScreen() {
    return getOrCreateProperty("LoadCallbackReultsScreen", "LoadCallbackReultsScreen", null, pcftest.LoadCallbackResultsDetail.LoadCallbackReultsScreen.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.LoadCallbackResultsDetail._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.LoadCallbackResultsDetail.__crumb__.class);
  }
  
  public LoadHistoryDetail get_parent() {
    return getOrCreateProperty("_parent", pcftest.LoadHistoryDetail.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/LoadCallbackResultsDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LoadCallbackResultsDetail_UpLink extends ClickableActionElement {
    public LoadCallbackResultsDetail_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/LoadCallbackResultsDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LoadCallbackReultsScreen extends PCFElement {
    public LoadCallbackReultsScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public LoadCallbackResultsLV getLoadCallbackResultsLV() {
      return getOrCreateProperty("LoadCallbackResultsLV", "LoadCallbackResultsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.LoadCallbackResultsDetail.LoadCallbackReultsScreen.LoadCallbackResultsLV.class);
    }
    
    public LoadCallbackResultsLV_tb getLoadCallbackResultsLV_tb() {
      return getOrCreateProperty("LoadCallbackResultsLV_tb", "LoadCallbackResultsLV_tb", null, pcftest.LoadCallbackResultsDetail.LoadCallbackReultsScreen.LoadCallbackResultsLV_tb.class);
    }
    
    public LoadCallbacksLV getLoadCallbacksLV() {
      return getOrCreateProperty("LoadCallbacksLV", "LoadCallbacksLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.LoadCallbacksLV.class);
    }
    
    public LoadCallbacksLV_tb getLoadCallbacksLV_tb() {
      return getOrCreateProperty("LoadCallbacksLV_tb", "LoadCallbacksLV_tb", null, pcftest.LoadCallbackResultsDetail.LoadCallbackReultsScreen.LoadCallbacksLV_tb.class);
    }
    
    public LoadHistoryLV getLoadHistoryLV() {
      return getOrCreateProperty("LoadHistoryLV", "LoadHistoryLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.LoadHistoryLV.class);
    }
    
    public LoadHistoryLV_tb getLoadHistoryLV_tb() {
      return getOrCreateProperty("LoadHistoryLV_tb", "LoadHistoryLV_tb", null, pcftest.LoadCallbackResultsDetail.LoadCallbackReultsScreen.LoadHistoryLV_tb.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.LoadCallbackResultsDetail.LoadCallbackReultsScreen._msgs.class);
    }
    
    public refresh getrefresh() {
      return getOrCreateProperty("refresh", "refresh", null, pcftest.LoadCallbackResultsDetail.LoadCallbackReultsScreen.refresh.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/LoadCallbackResultsDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class LoadCallbackResultsLV extends PCFElement {
      public LoadCallbackResultsLV(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      @SuppressWarnings(value = "unchecked")
      public IteratorEntriesWithPaging<entry> get_Entries() {
        return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.LoadCallbackResultsDetail.LoadCallbackReultsScreen.LoadCallbackResultsLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
      }
      
      public _ListPaging get_ListPaging() {
        return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.LoadCallbackResultsDetail.LoadCallbackReultsScreen.LoadCallbackResultsLV._ListPaging.class);
      }
      
      public affectedrowcountHeader getaffectedrowcountHeader() {
        return getOrCreateProperty("affectedrowcountHeader", "affectedrowcountHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.LoadCallbackResultsDetail.LoadCallbackReultsScreen.LoadCallbackResultsLV.affectedrowcountHeader.class);
      }
      
      public executionorderHeader getexecutionorderHeader() {
        return getOrCreateProperty("executionorderHeader", "executionorderHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.LoadCallbackResultsDetail.LoadCallbackReultsScreen.LoadCallbackResultsLV.executionorderHeader.class);
      }
      
      public lcrqueryHeader getlcrqueryHeader() {
        return getOrCreateProperty("lcrqueryHeader", "lcrqueryHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.LoadCallbackResultsDetail.LoadCallbackReultsScreen.LoadCallbackResultsLV.lcrqueryHeader.class);
      }
      
      public nameHeader getnameHeader() {
        return getOrCreateProperty("nameHeader", "nameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.LoadCallbackResultsDetail.LoadCallbackReultsScreen.LoadCallbackResultsLV.nameHeader.class);
      }
      
      public opdurationHeader getopdurationHeader() {
        return getOrCreateProperty("opdurationHeader", "opdurationHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.LoadCallbackResultsDetail.LoadCallbackReultsScreen.LoadCallbackResultsLV.opdurationHeader.class);
      }
      
      public opendtimeHeader getopendtimeHeader() {
        return getOrCreateProperty("opendtimeHeader", "opendtimeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.LoadCallbackResultsDetail.LoadCallbackReultsScreen.LoadCallbackResultsLV.opendtimeHeader.class);
      }
      
      public opstarttimeHeader getopstarttimeHeader() {
        return getOrCreateProperty("opstarttimeHeader", "opstarttimeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.LoadCallbackResultsDetail.LoadCallbackReultsScreen.LoadCallbackResultsLV.opstarttimeHeader.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/LoadCallbackResultsDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _ListPaging extends PagingElement {
        public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/LoadCallbackResultsDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class affectedrowcountHeader extends ValueElement {
        public affectedrowcountHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/LoadCallbackResultsDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class entry extends RowElement {
        public entry(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public IteratorEntryCheckboxElement get_Checkbox() {
          return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
        }
        
        public _Select get_Select() {
          return getOrCreateProperty("_Select", "_Select", null, pcftest.LoadCallbackResultsDetail.LoadCallbackReultsScreen.LoadCallbackResultsLV.entry._Select.class);
        }
        
        public _ViewDetail get_ViewDetail() {
          return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.LoadCallbackResultsDetail.LoadCallbackReultsScreen.LoadCallbackResultsLV.entry._ViewDetail.class);
        }
        
        public ValueElement getaffectedrowcount() {
          return getOrCreateProperty("affectedrowcount", "affectedrowcount", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getexecutionorder() {
          return getOrCreateProperty("executionorder", "executionorder", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getlcrquery() {
          return getOrCreateProperty("lcrquery", "lcrquery", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getname() {
          return getOrCreateProperty("name", "name", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getopduration() {
          return getOrCreateProperty("opduration", "opduration", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getopendtime() {
          return getOrCreateProperty("opendtime", "opendtime", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getopstarttime() {
          return getOrCreateProperty("opstarttime", "opstarttime", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/infopages/LoadCallbackResultsDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class _Select extends SelectorCellElement {
          public _Select(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/infopages/LoadCallbackResultsDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
      @Generated(comments = "config/web/pcf/tools/infopages/LoadCallbackResultsDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class executionorderHeader extends ValueElement {
        public executionorderHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/LoadCallbackResultsDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class lcrqueryHeader extends ValueElement {
        public lcrqueryHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/LoadCallbackResultsDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class nameHeader extends ValueElement {
        public nameHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/LoadCallbackResultsDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class opdurationHeader extends ValueElement {
        public opdurationHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/LoadCallbackResultsDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class opendtimeHeader extends ValueElement {
        public opendtimeHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/LoadCallbackResultsDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class opstarttimeHeader extends ValueElement {
        public opstarttimeHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/LoadCallbackResultsDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class LoadCallbackResultsLV_tb extends PCFElement {
      public LoadCallbackResultsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/LoadCallbackResultsDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class LoadCallbacksLV_tb extends PCFElement {
      public LoadCallbacksLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/LoadCallbackResultsDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class LoadHistoryLV_tb extends PCFElement {
      public LoadHistoryLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/LoadCallbackResultsDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _msgs extends MessagesElement {
      public _msgs(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/LoadCallbackResultsDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/tools/infopages/LoadCallbackResultsDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/LoadCallbackResultsDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}