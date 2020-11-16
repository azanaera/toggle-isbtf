package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
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
import pcftest.ClaimSnapshotExposure310DV_VehicleDamage.OtherCoverageDetLV;
import pcftest.ClaimSnapshotExposure310DV_VehicleDamage.OtherCoverageDetLV.ContactNameHeader;
import pcftest.ClaimSnapshotExposure310DV_VehicleDamage.OtherCoverageDetLV.ContactPhoneHeader;
import pcftest.ClaimSnapshotExposure310DV_VehicleDamage.OtherCoverageDetLV.InsurerHeader;
import pcftest.ClaimSnapshotExposure310DV_VehicleDamage.OtherCoverageDetLV.NotesHeader;
import pcftest.ClaimSnapshotExposure310DV_VehicleDamage.OtherCoverageDetLV.PolicyNumberHeader;
import pcftest.ClaimSnapshotExposure310DV_VehicleDamage.OtherCoverageDetLV._ListPaging;
import pcftest.ClaimSnapshotExposure310DV_VehicleDamage.OtherCoverageDetLV.entry;
import pcftest.ClaimSnapshotExposure310DV_VehicleDamage.OtherCoverageDetLV.entry._Select;
import pcftest.ClaimSnapshotExposure310DV_VehicleDamage.OtherCoverageDetLV.entry._ViewDetail;
import pcftest.ClaimSnapshotExposure310DV_VehicleDamage.OtherCoverageDetLV_tb;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/snapshot/310/ClaimSnapshotExposure310DV.VehicleDamage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotExposure310DV_VehicleDamage extends ClaimSnapshotExposure310DV {
  public final static String CHECKSUM = "ec062fb210cc02a95e980ff8f5d37e48";
  
  public ClaimSnapshotExposure310DV_VehicleDamage(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getClaimant() {
    return getOrCreateProperty("Claimant", "Claimant", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getClaimantAddress() {
    return getOrCreateProperty("ClaimantAddress", "ClaimantAddress", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getClaimantType() {
    return getOrCreateProperty("ClaimantType", "ClaimantType", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getCloseDate() {
    return getOrCreateProperty("CloseDate", "CloseDate", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getClosedOutcome() {
    return getOrCreateProperty("ClosedOutcome", "ClosedOutcome", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getCollisionPoint() {
    return getOrCreateProperty("CollisionPoint", "CollisionPoint", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getColor() {
    return getOrCreateProperty("Color", "Color", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getContact() {
    return getOrCreateProperty("Contact", "Contact", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public BooleanValueElement getContactProhibited() {
    return getOrCreateProperty("ContactProhibited", "ContactProhibited", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public ValueElement getCoverage() {
    return getOrCreateProperty("Coverage", "Coverage", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getCoverageSubType() {
    return getOrCreateProperty("CoverageSubType", "CoverageSubType", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getCreateTime() {
    return getOrCreateProperty("CreateTime", "CreateTime", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getDescription() {
    return getOrCreateProperty("Description", "Description", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getDriver() {
    return getOrCreateProperty("Driver", "Driver", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getDriverAddress() {
    return getOrCreateProperty("DriverAddress", "DriverAddress", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getDriverPhone() {
    return getOrCreateProperty("DriverPhone", "DriverPhone", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getDriverRelToOwner() {
    return getOrCreateProperty("DriverRelToOwner", "DriverRelToOwner", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getFuturePayments() {
    return getOrCreateProperty("FuturePayments", "FuturePayments", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public BooleanValueElement getInspectionRequired() {
    return getOrCreateProperty("InspectionRequired", "InspectionRequired", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public ValueElement getJurisdictionState() {
    return getOrCreateProperty("JurisdictionState", "JurisdictionState", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getLicenseNumber() {
    return getOrCreateProperty("LicenseNumber", "LicenseNumber", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getLicensePlate() {
    return getOrCreateProperty("LicensePlate", "LicensePlate", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getLicenseState() {
    return getOrCreateProperty("LicenseState", "LicenseState", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getLocationCity() {
    return getOrCreateProperty("LocationCity", "LocationCity", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getLocationState() {
    return getOrCreateProperty("LocationState", "LocationState", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getLocationStreet() {
    return getOrCreateProperty("LocationStreet", "LocationStreet", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getLocationZip() {
    return getOrCreateProperty("LocationZip", "LocationZip", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getLossEstimate() {
    return getOrCreateProperty("LossEstimate", "LossEstimate", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getLossParty() {
    return getOrCreateProperty("LossParty", "LossParty", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getMake() {
    return getOrCreateProperty("Make", "Make", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getModel() {
    return getOrCreateProperty("Model", "Model", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public BooleanValueElement getOtherCoverage() {
    return getOrCreateProperty("OtherCoverage", "OtherCoverage", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public OtherCoverageDetLV getOtherCoverageDetLV() {
    return getOrCreateProperty("OtherCoverageDetLV", "OtherCoverageDetLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimSnapshotExposure310DV_VehicleDamage.OtherCoverageDetLV.class);
  }
  
  public OtherCoverageDetLV_tb getOtherCoverageDetLV_tb() {
    return getOrCreateProperty("OtherCoverageDetLV_tb", "OtherCoverageDetLV_tb", null, pcftest.ClaimSnapshotExposure310DV_VehicleDamage.OtherCoverageDetLV_tb.class);
  }
  
  public BooleanValueElement getOwnersPermission() {
    return getOrCreateProperty("OwnersPermission", "OwnersPermission", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public ValueElement getPrimaryCoverage() {
    return getOrCreateProperty("PrimaryCoverage", "PrimaryCoverage", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getPrimaryPhone() {
    return getOrCreateProperty("PrimaryPhone", "PrimaryPhone", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getReOpenDate() {
    return getOrCreateProperty("ReOpenDate", "ReOpenDate", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getRemainingReserves() {
    return getOrCreateProperty("RemainingReserves", "RemainingReserves", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getRentalAgency() {
    return getOrCreateProperty("RentalAgency", "RentalAgency", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getRentalBeginDate() {
    return getOrCreateProperty("RentalBeginDate", "RentalBeginDate", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getRentalDailyRate() {
    return getOrCreateProperty("RentalDailyRate", "RentalDailyRate", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getRentalEndDate() {
    return getOrCreateProperty("RentalEndDate", "RentalEndDate", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public BooleanValueElement getRentalRequired() {
    return getOrCreateProperty("RentalRequired", "RentalRequired", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public ValueElement getRentalReserveNo() {
    return getOrCreateProperty("RentalReserveNo", "RentalReserveNo", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getRepairShop() {
    return getOrCreateProperty("RepairShop", "RepairShop", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getSegment() {
    return getOrCreateProperty("Segment", "Segment", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getSpeed() {
    return getOrCreateProperty("Speed", "Speed", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getStatLine() {
    return getOrCreateProperty("StatLine", "StatLine", null, gw.smoketest.platform.web.ValueElement.class);
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
  
  public ValueElement getTotalIncurredNet() {
    return getOrCreateProperty("TotalIncurredNet", "TotalIncurredNet", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public BooleanValueElement getTotalLoss() {
    return getOrCreateProperty("TotalLoss", "TotalLoss", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public ValueElement getTotalPayments() {
    return getOrCreateProperty("TotalPayments", "TotalPayments", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getTotalRecoveries() {
    return getOrCreateProperty("TotalRecoveries", "TotalRecoveries", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getValidationLevel() {
    return getOrCreateProperty("ValidationLevel", "ValidationLevel", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getVehicle() {
    return getOrCreateProperty("Vehicle", "Vehicle", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getVehicleDirection() {
    return getOrCreateProperty("VehicleDirection", "VehicleDirection", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public BooleanValueElement getVehicleOperable() {
    return getOrCreateProperty("VehicleOperable", "VehicleOperable", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public ValueElement getVehicleState() {
    return getOrCreateProperty("VehicleState", "VehicleState", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getVin() {
    return getOrCreateProperty("Vin", "Vin", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getWhenToView() {
    return getOrCreateProperty("WhenToView", "WhenToView", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getYear() {
    return getOrCreateProperty("Year", "Year", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/310/ClaimSnapshotExposure310DV.VehicleDamage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class OtherCoverageDetLV extends PCFElement {
    public OtherCoverageDetLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ContactNameHeader getContactNameHeader() {
      return getOrCreateProperty("ContactNameHeader", "ContactNameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotExposure310DV_VehicleDamage.OtherCoverageDetLV.ContactNameHeader.class);
    }
    
    public ContactPhoneHeader getContactPhoneHeader() {
      return getOrCreateProperty("ContactPhoneHeader", "ContactPhoneHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotExposure310DV_VehicleDamage.OtherCoverageDetLV.ContactPhoneHeader.class);
    }
    
    public InsurerHeader getInsurerHeader() {
      return getOrCreateProperty("InsurerHeader", "InsurerHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotExposure310DV_VehicleDamage.OtherCoverageDetLV.InsurerHeader.class);
    }
    
    public NotesHeader getNotesHeader() {
      return getOrCreateProperty("NotesHeader", "NotesHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotExposure310DV_VehicleDamage.OtherCoverageDetLV.NotesHeader.class);
    }
    
    public PolicyNumberHeader getPolicyNumberHeader() {
      return getOrCreateProperty("PolicyNumberHeader", "PolicyNumberHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotExposure310DV_VehicleDamage.OtherCoverageDetLV.PolicyNumberHeader.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ClaimSnapshotExposure310DV_VehicleDamage.OtherCoverageDetLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public _ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ClaimSnapshotExposure310DV_VehicleDamage.OtherCoverageDetLV._ListPaging.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/310/ClaimSnapshotExposure310DV.VehicleDamage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ContactNameHeader extends ValueElement {
      public ContactNameHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/310/ClaimSnapshotExposure310DV.VehicleDamage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ContactPhoneHeader extends ValueElement {
      public ContactPhoneHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/310/ClaimSnapshotExposure310DV.VehicleDamage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class InsurerHeader extends ValueElement {
      public InsurerHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/310/ClaimSnapshotExposure310DV.VehicleDamage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class NotesHeader extends ValueElement {
      public NotesHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/310/ClaimSnapshotExposure310DV.VehicleDamage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class PolicyNumberHeader extends ValueElement {
      public PolicyNumberHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/310/ClaimSnapshotExposure310DV.VehicleDamage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/310/ClaimSnapshotExposure310DV.VehicleDamage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends RowElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ValueElement getContactName() {
        return getOrCreateProperty("ContactName", "ContactName", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getContactPhone() {
        return getOrCreateProperty("ContactPhone", "ContactPhone", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getInsurer() {
        return getOrCreateProperty("Insurer", "Insurer", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getNotes() {
        return getOrCreateProperty("Notes", "Notes", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getPolicyNumber() {
        return getOrCreateProperty("PolicyNumber", "PolicyNumber", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      public _Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.ClaimSnapshotExposure310DV_VehicleDamage.OtherCoverageDetLV.entry._Select.class);
      }
      
      public _ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ClaimSnapshotExposure310DV_VehicleDamage.OtherCoverageDetLV.entry._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/310/ClaimSnapshotExposure310DV.VehicleDamage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/310/ClaimSnapshotExposure310DV.VehicleDamage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/snapshot/310/ClaimSnapshotExposure310DV.VehicleDamage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class OtherCoverageDetLV_tb extends PCFElement {
    public OtherCoverageDetLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  
}