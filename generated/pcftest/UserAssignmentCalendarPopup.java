package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.UserAssignmentCalendarPopup.UserAssignmentCalendarPopup_UpLink;
import pcftest.UserAssignmentCalendarPopup._Paging;
import pcftest.UserAssignmentCalendarPopup.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/shared/assignment/UserAssignmentCalendarPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class UserAssignmentCalendarPopup extends PCFLocation {
  public final static String CHECKSUM = "5ffe77137d19e4aac606416bc50c8ade";
  
  public UserAssignmentCalendarPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("UserAssignmentCalendarPopup"));
  }
  
  public UserAssignmentCalendarPopup_UpLink getUserAssignmentCalendarPopup_UpLink() {
    return getOrCreateProperty("UserAssignmentCalendarPopup_UpLink", "UserAssignmentCalendarPopup_UpLink", null, pcftest.UserAssignmentCalendarPopup.UserAssignmentCalendarPopup_UpLink.class);
  }
  
  public UserAssignmentCalendarScreen getUserAssignmentCalendarScreen() {
    return getOrCreateProperty("UserAssignmentCalendarScreen", "UserAssignmentCalendarScreen", null, pcftest.UserAssignmentCalendarScreen.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.UserAssignmentCalendarPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.UserAssignmentCalendarPopup.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/assignment/UserAssignmentCalendarPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class UserAssignmentCalendarPopup_UpLink extends ClickableActionElement {
    public UserAssignmentCalendarPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/assignment/UserAssignmentCalendarPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/assignment/UserAssignmentCalendarPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}