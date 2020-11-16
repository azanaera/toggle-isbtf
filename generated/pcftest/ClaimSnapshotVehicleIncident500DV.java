package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.DateElement;
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
import pcftest.ClaimSnapshotVehicleIncident500DV.DriverCitationsLV;
import pcftest.ClaimSnapshotVehicleIncident500DV.DriverCitationsLV.CitationsArray_CitationAuthorityHeader;
import pcftest.ClaimSnapshotVehicleIncident500DV.DriverCitationsLV.CitationsArray_CitationNumberHeader;
import pcftest.ClaimSnapshotVehicleIncident500DV.DriverCitationsLV.CitationsArray_CitationTypeHeader;
import pcftest.ClaimSnapshotVehicleIncident500DV.DriverCitationsLV._ListPaging;
import pcftest.ClaimSnapshotVehicleIncident500DV.DriverCitationsLV.entry;
import pcftest.ClaimSnapshotVehicleIncident500DV.DriverCitationsLV.entry._Select;
import pcftest.ClaimSnapshotVehicleIncident500DV.DriverCitationsLV.entry._ViewDetail;
import pcftest.ClaimSnapshotVehicleIncident500DV.DriverCitationsLV_tb;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/snapshot/500/ClaimSnapshotVehicleIncident500DV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotVehicleIncident500DV extends DetailViewElement {
  public final static String CHECKSUM = "43100bd2036f35855f93a93dcaa91ae9";
  
  public ClaimSnapshotVehicleIncident500DV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getCollisionPoint() {
    return getOrCreateProperty("CollisionPoint", "CollisionPoint", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public BooleanValueElement getCollision_Indicator() {
    return getOrCreateProperty("Collision_Indicator", "Collision_Indicator", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public ValueElement getDescription() {
    return getOrCreateProperty("Description", "Description", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getDriver() {
    return getOrCreateProperty("Driver", "Driver", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public DriverCitationsLV getDriverCitationsLV() {
    return getOrCreateProperty("DriverCitationsLV", "DriverCitationsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimSnapshotVehicleIncident500DV.DriverCitationsLV.class);
  }
  
  public DriverCitationsLV_tb getDriverCitationsLV_tb() {
    return getOrCreateProperty("DriverCitationsLV_tb", "DriverCitationsLV_tb", null, pcftest.ClaimSnapshotVehicleIncident500DV.DriverCitationsLV_tb.class);
  }
  
  public ValueElement getDriver_Address() {
    return getOrCreateProperty("Driver_Address", "Driver_Address", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getDriver_IsKidInPolicy() {
    return getOrCreateProperty("Driver_IsKidInPolicy", "Driver_IsKidInPolicy", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getDriver_IsKidInPolicy_Percentagedriven() {
    return getOrCreateProperty("Driver_IsKidInPolicy_Percentagedriven", "Driver_IsKidInPolicy_Percentagedriven", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getDriver_License() {
    return getOrCreateProperty("Driver_License", "Driver_License", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getDriver_LicenseState() {
    return getOrCreateProperty("Driver_LicenseState", "Driver_LicenseState", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getDriver_Phone() {
    return getOrCreateProperty("Driver_Phone", "Driver_Phone", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public BooleanValueElement getExposure_AirbagsDeployed() {
    return getOrCreateProperty("Exposure_AirbagsDeployed", "Exposure_AirbagsDeployed", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public BooleanValueElement getExposure_EquipmentFailure() {
    return getOrCreateProperty("Exposure_EquipmentFailure", "Exposure_EquipmentFailure", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public ValueElement getExposure_TrafficViolation() {
    return getOrCreateProperty("Exposure_TrafficViolation", "Exposure_TrafficViolation", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public BooleanValueElement getInspectionRequired() {
    return getOrCreateProperty("InspectionRequired", "InspectionRequired", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public BooleanValueElement getLoanInformation_Loan() {
    return getOrCreateProperty("LoanInformation_Loan", "LoanInformation_Loan", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public ValueElement getLossEstimate() {
    return getOrCreateProperty("LossEstimate", "LossEstimate", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getMonthlyPayment() {
    return getOrCreateProperty("MonthlyPayment", "MonthlyPayment", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getMonthsRemaining() {
    return getOrCreateProperty("MonthsRemaining", "MonthsRemaining", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public BooleanValueElement getOperable() {
    return getOrCreateProperty("Operable", "Operable", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public BooleanValueElement getOwnersPermission() {
    return getOrCreateProperty("OwnersPermission", "OwnersPermission", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public ValueElement getPayoffAmount() {
    return getOrCreateProperty("PayoffAmount", "PayoffAmount", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getReasonForUse() {
    return getOrCreateProperty("ReasonForUse", "ReasonForUse", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getRelationToInsured() {
    return getOrCreateProperty("RelationToInsured", "RelationToInsured", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getRelationToOwner() {
    return getOrCreateProperty("RelationToOwner", "RelationToOwner", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getRentalAgency() {
    return getOrCreateProperty("RentalAgency", "RentalAgency", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public DateElement getRentalBeginDate() {
    return getOrCreateProperty("RentalBeginDate", "RentalBeginDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public ValueElement getRentalDailyRate() {
    return getOrCreateProperty("RentalDailyRate", "RentalDailyRate", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public DateElement getRentalEndDate() {
    return getOrCreateProperty("RentalEndDate", "RentalEndDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public BooleanValueElement getRentalRequired() {
    return getOrCreateProperty("RentalRequired", "RentalRequired", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public ValueElement getRentalReservationNumber() {
    return getOrCreateProperty("RentalReservationNumber", "RentalReservationNumber", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public BooleanValueElement getRepWhereDisInd() {
    return getOrCreateProperty("RepWhereDisInd", "RepWhereDisInd", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public ValueElement getRepairShop_Phone() {
    return getOrCreateProperty("RepairShop_Phone", "RepairShop_Phone", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getRepairShop_Picker() {
    return getOrCreateProperty("RepairShop_Picker", "RepairShop_Picker", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getSpeed() {
    return getOrCreateProperty("Speed", "Speed", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public BooleanValueElement getTotalLoss() {
    return getOrCreateProperty("TotalLoss", "TotalLoss", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public ValueElement getTowingAgcy_Phone() {
    return getOrCreateProperty("TowingAgcy_Phone", "TowingAgcy_Phone", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getTowingAgcy_Picker() {
    return getOrCreateProperty("TowingAgcy_Picker", "TowingAgcy_Picker", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getVehicleDirection() {
    return getOrCreateProperty("VehicleDirection", "VehicleDirection", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getVehicleLocationCity() {
    return getOrCreateProperty("VehicleLocationCity", "VehicleLocationCity", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public BooleanValueElement getVehicleLocationInd() {
    return getOrCreateProperty("VehicleLocationInd", "VehicleLocationInd", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public ValueElement getVehicleLocationState() {
    return getOrCreateProperty("VehicleLocationState", "VehicleLocationState", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getVehicleLocationStreet() {
    return getOrCreateProperty("VehicleLocationStreet", "VehicleLocationStreet", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getVehicleLocationZip() {
    return getOrCreateProperty("VehicleLocationZip", "VehicleLocationZip", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getVehicle_BoatType() {
    return getOrCreateProperty("Vehicle_BoatType", "Vehicle_BoatType", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getVehicle_Color() {
    return getOrCreateProperty("Vehicle_Color", "Vehicle_Color", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getVehicle_LicensePlate() {
    return getOrCreateProperty("Vehicle_LicensePlate", "Vehicle_LicensePlate", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getVehicle_LossParty() {
    return getOrCreateProperty("Vehicle_LossParty", "Vehicle_LossParty", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getVehicle_Make() {
    return getOrCreateProperty("Vehicle_Make", "Vehicle_Make", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getVehicle_Model() {
    return getOrCreateProperty("Vehicle_Model", "Vehicle_Model", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getVehicle_OffRoadStyle() {
    return getOrCreateProperty("Vehicle_OffRoadStyle", "Vehicle_OffRoadStyle", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getVehicle_SerialNumber() {
    return getOrCreateProperty("Vehicle_SerialNumber", "Vehicle_SerialNumber", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getVehicle_State() {
    return getOrCreateProperty("Vehicle_State", "Vehicle_State", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getVehicle_Style() {
    return getOrCreateProperty("Vehicle_Style", "Vehicle_Style", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getVehicle_VIN() {
    return getOrCreateProperty("Vehicle_VIN", "Vehicle_VIN", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getVehicle_VehicleType() {
    return getOrCreateProperty("Vehicle_VehicleType", "Vehicle_VehicleType", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getVehicle_Year() {
    return getOrCreateProperty("Vehicle_Year", "Vehicle_Year", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getWhenToView() {
    return getOrCreateProperty("WhenToView", "WhenToView", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/500/ClaimSnapshotVehicleIncident500DV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DriverCitationsLV extends PCFElement {
    public DriverCitationsLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public CitationsArray_CitationAuthorityHeader getCitationsArray_CitationAuthorityHeader() {
      return getOrCreateProperty("CitationsArray_CitationAuthorityHeader", "CitationsArray_CitationAuthorityHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotVehicleIncident500DV.DriverCitationsLV.CitationsArray_CitationAuthorityHeader.class);
    }
    
    public CitationsArray_CitationNumberHeader getCitationsArray_CitationNumberHeader() {
      return getOrCreateProperty("CitationsArray_CitationNumberHeader", "CitationsArray_CitationNumberHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotVehicleIncident500DV.DriverCitationsLV.CitationsArray_CitationNumberHeader.class);
    }
    
    public CitationsArray_CitationTypeHeader getCitationsArray_CitationTypeHeader() {
      return getOrCreateProperty("CitationsArray_CitationTypeHeader", "CitationsArray_CitationTypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotVehicleIncident500DV.DriverCitationsLV.CitationsArray_CitationTypeHeader.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ClaimSnapshotVehicleIncident500DV.DriverCitationsLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public _ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ClaimSnapshotVehicleIncident500DV.DriverCitationsLV._ListPaging.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/500/ClaimSnapshotVehicleIncident500DV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CitationsArray_CitationAuthorityHeader extends ValueElement {
      public CitationsArray_CitationAuthorityHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/500/ClaimSnapshotVehicleIncident500DV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CitationsArray_CitationNumberHeader extends ValueElement {
      public CitationsArray_CitationNumberHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/500/ClaimSnapshotVehicleIncident500DV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CitationsArray_CitationTypeHeader extends ValueElement {
      public CitationsArray_CitationTypeHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/500/ClaimSnapshotVehicleIncident500DV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/500/ClaimSnapshotVehicleIncident500DV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends RowElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ValueElement getCitationsArray_CitationAuthority() {
        return getOrCreateProperty("CitationsArray_CitationAuthority", "CitationsArray_CitationAuthority", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getCitationsArray_CitationNumber() {
        return getOrCreateProperty("CitationsArray_CitationNumber", "CitationsArray_CitationNumber", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getCitationsArray_CitationType() {
        return getOrCreateProperty("CitationsArray_CitationType", "CitationsArray_CitationType", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      public _Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.ClaimSnapshotVehicleIncident500DV.DriverCitationsLV.entry._Select.class);
      }
      
      public _ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ClaimSnapshotVehicleIncident500DV.DriverCitationsLV.entry._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/500/ClaimSnapshotVehicleIncident500DV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/500/ClaimSnapshotVehicleIncident500DV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/snapshot/500/ClaimSnapshotVehicleIncident500DV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DriverCitationsLV_tb extends PCFElement {
    public DriverCitationsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  
}