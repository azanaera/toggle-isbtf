package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/workspace/activity/ActivityTrackingInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ActivityTrackingInputSet extends PCFElement {
  public final static String CHECKSUM = "ddea4a65dda7d6d905e87a8249b445df";
  
  public ActivityTrackingInputSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getCloseUser() {
    return getOrCreateProperty("CloseUser", "CloseUser", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public DateElement getCompleteDate() {
    return getOrCreateProperty("CompleteDate", "CompleteDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public BooleanValueElement getRecurring() {
    return getOrCreateProperty("Recurring", "Recurring", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  
}