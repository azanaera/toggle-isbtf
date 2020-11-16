package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.CheckboxValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.IteratorEntriesWithPaging;
import gw.smoketest.platform.web.IteratorEntryCheckboxElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.PagingElement;
import gw.smoketest.platform.web.RowElement;
import gw.smoketest.platform.web.SelectorCellElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ClaimSnapshotPolicyLocation800PanelSet.ClaimSnapshotPolicyLocation800LDP;
import pcftest.ClaimSnapshotPolicyLocation800PanelSet.ClaimSnapshotPolicyLocation800LDP.CoveragesLV;
import pcftest.ClaimSnapshotPolicyLocation800PanelSet.ClaimSnapshotPolicyLocation800LDP.CoveragesLV.CoinsuranceHeader;
import pcftest.ClaimSnapshotPolicyLocation800PanelSet.ClaimSnapshotPolicyLocation800LDP.CoveragesLV.CoverageBasisHeader;
import pcftest.ClaimSnapshotPolicyLocation800PanelSet.ClaimSnapshotPolicyLocation800LDP.CoveragesLV.CoverageNotesHeader;
import pcftest.ClaimSnapshotPolicyLocation800PanelSet.ClaimSnapshotPolicyLocation800LDP.CoveragesLV.CoverageTypeHeader;
import pcftest.ClaimSnapshotPolicyLocation800PanelSet.ClaimSnapshotPolicyLocation800LDP.CoveragesLV.CurrencyHeader;
import pcftest.ClaimSnapshotPolicyLocation800PanelSet.ClaimSnapshotPolicyLocation800LDP.CoveragesLV.DeductibleHeader;
import pcftest.ClaimSnapshotPolicyLocation800PanelSet.ClaimSnapshotPolicyLocation800LDP.CoveragesLV.ExposureLimitHeader;
import pcftest.ClaimSnapshotPolicyLocation800PanelSet.ClaimSnapshotPolicyLocation800LDP.CoveragesLV.IncidentLimitHeader;
import pcftest.ClaimSnapshotPolicyLocation800PanelSet.ClaimSnapshotPolicyLocation800LDP.CoveragesLV.LimitsIndicatorHeader;
import pcftest.ClaimSnapshotPolicyLocation800PanelSet.ClaimSnapshotPolicyLocation800LDP.CoveragesLV_tb;
import pcftest.ClaimSnapshotPolicyLocation800PanelSet.LocationCoveragesTab;
import pcftest.ClaimSnapshotPolicyLocation800PanelSet.RUSnapshotDV;
import pcftest.ClaimSnapshotPolicyLocation800PanelSet.RUSnapshotDV.ClassCodeInputGroup;
import pcftest.ClaimSnapshotPolicyLocation800PanelSet.RUSnapshotDV.ClassCodeInputGroup.ClassCodeInputSet;
import pcftest.ClaimSnapshotPolicyLocation800PanelSet.RUSnapshotDV.LienholdersLV;
import pcftest.ClaimSnapshotPolicyLocation800PanelSet.RUSnapshotDV.LienholdersLV.LienholderHeader;
import pcftest.ClaimSnapshotPolicyLocation800PanelSet.RUSnapshotDV.LienholdersLV.OwnerTypeHeader;
import pcftest.ClaimSnapshotPolicyLocation800PanelSet.RUSnapshotDV.LienholdersLV_tb;
import pcftest.ClaimSnapshotPolicyLocation800PanelSet.RUSnapshotLV;
import pcftest.ClaimSnapshotPolicyLocation800PanelSet.RUSnapshotLV.BuildingNumberHeader;
import pcftest.ClaimSnapshotPolicyLocation800PanelSet.RUSnapshotLV.LienholdersHeader;
import pcftest.ClaimSnapshotPolicyLocation800PanelSet.RUSnapshotLV.RUDescriptionHeader;
import pcftest.ClaimSnapshotPolicyLocation800PanelSet.RUSnapshotLV.RUNumberHeader;
import pcftest.ClaimSnapshotPolicyLocation800PanelSet.RUSnapshotLV.RUTypeHeader;
import pcftest.ClaimSnapshotPolicyLocation800PanelSet.RUSnapshotLV_tb;
import pcftest.ClaimSnapshotPolicyLocation800PanelSet.RiskDetailTab;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotPolicyLocation800PanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotPolicyLocation800PanelSet extends PCFElement {
  public final static String CHECKSUM = "6d2e5eee71552e017804ad7cae88b609";
  
  public ClaimSnapshotPolicyLocation800PanelSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ClaimSnapshotPolicyLocation800LDP getClaimSnapshotPolicyLocation800LDP() {
    return getOrCreateProperty("ClaimSnapshotPolicyLocation800LDP", "ClaimSnapshotPolicyLocation800LDP", null, pcftest.ClaimSnapshotPolicyLocation800PanelSet.ClaimSnapshotPolicyLocation800LDP.class);
  }
  
  public LocationCoveragesTab getLocationCoveragesTab() {
    return getOrCreateProperty("LocationCoveragesTab", "LocationCoveragesTab", null, pcftest.ClaimSnapshotPolicyLocation800PanelSet.LocationCoveragesTab.class);
  }
  
  public RUSnapshotDV getRUSnapshotDV() {
    return getOrCreateProperty("RUSnapshotDV", "RUSnapshotDV", null, pcftest.ClaimSnapshotPolicyLocation800PanelSet.RUSnapshotDV.class);
  }
  
  public RUSnapshotLV getRUSnapshotLV() {
    return getOrCreateProperty("RUSnapshotLV", "RUSnapshotLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimSnapshotPolicyLocation800PanelSet.RUSnapshotLV.class);
  }
  
  public RUSnapshotLV_tb getRUSnapshotLV_tb() {
    return getOrCreateProperty("RUSnapshotLV_tb", "RUSnapshotLV_tb", null, pcftest.ClaimSnapshotPolicyLocation800PanelSet.RUSnapshotLV_tb.class);
  }
  
  public RiskDetailTab getRiskDetailTab() {
    return getOrCreateProperty("RiskDetailTab", "RiskDetailTab", null, pcftest.ClaimSnapshotPolicyLocation800PanelSet.RiskDetailTab.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotPolicyLocation800PanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotPolicyLocation800LDP extends PCFElement {
    public ClaimSnapshotPolicyLocation800LDP(ISmokeTest helper, PCFElementId componentId)  {
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
      return getOrCreateProperty("CoveragesLV", "CoveragesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimSnapshotPolicyLocation800PanelSet.ClaimSnapshotPolicyLocation800LDP.CoveragesLV.class);
    }
    
    public CoveragesLV_tb getCoveragesLV_tb() {
      return getOrCreateProperty("CoveragesLV_tb", "CoveragesLV_tb", null, pcftest.ClaimSnapshotPolicyLocation800PanelSet.ClaimSnapshotPolicyLocation800LDP.CoveragesLV_tb.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotPolicyLocation800PanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CoveragesLV extends PCFElement {
      public CoveragesLV(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public CoinsuranceHeader getCoinsuranceHeader() {
        return getOrCreateProperty("CoinsuranceHeader", "CoinsuranceHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyLocation800PanelSet.ClaimSnapshotPolicyLocation800LDP.CoveragesLV.CoinsuranceHeader.class);
      }
      
      public CoverageBasisHeader getCoverageBasisHeader() {
        return getOrCreateProperty("CoverageBasisHeader", "CoverageBasisHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyLocation800PanelSet.ClaimSnapshotPolicyLocation800LDP.CoveragesLV.CoverageBasisHeader.class);
      }
      
      public CoverageNotesHeader getCoverageNotesHeader() {
        return getOrCreateProperty("CoverageNotesHeader", "CoverageNotesHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyLocation800PanelSet.ClaimSnapshotPolicyLocation800LDP.CoveragesLV.CoverageNotesHeader.class);
      }
      
      public CoverageTypeHeader getCoverageTypeHeader() {
        return getOrCreateProperty("CoverageTypeHeader", "CoverageTypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyLocation800PanelSet.ClaimSnapshotPolicyLocation800LDP.CoveragesLV.CoverageTypeHeader.class);
      }
      
      public CurrencyHeader getCurrencyHeader() {
        return getOrCreateProperty("CurrencyHeader", "CurrencyHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyLocation800PanelSet.ClaimSnapshotPolicyLocation800LDP.CoveragesLV.CurrencyHeader.class);
      }
      
      public DeductibleHeader getDeductibleHeader() {
        return getOrCreateProperty("DeductibleHeader", "DeductibleHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyLocation800PanelSet.ClaimSnapshotPolicyLocation800LDP.CoveragesLV.DeductibleHeader.class);
      }
      
      public ExposureLimitHeader getExposureLimitHeader() {
        return getOrCreateProperty("ExposureLimitHeader", "ExposureLimitHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyLocation800PanelSet.ClaimSnapshotPolicyLocation800LDP.CoveragesLV.ExposureLimitHeader.class);
      }
      
      public IncidentLimitHeader getIncidentLimitHeader() {
        return getOrCreateProperty("IncidentLimitHeader", "IncidentLimitHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyLocation800PanelSet.ClaimSnapshotPolicyLocation800LDP.CoveragesLV.IncidentLimitHeader.class);
      }
      
      public LimitsIndicatorHeader getLimitsIndicatorHeader() {
        return getOrCreateProperty("LimitsIndicatorHeader", "LimitsIndicatorHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyLocation800PanelSet.ClaimSnapshotPolicyLocation800LDP.CoveragesLV.LimitsIndicatorHeader.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      @SuppressWarnings(value = "unchecked")
      public IteratorEntriesWithPaging<pcftest.ClaimSnapshotPolicyLocation800PanelSet.ClaimSnapshotPolicyLocation800LDP.CoveragesLV.entry> get_Entries() {
        return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ClaimSnapshotPolicyLocation800PanelSet.ClaimSnapshotPolicyLocation800LDP.CoveragesLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
      }
      
      public pcftest.ClaimSnapshotPolicyLocation800PanelSet.ClaimSnapshotPolicyLocation800LDP.CoveragesLV._ListPaging get_ListPaging() {
        return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ClaimSnapshotPolicyLocation800PanelSet.ClaimSnapshotPolicyLocation800LDP.CoveragesLV._ListPaging.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotPolicyLocation800PanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class CoinsuranceHeader extends ValueElement {
        public CoinsuranceHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotPolicyLocation800PanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class CoverageBasisHeader extends ValueElement {
        public CoverageBasisHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotPolicyLocation800PanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class CoverageNotesHeader extends ValueElement {
        public CoverageNotesHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotPolicyLocation800PanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class CoverageTypeHeader extends ValueElement {
        public CoverageTypeHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotPolicyLocation800PanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class CurrencyHeader extends ValueElement {
        public CurrencyHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotPolicyLocation800PanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class DeductibleHeader extends ValueElement {
        public DeductibleHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotPolicyLocation800PanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ExposureLimitHeader extends ValueElement {
        public ExposureLimitHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotPolicyLocation800PanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class IncidentLimitHeader extends ValueElement {
        public IncidentLimitHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotPolicyLocation800PanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class LimitsIndicatorHeader extends ValueElement {
        public LimitsIndicatorHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotPolicyLocation800PanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _ListPaging extends PagingElement {
        public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotPolicyLocation800PanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class entry extends RowElement {
        public entry(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public ValueElement getCoinsurance() {
          return getOrCreateProperty("Coinsurance", "Coinsurance", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getCoverageBasis() {
          return getOrCreateProperty("CoverageBasis", "CoverageBasis", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getCoverageNotes() {
          return getOrCreateProperty("CoverageNotes", "CoverageNotes", null, gw.smoketest.platform.web.ValueElement.class);
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
        
        public ValueElement getLimitsIndicator() {
          return getOrCreateProperty("LimitsIndicator", "LimitsIndicator", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public IteratorEntryCheckboxElement get_Checkbox() {
          return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
        }
        
        public pcftest.ClaimSnapshotPolicyLocation800PanelSet.ClaimSnapshotPolicyLocation800LDP.CoveragesLV.entry._Select get_Select() {
          return getOrCreateProperty("_Select", "_Select", null, pcftest.ClaimSnapshotPolicyLocation800PanelSet.ClaimSnapshotPolicyLocation800LDP.CoveragesLV.entry._Select.class);
        }
        
        public pcftest.ClaimSnapshotPolicyLocation800PanelSet.ClaimSnapshotPolicyLocation800LDP.CoveragesLV.entry._ViewDetail get_ViewDetail() {
          return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ClaimSnapshotPolicyLocation800PanelSet.ClaimSnapshotPolicyLocation800LDP.CoveragesLV.entry._ViewDetail.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotPolicyLocation800PanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class _Select extends SelectorCellElement {
          public _Select(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotPolicyLocation800PanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotPolicyLocation800PanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CoveragesLV_tb extends PCFElement {
      public CoveragesLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotPolicyLocation800PanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LocationCoveragesTab extends ClickableActionElement {
    public LocationCoveragesTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotPolicyLocation800PanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RUSnapshotDV extends DetailViewElement {
    public RUSnapshotDV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getBuildingNumber() {
      return getOrCreateProperty("BuildingNumber", "BuildingNumber", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ClassCodeInputGroup getClassCodeInputGroup() {
      return getOrCreateProperty("ClassCodeInputGroup", "ClassCodeInputGroup", null, pcftest.ClaimSnapshotPolicyLocation800PanelSet.RUSnapshotDV.ClassCodeInputGroup.class);
    }
    
    public ValueElement getDescription() {
      return getOrCreateProperty("Description", "Description", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public LienholdersLV getLienholdersLV() {
      return getOrCreateProperty("LienholdersLV", "LienholdersLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimSnapshotPolicyLocation800PanelSet.RUSnapshotDV.LienholdersLV.class);
    }
    
    public LienholdersLV_tb getLienholdersLV_tb() {
      return getOrCreateProperty("LienholdersLV_tb", "LienholdersLV_tb", null, pcftest.ClaimSnapshotPolicyLocation800PanelSet.RUSnapshotDV.LienholdersLV_tb.class);
    }
    
    public ValueElement getNotes() {
      return getOrCreateProperty("Notes", "Notes", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getNumber() {
      return getOrCreateProperty("Number", "Number", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getOtherRiskType() {
      return getOrCreateProperty("OtherRiskType", "OtherRiskType", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotPolicyLocation800PanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClassCodeInputGroup extends PCFElement {
      public ClassCodeInputGroup(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ClassCodeInputSet getClassCodeInputSet() {
        return getOrCreateProperty("ClassCodeInputSet", "ClassCodeInputSet", null, pcftest.ClaimSnapshotPolicyLocation800PanelSet.RUSnapshotDV.ClassCodeInputGroup.ClassCodeInputSet.class);
      }
      
      public CheckboxValueElement get_checkbox() {
        return getOrCreateProperty("_checkbox", "_checkbox", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotPolicyLocation800PanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ClassCodeInputSet extends PCFElement {
        public ClassCodeInputSet(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public ValueElement getCode() {
          return getOrCreateProperty("Code", "Code", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getComments() {
          return getOrCreateProperty("Comments", "Comments", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getDescription() {
          return getOrCreateProperty("Description", "Description", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotPolicyLocation800PanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class LienholdersLV extends PCFElement {
      public LienholdersLV(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public LienholderHeader getLienholderHeader() {
        return getOrCreateProperty("LienholderHeader", "LienholderHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyLocation800PanelSet.RUSnapshotDV.LienholdersLV.LienholderHeader.class);
      }
      
      public OwnerTypeHeader getOwnerTypeHeader() {
        return getOrCreateProperty("OwnerTypeHeader", "OwnerTypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyLocation800PanelSet.RUSnapshotDV.LienholdersLV.OwnerTypeHeader.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      @SuppressWarnings(value = "unchecked")
      public IteratorEntriesWithPaging<pcftest.ClaimSnapshotPolicyLocation800PanelSet.RUSnapshotDV.LienholdersLV.entry> get_Entries() {
        return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ClaimSnapshotPolicyLocation800PanelSet.RUSnapshotDV.LienholdersLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
      }
      
      public pcftest.ClaimSnapshotPolicyLocation800PanelSet.RUSnapshotDV.LienholdersLV._ListPaging get_ListPaging() {
        return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ClaimSnapshotPolicyLocation800PanelSet.RUSnapshotDV.LienholdersLV._ListPaging.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotPolicyLocation800PanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class LienholderHeader extends ValueElement {
        public LienholderHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotPolicyLocation800PanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class OwnerTypeHeader extends ValueElement {
        public OwnerTypeHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotPolicyLocation800PanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _ListPaging extends PagingElement {
        public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotPolicyLocation800PanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class entry extends RowElement {
        public entry(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public ValueElement getLienholder() {
          return getOrCreateProperty("Lienholder", "Lienholder", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getOwnerType() {
          return getOrCreateProperty("OwnerType", "OwnerType", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public IteratorEntryCheckboxElement get_Checkbox() {
          return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
        }
        
        public pcftest.ClaimSnapshotPolicyLocation800PanelSet.RUSnapshotDV.LienholdersLV.entry._Select get_Select() {
          return getOrCreateProperty("_Select", "_Select", null, pcftest.ClaimSnapshotPolicyLocation800PanelSet.RUSnapshotDV.LienholdersLV.entry._Select.class);
        }
        
        public pcftest.ClaimSnapshotPolicyLocation800PanelSet.RUSnapshotDV.LienholdersLV.entry._ViewDetail get_ViewDetail() {
          return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ClaimSnapshotPolicyLocation800PanelSet.RUSnapshotDV.LienholdersLV.entry._ViewDetail.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotPolicyLocation800PanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class _Select extends SelectorCellElement {
          public _Select(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotPolicyLocation800PanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotPolicyLocation800PanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class LienholdersLV_tb extends PCFElement {
      public LienholdersLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotPolicyLocation800PanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RUSnapshotLV extends PCFElement {
    public RUSnapshotLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public BuildingNumberHeader getBuildingNumberHeader() {
      return getOrCreateProperty("BuildingNumberHeader", "BuildingNumberHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyLocation800PanelSet.RUSnapshotLV.BuildingNumberHeader.class);
    }
    
    public LienholdersHeader getLienholdersHeader() {
      return getOrCreateProperty("LienholdersHeader", "LienholdersHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyLocation800PanelSet.RUSnapshotLV.LienholdersHeader.class);
    }
    
    public RUDescriptionHeader getRUDescriptionHeader() {
      return getOrCreateProperty("RUDescriptionHeader", "RUDescriptionHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyLocation800PanelSet.RUSnapshotLV.RUDescriptionHeader.class);
    }
    
    public RUNumberHeader getRUNumberHeader() {
      return getOrCreateProperty("RUNumberHeader", "RUNumberHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyLocation800PanelSet.RUSnapshotLV.RUNumberHeader.class);
    }
    
    public RUTypeHeader getRUTypeHeader() {
      return getOrCreateProperty("RUTypeHeader", "RUTypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyLocation800PanelSet.RUSnapshotLV.RUTypeHeader.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<pcftest.ClaimSnapshotPolicyLocation800PanelSet.RUSnapshotLV.entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ClaimSnapshotPolicyLocation800PanelSet.RUSnapshotLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public pcftest.ClaimSnapshotPolicyLocation800PanelSet.RUSnapshotLV._ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ClaimSnapshotPolicyLocation800PanelSet.RUSnapshotLV._ListPaging.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotPolicyLocation800PanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class BuildingNumberHeader extends ValueElement {
      public BuildingNumberHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotPolicyLocation800PanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class LienholdersHeader extends ValueElement {
      public LienholdersHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotPolicyLocation800PanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class RUDescriptionHeader extends ValueElement {
      public RUDescriptionHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotPolicyLocation800PanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class RUNumberHeader extends ValueElement {
      public RUNumberHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotPolicyLocation800PanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class RUTypeHeader extends ValueElement {
      public RUTypeHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotPolicyLocation800PanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotPolicyLocation800PanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends RowElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ValueElement getBuildingNumber() {
        return getOrCreateProperty("BuildingNumber", "BuildingNumber", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getLienholders() {
        return getOrCreateProperty("Lienholders", "Lienholders", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getRUDescription() {
        return getOrCreateProperty("RUDescription", "RUDescription", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getRUNumber() {
        return getOrCreateProperty("RUNumber", "RUNumber", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getRUType() {
        return getOrCreateProperty("RUType", "RUType", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      public pcftest.ClaimSnapshotPolicyLocation800PanelSet.RUSnapshotLV.entry._Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.ClaimSnapshotPolicyLocation800PanelSet.RUSnapshotLV.entry._Select.class);
      }
      
      public pcftest.ClaimSnapshotPolicyLocation800PanelSet.RUSnapshotLV.entry._ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ClaimSnapshotPolicyLocation800PanelSet.RUSnapshotLV.entry._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotPolicyLocation800PanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotPolicyLocation800PanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotPolicyLocation800PanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RUSnapshotLV_tb extends PCFElement {
    public RUSnapshotLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotPolicyLocation800PanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RiskDetailTab extends ClickableActionElement {
    public RiskDetailTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}