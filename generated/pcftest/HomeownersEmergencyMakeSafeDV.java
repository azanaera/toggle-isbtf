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
import pcftest.HomeownersEmergencyMakeSafeDV.EMSMakeSafeInputGroup;
import pcftest.HomeownersEmergencyMakeSafeDV.EMSMakeSafeInputGroup.EMSPicker;
import pcftest.HomeownersEmergencyMakeSafeDV.EMSMakeSafeInputGroup.EMSPicker.MenuItem_Search;
import pcftest.HomeownersEmergencyMakeSafeDV.EMSMakeSafeInputGroup.EMSPicker.MenuItem_ViewDetails;
import pcftest.HomeownersEmergencyMakeSafeDV.EMSMakeSafeInputGroup.OtherServiceRequestInfo;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/FNOL/HomeownersEmergencyMakeSafeDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class HomeownersEmergencyMakeSafeDV extends DetailViewElement {
  public final static String CHECKSUM = "d2599562010875948a89ef7e0ae07a22";
  
  public HomeownersEmergencyMakeSafeDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public EMSMakeSafeInputGroup getEMSMakeSafeInputGroup() {
    return getOrCreateProperty("EMSMakeSafeInputGroup", "EMSMakeSafeInputGroup", null, pcftest.HomeownersEmergencyMakeSafeDV.EMSMakeSafeInputGroup.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/HomeownersEmergencyMakeSafeDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EMSMakeSafeInputGroup extends PCFElement {
    public EMSMakeSafeInputGroup(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public EMSPicker getEMSPicker() {
      return getOrCreateProperty("EMSPicker", "EMSPicker", null, pcftest.HomeownersEmergencyMakeSafeDV.EMSMakeSafeInputGroup.EMSPicker.class);
    }
    
    public OtherServiceRequestInfo getOtherServiceRequestInfo() {
      return getOrCreateProperty("OtherServiceRequestInfo", "OtherServiceRequestInfo", null, pcftest.HomeownersEmergencyMakeSafeDV.EMSMakeSafeInputGroup.OtherServiceRequestInfo.class);
    }
    
    public CheckboxValueElement get_checkbox() {
      return getOrCreateProperty("_checkbox", "_checkbox", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/widgets/ClaimContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class EMSPicker extends SelectElement {
      public EMSPicker(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ClaimContactDetailPopup click() {
        return clickThis(pcftest.ClaimContactDetailPopup.class);
      }
      
      public ClaimNewVendorOnlyPickerMenuItemSet getClaimNewVendorOnlyPickerMenuItemSet() {
        return getOrCreateProperty("ClaimNewVendorOnlyPickerMenuItemSet", "ClaimNewVendorOnlyPickerMenuItemSet", null, pcftest.ClaimNewVendorOnlyPickerMenuItemSet.class);
      }
      
      public MenuItem_Search getMenuItem_Search() {
        return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.HomeownersEmergencyMakeSafeDV.EMSMakeSafeInputGroup.EMSPicker.MenuItem_Search.class);
      }
      
      public MenuItem_ViewDetails getMenuItem_ViewDetails() {
        return getOrCreateProperty("MenuItem_ViewDetails", "MenuItem_ViewDetails", null, pcftest.HomeownersEmergencyMakeSafeDV.EMSMakeSafeInputGroup.EMSPicker.MenuItem_ViewDetails.class);
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
    @Generated(comments = "config/web/pcf/claim/FNOL/HomeownersEmergencyMakeSafeDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class OtherServiceRequestInfo extends PCFElement {
      public OtherServiceRequestInfo(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ValueElement getEMSPhone() {
        return getOrCreateProperty("EMSPhone", "EMSPhone", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public NewServiceRequestInstructionInputSet_default getNewServiceRequestInstructionInputSet_default() {
        return getOrCreateProperty("NewServiceRequestInstructionInputSet_default", "NewServiceRequestInstructionInputSet", null, pcftest.NewServiceRequestInstructionInputSet_default.class);
      }
      
      public NewServiceRequestInstructionInputSet_rental getNewServiceRequestInstructionInputSet_rental() {
        return getOrCreateProperty("NewServiceRequestInstructionInputSet_rental", "NewServiceRequestInstructionInputSet", null, pcftest.NewServiceRequestInstructionInputSet_rental.class);
      }
      
      
    }
    
    
  }
  
  
}