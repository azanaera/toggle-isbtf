package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.DashboardGroup.DashboardGroup_UpLink;
import pcftest.DashboardGroup._Paging;
import pcftest.DashboardGroup.__crumb__;
import pcftest.DashboardGroup._msgs;
import pcftest.DashboardGroup.actWizard;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/dashboard/DashboardGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class DashboardGroup extends PCFLocation {
  public final static String CHECKSUM = "2931de168023a7caca3a349f7d4eccc8";
  
  public DashboardGroup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("DashboardGroup"));
  }
  
  public BlankMenuLinks getBlankMenuLinks() {
    return getOrCreateMenuLinksProperty("BlankMenuLinks", "BlankMenuLinks", null, pcftest.BlankMenuLinks.class, null);
  }
  
  public DashboardGroup_UpLink getDashboardGroup_UpLink() {
    return getOrCreateProperty("DashboardGroup_UpLink", "DashboardGroup_UpLink", null, pcftest.DashboardGroup.DashboardGroup_UpLink.class);
  }
  
  public DashboardMenuTree getDashboardMenuTree() {
    return getOrCreateProperty("DashboardMenuTree", "DashboardMenuTree", null, pcftest.DashboardMenuTree.class);
  }
  
  public DashboardSubGroup getDashboardSubGroup() {
    return getOrCreateProperty("DashboardSubGroup", pcftest.DashboardSubGroup.class);
  }
  
  public DesktopMenuActions getDesktopMenuActions() {
    return getOrCreateProperty("DesktopMenuActions", "DesktopMenuActions", null, pcftest.DesktopMenuActions.class);
  }
  
  public TabBar getTabBar() {
    return getOrCreateProperty("TabBar", pcftest.TabBar.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.DashboardGroup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.DashboardGroup.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.DashboardGroup._msgs.class);
  }
  
  public actWizard getactWizard() {
    return getOrCreateProperty("actWizard", "actWizard", null, pcftest.DashboardGroup.actWizard.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/dashboard/DashboardGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DashboardGroup_UpLink extends ClickableActionElement {
    public DashboardGroup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/dashboard/DashboardGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/dashboard/DashboardGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/dashboard/DashboardGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/dashboard/DashboardGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class actWizard extends ClickableActionElement {
    public actWizard(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  
}