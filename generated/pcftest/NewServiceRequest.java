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
import pcftest.NewServiceRequest.Cancel;
import pcftest.NewServiceRequest.Edit;
import pcftest.NewServiceRequest.NewServiceRequestScreen;
import pcftest.NewServiceRequest.NewServiceRequest_UpLink;
import pcftest.NewServiceRequest.SubmitButton;
import pcftest.NewServiceRequest.Update;
import pcftest.NewServiceRequest._Paging;
import pcftest.NewServiceRequest.__crumb__;
import pcftest.NewServiceRequest._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/newother/NewServiceRequest.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NewServiceRequest extends PCFLocation {
  public final static String CHECKSUM = "1907bf75401b2a0f91fdd9488911d9fd";
  
  public NewServiceRequest(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("NewServiceRequest"));
  }
  
  public Cancel getCancel() {
    return getOrCreateProperty("Cancel", "Cancel", null, pcftest.NewServiceRequest.Cancel.class);
  }
  
  public Edit getEdit() {
    return getOrCreateProperty("Edit", "Edit", null, pcftest.NewServiceRequest.Edit.class);
  }
  
  public NewServiceRequestScreen getNewServiceRequestScreen() {
    return getOrCreateProperty("NewServiceRequestScreen", "NewServiceRequestScreen", null, pcftest.NewServiceRequest.NewServiceRequestScreen.class);
  }
  
  public NewServiceRequest_UpLink getNewServiceRequest_UpLink() {
    return getOrCreateProperty("NewServiceRequest_UpLink", "NewServiceRequest_UpLink", null, pcftest.NewServiceRequest.NewServiceRequest_UpLink.class);
  }
  
  public SubmitButton getSubmitButton() {
    return getOrCreateProperty("SubmitButton", "SubmitButton", null, pcftest.NewServiceRequest.SubmitButton.class);
  }
  
  public Update getUpdate() {
    return getOrCreateProperty("Update", "Update", null, pcftest.NewServiceRequest.Update.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.NewServiceRequest._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.NewServiceRequest.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.NewServiceRequest._msgs.class);
  }
  
  public Claim get_parent() {
    return getOrCreateProperty("_parent", pcftest.Claim.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newother/NewServiceRequest.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Cancel extends ClickableActionElement {
    public Cancel(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newother/NewServiceRequest.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Edit extends ClickableActionElement {
    public Edit(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newother/NewServiceRequest.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewServiceRequestScreen extends PCFElement {
    public NewServiceRequestScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public NewServiceRequestDV getNewServiceRequestDV() {
      return getOrCreateProperty("NewServiceRequestDV", "NewServiceRequestDV", null, pcftest.NewServiceRequestDV.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newother/NewServiceRequest.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewServiceRequest_UpLink extends ClickableActionElement {
    public NewServiceRequest_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newother/NewServiceRequest.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SubmitButton extends ClickableActionElement {
    public SubmitButton(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newother/NewServiceRequest.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Update extends ClickableActionElement {
    public Update(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newother/NewServiceRequest.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newother/NewServiceRequest.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newother/NewServiceRequest.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}