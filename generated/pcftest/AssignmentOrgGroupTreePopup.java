package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.TreeViewElement;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.AssignmentOrgGroupTreePopup.AssignmentOrgGroupTreePopupScreen;
import pcftest.AssignmentOrgGroupTreePopup.AssignmentOrgGroupTreePopupScreen.OrganizationGroupTreePopup;
import pcftest.AssignmentOrgGroupTreePopup.AssignmentOrgGroupTreePopupScreen.OrganizationGroupTreePopup.OrganizationGroupTreePopupPicker;
import pcftest.AssignmentOrgGroupTreePopup.AssignmentOrgGroupTreePopupScreen._msgs;
import pcftest.AssignmentOrgGroupTreePopup.AssignmentOrgGroupTreePopup_UpLink;
import pcftest.AssignmentOrgGroupTreePopup._Paging;
import pcftest.AssignmentOrgGroupTreePopup.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/shared/assignment/AssignmentOrgGroupTreePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class AssignmentOrgGroupTreePopup extends PCFLocation {
  public final static String CHECKSUM = "eb9597be3a8b3f99f2a1ca0bbd6f8427";
  
  public AssignmentOrgGroupTreePopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("AssignmentOrgGroupTreePopup"));
  }
  
  public AssignmentOrgGroupTreePopupScreen getAssignmentOrgGroupTreePopupScreen() {
    return getOrCreateProperty("AssignmentOrgGroupTreePopupScreen", "AssignmentOrgGroupTreePopupScreen", null, pcftest.AssignmentOrgGroupTreePopup.AssignmentOrgGroupTreePopupScreen.class);
  }
  
  public AssignmentOrgGroupTreePopup_UpLink getAssignmentOrgGroupTreePopup_UpLink() {
    return getOrCreateProperty("AssignmentOrgGroupTreePopup_UpLink", "AssignmentOrgGroupTreePopup_UpLink", null, pcftest.AssignmentOrgGroupTreePopup.AssignmentOrgGroupTreePopup_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.AssignmentOrgGroupTreePopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.AssignmentOrgGroupTreePopup.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/assignment/AssignmentOrgGroupTreePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AssignmentOrgGroupTreePopupScreen extends PCFElement {
    public AssignmentOrgGroupTreePopupScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OrganizationGroupTreePopup getOrganizationGroupTreePopup() {
      return getOrCreateProperty("OrganizationGroupTreePopup", "OrganizationGroupTreePopup", null, pcftest.AssignmentOrgGroupTreePopup.AssignmentOrgGroupTreePopupScreen.OrganizationGroupTreePopup.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.AssignmentOrgGroupTreePopup.AssignmentOrgGroupTreePopupScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/assignment/AssignmentOrgGroupTreePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class OrganizationGroupTreePopup extends PCFElement {
      public OrganizationGroupTreePopup(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OrganizationGroupTreePopupPicker getOrganizationGroupTreePopupPicker() {
        return getOrCreateProperty("OrganizationGroupTreePopupPicker", "OrganizationGroupTreePopupPicker", null, pcftest.AssignmentOrgGroupTreePopup.AssignmentOrgGroupTreePopupScreen.OrganizationGroupTreePopup.OrganizationGroupTreePopupPicker.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/shared/assignment/AssignmentOrgGroupTreePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class OrganizationGroupTreePopupPicker extends TreeViewElement {
        public OrganizationGroupTreePopupPicker(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/assignment/AssignmentOrgGroupTreePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/shared/assignment/AssignmentOrgGroupTreePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AssignmentOrgGroupTreePopup_UpLink extends ClickableActionElement {
    public AssignmentOrgGroupTreePopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/assignment/AssignmentOrgGroupTreePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/assignment/AssignmentOrgGroupTreePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}