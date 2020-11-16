package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.AssignmentPopupScreen.AssignmentGroupLV_tb;
import pcftest.AssignmentPopupScreen.AssignmentPopupScreen_CancelButton;
import pcftest.AssignmentPopupScreen.AssignmentQueueLV_tb;
import pcftest.AssignmentPopupScreen.AssignmentUserLV_tb;
import pcftest.AssignmentPopupScreen.AssignmentUserLV_tb.RetrieveRequested;
import pcftest.AssignmentPopupScreen.FailedAssignmentsLV_tb;
import pcftest.AssignmentPopupScreen._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/shared/assignment/AssignmentPopupScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class AssignmentPopupScreen extends PCFElement {
  public final static String CHECKSUM = "b20fefb51be2d12a1df5e4e5fc306b83";
  
  public AssignmentPopupScreen(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public AssignmentGroupLV getAssignmentGroupLV() {
    return getOrCreateProperty("AssignmentGroupLV", "AssignmentGroupLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.AssignmentGroupLV.class);
  }
  
  public AssignmentGroupLV_tb getAssignmentGroupLV_tb() {
    return getOrCreateProperty("AssignmentGroupLV_tb", "AssignmentGroupLV_tb", null, pcftest.AssignmentPopupScreen.AssignmentGroupLV_tb.class);
  }
  
  public AssignmentPopupDV getAssignmentPopupDV() {
    return getOrCreateProperty("AssignmentPopupDV", "AssignmentPopupDV", null, pcftest.AssignmentPopupDV.class);
  }
  
  public AssignmentPopupScreen_CancelButton getAssignmentPopupScreen_CancelButton() {
    return getOrCreateProperty("AssignmentPopupScreen_CancelButton", "AssignmentPopupScreen_CancelButton", null, pcftest.AssignmentPopupScreen.AssignmentPopupScreen_CancelButton.class);
  }
  
  public AssignmentQueueLV getAssignmentQueueLV() {
    return getOrCreateProperty("AssignmentQueueLV", "AssignmentQueueLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.AssignmentQueueLV.class);
  }
  
  public AssignmentQueueLV_tb getAssignmentQueueLV_tb() {
    return getOrCreateProperty("AssignmentQueueLV_tb", "AssignmentQueueLV_tb", null, pcftest.AssignmentPopupScreen.AssignmentQueueLV_tb.class);
  }
  
  public AssignmentSearchDV getAssignmentSearchDV() {
    return getOrCreateProperty("AssignmentSearchDV", "AssignmentSearchDV", null, pcftest.AssignmentSearchDV.class);
  }
  
  public AssignmentUserLV getAssignmentUserLV() {
    return getOrCreateProperty("AssignmentUserLV", "AssignmentUserLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.AssignmentUserLV.class);
  }
  
  public AssignmentUserLV_tb getAssignmentUserLV_tb() {
    return getOrCreateProperty("AssignmentUserLV_tb", "AssignmentUserLV_tb", null, pcftest.AssignmentPopupScreen.AssignmentUserLV_tb.class);
  }
  
  public FailedAssignmentsLV_Activity getFailedAssignmentsLV_Activity() {
    return getOrCreateProperty("FailedAssignmentsLV_Activity", "FailedAssignmentsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.FailedAssignmentsLV_Activity.class);
  }
  
  public FailedAssignmentsLV_Claim getFailedAssignmentsLV_Claim() {
    return getOrCreateProperty("FailedAssignmentsLV_Claim", "FailedAssignmentsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.FailedAssignmentsLV_Claim.class);
  }
  
  public FailedAssignmentsLV_Exposure getFailedAssignmentsLV_Exposure() {
    return getOrCreateProperty("FailedAssignmentsLV_Exposure", "FailedAssignmentsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.FailedAssignmentsLV_Exposure.class);
  }
  
  public FailedAssignmentsLV_Matter getFailedAssignmentsLV_Matter() {
    return getOrCreateProperty("FailedAssignmentsLV_Matter", "FailedAssignmentsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.FailedAssignmentsLV_Matter.class);
  }
  
  public FailedAssignmentsLV_ServiceRequest getFailedAssignmentsLV_ServiceRequest() {
    return getOrCreateProperty("FailedAssignmentsLV_ServiceRequest", "FailedAssignmentsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.FailedAssignmentsLV_ServiceRequest.class);
  }
  
  public FailedAssignmentsLV_Subrogation getFailedAssignmentsLV_Subrogation() {
    return getOrCreateProperty("FailedAssignmentsLV_Subrogation", "FailedAssignmentsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.FailedAssignmentsLV_Subrogation.class);
  }
  
  public FailedAssignmentsLV_default getFailedAssignmentsLV_default() {
    return getOrCreateProperty("FailedAssignmentsLV_default", "FailedAssignmentsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.FailedAssignmentsLV_default.class);
  }
  
  public FailedAssignmentsLV_tb getFailedAssignmentsLV_tb() {
    return getOrCreateProperty("FailedAssignmentsLV_tb", "FailedAssignmentsLV_tb", null, pcftest.AssignmentPopupScreen.FailedAssignmentsLV_tb.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.AssignmentPopupScreen._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/assignment/AssignmentPopupScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AssignmentGroupLV_tb extends PCFElement {
    public AssignmentGroupLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/assignment/AssignmentPopupScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AssignmentPopupScreen_CancelButton extends ClickableActionElement {
    public AssignmentPopupScreen_CancelButton(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/assignment/AssignmentPopupScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AssignmentQueueLV_tb extends PCFElement {
    public AssignmentQueueLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/assignment/AssignmentPopupScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AssignmentUserLV_tb extends PCFElement {
    public AssignmentUserLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public RetrieveRequested getRetrieveRequested() {
      return getOrCreateProperty("RetrieveRequested", "RetrieveRequested", null, pcftest.AssignmentPopupScreen.AssignmentUserLV_tb.RetrieveRequested.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/assignment/AssignmentPopupScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class RetrieveRequested extends ClickableActionElement {
      public RetrieveRequested(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/assignment/AssignmentPopupScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FailedAssignmentsLV_tb extends PCFElement {
    public FailedAssignmentsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/assignment/AssignmentPopupScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}