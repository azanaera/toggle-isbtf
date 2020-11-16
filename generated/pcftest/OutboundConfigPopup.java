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
import pcftest.OutboundConfigPopup.OutboundConfigPopup_UpLink;
import pcftest.OutboundConfigPopup.OutboundConfigScreen;
import pcftest.OutboundConfigPopup.OutboundConfigScreen.ConfigsS3CardTab;
import pcftest.OutboundConfigPopup.OutboundConfigScreen.OutboundS3ConfigsLV;
import pcftest.OutboundConfigPopup.OutboundConfigScreen.OutboundS3ConfigsLV.ConfigBucketHeader;
import pcftest.OutboundConfigPopup.OutboundConfigScreen.OutboundS3ConfigsLV.ConfigDaysTillPurgeHeader;
import pcftest.OutboundConfigPopup.OutboundConfigScreen.OutboundS3ConfigsLV.ConfigExtensionHeader;
import pcftest.OutboundConfigPopup.OutboundConfigScreen.OutboundS3ConfigsLV.ConfigHandlerClassHeader;
import pcftest.OutboundConfigPopup.OutboundConfigScreen.OutboundS3ConfigsLV.ConfigNameHeader;
import pcftest.OutboundConfigPopup.OutboundConfigScreen.OutboundS3ConfigsLV.ConfigPrefixHeader;
import pcftest.OutboundConfigPopup.OutboundConfigScreen.OutboundS3ConfigsLV.ConfigS3PrefixHeader;
import pcftest.OutboundConfigPopup.OutboundConfigScreen.OutboundS3ConfigsLV.ConfigTemporaryDirHeader;
import pcftest.OutboundConfigPopup.OutboundConfigScreen.OutboundS3ConfigsLV._ListPaging;
import pcftest.OutboundConfigPopup.OutboundConfigScreen.OutboundS3ConfigsLV.entry;
import pcftest.OutboundConfigPopup.OutboundConfigScreen.OutboundS3ConfigsLV.entry._Select;
import pcftest.OutboundConfigPopup.OutboundConfigScreen.OutboundS3ConfigsLV.entry._ViewDetail;
import pcftest.OutboundConfigPopup.OutboundConfigScreen.S3Toolbar;
import pcftest.OutboundConfigPopup.OutboundConfigScreen.S3Toolbar.Cancel;
import pcftest.OutboundConfigPopup.OutboundConfigScreen.S3Toolbar.ConfigsDeleteButton;
import pcftest.OutboundConfigPopup.OutboundConfigScreen.S3Toolbar.Edit;
import pcftest.OutboundConfigPopup.OutboundConfigScreen.S3Toolbar.OutboundConfigNewButton;
import pcftest.OutboundConfigPopup.OutboundConfigScreen.S3Toolbar.Update;
import pcftest.OutboundConfigPopup.OutboundConfigScreen._msgs;
import pcftest.OutboundConfigPopup._Paging;
import pcftest.OutboundConfigPopup.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/outboundfile/OutboundConfigPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class OutboundConfigPopup extends PCFLocation {
  public final static String CHECKSUM = "c59720963f12c87cfe8049a49702a838";
  
  public OutboundConfigPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("OutboundConfigPopup"));
  }
  
  public OutboundConfigPopup_UpLink getOutboundConfigPopup_UpLink() {
    return getOrCreateProperty("OutboundConfigPopup_UpLink", "OutboundConfigPopup_UpLink", null, pcftest.OutboundConfigPopup.OutboundConfigPopup_UpLink.class);
  }
  
  public OutboundConfigScreen getOutboundConfigScreen() {
    return getOrCreateProperty("OutboundConfigScreen", "OutboundConfigScreen", null, pcftest.OutboundConfigPopup.OutboundConfigScreen.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.OutboundConfigPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.OutboundConfigPopup.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/outboundfile/OutboundConfigPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class OutboundConfigPopup_UpLink extends ClickableActionElement {
    public OutboundConfigPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/outboundfile/OutboundConfigPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class OutboundConfigScreen extends PCFElement {
    public OutboundConfigScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ConfigsS3CardTab getConfigsS3CardTab() {
      return getOrCreateProperty("ConfigsS3CardTab", "ConfigsS3CardTab", null, pcftest.OutboundConfigPopup.OutboundConfigScreen.ConfigsS3CardTab.class);
    }
    
    public OutboundS3ConfigsLV getOutboundS3ConfigsLV() {
      return getOrCreateProperty("OutboundS3ConfigsLV", "OutboundS3ConfigsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.OutboundConfigPopup.OutboundConfigScreen.OutboundS3ConfigsLV.class);
    }
    
    public S3Toolbar getS3Toolbar() {
      return getOrCreateProperty("S3Toolbar", "S3Toolbar", null, pcftest.OutboundConfigPopup.OutboundConfigScreen.S3Toolbar.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.OutboundConfigPopup.OutboundConfigScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/outboundfile/OutboundConfigPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ConfigsS3CardTab extends ClickableActionElement {
      public ConfigsS3CardTab(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/outboundfile/OutboundConfigPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class OutboundS3ConfigsLV extends PCFElement {
      public OutboundS3ConfigsLV(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ConfigBucketHeader getConfigBucketHeader() {
        return getOrCreateProperty("ConfigBucketHeader", "ConfigBucketHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.OutboundConfigPopup.OutboundConfigScreen.OutboundS3ConfigsLV.ConfigBucketHeader.class);
      }
      
      public ConfigDaysTillPurgeHeader getConfigDaysTillPurgeHeader() {
        return getOrCreateProperty("ConfigDaysTillPurgeHeader", "ConfigDaysTillPurgeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.OutboundConfigPopup.OutboundConfigScreen.OutboundS3ConfigsLV.ConfigDaysTillPurgeHeader.class);
      }
      
      public ConfigExtensionHeader getConfigExtensionHeader() {
        return getOrCreateProperty("ConfigExtensionHeader", "ConfigExtensionHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.OutboundConfigPopup.OutboundConfigScreen.OutboundS3ConfigsLV.ConfigExtensionHeader.class);
      }
      
      public ConfigHandlerClassHeader getConfigHandlerClassHeader() {
        return getOrCreateProperty("ConfigHandlerClassHeader", "ConfigHandlerClassHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.OutboundConfigPopup.OutboundConfigScreen.OutboundS3ConfigsLV.ConfigHandlerClassHeader.class);
      }
      
      public ConfigNameHeader getConfigNameHeader() {
        return getOrCreateProperty("ConfigNameHeader", "ConfigNameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.OutboundConfigPopup.OutboundConfigScreen.OutboundS3ConfigsLV.ConfigNameHeader.class);
      }
      
      public ConfigPrefixHeader getConfigPrefixHeader() {
        return getOrCreateProperty("ConfigPrefixHeader", "ConfigPrefixHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.OutboundConfigPopup.OutboundConfigScreen.OutboundS3ConfigsLV.ConfigPrefixHeader.class);
      }
      
      public ConfigS3PrefixHeader getConfigS3PrefixHeader() {
        return getOrCreateProperty("ConfigS3PrefixHeader", "ConfigS3PrefixHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.OutboundConfigPopup.OutboundConfigScreen.OutboundS3ConfigsLV.ConfigS3PrefixHeader.class);
      }
      
      public ConfigTemporaryDirHeader getConfigTemporaryDirHeader() {
        return getOrCreateProperty("ConfigTemporaryDirHeader", "ConfigTemporaryDirHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.OutboundConfigPopup.OutboundConfigScreen.OutboundS3ConfigsLV.ConfigTemporaryDirHeader.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      @SuppressWarnings(value = "unchecked")
      public IteratorEntriesWithPaging<entry> get_Entries() {
        return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.OutboundConfigPopup.OutboundConfigScreen.OutboundS3ConfigsLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
      }
      
      public _ListPaging get_ListPaging() {
        return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.OutboundConfigPopup.OutboundConfigScreen.OutboundS3ConfigsLV._ListPaging.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/outboundfile/OutboundConfigPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ConfigBucketHeader extends ValueElement {
        public ConfigBucketHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/outboundfile/OutboundConfigPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ConfigDaysTillPurgeHeader extends ValueElement {
        public ConfigDaysTillPurgeHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/outboundfile/OutboundConfigPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ConfigExtensionHeader extends ValueElement {
        public ConfigExtensionHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/outboundfile/OutboundConfigPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ConfigHandlerClassHeader extends ValueElement {
        public ConfigHandlerClassHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/outboundfile/OutboundConfigPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ConfigNameHeader extends ValueElement {
        public ConfigNameHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/outboundfile/OutboundConfigPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ConfigPrefixHeader extends ValueElement {
        public ConfigPrefixHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/outboundfile/OutboundConfigPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ConfigS3PrefixHeader extends ValueElement {
        public ConfigS3PrefixHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/outboundfile/OutboundConfigPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ConfigTemporaryDirHeader extends ValueElement {
        public ConfigTemporaryDirHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/outboundfile/OutboundConfigPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _ListPaging extends PagingElement {
        public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/outboundfile/OutboundConfigPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class entry extends RowElement {
        public entry(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public ValueElement getConfigBucket() {
          return getOrCreateProperty("ConfigBucket", "ConfigBucket", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getConfigDaysTillPurge() {
          return getOrCreateProperty("ConfigDaysTillPurge", "ConfigDaysTillPurge", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getConfigExtension() {
          return getOrCreateProperty("ConfigExtension", "ConfigExtension", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getConfigHandlerClass() {
          return getOrCreateProperty("ConfigHandlerClass", "ConfigHandlerClass", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getConfigName() {
          return getOrCreateProperty("ConfigName", "ConfigName", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getConfigPrefix() {
          return getOrCreateProperty("ConfigPrefix", "ConfigPrefix", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getConfigS3Prefix() {
          return getOrCreateProperty("ConfigS3Prefix", "ConfigS3Prefix", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getConfigTemporaryDir() {
          return getOrCreateProperty("ConfigTemporaryDir", "ConfigTemporaryDir", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public IteratorEntryCheckboxElement get_Checkbox() {
          return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
        }
        
        public _Select get_Select() {
          return getOrCreateProperty("_Select", "_Select", null, pcftest.OutboundConfigPopup.OutboundConfigScreen.OutboundS3ConfigsLV.entry._Select.class);
        }
        
        public _ViewDetail get_ViewDetail() {
          return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.OutboundConfigPopup.OutboundConfigScreen.OutboundS3ConfigsLV.entry._ViewDetail.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/outboundfile/OutboundConfigPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class _Select extends SelectorCellElement {
          public _Select(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/outboundfile/OutboundConfigPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/outboundfile/OutboundConfigPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class S3Toolbar extends PCFElement {
      public S3Toolbar(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public Cancel getCancel() {
        return getOrCreateProperty("Cancel", "Cancel", null, pcftest.OutboundConfigPopup.OutboundConfigScreen.S3Toolbar.Cancel.class);
      }
      
      public ConfigsDeleteButton getConfigsDeleteButton() {
        return getOrCreateProperty("ConfigsDeleteButton", "ConfigsDeleteButton", null, pcftest.OutboundConfigPopup.OutboundConfigScreen.S3Toolbar.ConfigsDeleteButton.class);
      }
      
      public Edit getEdit() {
        return getOrCreateProperty("Edit", "Edit", null, pcftest.OutboundConfigPopup.OutboundConfigScreen.S3Toolbar.Edit.class);
      }
      
      public OutboundConfigNewButton getOutboundConfigNewButton() {
        return getOrCreateProperty("OutboundConfigNewButton", "OutboundConfigNewButton", null, pcftest.OutboundConfigPopup.OutboundConfigScreen.S3Toolbar.OutboundConfigNewButton.class);
      }
      
      public Update getUpdate() {
        return getOrCreateProperty("Update", "Update", null, pcftest.OutboundConfigPopup.OutboundConfigScreen.S3Toolbar.Update.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/outboundfile/OutboundConfigPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Cancel extends ClickableActionElement {
        public Cancel(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/outboundfile/OutboundConfigPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ConfigsDeleteButton extends ClickableActionElement {
        public ConfigsDeleteButton(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/outboundfile/OutboundConfigPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Edit extends ClickableActionElement {
        public Edit(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/outboundfile/OutboundConfigPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class OutboundConfigNewButton extends ClickableActionElement {
        public OutboundConfigNewButton(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public NewOutboundS3ConfigPopup click() {
          return clickThis(pcftest.NewOutboundS3ConfigPopup.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/outboundfile/OutboundConfigPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/outboundfile/OutboundConfigPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/outboundfile/OutboundConfigPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/outboundfile/OutboundConfigPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}