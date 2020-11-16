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
import pcftest.ClaimSnapshotPolicyScreen_default.ClaimSnapshotPolicyEndorsementsCardTab;
import pcftest.ClaimSnapshotPolicyScreen_default.ClaimSnapshotPolicyEndorsementsLV_tb;
import pcftest.ClaimSnapshotPolicyScreen_default.ClaimSnapshotPolicyGeneralCardTab;
import pcftest.ClaimSnapshotPolicyScreen_default.ClaimSnapshotPolicyLocationsLV_tb;
import pcftest.ClaimSnapshotPolicyScreen_default.ClaimSnapshotPolicyLocationsScreenTab;
import pcftest.ClaimSnapshotPolicyScreen_default.ClaimSnapshotPolicyStatCodesCardTab;
import pcftest.ClaimSnapshotPolicyScreen_default.ClaimSnapshotPolicyStatCodesLV_tb;
import pcftest.ClaimSnapshotPolicyScreen_default.ClaimSnapshotPolicyTripsCardTab;
import pcftest.ClaimSnapshotPolicyScreen_default.ClaimSnapshotPolicyTripsLV_tb;
import pcftest.ClaimSnapshotPolicyScreen_default.ClaimSnapshotPolicyVehiclesCardTab;
import pcftest.ClaimSnapshotPolicyScreen_default.ClaimSnapshotPolicyVehiclesLV_tb;
import pcftest.ClaimSnapshotPolicyScreen_default.CoverageDetailTab;
import pcftest.ClaimSnapshotPolicyScreen_default.PolicyPropertyCardTab;
import pcftest.ClaimSnapshotPolicyScreen_default.PolicyVehicleCardTab;
import pcftest.ClaimSnapshotPolicyScreen_default.TripCoverageLDP;
import pcftest.ClaimSnapshotPolicyScreen_default.TripCoverageLDP.CoveragesLV;
import pcftest.ClaimSnapshotPolicyScreen_default.TripCoverageLDP.CoveragesLV.CoverageTypeHeader;
import pcftest.ClaimSnapshotPolicyScreen_default.TripCoverageLDP.CoveragesLV.CurrencyHeader;
import pcftest.ClaimSnapshotPolicyScreen_default.TripCoverageLDP.CoveragesLV.DeductibleHeader;
import pcftest.ClaimSnapshotPolicyScreen_default.TripCoverageLDP.CoveragesLV.ExposureLimitHeader;
import pcftest.ClaimSnapshotPolicyScreen_default.TripCoverageLDP.CoveragesLV.IncidentLimitHeader;
import pcftest.ClaimSnapshotPolicyScreen_default.TripCoverageLDP.CoveragesLV.NotesHeader;
import pcftest.ClaimSnapshotPolicyScreen_default.TripCoverageLDP.CoveragesLV._ListPaging;
import pcftest.ClaimSnapshotPolicyScreen_default.TripCoverageLDP.CoveragesLV.entry;
import pcftest.ClaimSnapshotPolicyScreen_default.TripCoverageLDP.CoveragesLV.entry._Select;
import pcftest.ClaimSnapshotPolicyScreen_default.TripCoverageLDP.CoveragesLV.entry._ViewDetail;
import pcftest.ClaimSnapshotPolicyScreen_default.TripCoverageLDP.CoveragesLV_tb;
import pcftest.ClaimSnapshotPolicyScreen_default._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotPolicyScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotPolicyScreen_default extends ClaimSnapshotPolicyScreen {
  public final static String CHECKSUM = "7fe2721c4c6c4c7eda99123773fc0065";
  
  public ClaimSnapshotPolicyScreen_default(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ClaimSnapshotPolicyEndorsementsCardTab getClaimSnapshotPolicyEndorsementsCardTab() {
    return getOrCreateProperty("ClaimSnapshotPolicyEndorsementsCardTab", "ClaimSnapshotPolicyEndorsementsCardTab", null, pcftest.ClaimSnapshotPolicyScreen_default.ClaimSnapshotPolicyEndorsementsCardTab.class);
  }
  
  public ClaimSnapshotPolicyEndorsementsLV getClaimSnapshotPolicyEndorsementsLV() {
    return getOrCreateProperty("ClaimSnapshotPolicyEndorsementsLV", "ClaimSnapshotPolicyEndorsementsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimSnapshotPolicyEndorsementsLV.class);
  }
  
  public ClaimSnapshotPolicyEndorsementsLV_tb getClaimSnapshotPolicyEndorsementsLV_tb() {
    return getOrCreateProperty("ClaimSnapshotPolicyEndorsementsLV_tb", "ClaimSnapshotPolicyEndorsementsLV_tb", null, pcftest.ClaimSnapshotPolicyScreen_default.ClaimSnapshotPolicyEndorsementsLV_tb.class);
  }
  
  public ClaimSnapshotPolicyGeneralCardTab getClaimSnapshotPolicyGeneralCardTab() {
    return getOrCreateProperty("ClaimSnapshotPolicyGeneralCardTab", "ClaimSnapshotPolicyGeneralCardTab", null, pcftest.ClaimSnapshotPolicyScreen_default.ClaimSnapshotPolicyGeneralCardTab.class);
  }
  
  public ClaimSnapshotPolicyGeneralDetailPanelSet getClaimSnapshotPolicyGeneralDetailPanelSet() {
    return getOrCreateProperty("ClaimSnapshotPolicyGeneralDetailPanelSet", "ClaimSnapshotPolicyGeneralDetailPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.ClaimSnapshotPolicyGeneralDetailPanelSet.class);
  }
  
  public ClaimSnapshotPolicyLocationPanelSet getClaimSnapshotPolicyLocationPanelSet() {
    return getOrCreateProperty("ClaimSnapshotPolicyLocationPanelSet", "ClaimSnapshotPolicyLocationPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.ClaimSnapshotPolicyLocationPanelSet.class);
  }
  
  public ClaimSnapshotPolicyLocationsLV getClaimSnapshotPolicyLocationsLV() {
    return getOrCreateProperty("ClaimSnapshotPolicyLocationsLV", "ClaimSnapshotPolicyLocationsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimSnapshotPolicyLocationsLV.class);
  }
  
  public ClaimSnapshotPolicyLocationsLV_tb getClaimSnapshotPolicyLocationsLV_tb() {
    return getOrCreateProperty("ClaimSnapshotPolicyLocationsLV_tb", "ClaimSnapshotPolicyLocationsLV_tb", null, pcftest.ClaimSnapshotPolicyScreen_default.ClaimSnapshotPolicyLocationsLV_tb.class);
  }
  
  public ClaimSnapshotPolicyLocationsScreenTab getClaimSnapshotPolicyLocationsScreenTab() {
    return getOrCreateProperty("ClaimSnapshotPolicyLocationsScreenTab", "ClaimSnapshotPolicyLocationsScreenTab", null, pcftest.ClaimSnapshotPolicyScreen_default.ClaimSnapshotPolicyLocationsScreenTab.class);
  }
  
  public ClaimSnapshotPolicyStatCodesCardTab getClaimSnapshotPolicyStatCodesCardTab() {
    return getOrCreateProperty("ClaimSnapshotPolicyStatCodesCardTab", "ClaimSnapshotPolicyStatCodesCardTab", null, pcftest.ClaimSnapshotPolicyScreen_default.ClaimSnapshotPolicyStatCodesCardTab.class);
  }
  
  public ClaimSnapshotPolicyStatCodesLV getClaimSnapshotPolicyStatCodesLV() {
    return getOrCreateProperty("ClaimSnapshotPolicyStatCodesLV", "ClaimSnapshotPolicyStatCodesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimSnapshotPolicyStatCodesLV.class);
  }
  
  public ClaimSnapshotPolicyStatCodesLV_tb getClaimSnapshotPolicyStatCodesLV_tb() {
    return getOrCreateProperty("ClaimSnapshotPolicyStatCodesLV_tb", "ClaimSnapshotPolicyStatCodesLV_tb", null, pcftest.ClaimSnapshotPolicyScreen_default.ClaimSnapshotPolicyStatCodesLV_tb.class);
  }
  
  public ClaimSnapshotPolicyTripsCardTab getClaimSnapshotPolicyTripsCardTab() {
    return getOrCreateProperty("ClaimSnapshotPolicyTripsCardTab", "ClaimSnapshotPolicyTripsCardTab", null, pcftest.ClaimSnapshotPolicyScreen_default.ClaimSnapshotPolicyTripsCardTab.class);
  }
  
  public ClaimSnapshotPolicyTripsLV getClaimSnapshotPolicyTripsLV() {
    return getOrCreateProperty("ClaimSnapshotPolicyTripsLV", "ClaimSnapshotPolicyTripsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimSnapshotPolicyTripsLV.class);
  }
  
  public ClaimSnapshotPolicyTripsLV_tb getClaimSnapshotPolicyTripsLV_tb() {
    return getOrCreateProperty("ClaimSnapshotPolicyTripsLV_tb", "ClaimSnapshotPolicyTripsLV_tb", null, pcftest.ClaimSnapshotPolicyScreen_default.ClaimSnapshotPolicyTripsLV_tb.class);
  }
  
  public ClaimSnapshotPolicyVehiclePanelSet getClaimSnapshotPolicyVehiclePanelSet() {
    return getOrCreateProperty("ClaimSnapshotPolicyVehiclePanelSet", "ClaimSnapshotPolicyVehiclePanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.ClaimSnapshotPolicyVehiclePanelSet.class);
  }
  
  public ClaimSnapshotPolicyVehiclesCardTab getClaimSnapshotPolicyVehiclesCardTab() {
    return getOrCreateProperty("ClaimSnapshotPolicyVehiclesCardTab", "ClaimSnapshotPolicyVehiclesCardTab", null, pcftest.ClaimSnapshotPolicyScreen_default.ClaimSnapshotPolicyVehiclesCardTab.class);
  }
  
  public ClaimSnapshotPolicyVehiclesLV getClaimSnapshotPolicyVehiclesLV() {
    return getOrCreateProperty("ClaimSnapshotPolicyVehiclesLV", "ClaimSnapshotPolicyVehiclesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimSnapshotPolicyVehiclesLV.class);
  }
  
  public ClaimSnapshotPolicyVehiclesLV_tb getClaimSnapshotPolicyVehiclesLV_tb() {
    return getOrCreateProperty("ClaimSnapshotPolicyVehiclesLV_tb", "ClaimSnapshotPolicyVehiclesLV_tb", null, pcftest.ClaimSnapshotPolicyScreen_default.ClaimSnapshotPolicyVehiclesLV_tb.class);
  }
  
  public CoverageDetailTab getCoverageDetailTab() {
    return getOrCreateProperty("CoverageDetailTab", "CoverageDetailTab", null, pcftest.ClaimSnapshotPolicyScreen_default.CoverageDetailTab.class);
  }
  
  public PolicyPropertyCardTab getPolicyPropertyCardTab() {
    return getOrCreateProperty("PolicyPropertyCardTab", "PolicyPropertyCardTab", null, pcftest.ClaimSnapshotPolicyScreen_default.PolicyPropertyCardTab.class);
  }
  
  public PolicyVehicleCardTab getPolicyVehicleCardTab() {
    return getOrCreateProperty("PolicyVehicleCardTab", "PolicyVehicleCardTab", null, pcftest.ClaimSnapshotPolicyScreen_default.PolicyVehicleCardTab.class);
  }
  
  public TripCoverageLDP getTripCoverageLDP() {
    return getOrCreateProperty("TripCoverageLDP", "TripCoverageLDP", null, pcftest.ClaimSnapshotPolicyScreen_default.TripCoverageLDP.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ClaimSnapshotPolicyScreen_default._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotPolicyScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotPolicyEndorsementsCardTab extends ClickableActionElement {
    public ClaimSnapshotPolicyEndorsementsCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotPolicyScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotPolicyEndorsementsLV_tb extends PCFElement {
    public ClaimSnapshotPolicyEndorsementsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotPolicyScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotPolicyGeneralCardTab extends ClickableActionElement {
    public ClaimSnapshotPolicyGeneralCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotPolicyScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotPolicyLocationsLV_tb extends PCFElement {
    public ClaimSnapshotPolicyLocationsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotPolicyScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotPolicyLocationsScreenTab extends ClickableActionElement {
    public ClaimSnapshotPolicyLocationsScreenTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotPolicyScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotPolicyStatCodesCardTab extends ClickableActionElement {
    public ClaimSnapshotPolicyStatCodesCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotPolicyScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotPolicyStatCodesLV_tb extends PCFElement {
    public ClaimSnapshotPolicyStatCodesLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotPolicyScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotPolicyTripsCardTab extends ClickableActionElement {
    public ClaimSnapshotPolicyTripsCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotPolicyScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotPolicyTripsLV_tb extends PCFElement {
    public ClaimSnapshotPolicyTripsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotPolicyScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotPolicyVehiclesCardTab extends ClickableActionElement {
    public ClaimSnapshotPolicyVehiclesCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotPolicyScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotPolicyVehiclesLV_tb extends PCFElement {
    public ClaimSnapshotPolicyVehiclesLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotPolicyScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CoverageDetailTab extends ClickableActionElement {
    public CoverageDetailTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotPolicyScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PolicyPropertyCardTab extends ClickableActionElement {
    public PolicyPropertyCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotPolicyScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PolicyVehicleCardTab extends ClickableActionElement {
    public PolicyVehicleCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotPolicyScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TripCoverageLDP extends PCFElement {
    public TripCoverageLDP(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimSnapshotPolicyCovTermsCV_700 getClaimSnapshotPolicyCovTermsCV_700() {
      return getOrCreateProperty("ClaimSnapshotPolicyCovTermsCV_700", "ClaimSnapshotPolicyCovTermsCV", null, pcftest.ClaimSnapshotPolicyCovTermsCV_700.class);
    }
    
    public ClaimSnapshotPolicyCovTermsCV_800 getClaimSnapshotPolicyCovTermsCV_800() {
      return getOrCreateProperty("ClaimSnapshotPolicyCovTermsCV_800", "ClaimSnapshotPolicyCovTermsCV", null, pcftest.ClaimSnapshotPolicyCovTermsCV_800.class);
    }
    
    public ClaimSnapshotPolicyCovTermsCV_default getClaimSnapshotPolicyCovTermsCV_default() {
      return getOrCreateProperty("ClaimSnapshotPolicyCovTermsCV_default", "ClaimSnapshotPolicyCovTermsCV", null, pcftest.ClaimSnapshotPolicyCovTermsCV_default.class);
    }
    
    public CoveragesLV getCoveragesLV() {
      return getOrCreateProperty("CoveragesLV", "CoveragesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimSnapshotPolicyScreen_default.TripCoverageLDP.CoveragesLV.class);
    }
    
    public CoveragesLV_tb getCoveragesLV_tb() {
      return getOrCreateProperty("CoveragesLV_tb", "CoveragesLV_tb", null, pcftest.ClaimSnapshotPolicyScreen_default.TripCoverageLDP.CoveragesLV_tb.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotPolicyScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CoveragesLV extends PCFElement {
      public CoveragesLV(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public CoverageTypeHeader getCoverageTypeHeader() {
        return getOrCreateProperty("CoverageTypeHeader", "CoverageTypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyScreen_default.TripCoverageLDP.CoveragesLV.CoverageTypeHeader.class);
      }
      
      public CurrencyHeader getCurrencyHeader() {
        return getOrCreateProperty("CurrencyHeader", "CurrencyHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyScreen_default.TripCoverageLDP.CoveragesLV.CurrencyHeader.class);
      }
      
      public DeductibleHeader getDeductibleHeader() {
        return getOrCreateProperty("DeductibleHeader", "DeductibleHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyScreen_default.TripCoverageLDP.CoveragesLV.DeductibleHeader.class);
      }
      
      public ExposureLimitHeader getExposureLimitHeader() {
        return getOrCreateProperty("ExposureLimitHeader", "ExposureLimitHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyScreen_default.TripCoverageLDP.CoveragesLV.ExposureLimitHeader.class);
      }
      
      public IncidentLimitHeader getIncidentLimitHeader() {
        return getOrCreateProperty("IncidentLimitHeader", "IncidentLimitHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyScreen_default.TripCoverageLDP.CoveragesLV.IncidentLimitHeader.class);
      }
      
      public NotesHeader getNotesHeader() {
        return getOrCreateProperty("NotesHeader", "NotesHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyScreen_default.TripCoverageLDP.CoveragesLV.NotesHeader.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      @SuppressWarnings(value = "unchecked")
      public IteratorEntriesWithPaging<entry> get_Entries() {
        return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ClaimSnapshotPolicyScreen_default.TripCoverageLDP.CoveragesLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
      }
      
      public _ListPaging get_ListPaging() {
        return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ClaimSnapshotPolicyScreen_default.TripCoverageLDP.CoveragesLV._ListPaging.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotPolicyScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class CoverageTypeHeader extends ValueElement {
        public CoverageTypeHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotPolicyScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class CurrencyHeader extends ValueElement {
        public CurrencyHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotPolicyScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class DeductibleHeader extends ValueElement {
        public DeductibleHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotPolicyScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ExposureLimitHeader extends ValueElement {
        public ExposureLimitHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotPolicyScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class IncidentLimitHeader extends ValueElement {
        public IncidentLimitHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotPolicyScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class NotesHeader extends ValueElement {
        public NotesHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotPolicyScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _ListPaging extends PagingElement {
        public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotPolicyScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class entry extends RowElement {
        public entry(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public ValueElement getCoverageType() {
          return getOrCreateProperty("CoverageType", "CoverageType", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getCurrency() {
          return getOrCreateProperty("Currency", "Currency", null, gw.smoketest.platform.web.ValueElement.class);
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
        
        public _Select get_Select() {
          return getOrCreateProperty("_Select", "_Select", null, pcftest.ClaimSnapshotPolicyScreen_default.TripCoverageLDP.CoveragesLV.entry._Select.class);
        }
        
        public _ViewDetail get_ViewDetail() {
          return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ClaimSnapshotPolicyScreen_default.TripCoverageLDP.CoveragesLV.entry._ViewDetail.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotPolicyScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class _Select extends SelectorCellElement {
          public _Select(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotPolicyScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotPolicyScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CoveragesLV_tb extends PCFElement {
      public CoveragesLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotPolicyScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}