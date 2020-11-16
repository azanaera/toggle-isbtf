package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
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
import pcftest.ArchiveItemListLDV.ArchiveItemListLV;
import pcftest.ArchiveItemListLDV.ArchiveItemListLV.DebugItemHeader;
import pcftest.ArchiveItemListLDV.ArchiveItemListLV.ItemHeader;
import pcftest.ArchiveItemListLDV.ArchiveItemListLV.ResetHeader;
import pcftest.ArchiveItemListLDV.ArchiveItemListLV._ListPaging;
import pcftest.ArchiveItemListLDV.ArchiveItemListLV.entry;
import pcftest.ArchiveItemListLDV.ArchiveItemListLV.entry.DebugItem;
import pcftest.ArchiveItemListLDV.ArchiveItemListLV.entry.Item;
import pcftest.ArchiveItemListLDV.ArchiveItemListLV.entry.Reset;
import pcftest.ArchiveItemListLDV.ArchiveItemListLV.entry._Select;
import pcftest.ArchiveItemListLDV.ArchiveItemListLV.entry._ViewDetail;
import pcftest.ArchiveItemListLDV.ArchiveTraceCVTab;
import pcftest.ArchiveItemListLDV.FailureDetailsCVTab;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/infopages/ArchiveItemListLDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ArchiveItemListLDV extends PCFElement {
  public final static String CHECKSUM = "21582033608e7a3fabbc7d5116a069cd";
  
  public ArchiveItemListLDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ArchiveItemListLV getArchiveItemListLV() {
    return getOrCreateProperty("ArchiveItemListLV", "ArchiveItemListLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ArchiveItemListLDV.ArchiveItemListLV.class);
  }
  
  public ArchiveTraceCVTab getArchiveTraceCVTab() {
    return getOrCreateProperty("ArchiveTraceCVTab", "ArchiveTraceCVTab", null, pcftest.ArchiveItemListLDV.ArchiveTraceCVTab.class);
  }
  
  public ValueElement getFailureDetails() {
    return getOrCreateProperty("FailureDetails", "FailureDetails", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public FailureDetailsCVTab getFailureDetailsCVTab() {
    return getOrCreateProperty("FailureDetailsCVTab", "FailureDetailsCVTab", null, pcftest.ArchiveItemListLDV.FailureDetailsCVTab.class);
  }
  
  public ValueElement getTraceDetails() {
    return getOrCreateProperty("TraceDetails", "TraceDetails", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/ArchiveItemListLDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ArchiveItemListLV extends PCFElement {
    public ArchiveItemListLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public DebugItemHeader getDebugItemHeader() {
      return getOrCreateProperty("DebugItemHeader", "DebugItemHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ArchiveItemListLDV.ArchiveItemListLV.DebugItemHeader.class);
    }
    
    public ItemHeader getItemHeader() {
      return getOrCreateProperty("ItemHeader", "ItemHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ArchiveItemListLDV.ArchiveItemListLV.ItemHeader.class);
    }
    
    public ResetHeader getResetHeader() {
      return getOrCreateProperty("ResetHeader", "ResetHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ArchiveItemListLDV.ArchiveItemListLV.ResetHeader.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ArchiveItemListLDV.ArchiveItemListLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public _ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ArchiveItemListLDV.ArchiveItemListLV._ListPaging.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/ArchiveItemListLDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class DebugItemHeader extends ValueElement {
      public DebugItemHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/ArchiveItemListLDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ItemHeader extends ValueElement {
      public ItemHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/ArchiveItemListLDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ResetHeader extends ValueElement {
      public ResetHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/ArchiveItemListLDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/ArchiveItemListLDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends RowElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public DebugItem getDebugItem() {
        return getOrCreateProperty("DebugItem", "DebugItem", null, pcftest.ArchiveItemListLDV.ArchiveItemListLV.entry.DebugItem.class);
      }
      
      public Item getItem() {
        return getOrCreateProperty("Item", "Item", null, pcftest.ArchiveItemListLDV.ArchiveItemListLV.entry.Item.class);
      }
      
      public Reset getReset() {
        return getOrCreateProperty("Reset", "Reset", null, pcftest.ArchiveItemListLDV.ArchiveItemListLV.entry.Reset.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      public _Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.ArchiveItemListLDV.ArchiveItemListLV.entry._Select.class);
      }
      
      public _ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ArchiveItemListLDV.ArchiveItemListLV.entry._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/ArchiveItemListLDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class DebugItem extends ValueElement {
        public DebugItem(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/ArchiveItemListLDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Item extends ValueElement {
        public Item(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/ArchiveItemListLDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Reset extends ValueElement {
        public Reset(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/ArchiveItemListLDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/ArchiveItemListLDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/tools/infopages/ArchiveItemListLDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ArchiveTraceCVTab extends ClickableActionElement {
    public ArchiveTraceCVTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/ArchiveItemListLDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FailureDetailsCVTab extends ClickableActionElement {
    public FailureDetailsCVTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}