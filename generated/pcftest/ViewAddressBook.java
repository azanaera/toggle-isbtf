package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ViewAddressBook.ViewAddressBook_UpLink;
import pcftest.ViewAddressBook._Paging;
import pcftest.ViewAddressBook.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/addressbook/ViewAddressBook.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ViewAddressBook extends PCFLocation {
  public final static String CHECKSUM = "31641ac9664bdf0b43842f2f2f662e73";
  
  public ViewAddressBook(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ViewAddressBook"));
  }
  
  public ViewAddressBook_UpLink getViewAddressBook_UpLink() {
    return getOrCreateProperty("ViewAddressBook_UpLink", "ViewAddressBook_UpLink", null, pcftest.ViewAddressBook.ViewAddressBook_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ViewAddressBook._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ViewAddressBook.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/addressbook/ViewAddressBook.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ViewAddressBook_UpLink extends ClickableActionElement {
    public ViewAddressBook_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/addressbook/ViewAddressBook.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/addressbook/ViewAddressBook.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}