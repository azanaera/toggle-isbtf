package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
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
import pcftest.ClaimSnapshotDocumentsScreen_300.ClaimSnapshotDocumentsLV;
import pcftest.ClaimSnapshotDocumentsScreen_300.ClaimSnapshotDocumentsLV.AuthorHeader;
import pcftest.ClaimSnapshotDocumentsScreen_300.ClaimSnapshotDocumentsLV.DateModifiedHeader;
import pcftest.ClaimSnapshotDocumentsScreen_300.ClaimSnapshotDocumentsLV.NameHeader;
import pcftest.ClaimSnapshotDocumentsScreen_300.ClaimSnapshotDocumentsLV.StatusHeader;
import pcftest.ClaimSnapshotDocumentsScreen_300.ClaimSnapshotDocumentsLV.TypeHeader;
import pcftest.ClaimSnapshotDocumentsScreen_300.ClaimSnapshotDocumentsLV._ListPaging;
import pcftest.ClaimSnapshotDocumentsScreen_300.ClaimSnapshotDocumentsLV.entry;
import pcftest.ClaimSnapshotDocumentsScreen_300.ClaimSnapshotDocumentsLV.entry._Select;
import pcftest.ClaimSnapshotDocumentsScreen_300.ClaimSnapshotDocumentsLV.entry._ViewDetail;
import pcftest.ClaimSnapshotDocumentsScreen_300._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/snapshot/300/ClaimSnapshotDocumentsScreen.300.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotDocumentsScreen_300 extends ClaimSnapshotDocumentsScreen {
  public final static String CHECKSUM = "9298079f9a9f6236c8c85a2e8a6d3b83";
  
  public ClaimSnapshotDocumentsScreen_300(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ClaimSnapshotDocumentsLV getClaimSnapshotDocumentsLV() {
    return getOrCreateProperty("ClaimSnapshotDocumentsLV", "ClaimSnapshotDocumentsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimSnapshotDocumentsScreen_300.ClaimSnapshotDocumentsLV.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ClaimSnapshotDocumentsScreen_300._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/300/ClaimSnapshotDocumentsScreen.300.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotDocumentsLV extends PCFElement {
    public ClaimSnapshotDocumentsLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public AuthorHeader getAuthorHeader() {
      return getOrCreateProperty("AuthorHeader", "AuthorHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotDocumentsScreen_300.ClaimSnapshotDocumentsLV.AuthorHeader.class);
    }
    
    public DateModifiedHeader getDateModifiedHeader() {
      return getOrCreateProperty("DateModifiedHeader", "DateModifiedHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotDocumentsScreen_300.ClaimSnapshotDocumentsLV.DateModifiedHeader.class);
    }
    
    public NameHeader getNameHeader() {
      return getOrCreateProperty("NameHeader", "NameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotDocumentsScreen_300.ClaimSnapshotDocumentsLV.NameHeader.class);
    }
    
    public StatusHeader getStatusHeader() {
      return getOrCreateProperty("StatusHeader", "StatusHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotDocumentsScreen_300.ClaimSnapshotDocumentsLV.StatusHeader.class);
    }
    
    public TypeHeader getTypeHeader() {
      return getOrCreateProperty("TypeHeader", "TypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotDocumentsScreen_300.ClaimSnapshotDocumentsLV.TypeHeader.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ClaimSnapshotDocumentsScreen_300.ClaimSnapshotDocumentsLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public _ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ClaimSnapshotDocumentsScreen_300.ClaimSnapshotDocumentsLV._ListPaging.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/300/ClaimSnapshotDocumentsScreen.300.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class AuthorHeader extends ValueElement {
      public AuthorHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/300/ClaimSnapshotDocumentsScreen.300.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class DateModifiedHeader extends ValueElement {
      public DateModifiedHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/300/ClaimSnapshotDocumentsScreen.300.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class NameHeader extends ValueElement {
      public NameHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/300/ClaimSnapshotDocumentsScreen.300.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class StatusHeader extends ValueElement {
      public StatusHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/300/ClaimSnapshotDocumentsScreen.300.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class TypeHeader extends ValueElement {
      public TypeHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/300/ClaimSnapshotDocumentsScreen.300.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/300/ClaimSnapshotDocumentsScreen.300.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends RowElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ValueElement getAuthor() {
        return getOrCreateProperty("Author", "Author", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getDateModified() {
        return getOrCreateProperty("DateModified", "DateModified", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getName() {
        return getOrCreateProperty("Name", "Name", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getStatus() {
        return getOrCreateProperty("Status", "Status", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getType() {
        return getOrCreateProperty("Type", "Type", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      public _Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.ClaimSnapshotDocumentsScreen_300.ClaimSnapshotDocumentsLV.entry._Select.class);
      }
      
      public _ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ClaimSnapshotDocumentsScreen_300.ClaimSnapshotDocumentsLV.entry._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/300/ClaimSnapshotDocumentsScreen.300.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/300/ClaimSnapshotDocumentsScreen.300.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/snapshot/300/ClaimSnapshotDocumentsScreen.300.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}