package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.MessagePayloadPopup.MessagePayloadPopup_UpLink;
import pcftest.MessagePayloadPopup._Paging;
import pcftest.MessagePayloadPopup.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/messaging/MessagePayloadPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class MessagePayloadPopup extends PCFLocation {
  public final static String CHECKSUM = "7c819edda71a4c3f0df10e9b9264edce";
  
  public MessagePayloadPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("MessagePayloadPopup"));
  }
  
  public MessagePayloadPopup_UpLink getMessagePayloadPopup_UpLink() {
    return getOrCreateProperty("MessagePayloadPopup_UpLink", "MessagePayloadPopup_UpLink", null, pcftest.MessagePayloadPopup.MessagePayloadPopup_UpLink.class);
  }
  
  public MessagePayloadScreen getMessagePayloadScreen() {
    return getOrCreateProperty("MessagePayloadScreen", "MessagePayloadScreen", null, pcftest.MessagePayloadScreen.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.MessagePayloadPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.MessagePayloadPopup.__crumb__.class);
  }
  
  public MessagingDestinationControlList get_parent() {
    return getOrCreateProperty("_parent", pcftest.MessagingDestinationControlList.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/messaging/MessagePayloadPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MessagePayloadPopup_UpLink extends ClickableActionElement {
    public MessagePayloadPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/messaging/MessagePayloadPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/messaging/MessagePayloadPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}