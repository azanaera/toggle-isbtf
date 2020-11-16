package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ClaimContactDetailPopup.ClaimContactDetailPopup_UpLink;
import pcftest.ClaimContactDetailPopup._Paging;
import pcftest.ClaimContactDetailPopup.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/contacts/ClaimContactDetailPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimContactDetailPopup extends PCFLocation {
  public final static String CHECKSUM = "19c18d7f76dec625e56826e58a87f0ea";
  
  public ClaimContactDetailPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ClaimContactDetailPopup"));
  }
  
  public ClaimContactDetailPopup_UpLink getClaimContactDetailPopup_UpLink() {
    return getOrCreateProperty("ClaimContactDetailPopup_UpLink", "ClaimContactDetailPopup_UpLink", null, pcftest.ClaimContactDetailPopup.ClaimContactDetailPopup_UpLink.class);
  }
  
  public ContactDetailScreen getContactDetailScreen() {
    return getOrCreateProperty("ContactDetailScreen", "ContactDetailScreen", null, pcftest.ContactDetailScreen.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ClaimContactDetailPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ClaimContactDetailPopup.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/contacts/ClaimContactDetailPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimContactDetailPopup_UpLink extends ClickableActionElement {
    public ClaimContactDetailPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/contacts/ClaimContactDetailPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/contacts/ClaimContactDetailPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}