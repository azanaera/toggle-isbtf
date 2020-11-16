package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.AddressBook.AddressBook_UpLink;
import pcftest.AddressBook.MenuLinks;
import pcftest.AddressBook.MenuLinks.AddressBook_AddressBookSearch;
import pcftest.AddressBook._Paging;
import pcftest.AddressBook.__crumb__;
import pcftest.AddressBook._msgs;
import pcftest.AddressBook.actWizard;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/addressbook/AddressBook.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class AddressBook extends PCFLocation {
  public final static String CHECKSUM = "1d8f26a01b216f9b4cf2adf9e6fcebf8";
  
  public AddressBook(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("AddressBook"));
  }
  
  public AddressBookSearch getAddressBookSearch() {
    return getOrCreateProperty("AddressBookSearch", pcftest.AddressBookSearch.class);
  }
  
  public AddressBook_UpLink getAddressBook_UpLink() {
    return getOrCreateProperty("AddressBook_UpLink", "AddressBook_UpLink", null, pcftest.AddressBook.AddressBook_UpLink.class);
  }
  
  public MenuLinks getMenuLinks() {
    return getOrCreateMenuLinksProperty("MenuLinks", "MenuLinks", null, pcftest.AddressBook.MenuLinks.class, null);
  }
  
  public TabBar getTabBar() {
    return getOrCreateProperty("TabBar", pcftest.TabBar.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.AddressBook._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.AddressBook.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.AddressBook._msgs.class);
  }
  
  public actWizard getactWizard() {
    return getOrCreateProperty("actWizard", "actWizard", null, pcftest.AddressBook.actWizard.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/addressbook/AddressBook.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AddressBook_UpLink extends ClickableActionElement {
    public AddressBook_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/addressbook/AddressBook.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MenuLinks extends PCFElement {
    public MenuLinks(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public AddressBook_AddressBookSearch getAddressBook_AddressBookSearch() {
      return getOrCreateProperty("AddressBook_AddressBookSearch", "AddressBook_AddressBookSearch", null, pcftest.AddressBook.MenuLinks.AddressBook_AddressBookSearch.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/addressbook/AddressBook.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class AddressBook_AddressBookSearch extends ClickableActionElement {
      public AddressBook_AddressBookSearch(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public AddressBookSearch click() {
        return clickThis(pcftest.AddressBookSearch.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/addressbook/AddressBook.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/addressbook/AddressBook.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/addressbook/AddressBook.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/addressbook/AddressBook.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class actWizard extends ClickableActionElement {
    public actWizard(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  
}