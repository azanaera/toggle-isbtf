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
import pcftest.WorkflowDetail.WorkflowDetailScreen;
import pcftest.WorkflowDetail.WorkflowDetailScreen.WorkflowDetail_ManageButton;
import pcftest.WorkflowDetail.WorkflowDetailScreen.WorkflowDetail_RefreshButton;
import pcftest.WorkflowDetail.WorkflowDetailScreen.WorkflowDetail_ResumeButton;
import pcftest.WorkflowDetail.WorkflowDetailScreen.WorkflowDetail_SuspendButtonButton;
import pcftest.WorkflowDetail.WorkflowDetailScreen.WorkflowsLV_tb;
import pcftest.WorkflowDetail.WorkflowDetailScreen._msgs;
import pcftest.WorkflowDetail.WorkflowDetail_UpLink;
import pcftest.WorkflowDetail._Paging;
import pcftest.WorkflowDetail.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/workflow/WorkflowDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class WorkflowDetail extends PCFLocation {
  public final static String CHECKSUM = "b7fdbc51caf3900dbde9e74a1435243f";
  
  public WorkflowDetail(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("WorkflowDetail"));
  }
  
  public WorkflowDetailScreen getWorkflowDetailScreen() {
    return getOrCreateProperty("WorkflowDetailScreen", "WorkflowDetailScreen", null, pcftest.WorkflowDetail.WorkflowDetailScreen.class);
  }
  
  public WorkflowDetail_UpLink getWorkflowDetail_UpLink() {
    return getOrCreateProperty("WorkflowDetail_UpLink", "WorkflowDetail_UpLink", null, pcftest.WorkflowDetail.WorkflowDetail_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.WorkflowDetail._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.WorkflowDetail.__crumb__.class);
  }
  
  public WorkflowSearch get_parent() {
    return getOrCreateProperty("_parent", pcftest.WorkflowSearch.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/workflow/WorkflowDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class WorkflowDetailScreen extends PCFElement {
    public WorkflowDetailScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public WorkflowDetailDV getWorkflowDetailDV() {
      return getOrCreateProperty("WorkflowDetailDV", "WorkflowDetailDV", null, pcftest.WorkflowDetailDV.class);
    }
    
    public WorkflowDetail_ManageButton getWorkflowDetail_ManageButton() {
      return getOrCreateProperty("WorkflowDetail_ManageButton", "WorkflowDetail_ManageButton", null, pcftest.WorkflowDetail.WorkflowDetailScreen.WorkflowDetail_ManageButton.class);
    }
    
    public WorkflowDetail_RefreshButton getWorkflowDetail_RefreshButton() {
      return getOrCreateProperty("WorkflowDetail_RefreshButton", "WorkflowDetail_RefreshButton", null, pcftest.WorkflowDetail.WorkflowDetailScreen.WorkflowDetail_RefreshButton.class);
    }
    
    public WorkflowDetail_ResumeButton getWorkflowDetail_ResumeButton() {
      return getOrCreateProperty("WorkflowDetail_ResumeButton", "WorkflowDetail_ResumeButton", null, pcftest.WorkflowDetail.WorkflowDetailScreen.WorkflowDetail_ResumeButton.class);
    }
    
    public WorkflowDetail_SuspendButtonButton getWorkflowDetail_SuspendButtonButton() {
      return getOrCreateProperty("WorkflowDetail_SuspendButtonButton", "WorkflowDetail_SuspendButtonButton", null, pcftest.WorkflowDetail.WorkflowDetailScreen.WorkflowDetail_SuspendButtonButton.class);
    }
    
    public WorkflowsLV getWorkflowsLV() {
      return getOrCreateProperty("WorkflowsLV", "WorkflowsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.WorkflowsLV.class);
    }
    
    public WorkflowsLV_tb getWorkflowsLV_tb() {
      return getOrCreateProperty("WorkflowsLV_tb", "WorkflowsLV_tb", null, pcftest.WorkflowDetail.WorkflowDetailScreen.WorkflowsLV_tb.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.WorkflowDetail.WorkflowDetailScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/workflow/WorkflowDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class WorkflowDetail_ManageButton extends ClickableActionElement {
      public WorkflowDetail_ManageButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ManageWorkflows click() {
        return clickThis(pcftest.ManageWorkflows.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/workflow/WorkflowDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class WorkflowDetail_RefreshButton extends ClickableActionElement {
      public WorkflowDetail_RefreshButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/workflow/WorkflowDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class WorkflowDetail_ResumeButton extends ClickableActionElement {
      public WorkflowDetail_ResumeButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/workflow/WorkflowDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class WorkflowDetail_SuspendButtonButton extends ClickableActionElement {
      public WorkflowDetail_SuspendButtonButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/workflow/WorkflowDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class WorkflowsLV_tb extends PCFElement {
      public WorkflowsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/workflow/WorkflowDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/admin/workflow/WorkflowDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class WorkflowDetail_UpLink extends ClickableActionElement {
    public WorkflowDetail_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/workflow/WorkflowDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/workflow/WorkflowDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}