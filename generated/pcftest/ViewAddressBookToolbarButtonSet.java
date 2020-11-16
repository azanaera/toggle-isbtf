package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ViewAddressBookToolbarButtonSet.ViewAddressBookToolbarButtons_ViewAddressBookButton;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/shared/contacts/ViewAddressBookToolbarButtonSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ViewAddressBookToolbarButtonSet extends PCFElement {
  public final static String CHECKSUM = "b93f83b9e954e043d01e3e249316551d";
  
  public ViewAddressBookToolbarButtonSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ViewAddressBookToolbarButtons_ViewAddressBookButton getViewAddressBookToolbarButtons_ViewAddressBookButton() {
    return getOrCreateProperty("ViewAddressBookToolbarButtons_ViewAddressBookButton", "ViewAddressBookToolbarButtons_ViewAddressBookButton", null, pcftest.ViewAddressBookToolbarButtonSet.ViewAddressBookToolbarButtons_ViewAddressBookButton.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/contacts/ViewAddressBookToolbarButtonSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ViewAddressBookToolbarButtons_ViewAddressBookButton extends ClickableActionElement {
    public ViewAddressBookToolbarButtons_ViewAddressBookButton(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}