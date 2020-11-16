package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.UserAssignableDV_matter.UserMattersLV_tb;
import pcftest.UserAssignableDV_matter.UserMattersLV_tb.UserMattersPage_AssignButton;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/users/UserAssignableDV.matter.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class UserAssignableDV_matter extends UserAssignableDV {
  public final static String CHECKSUM = "fc32326ac27871aca3e830e0328464a6";
  
  public UserAssignableDV_matter(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public UserMattersLV getUserMattersLV() {
    return getOrCreateProperty("UserMattersLV", "UserMattersLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.UserMattersLV.class);
  }
  
  public UserMattersLV_tb getUserMattersLV_tb() {
    return getOrCreateProperty("UserMattersLV_tb", "UserMattersLV_tb", null, pcftest.UserAssignableDV_matter.UserMattersLV_tb.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/users/UserAssignableDV.matter.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class UserMattersLV_tb extends PCFElement {
    public UserMattersLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public UserMattersPage_AssignButton getUserMattersPage_AssignButton() {
      return getOrCreateProperty("UserMattersPage_AssignButton", "UserMattersPage_AssignButton", null, pcftest.UserAssignableDV_matter.UserMattersLV_tb.UserMattersPage_AssignButton.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/users/UserAssignableDV.matter.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class UserMattersPage_AssignButton extends ClickableActionElement {
      public UserMattersPage_AssignButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  
}