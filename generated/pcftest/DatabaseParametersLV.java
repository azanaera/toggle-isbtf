package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.IteratorEntries;
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
import pcftest.DatabaseParametersLV.dbParamLVRowIter;
import pcftest.DatabaseParametersLV.dbParamLVRowIter._ListPaging;
import pcftest.DatabaseParametersLV.dbParamLVRowIter.entry.entry2;
import pcftest.DatabaseParametersLV.headerCells;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/infopages/DatabaseParametersLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class DatabaseParametersLV extends PCFElement {
  public final static String CHECKSUM = "2b528ce2fb957b67cc72ad70dc29f379";
  
  public DatabaseParametersLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  public pcftest.DatabaseParametersLV._Select get_Select() {
    return getOrCreateProperty("_Select", "_Select", null, pcftest.DatabaseParametersLV._Select.class);
  }
  
  public pcftest.DatabaseParametersLV._ViewDetail get_ViewDetail() {
    return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.DatabaseParametersLV._ViewDetail.class);
  }
  
  public dbParamLVRowIter getdbParamLVRowIter() {
    return getOrCreateProperty("dbParamLVRowIter", "dbParamLVRowIter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIterator, pcftest.DatabaseParametersLV.dbParamLVRowIter.class);
  }
  
  public headerCells getheaderCells() {
    return getOrCreateProperty("headerCells", "headerCells", gw.smoketest.platform.web.PCFElementId.PCFElementScope.CellIterator, pcftest.DatabaseParametersLV.headerCells.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/DatabaseParametersLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Select extends SelectorCellElement {
    public _Select(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/DatabaseParametersLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ViewDetail extends BooleanValueElement {
    public _ViewDetail(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/DatabaseParametersLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class dbParamLVRowIter extends PCFElement {
    public dbParamLVRowIter(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<pcftest.DatabaseParametersLV.dbParamLVRowIter.entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.DatabaseParametersLV.dbParamLVRowIter.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public _ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.DatabaseParametersLV.dbParamLVRowIter._ListPaging.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/DatabaseParametersLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/DatabaseParametersLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends RowElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      @SuppressWarnings(value = "unchecked")
      public IteratorEntries<entry2> get_Entries() {
        return getOrCreateEntries(null, pcftest.DatabaseParametersLV.dbParamLVRowIter.entry.entry2.class, gw.smoketest.platform.web.IteratorEntries.class);
      }
      
      public pcftest.DatabaseParametersLV.dbParamLVRowIter.entry._Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.DatabaseParametersLV.dbParamLVRowIter.entry._Select.class);
      }
      
      public pcftest.DatabaseParametersLV.dbParamLVRowIter.entry._ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.DatabaseParametersLV.dbParamLVRowIter.entry._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/DatabaseParametersLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/DatabaseParametersLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _ViewDetail extends BooleanValueElement {
        public _ViewDetail(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/DatabaseParametersLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class entry2 extends PCFElement {
        public entry2(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public ValueElement getValueCell() {
          return getOrCreateProperty("ValueCell", "ValueCell", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/DatabaseParametersLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class headerCells extends PCFElement {
    public headerCells(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntries<pcftest.DatabaseParametersLV.headerCells.entry> get_Entries() {
      return getOrCreateEntries(null, pcftest.DatabaseParametersLV.headerCells.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/DatabaseParametersLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends PCFElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ValueElement getHeaderCell() {
        return getOrCreateProperty("HeaderCell", "HeaderCell", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      
    }
    
    
  }
  
  
}