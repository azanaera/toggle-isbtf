package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ClaimNewRepairShopOnlyPickerMenuItemSet.NewContactPickerMenuItemSet_AutoRepairShop;
import pcftest.ClaimNewRepairShopOnlyPickerMenuItemSet.NewContactPickerMenuItemSet_CompanyVendor;
import pcftest.ClaimNewRepairShopOnlyPickerMenuItemSet.NewContactPickerMenuItemSet_PersonVendor;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/shared/contacts/ClaimNewRepairShopOnlyPickerMenuItemSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimNewRepairShopOnlyPickerMenuItemSet extends PCFElement {
  public final static String CHECKSUM = "f85d3dc9f3bba608549eddc938ef3e28";
  
  public ClaimNewRepairShopOnlyPickerMenuItemSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public NewContactPickerMenuItemSet_AutoRepairShop getNewContactPickerMenuItemSet_AutoRepairShop() {
    return getOrCreateProperty("NewContactPickerMenuItemSet_AutoRepairShop", "NewContactPickerMenuItemSet_AutoRepairShop", null, pcftest.ClaimNewRepairShopOnlyPickerMenuItemSet.NewContactPickerMenuItemSet_AutoRepairShop.class);
  }
  
  public NewContactPickerMenuItemSet_CompanyVendor getNewContactPickerMenuItemSet_CompanyVendor() {
    return getOrCreateProperty("NewContactPickerMenuItemSet_CompanyVendor", "NewContactPickerMenuItemSet_CompanyVendor", null, pcftest.ClaimNewRepairShopOnlyPickerMenuItemSet.NewContactPickerMenuItemSet_CompanyVendor.class);
  }
  
  public NewContactPickerMenuItemSet_PersonVendor getNewContactPickerMenuItemSet_PersonVendor() {
    return getOrCreateProperty("NewContactPickerMenuItemSet_PersonVendor", "NewContactPickerMenuItemSet_PersonVendor", null, pcftest.ClaimNewRepairShopOnlyPickerMenuItemSet.NewContactPickerMenuItemSet_PersonVendor.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/contacts/ClaimNewRepairShopOnlyPickerMenuItemSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewContactPickerMenuItemSet_AutoRepairShop extends ClickableActionElement {
    public NewContactPickerMenuItemSet_AutoRepairShop(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public NewContactPopup click() {
      return clickThis(pcftest.NewContactPopup.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/contacts/ClaimNewRepairShopOnlyPickerMenuItemSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewContactPickerMenuItemSet_CompanyVendor extends ClickableActionElement {
    public NewContactPickerMenuItemSet_CompanyVendor(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public NewContactPopup click() {
      return clickThis(pcftest.NewContactPopup.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/contacts/ClaimNewRepairShopOnlyPickerMenuItemSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewContactPickerMenuItemSet_PersonVendor extends ClickableActionElement {
    public NewContactPickerMenuItemSet_PersonVendor(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public NewContactPopup click() {
      return clickThis(pcftest.NewContactPopup.class);
    }
    
    
  }
  
  
}