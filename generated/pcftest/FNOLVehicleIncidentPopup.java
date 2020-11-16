package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.IteratorEntriesWithPaging;
import gw.smoketest.platform.web.IteratorEntryCheckboxElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.PagingElement;
import gw.smoketest.platform.web.RowElement;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.SelectorCellElement;
import gw.smoketest.platform.web.ValueElement;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.FNOLVehicleIncidentPopup.FNOLVehicleIncidentPopup_UpLink;
import pcftest.FNOLVehicleIncidentPopup.FNOLVehicleIncidentScreen;
import pcftest.FNOLVehicleIncidentPopup.FNOLVehicleIncidentScreen.Cancel;
import pcftest.FNOLVehicleIncidentPopup.FNOLVehicleIncidentScreen.Child_Safety_Seat;
import pcftest.FNOLVehicleIncidentPopup.FNOLVehicleIncidentScreen.Edit;
import pcftest.FNOLVehicleIncidentPopup.FNOLVehicleIncidentScreen.GlassRepairAndReplaceRadioButton_Ext;
import pcftest.FNOLVehicleIncidentPopup.FNOLVehicleIncidentScreen.LocationPhone_Ext;
import pcftest.FNOLVehicleIncidentPopup.FNOLVehicleIncidentScreen.LocationType_Ext;
import pcftest.FNOLVehicleIncidentPopup.FNOLVehicleIncidentScreen.OccupantLV;
import pcftest.FNOLVehicleIncidentPopup.FNOLVehicleIncidentScreen.OccupantLV.InjuriesHeader;
import pcftest.FNOLVehicleIncidentPopup.FNOLVehicleIncidentScreen.OccupantLV._ListPaging;
import pcftest.FNOLVehicleIncidentPopup.FNOLVehicleIncidentScreen.OccupantLV.entry;
import pcftest.FNOLVehicleIncidentPopup.FNOLVehicleIncidentScreen.OccupantLV.entry._Select;
import pcftest.FNOLVehicleIncidentPopup.FNOLVehicleIncidentScreen.OccupantLV.entry._ViewDetail;
import pcftest.FNOLVehicleIncidentPopup.FNOLVehicleIncidentScreen.OccupantLV.entry.name;
import pcftest.FNOLVehicleIncidentPopup.FNOLVehicleIncidentScreen.OccupantLV.nameHeader;
import pcftest.FNOLVehicleIncidentPopup.FNOLVehicleIncidentScreen.OccupantLV_tb;
import pcftest.FNOLVehicleIncidentPopup.FNOLVehicleIncidentScreen.OccupantLV_tb.AddDriverButton;
import pcftest.FNOLVehicleIncidentPopup.FNOLVehicleIncidentScreen.OccupantLV_tb.AddPassengerButton;
import pcftest.FNOLVehicleIncidentPopup.FNOLVehicleIncidentScreen.OtherDetailsDV;
import pcftest.FNOLVehicleIncidentPopup.FNOLVehicleIncidentScreen.OtherDetailsDV.DriverCitationsLV_tb;
import pcftest.FNOLVehicleIncidentPopup.FNOLVehicleIncidentScreen.Owner_Picker;
import pcftest.FNOLVehicleIncidentPopup.FNOLVehicleIncidentScreen.Potential_Side_Hustle_Involved;
import pcftest.FNOLVehicleIncidentPopup.FNOLVehicleIncidentScreen.Side_Hustle_Phase;
import pcftest.FNOLVehicleIncidentPopup.FNOLVehicleIncidentScreen.Theft_AffdvCmplBy;
import pcftest.FNOLVehicleIncidentPopup.FNOLVehicleIncidentScreen.Theft_AffdvCmplInd;
import pcftest.FNOLVehicleIncidentPopup.FNOLVehicleIncidentScreen.TotalLoss;
import pcftest.FNOLVehicleIncidentPopup.FNOLVehicleIncidentScreen.TotalLoss.CalculateButton;
import pcftest.FNOLVehicleIncidentPopup.FNOLVehicleIncidentScreen.Update;
import pcftest.FNOLVehicleIncidentPopup.FNOLVehicleIncidentScreen.Vehicle_Picker;
import pcftest.FNOLVehicleIncidentPopup.FNOLVehicleIncidentScreen.Vehicle_Picker.NewVehicleMenuItem;
import pcftest.FNOLVehicleIncidentPopup.FNOLVehicleIncidentScreen.Vehicle_Picker.VehicleDetailMenuItem;
import pcftest.FNOLVehicleIncidentPopup.FNOLVehicleIncidentScreen.Vehicle_State;
import pcftest.FNOLVehicleIncidentPopup.FNOLVehicleIncidentScreen.Vehicle_Style;
import pcftest.FNOLVehicleIncidentPopup.FNOLVehicleIncidentScreen.Vehicle_VehicleType;
import pcftest.FNOLVehicleIncidentPopup.FNOLVehicleIncidentScreen._msgs;
import pcftest.FNOLVehicleIncidentPopup._Paging;
import pcftest.FNOLVehicleIncidentPopup.__crumb__;
import typekey.ChildSafetySeat_Ext;
import typekey.GlassRepairAndReplace_Ext;
import typekey.Jurisdiction;
import typekey.PotentialSideHustle_Ext;
import typekey.SideHustlePhase_Ext;
import typekey.VehicleDamageLocation_Ext;
import typekey.VehicleStyle;
import typekey.VehicleType;
import typekey.YesNo;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/FNOL/FNOLVehicleIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class FNOLVehicleIncidentPopup extends PCFLocation {
  public final static String CHECKSUM = "74ff02129553915016a9d80dee2f58c9";
  
  public FNOLVehicleIncidentPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("FNOLVehicleIncidentPopup"));
  }
  
  public FNOLVehicleIncidentPopup_UpLink getFNOLVehicleIncidentPopup_UpLink() {
    return getOrCreateProperty("FNOLVehicleIncidentPopup_UpLink", "FNOLVehicleIncidentPopup_UpLink", null, pcftest.FNOLVehicleIncidentPopup.FNOLVehicleIncidentPopup_UpLink.class);
  }
  
  public FNOLVehicleIncidentScreen getFNOLVehicleIncidentScreen() {
    return getOrCreateProperty("FNOLVehicleIncidentScreen", "FNOLVehicleIncidentScreen", null, pcftest.FNOLVehicleIncidentPopup.FNOLVehicleIncidentScreen.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.FNOLVehicleIncidentPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.FNOLVehicleIncidentPopup.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLVehicleIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FNOLVehicleIncidentPopup_UpLink extends ClickableActionElement {
    public FNOLVehicleIncidentPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLVehicleIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FNOLVehicleIncidentScreen extends PCFElement {
    public FNOLVehicleIncidentScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getAddress_Description_Ext() {
      return getOrCreateProperty("Address_Description_Ext", "Address_Description_Ext", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public CCAddressInputSet getCCAddressInputSet() {
      return getOrCreateProperty("CCAddressInputSet", "CCAddressInputSet", null, pcftest.CCAddressInputSet.class);
    }
    
    public Cancel getCancel() {
      return getOrCreateProperty("Cancel", "Cancel", null, pcftest.FNOLVehicleIncidentPopup.FNOLVehicleIncidentScreen.Cancel.class);
    }
    
    public Child_Safety_Seat getChild_Safety_Seat() {
      return getOrCreateProperty("Child_Safety_Seat", "Child_Safety_Seat", null, pcftest.FNOLVehicleIncidentPopup.FNOLVehicleIncidentScreen.Child_Safety_Seat.class);
    }
    
    public ValueElement getDescription() {
      return getOrCreateProperty("Description", "Description", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public Edit getEdit() {
      return getOrCreateProperty("Edit", "Edit", null, pcftest.FNOLVehicleIncidentPopup.FNOLVehicleIncidentScreen.Edit.class);
    }
    
    public BooleanValueElement getExposure_AirbagsDeployed() {
      return getOrCreateProperty("Exposure_AirbagsDeployed", "Exposure_AirbagsDeployed", null, gw.smoketest.platform.web.BooleanValueElement.class);
    }
    
    public BooleanValueElement getExposure_EquipmentFailure() {
      return getOrCreateProperty("Exposure_EquipmentFailure", "Exposure_EquipmentFailure", null, gw.smoketest.platform.web.BooleanValueElement.class);
    }
    
    public GlassRepairAndReplaceRadioButton_Ext getGlassRepairAndReplaceRadioButton_Ext() {
      return getOrCreateProperty("GlassRepairAndReplaceRadioButton_Ext", "GlassRepairAndReplaceRadioButton_Ext", null, pcftest.FNOLVehicleIncidentPopup.FNOLVehicleIncidentScreen.GlassRepairAndReplaceRadioButton_Ext.class);
    }
    
    public LocationPhone_Ext getLocationPhone_Ext() {
      return getOrCreateProperty("LocationPhone_Ext", "LocationPhone_Ext", null, pcftest.FNOLVehicleIncidentPopup.FNOLVehicleIncidentScreen.LocationPhone_Ext.class);
    }
    
    public LocationType_Ext getLocationType_Ext() {
      return getOrCreateProperty("LocationType_Ext", "LocationType_Ext", null, pcftest.FNOLVehicleIncidentPopup.FNOLVehicleIncidentScreen.LocationType_Ext.class);
    }
    
    public BooleanValueElement getLossParty() {
      return getOrCreateProperty("LossParty", "LossParty", null, gw.smoketest.platform.web.BooleanValueElement.class);
    }
    
    public OccupantLV getOccupantLV() {
      return getOrCreateProperty("OccupantLV", "OccupantLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.FNOLVehicleIncidentPopup.FNOLVehicleIncidentScreen.OccupantLV.class);
    }
    
    public OccupantLV_tb getOccupantLV_tb() {
      return getOrCreateProperty("OccupantLV_tb", "OccupantLV_tb", null, pcftest.FNOLVehicleIncidentPopup.FNOLVehicleIncidentScreen.OccupantLV_tb.class);
    }
    
    public BooleanValueElement getOperable() {
      return getOrCreateProperty("Operable", "Operable", null, gw.smoketest.platform.web.BooleanValueElement.class);
    }
    
    public OtherDetailsDV getOtherDetailsDV() {
      return getOrCreateProperty("OtherDetailsDV", "OtherDetailsDV", null, pcftest.FNOLVehicleIncidentPopup.FNOLVehicleIncidentScreen.OtherDetailsDV.class);
    }
    
    public Owner_Picker getOwner_Picker() {
      return getOrCreateProperty("Owner_Picker", "Owner_Picker", null, pcftest.FNOLVehicleIncidentPopup.FNOLVehicleIncidentScreen.Owner_Picker.class);
    }
    
    public Potential_Side_Hustle_Involved getPotential_Side_Hustle_Involved() {
      return getOrCreateProperty("Potential_Side_Hustle_Involved", "Potential_Side_Hustle_Involved", null, pcftest.FNOLVehicleIncidentPopup.FNOLVehicleIncidentScreen.Potential_Side_Hustle_Involved.class);
    }
    
    public ValueElement getServiceRequestSubmitMessage() {
      return getOrCreateProperty("ServiceRequestSubmitMessage", "ServiceRequestSubmitMessage", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public Side_Hustle_Phase getSide_Hustle_Phase() {
      return getOrCreateProperty("Side_Hustle_Phase", "Side_Hustle_Phase", null, pcftest.FNOLVehicleIncidentPopup.FNOLVehicleIncidentScreen.Side_Hustle_Phase.class);
    }
    
    public Theft_AffdvCmplBy getTheft_AffdvCmplBy() {
      return getOrCreateProperty("Theft_AffdvCmplBy", "Theft_AffdvCmplBy", null, pcftest.FNOLVehicleIncidentPopup.FNOLVehicleIncidentScreen.Theft_AffdvCmplBy.class);
    }
    
    public Theft_AffdvCmplInd getTheft_AffdvCmplInd() {
      return getOrCreateProperty("Theft_AffdvCmplInd", "Theft_AffdvCmplInd", null, pcftest.FNOLVehicleIncidentPopup.FNOLVehicleIncidentScreen.Theft_AffdvCmplInd.class);
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
    
    public TotalLoss getTotalLoss() {
      return getOrCreateProperty("TotalLoss", "TotalLoss", null, pcftest.FNOLVehicleIncidentPopup.FNOLVehicleIncidentScreen.TotalLoss.class);
    }
    
    public ValueElement getTotalLossPoints() {
      return getOrCreateProperty("TotalLossPoints", "TotalLossPoints", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public Update getUpdate() {
      return getOrCreateProperty("Update", "Update", null, pcftest.FNOLVehicleIncidentPopup.FNOLVehicleIncidentScreen.Update.class);
    }
    
    public VehicleIncidentPanelSet getVehicleIncidentPanelSet() {
      return getOrCreateProperty("VehicleIncidentPanelSet", "VehicleIncidentPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.VehicleIncidentPanelSet.class);
    }
    
    public BooleanValueElement getVehicleParked() {
      return getOrCreateProperty("VehicleParked", "VehicleParked", null, gw.smoketest.platform.web.BooleanValueElement.class);
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
    
    public Vehicle_Picker getVehicle_Picker() {
      return getOrCreateProperty("Vehicle_Picker", "Vehicle_Picker", null, pcftest.FNOLVehicleIncidentPopup.FNOLVehicleIncidentScreen.Vehicle_Picker.class);
    }
    
    public Vehicle_State getVehicle_State() {
      return getOrCreateProperty("Vehicle_State", "Vehicle_State", null, pcftest.FNOLVehicleIncidentPopup.FNOLVehicleIncidentScreen.Vehicle_State.class);
    }
    
    public Vehicle_Style getVehicle_Style() {
      return getOrCreateProperty("Vehicle_Style", "Vehicle_Style", null, pcftest.FNOLVehicleIncidentPopup.FNOLVehicleIncidentScreen.Vehicle_Style.class);
    }
    
    public ValueElement getVehicle_VIN() {
      return getOrCreateProperty("Vehicle_VIN", "Vehicle_VIN", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public Vehicle_VehicleType getVehicle_VehicleType() {
      return getOrCreateProperty("Vehicle_VehicleType", "Vehicle_VehicleType", null, pcftest.FNOLVehicleIncidentPopup.FNOLVehicleIncidentScreen.Vehicle_VehicleType.class);
    }
    
    public ValueElement getVehicle_Year() {
      return getOrCreateProperty("Vehicle_Year", "Vehicle_Year", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.FNOLVehicleIncidentPopup.FNOLVehicleIncidentScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLVehicleIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Cancel extends ClickableActionElement {
      public Cancel(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLVehicleIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Child_Safety_Seat extends SelectElement {
      public Child_Safety_Seat(ISmokeTest helper, PCFElementId componentId)  {
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
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLVehicleIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Edit extends ClickableActionElement {
      public Edit(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLVehicleIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLVehicleIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class LocationPhone_Ext extends PCFElement {
      public LocationPhone_Ext(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public GlobalPhoneInputSet getGlobalPhoneInputSet() {
        return getOrCreateProperty("GlobalPhoneInputSet", "GlobalPhoneInputSet", null, pcftest.GlobalPhoneInputSet.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLVehicleIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLVehicleIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class OccupantLV extends PCFElement {
      public OccupantLV(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ValueElement getInjuredIconHeader() {
        return getOrCreateProperty("InjuredIconHeader", "InjuredIconHeader", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public InjuriesHeader getInjuriesHeader() {
        return getOrCreateProperty("InjuriesHeader", "InjuriesHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.FNOLVehicleIncidentPopup.FNOLVehicleIncidentScreen.OccupantLV.InjuriesHeader.class);
      }
      
      public ValueElement getRoleIconHeader() {
        return getOrCreateProperty("RoleIconHeader", "RoleIconHeader", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      @SuppressWarnings(value = "unchecked")
      public IteratorEntriesWithPaging<entry> get_Entries() {
        return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.FNOLVehicleIncidentPopup.FNOLVehicleIncidentScreen.OccupantLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
      }
      
      public _ListPaging get_ListPaging() {
        return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.FNOLVehicleIncidentPopup.FNOLVehicleIncidentScreen.OccupantLV._ListPaging.class);
      }
      
      public nameHeader getnameHeader() {
        return getOrCreateProperty("nameHeader", "nameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.FNOLVehicleIncidentPopup.FNOLVehicleIncidentScreen.OccupantLV.nameHeader.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/FNOL/FNOLVehicleIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class InjuriesHeader extends ValueElement {
        public InjuriesHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/FNOL/FNOLVehicleIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _ListPaging extends PagingElement {
        public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/FNOL/FNOLVehicleIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class entry extends RowElement {
        public entry(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public BooleanValueElement getInjuredIcon() {
          return getOrCreateProperty("InjuredIcon", "InjuredIcon", null, gw.smoketest.platform.web.BooleanValueElement.class);
        }
        
        public ValueElement getInjuries() {
          return getOrCreateProperty("Injuries", "Injuries", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public BooleanValueElement getRoleIcon() {
          return getOrCreateProperty("RoleIcon", "RoleIcon", null, gw.smoketest.platform.web.BooleanValueElement.class);
        }
        
        public IteratorEntryCheckboxElement get_Checkbox() {
          return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
        }
        
        public _Select get_Select() {
          return getOrCreateProperty("_Select", "_Select", null, pcftest.FNOLVehicleIncidentPopup.FNOLVehicleIncidentScreen.OccupantLV.entry._Select.class);
        }
        
        public _ViewDetail get_ViewDetail() {
          return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.FNOLVehicleIncidentPopup.FNOLVehicleIncidentScreen.OccupantLV.entry._ViewDetail.class);
        }
        
        public name getname() {
          return getOrCreateProperty("name", "name", null, pcftest.FNOLVehicleIncidentPopup.FNOLVehicleIncidentScreen.OccupantLV.entry.name.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/FNOL/FNOLVehicleIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class _Select extends SelectorCellElement {
          public _Select(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/FNOL/FNOLVehicleIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class _ViewDetail extends BooleanValueElement {
          public _ViewDetail(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/FNOL/FNOLVehicleIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class name extends ValueElement {
          public name(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public FNOLContactPopup click() {
            return clickThis(pcftest.FNOLContactPopup.class);
          }
          
          
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/FNOL/FNOLVehicleIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class nameHeader extends ValueElement {
        public nameHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLVehicleIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class OccupantLV_tb extends PCFElement {
      public OccupantLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public pcftest.FNOLVehicleIncidentPopup.FNOLVehicleIncidentScreen.OccupantLV_tb.Add getAdd() {
        return getOrCreateProperty("Add", "Add", null, pcftest.FNOLVehicleIncidentPopup.FNOLVehicleIncidentScreen.OccupantLV_tb.Add.class);
      }
      
      public AddDriverButton getAddDriverButton() {
        return getOrCreateProperty("AddDriverButton", "AddDriverButton", null, pcftest.FNOLVehicleIncidentPopup.FNOLVehicleIncidentScreen.OccupantLV_tb.AddDriverButton.class);
      }
      
      public AddPassengerButton getAddPassengerButton() {
        return getOrCreateProperty("AddPassengerButton", "AddPassengerButton", null, pcftest.FNOLVehicleIncidentPopup.FNOLVehicleIncidentScreen.OccupantLV_tb.AddPassengerButton.class);
      }
      
      public pcftest.FNOLVehicleIncidentPopup.FNOLVehicleIncidentScreen.OccupantLV_tb.Remove getRemove() {
        return getOrCreateProperty("Remove", "Remove", null, pcftest.FNOLVehicleIncidentPopup.FNOLVehicleIncidentScreen.OccupantLV_tb.Remove.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/FNOL/FNOLVehicleIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Add extends ClickableActionElement {
        public Add(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/FNOL/FNOLVehicleIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class AddDriverButton extends ClickableActionElement {
        public AddDriverButton(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/FNOL/FNOLVehicleIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class AddPassengerButton extends ClickableActionElement {
        public AddPassengerButton(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/FNOL/FNOLVehicleIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Remove extends ClickableActionElement {
        public Remove(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLVehicleIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class OtherDetailsDV extends DetailViewElement {
      public OtherDetailsDV(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public pcftest.FNOLVehicleIncidentPopup.FNOLVehicleIncidentScreen.OtherDetailsDV.CollisionPoint getCollisionPoint() {
        return getOrCreateProperty("CollisionPoint", "CollisionPoint", null, pcftest.FNOLVehicleIncidentPopup.FNOLVehicleIncidentScreen.OtherDetailsDV.CollisionPoint.class);
      }
      
      public DriverCitationsLV getDriverCitationsLV() {
        return getOrCreateProperty("DriverCitationsLV", "DriverCitationsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.DriverCitationsLV.class);
      }
      
      public DriverCitationsLV_tb getDriverCitationsLV_tb() {
        return getOrCreateProperty("DriverCitationsLV_tb", "DriverCitationsLV_tb", null, pcftest.FNOLVehicleIncidentPopup.FNOLVehicleIncidentScreen.OtherDetailsDV.DriverCitationsLV_tb.class);
      }
      
      public BooleanValueElement getLoanInformation_Loan() {
        return getOrCreateProperty("LoanInformation_Loan", "LoanInformation_Loan", null, gw.smoketest.platform.web.BooleanValueElement.class);
      }
      
      public ValueElement getMonthlyPayment() {
        return getOrCreateProperty("MonthlyPayment", "MonthlyPayment", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getMonthsRemaining() {
        return getOrCreateProperty("MonthsRemaining", "MonthsRemaining", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getPayoffAmount() {
        return getOrCreateProperty("PayoffAmount", "PayoffAmount", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getSpeed() {
        return getOrCreateProperty("Speed", "Speed", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public pcftest.FNOLVehicleIncidentPopup.FNOLVehicleIncidentScreen.OtherDetailsDV.VehicleDirection getVehicleDirection() {
        return getOrCreateProperty("VehicleDirection", "VehicleDirection", null, pcftest.FNOLVehicleIncidentPopup.FNOLVehicleIncidentScreen.OtherDetailsDV.VehicleDirection.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/FNOL/FNOLVehicleIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
      @Generated(comments = "config/web/pcf/claim/FNOL/FNOLVehicleIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class DriverCitationsLV_tb extends PCFElement {
        public DriverCitationsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public pcftest.FNOLVehicleIncidentPopup.FNOLVehicleIncidentScreen.OtherDetailsDV.DriverCitationsLV_tb.Add getAdd() {
          return getOrCreateProperty("Add", "Add", null, pcftest.FNOLVehicleIncidentPopup.FNOLVehicleIncidentScreen.OtherDetailsDV.DriverCitationsLV_tb.Add.class);
        }
        
        public pcftest.FNOLVehicleIncidentPopup.FNOLVehicleIncidentScreen.OtherDetailsDV.DriverCitationsLV_tb.Remove getRemove() {
          return getOrCreateProperty("Remove", "Remove", null, pcftest.FNOLVehicleIncidentPopup.FNOLVehicleIncidentScreen.OtherDetailsDV.DriverCitationsLV_tb.Remove.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/FNOL/FNOLVehicleIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class Add extends ClickableActionElement {
          public Add(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/FNOL/FNOLVehicleIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class Remove extends ClickableActionElement {
          public Remove(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/FNOL/FNOLVehicleIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
      
      public pcftest.FNOLVehicleIncidentPopup.FNOLVehicleIncidentScreen.Owner_Picker.MenuItem_Search getMenuItem_Search() {
        return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.FNOLVehicleIncidentPopup.FNOLVehicleIncidentScreen.Owner_Picker.MenuItem_Search.class);
      }
      
      public pcftest.FNOLVehicleIncidentPopup.FNOLVehicleIncidentScreen.Owner_Picker.MenuItem_ViewDetails getMenuItem_ViewDetails() {
        return getOrCreateProperty("MenuItem_ViewDetails", "MenuItem_ViewDetails", null, pcftest.FNOLVehicleIncidentPopup.FNOLVehicleIncidentScreen.Owner_Picker.MenuItem_ViewDetails.class);
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
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLVehicleIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Potential_Side_Hustle_Involved extends SelectElement {
      public Potential_Side_Hustle_Involved(ISmokeTest helper, PCFElementId componentId)  {
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
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLVehicleIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Side_Hustle_Phase extends SelectElement {
      public Side_Hustle_Phase(ISmokeTest helper, PCFElementId componentId)  {
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
      
      public pcftest.FNOLVehicleIncidentPopup.FNOLVehicleIncidentScreen.Theft_AffdvCmplBy.MenuItem_Search getMenuItem_Search() {
        return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.FNOLVehicleIncidentPopup.FNOLVehicleIncidentScreen.Theft_AffdvCmplBy.MenuItem_Search.class);
      }
      
      public pcftest.FNOLVehicleIncidentPopup.FNOLVehicleIncidentScreen.Theft_AffdvCmplBy.MenuItem_ViewDetails getMenuItem_ViewDetails() {
        return getOrCreateProperty("MenuItem_ViewDetails", "MenuItem_ViewDetails", null, pcftest.FNOLVehicleIncidentPopup.FNOLVehicleIncidentScreen.Theft_AffdvCmplBy.MenuItem_ViewDetails.class);
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
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLVehicleIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLVehicleIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class TotalLoss extends BooleanValueElement {
      public TotalLoss(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public CalculateButton getCalculateButton() {
        return getOrCreateProperty("CalculateButton", "CalculateButton", null, pcftest.FNOLVehicleIncidentPopup.FNOLVehicleIncidentScreen.TotalLoss.CalculateButton.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/FNOL/FNOLVehicleIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class CalculateButton extends ClickableActionElement {
        public CalculateButton(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public TotalLossCalculatorPopup click() {
          return clickThis(pcftest.TotalLossCalculatorPopup.class);
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLVehicleIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Update extends ClickableActionElement {
      public Update(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLVehicleIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Vehicle_Picker extends SelectElement {
      public Vehicle_Picker(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public NewVehicleMenuItem getNewVehicleMenuItem() {
        return getOrCreateProperty("NewVehicleMenuItem", "NewVehicleMenuItem", null, pcftest.FNOLVehicleIncidentPopup.FNOLVehicleIncidentScreen.Vehicle_Picker.NewVehicleMenuItem.class);
      }
      
      public VehicleDetailMenuItem getVehicleDetailMenuItem() {
        return getOrCreateProperty("VehicleDetailMenuItem", "VehicleDetailMenuItem", null, pcftest.FNOLVehicleIncidentPopup.FNOLVehicleIncidentScreen.Vehicle_Picker.VehicleDetailMenuItem.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/FNOL/FNOLVehicleIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class NewVehicleMenuItem extends ClickableActionElement {
        public NewVehicleMenuItem(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/FNOL/FNOLVehicleIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class VehicleDetailMenuItem extends ClickableActionElement {
        public VehicleDetailMenuItem(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public NewClaimWizard_PolicyVehicleDetailPopup click() {
          return clickThis(pcftest.NewClaimWizard_PolicyVehicleDetailPopup.class);
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLVehicleIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLVehicleIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLVehicleIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLVehicleIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _msgs extends MessagesElement {
      public _msgs(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLVehicleIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLVehicleIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}