package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElement;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.WorkflowLogEntryDetail.WorkflowLogEntryDetailScreen;
import pcftest.WorkflowLogEntryDetail.WorkflowLogEntryDetailScreen.WorkflowLogEntryDetailDV;
import pcftest.WorkflowLogEntryDetail.WorkflowLogEntryDetailScreen.WorkflowLogEntryDetail_OKButton;
import pcftest.WorkflowLogEntryDetail.WorkflowLogEntryDetailScreen._msgs;
import pcftest.WorkflowLogEntryDetail.WorkflowLogEntryDetail_UpLink;
import pcftest.WorkflowLogEntryDetail._Paging;
import pcftest.WorkflowLogEntryDetail.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/workflow/WorkflowLogEntryDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class WorkflowLogEntryDetail extends PCFLocation {
  public final static String CHECKSUM = "8daca74e7d6eb8b07bc60a8f964902eb";
  
  public WorkflowLogEntryDetail(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("WorkflowLogEntryDetail"));
  }
  
  public WorkflowLogEntryDetailScreen getWorkflowLogEntryDetailScreen() {
    return getOrCreateProperty("WorkflowLogEntryDetailScreen", "WorkflowLogEntryDetailScreen", null, pcftest.WorkflowLogEntryDetail.WorkflowLogEntryDetailScreen.class);
  }
  
  public WorkflowLogEntryDetail_UpLink getWorkflowLogEntryDetail_UpLink() {
    return getOrCreateProperty("WorkflowLogEntryDetail_UpLink", "WorkflowLogEntryDetail_UpLink", null, pcftest.WorkflowLogEntryDetail.WorkflowLogEntryDetail_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.WorkflowLogEntryDetail._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.WorkflowLogEntryDetail.__crumb__.class);
  }
  
  public WorkflowDetail get_parent() {
    return getOrCreateProperty("_parent", pcftest.WorkflowDetail.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/workflow/WorkflowLogEntryDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class WorkflowLogEntryDetailScreen extends PCFElement {
    public WorkflowLogEntryDetailScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public WorkflowLogEntryDetailDV getWorkflowLogEntryDetailDV() {
      return getOrCreateProperty("WorkflowLogEntryDetailDV", "WorkflowLogEntryDetailDV", null, pcftest.WorkflowLogEntryDetail.WorkflowLogEntryDetailScreen.WorkflowLogEntryDetailDV.class);
    }
    
    public WorkflowLogEntryDetail_OKButton getWorkflowLogEntryDetail_OKButton() {
      return getOrCreateProperty("WorkflowLogEntryDetail_OKButton", "WorkflowLogEntryDetail_OKButton", null, pcftest.WorkflowLogEntryDetail.WorkflowLogEntryDetailScreen.WorkflowLogEntryDetail_OKButton.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.WorkflowLogEntryDetail.WorkflowLogEntryDetailScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/workflow/WorkflowLogEntryDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class WorkflowLogEntryDetailDV extends DetailViewElement {
      public WorkflowLogEntryDetailDV(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ValueElement getDescription() {
        return getOrCreateProperty("Description", "Description", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getLogDate() {
        return getOrCreateProperty("LogDate", "LogDate", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getSummary() {
        return getOrCreateProperty("Summary", "Summary", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/workflow/WorkflowLogEntryDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class WorkflowLogEntryDetail_OKButton extends ClickableActionElement {
      public WorkflowLogEntryDetail_OKButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public WorkflowDetail click() {
        return clickThis(pcftest.WorkflowDetail.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/workflow/WorkflowLogEntryDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/admin/workflow/WorkflowLogEntryDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class WorkflowLogEntryDetail_UpLink extends ClickableActionElement {
    public WorkflowLogEntryDetail_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/workflow/WorkflowLogEntryDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/workflow/WorkflowLogEntryDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}