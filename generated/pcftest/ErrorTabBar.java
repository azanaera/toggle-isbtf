package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.QuickJumpElement;
import gw.smoketest.platform.web.TabBarElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ErrorTabBar.AboutTabBarLink;
import pcftest.ErrorTabBar.ErrorTab;
import pcftest.ErrorTabBar.HelpTabBarLink;
import pcftest.ErrorTabBar.LogoutTabBarLink;
import pcftest.ErrorTabBar.QuickJump;
import pcftest.ErrorTabBar.ReturnTabBarLink;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/util/ErrorTabBar.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ErrorTabBar extends TabBarElement {
  public final static String CHECKSUM = "908a85e6f46e1f3e12c69a5ebe9c99c3";
  
  public ErrorTabBar(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ErrorTabBar"));
  }
  
  public AboutTabBarLink getAboutTabBarLink() {
    return getOrCreateProperty("AboutTabBarLink", "AboutTabBarLink", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PreferencesMenuItem, pcftest.ErrorTabBar.AboutTabBarLink.class);
  }
  
  public ErrorTab getErrorTab() {
    return getOrCreateProperty("ErrorTab", "ErrorTab", null, pcftest.ErrorTabBar.ErrorTab.class);
  }
  
  public HelpTabBarLink getHelpTabBarLink() {
    return getOrCreateProperty("HelpTabBarLink", "HelpTabBarLink", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PreferencesMenuItem, pcftest.ErrorTabBar.HelpTabBarLink.class);
  }
  
  public LogoutTabBarLink getLogoutTabBarLink() {
    return getOrCreateProperty("LogoutTabBarLink", "LogoutTabBarLink", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PreferencesMenuItem, pcftest.ErrorTabBar.LogoutTabBarLink.class);
  }
  
  public QuickJump getQuickJump() {
    return getOrCreateProperty("QuickJump", pcftest.ErrorTabBar.QuickJump.class);
  }
  
  public ReturnTabBarLink getReturnTabBarLink() {
    return getOrCreateProperty("ReturnTabBarLink", "ReturnTabBarLink", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PreferencesMenuItem, pcftest.ErrorTabBar.ReturnTabBarLink.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/util/ErrorTabBar.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AboutTabBarLink extends ClickableActionElement {
    public AboutTabBarLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/util/ErrorTabBar.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ErrorTab extends ClickableActionElement {
    public ErrorTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/util/ErrorTabBar.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class HelpTabBarLink extends ClickableActionElement {
    public HelpTabBarLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Help click() {
      return clickThis(pcftest.Help.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/util/ErrorTabBar.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LogoutTabBarLink extends ClickableActionElement {
    public LogoutTabBarLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class QuickJump extends QuickJumpElement {
    public QuickJump(ISmokeTest helper)  {
      super(helper, new gw.smoketest.platform.web.PCFElementId("QuickJump"));
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/util/ErrorTabBar.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ReturnTabBarLink extends ClickableActionElement {
    public ReturnTabBarLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}