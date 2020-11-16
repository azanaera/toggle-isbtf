package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DateElement;
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
import pcftest.OutboundFile.OutboundFileScreen;
import pcftest.OutboundFile.OutboundFileScreen.OutboundFileLVContentHeader;
import pcftest.OutboundFile.OutboundFileScreen.OutboundFileLVCreateDateHeader;
import pcftest.OutboundFile.OutboundFileScreen._ListPaging;
import pcftest.OutboundFile.OutboundFileScreen._msgs;
import pcftest.OutboundFile.OutboundFileScreen.entry;
import pcftest.OutboundFile.OutboundFileScreen.entry._Select;
import pcftest.OutboundFile.OutboundFileScreen.entry._ViewDetail;
import pcftest.OutboundFile.OutboundFile_UpLink;
import pcftest.OutboundFile._Paging;
import pcftest.OutboundFile.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/outboundfile/OutboundFile.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class OutboundFile extends PCFLocation {
  public final static String CHECKSUM = "f5413c288fb0432c6bece1437f51f3be";
  
  public OutboundFile(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("OutboundFile"));
  }
  
  public OutboundFileScreen getOutboundFileScreen() {
    return getOrCreateProperty("OutboundFileScreen", "OutboundFileScreen", null, pcftest.OutboundFile.OutboundFileScreen.class);
  }
  
  public OutboundFile_UpLink getOutboundFile_UpLink() {
    return getOrCreateProperty("OutboundFile_UpLink", "OutboundFile_UpLink", null, pcftest.OutboundFile.OutboundFile_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.OutboundFile._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.OutboundFile.__crumb__.class);
  }
  
  public OutboundFileSearch get_parent() {
    return getOrCreateProperty("_parent", pcftest.OutboundFileSearch.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/outboundfile/OutboundFile.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class OutboundFileScreen extends PCFElement {
    public OutboundFileScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getOutboundFileDVBatchID() {
      return getOrCreateProperty("OutboundFileDVBatchID", "OutboundFileDVBatchID", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getOutboundFileDVConfig() {
      return getOrCreateProperty("OutboundFileDVConfig", "OutboundFileDVConfig", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public DateElement getOutboundFileDVCreateDate() {
      return getOrCreateProperty("OutboundFileDVCreateDate", "OutboundFileDVCreateDate", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public DateElement getOutboundFileDVEndingLineNumber() {
      return getOrCreateProperty("OutboundFileDVEndingLineNumber", "OutboundFileDVEndingLineNumber", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public ValueElement getOutboundFileDVFileName() {
      return getOrCreateProperty("OutboundFileDVFileName", "OutboundFileDVFileName", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public DateElement getOutboundFileDVPurgeDate() {
      return getOrCreateProperty("OutboundFileDVPurgeDate", "OutboundFileDVPurgeDate", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public DateElement getOutboundFileDVStartingDate() {
      return getOrCreateProperty("OutboundFileDVStartingDate", "OutboundFileDVStartingDate", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public OutboundFileLVContentHeader getOutboundFileLVContentHeader() {
      return getOrCreateProperty("OutboundFileLVContentHeader", "OutboundFileLVContentHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.OutboundFile.OutboundFileScreen.OutboundFileLVContentHeader.class);
    }
    
    public OutboundFileLVCreateDateHeader getOutboundFileLVCreateDateHeader() {
      return getOrCreateProperty("OutboundFileLVCreateDateHeader", "OutboundFileLVCreateDateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.OutboundFile.OutboundFileScreen.OutboundFileLVCreateDateHeader.class);
    }
    
    public SearchAndResetInputSet getSearchAndResetInputSet() {
      return getOrCreateProperty("SearchAndResetInputSet", "SearchAndResetInputSet", null, pcftest.SearchAndResetInputSet.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.OutboundFile.OutboundFileScreen.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public _ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.OutboundFile.OutboundFileScreen._ListPaging.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.OutboundFile.OutboundFileScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/outboundfile/OutboundFile.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class OutboundFileLVContentHeader extends ValueElement {
      public OutboundFileLVContentHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/outboundfile/OutboundFile.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class OutboundFileLVCreateDateHeader extends ValueElement {
      public OutboundFileLVCreateDateHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/outboundfile/OutboundFile.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/outboundfile/OutboundFile.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _msgs extends MessagesElement {
      public _msgs(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/outboundfile/OutboundFile.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends RowElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ValueElement getOutboundFileLVContent() {
        return getOrCreateProperty("OutboundFileLVContent", "OutboundFileLVContent", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public DateElement getOutboundFileLVCreateDate() {
        return getOrCreateProperty("OutboundFileLVCreateDate", "OutboundFileLVCreateDate", null, gw.smoketest.platform.web.DateElement.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      public _Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.OutboundFile.OutboundFileScreen.entry._Select.class);
      }
      
      public _ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.OutboundFile.OutboundFileScreen.entry._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/outboundfile/OutboundFile.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/outboundfile/OutboundFile.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/outboundfile/OutboundFile.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class OutboundFile_UpLink extends ClickableActionElement {
    public OutboundFile_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/outboundfile/OutboundFile.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/outboundfile/OutboundFile.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}