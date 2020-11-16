package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.AddressBookContactDetailPrint.AddressBookContactDetailPrint_UpLink;
import pcftest.AddressBookContactDetailPrint._Paging;
import pcftest.AddressBookContactDetailPrint.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/addressbook/print/AddressBookContactDetailPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class AddressBookContactDetailPrint extends PCFLocation {
  public final static String CHECKSUM = "325adfd73d82ccb07b78904f108736b2";
  
  public AddressBookContactDetailPrint(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("AddressBookContactDetailPrint"));
  }
  
  public AddressBookContactDetailPrint_UpLink getAddressBookContactDetailPrint_UpLink() {
    return getOrCreateProperty("AddressBookContactDetailPrint_UpLink", "AddressBookContactDetailPrint_UpLink", null, pcftest.AddressBookContactDetailPrint.AddressBookContactDetailPrint_UpLink.class);
  }
  
  public AddressBookContactDetailScreen_default getAddressBookContactDetailScreen_default() {
    return getOrCreateProperty("AddressBookContactDetailScreen_default", "AddressBookContactDetailScreen", null, pcftest.AddressBookContactDetailScreen_default.class);
  }
  
  public AddressBookContactDetailScreen_error getAddressBookContactDetailScreen_error() {
    return getOrCreateProperty("AddressBookContactDetailScreen_error", "AddressBookContactDetailScreen", null, pcftest.AddressBookContactDetailScreen_error.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.AddressBookContactDetailPrint._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.AddressBookContactDetailPrint.__crumb__.class);
  }
  
  public AddressBookSearch get_parent() {
    return getOrCreateProperty("_parent", pcftest.AddressBookSearch.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/addressbook/print/AddressBookContactDetailPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AddressBookContactDetailPrint_UpLink extends ClickableActionElement {
    public AddressBookContactDetailPrint_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/addressbook/print/AddressBookContactDetailPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/addressbook/print/AddressBookContactDetailPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}