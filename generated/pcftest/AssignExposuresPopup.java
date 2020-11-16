package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.AssignExposuresPopup.AssignExposuresPopup_UpLink;
import pcftest.AssignExposuresPopup._Paging;
import pcftest.AssignExposuresPopup.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/shared/assignment/AssignExposuresPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class AssignExposuresPopup extends PCFLocation {
  public final static String CHECKSUM = "18ad3e320b5df5d241ae3a4eb5591a9f";
  
  public AssignExposuresPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("AssignExposuresPopup"));
  }
  
  public AssignExposuresPopup_UpLink getAssignExposuresPopup_UpLink() {
    return getOrCreateProperty("AssignExposuresPopup_UpLink", "AssignExposuresPopup_UpLink", null, pcftest.AssignExposuresPopup.AssignExposuresPopup_UpLink.class);
  }
  
  public AssignmentPopupScreen getAssignmentPopupScreen() {
    return getOrCreateProperty("AssignmentPopupScreen", "AssignmentPopupScreen", null, pcftest.AssignmentPopupScreen.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.AssignExposuresPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.AssignExposuresPopup.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/assignment/AssignExposuresPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AssignExposuresPopup_UpLink extends ClickableActionElement {
    public AssignExposuresPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/assignment/AssignExposuresPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/assignment/AssignExposuresPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}