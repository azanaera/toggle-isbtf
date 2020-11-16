package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.IteratorEntriesWithPaging;
import gw.smoketest.platform.web.IteratorEntryCheckboxElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.PagingElement;
import gw.smoketest.platform.web.RowElement;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.SelectorCellElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.TripLDV.TripRULV;
import pcftest.TripLDV.TripRULV.EndDateHeader;
import pcftest.TripLDV.TripRULV.GeographicalRegionHeader;
import pcftest.TripLDV.TripRULV.StartDateHeader;
import pcftest.TripLDV.TripRULV.TripRU_NameHeader;
import pcftest.TripLDV.TripRULV._ListPaging;
import pcftest.TripLDV.TripRULV.entry;
import pcftest.TripLDV.TripRULV.entry.TripRU_Name;
import pcftest.TripLDV.TripRULV.entry._Select;
import pcftest.TripLDV.TripRULV.entry._ViewDetail;
import pcftest.TripLDV.trip_coveragesTab;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/policy/TripLDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class TripLDV extends PCFElement {
  public final static String CHECKSUM = "c930d930865bcaec1390ad69dc3d65c8";
  
  public TripLDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public pcftest.TripLDV.PolicyTripCoverageLDV getPolicyTripCoverageLDV() {
    return getOrCreateProperty("PolicyTripCoverageLDV", "PolicyTripCoverageLDV", null, pcftest.TripLDV.PolicyTripCoverageLDV.class);
  }
  
  public TripRULV getTripRULV() {
    return getOrCreateProperty("TripRULV", "TripRULV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.TripLDV.TripRULV.class);
  }
  
  public trip_coveragesTab gettrip_coveragesTab() {
    return getOrCreateProperty("trip_coveragesTab", "trip_coveragesTab", null, pcftest.TripLDV.trip_coveragesTab.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/TripLDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PolicyTripCoverageLDV extends PCFElement {
    public PolicyTripCoverageLDV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public pcftest.PolicyTripCoverageLDV getPolicyTripCoverageLDV() {
      return getOrCreateProperty("PolicyTripCoverageLDV", "PolicyTripCoverageLDV", null, pcftest.PolicyTripCoverageLDV.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/TripLDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TripRULV extends PCFElement {
    public TripRULV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public EndDateHeader getEndDateHeader() {
      return getOrCreateProperty("EndDateHeader", "EndDateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.TripLDV.TripRULV.EndDateHeader.class);
    }
    
    public GeographicalRegionHeader getGeographicalRegionHeader() {
      return getOrCreateProperty("GeographicalRegionHeader", "GeographicalRegionHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.TripLDV.TripRULV.GeographicalRegionHeader.class);
    }
    
    public StartDateHeader getStartDateHeader() {
      return getOrCreateProperty("StartDateHeader", "StartDateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.TripLDV.TripRULV.StartDateHeader.class);
    }
    
    public TripRU_NameHeader getTripRU_NameHeader() {
      return getOrCreateProperty("TripRU_NameHeader", "TripRU_NameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.TripLDV.TripRULV.TripRU_NameHeader.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.TripLDV.TripRULV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public _ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.TripLDV.TripRULV._ListPaging.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/policy/TripLDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class EndDateHeader extends ValueElement {
      public EndDateHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/policy/TripLDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class GeographicalRegionHeader extends ValueElement {
      public GeographicalRegionHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/policy/TripLDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class StartDateHeader extends ValueElement {
      public StartDateHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/policy/TripLDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class TripRU_NameHeader extends ValueElement {
      public TripRU_NameHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/policy/TripLDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/policy/TripLDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends RowElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public DateElement getEndDate() {
        return getOrCreateProperty("EndDate", "EndDate", null, gw.smoketest.platform.web.DateElement.class);
      }
      
      public pcftest.TripLDV.TripRULV.entry.GeographicalRegion getGeographicalRegion() {
        return getOrCreateProperty("GeographicalRegion", "GeographicalRegion", null, pcftest.TripLDV.TripRULV.entry.GeographicalRegion.class);
      }
      
      public DateElement getStartDate() {
        return getOrCreateProperty("StartDate", "StartDate", null, gw.smoketest.platform.web.DateElement.class);
      }
      
      public TripRU_Name getTripRU_Name() {
        return getOrCreateProperty("TripRU_Name", "TripRU_Name", null, pcftest.TripLDV.TripRULV.entry.TripRU_Name.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      public _Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.TripLDV.TripRULV.entry._Select.class);
      }
      
      public _ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.TripLDV.TripRULV.entry._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/policy/TripLDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class GeographicalRegion extends SelectElement {
        public GeographicalRegion(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public OptionElement getOptionByTypeKey(typekey.GeographicalRegion arg) {
          return getOptionByValue(arg == null ? null : arg.getCode());
        }
        
        public typekey.GeographicalRegion getTypeKeyValue() {
          String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.GeographicalRegion.getTypeKey(myValue);
        }
        
        public void setTypeKeyValue(typekey.GeographicalRegion arg) {
          setValue(arg == null ? null : arg.getCode());
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/policy/TripLDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class TripRU_Name extends ValueElement {
        public TripRU_Name(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public TripRUPopup click() {
          return clickThis(pcftest.TripRUPopup.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/policy/TripLDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/policy/TripLDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/policy/TripLDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class trip_coveragesTab extends ClickableActionElement {
    public trip_coveragesTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}