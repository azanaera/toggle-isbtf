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
import pcftest.WorkflowSearch.WorkflowSearchScreen;
import pcftest.WorkflowSearch.WorkflowSearchScreen.WorkflowsLV_tb;
import pcftest.WorkflowSearch.WorkflowSearchScreen.WorkflowsLV_tb.Workflows_ManageAllButton;
import pcftest.WorkflowSearch.WorkflowSearchScreen.WorkflowsLV_tb.Workflows_ManageButton;
import pcftest.WorkflowSearch.WorkflowSearchScreen._msgs;
import pcftest.WorkflowSearch.WorkflowSearch_UpLink;
import pcftest.WorkflowSearch._Paging;
import pcftest.WorkflowSearch.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/workflow/WorkflowSearch.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class WorkflowSearch extends PCFLocation {
  public final static String CHECKSUM = "5513627d29ba2bdcff853532f3ba7b43";
  
  public WorkflowSearch(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("WorkflowSearch"));
  }
  
  public WorkflowSearchScreen getWorkflowSearchScreen() {
    return getOrCreateProperty("WorkflowSearchScreen", "WorkflowSearchScreen", null, pcftest.WorkflowSearch.WorkflowSearchScreen.class);
  }
  
  public WorkflowSearch_UpLink getWorkflowSearch_UpLink() {
    return getOrCreateProperty("WorkflowSearch_UpLink", "WorkflowSearch_UpLink", null, pcftest.WorkflowSearch.WorkflowSearch_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.WorkflowSearch._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.WorkflowSearch.__crumb__.class);
  }
  
  public Admin get_parent() {
    return getOrCreateProperty("_parent", pcftest.Admin.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/workflow/WorkflowSearch.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class WorkflowSearchScreen extends PCFElement {
    public WorkflowSearchScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public WorkflowsDV getWorkflowsDV() {
      return getOrCreateProperty("WorkflowsDV", "WorkflowsDV", null, pcftest.WorkflowsDV.class);
    }
    
    public WorkflowsLV getWorkflowsLV() {
      return getOrCreateProperty("WorkflowsLV", "WorkflowsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.WorkflowsLV.class);
    }
    
    public WorkflowsLV_tb getWorkflowsLV_tb() {
      return getOrCreateProperty("WorkflowsLV_tb", "WorkflowsLV_tb", null, pcftest.WorkflowSearch.WorkflowSearchScreen.WorkflowsLV_tb.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.WorkflowSearch.WorkflowSearchScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/workflow/WorkflowSearch.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class WorkflowsLV_tb extends PCFElement {
      public WorkflowsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public Workflows_ManageAllButton getWorkflows_ManageAllButton() {
        return getOrCreateProperty("Workflows_ManageAllButton", "Workflows_ManageAllButton", null, pcftest.WorkflowSearch.WorkflowSearchScreen.WorkflowsLV_tb.Workflows_ManageAllButton.class);
      }
      
      public Workflows_ManageButton getWorkflows_ManageButton() {
        return getOrCreateProperty("Workflows_ManageButton", "Workflows_ManageButton", null, pcftest.WorkflowSearch.WorkflowSearchScreen.WorkflowsLV_tb.Workflows_ManageButton.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/admin/workflow/WorkflowSearch.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Workflows_ManageAllButton extends ClickableActionElement {
        public Workflows_ManageAllButton(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public ManageWorkflows click() {
          return clickThis(pcftest.ManageWorkflows.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/admin/workflow/WorkflowSearch.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Workflows_ManageButton extends ClickableActionElement {
        public Workflows_ManageButton(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/workflow/WorkflowSearch.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/admin/workflow/WorkflowSearch.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class WorkflowSearch_UpLink extends ClickableActionElement {
    public WorkflowSearch_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/workflow/WorkflowSearch.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/workflow/WorkflowSearch.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}