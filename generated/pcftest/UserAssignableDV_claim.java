package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.UserAssignableDV_claim.DesktopClaimsLV_tb;
import pcftest.UserAssignableDV_claim.DesktopClaimsLV_tb.UserClaimsPage_AssignButton;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/users/UserAssignableDV.claim.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class UserAssignableDV_claim extends UserAssignableDV {
  public final static String CHECKSUM = "99c30bb52331e5f3d95edbed30646bff";
  
  public UserAssignableDV_claim(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public DesktopClaimsLV getDesktopClaimsLV() {
    return getOrCreateProperty("DesktopClaimsLV", "DesktopClaimsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.DesktopClaimsLV.class);
  }
  
  public DesktopClaimsLV_tb getDesktopClaimsLV_tb() {
    return getOrCreateProperty("DesktopClaimsLV_tb", "DesktopClaimsLV_tb", null, pcftest.UserAssignableDV_claim.DesktopClaimsLV_tb.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/users/UserAssignableDV.claim.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DesktopClaimsLV_tb extends PCFElement {
    public DesktopClaimsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public UserClaimsPage_AssignButton getUserClaimsPage_AssignButton() {
      return getOrCreateProperty("UserClaimsPage_AssignButton", "UserClaimsPage_AssignButton", null, pcftest.UserAssignableDV_claim.DesktopClaimsLV_tb.UserClaimsPage_AssignButton.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/users/UserAssignableDV.claim.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class UserClaimsPage_AssignButton extends ClickableActionElement {
      public UserClaimsPage_AssignButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  
}