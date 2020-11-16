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
import pcftest.ClusterPages.ClusterPages_UpLink;
import pcftest.ClusterPages.MenuLinks;
import pcftest.ClusterPages.MenuLinks.ClusterPages_ClusterComponents;
import pcftest.ClusterPages.MenuLinks.ClusterPages_ClusterMembers;
import pcftest.ClusterPages._Paging;
import pcftest.ClusterPages.__crumb__;
import pcftest.ClusterPages._msgs;
import pcftest.ClusterPages.actWizard;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/cluster/ClusterPages.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClusterPages extends PCFLocation {
  public final static String CHECKSUM = "4c22057066657806d8f7950bb84441e4";
  
  public ClusterPages(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ClusterPages"));
  }
  
  public ClusterComponents getClusterComponents() {
    return getOrCreateProperty("ClusterComponents", pcftest.ClusterComponents.class);
  }
  
  public ClusterMembers getClusterMembers() {
    return getOrCreateProperty("ClusterMembers", pcftest.ClusterMembers.class);
  }
  
  public ClusterPages_UpLink getClusterPages_UpLink() {
    return getOrCreateProperty("ClusterPages_UpLink", "ClusterPages_UpLink", null, pcftest.ClusterPages.ClusterPages_UpLink.class);
  }
  
  public InternalToolsTabBar getInternalToolsTabBar() {
    return getOrCreateProperty("InternalToolsTabBar", pcftest.InternalToolsTabBar.class);
  }
  
  public MenuLinks getMenuLinks() {
    return getOrCreateMenuLinksProperty("MenuLinks", "MenuLinks", null, pcftest.ClusterPages.MenuLinks.class, "ServerTools-MenuLinks-ServerTools_ClusterPages");
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ClusterPages._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ClusterPages.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ClusterPages._msgs.class);
  }
  
  public ServerTools get_parent() {
    return getOrCreateProperty("_parent", pcftest.ServerTools.class);
  }
  
  public actWizard getactWizard() {
    return getOrCreateProperty("actWizard", "actWizard", null, pcftest.ClusterPages.actWizard.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/cluster/ClusterPages.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClusterPages_UpLink extends ClickableActionElement {
    public ClusterPages_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/cluster/ClusterPages.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MenuLinks extends PCFElement {
    public MenuLinks(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClusterPages_ClusterComponents getClusterPages_ClusterComponents() {
      return getOrCreateProperty("ClusterPages_ClusterComponents", "ClusterPages_ClusterComponents", null, pcftest.ClusterPages.MenuLinks.ClusterPages_ClusterComponents.class);
    }
    
    public ClusterPages_ClusterMembers getClusterPages_ClusterMembers() {
      return getOrCreateProperty("ClusterPages_ClusterMembers", "ClusterPages_ClusterMembers", null, pcftest.ClusterPages.MenuLinks.ClusterPages_ClusterMembers.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/cluster/ClusterPages.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClusterPages_ClusterComponents extends ClickableActionElement {
      public ClusterPages_ClusterComponents(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ClusterComponents click() {
        return clickThis(pcftest.ClusterComponents.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/cluster/ClusterPages.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClusterPages_ClusterMembers extends ClickableActionElement {
      public ClusterPages_ClusterMembers(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ClusterMembers click() {
        return clickThis(pcftest.ClusterMembers.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/cluster/ClusterPages.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/cluster/ClusterPages.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/cluster/ClusterPages.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/cluster/ClusterPages.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class actWizard extends ClickableActionElement {
    public actWizard(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  
}