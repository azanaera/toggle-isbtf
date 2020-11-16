package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.AssignSubrogationPopup.AssignSubrogationPopup_UpLink;
import pcftest.AssignSubrogationPopup._Paging;
import pcftest.AssignSubrogationPopup.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/shared/assignment/AssignSubrogationPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class AssignSubrogationPopup extends PCFLocation {
  public final static String CHECKSUM = "82339bdbc851d3eb9aed4b4807967798";
  
  public AssignSubrogationPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("AssignSubrogationPopup"));
  }
  
  public AssignSubrogationPopup_UpLink getAssignSubrogationPopup_UpLink() {
    return getOrCreateProperty("AssignSubrogationPopup_UpLink", "AssignSubrogationPopup_UpLink", null, pcftest.AssignSubrogationPopup.AssignSubrogationPopup_UpLink.class);
  }
  
  public AssignmentPopupScreen getAssignmentPopupScreen() {
    return getOrCreateProperty("AssignmentPopupScreen", "AssignmentPopupScreen", null, pcftest.AssignmentPopupScreen.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.AssignSubrogationPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.AssignSubrogationPopup.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/assignment/AssignSubrogationPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AssignSubrogationPopup_UpLink extends ClickableActionElement {
    public AssignSubrogationPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/assignment/AssignSubrogationPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/assignment/AssignSubrogationPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}