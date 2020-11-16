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
import pcftest.Monitoring.MenuLinks;
import pcftest.Monitoring.MenuLinks.Monitoring_MessagingDestinationControlList;
import pcftest.Monitoring.MenuLinks.Monitoring_WorkflowSearch;
import pcftest.Monitoring.MenuLinks.Monitoring_WorkflowStats;
import pcftest.Monitoring.Monitoring_UpLink;
import pcftest.Monitoring._Paging;
import pcftest.Monitoring.__crumb__;
import pcftest.Monitoring._msgs;
import pcftest.Monitoring.actWizard;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/monitoring/Monitoring.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class Monitoring extends PCFLocation {
  public final static String CHECKSUM = "e07e700388f6a10ef2322221458a21a8";
  
  public Monitoring(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("Monitoring"));
  }
  
  public MenuLinks getMenuLinks() {
    return getOrCreateMenuLinksProperty("MenuLinks", "MenuLinks", null, pcftest.Monitoring.MenuLinks.class, "Admin-MenuLinks-Admin_Monitoring");
  }
  
  public MessagingDestinationControlList getMessagingDestinationControlList() {
    return getOrCreateProperty("MessagingDestinationControlList", pcftest.MessagingDestinationControlList.class);
  }
  
  public Monitoring_UpLink getMonitoring_UpLink() {
    return getOrCreateProperty("Monitoring_UpLink", "Monitoring_UpLink", null, pcftest.Monitoring.Monitoring_UpLink.class);
  }
  
  public TabBar getTabBar() {
    return getOrCreateProperty("TabBar", pcftest.TabBar.class);
  }
  
  public WorkflowSearch getWorkflowSearch() {
    return getOrCreateProperty("WorkflowSearch", pcftest.WorkflowSearch.class);
  }
  
  public WorkflowStats getWorkflowStats() {
    return getOrCreateProperty("WorkflowStats", pcftest.WorkflowStats.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.Monitoring._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.Monitoring.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.Monitoring._msgs.class);
  }
  
  public Admin get_parent() {
    return getOrCreateProperty("_parent", pcftest.Admin.class);
  }
  
  public actWizard getactWizard() {
    return getOrCreateProperty("actWizard", "actWizard", null, pcftest.Monitoring.actWizard.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/monitoring/Monitoring.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MenuLinks extends PCFElement {
    public MenuLinks(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Monitoring_MessagingDestinationControlList getMonitoring_MessagingDestinationControlList() {
      return getOrCreateProperty("Monitoring_MessagingDestinationControlList", "Monitoring_MessagingDestinationControlList", null, pcftest.Monitoring.MenuLinks.Monitoring_MessagingDestinationControlList.class);
    }
    
    public Monitoring_WorkflowSearch getMonitoring_WorkflowSearch() {
      return getOrCreateProperty("Monitoring_WorkflowSearch", "Monitoring_WorkflowSearch", null, pcftest.Monitoring.MenuLinks.Monitoring_WorkflowSearch.class);
    }
    
    public Monitoring_WorkflowStats getMonitoring_WorkflowStats() {
      return getOrCreateProperty("Monitoring_WorkflowStats", "Monitoring_WorkflowStats", null, pcftest.Monitoring.MenuLinks.Monitoring_WorkflowStats.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/monitoring/Monitoring.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Monitoring_MessagingDestinationControlList extends ClickableActionElement {
      public Monitoring_MessagingDestinationControlList(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public MessagingDestinationControlList click() {
        return clickThis(pcftest.MessagingDestinationControlList.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/monitoring/Monitoring.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Monitoring_WorkflowSearch extends ClickableActionElement {
      public Monitoring_WorkflowSearch(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public WorkflowSearch click() {
        return clickThis(pcftest.WorkflowSearch.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/monitoring/Monitoring.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Monitoring_WorkflowStats extends ClickableActionElement {
      public Monitoring_WorkflowStats(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public WorkflowStats click() {
        return clickThis(pcftest.WorkflowStats.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/monitoring/Monitoring.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Monitoring_UpLink extends ClickableActionElement {
    public Monitoring_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/monitoring/Monitoring.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/monitoring/Monitoring.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/monitoring/Monitoring.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/monitoring/Monitoring.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class actWizard extends ClickableActionElement {
    public actWizard(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  
}