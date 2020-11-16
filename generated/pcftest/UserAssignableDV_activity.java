package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.UserAssignableDV_activity.DesktopActivitiesLV_tb;
import pcftest.UserAssignableDV_activity.DesktopActivitiesLV_tb.UserActivitiesPage_AssignButton;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/users/UserAssignableDV.activity.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class UserAssignableDV_activity extends UserAssignableDV {
  public final static String CHECKSUM = "58835ba9e957809f36fcb0977c9f156e";
  
  public UserAssignableDV_activity(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public DesktopActivitiesLV getDesktopActivitiesLV() {
    return getOrCreateProperty("DesktopActivitiesLV", "DesktopActivitiesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.DesktopActivitiesLV.class);
  }
  
  public DesktopActivitiesLV_tb getDesktopActivitiesLV_tb() {
    return getOrCreateProperty("DesktopActivitiesLV_tb", "DesktopActivitiesLV_tb", null, pcftest.UserAssignableDV_activity.DesktopActivitiesLV_tb.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/users/UserAssignableDV.activity.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DesktopActivitiesLV_tb extends PCFElement {
    public DesktopActivitiesLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public UserActivitiesPage_AssignButton getUserActivitiesPage_AssignButton() {
      return getOrCreateProperty("UserActivitiesPage_AssignButton", "UserActivitiesPage_AssignButton", null, pcftest.UserAssignableDV_activity.DesktopActivitiesLV_tb.UserActivitiesPage_AssignButton.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/users/UserAssignableDV.activity.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class UserActivitiesPage_AssignButton extends ClickableActionElement {
      public UserActivitiesPage_AssignButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  
}