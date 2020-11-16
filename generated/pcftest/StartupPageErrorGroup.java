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
import pcftest.StartupPageErrorGroup.MenuLinks;
import pcftest.StartupPageErrorGroup.MenuLinks.StartupPageErrorGroup_StartupPageError;
import pcftest.StartupPageErrorGroup.StartupPageErrorGroup_UpLink;
import pcftest.StartupPageErrorGroup._Paging;
import pcftest.StartupPageErrorGroup.__crumb__;
import pcftest.StartupPageErrorGroup._msgs;
import pcftest.StartupPageErrorGroup.actWizard;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/util/StartupPageErrorGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class StartupPageErrorGroup extends PCFLocation {
  public final static String CHECKSUM = "7fdae292ba9bae87af384c88b2d4598d";
  
  public StartupPageErrorGroup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("StartupPageErrorGroup"));
  }
  
  public MenuLinks getMenuLinks() {
    return getOrCreateMenuLinksProperty("MenuLinks", "MenuLinks", null, pcftest.StartupPageErrorGroup.MenuLinks.class, null);
  }
  
  public StartupPageError getStartupPageError() {
    return getOrCreateProperty("StartupPageError", pcftest.StartupPageError.class);
  }
  
  public StartupPageErrorGroup_UpLink getStartupPageErrorGroup_UpLink() {
    return getOrCreateProperty("StartupPageErrorGroup_UpLink", "StartupPageErrorGroup_UpLink", null, pcftest.StartupPageErrorGroup.StartupPageErrorGroup_UpLink.class);
  }
  
  public StartupPageErrorTabBar getStartupPageErrorTabBar() {
    return getOrCreateProperty("StartupPageErrorTabBar", pcftest.StartupPageErrorTabBar.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.StartupPageErrorGroup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.StartupPageErrorGroup.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.StartupPageErrorGroup._msgs.class);
  }
  
  public actWizard getactWizard() {
    return getOrCreateProperty("actWizard", "actWizard", null, pcftest.StartupPageErrorGroup.actWizard.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/util/StartupPageErrorGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MenuLinks extends PCFElement {
    public MenuLinks(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public StartupPageErrorGroup_StartupPageError getStartupPageErrorGroup_StartupPageError() {
      return getOrCreateProperty("StartupPageErrorGroup_StartupPageError", "StartupPageErrorGroup_StartupPageError", null, pcftest.StartupPageErrorGroup.MenuLinks.StartupPageErrorGroup_StartupPageError.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/util/StartupPageErrorGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class StartupPageErrorGroup_StartupPageError extends ClickableActionElement {
      public StartupPageErrorGroup_StartupPageError(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public StartupPageError click() {
        return clickThis(pcftest.StartupPageError.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/util/StartupPageErrorGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class StartupPageErrorGroup_UpLink extends ClickableActionElement {
    public StartupPageErrorGroup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/util/StartupPageErrorGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/util/StartupPageErrorGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/util/StartupPageErrorGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/util/StartupPageErrorGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class actWizard extends ClickableActionElement {
    public actWizard(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  
}