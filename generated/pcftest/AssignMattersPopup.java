package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.AssignMattersPopup.AssignMattersPopup_UpLink;
import pcftest.AssignMattersPopup._Paging;
import pcftest.AssignMattersPopup.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/litigation/AssignMattersPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class AssignMattersPopup extends PCFLocation {
  public final static String CHECKSUM = "cf75931998005b7f403d8fb3ef91a0d5";
  
  public AssignMattersPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("AssignMattersPopup"));
  }
  
  public AssignMattersPopup_UpLink getAssignMattersPopup_UpLink() {
    return getOrCreateProperty("AssignMattersPopup_UpLink", "AssignMattersPopup_UpLink", null, pcftest.AssignMattersPopup.AssignMattersPopup_UpLink.class);
  }
  
  public AssignmentPopupScreen getAssignmentPopupScreen() {
    return getOrCreateProperty("AssignmentPopupScreen", "AssignmentPopupScreen", null, pcftest.AssignmentPopupScreen.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.AssignMattersPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.AssignMattersPopup.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/litigation/AssignMattersPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AssignMattersPopup_UpLink extends ClickableActionElement {
    public AssignMattersPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/litigation/AssignMattersPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/litigation/AssignMattersPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}