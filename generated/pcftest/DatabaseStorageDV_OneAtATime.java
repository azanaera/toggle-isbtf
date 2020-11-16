package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.IteratorEntries;
import gw.smoketest.platform.web.IteratorEntryCheckboxElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.RowElement;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.SelectorCellElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.DatabaseStorageDV_OneAtATime.DatabaseStorageLV;
import pcftest.DatabaseStorageDV_OneAtATime.DatabaseStorageLV.entry;
import pcftest.DatabaseStorageDV_OneAtATime.DatabaseStorageLV.entry._Select;
import pcftest.DatabaseStorageDV_OneAtATime.DatabaseStorageLV.entry._ViewDetail;
import pcftest.DatabaseStorageDV_OneAtATime.DatabaseStorageLV.nameHeader;
import pcftest.DatabaseStorageDV_OneAtATime.DatabaseStorageLV.valueHeader;
import pcftest.DatabaseStorageDV_OneAtATime.DatabaseStorageLV_tb;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/infopages/DatabaseStorageDV.OneAtATime.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class DatabaseStorageDV_OneAtATime extends DatabaseStorageDV {
  public final static String CHECKSUM = "041c1bf9eda7953c8e46d190e618b164";
  
  public DatabaseStorageDV_OneAtATime(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public DatabaseStorageLV getDatabaseStorageLV() {
    return getOrCreateProperty("DatabaseStorageLV", "DatabaseStorageLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.DatabaseStorageDV_OneAtATime.DatabaseStorageLV.class);
  }
  
  public DatabaseStorageLV_tb getDatabaseStorageLV_tb() {
    return getOrCreateProperty("DatabaseStorageLV_tb", "DatabaseStorageLV_tb", null, pcftest.DatabaseStorageDV_OneAtATime.DatabaseStorageLV_tb.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/DatabaseStorageDV.OneAtATime.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DatabaseStorageLV extends PCFElement {
    public DatabaseStorageLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntries<entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.DatabaseStorageDV_OneAtATime.DatabaseStorageLV.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
    }
    
    public nameHeader getnameHeader() {
      return getOrCreateProperty("nameHeader", "nameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.DatabaseStorageDV_OneAtATime.DatabaseStorageLV.nameHeader.class);
    }
    
    public valueHeader getvalueHeader() {
      return getOrCreateProperty("valueHeader", "valueHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.DatabaseStorageDV_OneAtATime.DatabaseStorageLV.valueHeader.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/DatabaseStorageDV.OneAtATime.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends RowElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      public _Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.DatabaseStorageDV_OneAtATime.DatabaseStorageLV.entry._Select.class);
      }
      
      public _ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.DatabaseStorageDV_OneAtATime.DatabaseStorageLV.entry._ViewDetail.class);
      }
      
      public ValueElement getname() {
        return getOrCreateProperty("name", "name", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getvalue() {
        return getOrCreateProperty("value", "value", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/DatabaseStorageDV.OneAtATime.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/DatabaseStorageDV.OneAtATime.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/tools/infopages/DatabaseStorageDV.OneAtATime.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class nameHeader extends ValueElement {
      public nameHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/DatabaseStorageDV.OneAtATime.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class valueHeader extends ValueElement {
      public valueHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/DatabaseStorageDV.OneAtATime.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DatabaseStorageLV_tb extends PCFElement {
    public DatabaseStorageLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public SelectElement getrangeInput() {
      return getOrCreateProperty("rangeInput", "rangeInput", null, gw.smoketest.platform.web.SelectElement.class);
    }
    
    
  }
  
  
}