package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.UserAssignableDV_exposure.DesktopExposuresLV_tb;
import pcftest.UserAssignableDV_exposure.DesktopExposuresLV_tb.UserExposuresPage_AssignButton;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/users/UserAssignableDV.exposure.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class UserAssignableDV_exposure extends UserAssignableDV {
  public final static String CHECKSUM = "1617851f973746d9b44f6c7cf3b11993";
  
  public UserAssignableDV_exposure(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public DesktopExposuresLV getDesktopExposuresLV() {
    return getOrCreateProperty("DesktopExposuresLV", "DesktopExposuresLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.DesktopExposuresLV.class);
  }
  
  public DesktopExposuresLV_tb getDesktopExposuresLV_tb() {
    return getOrCreateProperty("DesktopExposuresLV_tb", "DesktopExposuresLV_tb", null, pcftest.UserAssignableDV_exposure.DesktopExposuresLV_tb.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/users/UserAssignableDV.exposure.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DesktopExposuresLV_tb extends PCFElement {
    public DesktopExposuresLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public UserExposuresPage_AssignButton getUserExposuresPage_AssignButton() {
      return getOrCreateProperty("UserExposuresPage_AssignButton", "UserExposuresPage_AssignButton", null, pcftest.UserAssignableDV_exposure.DesktopExposuresLV_tb.UserExposuresPage_AssignButton.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/users/UserAssignableDV.exposure.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class UserExposuresPage_AssignButton extends ClickableActionElement {
      public UserExposuresPage_AssignButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  
}