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
import pcftest.ClaimSnapshotFixedPropertyIncident600DV.PropertyLienholdersLV;
import pcftest.ClaimSnapshotFixedPropertyIncident600DV.PropertyLienholdersLV.LienholderHeader;
import pcftest.ClaimSnapshotFixedPropertyIncident600DV.PropertyLienholdersLV.OwnerTypeHeader;
import pcftest.ClaimSnapshotFixedPropertyIncident600DV.PropertyLienholdersLV._ListPaging;
import pcftest.ClaimSnapshotFixedPropertyIncident600DV.PropertyLienholdersLV.entry;
import pcftest.ClaimSnapshotFixedPropertyIncident600DV.PropertyLienholdersLV.entry._Select;
import pcftest.ClaimSnapshotFixedPropertyIncident600DV.PropertyLienholdersLV.entry._ViewDetail;
import pcftest.ClaimSnapshotFixedPropertyIncident600DV.PropertyLienholdersLV_tb;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotFixedPropertyIncident600DV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotFixedPropertyIncident600DV extends DetailViewElement {
  public final static String CHECKSUM = "e85cde654f992eb654e297018f8b4c14";
  
  public ClaimSnapshotFixedPropertyIncident600DV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public AddressSnapshot600InputSet getAddressSnapshot600InputSet() {
    return getOrCreateProperty("AddressSnapshot600InputSet", "AddressSnapshot600InputSet", null, pcftest.AddressSnapshot600InputSet.class);
  }
  
  public ValueElement getDescription() {
    return getOrCreateProperty("Description", "Description", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getEstimateCost() {
    return getOrCreateProperty("EstimateCost", "EstimateCost", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getEstimateTime() {
    return getOrCreateProperty("EstimateTime", "EstimateTime", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getEstimatedReceived() {
    return getOrCreateProperty("EstimatedReceived", "EstimatedReceived", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getInspectionRequired() {
    return getOrCreateProperty("InspectionRequired", "InspectionRequired", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getLossEstimate() {
    return getOrCreateProperty("LossEstimate", "LossEstimate", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getPropertyAttribute_ClassType() {
    return getOrCreateProperty("PropertyAttribute_ClassType", "PropertyAttribute_ClassType", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getPropertyAttribute_ExtWallMat() {
    return getOrCreateProperty("PropertyAttribute_ExtWallMat", "PropertyAttribute_ExtWallMat", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getPropertyAttribute_LossArea() {
    return getOrCreateProperty("PropertyAttribute_LossArea", "PropertyAttribute_LossArea", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getPropertyAttribute_NumSprinkOper() {
    return getOrCreateProperty("PropertyAttribute_NumSprinkOper", "PropertyAttribute_NumSprinkOper", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getPropertyAttribute_NumSprinkler() {
    return getOrCreateProperty("PropertyAttribute_NumSprinkler", "PropertyAttribute_NumSprinkler", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getPropertyAttribute_NumStories() {
    return getOrCreateProperty("PropertyAttribute_NumStories", "PropertyAttribute_NumStories", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getPropertyAttribute_RoofMaterial() {
    return getOrCreateProperty("PropertyAttribute_RoofMaterial", "PropertyAttribute_RoofMaterial", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getPropertyAttribute_SprinkRetServ() {
    return getOrCreateProperty("PropertyAttribute_SprinkRetServ", "PropertyAttribute_SprinkRetServ", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getPropertyAttribute_SprinklerType() {
    return getOrCreateProperty("PropertyAttribute_SprinklerType", "PropertyAttribute_SprinklerType", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getPropertyDescription() {
    return getOrCreateProperty("PropertyDescription", "PropertyDescription", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public PropertyLienholdersLV getPropertyLienholdersLV() {
    return getOrCreateProperty("PropertyLienholdersLV", "PropertyLienholdersLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimSnapshotFixedPropertyIncident600DV.PropertyLienholdersLV.class);
  }
  
  public PropertyLienholdersLV_tb getPropertyLienholdersLV_tb() {
    return getOrCreateProperty("PropertyLienholdersLV_tb", "PropertyLienholdersLV_tb", null, pcftest.ClaimSnapshotFixedPropertyIncident600DV.PropertyLienholdersLV_tb.class);
  }
  
  public ValueElement getWhenToView() {
    return getOrCreateProperty("WhenToView", "WhenToView", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotFixedPropertyIncident600DV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PropertyLienholdersLV extends PCFElement {
    public PropertyLienholdersLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public LienholderHeader getLienholderHeader() {
      return getOrCreateProperty("LienholderHeader", "LienholderHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotFixedPropertyIncident600DV.PropertyLienholdersLV.LienholderHeader.class);
    }
    
    public OwnerTypeHeader getOwnerTypeHeader() {
      return getOrCreateProperty("OwnerTypeHeader", "OwnerTypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotFixedPropertyIncident600DV.PropertyLienholdersLV.OwnerTypeHeader.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ClaimSnapshotFixedPropertyIncident600DV.PropertyLienholdersLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public _ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ClaimSnapshotFixedPropertyIncident600DV.PropertyLienholdersLV._ListPaging.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotFixedPropertyIncident600DV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class LienholderHeader extends ValueElement {
      public LienholderHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotFixedPropertyIncident600DV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class OwnerTypeHeader extends ValueElement {
      public OwnerTypeHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotFixedPropertyIncident600DV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotFixedPropertyIncident600DV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
      
      public _Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.ClaimSnapshotFixedPropertyIncident600DV.PropertyLienholdersLV.entry._Select.class);
      }
      
      public _ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ClaimSnapshotFixedPropertyIncident600DV.PropertyLienholdersLV.entry._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotFixedPropertyIncident600DV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotFixedPropertyIncident600DV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotFixedPropertyIncident600DV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PropertyLienholdersLV_tb extends PCFElement {
    public PropertyLienholdersLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  
}