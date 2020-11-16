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
import pcftest.UnsupportedTools.MenuLinks;
import pcftest.UnsupportedTools.MenuLinks.UnsupportedTools_CCSampleData;
import pcftest.UnsupportedTools.MenuLinks.UnsupportedTools_Reload;
import pcftest.UnsupportedTools.MenuLinks.UnsupportedTools_ServerPerformance;
import pcftest.UnsupportedTools.MenuLinks.UnsupportedTools_SystemClock;
import pcftest.UnsupportedTools.UnsupportedTools_UpLink;
import pcftest.UnsupportedTools._Paging;
import pcftest.UnsupportedTools.__crumb__;
import pcftest.UnsupportedTools._msgs;
import pcftest.UnsupportedTools.actWizard;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/UnsupportedTools.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class UnsupportedTools extends PCFLocation {
  public final static String CHECKSUM = "d8c48ab23200c3030410a8cd161c7dcf";
  
  public UnsupportedTools(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("UnsupportedTools"));
  }
  
  public CCSampleData getCCSampleData() {
    return getOrCreateProperty("CCSampleData", pcftest.CCSampleData.class);
  }
  
  public InternalToolsMenuActions getInternalToolsMenuActions() {
    return getOrCreateProperty("InternalToolsMenuActions", "InternalToolsMenuActions", null, pcftest.InternalToolsMenuActions.class);
  }
  
  public InternalToolsTabBar getInternalToolsTabBar() {
    return getOrCreateProperty("InternalToolsTabBar", pcftest.InternalToolsTabBar.class);
  }
  
  public MenuLinks getMenuLinks() {
    return getOrCreateMenuLinksProperty("MenuLinks", "MenuLinks", null, pcftest.UnsupportedTools.MenuLinks.class, null);
  }
  
  public Reload getReload() {
    return getOrCreateProperty("Reload", pcftest.Reload.class);
  }
  
  public ServerPerformance getServerPerformance() {
    return getOrCreateProperty("ServerPerformance", pcftest.ServerPerformance.class);
  }
  
  public SystemClock getSystemClock() {
    return getOrCreateProperty("SystemClock", pcftest.SystemClock.class);
  }
  
  public UnsupportedTools_UpLink getUnsupportedTools_UpLink() {
    return getOrCreateProperty("UnsupportedTools_UpLink", "UnsupportedTools_UpLink", null, pcftest.UnsupportedTools.UnsupportedTools_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.UnsupportedTools._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.UnsupportedTools.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.UnsupportedTools._msgs.class);
  }
  
  public actWizard getactWizard() {
    return getOrCreateProperty("actWizard", "actWizard", null, pcftest.UnsupportedTools.actWizard.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/UnsupportedTools.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MenuLinks extends PCFElement {
    public MenuLinks(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public UnsupportedTools_CCSampleData getUnsupportedTools_CCSampleData() {
      return getOrCreateProperty("UnsupportedTools_CCSampleData", "UnsupportedTools_CCSampleData", null, pcftest.UnsupportedTools.MenuLinks.UnsupportedTools_CCSampleData.class);
    }
    
    public UnsupportedTools_Reload getUnsupportedTools_Reload() {
      return getOrCreateProperty("UnsupportedTools_Reload", "UnsupportedTools_Reload", null, pcftest.UnsupportedTools.MenuLinks.UnsupportedTools_Reload.class);
    }
    
    public UnsupportedTools_ServerPerformance getUnsupportedTools_ServerPerformance() {
      return getOrCreateProperty("UnsupportedTools_ServerPerformance", "UnsupportedTools_ServerPerformance", null, pcftest.UnsupportedTools.MenuLinks.UnsupportedTools_ServerPerformance.class);
    }
    
    public UnsupportedTools_SystemClock getUnsupportedTools_SystemClock() {
      return getOrCreateProperty("UnsupportedTools_SystemClock", "UnsupportedTools_SystemClock", null, pcftest.UnsupportedTools.MenuLinks.UnsupportedTools_SystemClock.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/UnsupportedTools.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class UnsupportedTools_CCSampleData extends ClickableActionElement {
      public UnsupportedTools_CCSampleData(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public CCSampleData click() {
        return clickThis(pcftest.CCSampleData.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/UnsupportedTools.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class UnsupportedTools_Reload extends ClickableActionElement {
      public UnsupportedTools_Reload(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public Reload click() {
        return clickThis(pcftest.Reload.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/UnsupportedTools.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class UnsupportedTools_ServerPerformance extends ClickableActionElement {
      public UnsupportedTools_ServerPerformance(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ServerPerformance click() {
        return clickThis(pcftest.ServerPerformance.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/UnsupportedTools.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class UnsupportedTools_SystemClock extends ClickableActionElement {
      public UnsupportedTools_SystemClock(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public SystemClock click() {
        return clickThis(pcftest.SystemClock.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/UnsupportedTools.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class UnsupportedTools_UpLink extends ClickableActionElement {
    public UnsupportedTools_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/UnsupportedTools.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/UnsupportedTools.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/UnsupportedTools.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/UnsupportedTools.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class actWizard extends ClickableActionElement {
    public actWizard(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  
}