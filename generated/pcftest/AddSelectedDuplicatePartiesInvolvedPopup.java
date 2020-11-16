package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.AddSelectedDuplicatePartiesInvolvedPopup.AddSelectedDuplicatePartiesInvolvedPopup_UpLink;
import pcftest.AddSelectedDuplicatePartiesInvolvedPopup._Paging;
import pcftest.AddSelectedDuplicatePartiesInvolvedPopup.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/partiesinvolved/AddSelectedDuplicatePartiesInvolvedPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class AddSelectedDuplicatePartiesInvolvedPopup extends PCFLocation {
  public final static String CHECKSUM = "d4f4a75b58b5c47d284b440895d2bc48";
  
  public AddSelectedDuplicatePartiesInvolvedPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("AddSelectedDuplicatePartiesInvolvedPopup"));
  }
  
  public AddSelectedDuplicatePartiesInvolvedPopup_UpLink getAddSelectedDuplicatePartiesInvolvedPopup_UpLink() {
    return getOrCreateProperty("AddSelectedDuplicatePartiesInvolvedPopup_UpLink", "AddSelectedDuplicatePartiesInvolvedPopup_UpLink", null, pcftest.AddSelectedDuplicatePartiesInvolvedPopup.AddSelectedDuplicatePartiesInvolvedPopup_UpLink.class);
  }
  
  public ContactDetailScreen getContactDetailScreen() {
    return getOrCreateProperty("ContactDetailScreen", "ContactDetailScreen", null, pcftest.ContactDetailScreen.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.AddSelectedDuplicatePartiesInvolvedPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.AddSelectedDuplicatePartiesInvolvedPopup.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/partiesinvolved/AddSelectedDuplicatePartiesInvolvedPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AddSelectedDuplicatePartiesInvolvedPopup_UpLink extends ClickableActionElement {
    public AddSelectedDuplicatePartiesInvolvedPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/partiesinvolved/AddSelectedDuplicatePartiesInvolvedPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/partiesinvolved/AddSelectedDuplicatePartiesInvolvedPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}