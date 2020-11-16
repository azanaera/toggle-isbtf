package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.IteratorEntriesWithPaging;
import gw.smoketest.platform.web.IteratorEntryCheckboxElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.PagingElement;
import gw.smoketest.platform.web.RowElement;
import gw.smoketest.platform.web.SelectorCellElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.LoadEncryptTable.EncryptChunkDV;
import pcftest.LoadEncryptTable.EncryptChunkDV.EncryptChunkLV;
import pcftest.LoadEncryptTable.EncryptChunkDV.EncryptChunkLV.ChunkSizeCellHeader;
import pcftest.LoadEncryptTable.EncryptChunkDV.EncryptChunkLV_tb;
import pcftest.LoadEncryptTable.TableEncryptLV;
import pcftest.LoadEncryptTable.TableEncryptLV.geSizeOfTimedChuckHeader;
import pcftest.LoadEncryptTable.TableEncryptLV.teAffectedRowCountHeader;
import pcftest.LoadEncryptTable.TableEncryptLV.teEncryptColsHeader;
import pcftest.LoadEncryptTable.TableEncryptLV.teSelectStmtHeader;
import pcftest.LoadEncryptTable.TableEncryptLV.teTableNameHeader;
import pcftest.LoadEncryptTable.TableEncryptLV.teUpdateStmtHeader;
import pcftest.LoadEncryptTable.TableEncryptLV_tb;
import pcftest.LoadEncryptTable.encryptChunksCardTab;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/infopages/LoadEncryptTable.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class LoadEncryptTable extends PCFElement {
  public final static String CHECKSUM = "76560dee00875eef547f56adb128f720";
  
  public LoadEncryptTable(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public EncryptChunkDV getEncryptChunkDV() {
    return getOrCreateProperty("EncryptChunkDV", "EncryptChunkDV", null, pcftest.LoadEncryptTable.EncryptChunkDV.class);
  }
  
  public TableEncryptLV getTableEncryptLV() {
    return getOrCreateProperty("TableEncryptLV", "TableEncryptLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.LoadEncryptTable.TableEncryptLV.class);
  }
  
  public TableEncryptLV_tb getTableEncryptLV_tb() {
    return getOrCreateProperty("TableEncryptLV_tb", "TableEncryptLV_tb", null, pcftest.LoadEncryptTable.TableEncryptLV_tb.class);
  }
  
  public encryptChunksCardTab getencryptChunksCardTab() {
    return getOrCreateProperty("encryptChunksCardTab", "encryptChunksCardTab", null, pcftest.LoadEncryptTable.encryptChunksCardTab.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/LoadEncryptTable.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EncryptChunkDV extends DetailViewElement {
    public EncryptChunkDV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public EncryptChunkLV getEncryptChunkLV() {
      return getOrCreateProperty("EncryptChunkLV", "EncryptChunkLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.LoadEncryptTable.EncryptChunkDV.EncryptChunkLV.class);
    }
    
    public EncryptChunkLV_tb getEncryptChunkLV_tb() {
      return getOrCreateProperty("EncryptChunkLV_tb", "EncryptChunkLV_tb", null, pcftest.LoadEncryptTable.EncryptChunkDV.EncryptChunkLV_tb.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/LoadEncryptTable.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class EncryptChunkLV extends PCFElement {
      public EncryptChunkLV(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ChunkSizeCellHeader getChunkSizeCellHeader() {
        return getOrCreateProperty("ChunkSizeCellHeader", "ChunkSizeCellHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.LoadEncryptTable.EncryptChunkDV.EncryptChunkLV.ChunkSizeCellHeader.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      @SuppressWarnings(value = "unchecked")
      public IteratorEntriesWithPaging<pcftest.LoadEncryptTable.EncryptChunkDV.EncryptChunkLV.entry> get_Entries() {
        return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.LoadEncryptTable.EncryptChunkDV.EncryptChunkLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
      }
      
      public pcftest.LoadEncryptTable.EncryptChunkDV.EncryptChunkLV._ListPaging get_ListPaging() {
        return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.LoadEncryptTable.EncryptChunkDV.EncryptChunkLV._ListPaging.class);
      }
      
      public pcftest.LoadEncryptTable.EncryptChunkDV.EncryptChunkLV.teDurationHeader getteDurationHeader() {
        return getOrCreateProperty("teDurationHeader", "teDurationHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.LoadEncryptTable.EncryptChunkDV.EncryptChunkLV.teDurationHeader.class);
      }
      
      public pcftest.LoadEncryptTable.EncryptChunkDV.EncryptChunkLV.teEndTimeHeader getteEndTimeHeader() {
        return getOrCreateProperty("teEndTimeHeader", "teEndTimeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.LoadEncryptTable.EncryptChunkDV.EncryptChunkLV.teEndTimeHeader.class);
      }
      
      public pcftest.LoadEncryptTable.EncryptChunkDV.EncryptChunkLV.teStartTimeHeader getteStartTimeHeader() {
        return getOrCreateProperty("teStartTimeHeader", "teStartTimeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.LoadEncryptTable.EncryptChunkDV.EncryptChunkLV.teStartTimeHeader.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/LoadEncryptTable.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ChunkSizeCellHeader extends ValueElement {
        public ChunkSizeCellHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/LoadEncryptTable.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _ListPaging extends PagingElement {
        public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/LoadEncryptTable.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class entry extends RowElement {
        public entry(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public ValueElement getChunkSizeCell() {
          return getOrCreateProperty("ChunkSizeCell", "ChunkSizeCell", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public IteratorEntryCheckboxElement get_Checkbox() {
          return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
        }
        
        public pcftest.LoadEncryptTable.EncryptChunkDV.EncryptChunkLV.entry._Select get_Select() {
          return getOrCreateProperty("_Select", "_Select", null, pcftest.LoadEncryptTable.EncryptChunkDV.EncryptChunkLV.entry._Select.class);
        }
        
        public pcftest.LoadEncryptTable.EncryptChunkDV.EncryptChunkLV.entry._ViewDetail get_ViewDetail() {
          return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.LoadEncryptTable.EncryptChunkDV.EncryptChunkLV.entry._ViewDetail.class);
        }
        
        public ValueElement getteDuration() {
          return getOrCreateProperty("teDuration", "teDuration", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getteEndTime() {
          return getOrCreateProperty("teEndTime", "teEndTime", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getteStartTime() {
          return getOrCreateProperty("teStartTime", "teStartTime", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/infopages/LoadEncryptTable.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class _Select extends SelectorCellElement {
          public _Select(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/infopages/LoadEncryptTable.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
      @Generated(comments = "config/web/pcf/tools/infopages/LoadEncryptTable.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class teDurationHeader extends ValueElement {
        public teDurationHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/LoadEncryptTable.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class teEndTimeHeader extends ValueElement {
        public teEndTimeHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/LoadEncryptTable.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class teStartTimeHeader extends ValueElement {
        public teStartTimeHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/LoadEncryptTable.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class EncryptChunkLV_tb extends PCFElement {
      public EncryptChunkLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/LoadEncryptTable.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TableEncryptLV extends PCFElement {
    public TableEncryptLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<pcftest.LoadEncryptTable.TableEncryptLV.entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.LoadEncryptTable.TableEncryptLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public pcftest.LoadEncryptTable.TableEncryptLV._ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.LoadEncryptTable.TableEncryptLV._ListPaging.class);
    }
    
    public geSizeOfTimedChuckHeader getgeSizeOfTimedChuckHeader() {
      return getOrCreateProperty("geSizeOfTimedChuckHeader", "geSizeOfTimedChuckHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.LoadEncryptTable.TableEncryptLV.geSizeOfTimedChuckHeader.class);
    }
    
    public teAffectedRowCountHeader getteAffectedRowCountHeader() {
      return getOrCreateProperty("teAffectedRowCountHeader", "teAffectedRowCountHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.LoadEncryptTable.TableEncryptLV.teAffectedRowCountHeader.class);
    }
    
    public pcftest.LoadEncryptTable.TableEncryptLV.teDurationHeader getteDurationHeader() {
      return getOrCreateProperty("teDurationHeader", "teDurationHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.LoadEncryptTable.TableEncryptLV.teDurationHeader.class);
    }
    
    public teEncryptColsHeader getteEncryptColsHeader() {
      return getOrCreateProperty("teEncryptColsHeader", "teEncryptColsHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.LoadEncryptTable.TableEncryptLV.teEncryptColsHeader.class);
    }
    
    public pcftest.LoadEncryptTable.TableEncryptLV.teEndTimeHeader getteEndTimeHeader() {
      return getOrCreateProperty("teEndTimeHeader", "teEndTimeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.LoadEncryptTable.TableEncryptLV.teEndTimeHeader.class);
    }
    
    public teSelectStmtHeader getteSelectStmtHeader() {
      return getOrCreateProperty("teSelectStmtHeader", "teSelectStmtHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.LoadEncryptTable.TableEncryptLV.teSelectStmtHeader.class);
    }
    
    public pcftest.LoadEncryptTable.TableEncryptLV.teStartTimeHeader getteStartTimeHeader() {
      return getOrCreateProperty("teStartTimeHeader", "teStartTimeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.LoadEncryptTable.TableEncryptLV.teStartTimeHeader.class);
    }
    
    public teTableNameHeader getteTableNameHeader() {
      return getOrCreateProperty("teTableNameHeader", "teTableNameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.LoadEncryptTable.TableEncryptLV.teTableNameHeader.class);
    }
    
    public teUpdateStmtHeader getteUpdateStmtHeader() {
      return getOrCreateProperty("teUpdateStmtHeader", "teUpdateStmtHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.LoadEncryptTable.TableEncryptLV.teUpdateStmtHeader.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/LoadEncryptTable.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/LoadEncryptTable.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends RowElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      public pcftest.LoadEncryptTable.TableEncryptLV.entry._Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.LoadEncryptTable.TableEncryptLV.entry._Select.class);
      }
      
      public pcftest.LoadEncryptTable.TableEncryptLV.entry._ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.LoadEncryptTable.TableEncryptLV.entry._ViewDetail.class);
      }
      
      public ValueElement getgeSizeOfTimedChuck() {
        return getOrCreateProperty("geSizeOfTimedChuck", "geSizeOfTimedChuck", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getteAffectedRowCount() {
        return getOrCreateProperty("teAffectedRowCount", "teAffectedRowCount", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getteDuration() {
        return getOrCreateProperty("teDuration", "teDuration", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getteEncryptCols() {
        return getOrCreateProperty("teEncryptCols", "teEncryptCols", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getteEndTime() {
        return getOrCreateProperty("teEndTime", "teEndTime", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getteSelectStmt() {
        return getOrCreateProperty("teSelectStmt", "teSelectStmt", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getteStartTime() {
        return getOrCreateProperty("teStartTime", "teStartTime", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getteTableName() {
        return getOrCreateProperty("teTableName", "teTableName", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getteUpdateStmt() {
        return getOrCreateProperty("teUpdateStmt", "teUpdateStmt", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/LoadEncryptTable.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/LoadEncryptTable.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/tools/infopages/LoadEncryptTable.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class geSizeOfTimedChuckHeader extends ValueElement {
      public geSizeOfTimedChuckHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/LoadEncryptTable.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class teAffectedRowCountHeader extends ValueElement {
      public teAffectedRowCountHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/LoadEncryptTable.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class teDurationHeader extends ValueElement {
      public teDurationHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/LoadEncryptTable.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class teEncryptColsHeader extends ValueElement {
      public teEncryptColsHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/LoadEncryptTable.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class teEndTimeHeader extends ValueElement {
      public teEndTimeHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/LoadEncryptTable.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class teSelectStmtHeader extends ValueElement {
      public teSelectStmtHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/LoadEncryptTable.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class teStartTimeHeader extends ValueElement {
      public teStartTimeHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/LoadEncryptTable.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class teTableNameHeader extends ValueElement {
      public teTableNameHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/LoadEncryptTable.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class teUpdateStmtHeader extends ValueElement {
      public teUpdateStmtHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/LoadEncryptTable.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TableEncryptLV_tb extends PCFElement {
    public TableEncryptLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/LoadEncryptTable.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class encryptChunksCardTab extends ClickableActionElement {
    public encryptChunksCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}