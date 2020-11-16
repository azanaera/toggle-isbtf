package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.UserAssignmentCalendarScreen._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/shared/assignment/UserAssignmentCalendarScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class UserAssignmentCalendarScreen extends PCFElement {
  public final static String CHECKSUM = "2e6d2254244a6d319b8b9f58fabd974e";
  
  public UserAssignmentCalendarScreen(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.UserAssignmentCalendarScreen._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/assignment/UserAssignmentCalendarScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}