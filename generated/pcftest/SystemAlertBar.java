package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.SystemAlertBar.LogoutLink;
import pcftest.SystemAlertBar.Message;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/util/SystemAlertBar.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class SystemAlertBar extends PCFElement {
  public final static String CHECKSUM = "3050b77b245458543d26ab39b5179b6f";
  
  public SystemAlertBar(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public LogoutLink getLogoutLink() {
    return getOrCreateProperty("LogoutLink", "LogoutLink", null, pcftest.SystemAlertBar.LogoutLink.class);
  }
  
  public Message getMessage() {
    return getOrCreateProperty("Message", "Message", null, pcftest.SystemAlertBar.Message.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/util/SystemAlertBar.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LogoutLink extends ClickableActionElement {
    public LogoutLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/util/SystemAlertBar.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Message extends ClickableActionElement {
    public Message(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  
}