package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.AddressBookContactDetail.AddressBookContactDetail_UpLink;
import pcftest.AddressBookContactDetail._Paging;
import pcftest.AddressBookContactDetail.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/addressbook/AddressBookContactDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class AddressBookContactDetail extends PCFLocation {
  public final static String CHECKSUM = "d741c5a6a9324ae0c6a2b700f7bb25ac";
  
  public AddressBookContactDetail(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("AddressBookContactDetail"));
  }
  
  public AddressBookContactDetailScreen_default getAddressBookContactDetailScreen_default() {
    return getOrCreateProperty("AddressBookContactDetailScreen_default", "AddressBookContactDetailScreen", null, pcftest.AddressBookContactDetailScreen_default.class);
  }
  
  public AddressBookContactDetailScreen_error getAddressBookContactDetailScreen_error() {
    return getOrCreateProperty("AddressBookContactDetailScreen_error", "AddressBookContactDetailScreen", null, pcftest.AddressBookContactDetailScreen_error.class);
  }
  
  public AddressBookContactDetail_UpLink getAddressBookContactDetail_UpLink() {
    return getOrCreateProperty("AddressBookContactDetail_UpLink", "AddressBookContactDetail_UpLink", null, pcftest.AddressBookContactDetail.AddressBookContactDetail_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.AddressBookContactDetail._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.AddressBookContactDetail.__crumb__.class);
  }
  
  public AddressBook get_parent() {
    return getOrCreateProperty("_parent", pcftest.AddressBook.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/addressbook/AddressBookContactDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AddressBookContactDetail_UpLink extends ClickableActionElement {
    public AddressBookContactDetail_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/addressbook/AddressBookContactDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/addressbook/AddressBookContactDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}