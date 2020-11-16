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
import pcftest.DatabaseStorageDV_AllAtOnce.DatabaseParametersLV;
import pcftest.DatabaseStorageDV_AllAtOnce.DatabaseParametersLV._ListPaging;
import pcftest.DatabaseStorageDV_AllAtOnce.DatabaseParametersLV.entry.entry2;
import pcftest.DatabaseStorageDV_AllAtOnce.DatabaseParametersLV.headerCells;
import pcftest.DatabaseStorageDV_AllAtOnce.DatabaseParametersLV_tb;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/infopages/DatabaseStorageDV.AllAtOnce.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class DatabaseStorageDV_AllAtOnce extends DatabaseStorageDV {
  public final static String CHECKSUM = "0ab2e8277ed257ccee37038bc4396029";
  
  public DatabaseStorageDV_AllAtOnce(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public DatabaseParametersLV getDatabaseParametersLV() {
    return getOrCreateProperty("DatabaseParametersLV", "DatabaseParametersLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.DatabaseStorageDV_AllAtOnce.DatabaseParametersLV.class);
  }
  
  public DatabaseParametersLV_tb getDatabaseParametersLV_tb() {
    return getOrCreateProperty("DatabaseParametersLV_tb", "DatabaseParametersLV_tb", null, pcftest.DatabaseStorageDV_AllAtOnce.DatabaseParametersLV_tb.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/DatabaseStorageDV.AllAtOnce.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DatabaseParametersLV extends PCFElement {
    public DatabaseParametersLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<pcftest.DatabaseStorageDV_AllAtOnce.DatabaseParametersLV.entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.DatabaseStorageDV_AllAtOnce.DatabaseParametersLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public _ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.DatabaseStorageDV_AllAtOnce.DatabaseParametersLV._ListPaging.class);
    }
    
    public pcftest.DatabaseStorageDV_AllAtOnce.DatabaseParametersLV._Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.DatabaseStorageDV_AllAtOnce.DatabaseParametersLV._Select.class);
    }
    
    public pcftest.DatabaseStorageDV_AllAtOnce.DatabaseParametersLV._ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.DatabaseStorageDV_AllAtOnce.DatabaseParametersLV._ViewDetail.class);
    }
    
    public headerCells getheaderCells() {
      return getOrCreateProperty("headerCells", "headerCells", gw.smoketest.platform.web.PCFElementId.PCFElementScope.CellIterator, pcftest.DatabaseStorageDV_AllAtOnce.DatabaseParametersLV.headerCells.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/DatabaseStorageDV.AllAtOnce.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/DatabaseStorageDV.AllAtOnce.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/DatabaseStorageDV.AllAtOnce.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ViewDetail extends BooleanValueElement {
      public _ViewDetail(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/DatabaseStorageDV.AllAtOnce.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends RowElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      @SuppressWarnings(value = "unchecked")
      public IteratorEntries<entry2> get_Entries() {
        return getOrCreateEntries(null, pcftest.DatabaseStorageDV_AllAtOnce.DatabaseParametersLV.entry.entry2.class, gw.smoketest.platform.web.IteratorEntries.class);
      }
      
      public pcftest.DatabaseStorageDV_AllAtOnce.DatabaseParametersLV.entry._Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.DatabaseStorageDV_AllAtOnce.DatabaseParametersLV.entry._Select.class);
      }
      
      public pcftest.DatabaseStorageDV_AllAtOnce.DatabaseParametersLV.entry._ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.DatabaseStorageDV_AllAtOnce.DatabaseParametersLV.entry._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/DatabaseStorageDV.AllAtOnce.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/DatabaseStorageDV.AllAtOnce.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _ViewDetail extends BooleanValueElement {
        public _ViewDetail(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/DatabaseStorageDV.AllAtOnce.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class entry2 extends PCFElement {
        public entry2(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public ValueElement getValueCell() {
          return getOrCreateProperty("ValueCell", "ValueCell", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/DatabaseStorageDV.AllAtOnce.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class headerCells extends PCFElement {
      public headerCells(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      @SuppressWarnings(value = "unchecked")
      public IteratorEntries<pcftest.DatabaseStorageDV_AllAtOnce.DatabaseParametersLV.headerCells.entry> get_Entries() {
        return getOrCreateEntries(null, pcftest.DatabaseStorageDV_AllAtOnce.DatabaseParametersLV.headerCells.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/DatabaseStorageDV.AllAtOnce.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/DatabaseStorageDV.AllAtOnce.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DatabaseParametersLV_tb extends PCFElement {
    public DatabaseParametersLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  
}