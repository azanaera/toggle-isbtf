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
import pcftest.BulkEditDocumentDetailsPopup.BulkEditDocumentDetailsPopup_UpLink;
import pcftest.BulkEditDocumentDetailsPopup.BulkEditDocumentDetailsScreen;
import pcftest.BulkEditDocumentDetailsPopup.BulkEditDocumentDetailsScreen.Cancel;
import pcftest.BulkEditDocumentDetailsPopup.BulkEditDocumentDetailsScreen.DocumentDetailsEditLV;
import pcftest.BulkEditDocumentDetailsPopup.BulkEditDocumentDetailsScreen.DocumentDetailsEditLV._ListPaging;
import pcftest.BulkEditDocumentDetailsPopup.BulkEditDocumentDetailsScreen.DocumentDetailsEditLV.documentNameHeader;
import pcftest.BulkEditDocumentDetailsPopup.BulkEditDocumentDetailsScreen.DocumentDetailsEditLV.entry;
import pcftest.BulkEditDocumentDetailsPopup.BulkEditDocumentDetailsScreen.DocumentDetailsEditLV.entry._Select;
import pcftest.BulkEditDocumentDetailsPopup.BulkEditDocumentDetailsScreen.DocumentDetailsEditLV.entry._ViewDetail;
import pcftest.BulkEditDocumentDetailsPopup.BulkEditDocumentDetailsScreen.Edit;
import pcftest.BulkEditDocumentDetailsPopup.BulkEditDocumentDetailsScreen.Update;
import pcftest.BulkEditDocumentDetailsPopup.BulkEditDocumentDetailsScreen._msgs;
import pcftest.BulkEditDocumentDetailsPopup._Paging;
import pcftest.BulkEditDocumentDetailsPopup.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/document/BulkEditDocumentDetailsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class BulkEditDocumentDetailsPopup extends PCFLocation {
  public final static String CHECKSUM = "f3221cab7b67b09d1dd7ad82b02376a2";
  
  public BulkEditDocumentDetailsPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("BulkEditDocumentDetailsPopup"));
  }
  
  public BulkEditDocumentDetailsPopup_UpLink getBulkEditDocumentDetailsPopup_UpLink() {
    return getOrCreateProperty("BulkEditDocumentDetailsPopup_UpLink", "BulkEditDocumentDetailsPopup_UpLink", null, pcftest.BulkEditDocumentDetailsPopup.BulkEditDocumentDetailsPopup_UpLink.class);
  }
  
  public BulkEditDocumentDetailsScreen getBulkEditDocumentDetailsScreen() {
    return getOrCreateProperty("BulkEditDocumentDetailsScreen", "BulkEditDocumentDetailsScreen", null, pcftest.BulkEditDocumentDetailsPopup.BulkEditDocumentDetailsScreen.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.BulkEditDocumentDetailsPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.BulkEditDocumentDetailsPopup.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/document/BulkEditDocumentDetailsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class BulkEditDocumentDetailsPopup_UpLink extends ClickableActionElement {
    public BulkEditDocumentDetailsPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/document/BulkEditDocumentDetailsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class BulkEditDocumentDetailsScreen extends PCFElement {
    public BulkEditDocumentDetailsScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Cancel getCancel() {
      return getOrCreateProperty("Cancel", "Cancel", null, pcftest.BulkEditDocumentDetailsPopup.BulkEditDocumentDetailsScreen.Cancel.class);
    }
    
    public DocumentDetailsEditDVPanelSet getDocumentDetailsEditDVPanelSet() {
      return getOrCreateProperty("DocumentDetailsEditDVPanelSet", "DocumentDetailsEditDVPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.DocumentDetailsEditDVPanelSet.class);
    }
    
    public DocumentDetailsEditLV getDocumentDetailsEditLV() {
      return getOrCreateProperty("DocumentDetailsEditLV", "DocumentDetailsEditLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.BulkEditDocumentDetailsPopup.BulkEditDocumentDetailsScreen.DocumentDetailsEditLV.class);
    }
    
    public Edit getEdit() {
      return getOrCreateProperty("Edit", "Edit", null, pcftest.BulkEditDocumentDetailsPopup.BulkEditDocumentDetailsScreen.Edit.class);
    }
    
    public Update getUpdate() {
      return getOrCreateProperty("Update", "Update", null, pcftest.BulkEditDocumentDetailsPopup.BulkEditDocumentDetailsScreen.Update.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.BulkEditDocumentDetailsPopup.BulkEditDocumentDetailsScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/document/BulkEditDocumentDetailsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Cancel extends ClickableActionElement {
      public Cancel(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/document/BulkEditDocumentDetailsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class DocumentDetailsEditLV extends PCFElement {
      public DocumentDetailsEditLV(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      @SuppressWarnings(value = "unchecked")
      public IteratorEntriesWithPaging<entry> get_Entries() {
        return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.BulkEditDocumentDetailsPopup.BulkEditDocumentDetailsScreen.DocumentDetailsEditLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
      }
      
      public _ListPaging get_ListPaging() {
        return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.BulkEditDocumentDetailsPopup.BulkEditDocumentDetailsScreen.DocumentDetailsEditLV._ListPaging.class);
      }
      
      public documentNameHeader getdocumentNameHeader() {
        return getOrCreateProperty("documentNameHeader", "documentNameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.BulkEditDocumentDetailsPopup.BulkEditDocumentDetailsScreen.DocumentDetailsEditLV.documentNameHeader.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/document/BulkEditDocumentDetailsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _ListPaging extends PagingElement {
        public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/document/BulkEditDocumentDetailsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class documentNameHeader extends ValueElement {
        public documentNameHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/document/BulkEditDocumentDetailsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class entry extends RowElement {
        public entry(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public IteratorEntryCheckboxElement get_Checkbox() {
          return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
        }
        
        public _Select get_Select() {
          return getOrCreateProperty("_Select", "_Select", null, pcftest.BulkEditDocumentDetailsPopup.BulkEditDocumentDetailsScreen.DocumentDetailsEditLV.entry._Select.class);
        }
        
        public _ViewDetail get_ViewDetail() {
          return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.BulkEditDocumentDetailsPopup.BulkEditDocumentDetailsScreen.DocumentDetailsEditLV.entry._ViewDetail.class);
        }
        
        public ValueElement getdocumentName() {
          return getOrCreateProperty("documentName", "documentName", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/document/BulkEditDocumentDetailsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class _Select extends SelectorCellElement {
          public _Select(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/document/BulkEditDocumentDetailsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/document/BulkEditDocumentDetailsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Edit extends ClickableActionElement {
      public Edit(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/document/BulkEditDocumentDetailsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Update extends ClickableActionElement {
      public Update(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/document/BulkEditDocumentDetailsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/document/BulkEditDocumentDetailsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/document/BulkEditDocumentDetailsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}