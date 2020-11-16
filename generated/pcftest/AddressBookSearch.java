package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.AddressBookSearch.AddressBookSearch_UpLink;
import pcftest.AddressBookSearch._Paging;
import pcftest.AddressBookSearch.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/addressbook/AddressBookSearch.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class AddressBookSearch extends PCFLocation {
  public final static String CHECKSUM = "cbd2145909e5e6e7ebb21c11f7b3759e";
  
  public AddressBookSearch(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("AddressBookSearch"));
  }
  
  public AddressBookSearchScreen getAddressBookSearchScreen() {
    return getOrCreateProperty("AddressBookSearchScreen", "AddressBookSearchScreen", null, pcftest.AddressBookSearchScreen.class);
  }
  
  public AddressBookSearch_UpLink getAddressBookSearch_UpLink() {
    return getOrCreateProperty("AddressBookSearch_UpLink", "AddressBookSearch_UpLink", null, pcftest.AddressBookSearch.AddressBookSearch_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.AddressBookSearch._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.AddressBookSearch.__crumb__.class);
  }
  
  public AddressBook get_parent() {
    return getOrCreateProperty("_parent", pcftest.AddressBook.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/addressbook/AddressBookSearch.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AddressBookSearch_UpLink extends ClickableActionElement {
    public AddressBookSearch_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/addressbook/AddressBookSearch.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/addressbook/AddressBookSearch.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}