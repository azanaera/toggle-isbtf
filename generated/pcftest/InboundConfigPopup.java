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
import pcftest.InboundConfigPopup.InboundConfigPopup_UpLink;
import pcftest.InboundConfigPopup.InboundConfigScreen;
import pcftest.InboundConfigPopup.InboundConfigScreen.InboundS3ConfigsLV;
import pcftest.InboundConfigPopup.InboundConfigScreen.InboundS3ConfigsLV.ArchiveS3BucketHeader;
import pcftest.InboundConfigPopup.InboundConfigScreen.InboundS3ConfigsLV.ArchiveS3PrefixHeader;
import pcftest.InboundConfigPopup.InboundConfigScreen.InboundS3ConfigsLV.ChunkSizeHeader;
import pcftest.InboundConfigPopup.InboundConfigScreen.InboundS3ConfigsLV.DaysTillPurgeHeader;
import pcftest.InboundConfigPopup.InboundConfigScreen.InboundS3ConfigsLV.HandlerClassHeader;
import pcftest.InboundConfigPopup.InboundConfigScreen.InboundS3ConfigsLV.InputS3BucketHeader;
import pcftest.InboundConfigPopup.InboundConfigScreen.InboundS3ConfigsLV.InputS3PrefixHeader;
import pcftest.InboundConfigPopup.InboundConfigScreen.InboundS3ConfigsLV.NameHeader;
import pcftest.InboundConfigPopup.InboundConfigScreen.InboundS3ConfigsLV._ListPaging;
import pcftest.InboundConfigPopup.InboundConfigScreen.InboundS3ConfigsLV.entry;
import pcftest.InboundConfigPopup.InboundConfigScreen.InboundS3ConfigsLV.entry._Select;
import pcftest.InboundConfigPopup.InboundConfigScreen.InboundS3ConfigsLV.entry._ViewDetail;
import pcftest.InboundConfigPopup.InboundConfigScreen.InboundS3FileConfigCardTab;
import pcftest.InboundConfigPopup.InboundConfigScreen.InboundS3FileConfigToolbar;
import pcftest.InboundConfigPopup.InboundConfigScreen.InboundS3FileConfigToolbar.Cancel;
import pcftest.InboundConfigPopup.InboundConfigScreen.InboundS3FileConfigToolbar.Edit;
import pcftest.InboundConfigPopup.InboundConfigScreen.InboundS3FileConfigToolbar.S3ConfigsDeleteButton;
import pcftest.InboundConfigPopup.InboundConfigScreen.InboundS3FileConfigToolbar.S3ConfigsNewButton;
import pcftest.InboundConfigPopup.InboundConfigScreen.InboundS3FileConfigToolbar.Update;
import pcftest.InboundConfigPopup.InboundConfigScreen._msgs;
import pcftest.InboundConfigPopup._Paging;
import pcftest.InboundConfigPopup.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/inbound/InboundConfigPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class InboundConfigPopup extends PCFLocation {
  public final static String CHECKSUM = "5f354e6b6e9d74573941a9e51f19129c";
  
  public InboundConfigPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("InboundConfigPopup"));
  }
  
  public InboundConfigPopup_UpLink getInboundConfigPopup_UpLink() {
    return getOrCreateProperty("InboundConfigPopup_UpLink", "InboundConfigPopup_UpLink", null, pcftest.InboundConfigPopup.InboundConfigPopup_UpLink.class);
  }
  
  public InboundConfigScreen getInboundConfigScreen() {
    return getOrCreateProperty("InboundConfigScreen", "InboundConfigScreen", null, pcftest.InboundConfigPopup.InboundConfigScreen.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.InboundConfigPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.InboundConfigPopup.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/inbound/InboundConfigPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class InboundConfigPopup_UpLink extends ClickableActionElement {
    public InboundConfigPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/inbound/InboundConfigPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class InboundConfigScreen extends PCFElement {
    public InboundConfigScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public InboundS3ConfigsLV getInboundS3ConfigsLV() {
      return getOrCreateProperty("InboundS3ConfigsLV", "InboundS3ConfigsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.InboundConfigPopup.InboundConfigScreen.InboundS3ConfigsLV.class);
    }
    
    public InboundS3FileConfigCardTab getInboundS3FileConfigCardTab() {
      return getOrCreateProperty("InboundS3FileConfigCardTab", "InboundS3FileConfigCardTab", null, pcftest.InboundConfigPopup.InboundConfigScreen.InboundS3FileConfigCardTab.class);
    }
    
    public InboundS3FileConfigToolbar getInboundS3FileConfigToolbar() {
      return getOrCreateProperty("InboundS3FileConfigToolbar", "InboundS3FileConfigToolbar", null, pcftest.InboundConfigPopup.InboundConfigScreen.InboundS3FileConfigToolbar.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.InboundConfigPopup.InboundConfigScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/inbound/InboundConfigPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class InboundS3ConfigsLV extends PCFElement {
      public InboundS3ConfigsLV(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ArchiveS3BucketHeader getArchiveS3BucketHeader() {
        return getOrCreateProperty("ArchiveS3BucketHeader", "ArchiveS3BucketHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.InboundConfigPopup.InboundConfigScreen.InboundS3ConfigsLV.ArchiveS3BucketHeader.class);
      }
      
      public ArchiveS3PrefixHeader getArchiveS3PrefixHeader() {
        return getOrCreateProperty("ArchiveS3PrefixHeader", "ArchiveS3PrefixHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.InboundConfigPopup.InboundConfigScreen.InboundS3ConfigsLV.ArchiveS3PrefixHeader.class);
      }
      
      public ChunkSizeHeader getChunkSizeHeader() {
        return getOrCreateProperty("ChunkSizeHeader", "ChunkSizeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.InboundConfigPopup.InboundConfigScreen.InboundS3ConfigsLV.ChunkSizeHeader.class);
      }
      
      public DaysTillPurgeHeader getDaysTillPurgeHeader() {
        return getOrCreateProperty("DaysTillPurgeHeader", "DaysTillPurgeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.InboundConfigPopup.InboundConfigScreen.InboundS3ConfigsLV.DaysTillPurgeHeader.class);
      }
      
      public HandlerClassHeader getHandlerClassHeader() {
        return getOrCreateProperty("HandlerClassHeader", "HandlerClassHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.InboundConfigPopup.InboundConfigScreen.InboundS3ConfigsLV.HandlerClassHeader.class);
      }
      
      public InputS3BucketHeader getInputS3BucketHeader() {
        return getOrCreateProperty("InputS3BucketHeader", "InputS3BucketHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.InboundConfigPopup.InboundConfigScreen.InboundS3ConfigsLV.InputS3BucketHeader.class);
      }
      
      public InputS3PrefixHeader getInputS3PrefixHeader() {
        return getOrCreateProperty("InputS3PrefixHeader", "InputS3PrefixHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.InboundConfigPopup.InboundConfigScreen.InboundS3ConfigsLV.InputS3PrefixHeader.class);
      }
      
      public NameHeader getNameHeader() {
        return getOrCreateProperty("NameHeader", "NameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.InboundConfigPopup.InboundConfigScreen.InboundS3ConfigsLV.NameHeader.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      @SuppressWarnings(value = "unchecked")
      public IteratorEntriesWithPaging<entry> get_Entries() {
        return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.InboundConfigPopup.InboundConfigScreen.InboundS3ConfigsLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
      }
      
      public _ListPaging get_ListPaging() {
        return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.InboundConfigPopup.InboundConfigScreen.InboundS3ConfigsLV._ListPaging.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/inbound/InboundConfigPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ArchiveS3BucketHeader extends ValueElement {
        public ArchiveS3BucketHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/inbound/InboundConfigPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ArchiveS3PrefixHeader extends ValueElement {
        public ArchiveS3PrefixHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/inbound/InboundConfigPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ChunkSizeHeader extends ValueElement {
        public ChunkSizeHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/inbound/InboundConfigPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class DaysTillPurgeHeader extends ValueElement {
        public DaysTillPurgeHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/inbound/InboundConfigPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class HandlerClassHeader extends ValueElement {
        public HandlerClassHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/inbound/InboundConfigPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class InputS3BucketHeader extends ValueElement {
        public InputS3BucketHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/inbound/InboundConfigPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class InputS3PrefixHeader extends ValueElement {
        public InputS3PrefixHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/inbound/InboundConfigPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class NameHeader extends ValueElement {
        public NameHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/inbound/InboundConfigPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _ListPaging extends PagingElement {
        public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/inbound/InboundConfigPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class entry extends RowElement {
        public entry(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public ValueElement getArchiveS3Bucket() {
          return getOrCreateProperty("ArchiveS3Bucket", "ArchiveS3Bucket", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getArchiveS3Prefix() {
          return getOrCreateProperty("ArchiveS3Prefix", "ArchiveS3Prefix", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getChunkSize() {
          return getOrCreateProperty("ChunkSize", "ChunkSize", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getDaysTillPurge() {
          return getOrCreateProperty("DaysTillPurge", "DaysTillPurge", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getHandlerClass() {
          return getOrCreateProperty("HandlerClass", "HandlerClass", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getInputS3Bucket() {
          return getOrCreateProperty("InputS3Bucket", "InputS3Bucket", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getInputS3Prefix() {
          return getOrCreateProperty("InputS3Prefix", "InputS3Prefix", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getName() {
          return getOrCreateProperty("Name", "Name", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public IteratorEntryCheckboxElement get_Checkbox() {
          return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
        }
        
        public _Select get_Select() {
          return getOrCreateProperty("_Select", "_Select", null, pcftest.InboundConfigPopup.InboundConfigScreen.InboundS3ConfigsLV.entry._Select.class);
        }
        
        public _ViewDetail get_ViewDetail() {
          return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.InboundConfigPopup.InboundConfigScreen.InboundS3ConfigsLV.entry._ViewDetail.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/inbound/InboundConfigPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class _Select extends SelectorCellElement {
          public _Select(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/inbound/InboundConfigPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/inbound/InboundConfigPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class InboundS3FileConfigCardTab extends ClickableActionElement {
      public InboundS3FileConfigCardTab(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/inbound/InboundConfigPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class InboundS3FileConfigToolbar extends PCFElement {
      public InboundS3FileConfigToolbar(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public Cancel getCancel() {
        return getOrCreateProperty("Cancel", "Cancel", null, pcftest.InboundConfigPopup.InboundConfigScreen.InboundS3FileConfigToolbar.Cancel.class);
      }
      
      public Edit getEdit() {
        return getOrCreateProperty("Edit", "Edit", null, pcftest.InboundConfigPopup.InboundConfigScreen.InboundS3FileConfigToolbar.Edit.class);
      }
      
      public S3ConfigsDeleteButton getS3ConfigsDeleteButton() {
        return getOrCreateProperty("S3ConfigsDeleteButton", "S3ConfigsDeleteButton", null, pcftest.InboundConfigPopup.InboundConfigScreen.InboundS3FileConfigToolbar.S3ConfigsDeleteButton.class);
      }
      
      public S3ConfigsNewButton getS3ConfigsNewButton() {
        return getOrCreateProperty("S3ConfigsNewButton", "S3ConfigsNewButton", null, pcftest.InboundConfigPopup.InboundConfigScreen.InboundS3FileConfigToolbar.S3ConfigsNewButton.class);
      }
      
      public Update getUpdate() {
        return getOrCreateProperty("Update", "Update", null, pcftest.InboundConfigPopup.InboundConfigScreen.InboundS3FileConfigToolbar.Update.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/inbound/InboundConfigPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Cancel extends ClickableActionElement {
        public Cancel(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/inbound/InboundConfigPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Edit extends ClickableActionElement {
        public Edit(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/inbound/InboundConfigPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class S3ConfigsDeleteButton extends ClickableActionElement {
        public S3ConfigsDeleteButton(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/inbound/InboundConfigPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class S3ConfigsNewButton extends ClickableActionElement {
        public S3ConfigsNewButton(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public NewInboundS3ConfigPopup click() {
          return clickThis(pcftest.NewInboundS3ConfigPopup.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/inbound/InboundConfigPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Update extends ClickableActionElement {
        public Update(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/inbound/InboundConfigPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/inbound/InboundConfigPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/inbound/InboundConfigPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}