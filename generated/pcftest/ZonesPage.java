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
import pcftest.ZonesPage.ZonesPage_UpLink;
import pcftest.ZonesPage.ZonesScreen;
import pcftest.ZonesPage.ZonesScreen.ZonesLV;
import pcftest.ZonesPage.ZonesScreen.ZonesLV.CodeHeader;
import pcftest.ZonesPage.ZonesScreen.ZonesLV.CountryHeader;
import pcftest.ZonesPage.ZonesScreen.ZonesLV.NameHeader;
import pcftest.ZonesPage.ZonesScreen.ZonesLV.ZoneTypeHeader;
import pcftest.ZonesPage.ZonesScreen.ZonesLV._ListPaging;
import pcftest.ZonesPage.ZonesScreen.ZonesLV.entry;
import pcftest.ZonesPage.ZonesScreen.ZonesLV.entry._Select;
import pcftest.ZonesPage.ZonesScreen.ZonesLV.entry._ViewDetail;
import pcftest.ZonesPage.ZonesScreen._msgs;
import pcftest.ZonesPage._Paging;
import pcftest.ZonesPage.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/zones/ZonesPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ZonesPage extends PCFLocation {
  public final static String CHECKSUM = "c7e583b3de1298d2afa612b28a585b88";
  
  public ZonesPage(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ZonesPage"));
  }
  
  public ZonesPage_UpLink getZonesPage_UpLink() {
    return getOrCreateProperty("ZonesPage_UpLink", "ZonesPage_UpLink", null, pcftest.ZonesPage.ZonesPage_UpLink.class);
  }
  
  public ZonesScreen getZonesScreen() {
    return getOrCreateProperty("ZonesScreen", "ZonesScreen", null, pcftest.ZonesPage.ZonesScreen.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ZonesPage._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ZonesPage.__crumb__.class);
  }
  
  public Zones get_parent() {
    return getOrCreateProperty("_parent", pcftest.Zones.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/zones/ZonesPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ZonesPage_UpLink extends ClickableActionElement {
    public ZonesPage_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/zones/ZonesPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ZonesScreen extends PCFElement {
    public ZonesScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ZonesLV getZonesLV() {
      return getOrCreateProperty("ZonesLV", "ZonesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ZonesPage.ZonesScreen.ZonesLV.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ZonesPage.ZonesScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/zones/ZonesPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ZonesLV extends PCFElement {
      public ZonesLV(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public CodeHeader getCodeHeader() {
        return getOrCreateProperty("CodeHeader", "CodeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ZonesPage.ZonesScreen.ZonesLV.CodeHeader.class);
      }
      
      public SelectElement getCountryFilter() {
        return getOrCreateProperty("CountryFilter", "CountryFilter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewToolbarFilter, gw.smoketest.platform.web.SelectElement.class);
      }
      
      public CountryHeader getCountryHeader() {
        return getOrCreateProperty("CountryHeader", "CountryHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ZonesPage.ZonesScreen.ZonesLV.CountryHeader.class);
      }
      
      public NameHeader getNameHeader() {
        return getOrCreateProperty("NameHeader", "NameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ZonesPage.ZonesScreen.ZonesLV.NameHeader.class);
      }
      
      public SelectElement getZoneTypeFilter() {
        return getOrCreateProperty("ZoneTypeFilter", "ZoneTypeFilter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewToolbarFilter, gw.smoketest.platform.web.SelectElement.class);
      }
      
      public ZoneTypeHeader getZoneTypeHeader() {
        return getOrCreateProperty("ZoneTypeHeader", "ZoneTypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ZonesPage.ZonesScreen.ZonesLV.ZoneTypeHeader.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      @SuppressWarnings(value = "unchecked")
      public IteratorEntriesWithPaging<entry> get_Entries() {
        return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ZonesPage.ZonesScreen.ZonesLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
      }
      
      public _ListPaging get_ListPaging() {
        return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ZonesPage.ZonesScreen.ZonesLV._ListPaging.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/admin/zones/ZonesPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class CodeHeader extends ValueElement {
        public CodeHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/admin/zones/ZonesPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class CountryHeader extends ValueElement {
        public CountryHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/admin/zones/ZonesPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class NameHeader extends ValueElement {
        public NameHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/admin/zones/ZonesPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ZoneTypeHeader extends ValueElement {
        public ZoneTypeHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/admin/zones/ZonesPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _ListPaging extends PagingElement {
        public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/admin/zones/ZonesPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class entry extends RowElement {
        public entry(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public ValueElement getCode() {
          return getOrCreateProperty("Code", "Code", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public pcftest.ZonesPage.ZonesScreen.ZonesLV.entry.Country getCountry() {
          return getOrCreateProperty("Country", "Country", null, pcftest.ZonesPage.ZonesScreen.ZonesLV.entry.Country.class);
        }
        
        public ValueElement getName() {
          return getOrCreateProperty("Name", "Name", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public pcftest.ZonesPage.ZonesScreen.ZonesLV.entry.ZoneType getZoneType() {
          return getOrCreateProperty("ZoneType", "ZoneType", null, pcftest.ZonesPage.ZonesScreen.ZonesLV.entry.ZoneType.class);
        }
        
        public IteratorEntryCheckboxElement get_Checkbox() {
          return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
        }
        
        public _Select get_Select() {
          return getOrCreateProperty("_Select", "_Select", null, pcftest.ZonesPage.ZonesScreen.ZonesLV.entry._Select.class);
        }
        
        public _ViewDetail get_ViewDetail() {
          return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ZonesPage.ZonesScreen.ZonesLV.entry._ViewDetail.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/admin/zones/ZonesPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class Country extends SelectElement {
          public Country(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public OptionElement getOptionByTypeKey(typekey.Country arg) {
            return getOptionByValue(arg == null ? null : arg.getCode());
          }
          
          public typekey.Country getTypeKeyValue() {
            String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.Country.getTypeKey(myValue);
          }
          
          public void setTypeKeyValue(typekey.Country arg) {
            setValue(arg == null ? null : arg.getCode());
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/admin/zones/ZonesPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class ZoneType extends SelectElement {
          public ZoneType(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public OptionElement getOptionByTypeKey(typekey.ZoneType arg) {
            return getOptionByValue(arg == null ? null : arg.getCode());
          }
          
          public typekey.ZoneType getTypeKeyValue() {
            String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.ZoneType.getTypeKey(myValue);
          }
          
          public void setTypeKeyValue(typekey.ZoneType arg) {
            setValue(arg == null ? null : arg.getCode());
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/admin/zones/ZonesPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class _Select extends SelectorCellElement {
          public _Select(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/admin/zones/ZonesPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/admin/zones/ZonesPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/admin/zones/ZonesPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/zones/ZonesPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}