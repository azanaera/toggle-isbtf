package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElement;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.MessageControlForSOOList.MessageControlForSOOListScreen;
import pcftest.MessageControlForSOOList.MessageControlForSOOListScreen.MessageControlForSOOListScreen_RetryButton;
import pcftest.MessageControlForSOOList.MessageControlForSOOListScreen.MessageControlForSOOListScreen_SkipButton;
import pcftest.MessageControlForSOOList.MessageControlForSOOListScreen.MessageControlSearchItem_Button;
import pcftest.MessageControlForSOOList.MessageControlForSOOListScreen._msgs;
import pcftest.MessageControlForSOOList.MessageControlForSOOList_UpLink;
import pcftest.MessageControlForSOOList._Paging;
import pcftest.MessageControlForSOOList.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/messaging/MessageControlForSOOList.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class MessageControlForSOOList extends PCFLocation {
  public final static String CHECKSUM = "4e6be78f87ba8c98599a2e8dd071370e";
  
  public MessageControlForSOOList(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("MessageControlForSOOList"));
  }
  
  public MessageControlForSOOListScreen getMessageControlForSOOListScreen() {
    return getOrCreateProperty("MessageControlForSOOListScreen", "MessageControlForSOOListScreen", null, pcftest.MessageControlForSOOList.MessageControlForSOOListScreen.class);
  }
  
  public MessageControlForSOOList_UpLink getMessageControlForSOOList_UpLink() {
    return getOrCreateProperty("MessageControlForSOOList_UpLink", "MessageControlForSOOList_UpLink", null, pcftest.MessageControlForSOOList.MessageControlForSOOList_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.MessageControlForSOOList._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.MessageControlForSOOList.__crumb__.class);
  }
  
  public MessageControlForDestinationList get_parent() {
    return getOrCreateProperty("_parent", pcftest.MessageControlForDestinationList.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/messaging/MessageControlForSOOList.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MessageControlForSOOListScreen extends PCFElement {
    public MessageControlForSOOListScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public MessageControlForSOOListLV getMessageControlForSOOListLV() {
      return getOrCreateProperty("MessageControlForSOOListLV", "MessageControlForSOOListLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.MessageControlForSOOListLV.class);
    }
    
    public MessageControlForSOOListScreen_RetryButton getMessageControlForSOOListScreen_RetryButton() {
      return getOrCreateProperty("MessageControlForSOOListScreen_RetryButton", "MessageControlForSOOListScreen_RetryButton", null, pcftest.MessageControlForSOOList.MessageControlForSOOListScreen.MessageControlForSOOListScreen_RetryButton.class);
    }
    
    public MessageControlForSOOListScreen_SkipButton getMessageControlForSOOListScreen_SkipButton() {
      return getOrCreateProperty("MessageControlForSOOListScreen_SkipButton", "MessageControlForSOOListScreen_SkipButton", null, pcftest.MessageControlForSOOList.MessageControlForSOOListScreen.MessageControlForSOOListScreen_SkipButton.class);
    }
    
    public ValueElement getMessageControlSearchItem() {
      return getOrCreateProperty("MessageControlSearchItem", "MessageControlSearchItem", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public MessageControlSearchItem_Button getMessageControlSearchItem_Button() {
      return getOrCreateProperty("MessageControlSearchItem_Button", "MessageControlSearchItem_Button", null, pcftest.MessageControlForSOOList.MessageControlForSOOListScreen.MessageControlSearchItem_Button.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.MessageControlForSOOList.MessageControlForSOOListScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/messaging/MessageControlForSOOList.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class MessageControlForSOOListScreen_RetryButton extends ClickableActionElement {
      public MessageControlForSOOListScreen_RetryButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/messaging/MessageControlForSOOList.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class MessageControlForSOOListScreen_SkipButton extends ClickableActionElement {
      public MessageControlForSOOListScreen_SkipButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/messaging/MessageControlForSOOList.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class MessageControlSearchItem_Button extends ClickableActionElement {
      public MessageControlSearchItem_Button(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/messaging/MessageControlForSOOList.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _msgs extends MessagesElement {
      public _msgs(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/messaging/MessageControlForSOOList.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MessageControlForSOOList_UpLink extends ClickableActionElement {
    public MessageControlForSOOList_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/messaging/MessageControlForSOOList.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/messaging/MessageControlForSOOList.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}