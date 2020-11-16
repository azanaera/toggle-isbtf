package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ClaimNewCompanyOnlyPickerMenuItemSet.NewCompanyOnlyPickerMenuItemSet_NewCompanyMenuItem;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/shared/contacts/ClaimNewCompanyOnlyPickerMenuItemSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimNewCompanyOnlyPickerMenuItemSet extends PCFElement {
  public final static String CHECKSUM = "a882a63b038b8dde20bed21132f8ef2b";
  
  public ClaimNewCompanyOnlyPickerMenuItemSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public NewCompanyOnlyPickerMenuItemSet_NewCompanyMenuItem getNewCompanyOnlyPickerMenuItemSet_NewCompanyMenuItem() {
    return getOrCreateProperty("NewCompanyOnlyPickerMenuItemSet_NewCompanyMenuItem", "NewCompanyOnlyPickerMenuItemSet_NewCompanyMenuItem", null, pcftest.ClaimNewCompanyOnlyPickerMenuItemSet.NewCompanyOnlyPickerMenuItemSet_NewCompanyMenuItem.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/contacts/ClaimNewCompanyOnlyPickerMenuItemSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewCompanyOnlyPickerMenuItemSet_NewCompanyMenuItem extends ClickableActionElement {
    public NewCompanyOnlyPickerMenuItemSet_NewCompanyMenuItem(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}