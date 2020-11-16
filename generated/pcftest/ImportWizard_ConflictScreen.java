package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DetailViewElement;
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
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ImportWizard_ConflictScreen.ConflictAlert;
import pcftest.ImportWizard_ConflictScreen.ConflictAlert.CloseBtn;
import pcftest.ImportWizard_ConflictScreen.ImportWizard_ConflictDV;
import pcftest.ImportWizard_ConflictScreen.ImportWizard_ConflictDV.ImportConflictsLV;
import pcftest.ImportWizard_ConflictScreen.ImportWizard_ConflictDV.ImportConflictsLV.ExistingValueHeader;
import pcftest.ImportWizard_ConflictScreen.ImportWizard_ConflictDV.ImportConflictsLV.FieldNameHeader;
import pcftest.ImportWizard_ConflictScreen.ImportWizard_ConflictDV.ImportConflictsLV.ImportValueHeader;
import pcftest.ImportWizard_ConflictScreen.ImportWizard_ConflictDV.ImportConflictsLV._ListPaging;
import pcftest.ImportWizard_ConflictScreen.ImportWizard_ConflictDV.ImportConflictsLV.entry;
import pcftest.ImportWizard_ConflictScreen.ImportWizard_ConflictDV.ImportConflictsLV.entry.ExistingValue;
import pcftest.ImportWizard_ConflictScreen.ImportWizard_ConflictDV.ImportConflictsLV.entry.ImportValue;
import pcftest.ImportWizard_ConflictScreen.ImportWizard_ConflictDV.ImportConflictsLV.entry._Select;
import pcftest.ImportWizard_ConflictScreen.ImportWizard_ConflictDV.ImportConflictsLV.entry._ViewDetail;
import pcftest.ImportWizard_ConflictScreen.ImportWizard_ConflictDV.ImportConflictsLV_tb;
import pcftest.ImportWizard_ConflictScreen._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/importexport/ImportWizard_ConflictScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ImportWizard_ConflictScreen extends PCFElement {
  public final static String CHECKSUM = "07e9cf39c23fb96e043f04ca96e6a1ef";
  
  public ImportWizard_ConflictScreen(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ConflictAlert getConflictAlert() {
    return getOrCreateProperty("ConflictAlert", "ConflictAlert", null, pcftest.ImportWizard_ConflictScreen.ConflictAlert.class);
  }
  
  public ImportWizard_ConflictDV getImportWizard_ConflictDV() {
    return getOrCreateProperty("ImportWizard_ConflictDV", "ImportWizard_ConflictDV", null, pcftest.ImportWizard_ConflictScreen.ImportWizard_ConflictDV.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ImportWizard_ConflictScreen._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/importexport/ImportWizard_ConflictScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ConflictAlert extends ClickableActionElement {
    public ConflictAlert(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public CloseBtn getCloseBtn() {
      return getOrCreateProperty("CloseBtn", "CloseBtn", null, pcftest.ImportWizard_ConflictScreen.ConflictAlert.CloseBtn.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/importexport/ImportWizard_ConflictScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CloseBtn extends ClickableActionElement {
      public CloseBtn(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/importexport/ImportWizard_ConflictScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ImportWizard_ConflictDV extends DetailViewElement {
    public ImportWizard_ConflictDV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getDisplayName() {
      return getOrCreateProperty("DisplayName", "DisplayName", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ImportConflictsLV getImportConflictsLV() {
      return getOrCreateProperty("ImportConflictsLV", "ImportConflictsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ImportWizard_ConflictScreen.ImportWizard_ConflictDV.ImportConflictsLV.class);
    }
    
    public ImportConflictsLV_tb getImportConflictsLV_tb() {
      return getOrCreateProperty("ImportConflictsLV_tb", "ImportConflictsLV_tb", null, pcftest.ImportWizard_ConflictScreen.ImportWizard_ConflictDV.ImportConflictsLV_tb.class);
    }
    
    public ValueElement getMessage() {
      return getOrCreateProperty("Message", "Message", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public BooleanValueElement getOverwrite() {
      return getOrCreateProperty("Overwrite", "Overwrite", null, gw.smoketest.platform.web.BooleanValueElement.class);
    }
    
    public ValueElement getPublicID() {
      return getOrCreateProperty("PublicID", "PublicID", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getResolution() {
      return getOrCreateProperty("Resolution", "Resolution", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getType() {
      return getOrCreateProperty("Type", "Type", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/importexport/ImportWizard_ConflictScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ImportConflictsLV extends PCFElement {
      public ImportConflictsLV(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ExistingValueHeader getExistingValueHeader() {
        return getOrCreateProperty("ExistingValueHeader", "ExistingValueHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ImportWizard_ConflictScreen.ImportWizard_ConflictDV.ImportConflictsLV.ExistingValueHeader.class);
      }
      
      public FieldNameHeader getFieldNameHeader() {
        return getOrCreateProperty("FieldNameHeader", "FieldNameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ImportWizard_ConflictScreen.ImportWizard_ConflictDV.ImportConflictsLV.FieldNameHeader.class);
      }
      
      public ImportValueHeader getImportValueHeader() {
        return getOrCreateProperty("ImportValueHeader", "ImportValueHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ImportWizard_ConflictScreen.ImportWizard_ConflictDV.ImportConflictsLV.ImportValueHeader.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      @SuppressWarnings(value = "unchecked")
      public IteratorEntriesWithPaging<entry> get_Entries() {
        return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ImportWizard_ConflictScreen.ImportWizard_ConflictDV.ImportConflictsLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
      }
      
      public _ListPaging get_ListPaging() {
        return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ImportWizard_ConflictScreen.ImportWizard_ConflictDV.ImportConflictsLV._ListPaging.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/admin/importexport/ImportWizard_ConflictScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ExistingValueHeader extends ValueElement {
        public ExistingValueHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/admin/importexport/ImportWizard_ConflictScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class FieldNameHeader extends ValueElement {
        public FieldNameHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/admin/importexport/ImportWizard_ConflictScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ImportValueHeader extends ValueElement {
        public ImportValueHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/admin/importexport/ImportWizard_ConflictScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _ListPaging extends PagingElement {
        public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/admin/importexport/ImportWizard_ConflictScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class entry extends RowElement {
        public entry(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public ExistingValue getExistingValue() {
          return getOrCreateProperty("ExistingValue", "ExistingValue", null, pcftest.ImportWizard_ConflictScreen.ImportWizard_ConflictDV.ImportConflictsLV.entry.ExistingValue.class);
        }
        
        public ValueElement getFieldName() {
          return getOrCreateProperty("FieldName", "FieldName", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ImportValue getImportValue() {
          return getOrCreateProperty("ImportValue", "ImportValue", null, pcftest.ImportWizard_ConflictScreen.ImportWizard_ConflictDV.ImportConflictsLV.entry.ImportValue.class);
        }
        
        public IteratorEntryCheckboxElement get_Checkbox() {
          return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
        }
        
        public _Select get_Select() {
          return getOrCreateProperty("_Select", "_Select", null, pcftest.ImportWizard_ConflictScreen.ImportWizard_ConflictDV.ImportConflictsLV.entry._Select.class);
        }
        
        public _ViewDetail get_ViewDetail() {
          return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ImportWizard_ConflictScreen.ImportWizard_ConflictDV.ImportConflictsLV.entry._ViewDetail.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/admin/importexport/ImportWizard_ConflictScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class ExistingValue extends ValueElement {
          public ExistingValue(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public ImportWizard_ArrayDiffPopup click() {
            return clickThis(pcftest.ImportWizard_ArrayDiffPopup.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/admin/importexport/ImportWizard_ConflictScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class ImportValue extends ValueElement {
          public ImportValue(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public ImportWizard_ArrayDiffPopup click() {
            return clickThis(pcftest.ImportWizard_ArrayDiffPopup.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/admin/importexport/ImportWizard_ConflictScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class _Select extends SelectorCellElement {
          public _Select(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/admin/importexport/ImportWizard_ConflictScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/admin/importexport/ImportWizard_ConflictScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ImportConflictsLV_tb extends PCFElement {
      public ImportConflictsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/importexport/ImportWizard_ConflictScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}