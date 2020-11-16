package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.CheckboxValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.RentalServiceInputSet.RentalInputGroup;
import pcftest.RentalServiceInputSet.RentalInputGroup.OtherServiceRequestInfo;
import pcftest.RentalServiceInputSet.RentalInputGroup.RentalAgency;
import pcftest.RentalServiceInputSet.RentalInputGroup.RentalAgency.MenuItem_Search;
import pcftest.RentalServiceInputSet.RentalInputGroup.RentalAgency.MenuItem_ViewDetails;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/lossdetails/RentalServiceInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class RentalServiceInputSet extends PCFElement {
  public final static String CHECKSUM = "11b211f5c17a8457506d93e8b36a2f7a";
  
  public RentalServiceInputSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public RentalInputGroup getRentalInputGroup() {
    return getOrCreateProperty("RentalInputGroup", "RentalInputGroup", null, pcftest.RentalServiceInputSet.RentalInputGroup.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/RentalServiceInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RentalInputGroup extends PCFElement {
    public RentalInputGroup(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OtherServiceRequestInfo getOtherServiceRequestInfo() {
      return getOrCreateProperty("OtherServiceRequestInfo", "OtherServiceRequestInfo", null, pcftest.RentalServiceInputSet.RentalInputGroup.OtherServiceRequestInfo.class);
    }
    
    public RentalAgency getRentalAgency() {
      return getOrCreateProperty("RentalAgency", "RentalAgency", null, pcftest.RentalServiceInputSet.RentalInputGroup.RentalAgency.class);
    }
    
    public DateElement getRentalBeginDate() {
      return getOrCreateProperty("RentalBeginDate", "RentalBeginDate", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public ValueElement getRentalCoverage() {
      return getOrCreateProperty("RentalCoverage", "RentalCoverage", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public DateElement getRentalEndDate() {
      return getOrCreateProperty("RentalEndDate", "RentalEndDate", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public ValueElement getRentalRate() {
      return getOrCreateProperty("RentalRate", "RentalRate", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getReservationNumber() {
      return getOrCreateProperty("ReservationNumber", "ReservationNumber", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public CheckboxValueElement get_checkbox() {
      return getOrCreateProperty("_checkbox", "_checkbox", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/RentalServiceInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
      
      public ValueElement getRentalAgencyAddress() {
        return getOrCreateProperty("RentalAgencyAddress", "RentalAgencyAddress", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getRentalAgencyPhone() {
        return getOrCreateProperty("RentalAgencyPhone", "RentalAgencyPhone", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/widgets/ClaimContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class RentalAgency extends SelectElement {
      public RentalAgency(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ClaimContactDetailPopup click() {
        return clickThis(pcftest.ClaimContactDetailPopup.class);
      }
      
      public ClaimNewVendorOnlyPickerMenuItemSet getClaimNewVendorOnlyPickerMenuItemSet() {
        return getOrCreateProperty("ClaimNewVendorOnlyPickerMenuItemSet", "ClaimNewVendorOnlyPickerMenuItemSet", null, pcftest.ClaimNewVendorOnlyPickerMenuItemSet.class);
      }
      
      public MenuItem_Search getMenuItem_Search() {
        return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.RentalServiceInputSet.RentalInputGroup.RentalAgency.MenuItem_Search.class);
      }
      
      public MenuItem_ViewDetails getMenuItem_ViewDetails() {
        return getOrCreateProperty("MenuItem_ViewDetails", "MenuItem_ViewDetails", null, pcftest.RentalServiceInputSet.RentalInputGroup.RentalAgency.MenuItem_ViewDetails.class);
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