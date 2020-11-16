package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.AssignClaimsPopup.AssignClaimsPopup_UpLink;
import pcftest.AssignClaimsPopup._Paging;
import pcftest.AssignClaimsPopup.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/shared/assignment/AssignClaimsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class AssignClaimsPopup extends PCFLocation {
  public final static String CHECKSUM = "39317c05794b767ef20516077a057a46";
  
  public AssignClaimsPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("AssignClaimsPopup"));
  }
  
  public AssignClaimsPopup_UpLink getAssignClaimsPopup_UpLink() {
    return getOrCreateProperty("AssignClaimsPopup_UpLink", "AssignClaimsPopup_UpLink", null, pcftest.AssignClaimsPopup.AssignClaimsPopup_UpLink.class);
  }
  
  public AssignmentPopupScreen getAssignmentPopupScreen() {
    return getOrCreateProperty("AssignmentPopupScreen", "AssignmentPopupScreen", null, pcftest.AssignmentPopupScreen.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.AssignClaimsPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.AssignClaimsPopup.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/assignment/AssignClaimsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AssignClaimsPopup_UpLink extends ClickableActionElement {
    public AssignClaimsPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/assignment/AssignClaimsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/assignment/AssignClaimsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}