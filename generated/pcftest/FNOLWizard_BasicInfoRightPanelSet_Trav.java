package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.IteratorEntries;
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
import pcftest.FNOLWizard_BasicInfoRightPanelSet_Trav.NoTripsFound;
import pcftest.FNOLWizard_BasicInfoRightPanelSet_Trav.TripIterator;
import pcftest.FNOLWizard_BasicInfoRightPanelSet_Trav.TripIterator.entry.TripIncidentDV;
import pcftest.FNOLWizard_BasicInfoRightPanelSet_Trav.TripIterator.entry.TripIncidentDV.TripCoveragesLV;
import pcftest.FNOLWizard_BasicInfoRightPanelSet_Trav.TripIterator.entry.TripIncidentDV.TripCoveragesLV._ListPaging;
import pcftest.FNOLWizard_BasicInfoRightPanelSet_Trav.TripIterator.entry.TripIncidentDV.TripCoveragesLV.entry2;
import pcftest.FNOLWizard_BasicInfoRightPanelSet_Trav.TripIterator.entry.TripIncidentDV.TripCoveragesLV.entry2._Select;
import pcftest.FNOLWizard_BasicInfoRightPanelSet_Trav.TripIterator.entry.TripIncidentDV.TripCoveragesLV.entry2._ViewDetail;
import pcftest.FNOLWizard_BasicInfoRightPanelSet_Trav.TripIterator.entry.TripIncidentDV.TripCoveragesLV_tb;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_BasicInfoRightPanelSet.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class FNOLWizard_BasicInfoRightPanelSet_Trav extends FNOLWizard_BasicInfoRightPanelSet {
  public final static String CHECKSUM = "b650ffeec47d2013834e93993ac47e23";
  
  public FNOLWizard_BasicInfoRightPanelSet_Trav(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public NoTripsFound getNoTripsFound() {
    return getOrCreateProperty("NoTripsFound", "NoTripsFound", null, pcftest.FNOLWizard_BasicInfoRightPanelSet_Trav.NoTripsFound.class);
  }
  
  public TripIterator getTripIterator() {
    return getOrCreateProperty("TripIterator", "TripIterator", null, pcftest.FNOLWizard_BasicInfoRightPanelSet_Trav.TripIterator.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntries<pcftest.FNOLWizard_BasicInfoRightPanelSet_Trav.entry> get_Entries() {
    return getOrCreateEntries(null, pcftest.FNOLWizard_BasicInfoRightPanelSet_Trav.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_BasicInfoRightPanelSet.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NoTripsFound extends ValueElement {
    public NoTripsFound(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_BasicInfoRightPanelSet.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TripIterator extends PCFElement {
    public TripIterator(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntries<pcftest.FNOLWizard_BasicInfoRightPanelSet_Trav.TripIterator.entry> get_Entries() {
      return getOrCreateEntries(null, pcftest.FNOLWizard_BasicInfoRightPanelSet_Trav.TripIterator.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_BasicInfoRightPanelSet.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends PCFElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public TripIncidentDV getTripIncidentDV() {
        return getOrCreateProperty("TripIncidentDV", "TripIncidentDV", null, pcftest.FNOLWizard_BasicInfoRightPanelSet_Trav.TripIterator.entry.TripIncidentDV.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_BasicInfoRightPanelSet.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class TripIncidentDV extends DetailViewElement {
        public TripIncidentDV(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public pcftest.FNOLWizard_BasicInfoRightPanelSet_Trav.TripIterator.entry.TripIncidentDV.GeographicalRegion getGeographicalRegion() {
          return getOrCreateProperty("GeographicalRegion", "GeographicalRegion", null, pcftest.FNOLWizard_BasicInfoRightPanelSet_Trav.TripIterator.entry.TripIncidentDV.GeographicalRegion.class);
        }
        
        public ValueElement getTrip() {
          return getOrCreateProperty("Trip", "Trip", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public TripCoveragesLV getTripCoveragesLV() {
          return getOrCreateProperty("TripCoveragesLV", "TripCoveragesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.FNOLWizard_BasicInfoRightPanelSet_Trav.TripIterator.entry.TripIncidentDV.TripCoveragesLV.class);
        }
        
        public TripCoveragesLV_tb getTripCoveragesLV_tb() {
          return getOrCreateProperty("TripCoveragesLV_tb", "TripCoveragesLV_tb", null, pcftest.FNOLWizard_BasicInfoRightPanelSet_Trav.TripIterator.entry.TripIncidentDV.TripCoveragesLV_tb.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_BasicInfoRightPanelSet.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
        @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_BasicInfoRightPanelSet.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class TripCoveragesLV extends PCFElement {
          public TripCoveragesLV(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          @SuppressWarnings(value = "unchecked")
          public IteratorEntriesWithPaging<entry2> get_Entries() {
            return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.FNOLWizard_BasicInfoRightPanelSet_Trav.TripIterator.entry.TripIncidentDV.TripCoveragesLV.entry2.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
          }
          
          public _ListPaging get_ListPaging() {
            return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.FNOLWizard_BasicInfoRightPanelSet_Trav.TripIterator.entry.TripIncidentDV.TripCoveragesLV._ListPaging.class);
          }
          
          @SimplePropertyProcessing
          @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_BasicInfoRightPanelSet.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
          public static class _ListPaging extends PagingElement {
            public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
              super(helper, componentId);
            }
            
            public PCFLocation click() {
              return clickThis(gw.smoketest.platform.web.PCFLocation.class);
            }
            
            
          }
          
          @SimplePropertyProcessing
          @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_BasicInfoRightPanelSet.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
          public static class entry2 extends RowElement {
            public entry2(ISmokeTest helper, PCFElementId componentId)  {
              super(helper, componentId);
            }
            
            public ValueElement getCoverageDetails() {
              return getOrCreateProperty("CoverageDetails", "CoverageDetails", null, gw.smoketest.platform.web.ValueElement.class);
            }
            
            public ValueElement getCoverageType() {
              return getOrCreateProperty("CoverageType", "CoverageType", null, gw.smoketest.platform.web.ValueElement.class);
            }
            
            public IteratorEntryCheckboxElement get_Checkbox() {
              return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
            }
            
            public _Select get_Select() {
              return getOrCreateProperty("_Select", "_Select", null, pcftest.FNOLWizard_BasicInfoRightPanelSet_Trav.TripIterator.entry.TripIncidentDV.TripCoveragesLV.entry2._Select.class);
            }
            
            public _ViewDetail get_ViewDetail() {
              return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.FNOLWizard_BasicInfoRightPanelSet_Trav.TripIterator.entry.TripIncidentDV.TripCoveragesLV.entry2._ViewDetail.class);
            }
            
            @SimplePropertyProcessing
            @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_BasicInfoRightPanelSet.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
            public static class _Select extends SelectorCellElement {
              public _Select(ISmokeTest helper, PCFElementId componentId)  {
                super(helper, componentId);
              }
              
              public PCFLocation click() {
                return clickThis(gw.smoketest.platform.web.PCFLocation.class);
              }
              
              
            }
            
            @SimplePropertyProcessing
            @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_BasicInfoRightPanelSet.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
        @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_BasicInfoRightPanelSet.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class TripCoveragesLV_tb extends PCFElement {
          public TripCoveragesLV_tb(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          
        }
        
        
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_BasicInfoRightPanelSet.Trav.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends PCFElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getCoverageDetails() {
      return getOrCreateProperty("CoverageDetails", "CoverageDetails", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    
  }
  
  
}