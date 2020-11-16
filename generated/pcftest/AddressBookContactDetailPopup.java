package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.AddressBookContactDetailPopup.AddressBookContactDetailPopup_UpLink;
import pcftest.AddressBookContactDetailPopup._Paging;
import pcftest.AddressBookContactDetailPopup.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/addressbook/AddressBookContactDetailPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class AddressBookContactDetailPopup extends PCFLocation {
  public final static String CHECKSUM = "7fe4626bcf4a3bb813761558f4dd1057";
  
  public AddressBookContactDetailPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("AddressBookContactDetailPopup"));
  }
  
  public AddressBookContactDetailPopup_UpLink getAddressBookContactDetailPopup_UpLink() {
    return getOrCreateProperty("AddressBookContactDetailPopup_UpLink", "AddressBookContactDetailPopup_UpLink", null, pcftest.AddressBookContactDetailPopup.AddressBookContactDetailPopup_UpLink.class);
  }
  
  public AddressBookContactDetailScreen_default getAddressBookContactDetailScreen_default() {
    return getOrCreateProperty("AddressBookContactDetailScreen_default", "AddressBookContactDetailScreen", null, pcftest.AddressBookContactDetailScreen_default.class);
  }
  
  public AddressBookContactDetailScreen_error getAddressBookContactDetailScreen_error() {
    return getOrCreateProperty("AddressBookContactDetailScreen_error", "AddressBookContactDetailScreen", null, pcftest.AddressBookContactDetailScreen_error.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.AddressBookContactDetailPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.AddressBookContactDetailPopup.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/addressbook/AddressBookContactDetailPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AddressBookContactDetailPopup_UpLink extends ClickableActionElement {
    public AddressBookContactDetailPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/addressbook/AddressBookContactDetailPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/addressbook/AddressBookContactDetailPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}