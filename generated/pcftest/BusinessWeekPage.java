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
import pcftest.BusinessWeekPage.BusinessWeekPage_UpLink;
import pcftest.BusinessWeekPage.BusinessWeekScreen;
import pcftest.BusinessWeekPage.BusinessWeekScreen.BusinessWeek_AddBusinessWeek;
import pcftest.BusinessWeekPage.BusinessWeekScreen.BusinessWeek_DeleteButton;
import pcftest.BusinessWeekPage.BusinessWeekScreen.BusinessWeeksLV;
import pcftest.BusinessWeekPage.BusinessWeekScreen.BusinessWeeksLV.NameHeader;
import pcftest.BusinessWeekPage.BusinessWeekScreen.BusinessWeeksLV.ZonesHeader;
import pcftest.BusinessWeekPage.BusinessWeekScreen.BusinessWeeksLV._ListPaging;
import pcftest.BusinessWeekPage.BusinessWeekScreen.BusinessWeeksLV.entry;
import pcftest.BusinessWeekPage.BusinessWeekScreen.BusinessWeeksLV.entry.Name;
import pcftest.BusinessWeekPage.BusinessWeekScreen.BusinessWeeksLV.entry._Select;
import pcftest.BusinessWeekPage.BusinessWeekScreen.BusinessWeeksLV.entry._ViewDetail;
import pcftest.BusinessWeekPage.BusinessWeekScreen._msgs;
import pcftest.BusinessWeekPage._Paging;
import pcftest.BusinessWeekPage.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/businessweek/BusinessWeekPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class BusinessWeekPage extends PCFLocation {
  public final static String CHECKSUM = "8de20513c80aee320cdf1f222d695423";
  
  public BusinessWeekPage(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("BusinessWeekPage"));
  }
  
  public BusinessWeekPage_UpLink getBusinessWeekPage_UpLink() {
    return getOrCreateProperty("BusinessWeekPage_UpLink", "BusinessWeekPage_UpLink", null, pcftest.BusinessWeekPage.BusinessWeekPage_UpLink.class);
  }
  
  public BusinessWeekScreen getBusinessWeekScreen() {
    return getOrCreateProperty("BusinessWeekScreen", "BusinessWeekScreen", null, pcftest.BusinessWeekPage.BusinessWeekScreen.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.BusinessWeekPage._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.BusinessWeekPage.__crumb__.class);
  }
  
  public BusinessWeek get_parent() {
    return getOrCreateProperty("_parent", pcftest.BusinessWeek.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/businessweek/BusinessWeekPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class BusinessWeekPage_UpLink extends ClickableActionElement {
    public BusinessWeekPage_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/businessweek/BusinessWeekPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class BusinessWeekScreen extends PCFElement {
    public BusinessWeekScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public BusinessWeek_AddBusinessWeek getBusinessWeek_AddBusinessWeek() {
      return getOrCreateProperty("BusinessWeek_AddBusinessWeek", "BusinessWeek_AddBusinessWeek", null, pcftest.BusinessWeekPage.BusinessWeekScreen.BusinessWeek_AddBusinessWeek.class);
    }
    
    public BusinessWeek_DeleteButton getBusinessWeek_DeleteButton() {
      return getOrCreateProperty("BusinessWeek_DeleteButton", "BusinessWeek_DeleteButton", null, pcftest.BusinessWeekPage.BusinessWeekScreen.BusinessWeek_DeleteButton.class);
    }
    
    public BusinessWeeksLV getBusinessWeeksLV() {
      return getOrCreateProperty("BusinessWeeksLV", "BusinessWeeksLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.BusinessWeekPage.BusinessWeekScreen.BusinessWeeksLV.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.BusinessWeekPage.BusinessWeekScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/businessweek/BusinessWeekPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class BusinessWeek_AddBusinessWeek extends ClickableActionElement {
      public BusinessWeek_AddBusinessWeek(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public NewBusinessWeek click() {
        return clickThis(pcftest.NewBusinessWeek.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/businessweek/BusinessWeekPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class BusinessWeek_DeleteButton extends ClickableActionElement {
      public BusinessWeek_DeleteButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/businessweek/BusinessWeekPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class BusinessWeeksLV extends PCFElement {
      public BusinessWeeksLV(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public NameHeader getNameHeader() {
        return getOrCreateProperty("NameHeader", "NameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.BusinessWeekPage.BusinessWeekScreen.BusinessWeeksLV.NameHeader.class);
      }
      
      public ZonesHeader getZonesHeader() {
        return getOrCreateProperty("ZonesHeader", "ZonesHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.BusinessWeekPage.BusinessWeekScreen.BusinessWeeksLV.ZonesHeader.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      @SuppressWarnings(value = "unchecked")
      public IteratorEntriesWithPaging<entry> get_Entries() {
        return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.BusinessWeekPage.BusinessWeekScreen.BusinessWeeksLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
      }
      
      public _ListPaging get_ListPaging() {
        return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.BusinessWeekPage.BusinessWeekScreen.BusinessWeeksLV._ListPaging.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/admin/businessweek/BusinessWeekPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class NameHeader extends ValueElement {
        public NameHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/admin/businessweek/BusinessWeekPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ZonesHeader extends ValueElement {
        public ZonesHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/admin/businessweek/BusinessWeekPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _ListPaging extends PagingElement {
        public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/admin/businessweek/BusinessWeekPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class entry extends RowElement {
        public entry(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public Name getName() {
          return getOrCreateProperty("Name", "Name", null, pcftest.BusinessWeekPage.BusinessWeekScreen.BusinessWeeksLV.entry.Name.class);
        }
        
        public ValueElement getZones() {
          return getOrCreateProperty("Zones", "Zones", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public IteratorEntryCheckboxElement get_Checkbox() {
          return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
        }
        
        public _Select get_Select() {
          return getOrCreateProperty("_Select", "_Select", null, pcftest.BusinessWeekPage.BusinessWeekScreen.BusinessWeeksLV.entry._Select.class);
        }
        
        public _ViewDetail get_ViewDetail() {
          return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.BusinessWeekPage.BusinessWeekScreen.BusinessWeeksLV.entry._ViewDetail.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/admin/businessweek/BusinessWeekPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class Name extends ValueElement {
          public Name(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public BusinessWeekDetail click() {
            return clickThis(pcftest.BusinessWeekDetail.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/admin/businessweek/BusinessWeekPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class _Select extends SelectorCellElement {
          public _Select(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/admin/businessweek/BusinessWeekPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/admin/businessweek/BusinessWeekPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/admin/businessweek/BusinessWeekPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/businessweek/BusinessWeekPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}