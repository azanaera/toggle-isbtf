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
import pcftest.MessagingDestinationControlList.MessagingDestinationControlListScreen;
import pcftest.MessagingDestinationControlList.MessagingDestinationControlListScreen.MessagingDestinationsControlLV_tb;
import pcftest.MessagingDestinationControlList.MessagingDestinationControlListScreen.MessagingDestinationsControlLV_tb.MessagingDestinationControlList_RestartButton;
import pcftest.MessagingDestinationControlList.MessagingDestinationControlListScreen.MessagingDestinationsControlLV_tb.MessagingDestinationControlList_RestartMessagingEngineButton;
import pcftest.MessagingDestinationControlList.MessagingDestinationControlListScreen.MessagingDestinationsControlLV_tb.MessagingDestinationControlList_ResumeButton;
import pcftest.MessagingDestinationControlList.MessagingDestinationControlListScreen.MessagingDestinationsControlLV_tb.MessagingDestinationControlList_SuspendButton;
import pcftest.MessagingDestinationControlList.MessagingDestinationControlListScreen._msgs;
import pcftest.MessagingDestinationControlList.MessagingDestinationControlList_UpLink;
import pcftest.MessagingDestinationControlList._Paging;
import pcftest.MessagingDestinationControlList.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/messaging/MessagingDestinationControlList.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class MessagingDestinationControlList extends PCFLocation {
  public final static String CHECKSUM = "34d7ff26aaf6f12af065e2ca68e67cbd";
  
  public MessagingDestinationControlList(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("MessagingDestinationControlList"));
  }
  
  public MessagingDestinationControlListScreen getMessagingDestinationControlListScreen() {
    return getOrCreateProperty("MessagingDestinationControlListScreen", "MessagingDestinationControlListScreen", null, pcftest.MessagingDestinationControlList.MessagingDestinationControlListScreen.class);
  }
  
  public MessagingDestinationControlList_UpLink getMessagingDestinationControlList_UpLink() {
    return getOrCreateProperty("MessagingDestinationControlList_UpLink", "MessagingDestinationControlList_UpLink", null, pcftest.MessagingDestinationControlList.MessagingDestinationControlList_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.MessagingDestinationControlList._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.MessagingDestinationControlList.__crumb__.class);
  }
  
  public Admin get_parent() {
    return getOrCreateProperty("_parent", pcftest.Admin.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/messaging/MessagingDestinationControlList.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MessagingDestinationControlListScreen extends PCFElement {
    public MessagingDestinationControlListScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public MessagingDestinationsControlLV getMessagingDestinationsControlLV() {
      return getOrCreateProperty("MessagingDestinationsControlLV", "MessagingDestinationsControlLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.MessagingDestinationsControlLV.class);
    }
    
    public MessagingDestinationsControlLV_tb getMessagingDestinationsControlLV_tb() {
      return getOrCreateProperty("MessagingDestinationsControlLV_tb", "MessagingDestinationsControlLV_tb", null, pcftest.MessagingDestinationControlList.MessagingDestinationControlListScreen.MessagingDestinationsControlLV_tb.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.MessagingDestinationControlList.MessagingDestinationControlListScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/messaging/MessagingDestinationControlList.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class MessagingDestinationsControlLV_tb extends PCFElement {
      public MessagingDestinationsControlLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public MessagingDestinationControlList_RestartButton getMessagingDestinationControlList_RestartButton() {
        return getOrCreateProperty("MessagingDestinationControlList_RestartButton", "MessagingDestinationControlList_RestartButton", null, pcftest.MessagingDestinationControlList.MessagingDestinationControlListScreen.MessagingDestinationsControlLV_tb.MessagingDestinationControlList_RestartButton.class);
      }
      
      public MessagingDestinationControlList_RestartMessagingEngineButton getMessagingDestinationControlList_RestartMessagingEngineButton() {
        return getOrCreateProperty("MessagingDestinationControlList_RestartMessagingEngineButton", "MessagingDestinationControlList_RestartMessagingEngineButton", null, pcftest.MessagingDestinationControlList.MessagingDestinationControlListScreen.MessagingDestinationsControlLV_tb.MessagingDestinationControlList_RestartMessagingEngineButton.class);
      }
      
      public MessagingDestinationControlList_ResumeButton getMessagingDestinationControlList_ResumeButton() {
        return getOrCreateProperty("MessagingDestinationControlList_ResumeButton", "MessagingDestinationControlList_ResumeButton", null, pcftest.MessagingDestinationControlList.MessagingDestinationControlListScreen.MessagingDestinationsControlLV_tb.MessagingDestinationControlList_ResumeButton.class);
      }
      
      public MessagingDestinationControlList_SuspendButton getMessagingDestinationControlList_SuspendButton() {
        return getOrCreateProperty("MessagingDestinationControlList_SuspendButton", "MessagingDestinationControlList_SuspendButton", null, pcftest.MessagingDestinationControlList.MessagingDestinationControlListScreen.MessagingDestinationsControlLV_tb.MessagingDestinationControlList_SuspendButton.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/admin/messaging/MessagingDestinationControlList.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class MessagingDestinationControlList_RestartButton extends ClickableActionElement {
        public MessagingDestinationControlList_RestartButton(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/admin/messaging/MessagingDestinationControlList.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class MessagingDestinationControlList_RestartMessagingEngineButton extends ClickableActionElement {
        public MessagingDestinationControlList_RestartMessagingEngineButton(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/admin/messaging/MessagingDestinationControlList.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class MessagingDestinationControlList_ResumeButton extends ClickableActionElement {
        public MessagingDestinationControlList_ResumeButton(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/admin/messaging/MessagingDestinationControlList.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class MessagingDestinationControlList_SuspendButton extends ClickableActionElement {
        public MessagingDestinationControlList_SuspendButton(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/messaging/MessagingDestinationControlList.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/admin/messaging/MessagingDestinationControlList.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MessagingDestinationControlList_UpLink extends ClickableActionElement {
    public MessagingDestinationControlList_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/messaging/MessagingDestinationControlList.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/messaging/MessagingDestinationControlList.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}