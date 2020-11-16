package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.PCFElementId;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/workspace/activity/ActivitySansNoteDV.catastrophe_review.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ActivitySansNoteDV_catastrophe_review extends ActivitySansNoteDV {
  public final static String CHECKSUM = "69c7cb6902501008b933b8e560ac0bfd";
  
  public ActivitySansNoteDV_catastrophe_review(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ActivityCatastropheInputSet getActivityCatastropheInputSet() {
    return getOrCreateProperty("ActivityCatastropheInputSet", "ActivityCatastropheInputSet", null, pcftest.ActivityCatastropheInputSet.class);
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