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
import pcftest.LoadErrorsInfo.LoadErrorsInfo_UpLink;
import pcftest.LoadErrorsInfo.LoadErrorsScreen;
import pcftest.LoadErrorsInfo.LoadErrorsScreen.DownloadParms;
import pcftest.LoadErrorsInfo.LoadErrorsScreen.ListViewPanel0LV;
import pcftest.LoadErrorsInfo.LoadErrorsScreen.ListViewPanel0LV.Cell0Header;
import pcftest.LoadErrorsInfo.LoadErrorsScreen.ListViewPanel0LV.countHeader;
import pcftest.LoadErrorsInfo.LoadErrorsScreen.ListViewPanel0LV.errormessageHeader;
import pcftest.LoadErrorsInfo.LoadErrorsScreen.ListViewPanel0LV.errortypeHeader;
import pcftest.LoadErrorsInfo.LoadErrorsScreen.ListViewPanel0LV.queryHeader;
import pcftest.LoadErrorsInfo.LoadErrorsScreen.ListViewPanel0LV.tablenameHeader;
import pcftest.LoadErrorsInfo.LoadErrorsScreen.LoadErrorDetailsCV;
import pcftest.LoadErrorsInfo.LoadErrorsScreen.LoadErrorDetailsCV.LoadErrorsCardTab;
import pcftest.LoadErrorsInfo.LoadErrorsScreen.LoadErrorDetailsCV.loadErrorRowsLV;
import pcftest.LoadErrorsInfo.LoadErrorsScreen.LoadErrorDetailsCV.loadErrorRowsLV.luwidHeader;
import pcftest.LoadErrorsInfo.LoadErrorsScreen.LoadErrorDetailsCV.loadErrorRowsLV.rowNumberHeader;
import pcftest.LoadErrorsInfo.LoadErrorsScreen.LoadErrorDetailsCV.loadErrorRowsLV_tb;
import pcftest.LoadErrorsInfo.LoadErrorsScreen._msgs;
import pcftest.LoadErrorsInfo._Paging;
import pcftest.LoadErrorsInfo.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/infopages/LoadErrorsInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class LoadErrorsInfo extends PCFLocation {
  public final static String CHECKSUM = "3f394ddc25ae8d1777855dc9bf0bd7f4";
  
  public LoadErrorsInfo(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("LoadErrorsInfo"));
  }
  
  public LoadErrorsInfo_UpLink getLoadErrorsInfo_UpLink() {
    return getOrCreateProperty("LoadErrorsInfo_UpLink", "LoadErrorsInfo_UpLink", null, pcftest.LoadErrorsInfo.LoadErrorsInfo_UpLink.class);
  }
  
  public LoadErrorsScreen getLoadErrorsScreen() {
    return getOrCreateProperty("LoadErrorsScreen", "LoadErrorsScreen", null, pcftest.LoadErrorsInfo.LoadErrorsScreen.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.LoadErrorsInfo._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.LoadErrorsInfo.__crumb__.class);
  }
  
  public InfoPages get_parent() {
    return getOrCreateProperty("_parent", pcftest.InfoPages.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/LoadErrorsInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LoadErrorsInfo_UpLink extends ClickableActionElement {
    public LoadErrorsInfo_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/LoadErrorsInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LoadErrorsScreen extends PCFElement {
    public LoadErrorsScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public DownloadParms getDownloadParms() {
      return getOrCreateProperty("DownloadParms", "DownloadParms", null, pcftest.LoadErrorsInfo.LoadErrorsScreen.DownloadParms.class);
    }
    
    public ListViewPanel0LV getListViewPanel0LV() {
      return getOrCreateProperty("ListViewPanel0LV", "ListViewPanel0LV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.LoadErrorsInfo.LoadErrorsScreen.ListViewPanel0LV.class);
    }
    
    public LoadErrorDetailsCV getLoadErrorDetailsCV() {
      return getOrCreateProperty("LoadErrorDetailsCV", "LoadErrorDetailsCV", null, pcftest.LoadErrorsInfo.LoadErrorsScreen.LoadErrorDetailsCV.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.LoadErrorsInfo.LoadErrorsScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/LoadErrorsInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class DownloadParms extends ValueElement {
      public DownloadParms(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/LoadErrorsInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ListViewPanel0LV extends PCFElement {
      public ListViewPanel0LV(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public Cell0Header getCell0Header() {
        return getOrCreateProperty("Cell0Header", "Cell0Header", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.LoadErrorsInfo.LoadErrorsScreen.ListViewPanel0LV.Cell0Header.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      @SuppressWarnings(value = "unchecked")
      public IteratorEntriesWithPaging<pcftest.LoadErrorsInfo.LoadErrorsScreen.ListViewPanel0LV.entry> get_Entries() {
        return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.LoadErrorsInfo.LoadErrorsScreen.ListViewPanel0LV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
      }
      
      public pcftest.LoadErrorsInfo.LoadErrorsScreen.ListViewPanel0LV._ListPaging get_ListPaging() {
        return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.LoadErrorsInfo.LoadErrorsScreen.ListViewPanel0LV._ListPaging.class);
      }
      
      public countHeader getcountHeader() {
        return getOrCreateProperty("countHeader", "countHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.LoadErrorsInfo.LoadErrorsScreen.ListViewPanel0LV.countHeader.class);
      }
      
      public errormessageHeader geterrormessageHeader() {
        return getOrCreateProperty("errormessageHeader", "errormessageHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.LoadErrorsInfo.LoadErrorsScreen.ListViewPanel0LV.errormessageHeader.class);
      }
      
      public errortypeHeader geterrortypeHeader() {
        return getOrCreateProperty("errortypeHeader", "errortypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.LoadErrorsInfo.LoadErrorsScreen.ListViewPanel0LV.errortypeHeader.class);
      }
      
      public queryHeader getqueryHeader() {
        return getOrCreateProperty("queryHeader", "queryHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.LoadErrorsInfo.LoadErrorsScreen.ListViewPanel0LV.queryHeader.class);
      }
      
      public tablenameHeader gettablenameHeader() {
        return getOrCreateProperty("tablenameHeader", "tablenameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.LoadErrorsInfo.LoadErrorsScreen.ListViewPanel0LV.tablenameHeader.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/LoadErrorsInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Cell0Header extends ValueElement {
        public Cell0Header(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/LoadErrorsInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _ListPaging extends PagingElement {
        public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/LoadErrorsInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class countHeader extends ValueElement {
        public countHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/LoadErrorsInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class entry extends RowElement {
        public entry(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public BooleanValueElement getCell0() {
          return getOrCreateProperty("Cell0", "Cell0", null, gw.smoketest.platform.web.BooleanValueElement.class);
        }
        
        public IteratorEntryCheckboxElement get_Checkbox() {
          return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
        }
        
        public pcftest.LoadErrorsInfo.LoadErrorsScreen.ListViewPanel0LV.entry._Select get_Select() {
          return getOrCreateProperty("_Select", "_Select", null, pcftest.LoadErrorsInfo.LoadErrorsScreen.ListViewPanel0LV.entry._Select.class);
        }
        
        public pcftest.LoadErrorsInfo.LoadErrorsScreen.ListViewPanel0LV.entry._ViewDetail get_ViewDetail() {
          return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.LoadErrorsInfo.LoadErrorsScreen.ListViewPanel0LV.entry._ViewDetail.class);
        }
        
        public ValueElement getcount() {
          return getOrCreateProperty("count", "count", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement geterrormessage() {
          return getOrCreateProperty("errormessage", "errormessage", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement geterrortype() {
          return getOrCreateProperty("errortype", "errortype", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getquery() {
          return getOrCreateProperty("query", "query", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement gettablename() {
          return getOrCreateProperty("tablename", "tablename", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/infopages/LoadErrorsInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class _Select extends SelectorCellElement {
          public _Select(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/infopages/LoadErrorsInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
      @Generated(comments = "config/web/pcf/tools/infopages/LoadErrorsInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class errormessageHeader extends ValueElement {
        public errormessageHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/LoadErrorsInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class errortypeHeader extends ValueElement {
        public errortypeHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/LoadErrorsInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class queryHeader extends ValueElement {
        public queryHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/LoadErrorsInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/tools/infopages/LoadErrorsInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class LoadErrorDetailsCV extends PCFElement {
      public LoadErrorDetailsCV(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public LoadErrorsCardTab getLoadErrorsCardTab() {
        return getOrCreateProperty("LoadErrorsCardTab", "LoadErrorsCardTab", null, pcftest.LoadErrorsInfo.LoadErrorsScreen.LoadErrorDetailsCV.LoadErrorsCardTab.class);
      }
      
      public loadErrorRowsLV getloadErrorRowsLV() {
        return getOrCreateProperty("loadErrorRowsLV", "loadErrorRowsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.LoadErrorsInfo.LoadErrorsScreen.LoadErrorDetailsCV.loadErrorRowsLV.class);
      }
      
      public loadErrorRowsLV_tb getloadErrorRowsLV_tb() {
        return getOrCreateProperty("loadErrorRowsLV_tb", "loadErrorRowsLV_tb", null, pcftest.LoadErrorsInfo.LoadErrorsScreen.LoadErrorDetailsCV.loadErrorRowsLV_tb.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/LoadErrorsInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class LoadErrorsCardTab extends ClickableActionElement {
        public LoadErrorsCardTab(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/LoadErrorsInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class loadErrorRowsLV extends PCFElement {
        public loadErrorRowsLV(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public IteratorEntryCheckboxElement get_Checkbox() {
          return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
        }
        
        @SuppressWarnings(value = "unchecked")
        public IteratorEntriesWithPaging<pcftest.LoadErrorsInfo.LoadErrorsScreen.LoadErrorDetailsCV.loadErrorRowsLV.entry> get_Entries() {
          return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.LoadErrorsInfo.LoadErrorsScreen.LoadErrorDetailsCV.loadErrorRowsLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
        }
        
        public pcftest.LoadErrorsInfo.LoadErrorsScreen.LoadErrorDetailsCV.loadErrorRowsLV._ListPaging get_ListPaging() {
          return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.LoadErrorsInfo.LoadErrorsScreen.LoadErrorDetailsCV.loadErrorRowsLV._ListPaging.class);
        }
        
        public luwidHeader getluwidHeader() {
          return getOrCreateProperty("luwidHeader", "luwidHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.LoadErrorsInfo.LoadErrorsScreen.LoadErrorDetailsCV.loadErrorRowsLV.luwidHeader.class);
        }
        
        public rowNumberHeader getrowNumberHeader() {
          return getOrCreateProperty("rowNumberHeader", "rowNumberHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.LoadErrorsInfo.LoadErrorsScreen.LoadErrorDetailsCV.loadErrorRowsLV.rowNumberHeader.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/infopages/LoadErrorsInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class _ListPaging extends PagingElement {
          public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/infopages/LoadErrorsInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class entry extends RowElement {
          public entry(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public IteratorEntryCheckboxElement get_Checkbox() {
            return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
          }
          
          public pcftest.LoadErrorsInfo.LoadErrorsScreen.LoadErrorDetailsCV.loadErrorRowsLV.entry._Select get_Select() {
            return getOrCreateProperty("_Select", "_Select", null, pcftest.LoadErrorsInfo.LoadErrorsScreen.LoadErrorDetailsCV.loadErrorRowsLV.entry._Select.class);
          }
          
          public pcftest.LoadErrorsInfo.LoadErrorsScreen.LoadErrorDetailsCV.loadErrorRowsLV.entry._ViewDetail get_ViewDetail() {
            return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.LoadErrorsInfo.LoadErrorsScreen.LoadErrorDetailsCV.loadErrorRowsLV.entry._ViewDetail.class);
          }
          
          public ValueElement getluwid() {
            return getOrCreateProperty("luwid", "luwid", null, gw.smoketest.platform.web.ValueElement.class);
          }
          
          public ValueElement getrowNumber() {
            return getOrCreateProperty("rowNumber", "rowNumber", null, gw.smoketest.platform.web.ValueElement.class);
          }
          
          @SimplePropertyProcessing
          @Generated(comments = "config/web/pcf/tools/infopages/LoadErrorsInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
          public static class _Select extends SelectorCellElement {
            public _Select(ISmokeTest helper, PCFElementId componentId)  {
              super(helper, componentId);
            }
            
            public PCFLocation click() {
              return clickThis(gw.smoketest.platform.web.PCFLocation.class);
            }
            
            
          }
          
          @SimplePropertyProcessing
          @Generated(comments = "config/web/pcf/tools/infopages/LoadErrorsInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
        @Generated(comments = "config/web/pcf/tools/infopages/LoadErrorsInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class luwidHeader extends ValueElement {
          public luwidHeader(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/infopages/LoadErrorsInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class rowNumberHeader extends ValueElement {
          public rowNumberHeader(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/LoadErrorsInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class loadErrorRowsLV_tb extends PCFElement {
        public loadErrorRowsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/LoadErrorsInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/tools/infopages/LoadErrorsInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/LoadErrorsInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}