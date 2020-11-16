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
import pcftest.DesktopAwaitingAssignment.DesktopAwaitingAssignmentScreen;
import pcftest.DesktopAwaitingAssignment.DesktopAwaitingAssignmentScreen.DesktopAwaitingAssignment_AssignButton;
import pcftest.DesktopAwaitingAssignment.DesktopAwaitingAssignmentScreen.DesktopAwaitingAssignment_PrintButton;
import pcftest.DesktopAwaitingAssignment.DesktopAwaitingAssignmentScreen.DesktopAwaitingAssignment_ReassignButton;
import pcftest.DesktopAwaitingAssignment.DesktopAwaitingAssignmentScreen._msgs;
import pcftest.DesktopAwaitingAssignment.DesktopAwaitingAssignment_UpLink;
import pcftest.DesktopAwaitingAssignment._Paging;
import pcftest.DesktopAwaitingAssignment.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/desktop/pendingassignment/DesktopAwaitingAssignment.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class DesktopAwaitingAssignment extends PCFLocation {
  public final static String CHECKSUM = "dce995547d581fcb6bd909ee2d87ec51";
  
  public DesktopAwaitingAssignment(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("DesktopAwaitingAssignment"));
  }
  
  public DesktopAwaitingAssignmentScreen getDesktopAwaitingAssignmentScreen() {
    return getOrCreateProperty("DesktopAwaitingAssignmentScreen", "DesktopAwaitingAssignmentScreen", null, pcftest.DesktopAwaitingAssignment.DesktopAwaitingAssignmentScreen.class);
  }
  
  public DesktopAwaitingAssignment_UpLink getDesktopAwaitingAssignment_UpLink() {
    return getOrCreateProperty("DesktopAwaitingAssignment_UpLink", "DesktopAwaitingAssignment_UpLink", null, pcftest.DesktopAwaitingAssignment.DesktopAwaitingAssignment_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.DesktopAwaitingAssignment._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.DesktopAwaitingAssignment.__crumb__.class);
  }
  
  public Desktop get_parent() {
    return getOrCreateProperty("_parent", pcftest.Desktop.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/desktop/pendingassignment/DesktopAwaitingAssignment.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DesktopAwaitingAssignmentScreen extends PCFElement {
    public DesktopAwaitingAssignmentScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public DesktopAwaitingAssignmentLV getDesktopAwaitingAssignmentLV() {
      return getOrCreateProperty("DesktopAwaitingAssignmentLV", "DesktopAwaitingAssignmentLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.DesktopAwaitingAssignmentLV.class);
    }
    
    public DesktopAwaitingAssignment_AssignButton getDesktopAwaitingAssignment_AssignButton() {
      return getOrCreateProperty("DesktopAwaitingAssignment_AssignButton", "DesktopAwaitingAssignment_AssignButton", null, pcftest.DesktopAwaitingAssignment.DesktopAwaitingAssignmentScreen.DesktopAwaitingAssignment_AssignButton.class);
    }
    
    public DesktopAwaitingAssignment_PrintButton getDesktopAwaitingAssignment_PrintButton() {
      return getOrCreateProperty("DesktopAwaitingAssignment_PrintButton", "DesktopAwaitingAssignment_PrintButton", null, pcftest.DesktopAwaitingAssignment.DesktopAwaitingAssignmentScreen.DesktopAwaitingAssignment_PrintButton.class);
    }
    
    public DesktopAwaitingAssignment_ReassignButton getDesktopAwaitingAssignment_ReassignButton() {
      return getOrCreateProperty("DesktopAwaitingAssignment_ReassignButton", "DesktopAwaitingAssignment_ReassignButton", null, pcftest.DesktopAwaitingAssignment.DesktopAwaitingAssignmentScreen.DesktopAwaitingAssignment_ReassignButton.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.DesktopAwaitingAssignment.DesktopAwaitingAssignmentScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/desktop/pendingassignment/DesktopAwaitingAssignment.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class DesktopAwaitingAssignment_AssignButton extends ClickableActionElement {
      public DesktopAwaitingAssignment_AssignButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/desktop/pendingassignment/DesktopAwaitingAssignment.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class DesktopAwaitingAssignment_PrintButton extends ClickableActionElement {
      public DesktopAwaitingAssignment_PrintButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/desktop/pendingassignment/DesktopAwaitingAssignment.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class DesktopAwaitingAssignment_ReassignButton extends ClickableActionElement {
      public DesktopAwaitingAssignment_ReassignButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/desktop/pendingassignment/DesktopAwaitingAssignment.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/desktop/pendingassignment/DesktopAwaitingAssignment.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DesktopAwaitingAssignment_UpLink extends ClickableActionElement {
    public DesktopAwaitingAssignment_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/desktop/pendingassignment/DesktopAwaitingAssignment.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/desktop/pendingassignment/DesktopAwaitingAssignment.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}