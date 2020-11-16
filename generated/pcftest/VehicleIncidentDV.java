package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.VehicleIncidentDV.Child_Safety_Seat_Ext;
import pcftest.VehicleIncidentDV.Contacts;
import pcftest.VehicleIncidentDV.Contacts.EditableIncidentContactsLV_tb;
import pcftest.VehicleIncidentDV.Driver_Citations;
import pcftest.VehicleIncidentDV.Driver_Citations.DriverCitationsLV_tb;
import pcftest.VehicleIncidentDV.Driver_IsKidInPolicy;
import pcftest.VehicleIncidentDV.Driver_IsKidInPolicy_Percentagedriven;
import pcftest.VehicleIncidentDV.Driver_LicenseState;
import pcftest.VehicleIncidentDV.Driver_Picker;
import pcftest.VehicleIncidentDV.Exposure_TrafficViolation;
import pcftest.VehicleIncidentDV.GlassRepairAndReplaceRadioButton_Ext;
import pcftest.VehicleIncidentDV.LocationPhone_Ext;
import pcftest.VehicleIncidentDV.LocationType_Ext;
import pcftest.VehicleIncidentDV.LossParty;
import pcftest.VehicleIncidentDV.Owner_Picker;
import pcftest.VehicleIncidentDV.Potential_Side_Hustle_Involved_Ext;
import pcftest.VehicleIncidentDV.RecovAgcy_Picker;
import pcftest.VehicleIncidentDV.RecoveryAddress;
import pcftest.VehicleIncidentDV.RecoveryCondition;
import pcftest.VehicleIncidentDV.RecoveryState;
import pcftest.VehicleIncidentDV.RelationToInsured;
import pcftest.VehicleIncidentDV.Side_Hustle_Phase_Ext;
import pcftest.VehicleIncidentDV.TheftRecovery;
import pcftest.VehicleIncidentDV.Theft_AffdvCmplBy;
import pcftest.VehicleIncidentDV.Theft_AffdvCmplInd;
import pcftest.VehicleIncidentDV.Vehicle_BoatType;
import pcftest.VehicleIncidentDV.Vehicle_OffRoadStyle;
import pcftest.VehicleIncidentDV.Vehicle_State;
import pcftest.VehicleIncidentDV.Vehicle_Style;
import pcftest.VehicleIncidentDV.Vehicle_VehicleType;
import typekey.BoatType;
import typekey.ChildSafetySeat_Ext;
import typekey.GlassRepairAndReplace_Ext;
import typekey.Jurisdiction;
import typekey.LossPartyType;
import typekey.OffRoadVehicleStyle;
import typekey.PercentageDriven;
import typekey.PersonRelationType;
import typekey.PotentialSideHustle_Ext;
import typekey.RecovCondType;
import typekey.SideHustlePhase_Ext;
import typekey.State;
import typekey.VehicleDamageLocation_Ext;
import typekey.VehicleStyle;
import typekey.VehicleType;
import typekey.YesNo;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/shared/vehicle/VehicleIncidentDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class VehicleIncidentDV extends DetailViewElement {
  public final static String CHECKSUM = "f6f6cb2a0b55e2337b57a1a4f1800cc9";
  
  public VehicleIncidentDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getAddress_Description_Ext() {
    return getOrCreateProperty("Address_Description_Ext", "Address_Description_Ext", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public pcftest.VehicleIncidentDV.AppraisalServiceInputSet getAppraisalServiceInputSet() {
    return getOrCreateProperty("AppraisalServiceInputSet", "AppraisalServiceInputSet", null, pcftest.VehicleIncidentDV.AppraisalServiceInputSet.class);
  }
  
  public CCAddressInputSet getCCAddressInputSet() {
    return getOrCreateProperty("CCAddressInputSet", "CCAddressInputSet", null, pcftest.CCAddressInputSet.class);
  }
  
  public Child_Safety_Seat_Ext getChild_Safety_Seat_Ext() {
    return getOrCreateProperty("Child_Safety_Seat_Ext", "Child_Safety_Seat_Ext", null, pcftest.VehicleIncidentDV.Child_Safety_Seat_Ext.class);
  }
  
  public pcftest.VehicleIncidentDV.CollisionPoint getCollisionPoint() {
    return getOrCreateProperty("CollisionPoint", "CollisionPoint", null, pcftest.VehicleIncidentDV.CollisionPoint.class);
  }
  
  public BooleanValueElement getCollision_Indicator() {
    return getOrCreateProperty("Collision_Indicator", "Collision_Indicator", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public Contacts getContacts() {
    return getOrCreateProperty("Contacts", "Contacts", null, pcftest.VehicleIncidentDV.Contacts.class);
  }
  
  public ValueElement getDescription() {
    return getOrCreateProperty("Description", "Description", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getDriver_Address() {
    return getOrCreateProperty("Driver_Address", "Driver_Address", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Driver_Citations getDriver_Citations() {
    return getOrCreateProperty("Driver_Citations", "Driver_Citations", null, pcftest.VehicleIncidentDV.Driver_Citations.class);
  }
  
  public Driver_IsKidInPolicy getDriver_IsKidInPolicy() {
    return getOrCreateProperty("Driver_IsKidInPolicy", "Driver_IsKidInPolicy", null, pcftest.VehicleIncidentDV.Driver_IsKidInPolicy.class);
  }
  
  public Driver_IsKidInPolicy_Percentagedriven getDriver_IsKidInPolicy_Percentagedriven() {
    return getOrCreateProperty("Driver_IsKidInPolicy_Percentagedriven", "Driver_IsKidInPolicy_Percentagedriven", null, pcftest.VehicleIncidentDV.Driver_IsKidInPolicy_Percentagedriven.class);
  }
  
  public ValueElement getDriver_License() {
    return getOrCreateProperty("Driver_License", "Driver_License", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Driver_LicenseState getDriver_LicenseState() {
    return getOrCreateProperty("Driver_LicenseState", "Driver_LicenseState", null, pcftest.VehicleIncidentDV.Driver_LicenseState.class);
  }
  
  public ValueElement getDriver_Phone() {
    return getOrCreateProperty("Driver_Phone", "Driver_Phone", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Driver_Picker getDriver_Picker() {
    return getOrCreateProperty("Driver_Picker", "Driver_Picker", null, pcftest.VehicleIncidentDV.Driver_Picker.class);
  }
  
  public BooleanValueElement getExposure_AirbagsDeployed() {
    return getOrCreateProperty("Exposure_AirbagsDeployed", "Exposure_AirbagsDeployed", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public BooleanValueElement getExposure_EquipmentFailure() {
    return getOrCreateProperty("Exposure_EquipmentFailure", "Exposure_EquipmentFailure", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public Exposure_TrafficViolation getExposure_TrafficViolation() {
    return getOrCreateProperty("Exposure_TrafficViolation", "Exposure_TrafficViolation", null, pcftest.VehicleIncidentDV.Exposure_TrafficViolation.class);
  }
  
  public GlassRepairAndReplaceRadioButton_Ext getGlassRepairAndReplaceRadioButton_Ext() {
    return getOrCreateProperty("GlassRepairAndReplaceRadioButton_Ext", "GlassRepairAndReplaceRadioButton_Ext", null, pcftest.VehicleIncidentDV.GlassRepairAndReplaceRadioButton_Ext.class);
  }
  
  public BooleanValueElement getHitAndRun() {
    return getOrCreateProperty("HitAndRun", "HitAndRun", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public LoanInformationInputSet getLoanInformationInputSet() {
    return getOrCreateProperty("LoanInformationInputSet", "LoanInformationInputSet", null, pcftest.LoanInformationInputSet.class);
  }
  
  public LocationPhone_Ext getLocationPhone_Ext() {
    return getOrCreateProperty("LocationPhone_Ext", "LocationPhone_Ext", null, pcftest.VehicleIncidentDV.LocationPhone_Ext.class);
  }
  
  public LocationType_Ext getLocationType_Ext() {
    return getOrCreateProperty("LocationType_Ext", "LocationType_Ext", null, pcftest.VehicleIncidentDV.LocationType_Ext.class);
  }
  
  public ValueElement getLossDesc() {
    return getOrCreateProperty("LossDesc", "LossDesc", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getLossEstimate() {
    return getOrCreateProperty("LossEstimate", "LossEstimate", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public LossParty getLossParty() {
    return getOrCreateProperty("LossParty", "LossParty", null, pcftest.VehicleIncidentDV.LossParty.class);
  }
  
  public pcftest.VehicleIncidentDV.NonRatedDriver_Ext getNonRatedDriver_Ext() {
    return getOrCreateProperty("NonRatedDriver_Ext", "NonRatedDriver_Ext", null, pcftest.VehicleIncidentDV.NonRatedDriver_Ext.class);
  }
  
  public BooleanValueElement getOperable() {
    return getOrCreateProperty("Operable", "Operable", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public OtherServicesLVInputGroupInputSet getOtherServicesLVInputGroupInputSet() {
    return getOrCreateProperty("OtherServicesLVInputGroupInputSet", "OtherServicesLVInputGroupInputSet", null, pcftest.OtherServicesLVInputGroupInputSet.class);
  }
  
  public Owner_Picker getOwner_Picker() {
    return getOrCreateProperty("Owner_Picker", "Owner_Picker", null, pcftest.VehicleIncidentDV.Owner_Picker.class);
  }
  
  public BooleanValueElement getOwnersPermission() {
    return getOrCreateProperty("OwnersPermission", "OwnersPermission", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public BooleanValueElement getPhantomVehicle() {
    return getOrCreateProperty("PhantomVehicle", "PhantomVehicle", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public Potential_Side_Hustle_Involved_Ext getPotential_Side_Hustle_Involved_Ext() {
    return getOrCreateProperty("Potential_Side_Hustle_Involved_Ext", "Potential_Side_Hustle_Involved_Ext", null, pcftest.VehicleIncidentDV.Potential_Side_Hustle_Involved_Ext.class);
  }
  
  public pcftest.VehicleIncidentDV.ReasonForUse getReasonForUse() {
    return getOrCreateProperty("ReasonForUse", "ReasonForUse", null, pcftest.VehicleIncidentDV.ReasonForUse.class);
  }
  
  public RecovAgcy_Picker getRecovAgcy_Picker() {
    return getOrCreateProperty("RecovAgcy_Picker", "RecovAgcy_Picker", null, pcftest.VehicleIncidentDV.RecovAgcy_Picker.class);
  }
  
  public RecoveryAddress getRecoveryAddress() {
    return getOrCreateProperty("RecoveryAddress", "RecoveryAddress", null, pcftest.VehicleIncidentDV.RecoveryAddress.class);
  }
  
  public RecoveryCondition getRecoveryCondition() {
    return getOrCreateProperty("RecoveryCondition", "RecoveryCondition", null, pcftest.VehicleIncidentDV.RecoveryCondition.class);
  }
  
  public DateElement getRecoveryDate() {
    return getOrCreateProperty("RecoveryDate", "RecoveryDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public RecoveryState getRecoveryState() {
    return getOrCreateProperty("RecoveryState", "RecoveryState", null, pcftest.VehicleIncidentDV.RecoveryState.class);
  }
  
  public RelationToInsured getRelationToInsured() {
    return getOrCreateProperty("RelationToInsured", "RelationToInsured", null, pcftest.VehicleIncidentDV.RelationToInsured.class);
  }
  
  public pcftest.VehicleIncidentDV.RentalServiceInputSet getRentalServiceInputSet() {
    return getOrCreateProperty("RentalServiceInputSet", "RentalServiceInputSet", null, pcftest.VehicleIncidentDV.RentalServiceInputSet.class);
  }
  
  public ValueElement getServiceRequestSubmitMessage() {
    return getOrCreateProperty("ServiceRequestSubmitMessage", "ServiceRequestSubmitMessage", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getServiceRequestSubmitMessageFNOL() {
    return getOrCreateProperty("ServiceRequestSubmitMessageFNOL", "ServiceRequestSubmitMessageFNOL", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Side_Hustle_Phase_Ext getSide_Hustle_Phase_Ext() {
    return getOrCreateProperty("Side_Hustle_Phase_Ext", "Side_Hustle_Phase_Ext", null, pcftest.VehicleIncidentDV.Side_Hustle_Phase_Ext.class);
  }
  
  public ValueElement getSpeed() {
    return getOrCreateProperty("Speed", "Speed", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public TheftRecovery getTheftRecovery() {
    return getOrCreateProperty("TheftRecovery", "TheftRecovery", null, pcftest.VehicleIncidentDV.TheftRecovery.class);
  }
  
  public Theft_AffdvCmplBy getTheft_AffdvCmplBy() {
    return getOrCreateProperty("Theft_AffdvCmplBy", "Theft_AffdvCmplBy", null, pcftest.VehicleIncidentDV.Theft_AffdvCmplBy.class);
  }
  
  public Theft_AffdvCmplInd getTheft_AffdvCmplInd() {
    return getOrCreateProperty("Theft_AffdvCmplInd", "Theft_AffdvCmplInd", null, pcftest.VehicleIncidentDV.Theft_AffdvCmplInd.class);
  }
  
  public BooleanValueElement getTheft_AntiThftInd() {
    return getOrCreateProperty("Theft_AntiThftInd", "Theft_AntiThftInd", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public BooleanValueElement getTheft_Indicator() {
    return getOrCreateProperty("Theft_Indicator", "Theft_Indicator", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public ValueElement getTheft_OdomRead() {
    return getOrCreateProperty("Theft_OdomRead", "Theft_OdomRead", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public BooleanValueElement getTheft_VehLockInd() {
    return getOrCreateProperty("Theft_VehLockInd", "Theft_VehLockInd", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public BooleanValueElement getTotalLoss() {
    return getOrCreateProperty("TotalLoss", "TotalLoss", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public pcftest.VehicleIncidentDV.VehicleDirection getVehicleDirection() {
    return getOrCreateProperty("VehicleDirection", "VehicleDirection", null, pcftest.VehicleIncidentDV.VehicleDirection.class);
  }
  
  public BooleanValueElement getVehicleParked() {
    return getOrCreateProperty("VehicleParked", "VehicleParked", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public Vehicle_BoatType getVehicle_BoatType() {
    return getOrCreateProperty("Vehicle_BoatType", "Vehicle_BoatType", null, pcftest.VehicleIncidentDV.Vehicle_BoatType.class);
  }
  
  public ValueElement getVehicle_Color() {
    return getOrCreateProperty("Vehicle_Color", "Vehicle_Color", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getVehicle_LicensePlate() {
    return getOrCreateProperty("Vehicle_LicensePlate", "Vehicle_LicensePlate", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getVehicle_Make() {
    return getOrCreateProperty("Vehicle_Make", "Vehicle_Make", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getVehicle_Model() {
    return getOrCreateProperty("Vehicle_Model", "Vehicle_Model", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Vehicle_OffRoadStyle getVehicle_OffRoadStyle() {
    return getOrCreateProperty("Vehicle_OffRoadStyle", "Vehicle_OffRoadStyle", null, pcftest.VehicleIncidentDV.Vehicle_OffRoadStyle.class);
  }
  
  public SelectElement getVehicle_Picker() {
    return getOrCreateProperty("Vehicle_Picker", "Vehicle_Picker", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public ValueElement getVehicle_SerialNumber() {
    return getOrCreateProperty("Vehicle_SerialNumber", "Vehicle_SerialNumber", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Vehicle_State getVehicle_State() {
    return getOrCreateProperty("Vehicle_State", "Vehicle_State", null, pcftest.VehicleIncidentDV.Vehicle_State.class);
  }
  
  public Vehicle_Style getVehicle_Style() {
    return getOrCreateProperty("Vehicle_Style", "Vehicle_Style", null, pcftest.VehicleIncidentDV.Vehicle_Style.class);
  }
  
  public ValueElement getVehicle_VIN() {
    return getOrCreateProperty("Vehicle_VIN", "Vehicle_VIN", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Vehicle_VehicleType getVehicle_VehicleType() {
    return getOrCreateProperty("Vehicle_VehicleType", "Vehicle_VehicleType", null, pcftest.VehicleIncidentDV.Vehicle_VehicleType.class);
  }
  
  public ValueElement getVehicle_Year() {
    return getOrCreateProperty("Vehicle_Year", "Vehicle_Year", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/vehicle/VehicleIncidentDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AppraisalServiceInputSet extends PCFElement {
    public AppraisalServiceInputSet(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public pcftest.AppraisalServiceInputSet getAppraisalServiceInputSet() {
      return getOrCreateProperty("AppraisalServiceInputSet", "AppraisalServiceInputSet", null, pcftest.AppraisalServiceInputSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/vehicle/VehicleIncidentDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Child_Safety_Seat_Ext extends SelectElement {
    public Child_Safety_Seat_Ext(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(ChildSafetySeat_Ext arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public ChildSafetySeat_Ext getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.ChildSafetySeat_Ext.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(ChildSafetySeat_Ext arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/vehicle/VehicleIncidentDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CollisionPoint extends SelectElement {
    public CollisionPoint(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(typekey.CollisionPoint arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public typekey.CollisionPoint getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.CollisionPoint.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(typekey.CollisionPoint arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/vehicle/VehicleIncidentDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Contacts extends PCFElement {
    public Contacts(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public EditableIncidentContactsLV getEditableIncidentContactsLV() {
      return getOrCreateProperty("EditableIncidentContactsLV", "EditableIncidentContactsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.EditableIncidentContactsLV.class);
    }
    
    public EditableIncidentContactsLV_tb getEditableIncidentContactsLV_tb() {
      return getOrCreateProperty("EditableIncidentContactsLV_tb", "EditableIncidentContactsLV_tb", null, pcftest.VehicleIncidentDV.Contacts.EditableIncidentContactsLV_tb.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/vehicle/VehicleIncidentDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class EditableIncidentContactsLV_tb extends PCFElement {
      public EditableIncidentContactsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public pcftest.VehicleIncidentDV.Contacts.EditableIncidentContactsLV_tb.Add getAdd() {
        return getOrCreateProperty("Add", "Add", null, pcftest.VehicleIncidentDV.Contacts.EditableIncidentContactsLV_tb.Add.class);
      }
      
      public pcftest.VehicleIncidentDV.Contacts.EditableIncidentContactsLV_tb.Remove getRemove() {
        return getOrCreateProperty("Remove", "Remove", null, pcftest.VehicleIncidentDV.Contacts.EditableIncidentContactsLV_tb.Remove.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/shared/vehicle/VehicleIncidentDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Add extends ClickableActionElement {
        public Add(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/shared/vehicle/VehicleIncidentDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Remove extends ClickableActionElement {
        public Remove(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/vehicle/VehicleIncidentDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Driver_Citations extends PCFElement {
    public Driver_Citations(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public DriverCitationsLV getDriverCitationsLV() {
      return getOrCreateProperty("DriverCitationsLV", "DriverCitationsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.DriverCitationsLV.class);
    }
    
    public DriverCitationsLV_tb getDriverCitationsLV_tb() {
      return getOrCreateProperty("DriverCitationsLV_tb", "DriverCitationsLV_tb", null, pcftest.VehicleIncidentDV.Driver_Citations.DriverCitationsLV_tb.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/vehicle/VehicleIncidentDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class DriverCitationsLV_tb extends PCFElement {
      public DriverCitationsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public pcftest.VehicleIncidentDV.Driver_Citations.DriverCitationsLV_tb.Add getAdd() {
        return getOrCreateProperty("Add", "Add", null, pcftest.VehicleIncidentDV.Driver_Citations.DriverCitationsLV_tb.Add.class);
      }
      
      public pcftest.VehicleIncidentDV.Driver_Citations.DriverCitationsLV_tb.Remove getRemove() {
        return getOrCreateProperty("Remove", "Remove", null, pcftest.VehicleIncidentDV.Driver_Citations.DriverCitationsLV_tb.Remove.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/shared/vehicle/VehicleIncidentDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Add extends ClickableActionElement {
        public Add(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/shared/vehicle/VehicleIncidentDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Remove extends ClickableActionElement {
        public Remove(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/vehicle/VehicleIncidentDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Driver_IsKidInPolicy extends SelectElement {
    public Driver_IsKidInPolicy(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(YesNo arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public YesNo getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.YesNo.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(YesNo arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/vehicle/VehicleIncidentDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Driver_IsKidInPolicy_Percentagedriven extends SelectElement {
    public Driver_IsKidInPolicy_Percentagedriven(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(PercentageDriven arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public PercentageDriven getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.PercentageDriven.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(PercentageDriven arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/vehicle/VehicleIncidentDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Driver_LicenseState extends SelectElement {
    public Driver_LicenseState(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(Jurisdiction arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public Jurisdiction getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.Jurisdiction.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(Jurisdiction arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/widgets/ClaimContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Driver_Picker extends SelectElement {
    public Driver_Picker(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimContactDetailPopup click() {
      return clickThis(pcftest.ClaimContactDetailPopup.class);
    }
    
    public ClaimNewPersonOnlyPickerMenuItemSet getClaimNewPersonOnlyPickerMenuItemSet() {
      return getOrCreateProperty("ClaimNewPersonOnlyPickerMenuItemSet", "ClaimNewPersonOnlyPickerMenuItemSet", null, pcftest.ClaimNewPersonOnlyPickerMenuItemSet.class);
    }
    
    public pcftest.VehicleIncidentDV.Driver_Picker.MenuItem_Search getMenuItem_Search() {
      return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.VehicleIncidentDV.Driver_Picker.MenuItem_Search.class);
    }
    
    public pcftest.VehicleIncidentDV.Driver_Picker.MenuItem_ViewDetails getMenuItem_ViewDetails() {
      return getOrCreateProperty("MenuItem_ViewDetails", "MenuItem_ViewDetails", null, pcftest.VehicleIncidentDV.Driver_Picker.MenuItem_ViewDetails.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/widgets/ClaimContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class MenuItem_Search extends ClickableActionElement {
      public MenuItem_Search(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public AddressBookPickerPopup click() {
        return clickThis(pcftest.AddressBookPickerPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/widgets/ClaimContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class MenuItem_ViewDetails extends ClickableActionElement {
      public MenuItem_ViewDetails(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/vehicle/VehicleIncidentDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Exposure_TrafficViolation extends SelectElement {
    public Exposure_TrafficViolation(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(YesNo arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public YesNo getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.YesNo.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(YesNo arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/vehicle/VehicleIncidentDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class GlassRepairAndReplaceRadioButton_Ext extends SelectElement {
    public GlassRepairAndReplaceRadioButton_Ext(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(GlassRepairAndReplace_Ext arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public GlassRepairAndReplace_Ext getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.GlassRepairAndReplace_Ext.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(GlassRepairAndReplace_Ext arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/vehicle/VehicleIncidentDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LocationPhone_Ext extends PCFElement {
    public LocationPhone_Ext(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public GlobalPhoneInputSet getGlobalPhoneInputSet() {
      return getOrCreateProperty("GlobalPhoneInputSet", "GlobalPhoneInputSet", null, pcftest.GlobalPhoneInputSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/vehicle/VehicleIncidentDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LocationType_Ext extends SelectElement {
    public LocationType_Ext(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(VehicleDamageLocation_Ext arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public VehicleDamageLocation_Ext getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.VehicleDamageLocation_Ext.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(VehicleDamageLocation_Ext arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/vehicle/VehicleIncidentDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LossParty extends SelectElement {
    public LossParty(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(LossPartyType arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public LossPartyType getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.LossPartyType.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(LossPartyType arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/vehicle/VehicleIncidentDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NonRatedDriver_Ext extends SelectElement {
    public NonRatedDriver_Ext(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(typekey.NonRatedDriver_Ext arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public typekey.NonRatedDriver_Ext getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.NonRatedDriver_Ext.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(typekey.NonRatedDriver_Ext arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/widgets/ClaimContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Owner_Picker extends SelectElement {
    public Owner_Picker(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimContactDetailPopup click() {
      return clickThis(pcftest.ClaimContactDetailPopup.class);
    }
    
    public ClaimNewContactPickerMenuItemSet getClaimNewContactPickerMenuItemSet() {
      return getOrCreateProperty("ClaimNewContactPickerMenuItemSet", "ClaimNewContactPickerMenuItemSet", null, pcftest.ClaimNewContactPickerMenuItemSet.class);
    }
    
    public pcftest.VehicleIncidentDV.Owner_Picker.MenuItem_Search getMenuItem_Search() {
      return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.VehicleIncidentDV.Owner_Picker.MenuItem_Search.class);
    }
    
    public pcftest.VehicleIncidentDV.Owner_Picker.MenuItem_ViewDetails getMenuItem_ViewDetails() {
      return getOrCreateProperty("MenuItem_ViewDetails", "MenuItem_ViewDetails", null, pcftest.VehicleIncidentDV.Owner_Picker.MenuItem_ViewDetails.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/widgets/ClaimContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class MenuItem_Search extends ClickableActionElement {
      public MenuItem_Search(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public AddressBookPickerPopup click() {
        return clickThis(pcftest.AddressBookPickerPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/widgets/ClaimContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class MenuItem_ViewDetails extends ClickableActionElement {
      public MenuItem_ViewDetails(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/vehicle/VehicleIncidentDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Potential_Side_Hustle_Involved_Ext extends SelectElement {
    public Potential_Side_Hustle_Involved_Ext(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(PotentialSideHustle_Ext arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public PotentialSideHustle_Ext getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.PotentialSideHustle_Ext.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(PotentialSideHustle_Ext arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/vehicle/VehicleIncidentDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ReasonForUse extends SelectElement {
    public ReasonForUse(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(typekey.ReasonForUse arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public typekey.ReasonForUse getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.ReasonForUse.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(typekey.ReasonForUse arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/widgets/ClaimContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RecovAgcy_Picker extends SelectElement {
    public RecovAgcy_Picker(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimContactDetailPopup click() {
      return clickThis(pcftest.ClaimContactDetailPopup.class);
    }
    
    public ClaimNewContactPickerMenuItemSet getClaimNewContactPickerMenuItemSet() {
      return getOrCreateProperty("ClaimNewContactPickerMenuItemSet", "ClaimNewContactPickerMenuItemSet", null, pcftest.ClaimNewContactPickerMenuItemSet.class);
    }
    
    public pcftest.VehicleIncidentDV.RecovAgcy_Picker.MenuItem_Search getMenuItem_Search() {
      return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.VehicleIncidentDV.RecovAgcy_Picker.MenuItem_Search.class);
    }
    
    public pcftest.VehicleIncidentDV.RecovAgcy_Picker.MenuItem_ViewDetails getMenuItem_ViewDetails() {
      return getOrCreateProperty("MenuItem_ViewDetails", "MenuItem_ViewDetails", null, pcftest.VehicleIncidentDV.RecovAgcy_Picker.MenuItem_ViewDetails.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/widgets/ClaimContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class MenuItem_Search extends ClickableActionElement {
      public MenuItem_Search(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public AddressBookPickerPopup click() {
        return clickThis(pcftest.AddressBookPickerPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/widgets/ClaimContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class MenuItem_ViewDetails extends ClickableActionElement {
      public MenuItem_ViewDetails(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/vehicle/VehicleIncidentDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RecoveryAddress extends PCFElement {
    public RecoveryAddress(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public CCAddressInputSet getCCAddressInputSet() {
      return getOrCreateProperty("CCAddressInputSet", "CCAddressInputSet", null, pcftest.CCAddressInputSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/vehicle/VehicleIncidentDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RecoveryCondition extends SelectElement {
    public RecoveryCondition(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(RecovCondType arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public RecovCondType getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.RecovCondType.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(RecovCondType arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/vehicle/VehicleIncidentDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RecoveryState extends SelectElement {
    public RecoveryState(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(State arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public State getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.State.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(State arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/vehicle/VehicleIncidentDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RelationToInsured extends SelectElement {
    public RelationToInsured(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(PersonRelationType arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public PersonRelationType getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.PersonRelationType.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(PersonRelationType arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/vehicle/VehicleIncidentDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RentalServiceInputSet extends PCFElement {
    public RentalServiceInputSet(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public pcftest.RentalServiceInputSet getRentalServiceInputSet() {
      return getOrCreateProperty("RentalServiceInputSet", "RentalServiceInputSet", null, pcftest.RentalServiceInputSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/vehicle/VehicleIncidentDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Side_Hustle_Phase_Ext extends SelectElement {
    public Side_Hustle_Phase_Ext(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(SideHustlePhase_Ext arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public SideHustlePhase_Ext getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.SideHustlePhase_Ext.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(SideHustlePhase_Ext arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/vehicle/VehicleIncidentDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TheftRecovery extends ValueElement {
    public TheftRecovery(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/widgets/ClaimContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Theft_AffdvCmplBy extends SelectElement {
    public Theft_AffdvCmplBy(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimContactDetailPopup click() {
      return clickThis(pcftest.ClaimContactDetailPopup.class);
    }
    
    public ClaimNewContactPickerMenuItemSet getClaimNewContactPickerMenuItemSet() {
      return getOrCreateProperty("ClaimNewContactPickerMenuItemSet", "ClaimNewContactPickerMenuItemSet", null, pcftest.ClaimNewContactPickerMenuItemSet.class);
    }
    
    public pcftest.VehicleIncidentDV.Theft_AffdvCmplBy.MenuItem_Search getMenuItem_Search() {
      return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.VehicleIncidentDV.Theft_AffdvCmplBy.MenuItem_Search.class);
    }
    
    public pcftest.VehicleIncidentDV.Theft_AffdvCmplBy.MenuItem_ViewDetails getMenuItem_ViewDetails() {
      return getOrCreateProperty("MenuItem_ViewDetails", "MenuItem_ViewDetails", null, pcftest.VehicleIncidentDV.Theft_AffdvCmplBy.MenuItem_ViewDetails.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/widgets/ClaimContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class MenuItem_Search extends ClickableActionElement {
      public MenuItem_Search(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public AddressBookPickerPopup click() {
        return clickThis(pcftest.AddressBookPickerPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/widgets/ClaimContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class MenuItem_ViewDetails extends ClickableActionElement {
      public MenuItem_ViewDetails(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/vehicle/VehicleIncidentDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Theft_AffdvCmplInd extends SelectElement {
    public Theft_AffdvCmplInd(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(YesNo arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public YesNo getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.YesNo.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(YesNo arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/vehicle/VehicleIncidentDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class VehicleDirection extends SelectElement {
    public VehicleDirection(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(typekey.VehicleDirection arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public typekey.VehicleDirection getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.VehicleDirection.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(typekey.VehicleDirection arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/vehicle/VehicleIncidentDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Vehicle_BoatType extends SelectElement {
    public Vehicle_BoatType(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(BoatType arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public BoatType getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.BoatType.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(BoatType arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/vehicle/VehicleIncidentDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Vehicle_OffRoadStyle extends SelectElement {
    public Vehicle_OffRoadStyle(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(OffRoadVehicleStyle arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public OffRoadVehicleStyle getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.OffRoadVehicleStyle.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(OffRoadVehicleStyle arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/vehicle/VehicleIncidentDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Vehicle_State extends SelectElement {
    public Vehicle_State(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(Jurisdiction arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public Jurisdiction getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.Jurisdiction.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(Jurisdiction arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/vehicle/VehicleIncidentDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Vehicle_Style extends SelectElement {
    public Vehicle_Style(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(VehicleStyle arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public VehicleStyle getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.VehicleStyle.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(VehicleStyle arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/vehicle/VehicleIncidentDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Vehicle_VehicleType extends SelectElement {
    public Vehicle_VehicleType(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(VehicleType arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public VehicleType getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.VehicleType.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(VehicleType arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  
}