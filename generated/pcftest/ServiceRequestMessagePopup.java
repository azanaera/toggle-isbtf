package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ServiceRequestMessagePopup.Cancel;
import pcftest.ServiceRequestMessagePopup.Edit;
import pcftest.ServiceRequestMessagePopup.NewMessageDV;
import pcftest.ServiceRequestMessagePopup.NewMessageDV.MessageType;
import pcftest.ServiceRequestMessagePopup.ServiceRequestMessagePopup_UpLink;
import pcftest.ServiceRequestMessagePopup.Update;
import pcftest.ServiceRequestMessagePopup._Paging;
import pcftest.ServiceRequestMessagePopup.__crumb__;
import pcftest.ServiceRequestMessagePopup._msgs;
import typekey.ServiceRequestMessageType;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/servicerequests/ServiceRequestMessagePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ServiceRequestMessagePopup extends PCFLocation {
  public final static String CHECKSUM = "09beab910353bc9de0af20c42a35bc1c";
  
  public ServiceRequestMessagePopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ServiceRequestMessagePopup"));
  }
  
  public Cancel getCancel() {
    return getOrCreateProperty("Cancel", "Cancel", null, pcftest.ServiceRequestMessagePopup.Cancel.class);
  }
  
  public Edit getEdit() {
    return getOrCreateProperty("Edit", "Edit", null, pcftest.ServiceRequestMessagePopup.Edit.class);
  }
  
  public NewMessageDV getNewMessageDV() {
    return getOrCreateProperty("NewMessageDV", "NewMessageDV", null, pcftest.ServiceRequestMessagePopup.NewMessageDV.class);
  }
  
  public ServiceRequestMessagePopup_UpLink getServiceRequestMessagePopup_UpLink() {
    return getOrCreateProperty("ServiceRequestMessagePopup_UpLink", "ServiceRequestMessagePopup_UpLink", null, pcftest.ServiceRequestMessagePopup.ServiceRequestMessagePopup_UpLink.class);
  }
  
  public Update getUpdate() {
    return getOrCreateProperty("Update", "Update", null, pcftest.ServiceRequestMessagePopup.Update.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ServiceRequestMessagePopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ServiceRequestMessagePopup.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ServiceRequestMessagePopup._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/servicerequests/ServiceRequestMessagePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Cancel extends ClickableActionElement {
    public Cancel(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/servicerequests/ServiceRequestMessagePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Edit extends ClickableActionElement {
    public Edit(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/servicerequests/ServiceRequestMessagePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewMessageDV extends DetailViewElement {
    public NewMessageDV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getMessageContent() {
      return getOrCreateProperty("MessageContent", "MessageContent", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getMessageTitle() {
      return getOrCreateProperty("MessageTitle", "MessageTitle", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public MessageType getMessageType() {
      return getOrCreateProperty("MessageType", "MessageType", null, pcftest.ServiceRequestMessagePopup.NewMessageDV.MessageType.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/servicerequests/ServiceRequestMessagePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class MessageType extends SelectElement {
      public MessageType(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(ServiceRequestMessageType arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public ServiceRequestMessageType getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.ServiceRequestMessageType.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(ServiceRequestMessageType arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/servicerequests/ServiceRequestMessagePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ServiceRequestMessagePopup_UpLink extends ClickableActionElement {
    public ServiceRequestMessagePopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/servicerequests/ServiceRequestMessagePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Update extends ClickableActionElement {
    public Update(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/servicerequests/ServiceRequestMessagePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/servicerequests/ServiceRequestMessagePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/servicerequests/ServiceRequestMessagePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}