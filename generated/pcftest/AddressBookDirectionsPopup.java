package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.AddressBookDirectionsPopup.AddressBookDirectionsPopup_UpLink;
import pcftest.AddressBookDirectionsPopup._Paging;
import pcftest.AddressBookDirectionsPopup.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/addressbook/AddressBookDirectionsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class AddressBookDirectionsPopup extends PCFLocation {
  public final static String CHECKSUM = "fa13e69e99f72e24a7d623a4436f1fb4";
  
  public AddressBookDirectionsPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("AddressBookDirectionsPopup"));
  }
  
  public AddressBookDirectionsPopup_UpLink getAddressBookDirectionsPopup_UpLink() {
    return getOrCreateProperty("AddressBookDirectionsPopup_UpLink", "AddressBookDirectionsPopup_UpLink", null, pcftest.AddressBookDirectionsPopup.AddressBookDirectionsPopup_UpLink.class);
  }
  
  public AddressBookDirectionsScreen getAddressBookDirectionsScreen() {
    return getOrCreateProperty("AddressBookDirectionsScreen", "AddressBookDirectionsScreen", null, pcftest.AddressBookDirectionsScreen.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.AddressBookDirectionsPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.AddressBookDirectionsPopup.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/addressbook/AddressBookDirectionsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AddressBookDirectionsPopup_UpLink extends ClickableActionElement {
    public AddressBookDirectionsPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/addressbook/AddressBookDirectionsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/addressbook/AddressBookDirectionsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}