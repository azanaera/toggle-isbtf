package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.RadioButtonValueElement;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ManageWorkflows.ManageWorkflowsScreen;
import pcftest.ManageWorkflows.ManageWorkflowsScreen.EditCount;
import pcftest.ManageWorkflows.ManageWorkflowsScreen.InvokeTriggerChoice_Choice;
import pcftest.ManageWorkflows.ManageWorkflowsScreen.ResumeChoice_Choice;
import pcftest.ManageWorkflows.ManageWorkflowsScreen.SuspendChoice_Choice;
import pcftest.ManageWorkflows.ManageWorkflowsScreen.TimeoutChoice_Choice;
import pcftest.ManageWorkflows.ManageWorkflowsScreen.WaitActiveWorkItem;
import pcftest.ManageWorkflows.ManageWorkflowsScreen.WaitChoice_Choice;
import pcftest.ManageWorkflows.ManageWorkflowsScreen._msgs;
import pcftest.ManageWorkflows.ManageWorkflowsScreen.cancel;
import pcftest.ManageWorkflows.ManageWorkflowsScreen.detail;
import pcftest.ManageWorkflows.ManageWorkflowsScreen.execute;
import pcftest.ManageWorkflows.ManageWorkflowsScreen.message;
import pcftest.ManageWorkflows.ManageWorkflowsScreen.refresh;
import pcftest.ManageWorkflows.ManageWorkflows_UpLink;
import pcftest.ManageWorkflows._Paging;
import pcftest.ManageWorkflows.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/workflow/ManageWorkflows.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ManageWorkflows extends PCFLocation {
  public final static String CHECKSUM = "b1e33292bf5f250fc5de46c4a0ca2b60";
  
  public ManageWorkflows(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ManageWorkflows"));
  }
  
  public ManageWorkflowsScreen getManageWorkflowsScreen() {
    return getOrCreateProperty("ManageWorkflowsScreen", "ManageWorkflowsScreen", null, pcftest.ManageWorkflows.ManageWorkflowsScreen.class);
  }
  
  public ManageWorkflows_UpLink getManageWorkflows_UpLink() {
    return getOrCreateProperty("ManageWorkflows_UpLink", "ManageWorkflows_UpLink", null, pcftest.ManageWorkflows.ManageWorkflows_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ManageWorkflows._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ManageWorkflows.__crumb__.class);
  }
  
  public WorkflowSearch get_parent() {
    return getOrCreateProperty("_parent", pcftest.WorkflowSearch.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/workflow/ManageWorkflows.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ManageWorkflowsScreen extends PCFElement {
    public ManageWorkflowsScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getCurrentStep() {
      return getOrCreateProperty("CurrentStep", "CurrentStep", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public EditCount getEditCount() {
      return getOrCreateProperty("EditCount", "EditCount", null, pcftest.ManageWorkflows.ManageWorkflowsScreen.EditCount.class);
    }
    
    public SelectElement getForceBranch() {
      return getOrCreateProperty("ForceBranch", "ForceBranch", null, gw.smoketest.platform.web.SelectElement.class);
    }
    
    public SelectElement getInvokeTrigger() {
      return getOrCreateProperty("InvokeTrigger", "InvokeTrigger", null, gw.smoketest.platform.web.SelectElement.class);
    }
    
    public InvokeTriggerChoice_Choice getInvokeTriggerChoice_Choice() {
      return getOrCreateProperty("InvokeTriggerChoice_Choice", "InvokeTriggerChoice_Choice", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRadioButton, pcftest.ManageWorkflows.ManageWorkflowsScreen.InvokeTriggerChoice_Choice.class);
    }
    
    public ValueElement getMaxWait() {
      return getOrCreateProperty("MaxWait", "MaxWait", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getResume() {
      return getOrCreateProperty("Resume", "Resume", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ResumeChoice_Choice getResumeChoice_Choice() {
      return getOrCreateProperty("ResumeChoice_Choice", "ResumeChoice_Choice", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRadioButton, pcftest.ManageWorkflows.ManageWorkflowsScreen.ResumeChoice_Choice.class);
    }
    
    public ValueElement getSuspend() {
      return getOrCreateProperty("Suspend", "Suspend", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public SuspendChoice_Choice getSuspendChoice_Choice() {
      return getOrCreateProperty("SuspendChoice_Choice", "SuspendChoice_Choice", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRadioButton, pcftest.ManageWorkflows.ManageWorkflowsScreen.SuspendChoice_Choice.class);
    }
    
    public TimeoutChoice_Choice getTimeoutChoice_Choice() {
      return getOrCreateProperty("TimeoutChoice_Choice", "TimeoutChoice_Choice", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRadioButton, pcftest.ManageWorkflows.ManageWorkflowsScreen.TimeoutChoice_Choice.class);
    }
    
    public ValueElement getType() {
      return getOrCreateProperty("Type", "Type", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public WaitActiveWorkItem getWaitActiveWorkItem() {
      return getOrCreateProperty("WaitActiveWorkItem", "WaitActiveWorkItem", null, pcftest.ManageWorkflows.ManageWorkflowsScreen.WaitActiveWorkItem.class);
    }
    
    public WaitChoice_Choice getWaitChoice_Choice() {
      return getOrCreateProperty("WaitChoice_Choice", "WaitChoice_Choice", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRadioButton, pcftest.ManageWorkflows.ManageWorkflowsScreen.WaitChoice_Choice.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ManageWorkflows.ManageWorkflowsScreen._msgs.class);
    }
    
    public cancel getcancel() {
      return getOrCreateProperty("cancel", "cancel", null, pcftest.ManageWorkflows.ManageWorkflowsScreen.cancel.class);
    }
    
    public detail getdetail() {
      return getOrCreateProperty("detail", "detail", null, pcftest.ManageWorkflows.ManageWorkflowsScreen.detail.class);
    }
    
    public execute getexecute() {
      return getOrCreateProperty("execute", "execute", null, pcftest.ManageWorkflows.ManageWorkflowsScreen.execute.class);
    }
    
    public message getmessage() {
      return getOrCreateProperty("message", "message", null, pcftest.ManageWorkflows.ManageWorkflowsScreen.message.class);
    }
    
    public refresh getrefresh() {
      return getOrCreateProperty("refresh", "refresh", null, pcftest.ManageWorkflows.ManageWorkflowsScreen.refresh.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/workflow/ManageWorkflows.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class EditCount extends ValueElement {
      public EditCount(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/workflow/ManageWorkflows.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class InvokeTriggerChoice_Choice extends RadioButtonValueElement {
      public InvokeTriggerChoice_Choice(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/workflow/ManageWorkflows.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ResumeChoice_Choice extends RadioButtonValueElement {
      public ResumeChoice_Choice(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/workflow/ManageWorkflows.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class SuspendChoice_Choice extends RadioButtonValueElement {
      public SuspendChoice_Choice(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/workflow/ManageWorkflows.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class TimeoutChoice_Choice extends RadioButtonValueElement {
      public TimeoutChoice_Choice(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/workflow/ManageWorkflows.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class WaitActiveWorkItem extends ValueElement {
      public WaitActiveWorkItem(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/workflow/ManageWorkflows.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class WaitChoice_Choice extends RadioButtonValueElement {
      public WaitChoice_Choice(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/workflow/ManageWorkflows.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _msgs extends MessagesElement {
      public _msgs(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/workflow/ManageWorkflows.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class cancel extends ClickableActionElement {
      public cancel(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/workflow/ManageWorkflows.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class detail extends ClickableActionElement {
      public detail(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/workflow/ManageWorkflows.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class execute extends ClickableActionElement {
      public execute(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/workflow/ManageWorkflows.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class message extends ValueElement {
      public message(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/workflow/ManageWorkflows.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class refresh extends ClickableActionElement {
      public refresh(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/workflow/ManageWorkflows.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ManageWorkflows_UpLink extends ClickableActionElement {
    public ManageWorkflows_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/workflow/ManageWorkflows.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/workflow/ManageWorkflows.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}