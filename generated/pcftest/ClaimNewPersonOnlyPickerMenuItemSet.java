package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ClaimNewPersonOnlyPickerMenuItemSet.ClaimNewPersonOnlyPickerMenuItemSet_NewPersonMenuItem;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/shared/contacts/ClaimNewPersonOnlyPickerMenuItemSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimNewPersonOnlyPickerMenuItemSet extends PCFElement {
  public final static String CHECKSUM = "1a842dd6d1666deef07b7c75323cfdfc";
  
  public ClaimNewPersonOnlyPickerMenuItemSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ClaimNewPersonOnlyPickerMenuItemSet_NewPersonMenuItem getClaimNewPersonOnlyPickerMenuItemSet_NewPersonMenuItem() {
    return getOrCreateProperty("ClaimNewPersonOnlyPickerMenuItemSet_NewPersonMenuItem", "ClaimNewPersonOnlyPickerMenuItemSet_NewPersonMenuItem", null, pcftest.ClaimNewPersonOnlyPickerMenuItemSet.ClaimNewPersonOnlyPickerMenuItemSet_NewPersonMenuItem.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/contacts/ClaimNewPersonOnlyPickerMenuItemSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimNewPersonOnlyPickerMenuItemSet_NewPersonMenuItem extends ClickableActionElement {
    public ClaimNewPersonOnlyPickerMenuItemSet_NewPersonMenuItem(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public NewContactPopup click() {
      return clickThis(pcftest.NewContactPopup.class);
    }
    
    
  }
  
  
}