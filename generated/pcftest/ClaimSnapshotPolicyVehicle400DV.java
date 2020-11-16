package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
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
import pcftest.ClaimSnapshotPolicyVehicle400DV.CoveragesLV;
import pcftest.ClaimSnapshotPolicyVehicle400DV.CoveragesLV.ClaimAggLimitHeader;
import pcftest.ClaimSnapshotPolicyVehicle400DV.CoveragesLV.CoverageTypeHeader;
import pcftest.ClaimSnapshotPolicyVehicle400DV.CoveragesLV.DeductibleHeader;
import pcftest.ClaimSnapshotPolicyVehicle400DV.CoveragesLV.ExposureLimitHeader;
import pcftest.ClaimSnapshotPolicyVehicle400DV.CoveragesLV.IncidentLimitHeader;
import pcftest.ClaimSnapshotPolicyVehicle400DV.CoveragesLV.LimitsIndicatorHeader;
import pcftest.ClaimSnapshotPolicyVehicle400DV.CoveragesLV.NonmedAggLimitHeader;
import pcftest.ClaimSnapshotPolicyVehicle400DV.CoveragesLV.NotesHeader;
import pcftest.ClaimSnapshotPolicyVehicle400DV.CoveragesLV.PersonAggLimitHeader;
import pcftest.ClaimSnapshotPolicyVehicle400DV.CoveragesLV.ReplaceAggLimitHeader;
import pcftest.ClaimSnapshotPolicyVehicle400DV.CoveragesLV_tb;
import pcftest.ClaimSnapshotPolicyVehicle400DV.LienholdersLV;
import pcftest.ClaimSnapshotPolicyVehicle400DV.LienholdersLV.LienholderHeader;
import pcftest.ClaimSnapshotPolicyVehicle400DV.LienholdersLV.OwnerTypeHeader;
import pcftest.ClaimSnapshotPolicyVehicle400DV.LienholdersLV_tb;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/snapshot/400/ClaimSnapshotPolicyVehicle400DV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotPolicyVehicle400DV extends DetailViewElement {
  public final static String CHECKSUM = "6c0087b8bd5d9298cd1088bc5c2261e5";
  
  public ClaimSnapshotPolicyVehicle400DV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getBoatType() {
    return getOrCreateProperty("BoatType", "BoatType", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getColor() {
    return getOrCreateProperty("Color", "Color", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public CoveragesLV getCoveragesLV() {
    return getOrCreateProperty("CoveragesLV", "CoveragesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimSnapshotPolicyVehicle400DV.CoveragesLV.class);
  }
  
  public CoveragesLV_tb getCoveragesLV_tb() {
    return getOrCreateProperty("CoveragesLV_tb", "CoveragesLV_tb", null, pcftest.ClaimSnapshotPolicyVehicle400DV.CoveragesLV_tb.class);
  }
  
  public ValueElement getLicensePlate() {
    return getOrCreateProperty("LicensePlate", "LicensePlate", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public LienholdersLV getLienholdersLV() {
    return getOrCreateProperty("LienholdersLV", "LienholdersLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimSnapshotPolicyVehicle400DV.LienholdersLV.class);
  }
  
  public LienholdersLV_tb getLienholdersLV_tb() {
    return getOrCreateProperty("LienholdersLV_tb", "LienholdersLV_tb", null, pcftest.ClaimSnapshotPolicyVehicle400DV.LienholdersLV_tb.class);
  }
  
  public ValueElement getMake() {
    return getOrCreateProperty("Make", "Make", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getModel() {
    return getOrCreateProperty("Model", "Model", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getNumber() {
    return getOrCreateProperty("Number", "Number", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getOffRoadStyle() {
    return getOrCreateProperty("OffRoadStyle", "OffRoadStyle", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getSerialNumber() {
    return getOrCreateProperty("SerialNumber", "SerialNumber", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getState() {
    return getOrCreateProperty("State", "State", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getStyle() {
    return getOrCreateProperty("Style", "Style", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getVIN() {
    return getOrCreateProperty("VIN", "VIN", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getYear() {
    return getOrCreateProperty("Year", "Year", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/400/ClaimSnapshotPolicyVehicle400DV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CoveragesLV extends PCFElement {
    public CoveragesLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimAggLimitHeader getClaimAggLimitHeader() {
      return getOrCreateProperty("ClaimAggLimitHeader", "ClaimAggLimitHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyVehicle400DV.CoveragesLV.ClaimAggLimitHeader.class);
    }
    
    public CoverageTypeHeader getCoverageTypeHeader() {
      return getOrCreateProperty("CoverageTypeHeader", "CoverageTypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyVehicle400DV.CoveragesLV.CoverageTypeHeader.class);
    }
    
    public DeductibleHeader getDeductibleHeader() {
      return getOrCreateProperty("DeductibleHeader", "DeductibleHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyVehicle400DV.CoveragesLV.DeductibleHeader.class);
    }
    
    public ExposureLimitHeader getExposureLimitHeader() {
      return getOrCreateProperty("ExposureLimitHeader", "ExposureLimitHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyVehicle400DV.CoveragesLV.ExposureLimitHeader.class);
    }
    
    public IncidentLimitHeader getIncidentLimitHeader() {
      return getOrCreateProperty("IncidentLimitHeader", "IncidentLimitHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyVehicle400DV.CoveragesLV.IncidentLimitHeader.class);
    }
    
    public LimitsIndicatorHeader getLimitsIndicatorHeader() {
      return getOrCreateProperty("LimitsIndicatorHeader", "LimitsIndicatorHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyVehicle400DV.CoveragesLV.LimitsIndicatorHeader.class);
    }
    
    public NonmedAggLimitHeader getNonmedAggLimitHeader() {
      return getOrCreateProperty("NonmedAggLimitHeader", "NonmedAggLimitHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyVehicle400DV.CoveragesLV.NonmedAggLimitHeader.class);
    }
    
    public NotesHeader getNotesHeader() {
      return getOrCreateProperty("NotesHeader", "NotesHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyVehicle400DV.CoveragesLV.NotesHeader.class);
    }
    
    public PersonAggLimitHeader getPersonAggLimitHeader() {
      return getOrCreateProperty("PersonAggLimitHeader", "PersonAggLimitHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyVehicle400DV.CoveragesLV.PersonAggLimitHeader.class);
    }
    
    public ReplaceAggLimitHeader getReplaceAggLimitHeader() {
      return getOrCreateProperty("ReplaceAggLimitHeader", "ReplaceAggLimitHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyVehicle400DV.CoveragesLV.ReplaceAggLimitHeader.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<pcftest.ClaimSnapshotPolicyVehicle400DV.CoveragesLV.entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ClaimSnapshotPolicyVehicle400DV.CoveragesLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public pcftest.ClaimSnapshotPolicyVehicle400DV.CoveragesLV._ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ClaimSnapshotPolicyVehicle400DV.CoveragesLV._ListPaging.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/400/ClaimSnapshotPolicyVehicle400DV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimAggLimitHeader extends ValueElement {
      public ClaimAggLimitHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/400/ClaimSnapshotPolicyVehicle400DV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CoverageTypeHeader extends ValueElement {
      public CoverageTypeHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/400/ClaimSnapshotPolicyVehicle400DV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class DeductibleHeader extends ValueElement {
      public DeductibleHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/400/ClaimSnapshotPolicyVehicle400DV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ExposureLimitHeader extends ValueElement {
      public ExposureLimitHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/400/ClaimSnapshotPolicyVehicle400DV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class IncidentLimitHeader extends ValueElement {
      public IncidentLimitHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/400/ClaimSnapshotPolicyVehicle400DV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class LimitsIndicatorHeader extends ValueElement {
      public LimitsIndicatorHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/400/ClaimSnapshotPolicyVehicle400DV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class NonmedAggLimitHeader extends ValueElement {
      public NonmedAggLimitHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/400/ClaimSnapshotPolicyVehicle400DV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class NotesHeader extends ValueElement {
      public NotesHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/400/ClaimSnapshotPolicyVehicle400DV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class PersonAggLimitHeader extends ValueElement {
      public PersonAggLimitHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/400/ClaimSnapshotPolicyVehicle400DV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ReplaceAggLimitHeader extends ValueElement {
      public ReplaceAggLimitHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/400/ClaimSnapshotPolicyVehicle400DV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/400/ClaimSnapshotPolicyVehicle400DV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends RowElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ValueElement getClaimAggLimit() {
        return getOrCreateProperty("ClaimAggLimit", "ClaimAggLimit", null, gw.smoketest.platform.web.ValueElement.class);
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
      
      public ValueElement getLimitsIndicator() {
        return getOrCreateProperty("LimitsIndicator", "LimitsIndicator", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getNonmedAggLimit() {
        return getOrCreateProperty("NonmedAggLimit", "NonmedAggLimit", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getNotes() {
        return getOrCreateProperty("Notes", "Notes", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getPersonAggLimit() {
        return getOrCreateProperty("PersonAggLimit", "PersonAggLimit", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getReplaceAggLimit() {
        return getOrCreateProperty("ReplaceAggLimit", "ReplaceAggLimit", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      public pcftest.ClaimSnapshotPolicyVehicle400DV.CoveragesLV.entry._Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.ClaimSnapshotPolicyVehicle400DV.CoveragesLV.entry._Select.class);
      }
      
      public pcftest.ClaimSnapshotPolicyVehicle400DV.CoveragesLV.entry._ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ClaimSnapshotPolicyVehicle400DV.CoveragesLV.entry._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/400/ClaimSnapshotPolicyVehicle400DV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/400/ClaimSnapshotPolicyVehicle400DV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/snapshot/400/ClaimSnapshotPolicyVehicle400DV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CoveragesLV_tb extends PCFElement {
    public CoveragesLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/400/ClaimSnapshotPolicyVehicle400DV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LienholdersLV extends PCFElement {
    public LienholdersLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public LienholderHeader getLienholderHeader() {
      return getOrCreateProperty("LienholderHeader", "LienholderHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyVehicle400DV.LienholdersLV.LienholderHeader.class);
    }
    
    public OwnerTypeHeader getOwnerTypeHeader() {
      return getOrCreateProperty("OwnerTypeHeader", "OwnerTypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyVehicle400DV.LienholdersLV.OwnerTypeHeader.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<pcftest.ClaimSnapshotPolicyVehicle400DV.LienholdersLV.entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ClaimSnapshotPolicyVehicle400DV.LienholdersLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public pcftest.ClaimSnapshotPolicyVehicle400DV.LienholdersLV._ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ClaimSnapshotPolicyVehicle400DV.LienholdersLV._ListPaging.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/400/ClaimSnapshotPolicyVehicle400DV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class LienholderHeader extends ValueElement {
      public LienholderHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/400/ClaimSnapshotPolicyVehicle400DV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class OwnerTypeHeader extends ValueElement {
      public OwnerTypeHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/400/ClaimSnapshotPolicyVehicle400DV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/400/ClaimSnapshotPolicyVehicle400DV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
      
      public pcftest.ClaimSnapshotPolicyVehicle400DV.LienholdersLV.entry._Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.ClaimSnapshotPolicyVehicle400DV.LienholdersLV.entry._Select.class);
      }
      
      public pcftest.ClaimSnapshotPolicyVehicle400DV.LienholdersLV.entry._ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ClaimSnapshotPolicyVehicle400DV.LienholdersLV.entry._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/400/ClaimSnapshotPolicyVehicle400DV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/400/ClaimSnapshotPolicyVehicle400DV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/snapshot/400/ClaimSnapshotPolicyVehicle400DV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LienholdersLV_tb extends PCFElement {
    public LienholdersLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  
}