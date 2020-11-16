package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.QuickJumpElement;
import gw.smoketest.platform.web.TabBarElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.StartupPageErrorTabBar.AboutTabBarLink;
import pcftest.StartupPageErrorTabBar.HelpTabBarLink;
import pcftest.StartupPageErrorTabBar.LogoutTabBarLink;
import pcftest.StartupPageErrorTabBar.QuickJump;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/util/StartupPageErrorTabBar.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class StartupPageErrorTabBar extends TabBarElement {
  public final static String CHECKSUM = "dd87cfb810e40597fba0a56c372590b9";
  
  public StartupPageErrorTabBar(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("StartupPageErrorTabBar"));
  }
  
  public AboutTabBarLink getAboutTabBarLink() {
    return getOrCreateProperty("AboutTabBarLink", "AboutTabBarLink", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PreferencesMenuItem, pcftest.StartupPageErrorTabBar.AboutTabBarLink.class);
  }
  
  public HelpTabBarLink getHelpTabBarLink() {
    return getOrCreateProperty("HelpTabBarLink", "HelpTabBarLink", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PreferencesMenuItem, pcftest.StartupPageErrorTabBar.HelpTabBarLink.class);
  }
  
  public LogoutTabBarLink getLogoutTabBarLink() {
    return getOrCreateProperty("LogoutTabBarLink", "LogoutTabBarLink", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PreferencesMenuItem, pcftest.StartupPageErrorTabBar.LogoutTabBarLink.class);
  }
  
  public QuickJump getQuickJump() {
    return getOrCreateProperty("QuickJump", pcftest.StartupPageErrorTabBar.QuickJump.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/util/StartupPageErrorTabBar.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AboutTabBarLink extends ClickableActionElement {
    public AboutTabBarLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/util/StartupPageErrorTabBar.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class HelpTabBarLink extends ClickableActionElement {
    public HelpTabBarLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Help click() {
      return clickThis(pcftest.Help.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/util/StartupPageErrorTabBar.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  
  
}