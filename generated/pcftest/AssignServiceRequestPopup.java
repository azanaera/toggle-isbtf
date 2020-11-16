package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.AssignServiceRequestPopup.AssignServiceRequestPopup_UpLink;
import pcftest.AssignServiceRequestPopup._Paging;
import pcftest.AssignServiceRequestPopup.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/shared/assignment/AssignServiceRequestPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class AssignServiceRequestPopup extends PCFLocation {
  public final static String CHECKSUM = "261d64f35dd5d749b2de7a0ea4e0a0f8";
  
  public AssignServiceRequestPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("AssignServiceRequestPopup"));
  }
  
  public AssignServiceRequestPopup_UpLink getAssignServiceRequestPopup_UpLink() {
    return getOrCreateProperty("AssignServiceRequestPopup_UpLink", "AssignServiceRequestPopup_UpLink", null, pcftest.AssignServiceRequestPopup.AssignServiceRequestPopup_UpLink.class);
  }
  
  public AssignmentPopupScreen getAssignmentPopupScreen() {
    return getOrCreateProperty("AssignmentPopupScreen", "AssignmentPopupScreen", null, pcftest.AssignmentPopupScreen.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.AssignServiceRequestPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.AssignServiceRequestPopup.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/assignment/AssignServiceRequestPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AssignServiceRequestPopup_UpLink extends ClickableActionElement {
    public AssignServiceRequestPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/assignment/AssignServiceRequestPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/assignment/AssignServiceRequestPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}