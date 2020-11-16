package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.AddExistingPartyInvolvedPopup.AddExistingPartyInvolvedPopup_UpLink;
import pcftest.AddExistingPartyInvolvedPopup._Paging;
import pcftest.AddExistingPartyInvolvedPopup.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/partiesinvolved/AddExistingPartyInvolvedPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class AddExistingPartyInvolvedPopup extends PCFLocation {
  public final static String CHECKSUM = "67a48e691d03560338cbcd44d9fea37c";
  
  public AddExistingPartyInvolvedPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("AddExistingPartyInvolvedPopup"));
  }
  
  public AddExistingPartyInvolvedPopup_UpLink getAddExistingPartyInvolvedPopup_UpLink() {
    return getOrCreateProperty("AddExistingPartyInvolvedPopup_UpLink", "AddExistingPartyInvolvedPopup_UpLink", null, pcftest.AddExistingPartyInvolvedPopup.AddExistingPartyInvolvedPopup_UpLink.class);
  }
  
  public ContactDetailScreen getContactDetailScreen() {
    return getOrCreateProperty("ContactDetailScreen", "ContactDetailScreen", null, pcftest.ContactDetailScreen.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.AddExistingPartyInvolvedPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.AddExistingPartyInvolvedPopup.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/partiesinvolved/AddExistingPartyInvolvedPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AddExistingPartyInvolvedPopup_UpLink extends ClickableActionElement {
    public AddExistingPartyInvolvedPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/partiesinvolved/AddExistingPartyInvolvedPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/partiesinvolved/AddExistingPartyInvolvedPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}