package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.PCFElementId;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/workspace/activity/ActivitySansNoteDV.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ActivitySansNoteDV_default extends ActivitySansNoteDV {
  public final static String CHECKSUM = "72076d60d63d8c71da2390748ff01768";
  
  public ActivitySansNoteDV_default(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ActivityDetailsInputSet getActivityDetailsInputSet() {
    return getOrCreateProperty("ActivityDetailsInputSet", "ActivityDetailsInputSet", null, pcftest.ActivityDetailsInputSet.class);
  }
  
  public ActivityDocumentInputSet getActivityDocumentInputSet() {
    return getOrCreateProperty("ActivityDocumentInputSet", "ActivityDocumentInputSet", null, pcftest.ActivityDocumentInputSet.class);
  }
  
  public ActivityOwnerInputSet getActivityOwnerInputSet() {
    return getOrCreateProperty("ActivityOwnerInputSet", "ActivityOwnerInputSet", null, pcftest.ActivityOwnerInputSet.class);
  }
  
  public ActivityTrackingInputSet getActivityTrackingInputSet() {
    return getOrCreateProperty("ActivityTrackingInputSet", "ActivityTrackingInputSet", null, pcftest.ActivityTrackingInputSet.class);
  }
  
  
}