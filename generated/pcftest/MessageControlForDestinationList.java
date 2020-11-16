package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.MessageControlForDestinationList.MessageControlForDestinationList_UpLink;
import pcftest.MessageControlForDestinationList._Paging;
import pcftest.MessageControlForDestinationList.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/messaging/MessageControlForDestinationList.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class MessageControlForDestinationList extends PCFLocation {
  public final static String CHECKSUM = "b43683039eb7076cfb41ce158d242a43";
  
  public MessageControlForDestinationList(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("MessageControlForDestinationList"));
  }
  
  public MessageControlForDestinationListScreen getMessageControlForDestinationListScreen() {
    return getOrCreateProperty("MessageControlForDestinationListScreen", "MessageControlForDestinationListScreen", null, pcftest.MessageControlForDestinationListScreen.class);
  }
  
  public MessageControlForDestinationList_UpLink getMessageControlForDestinationList_UpLink() {
    return getOrCreateProperty("MessageControlForDestinationList_UpLink", "MessageControlForDestinationList_UpLink", null, pcftest.MessageControlForDestinationList.MessageControlForDestinationList_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.MessageControlForDestinationList._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.MessageControlForDestinationList.__crumb__.class);
  }
  
  public MessagingDestinationControlList get_parent() {
    return getOrCreateProperty("_parent", pcftest.MessagingDestinationControlList.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/messaging/MessageControlForDestinationList.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MessageControlForDestinationList_UpLink extends ClickableActionElement {
    public MessageControlForDestinationList_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/messaging/MessageControlForDestinationList.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/messaging/MessageControlForDestinationList.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}