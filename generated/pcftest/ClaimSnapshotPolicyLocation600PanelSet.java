package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
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
import pcftest.ClaimSnapshotPolicyLocation600PanelSet.ClaimSnapshotPolicyLocation600DV;
import pcftest.ClaimSnapshotPolicyLocation600PanelSet.ClaimSnapshotPolicyLocation600DV.BuildingLV;
import pcftest.ClaimSnapshotPolicyLocation600PanelSet.ClaimSnapshotPolicyLocation600DV.BuildingLV.NotesHeader;
import pcftest.ClaimSnapshotPolicyLocation600PanelSet.ClaimSnapshotPolicyLocation600DV.BuildingLV.NumberHeader;
import pcftest.ClaimSnapshotPolicyLocation600PanelSet.ClaimSnapshotPolicyLocation600DV.BuildingLV_tb;
import pcftest.ClaimSnapshotPolicyLocation600PanelSet.ClaimSnapshotPolicyLocation600DV.ClassCodeLV;
import pcftest.ClaimSnapshotPolicyLocation600PanelSet.ClaimSnapshotPolicyLocation600DV.ClassCodeLV.CodeHeader;
import pcftest.ClaimSnapshotPolicyLocation600PanelSet.ClaimSnapshotPolicyLocation600DV.ClassCodeLV.CommentsHeader;
import pcftest.ClaimSnapshotPolicyLocation600PanelSet.ClaimSnapshotPolicyLocation600DV.ClassCodeLV.DescriptionHeader;
import pcftest.ClaimSnapshotPolicyLocation600PanelSet.ClaimSnapshotPolicyLocation600DV.ClassCodeLV_tb;
import pcftest.ClaimSnapshotPolicyLocation600PanelSet.ClaimSnapshotPolicyLocation600DV.LienholdersLV;
import pcftest.ClaimSnapshotPolicyLocation600PanelSet.ClaimSnapshotPolicyLocation600DV.LienholdersLV.LienholderHeader;
import pcftest.ClaimSnapshotPolicyLocation600PanelSet.ClaimSnapshotPolicyLocation600DV.LienholdersLV.OwnerTypeHeader;
import pcftest.ClaimSnapshotPolicyLocation600PanelSet.ClaimSnapshotPolicyLocation600DV.LienholdersLV_tb;
import pcftest.ClaimSnapshotPolicyLocation600PanelSet.ClaimSnapshotPolicyLocation600DV.ListedItemsLV;
import pcftest.ClaimSnapshotPolicyLocation600PanelSet.ClaimSnapshotPolicyLocation600DV.ListedItemsLV.ItemDescriptionHeader;
import pcftest.ClaimSnapshotPolicyLocation600PanelSet.ClaimSnapshotPolicyLocation600DV.ListedItemsLV.ItemValueHeader;
import pcftest.ClaimSnapshotPolicyLocation600PanelSet.ClaimSnapshotPolicyLocation600DV.ListedItemsLV_tb;
import pcftest.ClaimSnapshotPolicyLocation600PanelSet.ClaimSnapshotPolicyLocation600LDP;
import pcftest.ClaimSnapshotPolicyLocation600PanelSet.ClaimSnapshotPolicyLocation600LDP.CovTermsDetailTab;
import pcftest.ClaimSnapshotPolicyLocation600PanelSet.ClaimSnapshotPolicyLocation600LDP.CovTermsLV;
import pcftest.ClaimSnapshotPolicyLocation600PanelSet.ClaimSnapshotPolicyLocation600LDP.CovTermsLV.AggregationModelHeader;
import pcftest.ClaimSnapshotPolicyLocation600PanelSet.ClaimSnapshotPolicyLocation600LDP.CovTermsLV.RestrictionModelHeader;
import pcftest.ClaimSnapshotPolicyLocation600PanelSet.ClaimSnapshotPolicyLocation600LDP.CovTermsLV.TypeHeader;
import pcftest.ClaimSnapshotPolicyLocation600PanelSet.ClaimSnapshotPolicyLocation600LDP.CovTermsLV.ValueHeader;
import pcftest.ClaimSnapshotPolicyLocation600PanelSet.ClaimSnapshotPolicyLocation600LDP.CovTermsLV.ValueTypeHeader;
import pcftest.ClaimSnapshotPolicyLocation600PanelSet.ClaimSnapshotPolicyLocation600LDP.CovTermsLV_tb;
import pcftest.ClaimSnapshotPolicyLocation600PanelSet.ClaimSnapshotPolicyLocation600LDP.CoveragesLV;
import pcftest.ClaimSnapshotPolicyLocation600PanelSet.ClaimSnapshotPolicyLocation600LDP.CoveragesLV.CoinsuranceHeader;
import pcftest.ClaimSnapshotPolicyLocation600PanelSet.ClaimSnapshotPolicyLocation600LDP.CoveragesLV.CoverageBasisHeader;
import pcftest.ClaimSnapshotPolicyLocation600PanelSet.ClaimSnapshotPolicyLocation600LDP.CoveragesLV.CoverageNotesHeader;
import pcftest.ClaimSnapshotPolicyLocation600PanelSet.ClaimSnapshotPolicyLocation600LDP.CoveragesLV.CoverageTypeHeader;
import pcftest.ClaimSnapshotPolicyLocation600PanelSet.ClaimSnapshotPolicyLocation600LDP.CoveragesLV.DeductibleHeader;
import pcftest.ClaimSnapshotPolicyLocation600PanelSet.ClaimSnapshotPolicyLocation600LDP.CoveragesLV.ExposureLimitHeader;
import pcftest.ClaimSnapshotPolicyLocation600PanelSet.ClaimSnapshotPolicyLocation600LDP.CoveragesLV.IncidentLimitHeader;
import pcftest.ClaimSnapshotPolicyLocation600PanelSet.ClaimSnapshotPolicyLocation600LDP.CoveragesLV.LimitsIndicatorHeader;
import pcftest.ClaimSnapshotPolicyLocation600PanelSet.ClaimSnapshotPolicyLocation600LDP.CoveragesLV_tb;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotPolicyLocation600PanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotPolicyLocation600PanelSet extends PCFElement {
  public final static String CHECKSUM = "1886b3994b9492772010803169a50f0f";
  
  public ClaimSnapshotPolicyLocation600PanelSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ClaimSnapshotPolicyLocation600DV getClaimSnapshotPolicyLocation600DV() {
    return getOrCreateProperty("ClaimSnapshotPolicyLocation600DV", "ClaimSnapshotPolicyLocation600DV", null, pcftest.ClaimSnapshotPolicyLocation600PanelSet.ClaimSnapshotPolicyLocation600DV.class);
  }
  
  public ClaimSnapshotPolicyLocation600LDP getClaimSnapshotPolicyLocation600LDP() {
    return getOrCreateProperty("ClaimSnapshotPolicyLocation600LDP", "ClaimSnapshotPolicyLocation600LDP", null, pcftest.ClaimSnapshotPolicyLocation600PanelSet.ClaimSnapshotPolicyLocation600LDP.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotPolicyLocation600PanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotPolicyLocation600DV extends DetailViewElement {
    public ClaimSnapshotPolicyLocation600DV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public AddressSnapshot600InputSet getAddressSnapshot600InputSet() {
      return getOrCreateProperty("AddressSnapshot600InputSet", "AddressSnapshot600InputSet", null, pcftest.AddressSnapshot600InputSet.class);
    }
    
    public BuildingLV getBuildingLV() {
      return getOrCreateProperty("BuildingLV", "BuildingLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimSnapshotPolicyLocation600PanelSet.ClaimSnapshotPolicyLocation600DV.BuildingLV.class);
    }
    
    public BuildingLV_tb getBuildingLV_tb() {
      return getOrCreateProperty("BuildingLV_tb", "BuildingLV_tb", null, pcftest.ClaimSnapshotPolicyLocation600PanelSet.ClaimSnapshotPolicyLocation600DV.BuildingLV_tb.class);
    }
    
    public ClassCodeLV getClassCodeLV() {
      return getOrCreateProperty("ClassCodeLV", "ClassCodeLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimSnapshotPolicyLocation600PanelSet.ClaimSnapshotPolicyLocation600DV.ClassCodeLV.class);
    }
    
    public ClassCodeLV_tb getClassCodeLV_tb() {
      return getOrCreateProperty("ClassCodeLV_tb", "ClassCodeLV_tb", null, pcftest.ClaimSnapshotPolicyLocation600PanelSet.ClaimSnapshotPolicyLocation600DV.ClassCodeLV_tb.class);
    }
    
    public ValueElement getDescription() {
      return getOrCreateProperty("Description", "Description", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public LienholdersLV getLienholdersLV() {
      return getOrCreateProperty("LienholdersLV", "LienholdersLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimSnapshotPolicyLocation600PanelSet.ClaimSnapshotPolicyLocation600DV.LienholdersLV.class);
    }
    
    public LienholdersLV_tb getLienholdersLV_tb() {
      return getOrCreateProperty("LienholdersLV_tb", "LienholdersLV_tb", null, pcftest.ClaimSnapshotPolicyLocation600PanelSet.ClaimSnapshotPolicyLocation600DV.LienholdersLV_tb.class);
    }
    
    public ListedItemsLV getListedItemsLV() {
      return getOrCreateProperty("ListedItemsLV", "ListedItemsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimSnapshotPolicyLocation600PanelSet.ClaimSnapshotPolicyLocation600DV.ListedItemsLV.class);
    }
    
    public ListedItemsLV_tb getListedItemsLV_tb() {
      return getOrCreateProperty("ListedItemsLV_tb", "ListedItemsLV_tb", null, pcftest.ClaimSnapshotPolicyLocation600PanelSet.ClaimSnapshotPolicyLocation600DV.ListedItemsLV_tb.class);
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
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotPolicyLocation600PanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class BuildingLV extends PCFElement {
      public BuildingLV(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public NotesHeader getNotesHeader() {
        return getOrCreateProperty("NotesHeader", "NotesHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyLocation600PanelSet.ClaimSnapshotPolicyLocation600DV.BuildingLV.NotesHeader.class);
      }
      
      public NumberHeader getNumberHeader() {
        return getOrCreateProperty("NumberHeader", "NumberHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyLocation600PanelSet.ClaimSnapshotPolicyLocation600DV.BuildingLV.NumberHeader.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      @SuppressWarnings(value = "unchecked")
      public IteratorEntriesWithPaging<pcftest.ClaimSnapshotPolicyLocation600PanelSet.ClaimSnapshotPolicyLocation600DV.BuildingLV.entry> get_Entries() {
        return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ClaimSnapshotPolicyLocation600PanelSet.ClaimSnapshotPolicyLocation600DV.BuildingLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
      }
      
      public pcftest.ClaimSnapshotPolicyLocation600PanelSet.ClaimSnapshotPolicyLocation600DV.BuildingLV._ListPaging get_ListPaging() {
        return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ClaimSnapshotPolicyLocation600PanelSet.ClaimSnapshotPolicyLocation600DV.BuildingLV._ListPaging.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotPolicyLocation600PanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class NotesHeader extends ValueElement {
        public NotesHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotPolicyLocation600PanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class NumberHeader extends ValueElement {
        public NumberHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotPolicyLocation600PanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _ListPaging extends PagingElement {
        public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotPolicyLocation600PanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class entry extends RowElement {
        public entry(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public ValueElement getNotes() {
          return getOrCreateProperty("Notes", "Notes", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getNumber() {
          return getOrCreateProperty("Number", "Number", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public IteratorEntryCheckboxElement get_Checkbox() {
          return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
        }
        
        public pcftest.ClaimSnapshotPolicyLocation600PanelSet.ClaimSnapshotPolicyLocation600DV.BuildingLV.entry._Select get_Select() {
          return getOrCreateProperty("_Select", "_Select", null, pcftest.ClaimSnapshotPolicyLocation600PanelSet.ClaimSnapshotPolicyLocation600DV.BuildingLV.entry._Select.class);
        }
        
        public pcftest.ClaimSnapshotPolicyLocation600PanelSet.ClaimSnapshotPolicyLocation600DV.BuildingLV.entry._ViewDetail get_ViewDetail() {
          return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ClaimSnapshotPolicyLocation600PanelSet.ClaimSnapshotPolicyLocation600DV.BuildingLV.entry._ViewDetail.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotPolicyLocation600PanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class _Select extends SelectorCellElement {
          public _Select(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotPolicyLocation600PanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotPolicyLocation600PanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class BuildingLV_tb extends PCFElement {
      public BuildingLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotPolicyLocation600PanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClassCodeLV extends PCFElement {
      public ClassCodeLV(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public CodeHeader getCodeHeader() {
        return getOrCreateProperty("CodeHeader", "CodeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyLocation600PanelSet.ClaimSnapshotPolicyLocation600DV.ClassCodeLV.CodeHeader.class);
      }
      
      public CommentsHeader getCommentsHeader() {
        return getOrCreateProperty("CommentsHeader", "CommentsHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyLocation600PanelSet.ClaimSnapshotPolicyLocation600DV.ClassCodeLV.CommentsHeader.class);
      }
      
      public DescriptionHeader getDescriptionHeader() {
        return getOrCreateProperty("DescriptionHeader", "DescriptionHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyLocation600PanelSet.ClaimSnapshotPolicyLocation600DV.ClassCodeLV.DescriptionHeader.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      @SuppressWarnings(value = "unchecked")
      public IteratorEntriesWithPaging<pcftest.ClaimSnapshotPolicyLocation600PanelSet.ClaimSnapshotPolicyLocation600DV.ClassCodeLV.entry> get_Entries() {
        return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ClaimSnapshotPolicyLocation600PanelSet.ClaimSnapshotPolicyLocation600DV.ClassCodeLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
      }
      
      public pcftest.ClaimSnapshotPolicyLocation600PanelSet.ClaimSnapshotPolicyLocation600DV.ClassCodeLV._ListPaging get_ListPaging() {
        return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ClaimSnapshotPolicyLocation600PanelSet.ClaimSnapshotPolicyLocation600DV.ClassCodeLV._ListPaging.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotPolicyLocation600PanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class CodeHeader extends ValueElement {
        public CodeHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotPolicyLocation600PanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class CommentsHeader extends ValueElement {
        public CommentsHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotPolicyLocation600PanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class DescriptionHeader extends ValueElement {
        public DescriptionHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotPolicyLocation600PanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _ListPaging extends PagingElement {
        public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotPolicyLocation600PanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class entry extends RowElement {
        public entry(ISmokeTest helper, PCFElementId componentId)  {
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
        
        public IteratorEntryCheckboxElement get_Checkbox() {
          return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
        }
        
        public pcftest.ClaimSnapshotPolicyLocation600PanelSet.ClaimSnapshotPolicyLocation600DV.ClassCodeLV.entry._Select get_Select() {
          return getOrCreateProperty("_Select", "_Select", null, pcftest.ClaimSnapshotPolicyLocation600PanelSet.ClaimSnapshotPolicyLocation600DV.ClassCodeLV.entry._Select.class);
        }
        
        public pcftest.ClaimSnapshotPolicyLocation600PanelSet.ClaimSnapshotPolicyLocation600DV.ClassCodeLV.entry._ViewDetail get_ViewDetail() {
          return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ClaimSnapshotPolicyLocation600PanelSet.ClaimSnapshotPolicyLocation600DV.ClassCodeLV.entry._ViewDetail.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotPolicyLocation600PanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class _Select extends SelectorCellElement {
          public _Select(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotPolicyLocation600PanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotPolicyLocation600PanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClassCodeLV_tb extends PCFElement {
      public ClassCodeLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotPolicyLocation600PanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class LienholdersLV extends PCFElement {
      public LienholdersLV(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public LienholderHeader getLienholderHeader() {
        return getOrCreateProperty("LienholderHeader", "LienholderHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyLocation600PanelSet.ClaimSnapshotPolicyLocation600DV.LienholdersLV.LienholderHeader.class);
      }
      
      public OwnerTypeHeader getOwnerTypeHeader() {
        return getOrCreateProperty("OwnerTypeHeader", "OwnerTypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyLocation600PanelSet.ClaimSnapshotPolicyLocation600DV.LienholdersLV.OwnerTypeHeader.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      @SuppressWarnings(value = "unchecked")
      public IteratorEntriesWithPaging<pcftest.ClaimSnapshotPolicyLocation600PanelSet.ClaimSnapshotPolicyLocation600DV.LienholdersLV.entry> get_Entries() {
        return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ClaimSnapshotPolicyLocation600PanelSet.ClaimSnapshotPolicyLocation600DV.LienholdersLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
      }
      
      public pcftest.ClaimSnapshotPolicyLocation600PanelSet.ClaimSnapshotPolicyLocation600DV.LienholdersLV._ListPaging get_ListPaging() {
        return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ClaimSnapshotPolicyLocation600PanelSet.ClaimSnapshotPolicyLocation600DV.LienholdersLV._ListPaging.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotPolicyLocation600PanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class LienholderHeader extends ValueElement {
        public LienholderHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotPolicyLocation600PanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class OwnerTypeHeader extends ValueElement {
        public OwnerTypeHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotPolicyLocation600PanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _ListPaging extends PagingElement {
        public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotPolicyLocation600PanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
        
        public pcftest.ClaimSnapshotPolicyLocation600PanelSet.ClaimSnapshotPolicyLocation600DV.LienholdersLV.entry._Select get_Select() {
          return getOrCreateProperty("_Select", "_Select", null, pcftest.ClaimSnapshotPolicyLocation600PanelSet.ClaimSnapshotPolicyLocation600DV.LienholdersLV.entry._Select.class);
        }
        
        public pcftest.ClaimSnapshotPolicyLocation600PanelSet.ClaimSnapshotPolicyLocation600DV.LienholdersLV.entry._ViewDetail get_ViewDetail() {
          return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ClaimSnapshotPolicyLocation600PanelSet.ClaimSnapshotPolicyLocation600DV.LienholdersLV.entry._ViewDetail.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotPolicyLocation600PanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class _Select extends SelectorCellElement {
          public _Select(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotPolicyLocation600PanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotPolicyLocation600PanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class LienholdersLV_tb extends PCFElement {
      public LienholdersLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotPolicyLocation600PanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ListedItemsLV extends PCFElement {
      public ListedItemsLV(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ItemDescriptionHeader getItemDescriptionHeader() {
        return getOrCreateProperty("ItemDescriptionHeader", "ItemDescriptionHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyLocation600PanelSet.ClaimSnapshotPolicyLocation600DV.ListedItemsLV.ItemDescriptionHeader.class);
      }
      
      public ItemValueHeader getItemValueHeader() {
        return getOrCreateProperty("ItemValueHeader", "ItemValueHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyLocation600PanelSet.ClaimSnapshotPolicyLocation600DV.ListedItemsLV.ItemValueHeader.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      @SuppressWarnings(value = "unchecked")
      public IteratorEntriesWithPaging<pcftest.ClaimSnapshotPolicyLocation600PanelSet.ClaimSnapshotPolicyLocation600DV.ListedItemsLV.entry> get_Entries() {
        return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ClaimSnapshotPolicyLocation600PanelSet.ClaimSnapshotPolicyLocation600DV.ListedItemsLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
      }
      
      public pcftest.ClaimSnapshotPolicyLocation600PanelSet.ClaimSnapshotPolicyLocation600DV.ListedItemsLV._ListPaging get_ListPaging() {
        return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ClaimSnapshotPolicyLocation600PanelSet.ClaimSnapshotPolicyLocation600DV.ListedItemsLV._ListPaging.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotPolicyLocation600PanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ItemDescriptionHeader extends ValueElement {
        public ItemDescriptionHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotPolicyLocation600PanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ItemValueHeader extends ValueElement {
        public ItemValueHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotPolicyLocation600PanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _ListPaging extends PagingElement {
        public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotPolicyLocation600PanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
        
        public pcftest.ClaimSnapshotPolicyLocation600PanelSet.ClaimSnapshotPolicyLocation600DV.ListedItemsLV.entry._Select get_Select() {
          return getOrCreateProperty("_Select", "_Select", null, pcftest.ClaimSnapshotPolicyLocation600PanelSet.ClaimSnapshotPolicyLocation600DV.ListedItemsLV.entry._Select.class);
        }
        
        public pcftest.ClaimSnapshotPolicyLocation600PanelSet.ClaimSnapshotPolicyLocation600DV.ListedItemsLV.entry._ViewDetail get_ViewDetail() {
          return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ClaimSnapshotPolicyLocation600PanelSet.ClaimSnapshotPolicyLocation600DV.ListedItemsLV.entry._ViewDetail.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotPolicyLocation600PanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class _Select extends SelectorCellElement {
          public _Select(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotPolicyLocation600PanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotPolicyLocation600PanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ListedItemsLV_tb extends PCFElement {
      public ListedItemsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotPolicyLocation600PanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotPolicyLocation600LDP extends PCFElement {
    public ClaimSnapshotPolicyLocation600LDP(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public CovTermsDetailTab getCovTermsDetailTab() {
      return getOrCreateProperty("CovTermsDetailTab", "CovTermsDetailTab", null, pcftest.ClaimSnapshotPolicyLocation600PanelSet.ClaimSnapshotPolicyLocation600LDP.CovTermsDetailTab.class);
    }
    
    public CovTermsLV getCovTermsLV() {
      return getOrCreateProperty("CovTermsLV", "CovTermsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimSnapshotPolicyLocation600PanelSet.ClaimSnapshotPolicyLocation600LDP.CovTermsLV.class);
    }
    
    public CovTermsLV_tb getCovTermsLV_tb() {
      return getOrCreateProperty("CovTermsLV_tb", "CovTermsLV_tb", null, pcftest.ClaimSnapshotPolicyLocation600PanelSet.ClaimSnapshotPolicyLocation600LDP.CovTermsLV_tb.class);
    }
    
    public CoveragesLV getCoveragesLV() {
      return getOrCreateProperty("CoveragesLV", "CoveragesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimSnapshotPolicyLocation600PanelSet.ClaimSnapshotPolicyLocation600LDP.CoveragesLV.class);
    }
    
    public CoveragesLV_tb getCoveragesLV_tb() {
      return getOrCreateProperty("CoveragesLV_tb", "CoveragesLV_tb", null, pcftest.ClaimSnapshotPolicyLocation600PanelSet.ClaimSnapshotPolicyLocation600LDP.CoveragesLV_tb.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotPolicyLocation600PanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CovTermsDetailTab extends ClickableActionElement {
      public CovTermsDetailTab(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotPolicyLocation600PanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CovTermsLV extends PCFElement {
      public CovTermsLV(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public AggregationModelHeader getAggregationModelHeader() {
        return getOrCreateProperty("AggregationModelHeader", "AggregationModelHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyLocation600PanelSet.ClaimSnapshotPolicyLocation600LDP.CovTermsLV.AggregationModelHeader.class);
      }
      
      public RestrictionModelHeader getRestrictionModelHeader() {
        return getOrCreateProperty("RestrictionModelHeader", "RestrictionModelHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyLocation600PanelSet.ClaimSnapshotPolicyLocation600LDP.CovTermsLV.RestrictionModelHeader.class);
      }
      
      public TypeHeader getTypeHeader() {
        return getOrCreateProperty("TypeHeader", "TypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyLocation600PanelSet.ClaimSnapshotPolicyLocation600LDP.CovTermsLV.TypeHeader.class);
      }
      
      public ValueHeader getValueHeader() {
        return getOrCreateProperty("ValueHeader", "ValueHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyLocation600PanelSet.ClaimSnapshotPolicyLocation600LDP.CovTermsLV.ValueHeader.class);
      }
      
      public ValueTypeHeader getValueTypeHeader() {
        return getOrCreateProperty("ValueTypeHeader", "ValueTypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyLocation600PanelSet.ClaimSnapshotPolicyLocation600LDP.CovTermsLV.ValueTypeHeader.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      @SuppressWarnings(value = "unchecked")
      public IteratorEntriesWithPaging<pcftest.ClaimSnapshotPolicyLocation600PanelSet.ClaimSnapshotPolicyLocation600LDP.CovTermsLV.entry> get_Entries() {
        return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ClaimSnapshotPolicyLocation600PanelSet.ClaimSnapshotPolicyLocation600LDP.CovTermsLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
      }
      
      public pcftest.ClaimSnapshotPolicyLocation600PanelSet.ClaimSnapshotPolicyLocation600LDP.CovTermsLV._ListPaging get_ListPaging() {
        return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ClaimSnapshotPolicyLocation600PanelSet.ClaimSnapshotPolicyLocation600LDP.CovTermsLV._ListPaging.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotPolicyLocation600PanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class AggregationModelHeader extends ValueElement {
        public AggregationModelHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotPolicyLocation600PanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class RestrictionModelHeader extends ValueElement {
        public RestrictionModelHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotPolicyLocation600PanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class TypeHeader extends ValueElement {
        public TypeHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotPolicyLocation600PanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ValueHeader extends ValueElement {
        public ValueHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotPolicyLocation600PanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ValueTypeHeader extends ValueElement {
        public ValueTypeHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotPolicyLocation600PanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _ListPaging extends PagingElement {
        public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotPolicyLocation600PanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
        
        public pcftest.ClaimSnapshotPolicyLocation600PanelSet.ClaimSnapshotPolicyLocation600LDP.CovTermsLV.entry._Select get_Select() {
          return getOrCreateProperty("_Select", "_Select", null, pcftest.ClaimSnapshotPolicyLocation600PanelSet.ClaimSnapshotPolicyLocation600LDP.CovTermsLV.entry._Select.class);
        }
        
        public pcftest.ClaimSnapshotPolicyLocation600PanelSet.ClaimSnapshotPolicyLocation600LDP.CovTermsLV.entry._ViewDetail get_ViewDetail() {
          return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ClaimSnapshotPolicyLocation600PanelSet.ClaimSnapshotPolicyLocation600LDP.CovTermsLV.entry._ViewDetail.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotPolicyLocation600PanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class _Select extends SelectorCellElement {
          public _Select(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotPolicyLocation600PanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotPolicyLocation600PanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CovTermsLV_tb extends PCFElement {
      public CovTermsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotPolicyLocation600PanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CoveragesLV extends PCFElement {
      public CoveragesLV(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public CoinsuranceHeader getCoinsuranceHeader() {
        return getOrCreateProperty("CoinsuranceHeader", "CoinsuranceHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyLocation600PanelSet.ClaimSnapshotPolicyLocation600LDP.CoveragesLV.CoinsuranceHeader.class);
      }
      
      public CoverageBasisHeader getCoverageBasisHeader() {
        return getOrCreateProperty("CoverageBasisHeader", "CoverageBasisHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyLocation600PanelSet.ClaimSnapshotPolicyLocation600LDP.CoveragesLV.CoverageBasisHeader.class);
      }
      
      public CoverageNotesHeader getCoverageNotesHeader() {
        return getOrCreateProperty("CoverageNotesHeader", "CoverageNotesHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyLocation600PanelSet.ClaimSnapshotPolicyLocation600LDP.CoveragesLV.CoverageNotesHeader.class);
      }
      
      public CoverageTypeHeader getCoverageTypeHeader() {
        return getOrCreateProperty("CoverageTypeHeader", "CoverageTypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyLocation600PanelSet.ClaimSnapshotPolicyLocation600LDP.CoveragesLV.CoverageTypeHeader.class);
      }
      
      public DeductibleHeader getDeductibleHeader() {
        return getOrCreateProperty("DeductibleHeader", "DeductibleHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyLocation600PanelSet.ClaimSnapshotPolicyLocation600LDP.CoveragesLV.DeductibleHeader.class);
      }
      
      public ExposureLimitHeader getExposureLimitHeader() {
        return getOrCreateProperty("ExposureLimitHeader", "ExposureLimitHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyLocation600PanelSet.ClaimSnapshotPolicyLocation600LDP.CoveragesLV.ExposureLimitHeader.class);
      }
      
      public IncidentLimitHeader getIncidentLimitHeader() {
        return getOrCreateProperty("IncidentLimitHeader", "IncidentLimitHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyLocation600PanelSet.ClaimSnapshotPolicyLocation600LDP.CoveragesLV.IncidentLimitHeader.class);
      }
      
      public LimitsIndicatorHeader getLimitsIndicatorHeader() {
        return getOrCreateProperty("LimitsIndicatorHeader", "LimitsIndicatorHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyLocation600PanelSet.ClaimSnapshotPolicyLocation600LDP.CoveragesLV.LimitsIndicatorHeader.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      @SuppressWarnings(value = "unchecked")
      public IteratorEntriesWithPaging<pcftest.ClaimSnapshotPolicyLocation600PanelSet.ClaimSnapshotPolicyLocation600LDP.CoveragesLV.entry> get_Entries() {
        return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ClaimSnapshotPolicyLocation600PanelSet.ClaimSnapshotPolicyLocation600LDP.CoveragesLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
      }
      
      public pcftest.ClaimSnapshotPolicyLocation600PanelSet.ClaimSnapshotPolicyLocation600LDP.CoveragesLV._ListPaging get_ListPaging() {
        return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ClaimSnapshotPolicyLocation600PanelSet.ClaimSnapshotPolicyLocation600LDP.CoveragesLV._ListPaging.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotPolicyLocation600PanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class CoinsuranceHeader extends ValueElement {
        public CoinsuranceHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotPolicyLocation600PanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class CoverageBasisHeader extends ValueElement {
        public CoverageBasisHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotPolicyLocation600PanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class CoverageNotesHeader extends ValueElement {
        public CoverageNotesHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotPolicyLocation600PanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class CoverageTypeHeader extends ValueElement {
        public CoverageTypeHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotPolicyLocation600PanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class DeductibleHeader extends ValueElement {
        public DeductibleHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotPolicyLocation600PanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ExposureLimitHeader extends ValueElement {
        public ExposureLimitHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotPolicyLocation600PanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class IncidentLimitHeader extends ValueElement {
        public IncidentLimitHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotPolicyLocation600PanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class LimitsIndicatorHeader extends ValueElement {
        public LimitsIndicatorHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotPolicyLocation600PanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _ListPaging extends PagingElement {
        public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotPolicyLocation600PanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
        
        public pcftest.ClaimSnapshotPolicyLocation600PanelSet.ClaimSnapshotPolicyLocation600LDP.CoveragesLV.entry._Select get_Select() {
          return getOrCreateProperty("_Select", "_Select", null, pcftest.ClaimSnapshotPolicyLocation600PanelSet.ClaimSnapshotPolicyLocation600LDP.CoveragesLV.entry._Select.class);
        }
        
        public pcftest.ClaimSnapshotPolicyLocation600PanelSet.ClaimSnapshotPolicyLocation600LDP.CoveragesLV.entry._ViewDetail get_ViewDetail() {
          return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ClaimSnapshotPolicyLocation600PanelSet.ClaimSnapshotPolicyLocation600LDP.CoveragesLV.entry._ViewDetail.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotPolicyLocation600PanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class _Select extends SelectorCellElement {
          public _Select(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotPolicyLocation600PanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotPolicyLocation600PanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CoveragesLV_tb extends PCFElement {
      public CoveragesLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    
  }
  
  
}