package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.IteratorEntries;
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
import pcftest.InboundFile.InboundFileScreen;
import pcftest.InboundFile.InboundFileScreen.InboundFileDVFileStatus;
import pcftest.InboundFile.InboundFileScreen.InboundFileDVRecordStatus;
import pcftest.InboundFile.InboundFileScreen.InboundFileLVContentHeader;
import pcftest.InboundFile.InboundFileScreen.InboundFileLVErrorMessageHeader;
import pcftest.InboundFile.InboundFileScreen.InboundFileLVLastModifiedDateHeader;
import pcftest.InboundFile.InboundFileScreen.InboundFileLVLastModifiedUserHeader;
import pcftest.InboundFile.InboundFileScreen.InboundFileLVLineNumberHeader;
import pcftest.InboundFile.InboundFileScreen.InboundFileLVStatusHeader;
import pcftest.InboundFile.InboundFileScreen.InboundFileRecordDetailsTab;
import pcftest.InboundFile.InboundFileScreen._ListPaging;
import pcftest.InboundFile.InboundFileScreen._msgs;
import pcftest.InboundFile.InboundFileScreen.entry;
import pcftest.InboundFile.InboundFileScreen.entry.InboundFileLVLineNumber;
import pcftest.InboundFile.InboundFileScreen.entry.InboundFileLVStatus;
import pcftest.InboundFile.InboundFileScreen.entry.entry2;
import pcftest.InboundFile.InboundFileScreen.entry.entry2.InboundFileLVSubineNumber;
import pcftest.InboundFile.InboundFile_UpLink;
import pcftest.InboundFile._Paging;
import pcftest.InboundFile.__crumb__;
import typekey.InboundFileStatus;
import typekey.InboundRecordStatus;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/inbound/InboundFile.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class InboundFile extends PCFLocation {
  public final static String CHECKSUM = "6051c4e18110abee2d19a9ebdbd5508b";
  
  public InboundFile(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("InboundFile"));
  }
  
  public InboundFileScreen getInboundFileScreen() {
    return getOrCreateProperty("InboundFileScreen", "InboundFileScreen", null, pcftest.InboundFile.InboundFileScreen.class);
  }
  
  public InboundFile_UpLink getInboundFile_UpLink() {
    return getOrCreateProperty("InboundFile_UpLink", "InboundFile_UpLink", null, pcftest.InboundFile.InboundFile_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.InboundFile._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.InboundFile.__crumb__.class);
  }
  
  public InboundFileSearch get_parent() {
    return getOrCreateProperty("_parent", pcftest.InboundFileSearch.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/inbound/InboundFile.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class InboundFileScreen extends PCFElement {
    public InboundFileScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getInboundFileDVArchiveLocation() {
      return getOrCreateProperty("InboundFileDVArchiveLocation", "InboundFileDVArchiveLocation", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getInboundFileDVConfigName() {
      return getOrCreateProperty("InboundFileDVConfigName", "InboundFileDVConfigName", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getInboundFileDVEndingLineNumber() {
      return getOrCreateProperty("InboundFileDVEndingLineNumber", "InboundFileDVEndingLineNumber", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getInboundFileDVErrorMessage() {
      return getOrCreateProperty("InboundFileDVErrorMessage", "InboundFileDVErrorMessage", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public InboundFileDVFileStatus getInboundFileDVFileStatus() {
      return getOrCreateProperty("InboundFileDVFileStatus", "InboundFileDVFileStatus", null, pcftest.InboundFile.InboundFileScreen.InboundFileDVFileStatus.class);
    }
    
    public ValueElement getInboundFileDVInputLocation() {
      return getOrCreateProperty("InboundFileDVInputLocation", "InboundFileDVInputLocation", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public DateElement getInboundFileDVLoadDate() {
      return getOrCreateProperty("InboundFileDVLoadDate", "InboundFileDVLoadDate", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public DateElement getInboundFileDVPurgeDate() {
      return getOrCreateProperty("InboundFileDVPurgeDate", "InboundFileDVPurgeDate", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public InboundFileDVRecordStatus getInboundFileDVRecordStatus() {
      return getOrCreateProperty("InboundFileDVRecordStatus", "InboundFileDVRecordStatus", null, pcftest.InboundFile.InboundFileScreen.InboundFileDVRecordStatus.class);
    }
    
    public ValueElement getInboundFileDVStartLineNumber() {
      return getOrCreateProperty("InboundFileDVStartLineNumber", "InboundFileDVStartLineNumber", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public InboundFileLVContentHeader getInboundFileLVContentHeader() {
      return getOrCreateProperty("InboundFileLVContentHeader", "InboundFileLVContentHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.InboundFile.InboundFileScreen.InboundFileLVContentHeader.class);
    }
    
    public InboundFileLVErrorMessageHeader getInboundFileLVErrorMessageHeader() {
      return getOrCreateProperty("InboundFileLVErrorMessageHeader", "InboundFileLVErrorMessageHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.InboundFile.InboundFileScreen.InboundFileLVErrorMessageHeader.class);
    }
    
    public InboundFileLVLastModifiedDateHeader getInboundFileLVLastModifiedDateHeader() {
      return getOrCreateProperty("InboundFileLVLastModifiedDateHeader", "InboundFileLVLastModifiedDateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.InboundFile.InboundFileScreen.InboundFileLVLastModifiedDateHeader.class);
    }
    
    public InboundFileLVLastModifiedUserHeader getInboundFileLVLastModifiedUserHeader() {
      return getOrCreateProperty("InboundFileLVLastModifiedUserHeader", "InboundFileLVLastModifiedUserHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.InboundFile.InboundFileScreen.InboundFileLVLastModifiedUserHeader.class);
    }
    
    public InboundFileLVLineNumberHeader getInboundFileLVLineNumberHeader() {
      return getOrCreateProperty("InboundFileLVLineNumberHeader", "InboundFileLVLineNumberHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.InboundFile.InboundFileScreen.InboundFileLVLineNumberHeader.class);
    }
    
    public InboundFileLVStatusHeader getInboundFileLVStatusHeader() {
      return getOrCreateProperty("InboundFileLVStatusHeader", "InboundFileLVStatusHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.InboundFile.InboundFileScreen.InboundFileLVStatusHeader.class);
    }
    
    public InboundFileRecordDetailsTab getInboundFileRecordDetailsTab() {
      return getOrCreateProperty("InboundFileRecordDetailsTab", "InboundFileRecordDetailsTab", null, pcftest.InboundFile.InboundFileScreen.InboundFileRecordDetailsTab.class);
    }
    
    public InboundRecordDV_InboundRecord getInboundRecordDV_InboundRecord() {
      return getOrCreateProperty("InboundRecordDV_InboundRecord", "InboundRecordDV", null, pcftest.InboundRecordDV_InboundRecord.class);
    }
    
    public InboundRecordDV_InboundRecordView getInboundRecordDV_InboundRecordView() {
      return getOrCreateProperty("InboundRecordDV_InboundRecordView", "InboundRecordDV", null, pcftest.InboundRecordDV_InboundRecordView.class);
    }
    
    public InboundRecordDV_InboundSubRecord getInboundRecordDV_InboundSubRecord() {
      return getOrCreateProperty("InboundRecordDV_InboundSubRecord", "InboundRecordDV", null, pcftest.InboundRecordDV_InboundSubRecord.class);
    }
    
    public InboundRecordDV_InboundSubRecordView getInboundRecordDV_InboundSubRecordView() {
      return getOrCreateProperty("InboundRecordDV_InboundSubRecordView", "InboundRecordDV", null, pcftest.InboundRecordDV_InboundSubRecordView.class);
    }
    
    public SearchAndResetInputSet getSearchAndResetInputSet() {
      return getOrCreateProperty("SearchAndResetInputSet", "SearchAndResetInputSet", null, pcftest.SearchAndResetInputSet.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.InboundFile.InboundFileScreen.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public _ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.InboundFile.InboundFileScreen._ListPaging.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.InboundFile.InboundFileScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/inbound/InboundFile.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class InboundFileDVFileStatus extends SelectElement {
      public InboundFileDVFileStatus(ISmokeTest helper, PCFElementId componentId)  {
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
    @Generated(comments = "config/web/pcf/inbound/InboundFile.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class InboundFileDVRecordStatus extends SelectElement {
      public InboundFileDVRecordStatus(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(InboundRecordStatus arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public InboundRecordStatus getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.InboundRecordStatus.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(InboundRecordStatus arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/inbound/InboundFile.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class InboundFileLVContentHeader extends ValueElement {
      public InboundFileLVContentHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/inbound/InboundFile.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class InboundFileLVErrorMessageHeader extends ValueElement {
      public InboundFileLVErrorMessageHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/inbound/InboundFile.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class InboundFileLVLastModifiedDateHeader extends ValueElement {
      public InboundFileLVLastModifiedDateHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/inbound/InboundFile.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class InboundFileLVLastModifiedUserHeader extends ValueElement {
      public InboundFileLVLastModifiedUserHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/inbound/InboundFile.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class InboundFileLVLineNumberHeader extends ValueElement {
      public InboundFileLVLineNumberHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/inbound/InboundFile.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class InboundFileLVStatusHeader extends ValueElement {
      public InboundFileLVStatusHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/inbound/InboundFile.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class InboundFileRecordDetailsTab extends ClickableActionElement {
      public InboundFileRecordDetailsTab(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/inbound/InboundFile.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/inbound/InboundFile.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _msgs extends MessagesElement {
      public _msgs(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/inbound/InboundFile.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends RowElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ValueElement getInboundFileLVContent() {
        return getOrCreateProperty("InboundFileLVContent", "InboundFileLVContent", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getInboundFileLVErrorMessage() {
        return getOrCreateProperty("InboundFileLVErrorMessage", "InboundFileLVErrorMessage", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public DateElement getInboundFileLVLastModifiedDate() {
        return getOrCreateProperty("InboundFileLVLastModifiedDate", "InboundFileLVLastModifiedDate", null, gw.smoketest.platform.web.DateElement.class);
      }
      
      public ValueElement getInboundFileLVLastModifiedUser() {
        return getOrCreateProperty("InboundFileLVLastModifiedUser", "InboundFileLVLastModifiedUser", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public InboundFileLVLineNumber getInboundFileLVLineNumber() {
        return getOrCreateProperty("InboundFileLVLineNumber", "InboundFileLVLineNumber", null, pcftest.InboundFile.InboundFileScreen.entry.InboundFileLVLineNumber.class);
      }
      
      public InboundFileLVStatus getInboundFileLVStatus() {
        return getOrCreateProperty("InboundFileLVStatus", "InboundFileLVStatus", null, pcftest.InboundFile.InboundFileScreen.entry.InboundFileLVStatus.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      @SuppressWarnings(value = "unchecked")
      public IteratorEntries<entry2> get_Entries() {
        return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.InboundFile.InboundFileScreen.entry.entry2.class, gw.smoketest.platform.web.IteratorEntries.class);
      }
      
      public pcftest.InboundFile.InboundFileScreen.entry._Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.InboundFile.InboundFileScreen.entry._Select.class);
      }
      
      public pcftest.InboundFile.InboundFileScreen.entry._ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.InboundFile.InboundFileScreen.entry._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/inbound/InboundFile.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class InboundFileLVLineNumber extends ValueElement {
        public InboundFileLVLineNumber(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public InboundRecordPopup click() {
          return clickThis(pcftest.InboundRecordPopup.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/inbound/InboundFile.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class InboundFileLVStatus extends SelectElement {
        public InboundFileLVStatus(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public OptionElement getOptionByTypeKey(InboundRecordStatus arg) {
          return getOptionByValue(arg == null ? null : arg.getCode());
        }
        
        public InboundRecordStatus getTypeKeyValue() {
          String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.InboundRecordStatus.getTypeKey(myValue);
        }
        
        public void setTypeKeyValue(InboundRecordStatus arg) {
          setValue(arg == null ? null : arg.getCode());
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/inbound/InboundFile.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/inbound/InboundFile.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _ViewDetail extends BooleanValueElement {
        public _ViewDetail(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/inbound/InboundFile.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class entry2 extends RowElement {
        public entry2(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public ValueElement getInboundFileLVEmpty1() {
          return getOrCreateProperty("InboundFileLVEmpty1", "InboundFileLVEmpty1", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getInboundFileLVEmpty2() {
          return getOrCreateProperty("InboundFileLVEmpty2", "InboundFileLVEmpty2", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getInboundFileLVEmpty3() {
          return getOrCreateProperty("InboundFileLVEmpty3", "InboundFileLVEmpty3", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getInboundFileLVEmpty4() {
          return getOrCreateProperty("InboundFileLVEmpty4", "InboundFileLVEmpty4", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getInboundFileLVSubContent() {
          return getOrCreateProperty("InboundFileLVSubContent", "InboundFileLVSubContent", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public InboundFileLVSubineNumber getInboundFileLVSubineNumber() {
          return getOrCreateProperty("InboundFileLVSubineNumber", "InboundFileLVSubineNumber", null, pcftest.InboundFile.InboundFileScreen.entry.entry2.InboundFileLVSubineNumber.class);
        }
        
        public IteratorEntryCheckboxElement get_Checkbox() {
          return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
        }
        
        public pcftest.InboundFile.InboundFileScreen.entry.entry2._Select get_Select() {
          return getOrCreateProperty("_Select", "_Select", null, pcftest.InboundFile.InboundFileScreen.entry.entry2._Select.class);
        }
        
        public pcftest.InboundFile.InboundFileScreen.entry.entry2._ViewDetail get_ViewDetail() {
          return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.InboundFile.InboundFileScreen.entry.entry2._ViewDetail.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/inbound/InboundFile.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class InboundFileLVSubineNumber extends ValueElement {
          public InboundFileLVSubineNumber(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public InboundRecordPopup click() {
            return clickThis(pcftest.InboundRecordPopup.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/inbound/InboundFile.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class _Select extends SelectorCellElement {
          public _Select(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/inbound/InboundFile.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/inbound/InboundFile.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class InboundFile_UpLink extends ClickableActionElement {
    public InboundFile_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/inbound/InboundFile.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/inbound/InboundFile.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}