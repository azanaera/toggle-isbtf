package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.CheckboxValueElement;
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
import pcftest.ClaimSnapshotGeneralPR800PanelSet_Homeowners.DwellingInputSet;
import pcftest.ClaimSnapshotGeneralPR800PanelSet_Homeowners.DwellingInputSet.NumberOfRoomsHeader;
import pcftest.ClaimSnapshotGeneralPR800PanelSet_Homeowners.DwellingInputSet.RoomTypeHeader;
import pcftest.ClaimSnapshotGeneralPR800PanelSet_Homeowners.LivingExpensesInputSet;
import pcftest.ClaimSnapshotGeneralPR800PanelSet_Homeowners.LossDetailsDV;
import pcftest.ClaimSnapshotGeneralPR800PanelSet_Homeowners.MetroReportsLV;
import pcftest.ClaimSnapshotGeneralPR800PanelSet_Homeowners.MetroReportsLV.MetroReportOrderDateHeader;
import pcftest.ClaimSnapshotGeneralPR800PanelSet_Homeowners.MetroReportsLV.MetroReportStatusHeader;
import pcftest.ClaimSnapshotGeneralPR800PanelSet_Homeowners.MetroReportsLV.MetroReportTypeHeader;
import pcftest.ClaimSnapshotGeneralPR800PanelSet_Homeowners.MetroReportsLV_tb;
import pcftest.ClaimSnapshotGeneralPR800PanelSet_Homeowners.OfficialsLV;
import pcftest.ClaimSnapshotGeneralPR800PanelSet_Homeowners.OfficialsLV.NameHeader;
import pcftest.ClaimSnapshotGeneralPR800PanelSet_Homeowners.OfficialsLV.ReportNumberHeader;
import pcftest.ClaimSnapshotGeneralPR800PanelSet_Homeowners.OfficialsLV.TypeHeader;
import pcftest.ClaimSnapshotGeneralPR800PanelSet_Homeowners.OfficialsLV_tb;
import pcftest.ClaimSnapshotGeneralPR800PanelSet_Homeowners.OtherIncidentsPanelSet;
import pcftest.ClaimSnapshotGeneralPR800PanelSet_Homeowners.OtherIncidentsPanelSet.InjuryIncidentIterator;
import pcftest.ClaimSnapshotGeneralPR800PanelSet_Homeowners.OtherIncidentsPanelSet.InjuryIncidentIterator.entry.InjuryIncidentDV;
import pcftest.ClaimSnapshotGeneralPR800PanelSet_Homeowners.OtherIncidentsPanelSet.InjuryIncidentIterator.entry.InjuryIncidentDV.InjuredName;
import pcftest.ClaimSnapshotGeneralPR800PanelSet_Homeowners.OtherIncidentsPanelSet.PropertyIncidentIterator;
import pcftest.ClaimSnapshotGeneralPR800PanelSet_Homeowners.OtherIncidentsPanelSet.PropertyIncidentIterator.entry.PropertyIncidentDV;
import pcftest.ClaimSnapshotGeneralPR800PanelSet_Homeowners.OtherIncidentsPanelSet.PropertyIncidentIterator.entry.PropertyIncidentDV.PropertyName;
import pcftest.ClaimSnapshotGeneralPR800PanelSet_Homeowners.OtherStructureInputSet;
import pcftest.ClaimSnapshotGeneralPR800PanelSet_Homeowners.PropertyContentsInputSet;
import pcftest.ClaimSnapshotGeneralPR800PanelSet_Homeowners.WitnessesLV;
import pcftest.ClaimSnapshotGeneralPR800PanelSet_Homeowners.WitnessesLV.ContactHeader;
import pcftest.ClaimSnapshotGeneralPR800PanelSet_Homeowners.WitnessesLV.WitnessPerspectiveHeader;
import pcftest.ClaimSnapshotGeneralPR800PanelSet_Homeowners.WitnessesLV.WitnessStatementHeader;
import pcftest.ClaimSnapshotGeneralPR800PanelSet_Homeowners.WitnessesLV_tb;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotGeneralPR800PanelSet.Homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotGeneralPR800PanelSet_Homeowners extends ClaimSnapshotGeneralPR800PanelSet {
  public final static String CHECKSUM = "05a8a64eabec041bd1f21de938c79d73";
  
  public ClaimSnapshotGeneralPR800PanelSet_Homeowners(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public BooleanValueElement getArsonInvolved() {
    return getOrCreateProperty("ArsonInvolved", "ArsonInvolved", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public ValueElement getClaimPermissionRequired() {
    return getOrCreateProperty("ClaimPermissionRequired", "ClaimPermissionRequired", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public DwellingInputSet getDwellingInputSet() {
    return getOrCreateProperty("DwellingInputSet", "DwellingInputSet", null, pcftest.ClaimSnapshotGeneralPR800PanelSet_Homeowners.DwellingInputSet.class);
  }
  
  public BooleanValueElement getFireDeptResponded() {
    return getOrCreateProperty("FireDeptResponded", "FireDeptResponded", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public ValueElement getFireSource() {
    return getOrCreateProperty("FireSource", "FireSource", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public BooleanValueElement getHasWaterBeenTurnedOff() {
    return getOrCreateProperty("HasWaterBeenTurnedOff", "HasWaterBeenTurnedOff", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public ValueElement getHowWasFireDiscovered() {
    return getOrCreateProperty("HowWasFireDiscovered", "HowWasFireDiscovered", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public BooleanValueElement getIsAnyoneInjured() {
    return getOrCreateProperty("IsAnyoneInjured", "IsAnyoneInjured", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public BooleanValueElement getIsHomeHabitable() {
    return getOrCreateProperty("IsHomeHabitable", "IsHomeHabitable", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public BooleanValueElement getIsHomeSecure() {
    return getOrCreateProperty("IsHomeSecure", "IsHomeSecure", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public BooleanValueElement getIsRoofCovered() {
    return getOrCreateProperty("IsRoofCovered", "IsRoofCovered", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public LivingExpensesInputSet getLivingExpensesInputSet() {
    return getOrCreateProperty("LivingExpensesInputSet", "LivingExpensesInputSet", null, pcftest.ClaimSnapshotGeneralPR800PanelSet_Homeowners.LivingExpensesInputSet.class);
  }
  
  public LossDetailsDV getLossDetailsDV() {
    return getOrCreateProperty("LossDetailsDV", "LossDetailsDV", null, pcftest.ClaimSnapshotGeneralPR800PanelSet_Homeowners.LossDetailsDV.class);
  }
  
  public MetroReportsLV getMetroReportsLV() {
    return getOrCreateProperty("MetroReportsLV", "MetroReportsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimSnapshotGeneralPR800PanelSet_Homeowners.MetroReportsLV.class);
  }
  
  public MetroReportsLV_tb getMetroReportsLV_tb() {
    return getOrCreateProperty("MetroReportsLV_tb", "MetroReportsLV_tb", null, pcftest.ClaimSnapshotGeneralPR800PanelSet_Homeowners.MetroReportsLV_tb.class);
  }
  
  public ValueElement getNotification_Fault() {
    return getOrCreateProperty("Notification_Fault", "Notification_Fault", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public OfficialsLV getOfficialsLV() {
    return getOrCreateProperty("OfficialsLV", "OfficialsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimSnapshotGeneralPR800PanelSet_Homeowners.OfficialsLV.class);
  }
  
  public OfficialsLV_tb getOfficialsLV_tb() {
    return getOrCreateProperty("OfficialsLV_tb", "OfficialsLV_tb", null, pcftest.ClaimSnapshotGeneralPR800PanelSet_Homeowners.OfficialsLV_tb.class);
  }
  
  public OtherIncidentsPanelSet getOtherIncidentsPanelSet() {
    return getOrCreateProperty("OtherIncidentsPanelSet", "OtherIncidentsPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.ClaimSnapshotGeneralPR800PanelSet_Homeowners.OtherIncidentsPanelSet.class);
  }
  
  public OtherStructureInputSet getOtherStructureInputSet() {
    return getOrCreateProperty("OtherStructureInputSet", "OtherStructureInputSet", null, pcftest.ClaimSnapshotGeneralPR800PanelSet_Homeowners.OtherStructureInputSet.class);
  }
  
  public PropertyContentsInputSet getPropertyContentsInputSet() {
    return getOrCreateProperty("PropertyContentsInputSet", "PropertyContentsInputSet", null, pcftest.ClaimSnapshotGeneralPR800PanelSet_Homeowners.PropertyContentsInputSet.class);
  }
  
  public BooleanValueElement getSmokeDamageOnly() {
    return getOrCreateProperty("SmokeDamageOnly", "SmokeDamageOnly", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public ValueElement getWaterSource() {
    return getOrCreateProperty("WaterSource", "WaterSource", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public WitnessesLV getWitnessesLV() {
    return getOrCreateProperty("WitnessesLV", "WitnessesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimSnapshotGeneralPR800PanelSet_Homeowners.WitnessesLV.class);
  }
  
  public WitnessesLV_tb getWitnessesLV_tb() {
    return getOrCreateProperty("WitnessesLV_tb", "WitnessesLV_tb", null, pcftest.ClaimSnapshotGeneralPR800PanelSet_Homeowners.WitnessesLV_tb.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotGeneralPR800PanelSet.Homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DwellingInputSet extends PCFElement {
    public DwellingInputSet(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public BooleanValueElement getDwellingAlreadyRepaired() {
      return getOrCreateProperty("DwellingAlreadyRepaired", "DwellingAlreadyRepaired", null, gw.smoketest.platform.web.BooleanValueElement.class);
    }
    
    public ValueElement getDwellingDamageDescription() {
      return getOrCreateProperty("DwellingDamageDescription", "DwellingDamageDescription", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public BooleanValueElement getDwellingEstimateReceived() {
      return getOrCreateProperty("DwellingEstimateReceived", "DwellingEstimateReceived", null, gw.smoketest.platform.web.BooleanValueElement.class);
    }
    
    public ValueElement getDwellingLimit() {
      return getOrCreateProperty("DwellingLimit", "DwellingLimit", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getDwellingMaterialsDamaged() {
      return getOrCreateProperty("DwellingMaterialsDamaged", "DwellingMaterialsDamaged", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public NumberOfRoomsHeader getNumberOfRoomsHeader() {
      return getOrCreateProperty("NumberOfRoomsHeader", "NumberOfRoomsHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotGeneralPR800PanelSet_Homeowners.DwellingInputSet.NumberOfRoomsHeader.class);
    }
    
    public RoomTypeHeader getRoomTypeHeader() {
      return getOrCreateProperty("RoomTypeHeader", "RoomTypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotGeneralPR800PanelSet_Homeowners.DwellingInputSet.RoomTypeHeader.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<pcftest.ClaimSnapshotGeneralPR800PanelSet_Homeowners.DwellingInputSet.entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ClaimSnapshotGeneralPR800PanelSet_Homeowners.DwellingInputSet.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public pcftest.ClaimSnapshotGeneralPR800PanelSet_Homeowners.DwellingInputSet._ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ClaimSnapshotGeneralPR800PanelSet_Homeowners.DwellingInputSet._ListPaging.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotGeneralPR800PanelSet.Homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class NumberOfRoomsHeader extends ValueElement {
      public NumberOfRoomsHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotGeneralPR800PanelSet.Homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class RoomTypeHeader extends ValueElement {
      public RoomTypeHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotGeneralPR800PanelSet.Homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotGeneralPR800PanelSet.Homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
      
      public pcftest.ClaimSnapshotGeneralPR800PanelSet_Homeowners.DwellingInputSet.entry._Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.ClaimSnapshotGeneralPR800PanelSet_Homeowners.DwellingInputSet.entry._Select.class);
      }
      
      public pcftest.ClaimSnapshotGeneralPR800PanelSet_Homeowners.DwellingInputSet.entry._ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ClaimSnapshotGeneralPR800PanelSet_Homeowners.DwellingInputSet.entry._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotGeneralPR800PanelSet.Homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotGeneralPR800PanelSet.Homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotGeneralPR800PanelSet.Homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LivingExpensesInputSet extends PCFElement {
    public LivingExpensesInputSet(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getLivingExpensesDescription() {
      return getOrCreateProperty("LivingExpensesDescription", "LivingExpensesDescription", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getLossOfUseLimit() {
      return getOrCreateProperty("LossOfUseLimit", "LossOfUseLimit", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotGeneralPR800PanelSet.Homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LossDetailsDV extends DetailViewElement {
    public LossDetailsDV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getCatastropheNumber() {
      return getOrCreateProperty("CatastropheNumber", "CatastropheNumber", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getDescription() {
      return getOrCreateProperty("Description", "Description", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public CheckboxValueElement getIncidentReport() {
      return getOrCreateProperty("IncidentReport", "IncidentReport", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
    }
    
    public ValueElement getLocationOfTheft() {
      return getOrCreateProperty("LocationOfTheft", "LocationOfTheft", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getLossCause() {
      return getOrCreateProperty("LossCause", "LossCause", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public DateElement getLossDate() {
      return getOrCreateProperty("LossDate", "LossDate", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public ValueElement getLossLocation() {
      return getOrCreateProperty("LossLocation", "LossLocation", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public BooleanValueElement getWeatherRelated() {
      return getOrCreateProperty("WeatherRelated", "WeatherRelated", null, gw.smoketest.platform.web.BooleanValueElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntries<pcftest.ClaimSnapshotGeneralPR800PanelSet_Homeowners.LossDetailsDV.entry> get_Entries() {
      return getOrCreateEntries(null, pcftest.ClaimSnapshotGeneralPR800PanelSet_Homeowners.LossDetailsDV.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotGeneralPR800PanelSet.Homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends PCFElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public CheckboxValueElement getDamageTypeChecked() {
        return getOrCreateProperty("DamageTypeChecked", "DamageTypeChecked", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotGeneralPR800PanelSet.Homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MetroReportsLV extends PCFElement {
    public MetroReportsLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public MetroReportOrderDateHeader getMetroReportOrderDateHeader() {
      return getOrCreateProperty("MetroReportOrderDateHeader", "MetroReportOrderDateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotGeneralPR800PanelSet_Homeowners.MetroReportsLV.MetroReportOrderDateHeader.class);
    }
    
    public MetroReportStatusHeader getMetroReportStatusHeader() {
      return getOrCreateProperty("MetroReportStatusHeader", "MetroReportStatusHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotGeneralPR800PanelSet_Homeowners.MetroReportsLV.MetroReportStatusHeader.class);
    }
    
    public MetroReportTypeHeader getMetroReportTypeHeader() {
      return getOrCreateProperty("MetroReportTypeHeader", "MetroReportTypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotGeneralPR800PanelSet_Homeowners.MetroReportsLV.MetroReportTypeHeader.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<pcftest.ClaimSnapshotGeneralPR800PanelSet_Homeowners.MetroReportsLV.entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ClaimSnapshotGeneralPR800PanelSet_Homeowners.MetroReportsLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public pcftest.ClaimSnapshotGeneralPR800PanelSet_Homeowners.MetroReportsLV._ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ClaimSnapshotGeneralPR800PanelSet_Homeowners.MetroReportsLV._ListPaging.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotGeneralPR800PanelSet.Homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class MetroReportOrderDateHeader extends ValueElement {
      public MetroReportOrderDateHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotGeneralPR800PanelSet.Homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class MetroReportStatusHeader extends ValueElement {
      public MetroReportStatusHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotGeneralPR800PanelSet.Homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class MetroReportTypeHeader extends ValueElement {
      public MetroReportTypeHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotGeneralPR800PanelSet.Homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotGeneralPR800PanelSet.Homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends RowElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public DateElement getMetroReportOrderDate() {
        return getOrCreateProperty("MetroReportOrderDate", "MetroReportOrderDate", null, gw.smoketest.platform.web.DateElement.class);
      }
      
      public ValueElement getMetroReportStatus() {
        return getOrCreateProperty("MetroReportStatus", "MetroReportStatus", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getMetroReportType() {
        return getOrCreateProperty("MetroReportType", "MetroReportType", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      public pcftest.ClaimSnapshotGeneralPR800PanelSet_Homeowners.MetroReportsLV.entry._Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.ClaimSnapshotGeneralPR800PanelSet_Homeowners.MetroReportsLV.entry._Select.class);
      }
      
      public pcftest.ClaimSnapshotGeneralPR800PanelSet_Homeowners.MetroReportsLV.entry._ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ClaimSnapshotGeneralPR800PanelSet_Homeowners.MetroReportsLV.entry._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotGeneralPR800PanelSet.Homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotGeneralPR800PanelSet.Homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotGeneralPR800PanelSet.Homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MetroReportsLV_tb extends PCFElement {
    public MetroReportsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotGeneralPR800PanelSet.Homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class OfficialsLV extends PCFElement {
    public OfficialsLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public NameHeader getNameHeader() {
      return getOrCreateProperty("NameHeader", "NameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotGeneralPR800PanelSet_Homeowners.OfficialsLV.NameHeader.class);
    }
    
    public ReportNumberHeader getReportNumberHeader() {
      return getOrCreateProperty("ReportNumberHeader", "ReportNumberHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotGeneralPR800PanelSet_Homeowners.OfficialsLV.ReportNumberHeader.class);
    }
    
    public TypeHeader getTypeHeader() {
      return getOrCreateProperty("TypeHeader", "TypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotGeneralPR800PanelSet_Homeowners.OfficialsLV.TypeHeader.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<pcftest.ClaimSnapshotGeneralPR800PanelSet_Homeowners.OfficialsLV.entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ClaimSnapshotGeneralPR800PanelSet_Homeowners.OfficialsLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public pcftest.ClaimSnapshotGeneralPR800PanelSet_Homeowners.OfficialsLV._ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ClaimSnapshotGeneralPR800PanelSet_Homeowners.OfficialsLV._ListPaging.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotGeneralPR800PanelSet.Homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class NameHeader extends ValueElement {
      public NameHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotGeneralPR800PanelSet.Homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ReportNumberHeader extends ValueElement {
      public ReportNumberHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotGeneralPR800PanelSet.Homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class TypeHeader extends ValueElement {
      public TypeHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotGeneralPR800PanelSet.Homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotGeneralPR800PanelSet.Homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends RowElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ValueElement getName() {
        return getOrCreateProperty("Name", "Name", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getReportNumber() {
        return getOrCreateProperty("ReportNumber", "ReportNumber", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getType() {
        return getOrCreateProperty("Type", "Type", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      public pcftest.ClaimSnapshotGeneralPR800PanelSet_Homeowners.OfficialsLV.entry._Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.ClaimSnapshotGeneralPR800PanelSet_Homeowners.OfficialsLV.entry._Select.class);
      }
      
      public pcftest.ClaimSnapshotGeneralPR800PanelSet_Homeowners.OfficialsLV.entry._ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ClaimSnapshotGeneralPR800PanelSet_Homeowners.OfficialsLV.entry._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotGeneralPR800PanelSet.Homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotGeneralPR800PanelSet.Homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotGeneralPR800PanelSet.Homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class OfficialsLV_tb extends PCFElement {
    public OfficialsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotGeneralPR800PanelSet.Homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class OtherIncidentsPanelSet extends PCFElement {
    public OtherIncidentsPanelSet(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public InjuryIncidentIterator getInjuryIncidentIterator() {
      return getOrCreateProperty("InjuryIncidentIterator", "InjuryIncidentIterator", null, pcftest.ClaimSnapshotGeneralPR800PanelSet_Homeowners.OtherIncidentsPanelSet.InjuryIncidentIterator.class);
    }
    
    public PropertyIncidentIterator getPropertyIncidentIterator() {
      return getOrCreateProperty("PropertyIncidentIterator", "PropertyIncidentIterator", null, pcftest.ClaimSnapshotGeneralPR800PanelSet_Homeowners.OtherIncidentsPanelSet.PropertyIncidentIterator.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotGeneralPR800PanelSet.Homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class InjuryIncidentIterator extends PCFElement {
      public InjuryIncidentIterator(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      @SuppressWarnings(value = "unchecked")
      public IteratorEntries<pcftest.ClaimSnapshotGeneralPR800PanelSet_Homeowners.OtherIncidentsPanelSet.InjuryIncidentIterator.entry> get_Entries() {
        return getOrCreateEntries(null, pcftest.ClaimSnapshotGeneralPR800PanelSet_Homeowners.OtherIncidentsPanelSet.InjuryIncidentIterator.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotGeneralPR800PanelSet.Homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class entry extends PCFElement {
        public entry(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public InjuryIncidentDV getInjuryIncidentDV() {
          return getOrCreateProperty("InjuryIncidentDV", "InjuryIncidentDV", null, pcftest.ClaimSnapshotGeneralPR800PanelSet_Homeowners.OtherIncidentsPanelSet.InjuryIncidentIterator.entry.InjuryIncidentDV.class);
        }
        
        public IteratorEntryCheckboxElement get_Checkbox() {
          return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotGeneralPR800PanelSet.Homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class InjuryIncidentDV extends DetailViewElement {
          public InjuryIncidentDV(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public InjuredName getInjuredName() {
            return getOrCreateProperty("InjuredName", "InjuredName", null, pcftest.ClaimSnapshotGeneralPR800PanelSet_Homeowners.OtherIncidentsPanelSet.InjuryIncidentIterator.entry.InjuryIncidentDV.InjuredName.class);
          }
          
          public ValueElement getInjuryIncidentDescription() {
            return getOrCreateProperty("InjuryIncidentDescription", "InjuryIncidentDescription", null, gw.smoketest.platform.web.ValueElement.class);
          }
          
          public BooleanValueElement getPedestrianIcon() {
            return getOrCreateProperty("PedestrianIcon", "PedestrianIcon", null, gw.smoketest.platform.web.BooleanValueElement.class);
          }
          
          @SimplePropertyProcessing
          @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotGeneralPR800PanelSet.Homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
          public static class InjuredName extends ValueElement {
            public InjuredName(ISmokeTest helper, PCFElementId componentId)  {
              super(helper, componentId);
            }
            
            public ClaimSnapshotInjuredInjuryIncident800Popup click() {
              return clickThis(pcftest.ClaimSnapshotInjuredInjuryIncident800Popup.class);
            }
            
            
          }
          
          
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotGeneralPR800PanelSet.Homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class PropertyIncidentIterator extends PCFElement {
      public PropertyIncidentIterator(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      @SuppressWarnings(value = "unchecked")
      public IteratorEntries<pcftest.ClaimSnapshotGeneralPR800PanelSet_Homeowners.OtherIncidentsPanelSet.PropertyIncidentIterator.entry> get_Entries() {
        return getOrCreateEntries(null, pcftest.ClaimSnapshotGeneralPR800PanelSet_Homeowners.OtherIncidentsPanelSet.PropertyIncidentIterator.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotGeneralPR800PanelSet.Homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class entry extends PCFElement {
        public entry(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PropertyIncidentDV getPropertyIncidentDV() {
          return getOrCreateProperty("PropertyIncidentDV", "PropertyIncidentDV", null, pcftest.ClaimSnapshotGeneralPR800PanelSet_Homeowners.OtherIncidentsPanelSet.PropertyIncidentIterator.entry.PropertyIncidentDV.class);
        }
        
        public IteratorEntryCheckboxElement get_Checkbox() {
          return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotGeneralPR800PanelSet.Homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class PropertyIncidentDV extends DetailViewElement {
          public PropertyIncidentDV(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public BooleanValueElement getPropertyIcon() {
            return getOrCreateProperty("PropertyIcon", "PropertyIcon", null, gw.smoketest.platform.web.BooleanValueElement.class);
          }
          
          public ValueElement getPropertyIncidentDescription() {
            return getOrCreateProperty("PropertyIncidentDescription", "PropertyIncidentDescription", null, gw.smoketest.platform.web.ValueElement.class);
          }
          
          public PropertyName getPropertyName() {
            return getOrCreateProperty("PropertyName", "PropertyName", null, pcftest.ClaimSnapshotGeneralPR800PanelSet_Homeowners.OtherIncidentsPanelSet.PropertyIncidentIterator.entry.PropertyIncidentDV.PropertyName.class);
          }
          
          @SimplePropertyProcessing
          @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotGeneralPR800PanelSet.Homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
          public static class PropertyName extends ValueElement {
            public PropertyName(ISmokeTest helper, PCFElementId componentId)  {
              super(helper, componentId);
            }
            
            public ClaimSnapshotFixedPropertyIncidentPopup click() {
              return clickThis(pcftest.ClaimSnapshotFixedPropertyIncidentPopup.class);
            }
            
            
          }
          
          
        }
        
        
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotGeneralPR800PanelSet.Homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class OtherStructureInputSet extends PCFElement {
    public OtherStructureInputSet(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public BooleanValueElement getOtherStructureAlreadyRepaired() {
      return getOrCreateProperty("OtherStructureAlreadyRepaired", "OtherStructureAlreadyRepaired", null, gw.smoketest.platform.web.BooleanValueElement.class);
    }
    
    public ValueElement getOtherStructureDamageDescription() {
      return getOrCreateProperty("OtherStructureDamageDescription", "OtherStructureDamageDescription", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public BooleanValueElement getOtherStructureEstimateReceived() {
      return getOrCreateProperty("OtherStructureEstimateReceived", "OtherStructureEstimateReceived", null, gw.smoketest.platform.web.BooleanValueElement.class);
    }
    
    public BooleanValueElement getOtherStructureFencesDamaged() {
      return getOrCreateProperty("OtherStructureFencesDamaged", "OtherStructureFencesDamaged", null, gw.smoketest.platform.web.BooleanValueElement.class);
    }
    
    public ValueElement getOtherStructureLimit() {
      return getOrCreateProperty("OtherStructureLimit", "OtherStructureLimit", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotGeneralPR800PanelSet.Homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PropertyContentsInputSet extends PCFElement {
    public PropertyContentsInputSet(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getPropertyContentsDamageDescription() {
      return getOrCreateProperty("PropertyContentsDamageDescription", "PropertyContentsDamageDescription", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getPropertyContentsLimit() {
      return getOrCreateProperty("PropertyContentsLimit", "PropertyContentsLimit", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotGeneralPR800PanelSet.Homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class WitnessesLV extends PCFElement {
    public WitnessesLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ContactHeader getContactHeader() {
      return getOrCreateProperty("ContactHeader", "ContactHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotGeneralPR800PanelSet_Homeowners.WitnessesLV.ContactHeader.class);
    }
    
    public WitnessPerspectiveHeader getWitnessPerspectiveHeader() {
      return getOrCreateProperty("WitnessPerspectiveHeader", "WitnessPerspectiveHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotGeneralPR800PanelSet_Homeowners.WitnessesLV.WitnessPerspectiveHeader.class);
    }
    
    public WitnessStatementHeader getWitnessStatementHeader() {
      return getOrCreateProperty("WitnessStatementHeader", "WitnessStatementHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotGeneralPR800PanelSet_Homeowners.WitnessesLV.WitnessStatementHeader.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<pcftest.ClaimSnapshotGeneralPR800PanelSet_Homeowners.WitnessesLV.entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ClaimSnapshotGeneralPR800PanelSet_Homeowners.WitnessesLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public pcftest.ClaimSnapshotGeneralPR800PanelSet_Homeowners.WitnessesLV._ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ClaimSnapshotGeneralPR800PanelSet_Homeowners.WitnessesLV._ListPaging.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotGeneralPR800PanelSet.Homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ContactHeader extends ValueElement {
      public ContactHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotGeneralPR800PanelSet.Homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class WitnessPerspectiveHeader extends ValueElement {
      public WitnessPerspectiveHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotGeneralPR800PanelSet.Homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class WitnessStatementHeader extends ValueElement {
      public WitnessStatementHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotGeneralPR800PanelSet.Homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotGeneralPR800PanelSet.Homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends RowElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ValueElement getContact() {
        return getOrCreateProperty("Contact", "Contact", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getWitnessPerspective() {
        return getOrCreateProperty("WitnessPerspective", "WitnessPerspective", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getWitnessStatement() {
        return getOrCreateProperty("WitnessStatement", "WitnessStatement", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      public pcftest.ClaimSnapshotGeneralPR800PanelSet_Homeowners.WitnessesLV.entry._Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.ClaimSnapshotGeneralPR800PanelSet_Homeowners.WitnessesLV.entry._Select.class);
      }
      
      public pcftest.ClaimSnapshotGeneralPR800PanelSet_Homeowners.WitnessesLV.entry._ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ClaimSnapshotGeneralPR800PanelSet_Homeowners.WitnessesLV.entry._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotGeneralPR800PanelSet.Homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotGeneralPR800PanelSet.Homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotGeneralPR800PanelSet.Homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class WitnessesLV_tb extends PCFElement {
    public WitnessesLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  
}