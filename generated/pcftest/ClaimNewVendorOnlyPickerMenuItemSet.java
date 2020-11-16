package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ClaimNewVendorOnlyPickerMenuItemSet.NewContactPickerMenuItemSet_CompanyVendor;
import pcftest.ClaimNewVendorOnlyPickerMenuItemSet.NewContactPickerMenuItemSet_PersonVendor;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/shared/contacts/ClaimNewVendorOnlyPickerMenuItemSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimNewVendorOnlyPickerMenuItemSet extends PCFElement {
  public final static String CHECKSUM = "30cf1b33838553711c18919081aece5a";
  
  public ClaimNewVendorOnlyPickerMenuItemSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public NewContactPickerMenuItemSet_CompanyVendor getNewContactPickerMenuItemSet_CompanyVendor() {
    return getOrCreateProperty("NewContactPickerMenuItemSet_CompanyVendor", "NewContactPickerMenuItemSet_CompanyVendor", null, pcftest.ClaimNewVendorOnlyPickerMenuItemSet.NewContactPickerMenuItemSet_CompanyVendor.class);
  }
  
  public NewContactPickerMenuItemSet_PersonVendor getNewContactPickerMenuItemSet_PersonVendor() {
    return getOrCreateProperty("NewContactPickerMenuItemSet_PersonVendor", "NewContactPickerMenuItemSet_PersonVendor", null, pcftest.ClaimNewVendorOnlyPickerMenuItemSet.NewContactPickerMenuItemSet_PersonVendor.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/contacts/ClaimNewVendorOnlyPickerMenuItemSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewContactPickerMenuItemSet_CompanyVendor extends ClickableActionElement {
    public NewContactPickerMenuItemSet_CompanyVendor(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public NewContactPopup click() {
      return clickThis(pcftest.NewContactPopup.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/contacts/ClaimNewVendorOnlyPickerMenuItemSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewContactPickerMenuItemSet_PersonVendor extends ClickableActionElement {
    public NewContactPickerMenuItemSet_PersonVendor(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public NewContactPopup click() {
      return clickThis(pcftest.NewContactPopup.class);
    }
    
    
  }
  
  
}