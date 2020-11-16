package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.CheckboxValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.IteratorEntries;
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
import pcftest.ClaimSnapshotDwellingIncidentCV_600.DamageDV;
import pcftest.ClaimSnapshotDwellingIncidentCV_600.DamageDV.DamageTypesIterator;
import pcftest.ClaimSnapshotDwellingIncidentCV_600.DamageDV.NumberOfRoomsHeader;
import pcftest.ClaimSnapshotDwellingIncidentCV_600.DamageDV.RoomTypeHeader;
import pcftest.ClaimSnapshotDwellingIncidentCV_600.DamageDV._ListPaging;
import pcftest.ClaimSnapshotDwellingIncidentCV_600.DamageDV.entry._Select;
import pcftest.ClaimSnapshotDwellingIncidentCV_600.DamageDV.entry._ViewDetail;
import pcftest.ClaimSnapshotDwellingIncidentCV_600.DebrisRemovalInputSet;
import pcftest.ClaimSnapshotDwellingIncidentCV_600.Dwelling_AssessmentCardTab;
import pcftest.ClaimSnapshotDwellingIncidentCV_600.Dwelling_DetailsCardTab;
import pcftest.ClaimSnapshotDwellingIncidentCV_600.EMSInputSet;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotDwellingIncidentCV.600.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotDwellingIncidentCV_600 extends ClaimSnapshotDwellingIncidentCV {
  public final static String CHECKSUM = "f0d3890d6e2618089aabeac21f5d3b20";
  
  public ClaimSnapshotDwellingIncidentCV_600(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getAddress() {
    return getOrCreateProperty("Address", "Address", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ClaimSnapshotIncidentAssessDV_600 getClaimSnapshotIncidentAssessDV_600() {
    return getOrCreateProperty("ClaimSnapshotIncidentAssessDV_600", "ClaimSnapshotIncidentAssessDV", null, pcftest.ClaimSnapshotIncidentAssessDV_600.class);
  }
  
  public ClaimSnapshotIncidentAssessDV_700 getClaimSnapshotIncidentAssessDV_700() {
    return getOrCreateProperty("ClaimSnapshotIncidentAssessDV_700", "ClaimSnapshotIncidentAssessDV", null, pcftest.ClaimSnapshotIncidentAssessDV_700.class);
  }
  
  public ClaimSnapshotIncidentAssessDV_800 getClaimSnapshotIncidentAssessDV_800() {
    return getOrCreateProperty("ClaimSnapshotIncidentAssessDV_800", "ClaimSnapshotIncidentAssessDV", null, pcftest.ClaimSnapshotIncidentAssessDV_800.class);
  }
  
  public ClaimSnapshotIncidentAssessDV_default getClaimSnapshotIncidentAssessDV_default() {
    return getOrCreateProperty("ClaimSnapshotIncidentAssessDV_default", "ClaimSnapshotIncidentAssessDV", null, pcftest.ClaimSnapshotIncidentAssessDV_default.class);
  }
  
  public ClaimSnapshotIncidentRelatedExposuresPanelSet_600 getClaimSnapshotIncidentRelatedExposuresPanelSet_600() {
    return getOrCreateProperty("ClaimSnapshotIncidentRelatedExposuresPanelSet_600", "ClaimSnapshotIncidentRelatedExposuresPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.ClaimSnapshotIncidentRelatedExposuresPanelSet_600.class);
  }
  
  public ClaimSnapshotIncidentRelatedExposuresPanelSet_700 getClaimSnapshotIncidentRelatedExposuresPanelSet_700() {
    return getOrCreateProperty("ClaimSnapshotIncidentRelatedExposuresPanelSet_700", "ClaimSnapshotIncidentRelatedExposuresPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.ClaimSnapshotIncidentRelatedExposuresPanelSet_700.class);
  }
  
  public ClaimSnapshotIncidentRelatedExposuresPanelSet_800 getClaimSnapshotIncidentRelatedExposuresPanelSet_800() {
    return getOrCreateProperty("ClaimSnapshotIncidentRelatedExposuresPanelSet_800", "ClaimSnapshotIncidentRelatedExposuresPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.ClaimSnapshotIncidentRelatedExposuresPanelSet_800.class);
  }
  
  public ClaimSnapshotIncidentRelatedExposuresPanelSet_default getClaimSnapshotIncidentRelatedExposuresPanelSet_default() {
    return getOrCreateProperty("ClaimSnapshotIncidentRelatedExposuresPanelSet_default", "ClaimSnapshotIncidentRelatedExposuresPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.ClaimSnapshotIncidentRelatedExposuresPanelSet_default.class);
  }
  
  public DamageDV getDamageDV() {
    return getOrCreateProperty("DamageDV", "DamageDV", null, pcftest.ClaimSnapshotDwellingIncidentCV_600.DamageDV.class);
  }
  
  public DebrisRemovalInputSet getDebrisRemovalInputSet() {
    return getOrCreateProperty("DebrisRemovalInputSet", "DebrisRemovalInputSet", null, pcftest.ClaimSnapshotDwellingIncidentCV_600.DebrisRemovalInputSet.class);
  }
  
  public ValueElement getDwellingAttribute_ClassType() {
    return getOrCreateProperty("DwellingAttribute_ClassType", "DwellingAttribute_ClassType", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getDwellingAttribute_ExtWallMat() {
    return getOrCreateProperty("DwellingAttribute_ExtWallMat", "DwellingAttribute_ExtWallMat", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getDwellingAttribute_LossArea() {
    return getOrCreateProperty("DwellingAttribute_LossArea", "DwellingAttribute_LossArea", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getDwellingAttribute_NumSprinkOper() {
    return getOrCreateProperty("DwellingAttribute_NumSprinkOper", "DwellingAttribute_NumSprinkOper", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getDwellingAttribute_NumSprinkler() {
    return getOrCreateProperty("DwellingAttribute_NumSprinkler", "DwellingAttribute_NumSprinkler", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getDwellingAttribute_NumStories() {
    return getOrCreateProperty("DwellingAttribute_NumStories", "DwellingAttribute_NumStories", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getDwellingAttribute_NumberOfPeopleOnPolicy() {
    return getOrCreateProperty("DwellingAttribute_NumberOfPeopleOnPolicy", "DwellingAttribute_NumberOfPeopleOnPolicy", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getDwellingAttribute_RoofMaterial() {
    return getOrCreateProperty("DwellingAttribute_RoofMaterial", "DwellingAttribute_RoofMaterial", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getDwellingAttribute_SprinkRetServ() {
    return getOrCreateProperty("DwellingAttribute_SprinkRetServ", "DwellingAttribute_SprinkRetServ", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getDwellingAttribute_SprinklerType() {
    return getOrCreateProperty("DwellingAttribute_SprinklerType", "DwellingAttribute_SprinklerType", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getDwellingAttribute_YearsInHome() {
    return getOrCreateProperty("DwellingAttribute_YearsInHome", "DwellingAttribute_YearsInHome", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Dwelling_AssessmentCardTab getDwelling_AssessmentCardTab() {
    return getOrCreateProperty("Dwelling_AssessmentCardTab", "Dwelling_AssessmentCardTab", null, pcftest.ClaimSnapshotDwellingIncidentCV_600.Dwelling_AssessmentCardTab.class);
  }
  
  public Dwelling_DetailsCardTab getDwelling_DetailsCardTab() {
    return getOrCreateProperty("Dwelling_DetailsCardTab", "Dwelling_DetailsCardTab", null, pcftest.ClaimSnapshotDwellingIncidentCV_600.Dwelling_DetailsCardTab.class);
  }
  
  public EMSInputSet getEMSInputSet() {
    return getOrCreateProperty("EMSInputSet", "EMSInputSet", null, pcftest.ClaimSnapshotDwellingIncidentCV_600.EMSInputSet.class);
  }
  
  public ValueElement getLossLocation_Hazard() {
    return getOrCreateProperty("LossLocation_Hazard", "LossLocation_Hazard", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getLossLocation_Mold() {
    return getOrCreateProperty("LossLocation_Mold", "LossLocation_Mold", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getOccupancyType() {
    return getOrCreateProperty("OccupancyType", "OccupancyType", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getPropertySize() {
    return getOrCreateProperty("PropertySize", "PropertySize", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public DateElement getYearBuilt() {
    return getOrCreateProperty("YearBuilt", "YearBuilt", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotDwellingIncidentCV.600.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DamageDV extends DetailViewElement {
    public DamageDV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getAlreadyRepaired() {
      return getOrCreateProperty("AlreadyRepaired", "AlreadyRepaired", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public DamageTypesIterator getDamageTypesIterator() {
      return getOrCreateProperty("DamageTypesIterator", "DamageTypesIterator", null, pcftest.ClaimSnapshotDwellingIncidentCV_600.DamageDV.DamageTypesIterator.class);
    }
    
    public ValueElement getDamageTypesLabel() {
      return getOrCreateProperty("DamageTypesLabel", "DamageTypesLabel", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getDamagedAreaSize() {
      return getOrCreateProperty("DamagedAreaSize", "DamagedAreaSize", null, gw.smoketest.platform.web.ValueElement.class);
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
    
    public ValueElement getLossEstimate() {
      return getOrCreateProperty("LossEstimate", "LossEstimate", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getMaterialsDamaged() {
      return getOrCreateProperty("MaterialsDamaged", "MaterialsDamaged", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public NumberOfRoomsHeader getNumberOfRoomsHeader() {
      return getOrCreateProperty("NumberOfRoomsHeader", "NumberOfRoomsHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotDwellingIncidentCV_600.DamageDV.NumberOfRoomsHeader.class);
    }
    
    public ValueElement getPropertyDescription() {
      return getOrCreateProperty("PropertyDescription", "PropertyDescription", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public RoomTypeHeader getRoomTypeHeader() {
      return getOrCreateProperty("RoomTypeHeader", "RoomTypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotDwellingIncidentCV_600.DamageDV.RoomTypeHeader.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<pcftest.ClaimSnapshotDwellingIncidentCV_600.DamageDV.entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ClaimSnapshotDwellingIncidentCV_600.DamageDV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public _ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ClaimSnapshotDwellingIncidentCV_600.DamageDV._ListPaging.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotDwellingIncidentCV.600.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class DamageTypesIterator extends PCFElement {
      public DamageTypesIterator(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      @SuppressWarnings(value = "unchecked")
      public IteratorEntries<pcftest.ClaimSnapshotDwellingIncidentCV_600.DamageDV.DamageTypesIterator.entry> get_Entries() {
        return getOrCreateEntries(null, pcftest.ClaimSnapshotDwellingIncidentCV_600.DamageDV.DamageTypesIterator.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotDwellingIncidentCV.600.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class entry extends PCFElement {
        public entry(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public CheckboxValueElement getDamage() {
          return getOrCreateProperty("Damage", "Damage", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotDwellingIncidentCV.600.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class NumberOfRoomsHeader extends ValueElement {
      public NumberOfRoomsHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotDwellingIncidentCV.600.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class RoomTypeHeader extends ValueElement {
      public RoomTypeHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotDwellingIncidentCV.600.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotDwellingIncidentCV.600.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends RowElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ValueElement getNumberOfRooms() {
        return getOrCreateProperty("NumberOfRooms", "NumberOfRooms", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getRoomType() {
        return getOrCreateProperty("RoomType", "RoomType", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      public _Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.ClaimSnapshotDwellingIncidentCV_600.DamageDV.entry._Select.class);
      }
      
      public _ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ClaimSnapshotDwellingIncidentCV_600.DamageDV.entry._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotDwellingIncidentCV.600.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotDwellingIncidentCV.600.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotDwellingIncidentCV.600.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DebrisRemovalInputSet extends PCFElement {
    public DebrisRemovalInputSet(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getEMSVendor() {
      return getOrCreateProperty("EMSVendor", "EMSVendor", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotDwellingIncidentCV.600.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Dwelling_AssessmentCardTab extends ClickableActionElement {
    public Dwelling_AssessmentCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotDwellingIncidentCV.600.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Dwelling_DetailsCardTab extends ClickableActionElement {
    public Dwelling_DetailsCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotDwellingIncidentCV.600.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EMSInputSet extends PCFElement {
    public EMSInputSet(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getEMSVendor() {
      return getOrCreateProperty("EMSVendor", "EMSVendor", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    
  }
  
  
}