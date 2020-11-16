package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.NewPartyInvolvedPopup.NewPartyInvolvedPopup_UpLink;
import pcftest.NewPartyInvolvedPopup._Paging;
import pcftest.NewPartyInvolvedPopup.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/partiesinvolved/NewPartyInvolvedPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NewPartyInvolvedPopup extends PCFLocation {
  public final static String CHECKSUM = "3f2aea370fa7a58202e39b7173b0d556";
  
  public NewPartyInvolvedPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("NewPartyInvolvedPopup"));
  }
  
  public ContactDetailScreen getContactDetailScreen() {
    return getOrCreateProperty("ContactDetailScreen", "ContactDetailScreen", null, pcftest.ContactDetailScreen.class);
  }
  
  public NewPartyInvolvedPopup_UpLink getNewPartyInvolvedPopup_UpLink() {
    return getOrCreateProperty("NewPartyInvolvedPopup_UpLink", "NewPartyInvolvedPopup_UpLink", null, pcftest.NewPartyInvolvedPopup.NewPartyInvolvedPopup_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.NewPartyInvolvedPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.NewPartyInvolvedPopup.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/partiesinvolved/NewPartyInvolvedPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewPartyInvolvedPopup_UpLink extends ClickableActionElement {
    public NewPartyInvolvedPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/partiesinvolved/NewPartyInvolvedPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/partiesinvolved/NewPartyInvolvedPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}