package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ActivityCompensableInputSet.UpdateCompensability;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/workspace/activity/ActivityCompensableInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ActivityCompensableInputSet extends PCFElement {
  public final static String CHECKSUM = "f025cd189516b353c3c3812c01ffbf1a";
  
  public ActivityCompensableInputSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public UpdateCompensability getUpdateCompensability() {
    return getOrCreateProperty("UpdateCompensability", "UpdateCompensability", null, pcftest.ActivityCompensableInputSet.UpdateCompensability.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/workspace/activity/ActivityCompensableInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class UpdateCompensability extends ValueElement {
    public UpdateCompensability(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}