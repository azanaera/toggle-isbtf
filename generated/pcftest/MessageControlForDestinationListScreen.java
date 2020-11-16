package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.MessageControlForDestinationListScreen.MessageControlForDestinationListScreen_ResyncButton;
import pcftest.MessageControlForDestinationListScreen.MessageControlForDestinationListScreen_RetryButton;
import pcftest.MessageControlForDestinationListScreen.MessageControlForDestinationListScreen_SkipButton;
import pcftest.MessageControlForDestinationListScreen.MessageControlSearchItem_Button;
import pcftest.MessageControlForDestinationListScreen.TotalStatistics;
import pcftest.MessageControlForDestinationListScreen._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/messaging/MessageControlForDestinationListScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class MessageControlForDestinationListScreen extends PCFElement {
  public final static String CHECKSUM = "fc75d00d2cb281308aa9cbb19ef35343";
  
  public MessageControlForDestinationListScreen(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public MessageControlForDestinationListLV getMessageControlForDestinationListLV() {
    return getOrCreateProperty("MessageControlForDestinationListLV", "MessageControlForDestinationListLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.MessageControlForDestinationListLV.class);
  }
  
  public MessageControlForDestinationListScreen_ResyncButton getMessageControlForDestinationListScreen_ResyncButton() {
    return getOrCreateProperty("MessageControlForDestinationListScreen_ResyncButton", "MessageControlForDestinationListScreen_ResyncButton", null, pcftest.MessageControlForDestinationListScreen.MessageControlForDestinationListScreen_ResyncButton.class);
  }
  
  public MessageControlForDestinationListScreen_RetryButton getMessageControlForDestinationListScreen_RetryButton() {
    return getOrCreateProperty("MessageControlForDestinationListScreen_RetryButton", "MessageControlForDestinationListScreen_RetryButton", null, pcftest.MessageControlForDestinationListScreen.MessageControlForDestinationListScreen_RetryButton.class);
  }
  
  public MessageControlForDestinationListScreen_SkipButton getMessageControlForDestinationListScreen_SkipButton() {
    return getOrCreateProperty("MessageControlForDestinationListScreen_SkipButton", "MessageControlForDestinationListScreen_SkipButton", null, pcftest.MessageControlForDestinationListScreen.MessageControlForDestinationListScreen_SkipButton.class);
  }
  
  public ValueElement getMessageControlSearchItem() {
    return getOrCreateProperty("MessageControlSearchItem", "MessageControlSearchItem", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public MessageControlSearchItem_Button getMessageControlSearchItem_Button() {
    return getOrCreateProperty("MessageControlSearchItem_Button", "MessageControlSearchItem_Button", null, pcftest.MessageControlForDestinationListScreen.MessageControlSearchItem_Button.class);
  }
  
  public TotalStatistics getTotalStatistics() {
    return getOrCreateProperty("TotalStatistics", "TotalStatistics", null, pcftest.MessageControlForDestinationListScreen.TotalStatistics.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.MessageControlForDestinationListScreen._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/messaging/MessageControlForDestinationListScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MessageControlForDestinationListScreen_ResyncButton extends ClickableActionElement {
    public MessageControlForDestinationListScreen_ResyncButton(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/messaging/MessageControlForDestinationListScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MessageControlForDestinationListScreen_RetryButton extends ClickableActionElement {
    public MessageControlForDestinationListScreen_RetryButton(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/messaging/MessageControlForDestinationListScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MessageControlForDestinationListScreen_SkipButton extends ClickableActionElement {
    public MessageControlForDestinationListScreen_SkipButton(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/messaging/MessageControlForDestinationListScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MessageControlSearchItem_Button extends ClickableActionElement {
    public MessageControlSearchItem_Button(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/messaging/MessageControlForDestinationListScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TotalStatistics extends PCFElement {
    public TotalStatistics(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public MessageDestinationStatisticsDV getMessageDestinationStatisticsDV() {
      return getOrCreateProperty("MessageDestinationStatisticsDV", "MessageDestinationStatisticsDV", null, pcftest.MessageDestinationStatisticsDV.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/messaging/MessageControlForDestinationListScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}