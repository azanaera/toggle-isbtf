package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ClaimNewDoctorOnlyPickerMenuItemSet.NewContactPickerMenuItemSet_Doctor;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/shared/contacts/ClaimNewDoctorOnlyPickerMenuItemSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimNewDoctorOnlyPickerMenuItemSet extends PCFElement {
  public final static String CHECKSUM = "9371b1345410a14bca3fdabfea52da6e";
  
  public ClaimNewDoctorOnlyPickerMenuItemSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public NewContactPickerMenuItemSet_Doctor getNewContactPickerMenuItemSet_Doctor() {
    return getOrCreateProperty("NewContactPickerMenuItemSet_Doctor", "NewContactPickerMenuItemSet_Doctor", null, pcftest.ClaimNewDoctorOnlyPickerMenuItemSet.NewContactPickerMenuItemSet_Doctor.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/contacts/ClaimNewDoctorOnlyPickerMenuItemSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewContactPickerMenuItemSet_Doctor extends ClickableActionElement {
    public NewContactPickerMenuItemSet_Doctor(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public NewContactPopup click() {
      return clickThis(pcftest.NewContactPopup.class);
    }
    
    
  }
  
  
}