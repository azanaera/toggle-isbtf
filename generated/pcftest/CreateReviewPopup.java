package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.CreateReviewPopup.CancelButton;
import pcftest.CreateReviewPopup.CreateReviewPopup_UpLink;
import pcftest.CreateReviewPopup.ReviewScreen_CompleteButton;
import pcftest.CreateReviewPopup.ReviewScreen_DeleteButton;
import pcftest.CreateReviewPopup.UpdateButton;
import pcftest.CreateReviewPopup._Paging;
import pcftest.CreateReviewPopup.__crumb__;
import pcftest.CreateReviewPopup._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/contacts/review/CreateReviewPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class CreateReviewPopup extends PCFLocation {
  public final static String CHECKSUM = "27eaa8c42b3532ef3aa0dec7ddb63e29";
  
  public CreateReviewPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("CreateReviewPopup"));
  }
  
  public CancelButton getCancelButton() {
    return getOrCreateProperty("CancelButton", "CancelButton", null, pcftest.CreateReviewPopup.CancelButton.class);
  }
  
  public CreateReviewPopup_UpLink getCreateReviewPopup_UpLink() {
    return getOrCreateProperty("CreateReviewPopup_UpLink", "CreateReviewPopup_UpLink", null, pcftest.CreateReviewPopup.CreateReviewPopup_UpLink.class);
  }
  
  public ReviewDV getReviewDV() {
    return getOrCreateProperty("ReviewDV", "ReviewDV", null, pcftest.ReviewDV.class);
  }
  
  public ReviewScreen_CompleteButton getReviewScreen_CompleteButton() {
    return getOrCreateProperty("ReviewScreen_CompleteButton", "ReviewScreen_CompleteButton", null, pcftest.CreateReviewPopup.ReviewScreen_CompleteButton.class);
  }
  
  public ReviewScreen_DeleteButton getReviewScreen_DeleteButton() {
    return getOrCreateProperty("ReviewScreen_DeleteButton", "ReviewScreen_DeleteButton", null, pcftest.CreateReviewPopup.ReviewScreen_DeleteButton.class);
  }
  
  public UpdateButton getUpdateButton() {
    return getOrCreateProperty("UpdateButton", "UpdateButton", null, pcftest.CreateReviewPopup.UpdateButton.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.CreateReviewPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.CreateReviewPopup.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.CreateReviewPopup._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/contacts/review/CreateReviewPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CancelButton extends ClickableActionElement {
    public CancelButton(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/contacts/review/CreateReviewPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CreateReviewPopup_UpLink extends ClickableActionElement {
    public CreateReviewPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/contacts/review/CreateReviewPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ReviewScreen_CompleteButton extends ClickableActionElement {
    public ReviewScreen_CompleteButton(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/contacts/review/CreateReviewPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ReviewScreen_DeleteButton extends ClickableActionElement {
    public ReviewScreen_DeleteButton(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/contacts/review/CreateReviewPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class UpdateButton extends ClickableActionElement {
    public UpdateButton(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/contacts/review/CreateReviewPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/contacts/review/CreateReviewPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/contacts/review/CreateReviewPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}