package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.CheckboxValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.VehicleIncidentTowingDV.TowingInputGroup;
import pcftest.VehicleIncidentTowingDV.TowingInputGroup.OtherServiceRequestInfo;
import pcftest.VehicleIncidentTowingDV.TowingInputGroup.TowingAgency;
import pcftest.VehicleIncidentTowingDV.TowingInputGroup.TowingAgency.MenuItem_Search;
import pcftest.VehicleIncidentTowingDV.TowingInputGroup.TowingAgency.MenuItem_ViewDetails;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/FNOL/VehicleIncidentTowingDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class VehicleIncidentTowingDV extends DetailViewElement {
  public final static String CHECKSUM = "06be978bb533c677a54deb87f9cbfcfe";
  
  public VehicleIncidentTowingDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public TowingInputGroup getTowingInputGroup() {
    return getOrCreateProperty("TowingInputGroup", "TowingInputGroup", null, pcftest.VehicleIncidentTowingDV.TowingInputGroup.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/VehicleIncidentTowingDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TowingInputGroup extends PCFElement {
    public TowingInputGroup(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OtherServiceRequestInfo getOtherServiceRequestInfo() {
      return getOrCreateProperty("OtherServiceRequestInfo", "OtherServiceRequestInfo", null, pcftest.VehicleIncidentTowingDV.TowingInputGroup.OtherServiceRequestInfo.class);
    }
    
    public TowingAgency getTowingAgency() {
      return getOrCreateProperty("TowingAgency", "TowingAgency", null, pcftest.VehicleIncidentTowingDV.TowingInputGroup.TowingAgency.class);
    }
    
    public ValueElement getTowingCoverage() {
      return getOrCreateProperty("TowingCoverage", "TowingCoverage", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public CheckboxValueElement get_checkbox() {
      return getOrCreateProperty("_checkbox", "_checkbox", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/VehicleIncidentTowingDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class OtherServiceRequestInfo extends PCFElement {
      public OtherServiceRequestInfo(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public NewServiceRequestInstructionInputSet_default getNewServiceRequestInstructionInputSet_default() {
        return getOrCreateProperty("NewServiceRequestInstructionInputSet_default", "NewServiceRequestInstructionInputSet", null, pcftest.NewServiceRequestInstructionInputSet_default.class);
      }
      
      public NewServiceRequestInstructionInputSet_rental getNewServiceRequestInstructionInputSet_rental() {
        return getOrCreateProperty("NewServiceRequestInstructionInputSet_rental", "NewServiceRequestInstructionInputSet", null, pcftest.NewServiceRequestInstructionInputSet_rental.class);
      }
      
      public ValueElement getTowingAgencyAddress() {
        return getOrCreateProperty("TowingAgencyAddress", "TowingAgencyAddress", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getTowingAgencyPhone() {
        return getOrCreateProperty("TowingAgencyPhone", "TowingAgencyPhone", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/widgets/ClaimContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class TowingAgency extends SelectElement {
      public TowingAgency(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ClaimContactDetailPopup click() {
        return clickThis(pcftest.ClaimContactDetailPopup.class);
      }
      
      public ClaimNewTowingOnlyPickerMenuItemSet getClaimNewTowingOnlyPickerMenuItemSet() {
        return getOrCreateProperty("ClaimNewTowingOnlyPickerMenuItemSet", "ClaimNewTowingOnlyPickerMenuItemSet", null, pcftest.ClaimNewTowingOnlyPickerMenuItemSet.class);
      }
      
      public MenuItem_Search getMenuItem_Search() {
        return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.VehicleIncidentTowingDV.TowingInputGroup.TowingAgency.MenuItem_Search.class);
      }
      
      public MenuItem_ViewDetails getMenuItem_ViewDetails() {
        return getOrCreateProperty("MenuItem_ViewDetails", "MenuItem_ViewDetails", null, pcftest.VehicleIncidentTowingDV.TowingInputGroup.TowingAgency.MenuItem_ViewDetails.class);
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
    
    
  }
  
  
}