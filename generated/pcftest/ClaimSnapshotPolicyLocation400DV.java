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
import pcftest.ClaimSnapshotPolicyLocation400DV.CoveragesLV;
import pcftest.ClaimSnapshotPolicyLocation400DV.CoveragesLV.CoinsuranceHeader;
import pcftest.ClaimSnapshotPolicyLocation400DV.CoveragesLV.CoverageBasisHeader;
import pcftest.ClaimSnapshotPolicyLocation400DV.CoveragesLV.CoverageNotesHeader;
import pcftest.ClaimSnapshotPolicyLocation400DV.CoveragesLV.CoverageTypeHeader;
import pcftest.ClaimSnapshotPolicyLocation400DV.CoveragesLV.DeductibleHeader;
import pcftest.ClaimSnapshotPolicyLocation400DV.CoveragesLV.ExposureLimitHeader;
import pcftest.ClaimSnapshotPolicyLocation400DV.CoveragesLV.IncidentLimitHeader;
import pcftest.ClaimSnapshotPolicyLocation400DV.CoveragesLV.LimitsIndicatorHeader;
import pcftest.ClaimSnapshotPolicyLocation400DV.CoveragesLV_tb;
import pcftest.ClaimSnapshotPolicyLocation400DV.LienholdersLV;
import pcftest.ClaimSnapshotPolicyLocation400DV.LienholdersLV.LienholderHeader;
import pcftest.ClaimSnapshotPolicyLocation400DV.LienholdersLV.OwnerTypeHeader;
import pcftest.ClaimSnapshotPolicyLocation400DV.LienholdersLV_tb;
import pcftest.ClaimSnapshotPolicyLocation400DV.ListedItemsLV;
import pcftest.ClaimSnapshotPolicyLocation400DV.ListedItemsLV.ItemDescriptionHeader;
import pcftest.ClaimSnapshotPolicyLocation400DV.ListedItemsLV.ItemValueHeader;
import pcftest.ClaimSnapshotPolicyLocation400DV.ListedItemsLV_tb;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/snapshot/400/ClaimSnapshotPolicyLocation400DV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotPolicyLocation400DV extends DetailViewElement {
  public final static String CHECKSUM = "b0898d35844b3be2d8e699773af8d5ed";
  
  public ClaimSnapshotPolicyLocation400DV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getAddress() {
    return getOrCreateProperty("Address", "Address", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getBuildingNumber() {
    return getOrCreateProperty("BuildingNumber", "BuildingNumber", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getCity() {
    return getOrCreateProperty("City", "City", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public CoveragesLV getCoveragesLV() {
    return getOrCreateProperty("CoveragesLV", "CoveragesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimSnapshotPolicyLocation400DV.CoveragesLV.class);
  }
  
  public CoveragesLV_tb getCoveragesLV_tb() {
    return getOrCreateProperty("CoveragesLV_tb", "CoveragesLV_tb", null, pcftest.ClaimSnapshotPolicyLocation400DV.CoveragesLV_tb.class);
  }
  
  public ValueElement getDescription() {
    return getOrCreateProperty("Description", "Description", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public LienholdersLV getLienholdersLV() {
    return getOrCreateProperty("LienholdersLV", "LienholdersLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimSnapshotPolicyLocation400DV.LienholdersLV.class);
  }
  
  public LienholdersLV_tb getLienholdersLV_tb() {
    return getOrCreateProperty("LienholdersLV_tb", "LienholdersLV_tb", null, pcftest.ClaimSnapshotPolicyLocation400DV.LienholdersLV_tb.class);
  }
  
  public ListedItemsLV getListedItemsLV() {
    return getOrCreateProperty("ListedItemsLV", "ListedItemsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimSnapshotPolicyLocation400DV.ListedItemsLV.class);
  }
  
  public ListedItemsLV_tb getListedItemsLV_tb() {
    return getOrCreateProperty("ListedItemsLV_tb", "ListedItemsLV_tb", null, pcftest.ClaimSnapshotPolicyLocation400DV.ListedItemsLV_tb.class);
  }
  
  public ValueElement getLocationNumber() {
    return getOrCreateProperty("LocationNumber", "LocationNumber", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getNotes() {
    return getOrCreateProperty("Notes", "Notes", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getNumber() {
    return getOrCreateProperty("Number", "Number", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getState() {
    return getOrCreateProperty("State", "State", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getZipCode() {
    return getOrCreateProperty("ZipCode", "ZipCode", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/400/ClaimSnapshotPolicyLocation400DV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CoveragesLV extends PCFElement {
    public CoveragesLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public CoinsuranceHeader getCoinsuranceHeader() {
      return getOrCreateProperty("CoinsuranceHeader", "CoinsuranceHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyLocation400DV.CoveragesLV.CoinsuranceHeader.class);
    }
    
    public CoverageBasisHeader getCoverageBasisHeader() {
      return getOrCreateProperty("CoverageBasisHeader", "CoverageBasisHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyLocation400DV.CoveragesLV.CoverageBasisHeader.class);
    }
    
    public CoverageNotesHeader getCoverageNotesHeader() {
      return getOrCreateProperty("CoverageNotesHeader", "CoverageNotesHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyLocation400DV.CoveragesLV.CoverageNotesHeader.class);
    }
    
    public CoverageTypeHeader getCoverageTypeHeader() {
      return getOrCreateProperty("CoverageTypeHeader", "CoverageTypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyLocation400DV.CoveragesLV.CoverageTypeHeader.class);
    }
    
    public DeductibleHeader getDeductibleHeader() {
      return getOrCreateProperty("DeductibleHeader", "DeductibleHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyLocation400DV.CoveragesLV.DeductibleHeader.class);
    }
    
    public ExposureLimitHeader getExposureLimitHeader() {
      return getOrCreateProperty("ExposureLimitHeader", "ExposureLimitHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyLocation400DV.CoveragesLV.ExposureLimitHeader.class);
    }
    
    public IncidentLimitHeader getIncidentLimitHeader() {
      return getOrCreateProperty("IncidentLimitHeader", "IncidentLimitHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyLocation400DV.CoveragesLV.IncidentLimitHeader.class);
    }
    
    public LimitsIndicatorHeader getLimitsIndicatorHeader() {
      return getOrCreateProperty("LimitsIndicatorHeader", "LimitsIndicatorHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyLocation400DV.CoveragesLV.LimitsIndicatorHeader.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<pcftest.ClaimSnapshotPolicyLocation400DV.CoveragesLV.entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ClaimSnapshotPolicyLocation400DV.CoveragesLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public pcftest.ClaimSnapshotPolicyLocation400DV.CoveragesLV._ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ClaimSnapshotPolicyLocation400DV.CoveragesLV._ListPaging.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/400/ClaimSnapshotPolicyLocation400DV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CoinsuranceHeader extends ValueElement {
      public CoinsuranceHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/400/ClaimSnapshotPolicyLocation400DV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CoverageBasisHeader extends ValueElement {
      public CoverageBasisHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/400/ClaimSnapshotPolicyLocation400DV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CoverageNotesHeader extends ValueElement {
      public CoverageNotesHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/400/ClaimSnapshotPolicyLocation400DV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CoverageTypeHeader extends ValueElement {
      public CoverageTypeHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/400/ClaimSnapshotPolicyLocation400DV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class DeductibleHeader extends ValueElement {
      public DeductibleHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/400/ClaimSnapshotPolicyLocation400DV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ExposureLimitHeader extends ValueElement {
      public ExposureLimitHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/400/ClaimSnapshotPolicyLocation400DV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class IncidentLimitHeader extends ValueElement {
      public IncidentLimitHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/400/ClaimSnapshotPolicyLocation400DV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class LimitsIndicatorHeader extends ValueElement {
      public LimitsIndicatorHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/400/ClaimSnapshotPolicyLocation400DV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/400/ClaimSnapshotPolicyLocation400DV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
      
      public pcftest.ClaimSnapshotPolicyLocation400DV.CoveragesLV.entry._Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.ClaimSnapshotPolicyLocation400DV.CoveragesLV.entry._Select.class);
      }
      
      public pcftest.ClaimSnapshotPolicyLocation400DV.CoveragesLV.entry._ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ClaimSnapshotPolicyLocation400DV.CoveragesLV.entry._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/400/ClaimSnapshotPolicyLocation400DV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/400/ClaimSnapshotPolicyLocation400DV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/snapshot/400/ClaimSnapshotPolicyLocation400DV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CoveragesLV_tb extends PCFElement {
    public CoveragesLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/400/ClaimSnapshotPolicyLocation400DV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LienholdersLV extends PCFElement {
    public LienholdersLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public LienholderHeader getLienholderHeader() {
      return getOrCreateProperty("LienholderHeader", "LienholderHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyLocation400DV.LienholdersLV.LienholderHeader.class);
    }
    
    public OwnerTypeHeader getOwnerTypeHeader() {
      return getOrCreateProperty("OwnerTypeHeader", "OwnerTypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyLocation400DV.LienholdersLV.OwnerTypeHeader.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<pcftest.ClaimSnapshotPolicyLocation400DV.LienholdersLV.entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ClaimSnapshotPolicyLocation400DV.LienholdersLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public pcftest.ClaimSnapshotPolicyLocation400DV.LienholdersLV._ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ClaimSnapshotPolicyLocation400DV.LienholdersLV._ListPaging.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/400/ClaimSnapshotPolicyLocation400DV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class LienholderHeader extends ValueElement {
      public LienholderHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/400/ClaimSnapshotPolicyLocation400DV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class OwnerTypeHeader extends ValueElement {
      public OwnerTypeHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/400/ClaimSnapshotPolicyLocation400DV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/400/ClaimSnapshotPolicyLocation400DV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
      
      public pcftest.ClaimSnapshotPolicyLocation400DV.LienholdersLV.entry._Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.ClaimSnapshotPolicyLocation400DV.LienholdersLV.entry._Select.class);
      }
      
      public pcftest.ClaimSnapshotPolicyLocation400DV.LienholdersLV.entry._ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ClaimSnapshotPolicyLocation400DV.LienholdersLV.entry._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/400/ClaimSnapshotPolicyLocation400DV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/400/ClaimSnapshotPolicyLocation400DV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/snapshot/400/ClaimSnapshotPolicyLocation400DV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LienholdersLV_tb extends PCFElement {
    public LienholdersLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/400/ClaimSnapshotPolicyLocation400DV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ListedItemsLV extends PCFElement {
    public ListedItemsLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ItemDescriptionHeader getItemDescriptionHeader() {
      return getOrCreateProperty("ItemDescriptionHeader", "ItemDescriptionHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyLocation400DV.ListedItemsLV.ItemDescriptionHeader.class);
    }
    
    public ItemValueHeader getItemValueHeader() {
      return getOrCreateProperty("ItemValueHeader", "ItemValueHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyLocation400DV.ListedItemsLV.ItemValueHeader.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<pcftest.ClaimSnapshotPolicyLocation400DV.ListedItemsLV.entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ClaimSnapshotPolicyLocation400DV.ListedItemsLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public pcftest.ClaimSnapshotPolicyLocation400DV.ListedItemsLV._ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ClaimSnapshotPolicyLocation400DV.ListedItemsLV._ListPaging.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/400/ClaimSnapshotPolicyLocation400DV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ItemDescriptionHeader extends ValueElement {
      public ItemDescriptionHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/400/ClaimSnapshotPolicyLocation400DV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ItemValueHeader extends ValueElement {
      public ItemValueHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/400/ClaimSnapshotPolicyLocation400DV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/400/ClaimSnapshotPolicyLocation400DV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends RowElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ValueElement getItemDescription() {
        return getOrCreateProperty("ItemDescription", "ItemDescription", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getItemValue() {
        return getOrCreateProperty("ItemValue", "ItemValue", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      public pcftest.ClaimSnapshotPolicyLocation400DV.ListedItemsLV.entry._Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.ClaimSnapshotPolicyLocation400DV.ListedItemsLV.entry._Select.class);
      }
      
      public pcftest.ClaimSnapshotPolicyLocation400DV.ListedItemsLV.entry._ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ClaimSnapshotPolicyLocation400DV.ListedItemsLV.entry._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/400/ClaimSnapshotPolicyLocation400DV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/400/ClaimSnapshotPolicyLocation400DV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/snapshot/400/ClaimSnapshotPolicyLocation400DV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ListedItemsLV_tb extends PCFElement {
    public ListedItemsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  
}