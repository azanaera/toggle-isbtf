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
import pcftest.OutboundFileSearch.OutboundFileSearchScreen;
import pcftest.OutboundFileSearch.OutboundFileSearchScreen.OutboundFileCardTab;
import pcftest.OutboundFileSearch.OutboundFileSearchScreen.OutboundFileConfigs;
import pcftest.OutboundFileSearch.OutboundFileSearchScreen.OutboundFileSearchSearchPanel;
import pcftest.OutboundFileSearch.OutboundFileSearchScreen.OutboundFileSearchSearchPanel.OutboundFileSearchArchiveLocationBatchIDHeader;
import pcftest.OutboundFileSearch.OutboundFileSearchScreen.OutboundFileSearchSearchPanel.OutboundFileSearchConfigHeader;
import pcftest.OutboundFileSearch.OutboundFileSearchScreen.OutboundFileSearchSearchPanel.OutboundFileSearchCreateDateHeader;
import pcftest.OutboundFileSearch.OutboundFileSearchScreen.OutboundFileSearchSearchPanel.OutboundFileSearchFileNameHeader;
import pcftest.OutboundFileSearch.OutboundFileSearchScreen.OutboundFileSearchSearchPanel.OutboundFileSearchPurgeDateHeader;
import pcftest.OutboundFileSearch.OutboundFileSearchScreen.OutboundFileSearchSearchPanel.entry.OutboundFileSearchCreateDate;
import pcftest.OutboundFileSearch.OutboundFileSearchScreen.OutboundRecordCardTab;
import pcftest.OutboundFileSearch.OutboundFileSearchScreen.OutboundRecordSearchSearchPanel;
import pcftest.OutboundFileSearch.OutboundFileSearchScreen.OutboundRecordSearchSearchPanel.OutboundFileSearchStatus;
import pcftest.OutboundFileSearch.OutboundFileSearchScreen.OutboundRecordSearchSearchPanel.OutboundRecordSearchConfigHeader;
import pcftest.OutboundFileSearch.OutboundFileSearchScreen.OutboundRecordSearchSearchPanel.OutboundRecordSearchContentHeader;
import pcftest.OutboundFileSearch.OutboundFileSearchScreen.OutboundRecordSearchSearchPanel.OutboundRecordSearchCreateDateHeader;
import pcftest.OutboundFileSearch.OutboundFileSearchScreen.OutboundRecordSearchSearchPanel.OutboundRecordSearchErrorMessageHeader;
import pcftest.OutboundFileSearch.OutboundFileSearchScreen.OutboundRecordSearchSearchPanel.OutboundRecordSearchStatusHeader;
import pcftest.OutboundFileSearch.OutboundFileSearchScreen.OutboundRecordSearchSearchPanel.PurgeDateHeader;
import pcftest.OutboundFileSearch.OutboundFileSearchScreen.OutboundRecordSearchSearchPanel.entry.OutboundRecordSearchCreateDate;
import pcftest.OutboundFileSearch.OutboundFileSearchScreen.OutboundRecordSearchSearchPanel.entry.OutboundRecordSearchStatus;
import pcftest.OutboundFileSearch.OutboundFileSearchScreen._msgs;
import pcftest.OutboundFileSearch.OutboundFileSearch_UpLink;
import pcftest.OutboundFileSearch._Paging;
import pcftest.OutboundFileSearch.__crumb__;
import typekey.OutboundRecordStatus;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/outboundfile/OutboundFileSearch.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class OutboundFileSearch extends PCFLocation {
  public final static String CHECKSUM = "4af5f8838e064f199decf0e467edeaa0";
  
  public OutboundFileSearch(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("OutboundFileSearch"));
  }
  
  public OutboundFileSearchScreen getOutboundFileSearchScreen() {
    return getOrCreateProperty("OutboundFileSearchScreen", "OutboundFileSearchScreen", null, pcftest.OutboundFileSearch.OutboundFileSearchScreen.class);
  }
  
  public OutboundFileSearch_UpLink getOutboundFileSearch_UpLink() {
    return getOrCreateProperty("OutboundFileSearch_UpLink", "OutboundFileSearch_UpLink", null, pcftest.OutboundFileSearch.OutboundFileSearch_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.OutboundFileSearch._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.OutboundFileSearch.__crumb__.class);
  }
  
  public Admin get_parent() {
    return getOrCreateProperty("_parent", pcftest.Admin.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/outboundfile/OutboundFileSearch.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class OutboundFileSearchScreen extends PCFElement {
    public OutboundFileSearchScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OutboundFileCardTab getOutboundFileCardTab() {
      return getOrCreateProperty("OutboundFileCardTab", "OutboundFileCardTab", null, pcftest.OutboundFileSearch.OutboundFileSearchScreen.OutboundFileCardTab.class);
    }
    
    public OutboundFileConfigs getOutboundFileConfigs() {
      return getOrCreateProperty("OutboundFileConfigs", "OutboundFileConfigs", null, pcftest.OutboundFileSearch.OutboundFileSearchScreen.OutboundFileConfigs.class);
    }
    
    public OutboundFileSearchSearchPanel getOutboundFileSearchSearchPanel() {
      return getOrCreateProperty("OutboundFileSearchSearchPanel", "OutboundFileSearchSearchPanel", null, pcftest.OutboundFileSearch.OutboundFileSearchScreen.OutboundFileSearchSearchPanel.class);
    }
    
    public OutboundRecordCardTab getOutboundRecordCardTab() {
      return getOrCreateProperty("OutboundRecordCardTab", "OutboundRecordCardTab", null, pcftest.OutboundFileSearch.OutboundFileSearchScreen.OutboundRecordCardTab.class);
    }
    
    public OutboundRecordSearchSearchPanel getOutboundRecordSearchSearchPanel() {
      return getOrCreateProperty("OutboundRecordSearchSearchPanel", "OutboundRecordSearchSearchPanel", null, pcftest.OutboundFileSearch.OutboundFileSearchScreen.OutboundRecordSearchSearchPanel.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.OutboundFileSearch.OutboundFileSearchScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/outboundfile/OutboundFileSearch.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class OutboundFileCardTab extends ClickableActionElement {
      public OutboundFileCardTab(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/outboundfile/OutboundFileSearch.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class OutboundFileConfigs extends ClickableActionElement {
      public OutboundFileConfigs(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OutboundConfigPopup click() {
        return clickThis(pcftest.OutboundConfigPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/outboundfile/OutboundFileSearch.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class OutboundFileSearchSearchPanel extends PCFElement {
      public OutboundFileSearchSearchPanel(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OutboundFileSearchArchiveLocationBatchIDHeader getOutboundFileSearchArchiveLocationBatchIDHeader() {
        return getOrCreateProperty("OutboundFileSearchArchiveLocationBatchIDHeader", "OutboundFileSearchArchiveLocationBatchIDHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.OutboundFileSearch.OutboundFileSearchScreen.OutboundFileSearchSearchPanel.OutboundFileSearchArchiveLocationBatchIDHeader.class);
      }
      
      public ValueElement getOutboundFileSearchConfig() {
        return getOrCreateProperty("OutboundFileSearchConfig", "OutboundFileSearchConfig", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public OutboundFileSearchConfigHeader getOutboundFileSearchConfigHeader() {
        return getOrCreateProperty("OutboundFileSearchConfigHeader", "OutboundFileSearchConfigHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.OutboundFileSearch.OutboundFileSearchScreen.OutboundFileSearchSearchPanel.OutboundFileSearchConfigHeader.class);
      }
      
      public OutboundFileSearchCreateDateHeader getOutboundFileSearchCreateDateHeader() {
        return getOrCreateProperty("OutboundFileSearchCreateDateHeader", "OutboundFileSearchCreateDateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.OutboundFileSearch.OutboundFileSearchScreen.OutboundFileSearchSearchPanel.OutboundFileSearchCreateDateHeader.class);
      }
      
      public DateElement getOutboundFileSearchEndingDate() {
        return getOrCreateProperty("OutboundFileSearchEndingDate", "OutboundFileSearchEndingDate", null, gw.smoketest.platform.web.DateElement.class);
      }
      
      public OutboundFileSearchFileNameHeader getOutboundFileSearchFileNameHeader() {
        return getOrCreateProperty("OutboundFileSearchFileNameHeader", "OutboundFileSearchFileNameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.OutboundFileSearch.OutboundFileSearchScreen.OutboundFileSearchSearchPanel.OutboundFileSearchFileNameHeader.class);
      }
      
      public OutboundFileSearchPurgeDateHeader getOutboundFileSearchPurgeDateHeader() {
        return getOrCreateProperty("OutboundFileSearchPurgeDateHeader", "OutboundFileSearchPurgeDateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.OutboundFileSearch.OutboundFileSearchScreen.OutboundFileSearchSearchPanel.OutboundFileSearchPurgeDateHeader.class);
      }
      
      public DateElement getOutboundFileSearchStartingDate() {
        return getOrCreateProperty("OutboundFileSearchStartingDate", "OutboundFileSearchStartingDate", null, gw.smoketest.platform.web.DateElement.class);
      }
      
      public SearchAndResetInputSet getSearchAndResetInputSet() {
        return getOrCreateProperty("SearchAndResetInputSet", "SearchAndResetInputSet", null, pcftest.SearchAndResetInputSet.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      @SuppressWarnings(value = "unchecked")
      public IteratorEntriesWithPaging<pcftest.OutboundFileSearch.OutboundFileSearchScreen.OutboundFileSearchSearchPanel.entry> get_Entries() {
        return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.OutboundFileSearch.OutboundFileSearchScreen.OutboundFileSearchSearchPanel.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
      }
      
      public pcftest.OutboundFileSearch.OutboundFileSearchScreen.OutboundFileSearchSearchPanel._ListPaging get_ListPaging() {
        return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.OutboundFileSearch.OutboundFileSearchScreen.OutboundFileSearchSearchPanel._ListPaging.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/outboundfile/OutboundFileSearch.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class OutboundFileSearchArchiveLocationBatchIDHeader extends ValueElement {
        public OutboundFileSearchArchiveLocationBatchIDHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/outboundfile/OutboundFileSearch.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class OutboundFileSearchConfigHeader extends ValueElement {
        public OutboundFileSearchConfigHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/outboundfile/OutboundFileSearch.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class OutboundFileSearchCreateDateHeader extends ValueElement {
        public OutboundFileSearchCreateDateHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/outboundfile/OutboundFileSearch.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class OutboundFileSearchFileNameHeader extends ValueElement {
        public OutboundFileSearchFileNameHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/outboundfile/OutboundFileSearch.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class OutboundFileSearchPurgeDateHeader extends ValueElement {
        public OutboundFileSearchPurgeDateHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/outboundfile/OutboundFileSearch.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _ListPaging extends PagingElement {
        public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/outboundfile/OutboundFileSearch.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class entry extends RowElement {
        public entry(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public ValueElement getOutboundFileSearchArchiveLocationBatchID() {
          return getOrCreateProperty("OutboundFileSearchArchiveLocationBatchID", "OutboundFileSearchArchiveLocationBatchID", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getOutboundFileSearchConfig() {
          return getOrCreateProperty("OutboundFileSearchConfig", "OutboundFileSearchConfig", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public OutboundFileSearchCreateDate getOutboundFileSearchCreateDate() {
          return getOrCreateProperty("OutboundFileSearchCreateDate", "OutboundFileSearchCreateDate", null, pcftest.OutboundFileSearch.OutboundFileSearchScreen.OutboundFileSearchSearchPanel.entry.OutboundFileSearchCreateDate.class);
        }
        
        public ValueElement getOutboundFileSearchFileName() {
          return getOrCreateProperty("OutboundFileSearchFileName", "OutboundFileSearchFileName", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public DateElement getOutboundFileSearchPurgeDate() {
          return getOrCreateProperty("OutboundFileSearchPurgeDate", "OutboundFileSearchPurgeDate", null, gw.smoketest.platform.web.DateElement.class);
        }
        
        public IteratorEntryCheckboxElement get_Checkbox() {
          return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
        }
        
        public pcftest.OutboundFileSearch.OutboundFileSearchScreen.OutboundFileSearchSearchPanel.entry._Select get_Select() {
          return getOrCreateProperty("_Select", "_Select", null, pcftest.OutboundFileSearch.OutboundFileSearchScreen.OutboundFileSearchSearchPanel.entry._Select.class);
        }
        
        public pcftest.OutboundFileSearch.OutboundFileSearchScreen.OutboundFileSearchSearchPanel.entry._ViewDetail get_ViewDetail() {
          return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.OutboundFileSearch.OutboundFileSearchScreen.OutboundFileSearchSearchPanel.entry._ViewDetail.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/outboundfile/OutboundFileSearch.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class OutboundFileSearchCreateDate extends DateElement {
          public OutboundFileSearchCreateDate(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public OutboundFile click() {
            return clickThis(pcftest.OutboundFile.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/outboundfile/OutboundFileSearch.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class _Select extends SelectorCellElement {
          public _Select(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/outboundfile/OutboundFileSearch.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/outboundfile/OutboundFileSearch.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class OutboundRecordCardTab extends ClickableActionElement {
      public OutboundRecordCardTab(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/outboundfile/OutboundFileSearch.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class OutboundRecordSearchSearchPanel extends PCFElement {
      public OutboundRecordSearchSearchPanel(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OutboundFileSearchStatus getOutboundFileSearchStatus() {
        return getOrCreateProperty("OutboundFileSearchStatus", "OutboundFileSearchStatus", null, pcftest.OutboundFileSearch.OutboundFileSearchScreen.OutboundRecordSearchSearchPanel.OutboundFileSearchStatus.class);
      }
      
      public ValueElement getOutboundRecordSearchConfig() {
        return getOrCreateProperty("OutboundRecordSearchConfig", "OutboundRecordSearchConfig", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public OutboundRecordSearchConfigHeader getOutboundRecordSearchConfigHeader() {
        return getOrCreateProperty("OutboundRecordSearchConfigHeader", "OutboundRecordSearchConfigHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.OutboundFileSearch.OutboundFileSearchScreen.OutboundRecordSearchSearchPanel.OutboundRecordSearchConfigHeader.class);
      }
      
      public OutboundRecordSearchContentHeader getOutboundRecordSearchContentHeader() {
        return getOrCreateProperty("OutboundRecordSearchContentHeader", "OutboundRecordSearchContentHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.OutboundFileSearch.OutboundFileSearchScreen.OutboundRecordSearchSearchPanel.OutboundRecordSearchContentHeader.class);
      }
      
      public OutboundRecordSearchCreateDateHeader getOutboundRecordSearchCreateDateHeader() {
        return getOrCreateProperty("OutboundRecordSearchCreateDateHeader", "OutboundRecordSearchCreateDateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.OutboundFileSearch.OutboundFileSearchScreen.OutboundRecordSearchSearchPanel.OutboundRecordSearchCreateDateHeader.class);
      }
      
      public DateElement getOutboundRecordSearchEndingDate() {
        return getOrCreateProperty("OutboundRecordSearchEndingDate", "OutboundRecordSearchEndingDate", null, gw.smoketest.platform.web.DateElement.class);
      }
      
      public OutboundRecordSearchErrorMessageHeader getOutboundRecordSearchErrorMessageHeader() {
        return getOrCreateProperty("OutboundRecordSearchErrorMessageHeader", "OutboundRecordSearchErrorMessageHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.OutboundFileSearch.OutboundFileSearchScreen.OutboundRecordSearchSearchPanel.OutboundRecordSearchErrorMessageHeader.class);
      }
      
      public DateElement getOutboundRecordSearchStartingDate() {
        return getOrCreateProperty("OutboundRecordSearchStartingDate", "OutboundRecordSearchStartingDate", null, gw.smoketest.platform.web.DateElement.class);
      }
      
      public OutboundRecordSearchStatusHeader getOutboundRecordSearchStatusHeader() {
        return getOrCreateProperty("OutboundRecordSearchStatusHeader", "OutboundRecordSearchStatusHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.OutboundFileSearch.OutboundFileSearchScreen.OutboundRecordSearchSearchPanel.OutboundRecordSearchStatusHeader.class);
      }
      
      public PurgeDateHeader getPurgeDateHeader() {
        return getOrCreateProperty("PurgeDateHeader", "PurgeDateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.OutboundFileSearch.OutboundFileSearchScreen.OutboundRecordSearchSearchPanel.PurgeDateHeader.class);
      }
      
      public SearchAndResetInputSet getSearchAndResetInputSet() {
        return getOrCreateProperty("SearchAndResetInputSet", "SearchAndResetInputSet", null, pcftest.SearchAndResetInputSet.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      @SuppressWarnings(value = "unchecked")
      public IteratorEntriesWithPaging<pcftest.OutboundFileSearch.OutboundFileSearchScreen.OutboundRecordSearchSearchPanel.entry> get_Entries() {
        return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.OutboundFileSearch.OutboundFileSearchScreen.OutboundRecordSearchSearchPanel.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
      }
      
      public pcftest.OutboundFileSearch.OutboundFileSearchScreen.OutboundRecordSearchSearchPanel._ListPaging get_ListPaging() {
        return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.OutboundFileSearch.OutboundFileSearchScreen.OutboundRecordSearchSearchPanel._ListPaging.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/outboundfile/OutboundFileSearch.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class OutboundFileSearchStatus extends SelectElement {
        public OutboundFileSearchStatus(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public OptionElement getOptionByTypeKey(OutboundRecordStatus arg) {
          return getOptionByValue(arg == null ? null : arg.getCode());
        }
        
        public OutboundRecordStatus getTypeKeyValue() {
          String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.OutboundRecordStatus.getTypeKey(myValue);
        }
        
        public void setTypeKeyValue(OutboundRecordStatus arg) {
          setValue(arg == null ? null : arg.getCode());
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/outboundfile/OutboundFileSearch.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class OutboundRecordSearchConfigHeader extends ValueElement {
        public OutboundRecordSearchConfigHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/outboundfile/OutboundFileSearch.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class OutboundRecordSearchContentHeader extends ValueElement {
        public OutboundRecordSearchContentHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/outboundfile/OutboundFileSearch.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class OutboundRecordSearchCreateDateHeader extends ValueElement {
        public OutboundRecordSearchCreateDateHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/outboundfile/OutboundFileSearch.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class OutboundRecordSearchErrorMessageHeader extends ValueElement {
        public OutboundRecordSearchErrorMessageHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/outboundfile/OutboundFileSearch.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class OutboundRecordSearchStatusHeader extends ValueElement {
        public OutboundRecordSearchStatusHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/outboundfile/OutboundFileSearch.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class PurgeDateHeader extends ValueElement {
        public PurgeDateHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/outboundfile/OutboundFileSearch.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _ListPaging extends PagingElement {
        public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/outboundfile/OutboundFileSearch.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class entry extends RowElement {
        public entry(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public ValueElement getOutboundRecordSearchConfig() {
          return getOrCreateProperty("OutboundRecordSearchConfig", "OutboundRecordSearchConfig", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getOutboundRecordSearchContent() {
          return getOrCreateProperty("OutboundRecordSearchContent", "OutboundRecordSearchContent", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public OutboundRecordSearchCreateDate getOutboundRecordSearchCreateDate() {
          return getOrCreateProperty("OutboundRecordSearchCreateDate", "OutboundRecordSearchCreateDate", null, pcftest.OutboundFileSearch.OutboundFileSearchScreen.OutboundRecordSearchSearchPanel.entry.OutboundRecordSearchCreateDate.class);
        }
        
        public ValueElement getOutboundRecordSearchErrorMessage() {
          return getOrCreateProperty("OutboundRecordSearchErrorMessage", "OutboundRecordSearchErrorMessage", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public OutboundRecordSearchStatus getOutboundRecordSearchStatus() {
          return getOrCreateProperty("OutboundRecordSearchStatus", "OutboundRecordSearchStatus", null, pcftest.OutboundFileSearch.OutboundFileSearchScreen.OutboundRecordSearchSearchPanel.entry.OutboundRecordSearchStatus.class);
        }
        
        public DateElement getPurgeDate() {
          return getOrCreateProperty("PurgeDate", "PurgeDate", null, gw.smoketest.platform.web.DateElement.class);
        }
        
        public IteratorEntryCheckboxElement get_Checkbox() {
          return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
        }
        
        public pcftest.OutboundFileSearch.OutboundFileSearchScreen.OutboundRecordSearchSearchPanel.entry._Select get_Select() {
          return getOrCreateProperty("_Select", "_Select", null, pcftest.OutboundFileSearch.OutboundFileSearchScreen.OutboundRecordSearchSearchPanel.entry._Select.class);
        }
        
        public pcftest.OutboundFileSearch.OutboundFileSearchScreen.OutboundRecordSearchSearchPanel.entry._ViewDetail get_ViewDetail() {
          return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.OutboundFileSearch.OutboundFileSearchScreen.OutboundRecordSearchSearchPanel.entry._ViewDetail.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/outboundfile/OutboundFileSearch.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class OutboundRecordSearchCreateDate extends DateElement {
          public OutboundRecordSearchCreateDate(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public OutboundRecordPopup click() {
            return clickThis(pcftest.OutboundRecordPopup.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/outboundfile/OutboundFileSearch.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class OutboundRecordSearchStatus extends SelectElement {
          public OutboundRecordSearchStatus(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public OptionElement getOptionByTypeKey(OutboundRecordStatus arg) {
            return getOptionByValue(arg == null ? null : arg.getCode());
          }
          
          public OutboundRecordStatus getTypeKeyValue() {
            String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.OutboundRecordStatus.getTypeKey(myValue);
          }
          
          public void setTypeKeyValue(OutboundRecordStatus arg) {
            setValue(arg == null ? null : arg.getCode());
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/outboundfile/OutboundFileSearch.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class _Select extends SelectorCellElement {
          public _Select(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/outboundfile/OutboundFileSearch.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/outboundfile/OutboundFileSearch.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/outboundfile/OutboundFileSearch.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class OutboundFileSearch_UpLink extends ClickableActionElement {
    public OutboundFileSearch_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/outboundfile/OutboundFileSearch.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/outboundfile/OutboundFileSearch.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}