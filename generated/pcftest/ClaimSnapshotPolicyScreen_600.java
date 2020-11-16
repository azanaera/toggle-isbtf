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
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ClaimSnapshotPolicyScreen_600.ClaimSnapshotPolicyEndorsements600CardTab;
import pcftest.ClaimSnapshotPolicyScreen_600.ClaimSnapshotPolicyEndorsements600LV_tb;
import pcftest.ClaimSnapshotPolicyScreen_600.ClaimSnapshotPolicyGeneral600CardTab;
import pcftest.ClaimSnapshotPolicyScreen_600.ClaimSnapshotPolicyLocations600LV_tb;
import pcftest.ClaimSnapshotPolicyScreen_600.ClaimSnapshotPolicyLocations600ScreenTab;
import pcftest.ClaimSnapshotPolicyScreen_600.ClaimSnapshotPolicyStatCodes600CardTab;
import pcftest.ClaimSnapshotPolicyScreen_600.ClaimSnapshotPolicyStatCodes600LV_tb;
import pcftest.ClaimSnapshotPolicyScreen_600.ClaimSnapshotPolicyTrips600CardTab;
import pcftest.ClaimSnapshotPolicyScreen_600.ClaimSnapshotPolicyTrips600LV_tb;
import pcftest.ClaimSnapshotPolicyScreen_600.ClaimSnapshotPolicyVehicles600CardTab;
import pcftest.ClaimSnapshotPolicyScreen_600.ClaimSnapshotPolicyVehicles600LV_tb;
import pcftest.ClaimSnapshotPolicyScreen_600.CoverageDetailTab;
import pcftest.ClaimSnapshotPolicyScreen_600.PolicyPropertyCardTab;
import pcftest.ClaimSnapshotPolicyScreen_600.PolicyVehicleCardTab;
import pcftest.ClaimSnapshotPolicyScreen_600.TripCoverageLDP;
import pcftest.ClaimSnapshotPolicyScreen_600.TripCoverageLDP.CovTermsLV;
import pcftest.ClaimSnapshotPolicyScreen_600.TripCoverageLDP.CovTermsLV.AggregationModelHeader;
import pcftest.ClaimSnapshotPolicyScreen_600.TripCoverageLDP.CovTermsLV.RestrictionModelHeader;
import pcftest.ClaimSnapshotPolicyScreen_600.TripCoverageLDP.CovTermsLV.TypeHeader;
import pcftest.ClaimSnapshotPolicyScreen_600.TripCoverageLDP.CovTermsLV.ValueHeader;
import pcftest.ClaimSnapshotPolicyScreen_600.TripCoverageLDP.CovTermsLV.ValueTypeHeader;
import pcftest.ClaimSnapshotPolicyScreen_600.TripCoverageLDP.CovTermsLV_tb;
import pcftest.ClaimSnapshotPolicyScreen_600.TripCoverageLDP.CovTermsTab;
import pcftest.ClaimSnapshotPolicyScreen_600.TripCoverageLDP.CoveragesLV;
import pcftest.ClaimSnapshotPolicyScreen_600.TripCoverageLDP.CoveragesLV.CoverageTypeHeader;
import pcftest.ClaimSnapshotPolicyScreen_600.TripCoverageLDP.CoveragesLV.DeductibleHeader;
import pcftest.ClaimSnapshotPolicyScreen_600.TripCoverageLDP.CoveragesLV.ExposureLimitHeader;
import pcftest.ClaimSnapshotPolicyScreen_600.TripCoverageLDP.CoveragesLV.IncidentLimitHeader;
import pcftest.ClaimSnapshotPolicyScreen_600.TripCoverageLDP.CoveragesLV.NotesHeader;
import pcftest.ClaimSnapshotPolicyScreen_600.TripCoverageLDP.CoveragesLV_tb;
import pcftest.ClaimSnapshotPolicyScreen_600._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotPolicyScreen.600.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotPolicyScreen_600 extends ClaimSnapshotPolicyScreen {
  public final static String CHECKSUM = "843c84dc3135af86dbc405aa00087553";
  
  public ClaimSnapshotPolicyScreen_600(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ClaimSnapshotPolicyEndorsements600CardTab getClaimSnapshotPolicyEndorsements600CardTab() {
    return getOrCreateProperty("ClaimSnapshotPolicyEndorsements600CardTab", "ClaimSnapshotPolicyEndorsements600CardTab", null, pcftest.ClaimSnapshotPolicyScreen_600.ClaimSnapshotPolicyEndorsements600CardTab.class);
  }
  
  public ClaimSnapshotPolicyEndorsements600LV getClaimSnapshotPolicyEndorsements600LV() {
    return getOrCreateProperty("ClaimSnapshotPolicyEndorsements600LV", "ClaimSnapshotPolicyEndorsements600LV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimSnapshotPolicyEndorsements600LV.class);
  }
  
  public ClaimSnapshotPolicyEndorsements600LV_tb getClaimSnapshotPolicyEndorsements600LV_tb() {
    return getOrCreateProperty("ClaimSnapshotPolicyEndorsements600LV_tb", "ClaimSnapshotPolicyEndorsements600LV_tb", null, pcftest.ClaimSnapshotPolicyScreen_600.ClaimSnapshotPolicyEndorsements600LV_tb.class);
  }
  
  public ClaimSnapshotPolicyGeneral600CardTab getClaimSnapshotPolicyGeneral600CardTab() {
    return getOrCreateProperty("ClaimSnapshotPolicyGeneral600CardTab", "ClaimSnapshotPolicyGeneral600CardTab", null, pcftest.ClaimSnapshotPolicyScreen_600.ClaimSnapshotPolicyGeneral600CardTab.class);
  }
  
  public ClaimSnapshotPolicyGeneral600DetailPanelSet getClaimSnapshotPolicyGeneral600DetailPanelSet() {
    return getOrCreateProperty("ClaimSnapshotPolicyGeneral600DetailPanelSet", "ClaimSnapshotPolicyGeneral600DetailPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.ClaimSnapshotPolicyGeneral600DetailPanelSet.class);
  }
  
  public ClaimSnapshotPolicyLocation600PanelSet getClaimSnapshotPolicyLocation600PanelSet() {
    return getOrCreateProperty("ClaimSnapshotPolicyLocation600PanelSet", "ClaimSnapshotPolicyLocation600PanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.ClaimSnapshotPolicyLocation600PanelSet.class);
  }
  
  public ClaimSnapshotPolicyLocations600LV getClaimSnapshotPolicyLocations600LV() {
    return getOrCreateProperty("ClaimSnapshotPolicyLocations600LV", "ClaimSnapshotPolicyLocations600LV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimSnapshotPolicyLocations600LV.class);
  }
  
  public ClaimSnapshotPolicyLocations600LV_tb getClaimSnapshotPolicyLocations600LV_tb() {
    return getOrCreateProperty("ClaimSnapshotPolicyLocations600LV_tb", "ClaimSnapshotPolicyLocations600LV_tb", null, pcftest.ClaimSnapshotPolicyScreen_600.ClaimSnapshotPolicyLocations600LV_tb.class);
  }
  
  public ClaimSnapshotPolicyLocations600ScreenTab getClaimSnapshotPolicyLocations600ScreenTab() {
    return getOrCreateProperty("ClaimSnapshotPolicyLocations600ScreenTab", "ClaimSnapshotPolicyLocations600ScreenTab", null, pcftest.ClaimSnapshotPolicyScreen_600.ClaimSnapshotPolicyLocations600ScreenTab.class);
  }
  
  public ClaimSnapshotPolicyStatCodes600CardTab getClaimSnapshotPolicyStatCodes600CardTab() {
    return getOrCreateProperty("ClaimSnapshotPolicyStatCodes600CardTab", "ClaimSnapshotPolicyStatCodes600CardTab", null, pcftest.ClaimSnapshotPolicyScreen_600.ClaimSnapshotPolicyStatCodes600CardTab.class);
  }
  
  public ClaimSnapshotPolicyStatCodes600LV getClaimSnapshotPolicyStatCodes600LV() {
    return getOrCreateProperty("ClaimSnapshotPolicyStatCodes600LV", "ClaimSnapshotPolicyStatCodes600LV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimSnapshotPolicyStatCodes600LV.class);
  }
  
  public ClaimSnapshotPolicyStatCodes600LV_tb getClaimSnapshotPolicyStatCodes600LV_tb() {
    return getOrCreateProperty("ClaimSnapshotPolicyStatCodes600LV_tb", "ClaimSnapshotPolicyStatCodes600LV_tb", null, pcftest.ClaimSnapshotPolicyScreen_600.ClaimSnapshotPolicyStatCodes600LV_tb.class);
  }
  
  public ClaimSnapshotPolicyTrips600CardTab getClaimSnapshotPolicyTrips600CardTab() {
    return getOrCreateProperty("ClaimSnapshotPolicyTrips600CardTab", "ClaimSnapshotPolicyTrips600CardTab", null, pcftest.ClaimSnapshotPolicyScreen_600.ClaimSnapshotPolicyTrips600CardTab.class);
  }
  
  public ClaimSnapshotPolicyTrips600LV getClaimSnapshotPolicyTrips600LV() {
    return getOrCreateProperty("ClaimSnapshotPolicyTrips600LV", "ClaimSnapshotPolicyTrips600LV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimSnapshotPolicyTrips600LV.class);
  }
  
  public ClaimSnapshotPolicyTrips600LV_tb getClaimSnapshotPolicyTrips600LV_tb() {
    return getOrCreateProperty("ClaimSnapshotPolicyTrips600LV_tb", "ClaimSnapshotPolicyTrips600LV_tb", null, pcftest.ClaimSnapshotPolicyScreen_600.ClaimSnapshotPolicyTrips600LV_tb.class);
  }
  
  public ClaimSnapshotPolicyVehicle600PanelSet getClaimSnapshotPolicyVehicle600PanelSet() {
    return getOrCreateProperty("ClaimSnapshotPolicyVehicle600PanelSet", "ClaimSnapshotPolicyVehicle600PanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.ClaimSnapshotPolicyVehicle600PanelSet.class);
  }
  
  public ClaimSnapshotPolicyVehicles600CardTab getClaimSnapshotPolicyVehicles600CardTab() {
    return getOrCreateProperty("ClaimSnapshotPolicyVehicles600CardTab", "ClaimSnapshotPolicyVehicles600CardTab", null, pcftest.ClaimSnapshotPolicyScreen_600.ClaimSnapshotPolicyVehicles600CardTab.class);
  }
  
  public ClaimSnapshotPolicyVehicles600LV getClaimSnapshotPolicyVehicles600LV() {
    return getOrCreateProperty("ClaimSnapshotPolicyVehicles600LV", "ClaimSnapshotPolicyVehicles600LV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimSnapshotPolicyVehicles600LV.class);
  }
  
  public ClaimSnapshotPolicyVehicles600LV_tb getClaimSnapshotPolicyVehicles600LV_tb() {
    return getOrCreateProperty("ClaimSnapshotPolicyVehicles600LV_tb", "ClaimSnapshotPolicyVehicles600LV_tb", null, pcftest.ClaimSnapshotPolicyScreen_600.ClaimSnapshotPolicyVehicles600LV_tb.class);
  }
  
  public CoverageDetailTab getCoverageDetailTab() {
    return getOrCreateProperty("CoverageDetailTab", "CoverageDetailTab", null, pcftest.ClaimSnapshotPolicyScreen_600.CoverageDetailTab.class);
  }
  
  public PolicyPropertyCardTab getPolicyPropertyCardTab() {
    return getOrCreateProperty("PolicyPropertyCardTab", "PolicyPropertyCardTab", null, pcftest.ClaimSnapshotPolicyScreen_600.PolicyPropertyCardTab.class);
  }
  
  public PolicyVehicleCardTab getPolicyVehicleCardTab() {
    return getOrCreateProperty("PolicyVehicleCardTab", "PolicyVehicleCardTab", null, pcftest.ClaimSnapshotPolicyScreen_600.PolicyVehicleCardTab.class);
  }
  
  public TripCoverageLDP getTripCoverageLDP() {
    return getOrCreateProperty("TripCoverageLDP", "TripCoverageLDP", null, pcftest.ClaimSnapshotPolicyScreen_600.TripCoverageLDP.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ClaimSnapshotPolicyScreen_600._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotPolicyScreen.600.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotPolicyEndorsements600CardTab extends ClickableActionElement {
    public ClaimSnapshotPolicyEndorsements600CardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotPolicyScreen.600.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotPolicyEndorsements600LV_tb extends PCFElement {
    public ClaimSnapshotPolicyEndorsements600LV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotPolicyScreen.600.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotPolicyGeneral600CardTab extends ClickableActionElement {
    public ClaimSnapshotPolicyGeneral600CardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotPolicyScreen.600.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotPolicyLocations600LV_tb extends PCFElement {
    public ClaimSnapshotPolicyLocations600LV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotPolicyScreen.600.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotPolicyLocations600ScreenTab extends ClickableActionElement {
    public ClaimSnapshotPolicyLocations600ScreenTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotPolicyScreen.600.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotPolicyStatCodes600CardTab extends ClickableActionElement {
    public ClaimSnapshotPolicyStatCodes600CardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotPolicyScreen.600.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotPolicyStatCodes600LV_tb extends PCFElement {
    public ClaimSnapshotPolicyStatCodes600LV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotPolicyScreen.600.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotPolicyTrips600CardTab extends ClickableActionElement {
    public ClaimSnapshotPolicyTrips600CardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotPolicyScreen.600.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotPolicyTrips600LV_tb extends PCFElement {
    public ClaimSnapshotPolicyTrips600LV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotPolicyScreen.600.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotPolicyVehicles600CardTab extends ClickableActionElement {
    public ClaimSnapshotPolicyVehicles600CardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotPolicyScreen.600.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotPolicyVehicles600LV_tb extends PCFElement {
    public ClaimSnapshotPolicyVehicles600LV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotPolicyScreen.600.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CoverageDetailTab extends ClickableActionElement {
    public CoverageDetailTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotPolicyScreen.600.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PolicyPropertyCardTab extends ClickableActionElement {
    public PolicyPropertyCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotPolicyScreen.600.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PolicyVehicleCardTab extends ClickableActionElement {
    public PolicyVehicleCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotPolicyScreen.600.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TripCoverageLDP extends PCFElement {
    public TripCoverageLDP(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public CovTermsLV getCovTermsLV() {
      return getOrCreateProperty("CovTermsLV", "CovTermsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimSnapshotPolicyScreen_600.TripCoverageLDP.CovTermsLV.class);
    }
    
    public CovTermsLV_tb getCovTermsLV_tb() {
      return getOrCreateProperty("CovTermsLV_tb", "CovTermsLV_tb", null, pcftest.ClaimSnapshotPolicyScreen_600.TripCoverageLDP.CovTermsLV_tb.class);
    }
    
    public CovTermsTab getCovTermsTab() {
      return getOrCreateProperty("CovTermsTab", "CovTermsTab", null, pcftest.ClaimSnapshotPolicyScreen_600.TripCoverageLDP.CovTermsTab.class);
    }
    
    public CoveragesLV getCoveragesLV() {
      return getOrCreateProperty("CoveragesLV", "CoveragesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimSnapshotPolicyScreen_600.TripCoverageLDP.CoveragesLV.class);
    }
    
    public CoveragesLV_tb getCoveragesLV_tb() {
      return getOrCreateProperty("CoveragesLV_tb", "CoveragesLV_tb", null, pcftest.ClaimSnapshotPolicyScreen_600.TripCoverageLDP.CoveragesLV_tb.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotPolicyScreen.600.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CovTermsLV extends PCFElement {
      public CovTermsLV(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public AggregationModelHeader getAggregationModelHeader() {
        return getOrCreateProperty("AggregationModelHeader", "AggregationModelHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyScreen_600.TripCoverageLDP.CovTermsLV.AggregationModelHeader.class);
      }
      
      public RestrictionModelHeader getRestrictionModelHeader() {
        return getOrCreateProperty("RestrictionModelHeader", "RestrictionModelHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyScreen_600.TripCoverageLDP.CovTermsLV.RestrictionModelHeader.class);
      }
      
      public TypeHeader getTypeHeader() {
        return getOrCreateProperty("TypeHeader", "TypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyScreen_600.TripCoverageLDP.CovTermsLV.TypeHeader.class);
      }
      
      public ValueHeader getValueHeader() {
        return getOrCreateProperty("ValueHeader", "ValueHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyScreen_600.TripCoverageLDP.CovTermsLV.ValueHeader.class);
      }
      
      public ValueTypeHeader getValueTypeHeader() {
        return getOrCreateProperty("ValueTypeHeader", "ValueTypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyScreen_600.TripCoverageLDP.CovTermsLV.ValueTypeHeader.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      @SuppressWarnings(value = "unchecked")
      public IteratorEntriesWithPaging<pcftest.ClaimSnapshotPolicyScreen_600.TripCoverageLDP.CovTermsLV.entry> get_Entries() {
        return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ClaimSnapshotPolicyScreen_600.TripCoverageLDP.CovTermsLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
      }
      
      public pcftest.ClaimSnapshotPolicyScreen_600.TripCoverageLDP.CovTermsLV._ListPaging get_ListPaging() {
        return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ClaimSnapshotPolicyScreen_600.TripCoverageLDP.CovTermsLV._ListPaging.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotPolicyScreen.600.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class AggregationModelHeader extends ValueElement {
        public AggregationModelHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotPolicyScreen.600.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class RestrictionModelHeader extends ValueElement {
        public RestrictionModelHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotPolicyScreen.600.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class TypeHeader extends ValueElement {
        public TypeHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotPolicyScreen.600.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ValueHeader extends ValueElement {
        public ValueHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotPolicyScreen.600.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ValueTypeHeader extends ValueElement {
        public ValueTypeHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotPolicyScreen.600.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _ListPaging extends PagingElement {
        public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotPolicyScreen.600.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class entry extends RowElement {
        public entry(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public ValueElement getAggregationModel() {
          return getOrCreateProperty("AggregationModel", "AggregationModel", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getRestrictionModel() {
          return getOrCreateProperty("RestrictionModel", "RestrictionModel", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getType() {
          return getOrCreateProperty("Type", "Type", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getValue() {
          return getOrCreateProperty("Value", "Value", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getValueType() {
          return getOrCreateProperty("ValueType", "ValueType", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public IteratorEntryCheckboxElement get_Checkbox() {
          return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
        }
        
        public pcftest.ClaimSnapshotPolicyScreen_600.TripCoverageLDP.CovTermsLV.entry._Select get_Select() {
          return getOrCreateProperty("_Select", "_Select", null, pcftest.ClaimSnapshotPolicyScreen_600.TripCoverageLDP.CovTermsLV.entry._Select.class);
        }
        
        public pcftest.ClaimSnapshotPolicyScreen_600.TripCoverageLDP.CovTermsLV.entry._ViewDetail get_ViewDetail() {
          return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ClaimSnapshotPolicyScreen_600.TripCoverageLDP.CovTermsLV.entry._ViewDetail.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotPolicyScreen.600.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class _Select extends SelectorCellElement {
          public _Select(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotPolicyScreen.600.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotPolicyScreen.600.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CovTermsLV_tb extends PCFElement {
      public CovTermsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotPolicyScreen.600.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CovTermsTab extends ClickableActionElement {
      public CovTermsTab(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotPolicyScreen.600.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CoveragesLV extends PCFElement {
      public CoveragesLV(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public CoverageTypeHeader getCoverageTypeHeader() {
        return getOrCreateProperty("CoverageTypeHeader", "CoverageTypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyScreen_600.TripCoverageLDP.CoveragesLV.CoverageTypeHeader.class);
      }
      
      public DeductibleHeader getDeductibleHeader() {
        return getOrCreateProperty("DeductibleHeader", "DeductibleHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyScreen_600.TripCoverageLDP.CoveragesLV.DeductibleHeader.class);
      }
      
      public ExposureLimitHeader getExposureLimitHeader() {
        return getOrCreateProperty("ExposureLimitHeader", "ExposureLimitHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyScreen_600.TripCoverageLDP.CoveragesLV.ExposureLimitHeader.class);
      }
      
      public IncidentLimitHeader getIncidentLimitHeader() {
        return getOrCreateProperty("IncidentLimitHeader", "IncidentLimitHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyScreen_600.TripCoverageLDP.CoveragesLV.IncidentLimitHeader.class);
      }
      
      public NotesHeader getNotesHeader() {
        return getOrCreateProperty("NotesHeader", "NotesHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyScreen_600.TripCoverageLDP.CoveragesLV.NotesHeader.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      @SuppressWarnings(value = "unchecked")
      public IteratorEntriesWithPaging<pcftest.ClaimSnapshotPolicyScreen_600.TripCoverageLDP.CoveragesLV.entry> get_Entries() {
        return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ClaimSnapshotPolicyScreen_600.TripCoverageLDP.CoveragesLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
      }
      
      public pcftest.ClaimSnapshotPolicyScreen_600.TripCoverageLDP.CoveragesLV._ListPaging get_ListPaging() {
        return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ClaimSnapshotPolicyScreen_600.TripCoverageLDP.CoveragesLV._ListPaging.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotPolicyScreen.600.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class CoverageTypeHeader extends ValueElement {
        public CoverageTypeHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotPolicyScreen.600.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class DeductibleHeader extends ValueElement {
        public DeductibleHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotPolicyScreen.600.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ExposureLimitHeader extends ValueElement {
        public ExposureLimitHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotPolicyScreen.600.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class IncidentLimitHeader extends ValueElement {
        public IncidentLimitHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotPolicyScreen.600.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class NotesHeader extends ValueElement {
        public NotesHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotPolicyScreen.600.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _ListPaging extends PagingElement {
        public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotPolicyScreen.600.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class entry extends RowElement {
        public entry(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public ValueElement getCoverageType() {
          return getOrCreateProperty("CoverageType", "CoverageType", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getDeductible() {
          return getOrCreateProperty("Deductible", "Deductible", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getExposureLimit() {
          return getOrCreateProperty("ExposureLimit", "ExposureLimit", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getIncidentLimit() {
          return getOrCreateProperty("IncidentLimit", "IncidentLimit", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getNotes() {
          return getOrCreateProperty("Notes", "Notes", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public IteratorEntryCheckboxElement get_Checkbox() {
          return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
        }
        
        public pcftest.ClaimSnapshotPolicyScreen_600.TripCoverageLDP.CoveragesLV.entry._Select get_Select() {
          return getOrCreateProperty("_Select", "_Select", null, pcftest.ClaimSnapshotPolicyScreen_600.TripCoverageLDP.CoveragesLV.entry._Select.class);
        }
        
        public pcftest.ClaimSnapshotPolicyScreen_600.TripCoverageLDP.CoveragesLV.entry._ViewDetail get_ViewDetail() {
          return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ClaimSnapshotPolicyScreen_600.TripCoverageLDP.CoveragesLV.entry._ViewDetail.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotPolicyScreen.600.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class _Select extends SelectorCellElement {
          public _Select(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotPolicyScreen.600.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotPolicyScreen.600.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CoveragesLV_tb extends PCFElement {
      public CoveragesLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotPolicyScreen.600.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}