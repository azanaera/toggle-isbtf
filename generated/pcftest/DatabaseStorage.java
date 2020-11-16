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
import pcftest.DatabaseStorage.DatabaseStorageScreen;
import pcftest.DatabaseStorage.DatabaseStorageScreen.DatabaseStorageDV_tb;
import pcftest.DatabaseStorage.DatabaseStorageScreen.Display;
import pcftest.DatabaseStorage.DatabaseStorageScreen._msgs;
import pcftest.DatabaseStorage.DatabaseStorageScreen.download;
import pcftest.DatabaseStorage.DatabaseStorageScreen.reloadData;
import pcftest.DatabaseStorage.DatabaseStorageScreen.tableAllLV;
import pcftest.DatabaseStorage.DatabaseStorageScreen.tableAllLV_tb;
import pcftest.DatabaseStorage.DatabaseStorageScreen.tableSelectionLV;
import pcftest.DatabaseStorage.DatabaseStorageScreen.tableSelectionLV_tb;
import pcftest.DatabaseStorage.DatabaseStorage_UpLink;
import pcftest.DatabaseStorage._Paging;
import pcftest.DatabaseStorage.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/infopages/DatabaseStorage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class DatabaseStorage extends PCFLocation {
  public final static String CHECKSUM = "333dfb4eb1ce89e8cee2ba65684bf03a";
  
  public DatabaseStorage(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("DatabaseStorage"));
  }
  
  public DatabaseStorageScreen getDatabaseStorageScreen() {
    return getOrCreateProperty("DatabaseStorageScreen", "DatabaseStorageScreen", null, pcftest.DatabaseStorage.DatabaseStorageScreen.class);
  }
  
  public DatabaseStorage_UpLink getDatabaseStorage_UpLink() {
    return getOrCreateProperty("DatabaseStorage_UpLink", "DatabaseStorage_UpLink", null, pcftest.DatabaseStorage.DatabaseStorage_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.DatabaseStorage._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.DatabaseStorage.__crumb__.class);
  }
  
  public InfoPages get_parent() {
    return getOrCreateProperty("_parent", pcftest.InfoPages.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/DatabaseStorage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DatabaseStorageScreen extends PCFElement {
    public DatabaseStorageScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public BooleanValueElement getAnalyzeAllTables() {
      return getOrCreateProperty("AnalyzeAllTables", "AnalyzeAllTables", null, gw.smoketest.platform.web.BooleanValueElement.class);
    }
    
    public BooleanValueElement getAnalyzeAllTablesForCompression() {
      return getOrCreateProperty("AnalyzeAllTablesForCompression", "AnalyzeAllTablesForCompression", null, gw.smoketest.platform.web.BooleanValueElement.class);
    }
    
    public SelectElement getAnalyzeTables() {
      return getOrCreateProperty("AnalyzeTables", "AnalyzeTables", null, gw.smoketest.platform.web.SelectElement.class);
    }
    
    public DatabaseStorageDV_AllAtOnce getDatabaseStorageDV_AllAtOnce() {
      return getOrCreateProperty("DatabaseStorageDV_AllAtOnce", "DatabaseStorageDV", null, pcftest.DatabaseStorageDV_AllAtOnce.class);
    }
    
    public DatabaseStorageDV_OneAtATime getDatabaseStorageDV_OneAtATime() {
      return getOrCreateProperty("DatabaseStorageDV_OneAtATime", "DatabaseStorageDV", null, pcftest.DatabaseStorageDV_OneAtATime.class);
    }
    
    public DatabaseStorageDV_tb getDatabaseStorageDV_tb() {
      return getOrCreateProperty("DatabaseStorageDV_tb", "DatabaseStorageDV_tb", null, pcftest.DatabaseStorage.DatabaseStorageScreen.DatabaseStorageDV_tb.class);
    }
    
    public Display getDisplay() {
      return getOrCreateProperty("Display", "Display", null, pcftest.DatabaseStorage.DatabaseStorageScreen.Display.class);
    }
    
    public BooleanValueElement getEstimateCompression() {
      return getOrCreateProperty("EstimateCompression", "EstimateCompression", null, gw.smoketest.platform.web.BooleanValueElement.class);
    }
    
    public SelectElement getEstimateCompressionTables() {
      return getOrCreateProperty("EstimateCompressionTables", "EstimateCompressionTables", null, gw.smoketest.platform.web.SelectElement.class);
    }
    
    public BooleanValueElement getIncludeCompressionReport() {
      return getOrCreateProperty("IncludeCompressionReport", "IncludeCompressionReport", null, gw.smoketest.platform.web.BooleanValueElement.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.DatabaseStorage.DatabaseStorageScreen._msgs.class);
    }
    
    public download getdownload() {
      return getOrCreateProperty("download", "download", null, pcftest.DatabaseStorage.DatabaseStorageScreen.download.class);
    }
    
    public SelectElement getmodeSelector() {
      return getOrCreateProperty("modeSelector", "modeSelector", null, gw.smoketest.platform.web.SelectElement.class);
    }
    
    public reloadData getreloadData() {
      return getOrCreateProperty("reloadData", "reloadData", null, pcftest.DatabaseStorage.DatabaseStorageScreen.reloadData.class);
    }
    
    public tableAllLV gettableAllLV() {
      return getOrCreateProperty("tableAllLV", "tableAllLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.DatabaseStorage.DatabaseStorageScreen.tableAllLV.class);
    }
    
    public tableAllLV_tb gettableAllLV_tb() {
      return getOrCreateProperty("tableAllLV_tb", "tableAllLV_tb", null, pcftest.DatabaseStorage.DatabaseStorageScreen.tableAllLV_tb.class);
    }
    
    public tableSelectionLV gettableSelectionLV() {
      return getOrCreateProperty("tableSelectionLV", "tableSelectionLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.DatabaseStorage.DatabaseStorageScreen.tableSelectionLV.class);
    }
    
    public tableSelectionLV_tb gettableSelectionLV_tb() {
      return getOrCreateProperty("tableSelectionLV_tb", "tableSelectionLV_tb", null, pcftest.DatabaseStorage.DatabaseStorageScreen.tableSelectionLV_tb.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/DatabaseStorage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class DatabaseStorageDV_tb extends PCFElement {
      public DatabaseStorageDV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/DatabaseStorage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Display extends ClickableActionElement {
      public Display(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/DatabaseStorage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _msgs extends MessagesElement {
      public _msgs(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/DatabaseStorage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class download extends ClickableActionElement {
      public download(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/DatabaseStorage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class reloadData extends ClickableActionElement {
      public reloadData(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/DatabaseStorage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class tableAllLV extends PCFElement {
      public tableAllLV(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      @SuppressWarnings(value = "unchecked")
      public IteratorEntriesWithPaging<pcftest.DatabaseStorage.DatabaseStorageScreen.tableAllLV.entry> get_Entries() {
        return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.DatabaseStorage.DatabaseStorageScreen.tableAllLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
      }
      
      public pcftest.DatabaseStorage.DatabaseStorageScreen.tableAllLV._ListPaging get_ListPaging() {
        return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.DatabaseStorage.DatabaseStorageScreen.tableAllLV._ListPaging.class);
      }
      
      public pcftest.DatabaseStorage.DatabaseStorageScreen.tableAllLV.rowHeader getrowHeader() {
        return getOrCreateProperty("rowHeader", "rowHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.DatabaseStorage.DatabaseStorageScreen.tableAllLV.rowHeader.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/DatabaseStorage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _ListPaging extends PagingElement {
        public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/DatabaseStorage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class entry extends RowElement {
        public entry(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public IteratorEntryCheckboxElement get_Checkbox() {
          return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
        }
        
        public pcftest.DatabaseStorage.DatabaseStorageScreen.tableAllLV.entry._Select get_Select() {
          return getOrCreateProperty("_Select", "_Select", null, pcftest.DatabaseStorage.DatabaseStorageScreen.tableAllLV.entry._Select.class);
        }
        
        public pcftest.DatabaseStorage.DatabaseStorageScreen.tableAllLV.entry._ViewDetail get_ViewDetail() {
          return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.DatabaseStorage.DatabaseStorageScreen.tableAllLV.entry._ViewDetail.class);
        }
        
        public ValueElement getrow() {
          return getOrCreateProperty("row", "row", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/infopages/DatabaseStorage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class _Select extends SelectorCellElement {
          public _Select(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/infopages/DatabaseStorage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
      @Generated(comments = "config/web/pcf/tools/infopages/DatabaseStorage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/tools/infopages/DatabaseStorage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class tableAllLV_tb extends PCFElement {
      public tableAllLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ValueElement getsearchStringTextBox() {
        return getOrCreateProperty("searchStringTextBox", "searchStringTextBox", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public pcftest.DatabaseStorage.DatabaseStorageScreen.tableAllLV_tb.useButton getuseButton() {
        return getOrCreateProperty("useButton", "useButton", null, pcftest.DatabaseStorage.DatabaseStorageScreen.tableAllLV_tb.useButton.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/DatabaseStorage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/tools/infopages/DatabaseStorage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class tableSelectionLV extends PCFElement {
      public tableSelectionLV(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      @SuppressWarnings(value = "unchecked")
      public IteratorEntriesWithPaging<pcftest.DatabaseStorage.DatabaseStorageScreen.tableSelectionLV.entry> get_Entries() {
        return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.DatabaseStorage.DatabaseStorageScreen.tableSelectionLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
      }
      
      public pcftest.DatabaseStorage.DatabaseStorageScreen.tableSelectionLV._ListPaging get_ListPaging() {
        return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.DatabaseStorage.DatabaseStorageScreen.tableSelectionLV._ListPaging.class);
      }
      
      public pcftest.DatabaseStorage.DatabaseStorageScreen.tableSelectionLV.rowHeader getrowHeader() {
        return getOrCreateProperty("rowHeader", "rowHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.DatabaseStorage.DatabaseStorageScreen.tableSelectionLV.rowHeader.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/DatabaseStorage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _ListPaging extends PagingElement {
        public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/DatabaseStorage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class entry extends RowElement {
        public entry(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public IteratorEntryCheckboxElement get_Checkbox() {
          return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
        }
        
        public pcftest.DatabaseStorage.DatabaseStorageScreen.tableSelectionLV.entry._Select get_Select() {
          return getOrCreateProperty("_Select", "_Select", null, pcftest.DatabaseStorage.DatabaseStorageScreen.tableSelectionLV.entry._Select.class);
        }
        
        public pcftest.DatabaseStorage.DatabaseStorageScreen.tableSelectionLV.entry._ViewDetail get_ViewDetail() {
          return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.DatabaseStorage.DatabaseStorageScreen.tableSelectionLV.entry._ViewDetail.class);
        }
        
        public ValueElement getrow() {
          return getOrCreateProperty("row", "row", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/infopages/DatabaseStorage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class _Select extends SelectorCellElement {
          public _Select(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/infopages/DatabaseStorage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
      @Generated(comments = "config/web/pcf/tools/infopages/DatabaseStorage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/tools/infopages/DatabaseStorage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class tableSelectionLV_tb extends PCFElement {
      public tableSelectionLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public pcftest.DatabaseStorage.DatabaseStorageScreen.tableSelectionLV_tb.useButton getuseButton() {
        return getOrCreateProperty("useButton", "useButton", null, pcftest.DatabaseStorage.DatabaseStorageScreen.tableSelectionLV_tb.useButton.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/DatabaseStorage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class useButton extends ClickableActionElement {
        public useButton(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/DatabaseStorage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DatabaseStorage_UpLink extends ClickableActionElement {
    public DatabaseStorage_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/DatabaseStorage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/DatabaseStorage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}