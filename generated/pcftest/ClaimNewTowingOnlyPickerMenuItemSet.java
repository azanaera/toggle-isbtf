package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ClaimNewTowingOnlyPickerMenuItemSet.NewAutoTowingAgency;
import pcftest.ClaimNewTowingOnlyPickerMenuItemSet.NewCompanyVendor;
import pcftest.ClaimNewTowingOnlyPickerMenuItemSet.NewPersonVendor;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/shared/contacts/ClaimNewTowingOnlyPickerMenuItemSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimNewTowingOnlyPickerMenuItemSet extends PCFElement {
  public final static String CHECKSUM = "90e875aba7cc6f41299590fa509ab315";
  
  public ClaimNewTowingOnlyPickerMenuItemSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public NewAutoTowingAgency getNewAutoTowingAgency() {
    return getOrCreateProperty("NewAutoTowingAgency", "NewAutoTowingAgency", null, pcftest.ClaimNewTowingOnlyPickerMenuItemSet.NewAutoTowingAgency.class);
  }
  
  public NewCompanyVendor getNewCompanyVendor() {
    return getOrCreateProperty("NewCompanyVendor", "NewCompanyVendor", null, pcftest.ClaimNewTowingOnlyPickerMenuItemSet.NewCompanyVendor.class);
  }
  
  public NewPersonVendor getNewPersonVendor() {
    return getOrCreateProperty("NewPersonVendor", "NewPersonVendor", null, pcftest.ClaimNewTowingOnlyPickerMenuItemSet.NewPersonVendor.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/contacts/ClaimNewTowingOnlyPickerMenuItemSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewAutoTowingAgency extends ClickableActionElement {
    public NewAutoTowingAgency(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public NewContactPopup click() {
      return clickThis(pcftest.NewContactPopup.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/contacts/ClaimNewTowingOnlyPickerMenuItemSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewCompanyVendor extends ClickableActionElement {
    public NewCompanyVendor(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public NewContactPopup click() {
      return clickThis(pcftest.NewContactPopup.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/contacts/ClaimNewTowingOnlyPickerMenuItemSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewPersonVendor extends ClickableActionElement {
    public NewPersonVendor(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public NewContactPopup click() {
      return clickThis(pcftest.NewContactPopup.class);
    }
    
    
  }
  
  
}