package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.CheckboxValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.SelectElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.AppraisalServiceInputSet.AppraisalServiceInputGroup;
import pcftest.AppraisalServiceInputSet.AppraisalServiceInputGroup.Assessor_Picker;
import pcftest.AppraisalServiceInputSet.AppraisalServiceInputGroup.Assessor_Picker.MenuItem_Search;
import pcftest.AppraisalServiceInputSet.AppraisalServiceInputGroup.Assessor_Picker.MenuItem_ViewDetails;
import pcftest.AppraisalServiceInputSet.AppraisalServiceInputGroup.OtherServiceRequestInfo;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/lossdetails/AppraisalServiceInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class AppraisalServiceInputSet extends PCFElement {
  public final static String CHECKSUM = "0bfd8da0ab5281ec0a230bc423717a15";
  
  public AppraisalServiceInputSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public AppraisalServiceInputGroup getAppraisalServiceInputGroup() {
    return getOrCreateProperty("AppraisalServiceInputGroup", "AppraisalServiceInputGroup", null, pcftest.AppraisalServiceInputSet.AppraisalServiceInputGroup.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/AppraisalServiceInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AppraisalServiceInputGroup extends PCFElement {
    public AppraisalServiceInputGroup(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Assessor_Picker getAssessor_Picker() {
      return getOrCreateProperty("Assessor_Picker", "Assessor_Picker", null, pcftest.AppraisalServiceInputSet.AppraisalServiceInputGroup.Assessor_Picker.class);
    }
    
    public OtherServiceRequestInfo getOtherServiceRequestInfo() {
      return getOrCreateProperty("OtherServiceRequestInfo", "OtherServiceRequestInfo", null, pcftest.AppraisalServiceInputSet.AppraisalServiceInputGroup.OtherServiceRequestInfo.class);
    }
    
    public CheckboxValueElement get_checkbox() {
      return getOrCreateProperty("_checkbox", "_checkbox", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/widgets/ClaimContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Assessor_Picker extends SelectElement {
      public Assessor_Picker(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ClaimContactDetailPopup click() {
        return clickThis(pcftest.ClaimContactDetailPopup.class);
      }
      
      public ClaimNewVendorOnlyPickerMenuItemSet getClaimNewVendorOnlyPickerMenuItemSet() {
        return getOrCreateProperty("ClaimNewVendorOnlyPickerMenuItemSet", "ClaimNewVendorOnlyPickerMenuItemSet", null, pcftest.ClaimNewVendorOnlyPickerMenuItemSet.class);
      }
      
      public MenuItem_Search getMenuItem_Search() {
        return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.AppraisalServiceInputSet.AppraisalServiceInputGroup.Assessor_Picker.MenuItem_Search.class);
      }
      
      public MenuItem_ViewDetails getMenuItem_ViewDetails() {
        return getOrCreateProperty("MenuItem_ViewDetails", "MenuItem_ViewDetails", null, pcftest.AppraisalServiceInputSet.AppraisalServiceInputGroup.Assessor_Picker.MenuItem_ViewDetails.class);
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
    @Generated(comments = "config/web/pcf/claim/lossdetails/AppraisalServiceInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
      
      
    }
    
    
  }
  
  
}