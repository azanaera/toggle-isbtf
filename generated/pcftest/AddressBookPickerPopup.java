package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.AddressBookPickerPopup.AddressBookPickerPopup_UpLink;
import pcftest.AddressBookPickerPopup._Paging;
import pcftest.AddressBookPickerPopup.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/addressbook/AddressBookPickerPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class AddressBookPickerPopup extends PCFLocation {
  public final static String CHECKSUM = "e350d2e7d4871a53fe9b92585c7eb1ef";
  
  public AddressBookPickerPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("AddressBookPickerPopup"));
  }
  
  public AddressBookPickerPopup_UpLink getAddressBookPickerPopup_UpLink() {
    return getOrCreateProperty("AddressBookPickerPopup_UpLink", "AddressBookPickerPopup_UpLink", null, pcftest.AddressBookPickerPopup.AddressBookPickerPopup_UpLink.class);
  }
  
  public AddressBookSearchScreen getAddressBookSearchScreen() {
    return getOrCreateProperty("AddressBookSearchScreen", "AddressBookSearchScreen", null, pcftest.AddressBookSearchScreen.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.AddressBookPickerPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.AddressBookPickerPopup.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/addressbook/AddressBookPickerPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AddressBookPickerPopup_UpLink extends ClickableActionElement {
    public AddressBookPickerPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/addressbook/AddressBookPickerPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/addressbook/AddressBookPickerPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}