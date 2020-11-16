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
import pcftest.WorkflowStats.WorkflowStatsScreen;
import pcftest.WorkflowStats.WorkflowStatsScreen.WorkflowStatsLV_tb;
import pcftest.WorkflowStats.WorkflowStatsScreen._msgs;
import pcftest.WorkflowStats.WorkflowStats_UpLink;
import pcftest.WorkflowStats._Paging;
import pcftest.WorkflowStats.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/workflow/WorkflowStats.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class WorkflowStats extends PCFLocation {
  public final static String CHECKSUM = "4b5313e438099ce837b8fc9ac62ff7b6";
  
  public WorkflowStats(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("WorkflowStats"));
  }
  
  public WorkflowStatsScreen getWorkflowStatsScreen() {
    return getOrCreateProperty("WorkflowStatsScreen", "WorkflowStatsScreen", null, pcftest.WorkflowStats.WorkflowStatsScreen.class);
  }
  
  public WorkflowStats_UpLink getWorkflowStats_UpLink() {
    return getOrCreateProperty("WorkflowStats_UpLink", "WorkflowStats_UpLink", null, pcftest.WorkflowStats.WorkflowStats_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.WorkflowStats._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.WorkflowStats.__crumb__.class);
  }
  
  public Admin get_parent() {
    return getOrCreateProperty("_parent", pcftest.Admin.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/workflow/WorkflowStats.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class WorkflowStatsScreen extends PCFElement {
    public WorkflowStatsScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public WorkflowStatsDV getWorkflowStatsDV() {
      return getOrCreateProperty("WorkflowStatsDV", "WorkflowStatsDV", null, pcftest.WorkflowStatsDV.class);
    }
    
    public WorkflowStatsLV getWorkflowStatsLV() {
      return getOrCreateProperty("WorkflowStatsLV", "WorkflowStatsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.WorkflowStatsLV.class);
    }
    
    public WorkflowStatsLV_tb getWorkflowStatsLV_tb() {
      return getOrCreateProperty("WorkflowStatsLV_tb", "WorkflowStatsLV_tb", null, pcftest.WorkflowStats.WorkflowStatsScreen.WorkflowStatsLV_tb.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.WorkflowStats.WorkflowStatsScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/workflow/WorkflowStats.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class WorkflowStatsLV_tb extends PCFElement {
      public WorkflowStatsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/workflow/WorkflowStats.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/admin/workflow/WorkflowStats.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class WorkflowStats_UpLink extends ClickableActionElement {
    public WorkflowStats_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/workflow/WorkflowStats.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/workflow/WorkflowStats.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}