package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.WorkQueueWorkItemsLDV.WorkItemExceptionCV;
import pcftest.WorkQueueWorkItemsLDV.WorkItemExceptionCV.WorkItemExceptionCardTab;
import pcftest.WorkQueueWorkItemsLDV.WorkItemExceptionCV.WorkItemExceptionDV;
import pcftest.WorkQueueWorkItemsLDV.WorkQueueWorkItemsLV_tb;
import pcftest.WorkQueueWorkItemsLDV.WorkQueueWorkItemsLV_tb.WorkItem_Restart;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/WorkQueueWorkItemsLDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class WorkQueueWorkItemsLDV extends PCFElement {
  public final static String CHECKSUM = "daceff8b22a72203cfc80e6d2f1c9223";
  
  public WorkQueueWorkItemsLDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public WorkItemExceptionCV getWorkItemExceptionCV() {
    return getOrCreateProperty("WorkItemExceptionCV", "WorkItemExceptionCV", null, pcftest.WorkQueueWorkItemsLDV.WorkItemExceptionCV.class);
  }
  
  public WorkQueueWorkItemsLV_ActivityEsc getWorkQueueWorkItemsLV_ActivityEsc() {
    return getOrCreateProperty("WorkQueueWorkItemsLV_ActivityEsc", "WorkQueueWorkItemsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.WorkQueueWorkItemsLV_ActivityEsc.class);
  }
  
  public WorkQueueWorkItemsLV_Archive getWorkQueueWorkItemsLV_Archive() {
    return getOrCreateProperty("WorkQueueWorkItemsLV_Archive", "WorkQueueWorkItemsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.WorkQueueWorkItemsLV_Archive.class);
  }
  
  public WorkQueueWorkItemsLV_default getWorkQueueWorkItemsLV_default() {
    return getOrCreateProperty("WorkQueueWorkItemsLV_default", "WorkQueueWorkItemsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.WorkQueueWorkItemsLV_default.class);
  }
  
  public WorkQueueWorkItemsLV_tb getWorkQueueWorkItemsLV_tb() {
    return getOrCreateProperty("WorkQueueWorkItemsLV_tb", "WorkQueueWorkItemsLV_tb", null, pcftest.WorkQueueWorkItemsLDV.WorkQueueWorkItemsLV_tb.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/WorkQueueWorkItemsLDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class WorkItemExceptionCV extends PCFElement {
    public WorkItemExceptionCV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public WorkItemExceptionCardTab getWorkItemExceptionCardTab() {
      return getOrCreateProperty("WorkItemExceptionCardTab", "WorkItemExceptionCardTab", null, pcftest.WorkQueueWorkItemsLDV.WorkItemExceptionCV.WorkItemExceptionCardTab.class);
    }
    
    public WorkItemExceptionDV getWorkItemExceptionDV() {
      return getOrCreateProperty("WorkItemExceptionDV", "WorkItemExceptionDV", null, pcftest.WorkQueueWorkItemsLDV.WorkItemExceptionCV.WorkItemExceptionDV.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/WorkQueueWorkItemsLDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class WorkItemExceptionCardTab extends ClickableActionElement {
      public WorkItemExceptionCardTab(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/WorkQueueWorkItemsLDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class WorkItemExceptionDV extends DetailViewElement {
      public WorkItemExceptionDV(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ValueElement getException() {
        return getOrCreateProperty("Exception", "Exception", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/WorkQueueWorkItemsLDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class WorkQueueWorkItemsLV_tb extends PCFElement {
    public WorkQueueWorkItemsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public WorkItem_Restart getWorkItem_Restart() {
      return getOrCreateProperty("WorkItem_Restart", "WorkItem_Restart", null, pcftest.WorkQueueWorkItemsLDV.WorkQueueWorkItemsLV_tb.WorkItem_Restart.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/WorkQueueWorkItemsLDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class WorkItem_Restart extends ClickableActionElement {
      public WorkItem_Restart(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  
}