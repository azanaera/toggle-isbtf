package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.IteratorEntries;
import gw.smoketest.platform.web.IteratorEntryCheckboxElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.RowElement;
import gw.smoketest.platform.web.SelectorCellElement;
import gw.smoketest.platform.web.ValueElement;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ImportWizard_ArrayDiffPopup.ImportWizard_ArrayDiffPopupScreen;
import pcftest.ImportWizard_ArrayDiffPopup.ImportWizard_ArrayDiffPopupScreen.ImportWizard_AddedArrayElementsLV;
import pcftest.ImportWizard_ArrayDiffPopup.ImportWizard_ArrayDiffPopupScreen.ImportWizard_AddedArrayElementsLV_tb;
import pcftest.ImportWizard_ArrayDiffPopup.ImportWizard_ArrayDiffPopupScreen.ImportWizard_RemovedArrayElementsLV;
import pcftest.ImportWizard_ArrayDiffPopup.ImportWizard_ArrayDiffPopupScreen.ImportWizard_RemovedArrayElementsLV_tb;
import pcftest.ImportWizard_ArrayDiffPopup.ImportWizard_ArrayDiffPopupScreen._msgs;
import pcftest.ImportWizard_ArrayDiffPopup.ImportWizard_ArrayDiffPopup_UpLink;
import pcftest.ImportWizard_ArrayDiffPopup._Paging;
import pcftest.ImportWizard_ArrayDiffPopup.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/importexport/ImportWizard_ArrayDiffPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ImportWizard_ArrayDiffPopup extends PCFLocation {
  public final static String CHECKSUM = "90a77fd611f2a5e7484e86201f0f2579";
  
  public ImportWizard_ArrayDiffPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ImportWizard_ArrayDiffPopup"));
  }
  
  public ImportWizard_ArrayDiffPopupScreen getImportWizard_ArrayDiffPopupScreen() {
    return getOrCreateProperty("ImportWizard_ArrayDiffPopupScreen", "ImportWizard_ArrayDiffPopupScreen", null, pcftest.ImportWizard_ArrayDiffPopup.ImportWizard_ArrayDiffPopupScreen.class);
  }
  
  public ImportWizard_ArrayDiffPopup_UpLink getImportWizard_ArrayDiffPopup_UpLink() {
    return getOrCreateProperty("ImportWizard_ArrayDiffPopup_UpLink", "ImportWizard_ArrayDiffPopup_UpLink", null, pcftest.ImportWizard_ArrayDiffPopup.ImportWizard_ArrayDiffPopup_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ImportWizard_ArrayDiffPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ImportWizard_ArrayDiffPopup.__crumb__.class);
  }
  
  public ImportWizard get_parent() {
    return getOrCreateProperty("_parent", pcftest.ImportWizard.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/importexport/ImportWizard_ArrayDiffPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ImportWizard_ArrayDiffPopupScreen extends PCFElement {
    public ImportWizard_ArrayDiffPopupScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ImportWizard_AddedArrayElementsLV getImportWizard_AddedArrayElementsLV() {
      return getOrCreateProperty("ImportWizard_AddedArrayElementsLV", "ImportWizard_AddedArrayElementsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ImportWizard_ArrayDiffPopup.ImportWizard_ArrayDiffPopupScreen.ImportWizard_AddedArrayElementsLV.class);
    }
    
    public ImportWizard_AddedArrayElementsLV_tb getImportWizard_AddedArrayElementsLV_tb() {
      return getOrCreateProperty("ImportWizard_AddedArrayElementsLV_tb", "ImportWizard_AddedArrayElementsLV_tb", null, pcftest.ImportWizard_ArrayDiffPopup.ImportWizard_ArrayDiffPopupScreen.ImportWizard_AddedArrayElementsLV_tb.class);
    }
    
    public ImportWizard_RemovedArrayElementsLV getImportWizard_RemovedArrayElementsLV() {
      return getOrCreateProperty("ImportWizard_RemovedArrayElementsLV", "ImportWizard_RemovedArrayElementsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ImportWizard_ArrayDiffPopup.ImportWizard_ArrayDiffPopupScreen.ImportWizard_RemovedArrayElementsLV.class);
    }
    
    public ImportWizard_RemovedArrayElementsLV_tb getImportWizard_RemovedArrayElementsLV_tb() {
      return getOrCreateProperty("ImportWizard_RemovedArrayElementsLV_tb", "ImportWizard_RemovedArrayElementsLV_tb", null, pcftest.ImportWizard_ArrayDiffPopup.ImportWizard_ArrayDiffPopupScreen.ImportWizard_RemovedArrayElementsLV_tb.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ImportWizard_ArrayDiffPopup.ImportWizard_ArrayDiffPopupScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/importexport/ImportWizard_ArrayDiffPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ImportWizard_AddedArrayElementsLV extends PCFElement {
      public ImportWizard_AddedArrayElementsLV(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      @SuppressWarnings(value = "unchecked")
      public IteratorEntries<pcftest.ImportWizard_ArrayDiffPopup.ImportWizard_ArrayDiffPopupScreen.ImportWizard_AddedArrayElementsLV.entry> get_Entries() {
        return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ImportWizard_ArrayDiffPopup.ImportWizard_ArrayDiffPopupScreen.ImportWizard_AddedArrayElementsLV.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
      }
      
      public pcftest.ImportWizard_ArrayDiffPopup.ImportWizard_ArrayDiffPopupScreen.ImportWizard_AddedArrayElementsLV._Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.ImportWizard_ArrayDiffPopup.ImportWizard_ArrayDiffPopupScreen.ImportWizard_AddedArrayElementsLV._Select.class);
      }
      
      public pcftest.ImportWizard_ArrayDiffPopup.ImportWizard_ArrayDiffPopupScreen.ImportWizard_AddedArrayElementsLV._ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ImportWizard_ArrayDiffPopup.ImportWizard_ArrayDiffPopupScreen.ImportWizard_AddedArrayElementsLV._ViewDetail.class);
      }
      
      public pcftest.ImportWizard_ArrayDiffPopup.ImportWizard_ArrayDiffPopupScreen.ImportWizard_AddedArrayElementsLV.headerCells getheaderCells() {
        return getOrCreateProperty("headerCells", "headerCells", gw.smoketest.platform.web.PCFElementId.PCFElementScope.CellIterator, pcftest.ImportWizard_ArrayDiffPopup.ImportWizard_ArrayDiffPopupScreen.ImportWizard_AddedArrayElementsLV.headerCells.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/admin/importexport/ImportWizard_ArrayDiffPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/admin/importexport/ImportWizard_ArrayDiffPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _ViewDetail extends BooleanValueElement {
        public _ViewDetail(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/admin/importexport/ImportWizard_ArrayDiffPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class entry extends RowElement {
        public entry(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public IteratorEntryCheckboxElement get_Checkbox() {
          return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
        }
        
        @SuppressWarnings(value = "unchecked")
        public IteratorEntries<pcftest.ImportWizard_ArrayDiffPopup.ImportWizard_ArrayDiffPopupScreen.ImportWizard_AddedArrayElementsLV.entry.entry2> get_Entries() {
          return getOrCreateEntries(null, pcftest.ImportWizard_ArrayDiffPopup.ImportWizard_ArrayDiffPopupScreen.ImportWizard_AddedArrayElementsLV.entry.entry2.class, gw.smoketest.platform.web.IteratorEntries.class);
        }
        
        public pcftest.ImportWizard_ArrayDiffPopup.ImportWizard_ArrayDiffPopupScreen.ImportWizard_AddedArrayElementsLV.entry._Select get_Select() {
          return getOrCreateProperty("_Select", "_Select", null, pcftest.ImportWizard_ArrayDiffPopup.ImportWizard_ArrayDiffPopupScreen.ImportWizard_AddedArrayElementsLV.entry._Select.class);
        }
        
        public pcftest.ImportWizard_ArrayDiffPopup.ImportWizard_ArrayDiffPopupScreen.ImportWizard_AddedArrayElementsLV.entry._ViewDetail get_ViewDetail() {
          return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ImportWizard_ArrayDiffPopup.ImportWizard_ArrayDiffPopupScreen.ImportWizard_AddedArrayElementsLV.entry._ViewDetail.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/admin/importexport/ImportWizard_ArrayDiffPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class _Select extends SelectorCellElement {
          public _Select(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/admin/importexport/ImportWizard_ArrayDiffPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class _ViewDetail extends BooleanValueElement {
          public _ViewDetail(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/admin/importexport/ImportWizard_ArrayDiffPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
      @Generated(comments = "config/web/pcf/admin/importexport/ImportWizard_ArrayDiffPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class headerCells extends PCFElement {
        public headerCells(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        @SuppressWarnings(value = "unchecked")
        public IteratorEntries<pcftest.ImportWizard_ArrayDiffPopup.ImportWizard_ArrayDiffPopupScreen.ImportWizard_AddedArrayElementsLV.headerCells.entry> get_Entries() {
          return getOrCreateEntries(null, pcftest.ImportWizard_ArrayDiffPopup.ImportWizard_ArrayDiffPopupScreen.ImportWizard_AddedArrayElementsLV.headerCells.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/admin/importexport/ImportWizard_ArrayDiffPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class entry extends PCFElement {
          public entry(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public ValueElement getheader() {
            return getOrCreateProperty("header", "header", null, gw.smoketest.platform.web.ValueElement.class);
          }
          
          
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/importexport/ImportWizard_ArrayDiffPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ImportWizard_AddedArrayElementsLV_tb extends PCFElement {
      public ImportWizard_AddedArrayElementsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/importexport/ImportWizard_ArrayDiffPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ImportWizard_RemovedArrayElementsLV extends PCFElement {
      public ImportWizard_RemovedArrayElementsLV(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      @SuppressWarnings(value = "unchecked")
      public IteratorEntries<pcftest.ImportWizard_ArrayDiffPopup.ImportWizard_ArrayDiffPopupScreen.ImportWizard_RemovedArrayElementsLV.entry> get_Entries() {
        return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ImportWizard_ArrayDiffPopup.ImportWizard_ArrayDiffPopupScreen.ImportWizard_RemovedArrayElementsLV.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
      }
      
      public pcftest.ImportWizard_ArrayDiffPopup.ImportWizard_ArrayDiffPopupScreen.ImportWizard_RemovedArrayElementsLV._Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.ImportWizard_ArrayDiffPopup.ImportWizard_ArrayDiffPopupScreen.ImportWizard_RemovedArrayElementsLV._Select.class);
      }
      
      public pcftest.ImportWizard_ArrayDiffPopup.ImportWizard_ArrayDiffPopupScreen.ImportWizard_RemovedArrayElementsLV._ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ImportWizard_ArrayDiffPopup.ImportWizard_ArrayDiffPopupScreen.ImportWizard_RemovedArrayElementsLV._ViewDetail.class);
      }
      
      public pcftest.ImportWizard_ArrayDiffPopup.ImportWizard_ArrayDiffPopupScreen.ImportWizard_RemovedArrayElementsLV.headerCells getheaderCells() {
        return getOrCreateProperty("headerCells", "headerCells", gw.smoketest.platform.web.PCFElementId.PCFElementScope.CellIterator, pcftest.ImportWizard_ArrayDiffPopup.ImportWizard_ArrayDiffPopupScreen.ImportWizard_RemovedArrayElementsLV.headerCells.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/admin/importexport/ImportWizard_ArrayDiffPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/admin/importexport/ImportWizard_ArrayDiffPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _ViewDetail extends BooleanValueElement {
        public _ViewDetail(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/admin/importexport/ImportWizard_ArrayDiffPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class entry extends RowElement {
        public entry(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public IteratorEntryCheckboxElement get_Checkbox() {
          return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
        }
        
        @SuppressWarnings(value = "unchecked")
        public IteratorEntries<pcftest.ImportWizard_ArrayDiffPopup.ImportWizard_ArrayDiffPopupScreen.ImportWizard_RemovedArrayElementsLV.entry.entry2> get_Entries() {
          return getOrCreateEntries(null, pcftest.ImportWizard_ArrayDiffPopup.ImportWizard_ArrayDiffPopupScreen.ImportWizard_RemovedArrayElementsLV.entry.entry2.class, gw.smoketest.platform.web.IteratorEntries.class);
        }
        
        public pcftest.ImportWizard_ArrayDiffPopup.ImportWizard_ArrayDiffPopupScreen.ImportWizard_RemovedArrayElementsLV.entry._Select get_Select() {
          return getOrCreateProperty("_Select", "_Select", null, pcftest.ImportWizard_ArrayDiffPopup.ImportWizard_ArrayDiffPopupScreen.ImportWizard_RemovedArrayElementsLV.entry._Select.class);
        }
        
        public pcftest.ImportWizard_ArrayDiffPopup.ImportWizard_ArrayDiffPopupScreen.ImportWizard_RemovedArrayElementsLV.entry._ViewDetail get_ViewDetail() {
          return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ImportWizard_ArrayDiffPopup.ImportWizard_ArrayDiffPopupScreen.ImportWizard_RemovedArrayElementsLV.entry._ViewDetail.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/admin/importexport/ImportWizard_ArrayDiffPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class _Select extends SelectorCellElement {
          public _Select(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/admin/importexport/ImportWizard_ArrayDiffPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class _ViewDetail extends BooleanValueElement {
          public _ViewDetail(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/admin/importexport/ImportWizard_ArrayDiffPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
      @Generated(comments = "config/web/pcf/admin/importexport/ImportWizard_ArrayDiffPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class headerCells extends PCFElement {
        public headerCells(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        @SuppressWarnings(value = "unchecked")
        public IteratorEntries<pcftest.ImportWizard_ArrayDiffPopup.ImportWizard_ArrayDiffPopupScreen.ImportWizard_RemovedArrayElementsLV.headerCells.entry> get_Entries() {
          return getOrCreateEntries(null, pcftest.ImportWizard_ArrayDiffPopup.ImportWizard_ArrayDiffPopupScreen.ImportWizard_RemovedArrayElementsLV.headerCells.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/admin/importexport/ImportWizard_ArrayDiffPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class entry extends PCFElement {
          public entry(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public ValueElement getfield() {
            return getOrCreateProperty("field", "field", null, gw.smoketest.platform.web.ValueElement.class);
          }
          
          
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/importexport/ImportWizard_ArrayDiffPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ImportWizard_RemovedArrayElementsLV_tb extends PCFElement {
      public ImportWizard_RemovedArrayElementsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/importexport/ImportWizard_ArrayDiffPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/admin/importexport/ImportWizard_ArrayDiffPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ImportWizard_ArrayDiffPopup_UpLink extends ClickableActionElement {
    public ImportWizard_ArrayDiffPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/importexport/ImportWizard_ArrayDiffPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/importexport/ImportWizard_ArrayDiffPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}