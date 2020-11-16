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
import pcftest.AssigneePickerPopup.AssigneePickerPopup_UpLink;
import pcftest.AssigneePickerPopup.AssigneePickerScreen;
import pcftest.AssigneePickerPopup.AssigneePickerScreen.AssignmentGroupLV_tb;
import pcftest.AssigneePickerPopup.AssigneePickerScreen.AssignmentQueueLV_tb;
import pcftest.AssigneePickerPopup.AssigneePickerScreen.AssignmentUserLV_tb;
import pcftest.AssigneePickerPopup.AssigneePickerScreen.AssignmentUserLV_tb.RetrieveRequested;
import pcftest.AssigneePickerPopup.AssigneePickerScreen._msgs;
import pcftest.AssigneePickerPopup._Paging;
import pcftest.AssigneePickerPopup.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/shared/assignment/AssigneePickerPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class AssigneePickerPopup extends PCFLocation {
  public final static String CHECKSUM = "d2a3a67ed4c6c3ba19151c7b349456cb";
  
  public AssigneePickerPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("AssigneePickerPopup"));
  }
  
  public AssigneePickerPopup_UpLink getAssigneePickerPopup_UpLink() {
    return getOrCreateProperty("AssigneePickerPopup_UpLink", "AssigneePickerPopup_UpLink", null, pcftest.AssigneePickerPopup.AssigneePickerPopup_UpLink.class);
  }
  
  public AssigneePickerScreen getAssigneePickerScreen() {
    return getOrCreateProperty("AssigneePickerScreen", "AssigneePickerScreen", null, pcftest.AssigneePickerPopup.AssigneePickerScreen.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.AssigneePickerPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.AssigneePickerPopup.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/assignment/AssigneePickerPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AssigneePickerPopup_UpLink extends ClickableActionElement {
    public AssigneePickerPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/assignment/AssigneePickerPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AssigneePickerScreen extends PCFElement {
    public AssigneePickerScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public AssignmentGroupLV getAssignmentGroupLV() {
      return getOrCreateProperty("AssignmentGroupLV", "AssignmentGroupLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.AssignmentGroupLV.class);
    }
    
    public AssignmentGroupLV_tb getAssignmentGroupLV_tb() {
      return getOrCreateProperty("AssignmentGroupLV_tb", "AssignmentGroupLV_tb", null, pcftest.AssigneePickerPopup.AssigneePickerScreen.AssignmentGroupLV_tb.class);
    }
    
    public AssignmentQueueLV getAssignmentQueueLV() {
      return getOrCreateProperty("AssignmentQueueLV", "AssignmentQueueLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.AssignmentQueueLV.class);
    }
    
    public AssignmentQueueLV_tb getAssignmentQueueLV_tb() {
      return getOrCreateProperty("AssignmentQueueLV_tb", "AssignmentQueueLV_tb", null, pcftest.AssigneePickerPopup.AssigneePickerScreen.AssignmentQueueLV_tb.class);
    }
    
    public AssignmentSearchDV getAssignmentSearchDV() {
      return getOrCreateProperty("AssignmentSearchDV", "AssignmentSearchDV", null, pcftest.AssignmentSearchDV.class);
    }
    
    public AssignmentUserLV getAssignmentUserLV() {
      return getOrCreateProperty("AssignmentUserLV", "AssignmentUserLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.AssignmentUserLV.class);
    }
    
    public AssignmentUserLV_tb getAssignmentUserLV_tb() {
      return getOrCreateProperty("AssignmentUserLV_tb", "AssignmentUserLV_tb", null, pcftest.AssigneePickerPopup.AssigneePickerScreen.AssignmentUserLV_tb.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.AssigneePickerPopup.AssigneePickerScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/assignment/AssigneePickerPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class AssignmentGroupLV_tb extends PCFElement {
      public AssignmentGroupLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/assignment/AssigneePickerPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class AssignmentQueueLV_tb extends PCFElement {
      public AssignmentQueueLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/assignment/AssigneePickerPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class AssignmentUserLV_tb extends PCFElement {
      public AssignmentUserLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public RetrieveRequested getRetrieveRequested() {
        return getOrCreateProperty("RetrieveRequested", "RetrieveRequested", null, pcftest.AssigneePickerPopup.AssigneePickerScreen.AssignmentUserLV_tb.RetrieveRequested.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/shared/assignment/AssigneePickerPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/shared/assignment/AssigneePickerPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/shared/assignment/AssigneePickerPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/assignment/AssigneePickerPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}