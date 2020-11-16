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
import pcftest.ClaimSnapshotPolicyScreen_800.ClaimSnapshotPolicyEndorsements800CardTab;
import pcftest.ClaimSnapshotPolicyScreen_800.ClaimSnapshotPolicyEndorsements800LV_tb;
import pcftest.ClaimSnapshotPolicyScreen_800.ClaimSnapshotPolicyGeneral800CardTab;
import pcftest.ClaimSnapshotPolicyScreen_800.ClaimSnapshotPolicyLocations800LV_tb;
import pcftest.ClaimSnapshotPolicyScreen_800.ClaimSnapshotPolicyLocations800ScreenTab;
import pcftest.ClaimSnapshotPolicyScreen_800.ClaimSnapshotPolicyStatCodes800CardTab;
import pcftest.ClaimSnapshotPolicyScreen_800.ClaimSnapshotPolicyStatCodes800LV_tb;
import pcftest.ClaimSnapshotPolicyScreen_800.ClaimSnapshotPolicyTrips800CardTab;
import pcftest.ClaimSnapshotPolicyScreen_800.ClaimSnapshotPolicyTrips800LV_tb;
import pcftest.ClaimSnapshotPolicyScreen_800.ClaimSnapshotPolicyVehicles800CardTab;
import pcftest.ClaimSnapshotPolicyScreen_800.ClaimSnapshotPolicyVehicles800LV_tb;
import pcftest.ClaimSnapshotPolicyScreen_800.CoverageDetailTab;
import pcftest.ClaimSnapshotPolicyScreen_800.PolicyPropertyCardTab;
import pcftest.ClaimSnapshotPolicyScreen_800.PolicyVehicleCardTab;
import pcftest.ClaimSnapshotPolicyScreen_800.TripCoverageLDP;
import pcftest.ClaimSnapshotPolicyScreen_800.TripCoverageLDP.CoveragesLV;
import pcftest.ClaimSnapshotPolicyScreen_800.TripCoverageLDP.CoveragesLV.CoverageTypeHeader;
import pcftest.ClaimSnapshotPolicyScreen_800.TripCoverageLDP.CoveragesLV.CurrencyHeader;
import pcftest.ClaimSnapshotPolicyScreen_800.TripCoverageLDP.CoveragesLV.DeductibleHeader;
import pcftest.ClaimSnapshotPolicyScreen_800.TripCoverageLDP.CoveragesLV.ExposureLimitHeader;
import pcftest.ClaimSnapshotPolicyScreen_800.TripCoverageLDP.CoveragesLV.IncidentLimitHeader;
import pcftest.ClaimSnapshotPolicyScreen_800.TripCoverageLDP.CoveragesLV.NotesHeader;
import pcftest.ClaimSnapshotPolicyScreen_800.TripCoverageLDP.CoveragesLV._ListPaging;
import pcftest.ClaimSnapshotPolicyScreen_800.TripCoverageLDP.CoveragesLV.entry;
import pcftest.ClaimSnapshotPolicyScreen_800.TripCoverageLDP.CoveragesLV.entry._Select;
import pcftest.ClaimSnapshotPolicyScreen_800.TripCoverageLDP.CoveragesLV.entry._ViewDetail;
import pcftest.ClaimSnapshotPolicyScreen_800.TripCoverageLDP.CoveragesLV_tb;
import pcftest.ClaimSnapshotPolicyScreen_800._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotPolicyScreen.800.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotPolicyScreen_800 extends ClaimSnapshotPolicyScreen {
  public final static String CHECKSUM = "fbf10fcd9ec66a12d938b5c1d175717e";
  
  public ClaimSnapshotPolicyScreen_800(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ClaimSnapshotPolicyEndorsements800CardTab getClaimSnapshotPolicyEndorsements800CardTab() {
    return getOrCreateProperty("ClaimSnapshotPolicyEndorsements800CardTab", "ClaimSnapshotPolicyEndorsements800CardTab", null, pcftest.ClaimSnapshotPolicyScreen_800.ClaimSnapshotPolicyEndorsements800CardTab.class);
  }
  
  public ClaimSnapshotPolicyEndorsements800LV getClaimSnapshotPolicyEndorsements800LV() {
    return getOrCreateProperty("ClaimSnapshotPolicyEndorsements800LV", "ClaimSnapshotPolicyEndorsements800LV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimSnapshotPolicyEndorsements800LV.class);
  }
  
  public ClaimSnapshotPolicyEndorsements800LV_tb getClaimSnapshotPolicyEndorsements800LV_tb() {
    return getOrCreateProperty("ClaimSnapshotPolicyEndorsements800LV_tb", "ClaimSnapshotPolicyEndorsements800LV_tb", null, pcftest.ClaimSnapshotPolicyScreen_800.ClaimSnapshotPolicyEndorsements800LV_tb.class);
  }
  
  public ClaimSnapshotPolicyGeneral800CardTab getClaimSnapshotPolicyGeneral800CardTab() {
    return getOrCreateProperty("ClaimSnapshotPolicyGeneral800CardTab", "ClaimSnapshotPolicyGeneral800CardTab", null, pcftest.ClaimSnapshotPolicyScreen_800.ClaimSnapshotPolicyGeneral800CardTab.class);
  }
  
  public ClaimSnapshotPolicyGeneral800DetailPanelSet getClaimSnapshotPolicyGeneral800DetailPanelSet() {
    return getOrCreateProperty("ClaimSnapshotPolicyGeneral800DetailPanelSet", "ClaimSnapshotPolicyGeneral800DetailPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.ClaimSnapshotPolicyGeneral800DetailPanelSet.class);
  }
  
  public ClaimSnapshotPolicyLocation800PanelSet getClaimSnapshotPolicyLocation800PanelSet() {
    return getOrCreateProperty("ClaimSnapshotPolicyLocation800PanelSet", "ClaimSnapshotPolicyLocation800PanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.ClaimSnapshotPolicyLocation800PanelSet.class);
  }
  
  public ClaimSnapshotPolicyLocations800LV getClaimSnapshotPolicyLocations800LV() {
    return getOrCreateProperty("ClaimSnapshotPolicyLocations800LV", "ClaimSnapshotPolicyLocations800LV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimSnapshotPolicyLocations800LV.class);
  }
  
  public ClaimSnapshotPolicyLocations800LV_tb getClaimSnapshotPolicyLocations800LV_tb() {
    return getOrCreateProperty("ClaimSnapshotPolicyLocations800LV_tb", "ClaimSnapshotPolicyLocations800LV_tb", null, pcftest.ClaimSnapshotPolicyScreen_800.ClaimSnapshotPolicyLocations800LV_tb.class);
  }
  
  public ClaimSnapshotPolicyLocations800ScreenTab getClaimSnapshotPolicyLocations800ScreenTab() {
    return getOrCreateProperty("ClaimSnapshotPolicyLocations800ScreenTab", "ClaimSnapshotPolicyLocations800ScreenTab", null, pcftest.ClaimSnapshotPolicyScreen_800.ClaimSnapshotPolicyLocations800ScreenTab.class);
  }
  
  public ClaimSnapshotPolicyStatCodes800CardTab getClaimSnapshotPolicyStatCodes800CardTab() {
    return getOrCreateProperty("ClaimSnapshotPolicyStatCodes800CardTab", "ClaimSnapshotPolicyStatCodes800CardTab", null, pcftest.ClaimSnapshotPolicyScreen_800.ClaimSnapshotPolicyStatCodes800CardTab.class);
  }
  
  public ClaimSnapshotPolicyStatCodes800LV getClaimSnapshotPolicyStatCodes800LV() {
    return getOrCreateProperty("ClaimSnapshotPolicyStatCodes800LV", "ClaimSnapshotPolicyStatCodes800LV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimSnapshotPolicyStatCodes800LV.class);
  }
  
  public ClaimSnapshotPolicyStatCodes800LV_tb getClaimSnapshotPolicyStatCodes800LV_tb() {
    return getOrCreateProperty("ClaimSnapshotPolicyStatCodes800LV_tb", "ClaimSnapshotPolicyStatCodes800LV_tb", null, pcftest.ClaimSnapshotPolicyScreen_800.ClaimSnapshotPolicyStatCodes800LV_tb.class);
  }
  
  public ClaimSnapshotPolicyTrips800CardTab getClaimSnapshotPolicyTrips800CardTab() {
    return getOrCreateProperty("ClaimSnapshotPolicyTrips800CardTab", "ClaimSnapshotPolicyTrips800CardTab", null, pcftest.ClaimSnapshotPolicyScreen_800.ClaimSnapshotPolicyTrips800CardTab.class);
  }
  
  public ClaimSnapshotPolicyTrips800LV getClaimSnapshotPolicyTrips800LV() {
    return getOrCreateProperty("ClaimSnapshotPolicyTrips800LV", "ClaimSnapshotPolicyTrips800LV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimSnapshotPolicyTrips800LV.class);
  }
  
  public ClaimSnapshotPolicyTrips800LV_tb getClaimSnapshotPolicyTrips800LV_tb() {
    return getOrCreateProperty("ClaimSnapshotPolicyTrips800LV_tb", "ClaimSnapshotPolicyTrips800LV_tb", null, pcftest.ClaimSnapshotPolicyScreen_800.ClaimSnapshotPolicyTrips800LV_tb.class);
  }
  
  public ClaimSnapshotPolicyVehicle800PanelSet getClaimSnapshotPolicyVehicle800PanelSet() {
    return getOrCreateProperty("ClaimSnapshotPolicyVehicle800PanelSet", "ClaimSnapshotPolicyVehicle800PanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.ClaimSnapshotPolicyVehicle800PanelSet.class);
  }
  
  public ClaimSnapshotPolicyVehicles800CardTab getClaimSnapshotPolicyVehicles800CardTab() {
    return getOrCreateProperty("ClaimSnapshotPolicyVehicles800CardTab", "ClaimSnapshotPolicyVehicles800CardTab", null, pcftest.ClaimSnapshotPolicyScreen_800.ClaimSnapshotPolicyVehicles800CardTab.class);
  }
  
  public ClaimSnapshotPolicyVehicles800LV getClaimSnapshotPolicyVehicles800LV() {
    return getOrCreateProperty("ClaimSnapshotPolicyVehicles800LV", "ClaimSnapshotPolicyVehicles800LV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimSnapshotPolicyVehicles800LV.class);
  }
  
  public ClaimSnapshotPolicyVehicles800LV_tb getClaimSnapshotPolicyVehicles800LV_tb() {
    return getOrCreateProperty("ClaimSnapshotPolicyVehicles800LV_tb", "ClaimSnapshotPolicyVehicles800LV_tb", null, pcftest.ClaimSnapshotPolicyScreen_800.ClaimSnapshotPolicyVehicles800LV_tb.class);
  }
  
  public CoverageDetailTab getCoverageDetailTab() {
    return getOrCreateProperty("CoverageDetailTab", "CoverageDetailTab", null, pcftest.ClaimSnapshotPolicyScreen_800.CoverageDetailTab.class);
  }
  
  public PolicyPropertyCardTab getPolicyPropertyCardTab() {
    return getOrCreateProperty("PolicyPropertyCardTab", "PolicyPropertyCardTab", null, pcftest.ClaimSnapshotPolicyScreen_800.PolicyPropertyCardTab.class);
  }
  
  public PolicyVehicleCardTab getPolicyVehicleCardTab() {
    return getOrCreateProperty("PolicyVehicleCardTab", "PolicyVehicleCardTab", null, pcftest.ClaimSnapshotPolicyScreen_800.PolicyVehicleCardTab.class);
  }
  
  public TripCoverageLDP getTripCoverageLDP() {
    return getOrCreateProperty("TripCoverageLDP", "TripCoverageLDP", null, pcftest.ClaimSnapshotPolicyScreen_800.TripCoverageLDP.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ClaimSnapshotPolicyScreen_800._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotPolicyScreen.800.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotPolicyEndorsements800CardTab extends ClickableActionElement {
    public ClaimSnapshotPolicyEndorsements800CardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotPolicyScreen.800.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotPolicyEndorsements800LV_tb extends PCFElement {
    public ClaimSnapshotPolicyEndorsements800LV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotPolicyScreen.800.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotPolicyGeneral800CardTab extends ClickableActionElement {
    public ClaimSnapshotPolicyGeneral800CardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotPolicyScreen.800.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotPolicyLocations800LV_tb extends PCFElement {
    public ClaimSnapshotPolicyLocations800LV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotPolicyScreen.800.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotPolicyLocations800ScreenTab extends ClickableActionElement {
    public ClaimSnapshotPolicyLocations800ScreenTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotPolicyScreen.800.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotPolicyStatCodes800CardTab extends ClickableActionElement {
    public ClaimSnapshotPolicyStatCodes800CardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotPolicyScreen.800.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotPolicyStatCodes800LV_tb extends PCFElement {
    public ClaimSnapshotPolicyStatCodes800LV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotPolicyScreen.800.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotPolicyTrips800CardTab extends ClickableActionElement {
    public ClaimSnapshotPolicyTrips800CardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotPolicyScreen.800.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotPolicyTrips800LV_tb extends PCFElement {
    public ClaimSnapshotPolicyTrips800LV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotPolicyScreen.800.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotPolicyVehicles800CardTab extends ClickableActionElement {
    public ClaimSnapshotPolicyVehicles800CardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotPolicyScreen.800.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotPolicyVehicles800LV_tb extends PCFElement {
    public ClaimSnapshotPolicyVehicles800LV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotPolicyScreen.800.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CoverageDetailTab extends ClickableActionElement {
    public CoverageDetailTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotPolicyScreen.800.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PolicyPropertyCardTab extends ClickableActionElement {
    public PolicyPropertyCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotPolicyScreen.800.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PolicyVehicleCardTab extends ClickableActionElement {
    public PolicyVehicleCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotPolicyScreen.800.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
      return getOrCreateProperty("CoveragesLV", "CoveragesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimSnapshotPolicyScreen_800.TripCoverageLDP.CoveragesLV.class);
    }
    
    public CoveragesLV_tb getCoveragesLV_tb() {
      return getOrCreateProperty("CoveragesLV_tb", "CoveragesLV_tb", null, pcftest.ClaimSnapshotPolicyScreen_800.TripCoverageLDP.CoveragesLV_tb.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotPolicyScreen.800.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CoveragesLV extends PCFElement {
      public CoveragesLV(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public CoverageTypeHeader getCoverageTypeHeader() {
        return getOrCreateProperty("CoverageTypeHeader", "CoverageTypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyScreen_800.TripCoverageLDP.CoveragesLV.CoverageTypeHeader.class);
      }
      
      public CurrencyHeader getCurrencyHeader() {
        return getOrCreateProperty("CurrencyHeader", "CurrencyHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyScreen_800.TripCoverageLDP.CoveragesLV.CurrencyHeader.class);
      }
      
      public DeductibleHeader getDeductibleHeader() {
        return getOrCreateProperty("DeductibleHeader", "DeductibleHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyScreen_800.TripCoverageLDP.CoveragesLV.DeductibleHeader.class);
      }
      
      public ExposureLimitHeader getExposureLimitHeader() {
        return getOrCreateProperty("ExposureLimitHeader", "ExposureLimitHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyScreen_800.TripCoverageLDP.CoveragesLV.ExposureLimitHeader.class);
      }
      
      public IncidentLimitHeader getIncidentLimitHeader() {
        return getOrCreateProperty("IncidentLimitHeader", "IncidentLimitHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyScreen_800.TripCoverageLDP.CoveragesLV.IncidentLimitHeader.class);
      }
      
      public NotesHeader getNotesHeader() {
        return getOrCreateProperty("NotesHeader", "NotesHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyScreen_800.TripCoverageLDP.CoveragesLV.NotesHeader.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      @SuppressWarnings(value = "unchecked")
      public IteratorEntriesWithPaging<entry> get_Entries() {
        return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ClaimSnapshotPolicyScreen_800.TripCoverageLDP.CoveragesLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
      }
      
      public _ListPaging get_ListPaging() {
        return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ClaimSnapshotPolicyScreen_800.TripCoverageLDP.CoveragesLV._ListPaging.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotPolicyScreen.800.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class CoverageTypeHeader extends ValueElement {
        public CoverageTypeHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotPolicyScreen.800.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class CurrencyHeader extends ValueElement {
        public CurrencyHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotPolicyScreen.800.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class DeductibleHeader extends ValueElement {
        public DeductibleHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotPolicyScreen.800.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ExposureLimitHeader extends ValueElement {
        public ExposureLimitHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotPolicyScreen.800.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class IncidentLimitHeader extends ValueElement {
        public IncidentLimitHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotPolicyScreen.800.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class NotesHeader extends ValueElement {
        public NotesHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotPolicyScreen.800.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _ListPaging extends PagingElement {
        public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotPolicyScreen.800.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
          return getOrCreateProperty("_Select", "_Select", null, pcftest.ClaimSnapshotPolicyScreen_800.TripCoverageLDP.CoveragesLV.entry._Select.class);
        }
        
        public _ViewDetail get_ViewDetail() {
          return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ClaimSnapshotPolicyScreen_800.TripCoverageLDP.CoveragesLV.entry._ViewDetail.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotPolicyScreen.800.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class _Select extends SelectorCellElement {
          public _Select(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotPolicyScreen.800.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotPolicyScreen.800.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CoveragesLV_tb extends PCFElement {
      public CoveragesLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotPolicyScreen.800.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}