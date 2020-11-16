package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.IteratorEntriesWithPaging;
import gw.smoketest.platform.web.IteratorEntryCheckboxElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.PagingElement;
import gw.smoketest.platform.web.RowElement;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.SelectorCellElement;
import gw.smoketest.platform.web.ValueElement;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.InboundFileSearch.InboundFileSearchScreen;
import pcftest.InboundFileSearch.InboundFileSearchScreen.InboundFileConfigs;
import pcftest.InboundFileSearch.InboundFileSearchScreen.InboundFileSearchSearchPanel;
import pcftest.InboundFileSearch.InboundFileSearchScreen.InboundFileSearchSearchPanel.InboundFileSearchArchiveLocationHeader;
import pcftest.InboundFileSearch.InboundFileSearchScreen.InboundFileSearchSearchPanel.InboundFileSearchChecksumHeader;
import pcftest.InboundFileSearch.InboundFileSearchScreen.InboundFileSearchSearchPanel.InboundFileSearchFileStatus;
import pcftest.InboundFileSearch.InboundFileSearchScreen.InboundFileSearchSearchPanel.InboundFileSearchHandlerNameHeader;
import pcftest.InboundFileSearch.InboundFileSearchScreen.InboundFileSearchSearchPanel.InboundFileSearchInputLocationHeader;
import pcftest.InboundFileSearch.InboundFileSearchScreen.InboundFileSearchSearchPanel.InboundFileSearchLoadDateHeader;
import pcftest.InboundFileSearch.InboundFileSearchScreen.InboundFileSearchSearchPanel.InboundFileSearchMessageHeader;
import pcftest.InboundFileSearch.InboundFileSearchScreen.InboundFileSearchSearchPanel.InboundFileSearchStatusHeader;
import pcftest.InboundFileSearch.InboundFileSearchScreen.InboundFileSearchSearchPanel._ListPaging;
import pcftest.InboundFileSearch.InboundFileSearchScreen.InboundFileSearchSearchPanel.entry;
import pcftest.InboundFileSearch.InboundFileSearchScreen.InboundFileSearchSearchPanel.entry.InboundFileSearchStatus;
import pcftest.InboundFileSearch.InboundFileSearchScreen.InboundFileSearchSearchPanel.entry._Select;
import pcftest.InboundFileSearch.InboundFileSearchScreen.InboundFileSearchSearchPanel.entry._ViewDetail;
import pcftest.InboundFileSearch.InboundFileSearchScreen._msgs;
import pcftest.InboundFileSearch.InboundFileSearch_UpLink;
import pcftest.InboundFileSearch._Paging;
import pcftest.InboundFileSearch.__crumb__;
import typekey.InboundFileStatus;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/inbound/InboundFileSearch.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class InboundFileSearch extends PCFLocation {
  public final static String CHECKSUM = "6e444f047fe6ab7ad382c61440e2454f";
  
  public InboundFileSearch(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("InboundFileSearch"));
  }
  
  public InboundFileSearchScreen getInboundFileSearchScreen() {
    return getOrCreateProperty("InboundFileSearchScreen", "InboundFileSearchScreen", null, pcftest.InboundFileSearch.InboundFileSearchScreen.class);
  }
  
  public InboundFileSearch_UpLink getInboundFileSearch_UpLink() {
    return getOrCreateProperty("InboundFileSearch_UpLink", "InboundFileSearch_UpLink", null, pcftest.InboundFileSearch.InboundFileSearch_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.InboundFileSearch._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.InboundFileSearch.__crumb__.class);
  }
  
  public Admin get_parent() {
    return getOrCreateProperty("_parent", pcftest.Admin.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/inbound/InboundFileSearch.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class InboundFileSearchScreen extends PCFElement {
    public InboundFileSearchScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public InboundFileConfigs getInboundFileConfigs() {
      return getOrCreateProperty("InboundFileConfigs", "InboundFileConfigs", null, pcftest.InboundFileSearch.InboundFileSearchScreen.InboundFileConfigs.class);
    }
    
    public InboundFileSearchSearchPanel getInboundFileSearchSearchPanel() {
      return getOrCreateProperty("InboundFileSearchSearchPanel", "InboundFileSearchSearchPanel", null, pcftest.InboundFileSearch.InboundFileSearchScreen.InboundFileSearchSearchPanel.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.InboundFileSearch.InboundFileSearchScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/inbound/InboundFileSearch.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class InboundFileConfigs extends ClickableActionElement {
      public InboundFileConfigs(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public InboundConfigPopup click() {
        return clickThis(pcftest.InboundConfigPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/inbound/InboundFileSearch.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class InboundFileSearchSearchPanel extends PCFElement {
      public InboundFileSearchSearchPanel(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public InboundFileSearchArchiveLocationHeader getInboundFileSearchArchiveLocationHeader() {
        return getOrCreateProperty("InboundFileSearchArchiveLocationHeader", "InboundFileSearchArchiveLocationHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.InboundFileSearch.InboundFileSearchScreen.InboundFileSearchSearchPanel.InboundFileSearchArchiveLocationHeader.class);
      }
      
      public InboundFileSearchChecksumHeader getInboundFileSearchChecksumHeader() {
        return getOrCreateProperty("InboundFileSearchChecksumHeader", "InboundFileSearchChecksumHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.InboundFileSearch.InboundFileSearchScreen.InboundFileSearchSearchPanel.InboundFileSearchChecksumHeader.class);
      }
      
      public DateElement getInboundFileSearchEndingDate() {
        return getOrCreateProperty("InboundFileSearchEndingDate", "InboundFileSearchEndingDate", null, gw.smoketest.platform.web.DateElement.class);
      }
      
      public InboundFileSearchFileStatus getInboundFileSearchFileStatus() {
        return getOrCreateProperty("InboundFileSearchFileStatus", "InboundFileSearchFileStatus", null, pcftest.InboundFileSearch.InboundFileSearchScreen.InboundFileSearchSearchPanel.InboundFileSearchFileStatus.class);
      }
      
      public ValueElement getInboundFileSearchHandlerName() {
        return getOrCreateProperty("InboundFileSearchHandlerName", "InboundFileSearchHandlerName", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public InboundFileSearchHandlerNameHeader getInboundFileSearchHandlerNameHeader() {
        return getOrCreateProperty("InboundFileSearchHandlerNameHeader", "InboundFileSearchHandlerNameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.InboundFileSearch.InboundFileSearchScreen.InboundFileSearchSearchPanel.InboundFileSearchHandlerNameHeader.class);
      }
      
      public InboundFileSearchInputLocationHeader getInboundFileSearchInputLocationHeader() {
        return getOrCreateProperty("InboundFileSearchInputLocationHeader", "InboundFileSearchInputLocationHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.InboundFileSearch.InboundFileSearchScreen.InboundFileSearchSearchPanel.InboundFileSearchInputLocationHeader.class);
      }
      
      public InboundFileSearchLoadDateHeader getInboundFileSearchLoadDateHeader() {
        return getOrCreateProperty("InboundFileSearchLoadDateHeader", "InboundFileSearchLoadDateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.InboundFileSearch.InboundFileSearchScreen.InboundFileSearchSearchPanel.InboundFileSearchLoadDateHeader.class);
      }
      
      public InboundFileSearchMessageHeader getInboundFileSearchMessageHeader() {
        return getOrCreateProperty("InboundFileSearchMessageHeader", "InboundFileSearchMessageHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.InboundFileSearch.InboundFileSearchScreen.InboundFileSearchSearchPanel.InboundFileSearchMessageHeader.class);
      }
      
      public DateElement getInboundFileSearchStartingDate() {
        return getOrCreateProperty("InboundFileSearchStartingDate", "InboundFileSearchStartingDate", null, gw.smoketest.platform.web.DateElement.class);
      }
      
      public InboundFileSearchStatusHeader getInboundFileSearchStatusHeader() {
        return getOrCreateProperty("InboundFileSearchStatusHeader", "InboundFileSearchStatusHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.InboundFileSearch.InboundFileSearchScreen.InboundFileSearchSearchPanel.InboundFileSearchStatusHeader.class);
      }
      
      public SearchAndResetInputSet getSearchAndResetInputSet() {
        return getOrCreateProperty("SearchAndResetInputSet", "SearchAndResetInputSet", null, pcftest.SearchAndResetInputSet.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      @SuppressWarnings(value = "unchecked")
      public IteratorEntriesWithPaging<entry> get_Entries() {
        return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.InboundFileSearch.InboundFileSearchScreen.InboundFileSearchSearchPanel.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
      }
      
      public _ListPaging get_ListPaging() {
        return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.InboundFileSearch.InboundFileSearchScreen.InboundFileSearchSearchPanel._ListPaging.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/inbound/InboundFileSearch.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class InboundFileSearchArchiveLocationHeader extends ValueElement {
        public InboundFileSearchArchiveLocationHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/inbound/InboundFileSearch.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class InboundFileSearchChecksumHeader extends ValueElement {
        public InboundFileSearchChecksumHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/inbound/InboundFileSearch.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class InboundFileSearchFileStatus extends SelectElement {
        public InboundFileSearchFileStatus(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public OptionElement getOptionByTypeKey(InboundFileStatus arg) {
          return getOptionByValue(arg == null ? null : arg.getCode());
        }
        
        public InboundFileStatus getTypeKeyValue() {
          String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.InboundFileStatus.getTypeKey(myValue);
        }
        
        public void setTypeKeyValue(InboundFileStatus arg) {
          setValue(arg == null ? null : arg.getCode());
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/inbound/InboundFileSearch.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class InboundFileSearchHandlerNameHeader extends ValueElement {
        public InboundFileSearchHandlerNameHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/inbound/InboundFileSearch.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class InboundFileSearchInputLocationHeader extends ValueElement {
        public InboundFileSearchInputLocationHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/inbound/InboundFileSearch.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class InboundFileSearchLoadDateHeader extends ValueElement {
        public InboundFileSearchLoadDateHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/inbound/InboundFileSearch.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class InboundFileSearchMessageHeader extends ValueElement {
        public InboundFileSearchMessageHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/inbound/InboundFileSearch.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class InboundFileSearchStatusHeader extends ValueElement {
        public InboundFileSearchStatusHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/inbound/InboundFileSearch.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _ListPaging extends PagingElement {
        public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/inbound/InboundFileSearch.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class entry extends RowElement {
        public entry(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public ValueElement getInboundFileSearchArchiveLocation() {
          return getOrCreateProperty("InboundFileSearchArchiveLocation", "InboundFileSearchArchiveLocation", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getInboundFileSearchChecksum() {
          return getOrCreateProperty("InboundFileSearchChecksum", "InboundFileSearchChecksum", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getInboundFileSearchHandlerName() {
          return getOrCreateProperty("InboundFileSearchHandlerName", "InboundFileSearchHandlerName", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getInboundFileSearchInputLocation() {
          return getOrCreateProperty("InboundFileSearchInputLocation", "InboundFileSearchInputLocation", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public DateElement getInboundFileSearchLoadDate() {
          return getOrCreateProperty("InboundFileSearchLoadDate", "InboundFileSearchLoadDate", null, gw.smoketest.platform.web.DateElement.class);
        }
        
        public ValueElement getInboundFileSearchMessage() {
          return getOrCreateProperty("InboundFileSearchMessage", "InboundFileSearchMessage", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public InboundFileSearchStatus getInboundFileSearchStatus() {
          return getOrCreateProperty("InboundFileSearchStatus", "InboundFileSearchStatus", null, pcftest.InboundFileSearch.InboundFileSearchScreen.InboundFileSearchSearchPanel.entry.InboundFileSearchStatus.class);
        }
        
        public IteratorEntryCheckboxElement get_Checkbox() {
          return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
        }
        
        public _Select get_Select() {
          return getOrCreateProperty("_Select", "_Select", null, pcftest.InboundFileSearch.InboundFileSearchScreen.InboundFileSearchSearchPanel.entry._Select.class);
        }
        
        public _ViewDetail get_ViewDetail() {
          return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.InboundFileSearch.InboundFileSearchScreen.InboundFileSearchSearchPanel.entry._ViewDetail.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/inbound/InboundFileSearch.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class InboundFileSearchStatus extends SelectElement {
          public InboundFileSearchStatus(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public InboundFile click() {
            return clickThis(pcftest.InboundFile.class);
          }
          
          public OptionElement getOptionByTypeKey(InboundFileStatus arg) {
            return getOptionByValue(arg == null ? null : arg.getCode());
          }
          
          public InboundFileStatus getTypeKeyValue() {
            String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.InboundFileStatus.getTypeKey(myValue);
          }
          
          public void setTypeKeyValue(InboundFileStatus arg) {
            setValue(arg == null ? null : arg.getCode());
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/inbound/InboundFileSearch.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class _Select extends SelectorCellElement {
          public _Select(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/inbound/InboundFileSearch.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/inbound/InboundFileSearch.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/inbound/InboundFileSearch.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class InboundFileSearch_UpLink extends ClickableActionElement {
    public InboundFileSearch_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/inbound/InboundFileSearch.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/inbound/InboundFileSearch.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}