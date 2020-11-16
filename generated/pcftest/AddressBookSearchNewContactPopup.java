package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.AddressBookSearchNewContactPopup.AddressBookSearchNewContactPopup_UpLink;
import pcftest.AddressBookSearchNewContactPopup._Paging;
import pcftest.AddressBookSearchNewContactPopup.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/newcheckwizard/AddressBookSearchNewContactPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class AddressBookSearchNewContactPopup extends PCFLocation {
  public final static String CHECKSUM = "d6aec56de24c55b6d3ae5436318c4cec";
  
  public AddressBookSearchNewContactPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("AddressBookSearchNewContactPopup"));
  }
  
  public AddressBookSearchContactDetailScreen getAddressBookSearchContactDetailScreen() {
    return getOrCreateProperty("AddressBookSearchContactDetailScreen", "AddressBookSearchContactDetailScreen", null, pcftest.AddressBookSearchContactDetailScreen.class);
  }
  
  public AddressBookSearchNewContactPopup_UpLink getAddressBookSearchNewContactPopup_UpLink() {
    return getOrCreateProperty("AddressBookSearchNewContactPopup_UpLink", "AddressBookSearchNewContactPopup_UpLink", null, pcftest.AddressBookSearchNewContactPopup.AddressBookSearchNewContactPopup_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.AddressBookSearchNewContactPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.AddressBookSearchNewContactPopup.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/newcheckwizard/AddressBookSearchNewContactPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AddressBookSearchNewContactPopup_UpLink extends ClickableActionElement {
    public AddressBookSearchNewContactPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/newcheckwizard/AddressBookSearchNewContactPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/newcheckwizard/AddressBookSearchNewContactPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}