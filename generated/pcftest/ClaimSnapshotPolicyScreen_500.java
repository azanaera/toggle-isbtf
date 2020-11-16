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
import pcftest.ClaimSnapshotPolicyScreen_500.ClaimSnapshotPolicyEndorsements500CardTab;
import pcftest.ClaimSnapshotPolicyScreen_500.ClaimSnapshotPolicyEndorsements500LV_tb;
import pcftest.ClaimSnapshotPolicyScreen_500.ClaimSnapshotPolicyGeneral500CardTab;
import pcftest.ClaimSnapshotPolicyScreen_500.ClaimSnapshotPolicyLocations500LV_tb;
import pcftest.ClaimSnapshotPolicyScreen_500.ClaimSnapshotPolicyLocations500ScreenTab;
import pcftest.ClaimSnapshotPolicyScreen_500.ClaimSnapshotPolicyStatCodes500CardTab;
import pcftest.ClaimSnapshotPolicyScreen_500.ClaimSnapshotPolicyStatCodes500LV_tb;
import pcftest.ClaimSnapshotPolicyScreen_500.ClaimSnapshotPolicyTrips500CardTab;
import pcftest.ClaimSnapshotPolicyScreen_500.ClaimSnapshotPolicyTrips500LV_tb;
import pcftest.ClaimSnapshotPolicyScreen_500.ClaimSnapshotPolicyVehicles500CardTab;
import pcftest.ClaimSnapshotPolicyScreen_500.ClaimSnapshotPolicyVehicles500LV_tb;
import pcftest.ClaimSnapshotPolicyScreen_500.CoverageDetailTab;
import pcftest.ClaimSnapshotPolicyScreen_500.PolicyPropertyCardTab;
import pcftest.ClaimSnapshotPolicyScreen_500.PolicyVehicleCardTab;
import pcftest.ClaimSnapshotPolicyScreen_500.TripCoverageLDP;
import pcftest.ClaimSnapshotPolicyScreen_500.TripCoverageLDP.CovTermsLV;
import pcftest.ClaimSnapshotPolicyScreen_500.TripCoverageLDP.CovTermsLV.AggregationModelHeader;
import pcftest.ClaimSnapshotPolicyScreen_500.TripCoverageLDP.CovTermsLV.RestrictionModelHeader;
import pcftest.ClaimSnapshotPolicyScreen_500.TripCoverageLDP.CovTermsLV.TypeHeader;
import pcftest.ClaimSnapshotPolicyScreen_500.TripCoverageLDP.CovTermsLV.ValueHeader;
import pcftest.ClaimSnapshotPolicyScreen_500.TripCoverageLDP.CovTermsLV.ValueTypeHeader;
import pcftest.ClaimSnapshotPolicyScreen_500.TripCoverageLDP.CovTermsLV_tb;
import pcftest.ClaimSnapshotPolicyScreen_500.TripCoverageLDP.CovTermsTab;
import pcftest.ClaimSnapshotPolicyScreen_500.TripCoverageLDP.CoveragesLV;
import pcftest.ClaimSnapshotPolicyScreen_500.TripCoverageLDP.CoveragesLV.CoverageTypeHeader;
import pcftest.ClaimSnapshotPolicyScreen_500.TripCoverageLDP.CoveragesLV.DeductibleHeader;
import pcftest.ClaimSnapshotPolicyScreen_500.TripCoverageLDP.CoveragesLV.ExposureLimitHeader;
import pcftest.ClaimSnapshotPolicyScreen_500.TripCoverageLDP.CoveragesLV.IncidentLimitHeader;
import pcftest.ClaimSnapshotPolicyScreen_500.TripCoverageLDP.CoveragesLV.NotesHeader;
import pcftest.ClaimSnapshotPolicyScreen_500.TripCoverageLDP.CoveragesLV_tb;
import pcftest.ClaimSnapshotPolicyScreen_500._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/snapshot/500/ClaimSnapshotPolicyScreen.500.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotPolicyScreen_500 extends ClaimSnapshotPolicyScreen {
  public final static String CHECKSUM = "0b19826a0c6cbdc74fd261dbce731df4";
  
  public ClaimSnapshotPolicyScreen_500(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ClaimSnapshotPolicyEndorsements500CardTab getClaimSnapshotPolicyEndorsements500CardTab() {
    return getOrCreateProperty("ClaimSnapshotPolicyEndorsements500CardTab", "ClaimSnapshotPolicyEndorsements500CardTab", null, pcftest.ClaimSnapshotPolicyScreen_500.ClaimSnapshotPolicyEndorsements500CardTab.class);
  }
  
  public ClaimSnapshotPolicyEndorsements500LV getClaimSnapshotPolicyEndorsements500LV() {
    return getOrCreateProperty("ClaimSnapshotPolicyEndorsements500LV", "ClaimSnapshotPolicyEndorsements500LV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimSnapshotPolicyEndorsements500LV.class);
  }
  
  public ClaimSnapshotPolicyEndorsements500LV_tb getClaimSnapshotPolicyEndorsements500LV_tb() {
    return getOrCreateProperty("ClaimSnapshotPolicyEndorsements500LV_tb", "ClaimSnapshotPolicyEndorsements500LV_tb", null, pcftest.ClaimSnapshotPolicyScreen_500.ClaimSnapshotPolicyEndorsements500LV_tb.class);
  }
  
  public ClaimSnapshotPolicyGeneral500CardTab getClaimSnapshotPolicyGeneral500CardTab() {
    return getOrCreateProperty("ClaimSnapshotPolicyGeneral500CardTab", "ClaimSnapshotPolicyGeneral500CardTab", null, pcftest.ClaimSnapshotPolicyScreen_500.ClaimSnapshotPolicyGeneral500CardTab.class);
  }
  
  public ClaimSnapshotPolicyGeneral500DetailPanelSet getClaimSnapshotPolicyGeneral500DetailPanelSet() {
    return getOrCreateProperty("ClaimSnapshotPolicyGeneral500DetailPanelSet", "ClaimSnapshotPolicyGeneral500DetailPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.ClaimSnapshotPolicyGeneral500DetailPanelSet.class);
  }
  
  public ClaimSnapshotPolicyLocation500PanelSet getClaimSnapshotPolicyLocation500PanelSet() {
    return getOrCreateProperty("ClaimSnapshotPolicyLocation500PanelSet", "ClaimSnapshotPolicyLocation500PanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.ClaimSnapshotPolicyLocation500PanelSet.class);
  }
  
  public ClaimSnapshotPolicyLocations500LV getClaimSnapshotPolicyLocations500LV() {
    return getOrCreateProperty("ClaimSnapshotPolicyLocations500LV", "ClaimSnapshotPolicyLocations500LV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimSnapshotPolicyLocations500LV.class);
  }
  
  public ClaimSnapshotPolicyLocations500LV_tb getClaimSnapshotPolicyLocations500LV_tb() {
    return getOrCreateProperty("ClaimSnapshotPolicyLocations500LV_tb", "ClaimSnapshotPolicyLocations500LV_tb", null, pcftest.ClaimSnapshotPolicyScreen_500.ClaimSnapshotPolicyLocations500LV_tb.class);
  }
  
  public ClaimSnapshotPolicyLocations500ScreenTab getClaimSnapshotPolicyLocations500ScreenTab() {
    return getOrCreateProperty("ClaimSnapshotPolicyLocations500ScreenTab", "ClaimSnapshotPolicyLocations500ScreenTab", null, pcftest.ClaimSnapshotPolicyScreen_500.ClaimSnapshotPolicyLocations500ScreenTab.class);
  }
  
  public ClaimSnapshotPolicyStatCodes500CardTab getClaimSnapshotPolicyStatCodes500CardTab() {
    return getOrCreateProperty("ClaimSnapshotPolicyStatCodes500CardTab", "ClaimSnapshotPolicyStatCodes500CardTab", null, pcftest.ClaimSnapshotPolicyScreen_500.ClaimSnapshotPolicyStatCodes500CardTab.class);
  }
  
  public ClaimSnapshotPolicyStatCodes500LV getClaimSnapshotPolicyStatCodes500LV() {
    return getOrCreateProperty("ClaimSnapshotPolicyStatCodes500LV", "ClaimSnapshotPolicyStatCodes500LV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimSnapshotPolicyStatCodes500LV.class);
  }
  
  public ClaimSnapshotPolicyStatCodes500LV_tb getClaimSnapshotPolicyStatCodes500LV_tb() {
    return getOrCreateProperty("ClaimSnapshotPolicyStatCodes500LV_tb", "ClaimSnapshotPolicyStatCodes500LV_tb", null, pcftest.ClaimSnapshotPolicyScreen_500.ClaimSnapshotPolicyStatCodes500LV_tb.class);
  }
  
  public ClaimSnapshotPolicyTrips500CardTab getClaimSnapshotPolicyTrips500CardTab() {
    return getOrCreateProperty("ClaimSnapshotPolicyTrips500CardTab", "ClaimSnapshotPolicyTrips500CardTab", null, pcftest.ClaimSnapshotPolicyScreen_500.ClaimSnapshotPolicyTrips500CardTab.class);
  }
  
  public ClaimSnapshotPolicyTrips500LV getClaimSnapshotPolicyTrips500LV() {
    return getOrCreateProperty("ClaimSnapshotPolicyTrips500LV", "ClaimSnapshotPolicyTrips500LV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimSnapshotPolicyTrips500LV.class);
  }
  
  public ClaimSnapshotPolicyTrips500LV_tb getClaimSnapshotPolicyTrips500LV_tb() {
    return getOrCreateProperty("ClaimSnapshotPolicyTrips500LV_tb", "ClaimSnapshotPolicyTrips500LV_tb", null, pcftest.ClaimSnapshotPolicyScreen_500.ClaimSnapshotPolicyTrips500LV_tb.class);
  }
  
  public ClaimSnapshotPolicyVehicle500PanelSet getClaimSnapshotPolicyVehicle500PanelSet() {
    return getOrCreateProperty("ClaimSnapshotPolicyVehicle500PanelSet", "ClaimSnapshotPolicyVehicle500PanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.ClaimSnapshotPolicyVehicle500PanelSet.class);
  }
  
  public ClaimSnapshotPolicyVehicles500CardTab getClaimSnapshotPolicyVehicles500CardTab() {
    return getOrCreateProperty("ClaimSnapshotPolicyVehicles500CardTab", "ClaimSnapshotPolicyVehicles500CardTab", null, pcftest.ClaimSnapshotPolicyScreen_500.ClaimSnapshotPolicyVehicles500CardTab.class);
  }
  
  public ClaimSnapshotPolicyVehicles500LV getClaimSnapshotPolicyVehicles500LV() {
    return getOrCreateProperty("ClaimSnapshotPolicyVehicles500LV", "ClaimSnapshotPolicyVehicles500LV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimSnapshotPolicyVehicles500LV.class);
  }
  
  public ClaimSnapshotPolicyVehicles500LV_tb getClaimSnapshotPolicyVehicles500LV_tb() {
    return getOrCreateProperty("ClaimSnapshotPolicyVehicles500LV_tb", "ClaimSnapshotPolicyVehicles500LV_tb", null, pcftest.ClaimSnapshotPolicyScreen_500.ClaimSnapshotPolicyVehicles500LV_tb.class);
  }
  
  public CoverageDetailTab getCoverageDetailTab() {
    return getOrCreateProperty("CoverageDetailTab", "CoverageDetailTab", null, pcftest.ClaimSnapshotPolicyScreen_500.CoverageDetailTab.class);
  }
  
  public PolicyPropertyCardTab getPolicyPropertyCardTab() {
    return getOrCreateProperty("PolicyPropertyCardTab", "PolicyPropertyCardTab", null, pcftest.ClaimSnapshotPolicyScreen_500.PolicyPropertyCardTab.class);
  }
  
  public PolicyVehicleCardTab getPolicyVehicleCardTab() {
    return getOrCreateProperty("PolicyVehicleCardTab", "PolicyVehicleCardTab", null, pcftest.ClaimSnapshotPolicyScreen_500.PolicyVehicleCardTab.class);
  }
  
  public TripCoverageLDP getTripCoverageLDP() {
    return getOrCreateProperty("TripCoverageLDP", "TripCoverageLDP", null, pcftest.ClaimSnapshotPolicyScreen_500.TripCoverageLDP.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ClaimSnapshotPolicyScreen_500._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/500/ClaimSnapshotPolicyScreen.500.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotPolicyEndorsements500CardTab extends ClickableActionElement {
    public ClaimSnapshotPolicyEndorsements500CardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/500/ClaimSnapshotPolicyScreen.500.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotPolicyEndorsements500LV_tb extends PCFElement {
    public ClaimSnapshotPolicyEndorsements500LV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/500/ClaimSnapshotPolicyScreen.500.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotPolicyGeneral500CardTab extends ClickableActionElement {
    public ClaimSnapshotPolicyGeneral500CardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/500/ClaimSnapshotPolicyScreen.500.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotPolicyLocations500LV_tb extends PCFElement {
    public ClaimSnapshotPolicyLocations500LV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/500/ClaimSnapshotPolicyScreen.500.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotPolicyLocations500ScreenTab extends ClickableActionElement {
    public ClaimSnapshotPolicyLocations500ScreenTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/500/ClaimSnapshotPolicyScreen.500.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotPolicyStatCodes500CardTab extends ClickableActionElement {
    public ClaimSnapshotPolicyStatCodes500CardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/500/ClaimSnapshotPolicyScreen.500.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotPolicyStatCodes500LV_tb extends PCFElement {
    public ClaimSnapshotPolicyStatCodes500LV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/500/ClaimSnapshotPolicyScreen.500.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotPolicyTrips500CardTab extends ClickableActionElement {
    public ClaimSnapshotPolicyTrips500CardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/500/ClaimSnapshotPolicyScreen.500.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotPolicyTrips500LV_tb extends PCFElement {
    public ClaimSnapshotPolicyTrips500LV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/500/ClaimSnapshotPolicyScreen.500.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotPolicyVehicles500CardTab extends ClickableActionElement {
    public ClaimSnapshotPolicyVehicles500CardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/500/ClaimSnapshotPolicyScreen.500.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotPolicyVehicles500LV_tb extends PCFElement {
    public ClaimSnapshotPolicyVehicles500LV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/500/ClaimSnapshotPolicyScreen.500.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CoverageDetailTab extends ClickableActionElement {
    public CoverageDetailTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/500/ClaimSnapshotPolicyScreen.500.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PolicyPropertyCardTab extends ClickableActionElement {
    public PolicyPropertyCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/500/ClaimSnapshotPolicyScreen.500.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PolicyVehicleCardTab extends ClickableActionElement {
    public PolicyVehicleCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/500/ClaimSnapshotPolicyScreen.500.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TripCoverageLDP extends PCFElement {
    public TripCoverageLDP(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public CovTermsLV getCovTermsLV() {
      return getOrCreateProperty("CovTermsLV", "CovTermsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimSnapshotPolicyScreen_500.TripCoverageLDP.CovTermsLV.class);
    }
    
    public CovTermsLV_tb getCovTermsLV_tb() {
      return getOrCreateProperty("CovTermsLV_tb", "CovTermsLV_tb", null, pcftest.ClaimSnapshotPolicyScreen_500.TripCoverageLDP.CovTermsLV_tb.class);
    }
    
    public CovTermsTab getCovTermsTab() {
      return getOrCreateProperty("CovTermsTab", "CovTermsTab", null, pcftest.ClaimSnapshotPolicyScreen_500.TripCoverageLDP.CovTermsTab.class);
    }
    
    public CoveragesLV getCoveragesLV() {
      return getOrCreateProperty("CoveragesLV", "CoveragesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimSnapshotPolicyScreen_500.TripCoverageLDP.CoveragesLV.class);
    }
    
    public CoveragesLV_tb getCoveragesLV_tb() {
      return getOrCreateProperty("CoveragesLV_tb", "CoveragesLV_tb", null, pcftest.ClaimSnapshotPolicyScreen_500.TripCoverageLDP.CoveragesLV_tb.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/500/ClaimSnapshotPolicyScreen.500.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CovTermsLV extends PCFElement {
      public CovTermsLV(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public AggregationModelHeader getAggregationModelHeader() {
        return getOrCreateProperty("AggregationModelHeader", "AggregationModelHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyScreen_500.TripCoverageLDP.CovTermsLV.AggregationModelHeader.class);
      }
      
      public RestrictionModelHeader getRestrictionModelHeader() {
        return getOrCreateProperty("RestrictionModelHeader", "RestrictionModelHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyScreen_500.TripCoverageLDP.CovTermsLV.RestrictionModelHeader.class);
      }
      
      public TypeHeader getTypeHeader() {
        return getOrCreateProperty("TypeHeader", "TypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyScreen_500.TripCoverageLDP.CovTermsLV.TypeHeader.class);
      }
      
      public ValueHeader getValueHeader() {
        return getOrCreateProperty("ValueHeader", "ValueHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyScreen_500.TripCoverageLDP.CovTermsLV.ValueHeader.class);
      }
      
      public ValueTypeHeader getValueTypeHeader() {
        return getOrCreateProperty("ValueTypeHeader", "ValueTypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyScreen_500.TripCoverageLDP.CovTermsLV.ValueTypeHeader.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      @SuppressWarnings(value = "unchecked")
      public IteratorEntriesWithPaging<pcftest.ClaimSnapshotPolicyScreen_500.TripCoverageLDP.CovTermsLV.entry> get_Entries() {
        return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ClaimSnapshotPolicyScreen_500.TripCoverageLDP.CovTermsLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
      }
      
      public pcftest.ClaimSnapshotPolicyScreen_500.TripCoverageLDP.CovTermsLV._ListPaging get_ListPaging() {
        return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ClaimSnapshotPolicyScreen_500.TripCoverageLDP.CovTermsLV._ListPaging.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/500/ClaimSnapshotPolicyScreen.500.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class AggregationModelHeader extends ValueElement {
        public AggregationModelHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/500/ClaimSnapshotPolicyScreen.500.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class RestrictionModelHeader extends ValueElement {
        public RestrictionModelHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/500/ClaimSnapshotPolicyScreen.500.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class TypeHeader extends ValueElement {
        public TypeHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/500/ClaimSnapshotPolicyScreen.500.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ValueHeader extends ValueElement {
        public ValueHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/500/ClaimSnapshotPolicyScreen.500.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ValueTypeHeader extends ValueElement {
        public ValueTypeHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/500/ClaimSnapshotPolicyScreen.500.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _ListPaging extends PagingElement {
        public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/500/ClaimSnapshotPolicyScreen.500.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
        
        public pcftest.ClaimSnapshotPolicyScreen_500.TripCoverageLDP.CovTermsLV.entry._Select get_Select() {
          return getOrCreateProperty("_Select", "_Select", null, pcftest.ClaimSnapshotPolicyScreen_500.TripCoverageLDP.CovTermsLV.entry._Select.class);
        }
        
        public pcftest.ClaimSnapshotPolicyScreen_500.TripCoverageLDP.CovTermsLV.entry._ViewDetail get_ViewDetail() {
          return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ClaimSnapshotPolicyScreen_500.TripCoverageLDP.CovTermsLV.entry._ViewDetail.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/snapshot/500/ClaimSnapshotPolicyScreen.500.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class _Select extends SelectorCellElement {
          public _Select(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/snapshot/500/ClaimSnapshotPolicyScreen.500.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/claim/snapshot/500/ClaimSnapshotPolicyScreen.500.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CovTermsLV_tb extends PCFElement {
      public CovTermsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/500/ClaimSnapshotPolicyScreen.500.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CovTermsTab extends ClickableActionElement {
      public CovTermsTab(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/500/ClaimSnapshotPolicyScreen.500.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CoveragesLV extends PCFElement {
      public CoveragesLV(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public CoverageTypeHeader getCoverageTypeHeader() {
        return getOrCreateProperty("CoverageTypeHeader", "CoverageTypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyScreen_500.TripCoverageLDP.CoveragesLV.CoverageTypeHeader.class);
      }
      
      public DeductibleHeader getDeductibleHeader() {
        return getOrCreateProperty("DeductibleHeader", "DeductibleHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyScreen_500.TripCoverageLDP.CoveragesLV.DeductibleHeader.class);
      }
      
      public ExposureLimitHeader getExposureLimitHeader() {
        return getOrCreateProperty("ExposureLimitHeader", "ExposureLimitHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyScreen_500.TripCoverageLDP.CoveragesLV.ExposureLimitHeader.class);
      }
      
      public IncidentLimitHeader getIncidentLimitHeader() {
        return getOrCreateProperty("IncidentLimitHeader", "IncidentLimitHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyScreen_500.TripCoverageLDP.CoveragesLV.IncidentLimitHeader.class);
      }
      
      public NotesHeader getNotesHeader() {
        return getOrCreateProperty("NotesHeader", "NotesHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyScreen_500.TripCoverageLDP.CoveragesLV.NotesHeader.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      @SuppressWarnings(value = "unchecked")
      public IteratorEntriesWithPaging<pcftest.ClaimSnapshotPolicyScreen_500.TripCoverageLDP.CoveragesLV.entry> get_Entries() {
        return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ClaimSnapshotPolicyScreen_500.TripCoverageLDP.CoveragesLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
      }
      
      public pcftest.ClaimSnapshotPolicyScreen_500.TripCoverageLDP.CoveragesLV._ListPaging get_ListPaging() {
        return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ClaimSnapshotPolicyScreen_500.TripCoverageLDP.CoveragesLV._ListPaging.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/500/ClaimSnapshotPolicyScreen.500.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class CoverageTypeHeader extends ValueElement {
        public CoverageTypeHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/500/ClaimSnapshotPolicyScreen.500.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class DeductibleHeader extends ValueElement {
        public DeductibleHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/500/ClaimSnapshotPolicyScreen.500.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ExposureLimitHeader extends ValueElement {
        public ExposureLimitHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/500/ClaimSnapshotPolicyScreen.500.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class IncidentLimitHeader extends ValueElement {
        public IncidentLimitHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/500/ClaimSnapshotPolicyScreen.500.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class NotesHeader extends ValueElement {
        public NotesHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/500/ClaimSnapshotPolicyScreen.500.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _ListPaging extends PagingElement {
        public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/500/ClaimSnapshotPolicyScreen.500.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
        
        public pcftest.ClaimSnapshotPolicyScreen_500.TripCoverageLDP.CoveragesLV.entry._Select get_Select() {
          return getOrCreateProperty("_Select", "_Select", null, pcftest.ClaimSnapshotPolicyScreen_500.TripCoverageLDP.CoveragesLV.entry._Select.class);
        }
        
        public pcftest.ClaimSnapshotPolicyScreen_500.TripCoverageLDP.CoveragesLV.entry._ViewDetail get_ViewDetail() {
          return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ClaimSnapshotPolicyScreen_500.TripCoverageLDP.CoveragesLV.entry._ViewDetail.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/snapshot/500/ClaimSnapshotPolicyScreen.500.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class _Select extends SelectorCellElement {
          public _Select(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/snapshot/500/ClaimSnapshotPolicyScreen.500.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/claim/snapshot/500/ClaimSnapshotPolicyScreen.500.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CoveragesLV_tb extends PCFElement {
      public CoveragesLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/500/ClaimSnapshotPolicyScreen.500.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}