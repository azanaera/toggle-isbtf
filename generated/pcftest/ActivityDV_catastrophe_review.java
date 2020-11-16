package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.PCFElementId;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/workspace/activity/ActivityDV.catastrophe_review.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ActivityDV_catastrophe_review extends ActivityDV {
  public final static String CHECKSUM = "930be465eb77fd8e62f5733f94150467";
  
  public ActivityDV_catastrophe_review(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ActivityBulkInvoiceWarningInputSet getActivityBulkInvoiceWarningInputSet() {
    return getOrCreateProperty("ActivityBulkInvoiceWarningInputSet", "ActivityBulkInvoiceWarningInputSet", null, pcftest.ActivityBulkInvoiceWarningInputSet.class);
  }
  
  public ActivityCatastropheInputSet getActivityCatastropheInputSet() {
    return getOrCreateProperty("ActivityCatastropheInputSet", "ActivityCatastropheInputSet", null, pcftest.ActivityCatastropheInputSet.class);
  }
  
  public ActivityCompensableInputSet getActivityCompensableInputSet() {
    return getOrCreateProperty("ActivityCompensableInputSet", "ActivityCompensableInputSet", null, pcftest.ActivityCompensableInputSet.class);
  }
  
  public ActivityDetailsInputSet getActivityDetailsInputSet() {
    return getOrCreateProperty("ActivityDetailsInputSet", "ActivityDetailsInputSet", null, pcftest.ActivityDetailsInputSet.class);
  }
  
  public ActivityDocumentInputSet getActivityDocumentInputSet() {
    return getOrCreateProperty("ActivityDocumentInputSet", "ActivityDocumentInputSet", null, pcftest.ActivityDocumentInputSet.class);
  }
  
  public ActivityNoteInputSet getActivityNoteInputSet() {
    return getOrCreateProperty("ActivityNoteInputSet", "ActivityNoteInputSet", null, pcftest.ActivityNoteInputSet.class);
  }
  
  public ActivityOwnerInputSet getActivityOwnerInputSet() {
    return getOrCreateProperty("ActivityOwnerInputSet", "ActivityOwnerInputSet", null, pcftest.ActivityOwnerInputSet.class);
  }
  
  public ActivityTrackingInputSet getActivityTrackingInputSet() {
    return getOrCreateProperty("ActivityTrackingInputSet", "ActivityTrackingInputSet", null, pcftest.ActivityTrackingInputSet.class);
  }
  
  
}