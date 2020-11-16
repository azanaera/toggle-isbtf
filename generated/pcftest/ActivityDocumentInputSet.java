package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ActivityDocumentInputSet.ActivityDocumentsLV_tb;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/shared/activity/ActivityDocumentInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ActivityDocumentInputSet extends PCFElement {
  public final static String CHECKSUM = "86f7cd0a5ca99ddc14c3f18d955b4697";
  
  public ActivityDocumentInputSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ActivityDocumentsLV getActivityDocumentsLV() {
    return getOrCreateProperty("ActivityDocumentsLV", "ActivityDocumentsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ActivityDocumentsLV.class);
  }
  
  public ActivityDocumentsLV_tb getActivityDocumentsLV_tb() {
    return getOrCreateProperty("ActivityDocumentsLV_tb", "ActivityDocumentsLV_tb", null, pcftest.ActivityDocumentInputSet.ActivityDocumentsLV_tb.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/activity/ActivityDocumentInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ActivityDocumentsLV_tb extends PCFElement {
    public ActivityDocumentsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  
}