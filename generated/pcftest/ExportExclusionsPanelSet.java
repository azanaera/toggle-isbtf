package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
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
import pcftest.ExportExclusionsPanelSet.LV;
import pcftest.ExportExclusionsPanelSet.LV.AvailableToRunHeader;
import pcftest.ExportExclusionsPanelSet.LV.DraftVersionHeader;
import pcftest.ExportExclusionsPanelSet.LV.ExportingVersionHeader;
import pcftest.ExportExclusionsPanelSet.LV.NameHeader;
import pcftest.ExportExclusionsPanelSet.LV._ListPaging;
import pcftest.ExportExclusionsPanelSet.LV.entry;
import pcftest.ExportExclusionsPanelSet.LV.entry.DraftVersion;
import pcftest.ExportExclusionsPanelSet.LV.entry.ExportingVersion;
import pcftest.ExportExclusionsPanelSet.LV.entry.Name;
import pcftest.ExportExclusionsPanelSet.LV.entry._Select;
import pcftest.ExportExclusionsPanelSet.LV.entry._ViewDetail;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/bizrules/ExportExclusionsPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ExportExclusionsPanelSet extends PCFElement {
  public final static String CHECKSUM = "bf811155b5d6c4032be6499f8b1ac8ae";
  
  public ExportExclusionsPanelSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public LV getLV() {
    return getOrCreateProperty("LV", "LV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ExportExclusionsPanelSet.LV.class);
  }
  
  public ValueElement getTitle() {
    return getOrCreateProperty("Title", "Title", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/ExportExclusionsPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LV extends PCFElement {
    public LV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public AvailableToRunHeader getAvailableToRunHeader() {
      return getOrCreateProperty("AvailableToRunHeader", "AvailableToRunHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ExportExclusionsPanelSet.LV.AvailableToRunHeader.class);
    }
    
    public DraftVersionHeader getDraftVersionHeader() {
      return getOrCreateProperty("DraftVersionHeader", "DraftVersionHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ExportExclusionsPanelSet.LV.DraftVersionHeader.class);
    }
    
    public ExportingVersionHeader getExportingVersionHeader() {
      return getOrCreateProperty("ExportingVersionHeader", "ExportingVersionHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ExportExclusionsPanelSet.LV.ExportingVersionHeader.class);
    }
    
    public NameHeader getNameHeader() {
      return getOrCreateProperty("NameHeader", "NameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ExportExclusionsPanelSet.LV.NameHeader.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ExportExclusionsPanelSet.LV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public _ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ExportExclusionsPanelSet.LV._ListPaging.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/ExportExclusionsPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class AvailableToRunHeader extends ValueElement {
      public AvailableToRunHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/ExportExclusionsPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class DraftVersionHeader extends ValueElement {
      public DraftVersionHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/ExportExclusionsPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ExportingVersionHeader extends ValueElement {
      public ExportingVersionHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/ExportExclusionsPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class NameHeader extends ValueElement {
      public NameHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/ExportExclusionsPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/ExportExclusionsPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends RowElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public BooleanValueElement getAvailableToRun() {
        return getOrCreateProperty("AvailableToRun", "AvailableToRun", null, gw.smoketest.platform.web.BooleanValueElement.class);
      }
      
      public DraftVersion getDraftVersion() {
        return getOrCreateProperty("DraftVersion", "DraftVersion", null, pcftest.ExportExclusionsPanelSet.LV.entry.DraftVersion.class);
      }
      
      public ExportingVersion getExportingVersion() {
        return getOrCreateProperty("ExportingVersion", "ExportingVersion", null, pcftest.ExportExclusionsPanelSet.LV.entry.ExportingVersion.class);
      }
      
      public Name getName() {
        return getOrCreateProperty("Name", "Name", null, pcftest.ExportExclusionsPanelSet.LV.entry.Name.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      public _Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.ExportExclusionsPanelSet.LV.entry._Select.class);
      }
      
      public _ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ExportExclusionsPanelSet.LV.entry._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/bizrules/ExportExclusionsPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class DraftVersion extends ValueElement {
        public DraftVersion(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/bizrules/ExportExclusionsPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ExportingVersion extends ValueElement {
        public ExportingVersion(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/bizrules/ExportExclusionsPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Name extends ValueElement {
        public Name(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/bizrules/ExportExclusionsPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/bizrules/ExportExclusionsPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  
  
}