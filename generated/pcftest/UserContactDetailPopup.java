package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.UserContactDetailPopup.UserContactDetailPopup_UpLink;
import pcftest.UserContactDetailPopup._Paging;
import pcftest.UserContactDetailPopup.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/contacts/UserContactDetailPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class UserContactDetailPopup extends PCFLocation {
  public final static String CHECKSUM = "0c00cc41ff7a81050fe7969429044d31";
  
  public UserContactDetailPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("UserContactDetailPopup"));
  }
  
  public ContactDetailScreen getContactDetailScreen() {
    return getOrCreateProperty("ContactDetailScreen", "ContactDetailScreen", null, pcftest.ContactDetailScreen.class);
  }
  
  public UserContactDetailPopup_UpLink getUserContactDetailPopup_UpLink() {
    return getOrCreateProperty("UserContactDetailPopup_UpLink", "UserContactDetailPopup_UpLink", null, pcftest.UserContactDetailPopup.UserContactDetailPopup_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.UserContactDetailPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.UserContactDetailPopup.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/contacts/UserContactDetailPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class UserContactDetailPopup_UpLink extends ClickableActionElement {
    public UserContactDetailPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/contacts/UserContactDetailPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/contacts/UserContactDetailPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}