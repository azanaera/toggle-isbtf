package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ContactReviewPopup.CancelButton;
import pcftest.ContactReviewPopup.ContactReviewPopup_UpLink;
import pcftest.ContactReviewPopup.UpdateButton;
import pcftest.ContactReviewPopup._Paging;
import pcftest.ContactReviewPopup.__crumb__;
import pcftest.ContactReviewPopup._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/contacts/review/ContactReviewPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ContactReviewPopup extends PCFLocation {
  public final static String CHECKSUM = "3993c3fa112049aca995e7628231d7ab";
  
  public ContactReviewPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ContactReviewPopup"));
  }
  
  public CancelButton getCancelButton() {
    return getOrCreateProperty("CancelButton", "CancelButton", null, pcftest.ContactReviewPopup.CancelButton.class);
  }
  
  public ContactReviewPopup_UpLink getContactReviewPopup_UpLink() {
    return getOrCreateProperty("ContactReviewPopup_UpLink", "ContactReviewPopup_UpLink", null, pcftest.ContactReviewPopup.ContactReviewPopup_UpLink.class);
  }
  
  public ReviewDV getReviewDV() {
    return getOrCreateProperty("ReviewDV", "ReviewDV", null, pcftest.ReviewDV.class);
  }
  
  public UpdateButton getUpdateButton() {
    return getOrCreateProperty("UpdateButton", "UpdateButton", null, pcftest.ContactReviewPopup.UpdateButton.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ContactReviewPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ContactReviewPopup.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ContactReviewPopup._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/contacts/review/ContactReviewPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CancelButton extends ClickableActionElement {
    public CancelButton(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/contacts/review/ContactReviewPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ContactReviewPopup_UpLink extends ClickableActionElement {
    public ContactReviewPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/contacts/review/ContactReviewPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class UpdateButton extends ClickableActionElement {
    public UpdateButton(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/contacts/review/ContactReviewPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/contacts/review/ContactReviewPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/contacts/review/ContactReviewPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}