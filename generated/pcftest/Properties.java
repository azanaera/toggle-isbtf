package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
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
import pcftest.Properties.PropertiesScreen;
import pcftest.Properties.PropertiesScreen.PropertiesDeleteButton;
import pcftest.Properties.PropertiesScreen.PropertiesExportButton;
import pcftest.Properties.PropertiesScreen.PropertiesImportButton;
import pcftest.Properties.PropertiesScreen.PropertiesLV;
import pcftest.Properties.PropertiesScreen.PropertiesLV.PropertiesLVDescriptionHeader;
import pcftest.Properties.PropertiesScreen.PropertiesLV.PropertiesLVGroupHeader;
import pcftest.Properties.PropertiesScreen.PropertiesLV.PropertiesLVNameHeader;
import pcftest.Properties.PropertiesScreen.PropertiesLV.PropertiesLVValueHeader;
import pcftest.Properties.PropertiesScreen.PropertiesLV._ListPaging;
import pcftest.Properties.PropertiesScreen.PropertiesLV.entry;
import pcftest.Properties.PropertiesScreen.PropertiesLV.entry.PropertiesLVGroup;
import pcftest.Properties.PropertiesScreen.PropertiesLV.entry.PropertiesLVName;
import pcftest.Properties.PropertiesScreen.PropertiesLV.entry._Select;
import pcftest.Properties.PropertiesScreen.PropertiesLV.entry._ViewDetail;
import pcftest.Properties.PropertiesScreen.PropertiesNewButton;
import pcftest.Properties.PropertiesScreen._msgs;
import pcftest.Properties.Properties_UpLink;
import pcftest.Properties._Paging;
import pcftest.Properties.__crumb__;
import typekey.RuntimePropertyGroup;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/properties/Properties.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class Properties extends PCFLocation {
  public final static String CHECKSUM = "4e50dc2631f7cbb7794758c238a4dd89";
  
  public Properties(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("Properties"));
  }
  
  public PropertiesScreen getPropertiesScreen() {
    return getOrCreateProperty("PropertiesScreen", "PropertiesScreen", null, pcftest.Properties.PropertiesScreen.class);
  }
  
  public Properties_UpLink getProperties_UpLink() {
    return getOrCreateProperty("Properties_UpLink", "Properties_UpLink", null, pcftest.Properties.Properties_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.Properties._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.Properties.__crumb__.class);
  }
  
  public Admin get_parent() {
    return getOrCreateProperty("_parent", pcftest.Admin.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/properties/Properties.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PropertiesScreen extends PCFElement {
    public PropertiesScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PropertiesDeleteButton getPropertiesDeleteButton() {
      return getOrCreateProperty("PropertiesDeleteButton", "PropertiesDeleteButton", null, pcftest.Properties.PropertiesScreen.PropertiesDeleteButton.class);
    }
    
    public PropertiesExportButton getPropertiesExportButton() {
      return getOrCreateProperty("PropertiesExportButton", "PropertiesExportButton", null, pcftest.Properties.PropertiesScreen.PropertiesExportButton.class);
    }
    
    public PropertiesImportButton getPropertiesImportButton() {
      return getOrCreateProperty("PropertiesImportButton", "PropertiesImportButton", null, pcftest.Properties.PropertiesScreen.PropertiesImportButton.class);
    }
    
    public PropertiesLV getPropertiesLV() {
      return getOrCreateProperty("PropertiesLV", "PropertiesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.Properties.PropertiesScreen.PropertiesLV.class);
    }
    
    public PropertiesNewButton getPropertiesNewButton() {
      return getOrCreateProperty("PropertiesNewButton", "PropertiesNewButton", null, pcftest.Properties.PropertiesScreen.PropertiesNewButton.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.Properties.PropertiesScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/properties/Properties.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class PropertiesDeleteButton extends ClickableActionElement {
      public PropertiesDeleteButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/properties/Properties.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class PropertiesExportButton extends ClickableActionElement {
      public PropertiesExportButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ExportProperties click() {
        return clickThis(pcftest.ExportProperties.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/properties/Properties.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class PropertiesImportButton extends ClickableActionElement {
      public PropertiesImportButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ImportProperties click() {
        return clickThis(pcftest.ImportProperties.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/properties/Properties.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class PropertiesLV extends PCFElement {
      public PropertiesLV(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PropertiesLVDescriptionHeader getPropertiesLVDescriptionHeader() {
        return getOrCreateProperty("PropertiesLVDescriptionHeader", "PropertiesLVDescriptionHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.Properties.PropertiesScreen.PropertiesLV.PropertiesLVDescriptionHeader.class);
      }
      
      public PropertiesLVGroupHeader getPropertiesLVGroupHeader() {
        return getOrCreateProperty("PropertiesLVGroupHeader", "PropertiesLVGroupHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.Properties.PropertiesScreen.PropertiesLV.PropertiesLVGroupHeader.class);
      }
      
      public PropertiesLVNameHeader getPropertiesLVNameHeader() {
        return getOrCreateProperty("PropertiesLVNameHeader", "PropertiesLVNameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.Properties.PropertiesScreen.PropertiesLV.PropertiesLVNameHeader.class);
      }
      
      public PropertiesLVValueHeader getPropertiesLVValueHeader() {
        return getOrCreateProperty("PropertiesLVValueHeader", "PropertiesLVValueHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.Properties.PropertiesScreen.PropertiesLV.PropertiesLVValueHeader.class);
      }
      
      public SelectElement getPropertyGroupFilter() {
        return getOrCreateProperty("PropertyGroupFilter", "PropertyGroupFilter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewToolbarFilter, gw.smoketest.platform.web.SelectElement.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      @SuppressWarnings(value = "unchecked")
      public IteratorEntriesWithPaging<entry> get_Entries() {
        return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.Properties.PropertiesScreen.PropertiesLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
      }
      
      public _ListPaging get_ListPaging() {
        return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.Properties.PropertiesScreen.PropertiesLV._ListPaging.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/properties/Properties.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class PropertiesLVDescriptionHeader extends ValueElement {
        public PropertiesLVDescriptionHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/properties/Properties.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class PropertiesLVGroupHeader extends ValueElement {
        public PropertiesLVGroupHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/properties/Properties.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class PropertiesLVNameHeader extends ValueElement {
        public PropertiesLVNameHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/properties/Properties.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class PropertiesLVValueHeader extends ValueElement {
        public PropertiesLVValueHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/properties/Properties.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _ListPaging extends PagingElement {
        public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/properties/Properties.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class entry extends RowElement {
        public entry(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public ValueElement getPropertiesLVDescription() {
          return getOrCreateProperty("PropertiesLVDescription", "PropertiesLVDescription", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public PropertiesLVGroup getPropertiesLVGroup() {
          return getOrCreateProperty("PropertiesLVGroup", "PropertiesLVGroup", null, pcftest.Properties.PropertiesScreen.PropertiesLV.entry.PropertiesLVGroup.class);
        }
        
        public PropertiesLVName getPropertiesLVName() {
          return getOrCreateProperty("PropertiesLVName", "PropertiesLVName", null, pcftest.Properties.PropertiesScreen.PropertiesLV.entry.PropertiesLVName.class);
        }
        
        public ValueElement getPropertiesLVValue() {
          return getOrCreateProperty("PropertiesLVValue", "PropertiesLVValue", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public IteratorEntryCheckboxElement get_Checkbox() {
          return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
        }
        
        public _Select get_Select() {
          return getOrCreateProperty("_Select", "_Select", null, pcftest.Properties.PropertiesScreen.PropertiesLV.entry._Select.class);
        }
        
        public _ViewDetail get_ViewDetail() {
          return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.Properties.PropertiesScreen.PropertiesLV.entry._ViewDetail.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/properties/Properties.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class PropertiesLVGroup extends SelectElement {
          public PropertiesLVGroup(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public OptionElement getOptionByTypeKey(RuntimePropertyGroup arg) {
            return getOptionByValue(arg == null ? null : arg.getCode());
          }
          
          public RuntimePropertyGroup getTypeKeyValue() {
            String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.RuntimePropertyGroup.getTypeKey(myValue);
          }
          
          public void setTypeKeyValue(RuntimePropertyGroup arg) {
            setValue(arg == null ? null : arg.getCode());
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/properties/Properties.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class PropertiesLVName extends ValueElement {
          public PropertiesLVName(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PropertyDetail click() {
            return clickThis(pcftest.PropertyDetail.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/properties/Properties.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class _Select extends SelectorCellElement {
          public _Select(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/properties/Properties.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/properties/Properties.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class PropertiesNewButton extends ClickableActionElement {
      public PropertiesNewButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public NewProperty click() {
        return clickThis(pcftest.NewProperty.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/properties/Properties.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/properties/Properties.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Properties_UpLink extends ClickableActionElement {
    public Properties_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/properties/Properties.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/properties/Properties.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}