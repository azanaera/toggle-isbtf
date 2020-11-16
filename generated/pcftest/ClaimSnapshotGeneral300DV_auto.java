package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.CheckboxValueElement;
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
import pcftest.ClaimSnapshotGeneral300DV_auto.OfficialsLV;
import pcftest.ClaimSnapshotGeneral300DV_auto.OfficialsLV.NameHeader;
import pcftest.ClaimSnapshotGeneral300DV_auto.OfficialsLV.ReportNumberHeader;
import pcftest.ClaimSnapshotGeneral300DV_auto.OfficialsLV.TypeHeader;
import pcftest.ClaimSnapshotGeneral300DV_auto.OfficialsLV._ListPaging;
import pcftest.ClaimSnapshotGeneral300DV_auto.OfficialsLV.entry;
import pcftest.ClaimSnapshotGeneral300DV_auto.OfficialsLV.entry._Select;
import pcftest.ClaimSnapshotGeneral300DV_auto.OfficialsLV.entry._ViewDetail;
import pcftest.ClaimSnapshotGeneral300DV_auto.OfficialsLV_tb;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/snapshot/300/ClaimSnapshotGeneral300DV.auto.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotGeneral300DV_auto extends ClaimSnapshotGeneral300DV {
  public final static String CHECKSUM = "9bcdfb0669147c7d16274fe1853cb533";
  
  public ClaimSnapshotGeneral300DV_auto(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getCatastrophe() {
    return getOrCreateProperty("Catastrophe", "Catastrophe", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getCloseDate() {
    return getOrCreateProperty("CloseDate", "CloseDate", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getClosedOutcome() {
    return getOrCreateProperty("ClosedOutcome", "ClosedOutcome", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getColor() {
    return getOrCreateProperty("Color", "Color", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getContact() {
    return getOrCreateProperty("Contact", "Contact", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getCountry() {
    return getOrCreateProperty("Country", "Country", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getCounty() {
    return getOrCreateProperty("County", "County", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public BooleanValueElement getCoverageInQuestion() {
    return getOrCreateProperty("CoverageInQuestion", "CoverageInQuestion", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public ValueElement getCreateTime() {
    return getOrCreateProperty("CreateTime", "CreateTime", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getDateRptdToAgent() {
    return getOrCreateProperty("DateRptdToAgent", "DateRptdToAgent", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getDeductibleStatus() {
    return getOrCreateProperty("DeductibleStatus", "DeductibleStatus", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getDescription() {
    return getOrCreateProperty("Description", "Description", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getDriver() {
    return getOrCreateProperty("Driver", "Driver", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getDriverRelation() {
    return getOrCreateProperty("DriverRelation", "DriverRelation", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getDriverRelation2() {
    return getOrCreateProperty("DriverRelation2", "DriverRelation2", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getFault() {
    return getOrCreateProperty("Fault", "Fault", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public BooleanValueElement getFirstNoticeSuit() {
    return getOrCreateProperty("FirstNoticeSuit", "FirstNoticeSuit", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public ValueElement getFlagged() {
    return getOrCreateProperty("Flagged", "Flagged", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getFlaggedDate() {
    return getOrCreateProperty("FlaggedDate", "FlaggedDate", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getFlaggedReason() {
    return getOrCreateProperty("FlaggedReason", "FlaggedReason", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getHowReported() {
    return getOrCreateProperty("HowReported", "HowReported", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public CheckboxValueElement getIncidentReport() {
    return getOrCreateProperty("IncidentReport", "IncidentReport", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
  }
  
  public ValueElement getJurisdictionState() {
    return getOrCreateProperty("JurisdictionState", "JurisdictionState", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getLOBCode() {
    return getOrCreateProperty("LOBCode", "LOBCode", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getLicensePlate() {
    return getOrCreateProperty("LicensePlate", "LicensePlate", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getLitigationStatus() {
    return getOrCreateProperty("LitigationStatus", "LitigationStatus", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getLossCause() {
    return getOrCreateProperty("LossCause", "LossCause", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getLossDate() {
    return getOrCreateProperty("LossDate", "LossDate", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getLossLocation() {
    return getOrCreateProperty("LossLocation", "LossLocation", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getLossLocationCode() {
    return getOrCreateProperty("LossLocationCode", "LossLocationCode", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getLossType() {
    return getOrCreateProperty("LossType", "LossType", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getMainContact() {
    return getOrCreateProperty("MainContact", "MainContact", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getMainContactType() {
    return getOrCreateProperty("MainContactType", "MainContactType", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public OfficialsLV getOfficialsLV() {
    return getOrCreateProperty("OfficialsLV", "OfficialsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimSnapshotGeneral300DV_auto.OfficialsLV.class);
  }
  
  public OfficialsLV_tb getOfficialsLV_tb() {
    return getOrCreateProperty("OfficialsLV_tb", "OfficialsLV_tb", null, pcftest.ClaimSnapshotGeneral300DV_auto.OfficialsLV_tb.class);
  }
  
  public ValueElement getOtherRecovStatus() {
    return getOrCreateProperty("OtherRecovStatus", "OtherRecovStatus", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getPermissionRequired() {
    return getOrCreateProperty("PermissionRequired", "PermissionRequired", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getReinsuranceStatus() {
    return getOrCreateProperty("ReinsuranceStatus", "ReinsuranceStatus", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getReportedDate() {
    return getOrCreateProperty("ReportedDate", "ReportedDate", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getReporter() {
    return getOrCreateProperty("Reporter", "Reporter", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getSIUStatus() {
    return getOrCreateProperty("SIUStatus", "SIUStatus", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getSalvageStatus() {
    return getOrCreateProperty("SalvageStatus", "SalvageStatus", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getSegment() {
    return getOrCreateProperty("Segment", "Segment", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getState() {
    return getOrCreateProperty("State", "State", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getStrategy() {
    return getOrCreateProperty("Strategy", "Strategy", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getStyle() {
    return getOrCreateProperty("Style", "Style", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getSubrogationStatus() {
    return getOrCreateProperty("SubrogationStatus", "SubrogationStatus", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getVehicle() {
    return getOrCreateProperty("Vehicle", "Vehicle", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getVehicleUseReason() {
    return getOrCreateProperty("VehicleUseReason", "VehicleUseReason", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getVin() {
    return getOrCreateProperty("Vin", "Vin", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/300/ClaimSnapshotGeneral300DV.auto.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class OfficialsLV extends PCFElement {
    public OfficialsLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public NameHeader getNameHeader() {
      return getOrCreateProperty("NameHeader", "NameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotGeneral300DV_auto.OfficialsLV.NameHeader.class);
    }
    
    public ReportNumberHeader getReportNumberHeader() {
      return getOrCreateProperty("ReportNumberHeader", "ReportNumberHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotGeneral300DV_auto.OfficialsLV.ReportNumberHeader.class);
    }
    
    public TypeHeader getTypeHeader() {
      return getOrCreateProperty("TypeHeader", "TypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotGeneral300DV_auto.OfficialsLV.TypeHeader.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ClaimSnapshotGeneral300DV_auto.OfficialsLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public _ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ClaimSnapshotGeneral300DV_auto.OfficialsLV._ListPaging.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/300/ClaimSnapshotGeneral300DV.auto.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class NameHeader extends ValueElement {
      public NameHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/300/ClaimSnapshotGeneral300DV.auto.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ReportNumberHeader extends ValueElement {
      public ReportNumberHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/300/ClaimSnapshotGeneral300DV.auto.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class TypeHeader extends ValueElement {
      public TypeHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/300/ClaimSnapshotGeneral300DV.auto.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/300/ClaimSnapshotGeneral300DV.auto.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
      
      public _Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.ClaimSnapshotGeneral300DV_auto.OfficialsLV.entry._Select.class);
      }
      
      public _ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ClaimSnapshotGeneral300DV_auto.OfficialsLV.entry._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/300/ClaimSnapshotGeneral300DV.auto.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/300/ClaimSnapshotGeneral300DV.auto.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/snapshot/300/ClaimSnapshotGeneral300DV.auto.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class OfficialsLV_tb extends PCFElement {
    public OfficialsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  
}