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
import pcftest.ClaimSnapshotPolicyScreen_700.ClaimSnapshotPolicyEndorsements700CardTab;
import pcftest.ClaimSnapshotPolicyScreen_700.ClaimSnapshotPolicyEndorsements700LV_tb;
import pcftest.ClaimSnapshotPolicyScreen_700.ClaimSnapshotPolicyGeneral700CardTab;
import pcftest.ClaimSnapshotPolicyScreen_700.ClaimSnapshotPolicyLocations700LV_tb;
import pcftest.ClaimSnapshotPolicyScreen_700.ClaimSnapshotPolicyLocations700ScreenTab;
import pcftest.ClaimSnapshotPolicyScreen_700.ClaimSnapshotPolicyStatCodes700CardTab;
import pcftest.ClaimSnapshotPolicyScreen_700.ClaimSnapshotPolicyStatCodes700LV_tb;
import pcftest.ClaimSnapshotPolicyScreen_700.ClaimSnapshotPolicyTrips700CardTab;
import pcftest.ClaimSnapshotPolicyScreen_700.ClaimSnapshotPolicyTrips700LV_tb;
import pcftest.ClaimSnapshotPolicyScreen_700.ClaimSnapshotPolicyVehicles700CardTab;
import pcftest.ClaimSnapshotPolicyScreen_700.ClaimSnapshotPolicyVehicles700LV_tb;
import pcftest.ClaimSnapshotPolicyScreen_700.CoverageDetailTab;
import pcftest.ClaimSnapshotPolicyScreen_700.PolicyPropertyCardTab;
import pcftest.ClaimSnapshotPolicyScreen_700.PolicyVehicleCardTab;
import pcftest.ClaimSnapshotPolicyScreen_700.TripCoverageLDP;
import pcftest.ClaimSnapshotPolicyScreen_700.TripCoverageLDP.CoveragesLV;
import pcftest.ClaimSnapshotPolicyScreen_700.TripCoverageLDP.CoveragesLV.CoverageTypeHeader;
import pcftest.ClaimSnapshotPolicyScreen_700.TripCoverageLDP.CoveragesLV.DeductibleHeader;
import pcftest.ClaimSnapshotPolicyScreen_700.TripCoverageLDP.CoveragesLV.ExposureLimitHeader;
import pcftest.ClaimSnapshotPolicyScreen_700.TripCoverageLDP.CoveragesLV.IncidentLimitHeader;
import pcftest.ClaimSnapshotPolicyScreen_700.TripCoverageLDP.CoveragesLV.NotesHeader;
import pcftest.ClaimSnapshotPolicyScreen_700.TripCoverageLDP.CoveragesLV._ListPaging;
import pcftest.ClaimSnapshotPolicyScreen_700.TripCoverageLDP.CoveragesLV.entry;
import pcftest.ClaimSnapshotPolicyScreen_700.TripCoverageLDP.CoveragesLV.entry._Select;
import pcftest.ClaimSnapshotPolicyScreen_700.TripCoverageLDP.CoveragesLV.entry._ViewDetail;
import pcftest.ClaimSnapshotPolicyScreen_700.TripCoverageLDP.CoveragesLV_tb;
import pcftest.ClaimSnapshotPolicyScreen_700._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotPolicyScreen.700.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotPolicyScreen_700 extends ClaimSnapshotPolicyScreen {
  public final static String CHECKSUM = "1bd6f14f0a81d2c3a4deb2d248bafffc";
  
  public ClaimSnapshotPolicyScreen_700(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ClaimSnapshotPolicyEndorsements700CardTab getClaimSnapshotPolicyEndorsements700CardTab() {
    return getOrCreateProperty("ClaimSnapshotPolicyEndorsements700CardTab", "ClaimSnapshotPolicyEndorsements700CardTab", null, pcftest.ClaimSnapshotPolicyScreen_700.ClaimSnapshotPolicyEndorsements700CardTab.class);
  }
  
  public ClaimSnapshotPolicyEndorsements700LV getClaimSnapshotPolicyEndorsements700LV() {
    return getOrCreateProperty("ClaimSnapshotPolicyEndorsements700LV", "ClaimSnapshotPolicyEndorsements700LV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimSnapshotPolicyEndorsements700LV.class);
  }
  
  public ClaimSnapshotPolicyEndorsements700LV_tb getClaimSnapshotPolicyEndorsements700LV_tb() {
    return getOrCreateProperty("ClaimSnapshotPolicyEndorsements700LV_tb", "ClaimSnapshotPolicyEndorsements700LV_tb", null, pcftest.ClaimSnapshotPolicyScreen_700.ClaimSnapshotPolicyEndorsements700LV_tb.class);
  }
  
  public ClaimSnapshotPolicyGeneral700CardTab getClaimSnapshotPolicyGeneral700CardTab() {
    return getOrCreateProperty("ClaimSnapshotPolicyGeneral700CardTab", "ClaimSnapshotPolicyGeneral700CardTab", null, pcftest.ClaimSnapshotPolicyScreen_700.ClaimSnapshotPolicyGeneral700CardTab.class);
  }
  
  public ClaimSnapshotPolicyGeneral700DetailPanelSet getClaimSnapshotPolicyGeneral700DetailPanelSet() {
    return getOrCreateProperty("ClaimSnapshotPolicyGeneral700DetailPanelSet", "ClaimSnapshotPolicyGeneral700DetailPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.ClaimSnapshotPolicyGeneral700DetailPanelSet.class);
  }
  
  public ClaimSnapshotPolicyLocation700PanelSet getClaimSnapshotPolicyLocation700PanelSet() {
    return getOrCreateProperty("ClaimSnapshotPolicyLocation700PanelSet", "ClaimSnapshotPolicyLocation700PanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.ClaimSnapshotPolicyLocation700PanelSet.class);
  }
  
  public ClaimSnapshotPolicyLocations700LV getClaimSnapshotPolicyLocations700LV() {
    return getOrCreateProperty("ClaimSnapshotPolicyLocations700LV", "ClaimSnapshotPolicyLocations700LV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimSnapshotPolicyLocations700LV.class);
  }
  
  public ClaimSnapshotPolicyLocations700LV_tb getClaimSnapshotPolicyLocations700LV_tb() {
    return getOrCreateProperty("ClaimSnapshotPolicyLocations700LV_tb", "ClaimSnapshotPolicyLocations700LV_tb", null, pcftest.ClaimSnapshotPolicyScreen_700.ClaimSnapshotPolicyLocations700LV_tb.class);
  }
  
  public ClaimSnapshotPolicyLocations700ScreenTab getClaimSnapshotPolicyLocations700ScreenTab() {
    return getOrCreateProperty("ClaimSnapshotPolicyLocations700ScreenTab", "ClaimSnapshotPolicyLocations700ScreenTab", null, pcftest.ClaimSnapshotPolicyScreen_700.ClaimSnapshotPolicyLocations700ScreenTab.class);
  }
  
  public ClaimSnapshotPolicyStatCodes700CardTab getClaimSnapshotPolicyStatCodes700CardTab() {
    return getOrCreateProperty("ClaimSnapshotPolicyStatCodes700CardTab", "ClaimSnapshotPolicyStatCodes700CardTab", null, pcftest.ClaimSnapshotPolicyScreen_700.ClaimSnapshotPolicyStatCodes700CardTab.class);
  }
  
  public ClaimSnapshotPolicyStatCodes700LV getClaimSnapshotPolicyStatCodes700LV() {
    return getOrCreateProperty("ClaimSnapshotPolicyStatCodes700LV", "ClaimSnapshotPolicyStatCodes700LV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimSnapshotPolicyStatCodes700LV.class);
  }
  
  public ClaimSnapshotPolicyStatCodes700LV_tb getClaimSnapshotPolicyStatCodes700LV_tb() {
    return getOrCreateProperty("ClaimSnapshotPolicyStatCodes700LV_tb", "ClaimSnapshotPolicyStatCodes700LV_tb", null, pcftest.ClaimSnapshotPolicyScreen_700.ClaimSnapshotPolicyStatCodes700LV_tb.class);
  }
  
  public ClaimSnapshotPolicyTrips700CardTab getClaimSnapshotPolicyTrips700CardTab() {
    return getOrCreateProperty("ClaimSnapshotPolicyTrips700CardTab", "ClaimSnapshotPolicyTrips700CardTab", null, pcftest.ClaimSnapshotPolicyScreen_700.ClaimSnapshotPolicyTrips700CardTab.class);
  }
  
  public ClaimSnapshotPolicyTrips700LV getClaimSnapshotPolicyTrips700LV() {
    return getOrCreateProperty("ClaimSnapshotPolicyTrips700LV", "ClaimSnapshotPolicyTrips700LV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimSnapshotPolicyTrips700LV.class);
  }
  
  public ClaimSnapshotPolicyTrips700LV_tb getClaimSnapshotPolicyTrips700LV_tb() {
    return getOrCreateProperty("ClaimSnapshotPolicyTrips700LV_tb", "ClaimSnapshotPolicyTrips700LV_tb", null, pcftest.ClaimSnapshotPolicyScreen_700.ClaimSnapshotPolicyTrips700LV_tb.class);
  }
  
  public ClaimSnapshotPolicyVehicle700PanelSet getClaimSnapshotPolicyVehicle700PanelSet() {
    return getOrCreateProperty("ClaimSnapshotPolicyVehicle700PanelSet", "ClaimSnapshotPolicyVehicle700PanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.ClaimSnapshotPolicyVehicle700PanelSet.class);
  }
  
  public ClaimSnapshotPolicyVehicles700CardTab getClaimSnapshotPolicyVehicles700CardTab() {
    return getOrCreateProperty("ClaimSnapshotPolicyVehicles700CardTab", "ClaimSnapshotPolicyVehicles700CardTab", null, pcftest.ClaimSnapshotPolicyScreen_700.ClaimSnapshotPolicyVehicles700CardTab.class);
  }
  
  public ClaimSnapshotPolicyVehicles700LV getClaimSnapshotPolicyVehicles700LV() {
    return getOrCreateProperty("ClaimSnapshotPolicyVehicles700LV", "ClaimSnapshotPolicyVehicles700LV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimSnapshotPolicyVehicles700LV.class);
  }
  
  public ClaimSnapshotPolicyVehicles700LV_tb getClaimSnapshotPolicyVehicles700LV_tb() {
    return getOrCreateProperty("ClaimSnapshotPolicyVehicles700LV_tb", "ClaimSnapshotPolicyVehicles700LV_tb", null, pcftest.ClaimSnapshotPolicyScreen_700.ClaimSnapshotPolicyVehicles700LV_tb.class);
  }
  
  public CoverageDetailTab getCoverageDetailTab() {
    return getOrCreateProperty("CoverageDetailTab", "CoverageDetailTab", null, pcftest.ClaimSnapshotPolicyScreen_700.CoverageDetailTab.class);
  }
  
  public PolicyPropertyCardTab getPolicyPropertyCardTab() {
    return getOrCreateProperty("PolicyPropertyCardTab", "PolicyPropertyCardTab", null, pcftest.ClaimSnapshotPolicyScreen_700.PolicyPropertyCardTab.class);
  }
  
  public PolicyVehicleCardTab getPolicyVehicleCardTab() {
    return getOrCreateProperty("PolicyVehicleCardTab", "PolicyVehicleCardTab", null, pcftest.ClaimSnapshotPolicyScreen_700.PolicyVehicleCardTab.class);
  }
  
  public TripCoverageLDP getTripCoverageLDP() {
    return getOrCreateProperty("TripCoverageLDP", "TripCoverageLDP", null, pcftest.ClaimSnapshotPolicyScreen_700.TripCoverageLDP.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ClaimSnapshotPolicyScreen_700._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotPolicyScreen.700.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotPolicyEndorsements700CardTab extends ClickableActionElement {
    public ClaimSnapshotPolicyEndorsements700CardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotPolicyScreen.700.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotPolicyEndorsements700LV_tb extends PCFElement {
    public ClaimSnapshotPolicyEndorsements700LV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotPolicyScreen.700.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotPolicyGeneral700CardTab extends ClickableActionElement {
    public ClaimSnapshotPolicyGeneral700CardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotPolicyScreen.700.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotPolicyLocations700LV_tb extends PCFElement {
    public ClaimSnapshotPolicyLocations700LV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotPolicyScreen.700.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotPolicyLocations700ScreenTab extends ClickableActionElement {
    public ClaimSnapshotPolicyLocations700ScreenTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotPolicyScreen.700.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotPolicyStatCodes700CardTab extends ClickableActionElement {
    public ClaimSnapshotPolicyStatCodes700CardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotPolicyScreen.700.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotPolicyStatCodes700LV_tb extends PCFElement {
    public ClaimSnapshotPolicyStatCodes700LV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotPolicyScreen.700.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotPolicyTrips700CardTab extends ClickableActionElement {
    public ClaimSnapshotPolicyTrips700CardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotPolicyScreen.700.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotPolicyTrips700LV_tb extends PCFElement {
    public ClaimSnapshotPolicyTrips700LV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotPolicyScreen.700.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotPolicyVehicles700CardTab extends ClickableActionElement {
    public ClaimSnapshotPolicyVehicles700CardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotPolicyScreen.700.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotPolicyVehicles700LV_tb extends PCFElement {
    public ClaimSnapshotPolicyVehicles700LV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotPolicyScreen.700.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CoverageDetailTab extends ClickableActionElement {
    public CoverageDetailTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotPolicyScreen.700.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PolicyPropertyCardTab extends ClickableActionElement {
    public PolicyPropertyCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotPolicyScreen.700.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PolicyVehicleCardTab extends ClickableActionElement {
    public PolicyVehicleCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotPolicyScreen.700.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
      return getOrCreateProperty("CoveragesLV", "CoveragesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimSnapshotPolicyScreen_700.TripCoverageLDP.CoveragesLV.class);
    }
    
    public CoveragesLV_tb getCoveragesLV_tb() {
      return getOrCreateProperty("CoveragesLV_tb", "CoveragesLV_tb", null, pcftest.ClaimSnapshotPolicyScreen_700.TripCoverageLDP.CoveragesLV_tb.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotPolicyScreen.700.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CoveragesLV extends PCFElement {
      public CoveragesLV(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public CoverageTypeHeader getCoverageTypeHeader() {
        return getOrCreateProperty("CoverageTypeHeader", "CoverageTypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyScreen_700.TripCoverageLDP.CoveragesLV.CoverageTypeHeader.class);
      }
      
      public DeductibleHeader getDeductibleHeader() {
        return getOrCreateProperty("DeductibleHeader", "DeductibleHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyScreen_700.TripCoverageLDP.CoveragesLV.DeductibleHeader.class);
      }
      
      public ExposureLimitHeader getExposureLimitHeader() {
        return getOrCreateProperty("ExposureLimitHeader", "ExposureLimitHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyScreen_700.TripCoverageLDP.CoveragesLV.ExposureLimitHeader.class);
      }
      
      public IncidentLimitHeader getIncidentLimitHeader() {
        return getOrCreateProperty("IncidentLimitHeader", "IncidentLimitHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyScreen_700.TripCoverageLDP.CoveragesLV.IncidentLimitHeader.class);
      }
      
      public NotesHeader getNotesHeader() {
        return getOrCreateProperty("NotesHeader", "NotesHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyScreen_700.TripCoverageLDP.CoveragesLV.NotesHeader.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      @SuppressWarnings(value = "unchecked")
      public IteratorEntriesWithPaging<entry> get_Entries() {
        return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ClaimSnapshotPolicyScreen_700.TripCoverageLDP.CoveragesLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
      }
      
      public _ListPaging get_ListPaging() {
        return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ClaimSnapshotPolicyScreen_700.TripCoverageLDP.CoveragesLV._ListPaging.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotPolicyScreen.700.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class CoverageTypeHeader extends ValueElement {
        public CoverageTypeHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotPolicyScreen.700.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class DeductibleHeader extends ValueElement {
        public DeductibleHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotPolicyScreen.700.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ExposureLimitHeader extends ValueElement {
        public ExposureLimitHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotPolicyScreen.700.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class IncidentLimitHeader extends ValueElement {
        public IncidentLimitHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotPolicyScreen.700.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class NotesHeader extends ValueElement {
        public NotesHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotPolicyScreen.700.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _ListPaging extends PagingElement {
        public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotPolicyScreen.700.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
        
        public _Select get_Select() {
          return getOrCreateProperty("_Select", "_Select", null, pcftest.ClaimSnapshotPolicyScreen_700.TripCoverageLDP.CoveragesLV.entry._Select.class);
        }
        
        public _ViewDetail get_ViewDetail() {
          return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ClaimSnapshotPolicyScreen_700.TripCoverageLDP.CoveragesLV.entry._ViewDetail.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotPolicyScreen.700.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class _Select extends SelectorCellElement {
          public _Select(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotPolicyScreen.700.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotPolicyScreen.700.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CoveragesLV_tb extends PCFElement {
      public CoveragesLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotPolicyScreen.700.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}